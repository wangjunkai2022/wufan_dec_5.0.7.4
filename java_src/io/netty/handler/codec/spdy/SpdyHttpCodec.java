package io.netty.handler.codec.spdy;

import io.netty.channel.CombinedChannelDuplexHandler;
/* loaded from: classes6.dex */
public final class SpdyHttpCodec extends CombinedChannelDuplexHandler<SpdyHttpDecoder, SpdyHttpEncoder> {
    public SpdyHttpCodec(SpdyVersion spdyVersion, int i4) {
        super(new SpdyHttpDecoder(spdyVersion, i4), new SpdyHttpEncoder(spdyVersion));
    }

    public SpdyHttpCodec(SpdyVersion spdyVersion, int i4, boolean z4) {
        super(new SpdyHttpDecoder(spdyVersion, i4, z4), new SpdyHttpEncoder(spdyVersion));
    }
}
