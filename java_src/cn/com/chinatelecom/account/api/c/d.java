package cn.com.chinatelecom.account.api.c;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public class d extends ThreadPoolExecutor {

    /* renamed from: a  reason: collision with root package name */
    private static final BlockingQueue<Runnable> f618a = new LinkedBlockingQueue(256);

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadFactory f619b = new ThreadFactory() { // from class: cn.com.chinatelecom.account.api.c.d.1

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f620a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable);
        }
    };

    public d() {
        this(5);
    }

    public d(int i4) {
        this(i4, i4 * 2, 1L, TimeUnit.SECONDS, f618a, f619b);
    }

    public d(int i4, int i5, long j4, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i4, i5, j4, timeUnit, blockingQueue, threadFactory);
    }

    public void a(e eVar) {
        execute(eVar);
    }
}
