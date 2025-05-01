package org.jboss.netty.channel.socket.nio;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.jboss.netty.channel.socket.nio.e;
/* compiled from: AbstractNioWorkerPool.java */
/* loaded from: classes7.dex */
public abstract class f<E extends e> implements y<E>, org.jboss.netty.util.b {

    /* renamed from: a  reason: collision with root package name */
    private final e[] f72607a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f72608b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f72609c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f72610d;

    f(Executor executor, int i4) {
        this(executor, i4, true);
    }

    @Override // org.jboss.netty.util.b
    public void b() {
        shutdown();
        org.jboss.netty.util.internal.e.c(this.f72609c);
    }

    @Override // org.jboss.netty.channel.socket.nio.q
    public void c() {
        for (e eVar : this.f72607a) {
            eVar.rebuildSelector();
        }
    }

    @Deprecated
    protected E f(Executor executor) {
        throw new IllegalStateException("This will be removed. Override this and the newWorker(..) method!");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g() {
        if (!this.f72610d) {
            this.f72610d = true;
            int i4 = 0;
            while (true) {
                e[] eVarArr = this.f72607a;
                if (i4 >= eVarArr.length) {
                    return;
                }
                eVarArr[i4] = h(this.f72609c);
                i4++;
            }
        } else {
            throw new IllegalStateException("Init was done before");
        }
    }

    protected E h(Executor executor) {
        return f(executor);
    }

    @Override // org.jboss.netty.channel.socket.nio.y
    /* renamed from: i */
    public E e() {
        return (E) this.f72607a[Math.abs(this.f72608b.getAndIncrement() % this.f72607a.length)];
    }

    @Override // org.jboss.netty.channel.socket.nio.q
    public void shutdown() {
        for (e eVar : this.f72607a) {
            eVar.shutdown();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Executor executor, int i4, boolean z4) {
        this.f72608b = new AtomicInteger();
        Objects.requireNonNull(executor, "workerExecutor");
        if (i4 > 0) {
            this.f72607a = new e[i4];
            this.f72609c = executor;
            if (z4) {
                g();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("workerCount (" + i4 + ") must be a positive integer.");
    }
}
