package d4;

import java.net.Socket;
import java.net.SocketException;
import java.util.Objects;
import org.jboss.netty.channel.ChannelException;
import org.jboss.netty.channel.v;
/* compiled from: DefaultSocketChannelConfig.java */
/* loaded from: classes7.dex */
public class c extends v implements e {

    /* renamed from: c  reason: collision with root package name */
    private final Socket f68821c;

    public c(Socket socket) {
        Objects.requireNonNull(socket, "socket");
        this.f68821c = socket;
    }

    @Override // org.jboss.netty.channel.v, org.jboss.netty.channel.f
    public boolean c(String str, Object obj) {
        if (super.c(str, obj)) {
            return true;
        }
        if ("receiveBufferSize".equals(str)) {
            setReceiveBufferSize(org.jboss.netty.util.internal.b.b(obj));
        } else if ("sendBufferSize".equals(str)) {
            setSendBufferSize(org.jboss.netty.util.internal.b.b(obj));
        } else if ("tcpNoDelay".equals(str)) {
            setTcpNoDelay(org.jboss.netty.util.internal.b.a(obj));
        } else if ("keepAlive".equals(str)) {
            setKeepAlive(org.jboss.netty.util.internal.b.a(obj));
        } else if ("reuseAddress".equals(str)) {
            setReuseAddress(org.jboss.netty.util.internal.b.a(obj));
        } else if ("soLinger".equals(str)) {
            setSoLinger(org.jboss.netty.util.internal.b.b(obj));
        } else if (!"trafficClass".equals(str)) {
            return false;
        } else {
            setTrafficClass(org.jboss.netty.util.internal.b.b(obj));
        }
        return true;
    }

    @Override // d4.e
    public int getReceiveBufferSize() {
        try {
            return this.f68821c.getReceiveBufferSize();
        } catch (SocketException e5) {
            throw new ChannelException(e5);
        }
    }

    @Override // d4.e
    public int getSendBufferSize() {
        try {
            return this.f68821c.getSendBufferSize();
        } catch (SocketException e5) {
            throw new ChannelException(e5);
        }
    }

    @Override // d4.e
    public int getSoLinger() {
        try {
            return this.f68821c.getSoLinger();
        } catch (SocketException e5) {
            throw new ChannelException(e5);
        }
    }

    @Override // d4.e
    public int getTrafficClass() {
        try {
            return this.f68821c.getTrafficClass();
        } catch (SocketException e5) {
            throw new ChannelException(e5);
        }
    }

    @Override // d4.e
    public boolean isKeepAlive() {
        try {
            return this.f68821c.getKeepAlive();
        } catch (SocketException e5) {
            throw new ChannelException(e5);
        }
    }

    @Override // d4.e
    public boolean isReuseAddress() {
        try {
            return this.f68821c.getReuseAddress();
        } catch (SocketException e5) {
            throw new ChannelException(e5);
        }
    }

    @Override // d4.e
    public boolean isTcpNoDelay() {
        try {
            return this.f68821c.getTcpNoDelay();
        } catch (SocketException e5) {
            throw new ChannelException(e5);
        }
    }

    @Override // d4.e
    public void setKeepAlive(boolean z4) {
        try {
            this.f68821c.setKeepAlive(z4);
        } catch (SocketException e5) {
            throw new ChannelException(e5);
        }
    }

    @Override // d4.e
    public void setPerformancePreferences(int i4, int i5, int i6) {
        this.f68821c.setPerformancePreferences(i4, i5, i6);
    }

    @Override // d4.e
    public void setReceiveBufferSize(int i4) {
        try {
            this.f68821c.setReceiveBufferSize(i4);
        } catch (SocketException e5) {
            throw new ChannelException(e5);
        }
    }

    @Override // d4.e
    public void setReuseAddress(boolean z4) {
        try {
            this.f68821c.setReuseAddress(z4);
        } catch (SocketException e5) {
            throw new ChannelException(e5);
        }
    }

    @Override // d4.e
    public void setSendBufferSize(int i4) {
        try {
            this.f68821c.setSendBufferSize(i4);
        } catch (SocketException e5) {
            throw new ChannelException(e5);
        }
    }

    @Override // d4.e
    public void setSoLinger(int i4) {
        try {
            if (i4 < 0) {
                this.f68821c.setSoLinger(false, 0);
            } else {
                this.f68821c.setSoLinger(true, i4);
            }
        } catch (SocketException e5) {
            throw new ChannelException(e5);
        }
    }

    @Override // d4.e
    public void setTcpNoDelay(boolean z4) {
        try {
            this.f68821c.setTcpNoDelay(z4);
        } catch (SocketException e5) {
            throw new ChannelException(e5);
        }
    }

    @Override // d4.e
    public void setTrafficClass(int i4) {
        try {
            this.f68821c.setTrafficClass(i4);
        } catch (SocketException e5) {
            throw new ChannelException(e5);
        }
    }
}
