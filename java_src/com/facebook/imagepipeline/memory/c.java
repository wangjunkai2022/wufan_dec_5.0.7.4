package com.facebook.imagepipeline.memory;

import com.facebook.infer.annotation.ThreadSafe;
/* compiled from: BitmapCounterProvider.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private static final long f11967b = 1024;

    /* renamed from: c  reason: collision with root package name */
    private static final long f11968c = 1048576;

    /* renamed from: f  reason: collision with root package name */
    private static volatile a f11971f;

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f11966a = c.class;

    /* renamed from: d  reason: collision with root package name */
    public static final int f11969d = b();

    /* renamed from: e  reason: collision with root package name */
    private static int f11970e = 384;

    @ThreadSafe
    public static a a() {
        if (f11971f == null) {
            synchronized (c.class) {
                if (f11971f == null) {
                    f11971f = new a(f11970e, f11969d);
                }
            }
        }
        return f11971f;
    }

    private static int b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            return (min / 4) * 3;
        }
        return min / 2;
    }

    public static void c(b bVar) {
        if (f11971f == null) {
            f11970e = bVar.a();
            return;
        }
        throw new IllegalStateException("BitmapCounter has already been created! `BitmapCounterProvider.initialize(...)` should only be called before `BitmapCounterProvider.get()` or not at all!");
    }
}
