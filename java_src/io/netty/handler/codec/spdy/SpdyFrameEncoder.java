package io.netty.handler.codec.spdy;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.util.internal.ObjectUtil;
import java.nio.ByteOrder;
import java.util.Set;
/* loaded from: classes6.dex */
public class SpdyFrameEncoder {
    private final int version;

    public SpdyFrameEncoder(SpdyVersion spdyVersion) {
        this.version = ((SpdyVersion) ObjectUtil.checkNotNull(spdyVersion, "spdyVersion")).getVersion();
    }

    private void writeControlFrameHeader(ByteBuf byteBuf, int i4, byte b5, int i5) {
        byteBuf.writeShort(this.version | 32768);
        byteBuf.writeShort(i4);
        byteBuf.writeByte(b5);
        byteBuf.writeMedium(i5);
    }

    public ByteBuf encodeDataFrame(ByteBufAllocator byteBufAllocator, int i4, boolean z4, ByteBuf byteBuf) {
        int readableBytes = byteBuf.readableBytes();
        ByteBuf order = byteBufAllocator.ioBuffer(readableBytes + 8).order(ByteOrder.BIG_ENDIAN);
        order.writeInt(i4 & Integer.MAX_VALUE);
        order.writeByte(z4 ? 1 : 0);
        order.writeMedium(readableBytes);
        order.writeBytes(byteBuf, byteBuf.readerIndex(), readableBytes);
        return order;
    }

    public ByteBuf encodeGoAwayFrame(ByteBufAllocator byteBufAllocator, int i4, int i5) {
        ByteBuf order = byteBufAllocator.ioBuffer(16).order(ByteOrder.BIG_ENDIAN);
        writeControlFrameHeader(order, 7, (byte) 0, 8);
        order.writeInt(i4);
        order.writeInt(i5);
        return order;
    }

    public ByteBuf encodeHeadersFrame(ByteBufAllocator byteBufAllocator, int i4, boolean z4, ByteBuf byteBuf) {
        int readableBytes = byteBuf.readableBytes();
        int i5 = readableBytes + 4;
        ByteBuf order = byteBufAllocator.ioBuffer(i5 + 8).order(ByteOrder.BIG_ENDIAN);
        writeControlFrameHeader(order, 8, z4 ? (byte) 1 : (byte) 0, i5);
        order.writeInt(i4);
        order.writeBytes(byteBuf, byteBuf.readerIndex(), readableBytes);
        return order;
    }

    public ByteBuf encodePingFrame(ByteBufAllocator byteBufAllocator, int i4) {
        ByteBuf order = byteBufAllocator.ioBuffer(12).order(ByteOrder.BIG_ENDIAN);
        writeControlFrameHeader(order, 6, (byte) 0, 4);
        order.writeInt(i4);
        return order;
    }

    public ByteBuf encodeRstStreamFrame(ByteBufAllocator byteBufAllocator, int i4, int i5) {
        ByteBuf order = byteBufAllocator.ioBuffer(16).order(ByteOrder.BIG_ENDIAN);
        writeControlFrameHeader(order, 3, (byte) 0, 8);
        order.writeInt(i4);
        order.writeInt(i5);
        return order;
    }

    public ByteBuf encodeSettingsFrame(ByteBufAllocator byteBufAllocator, SpdySettingsFrame spdySettingsFrame) {
        Set<Integer> ids = spdySettingsFrame.ids();
        int size = ids.size();
        boolean clearPreviouslyPersistedSettings = spdySettingsFrame.clearPreviouslyPersistedSettings();
        int i4 = (size * 8) + 4;
        ByteBuf order = byteBufAllocator.ioBuffer(i4 + 8).order(ByteOrder.BIG_ENDIAN);
        writeControlFrameHeader(order, 4, clearPreviouslyPersistedSettings ? (byte) 1 : (byte) 0, i4);
        order.writeInt(size);
        for (Integer num : ids) {
            byte b5 = spdySettingsFrame.isPersistValue(num.intValue()) ? (byte) 1 : (byte) 0;
            if (spdySettingsFrame.isPersisted(num.intValue())) {
                b5 = (byte) (b5 | 2);
            }
            order.writeByte(b5);
            order.writeMedium(num.intValue());
            order.writeInt(spdySettingsFrame.getValue(num.intValue()));
        }
        return order;
    }

    public ByteBuf encodeSynReplyFrame(ByteBufAllocator byteBufAllocator, int i4, boolean z4, ByteBuf byteBuf) {
        int readableBytes = byteBuf.readableBytes();
        int i5 = readableBytes + 4;
        ByteBuf order = byteBufAllocator.ioBuffer(i5 + 8).order(ByteOrder.BIG_ENDIAN);
        writeControlFrameHeader(order, 2, z4 ? (byte) 1 : (byte) 0, i5);
        order.writeInt(i4);
        order.writeBytes(byteBuf, byteBuf.readerIndex(), readableBytes);
        return order;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ByteBuf encodeSynStreamFrame(ByteBufAllocator byteBufAllocator, int i4, int i5, byte b5, boolean z4, boolean z5, ByteBuf byteBuf) {
        int readableBytes = byteBuf.readableBytes();
        byte b6 = z4;
        if (z5) {
            b6 = (byte) (z4 | 2);
        }
        int i6 = readableBytes + 10;
        ByteBuf order = byteBufAllocator.ioBuffer(i6 + 8).order(ByteOrder.BIG_ENDIAN);
        writeControlFrameHeader(order, 1, b6, i6);
        order.writeInt(i4);
        order.writeInt(i5);
        order.writeShort((b5 & 255) << 13);
        order.writeBytes(byteBuf, byteBuf.readerIndex(), readableBytes);
        return order;
    }

    public ByteBuf encodeWindowUpdateFrame(ByteBufAllocator byteBufAllocator, int i4, int i5) {
        ByteBuf order = byteBufAllocator.ioBuffer(16).order(ByteOrder.BIG_ENDIAN);
        writeControlFrameHeader(order, 9, (byte) 0, 8);
        order.writeInt(i4);
        order.writeInt(i5);
        return order;
    }
}
