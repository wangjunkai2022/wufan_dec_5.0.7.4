package org.jboss.netty.channel.socket.nio;

import java.io.IOException;
import java.nio.channels.SocketChannel;
import org.jboss.netty.channel.ChannelException;
/* compiled from: NioClientSocketChannel.java */
/* loaded from: classes7.dex */
final class m extends r {
    volatile org.jboss.netty.channel.j J;
    volatile boolean K;
    long L;
    volatile org.jboss.netty.util.f M;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(org.jboss.netty.channel.i iVar, org.jboss.netty.channel.n nVar, org.jboss.netty.channel.p pVar, t tVar) {
        super(null, iVar, nVar, pVar, P0(), tVar);
        org.jboss.netty.channel.s.x(this);
    }

    private static SocketChannel P0() {
        try {
            SocketChannel open = SocketChannel.open();
            try {
                try {
                    open.configureBlocking(false);
                    return open;
                } catch (Throwable th) {
                    try {
                        open.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                    throw th;
                }
            } catch (IOException e6) {
                throw new ChannelException("Failed to enter non-blocking mode.", e6);
            }
        } catch (IOException e7) {
            throw new ChannelException("Failed to open a socket.", e7);
        }
    }
}
