package io.netty.buffer;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.netty.buffer.CompositeByteBuf;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
/* loaded from: classes6.dex */
public final class Unpooled {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final ByteBufAllocator ALLOC;
    public static final ByteOrder BIG_ENDIAN;
    public static final ByteBuf EMPTY_BUFFER;
    public static final ByteOrder LITTLE_ENDIAN;

    static {
        UnpooledByteBufAllocator unpooledByteBufAllocator = UnpooledByteBufAllocator.DEFAULT;
        ALLOC = unpooledByteBufAllocator;
        BIG_ENDIAN = ByteOrder.BIG_ENDIAN;
        LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        EMPTY_BUFFER = unpooledByteBufAllocator.buffer(0, 0);
    }

    private Unpooled() {
    }

    public static ByteBuf buffer() {
        return ALLOC.heapBuffer();
    }

    public static CompositeByteBuf compositeBuffer() {
        return compositeBuffer(16);
    }

    public static ByteBuf copiedBuffer(byte[] bArr) {
        if (bArr.length == 0) {
            return EMPTY_BUFFER;
        }
        return wrappedBuffer((byte[]) bArr.clone());
    }

    public static ByteBuf copyBoolean(boolean z4) {
        ByteBuf buffer = buffer(1);
        buffer.writeBoolean(z4);
        return buffer;
    }

    public static ByteBuf copyDouble(double d5) {
        ByteBuf buffer = buffer(8);
        buffer.writeDouble(d5);
        return buffer;
    }

    public static ByteBuf copyFloat(float f5) {
        ByteBuf buffer = buffer(4);
        buffer.writeFloat(f5);
        return buffer;
    }

    public static ByteBuf copyInt(int i4) {
        ByteBuf buffer = buffer(4);
        buffer.writeInt(i4);
        return buffer;
    }

    public static ByteBuf copyLong(long j4) {
        ByteBuf buffer = buffer(8);
        buffer.writeLong(j4);
        return buffer;
    }

    public static ByteBuf copyMedium(int i4) {
        ByteBuf buffer = buffer(3);
        buffer.writeMedium(i4);
        return buffer;
    }

    public static ByteBuf copyShort(int i4) {
        ByteBuf buffer = buffer(2);
        buffer.writeShort(i4);
        return buffer;
    }

    public static ByteBuf directBuffer() {
        return ALLOC.directBuffer();
    }

    @Deprecated
    public static ByteBuf unmodifiableBuffer(ByteBuf byteBuf) {
        ByteOrder order = byteBuf.order();
        ByteOrder byteOrder = BIG_ENDIAN;
        if (order == byteOrder) {
            return new ReadOnlyByteBuf(byteBuf);
        }
        return new ReadOnlyByteBuf(byteBuf.order(byteOrder)).order(LITTLE_ENDIAN);
    }

    public static ByteBuf unreleasableBuffer(ByteBuf byteBuf) {
        return new UnreleasableByteBuf(byteBuf);
    }

    public static ByteBuf wrappedBuffer(byte[] bArr) {
        if (bArr.length == 0) {
            return EMPTY_BUFFER;
        }
        return new UnpooledHeapByteBuf(ALLOC, bArr, bArr.length);
    }

    public static ByteBuf wrappedUnmodifiableBuffer(ByteBuf... byteBufArr) {
        return wrappedUnmodifiableBuffer(false, byteBufArr);
    }

    public static ByteBuf buffer(int i4) {
        return ALLOC.heapBuffer(i4);
    }

    public static CompositeByteBuf compositeBuffer(int i4) {
        return new CompositeByteBuf(ALLOC, false, i4);
    }

    public static ByteBuf directBuffer(int i4) {
        return ALLOC.directBuffer(i4);
    }

    private static ByteBuf wrappedUnmodifiableBuffer(boolean z4, ByteBuf... byteBufArr) {
        int length = byteBufArr.length;
        if (length != 0) {
            if (length != 1) {
                if (z4) {
                    byteBufArr = (ByteBuf[]) Arrays.copyOf(byteBufArr, byteBufArr.length, ByteBuf[].class);
                }
                return new FixedCompositeByteBuf(ALLOC, byteBufArr);
            }
            return byteBufArr[0].asReadOnly();
        }
        return EMPTY_BUFFER;
    }

    public static ByteBuf buffer(int i4, int i5) {
        return ALLOC.heapBuffer(i4, i5);
    }

    public static ByteBuf copyBoolean(boolean... zArr) {
        if (zArr != null && zArr.length != 0) {
            ByteBuf buffer = buffer(zArr.length);
            for (boolean z4 : zArr) {
                buffer.writeBoolean(z4);
            }
            return buffer;
        }
        return EMPTY_BUFFER;
    }

    public static ByteBuf copyDouble(double... dArr) {
        if (dArr != null && dArr.length != 0) {
            ByteBuf buffer = buffer(dArr.length * 8);
            for (double d5 : dArr) {
                buffer.writeDouble(d5);
            }
            return buffer;
        }
        return EMPTY_BUFFER;
    }

    public static ByteBuf copyFloat(float... fArr) {
        if (fArr != null && fArr.length != 0) {
            ByteBuf buffer = buffer(fArr.length * 4);
            for (float f5 : fArr) {
                buffer.writeFloat(f5);
            }
            return buffer;
        }
        return EMPTY_BUFFER;
    }

    public static ByteBuf copyInt(int... iArr) {
        if (iArr != null && iArr.length != 0) {
            ByteBuf buffer = buffer(iArr.length * 4);
            for (int i4 : iArr) {
                buffer.writeInt(i4);
            }
            return buffer;
        }
        return EMPTY_BUFFER;
    }

    public static ByteBuf copyLong(long... jArr) {
        if (jArr != null && jArr.length != 0) {
            ByteBuf buffer = buffer(jArr.length * 8);
            for (long j4 : jArr) {
                buffer.writeLong(j4);
            }
            return buffer;
        }
        return EMPTY_BUFFER;
    }

    public static ByteBuf copyMedium(int... iArr) {
        if (iArr != null && iArr.length != 0) {
            ByteBuf buffer = buffer(iArr.length * 3);
            for (int i4 : iArr) {
                buffer.writeMedium(i4);
            }
            return buffer;
        }
        return EMPTY_BUFFER;
    }

    public static ByteBuf copyShort(short... sArr) {
        if (sArr != null && sArr.length != 0) {
            ByteBuf buffer = buffer(sArr.length * 2);
            for (short s4 : sArr) {
                buffer.writeShort(s4);
            }
            return buffer;
        }
        return EMPTY_BUFFER;
    }

    public static ByteBuf directBuffer(int i4, int i5) {
        return ALLOC.directBuffer(i4, i5);
    }

    public static ByteBuf copiedBuffer(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return EMPTY_BUFFER;
        }
        byte[] allocateUninitializedArray = PlatformDependent.allocateUninitializedArray(i5);
        System.arraycopy(bArr, i4, allocateUninitializedArray, 0, i5);
        return wrappedBuffer(allocateUninitializedArray);
    }

    public static ByteBuf wrappedBuffer(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return EMPTY_BUFFER;
        }
        if (i4 == 0 && i5 == bArr.length) {
            return wrappedBuffer(bArr);
        }
        return wrappedBuffer(bArr).slice(i4, i5);
    }

    @Deprecated
    public static ByteBuf unmodifiableBuffer(ByteBuf... byteBufArr) {
        return wrappedUnmodifiableBuffer(true, byteBufArr);
    }

    public static ByteBuf copiedBuffer(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return EMPTY_BUFFER;
        }
        byte[] allocateUninitializedArray = PlatformDependent.allocateUninitializedArray(remaining);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.get(allocateUninitializedArray);
        return wrappedBuffer(allocateUninitializedArray).order(duplicate.order());
    }

    public static ByteBuf copyShort(int... iArr) {
        if (iArr != null && iArr.length != 0) {
            ByteBuf buffer = buffer(iArr.length * 2);
            for (int i4 : iArr) {
                buffer.writeShort(i4);
            }
            return buffer;
        }
        return EMPTY_BUFFER;
    }

    public static ByteBuf wrappedBuffer(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return EMPTY_BUFFER;
        }
        if (!byteBuffer.isDirect() && byteBuffer.hasArray()) {
            return wrappedBuffer(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()).order(byteBuffer.order());
        }
        if (PlatformDependent.hasUnsafe()) {
            if (byteBuffer.isReadOnly()) {
                if (byteBuffer.isDirect()) {
                    return new ReadOnlyUnsafeDirectByteBuf(ALLOC, byteBuffer);
                }
                return new ReadOnlyByteBufferBuf(ALLOC, byteBuffer);
            }
            return new UnpooledUnsafeDirectByteBuf(ALLOC, byteBuffer, byteBuffer.remaining());
        } else if (byteBuffer.isReadOnly()) {
            return new ReadOnlyByteBufferBuf(ALLOC, byteBuffer);
        } else {
            return new UnpooledDirectByteBuf(ALLOC, byteBuffer, byteBuffer.remaining());
        }
    }

    public static ByteBuf copiedBuffer(ByteBuf byteBuf) {
        int readableBytes = byteBuf.readableBytes();
        if (readableBytes > 0) {
            ByteBuf buffer = buffer(readableBytes);
            buffer.writeBytes(byteBuf, byteBuf.readerIndex(), readableBytes);
            return buffer;
        }
        return EMPTY_BUFFER;
    }

    public static ByteBuf copiedBuffer(byte[]... bArr) {
        int length = bArr.length;
        if (length != 0) {
            if (length != 1) {
                int i4 = 0;
                for (byte[] bArr2 : bArr) {
                    if (Integer.MAX_VALUE - i4 >= bArr2.length) {
                        i4 += bArr2.length;
                    } else {
                        throw new IllegalArgumentException("The total length of the specified arrays is too big.");
                    }
                }
                if (i4 == 0) {
                    return EMPTY_BUFFER;
                }
                byte[] allocateUninitializedArray = PlatformDependent.allocateUninitializedArray(i4);
                int i5 = 0;
                for (byte[] bArr3 : bArr) {
                    System.arraycopy(bArr3, 0, allocateUninitializedArray, i5, bArr3.length);
                    i5 += bArr3.length;
                }
                return wrappedBuffer(allocateUninitializedArray);
            } else if (bArr[0].length == 0) {
                return EMPTY_BUFFER;
            } else {
                return copiedBuffer(bArr[0]);
            }
        }
        return EMPTY_BUFFER;
    }

    public static ByteBuf wrappedBuffer(long j4, int i4, boolean z4) {
        return new WrappedUnpooledUnsafeDirectByteBuf(ALLOC, j4, i4, z4);
    }

    public static ByteBuf wrappedBuffer(ByteBuf byteBuf) {
        if (byteBuf.isReadable()) {
            return byteBuf.slice();
        }
        byteBuf.release();
        return EMPTY_BUFFER;
    }

    public static ByteBuf wrappedBuffer(byte[]... bArr) {
        return wrappedBuffer(bArr.length, bArr);
    }

    public static ByteBuf wrappedBuffer(ByteBuf... byteBufArr) {
        return wrappedBuffer(byteBufArr.length, byteBufArr);
    }

    public static ByteBuf wrappedBuffer(ByteBuffer... byteBufferArr) {
        return wrappedBuffer(byteBufferArr.length, byteBufferArr);
    }

    static <T> ByteBuf wrappedBuffer(int i4, CompositeByteBuf.ByteWrapper<T> byteWrapper, T[] tArr) {
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                int length2 = tArr.length;
                for (int i5 = 0; i5 < length2; i5++) {
                    T t4 = tArr[i5];
                    if (t4 == null) {
                        return EMPTY_BUFFER;
                    }
                    if (!byteWrapper.isEmpty(t4)) {
                        return new CompositeByteBuf(ALLOC, false, i4, byteWrapper, tArr, i5);
                    }
                }
            } else if (!byteWrapper.isEmpty(tArr[0])) {
                return byteWrapper.wrap(tArr[0]);
            }
        }
        return EMPTY_BUFFER;
    }

    public static ByteBuf copiedBuffer(ByteBuf... byteBufArr) {
        int length = byteBufArr.length;
        if (length != 0) {
            if (length != 1) {
                ByteOrder byteOrder = null;
                int i4 = 0;
                for (ByteBuf byteBuf : byteBufArr) {
                    int readableBytes = byteBuf.readableBytes();
                    if (readableBytes > 0) {
                        if (Integer.MAX_VALUE - i4 < readableBytes) {
                            throw new IllegalArgumentException("The total length of the specified buffers is too big.");
                        }
                        i4 += readableBytes;
                        if (byteOrder != null) {
                            if (!byteOrder.equals(byteBuf.order())) {
                                throw new IllegalArgumentException("inconsistent byte order");
                            }
                        } else {
                            byteOrder = byteBuf.order();
                        }
                    }
                }
                if (i4 == 0) {
                    return EMPTY_BUFFER;
                }
                byte[] allocateUninitializedArray = PlatformDependent.allocateUninitializedArray(i4);
                int i5 = 0;
                for (ByteBuf byteBuf2 : byteBufArr) {
                    int readableBytes2 = byteBuf2.readableBytes();
                    byteBuf2.getBytes(byteBuf2.readerIndex(), allocateUninitializedArray, i5, readableBytes2);
                    i5 += readableBytes2;
                }
                return wrappedBuffer(allocateUninitializedArray).order(byteOrder);
            }
            return copiedBuffer(byteBufArr[0]);
        }
        return EMPTY_BUFFER;
    }

    public static ByteBuf wrappedBuffer(int i4, byte[]... bArr) {
        return wrappedBuffer(i4, CompositeByteBuf.BYTE_ARRAY_WRAPPER, bArr);
    }

    public static ByteBuf wrappedBuffer(int i4, ByteBuf... byteBufArr) {
        int length = byteBufArr.length;
        if (length != 0) {
            if (length != 1) {
                for (int i5 = 0; i5 < byteBufArr.length; i5++) {
                    ByteBuf byteBuf = byteBufArr[i5];
                    if (byteBuf.isReadable()) {
                        return new CompositeByteBuf(ALLOC, false, i4, byteBufArr, i5);
                    }
                    byteBuf.release();
                }
            } else {
                ByteBuf byteBuf2 = byteBufArr[0];
                if (byteBuf2.isReadable()) {
                    return wrappedBuffer(byteBuf2.order(BIG_ENDIAN));
                }
                byteBuf2.release();
            }
        }
        return EMPTY_BUFFER;
    }

    public static ByteBuf copiedBuffer(ByteBuffer... byteBufferArr) {
        int length = byteBufferArr.length;
        if (length != 0) {
            if (length != 1) {
                ByteOrder byteOrder = null;
                int i4 = 0;
                for (ByteBuffer byteBuffer : byteBufferArr) {
                    int remaining = byteBuffer.remaining();
                    if (remaining > 0) {
                        if (Integer.MAX_VALUE - i4 < remaining) {
                            throw new IllegalArgumentException("The total length of the specified buffers is too big.");
                        }
                        i4 += remaining;
                        if (byteOrder != null) {
                            if (!byteOrder.equals(byteBuffer.order())) {
                                throw new IllegalArgumentException("inconsistent byte order");
                            }
                        } else {
                            byteOrder = byteBuffer.order();
                        }
                    }
                }
                if (i4 == 0) {
                    return EMPTY_BUFFER;
                }
                byte[] allocateUninitializedArray = PlatformDependent.allocateUninitializedArray(i4);
                int i5 = 0;
                for (ByteBuffer byteBuffer2 : byteBufferArr) {
                    ByteBuffer duplicate = byteBuffer2.duplicate();
                    int remaining2 = duplicate.remaining();
                    duplicate.get(allocateUninitializedArray, i5, remaining2);
                    i5 += remaining2;
                }
                return wrappedBuffer(allocateUninitializedArray).order(byteOrder);
            }
            return copiedBuffer(byteBufferArr[0]);
        }
        return EMPTY_BUFFER;
    }

    public static ByteBuf wrappedBuffer(int i4, ByteBuffer... byteBufferArr) {
        return wrappedBuffer(i4, CompositeByteBuf.BYTE_BUFFER_WRAPPER, byteBufferArr);
    }

    public static ByteBuf copiedBuffer(CharSequence charSequence, Charset charset) {
        ObjectUtil.checkNotNull(charSequence, TypedValues.Custom.S_STRING);
        if (charSequence instanceof CharBuffer) {
            return copiedBuffer((CharBuffer) charSequence, charset);
        }
        return copiedBuffer(CharBuffer.wrap(charSequence), charset);
    }

    public static ByteBuf copiedBuffer(CharSequence charSequence, int i4, int i5, Charset charset) {
        ObjectUtil.checkNotNull(charSequence, TypedValues.Custom.S_STRING);
        if (i5 == 0) {
            return EMPTY_BUFFER;
        }
        if (charSequence instanceof CharBuffer) {
            CharBuffer charBuffer = (CharBuffer) charSequence;
            if (charBuffer.hasArray()) {
                return copiedBuffer(charBuffer.array(), charBuffer.arrayOffset() + charBuffer.position() + i4, i5, charset);
            }
            CharBuffer slice = charBuffer.slice();
            slice.limit(i5);
            slice.position(i4);
            return copiedBuffer(slice, charset);
        }
        return copiedBuffer(CharBuffer.wrap(charSequence, i4, i5 + i4), charset);
    }

    public static ByteBuf copiedBuffer(char[] cArr, Charset charset) {
        ObjectUtil.checkNotNull(cArr, "array");
        return copiedBuffer(cArr, 0, cArr.length, charset);
    }

    public static ByteBuf copiedBuffer(char[] cArr, int i4, int i5, Charset charset) {
        ObjectUtil.checkNotNull(cArr, "array");
        if (i5 == 0) {
            return EMPTY_BUFFER;
        }
        return copiedBuffer(CharBuffer.wrap(cArr, i4, i5), charset);
    }

    private static ByteBuf copiedBuffer(CharBuffer charBuffer, Charset charset) {
        return ByteBufUtil.encodeString0(ALLOC, true, charBuffer, charset, 0);
    }
}
