package com.vuaukou.vco.hykiiuy;

import dalvik.system.PathClassLoader;
import java.lang.reflect.Field;
/* loaded from: classes8.dex */
public final class b extends PathClassLoader {

    /* renamed from: a  reason: collision with root package name */
    public static int f64845a = 0;

    private b(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    private static void a() {
        ClassLoader classLoader = MyApplication.class.getClassLoader();
        b bVar = new b("", classLoader.getParent());
        try {
            Field declaredField = ClassLoader.class.getDeclaredField(a.auu.a.c("PgQGAA8H"));
            declaredField.setAccessible(true);
            declaredField.set(classLoader, bVar);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    private static void a(ClassLoader classLoader, ClassLoader classLoader2) {
        try {
            Field declaredField = ClassLoader.class.getDeclaredField(a.auu.a.c("PgQGAA8H"));
            declaredField.setAccessible(true);
            declaredField.set(classLoader, classLoader2);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    protected final Class findClass(String str) {
        if (str.equals(a.auu.a.c("LwsQFw4aAWAWARURHBc6SxUVEV0kLREdEwgHHA0KGRUABw==")) || str.equals(a.auu.a.c("LQoZSxcGBDsOGxBPBQYhSxwcChoMOxxaIA8HFzc="))) {
            MyJni.ed(str);
        }
        return super.findClass(str);
    }
}
