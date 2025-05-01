package com.papa.gsyvideoplayer.cache;
/* compiled from: CacheFactory.java */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Class<? extends b> f58238a;

    public static b a() {
        if (f58238a == null) {
            f58238a = c.class;
        }
        try {
            return f58238a.newInstance();
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
            return null;
        } catch (InstantiationException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public static void b(Class<? extends b> cls) {
        f58238a = cls;
    }
}
