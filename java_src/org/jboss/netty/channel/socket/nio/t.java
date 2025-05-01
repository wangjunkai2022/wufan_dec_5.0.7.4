package org.jboss.netty.channel.socket.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SocketChannel;
import java.util.concurrent.Executor;
import org.jboss.netty.channel.ChannelException;
/* compiled from: NioWorker.java */
/* loaded from: classes7.dex */
public class t extends e {

    /* renamed from: o  reason: collision with root package name */
    private final w f72636o;

    /* compiled from: NioWorker.java */
    /* loaded from: classes7.dex */
    private final class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final r f72637b;

        /* renamed from: c  reason: collision with root package name */
        private final org.jboss.netty.channel.j f72638c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f72639d;

        a(r rVar, org.jboss.netty.channel.j jVar, boolean z4) {
            this.f72637b = rVar;
            this.f72638c = jVar;
            this.f72639d = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            InetSocketAddress localAddress = this.f72637b.getLocalAddress();
            InetSocketAddress remoteAddress = this.f72637b.getRemoteAddress();
            if (localAddress != null && remoteAddress != null) {
                try {
                    if (this.f72639d) {
                        ((SocketChannel) this.f72637b.B).configureBlocking(false);
                    }
                    ((SocketChannel) this.f72637b.B).register(t.this.f72595e, this.f72637b.e0(), this.f72637b);
                    if (this.f72638c != null) {
                        this.f72637b.O0();
                        this.f72638c.setSuccess();
                    }
                    if (this.f72639d || !((m) this.f72637b).K) {
                        org.jboss.netty.channel.s.k(this.f72637b, localAddress);
                    }
                    org.jboss.netty.channel.s.p(this.f72637b, remoteAddress);
                    return;
                } catch (IOException e5) {
                    org.jboss.netty.channel.j jVar = this.f72638c;
                    if (jVar != null) {
                        jVar.setFailure(e5);
                    }
                    t tVar = t.this;
                    r rVar = this.f72637b;
                    tVar.n(rVar, org.jboss.netty.channel.s.W(rVar));
                    if (!(e5 instanceof ClosedChannelException)) {
                        throw new ChannelException("Failed to register a socket to the selector.", e5);
                    }
                    return;
                }
            }
            org.jboss.netty.channel.j jVar2 = this.f72638c;
            if (jVar2 != null) {
                jVar2.setFailure(new ClosedChannelException());
            }
            t tVar2 = t.this;
            r rVar2 = this.f72637b;
            tVar2.n(rVar2, org.jboss.netty.channel.s.W(rVar2));
        }
    }

    public t(Executor executor) {
        super(executor);
        this.f72636o = new w();
    }

    @Override // org.jboss.netty.channel.socket.nio.d
    protected Runnable c(org.jboss.netty.channel.e eVar, org.jboss.netty.channel.j jVar) {
        return new a((r) eVar, jVar, !(eVar instanceof m));
    }

    @Override // org.jboss.netty.channel.socket.nio.e, d4.f
    public /* bridge */ /* synthetic */ void g0(Runnable runnable) {
        super.g0(runnable);
    }

    @Override // org.jboss.netty.channel.socket.nio.e
    public /* bridge */ /* synthetic */ void o(Runnable runnable, boolean z4) {
        super.o(runnable, z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d A[ADDED_TO_REGION] */
    @Override // org.jboss.netty.channel.socket.nio.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean q(java.nio.channels.SelectionKey r11) {
        /*
            r10 = this;
            java.nio.channels.SelectableChannel r0 = r11.channel()
            java.nio.channels.SocketChannel r0 = (java.nio.channels.SocketChannel) r0
            java.lang.Object r1 = r11.attachment()
            org.jboss.netty.channel.socket.nio.r r1 = (org.jboss.netty.channel.socket.nio.r) r1
            org.jboss.netty.channel.socket.nio.s r2 = r1.getConfig()
            org.jboss.netty.channel.j0 r2 = r2.f()
            int r3 = r2.a()
            org.jboss.netty.channel.socket.nio.s r4 = r1.getConfig()
            org.jboss.netty.buffer.f r4 = r4.g()
            org.jboss.netty.channel.socket.nio.w r5 = r10.f72636o
            java.nio.ByteBuffer r3 = r5.c(r3)
            java.nio.ByteOrder r5 = r4.d()
            java.nio.ByteBuffer r3 = r3.order(r5)
            r5 = 0
            r6 = 0
            r7 = 0
        L31:
            r8 = 1
            int r7 = r0.read(r3)     // Catch: java.lang.Throwable -> L41 java.nio.channels.ClosedChannelException -> L45
            if (r7 <= 0) goto L3f
            int r6 = r6 + r7
            boolean r9 = r3.hasRemaining()     // Catch: java.lang.Throwable -> L41 java.nio.channels.ClosedChannelException -> L45
            if (r9 != 0) goto L31
        L3f:
            r0 = 0
            goto L46
        L41:
            r0 = move-exception
            org.jboss.netty.channel.s.D(r1, r0)
        L45:
            r0 = 1
        L46:
            if (r6 <= 0) goto L5b
            r3.flip()
            org.jboss.netty.buffer.e r4 = r4.a(r6)
            r4.F0(r5, r3)
            r4.u0(r6)
            r2.b(r6)
            org.jboss.netty.channel.s.H(r1, r4)
        L5b:
            if (r7 < 0) goto L61
            if (r0 == 0) goto L60
            goto L61
        L60:
            return r8
        L61:
            r11.cancel()
            org.jboss.netty.channel.j r11 = org.jboss.netty.channel.s.W(r1)
            r10.n(r1, r11)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jboss.netty.channel.socket.nio.t.q(java.nio.channels.SelectionKey):boolean");
    }

    @Override // org.jboss.netty.channel.socket.nio.e
    protected boolean r(b<?> bVar) {
        if (Thread.currentThread() != this.f72594d) {
            if (bVar.f72575r.compareAndSet(false, true)) {
                j(bVar.f72574q);
            }
            return true;
        }
        return false;
    }

    @Override // org.jboss.netty.channel.socket.nio.d, org.jboss.netty.channel.socket.nio.p
    public /* bridge */ /* synthetic */ void rebuildSelector() {
        super.rebuildSelector();
    }

    @Override // org.jboss.netty.channel.socket.nio.e, org.jboss.netty.channel.socket.nio.d, java.lang.Runnable
    public void run() {
        super.run();
        this.f72636o.b();
    }

    @Override // org.jboss.netty.channel.socket.nio.d, org.jboss.netty.channel.socket.nio.p
    public /* bridge */ /* synthetic */ void shutdown() {
        super.shutdown();
    }

    @Override // org.jboss.netty.channel.socket.nio.d, org.jboss.netty.channel.socket.nio.p
    public /* bridge */ /* synthetic */ void u(org.jboss.netty.channel.e eVar, org.jboss.netty.channel.j jVar) {
        super.u(eVar, jVar);
    }

    public t(Executor executor, org.jboss.netty.util.d dVar) {
        super(executor, dVar);
        this.f72636o = new w();
    }
}
