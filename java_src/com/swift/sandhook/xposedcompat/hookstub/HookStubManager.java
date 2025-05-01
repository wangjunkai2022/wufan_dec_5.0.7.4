package com.swift.sandhook.xposedcompat.hookstub;

import com.swift.sandhook.SandHook;
import com.swift.sandhook.SandHookMethodResolver;
import com.swift.sandhook.utils.ParamWrapper;
import com.swift.sandhook.wrapper.StubMethodsFactory;
import com.swift.sandhook.xposedcompat.XposedCompat;
import com.swift.sandhook.xposedcompat.utils.DexLog;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class HookStubManager {
    public static int ALL_STUB = 0;
    public static final int MAX_64_ARGS = 7;
    public static int MAX_STUB_ARGS;
    public static XposedBridge.AdditionalHookInfo[] additionalHookInfos;
    public static AtomicInteger[] curUseStubIndexes;
    public static boolean hasStubBackup;
    public static HookMethodEntity[] hookMethodEntities;
    public static volatile boolean is64Bit = SandHook.is64Bit();
    public static Member[] originMethods;
    public static int[] stubSizes;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class StubMethodsInfo {
        int args;
        Method backup;
        Method hook;
        int index;

        public StubMethodsInfo(int i4, int i5, Method method, Method method2) {
            this.args = 0;
            this.index = 0;
            this.args = i4;
            this.index = i5;
            this.hook = method;
            this.backup = method2;
        }
    }

    static {
        Class cls = is64Bit ? MethodHookerStubs64.class : MethodHookerStubs32.class;
        stubSizes = (int[]) XposedHelpers.getStaticObjectField(cls, "stubSizes");
        Boolean bool = (Boolean) XposedHelpers.getStaticObjectField(cls, "hasStubBackup");
        hasStubBackup = (bool == null || !bool.booleanValue() || XposedCompat.useNewCallBackup) ? false : true;
        int[] iArr = stubSizes;
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        int length = iArr.length - 1;
        MAX_STUB_ARGS = length;
        curUseStubIndexes = new AtomicInteger[length + 1];
        for (int i4 = 0; i4 < MAX_STUB_ARGS + 1; i4++) {
            curUseStubIndexes[i4] = new AtomicInteger(0);
            ALL_STUB += stubSizes[i4];
        }
        int i5 = ALL_STUB;
        originMethods = new Member[i5];
        hookMethodEntities = new HookMethodEntity[i5];
        additionalHookInfos = new XposedBridge.AdditionalHookInfo[i5];
    }

    public static final long callOrigin(HookMethodEntity hookMethodEntity, Member member, Object obj, Object[] objArr) throws Throwable {
        return hookMethodEntity.getResultAddress(SandHook.callOriginMethod(member, hookMethodEntity.backup, obj, objArr));
    }

    public static String getBackupMethodName(int i4) {
        return "stub_backup_" + i4;
    }

    public static String getCallOriginClassName(int i4, int i5) {
        return "call_origin_" + i4 + "_" + i5;
    }

    public static Method getCallOriginMethod(int i4, int i5) {
        Class cls = is64Bit ? MethodHookerStubs64.class : MethodHookerStubs32.class;
        try {
            return Class.forName((cls.getName() + "$") + getCallOriginClassName(i4, i5), true, cls.getClassLoader()).getDeclaredMethod("call", long[].class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class[] getFindMethodParTypes(boolean z4, int i4) {
        if (i4 == 0) {
            return null;
        }
        Class[] clsArr = new Class[i4];
        int i5 = 0;
        if (z4) {
            while (i5 < i4) {
                clsArr[i5] = Long.TYPE;
                i5++;
            }
        } else {
            while (i5 < i4) {
                clsArr[i5] = Integer.TYPE;
                i5++;
            }
        }
        return clsArr;
    }

    public static HookMethodEntity getHookMethodEntity(Member member, XposedBridge.AdditionalHookInfo additionalHookInfo) {
        Class<?> cls;
        Class<?>[] parameterTypes;
        if (support()) {
            boolean isStatic = Modifier.isStatic(member.getModifiers());
            if (member instanceof Method) {
                Method method = (Method) member;
                cls = method.getReturnType();
                parameterTypes = method.getParameterTypes();
            } else if (!(member instanceof Constructor)) {
                return null;
            } else {
                cls = Void.TYPE;
                parameterTypes = ((Constructor) member).getParameterTypes();
            }
            if (ParamWrapper.support(cls)) {
                int i4 = !isStatic ? 1 : 0;
                if (parameterTypes != null) {
                    i4 += parameterTypes.length;
                    if (i4 > MAX_STUB_ARGS) {
                        return null;
                    }
                    if (is64Bit && i4 > 7) {
                        return null;
                    }
                    for (Class<?> cls2 : parameterTypes) {
                        if (!ParamWrapper.support(cls2)) {
                            return null;
                        }
                    }
                } else {
                    parameterTypes = new Class[0];
                }
                synchronized (HookStubManager.class) {
                    StubMethodsInfo stubMethodPair = getStubMethodPair(is64Bit, i4);
                    if (stubMethodPair == null) {
                        return null;
                    }
                    HookMethodEntity hookMethodEntity = new HookMethodEntity(member, stubMethodPair.hook, stubMethodPair.backup);
                    hookMethodEntity.retType = cls;
                    hookMethodEntity.parType = parameterTypes;
                    if (hasStubBackup && !tryCompileAndResolveCallOriginMethod(hookMethodEntity.backup, stubMethodPair.args, stubMethodPair.index)) {
                        DexLog.w("internal stub <" + hookMethodEntity.hook.getName() + "> call origin compile failure, skip use internal stub");
                        return null;
                    }
                    int methodId = getMethodId(stubMethodPair.args, stubMethodPair.index);
                    originMethods[methodId] = member;
                    hookMethodEntities[methodId] = hookMethodEntity;
                    additionalHookInfos[methodId] = additionalHookInfo;
                    return hookMethodEntity;
                }
            }
            return null;
        }
        return null;
    }

    public static String getHookMethodName(int i4) {
        return "stub_hook_" + i4;
    }

    public static int getMatchStubArgsCount(int i4) {
        while (i4 <= MAX_STUB_ARGS) {
            if (curUseStubIndexes[i4].get() < stubSizes[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static int getMethodId(int i4, int i5) {
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += stubSizes[i6];
        }
        return i5;
    }

    private static synchronized StubMethodsInfo getStubMethodPair(boolean z4, int i4) {
        synchronized (HookStubManager.class) {
            int matchStubArgsCount = getMatchStubArgsCount(i4);
            if (matchStubArgsCount < 0) {
                return null;
            }
            int andIncrement = curUseStubIndexes[matchStubArgsCount].getAndIncrement();
            Class[] findMethodParTypes = getFindMethodParTypes(z4, matchStubArgsCount);
            try {
                if (z4) {
                    Method declaredMethod = MethodHookerStubs64.class.getDeclaredMethod(getHookMethodName(andIncrement), findMethodParTypes);
                    Method declaredMethod2 = hasStubBackup ? MethodHookerStubs64.class.getDeclaredMethod(getBackupMethodName(andIncrement), findMethodParTypes) : StubMethodsFactory.getStubMethod();
                    if (declaredMethod != null && declaredMethod2 != null) {
                        return new StubMethodsInfo(matchStubArgsCount, andIncrement, declaredMethod, declaredMethod2);
                    }
                    return null;
                }
                Method declaredMethod3 = MethodHookerStubs32.class.getDeclaredMethod(getHookMethodName(andIncrement), findMethodParTypes);
                Method declaredMethod4 = hasStubBackup ? MethodHookerStubs32.class.getDeclaredMethod(getBackupMethodName(andIncrement), findMethodParTypes) : StubMethodsFactory.getStubMethod();
                if (declaredMethod3 != null && declaredMethod4 != null) {
                    return new StubMethodsInfo(matchStubArgsCount, andIncrement, declaredMethod3, declaredMethod4);
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    private static boolean hasArgs(long... jArr) {
        return jArr != null && jArr.length > 0;
    }

    public static long hookBridge(int i4, CallOriginCallBack callOriginCallBack, long... jArr) throws Throwable {
        Object obj;
        Object[] objArr;
        Member member = originMethods[i4];
        HookMethodEntity hookMethodEntity = hookMethodEntities[i4];
        if (hasArgs(jArr)) {
            obj = hookMethodEntity.getThis(jArr[0]);
            objArr = hookMethodEntity.getArgs(jArr);
        } else {
            obj = null;
            objArr = null;
        }
        if (XposedBridge.disableHooks) {
            if (hasStubBackup) {
                return callOriginCallBack.call(jArr);
            }
            return callOrigin(hookMethodEntity, member, obj, objArr);
        }
        DexLog.printMethodHookIn(member);
        Object[] snapshot = additionalHookInfos[i4].callbacks.getSnapshot();
        if (snapshot != null && snapshot.length != 0) {
            XC_MethodHook.MethodHookParam methodHookParam = new XC_MethodHook.MethodHookParam();
            methodHookParam.method = member;
            methodHookParam.thisObject = obj;
            methodHookParam.args = objArr;
            int i5 = 0;
            while (true) {
                try {
                    ((XC_MethodHook) snapshot[i5]).callBeforeHookedMethod(methodHookParam);
                    if (methodHookParam.returnEarly) {
                        i5++;
                        break;
                    }
                } catch (Throwable unused) {
                    methodHookParam.setResult(null);
                    methodHookParam.returnEarly = false;
                }
                i5++;
                if (i5 >= snapshot.length) {
                    break;
                }
            }
            if (!methodHookParam.returnEarly) {
                try {
                    if (hasStubBackup) {
                        methodHookParam.setResult(hookMethodEntity.getResult(callOriginCallBack.call(hookMethodEntity.getArgsAddress(jArr, methodHookParam.args))));
                    } else {
                        methodHookParam.setResult(SandHook.callOriginMethod(member, hookMethodEntity.backup, obj, methodHookParam.args));
                    }
                } catch (Throwable th) {
                    XposedBridge.log(th);
                    methodHookParam.setThrowable(th);
                }
            }
            int i6 = i5 - 1;
            do {
                Object result = methodHookParam.getResult();
                Throwable throwable = methodHookParam.getThrowable();
                try {
                    ((XC_MethodHook) snapshot[i6]).callAfterHookedMethod(methodHookParam);
                } catch (Throwable th2) {
                    XposedBridge.log(th2);
                    if (throwable == null) {
                        methodHookParam.setResult(result);
                    } else {
                        methodHookParam.setThrowable(throwable);
                    }
                }
                i6--;
            } while (i6 >= 0);
            if (!methodHookParam.hasThrowable()) {
                return hookMethodEntity.getResultAddress(methodHookParam.getResult());
            }
            throw methodHookParam.getThrowable();
        } else if (hasStubBackup) {
            return callOriginCallBack.call(jArr);
        } else {
            return callOrigin(hookMethodEntity, member, obj, objArr);
        }
    }

    public static boolean support() {
        return MAX_STUB_ARGS > 0 && SandHook.canGetObject() && SandHook.canGetObjectAddress();
    }

    public static boolean tryCompileAndResolveCallOriginMethod(Method method, int i4, int i5) {
        Method callOriginMethod = getCallOriginMethod(i4, i5);
        if (callOriginMethod != null) {
            SandHookMethodResolver.resolveMethod(callOriginMethod, method);
            return SandHook.compileMethod(callOriginMethod);
        }
        return false;
    }

    public static Object hookBridge(Member member, Method method, XposedBridge.AdditionalHookInfo additionalHookInfo, Object obj, Object... objArr) throws Throwable {
        if (XposedBridge.disableHooks) {
            return SandHook.callOriginMethod(member, method, obj, objArr);
        }
        DexLog.printMethodHookIn(member);
        Object[] snapshot = additionalHookInfo.callbacks.getSnapshot();
        if (snapshot != null && snapshot.length != 0) {
            XC_MethodHook.MethodHookParam methodHookParam = new XC_MethodHook.MethodHookParam();
            methodHookParam.method = member;
            methodHookParam.thisObject = obj;
            methodHookParam.args = objArr;
            int i4 = 0;
            while (true) {
                try {
                    ((XC_MethodHook) snapshot[i4]).callBeforeHookedMethod(methodHookParam);
                    if (methodHookParam.returnEarly) {
                        i4++;
                        break;
                    }
                } catch (Throwable unused) {
                    methodHookParam.setResult(null);
                    methodHookParam.returnEarly = false;
                }
                i4++;
                if (i4 >= snapshot.length) {
                    break;
                }
            }
            if (!methodHookParam.returnEarly) {
                try {
                    methodHookParam.setResult(SandHook.callOriginMethod(member, method, obj, methodHookParam.args));
                } catch (Throwable th) {
                    XposedBridge.log(th);
                    methodHookParam.setThrowable(th);
                }
            }
            int i5 = i4 - 1;
            do {
                Object result = methodHookParam.getResult();
                Throwable throwable = methodHookParam.getThrowable();
                try {
                    ((XC_MethodHook) snapshot[i5]).callAfterHookedMethod(methodHookParam);
                } catch (Throwable th2) {
                    XposedBridge.log(th2);
                    if (throwable == null) {
                        methodHookParam.setResult(result);
                    } else {
                        methodHookParam.setThrowable(throwable);
                    }
                }
                i5--;
            } while (i5 >= 0);
            if (!methodHookParam.hasThrowable()) {
                return methodHookParam.getResult();
            }
            throw methodHookParam.getThrowable();
        }
        return SandHook.callOriginMethod(member, method, obj, objArr);
    }
}
