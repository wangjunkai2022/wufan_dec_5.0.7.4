package com.googlecode.mp4parser.util;
/* compiled from: Logger.java */
/* loaded from: classes3.dex */
public abstract class j {
    public static j a(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new a(cls.getSimpleName());
        }
        return new h(cls.getSimpleName());
    }

    public abstract void b(String str);

    public abstract void c(String str);

    public abstract void d(String str);
}
