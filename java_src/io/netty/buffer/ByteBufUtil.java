package io.netty.buffer;

import com.android.dx.io.Opcodes;
import external.org.apache.commons.lang3.d;
import io.netty.util.AsciiString;
import io.netty.util.ByteProcessor;
import io.netty.util.CharsetUtil;
import io.netty.util.concurrent.FastThreadLocal;
import io.netty.util.internal.MathUtil;
import io.netty.util.internal.ObjectPool;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.StringUtil;
import io.netty.util.internal.SystemPropertyUtil;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Locale;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* loaded from: classes6.dex */
public final class ByteBufUtil {
    private static final FastThreadLocal<byte[]> BYTE_ARRAYS;
    static final ByteBufAllocator DEFAULT_ALLOCATOR;
    private static final ByteProcessor FIND_NON_ASCII;
    private static final int MAX_BYTES_PER_CHAR_UTF8;
    private static final int MAX_CHAR_BUFFER_SIZE;
    static final int MAX_TL_ARRAY_LEN = 1024;
    private static final int THREAD_LOCAL_BUFFER_SIZE;
    static final int WRITE_CHUNK_SIZE = 8192;
    private static final byte WRITE_UTF_UNKNOWN = 63;
    private static final InternalLogger logger;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class ThreadLocalDirectByteBuf extends UnpooledDirectByteBuf {
        private static final ObjectPool<ThreadLocalDirectByteBuf> RECYCLER = ObjectPool.newPool(new ObjectPool.ObjectCreator<ThreadLocalDirectByteBuf>() { // from class: io.netty.buffer.ByteBufUtil.ThreadLocalDirectByteBuf.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.netty.util.internal.ObjectPool.ObjectCreator
            public ThreadLocalDirectByteBuf newObject(ObjectPool.Handle<ThreadLocalDirectByteBuf> handle) {
                return new ThreadLocalDirectByteBuf(handle);
            }
        });
        private final ObjectPool.Handle<ThreadLocalDirectByteBuf> handle;

        static ThreadLocalDirectByteBuf newInstance() {
            ThreadLocalDirectByteBuf threadLocalDirectByteBuf = RECYCLER.get();
            threadLocalDirectByteBuf.resetRefCnt();
            return threadLocalDirectByteBuf;
        }

        @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractReferenceCountedByteBuf
        protected void deallocate() {
            if (capacity() > ByteBufUtil.THREAD_LOCAL_BUFFER_SIZE) {
                super.deallocate();
                return;
            }
            clear();
            this.handle.recycle(this);
        }

        private ThreadLocalDirectByteBuf(ObjectPool.Handle<ThreadLocalDirectByteBuf> handle) {
            super(UnpooledByteBufAllocator.DEFAULT, 256, Integer.MAX_VALUE);
            this.handle = handle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class ThreadLocalUnsafeDirectByteBuf extends UnpooledUnsafeDirectByteBuf {
        private static final ObjectPool<ThreadLocalUnsafeDirectByteBuf> RECYCLER = ObjectPool.newPool(new ObjectPool.ObjectCreator<ThreadLocalUnsafeDirectByteBuf>() { // from class: io.netty.buffer.ByteBufUtil.ThreadLocalUnsafeDirectByteBuf.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.netty.util.internal.ObjectPool.ObjectCreator
            public ThreadLocalUnsafeDirectByteBuf newObject(ObjectPool.Handle<ThreadLocalUnsafeDirectByteBuf> handle) {
                return new ThreadLocalUnsafeDirectByteBuf(handle);
            }
        });
        private final ObjectPool.Handle<ThreadLocalUnsafeDirectByteBuf> handle;

        static ThreadLocalUnsafeDirectByteBuf newInstance() {
            ThreadLocalUnsafeDirectByteBuf threadLocalUnsafeDirectByteBuf = RECYCLER.get();
            threadLocalUnsafeDirectByteBuf.resetRefCnt();
            return threadLocalUnsafeDirectByteBuf;
        }

        @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractReferenceCountedByteBuf
        protected void deallocate() {
            if (capacity() > ByteBufUtil.THREAD_LOCAL_BUFFER_SIZE) {
                super.deallocate();
                return;
            }
            clear();
            this.handle.recycle(this);
        }

        private ThreadLocalUnsafeDirectByteBuf(ObjectPool.Handle<ThreadLocalUnsafeDirectByteBuf> handle) {
            super(UnpooledByteBufAllocator.DEFAULT, 256, Integer.MAX_VALUE);
            this.handle = handle;
        }
    }

    static {
        ByteBufAllocator byteBufAllocator;
        InternalLogger internalLoggerFactory = InternalLoggerFactory.getInstance(ByteBufUtil.class);
        logger = internalLoggerFactory;
        BYTE_ARRAYS = new FastThreadLocal<byte[]>() { // from class: io.netty.buffer.ByteBufUtil.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // io.netty.util.concurrent.FastThreadLocal
            public byte[] initialValue() throws Exception {
                return PlatformDependent.allocateUninitializedArray(1024);
            }
        };
        MAX_BYTES_PER_CHAR_UTF8 = (int) CharsetUtil.encoder(CharsetUtil.UTF_8).maxBytesPerChar();
        String trim = SystemPropertyUtil.get("io.netty.allocator.type", PlatformDependent.isAndroid() ? "unpooled" : "pooled").toLowerCase(Locale.US).trim();
        if ("unpooled".equals(trim)) {
            byteBufAllocator = UnpooledByteBufAllocator.DEFAULT;
            internalLoggerFactory.debug("-Dio.netty.allocator.type: {}", trim);
        } else if ("pooled".equals(trim)) {
            byteBufAllocator = PooledByteBufAllocator.DEFAULT;
            internalLoggerFactory.debug("-Dio.netty.allocator.type: {}", trim);
        } else {
            byteBufAllocator = PooledByteBufAllocator.DEFAULT;
            internalLoggerFactory.debug("-Dio.netty.allocator.type: pooled (unknown: {})", trim);
        }
        DEFAULT_ALLOCATOR = byteBufAllocator;
        int i4 = SystemPropertyUtil.getInt("io.netty.threadLocalDirectBufferSize", 0);
        THREAD_LOCAL_BUFFER_SIZE = i4;
        internalLoggerFactory.debug("-Dio.netty.threadLocalDirectBufferSize: {}", Integer.valueOf(i4));
        int i5 = SystemPropertyUtil.getInt("io.netty.maxThreadLocalCharBufferSize", 16384);
        MAX_CHAR_BUFFER_SIZE = i5;
        internalLoggerFactory.debug("-Dio.netty.maxThreadLocalCharBufferSize: {}", Integer.valueOf(i5));
        FIND_NON_ASCII = new ByteProcessor() { // from class: io.netty.buffer.ByteBufUtil.2
            @Override // io.netty.util.ByteProcessor
            public boolean process(byte b5) {
                return b5 >= 0;
            }
        };
    }

    private ByteBufUtil() {
    }

    public static void appendPrettyHexDump(StringBuilder sb, ByteBuf byteBuf) {
        appendPrettyHexDump(sb, byteBuf, byteBuf.readerIndex(), byteBuf.readableBytes());
    }

    private static CharSequence checkCharSequenceBounds(CharSequence charSequence, int i4, int i5) {
        if (MathUtil.isOutOfBounds(i4, i5 - i4, charSequence.length())) {
            throw new IndexOutOfBoundsException("expected: 0 <= start(" + i4 + ") <= end (" + i5 + ") <= seq.length(" + charSequence.length() + ')');
        }
        return charSequence;
    }

    public static int compare(ByteBuf byteBuf, ByteBuf byteBuf2) {
        long compareUintBigEndianB;
        int readableBytes = byteBuf.readableBytes();
        int readableBytes2 = byteBuf2.readableBytes();
        int min = Math.min(readableBytes, readableBytes2);
        int i4 = min >>> 2;
        int i5 = min & 3;
        int readerIndex = byteBuf.readerIndex();
        int readerIndex2 = byteBuf2.readerIndex();
        if (i4 > 0) {
            boolean z4 = byteBuf.order() == ByteOrder.BIG_ENDIAN;
            int i6 = i4 << 2;
            if (byteBuf.order() == byteBuf2.order()) {
                if (z4) {
                    compareUintBigEndianB = compareUintBigEndian(byteBuf, byteBuf2, readerIndex, readerIndex2, i6);
                } else {
                    compareUintBigEndianB = compareUintLittleEndian(byteBuf, byteBuf2, readerIndex, readerIndex2, i6);
                }
            } else if (z4) {
                compareUintBigEndianB = compareUintBigEndianA(byteBuf, byteBuf2, readerIndex, readerIndex2, i6);
            } else {
                compareUintBigEndianB = compareUintBigEndianB(byteBuf, byteBuf2, readerIndex, readerIndex2, i6);
            }
            if (compareUintBigEndianB != 0) {
                return (int) Math.min(2147483647L, Math.max(-2147483648L, compareUintBigEndianB));
            }
            readerIndex += i6;
            readerIndex2 += i6;
        }
        int i7 = i5 + readerIndex;
        while (readerIndex < i7) {
            int unsignedByte = byteBuf.getUnsignedByte(readerIndex) - byteBuf2.getUnsignedByte(readerIndex2);
            if (unsignedByte != 0) {
                return unsignedByte;
            }
            readerIndex++;
            readerIndex2++;
        }
        return readableBytes - readableBytes2;
    }

    private static long compareUintBigEndian(ByteBuf byteBuf, ByteBuf byteBuf2, int i4, int i5, int i6) {
        int i7 = i6 + i4;
        while (i4 < i7) {
            long unsignedInt = byteBuf.getUnsignedInt(i4) - byteBuf2.getUnsignedInt(i5);
            if (unsignedInt != 0) {
                return unsignedInt;
            }
            i4 += 4;
            i5 += 4;
        }
        return 0L;
    }

    private static long compareUintBigEndianA(ByteBuf byteBuf, ByteBuf byteBuf2, int i4, int i5, int i6) {
        int i7 = i6 + i4;
        while (i4 < i7) {
            long unsignedInt = byteBuf.getUnsignedInt(i4) - byteBuf2.getUnsignedIntLE(i5);
            if (unsignedInt != 0) {
                return unsignedInt;
            }
            i4 += 4;
            i5 += 4;
        }
        return 0L;
    }

    private static long compareUintBigEndianB(ByteBuf byteBuf, ByteBuf byteBuf2, int i4, int i5, int i6) {
        int i7 = i6 + i4;
        while (i4 < i7) {
            long unsignedIntLE = byteBuf.getUnsignedIntLE(i4) - byteBuf2.getUnsignedInt(i5);
            if (unsignedIntLE != 0) {
                return unsignedIntLE;
            }
            i4 += 4;
            i5 += 4;
        }
        return 0L;
    }

    private static long compareUintLittleEndian(ByteBuf byteBuf, ByteBuf byteBuf2, int i4, int i5, int i6) {
        int i7 = i6 + i4;
        while (i4 < i7) {
            long unsignedIntLE = byteBuf.getUnsignedIntLE(i4) - byteBuf2.getUnsignedIntLE(i5);
            if (unsignedIntLE != 0) {
                return unsignedIntLE;
            }
            i4 += 4;
            i5 += 4;
        }
        return 0L;
    }

    public static void copy(AsciiString asciiString, ByteBuf byteBuf) {
        copy(asciiString, 0, byteBuf, asciiString.length());
    }

    public static byte decodeHexByte(CharSequence charSequence, int i4) {
        return StringUtil.decodeHexByte(charSequence, i4);
    }

    public static byte[] decodeHexDump(CharSequence charSequence) {
        return StringUtil.decodeHexDump(charSequence, 0, charSequence.length());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String decodeString(ByteBuf byteBuf, int i4, int i5, Charset charset) {
        byte[] threadLocalTempArray;
        int i6;
        if (i5 == 0) {
            return "";
        }
        if (byteBuf.hasArray()) {
            threadLocalTempArray = byteBuf.array();
            i6 = byteBuf.arrayOffset() + i4;
        } else {
            threadLocalTempArray = threadLocalTempArray(i5);
            byteBuf.getBytes(i4, threadLocalTempArray, 0, i5);
            i6 = 0;
        }
        if (CharsetUtil.US_ASCII.equals(charset)) {
            return new String(threadLocalTempArray, 0, i6, i5);
        }
        return new String(threadLocalTempArray, i6, i5, charset);
    }

    public static ByteBuf encodeString(ByteBufAllocator byteBufAllocator, CharBuffer charBuffer, Charset charset) {
        return encodeString0(byteBufAllocator, false, charBuffer, charset, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ByteBuf encodeString0(ByteBufAllocator byteBufAllocator, boolean z4, CharBuffer charBuffer, Charset charset, int i4) {
        ByteBuf buffer;
        CharsetEncoder encoder = CharsetUtil.encoder(charset);
        double remaining = charBuffer.remaining();
        double maxBytesPerChar = encoder.maxBytesPerChar();
        Double.isNaN(remaining);
        Double.isNaN(maxBytesPerChar);
        int i5 = ((int) (remaining * maxBytesPerChar)) + i4;
        if (z4) {
            buffer = byteBufAllocator.heapBuffer(i5);
        } else {
            buffer = byteBufAllocator.buffer(i5);
        }
        try {
            try {
                ByteBuffer internalNioBuffer = buffer.internalNioBuffer(buffer.readerIndex(), i5);
                int position = internalNioBuffer.position();
                CoderResult encode = encoder.encode(charBuffer, internalNioBuffer, true);
                if (!encode.isUnderflow()) {
                    encode.throwException();
                }
                CoderResult flush = encoder.flush(internalNioBuffer);
                if (!flush.isUnderflow()) {
                    flush.throwException();
                }
                buffer.writerIndex((buffer.writerIndex() + internalNioBuffer.position()) - position);
                return buffer;
            } catch (CharacterCodingException e5) {
                throw new IllegalStateException(e5);
            }
        } catch (Throwable th) {
            buffer.release();
            throw th;
        }
    }

    public static boolean ensureWritableSuccess(int i4) {
        return i4 == 0 || i4 == 2;
    }

    public static boolean equals(ByteBuf byteBuf, int i4, ByteBuf byteBuf2, int i5, int i6) {
        if (i4 >= 0 && i5 >= 0 && i6 >= 0) {
            if (byteBuf.writerIndex() - i6 < i4 || byteBuf2.writerIndex() - i6 < i5) {
                return false;
            }
            int i7 = i6 >>> 3;
            if (byteBuf.order() == byteBuf2.order()) {
                while (i7 > 0) {
                    if (byteBuf.getLong(i4) != byteBuf2.getLong(i5)) {
                        return false;
                    }
                    i4 += 8;
                    i5 += 8;
                    i7--;
                }
            } else {
                while (i7 > 0) {
                    if (byteBuf.getLong(i4) != swapLong(byteBuf2.getLong(i5))) {
                        return false;
                    }
                    i4 += 8;
                    i5 += 8;
                    i7--;
                }
            }
            for (int i8 = i6 & 7; i8 > 0; i8--) {
                if (byteBuf.getByte(i4) != byteBuf2.getByte(i5)) {
                    return false;
                }
                i4++;
                i5++;
            }
            return true;
        }
        throw new IllegalArgumentException("All indexes and lengths must be non-negative");
    }

    private static int firstIndexOf(ByteBuf byteBuf, int i4, int i5, byte b5) {
        int max = Math.max(i4, 0);
        if (max >= i5 || byteBuf.capacity() == 0) {
            return -1;
        }
        return byteBuf.forEachByte(max, i5 - max, new ByteProcessor.IndexOfProcessor(b5));
    }

    public static byte[] getBytes(ByteBuf byteBuf) {
        return getBytes(byteBuf, byteBuf.readerIndex(), byteBuf.readableBytes());
    }

    public static int hashCode(ByteBuf byteBuf) {
        int i4;
        int readableBytes = byteBuf.readableBytes();
        int i5 = readableBytes >>> 2;
        int i6 = readableBytes & 3;
        int readerIndex = byteBuf.readerIndex();
        if (byteBuf.order() == ByteOrder.BIG_ENDIAN) {
            i4 = 1;
            while (i5 > 0) {
                i4 = (i4 * 31) + byteBuf.getInt(readerIndex);
                readerIndex += 4;
                i5--;
            }
        } else {
            i4 = 1;
            while (i5 > 0) {
                i4 = (i4 * 31) + swapInt(byteBuf.getInt(readerIndex));
                readerIndex += 4;
                i5--;
            }
        }
        while (i6 > 0) {
            i4 = (i4 * 31) + byteBuf.getByte(readerIndex);
            i6--;
            readerIndex++;
        }
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public static String hexDump(ByteBuf byteBuf) {
        return hexDump(byteBuf, byteBuf.readerIndex(), byteBuf.readableBytes());
    }

    public static int indexOf(ByteBuf byteBuf, ByteBuf byteBuf2) {
        int readableBytes = (byteBuf2.readableBytes() - byteBuf.readableBytes()) + 1;
        for (int i4 = 0; i4 < readableBytes; i4++) {
            if (equals(byteBuf, byteBuf.readerIndex(), byteBuf2, byteBuf2.readerIndex() + i4, byteBuf.readableBytes())) {
                return byteBuf2.readerIndex() + i4;
            }
        }
        return -1;
    }

    private static boolean isAscii(ByteBuf byteBuf, int i4, int i5) {
        return byteBuf.forEachByte(i4, i5, FIND_NON_ASCII) == -1;
    }

    public static boolean isText(ByteBuf byteBuf, Charset charset) {
        return isText(byteBuf, byteBuf.readerIndex(), byteBuf.readableBytes(), charset);
    }

    private static boolean isUtf8(ByteBuf byteBuf, int i4, int i5) {
        int i6;
        int i7 = i5 + i4;
        while (i4 < i7) {
            int i8 = i4 + 1;
            byte b5 = byteBuf.getByte(i4);
            if ((b5 & 128) == 0) {
                i4 = i8;
            } else if ((b5 & 224) == 192) {
                if (i8 >= i7) {
                    return false;
                }
                int i9 = i8 + 1;
                if ((byteBuf.getByte(i8) & 192) != 128 || (b5 & 255) < 194) {
                    return false;
                }
                i4 = i9;
            } else if ((b5 & 240) != 224) {
                if ((b5 & 248) != 240 || i8 > i7 - 3) {
                    return false;
                }
                int i10 = i8 + 1;
                byte b6 = byteBuf.getByte(i8);
                int i11 = i10 + 1;
                byte b7 = byteBuf.getByte(i10);
                int i12 = i11 + 1;
                byte b8 = byteBuf.getByte(i11);
                if ((b6 & 192) == 128 && (b7 & 192) == 128 && (b8 & 192) == 128 && (i6 = b5 & 255) <= 244 && ((i6 != 240 || (b6 & 255) >= 144) && (i6 != 244 || (b6 & 255) <= 143))) {
                    i4 = i12;
                }
                return false;
            } else if (i8 > i7 - 2) {
                return false;
            } else {
                int i13 = i8 + 1;
                byte b9 = byteBuf.getByte(i8);
                int i14 = i13 + 1;
                byte b10 = byteBuf.getByte(i13);
                if ((b9 & 192) != 128 || (b10 & 192) != 128) {
                    return false;
                }
                int i15 = b5 & 15;
                if (i15 == 0 && (b9 & 255) < 160) {
                    return false;
                }
                if (i15 == 13 && (b9 & 255) > 159) {
                    return false;
                }
                i4 = i14;
            }
        }
        return true;
    }

    private static int lastIndexOf(ByteBuf byteBuf, int i4, int i5, byte b5) {
        int capacity = byteBuf.capacity();
        int min = Math.min(i4, capacity);
        if (min < 0 || capacity == 0) {
            return -1;
        }
        return byteBuf.forEachByteDesc(i5, min - i5, new ByteProcessor.IndexOfProcessor(b5));
    }

    public static String prettyHexDump(ByteBuf byteBuf) {
        return prettyHexDump(byteBuf, byteBuf.readerIndex(), byteBuf.readableBytes());
    }

    public static ByteBuf readBytes(ByteBufAllocator byteBufAllocator, ByteBuf byteBuf, int i4) {
        ByteBuf buffer = byteBufAllocator.buffer(i4);
        try {
            byteBuf.readBytes(buffer);
            return buffer;
        } catch (Throwable th) {
            buffer.release();
            throw th;
        }
    }

    public static int reserveAndWriteUtf8(ByteBuf byteBuf, CharSequence charSequence, int i4) {
        return reserveAndWriteUtf8Seq(byteBuf, charSequence, 0, charSequence.length(), i4);
    }

    private static int reserveAndWriteUtf8Seq(ByteBuf byteBuf, CharSequence charSequence, int i4, int i5, int i6) {
        while (true) {
            if (byteBuf instanceof WrappedCompositeByteBuf) {
                byteBuf = byteBuf.unwrap();
            } else if (byteBuf instanceof AbstractByteBuf) {
                AbstractByteBuf abstractByteBuf = (AbstractByteBuf) byteBuf;
                abstractByteBuf.ensureWritable0(i6);
                int writeUtf8 = writeUtf8(abstractByteBuf, abstractByteBuf.writerIndex, charSequence, i4, i5);
                abstractByteBuf.writerIndex += writeUtf8;
                return writeUtf8;
            } else if (byteBuf instanceof WrappedByteBuf) {
                byteBuf = byteBuf.unwrap();
            } else {
                byte[] bytes = charSequence.subSequence(i4, i5).toString().getBytes(CharsetUtil.UTF_8);
                byteBuf.writeBytes(bytes);
                return bytes.length;
            }
        }
    }

    public static ByteBuf setShortBE(ByteBuf byteBuf, int i4, int i5) {
        return byteBuf.order() == ByteOrder.BIG_ENDIAN ? byteBuf.setShort(i4, i5) : byteBuf.setShortLE(i4, i5);
    }

    public static int swapInt(int i4) {
        return Integer.reverseBytes(i4);
    }

    public static long swapLong(long j4) {
        return Long.reverseBytes(j4);
    }

    public static int swapMedium(int i4) {
        int i5 = ((i4 >>> 16) & 255) | ((i4 << 16) & 16711680) | (65280 & i4);
        return (8388608 & i5) != 0 ? i5 | (-16777216) : i5;
    }

    public static short swapShort(short s4) {
        return Short.reverseBytes(s4);
    }

    public static ByteBuf threadLocalDirectBuffer() {
        if (THREAD_LOCAL_BUFFER_SIZE <= 0) {
            return null;
        }
        if (PlatformDependent.hasUnsafe()) {
            return ThreadLocalUnsafeDirectByteBuf.newInstance();
        }
        return ThreadLocalDirectByteBuf.newInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] threadLocalTempArray(int i4) {
        if (i4 <= 1024) {
            return BYTE_ARRAYS.get();
        }
        return PlatformDependent.allocateUninitializedArray(i4);
    }

    private static int utf8ByteCount(CharSequence charSequence, int i4, int i5) {
        if (charSequence instanceof AsciiString) {
            return i5 - i4;
        }
        int i6 = i4;
        while (i6 < i5 && charSequence.charAt(i6) < 128) {
            i6++;
        }
        int i7 = i6 - i4;
        return i6 < i5 ? i7 + utf8BytesNonAscii(charSequence, i6, i5) : i7;
    }

    public static int utf8Bytes(CharSequence charSequence) {
        return utf8ByteCount(charSequence, 0, charSequence.length());
    }

    private static int utf8BytesNonAscii(CharSequence charSequence, int i4, int i5) {
        int i6 = 0;
        while (i4 < i5) {
            char charAt = charSequence.charAt(i4);
            if (charAt < 2048) {
                i6 += ((127 - charAt) >>> 31) + 1;
            } else if (!StringUtil.isSurrogate(charAt)) {
                i6 += 3;
            } else if (Character.isHighSurrogate(charAt)) {
                i4++;
                if (i4 == i5) {
                    return i6 + 1;
                }
                i6 = !Character.isLowSurrogate(charSequence.charAt(i4)) ? i6 + 2 : i6 + 4;
            } else {
                i6++;
            }
            i4++;
        }
        return i6;
    }

    public static int utf8MaxBytes(int i4) {
        return i4 * MAX_BYTES_PER_CHAR_UTF8;
    }

    public static ByteBuf writeAscii(ByteBufAllocator byteBufAllocator, CharSequence charSequence) {
        ByteBuf buffer = byteBufAllocator.buffer(charSequence.length());
        writeAscii(buffer, charSequence);
        return buffer;
    }

    public static ByteBuf writeMediumBE(ByteBuf byteBuf, int i4) {
        return byteBuf.order() == ByteOrder.BIG_ENDIAN ? byteBuf.writeMedium(i4) : byteBuf.writeMediumLE(i4);
    }

    public static ByteBuf writeShortBE(ByteBuf byteBuf, int i4) {
        return byteBuf.order() == ByteOrder.BIG_ENDIAN ? byteBuf.writeShort(i4) : byteBuf.writeShortLE(i4);
    }

    public static ByteBuf writeUtf8(ByteBufAllocator byteBufAllocator, CharSequence charSequence) {
        ByteBuf buffer = byteBufAllocator.buffer(utf8MaxBytes(charSequence));
        writeUtf8(buffer, charSequence);
        return buffer;
    }

    private static int writeUtf8Surrogate(AbstractByteBuf abstractByteBuf, int i4, char c5, char c6) {
        if (!Character.isLowSurrogate(c6)) {
            int i5 = i4 + 1;
            abstractByteBuf._setByte(i4, 63);
            int i6 = i5 + 1;
            if (Character.isHighSurrogate(c6)) {
                c6 = '?';
            }
            abstractByteBuf._setByte(i5, c6);
            return i6;
        }
        int codePoint = Character.toCodePoint(c5, c6);
        int i7 = i4 + 1;
        abstractByteBuf._setByte(i4, (byte) ((codePoint >> 18) | 240));
        int i8 = i7 + 1;
        abstractByteBuf._setByte(i7, (byte) (((codePoint >> 12) & 63) | 128));
        int i9 = i8 + 1;
        abstractByteBuf._setByte(i8, (byte) (((codePoint >> 6) & 63) | 128));
        int i10 = i9 + 1;
        abstractByteBuf._setByte(i9, (byte) ((codePoint & 63) | 128));
        return i10;
    }

    public static void appendPrettyHexDump(StringBuilder sb, ByteBuf byteBuf, int i4, int i5) {
        HexUtil.appendPrettyHexDump(sb, byteBuf, i4, i5);
    }

    public static void copy(AsciiString asciiString, int i4, ByteBuf byteBuf, int i5, int i6) {
        if (!MathUtil.isOutOfBounds(i4, i6, asciiString.length())) {
            ((ByteBuf) ObjectUtil.checkNotNull(byteBuf, "dst")).setBytes(i5, asciiString.array(), i4 + asciiString.arrayOffset(), i6);
            return;
        }
        throw new IndexOutOfBoundsException("expected: 0 <= srcIdx(" + i4 + ") <= srcIdx + length(" + i6 + ") <= srcLen(" + asciiString.length() + ')');
    }

    public static byte[] decodeHexDump(CharSequence charSequence, int i4, int i5) {
        return StringUtil.decodeHexDump(charSequence, i4, i5);
    }

    public static ByteBuf encodeString(ByteBufAllocator byteBufAllocator, CharBuffer charBuffer, Charset charset, int i4) {
        return encodeString0(byteBufAllocator, false, charBuffer, charset, i4);
    }

    public static byte[] getBytes(ByteBuf byteBuf, int i4, int i5) {
        return getBytes(byteBuf, i4, i5, true);
    }

    public static String hexDump(ByteBuf byteBuf, int i4, int i5) {
        return HexUtil.hexDump(byteBuf, i4, i5);
    }

    public static boolean isText(ByteBuf byteBuf, int i4, int i5, Charset charset) {
        ObjectUtil.checkNotNull(byteBuf, "buf");
        ObjectUtil.checkNotNull(charset, "charset");
        int readerIndex = byteBuf.readerIndex() + byteBuf.readableBytes();
        if (i4 >= 0 && i5 >= 0 && i4 <= readerIndex - i5) {
            if (charset.equals(CharsetUtil.UTF_8)) {
                return isUtf8(byteBuf, i4, i5);
            }
            if (charset.equals(CharsetUtil.US_ASCII)) {
                return isAscii(byteBuf, i4, i5);
            }
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            CharsetDecoder decoder = CharsetUtil.decoder(charset, codingErrorAction, codingErrorAction);
            try {
                if (byteBuf.nioBufferCount() == 1) {
                    decoder.decode(byteBuf.nioBuffer(i4, i5));
                } else {
                    ByteBuf heapBuffer = byteBuf.alloc().heapBuffer(i5);
                    heapBuffer.writeBytes(byteBuf, i4, i5);
                    decoder.decode(heapBuffer.internalNioBuffer(heapBuffer.readerIndex(), i5));
                    heapBuffer.release();
                }
                return true;
            } catch (CharacterCodingException unused) {
                return false;
            }
        }
        throw new IndexOutOfBoundsException("index: " + i4 + " length: " + i5);
    }

    public static String prettyHexDump(ByteBuf byteBuf, int i4, int i5) {
        return HexUtil.prettyHexDump(byteBuf, i4, i5);
    }

    public static int reserveAndWriteUtf8(ByteBuf byteBuf, CharSequence charSequence, int i4, int i5, int i6) {
        return reserveAndWriteUtf8Seq(byteBuf, checkCharSequenceBounds(charSequence, i4, i5), i4, i5, i6);
    }

    public static int utf8Bytes(CharSequence charSequence, int i4, int i5) {
        return utf8ByteCount(checkCharSequenceBounds(charSequence, i4, i5), i4, i5);
    }

    public static int utf8MaxBytes(CharSequence charSequence) {
        return utf8MaxBytes(charSequence.length());
    }

    public static byte[] getBytes(ByteBuf byteBuf, int i4, int i5, boolean z4) {
        int capacity = byteBuf.capacity();
        if (!MathUtil.isOutOfBounds(i4, i5, capacity)) {
            if (!byteBuf.hasArray()) {
                byte[] allocateUninitializedArray = PlatformDependent.allocateUninitializedArray(i5);
                byteBuf.getBytes(i4, allocateUninitializedArray);
                return allocateUninitializedArray;
            } else if (!z4 && i4 == 0 && i5 == capacity) {
                return byteBuf.array();
            } else {
                int arrayOffset = byteBuf.arrayOffset() + i4;
                return Arrays.copyOfRange(byteBuf.array(), arrayOffset, i5 + arrayOffset);
            }
        }
        throw new IndexOutOfBoundsException("expected: 0 <= start(" + i4 + ") <= start + length(" + i5 + ") <= buf.capacity(" + capacity + ')');
    }

    public static String hexDump(byte[] bArr) {
        return hexDump(bArr, 0, bArr.length);
    }

    public static int writeAscii(ByteBuf byteBuf, CharSequence charSequence) {
        int length = charSequence.length();
        if (charSequence instanceof AsciiString) {
            AsciiString asciiString = (AsciiString) charSequence;
            byteBuf.writeBytes(asciiString.array(), asciiString.arrayOffset(), length);
            return length;
        }
        while (true) {
            if (byteBuf instanceof WrappedCompositeByteBuf) {
                byteBuf = byteBuf.unwrap();
            } else if (byteBuf instanceof AbstractByteBuf) {
                AbstractByteBuf abstractByteBuf = (AbstractByteBuf) byteBuf;
                abstractByteBuf.ensureWritable0(length);
                int writeAscii = writeAscii(abstractByteBuf, abstractByteBuf.writerIndex, charSequence, length);
                abstractByteBuf.writerIndex += writeAscii;
                return writeAscii;
            } else if (byteBuf instanceof WrappedByteBuf) {
                byteBuf = byteBuf.unwrap();
            } else {
                byte[] bytes = charSequence.toString().getBytes(CharsetUtil.US_ASCII);
                byteBuf.writeBytes(bytes);
                return bytes.length;
            }
        }
    }

    public static int writeUtf8(ByteBuf byteBuf, CharSequence charSequence) {
        int length = charSequence.length();
        return reserveAndWriteUtf8Seq(byteBuf, charSequence, 0, length, utf8MaxBytes(length));
    }

    public static String hexDump(byte[] bArr, int i4, int i5) {
        return HexUtil.hexDump(bArr, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void readBytes(ByteBufAllocator byteBufAllocator, ByteBuffer byteBuffer, int i4, int i5, OutputStream outputStream) throws IOException {
        if (byteBuffer.hasArray()) {
            outputStream.write(byteBuffer.array(), i4 + byteBuffer.arrayOffset(), i5);
            return;
        }
        int min = Math.min(i5, 8192);
        byteBuffer.clear().position(i4);
        if (i5 > 1024 && byteBufAllocator.isDirectBufferPooled()) {
            ByteBuf heapBuffer = byteBufAllocator.heapBuffer(min);
            try {
                getBytes(byteBuffer, heapBuffer.array(), heapBuffer.arrayOffset(), min, outputStream, i5);
                return;
            } finally {
                heapBuffer.release();
            }
        }
        getBytes(byteBuffer, threadLocalTempArray(min), 0, min, outputStream, i5);
    }

    public static int writeUtf8(ByteBuf byteBuf, CharSequence charSequence, int i4, int i5) {
        checkCharSequenceBounds(charSequence, i4, i5);
        return reserveAndWriteUtf8Seq(byteBuf, charSequence, i4, i5, utf8MaxBytes(i5 - i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class HexUtil {
        private static final char[] BYTE2CHAR = new char[256];
        private static final char[] HEXDUMP_TABLE = new char[1024];
        private static final String[] HEXPADDING = new String[16];
        private static final String[] HEXDUMP_ROWPREFIXES = new String[4096];
        private static final String[] BYTE2HEX = new String[256];
        private static final String[] BYTEPADDING = new String[16];

        static {
            char[] charArray = "0123456789abcdef".toCharArray();
            int i4 = 0;
            for (int i5 = 0; i5 < 256; i5++) {
                char[] cArr = HEXDUMP_TABLE;
                int i6 = i5 << 1;
                cArr[i6] = charArray[(i5 >>> 4) & 15];
                cArr[i6 + 1] = charArray[i5 & 15];
            }
            int i7 = 0;
            while (true) {
                String[] strArr = HEXPADDING;
                if (i7 >= strArr.length) {
                    break;
                }
                int length = strArr.length - i7;
                StringBuilder sb = new StringBuilder(length * 3);
                for (int i8 = 0; i8 < length; i8++) {
                    sb.append("   ");
                }
                HEXPADDING[i7] = sb.toString();
                i7++;
            }
            int i9 = 0;
            while (true) {
                String[] strArr2 = HEXDUMP_ROWPREFIXES;
                if (i9 >= strArr2.length) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder(12);
                sb2.append(StringUtil.NEWLINE);
                sb2.append(Long.toHexString(((i9 << 4) & 4294967295L) | IjkMediaMeta.AV_CH_WIDE_RIGHT));
                sb2.setCharAt(sb2.length() - 9, '|');
                sb2.append('|');
                strArr2[i9] = sb2.toString();
                i9++;
            }
            int i10 = 0;
            while (true) {
                String[] strArr3 = BYTE2HEX;
                if (i10 >= strArr3.length) {
                    break;
                }
                strArr3[i10] = ' ' + StringUtil.byteToHexStringPadded(i10);
                i10++;
            }
            int i11 = 0;
            while (true) {
                String[] strArr4 = BYTEPADDING;
                if (i11 >= strArr4.length) {
                    break;
                }
                int length2 = strArr4.length - i11;
                StringBuilder sb3 = new StringBuilder(length2);
                for (int i12 = 0; i12 < length2; i12++) {
                    sb3.append(' ');
                }
                BYTEPADDING[i11] = sb3.toString();
                i11++;
            }
            while (true) {
                char[] cArr2 = BYTE2CHAR;
                if (i4 >= cArr2.length) {
                    return;
                }
                if (i4 > 31 && i4 < 127) {
                    cArr2[i4] = (char) i4;
                } else {
                    cArr2[i4] = d.f68897a;
                }
                i4++;
            }
        }

        private HexUtil() {
        }

        private static void appendHexDumpRowPrefix(StringBuilder sb, int i4, int i5) {
            String[] strArr = HEXDUMP_ROWPREFIXES;
            if (i4 < strArr.length) {
                sb.append(strArr[i4]);
                return;
            }
            sb.append(StringUtil.NEWLINE);
            sb.append(Long.toHexString((i5 & 4294967295L) | IjkMediaMeta.AV_CH_WIDE_RIGHT));
            sb.setCharAt(sb.length() - 9, '|');
            sb.append('|');
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void appendPrettyHexDump(StringBuilder sb, ByteBuf byteBuf, int i4, int i5) {
            if (MathUtil.isOutOfBounds(i4, i5, byteBuf.capacity())) {
                throw new IndexOutOfBoundsException("expected: 0 <= offset(" + i4 + ") <= offset + length(" + i5 + ") <= buf.capacity(" + byteBuf.capacity() + ')');
            } else if (i5 != 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("         +-------------------------------------------------+");
                String str = StringUtil.NEWLINE;
                sb2.append(str);
                sb2.append("         |  0  1  2  3  4  5  6  7  8  9  a  b  c  d  e  f |");
                sb2.append(str);
                sb2.append("+--------+-------------------------------------------------+----------------+");
                sb.append(sb2.toString());
                int i6 = i5 >>> 4;
                int i7 = i5 & 15;
                for (int i8 = 0; i8 < i6; i8++) {
                    int i9 = (i8 << 4) + i4;
                    appendHexDumpRowPrefix(sb, i8, i9);
                    int i10 = i9 + 16;
                    for (int i11 = i9; i11 < i10; i11++) {
                        sb.append(BYTE2HEX[byteBuf.getUnsignedByte(i11)]);
                    }
                    sb.append(" |");
                    while (i9 < i10) {
                        sb.append(BYTE2CHAR[byteBuf.getUnsignedByte(i9)]);
                        i9++;
                    }
                    sb.append('|');
                }
                if (i7 != 0) {
                    int i12 = (i6 << 4) + i4;
                    appendHexDumpRowPrefix(sb, i6, i12);
                    int i13 = i12 + i7;
                    for (int i14 = i12; i14 < i13; i14++) {
                        sb.append(BYTE2HEX[byteBuf.getUnsignedByte(i14)]);
                    }
                    sb.append(HEXPADDING[i7]);
                    sb.append(" |");
                    while (i12 < i13) {
                        sb.append(BYTE2CHAR[byteBuf.getUnsignedByte(i12)]);
                        i12++;
                    }
                    sb.append(BYTEPADDING[i7]);
                    sb.append('|');
                }
                sb.append(StringUtil.NEWLINE + "+--------+-------------------------------------------------+----------------+");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String hexDump(ByteBuf byteBuf, int i4, int i5) {
            ObjectUtil.checkPositiveOrZero(i5, "length");
            if (i5 == 0) {
                return "";
            }
            int i6 = i4 + i5;
            char[] cArr = new char[i5 << 1];
            int i7 = 0;
            while (i4 < i6) {
                System.arraycopy(HEXDUMP_TABLE, byteBuf.getUnsignedByte(i4) << 1, cArr, i7, 2);
                i4++;
                i7 += 2;
            }
            return new String(cArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String prettyHexDump(ByteBuf byteBuf, int i4, int i5) {
            if (i5 == 0) {
                return "";
            }
            StringBuilder sb = new StringBuilder(((i5 / 16) + ((i5 & 15) == 0 ? 0 : 1) + 4) * 80);
            appendPrettyHexDump(sb, byteBuf, i4, i5);
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String hexDump(byte[] bArr, int i4, int i5) {
            ObjectUtil.checkPositiveOrZero(i5, "length");
            if (i5 == 0) {
                return "";
            }
            int i6 = i4 + i5;
            char[] cArr = new char[i5 << 1];
            int i7 = 0;
            while (i4 < i6) {
                System.arraycopy(HEXDUMP_TABLE, (bArr[i4] & 255) << 1, cArr, i7, 2);
                i4++;
                i7 += 2;
            }
            return new String(cArr);
        }
    }

    public static void copy(AsciiString asciiString, int i4, ByteBuf byteBuf, int i5) {
        if (!MathUtil.isOutOfBounds(i4, i5, asciiString.length())) {
            ((ByteBuf) ObjectUtil.checkNotNull(byteBuf, "dst")).writeBytes(asciiString.array(), i4 + asciiString.arrayOffset(), i5);
            return;
        }
        throw new IndexOutOfBoundsException("expected: 0 <= srcIdx(" + i4 + ") <= srcIdx + length(" + i5 + ") <= srcLen(" + asciiString.length() + ')');
    }

    public static boolean equals(ByteBuf byteBuf, ByteBuf byteBuf2) {
        int readableBytes = byteBuf.readableBytes();
        if (readableBytes != byteBuf2.readableBytes()) {
            return false;
        }
        return equals(byteBuf, byteBuf.readerIndex(), byteBuf2, byteBuf2.readerIndex(), readableBytes);
    }

    public static int indexOf(ByteBuf byteBuf, int i4, int i5, byte b5) {
        if (i4 <= i5) {
            return firstIndexOf(byteBuf, i4, i5, b5);
        }
        return lastIndexOf(byteBuf, i4, i5, b5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int writeUtf8(AbstractByteBuf abstractByteBuf, int i4, CharSequence charSequence, int i5) {
        return writeUtf8(abstractByteBuf, i4, charSequence, 0, i5);
    }

    static int writeUtf8(AbstractByteBuf abstractByteBuf, int i4, CharSequence charSequence, int i5, int i6) {
        int i7 = i4;
        while (true) {
            if (i5 >= i6) {
                break;
            }
            char charAt = charSequence.charAt(i5);
            if (charAt < 128) {
                abstractByteBuf._setByte(i7, (byte) charAt);
                i7++;
            } else if (charAt < 2048) {
                int i8 = i7 + 1;
                abstractByteBuf._setByte(i7, (byte) ((charAt >> 6) | 192));
                i7 = i8 + 1;
                abstractByteBuf._setByte(i8, (byte) ((charAt & '?') | 128));
            } else if (StringUtil.isSurrogate(charAt)) {
                if (Character.isHighSurrogate(charAt)) {
                    i5++;
                    if (i5 == i6) {
                        abstractByteBuf._setByte(i7, 63);
                        i7++;
                        break;
                    }
                    i7 = writeUtf8Surrogate(abstractByteBuf, i7, charAt, charSequence.charAt(i5));
                } else {
                    abstractByteBuf._setByte(i7, 63);
                    i7++;
                }
            } else {
                int i9 = i7 + 1;
                abstractByteBuf._setByte(i7, (byte) ((charAt >> '\f') | Opcodes.SHL_INT_LIT8));
                int i10 = i9 + 1;
                abstractByteBuf._setByte(i9, (byte) ((63 & (charAt >> 6)) | 128));
                abstractByteBuf._setByte(i10, (byte) ((charAt & '?') | 128));
                i7 = i10 + 1;
            }
            i5++;
        }
        return i7 - i4;
    }

    private static void getBytes(ByteBuffer byteBuffer, byte[] bArr, int i4, int i5, OutputStream outputStream, int i6) throws IOException {
        do {
            int min = Math.min(i5, i6);
            byteBuffer.get(bArr, i4, min);
            outputStream.write(bArr, i4, min);
            i6 -= min;
        } while (i6 > 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int writeAscii(AbstractByteBuf abstractByteBuf, int i4, CharSequence charSequence, int i5) {
        int i6 = 0;
        while (i6 < i5) {
            abstractByteBuf._setByte(i4, AsciiString.c2b(charSequence.charAt(i6)));
            i6++;
            i4++;
        }
        return i5;
    }
}
