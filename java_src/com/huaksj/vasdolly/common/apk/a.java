package com.huaksj.vasdolly.common.apk;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: ApkSigningBlockUtils.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final long f14468a = 1048576;

    /* renamed from: b  reason: collision with root package name */
    public static final int f14469b = 4096;

    /* renamed from: c  reason: collision with root package name */
    public static final int f14470c = 1114793335;

    /* renamed from: d  reason: collision with root package name */
    public static final long f14471d = 3617552046287187010L;

    /* renamed from: e  reason: collision with root package name */
    public static final long f14472e = 2334950737559900225L;

    /* renamed from: f  reason: collision with root package name */
    public static final int f14473f = 32;

    private a() {
    }

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static ByteBuffer b(ByteBuffer byteBuffer, int i4) throws SignatureNotFoundException {
        a(byteBuffer);
        ByteBuffer h4 = h(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i5 = 0;
        while (h4.hasRemaining()) {
            i5++;
            if (h4.remaining() >= 8) {
                long j4 = h4.getLong();
                if (j4 >= 4 && j4 <= 2147483647L) {
                    int i6 = (int) j4;
                    int position = h4.position() + i6;
                    if (i6 <= h4.remaining()) {
                        if (h4.getInt() == i4) {
                            return e(h4, i6 - 4);
                        }
                        h4.position(position);
                    } else {
                        throw new SignatureNotFoundException("APK Signing Block entry #" + i5 + " size out of range: " + i6 + ", available: " + h4.remaining());
                    }
                } else {
                    throw new SignatureNotFoundException("APK Signing Block entry #" + i5 + " size out of range: " + j4);
                }
            } else {
                throw new SignatureNotFoundException("Insufficient data to read size of APK Signing Block entry #" + i5);
            }
        }
        throw new SignatureNotFoundException("No block with ID " + i4 + " in APK Signing Block.");
    }

    public static com.huaksj.vasdolly.common.c<ByteBuffer, Long> c(RandomAccessFile randomAccessFile, long j4) throws IOException, SignatureNotFoundException {
        if (j4 >= 32) {
            ByteBuffer allocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            randomAccessFile.seek(j4 - allocate.capacity());
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                long j5 = allocate.getLong(0);
                if (j5 < allocate.capacity() || j5 > 2147483639) {
                    throw new SignatureNotFoundException("APK Signing Block size out of range: " + j5);
                }
                int i4 = (int) (8 + j5);
                long j6 = j4 - i4;
                if (j6 >= 0) {
                    ByteBuffer allocate2 = ByteBuffer.allocate(i4);
                    allocate2.order(byteOrder);
                    randomAccessFile.seek(j6);
                    randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                    long j7 = allocate2.getLong(0);
                    if (j7 == j5) {
                        return com.huaksj.vasdolly.common.c.a(allocate2, Long.valueOf(j6));
                    }
                    throw new SignatureNotFoundException("APK Signing Block sizes in header and footer do not match: " + j7 + " vs " + j5);
                }
                throw new SignatureNotFoundException("APK Signing Block offset out of range: " + j6);
            }
            throw new SignatureNotFoundException("No APK Signing Block before ZIP Central Directory");
        }
        throw new SignatureNotFoundException("APK too small for APK Signing Block. ZIP Central Directory offset: " + j4);
    }

    public static b d(RandomAccessFile randomAccessFile, int i4) throws IOException, SignatureNotFoundException {
        com.huaksj.vasdolly.common.c<ByteBuffer, Long> g4 = g(randomAccessFile);
        ByteBuffer b5 = g4.b();
        long longValue = g4.c().longValue();
        if (!c.i(randomAccessFile, longValue)) {
            long f5 = f(b5, longValue);
            com.huaksj.vasdolly.common.c<ByteBuffer, Long> c5 = c(randomAccessFile, f5);
            return new b(b(c5.b(), i4), c5.c().longValue(), f5, longValue, b5);
        }
        throw new SignatureNotFoundException("ZIP64 APK not supported");
    }

    public static ByteBuffer e(ByteBuffer byteBuffer, int i4) throws BufferUnderflowException {
        if (i4 >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i5 = i4 + position;
            if (i5 >= position && i5 <= limit) {
                byteBuffer.limit(i5);
                try {
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    byteBuffer.position(i5);
                    return slice;
                } finally {
                    byteBuffer.limit(limit);
                }
            }
            throw new BufferUnderflowException();
        }
        throw new IllegalArgumentException("size: " + i4);
    }

    public static long f(ByteBuffer byteBuffer, long j4) throws SignatureNotFoundException {
        long g4 = c.g(byteBuffer);
        if (g4 <= j4) {
            if (c.h(byteBuffer) + g4 == j4) {
                return g4;
            }
            throw new SignatureNotFoundException("ZIP Central Directory is not immediately followed by End of Central Directory");
        }
        throw new SignatureNotFoundException("ZIP Central Directory offset out of range: " + g4 + ". ZIP End of Central Directory offset: " + j4);
    }

    public static com.huaksj.vasdolly.common.c<ByteBuffer, Long> g(RandomAccessFile randomAccessFile) throws IOException, SignatureNotFoundException {
        com.huaksj.vasdolly.common.c<ByteBuffer, Long> c5 = c.c(randomAccessFile);
        if (c5 != null) {
            return c5;
        }
        throw new SignatureNotFoundException("Not an APK file: ZIP End of Central Directory record not found");
    }

    public static ByteBuffer h(ByteBuffer byteBuffer, int i4, int i5) {
        if (i4 < 0) {
            throw new IllegalArgumentException("start: " + i4);
        } else if (i5 >= i4) {
            int capacity = byteBuffer.capacity();
            if (i5 <= byteBuffer.capacity()) {
                int limit = byteBuffer.limit();
                int position = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i5);
                    byteBuffer.position(i4);
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    return slice;
                } finally {
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                }
            }
            throw new IllegalArgumentException("end > capacity: " + i5 + " > " + capacity);
        } else {
            throw new IllegalArgumentException("end < start: " + i5 + " < " + i4);
        }
    }
}
