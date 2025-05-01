package io.netty.handler.codec.xml;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;
import io.netty.handler.codec.TooLongFrameException;
/* loaded from: classes6.dex */
public class XmlFrameDecoder extends ByteToMessageDecoder {
    private final int maxFrameLength;

    public XmlFrameDecoder(int i4) {
        if (i4 >= 1) {
            this.maxFrameLength = i4;
            return;
        }
        throw new IllegalArgumentException("maxFrameLength must be a positive int");
    }

    private static ByteBuf extractFrame(ByteBuf byteBuf, int i4, int i5) {
        return byteBuf.copy(i4, i5);
    }

    private void fail(long j4) {
        if (j4 > 0) {
            throw new TooLongFrameException("frame length exceeds " + this.maxFrameLength + ": " + j4 + " - discarded");
        }
        throw new TooLongFrameException("frame length exceeds " + this.maxFrameLength + " - discarding");
    }

    private static boolean isCDATABlockStart(ByteBuf byteBuf, int i4) {
        return i4 < byteBuf.writerIndex() + (-8) && byteBuf.getByte(i4 + 2) == 91 && byteBuf.getByte(i4 + 3) == 67 && byteBuf.getByte(i4 + 4) == 68 && byteBuf.getByte(i4 + 5) == 65 && byteBuf.getByte(i4 + 6) == 84 && byteBuf.getByte(i4 + 7) == 65 && byteBuf.getByte(i4 + 8) == 91;
    }

    private static boolean isCommentBlockStart(ByteBuf byteBuf, int i4) {
        return i4 < byteBuf.writerIndex() + (-3) && byteBuf.getByte(i4 + 2) == 45 && byteBuf.getByte(i4 + 3) == 45;
    }

    private static boolean isValidStartCharForXmlElement(byte b5) {
        return (b5 >= 97 && b5 <= 122) || (b5 >= 65 && b5 <= 90) || b5 == 58 || b5 == 95;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x008d, code lost:
        if (r7 == 63) goto L46;
     */
    @Override // io.netty.handler.codec.ByteToMessageDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void decode(io.netty.channel.ChannelHandlerContext r20, io.netty.buffer.ByteBuf r21, java.util.List<java.lang.Object> r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.codec.xml.XmlFrameDecoder.decode(io.netty.channel.ChannelHandlerContext, io.netty.buffer.ByteBuf, java.util.List):void");
    }

    private static void fail(ChannelHandlerContext channelHandlerContext) {
        channelHandlerContext.fireExceptionCaught((Throwable) new CorruptedFrameException("frame contains content before the xml starts"));
    }
}
