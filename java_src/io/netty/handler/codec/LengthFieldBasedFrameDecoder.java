package io.netty.handler.codec;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.internal.ObjectUtil;
import java.nio.ByteOrder;
import java.util.List;
/* loaded from: classes6.dex */
public class LengthFieldBasedFrameDecoder extends ByteToMessageDecoder {
    private final ByteOrder byteOrder;
    private long bytesToDiscard;
    private boolean discardingTooLongFrame;
    private final boolean failFast;
    private final int initialBytesToStrip;
    private final int lengthAdjustment;
    private final int lengthFieldEndOffset;
    private final int lengthFieldLength;
    private final int lengthFieldOffset;
    private final int maxFrameLength;
    private long tooLongFrameLength;

    public LengthFieldBasedFrameDecoder(int i4, int i5, int i6) {
        this(i4, i5, i6, 0, 0);
    }

    private void discardingTooLongFrame(ByteBuf byteBuf) {
        long j4 = this.bytesToDiscard;
        int min = (int) Math.min(j4, byteBuf.readableBytes());
        byteBuf.skipBytes(min);
        this.bytesToDiscard = j4 - min;
        failIfNecessary(false);
    }

    private void exceededFrameLength(ByteBuf byteBuf, long j4) {
        long readableBytes = j4 - byteBuf.readableBytes();
        this.tooLongFrameLength = j4;
        if (readableBytes < 0) {
            byteBuf.skipBytes((int) j4);
        } else {
            this.discardingTooLongFrame = true;
            this.bytesToDiscard = readableBytes;
            byteBuf.skipBytes(byteBuf.readableBytes());
        }
        failIfNecessary(true);
    }

    private void fail(long j4) {
        if (j4 > 0) {
            throw new TooLongFrameException("Adjusted frame length exceeds " + this.maxFrameLength + ": " + j4 + " - discarded");
        }
        throw new TooLongFrameException("Adjusted frame length exceeds " + this.maxFrameLength + " - discarding");
    }

    private void failIfNecessary(boolean z4) {
        if (this.bytesToDiscard == 0) {
            long j4 = this.tooLongFrameLength;
            this.tooLongFrameLength = 0L;
            this.discardingTooLongFrame = false;
            if (!this.failFast || z4) {
                fail(j4);
            }
        } else if (this.failFast && z4) {
            fail(this.tooLongFrameLength);
        }
    }

    private static void failOnFrameLengthLessThanInitialBytesToStrip(ByteBuf byteBuf, long j4, int i4) {
        byteBuf.skipBytes((int) j4);
        throw new CorruptedFrameException("Adjusted frame length (" + j4 + ") is less than initialBytesToStrip: " + i4);
    }

    private static void failOnFrameLengthLessThanLengthFieldEndOffset(ByteBuf byteBuf, long j4, int i4) {
        byteBuf.skipBytes(i4);
        throw new CorruptedFrameException("Adjusted frame length (" + j4 + ") is less than lengthFieldEndOffset: " + i4);
    }

    private static void failOnNegativeLengthField(ByteBuf byteBuf, long j4, int i4) {
        byteBuf.skipBytes(i4);
        throw new CorruptedFrameException("negative pre-adjustment length field: " + j4);
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected final void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        Object decode = decode(channelHandlerContext, byteBuf);
        if (decode != null) {
            list.add(decode);
        }
    }

    protected ByteBuf extractFrame(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, int i4, int i5) {
        return byteBuf.retainedSlice(i4, i5);
    }

    protected long getUnadjustedFrameLength(ByteBuf byteBuf, int i4, int i5, ByteOrder byteOrder) {
        int unsignedByte;
        ByteBuf order = byteBuf.order(byteOrder);
        if (i5 == 1) {
            unsignedByte = order.getUnsignedByte(i4);
        } else if (i5 == 2) {
            unsignedByte = order.getUnsignedShort(i4);
        } else if (i5 != 3) {
            if (i5 != 4) {
                if (i5 == 8) {
                    return order.getLong(i4);
                }
                throw new DecoderException("unsupported lengthFieldLength: " + this.lengthFieldLength + " (expected: 1, 2, 3, 4, or 8)");
            }
            return order.getUnsignedInt(i4);
        } else {
            unsignedByte = order.getUnsignedMedium(i4);
        }
        return unsignedByte;
    }

    public LengthFieldBasedFrameDecoder(int i4, int i5, int i6, int i7, int i8) {
        this(i4, i5, i6, i7, i8, true);
    }

    public LengthFieldBasedFrameDecoder(int i4, int i5, int i6, int i7, int i8, boolean z4) {
        this(ByteOrder.BIG_ENDIAN, i4, i5, i6, i7, i8, z4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws Exception {
        if (this.discardingTooLongFrame) {
            discardingTooLongFrame(byteBuf);
        }
        if (byteBuf.readableBytes() < this.lengthFieldEndOffset) {
            return null;
        }
        long unadjustedFrameLength = getUnadjustedFrameLength(byteBuf, byteBuf.readerIndex() + this.lengthFieldOffset, this.lengthFieldLength, this.byteOrder);
        if (unadjustedFrameLength < 0) {
            failOnNegativeLengthField(byteBuf, unadjustedFrameLength, this.lengthFieldEndOffset);
        }
        int i4 = this.lengthAdjustment;
        int i5 = this.lengthFieldEndOffset;
        long j4 = unadjustedFrameLength + i4 + i5;
        if (j4 < i5) {
            failOnFrameLengthLessThanLengthFieldEndOffset(byteBuf, j4, i5);
        }
        if (j4 > this.maxFrameLength) {
            exceededFrameLength(byteBuf, j4);
            return null;
        }
        int i6 = (int) j4;
        if (byteBuf.readableBytes() < i6) {
            return null;
        }
        int i7 = this.initialBytesToStrip;
        if (i7 > i6) {
            failOnFrameLengthLessThanInitialBytesToStrip(byteBuf, j4, i7);
        }
        byteBuf.skipBytes(this.initialBytesToStrip);
        int readerIndex = byteBuf.readerIndex();
        int i8 = i6 - this.initialBytesToStrip;
        ByteBuf extractFrame = extractFrame(channelHandlerContext, byteBuf, readerIndex, i8);
        byteBuf.readerIndex(readerIndex + i8);
        return extractFrame;
    }

    public LengthFieldBasedFrameDecoder(ByteOrder byteOrder, int i4, int i5, int i6, int i7, int i8, boolean z4) {
        this.byteOrder = (ByteOrder) ObjectUtil.checkNotNull(byteOrder, "byteOrder");
        ObjectUtil.checkPositive(i4, "maxFrameLength");
        ObjectUtil.checkPositiveOrZero(i5, "lengthFieldOffset");
        ObjectUtil.checkPositiveOrZero(i8, "initialBytesToStrip");
        if (i5 <= i4 - i6) {
            this.maxFrameLength = i4;
            this.lengthFieldOffset = i5;
            this.lengthFieldLength = i6;
            this.lengthAdjustment = i7;
            this.lengthFieldEndOffset = i5 + i6;
            this.initialBytesToStrip = i8;
            this.failFast = z4;
            return;
        }
        throw new IllegalArgumentException("maxFrameLength (" + i4 + ") must be equal to or greater than lengthFieldOffset (" + i5 + ") + lengthFieldLength (" + i6 + ").");
    }
}
