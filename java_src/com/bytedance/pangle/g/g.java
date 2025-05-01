package com.bytedance.pangle.g;

import java.io.FileDescriptor;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.ArrayList;
/* loaded from: classes2.dex */
abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f8403a = new byte[8];

    /* loaded from: classes2.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f8404a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f8405b;

        a(ByteBuffer byteBuffer, byte[] bArr) {
            this.f8404a = byteBuffer;
            this.f8405b = bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b implements j {

        /* renamed from: a  reason: collision with root package name */
        private int f8406a;

        /* renamed from: b  reason: collision with root package name */
        private final ByteBuffer f8407b;

        /* renamed from: c  reason: collision with root package name */
        private final MessageDigest f8408c;

        /* renamed from: d  reason: collision with root package name */
        private final byte[] f8409d;

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f8410e;

        /* synthetic */ b(byte[] bArr, ByteBuffer byteBuffer, byte b5) {
            this(bArr, byteBuffer);
        }

        @Override // com.bytedance.pangle.g.j
        public final void a(ByteBuffer byteBuffer) {
            byteBuffer.position();
            int remaining = byteBuffer.remaining();
            while (remaining > 0) {
                int min = Math.min(remaining, 4096 - this.f8406a);
                byteBuffer.limit(byteBuffer.position() + min);
                this.f8408c.update(byteBuffer);
                remaining -= min;
                int i4 = this.f8406a + min;
                this.f8406a = i4;
                if (i4 == 4096) {
                    MessageDigest messageDigest = this.f8408c;
                    byte[] bArr = this.f8409d;
                    messageDigest.digest(bArr, 0, bArr.length);
                    this.f8407b.put(this.f8409d);
                    this.f8408c.update(this.f8410e);
                    this.f8406a = 0;
                }
            }
        }

        final void b() {
            int position = this.f8407b.position() % 4096;
            if (position == 0) {
                return;
            }
            this.f8407b.put(ByteBuffer.allocate(4096 - position));
        }

        private b(byte[] bArr, ByteBuffer byteBuffer) {
            this.f8409d = new byte[32];
            this.f8410e = bArr;
            this.f8407b = byteBuffer.slice();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.f8408c = messageDigest;
            messageDigest.update(bArr);
            this.f8406a = 0;
        }

        public final void a() {
            if (this.f8406a == 0) {
                return;
            }
            throw new IllegalStateException("Buffer is not empty: " + this.f8406a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(RandomAccessFile randomAccessFile, m mVar, i iVar) {
        int[] a5 = a(randomAccessFile.length() - (mVar.f8418c - mVar.f8417b));
        int i4 = a5[a5.length - 1];
        int i5 = i4 + 4096;
        ByteBuffer a6 = iVar.a(i5);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        a6.order(byteOrder);
        ByteBuffer a7 = a(a6, 0, i4);
        int i6 = i4 + 64;
        ByteBuffer a8 = a(a6, i4, i6);
        ByteBuffer a9 = a(a6, i6, i5);
        byte[] bArr = new byte[32];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(byteOrder);
        long j4 = mVar.f8417b;
        if (j4 % 4096 == 0) {
            long j5 = mVar.f8418c;
            if ((j5 - j4) % 4096 == 0) {
                long j6 = j5 - j4;
                int[] a10 = a(randomAccessFile.length() - j6);
                if (a7 != null) {
                    wrap.put(a(randomAccessFile, mVar, f8403a, a10, a7));
                    wrap.flip();
                }
                if (a8 != null) {
                    a8.order(byteOrder);
                    long length = randomAccessFile.length();
                    byte[] bArr2 = f8403a;
                    if (bArr2.length == 8) {
                        a8.put("TrueBrew".getBytes());
                        a8.put((byte) 1);
                        a8.put((byte) 0);
                        a8.put((byte) 12);
                        a8.put((byte) 7);
                        a8.putShort((short) 1);
                        a8.putShort((short) 1);
                        a8.putInt(0);
                        a8.putInt(0);
                        a8.putLong(length);
                        a8.put((byte) 2);
                        a8.put((byte) 0);
                        a8.put(bArr2);
                        a(a8, 22);
                        a8.flip();
                    } else {
                        throw new IllegalArgumentException("salt is not 8 bytes long");
                    }
                }
                if (a9 != null) {
                    a9.order(byteOrder);
                    long j7 = mVar.f8417b;
                    long j8 = mVar.f8419d;
                    a9.putInt(24);
                    a9.putShort((short) 1);
                    a(a9, 2);
                    a9.putLong(j7);
                    a9.putLong(j6);
                    a9.putInt(20);
                    a9.putShort((short) 2);
                    a(a9, 2);
                    a9.putLong(j8 + 16);
                    a9.putInt(c(j7));
                    a(a9, 4);
                    a9.flip();
                }
                a6.position(i6 + a9.limit());
                a6.putInt(a9.limit() + 64 + 4);
                a6.flip();
                return new a(a6, bArr);
            }
            throw new IllegalArgumentException("Size of APK Signing Block is not a multiple of 4096: " + (mVar.f8418c - mVar.f8417b));
        }
        throw new IllegalArgumentException("APK Signing Block does not start at the page  boundary: " + mVar.f8417b);
    }

    private static long b(long j4) {
        return ((j4 + 4096) - 1) / 4096;
    }

    private static int c(long j4) {
        int i4 = (int) j4;
        if (i4 == j4) {
            return i4;
        }
        throw new ArithmeticException("integer overflow");
    }

    private static void a(j jVar, k kVar, int i4) {
        long a5 = kVar.a();
        long j4 = 0;
        while (a5 > 0) {
            int min = (int) Math.min(a5, i4);
            kVar.a(jVar, j4, min);
            long j5 = min;
            j4 += j5;
            a5 -= j5;
        }
    }

    private static byte[] a(RandomAccessFile randomAccessFile, m mVar, byte[] bArr, int[] iArr, ByteBuffer byteBuffer) {
        b bVar = new b(bArr, a(byteBuffer, iArr[iArr.length - 2], iArr[iArr.length - 1]), (byte) 0);
        a(bVar, new l(randomAccessFile.getFD(), 0L, mVar.f8417b), 1048576);
        long j4 = mVar.f8419d + 16;
        FileDescriptor fd = randomAccessFile.getFD();
        long j5 = mVar.f8418c;
        a(bVar, new l(fd, j5, j4 - j5), 1048576);
        ByteBuffer order = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
        order.putInt(c(mVar.f8417b));
        order.flip();
        bVar.a(order);
        long j6 = j4 + 4;
        a(bVar, new l(randomAccessFile.getFD(), j6, randomAccessFile.length() - j6), 1048576);
        int length = (int) (randomAccessFile.length() % 4096);
        if (length != 0) {
            bVar.a(ByteBuffer.allocate(4096 - length));
        }
        bVar.a();
        bVar.b();
        for (int length2 = iArr.length - 3; length2 >= 0; length2--) {
            int i4 = length2 + 1;
            ByteBuffer a5 = a(byteBuffer, iArr[i4], iArr[length2 + 2]);
            ByteBuffer a6 = a(byteBuffer, iArr[length2], iArr[i4]);
            h hVar = new h(a5);
            b bVar2 = new b(bArr, a6, (byte) 0);
            a(bVar2, hVar, 4096);
            bVar2.a();
            bVar2.b();
        }
        byte[] bArr2 = new byte[32];
        b bVar3 = new b(bArr, ByteBuffer.wrap(bArr2), (byte) 0);
        bVar3.a(a(byteBuffer, 0, 4096));
        bVar3.a();
        return bArr2;
    }

    private static int[] a(long j4) {
        ArrayList arrayList = new ArrayList();
        do {
            j4 = b(j4) * 32;
            arrayList.add(Long.valueOf(b(j4) * 4096));
        } while (j4 > 4096);
        int[] iArr = new int[arrayList.size() + 1];
        int i4 = 0;
        iArr[0] = 0;
        while (i4 < arrayList.size()) {
            int i5 = i4 + 1;
            iArr[i5] = iArr[i4] + c(((Long) arrayList.get((arrayList.size() - i4) - 1)).longValue());
            i4 = i5;
        }
        return iArr;
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i4, int i5) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(0);
        duplicate.limit(i5);
        duplicate.position(i4);
        return duplicate.slice();
    }

    private static void a(ByteBuffer byteBuffer, int i4) {
        byteBuffer.position(byteBuffer.position() + i4);
    }
}
