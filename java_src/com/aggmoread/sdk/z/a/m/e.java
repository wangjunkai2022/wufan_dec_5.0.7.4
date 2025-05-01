package com.aggmoread.sdk.z.a.m;

import android.os.Handler;
import android.os.HandlerThread;
/* loaded from: classes2.dex */
public final class e extends HandlerThread {

    /* renamed from: b  reason: collision with root package name */
    private static e f2312b;

    /* renamed from: c  reason: collision with root package name */
    private static Handler f2313c;

    private e() {
        super("AdSdk-api.bg.tasks", 0);
    }

    private static void a() {
        if (f2312b == null) {
            e eVar = new e();
            f2312b = eVar;
            eVar.start();
            f2313c = new Handler(f2312b.getLooper());
        }
    }

    public static void a(Runnable runnable) {
        b().removeCallbacks(runnable);
    }

    public static Handler b() {
        Handler handler;
        synchronized (e.class) {
            a();
            handler = f2313c;
        }
        return handler;
    }
}
