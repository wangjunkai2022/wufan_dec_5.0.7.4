package com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq;

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
public class m {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ThreadPoolExecutor f1705a;

    /* renamed from: b  reason: collision with root package name */
    public static Handler f1706b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private static final Random f1707c = new Random();

    public static <T> Future<T> a(Callable<T> callable) {
        if (f1705a == null) {
            b();
        }
        return f1705a.submit(callable);
    }

    private static void b() {
        f1705a = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    public static void c(Runnable runnable) {
        if (f1705a == null) {
            b();
        }
        f1705a.execute(runnable);
    }

    public static void d(String str, Context context) {
        if (context != null && f1707c.nextInt(100) < 5) {
            try {
                context.getSharedPreferences("cb_test", 0).edit().putString(MediationConstant.ADN_KS, str).apply();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void e(Runnable runnable) {
        f1706b.post(runnable);
    }
}
