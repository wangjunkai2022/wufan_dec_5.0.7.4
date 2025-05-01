package com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ThreadPoolExecutor f1921a;

    /* renamed from: b  reason: collision with root package name */
    public static Handler f1922b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private static final Random f1923c = new Random();

    public static <T> Future<T> a(Callable<T> callable) {
        if (f1921a == null) {
            b();
        }
        return f1921a.submit(callable);
    }

    private static void b() {
        f1921a = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    public static void c(Runnable runnable) {
        if (f1921a == null) {
            b();
        }
        f1921a.execute(runnable);
    }

    public static void d(String str, Context context) {
        if (context != null && f1923c.nextInt(100) < 5) {
            try {
                context.getSharedPreferences("cb_test", 0).edit().putString(MediationConstant.ADN_GDT, str).apply();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void e(Runnable runnable) {
        f1922b.post(runnable);
    }
}
