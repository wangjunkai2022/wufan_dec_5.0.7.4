package io.netty.handler.codec.spdy;
/* loaded from: classes6.dex */
public interface SpdyWindowUpdateFrame extends SpdyFrame {
    int deltaWindowSize();

    SpdyWindowUpdateFrame setDeltaWindowSize(int i4);

    SpdyWindowUpdateFrame setStreamId(int i4);

    int streamId();
}
