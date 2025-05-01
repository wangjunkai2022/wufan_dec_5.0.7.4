package io.netty.handler.codec.http;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.util.AsciiString;
import io.netty.util.CharsetUtil;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class HttpHeadersEncoder {
    private static final int COLON_AND_SPACE_SHORT = 14880;

    private HttpHeadersEncoder() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void encoderHeader(CharSequence charSequence, CharSequence charSequence2, ByteBuf byteBuf) {
        int length = charSequence.length();
        int length2 = charSequence2.length();
        byteBuf.ensureWritable(length + length2 + 4);
        int writerIndex = byteBuf.writerIndex();
        writeAscii(byteBuf, writerIndex, charSequence);
        int i4 = writerIndex + length;
        ByteBufUtil.setShortBE(byteBuf, i4, COLON_AND_SPACE_SHORT);
        int i5 = i4 + 2;
        writeAscii(byteBuf, i5, charSequence2);
        int i6 = i5 + length2;
        ByteBufUtil.setShortBE(byteBuf, i6, 3338);
        byteBuf.writerIndex(i6 + 2);
    }

    private static void writeAscii(ByteBuf byteBuf, int i4, CharSequence charSequence) {
        if (charSequence instanceof AsciiString) {
            ByteBufUtil.copy((AsciiString) charSequence, 0, byteBuf, i4, charSequence.length());
        } else {
            byteBuf.setCharSequence(i4, charSequence, CharsetUtil.US_ASCII);
        }
    }
}
