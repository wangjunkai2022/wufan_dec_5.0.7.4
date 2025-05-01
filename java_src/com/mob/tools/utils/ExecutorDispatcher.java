package com.mob.tools.utils;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mob.tools.MobLog;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public final class ExecutorDispatcher implements com.mob.tools.utils.a {

    /* renamed from: b  reason: collision with root package name */
    private static volatile ExecutorDispatcher f56905b;

    /* renamed from: a  reason: collision with root package name */
    private final com.mob.tools.utils.a f56906a = new a();

    /* loaded from: classes5.dex */
    public static abstract class SafeRunnable implements Runnable {
        public void afterRun() {
        }

        public void beforeRun() {
        }

        public void handleException(Throwable th) {
        }

        public String name() {
            return "";
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String name = name();
                if (!TextUtils.isEmpty(name)) {
                    Thread.currentThread().setName(name);
                }
                beforeRun();
                safeRun();
                afterRun();
            } catch (Throwable th) {
                try {
                    handleException(th);
                } catch (Throwable unused) {
                }
            }
        }

        public abstract void safeRun();
    }

    /* loaded from: classes5.dex */
    private static final class a implements com.mob.tools.utils.a {

        /* renamed from: a  reason: collision with root package name */
        private final ExecutorService f56907a;

        /* renamed from: b  reason: collision with root package name */
        private final ExecutorService f56908b;

        /* renamed from: c  reason: collision with root package name */
        private final ExecutorService f56909c;

        /* renamed from: d  reason: collision with root package name */
        private final Handler f56910d;

        @Override // com.mob.tools.utils.a
        public <T extends SafeRunnable> void executeDelayed(final T t4, long j4) {
            if (t4 == null) {
                return;
            }
            try {
                this.f56910d.postDelayed(new SafeRunnable() { // from class: com.mob.tools.utils.ExecutorDispatcher.a.1
                    @Override // com.mob.tools.utils.ExecutorDispatcher.SafeRunnable
                    public void safeRun() {
                        a.this.executeImmediately(t4);
                    }
                }, j4);
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }

        @Override // com.mob.tools.utils.a
        public <T extends SafeRunnable> void executeDuctile(T t4) {
            try {
                this.f56908b.execute(t4);
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }

        @Override // com.mob.tools.utils.a
        public <T extends SafeRunnable> void executeImmediately(T t4) {
            try {
                this.f56907a.execute(t4);
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }

        @Override // com.mob.tools.utils.a
        public <T extends SafeRunnable> void executeSerial(T t4) {
            try {
                this.f56909c.execute(t4);
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }

        private a() {
            this.f56910d = new Handler(Looper.getMainLooper());
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, timeUnit, new SynchronousQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            this.f56907a = threadPoolExecutor;
            this.f56908b = new ThreadPoolExecutor(2, 2, 10L, timeUnit, new LinkedBlockingQueue());
            this.f56909c = Executors.newSingleThreadExecutor();
        }
    }

    public static com.mob.tools.utils.a getInstance() {
        if (f56905b == null) {
            synchronized (ExecutorDispatcher.class) {
                if (f56905b == null) {
                    f56905b = new ExecutorDispatcher();
                }
            }
        }
        return f56905b;
    }

    @Override // com.mob.tools.utils.a
    public <T extends SafeRunnable> void executeDelayed(T t4, long j4) {
        if (t4 == null) {
            return;
        }
        try {
            if (j4 <= 0) {
                this.f56906a.executeDuctile(t4);
            } else {
                this.f56906a.executeDelayed(t4, j4);
            }
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }

    @Override // com.mob.tools.utils.a
    public <T extends SafeRunnable> void executeDuctile(T t4) {
        if (t4 == null) {
            return;
        }
        try {
            this.f56906a.executeDuctile(t4);
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }

    @Override // com.mob.tools.utils.a
    public <T extends SafeRunnable> void executeImmediately(T t4) {
        if (t4 == null) {
            return;
        }
        try {
            this.f56906a.executeImmediately(t4);
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }

    @Override // com.mob.tools.utils.a
    public <T extends SafeRunnable> void executeSerial(T t4) {
        if (t4 == null) {
            return;
        }
        try {
            this.f56906a.executeSerial(t4);
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }
}
