package org.jboss.netty.channel.socket.nio;

import java.io.IOException;
import java.net.ConnectException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: NioClientBoss.java */
/* loaded from: classes7.dex */
public final class k extends d implements g {

    /* renamed from: n  reason: collision with root package name */
    private final org.jboss.netty.util.h f72617n;

    /* renamed from: o  reason: collision with root package name */
    private final org.jboss.netty.util.g f72618o;

    /* compiled from: NioClientBoss.java */
    /* loaded from: classes7.dex */
    class a implements org.jboss.netty.util.h {
        a() {
        }

        @Override // org.jboss.netty.util.h
        public void a(org.jboss.netty.util.f fVar) throws Exception {
            Selector selector = k.this.f72595e;
            if (selector == null || !k.this.f72596f.compareAndSet(false, true)) {
                return;
            }
            selector.wakeup();
        }
    }

    /* compiled from: NioClientBoss.java */
    /* loaded from: classes7.dex */
    private final class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final k f72620b;

        /* renamed from: c  reason: collision with root package name */
        private final m f72621c;

        b(k kVar, m mVar) {
            this.f72620b = kVar;
            this.f72621c = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            int connectTimeoutMillis = this.f72621c.getConfig().getConnectTimeoutMillis();
            if (connectTimeoutMillis > 0 && !this.f72621c.isConnected()) {
                this.f72621c.M = k.this.f72618o.a(k.this.f72617n, connectTimeoutMillis, TimeUnit.MILLISECONDS);
            }
            try {
                ((SocketChannel) this.f72621c.B).register(this.f72620b.f72595e, 8, this.f72621c);
            } catch (ClosedChannelException unused) {
                m mVar = this.f72621c;
                mVar.f72572o.n(mVar, org.jboss.netty.channel.s.W(mVar));
            }
            int connectTimeoutMillis2 = this.f72621c.getConfig().getConnectTimeoutMillis();
            if (connectTimeoutMillis2 > 0) {
                this.f72621c.L = System.nanoTime() + (connectTimeoutMillis2 * 1000000);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Executor executor, org.jboss.netty.util.g gVar, org.jboss.netty.util.d dVar) {
        super(executor, dVar);
        this.f72617n = new a();
        this.f72618o = gVar;
    }

    private static void n(SelectionKey selectionKey) throws IOException {
        m mVar = (m) selectionKey.attachment();
        if (((SocketChannel) mVar.B).finishConnect()) {
            selectionKey.cancel();
            if (mVar.M != null) {
                mVar.M.cancel();
            }
            mVar.f72572o.u(mVar, mVar.J);
        }
    }

    private static void o(Set<SelectionKey> set, long j4) {
        ConnectException connectException = null;
        for (SelectionKey selectionKey : set) {
            if (selectionKey.isValid()) {
                m mVar = (m) selectionKey.attachment();
                long j5 = mVar.L;
                if (j5 > 0 && j4 >= j5) {
                    if (connectException == null) {
                        connectException = new ConnectException("connection timed out");
                    }
                    mVar.J.setFailure(connectException);
                    org.jboss.netty.channel.s.D(mVar, connectException);
                    mVar.f72572o.n(mVar, org.jboss.netty.channel.s.W(mVar));
                }
            }
        }
    }

    private void p(Set<SelectionKey> set) {
        if (set.isEmpty()) {
            return;
        }
        Iterator<SelectionKey> it2 = set.iterator();
        while (it2.hasNext()) {
            SelectionKey next = it2.next();
            it2.remove();
            if (!next.isValid()) {
                b(next);
            } else {
                try {
                    if (next.isConnectable()) {
                        n(next);
                    }
                } catch (Throwable th) {
                    m mVar = (m) next.attachment();
                    mVar.J.setFailure(th);
                    org.jboss.netty.channel.s.D(mVar, th);
                    next.cancel();
                    mVar.f72572o.n(mVar, org.jboss.netty.channel.s.W(mVar));
                }
            }
        }
    }

    @Override // org.jboss.netty.channel.socket.nio.d
    protected void b(SelectionKey selectionKey) {
        m mVar = (m) selectionKey.attachment();
        mVar.f72572o.n(mVar, org.jboss.netty.channel.s.W(mVar));
    }

    @Override // org.jboss.netty.channel.socket.nio.d
    protected Runnable c(org.jboss.netty.channel.e eVar, org.jboss.netty.channel.j jVar) {
        return new b(this, (m) eVar);
    }

    @Override // org.jboss.netty.channel.socket.nio.d
    protected org.jboss.netty.util.e f(int i4, org.jboss.netty.util.d dVar) {
        return new org.jboss.netty.util.e(this, "New I/O boss #" + i4, dVar);
    }

    @Override // org.jboss.netty.channel.socket.nio.d
    protected void h(Selector selector) {
        p(selector.selectedKeys());
        o(selector.keys(), System.nanoTime());
    }

    @Override // org.jboss.netty.channel.socket.nio.d, org.jboss.netty.channel.socket.nio.p
    public /* bridge */ /* synthetic */ void rebuildSelector() {
        super.rebuildSelector();
    }

    @Override // org.jboss.netty.channel.socket.nio.d, java.lang.Runnable
    public /* bridge */ /* synthetic */ void run() {
        super.run();
    }

    @Override // org.jboss.netty.channel.socket.nio.d, org.jboss.netty.channel.socket.nio.p
    public /* bridge */ /* synthetic */ void shutdown() {
        super.shutdown();
    }

    @Override // org.jboss.netty.channel.socket.nio.d, org.jboss.netty.channel.socket.nio.p
    public /* bridge */ /* synthetic */ void u(org.jboss.netty.channel.e eVar, org.jboss.netty.channel.j jVar) {
        super.u(eVar, jVar);
    }
}
