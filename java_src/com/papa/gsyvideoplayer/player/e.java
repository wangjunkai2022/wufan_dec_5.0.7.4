package com.papa.gsyvideoplayer.player;
/* compiled from: PlayerFactory.java */
/* loaded from: classes5.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static Class<? extends c> f58272a;

    public static c a() {
        if (f58272a == null) {
            f58272a = d.class;
        }
        try {
            return f58272a.newInstance();
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
            return null;
        } catch (InstantiationException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public static void b(Class<? extends c> cls) {
        f58272a = cls;
    }
}
