package net.lingala.zip4j.util;

import io.netty.handler.codec.http2.Http2CodecUtil;
import java.io.DataInput;
import java.io.IOException;
import java.util.Objects;
import net.lingala.zip4j.exception.ZipException;
/* compiled from: Raw.java */
/* loaded from: classes7.dex */
public class f {
    public static byte a(int[] iArr) throws ZipException {
        if (iArr != null) {
            if (iArr.length == 8) {
                if (b(iArr)) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < iArr.length; i5++) {
                        double d5 = i4;
                        double pow = Math.pow(2.0d, i5);
                        double d6 = iArr[i5];
                        Double.isNaN(d6);
                        Double.isNaN(d5);
                        i4 = (int) (d5 + (pow * d6));
                    }
                    return (byte) i4;
                }
                throw new ZipException("invalid bits provided, bits contain other values than 0 or 1");
            }
            throw new ZipException("invalid bit array length, cannot calculate byte");
        }
        throw new ZipException("bit array is null, cannot calculate byte from bits");
    }

    private static boolean b(int[] iArr) {
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (iArr[i4] != 0 && iArr[i4] != 1) {
                return false;
            }
        }
        return true;
    }

    public static byte[] c(char[] cArr) {
        Objects.requireNonNull(cArr);
        byte[] bArr = new byte[cArr.length];
        for (int i4 = 0; i4 < cArr.length; i4++) {
            bArr[i4] = (byte) cArr[i4];
        }
        return bArr;
    }

    public static void d(byte[] bArr, int i4, int i5) {
        bArr[0] = (byte) i4;
        bArr[1] = (byte) (i4 >> 8);
        bArr[2] = (byte) (i4 >> 16);
        bArr[3] = (byte) (i4 >> 24);
        bArr[4] = 0;
        bArr[5] = 0;
        bArr[6] = 0;
        bArr[7] = 0;
        bArr[8] = 0;
        bArr[9] = 0;
        bArr[10] = 0;
        bArr[11] = 0;
        bArr[12] = 0;
        bArr[13] = 0;
        bArr[14] = 0;
        bArr[15] = 0;
    }

    public static int e(byte[] bArr, int i4) {
        return ((((bArr[i4 + 3] & 255) << 8) | (bArr[i4 + 2] & 255)) << 16) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8);
    }

    public static int f(DataInput dataInput, byte[] bArr) throws ZipException {
        try {
            dataInput.readFully(bArr, 0, 4);
            return (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((((bArr[3] & 255) << 8) | (bArr[2] & 255)) << 16);
        } catch (IOException e5) {
            throw new ZipException(e5);
        }
    }

    public static long g(byte[] bArr, int i4) {
        return (bArr[i4] & 255) | (((((((((((((((bArr[i4 + 7] & 255) | 0) << 8) | (bArr[i4 + 6] & 255)) << 8) | (bArr[i4 + 5] & 255)) << 8) | (bArr[i4 + 4] & 255)) << 8) | (bArr[i4 + 3] & 255)) << 8) | (bArr[i4 + 2] & 255)) << 8) | (bArr[i4 + 1] & 255)) << 8);
    }

    public static final short h(byte[] bArr, int i4) {
        return (short) ((bArr[i4 + 1] & 255) | ((short) (((short) ((bArr[i4] & 255) | 0)) << 8)));
    }

    public static int i(byte[] bArr, int i4) {
        return ((bArr[i4 + 1] & 255) << 8) | (bArr[i4] & 255);
    }

    public static byte[] j(int i4) {
        return new byte[]{(byte) i4, (byte) (i4 >> 8), (byte) (i4 >> 16), (byte) (i4 >> 24)};
    }

    public static byte[] k(int i4, int i5) {
        byte[] bArr = new byte[i5];
        byte[] j4 = j(i4);
        for (int i6 = 0; i6 < j4.length && i6 < i5; i6++) {
            bArr[i6] = j4[i6];
        }
        return bArr;
    }

    public static final void l(byte[] bArr, int i4, int i5) {
        bArr[i4 + 3] = (byte) (i5 >>> 24);
        bArr[i4 + 2] = (byte) (i5 >>> 16);
        bArr[i4 + 1] = (byte) (i5 >>> 8);
        bArr[i4] = (byte) (i5 & 255);
    }

    public static void m(byte[] bArr, int i4, long j4) {
        bArr[i4 + 7] = (byte) (j4 >>> 56);
        bArr[i4 + 6] = (byte) (j4 >>> 48);
        bArr[i4 + 5] = (byte) (j4 >>> 40);
        bArr[i4 + 4] = (byte) (j4 >>> 32);
        bArr[i4 + 3] = (byte) (j4 >>> 24);
        bArr[i4 + 2] = (byte) (j4 >>> 16);
        bArr[i4 + 1] = (byte) (j4 >>> 8);
        bArr[i4] = (byte) (j4 & 255);
    }

    public static final void n(byte[] bArr, int i4, short s4) {
        bArr[i4 + 1] = (byte) (s4 >>> 8);
        bArr[i4] = (byte) (s4 & Http2CodecUtil.MAX_UNSIGNED_BYTE);
    }
}
