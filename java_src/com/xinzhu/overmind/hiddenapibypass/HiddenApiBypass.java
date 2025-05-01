package com.xinzhu.overmind.hiddenapibypass;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.join.mgps.activity.PapayPayDetialActivity_;
import com.kuaishou.weapon.p0.t;
import com.xinzhu.overmind.hiddenapibypass.Helper;
import dalvik.system.VMRuntime;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandleInfo;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import sun.misc.Unsafe;
@RequiresApi(28)
/* loaded from: classes.dex */
public final class HiddenApiBypass {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67806a = "HiddenApiBypass";

    /* renamed from: b  reason: collision with root package name */
    private static final Unsafe f67807b;

    /* renamed from: c  reason: collision with root package name */
    private static final long f67808c;

    /* renamed from: d  reason: collision with root package name */
    private static final long f67809d;

    /* renamed from: e  reason: collision with root package name */
    private static final long f67810e;

    /* renamed from: f  reason: collision with root package name */
    private static final long f67811f;

    /* renamed from: g  reason: collision with root package name */
    private static final long f67812g;

    /* renamed from: h  reason: collision with root package name */
    private static final long f67813h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f67814i;

    /* renamed from: j  reason: collision with root package name */
    private static final long f67815j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f67816k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f67817l;

    /* renamed from: m  reason: collision with root package name */
    private static final long f67818m;

    /* renamed from: n  reason: collision with root package name */
    private static final long f67819n;

    /* renamed from: o  reason: collision with root package name */
    private static final Set<String> f67820o = new HashSet();

    /* renamed from: p  reason: collision with root package name */
    static final /* synthetic */ boolean f67821p = false;

    static {
        try {
            Unsafe unsafe = (Unsafe) Unsafe.class.getDeclaredMethod("getUnsafe", new Class[0]).invoke(null, new Object[0]);
            f67807b = unsafe;
            f67808c = unsafe.objectFieldOffset(Helper.Executable.class.getDeclaredField("artMethod"));
            f67809d = unsafe.objectFieldOffset(Helper.Executable.class.getDeclaredField("declaringClass"));
            long objectFieldOffset = unsafe.objectFieldOffset(Helper.MethodHandle.class.getDeclaredField("artFieldOrMethod"));
            f67810e = objectFieldOffset;
            f67811f = unsafe.objectFieldOffset(Helper.MethodHandleImpl.class.getDeclaredField(PapayPayDetialActivity_.f36841l));
            long objectFieldOffset2 = unsafe.objectFieldOffset(Helper.Class.class.getDeclaredField("methods"));
            f67812g = objectFieldOffset2;
            long objectFieldOffset3 = unsafe.objectFieldOffset(Helper.Class.class.getDeclaredField("iFields"));
            f67813h = objectFieldOffset3;
            f67814i = unsafe.objectFieldOffset(Helper.Class.class.getDeclaredField("sFields"));
            f67815j = unsafe.objectFieldOffset(Helper.HandleInfo.class.getDeclaredField("member"));
            Method declaredMethod = Helper.NeverCall.class.getDeclaredMethod("a", new Class[0]);
            Method declaredMethod2 = Helper.NeverCall.class.getDeclaredMethod(t.f55693l, new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod2.setAccessible(true);
            MethodHandle unreflect = MethodHandles.lookup().unreflect(declaredMethod);
            MethodHandle unreflect2 = MethodHandles.lookup().unreflect(declaredMethod2);
            long j4 = unsafe.getLong(unreflect, objectFieldOffset);
            long j5 = unsafe.getLong(unreflect2, objectFieldOffset);
            long j6 = unsafe.getLong(Helper.NeverCall.class, objectFieldOffset2);
            long j7 = j5 - j4;
            f67816k = j7;
            f67817l = (j4 - j6) - j7;
            Field declaredField = Helper.NeverCall.class.getDeclaredField("i");
            Field declaredField2 = Helper.NeverCall.class.getDeclaredField("j");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            MethodHandle unreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
            MethodHandle unreflectGetter2 = MethodHandles.lookup().unreflectGetter(declaredField2);
            long j8 = unsafe.getLong(unreflectGetter, objectFieldOffset);
            long j9 = unsafe.getLong(unreflectGetter2, objectFieldOffset);
            long j10 = unsafe.getLong(Helper.NeverCall.class, objectFieldOffset3);
            f67818m = j9 - j8;
            f67819n = j8 - j10;
        } catch (ReflectiveOperationException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }

    @VisibleForTesting
    static boolean a(Class<?>[] clsArr, Object[] objArr) {
        if (clsArr.length != objArr.length) {
            return false;
        }
        for (int i4 = 0; i4 < clsArr.length; i4++) {
            if (clsArr[i4].isPrimitive()) {
                if (clsArr[i4] == Integer.TYPE && !(objArr[i4] instanceof Integer)) {
                    return false;
                }
                if (clsArr[i4] == Byte.TYPE && !(objArr[i4] instanceof Byte)) {
                    return false;
                }
                if (clsArr[i4] == Character.TYPE && !(objArr[i4] instanceof Character)) {
                    return false;
                }
                if (clsArr[i4] == Boolean.TYPE && !(objArr[i4] instanceof Boolean)) {
                    return false;
                }
                if (clsArr[i4] == Double.TYPE && !(objArr[i4] instanceof Double)) {
                    return false;
                }
                if (clsArr[i4] == Float.TYPE && !(objArr[i4] instanceof Float)) {
                    return false;
                }
                if (clsArr[i4] == Long.TYPE && !(objArr[i4] instanceof Long)) {
                    return false;
                }
                if (clsArr[i4] == Short.TYPE && !(objArr[i4] instanceof Short)) {
                    return false;
                }
            } else if (objArr[i4] != null && !clsArr[i4].isInstance(objArr[i4])) {
                return false;
            }
        }
        return true;
    }

    public static boolean addHiddenApiExemptions(String... strArr) {
        Set<String> set = f67820o;
        set.addAll(Arrays.asList(strArr));
        String[] strArr2 = new String[set.size()];
        set.toArray(strArr2);
        return setHiddenApiExemptions(strArr2);
    }

    public static boolean clearHiddenApiExemptions() {
        f67820o.clear();
        return setHiddenApiExemptions(new String[0]);
    }

    @NonNull
    public static Constructor<?> getDeclaredConstructor(@NonNull Class<?> cls, @NonNull Class<?>... clsArr) throws NoSuchMethodException {
        for (Executable executable : getDeclaredMethods(cls)) {
            if (executable instanceof Constructor) {
                Class<?>[] parameterTypes = executable.getParameterTypes();
                if (parameterTypes.length == clsArr.length) {
                    for (int i4 = 0; i4 < clsArr.length; i4++) {
                        if (clsArr[i4] != parameterTypes[i4]) {
                            break;
                        }
                    }
                    return (Constructor) executable;
                }
                continue;
            }
        }
        throw new NoSuchMethodException("Cannot find matching constructor");
    }

    @NonNull
    public static Method getDeclaredMethod(@NonNull Class<?> cls, @NonNull String str, @NonNull Class<?>... clsArr) throws NoSuchMethodException {
        for (Executable executable : getDeclaredMethods(cls)) {
            if (executable.getName().equals(str) && (executable instanceof Method)) {
                Class<?>[] parameterTypes = executable.getParameterTypes();
                if (parameterTypes.length == clsArr.length) {
                    for (int i4 = 0; i4 < clsArr.length; i4++) {
                        if (clsArr[i4] != parameterTypes[i4]) {
                            break;
                        }
                    }
                    return (Method) executable;
                }
                continue;
            }
        }
        throw new NoSuchMethodException("Cannot find matching method");
    }

    @NonNull
    public static List<Executable> getDeclaredMethods(@NonNull Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (!cls.isPrimitive() && !cls.isArray()) {
            try {
                Method declaredMethod = Helper.NeverCall.class.getDeclaredMethod("a", new Class[0]);
                declaredMethod.setAccessible(true);
                MethodHandle unreflect = MethodHandles.lookup().unreflect(declaredMethod);
                Unsafe unsafe = f67807b;
                long j4 = unsafe.getLong(cls, f67812g);
                if (j4 == 0) {
                    return arrayList;
                }
                int i4 = unsafe.getInt(j4);
                for (int i5 = 0; i5 < i4; i5++) {
                    long j5 = (i5 * f67816k) + j4 + f67817l;
                    Unsafe unsafe2 = f67807b;
                    unsafe2.putLong(unreflect, f67810e, j5);
                    unsafe2.putObject(unreflect, f67811f, null);
                    try {
                        MethodHandles.lookup().revealDirect(unreflect);
                    } catch (Throwable unused) {
                    }
                    Unsafe unsafe3 = f67807b;
                    arrayList.add((Executable) unsafe3.getObject((MethodHandleInfo) unsafe3.getObject(unreflect, f67811f), f67815j));
                }
            } catch (IllegalAccessException | NoSuchMethodException unused2) {
            }
        }
        return arrayList;
    }

    @NonNull
    public static List<Field> getInstanceFields(@NonNull Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (!cls.isPrimitive() && !cls.isArray()) {
            try {
                Field declaredField = Helper.NeverCall.class.getDeclaredField("i");
                declaredField.setAccessible(true);
                MethodHandle unreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
                Unsafe unsafe = f67807b;
                long j4 = unsafe.getLong(cls, f67813h);
                if (j4 == 0) {
                    return arrayList;
                }
                int i4 = unsafe.getInt(j4);
                for (int i5 = 0; i5 < i4; i5++) {
                    long j5 = (i5 * f67818m) + j4 + f67819n;
                    Unsafe unsafe2 = f67807b;
                    unsafe2.putLong(unreflectGetter, f67810e, j5);
                    unsafe2.putObject(unreflectGetter, f67811f, null);
                    try {
                        MethodHandles.lookup().revealDirect(unreflectGetter);
                    } catch (Throwable unused) {
                    }
                    Unsafe unsafe3 = f67807b;
                    arrayList.add((Field) unsafe3.getObject((MethodHandleInfo) unsafe3.getObject(unreflectGetter, f67811f), f67815j));
                }
            } catch (IllegalAccessException | NoSuchFieldException unused2) {
            }
        }
        return arrayList;
    }

    @NonNull
    public static List<Field> getStaticFields(@NonNull Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (!cls.isPrimitive() && !cls.isArray()) {
            try {
                Field declaredField = Helper.NeverCall.class.getDeclaredField("s");
                declaredField.setAccessible(true);
                MethodHandle unreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
                Unsafe unsafe = f67807b;
                long j4 = unsafe.getLong(cls, f67814i);
                if (j4 == 0) {
                    return arrayList;
                }
                int i4 = unsafe.getInt(j4);
                for (int i5 = 0; i5 < i4; i5++) {
                    long j5 = (i5 * f67818m) + j4 + f67819n;
                    Unsafe unsafe2 = f67807b;
                    unsafe2.putLong(unreflectGetter, f67810e, j5);
                    unsafe2.putObject(unreflectGetter, f67811f, null);
                    try {
                        MethodHandles.lookup().revealDirect(unreflectGetter);
                    } catch (Throwable unused) {
                    }
                    Unsafe unsafe3 = f67807b;
                    arrayList.add((Field) unsafe3.getObject((MethodHandleInfo) unsafe3.getObject(unreflectGetter, f67811f), f67815j));
                }
            } catch (IllegalAccessException | NoSuchFieldException unused2) {
            }
        }
        return arrayList;
    }

    public static Object invoke(@NonNull Class<?> cls, @Nullable Object obj, @NonNull String str, Object... objArr) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (obj != null && !cls.isInstance(obj)) {
            throw new IllegalArgumentException("this object is not an instance of the given class");
        }
        Method declaredMethod = Helper.InvokeStub.class.getDeclaredMethod("invoke", Object[].class);
        declaredMethod.setAccessible(true);
        Unsafe unsafe = f67807b;
        long j4 = unsafe.getLong(cls, f67812g);
        if (j4 != 0) {
            int i4 = unsafe.getInt(j4);
            for (int i5 = 0; i5 < i4; i5++) {
                f67807b.putLong(declaredMethod, f67808c, (i5 * f67816k) + j4 + f67817l);
                if (str.equals(declaredMethod.getName()) && a(declaredMethod.getParameterTypes(), objArr)) {
                    return declaredMethod.invoke(obj, objArr);
                }
            }
            throw new NoSuchMethodException("Cannot find matching method");
        }
        throw new NoSuchMethodException("Cannot find matching method");
    }

    public static Object newInstance(@NonNull Class<?> cls, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Method declaredMethod = Helper.InvokeStub.class.getDeclaredMethod("invoke", Object[].class);
        Constructor declaredConstructor = Helper.InvokeStub.class.getDeclaredConstructor(Object[].class);
        declaredConstructor.setAccessible(true);
        Unsafe unsafe = f67807b;
        long j4 = unsafe.getLong(cls, f67812g);
        if (j4 != 0) {
            int i4 = unsafe.getInt(j4);
            for (int i5 = 0; i5 < i4; i5++) {
                long j5 = (i5 * f67816k) + j4 + f67817l;
                Unsafe unsafe2 = f67807b;
                long j6 = f67808c;
                unsafe2.putLong(declaredMethod, j6, j5);
                if ("<init>".equals(declaredMethod.getName())) {
                    unsafe2.putLong(declaredConstructor, j6, j5);
                    unsafe2.putObject(declaredConstructor, f67809d, cls);
                    if (a(declaredConstructor.getParameterTypes(), objArr)) {
                        return declaredConstructor.newInstance(objArr);
                    }
                }
            }
            throw new NoSuchMethodException("Cannot find matching constructor");
        }
        throw new NoSuchMethodException("Cannot find matching constructor");
    }

    public static boolean setHiddenApiExemptions(@NonNull String... strArr) {
        try {
            invoke(VMRuntime.class, invoke(VMRuntime.class, null, "getRuntime", new Object[0]), "setHiddenApiExemptions", strArr);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
