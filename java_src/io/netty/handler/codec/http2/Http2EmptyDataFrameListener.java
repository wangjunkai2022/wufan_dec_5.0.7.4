package io.netty.handler.codec.http2;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.internal.ObjectUtil;
/* loaded from: classes6.dex */
final class Http2EmptyDataFrameListener extends Http2FrameListenerDecorator {
    private int emptyDataFrames;
    private final int maxConsecutiveEmptyFrames;
    private boolean violationDetected;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Http2EmptyDataFrameListener(Http2FrameListener http2FrameListener, int i4) {
        super(http2FrameListener);
        this.maxConsecutiveEmptyFrames = ObjectUtil.checkPositive(i4, "maxConsecutiveEmptyFrames");
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListenerDecorator, io.netty.handler.codec.http2.Http2FrameListener
    public int onDataRead(ChannelHandlerContext channelHandlerContext, int i4, ByteBuf byteBuf, int i5, boolean z4) throws Http2Exception {
        if (!z4 && !byteBuf.isReadable()) {
            int i6 = this.emptyDataFrames;
            this.emptyDataFrames = i6 + 1;
            int i7 = this.maxConsecutiveEmptyFrames;
            if (i6 == i7 && !this.violationDetected) {
                this.violationDetected = true;
                throw Http2Exception.connectionError(Http2Error.ENHANCE_YOUR_CALM, "Maximum number %d of empty data frames without end_of_stream flag received", Integer.valueOf(i7));
            }
        } else {
            this.emptyDataFrames = 0;
        }
        return super.onDataRead(channelHandlerContext, i4, byteBuf, i5, z4);
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListenerDecorator, io.netty.handler.codec.http2.Http2FrameListener
    public void onHeadersRead(ChannelHandlerContext channelHandlerContext, int i4, Http2Headers http2Headers, int i5, boolean z4) throws Http2Exception {
        this.emptyDataFrames = 0;
        super.onHeadersRead(channelHandlerContext, i4, http2Headers, i5, z4);
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListenerDecorator, io.netty.handler.codec.http2.Http2FrameListener
    public void onHeadersRead(ChannelHandlerContext channelHandlerContext, int i4, Http2Headers http2Headers, int i5, short s4, boolean z4, int i6, boolean z5) throws Http2Exception {
        this.emptyDataFrames = 0;
        super.onHeadersRead(channelHandlerContext, i4, http2Headers, i5, s4, z4, i6, z5);
    }
}
