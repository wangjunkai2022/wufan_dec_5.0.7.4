package io.netty.handler.ssl;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.CharsetUtil;
import io.netty.util.concurrent.Future;
import java.util.Locale;
/* loaded from: classes6.dex */
public abstract class AbstractSniHandler<T> extends SslClientHelloHandler<T> {
    private String hostname;

    private static String extractSniHostname(ByteBuf byteBuf) {
        int readerIndex = byteBuf.readerIndex();
        int writerIndex = byteBuf.writerIndex();
        int i4 = readerIndex + 34;
        if (writerIndex - i4 >= 6) {
            int unsignedByte = i4 + byteBuf.getUnsignedByte(i4) + 1;
            int unsignedShort = unsignedByte + byteBuf.getUnsignedShort(unsignedByte) + 2;
            int unsignedByte2 = unsignedShort + byteBuf.getUnsignedByte(unsignedShort) + 1;
            int unsignedShort2 = byteBuf.getUnsignedShort(unsignedByte2);
            int i5 = unsignedByte2 + 2;
            int i6 = unsignedShort2 + i5;
            if (i6 <= writerIndex) {
                while (i6 - i5 >= 4) {
                    int unsignedShort3 = byteBuf.getUnsignedShort(i5);
                    int i7 = i5 + 2;
                    int unsignedShort4 = byteBuf.getUnsignedShort(i7);
                    int i8 = i7 + 2;
                    if (i6 - i8 < unsignedShort4) {
                        return null;
                    }
                    if (unsignedShort3 == 0) {
                        int i9 = i8 + 2;
                        if (i6 - i9 < 3) {
                            return null;
                        }
                        short unsignedByte3 = byteBuf.getUnsignedByte(i9);
                        int i10 = i9 + 1;
                        if (unsignedByte3 == 0) {
                            int unsignedShort5 = byteBuf.getUnsignedShort(i10);
                            int i11 = i10 + 2;
                            if (i6 - i11 < unsignedShort5) {
                                return null;
                            }
                            return byteBuf.toString(i11, unsignedShort5, CharsetUtil.US_ASCII).toLowerCase(Locale.US);
                        }
                        return null;
                    }
                    i5 = i8 + unsignedShort4;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    private void fireSniCompletionEvent(ChannelHandlerContext channelHandlerContext, String str, Future<T> future) {
        Throwable cause = future.cause();
        if (cause == null) {
            channelHandlerContext.fireUserEventTriggered((Object) new SniCompletionEvent(str));
        } else {
            channelHandlerContext.fireUserEventTriggered((Object) new SniCompletionEvent(str, cause));
        }
    }

    @Override // io.netty.handler.ssl.SslClientHelloHandler
    protected Future<T> lookup(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws Exception {
        String extractSniHostname = byteBuf == null ? null : extractSniHostname(byteBuf);
        this.hostname = extractSniHostname;
        return lookup(channelHandlerContext, extractSniHostname);
    }

    protected abstract Future<T> lookup(ChannelHandlerContext channelHandlerContext, String str) throws Exception;

    @Override // io.netty.handler.ssl.SslClientHelloHandler
    protected void onLookupComplete(ChannelHandlerContext channelHandlerContext, Future<T> future) throws Exception {
        fireSniCompletionEvent(channelHandlerContext, this.hostname, future);
        onLookupComplete(channelHandlerContext, this.hostname, future);
    }

    protected abstract void onLookupComplete(ChannelHandlerContext channelHandlerContext, String str, Future<T> future) throws Exception;
}
