package org.jboss.netty.channel.socket.nio;
/* compiled from: NioChannelConfig.java */
/* loaded from: classes7.dex */
public interface j extends org.jboss.netty.channel.f {
    int getWriteBufferHighWaterMark();

    int getWriteBufferLowWaterMark();

    int getWriteSpinCount();

    void setWriteBufferHighWaterMark(int i4);

    void setWriteBufferLowWaterMark(int i4);

    void setWriteSpinCount(int i4);
}
