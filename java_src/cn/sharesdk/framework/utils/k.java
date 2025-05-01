package cn.sharesdk.framework.utils;

import android.text.TextUtils;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ThreadPoolManager.java */
/* loaded from: classes2.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public static ThreadPoolExecutor f1070a;

    /* renamed from: b  reason: collision with root package name */
    private static ScheduledExecutorService f1071b = Executors.newSingleThreadScheduledExecutor();

    /* compiled from: ThreadPoolManager.java */
    /* loaded from: classes2.dex */
    public static abstract class a implements Runnable {
        public abstract void a() throws Throwable;

        public void a(Throwable th) {
        }

        public String b() {
            return "";
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (!TextUtils.isEmpty(b())) {
                    Thread.currentThread().setName(b());
                }
                a();
            } catch (Throwable th) {
                try {
                    a(th);
                } catch (Throwable unused) {
                }
                SSDKLog.b().d(th);
            }
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 3L, TimeUnit.MINUTES, new LinkedBlockingQueue());
        f1070a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static void a(Runnable runnable) {
        try {
            f1070a.execute(runnable);
        } catch (Throwable th) {
            SSDKLog.b().d(th);
        }
    }

    public static <T extends a> void a(T t4) {
        try {
            f1071b.execute(t4);
        } catch (Throwable th) {
            SSDKLog.b().d(th);
        }
    }
}
