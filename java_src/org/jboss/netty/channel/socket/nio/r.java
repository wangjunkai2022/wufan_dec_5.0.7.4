package org.jboss.netty.channel.socket.nio;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
/* compiled from: NioSocketChannel.java */
/* loaded from: classes7.dex */
public class r extends b<SocketChannel> implements d4.d {
    private static final int E = 0;
    private static final int F = 1;
    private static final int G = 2;
    private static final int H = -1;
    static final /* synthetic */ boolean I = false;
    volatile int C;
    private final s D;

    public r(org.jboss.netty.channel.e eVar, org.jboss.netty.channel.i iVar, org.jboss.netty.channel.n nVar, org.jboss.netty.channel.p pVar, SocketChannel socketChannel, t tVar) {
        super(eVar, iVar, nVar, pVar, tVar, socketChannel);
        this.C = 0;
        this.D = new i(socketChannel.socket());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.jboss.netty.channel.socket.nio.b, org.jboss.netty.channel.a
    public boolean E() {
        if (super.E()) {
            this.C = -1;
            return true;
        }
        return false;
    }

    @Override // org.jboss.netty.channel.socket.nio.b, org.jboss.netty.channel.e
    /* renamed from: L0 */
    public s getConfig() {
        return this.D;
    }

    @Override // org.jboss.netty.channel.socket.nio.b
    /* renamed from: M0 */
    public t x0() {
        return (t) super.x0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void N0() {
        this.C = 1;
    }

    @Override // org.jboss.netty.channel.socket.nio.b, org.jboss.netty.channel.a, org.jboss.netty.channel.e
    public /* bridge */ /* synthetic */ int O() {
        return super.O();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void O0() {
        if (this.C != -1) {
            this.C = 2;
        }
    }

    @Override // org.jboss.netty.channel.socket.nio.b
    InetSocketAddress a0() throws Exception {
        return (InetSocketAddress) ((SocketChannel) this.B).socket().getLocalSocketAddress();
    }

    @Override // org.jboss.netty.channel.socket.nio.b
    InetSocketAddress g0() throws Exception {
        return (InetSocketAddress) ((SocketChannel) this.B).socket().getRemoteSocketAddress();
    }

    @Override // org.jboss.netty.channel.socket.nio.b, org.jboss.netty.channel.e
    public /* bridge */ /* synthetic */ InetSocketAddress getLocalAddress() {
        return super.getLocalAddress();
    }

    @Override // org.jboss.netty.channel.socket.nio.b, org.jboss.netty.channel.e
    public /* bridge */ /* synthetic */ InetSocketAddress getRemoteAddress() {
        return super.getRemoteAddress();
    }

    @Override // org.jboss.netty.channel.e
    public boolean isBound() {
        return this.C >= 1;
    }

    @Override // org.jboss.netty.channel.e
    public boolean isConnected() {
        return this.C == 2;
    }

    @Override // org.jboss.netty.channel.a, org.jboss.netty.channel.e
    public boolean isOpen() {
        return this.C >= 0;
    }

    @Override // org.jboss.netty.channel.a, org.jboss.netty.channel.e
    public org.jboss.netty.channel.j k(Object obj, SocketAddress socketAddress) {
        if (socketAddress != null && !socketAddress.equals(getRemoteAddress())) {
            return u();
        }
        return super.k(obj, null);
    }
}
