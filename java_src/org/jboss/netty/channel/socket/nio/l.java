package org.jboss.netty.channel.socket.nio;

import java.util.concurrent.Executor;
/* compiled from: NioClientBossPool.java */
/* loaded from: classes7.dex */
public class l extends a<k> {

    /* renamed from: e  reason: collision with root package name */
    private final org.jboss.netty.util.d f72623e;

    /* renamed from: f  reason: collision with root package name */
    private final org.jboss.netty.util.g f72624f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f72625g;

    public l(Executor executor, int i4, org.jboss.netty.util.g gVar, org.jboss.netty.util.d dVar) {
        super(executor, i4, false);
        this.f72623e = dVar;
        this.f72624f = gVar;
        f();
    }

    @Override // org.jboss.netty.channel.socket.nio.a, org.jboss.netty.util.b
    public void b() {
        super.b();
        this.f72624f.stop();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.jboss.netty.channel.socket.nio.a
    /* renamed from: h */
    public k g(Executor executor) {
        return new k(executor, this.f72624f, this.f72623e);
    }

    @Override // org.jboss.netty.channel.socket.nio.a, org.jboss.netty.channel.socket.nio.q
    public void shutdown() {
        super.shutdown();
        if (this.f72625g) {
            this.f72624f.stop();
        }
    }

    public l(Executor executor, int i4) {
        this(executor, i4, new org.jboss.netty.util.c(), null);
        this.f72625g = true;
    }
}
