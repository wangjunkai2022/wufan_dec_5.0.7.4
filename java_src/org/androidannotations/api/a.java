package org.androidannotations.api;

import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: BackgroundExecutor.java */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f72048a = "BackgroundExecutor";

    /* renamed from: b  reason: collision with root package name */
    public static final Executor f72049b;

    /* renamed from: c  reason: collision with root package name */
    private static Executor f72050c;

    /* renamed from: d  reason: collision with root package name */
    public static final d f72051d;

    /* renamed from: e  reason: collision with root package name */
    private static d f72052e;

    /* renamed from: f  reason: collision with root package name */
    private static final List<c> f72053f;

    /* renamed from: g  reason: collision with root package name */
    private static final ThreadLocal<String> f72054g;

    /* compiled from: BackgroundExecutor.java */
    /* renamed from: org.androidannotations.api.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    static class C0791a implements d {
        C0791a() {
        }

        @Override // org.androidannotations.api.a.d
        public void a(String str, String... strArr) {
            if (str == null) {
                str = "anonymous";
            }
            throw new IllegalStateException("Method invocation is expected from one of serials " + Arrays.toString(strArr) + ", but it was called from " + str + " serial");
        }

        @Override // org.androidannotations.api.a.d
        public void b() {
            throw new IllegalStateException("Method invocation is expected from the UI thread");
        }

        @Override // org.androidannotations.api.a.d
        public void c(String... strArr) {
            if (strArr.length == 0) {
                throw new IllegalStateException("Method invocation is expected from a background thread, but it was called from the UI thread");
            }
            throw new IllegalStateException("Method invocation is expected from one of serials " + Arrays.toString(strArr) + ", but it was called from the UI thread");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BackgroundExecutor.java */
    /* loaded from: classes7.dex */
    public static class b extends c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f72055b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, long j4, String str2, Runnable runnable) {
            super(str, j4, str2);
            this.f72055b = runnable;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            this.f72055b.run();
        }
    }

    /* compiled from: BackgroundExecutor.java */
    /* loaded from: classes7.dex */
    public static abstract class c implements Runnable {
        private boolean executionAsked;
        private Future<?> future;
        private String id;
        private AtomicBoolean managed = new AtomicBoolean();
        private long remainingDelay;
        private String serial;
        private long targetTimeMillis;

        public c(String str, long j4, String str2) {
            if (!"".equals(str)) {
                this.id = str;
            }
            if (j4 > 0) {
                this.remainingDelay = j4;
                this.targetTimeMillis = SystemClock.elapsedRealtime() + j4;
            }
            if ("".equals(str2)) {
                return;
            }
            this.serial = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void postExecute() {
            c p4;
            if (this.id == null && this.serial == null) {
                return;
            }
            a.f72054g.set(null);
            synchronized (a.class) {
                a.f72053f.remove(this);
                String str = this.serial;
                if (str != null && (p4 = a.p(str)) != null) {
                    if (p4.remainingDelay != 0) {
                        p4.remainingDelay = Math.max(0L, p4.targetTimeMillis - SystemClock.elapsedRealtime());
                    }
                    a.l(p4);
                }
            }
        }

        public abstract void execute();

        @Override // java.lang.Runnable
        public void run() {
            if (this.managed.getAndSet(true)) {
                return;
            }
            try {
                a.f72054g.set(this.serial);
                execute();
            } finally {
                postExecute();
            }
        }
    }

    /* compiled from: BackgroundExecutor.java */
    /* loaded from: classes7.dex */
    public interface d {
        void a(String str, String... strArr);

        void b();

        void c(String... strArr);
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors() * 2);
        f72049b = newScheduledThreadPool;
        f72050c = newScheduledThreadPool;
        C0791a c0791a = new C0791a();
        f72051d = c0791a;
        f72052e = c0791a;
        f72053f = new ArrayList();
        f72054g = new ThreadLocal<>();
    }

    private a() {
    }

    public static synchronized void d(String str, boolean z4) {
        synchronized (a.class) {
            for (int size = f72053f.size() - 1; size >= 0; size--) {
                List<c> list = f72053f;
                c cVar = list.get(size);
                if (str.equals(cVar.id)) {
                    if (cVar.future != null) {
                        cVar.future.cancel(z4);
                        if (!cVar.managed.getAndSet(true)) {
                            cVar.postExecute();
                        }
                    } else if (cVar.executionAsked) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("A task with id ");
                        sb.append(cVar.id);
                        sb.append(" cannot be cancelled (the executor set does not support it)");
                    } else {
                        list.remove(size);
                    }
                }
            }
        }
    }

    public static void e(String... strArr) {
        if (strArr.length == 0) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                f72052e.c(strArr);
                return;
            }
            return;
        }
        String str = f72054g.get();
        if (str == null) {
            f72052e.a(null, strArr);
            return;
        }
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return;
            }
        }
        f72052e.a(str, strArr);
    }

    public static void f() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            f72052e.b();
        }
    }

    private static Future<?> g(Runnable runnable, long j4) {
        if (j4 > 0) {
            Executor executor = f72050c;
            if (executor instanceof ScheduledExecutorService) {
                return ((ScheduledExecutorService) executor).schedule(runnable, j4, TimeUnit.MILLISECONDS);
            }
            throw new IllegalArgumentException("The executor set does not support scheduling");
        }
        Executor executor2 = f72050c;
        if (executor2 instanceof ExecutorService) {
            return ((ExecutorService) executor2).submit(runnable);
        }
        executor2.execute(runnable);
        return null;
    }

    public static void h(Runnable runnable) {
        g(runnable, 0L);
    }

    public static void i(Runnable runnable, long j4) {
        g(runnable, j4);
    }

    public static void j(Runnable runnable, String str, long j4, String str2) {
        l(new b(str, j4, str2, runnable));
    }

    public static void k(Runnable runnable, String str, String str2) {
        j(runnable, str, 0L, str2);
    }

    public static synchronized void l(c cVar) {
        synchronized (a.class) {
            if (cVar.id != null || cVar.serial != null) {
                f72053f.add(cVar);
            }
            if (cVar.serial == null || !m(cVar.serial)) {
                cVar.executionAsked = true;
                cVar.future = g(cVar, cVar.remainingDelay);
            }
        }
    }

    private static boolean m(String str) {
        for (c cVar : f72053f) {
            if (cVar.executionAsked && str.equals(cVar.serial)) {
                return true;
            }
        }
        return false;
    }

    public static void n(Executor executor) {
        f72050c = executor;
    }

    public static void o(d dVar) {
        f72052e = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c p(String str) {
        int size = f72053f.size();
        for (int i4 = 0; i4 < size; i4++) {
            List<c> list = f72053f;
            if (str.equals(list.get(i4).serial)) {
                return list.remove(i4);
            }
        }
        return null;
    }
}
