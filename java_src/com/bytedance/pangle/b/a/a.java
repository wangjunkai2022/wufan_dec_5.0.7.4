package com.bytedance.pangle.b.a;

import com.bytedance.pangle.log.ZeusLogger;
import com.bytedance.pangle.util.FieldUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Field> f8241a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static Map<String, Method> f8242b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static Map<String, Constructor> f8243c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private static Map<String, Class> f8244d = new HashMap();

    static {
        try {
            FieldUtils.writeField(b.class, "classLoader", (Object) null);
            ZeusLogger.w(ZeusLogger.TAG_INIT, "HackHelper HackHelperImpl use BootClassLoader");
        } catch (Exception e5) {
            ZeusLogger.errReport(ZeusLogger.TAG_INIT, "HackHelperinit failed", e5);
        }
    }

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        String b5 = b(cls, str, clsArr);
        synchronized (f8242b) {
            method = f8242b.get(b5);
        }
        if (method != null) {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            return method;
        }
        try {
            Method a5 = b.a(cls, str, clsArr);
            if (a5 != null) {
                synchronized (f8242b) {
                    f8242b.put(b5, a5);
                }
            }
            return a5;
        } catch (Throwable th) {
            ZeusLogger.w(ZeusLogger.TAG, "HackHelper" + String.format("getMethod %s#%s failed !!!", cls.getName(), str), th);
            return null;
        }
    }

    private static String b(Class<?> cls, String str, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getName());
        sb.append("#");
        sb.append(str);
        if (clsArr != null && clsArr.length > 0) {
            for (Class<?> cls2 : clsArr) {
                sb.append(cls2.getName());
                sb.append("#");
            }
        } else {
            sb.append(Void.class.getName());
        }
        return sb.toString();
    }

    public static Constructor a(Class<?> cls, Class<?>... clsArr) {
        Constructor constructor;
        String b5 = b(cls, "clinit", clsArr);
        synchronized (f8243c) {
            constructor = f8243c.get(b5);
        }
        if (constructor != null) {
            if (!constructor.isAccessible()) {
                constructor.setAccessible(true);
            }
            return constructor;
        }
        try {
            Constructor a5 = b.a(cls, clsArr);
            if (a5 != null) {
                synchronized (f8243c) {
                    f8243c.put(b5, a5);
                }
            }
            return a5;
        } catch (Throwable th) {
            ZeusLogger.w(ZeusLogger.TAG, "HackHelper" + String.format("getConstructor %s failed !!!", cls.getName()), th);
            return null;
        }
    }

    public static Field a(Class<?> cls, String str) {
        Field field;
        String str2 = cls.getName() + "#" + str;
        synchronized (f8241a) {
            field = f8241a.get(str2);
        }
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field;
        }
        try {
            Field a5 = b.a(cls, str);
            if (a5 != null) {
                synchronized (f8241a) {
                    f8241a.put(str2, a5);
                }
            }
            return a5;
        } catch (Throwable th) {
            ZeusLogger.w(ZeusLogger.TAG, "HackHelper" + String.format("getField %s#%s failed !!!", cls.getName(), str), th);
            return null;
        }
    }
}
