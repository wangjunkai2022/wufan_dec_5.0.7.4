package org.jboss.netty.channel.socket.nio;

import java.net.SocketAddress;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SocketChannel;
import org.jboss.netty.channel.ChannelState;
import org.jboss.netty.channel.i0;
/* compiled from: NioClientSocketPipelineSink.java */
/* loaded from: classes7.dex */
class o extends c {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ boolean f72631b = false;

    /* renamed from: a  reason: collision with root package name */
    private final h<k> f72632a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NioClientSocketPipelineSink.java */
    /* loaded from: classes7.dex */
    public class a implements org.jboss.netty.channel.k {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ org.jboss.netty.channel.j f72633b;

        a(org.jboss.netty.channel.j jVar) {
            this.f72633b = jVar;
        }

        @Override // org.jboss.netty.channel.k
        public void a(org.jboss.netty.channel.j jVar) throws Exception {
            if (this.f72633b.isDone()) {
                return;
            }
            this.f72633b.setFailure(new ClosedChannelException());
        }
    }

    /* compiled from: NioClientSocketPipelineSink.java */
    /* loaded from: classes7.dex */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f72635a;

        static {
            int[] iArr = new int[ChannelState.values().length];
            f72635a = iArr;
            try {
                iArr[ChannelState.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72635a[ChannelState.BOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72635a[ChannelState.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72635a[ChannelState.INTEREST_OPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(h<k> hVar) {
        this.f72632a = hVar;
    }

    private static void e(m mVar, org.jboss.netty.channel.j jVar, SocketAddress socketAddress) {
        try {
            ((SocketChannel) mVar.B).socket().bind(socketAddress);
            mVar.K = true;
            mVar.N0();
            jVar.setSuccess();
            org.jboss.netty.channel.s.k(mVar, mVar.getLocalAddress());
        } catch (Throwable th) {
            jVar.setFailure(th);
            org.jboss.netty.channel.s.D(mVar, th);
        }
    }

    private void f(m mVar, org.jboss.netty.channel.j jVar, SocketAddress socketAddress) {
        try {
            if (((SocketChannel) mVar.B).connect(socketAddress)) {
                mVar.f72572o.u(mVar, jVar);
            } else {
                mVar.t0().b(new a(jVar));
                jVar.b(org.jboss.netty.channel.k.f72547z1);
                mVar.J = jVar;
                g().u(mVar, jVar);
            }
        } catch (Throwable th) {
            jVar.setFailure(th);
            org.jboss.netty.channel.s.D(mVar, th);
            mVar.f72572o.n(mVar, org.jboss.netty.channel.s.W(mVar));
        }
    }

    private k g() {
        return this.f72632a.d();
    }

    @Override // org.jboss.netty.channel.p
    public void a(org.jboss.netty.channel.n nVar, org.jboss.netty.channel.h hVar) throws Exception {
        if (hVar instanceof org.jboss.netty.channel.q) {
            org.jboss.netty.channel.q qVar = (org.jboss.netty.channel.q) hVar;
            m mVar = (m) qVar.getChannel();
            org.jboss.netty.channel.j d5 = qVar.d();
            ChannelState state = qVar.getState();
            Object value = qVar.getValue();
            int i4 = b.f72635a[state.ordinal()];
            if (i4 == 1) {
                if (Boolean.FALSE.equals(value)) {
                    mVar.f72572o.n(mVar, d5);
                }
            } else if (i4 == 2) {
                if (value != null) {
                    e(mVar, d5, (SocketAddress) value);
                } else {
                    mVar.f72572o.n(mVar, d5);
                }
            } else if (i4 != 3) {
                if (i4 != 4) {
                    return;
                }
                mVar.f72572o.s(mVar, d5, ((Integer) value).intValue());
            } else if (value != null) {
                f(mVar, d5, (SocketAddress) value);
            } else {
                mVar.f72572o.n(mVar, d5);
            }
        } else if (hVar instanceof i0) {
            i0 i0Var = (i0) hVar;
            r rVar = (r) i0Var.getChannel();
            rVar.f72576s.offer(i0Var);
            rVar.f72572o.y(rVar);
        }
    }
}
