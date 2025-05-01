package bolts;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: BoltsExecutors.java */
/* loaded from: classes2.dex */
final class b {

    /* renamed from: d  reason: collision with root package name */
    private static final b f257d = new b();

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f258a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f259b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f260c;

    /* compiled from: BoltsExecutors.java */
    /* renamed from: bolts.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static class ExecutorC0012b implements Executor {

        /* renamed from: c  reason: collision with root package name */
        private static final int f261c = 15;

        /* renamed from: b  reason: collision with root package name */
        private ThreadLocal<Integer> f262b;

        private ExecutorC0012b() {
            this.f262b = new ThreadLocal<>();
        }

        private int a() {
            Integer num = this.f262b.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f262b.remove();
            } else {
                this.f262b.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        private int b() {
            Integer num = this.f262b.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.f262b.set(Integer.valueOf(intValue));
            return intValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (b() <= 15) {
                    runnable.run();
                } else {
                    b.a().execute(runnable);
                }
            } finally {
                a();
            }
        }
    }

    private b() {
        this.f258a = !c() ? Executors.newCachedThreadPool() : bolts.a.b();
        this.f259b = Executors.newSingleThreadScheduledExecutor();
        this.f260c = new ExecutorC0012b();
    }

    public static ExecutorService a() {
        return f257d.f258a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor b() {
        return f257d.f260c;
    }

    private static boolean c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains(q.a.f73126a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ScheduledExecutorService d() {
        return f257d.f259b;
    }
}
