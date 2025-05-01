package com.bytedance.pangle.g;

import android.util.ArrayMap;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
final class f {

    /* renamed from: a  reason: collision with root package name */
    static final HashMap<String, SparseArray<m>> f8401a = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a implements j {

        /* renamed from: a  reason: collision with root package name */
        private final MessageDigest[] f8402a;

        a(MessageDigest[] messageDigestArr) {
            this.f8402a = messageDigestArr;
        }

        @Override // com.bytedance.pangle.g.j
        public final void a(ByteBuffer byteBuffer) {
            MessageDigest[] messageDigestArr;
            ByteBuffer slice = byteBuffer.slice();
            for (MessageDigest messageDigest : this.f8402a) {
                slice.position(0);
                messageDigest.update(slice);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(api = 21)
    public static void a(Map<Integer, byte[]> map, RandomAccessFile randomAccessFile, m mVar) {
        if (!map.isEmpty()) {
            ArrayMap arrayMap = new ArrayMap();
            boolean z4 = true;
            if (map.containsKey(1)) {
                arrayMap.put(1, map.get(1));
            }
            if (map.containsKey(2)) {
                arrayMap.put(2, map.get(2));
            }
            boolean z5 = false;
            if (!arrayMap.isEmpty()) {
                try {
                    a(arrayMap, randomAccessFile.getFD(), mVar);
                    z4 = false;
                } catch (IOException e5) {
                    throw new SecurityException("Cannot get FD", e5);
                }
            }
            if (map.containsKey(3)) {
                try {
                    if (!Arrays.equals(a(map.get(3), randomAccessFile.length(), mVar), g.a(randomAccessFile, mVar, new i() { // from class: com.bytedance.pangle.g.f.1
                        @Override // com.bytedance.pangle.g.i
                        public final ByteBuffer a(int i4) {
                            return ByteBuffer.allocate(i4);
                        }
                    }).f8405b)) {
                        throw new SecurityException("APK verity digest of contents did not verify");
                    }
                } catch (IOException | DigestException | NoSuchAlgorithmException e6) {
                    throw new SecurityException("Error during verification", e6);
                }
            } else {
                z5 = z4;
            }
            if (z5) {
                throw new SecurityException("No known digest exists for integrity check");
            }
            return;
        }
        throw new SecurityException("No digests provided");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    return "SHA-256";
                }
                throw new IllegalArgumentException("Unknown content digest algorthm: ".concat(String.valueOf(i4)));
            }
            return "SHA-512";
        }
        return "SHA-256";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(int i4) {
        if (i4 == 513 || i4 == 514) {
            return "EC";
        }
        if (i4 != 769) {
            if (i4 != 1057) {
                if (i4 != 1059) {
                    if (i4 != 1061) {
                        switch (i4) {
                            case 257:
                            case com.join.mgps.socket.fight.arena.a.f54751i /* 258 */:
                            case 259:
                            case 260:
                                return "RSA";
                            default:
                                throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i4 & (-1)));
                        }
                    }
                    return "DSA";
                }
                return "EC";
            }
            return "RSA";
        }
        return "DSA";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Pair<String, ? extends AlgorithmParameterSpec> d(int i4) {
        if (i4 != 513) {
            if (i4 != 514) {
                if (i4 != 769) {
                    if (i4 != 1057) {
                        if (i4 != 1059) {
                            if (i4 != 1061) {
                                switch (i4) {
                                    case 257:
                                        return Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                                    case com.join.mgps.socket.fight.arena.a.f54751i /* 258 */:
                                        return Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                                    case 259:
                                        break;
                                    case 260:
                                        return Pair.create("SHA512withRSA", null);
                                    default:
                                        throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i4 & (-1)));
                                }
                            }
                        }
                    }
                    return Pair.create("SHA256withRSA", null);
                }
                return Pair.create("SHA256withDSA", null);
            }
            return Pair.create("SHA512withECDSA", null);
        }
        return Pair.create("SHA256withECDSA", null);
    }

    private static int e(int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    return 32;
                }
                throw new IllegalArgumentException("Unknown content digest algorthm: ".concat(String.valueOf(i4)));
            }
            return 64;
        }
        return 32;
    }

    private static ByteBuffer b(ByteBuffer byteBuffer, int i4) {
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
        throw new IllegalArgumentException("size: ".concat(String.valueOf(i4)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] b(ByteBuffer byteBuffer) {
        int i4 = byteBuffer.getInt();
        if (i4 >= 0) {
            if (i4 <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i4];
                byteBuffer.get(bArr);
                return bArr;
            }
            throw new IOException("Underflow while reading length-prefixed value. Length: " + i4 + ", available: " + byteBuffer.remaining());
        }
        throw new IOException("Negative length");
    }

    private static void a(Map<Integer, byte[]> map, FileDescriptor fileDescriptor, m mVar) {
        l lVar = new l(fileDescriptor, 0L, mVar.f8417b);
        long j4 = mVar.f8418c;
        l lVar2 = new l(fileDescriptor, j4, mVar.f8419d - j4);
        ByteBuffer duplicate = mVar.f8420e.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        long j5 = mVar.f8417b;
        s.a(duplicate);
        int position = duplicate.position() + 16;
        if (j5 >= 0 && j5 <= 4294967295L) {
            duplicate.putInt(duplicate.position() + position, (int) j5);
            h hVar = new h(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            int i4 = 0;
            for (Integer num : map.keySet()) {
                iArr[i4] = num.intValue();
                i4++;
            }
            try {
                byte[][] a5 = a(iArr, new k[]{lVar, lVar2, hVar});
                for (int i5 = 0; i5 < size; i5++) {
                    int i6 = iArr[i5];
                    if (!MessageDigest.isEqual(map.get(Integer.valueOf(i6)), a5[i5])) {
                        throw new SecurityException(b(i6) + " digest of contents did not verify");
                    }
                }
                return;
            } catch (DigestException e5) {
                throw new SecurityException("Failed to compute digest(s) of contents", e5);
            }
        }
        throw new IllegalArgumentException("uint32 value of out range: ".concat(String.valueOf(j5)));
    }

    private static byte[][] a(int[] iArr, k[] kVarArr) {
        int i4;
        long j4;
        MessageDigest messageDigest;
        long j5 = 0;
        long j6 = 0;
        int i5 = 0;
        while (true) {
            i4 = 3;
            j4 = 1048576;
            if (i5 >= 3) {
                break;
            }
            j6 += ((kVarArr[i5].a() + 1048576) - 1) / 1048576;
            i5++;
        }
        if (j6 < 2097151) {
            int i6 = (int) j6;
            byte[][] bArr = new byte[iArr.length];
            for (int i7 = 0; i7 < iArr.length; i7++) {
                byte[] bArr2 = new byte[(e(iArr[i7]) * i6) + 5];
                bArr2[0] = 90;
                a(i6, bArr2);
                bArr[i7] = bArr2;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            int length = iArr.length;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            for (int i8 = 0; i8 < iArr.length; i8++) {
                String b5 = b(iArr[i8]);
                try {
                    messageDigestArr[i8] = MessageDigest.getInstance(b5);
                } catch (NoSuchAlgorithmException e5) {
                    throw new RuntimeException(b5 + " digest not supported", e5);
                }
            }
            a aVar = new a(messageDigestArr);
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (i9 < i4) {
                k kVar = kVarArr[i9];
                long j7 = j5;
                int i12 = i11;
                a aVar2 = aVar;
                long a5 = kVar.a();
                while (a5 > j5) {
                    int min = (int) Math.min(a5, j4);
                    a(min, bArr3);
                    for (int i13 = 0; i13 < length; i13++) {
                        messageDigestArr[i13].update(bArr3);
                    }
                    a aVar3 = aVar2;
                    long j8 = j7;
                    try {
                        kVar.a(aVar3, j8, min);
                        aVar2 = aVar3;
                        k kVar2 = kVar;
                        int i14 = 0;
                        while (i14 < iArr.length) {
                            int i15 = iArr[i14];
                            byte[] bArr4 = bArr3;
                            byte[] bArr5 = bArr[i14];
                            int e6 = e(i15);
                            int i16 = length;
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigestArr[i14].digest(bArr5, (i12 * e6) + 5, e6);
                            if (digest != e6) {
                                throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                            }
                            i14++;
                            bArr3 = bArr4;
                            length = i16;
                            messageDigestArr = messageDigestArr2;
                        }
                        long j9 = min;
                        long j10 = j8 + j9;
                        a5 -= j9;
                        i12++;
                        j5 = 0;
                        j4 = 1048576;
                        kVar = kVar2;
                        bArr3 = bArr3;
                        j7 = j10;
                    } catch (IOException e7) {
                        throw new DigestException("Failed to digest chunk #" + i12 + " of section #" + i10, e7);
                    }
                }
                i10++;
                i9++;
                i11 = i12;
                aVar = aVar2;
                j5 = 0;
                i4 = 3;
                j4 = 1048576;
            }
            byte[][] bArr6 = new byte[iArr.length];
            for (int i17 = 0; i17 < iArr.length; i17++) {
                int i18 = iArr[i17];
                byte[] bArr7 = bArr[i17];
                String b6 = b(i18);
                try {
                    bArr6[i17] = MessageDigest.getInstance(b6).digest(bArr7);
                } catch (NoSuchAlgorithmException e8) {
                    throw new RuntimeException(b6 + " digest not supported", e8);
                }
            }
            return bArr6;
        }
        throw new DigestException("Too many chunks: ".concat(String.valueOf(j6)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] a(byte[] bArr, long j4, m mVar) {
        if (bArr.length == 40) {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.position(32);
            if (order.getLong() == j4 - (mVar.f8418c - mVar.f8417b)) {
                return Arrays.copyOfRange(bArr, 0, 32);
            }
            throw new SecurityException("APK content size did not verify");
        }
        throw new SecurityException("Verity digest size is wrong: " + bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i4, int i5) {
        int a5 = a(i4);
        int a6 = a(i5);
        if (a5 == 1) {
            if (a6 != 1) {
                if (a6 == 2 || a6 == 3) {
                    return -1;
                }
                throw new IllegalArgumentException("Unknown digestAlgorithm2: ".concat(String.valueOf(a6)));
            }
            return 0;
        } else if (a5 == 2) {
            if (a6 != 1) {
                if (a6 == 2) {
                    return 0;
                }
                if (a6 != 3) {
                    throw new IllegalArgumentException("Unknown digestAlgorithm2: ".concat(String.valueOf(a6)));
                }
            }
            return 1;
        } else if (a5 == 3) {
            if (a6 != 1) {
                if (a6 != 2) {
                    if (a6 == 3) {
                        return 0;
                    }
                    throw new IllegalArgumentException("Unknown digestAlgorithm2: ".concat(String.valueOf(a6)));
                }
                return -1;
            }
            return 1;
        } else {
            throw new IllegalArgumentException("Unknown digestAlgorithm1: ".concat(String.valueOf(a5)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i4) {
        if (i4 != 513) {
            if (i4 != 514) {
                if (i4 != 769) {
                    if (i4 == 1057 || i4 == 1059 || i4 == 1061) {
                        return 3;
                    }
                    switch (i4) {
                        case 257:
                        case 259:
                            return 1;
                        case com.join.mgps.socket.fight.arena.a.f54751i /* 258 */:
                        case 260:
                            return 2;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i4 & (-1)));
                    }
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i4) {
        if (i4 >= 8) {
            int capacity = byteBuffer.capacity();
            if (i4 <= byteBuffer.capacity()) {
                int limit = byteBuffer.limit();
                int position = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i4);
                    byteBuffer.position(8);
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    return slice;
                } finally {
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                }
            }
            throw new IllegalArgumentException("end > capacity: " + i4 + " > " + capacity);
        }
        throw new IllegalArgumentException("end < start: " + i4 + " < 8");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ByteBuffer a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= 4) {
            int i4 = byteBuffer.getInt();
            if (i4 >= 0) {
                if (i4 <= byteBuffer.remaining()) {
                    return b(byteBuffer, i4);
                }
                throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i4 + ", remaining: " + byteBuffer.remaining());
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
    }

    private static void a(int i4, byte[] bArr) {
        bArr[1] = (byte) (i4 & 255);
        bArr[2] = (byte) ((i4 >>> 8) & 255);
        bArr[3] = (byte) ((i4 >>> 16) & 255);
        bArr[4] = (byte) ((i4 >>> 24) & 255);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r24, java.io.RandomAccessFile r25, int... r26) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.g.f.a(java.lang.String, java.io.RandomAccessFile, int[]):void");
    }
}
