package org.jboss.netty.channel.socket.nio;

import java.util.concurrent.Executor;
/* compiled from: NioWorkerPool.java */
/* loaded from: classes7.dex */
public class u extends f<t> {

    /* renamed from: e  reason: collision with root package name */
    private final org.jboss.netty.util.d f72641e;

    public u(Executor executor, int i4) {
        this(executor, i4, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.jboss.netty.channel.socket.nio.f
    @Deprecated
    /* renamed from: j */
    public t f(Executor executor) {
        return new t(executor, this.f72641e);
    }

    public u(Executor executor, int i4, org.jboss.netty.util.d dVar) {
        super(executor, i4, false);
        this.f72641e = dVar;
        g();
    }
}
