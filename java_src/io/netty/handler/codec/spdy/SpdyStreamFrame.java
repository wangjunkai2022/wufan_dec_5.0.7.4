package io.netty.handler.codec.spdy;
/* loaded from: classes6.dex */
public interface SpdyStreamFrame extends SpdyFrame {
    boolean isLast();

    SpdyStreamFrame setLast(boolean z4);

    SpdyStreamFrame setStreamId(int i4);

    int streamId();
}
