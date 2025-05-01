package com.kwad.sdk.utils.a;

import com.android.dx.io.Opcodes;
import com.papa91.arc.ext.Log;
import io.netty.handler.codec.memcache.binary.BinaryMemcacheOpcodes;
import java.nio.charset.Charset;
import kotlin.jvm.internal.ByteCompanionObject;
import okio.Utf8;
/* loaded from: classes5.dex */
public final class b {
    public static final Charset UTF_8 = Charset.forName("UTF-8");
    private char[] aSu;
    public byte[] aSv;
    public int position;

    public b(int i4) {
        this(new byte[i4], 0);
    }

    private int C(int i4, int i5) {
        while ((i5 & (-128)) != 0) {
            this.aSv[i4] = (byte) ((i5 & 127) | 128);
            i5 >>>= 7;
            i4++;
        }
        int i6 = i4 + 1;
        this.aSv[i4] = (byte) i5;
        return i6;
    }

    public static int ek(int i4) {
        if ((i4 >> 7) == 0) {
            return 1;
        }
        if ((i4 >> 14) == 0) {
            return 2;
        }
        if ((i4 >> 21) == 0) {
            return 3;
        }
        return (i4 >> 28) == 0 ? 4 : 5;
    }

    private char[] em(int i4) {
        char[] cArr = this.aSu;
        if (cArr == null) {
            if (i4 <= 256) {
                this.aSu = new char[256];
            } else {
                this.aSu = new char[2048];
            }
        } else if (cArr.length < i4) {
            this.aSu = new char[2048];
        }
        return this.aSu;
    }

    private String en(int i4) {
        if (i4 > 2048) {
            return new String(this.aSv, this.position, i4, UTF_8);
        }
        char[] em = em(i4);
        byte[] bArr = this.aSv;
        int i5 = this.position;
        int i6 = i4 + i5;
        int i7 = 0;
        while (i5 < i6) {
            int i8 = i5 + 1;
            byte b5 = bArr[i5];
            if (b5 > 0) {
                em[i7] = (char) (b5 ^ 1);
                i5 = i8;
                i7++;
            } else if (b5 < -32) {
                em[i7] = (char) (((b5 & 31) << 6) | (bArr[i8] & Utf8.REPLACEMENT_BYTE));
                i5 = i8 + 1;
                i7++;
            } else if (b5 < -16) {
                int i9 = i8 + 1;
                int i10 = i9 + 1;
                em[i7] = (char) (((b5 & 15) << 12) | ((bArr[i8] & Utf8.REPLACEMENT_BYTE) << 6) | (bArr[i9] & Utf8.REPLACEMENT_BYTE));
                i5 = i10;
                i7++;
            } else {
                int i11 = i8 + 1;
                int i12 = i11 + 1;
                int i13 = i12 + 1;
                int i14 = ((b5 & 7) << 18) | ((bArr[i8] & Utf8.REPLACEMENT_BYTE) << 12) | ((bArr[i11] & Utf8.REPLACEMENT_BYTE) << 6) | (bArr[i12] & Utf8.REPLACEMENT_BYTE);
                int i15 = i7 + 1;
                em[i7] = (char) ((i14 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                i7 = i15 + 1;
                em[i15] = (char) ((i14 & Log.LogWrapper.MAX_MSG_LEN) + 56320);
                i5 = i13;
            }
        }
        if (i5 <= i6) {
            return new String(em, 0, i7);
        }
        throw new IllegalArgumentException("Invalid String");
    }

    private String eo(int i4) {
        if (i4 > 2048) {
            return new String(this.aSv, this.position, i4, UTF_8);
        }
        char[] em = em(i4);
        byte[] bArr = this.aSv;
        int i5 = this.position;
        int i6 = i4 + i5;
        int i7 = 0;
        while (i5 < i6) {
            int i8 = i5 + 1;
            byte b5 = bArr[i5];
            if (b5 > 0) {
                em[i7] = (char) b5;
                i5 = i8;
                i7++;
            } else if (b5 < -32) {
                em[i7] = (char) (((b5 & 31) << 6) | (bArr[i8] & Utf8.REPLACEMENT_BYTE));
                i5 = i8 + 1;
                i7++;
            } else if (b5 < -16) {
                int i9 = i8 + 1;
                int i10 = i9 + 1;
                em[i7] = (char) (((b5 & 15) << 12) | ((bArr[i8] & Utf8.REPLACEMENT_BYTE) << 6) | (bArr[i9] & Utf8.REPLACEMENT_BYTE));
                i5 = i10;
                i7++;
            } else {
                int i11 = i8 + 1;
                int i12 = i11 + 1;
                int i13 = i12 + 1;
                int i14 = ((b5 & 7) << 18) | ((bArr[i8] & Utf8.REPLACEMENT_BYTE) << 12) | ((bArr[i11] & Utf8.REPLACEMENT_BYTE) << 6) | (bArr[i12] & Utf8.REPLACEMENT_BYTE);
                int i15 = i7 + 1;
                em[i7] = (char) ((i14 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                i7 = i15 + 1;
                em[i15] = (char) ((i14 & Log.LogWrapper.MAX_MSG_LEN) + 56320);
                i5 = i13;
            }
        }
        if (i5 <= i6) {
            return new String(em, 0, i7);
        }
        throw new IllegalArgumentException("Invalid String");
    }

    private long getLong(int i4) {
        byte[] bArr = this.aSv;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        int i9 = i8 + 1;
        int i10 = i9 + 1;
        return (bArr[i10 + 1] << 56) | (bArr[i4] & 255) | ((bArr[i5] & 255) << 8) | ((bArr[i6] & 255) << 16) | ((bArr[i7] & 255) << 24) | ((bArr[i8] & 255) << 32) | ((bArr[i9] & 255) << 40) | ((255 & bArr[i10]) << 48);
    }

    public static int hn(String str) {
        int length = str.length();
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = i4 + 1;
            char charAt = str.charAt(i4);
            if (charAt < 128) {
                i5++;
            } else if (charAt < 2048) {
                i5 += 2;
            } else if (charAt < 55296 || charAt > 57343) {
                i5 += 3;
            } else {
                i4 = i6 + 1;
                i5 += 4;
            }
            i4 = i6;
        }
        return i5;
    }

    private void ho(String str) {
        byte[] bArr = this.aSv;
        int i4 = this.position;
        int length = str.length();
        int i5 = 0;
        while (i5 < length) {
            int i6 = i5 + 1;
            char charAt = str.charAt(i5);
            if (charAt < 128) {
                bArr[i4] = (byte) (charAt ^ 1);
                i5 = i6;
                i4++;
            } else if (charAt < 2048) {
                int i7 = i4 + 1;
                bArr[i4] = (byte) ((charAt >>> 6) | 192);
                i4 = i7 + 1;
                bArr[i7] = (byte) ((charAt & '?') | 128);
                i5 = i6;
            } else if (charAt >= 55296 && charAt <= 57343) {
                int i8 = i6 + 1;
                int charAt2 = ((charAt << '\n') + str.charAt(i6)) - 56613888;
                int i9 = i4 + 1;
                bArr[i4] = (byte) ((charAt2 >>> 18) | 240);
                int i10 = i9 + 1;
                bArr[i9] = (byte) (((charAt2 >>> 12) & 63) | 128);
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i4 = i11 + 1;
                bArr[i11] = (byte) ((charAt2 & 63) | 128);
                i5 = i8;
            } else {
                int i12 = i4 + 1;
                bArr[i4] = (byte) ((charAt >>> '\f') | Opcodes.SHL_INT_LIT8);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (((charAt >>> 6) & 63) | 128);
                bArr[i13] = (byte) ((charAt & '?') | 128);
                i5 = i6;
                i4 = i13 + 1;
            }
        }
        this.position = i4;
    }

    public static byte[] hp(String str) {
        byte[] bArr = new byte[hn(str)];
        int length = str.length();
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = i4 + 1;
            char charAt = str.charAt(i4);
            if (charAt < 128) {
                bArr[i5] = (byte) (charAt ^ 1);
                i4 = i6;
                i5++;
            } else if (charAt < 2048) {
                int i7 = i5 + 1;
                bArr[i5] = (byte) ((charAt >>> 6) | 192);
                i5 = i7 + 1;
                bArr[i7] = (byte) ((charAt & '?') | 128);
                i4 = i6;
            } else if (charAt >= 55296 && charAt <= 57343) {
                int i8 = i6 + 1;
                int charAt2 = ((charAt << '\n') + str.charAt(i6)) - 56613888;
                int i9 = i5 + 1;
                bArr[i5] = (byte) ((charAt2 >>> 18) | 240);
                int i10 = i9 + 1;
                bArr[i9] = (byte) (((charAt2 >>> 12) & 63) | 128);
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i5 = i11 + 1;
                bArr[i11] = (byte) ((charAt2 & 63) | 128);
                i4 = i8;
            } else {
                int i12 = i5 + 1;
                bArr[i5] = (byte) ((charAt >>> '\f') | Opcodes.SHL_INT_LIT8);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (((charAt >>> 6) & 63) | 128);
                bArr[i13] = (byte) ((charAt & '?') | 128);
                i4 = i6;
                i5 = i13 + 1;
            }
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String j(byte[] bArr, int i4) {
        char[] cArr = new char[bArr.length];
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4) {
            int i7 = i5 + 1;
            byte b5 = bArr[i5];
            if (b5 > 0) {
                cArr[i6] = (char) (b5 ^ 1);
                i5 = i7;
                i6++;
            } else if (b5 < -32) {
                cArr[i6] = (char) (((b5 & 31) << 6) | (bArr[i7] & Utf8.REPLACEMENT_BYTE));
                i5 = i7 + 1;
                i6++;
            } else if (b5 < -16) {
                int i8 = i7 + 1;
                int i9 = i8 + 1;
                cArr[i6] = (char) (((b5 & 15) << 12) | ((bArr[i7] & Utf8.REPLACEMENT_BYTE) << 6) | (bArr[i8] & Utf8.REPLACEMENT_BYTE));
                i5 = i9;
                i6++;
            } else {
                int i10 = i7 + 1;
                int i11 = i10 + 1;
                int i12 = i11 + 1;
                int i13 = ((b5 & 7) << 18) | ((bArr[i7] & Utf8.REPLACEMENT_BYTE) << 12) | ((bArr[i10] & Utf8.REPLACEMENT_BYTE) << 6) | (bArr[i11] & Utf8.REPLACEMENT_BYTE);
                int i14 = i6 + 1;
                cArr[i6] = (char) ((i13 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                i6 = i14 + 1;
                cArr[i14] = (char) ((i13 & Log.LogWrapper.MAX_MSG_LEN) + 56320);
                i5 = i12;
            }
        }
        if (i5 <= i4) {
            return new String(cArr, 0, i6);
        }
        throw new IllegalArgumentException("Invalid String");
    }

    public final void B(int i4, int i5) {
        byte[] bArr = this.aSv;
        int i6 = i4 + 1;
        bArr[i4] = (byte) i5;
        int i7 = i6 + 1;
        bArr[i6] = (byte) (i5 >> 8);
        bArr[i7] = (byte) (i5 >> 16);
        bArr[i7 + 1] = (byte) (i5 >> 24);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long D(int i4, int i5) {
        long j4 = 0;
        if (i5 <= 0) {
            return 0L;
        }
        int i6 = i5 >> 3;
        int i7 = i5 & 7;
        int i8 = 0;
        int i9 = i4;
        for (int i10 = 0; i10 < i6; i10++) {
            j4 ^= getLong(i9);
            i9 += 8;
        }
        int i11 = i7 << 3;
        while (i8 < i11) {
            j4 ^= (this.aSv[i9] & 255) << i8;
            i8 += 8;
            i9++;
        }
        int i12 = (i4 & 7) << 3;
        return (j4 >>> (64 - i12)) | (j4 << i12);
    }

    public final int Of() {
        byte[] bArr = this.aSv;
        int i4 = this.position;
        int i5 = i4 + 1;
        this.position = i5;
        byte b5 = bArr[i4];
        if ((b5 >> 7) == 0) {
            return b5;
        }
        int i6 = b5 & ByteCompanionObject.MAX_VALUE;
        int i7 = i5 + 1;
        this.position = i7;
        int i8 = i6 | (bArr[i5] << 7);
        if ((i8 >> 14) == 0) {
            return i8;
        }
        int i9 = i7 + 1;
        this.position = i9;
        int i10 = (i8 & 16383) | (bArr[i7] << 14);
        if ((i10 >> 21) == 0) {
            return i10;
        }
        int i11 = i9 + 1;
        this.position = i11;
        int i12 = (i10 & 2097151) | (bArr[i9] << BinaryMemcacheOpcodes.INCREMENTQ);
        if ((i12 >> 28) == 0) {
            return i12;
        }
        this.position = i11 + 1;
        return (bArr[i11] << BinaryMemcacheOpcodes.TOUCH) | (i12 & 268435455);
    }

    public final void a(short s4) {
        byte[] bArr = this.aSv;
        int i4 = this.position;
        int i5 = i4 + 1;
        this.position = i5;
        bArr[i4] = (byte) s4;
        this.position = i5 + 1;
        bArr[i5] = (byte) (s4 >> 8);
    }

    public final void aO(long j4) {
        f(this.position, j4);
        this.position += 8;
    }

    public final void e(byte b5) {
        byte[] bArr = this.aSv;
        int i4 = this.position;
        this.position = i4 + 1;
        bArr[i4] = b5;
    }

    public final void ei(int i4) {
        byte[] bArr = this.aSv;
        int i5 = this.position;
        int i6 = i5 + 1;
        this.position = i6;
        bArr[i5] = (byte) i4;
        int i7 = i6 + 1;
        this.position = i7;
        bArr[i6] = (byte) (i4 >> 8);
        int i8 = i7 + 1;
        this.position = i8;
        bArr[i7] = (byte) (i4 >> 16);
        this.position = i8 + 1;
        bArr[i8] = (byte) (i4 >> 24);
    }

    public final void ej(int i4) {
        this.position = C(this.position, i4);
    }

    public final String el(int i4) {
        if (i4 < 0) {
            return null;
        }
        if (i4 == 0) {
            return "";
        }
        String eo = eo(i4);
        this.position += i4;
        return eo;
    }

    public final void f(int i4, long j4) {
        byte[] bArr = this.aSv;
        int i5 = i4 + 1;
        bArr[i4] = (byte) j4;
        int i6 = i5 + 1;
        bArr[i5] = (byte) (j4 >> 8);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (j4 >> 16);
        int i8 = i7 + 1;
        bArr[i7] = (byte) (j4 >> 24);
        int i9 = i8 + 1;
        bArr[i8] = (byte) (j4 >> 32);
        int i10 = i9 + 1;
        bArr[i9] = (byte) (j4 >> 40);
        bArr[i10] = (byte) (j4 >> 48);
        bArr[i10 + 1] = (byte) (j4 >> 56);
    }

    public final byte get() {
        byte[] bArr = this.aSv;
        int i4 = this.position;
        this.position = i4 + 1;
        return bArr[i4];
    }

    public final byte[] getBytes(int i4) {
        byte[] bArr = new byte[i4];
        System.arraycopy(this.aSv, this.position, bArr, 0, i4);
        this.position += i4;
        return bArr;
    }

    public final double getDouble() {
        return Double.longBitsToDouble(getLong());
    }

    public final float getFloat() {
        return Float.intBitsToFloat(getInt());
    }

    public final int getInt() {
        byte[] bArr = this.aSv;
        int i4 = this.position;
        int i5 = i4 + 1;
        this.position = i5;
        int i6 = i5 + 1;
        this.position = i6;
        int i7 = (bArr[i4] & 255) | ((bArr[i5] & 255) << 8);
        int i8 = i6 + 1;
        this.position = i8;
        int i9 = i7 | ((bArr[i6] & 255) << 16);
        this.position = i8 + 1;
        return (bArr[i8] << BinaryMemcacheOpcodes.FLUSHQ) | i9;
    }

    public final short getShort() {
        byte[] bArr = this.aSv;
        int i4 = this.position;
        int i5 = i4 + 1;
        this.position = i5;
        this.position = i5 + 1;
        return (short) ((bArr[i5] << 8) | (bArr[i4] & 255));
    }

    public final String getString(int i4) {
        if (i4 < 0) {
            return null;
        }
        if (i4 == 0) {
            return "";
        }
        String en = en(i4);
        this.position += i4;
        return en;
    }

    public final void hm(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        ho(str);
    }

    public final void n(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, this.aSv, this.position, length);
            this.position += length;
        }
    }

    public b(byte[] bArr) {
        this(bArr, 0);
    }

    public final long getLong() {
        long j4 = getLong(this.position);
        this.position += 8;
        return j4;
    }

    public b(byte[] bArr, int i4) {
        this.aSu = null;
        this.aSv = bArr;
        this.position = i4;
    }
}
