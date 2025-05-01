package io.netty.handler.codec.spdy;

import io.netty.buffer.ByteBuf;
/* loaded from: classes6.dex */
public interface SpdyFrameDecoderDelegate {
    void readDataFrame(int i4, boolean z4, ByteBuf byteBuf);

    void readFrameError(String str);

    void readGoAwayFrame(int i4, int i5);

    void readHeaderBlock(ByteBuf byteBuf);

    void readHeaderBlockEnd();

    void readHeadersFrame(int i4, boolean z4);

    void readPingFrame(int i4);

    void readRstStreamFrame(int i4, int i5);

    void readSetting(int i4, int i5, boolean z4, boolean z5);

    void readSettingsEnd();

    void readSettingsFrame(boolean z4);

    void readSynReplyFrame(int i4, boolean z4);

    void readSynStreamFrame(int i4, int i5, byte b5, boolean z4, boolean z5);

    void readWindowUpdateFrame(int i4, int i5);
}
