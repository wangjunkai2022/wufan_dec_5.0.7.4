package com.xinzhu.overmind.utils;

import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;
/* compiled from: EncodedBuffer.java */
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: l  reason: collision with root package name */
    private static final String f68318l = "EncodedBuffer";

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<byte[]> f68319a;

    /* renamed from: b  reason: collision with root package name */
    private final int f68320b;

    /* renamed from: c  reason: collision with root package name */
    private int f68321c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f68322d;

    /* renamed from: e  reason: collision with root package name */
    private int f68323e;

    /* renamed from: f  reason: collision with root package name */
    private int f68324f;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f68325g;

    /* renamed from: h  reason: collision with root package name */
    private int f68326h;

    /* renamed from: i  reason: collision with root package name */
    private int f68327i;

    /* renamed from: j  reason: collision with root package name */
    private int f68328j;

    /* renamed from: k  reason: collision with root package name */
    private int f68329k;

    public h() {
        this(0);
    }

    private static int K(int i4) {
        return (i4 >> 31) ^ (i4 << 1);
    }

    private static long L(long j4) {
        return (j4 >> 63) ^ (j4 << 1);
    }

    private static int b(String str, String str2, int i4, byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (i5 % 16 == 0) {
                if (i5 != 0) {
                    stringBuffer = new StringBuffer();
                }
                stringBuffer.append(str2);
                stringBuffer.append('[');
                stringBuffer.append(i4 + i5);
                stringBuffer.append(']');
                stringBuffer.append(' ');
            } else {
                stringBuffer.append(' ');
            }
            byte b5 = bArr[i5];
            byte b6 = (byte) ((b5 >> 4) & 15);
            if (b6 < 10) {
                stringBuffer.append((char) (b6 + 48));
            } else {
                stringBuffer.append((char) (b6 + 87));
            }
            byte b7 = (byte) (b5 & 15);
            if (b7 < 10) {
                stringBuffer.append((char) (b7 + 48));
            } else {
                stringBuffer.append((char) (b7 + 87));
            }
        }
        return length;
    }

    public static void c(String str, String str2, byte[] bArr) {
        b(str, str2, 0, bArr);
    }

    public static int i(int i4) {
        if ((i4 & (-128)) == 0) {
            return 1;
        }
        if ((i4 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i4) == 0) {
            return 3;
        }
        return (i4 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int j(long j4) {
        if (((-128) & j4) == 0) {
            return 1;
        }
        if (((-16384) & j4) == 0) {
            return 2;
        }
        if (((-2097152) & j4) == 0) {
            return 3;
        }
        if (((-268435456) & j4) == 0) {
            return 4;
        }
        if (((-34359738368L) & j4) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j4) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j4) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j4) == 0) {
            return 8;
        }
        return (j4 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int k(int i4) {
        return i(K(i4));
    }

    public static int l(long j4) {
        return j(L(j4));
    }

    private void s() {
        int i4 = this.f68324f + 1;
        this.f68324f = i4;
        if (i4 >= this.f68321c) {
            byte[] bArr = new byte[this.f68320b];
            this.f68322d = bArr;
            this.f68319a.add(bArr);
            this.f68321c++;
        } else {
            this.f68322d = this.f68319a.get(i4);
        }
        this.f68323e = 0;
    }

    public void A(int i4, int i5) {
        if (this.f68328j >= 0) {
            if (i4 >= r()) {
                if (i4 + i5 > this.f68329k) {
                    throw new IllegalArgumentException("Trying to move more data than there is -- srcOffset=" + i4 + " size=" + i5 + " " + g());
                } else if (i5 == 0) {
                    return;
                } else {
                    int i6 = this.f68324f;
                    int i7 = this.f68320b;
                    int i8 = this.f68323e;
                    if (i4 == (i6 * i7) + i8) {
                        if (i5 <= i7 - i8) {
                            this.f68323e = i8 + i5;
                            return;
                        }
                        int i9 = i5 - (i7 - i8);
                        int i10 = i9 % i7;
                        this.f68323e = i10;
                        if (i10 == 0) {
                            this.f68323e = i7;
                            this.f68324f = i6 + (i9 / i7);
                        } else {
                            this.f68324f = i6 + (i9 / i7) + 1;
                        }
                        this.f68322d = this.f68319a.get(this.f68324f);
                        return;
                    }
                    int i11 = i4 / i7;
                    byte[] bArr = this.f68319a.get(i11);
                    int i12 = i4 % this.f68320b;
                    while (i5 > 0) {
                        if (this.f68323e >= this.f68320b) {
                            s();
                        }
                        if (i12 >= this.f68320b) {
                            i11++;
                            bArr = this.f68319a.get(i11);
                            i12 = 0;
                        }
                        int i13 = this.f68320b;
                        int min = Math.min(i5, Math.min(i13 - this.f68323e, i13 - i12));
                        System.arraycopy(bArr, i12, this.f68322d, this.f68323e, min);
                        this.f68323e += min;
                        i12 += min;
                        i5 -= min;
                    }
                    return;
                }
            }
            throw new IllegalArgumentException("Can only move forward in the buffer -- srcOffset=" + i4 + " size=" + i5 + " " + g());
        }
        throw new IllegalStateException("writeFromThisBuffer before startEditing");
    }

    public void B(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        C(bArr, 0, bArr.length);
    }

    public void C(byte[] bArr, int i4, int i5) {
        if (bArr == null) {
            return;
        }
        int i6 = this.f68320b;
        int i7 = this.f68323e;
        int i8 = i5 < i6 - i7 ? i5 : i6 - i7;
        if (i8 > 0) {
            System.arraycopy(bArr, i4, this.f68322d, i7, i8);
            this.f68323e += i8;
            i5 -= i8;
            i4 += i8;
        }
        while (i5 > 0) {
            s();
            int i9 = this.f68320b;
            if (i5 < i9) {
                i9 = i5;
            }
            System.arraycopy(bArr, i4, this.f68322d, this.f68323e, i9);
            this.f68323e += i9;
            i5 -= i9;
            i4 += i9;
        }
    }

    public void D(byte b5) {
        if (this.f68323e >= this.f68320b) {
            s();
        }
        byte[] bArr = this.f68322d;
        int i4 = this.f68323e;
        this.f68323e = i4 + 1;
        bArr[i4] = b5;
    }

    public void E(int i4) {
        D((byte) i4);
        D((byte) (i4 >> 8));
        D((byte) (i4 >> 16));
        D((byte) (i4 >> 24));
    }

    public void F(long j4) {
        D((byte) j4);
        D((byte) (j4 >> 8));
        D((byte) (j4 >> 16));
        D((byte) (j4 >> 24));
        D((byte) (j4 >> 32));
        D((byte) (j4 >> 40));
        D((byte) (j4 >> 48));
        D((byte) (j4 >> 56));
    }

    public void G(int i4) {
        while ((i4 & (-128)) != 0) {
            D((byte) ((i4 & 127) | 128));
            i4 >>>= 7;
        }
        D((byte) i4);
    }

    public void H(long j4) {
        while (((-128) & j4) != 0) {
            D((byte) ((127 & j4) | 128));
            j4 >>>= 7;
        }
        D((byte) j4);
    }

    public void I(int i4) {
        G(K(i4));
    }

    public void J(long j4) {
        H(L(j4));
    }

    public void a(String str) {
        int size = this.f68319a.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += b(str, "{" + i5 + "} ", i4, this.f68319a.get(i5));
        }
    }

    public void d(int i4, int i5) {
        int i6 = this.f68320b;
        this.f68319a.get(i4 / this.f68320b)[i4 % i6] = (byte) i5;
        int i7 = i4 + 1;
        int i8 = this.f68320b;
        this.f68319a.get(i7 / i6)[i7 % i8] = (byte) (i5 >> 8);
        int i9 = i4 + 2;
        int i10 = this.f68320b;
        this.f68319a.get(i9 / i8)[i9 % i10] = (byte) (i5 >> 16);
        int i11 = i4 + 3;
        this.f68319a.get(i11 / i10)[i11 % this.f68320b] = (byte) (i5 >> 24);
    }

    public byte[] e(int i4) {
        byte[] bArr = new byte[i4];
        int i5 = i4 / this.f68320b;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i5) {
            System.arraycopy(this.f68319a.get(i6), 0, bArr, i7, this.f68320b);
            i7 += this.f68320b;
            i6++;
        }
        int i8 = i4 - (i5 * this.f68320b);
        if (i8 > 0) {
            System.arraycopy(this.f68319a.get(i6), 0, bArr, i7, i8);
        }
        return bArr;
    }

    public int f() {
        return this.f68319a.size();
    }

    public String g() {
        return "EncodedBuffer( mChunkSize=" + this.f68320b + " mBuffers.size=" + this.f68319a.size() + " mBufferCount=" + this.f68321c + " mWriteIndex=" + this.f68323e + " mWriteBufIndex=" + this.f68324f + " mReadBufIndex=" + this.f68326h + " mReadIndex=" + this.f68327i + " mReadableSize=" + this.f68329k + " mReadLimit=" + this.f68328j + " )";
    }

    public int h(int i4) {
        int i5 = this.f68320b;
        int i6 = i4 + 1;
        int i7 = this.f68320b;
        int i8 = i4 + 2;
        int i9 = this.f68320b;
        int i10 = (this.f68319a.get(i4 / this.f68320b)[i4 % i5] & 255) | ((this.f68319a.get(i6 / i5)[i6 % i7] & 255) << 8) | ((this.f68319a.get(i8 / i7)[i8 % i9] & 255) << 16);
        int i11 = i4 + 3;
        return ((this.f68319a.get(i11 / i9)[i11 % this.f68320b] & 255) << 24) | i10;
    }

    public int m() {
        return (this.f68326h * this.f68320b) + this.f68327i;
    }

    public int n() {
        return this.f68329k;
    }

    public int o() {
        return ((this.f68321c - 1) * this.f68320b) + this.f68323e;
    }

    public int p() {
        return this.f68324f;
    }

    public int q() {
        return this.f68323e;
    }

    public int r() {
        return (this.f68324f * this.f68320b) + this.f68323e;
    }

    public byte t() {
        int i4 = this.f68326h;
        int i5 = this.f68321c;
        if (i4 <= i5 && (i4 != i5 - 1 || this.f68327i < this.f68328j)) {
            if (this.f68327i >= this.f68320b) {
                int i6 = i4 + 1;
                this.f68326h = i6;
                this.f68325g = this.f68319a.get(i6);
                this.f68327i = 0;
            }
            byte[] bArr = this.f68325g;
            int i7 = this.f68327i;
            this.f68327i = i7 + 1;
            return bArr[i7];
        }
        throw new IndexOutOfBoundsException("Trying to read too much data mReadBufIndex=" + this.f68326h + " mBufferCount=" + this.f68321c + " mReadIndex=" + this.f68327i + " mReadLimit=" + this.f68328j);
    }

    public int u() {
        return (t() & 255) | ((t() & 255) << 8) | ((t() & 255) << 16) | ((t() & 255) << 24);
    }

    public long v() {
        int i4 = 0;
        long j4 = 0;
        do {
            byte t4 = t();
            j4 |= (t4 & ByteCompanionObject.MAX_VALUE) << i4;
            if ((t4 & 128) == 0) {
                return j4;
            }
            i4 += 7;
        } while (i4 <= 64);
        throw new RuntimeException("Varint too long -- " + g());
    }

    public void w() {
        this.f68325g = this.f68319a.get(0);
        this.f68326h = 0;
        this.f68327i = 0;
    }

    public void x(int i4) {
        if (i4 <= r()) {
            int i5 = this.f68320b;
            int i6 = i4 / i5;
            this.f68324f = i6;
            int i7 = i4 % i5;
            this.f68323e = i7;
            if (i7 == 0 && i6 != 0) {
                this.f68323e = i5;
                this.f68324f = i6 - 1;
            }
            this.f68322d = this.f68319a.get(this.f68324f);
            return;
        }
        throw new RuntimeException("rewindWriteTo only can go backwards" + i4);
    }

    public void y(int i4) {
        if (i4 < 0) {
            throw new RuntimeException("skipRead with negative amount=" + i4);
        } else if (i4 == 0) {
        } else {
            int i5 = this.f68320b;
            int i6 = this.f68327i;
            if (i4 <= i5 - i6) {
                this.f68327i = i6 + i4;
                return;
            }
            int i7 = i4 - (i5 - i6);
            int i8 = i7 % i5;
            this.f68327i = i8;
            if (i8 == 0) {
                this.f68327i = i5;
                this.f68326h += i7 / i5;
            } else {
                this.f68326h += (i7 / i5) + 1;
            }
            this.f68325g = this.f68319a.get(this.f68326h);
        }
    }

    public void z() {
        int i4 = this.f68324f * this.f68320b;
        int i5 = this.f68323e;
        this.f68329k = i4 + i5;
        this.f68328j = i5;
        byte[] bArr = this.f68319a.get(0);
        this.f68322d = bArr;
        this.f68323e = 0;
        this.f68324f = 0;
        this.f68325g = bArr;
        this.f68326h = 0;
        this.f68327i = 0;
    }

    public h(int i4) {
        ArrayList<byte[]> arrayList = new ArrayList<>();
        this.f68319a = arrayList;
        this.f68328j = -1;
        this.f68329k = -1;
        i4 = i4 <= 0 ? 8192 : i4;
        this.f68320b = i4;
        byte[] bArr = new byte[i4];
        this.f68322d = bArr;
        arrayList.add(bArr);
        this.f68321c = 1;
    }
}
