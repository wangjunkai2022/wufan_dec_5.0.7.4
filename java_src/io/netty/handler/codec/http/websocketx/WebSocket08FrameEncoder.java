package io.netty.handler.codec.http.websocketx;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import io.netty.handler.codec.TooLongFrameException;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
/* loaded from: classes6.dex */
public class WebSocket08FrameEncoder extends MessageToMessageEncoder<WebSocketFrame> implements WebSocketFrameEncoder {
    private static final int GATHERING_WRITE_THRESHOLD = 1024;
    private static final byte OPCODE_BINARY = 2;
    private static final byte OPCODE_CLOSE = 8;
    private static final byte OPCODE_CONT = 0;
    private static final byte OPCODE_PING = 9;
    private static final byte OPCODE_PONG = 10;
    private static final byte OPCODE_TEXT = 1;
    private static final InternalLogger logger = InternalLoggerFactory.getInstance(WebSocket08FrameEncoder.class);
    private final boolean maskPayload;

    public WebSocket08FrameEncoder(boolean z4) {
        this.maskPayload = z4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.handler.codec.MessageToMessageEncoder
    public /* bridge */ /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, WebSocketFrame webSocketFrame, List list) throws Exception {
        encode2(channelHandlerContext, webSocketFrame, (List<Object>) list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [io.netty.util.ReferenceCounted] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* renamed from: encode  reason: avoid collision after fix types in other method */
    protected void encode2(ChannelHandlerContext channelHandlerContext, WebSocketFrame webSocketFrame, List<Object> list) throws Exception {
        byte b5;
        ?? r4;
        ByteBuf buffer;
        ByteBuf content = webSocketFrame.content();
        int i4 = 0;
        if (webSocketFrame instanceof TextWebSocketFrame) {
            b5 = 1;
        } else if (webSocketFrame instanceof PingWebSocketFrame) {
            b5 = 9;
        } else if (webSocketFrame instanceof PongWebSocketFrame) {
            b5 = 10;
        } else if (webSocketFrame instanceof CloseWebSocketFrame) {
            b5 = 8;
        } else if (webSocketFrame instanceof BinaryWebSocketFrame) {
            b5 = 2;
        } else if (!(webSocketFrame instanceof ContinuationWebSocketFrame)) {
            throw new UnsupportedOperationException("Cannot encode frame of type: " + webSocketFrame.getClass().getName());
        } else {
            b5 = 0;
        }
        int readableBytes = content.readableBytes();
        InternalLogger internalLogger = logger;
        if (internalLogger.isTraceEnabled()) {
            internalLogger.trace("Encoding WebSocket Frame opCode={} length={}", Byte.valueOf(b5), Integer.valueOf(readableBytes));
        }
        int rsv = ((webSocketFrame.rsv() % 8) << 4) | (webSocketFrame.isFinalFragment() ? 128 : 0) | (b5 % 128);
        if (b5 == 9 && readableBytes > 125) {
            throw new TooLongFrameException("invalid payload for PING (payload length must be <= 125, was " + readableBytes);
        }
        try {
            boolean z4 = this.maskPayload;
            int i5 = z4 ? 4 : 0;
            r4 = 1024;
            try {
                if (readableBytes <= 125) {
                    int i6 = i5 + 2;
                    if (z4 || readableBytes <= 1024) {
                        i6 += readableBytes;
                    }
                    buffer = channelHandlerContext.alloc().buffer(i6);
                    buffer.writeByte(rsv);
                    buffer.writeByte((byte) (this.maskPayload ? ((byte) readableBytes) | 128 : (byte) readableBytes));
                } else if (readableBytes <= 65535) {
                    int i7 = i5 + 4;
                    if (z4 || readableBytes <= 1024) {
                        i7 += readableBytes;
                    }
                    buffer = channelHandlerContext.alloc().buffer(i7);
                    buffer.writeByte(rsv);
                    buffer.writeByte(this.maskPayload ? 254 : 126);
                    buffer.writeByte((readableBytes >>> 8) & 255);
                    buffer.writeByte(readableBytes & 255);
                } else {
                    int i8 = i5 + 10;
                    if (z4 || readableBytes <= 1024) {
                        i8 += readableBytes;
                    }
                    buffer = channelHandlerContext.alloc().buffer(i8);
                    buffer.writeByte(rsv);
                    buffer.writeByte(this.maskPayload ? 255 : 127);
                    buffer.writeLong(readableBytes);
                }
                if (this.maskPayload) {
                    byte[] array = ByteBuffer.allocate(4).putInt((int) (Math.random() * 2.147483647E9d)).array();
                    buffer.writeBytes(array);
                    ByteOrder order = content.order();
                    ByteOrder order2 = buffer.order();
                    int readerIndex = content.readerIndex();
                    int writerIndex = content.writerIndex();
                    if (order == order2) {
                        int i9 = ((array[0] & 255) << 24) | ((array[1] & 255) << 16) | ((array[2] & 255) << 8) | (array[3] & 255);
                        if (order == ByteOrder.LITTLE_ENDIAN) {
                            i9 = Integer.reverseBytes(i9);
                        }
                        while (readerIndex + 3 < writerIndex) {
                            buffer.writeInt(content.getInt(readerIndex) ^ i9);
                            readerIndex += 4;
                        }
                    }
                    while (readerIndex < writerIndex) {
                        buffer.writeByte(content.getByte(readerIndex) ^ array[i4 % 4]);
                        readerIndex++;
                        i4++;
                    }
                    list.add(buffer);
                } else if (buffer.writableBytes() >= content.readableBytes()) {
                    buffer.writeBytes(content);
                    list.add(buffer);
                } else {
                    list.add(buffer);
                    list.add(content.retain());
                }
            } catch (Throwable th) {
                th = th;
                if (r4 != 0) {
                    r4.release();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r4 = 0;
        }
    }
}
