package com.papa.gsyvideoplayer.utils;
/* compiled from: AnimatedGifEncoder.java */
/* loaded from: classes5.dex */
class m {
    protected static final int A = 6;
    protected static final int B = 64;
    protected static final int C = 2048;
    protected static final int D = 30;
    protected static final int E = 10;
    protected static final int F = 1024;
    protected static final int G = 8;
    protected static final int H = 256;
    protected static final int I = 18;
    protected static final int J = 262144;

    /* renamed from: j  reason: collision with root package name */
    protected static final int f58553j = 256;

    /* renamed from: k  reason: collision with root package name */
    protected static final int f58554k = 499;

    /* renamed from: l  reason: collision with root package name */
    protected static final int f58555l = 491;

    /* renamed from: m  reason: collision with root package name */
    protected static final int f58556m = 487;

    /* renamed from: n  reason: collision with root package name */
    protected static final int f58557n = 503;

    /* renamed from: o  reason: collision with root package name */
    protected static final int f58558o = 1509;

    /* renamed from: p  reason: collision with root package name */
    protected static final int f58559p = 255;

    /* renamed from: q  reason: collision with root package name */
    protected static final int f58560q = 4;

    /* renamed from: r  reason: collision with root package name */
    protected static final int f58561r = 100;

    /* renamed from: s  reason: collision with root package name */
    protected static final int f58562s = 16;

    /* renamed from: t  reason: collision with root package name */
    protected static final int f58563t = 65536;

    /* renamed from: u  reason: collision with root package name */
    protected static final int f58564u = 10;

    /* renamed from: v  reason: collision with root package name */
    protected static final int f58565v = 1024;

    /* renamed from: w  reason: collision with root package name */
    protected static final int f58566w = 10;

    /* renamed from: x  reason: collision with root package name */
    protected static final int f58567x = 64;

    /* renamed from: y  reason: collision with root package name */
    protected static final int f58568y = 65536;

    /* renamed from: z  reason: collision with root package name */
    protected static final int f58569z = 32;

    /* renamed from: a  reason: collision with root package name */
    protected int f58570a;

    /* renamed from: b  reason: collision with root package name */
    protected byte[] f58571b;

    /* renamed from: c  reason: collision with root package name */
    protected int f58572c;

    /* renamed from: d  reason: collision with root package name */
    protected int f58573d;

    /* renamed from: f  reason: collision with root package name */
    protected int[] f58575f = new int[256];

    /* renamed from: g  reason: collision with root package name */
    protected int[] f58576g = new int[256];

    /* renamed from: h  reason: collision with root package name */
    protected int[] f58577h = new int[256];

    /* renamed from: i  reason: collision with root package name */
    protected int[] f58578i = new int[32];

    /* renamed from: e  reason: collision with root package name */
    protected int[][] f58574e = new int[256];

    public m(byte[] bArr, int i4, int i5) {
        this.f58571b = bArr;
        this.f58572c = i4;
        this.f58573d = i5;
        for (int i6 = 0; i6 < 256; i6++) {
            int[][] iArr = this.f58574e;
            iArr[i6] = new int[4];
            int[] iArr2 = iArr[i6];
            int i7 = (i6 << 12) / 256;
            iArr2[2] = i7;
            iArr2[1] = i7;
            iArr2[0] = i7;
            this.f58577h[i6] = 256;
            this.f58576g[i6] = 0;
        }
    }

    protected void a(int i4, int i5, int i6, int i7, int i8) {
        int i9 = i5 - i4;
        if (i9 < -1) {
            i9 = -1;
        }
        int i10 = i5 + i4;
        if (i10 > 256) {
            i10 = 256;
        }
        int i11 = i5 + 1;
        int i12 = i5 - 1;
        int i13 = 1;
        while (true) {
            if (i11 >= i10 && i12 <= i9) {
                return;
            }
            int i14 = i13 + 1;
            int i15 = this.f58578i[i13];
            if (i11 < i10) {
                int i16 = i11 + 1;
                int[] iArr = this.f58574e[i11];
                try {
                    iArr[0] = iArr[0] - (((iArr[0] - i6) * i15) / 262144);
                    iArr[1] = iArr[1] - (((iArr[1] - i7) * i15) / 262144);
                    iArr[2] = iArr[2] - (((iArr[2] - i8) * i15) / 262144);
                } catch (Exception unused) {
                }
                i11 = i16;
            }
            if (i12 > i9) {
                int i17 = i12 - 1;
                int[] iArr2 = this.f58574e[i12];
                try {
                    iArr2[0] = iArr2[0] - (((iArr2[0] - i6) * i15) / 262144);
                    iArr2[1] = iArr2[1] - (((iArr2[1] - i7) * i15) / 262144);
                    iArr2[2] = iArr2[2] - ((i15 * (iArr2[2] - i8)) / 262144);
                } catch (Exception unused2) {
                }
                i13 = i14;
                i12 = i17;
            } else {
                i13 = i14;
            }
        }
    }

    protected void b(int i4, int i5, int i6, int i7, int i8) {
        int[] iArr = this.f58574e[i5];
        iArr[0] = iArr[0] - (((iArr[0] - i6) * i4) / 1024);
        iArr[1] = iArr[1] - (((iArr[1] - i7) * i4) / 1024);
        iArr[2] = iArr[2] - ((i4 * (iArr[2] - i8)) / 1024);
    }

    public byte[] c() {
        byte[] bArr = new byte[768];
        int[] iArr = new int[256];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr[this.f58574e[i4][3]] = i4;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < 256) {
            int i7 = iArr[i5];
            int i8 = i6 + 1;
            int[][] iArr2 = this.f58574e;
            bArr[i6] = (byte) iArr2[i7][0];
            int i9 = i8 + 1;
            bArr[i8] = (byte) iArr2[i7][1];
            bArr[i9] = (byte) iArr2[i7][2];
            i5++;
            i6 = i9 + 1;
        }
        return bArr;
    }

    protected int d(int i4, int i5, int i6) {
        int i7 = Integer.MAX_VALUE;
        int i8 = Integer.MAX_VALUE;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < 256; i11++) {
            int[] iArr = this.f58574e[i11];
            int i12 = iArr[0] - i4;
            if (i12 < 0) {
                i12 = -i12;
            }
            int i13 = iArr[1] - i5;
            if (i13 < 0) {
                i13 = -i13;
            }
            int i14 = i12 + i13;
            int i15 = iArr[2] - i6;
            if (i15 < 0) {
                i15 = -i15;
            }
            int i16 = i14 + i15;
            if (i16 < i7) {
                i9 = i11;
                i7 = i16;
            }
            int[] iArr2 = this.f58576g;
            int i17 = i16 - (iArr2[i11] >> 12);
            if (i17 < i8) {
                i10 = i11;
                i8 = i17;
            }
            int[] iArr3 = this.f58577h;
            int i18 = iArr3[i11] >> 10;
            iArr3[i11] = iArr3[i11] - i18;
            iArr2[i11] = iArr2[i11] + (i18 << 10);
        }
        int[] iArr4 = this.f58577h;
        iArr4[i9] = iArr4[i9] + 64;
        int[] iArr5 = this.f58576g;
        iArr5[i9] = iArr5[i9] - 65536;
        return i10;
    }

    public void e() {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < 256) {
            int[] iArr = this.f58574e[i4];
            int i7 = iArr[1];
            int i8 = i4 + 1;
            int i9 = i4;
            for (int i10 = i8; i10 < 256; i10++) {
                int[] iArr2 = this.f58574e[i10];
                if (iArr2[1] < i7) {
                    i7 = iArr2[1];
                    i9 = i10;
                }
            }
            int[] iArr3 = this.f58574e[i9];
            if (i4 != i9) {
                int i11 = iArr3[0];
                iArr3[0] = iArr[0];
                iArr[0] = i11;
                int i12 = iArr3[1];
                iArr3[1] = iArr[1];
                iArr[1] = i12;
                int i13 = iArr3[2];
                iArr3[2] = iArr[2];
                iArr[2] = i13;
                int i14 = iArr3[3];
                iArr3[3] = iArr[3];
                iArr[3] = i14;
            }
            if (i7 != i5) {
                this.f58575f[i5] = (i6 + i4) >> 1;
                while (true) {
                    i5++;
                    if (i5 >= i7) {
                        break;
                    }
                    this.f58575f[i5] = i4;
                }
                i6 = i4;
                i5 = i7;
            }
            i4 = i8;
        }
        this.f58575f[i5] = (i6 + 255) >> 1;
        for (int i15 = i5 + 1; i15 < 256; i15++) {
            this.f58575f[i15] = 255;
        }
    }

    public void f() {
        int i4;
        int i5 = this.f58572c;
        if (i5 < f58558o) {
            this.f58573d = 1;
        }
        int i6 = this.f58573d;
        this.f58570a = ((i6 - 1) / 3) + 30;
        byte[] bArr = this.f58571b;
        int i7 = i5 / (i6 * 3);
        int i8 = i7 / 100;
        for (int i9 = 0; i9 < 32; i9++) {
            this.f58578i[i9] = 1024 * (((1024 - (i9 * i9)) * 256) / 1024);
        }
        int i10 = this.f58572c;
        if (i10 < f58558o) {
            i4 = 3;
        } else if (i10 % f58554k != 0) {
            i4 = 1497;
        } else if (i10 % f58555l != 0) {
            i4 = 1473;
        } else {
            i4 = i10 % f58556m != 0 ? 1461 : f58558o;
        }
        int i11 = i8;
        int i12 = 0;
        int i13 = 2048;
        int i14 = 32;
        int i15 = 1024;
        int i16 = 0;
        while (i12 < i7) {
            int i17 = (bArr[i16 + 0] & 255) << 4;
            int i18 = (bArr[i16 + 1] & 255) << 4;
            int i19 = (bArr[i16 + 2] & 255) << 4;
            int d5 = d(i17, i18, i19);
            int i20 = i12;
            b(i15, d5, i17, i18, i19);
            if (i14 != 0) {
                a(i14, d5, i17, i18, i19);
            }
            int i21 = i16 + i4;
            if (i21 >= i5) {
                i21 -= this.f58572c;
            }
            i16 = i21;
            i12 = i20 + 1;
            if (i11 == 0) {
                i11 = 1;
            }
            if (i12 % i11 == 0) {
                i15 -= i15 / this.f58570a;
                i13 -= i13 / 30;
                int i22 = i13 >> 6;
                i14 = i22 <= 1 ? 0 : i22;
                for (int i23 = 0; i23 < i14; i23++) {
                    int i24 = i14 * i14;
                    this.f58578i[i23] = (((i24 - (i23 * i23)) * 256) / i24) * i15;
                }
            }
        }
    }

    public int g(int i4, int i5, int i6) {
        int i7 = this.f58575f[i5];
        int i8 = i7 - 1;
        int i9 = 1000;
        int i10 = -1;
        while (true) {
            if (i7 >= 256 && i8 < 0) {
                return i10;
            }
            if (i7 < 256) {
                int[] iArr = this.f58574e[i7];
                int i11 = iArr[1] - i5;
                if (i11 >= i9) {
                    i7 = 256;
                } else {
                    i7++;
                    if (i11 < 0) {
                        i11 = -i11;
                    }
                    int i12 = iArr[0] - i4;
                    if (i12 < 0) {
                        i12 = -i12;
                    }
                    int i13 = i11 + i12;
                    if (i13 < i9) {
                        int i14 = iArr[2] - i6;
                        if (i14 < 0) {
                            i14 = -i14;
                        }
                        int i15 = i13 + i14;
                        if (i15 < i9) {
                            i10 = iArr[3];
                            i9 = i15;
                        }
                    }
                }
            }
            if (i8 >= 0) {
                int[] iArr2 = this.f58574e[i8];
                int i16 = i5 - iArr2[1];
                if (i16 >= i9) {
                    i8 = -1;
                } else {
                    i8--;
                    if (i16 < 0) {
                        i16 = -i16;
                    }
                    int i17 = iArr2[0] - i4;
                    if (i17 < 0) {
                        i17 = -i17;
                    }
                    int i18 = i16 + i17;
                    if (i18 < i9) {
                        int i19 = iArr2[2] - i6;
                        if (i19 < 0) {
                            i19 = -i19;
                        }
                        int i20 = i19 + i18;
                        if (i20 < i9) {
                            i10 = iArr2[3];
                            i9 = i20;
                        }
                    }
                }
            }
        }
    }

    public byte[] h() {
        f();
        i();
        e();
        return c();
    }

    public void i() {
        for (int i4 = 0; i4 < 256; i4++) {
            int[][] iArr = this.f58574e;
            int[] iArr2 = iArr[i4];
            iArr2[0] = iArr2[0] >> 4;
            int[] iArr3 = iArr[i4];
            iArr3[1] = iArr3[1] >> 4;
            int[] iArr4 = iArr[i4];
            iArr4[2] = iArr4[2] >> 4;
            iArr[i4][3] = i4;
        }
    }
}
