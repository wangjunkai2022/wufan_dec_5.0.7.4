package io.netty.handler.codec.compression;

import io.netty.buffer.ByteBuf;
/* loaded from: classes6.dex */
class Bzip2BitReader {
    private static final int MAX_COUNT_OF_READABLE_BYTES = 268435455;
    private long bitBuffer;
    private int bitCount;

    /* renamed from: in  reason: collision with root package name */
    private ByteBuf f69189in;

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasReadableBits(int i4) {
        if (i4 >= 0) {
            return this.bitCount >= i4 || ((this.f69189in.readableBytes() << 3) & Integer.MAX_VALUE) >= i4 - this.bitCount;
        }
        throw new IllegalArgumentException("count: " + i4 + " (expected value greater than 0)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasReadableBytes(int i4) {
        if (i4 >= 0 && i4 <= MAX_COUNT_OF_READABLE_BYTES) {
            return hasReadableBits(i4 << 3);
        }
        throw new IllegalArgumentException("count: " + i4 + " (expected: 0-" + MAX_COUNT_OF_READABLE_BYTES + ')');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isReadable() {
        return this.bitCount > 0 || this.f69189in.isReadable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int readBits(int i4) {
        long readUnsignedByte;
        int i5;
        if (i4 >= 0 && i4 <= 32) {
            int i6 = this.bitCount;
            long j4 = this.bitBuffer;
            if (i6 < i4) {
                int readableBytes = this.f69189in.readableBytes();
                if (readableBytes == 1) {
                    readUnsignedByte = this.f69189in.readUnsignedByte();
                    i5 = 8;
                } else if (readableBytes == 2) {
                    readUnsignedByte = this.f69189in.readUnsignedShort();
                    i5 = 16;
                } else if (readableBytes != 3) {
                    readUnsignedByte = this.f69189in.readUnsignedInt();
                    i5 = 32;
                } else {
                    readUnsignedByte = this.f69189in.readUnsignedMedium();
                    i5 = 24;
                }
                j4 = (j4 << i5) | readUnsignedByte;
                i6 += i5;
                this.bitBuffer = j4;
            }
            int i7 = i6 - i4;
            this.bitCount = i7;
            return (int) ((j4 >>> i7) & (i4 != 32 ? (1 << i4) - 1 : 4294967295L));
        }
        throw new IllegalArgumentException("count: " + i4 + " (expected: 0-32 )");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean readBoolean() {
        return readBits(1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int readInt() {
        return readBits(32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void refill() {
        this.bitBuffer = (this.bitBuffer << 8) | this.f69189in.readUnsignedByte();
        this.bitCount += 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setByteBuf(ByteBuf byteBuf) {
        this.f69189in = byteBuf;
    }
}
