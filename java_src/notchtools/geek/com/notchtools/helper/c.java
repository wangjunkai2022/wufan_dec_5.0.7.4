package notchtools.geek.com.notchtools.helper;

import java.lang.reflect.Method;
/* compiled from: SystemProperties.java */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f71946a = "c";

    /* renamed from: b  reason: collision with root package name */
    private static Method f71947b;

    /* renamed from: c  reason: collision with root package name */
    private static c f71948c;

    private c() {
        f71947b = d(b("android.os.SystemProperties"));
    }

    private Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e5) {
            e5.getMessage();
            try {
                return ClassLoader.getSystemClassLoader().loadClass(str);
            } catch (ClassNotFoundException e6) {
                e6.getMessage();
                return null;
            }
        }
    }

    public static c c() {
        if (f71948c == null) {
            synchronized (c.class) {
                if (f71948c == null) {
                    f71948c = new c();
                }
            }
        }
        return f71948c;
    }

    private Method d(Class cls) {
        if (cls != null) {
            try {
                return cls.getMethod("get", String.class);
            } catch (Exception e5) {
                e5.getMessage();
                return null;
            }
        }
        return null;
    }

    public final String a(String str) {
        if (str == null) {
            return "";
        }
        try {
            Method method = f71947b;
            String str2 = (String) (method != null ? method.invoke(null, str) : null);
            if (str2 != null) {
                return str2.trim();
            }
        } catch (Exception unused) {
        }
        return "";
    }
}
