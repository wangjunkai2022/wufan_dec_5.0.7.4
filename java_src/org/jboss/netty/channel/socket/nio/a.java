package org.jboss.netty.channel.socket.nio;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.jboss.netty.channel.socket.nio.g;
/* compiled from: AbstractNioBossPool.java */
/* loaded from: classes7.dex */
public abstract class a<E extends g> implements h<E>, org.jboss.netty.util.b {

    /* renamed from: a  reason: collision with root package name */
    private final g[] f72568a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f72569b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f72570c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f72571d;

    a(Executor executor, int i4) {
        this(executor, i4, true);
    }

    @Override // org.jboss.netty.util.b
    public void b() {
        shutdown();
        org.jboss.netty.util.internal.e.c(this.f72570c);
    }

    @Override // org.jboss.netty.channel.socket.nio.q
    public void c() {
        for (g gVar : this.f72568a) {
            gVar.rebuildSelector();
        }
    }

    @Override // org.jboss.netty.channel.socket.nio.h
    public E d() {
        return (E) this.f72568a[Math.abs(this.f72569b.getAndIncrement() % this.f72568a.length)];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        if (!this.f72571d) {
            this.f72571d = true;
            int i4 = 0;
            while (true) {
                g[] gVarArr = this.f72568a;
                if (i4 >= gVarArr.length) {
                    return;
                }
                gVarArr[i4] = g(this.f72570c);
                i4++;
            }
        } else {
            throw new IllegalStateException("Init was done before");
        }
    }

    protected abstract E g(Executor executor);

    @Override // org.jboss.netty.channel.socket.nio.q
    public void shutdown() {
        for (g gVar : this.f72568a) {
            gVar.shutdown();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Executor executor, int i4, boolean z4) {
        this.f72569b = new AtomicInteger();
        Objects.requireNonNull(executor, "bossExecutor");
        if (i4 > 0) {
            this.f72568a = new g[i4];
            this.f72570c = executor;
            if (z4) {
                f();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("bossCount (" + i4 + ") must be a positive integer.");
    }
}
