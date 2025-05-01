package notchtools.geek.com.notchtools.helper;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* compiled from: ThreadUtils.java */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static Handler f71949a;

    /* renamed from: c  reason: collision with root package name */
    private static Handler f71951c;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f71950b = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final Object f71952d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static final Executor f71953e = Executors.newFixedThreadPool(4, new b());

    /* compiled from: ThreadUtils.java */
    /* loaded from: classes7.dex */
    static class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f71954b;

        a(Object obj) {
            this.f71954b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.a().removeCallbacksAndMessages(this.f71954b);
        }
    }

    /* compiled from: ThreadUtils.java */
    /* loaded from: classes7.dex */
    static class b implements ThreadFactory {

        /* renamed from: b  reason: collision with root package name */
        private int f71955b = -1;

        b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            this.f71955b++;
            return new Thread(runnable, "ThreadUtils: " + this.f71955b);
        }
    }

    /* compiled from: ThreadUtils.java */
    /* loaded from: classes7.dex */
    static class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f71956b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ InterfaceC0788d f71957c;

        /* compiled from: ThreadUtils.java */
        /* loaded from: classes7.dex */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object f71958b;

            a(Object obj) {
                this.f71958b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    c.this.f71957c.a(this.f71958b);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        c(e eVar, InterfaceC0788d interfaceC0788d) {
            this.f71956b = eVar;
            this.f71957c = interfaceC0788d;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f71956b.a();
            } catch (Throwable th) {
                th.printStackTrace();
                obj = null;
            }
            if (this.f71957c == null) {
                return;
            }
            d.p(new a(obj));
        }
    }

    /* compiled from: ThreadUtils.java */
    /* renamed from: notchtools.geek.com.notchtools.helper.d$d  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public interface InterfaceC0788d<T> {
        void a(@Nullable T t4);
    }

    /* compiled from: ThreadUtils.java */
    /* loaded from: classes7.dex */
    public interface e<T> {
        @Nullable
        T a();
    }

    static /* synthetic */ Handler a() {
        return i();
    }

    public static void b(Context context) {
        if (context != null) {
            i().removeCallbacksAndMessages(Integer.valueOf(context.hashCode()));
        }
    }

    public static void c(Runnable runnable) {
        i().removeCallbacks(runnable);
    }

    public static void d(Context context) {
        if (context != null) {
            k().removeCallbacksAndMessages(Integer.valueOf(context.hashCode()));
        }
    }

    public static void e(Runnable runnable) {
        k().removeCallbacks(runnable);
    }

    public static void f(Context context, long j4) {
        if (context != null) {
            r(new a(Integer.valueOf(context.hashCode())), j4);
        }
    }

    public static void g(Runnable runnable) {
        if (runnable != null) {
            try {
                f71953e.execute(runnable);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static <T> void h(e<T> eVar, InterfaceC0788d<T> interfaceC0788d) {
        if (eVar == null) {
            return;
        }
        f71953e.execute(new c(eVar, interfaceC0788d));
    }

    private static Handler i() {
        Handler handler;
        synchronized (f71952d) {
            if (f71951c == null) {
                HandlerThread handlerThread = new HandlerThread("daemon-handler-thread");
                handlerThread.start();
                f71951c = new Handler(handlerThread.getLooper());
            }
            handler = f71951c;
        }
        return handler;
    }

    public static String j() {
        return Thread.currentThread().getName() + " : " + Thread.currentThread().getId();
    }

    private static Handler k() {
        Handler handler;
        synchronized (f71950b) {
            if (f71949a == null) {
                f71949a = new Handler(Looper.getMainLooper());
            }
            handler = f71949a;
        }
        return handler;
    }

    public static boolean l() {
        return Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId();
    }

    public static boolean m(Context context, Runnable runnable) {
        if (context == null) {
            return n(runnable);
        }
        return i().postAtTime(runnable, Integer.valueOf(context.hashCode()), SystemClock.uptimeMillis());
    }

    public static boolean n(Runnable runnable) {
        return i().post(runnable);
    }

    public static boolean o(Context context, Runnable runnable) {
        if (context == null) {
            return p(runnable);
        }
        return k().postAtTime(runnable, Integer.valueOf(context.hashCode()), SystemClock.uptimeMillis());
    }

    public static boolean p(Runnable runnable) {
        return k().post(runnable);
    }

    public static boolean q(Context context, Runnable runnable, long j4) {
        if (context == null) {
            return r(runnable, j4);
        }
        return i().postAtTime(runnable, Integer.valueOf(context.hashCode()), SystemClock.uptimeMillis() + j4);
    }

    private static boolean r(Runnable runnable, long j4) {
        return i().postDelayed(runnable, j4);
    }

    public static boolean s(Context context, Runnable runnable, long j4) {
        if (context == null) {
            return t(runnable, j4);
        }
        return k().postAtTime(runnable, Integer.valueOf(context.hashCode()), SystemClock.uptimeMillis() + j4);
    }

    public static boolean t(Runnable runnable, long j4) {
        return k().postDelayed(runnable, j4);
    }

    public static boolean u() {
        return i().getLooper() == Looper.myLooper();
    }

    private static boolean v() {
        return k().getLooper() == Looper.myLooper();
    }

    public static void w(String str) {
        if (v()) {
            return;
        }
        throw new RuntimeException("ThreadUtils safeCheck alert " + str);
    }
}
