package io.netty.handler.codec.compression;

import com.android.dx.io.Opcodes;
import io.netty.buffer.ByteBuf;
/* loaded from: classes6.dex */
public final class Snappy {
    private static final int COPY_1_BYTE_OFFSET = 1;
    private static final int COPY_2_BYTE_OFFSET = 2;
    private static final int COPY_4_BYTE_OFFSET = 3;
    private static final int LITERAL = 0;
    private static final int MAX_HT_SIZE = 16384;
    private static final int MIN_COMPRESSIBLE_BYTES = 15;
    private static final int NOT_ENOUGH_INPUT = -1;
    private static final int PREAMBLE_NOT_FULL = -1;
    private State state = State.READY;
    private byte tag;
    private int written;

    /* renamed from: io.netty.handler.codec.compression.Snappy$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$compression$Snappy$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$io$netty$handler$codec$compression$Snappy$State = iArr;
            try {
                iArr[State.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$compression$Snappy$State[State.READING_PREAMBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$compression$Snappy$State[State.READING_TAG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$compression$Snappy$State[State.READING_LITERAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$compression$Snappy$State[State.READING_COPY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes6.dex */
    private enum State {
        READY,
        READING_PREAMBLE,
        READING_TAG,
        READING_LITERAL,
        READING_COPY
    }

    private static int bitsToEncode(int i4) {
        int highestOneBit = Integer.highestOneBit(i4);
        int i5 = 0;
        while (true) {
            highestOneBit >>= 1;
            if (highestOneBit == 0) {
                return i5;
            }
            i5++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int calculateChecksum(ByteBuf byteBuf) {
        return calculateChecksum(byteBuf, byteBuf.readerIndex(), byteBuf.readableBytes());
    }

    private static int decodeCopyWith1ByteOffset(byte b5, ByteBuf byteBuf, ByteBuf byteBuf2, int i4) {
        if (byteBuf.isReadable()) {
            int writerIndex = byteBuf2.writerIndex();
            int i5 = ((b5 & 28) >> 2) + 4;
            int readUnsignedByte = (((b5 & Opcodes.SHL_INT_LIT8) << 8) >> 5) | byteBuf.readUnsignedByte();
            validateOffset(readUnsignedByte, i4);
            byteBuf2.markReaderIndex();
            if (readUnsignedByte < i5) {
                for (int i6 = i5 / readUnsignedByte; i6 > 0; i6--) {
                    byteBuf2.readerIndex(writerIndex - readUnsignedByte);
                    byteBuf2.readBytes(byteBuf2, readUnsignedByte);
                }
                int i7 = i5 % readUnsignedByte;
                if (i7 != 0) {
                    byteBuf2.readerIndex(writerIndex - readUnsignedByte);
                    byteBuf2.readBytes(byteBuf2, i7);
                }
            } else {
                byteBuf2.readerIndex(writerIndex - readUnsignedByte);
                byteBuf2.readBytes(byteBuf2, i5);
            }
            byteBuf2.resetReaderIndex();
            return i5;
        }
        return -1;
    }

    private static int decodeCopyWith2ByteOffset(byte b5, ByteBuf byteBuf, ByteBuf byteBuf2, int i4) {
        if (byteBuf.readableBytes() < 2) {
            return -1;
        }
        int writerIndex = byteBuf2.writerIndex();
        int i5 = ((b5 >> 2) & 63) + 1;
        int readUnsignedShortLE = byteBuf.readUnsignedShortLE();
        validateOffset(readUnsignedShortLE, i4);
        byteBuf2.markReaderIndex();
        if (readUnsignedShortLE < i5) {
            for (int i6 = i5 / readUnsignedShortLE; i6 > 0; i6--) {
                byteBuf2.readerIndex(writerIndex - readUnsignedShortLE);
                byteBuf2.readBytes(byteBuf2, readUnsignedShortLE);
            }
            int i7 = i5 % readUnsignedShortLE;
            if (i7 != 0) {
                byteBuf2.readerIndex(writerIndex - readUnsignedShortLE);
                byteBuf2.readBytes(byteBuf2, i7);
            }
        } else {
            byteBuf2.readerIndex(writerIndex - readUnsignedShortLE);
            byteBuf2.readBytes(byteBuf2, i5);
        }
        byteBuf2.resetReaderIndex();
        return i5;
    }

    private static int decodeCopyWith4ByteOffset(byte b5, ByteBuf byteBuf, ByteBuf byteBuf2, int i4) {
        if (byteBuf.readableBytes() < 4) {
            return -1;
        }
        int writerIndex = byteBuf2.writerIndex();
        int i5 = ((b5 >> 2) & 63) + 1;
        int readIntLE = byteBuf.readIntLE();
        validateOffset(readIntLE, i4);
        byteBuf2.markReaderIndex();
        if (readIntLE < i5) {
            for (int i6 = i5 / readIntLE; i6 > 0; i6--) {
                byteBuf2.readerIndex(writerIndex - readIntLE);
                byteBuf2.readBytes(byteBuf2, readIntLE);
            }
            int i7 = i5 % readIntLE;
            if (i7 != 0) {
                byteBuf2.readerIndex(writerIndex - readIntLE);
                byteBuf2.readBytes(byteBuf2, i7);
            }
        } else {
            byteBuf2.readerIndex(writerIndex - readIntLE);
            byteBuf2.readBytes(byteBuf2, i5);
        }
        byteBuf2.resetReaderIndex();
        return i5;
    }

    static int decodeLiteral(byte b5, ByteBuf byteBuf, ByteBuf byteBuf2) {
        byteBuf.markReaderIndex();
        int i4 = (b5 >> 2) & 63;
        switch (i4) {
            case 60:
                if (byteBuf.isReadable()) {
                    i4 = byteBuf.readUnsignedByte();
                    break;
                } else {
                    return -1;
                }
            case 61:
                if (byteBuf.readableBytes() >= 2) {
                    i4 = byteBuf.readUnsignedShortLE();
                    break;
                } else {
                    return -1;
                }
            case 62:
                if (byteBuf.readableBytes() >= 3) {
                    i4 = byteBuf.readUnsignedMediumLE();
                    break;
                } else {
                    return -1;
                }
            case 63:
                if (byteBuf.readableBytes() >= 4) {
                    i4 = byteBuf.readIntLE();
                    break;
                } else {
                    return -1;
                }
        }
        int i5 = i4 + 1;
        if (byteBuf.readableBytes() < i5) {
            byteBuf.resetReaderIndex();
            return -1;
        }
        byteBuf2.writeBytes(byteBuf, i5);
        return i5;
    }

    private static void encodeCopy(ByteBuf byteBuf, int i4, int i5) {
        while (i5 >= 68) {
            encodeCopyWithOffset(byteBuf, i4, 64);
            i5 -= 64;
        }
        if (i5 > 64) {
            encodeCopyWithOffset(byteBuf, i4, 60);
            i5 -= 60;
        }
        encodeCopyWithOffset(byteBuf, i4, i5);
    }

    private static void encodeCopyWithOffset(ByteBuf byteBuf, int i4, int i5) {
        if (i5 < 12 && i4 < 2048) {
            byteBuf.writeByte(((i5 - 4) << 2) | 1 | ((i4 >> 8) << 5));
            byteBuf.writeByte(i4 & 255);
            return;
        }
        byteBuf.writeByte(((i5 - 1) << 2) | 2);
        byteBuf.writeByte(i4 & 255);
        byteBuf.writeByte((i4 >> 8) & 255);
    }

    static void encodeLiteral(ByteBuf byteBuf, ByteBuf byteBuf2, int i4) {
        if (i4 < 61) {
            byteBuf2.writeByte((i4 - 1) << 2);
        } else {
            int i5 = i4 - 1;
            int bitsToEncode = (bitsToEncode(i5) / 8) + 1;
            byteBuf2.writeByte((bitsToEncode + 59) << 2);
            for (int i6 = 0; i6 < bitsToEncode; i6++) {
                byteBuf2.writeByte((i5 >> (i6 * 8)) & 255);
            }
        }
        byteBuf2.writeBytes(byteBuf, i4);
    }

    private static int findMatchingLength(ByteBuf byteBuf, int i4, int i5, int i6) {
        int i7 = 0;
        while (i5 <= i6 - 4 && byteBuf.getInt(i5) == byteBuf.getInt(i4 + i7)) {
            i5 += 4;
            i7 += 4;
        }
        while (i5 < i6 && byteBuf.getByte(i4 + i7) == byteBuf.getByte(i5)) {
            i5++;
            i7++;
        }
        return i7;
    }

    private static short[] getHashTable(int i4) {
        int i5 = 256;
        while (i5 < 16384 && i5 < i4) {
            i5 <<= 1;
        }
        return new short[i5];
    }

    private static int hash(ByteBuf byteBuf, int i4, int i5) {
        return (byteBuf.getInt(i4) * 506832829) >>> i5;
    }

    static int maskChecksum(long j4) {
        return (int) (((j4 << 17) | (j4 >> 15)) - 1568478504);
    }

    private static int readPreamble(ByteBuf byteBuf) {
        int i4 = 0;
        int i5 = 0;
        while (byteBuf.isReadable()) {
            short readUnsignedByte = byteBuf.readUnsignedByte();
            int i6 = i5 + 1;
            i4 |= (readUnsignedByte & 127) << (i5 * 7);
            if ((readUnsignedByte & 128) == 0) {
                return i4;
            }
            if (i6 >= 4) {
                throw new DecompressionException("Preamble is greater than 4 bytes");
            }
            i5 = i6;
        }
        return 0;
    }

    static void validateChecksum(int i4, ByteBuf byteBuf) {
        validateChecksum(i4, byteBuf, byteBuf.readerIndex(), byteBuf.readableBytes());
    }

    private static void validateOffset(int i4, int i5) {
        if (i4 == 0) {
            throw new DecompressionException("Offset is less than minimum permissible value");
        }
        if (i4 < 0) {
            throw new DecompressionException("Offset is greater than maximum value supported by this implementation");
        }
        if (i4 > i5) {
            throw new DecompressionException("Offset exceeds size of chunk");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0097 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void decode(io.netty.buffer.ByteBuf r7, io.netty.buffer.ByteBuf r8) {
        /*
            r6 = this;
        L0:
            boolean r0 = r7.isReadable()
            if (r0 == 0) goto Lb5
            int[] r0 = io.netty.handler.codec.compression.Snappy.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$Snappy$State
            io.netty.handler.codec.compression.Snappy$State r1 = r6.state
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 1
            r3 = -1
            r4 = 3
            if (r0 == r2) goto L78
            if (r0 == r1) goto L7c
            if (r0 == r4) goto L91
            r5 = 4
            if (r0 == r5) goto L65
            r5 = 5
            if (r0 == r5) goto L21
            goto L0
        L21:
            byte r0 = r6.tag
            r5 = r0 & 3
            if (r5 == r2) goto L52
            if (r5 == r1) goto L3f
            if (r5 == r4) goto L2c
            goto L0
        L2c:
            int r1 = r6.written
            int r0 = decodeCopyWith4ByteOffset(r0, r7, r8, r1)
            if (r0 == r3) goto L3e
            io.netty.handler.codec.compression.Snappy$State r1 = io.netty.handler.codec.compression.Snappy.State.READING_TAG
            r6.state = r1
            int r1 = r6.written
            int r1 = r1 + r0
            r6.written = r1
            goto L0
        L3e:
            return
        L3f:
            int r1 = r6.written
            int r0 = decodeCopyWith2ByteOffset(r0, r7, r8, r1)
            if (r0 == r3) goto L51
            io.netty.handler.codec.compression.Snappy$State r1 = io.netty.handler.codec.compression.Snappy.State.READING_TAG
            r6.state = r1
            int r1 = r6.written
            int r1 = r1 + r0
            r6.written = r1
            goto L0
        L51:
            return
        L52:
            int r1 = r6.written
            int r0 = decodeCopyWith1ByteOffset(r0, r7, r8, r1)
            if (r0 == r3) goto L64
            io.netty.handler.codec.compression.Snappy$State r1 = io.netty.handler.codec.compression.Snappy.State.READING_TAG
            r6.state = r1
            int r1 = r6.written
            int r1 = r1 + r0
            r6.written = r1
            goto L0
        L64:
            return
        L65:
            byte r0 = r6.tag
            int r0 = decodeLiteral(r0, r7, r8)
            if (r0 == r3) goto L77
            io.netty.handler.codec.compression.Snappy$State r1 = io.netty.handler.codec.compression.Snappy.State.READING_TAG
            r6.state = r1
            int r1 = r6.written
            int r1 = r1 + r0
            r6.written = r1
            goto L0
        L77:
            return
        L78:
            io.netty.handler.codec.compression.Snappy$State r0 = io.netty.handler.codec.compression.Snappy.State.READING_PREAMBLE
            r6.state = r0
        L7c:
            int r0 = readPreamble(r7)
            if (r0 != r3) goto L83
            return
        L83:
            if (r0 != 0) goto L8a
            io.netty.handler.codec.compression.Snappy$State r7 = io.netty.handler.codec.compression.Snappy.State.READY
            r6.state = r7
            return
        L8a:
            r8.ensureWritable(r0)
            io.netty.handler.codec.compression.Snappy$State r0 = io.netty.handler.codec.compression.Snappy.State.READING_TAG
            r6.state = r0
        L91:
            boolean r0 = r7.isReadable()
            if (r0 != 0) goto L98
            return
        L98:
            byte r0 = r7.readByte()
            r6.tag = r0
            r0 = r0 & r4
            if (r0 == 0) goto Laf
            if (r0 == r2) goto La9
            if (r0 == r1) goto La9
            if (r0 == r4) goto La9
            goto L0
        La9:
            io.netty.handler.codec.compression.Snappy$State r0 = io.netty.handler.codec.compression.Snappy.State.READING_COPY
            r6.state = r0
            goto L0
        Laf:
            io.netty.handler.codec.compression.Snappy$State r0 = io.netty.handler.codec.compression.Snappy.State.READING_LITERAL
            r6.state = r0
            goto L0
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.codec.compression.Snappy.decode(io.netty.buffer.ByteBuf, io.netty.buffer.ByteBuf):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
        encodeLiteral(r13, r14, r3 - r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        r4 = findMatchingLength(r13, r10 + 4, r3 + 4, r15) + 4;
        r5 = r3 + r4;
        encodeCopy(r14, r3 - r10, r4);
        r13.readerIndex(r13.readerIndex() + r4);
        r3 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
        if (r5 < r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
        r6 = r5 - r0;
        r1[hash(r13, r3, r2)] = (short) (r6 - 1);
        r4 = r3 + 1;
        r7 = hash(r13, r4, r2);
        r10 = r0 + r1[r7];
        r1[r7] = (short) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
        if (r13.getInt(r4) == r13.getInt(r10)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a2, code lost:
        r3 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void encode(io.netty.buffer.ByteBuf r13, io.netty.buffer.ByteBuf r14, int r15) {
        /*
            r12 = this;
            r0 = 0
        L1:
            int r1 = r0 * 7
            int r1 = r15 >>> r1
            r2 = r1 & (-128(0xffffffffffffff80, float:NaN))
            if (r2 == 0) goto L13
            r1 = r1 & 127(0x7f, float:1.78E-43)
            r1 = r1 | 128(0x80, float:1.794E-43)
            r14.writeByte(r1)
            int r0 = r0 + 1
            goto L1
        L13:
            r14.writeByte(r1)
            int r0 = r13.readerIndex()
            short[] r1 = getHashTable(r15)
            int r2 = r1.length
            int r2 = java.lang.Integer.numberOfLeadingZeros(r2)
            int r2 = r2 + 1
            int r3 = r15 - r0
            r4 = 15
            if (r3 < r4) goto La8
            int r3 = r0 + 1
            int r4 = hash(r13, r3, r2)
            r5 = r0
        L32:
            r6 = 32
        L34:
            int r7 = r6 + 1
            int r6 = r6 >> 5
            int r6 = r6 + r3
            int r8 = r15 + (-4)
            if (r6 <= r8) goto L3f
        L3d:
            r0 = r5
            goto La8
        L3f:
            int r9 = hash(r13, r6, r2)
            short r10 = r1[r4]
            int r10 = r10 + r0
            int r11 = r3 - r0
            short r11 = (short) r11
            r1[r4] = r11
            int r4 = r13.getInt(r3)
            int r11 = r13.getInt(r10)
            if (r4 != r11) goto La4
            int r4 = r3 - r5
            encodeLiteral(r13, r14, r4)
        L5a:
            int r4 = r10 + 4
            int r5 = r3 + 4
            int r4 = findMatchingLength(r13, r4, r5, r15)
            int r4 = r4 + 4
            int r5 = r3 + r4
            int r3 = r3 - r10
            encodeCopy(r14, r3, r4)
            int r3 = r13.readerIndex()
            int r3 = r3 + r4
            r13.readerIndex(r3)
            int r3 = r5 + (-1)
            if (r5 < r8) goto L77
            goto L3d
        L77:
            int r4 = hash(r13, r3, r2)
            int r6 = r5 - r0
            int r7 = r6 + (-1)
            short r7 = (short) r7
            r1[r4] = r7
            int r4 = r3 + 1
            int r7 = hash(r13, r4, r2)
            short r9 = r1[r7]
            int r10 = r0 + r9
            short r6 = (short) r6
            r1[r7] = r6
            int r4 = r13.getInt(r4)
            int r6 = r13.getInt(r10)
            if (r4 == r6) goto La2
            int r3 = r3 + 2
            int r4 = hash(r13, r3, r2)
            int r3 = r5 + 1
            goto L32
        La2:
            r3 = r5
            goto L5a
        La4:
            r3 = r6
            r6 = r7
            r4 = r9
            goto L34
        La8:
            if (r0 >= r15) goto Lae
            int r15 = r15 - r0
            encodeLiteral(r13, r14, r15)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.codec.compression.Snappy.encode(io.netty.buffer.ByteBuf, io.netty.buffer.ByteBuf, int):void");
    }

    public void reset() {
        this.state = State.READY;
        this.tag = (byte) 0;
        this.written = 0;
    }

    static int calculateChecksum(ByteBuf byteBuf, int i4, int i5) {
        Crc32c crc32c = new Crc32c();
        try {
            crc32c.update(byteBuf, i4, i5);
            return maskChecksum(crc32c.getValue());
        } finally {
            crc32c.reset();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void validateChecksum(int i4, ByteBuf byteBuf, int i5, int i6) {
        int calculateChecksum = calculateChecksum(byteBuf, i5, i6);
        if (calculateChecksum == i4) {
            return;
        }
        throw new DecompressionException("mismatching checksum: " + Integer.toHexString(calculateChecksum) + " (expected: " + Integer.toHexString(i4) + ')');
    }
}
