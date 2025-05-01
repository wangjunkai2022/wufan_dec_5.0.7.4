package org.jboss.netty.channel.socket.nio;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* compiled from: NioClientSocketChannelFactory.java */
/* loaded from: classes7.dex */
public class n implements d4.b {

    /* renamed from: e  reason: collision with root package name */
    private static final int f72626e = 1;

    /* renamed from: a  reason: collision with root package name */
    private final h<k> f72627a;

    /* renamed from: b  reason: collision with root package name */
    private final y<t> f72628b;

    /* renamed from: c  reason: collision with root package name */
    private final o f72629c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f72630d;

    public n() {
        this(Executors.newCachedThreadPool(), Executors.newCachedThreadPool());
        this.f72630d = true;
    }

    private void c() {
        h<k> hVar = this.f72627a;
        if (hVar instanceof org.jboss.netty.util.b) {
            ((org.jboss.netty.util.b) hVar).b();
        }
        y<t> yVar = this.f72628b;
        if (yVar instanceof org.jboss.netty.util.b) {
            ((org.jboss.netty.util.b) yVar).b();
        }
    }

    @Override // org.jboss.netty.channel.i, org.jboss.netty.util.b
    public void b() {
        shutdown();
        c();
    }

    @Override // org.jboss.netty.channel.i
    public void shutdown() {
        this.f72627a.shutdown();
        this.f72628b.shutdown();
        if (this.f72630d) {
            c();
        }
    }

    @Override // org.jboss.netty.channel.i
    public d4.d a(org.jboss.netty.channel.n nVar) {
        return new m(this, nVar, this.f72629c, this.f72628b.e());
    }

    public n(Executor executor, Executor executor2) {
        this(executor, executor2, 1, v.f72642a);
    }

    public n(Executor executor, Executor executor2, int i4) {
        this(executor, executor2, 1, i4);
    }

    public n(Executor executor, Executor executor2, int i4, int i5) {
        this(executor, i4, new u(executor2, i5));
    }

    public n(Executor executor, int i4, y<t> yVar) {
        this(executor, i4, yVar, new org.jboss.netty.util.c());
    }

    public n(Executor executor, int i4, y<t> yVar, org.jboss.netty.util.g gVar) {
        this(new l(executor, i4, gVar, null), yVar);
    }

    public n(h<k> hVar, y<t> yVar) {
        Objects.requireNonNull(hVar, "bossPool");
        Objects.requireNonNull(yVar, "workerPool");
        this.f72627a = hVar;
        this.f72628b = yVar;
        this.f72629c = new o(hVar);
    }
}
