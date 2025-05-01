package com.swift.sandhook.xposedcompat.methodgen;

import android.text.TextUtils;
import com.android.dx.Code;
import com.android.dx.DexMaker;
import com.android.dx.FieldId;
import com.android.dx.Local;
import com.android.dx.MethodId;
import com.android.dx.TypeId;
import com.swift.sandhook.SandHook;
import com.swift.sandhook.SandHookConfig;
import com.swift.sandhook.wrapper.HookWrapper;
import com.swift.sandhook.xposedcompat.hookstub.HookStubManager;
import com.swift.sandhook.xposedcompat.utils.DexMakerUtils;
import dalvik.system.InMemoryDexClassLoader;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.Map;
/* loaded from: classes.dex */
public class HookerDexMakerNew implements HookMaker {
    private static final String CLASS_DESC_PREFIX = "L";
    private static final String CLASS_NAME_PREFIX = "SandHookerNew";
    private static final String FIELD_NAME_BACKUP_METHOD = "backupMethod";
    private static final String FIELD_NAME_HOOK_INFO = "additionalHookInfo";
    private static final String FIELD_NAME_METHOD = "method";
    public static final String METHOD_NAME_BACKUP = "backup";
    public static final String METHOD_NAME_HOOK = "hook";
    private Class<?>[] mActualParameterTypes;
    private ClassLoader mAppClassLoader;
    private Method mBackupMethod;
    private FieldId<?, Method> mBackupMethodFieldId;
    private MethodId<?, ?> mBackupMethodId;
    private String mDexDirPath;
    private DexMaker mDexMaker;
    private boolean mHasThrowable;
    private Class<?> mHookClass;
    private XposedBridge.AdditionalHookInfo mHookInfo;
    private FieldId<?, XposedBridge.AdditionalHookInfo> mHookInfoFieldId;
    private Method mHookMethod;
    private MethodId<?, ?> mHookMethodId;
    private TypeId<?> mHookerTypeId;
    private boolean mIsStatic;
    private Member mMember;
    private FieldId<?, Member> mMethodFieldId;
    private TypeId<?>[] mParameterTypeIds;
    private Class<?> mReturnType;
    private TypeId<?> mReturnTypeId;
    private MethodId<?, ?> mSandHookBridgeMethodId;
    public static final TypeId<Object[]> objArrayTypeId = TypeId.get(Object[].class);
    private static final TypeId<Member> memberTypeId = TypeId.get(Member.class);
    private static final TypeId<Method> methodTypeId = TypeId.get(Method.class);
    private static final TypeId<XposedBridge.AdditionalHookInfo> hookInfoTypeId = TypeId.get(XposedBridge.AdditionalHookInfo.class);

    private Local[] createParameterLocals(Code code) {
        Local[] localArr = new Local[this.mParameterTypeIds.length];
        int i4 = 0;
        while (true) {
            TypeId<?>[] typeIdArr = this.mParameterTypeIds;
            if (i4 >= typeIdArr.length) {
                return localArr;
            }
            localArr[i4] = code.getParameter(i4, typeIdArr[i4]);
            i4++;
        }
    }

    private HookWrapper.HookEntity doMake(String str, String str2) throws Exception {
        ClassLoader inMemoryDexClassLoader;
        TypeId<?> typeId = TypeId.get(CLASS_DESC_PREFIX + str + ";");
        this.mHookerTypeId = typeId;
        DexMaker dexMaker = this.mDexMaker;
        dexMaker.declare(typeId, str + ".generated", 1, TypeId.OBJECT, new TypeId[0]);
        generateFields();
        generateHookMethod();
        generateBackupMethod();
        if (TextUtils.isEmpty(this.mDexDirPath)) {
            if (SandHookConfig.SDK_INT >= 26) {
                inMemoryDexClassLoader = new InMemoryDexClassLoader(ByteBuffer.wrap(this.mDexMaker.generate()), this.mAppClassLoader);
            } else {
                throw new IllegalArgumentException("dexDirPath should not be empty!!!");
            }
        } else {
            try {
                inMemoryDexClassLoader = this.mDexMaker.generateAndLoad(this.mAppClassLoader, new File(this.mDexDirPath), str2);
            } catch (IOException unused) {
                inMemoryDexClassLoader = SandHookConfig.SDK_INT >= 26 ? new InMemoryDexClassLoader(ByteBuffer.wrap(this.mDexMaker.generate()), this.mAppClassLoader) : null;
            }
        }
        if (inMemoryDexClassLoader == null) {
            return null;
        }
        return loadHookerClass(inMemoryDexClassLoader, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void generateBackupMethod() {
        MethodId method = this.mHookerTypeId.getMethod(TypeId.VOID, "backup", new TypeId[0]);
        this.mBackupMethodId = method;
        this.mDexMaker.declare(method, 9).returnVoid();
    }

    private void generateFields() {
        this.mHookInfoFieldId = this.mHookerTypeId.getField(hookInfoTypeId, FIELD_NAME_HOOK_INFO);
        this.mMethodFieldId = this.mHookerTypeId.getField(memberTypeId, "method");
        this.mBackupMethodFieldId = this.mHookerTypeId.getField(methodTypeId, FIELD_NAME_BACKUP_METHOD);
        this.mDexMaker.declare(this.mHookInfoFieldId, 8, null);
        this.mDexMaker.declare(this.mMethodFieldId, 8, null);
        this.mDexMaker.declare(this.mBackupMethodFieldId, 8, null);
    }

    private void generateHookMethod() {
        int i4;
        this.mHookMethodId = this.mHookerTypeId.getMethod(this.mReturnTypeId, "hook", this.mParameterTypeIds);
        TypeId typeId = TypeId.get(HookStubManager.class);
        TypeId typeId2 = TypeId.get(Object.class);
        TypeId<Member> typeId3 = memberTypeId;
        TypeId<Method> typeId4 = methodTypeId;
        TypeId<XposedBridge.AdditionalHookInfo> typeId5 = hookInfoTypeId;
        this.mSandHookBridgeMethodId = typeId.getMethod(typeId2, "hookBridge", typeId3, typeId4, typeId5, TypeId.get(Object.class), TypeId.get(Object[].class));
        Code declare = this.mDexMaker.declare(this.mHookMethodId, 9);
        Local<?> newLocal = declare.newLocal(typeId3);
        Local<?> newLocal2 = declare.newLocal(typeId4);
        Local<?> newLocal3 = declare.newLocal(typeId5);
        TypeId<Object> typeId6 = TypeId.OBJECT;
        Local<?> newLocal4 = declare.newLocal(typeId6);
        Local<?> newLocal5 = declare.newLocal(objArrayTypeId);
        TypeId<Integer> typeId7 = TypeId.INT;
        Local<Integer> newLocal6 = declare.newLocal(typeId7);
        Local<Integer> newLocal7 = declare.newLocal(typeId7);
        Local<?> newLocal8 = declare.newLocal(typeId6);
        Local[] createParameterLocals = createParameterLocals(declare);
        Map<TypeId, Local> createResultLocals = DexMakerUtils.createResultLocals(declare);
        declare.loadConstant(newLocal5, null);
        declare.loadConstant(newLocal7, 0);
        declare.sget(this.mMethodFieldId, newLocal);
        declare.sget(this.mBackupMethodFieldId, newLocal2);
        declare.sget(this.mHookInfoFieldId, newLocal3);
        int length = this.mParameterTypeIds.length;
        if (this.mIsStatic) {
            declare.loadConstant(newLocal4, null);
            i4 = 0;
        } else {
            declare.move(newLocal4, createParameterLocals[0]);
            i4 = 1;
        }
        declare.loadConstant(newLocal6, Integer.valueOf(length - i4));
        declare.newArray(newLocal5, newLocal6);
        for (int i5 = i4; i5 < length; i5++) {
            DexMakerUtils.autoBoxIfNecessary(declare, newLocal8, createParameterLocals[i5]);
            declare.loadConstant(newLocal7, Integer.valueOf(i5 - i4));
            declare.aput(newLocal5, newLocal7, newLocal8);
        }
        if (this.mReturnTypeId.equals(TypeId.VOID)) {
            declare.invokeStatic(this.mSandHookBridgeMethodId, null, newLocal, newLocal2, newLocal3, newLocal4, newLocal5);
            declare.returnVoid();
            return;
        }
        declare.invokeStatic(this.mSandHookBridgeMethodId, newLocal8, newLocal, newLocal2, newLocal3, newLocal4, newLocal5);
        Local local = createResultLocals.get(DexMakerUtils.getObjTypeIdIfPrimitive(this.mReturnTypeId));
        declare.cast(local, newLocal8);
        Local local2 = createResultLocals.get(this.mReturnTypeId);
        DexMakerUtils.autoUnboxIfNecessary(declare, local2, local, createResultLocals, true);
        declare.returnValue(local2);
    }

    private String getClassName(Member member) {
        return "SandHookerNew_" + DexMakerUtils.MD5(member.toString());
    }

    private static TypeId<?>[] getParameterTypeIds(Class<?>[] clsArr, boolean z4) {
        int i4;
        int length = clsArr.length;
        if (!z4) {
            length++;
        }
        TypeId<?>[] typeIdArr = new TypeId[length];
        if (z4) {
            i4 = 0;
        } else {
            typeIdArr[0] = TypeId.OBJECT;
            i4 = 1;
        }
        for (int i5 = 0; i5 < clsArr.length; i5++) {
            typeIdArr[i5 + i4] = TypeId.get(clsArr[i5]);
        }
        return typeIdArr;
    }

    private static Class<?>[] getParameterTypes(Class<?>[] clsArr, boolean z4) {
        if (z4) {
            return clsArr;
        }
        Class<?>[] clsArr2 = new Class[clsArr.length + 1];
        clsArr2[0] = Object.class;
        System.arraycopy(clsArr, 0, clsArr2, 1, clsArr.length);
        return clsArr2;
    }

    private HookWrapper.HookEntity loadHookerClass(ClassLoader classLoader, String str) throws Exception {
        Class<?> loadClass = classLoader.loadClass(str);
        this.mHookClass = loadClass;
        this.mHookMethod = loadClass.getMethod("hook", this.mActualParameterTypes);
        this.mBackupMethod = this.mHookClass.getMethod("backup", new Class[0]);
        setup(this.mHookClass);
        return new HookWrapper.HookEntity(this.mMember, this.mHookMethod, this.mBackupMethod, false);
    }

    private void setup(Class cls) {
        XposedHelpers.setStaticObjectField(cls, "method", this.mMember);
        XposedHelpers.setStaticObjectField(cls, FIELD_NAME_BACKUP_METHOD, this.mBackupMethod);
        XposedHelpers.setStaticObjectField(cls, FIELD_NAME_HOOK_INFO, this.mHookInfo);
    }

    @Override // com.swift.sandhook.xposedcompat.methodgen.HookMaker
    public Method getBackupMethod() {
        return this.mBackupMethod;
    }

    @Override // com.swift.sandhook.xposedcompat.methodgen.HookMaker
    public Method getCallBackupMethod() {
        return this.mBackupMethod;
    }

    public Class getHookClass() {
        return this.mHookClass;
    }

    @Override // com.swift.sandhook.xposedcompat.methodgen.HookMaker
    public Method getHookMethod() {
        return this.mHookMethod;
    }

    @Override // com.swift.sandhook.xposedcompat.methodgen.HookMaker
    public void start(Member member, XposedBridge.AdditionalHookInfo additionalHookInfo, ClassLoader classLoader, String str) throws Exception {
        if (member instanceof Method) {
            Method method = (Method) member;
            this.mIsStatic = Modifier.isStatic(method.getModifiers());
            Class<?> returnType = method.getReturnType();
            this.mReturnType = returnType;
            if (!returnType.equals(Void.class) && !this.mReturnType.equals(Void.TYPE) && !this.mReturnType.isPrimitive()) {
                this.mReturnType = Object.class;
                this.mReturnTypeId = TypeId.OBJECT;
            } else {
                this.mReturnTypeId = TypeId.get(this.mReturnType);
            }
            this.mParameterTypeIds = getParameterTypeIds(method.getParameterTypes(), this.mIsStatic);
            this.mActualParameterTypes = getParameterTypes(method.getParameterTypes(), this.mIsStatic);
            this.mHasThrowable = method.getExceptionTypes().length > 0;
        } else if (member instanceof Constructor) {
            Constructor constructor = (Constructor) member;
            this.mIsStatic = false;
            this.mReturnType = Void.TYPE;
            this.mReturnTypeId = TypeId.VOID;
            this.mParameterTypeIds = getParameterTypeIds(constructor.getParameterTypes(), this.mIsStatic);
            this.mActualParameterTypes = getParameterTypes(constructor.getParameterTypes(), this.mIsStatic);
            this.mHasThrowable = constructor.getExceptionTypes().length > 0;
        } else if (!member.getDeclaringClass().isInterface()) {
            if (Modifier.isAbstract(member.getModifiers())) {
                throw new IllegalArgumentException("Cannot hook abstract methods: " + member.toString());
            }
            throw new IllegalArgumentException("Only methods and constructors can be hooked: " + member.toString());
        } else {
            throw new IllegalArgumentException("Cannot hook interfaces: " + member.toString());
        }
        this.mMember = member;
        this.mHookInfo = additionalHookInfo;
        this.mDexDirPath = str;
        if (classLoader != null && !classLoader.getClass().getName().equals("java.lang.BootClassLoader")) {
            this.mAppClassLoader = classLoader;
        } else {
            this.mAppClassLoader = getClass().getClassLoader();
        }
        this.mDexMaker = new DexMaker();
        String className = getClassName(this.mMember);
        String str2 = className + ".jar";
        HookWrapper.HookEntity hookEntity = null;
        try {
            ClassLoader loadClassDirect = this.mDexMaker.loadClassDirect(this.mAppClassLoader, new File(this.mDexDirPath), str2);
            if (loadClassDirect != null) {
                hookEntity = loadHookerClass(loadClassDirect, className);
            }
        } catch (Throwable unused) {
        }
        if (hookEntity == null) {
            hookEntity = doMake(className, str2);
        }
        SandHook.hook(hookEntity);
    }
}
