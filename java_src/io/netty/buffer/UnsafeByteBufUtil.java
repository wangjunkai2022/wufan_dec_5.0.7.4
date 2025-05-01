package io.netty.buffer;

import io.netty.handler.codec.memcache.binary.BinaryMemcacheOpcodes;
import io.netty.util.internal.MathUtil;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.PlatformDependent;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import kotlin.UShort;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class UnsafeByteBufUtil {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean UNALIGNED = PlatformDependent.isUnaligned();
    private static final byte ZERO = 0;

    private UnsafeByteBufUtil() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ByteBuf copy(AbstractByteBuf abstractByteBuf, long j4, int i4, int i5) {
        abstractByteBuf.checkIndex(i4, i5);
        ByteBuf directBuffer = abstractByteBuf.alloc().directBuffer(i5, abstractByteBuf.maxCapacity());
        if (i5 != 0) {
            if (directBuffer.hasMemoryAddress()) {
                PlatformDependent.copyMemory(j4, directBuffer.memoryAddress(), i5);
                directBuffer.setIndex(0, i5);
            } else {
                directBuffer.writeBytes(abstractByteBuf, i4, i5);
            }
        }
        return directBuffer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte getByte(long j4) {
        return PlatformDependent.getByte(j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void getBytes(AbstractByteBuf abstractByteBuf, long j4, int i4, ByteBuf byteBuf, int i5, int i6) {
        abstractByteBuf.checkIndex(i4, i6);
        ObjectUtil.checkNotNull(byteBuf, "dst");
        if (!MathUtil.isOutOfBounds(i5, i6, byteBuf.capacity())) {
            if (byteBuf.hasMemoryAddress()) {
                PlatformDependent.copyMemory(j4, byteBuf.memoryAddress() + i5, i6);
                return;
            } else if (byteBuf.hasArray()) {
                PlatformDependent.copyMemory(j4, byteBuf.array(), byteBuf.arrayOffset() + i5, i6);
                return;
            } else {
                byteBuf.setBytes(i5, abstractByteBuf, i4, i6);
                return;
            }
        }
        throw new IndexOutOfBoundsException("dstIndex: " + i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getInt(long j4) {
        if (UNALIGNED) {
            int i4 = PlatformDependent.getInt(j4);
            return PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? i4 : Integer.reverseBytes(i4);
        }
        return (PlatformDependent.getByte(j4 + 3) & 255) | (PlatformDependent.getByte(j4) << BinaryMemcacheOpcodes.FLUSHQ) | ((PlatformDependent.getByte(1 + j4) & 255) << 16) | ((PlatformDependent.getByte(2 + j4) & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getIntLE(long j4) {
        if (UNALIGNED) {
            int i4 = PlatformDependent.getInt(j4);
            return PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? Integer.reverseBytes(i4) : i4;
        }
        return (PlatformDependent.getByte(j4 + 3) << BinaryMemcacheOpcodes.FLUSHQ) | (PlatformDependent.getByte(j4) & 255) | ((PlatformDependent.getByte(1 + j4) & 255) << 8) | ((PlatformDependent.getByte(2 + j4) & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long getLong(long j4) {
        if (UNALIGNED) {
            long j5 = PlatformDependent.getLong(j4);
            return PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? j5 : Long.reverseBytes(j5);
        }
        return (PlatformDependent.getByte(j4 + 7) & 255) | (PlatformDependent.getByte(j4) << 56) | ((PlatformDependent.getByte(1 + j4) & 255) << 48) | ((PlatformDependent.getByte(2 + j4) & 255) << 40) | ((PlatformDependent.getByte(3 + j4) & 255) << 32) | ((PlatformDependent.getByte(4 + j4) & 255) << 24) | ((PlatformDependent.getByte(5 + j4) & 255) << 16) | ((PlatformDependent.getByte(6 + j4) & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long getLongLE(long j4) {
        if (UNALIGNED) {
            long j5 = PlatformDependent.getLong(j4);
            return PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? Long.reverseBytes(j5) : j5;
        }
        return (PlatformDependent.getByte(j4 + 7) << 56) | (PlatformDependent.getByte(j4) & 255) | ((PlatformDependent.getByte(1 + j4) & 255) << 8) | ((PlatformDependent.getByte(2 + j4) & 255) << 16) | ((PlatformDependent.getByte(3 + j4) & 255) << 24) | ((PlatformDependent.getByte(4 + j4) & 255) << 32) | ((PlatformDependent.getByte(5 + j4) & 255) << 40) | ((255 & PlatformDependent.getByte(6 + j4)) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static short getShort(long j4) {
        if (UNALIGNED) {
            short s4 = PlatformDependent.getShort(j4);
            return PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? s4 : Short.reverseBytes(s4);
        }
        return (short) ((PlatformDependent.getByte(j4 + 1) & 255) | (PlatformDependent.getByte(j4) << 8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static short getShortLE(long j4) {
        if (UNALIGNED) {
            short s4 = PlatformDependent.getShort(j4);
            return PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? Short.reverseBytes(s4) : s4;
        }
        return (short) ((PlatformDependent.getByte(j4 + 1) << 8) | (PlatformDependent.getByte(j4) & 255));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getUnsignedMedium(long j4) {
        int i4;
        int i5;
        short reverseBytes;
        if (UNALIGNED) {
            i4 = (PlatformDependent.getByte(j4) & 255) << 16;
            if (PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                reverseBytes = PlatformDependent.getShort(j4 + 1);
            } else {
                reverseBytes = Short.reverseBytes(PlatformDependent.getShort(j4 + 1));
            }
            i5 = reverseBytes & UShort.MAX_VALUE;
        } else {
            i4 = ((PlatformDependent.getByte(j4) & 255) << 16) | ((PlatformDependent.getByte(1 + j4) & 255) << 8);
            i5 = PlatformDependent.getByte(j4 + 2) & 255;
        }
        return i5 | i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getUnsignedMediumLE(long j4) {
        int i4;
        int i5;
        short s4;
        if (UNALIGNED) {
            i4 = PlatformDependent.getByte(j4) & 255;
            if (PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                s4 = Short.reverseBytes(PlatformDependent.getShort(j4 + 1));
            } else {
                s4 = PlatformDependent.getShort(j4 + 1);
            }
            i5 = (s4 & UShort.MAX_VALUE) << 8;
        } else {
            i4 = (PlatformDependent.getByte(j4) & 255) | ((PlatformDependent.getByte(1 + j4) & 255) << 8);
            i5 = (PlatformDependent.getByte(j4 + 2) & 255) << 16;
        }
        return i5 | i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static UnpooledUnsafeDirectByteBuf newUnsafeDirectByteBuf(ByteBufAllocator byteBufAllocator, int i4, int i5) {
        if (PlatformDependent.useDirectBufferNoCleaner()) {
            return new UnpooledUnsafeNoCleanerDirectByteBuf(byteBufAllocator, i4, i5);
        }
        return new UnpooledUnsafeDirectByteBuf(byteBufAllocator, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setByte(long j4, int i4) {
        PlatformDependent.putByte(j4, (byte) i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setBytes(AbstractByteBuf abstractByteBuf, long j4, int i4, InputStream inputStream, int i5) throws IOException {
        abstractByteBuf.checkIndex(i4, i5);
        ByteBuf heapBuffer = abstractByteBuf.alloc().heapBuffer(i5);
        try {
            byte[] array = heapBuffer.array();
            int arrayOffset = heapBuffer.arrayOffset();
            int read = inputStream.read(array, arrayOffset, i5);
            if (read > 0) {
                PlatformDependent.copyMemory(array, arrayOffset, j4, read);
            }
            return read;
        } finally {
            heapBuffer.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setInt(long j4, int i4) {
        if (UNALIGNED) {
            if (!PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                i4 = Integer.reverseBytes(i4);
            }
            PlatformDependent.putInt(j4, i4);
            return;
        }
        PlatformDependent.putByte(j4, (byte) (i4 >>> 24));
        PlatformDependent.putByte(1 + j4, (byte) (i4 >>> 16));
        PlatformDependent.putByte(2 + j4, (byte) (i4 >>> 8));
        PlatformDependent.putByte(j4 + 3, (byte) i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setIntLE(long j4, int i4) {
        if (UNALIGNED) {
            if (PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                i4 = Integer.reverseBytes(i4);
            }
            PlatformDependent.putInt(j4, i4);
            return;
        }
        PlatformDependent.putByte(j4, (byte) i4);
        PlatformDependent.putByte(1 + j4, (byte) (i4 >>> 8));
        PlatformDependent.putByte(2 + j4, (byte) (i4 >>> 16));
        PlatformDependent.putByte(j4 + 3, (byte) (i4 >>> 24));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setLong(long j4, long j5) {
        if (UNALIGNED) {
            if (!PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                j5 = Long.reverseBytes(j5);
            }
            PlatformDependent.putLong(j4, j5);
            return;
        }
        PlatformDependent.putByte(j4, (byte) (j5 >>> 56));
        PlatformDependent.putByte(1 + j4, (byte) (j5 >>> 48));
        PlatformDependent.putByte(2 + j4, (byte) (j5 >>> 40));
        PlatformDependent.putByte(3 + j4, (byte) (j5 >>> 32));
        PlatformDependent.putByte(4 + j4, (byte) (j5 >>> 24));
        PlatformDependent.putByte(5 + j4, (byte) (j5 >>> 16));
        PlatformDependent.putByte(6 + j4, (byte) (j5 >>> 8));
        PlatformDependent.putByte(j4 + 7, (byte) j5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setLongLE(long j4, long j5) {
        if (UNALIGNED) {
            if (PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                j5 = Long.reverseBytes(j5);
            }
            PlatformDependent.putLong(j4, j5);
            return;
        }
        PlatformDependent.putByte(j4, (byte) j5);
        PlatformDependent.putByte(1 + j4, (byte) (j5 >>> 8));
        PlatformDependent.putByte(2 + j4, (byte) (j5 >>> 16));
        PlatformDependent.putByte(3 + j4, (byte) (j5 >>> 24));
        PlatformDependent.putByte(4 + j4, (byte) (j5 >>> 32));
        PlatformDependent.putByte(5 + j4, (byte) (j5 >>> 40));
        PlatformDependent.putByte(6 + j4, (byte) (j5 >>> 48));
        PlatformDependent.putByte(j4 + 7, (byte) (j5 >>> 56));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setMedium(long j4, int i4) {
        PlatformDependent.putByte(j4, (byte) (i4 >>> 16));
        if (UNALIGNED) {
            long j5 = j4 + 1;
            short s4 = (short) i4;
            if (!PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                s4 = Short.reverseBytes(s4);
            }
            PlatformDependent.putShort(j5, s4);
            return;
        }
        PlatformDependent.putByte(1 + j4, (byte) (i4 >>> 8));
        PlatformDependent.putByte(j4 + 2, (byte) i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setMediumLE(long j4, int i4) {
        PlatformDependent.putByte(j4, (byte) i4);
        if (UNALIGNED) {
            long j5 = j4 + 1;
            short s4 = (short) (i4 >>> 8);
            if (PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                s4 = Short.reverseBytes(s4);
            }
            PlatformDependent.putShort(j5, s4);
            return;
        }
        PlatformDependent.putByte(1 + j4, (byte) (i4 >>> 8));
        PlatformDependent.putByte(j4 + 2, (byte) (i4 >>> 16));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setShort(long j4, int i4) {
        if (UNALIGNED) {
            short s4 = (short) i4;
            if (!PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                s4 = Short.reverseBytes(s4);
            }
            PlatformDependent.putShort(j4, s4);
            return;
        }
        PlatformDependent.putByte(j4, (byte) (i4 >>> 8));
        PlatformDependent.putByte(j4 + 1, (byte) i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setShortLE(long j4, int i4) {
        if (UNALIGNED) {
            PlatformDependent.putShort(j4, PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? Short.reverseBytes((short) i4) : (short) i4);
            return;
        }
        PlatformDependent.putByte(j4, (byte) i4);
        PlatformDependent.putByte(j4 + 1, (byte) (i4 >>> 8));
    }

    private static void setSingleBytes(AbstractByteBuf abstractByteBuf, long j4, int i4, ByteBuffer byteBuffer, int i5) {
        abstractByteBuf.checkIndex(i4, i5);
        int limit = byteBuffer.limit();
        for (int position = byteBuffer.position(); position < limit; position++) {
            PlatformDependent.putByte(j4, byteBuffer.get(position));
            j4++;
        }
        byteBuffer.position(limit);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setZero(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return;
        }
        PlatformDependent.setMemory(bArr, i4, i5, (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte getByte(byte[] bArr, int i4) {
        return PlatformDependent.getByte(bArr, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setByte(byte[] bArr, int i4, int i5) {
        PlatformDependent.putByte(bArr, i4, (byte) i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setZero(long j4, int i4) {
        if (i4 == 0) {
            return;
        }
        PlatformDependent.setMemory(j4, i4, (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static short getShort(byte[] bArr, int i4) {
        if (UNALIGNED) {
            short s4 = PlatformDependent.getShort(bArr, i4);
            return PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? s4 : Short.reverseBytes(s4);
        }
        return (short) ((PlatformDependent.getByte(bArr, i4 + 1) & 255) | (PlatformDependent.getByte(bArr, i4) << 8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static short getShortLE(byte[] bArr, int i4) {
        if (UNALIGNED) {
            short s4 = PlatformDependent.getShort(bArr, i4);
            return PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? Short.reverseBytes(s4) : s4;
        }
        return (short) ((PlatformDependent.getByte(bArr, i4 + 1) << 8) | (PlatformDependent.getByte(bArr, i4) & 255));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setMediumLE(byte[] bArr, int i4, int i5) {
        PlatformDependent.putByte(bArr, i4, (byte) i5);
        if (UNALIGNED) {
            PlatformDependent.putShort(bArr, i4 + 1, PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? Short.reverseBytes((short) (i5 >>> 8)) : (short) (i5 >>> 8));
            return;
        }
        PlatformDependent.putByte(bArr, i4 + 1, (byte) (i5 >>> 8));
        PlatformDependent.putByte(bArr, i4 + 2, (byte) (i5 >>> 16));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setInt(byte[] bArr, int i4, int i5) {
        if (UNALIGNED) {
            if (!PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                i5 = Integer.reverseBytes(i5);
            }
            PlatformDependent.putInt(bArr, i4, i5);
            return;
        }
        PlatformDependent.putByte(bArr, i4, (byte) (i5 >>> 24));
        PlatformDependent.putByte(bArr, i4 + 1, (byte) (i5 >>> 16));
        PlatformDependent.putByte(bArr, i4 + 2, (byte) (i5 >>> 8));
        PlatformDependent.putByte(bArr, i4 + 3, (byte) i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setIntLE(byte[] bArr, int i4, int i5) {
        if (UNALIGNED) {
            if (PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                i5 = Integer.reverseBytes(i5);
            }
            PlatformDependent.putInt(bArr, i4, i5);
            return;
        }
        PlatformDependent.putByte(bArr, i4, (byte) i5);
        PlatformDependent.putByte(bArr, i4 + 1, (byte) (i5 >>> 8));
        PlatformDependent.putByte(bArr, i4 + 2, (byte) (i5 >>> 16));
        PlatformDependent.putByte(bArr, i4 + 3, (byte) (i5 >>> 24));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setShort(byte[] bArr, int i4, int i5) {
        if (UNALIGNED) {
            short s4 = (short) i5;
            if (!PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                s4 = Short.reverseBytes(s4);
            }
            PlatformDependent.putShort(bArr, i4, s4);
            return;
        }
        PlatformDependent.putByte(bArr, i4, (byte) (i5 >>> 8));
        PlatformDependent.putByte(bArr, i4 + 1, (byte) i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setShortLE(byte[] bArr, int i4, int i5) {
        if (UNALIGNED) {
            PlatformDependent.putShort(bArr, i4, PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? Short.reverseBytes((short) i5) : (short) i5);
            return;
        }
        PlatformDependent.putByte(bArr, i4, (byte) i5);
        PlatformDependent.putByte(bArr, i4 + 1, (byte) (i5 >>> 8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getInt(byte[] bArr, int i4) {
        if (UNALIGNED) {
            int i5 = PlatformDependent.getInt(bArr, i4);
            return PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? i5 : Integer.reverseBytes(i5);
        }
        return (PlatformDependent.getByte(bArr, i4 + 3) & 255) | (PlatformDependent.getByte(bArr, i4) << BinaryMemcacheOpcodes.FLUSHQ) | ((PlatformDependent.getByte(bArr, i4 + 1) & 255) << 16) | ((PlatformDependent.getByte(bArr, i4 + 2) & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getIntLE(byte[] bArr, int i4) {
        if (UNALIGNED) {
            int i5 = PlatformDependent.getInt(bArr, i4);
            return PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? Integer.reverseBytes(i5) : i5;
        }
        return (PlatformDependent.getByte(bArr, i4 + 3) << BinaryMemcacheOpcodes.FLUSHQ) | (PlatformDependent.getByte(bArr, i4) & 255) | ((PlatformDependent.getByte(bArr, i4 + 1) & 255) << 8) | ((PlatformDependent.getByte(bArr, i4 + 2) & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getUnsignedMedium(byte[] bArr, int i4) {
        int i5;
        int i6;
        short reverseBytes;
        if (UNALIGNED) {
            i5 = (PlatformDependent.getByte(bArr, i4) & 255) << 16;
            if (PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                reverseBytes = PlatformDependent.getShort(bArr, i4 + 1);
            } else {
                reverseBytes = Short.reverseBytes(PlatformDependent.getShort(bArr, i4 + 1));
            }
            i6 = reverseBytes & UShort.MAX_VALUE;
        } else {
            i5 = ((PlatformDependent.getByte(bArr, i4) & 255) << 16) | ((PlatformDependent.getByte(bArr, i4 + 1) & 255) << 8);
            i6 = PlatformDependent.getByte(bArr, i4 + 2) & 255;
        }
        return i6 | i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getUnsignedMediumLE(byte[] bArr, int i4) {
        int i5;
        int i6;
        short s4;
        if (UNALIGNED) {
            i5 = PlatformDependent.getByte(bArr, i4) & 255;
            if (PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                s4 = Short.reverseBytes(PlatformDependent.getShort(bArr, i4 + 1));
            } else {
                s4 = PlatformDependent.getShort(bArr, i4 + 1);
            }
            i6 = (s4 & UShort.MAX_VALUE) << 8;
        } else {
            i5 = (PlatformDependent.getByte(bArr, i4) & 255) | ((PlatformDependent.getByte(bArr, i4 + 1) & 255) << 8);
            i6 = (PlatformDependent.getByte(bArr, i4 + 2) & 255) << 16;
        }
        return i6 | i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setMedium(byte[] bArr, int i4, int i5) {
        PlatformDependent.putByte(bArr, i4, (byte) (i5 >>> 16));
        if (UNALIGNED) {
            int i6 = i4 + 1;
            short s4 = (short) i5;
            if (!PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                s4 = Short.reverseBytes(s4);
            }
            PlatformDependent.putShort(bArr, i6, s4);
            return;
        }
        PlatformDependent.putByte(bArr, i4 + 1, (byte) (i5 >>> 8));
        PlatformDependent.putByte(bArr, i4 + 2, (byte) i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setBytes(AbstractByteBuf abstractByteBuf, long j4, int i4, ByteBuf byteBuf, int i5, int i6) {
        abstractByteBuf.checkIndex(i4, i6);
        ObjectUtil.checkNotNull(byteBuf, "src");
        if (MathUtil.isOutOfBounds(i5, i6, byteBuf.capacity())) {
            throw new IndexOutOfBoundsException("srcIndex: " + i5);
        } else if (i6 != 0) {
            if (byteBuf.hasMemoryAddress()) {
                PlatformDependent.copyMemory(byteBuf.memoryAddress() + i5, j4, i6);
            } else if (byteBuf.hasArray()) {
                PlatformDependent.copyMemory(byteBuf.array(), byteBuf.arrayOffset() + i5, j4, i6);
            } else {
                byteBuf.getBytes(i5, abstractByteBuf, i4, i6);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void getBytes(AbstractByteBuf abstractByteBuf, long j4, int i4, byte[] bArr, int i5, int i6) {
        abstractByteBuf.checkIndex(i4, i6);
        ObjectUtil.checkNotNull(bArr, "dst");
        if (MathUtil.isOutOfBounds(i5, i6, bArr.length)) {
            throw new IndexOutOfBoundsException("dstIndex: " + i5);
        } else if (i6 != 0) {
            PlatformDependent.copyMemory(j4, bArr, i5, i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setLong(byte[] bArr, int i4, long j4) {
        if (UNALIGNED) {
            if (!PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                j4 = Long.reverseBytes(j4);
            }
            PlatformDependent.putLong(bArr, i4, j4);
            return;
        }
        PlatformDependent.putByte(bArr, i4, (byte) (j4 >>> 56));
        PlatformDependent.putByte(bArr, i4 + 1, (byte) (j4 >>> 48));
        PlatformDependent.putByte(bArr, i4 + 2, (byte) (j4 >>> 40));
        PlatformDependent.putByte(bArr, i4 + 3, (byte) (j4 >>> 32));
        PlatformDependent.putByte(bArr, i4 + 4, (byte) (j4 >>> 24));
        PlatformDependent.putByte(bArr, i4 + 5, (byte) (j4 >>> 16));
        PlatformDependent.putByte(bArr, i4 + 6, (byte) (j4 >>> 8));
        PlatformDependent.putByte(bArr, i4 + 7, (byte) j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setLongLE(byte[] bArr, int i4, long j4) {
        if (UNALIGNED) {
            if (PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
                j4 = Long.reverseBytes(j4);
            }
            PlatformDependent.putLong(bArr, i4, j4);
            return;
        }
        PlatformDependent.putByte(bArr, i4, (byte) j4);
        PlatformDependent.putByte(bArr, i4 + 1, (byte) (j4 >>> 8));
        PlatformDependent.putByte(bArr, i4 + 2, (byte) (j4 >>> 16));
        PlatformDependent.putByte(bArr, i4 + 3, (byte) (j4 >>> 24));
        PlatformDependent.putByte(bArr, i4 + 4, (byte) (j4 >>> 32));
        PlatformDependent.putByte(bArr, i4 + 5, (byte) (j4 >>> 40));
        PlatformDependent.putByte(bArr, i4 + 6, (byte) (j4 >>> 48));
        PlatformDependent.putByte(bArr, i4 + 7, (byte) (j4 >>> 56));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long getLong(byte[] bArr, int i4) {
        if (UNALIGNED) {
            long j4 = PlatformDependent.getLong(bArr, i4);
            return PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? j4 : Long.reverseBytes(j4);
        }
        return (PlatformDependent.getByte(bArr, i4 + 7) & 255) | (PlatformDependent.getByte(bArr, i4) << 56) | ((PlatformDependent.getByte(bArr, i4 + 1) & 255) << 48) | ((PlatformDependent.getByte(bArr, i4 + 2) & 255) << 40) | ((PlatformDependent.getByte(bArr, i4 + 3) & 255) << 32) | ((PlatformDependent.getByte(bArr, i4 + 4) & 255) << 24) | ((PlatformDependent.getByte(bArr, i4 + 5) & 255) << 16) | ((PlatformDependent.getByte(bArr, i4 + 6) & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long getLongLE(byte[] bArr, int i4) {
        if (UNALIGNED) {
            long j4 = PlatformDependent.getLong(bArr, i4);
            return PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? Long.reverseBytes(j4) : j4;
        }
        return (PlatformDependent.getByte(bArr, i4 + 7) << 56) | (PlatformDependent.getByte(bArr, i4) & 255) | ((PlatformDependent.getByte(bArr, i4 + 1) & 255) << 8) | ((PlatformDependent.getByte(bArr, i4 + 2) & 255) << 16) | ((PlatformDependent.getByte(bArr, i4 + 3) & 255) << 24) | ((PlatformDependent.getByte(bArr, i4 + 4) & 255) << 32) | ((PlatformDependent.getByte(bArr, i4 + 5) & 255) << 40) | ((255 & PlatformDependent.getByte(bArr, i4 + 6)) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void getBytes(AbstractByteBuf abstractByteBuf, long j4, int i4, ByteBuffer byteBuffer) {
        abstractByteBuf.checkIndex(i4, byteBuffer.remaining());
        if (byteBuffer.remaining() == 0) {
            return;
        }
        if (byteBuffer.isDirect()) {
            if (!byteBuffer.isReadOnly()) {
                PlatformDependent.copyMemory(j4, PlatformDependent.directBufferAddress(byteBuffer) + byteBuffer.position(), byteBuffer.remaining());
                byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
                return;
            }
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            PlatformDependent.copyMemory(j4, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
        } else {
            byteBuffer.put(abstractByteBuf.nioBuffer());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setBytes(AbstractByteBuf abstractByteBuf, long j4, int i4, byte[] bArr, int i5, int i6) {
        abstractByteBuf.checkIndex(i4, i6);
        if (i6 != 0) {
            PlatformDependent.copyMemory(bArr, i5, j4, i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setBytes(AbstractByteBuf abstractByteBuf, long j4, int i4, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        if (byteBuffer.isDirect()) {
            abstractByteBuf.checkIndex(i4, remaining);
            PlatformDependent.copyMemory(PlatformDependent.directBufferAddress(byteBuffer) + byteBuffer.position(), j4, remaining);
            byteBuffer.position(byteBuffer.position() + remaining);
        } else if (byteBuffer.hasArray()) {
            abstractByteBuf.checkIndex(i4, remaining);
            PlatformDependent.copyMemory(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), j4, remaining);
            byteBuffer.position(byteBuffer.position() + remaining);
        } else if (remaining < 8) {
            setSingleBytes(abstractByteBuf, j4, i4, byteBuffer, remaining);
        } else {
            abstractByteBuf.internalNioBuffer(i4, remaining).put(byteBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void getBytes(AbstractByteBuf abstractByteBuf, long j4, int i4, OutputStream outputStream, int i5) throws IOException {
        abstractByteBuf.checkIndex(i4, i5);
        if (i5 != 0) {
            int min = Math.min(i5, 8192);
            if (min > 1024 && abstractByteBuf.alloc().isDirectBufferPooled()) {
                ByteBuf heapBuffer = abstractByteBuf.alloc().heapBuffer(min);
                try {
                    getBytes(j4, heapBuffer.array(), heapBuffer.arrayOffset(), min, outputStream, i5);
                    return;
                } finally {
                    heapBuffer.release();
                }
            }
            getBytes(j4, ByteBufUtil.threadLocalTempArray(min), 0, min, outputStream, i5);
        }
    }

    private static void getBytes(long j4, byte[] bArr, int i4, int i5, OutputStream outputStream, int i6) throws IOException {
        do {
            int min = Math.min(i5, i6);
            long j5 = min;
            PlatformDependent.copyMemory(j4, bArr, i4, j5);
            outputStream.write(bArr, i4, min);
            i6 -= min;
            j4 += j5;
        } while (i6 > 0);
    }
}
