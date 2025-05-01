package io.netty.handler.codec.stomp;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import io.netty.util.CharsetUtil;
import java.util.List;
import java.util.Map;
/* loaded from: classes6.dex */
public class StompSubframeEncoder extends MessageToMessageEncoder<StompSubframe> {
    private static ByteBuf encodeContent(StompContentSubframe stompContentSubframe, ChannelHandlerContext channelHandlerContext) {
        if (stompContentSubframe instanceof LastStompContentSubframe) {
            ByteBuf buffer = channelHandlerContext.alloc().buffer(stompContentSubframe.content().readableBytes() + 1);
            buffer.writeBytes(stompContentSubframe.content());
            buffer.writeByte(0);
            return buffer;
        }
        return stompContentSubframe.content().retain();
    }

    private static ByteBuf encodeFrame(StompHeadersSubframe stompHeadersSubframe, ChannelHandlerContext channelHandlerContext) {
        ByteBuf buffer = channelHandlerContext.alloc().buffer();
        buffer.writeCharSequence(stompHeadersSubframe.command().toString(), CharsetUtil.UTF_8);
        buffer.writeByte(10);
        for (Map.Entry<CharSequence, CharSequence> entry : stompHeadersSubframe.headers()) {
            ByteBufUtil.writeUtf8(buffer, entry.getKey());
            buffer.writeByte(58);
            ByteBufUtil.writeUtf8(buffer, entry.getValue());
            buffer.writeByte(10);
        }
        buffer.writeByte(10);
        return buffer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.handler.codec.MessageToMessageEncoder
    public /* bridge */ /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, StompSubframe stompSubframe, List list) throws Exception {
        encode2(channelHandlerContext, stompSubframe, (List<Object>) list);
    }

    /* renamed from: encode  reason: avoid collision after fix types in other method */
    protected void encode2(ChannelHandlerContext channelHandlerContext, StompSubframe stompSubframe, List<Object> list) throws Exception {
        if (stompSubframe instanceof StompFrame) {
            StompFrame stompFrame = (StompFrame) stompSubframe;
            list.add(encodeFrame(stompFrame, channelHandlerContext));
            list.add(encodeContent(stompFrame, channelHandlerContext));
        } else if (stompSubframe instanceof StompHeadersSubframe) {
            list.add(encodeFrame((StompHeadersSubframe) stompSubframe, channelHandlerContext));
        } else if (stompSubframe instanceof StompContentSubframe) {
            list.add(encodeContent((StompContentSubframe) stompSubframe, channelHandlerContext));
        }
    }
}
