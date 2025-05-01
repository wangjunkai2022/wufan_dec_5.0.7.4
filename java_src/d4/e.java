package d4;
/* compiled from: SocketChannelConfig.java */
/* loaded from: classes7.dex */
public interface e extends org.jboss.netty.channel.f {
    int getReceiveBufferSize();

    int getSendBufferSize();

    int getSoLinger();

    int getTrafficClass();

    boolean isKeepAlive();

    boolean isReuseAddress();

    boolean isTcpNoDelay();

    void setKeepAlive(boolean z4);

    void setPerformancePreferences(int i4, int i5, int i6);

    void setReceiveBufferSize(int i4);

    void setReuseAddress(boolean z4);

    void setSendBufferSize(int i4);

    void setSoLinger(int i4);

    void setTcpNoDelay(boolean z4);

    void setTrafficClass(int i4);
}
