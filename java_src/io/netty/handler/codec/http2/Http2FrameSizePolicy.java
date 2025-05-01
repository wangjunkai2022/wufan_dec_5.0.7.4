package io.netty.handler.codec.http2;
/* loaded from: classes6.dex */
public interface Http2FrameSizePolicy {
    int maxFrameSize();

    void maxFrameSize(int i4) throws Http2Exception;
}
