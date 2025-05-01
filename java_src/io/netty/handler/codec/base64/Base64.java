package io.netty.handler.codec.base64;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.handler.codec.http2.Http2CodecUtil;
import io.netty.handler.codec.memcache.binary.BinaryMemcacheOpcodes;
import io.netty.util.ByteProcessor;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.PlatformDependent;
import java.nio.ByteOrder;
import okio.Utf8;
/* loaded from: classes6.dex */
public final class Base64 {
    private static final byte EQUALS_SIGN = 61;
    private static final byte EQUALS_SIGN_ENC = -1;
    private static final int MAX_LINE_LENGTH = 76;
    private static final byte NEW_LINE = 10;
    private static final byte WHITE_SPACE_ENC = -5;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class Decoder implements ByteProcessor {

        /* renamed from: b4  reason: collision with root package name */
        private final byte[] f69188b4;
        private int b4Posn;
        private byte[] decodabet;
        private ByteBuf dest;
        private int outBuffPosn;

        private Decoder() {
            this.f69188b4 = new byte[4];
        }

        private static int decode4to3(byte[] bArr, ByteBuf byteBuf, int i4, byte[] bArr2) {
            int i5;
            int i6;
            int i7;
            byte b5 = bArr[0];
            byte b6 = bArr[1];
            byte b7 = bArr[2];
            if (b7 == 61) {
                try {
                    byteBuf.setByte(i4, ((bArr2[b5] & 255) << 2) | ((bArr2[b6] & 255) >>> 4));
                    return 1;
                } catch (IndexOutOfBoundsException unused) {
                    throw new IllegalArgumentException("not encoded in Base64");
                }
            }
            byte b8 = bArr[3];
            if (b8 == 61) {
                byte b9 = bArr2[b6];
                try {
                    if (byteBuf.order() == ByteOrder.BIG_ENDIAN) {
                        i7 = ((b9 & 15) << 4) | ((((bArr2[b5] & Utf8.REPLACEMENT_BYTE) << 2) | ((b9 & 240) >> 4)) << 8) | ((bArr2[b7] & 252) >>> 2);
                    } else {
                        i7 = ((((b9 & 15) << 4) | ((bArr2[b7] & 252) >>> 2)) << 8) | ((bArr2[b5] & Utf8.REPLACEMENT_BYTE) << 2) | ((b9 & 240) >> 4);
                    }
                    byteBuf.setShort(i4, i7);
                    return 2;
                } catch (IndexOutOfBoundsException unused2) {
                    throw new IllegalArgumentException("not encoded in Base64");
                }
            }
            try {
                if (byteBuf.order() == ByteOrder.BIG_ENDIAN) {
                    i5 = ((bArr2[b5] & Utf8.REPLACEMENT_BYTE) << 18) | ((bArr2[b6] & 255) << 12) | ((bArr2[b7] & 255) << 6);
                    i6 = bArr2[b8] & 255;
                } else {
                    byte b10 = bArr2[b6];
                    byte b11 = bArr2[b7];
                    i5 = ((bArr2[b5] & Utf8.REPLACEMENT_BYTE) << 2) | ((b10 & 15) << 12) | ((b10 & 240) >>> 4) | ((b11 & 3) << 22) | ((b11 & 252) << 6);
                    i6 = (bArr2[b8] & 255) << 16;
                }
                byteBuf.setMedium(i4, i6 | i5);
                return 3;
            } catch (IndexOutOfBoundsException unused3) {
                throw new IllegalArgumentException("not encoded in Base64");
            }
        }

        ByteBuf decode(ByteBuf byteBuf, int i4, int i5, ByteBufAllocator byteBufAllocator, Base64Dialect base64Dialect) {
            this.dest = byteBufAllocator.buffer(Base64.decodedBufferSize(i5)).order(byteBuf.order());
            this.decodabet = Base64.decodabet(base64Dialect);
            try {
                byteBuf.forEachByte(i4, i5, this);
                return this.dest.slice(0, this.outBuffPosn);
            } catch (Throwable th) {
                this.dest.release();
                PlatformDependent.throwException(th);
                return null;
            }
        }

        @Override // io.netty.util.ByteProcessor
        public boolean process(byte b5) throws Exception {
            byte[] bArr;
            byte b6;
            if (b5 <= 0 || (b6 = (bArr = this.decodabet)[b5]) < -5) {
                throw new IllegalArgumentException("invalid Base64 input character: " + ((int) ((short) (b5 & 255))) + " (decimal)");
            } else if (b6 >= -1) {
                byte[] bArr2 = this.f69188b4;
                int i4 = this.b4Posn;
                int i5 = i4 + 1;
                this.b4Posn = i5;
                bArr2[i4] = b5;
                if (i5 > 3) {
                    int i6 = this.outBuffPosn;
                    this.outBuffPosn = i6 + decode4to3(bArr2, this.dest, i6, bArr);
                    this.b4Posn = 0;
                    return b5 != 61;
                }
                return true;
            } else {
                return true;
            }
        }
    }

    private Base64() {
    }

    private static byte[] alphabet(Base64Dialect base64Dialect) {
        return ((Base64Dialect) ObjectUtil.checkNotNull(base64Dialect, "dialect")).alphabet;
    }

    private static boolean breakLines(Base64Dialect base64Dialect) {
        return ((Base64Dialect) ObjectUtil.checkNotNull(base64Dialect, "dialect")).breakLinesByDefault;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] decodabet(Base64Dialect base64Dialect) {
        return ((Base64Dialect) ObjectUtil.checkNotNull(base64Dialect, "dialect")).decodabet;
    }

    public static ByteBuf decode(ByteBuf byteBuf) {
        return decode(byteBuf, Base64Dialect.STANDARD);
    }

    static int decodedBufferSize(int i4) {
        return i4 - (i4 >>> 2);
    }

    public static ByteBuf encode(ByteBuf byteBuf) {
        return encode(byteBuf, Base64Dialect.STANDARD);
    }

    private static void encode3to4(ByteBuf byteBuf, int i4, int i5, ByteBuf byteBuf2, int i6, byte[] bArr) {
        int i7 = 0;
        if (byteBuf.order() == ByteOrder.BIG_ENDIAN) {
            if (i5 == 1) {
                i7 = toInt(byteBuf.getByte(i4));
            } else if (i5 == 2) {
                i7 = toIntBE(byteBuf.getShort(i4));
            } else if (i5 > 0) {
                i7 = toIntBE(byteBuf.getMedium(i4));
            }
            encode3to4BigEndian(i7, i5, byteBuf2, i6, bArr);
            return;
        }
        if (i5 == 1) {
            i7 = toInt(byteBuf.getByte(i4));
        } else if (i5 == 2) {
            i7 = toIntLE(byteBuf.getShort(i4));
        } else if (i5 > 0) {
            i7 = toIntLE(byteBuf.getMedium(i4));
        }
        encode3to4LittleEndian(i7, i5, byteBuf2, i6, bArr);
    }

    private static void encode3to4BigEndian(int i4, int i5, ByteBuf byteBuf, int i6, byte[] bArr) {
        if (i5 == 1) {
            byteBuf.setInt(i6, (bArr[(i4 >>> 12) & 63] << 16) | (bArr[i4 >>> 18] << BinaryMemcacheOpcodes.FLUSHQ) | 15616 | 61);
        } else if (i5 == 2) {
            byteBuf.setInt(i6, (bArr[(i4 >>> 6) & 63] << 8) | (bArr[i4 >>> 18] << BinaryMemcacheOpcodes.FLUSHQ) | (bArr[(i4 >>> 12) & 63] << 16) | 61);
        } else if (i5 != 3) {
        } else {
            byteBuf.setInt(i6, bArr[i4 & 63] | (bArr[i4 >>> 18] << BinaryMemcacheOpcodes.FLUSHQ) | (bArr[(i4 >>> 12) & 63] << 16) | (bArr[(i4 >>> 6) & 63] << 8));
        }
    }

    private static void encode3to4LittleEndian(int i4, int i5, ByteBuf byteBuf, int i6, byte[] bArr) {
        if (i5 == 1) {
            byteBuf.setInt(i6, (bArr[(i4 >>> 12) & 63] << 8) | bArr[i4 >>> 18] | 3997696 | 1023410176);
        } else if (i5 == 2) {
            byteBuf.setInt(i6, (bArr[(i4 >>> 6) & 63] << 16) | bArr[i4 >>> 18] | (bArr[(i4 >>> 12) & 63] << 8) | 1023410176);
        } else if (i5 != 3) {
        } else {
            byteBuf.setInt(i6, (bArr[i4 & 63] << BinaryMemcacheOpcodes.FLUSHQ) | bArr[i4 >>> 18] | (bArr[(i4 >>> 12) & 63] << 8) | (bArr[(i4 >>> 6) & 63] << 16));
        }
    }

    static int encodedBufferSize(int i4, boolean z4) {
        long j4 = (i4 << 2) / 3;
        long j5 = (3 + j4) & (-4);
        if (z4) {
            j5 += j4 / 76;
        }
        if (j5 < 2147483647L) {
            return (int) j5;
        }
        return Integer.MAX_VALUE;
    }

    private static int toInt(byte b5) {
        return (b5 & 255) << 16;
    }

    private static int toIntBE(int i4) {
        return (i4 & 255) | (16711680 & i4) | (65280 & i4);
    }

    private static int toIntBE(short s4) {
        return ((s4 & Http2CodecUtil.MAX_UNSIGNED_BYTE) << 8) | ((65280 & s4) << 8);
    }

    private static int toIntLE(int i4) {
        return ((i4 & 16711680) >>> 16) | ((i4 & 255) << 16) | (65280 & i4);
    }

    private static int toIntLE(short s4) {
        return (s4 & 65280) | ((s4 & Http2CodecUtil.MAX_UNSIGNED_BYTE) << 16);
    }

    public static ByteBuf decode(ByteBuf byteBuf, Base64Dialect base64Dialect) {
        ObjectUtil.checkNotNull(byteBuf, "src");
        ByteBuf decode = decode(byteBuf, byteBuf.readerIndex(), byteBuf.readableBytes(), base64Dialect);
        byteBuf.readerIndex(byteBuf.writerIndex());
        return decode;
    }

    public static ByteBuf encode(ByteBuf byteBuf, Base64Dialect base64Dialect) {
        return encode(byteBuf, breakLines(base64Dialect), base64Dialect);
    }

    public static ByteBuf encode(ByteBuf byteBuf, boolean z4) {
        return encode(byteBuf, z4, Base64Dialect.STANDARD);
    }

    public static ByteBuf encode(ByteBuf byteBuf, boolean z4, Base64Dialect base64Dialect) {
        ObjectUtil.checkNotNull(byteBuf, "src");
        ByteBuf encode = encode(byteBuf, byteBuf.readerIndex(), byteBuf.readableBytes(), z4, base64Dialect);
        byteBuf.readerIndex(byteBuf.writerIndex());
        return encode;
    }

    public static ByteBuf decode(ByteBuf byteBuf, int i4, int i5) {
        return decode(byteBuf, i4, i5, Base64Dialect.STANDARD);
    }

    public static ByteBuf decode(ByteBuf byteBuf, int i4, int i5, Base64Dialect base64Dialect) {
        return decode(byteBuf, i4, i5, base64Dialect, byteBuf.alloc());
    }

    public static ByteBuf decode(ByteBuf byteBuf, int i4, int i5, Base64Dialect base64Dialect, ByteBufAllocator byteBufAllocator) {
        ObjectUtil.checkNotNull(byteBuf, "src");
        ObjectUtil.checkNotNull(base64Dialect, "dialect");
        return new Decoder().decode(byteBuf, i4, i5, byteBufAllocator, base64Dialect);
    }

    public static ByteBuf encode(ByteBuf byteBuf, int i4, int i5) {
        return encode(byteBuf, i4, i5, Base64Dialect.STANDARD);
    }

    public static ByteBuf encode(ByteBuf byteBuf, int i4, int i5, Base64Dialect base64Dialect) {
        return encode(byteBuf, i4, i5, breakLines(base64Dialect), base64Dialect);
    }

    public static ByteBuf encode(ByteBuf byteBuf, int i4, int i5, boolean z4) {
        return encode(byteBuf, i4, i5, z4, Base64Dialect.STANDARD);
    }

    public static ByteBuf encode(ByteBuf byteBuf, int i4, int i5, boolean z4, Base64Dialect base64Dialect) {
        return encode(byteBuf, i4, i5, z4, base64Dialect, byteBuf.alloc());
    }

    public static ByteBuf encode(ByteBuf byteBuf, int i4, int i5, boolean z4, Base64Dialect base64Dialect, ByteBufAllocator byteBufAllocator) {
        ObjectUtil.checkNotNull(byteBuf, "src");
        ObjectUtil.checkNotNull(base64Dialect, "dialect");
        ByteBuf order = byteBufAllocator.buffer(encodedBufferSize(i5, z4)).order(byteBuf.order());
        byte[] alphabet = alphabet(base64Dialect);
        int i6 = i5 - 2;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < i6) {
            encode3to4(byteBuf, i7 + i4, 3, order, i8, alphabet);
            i9 += 4;
            if (z4 && i9 == 76) {
                order.setByte(i8 + 4, 10);
                i8++;
                i9 = 0;
            }
            i7 += 3;
            i8 += 4;
        }
        if (i7 < i5) {
            encode3to4(byteBuf, i7 + i4, i5 - i7, order, i8, alphabet);
            i8 += 4;
        }
        if (i8 > 1 && order.getByte(i8 - 1) == 10) {
            i8--;
        }
        return order.slice(0, i8);
    }
}
