package com.huaksj.vasdolly.common.apk;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UShort;
/* compiled from: ZipUtils.java */
/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f14479a = 22;

    /* renamed from: b  reason: collision with root package name */
    private static final int f14480b = 101010256;

    /* renamed from: c  reason: collision with root package name */
    private static final int f14481c = 12;

    /* renamed from: d  reason: collision with root package name */
    private static final int f14482d = 16;

    /* renamed from: e  reason: collision with root package name */
    private static final int f14483e = 20;

    /* renamed from: f  reason: collision with root package name */
    private static final int f14484f = 20;

    /* renamed from: g  reason: collision with root package name */
    private static final int f14485g = 1347094023;

    /* renamed from: h  reason: collision with root package name */
    private static final int f14486h = 65535;

    private c() {
    }

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static int b(ByteBuffer byteBuffer) {
        a(byteBuffer);
        int capacity = byteBuffer.capacity();
        if (capacity < 22) {
            return -1;
        }
        int i4 = capacity - 22;
        int min = Math.min(i4, 65535);
        for (int i5 = 0; i5 <= min; i5++) {
            int i6 = i4 - i5;
            if (byteBuffer.getInt(i6) == f14480b && e(byteBuffer, i6 + 20) == i5) {
                return i6;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.huaksj.vasdolly.common.c<ByteBuffer, Long> c(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        com.huaksj.vasdolly.common.c<ByteBuffer, Long> d5 = d(randomAccessFile, 0);
        return d5 != null ? d5 : d(randomAccessFile, 65535);
    }

    private static com.huaksj.vasdolly.common.c<ByteBuffer, Long> d(RandomAccessFile randomAccessFile, int i4) throws IOException {
        if (i4 >= 0 && i4 <= 65535) {
            long length = randomAccessFile.length();
            if (length < 22) {
                return null;
            }
            ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i4, length - 22)) + 22);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            long capacity = length - allocate.capacity();
            randomAccessFile.seek(capacity);
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            int b5 = b(allocate);
            if (b5 == -1) {
                return null;
            }
            allocate.position(b5);
            ByteBuffer slice = allocate.slice();
            slice.order(byteOrder);
            return com.huaksj.vasdolly.common.c.a(slice, Long.valueOf(capacity + b5));
        }
        throw new IllegalArgumentException("maxCommentSize: " + i4);
    }

    public static int e(ByteBuffer byteBuffer, int i4) {
        return byteBuffer.getShort(i4) & UShort.MAX_VALUE;
    }

    public static long f(ByteBuffer byteBuffer, int i4) {
        return byteBuffer.getInt(i4) & 4294967295L;
    }

    public static long g(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return f(byteBuffer, byteBuffer.position() + 16);
    }

    public static long h(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return f(byteBuffer, byteBuffer.position() + 12);
    }

    public static final boolean i(RandomAccessFile randomAccessFile, long j4) throws IOException {
        long j5 = j4 - 20;
        if (j5 < 0) {
            return false;
        }
        randomAccessFile.seek(j5);
        return randomAccessFile.readInt() == f14485g;
    }

    private static void j(ByteBuffer byteBuffer, int i4, long j4) {
        if (j4 >= 0 && j4 <= 4294967295L) {
            byteBuffer.putInt(byteBuffer.position() + i4, (int) j4);
            return;
        }
        throw new IllegalArgumentException("uint32 value of out range: " + j4);
    }

    public static void k(ByteBuffer byteBuffer, long j4) {
        a(byteBuffer);
        j(byteBuffer, byteBuffer.position() + 16, j4);
    }
}
