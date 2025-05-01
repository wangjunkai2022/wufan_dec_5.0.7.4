package com.papa.gsyvideoplayer.utils;

import androidx.core.app.FrameMetricsAggregator;
import com.papa91.arc.ext.Log;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: AnimatedGifEncoder.java */
/* loaded from: classes5.dex */
class h {

    /* renamed from: x  reason: collision with root package name */
    private static final int f58462x = -1;

    /* renamed from: y  reason: collision with root package name */
    static final int f58463y = 12;

    /* renamed from: z  reason: collision with root package name */
    static final int f58464z = 5003;

    /* renamed from: a  reason: collision with root package name */
    private int f58465a;

    /* renamed from: b  reason: collision with root package name */
    private int f58466b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f58467c;

    /* renamed from: d  reason: collision with root package name */
    private int f58468d;

    /* renamed from: e  reason: collision with root package name */
    private int f58469e;

    /* renamed from: f  reason: collision with root package name */
    private int f58470f;

    /* renamed from: g  reason: collision with root package name */
    int f58471g;

    /* renamed from: i  reason: collision with root package name */
    int f58473i;

    /* renamed from: p  reason: collision with root package name */
    int f58480p;

    /* renamed from: q  reason: collision with root package name */
    int f58481q;

    /* renamed from: r  reason: collision with root package name */
    int f58482r;

    /* renamed from: v  reason: collision with root package name */
    int f58486v;

    /* renamed from: h  reason: collision with root package name */
    int f58472h = 12;

    /* renamed from: j  reason: collision with root package name */
    int f58474j = 4096;

    /* renamed from: k  reason: collision with root package name */
    int[] f58475k = new int[5003];

    /* renamed from: l  reason: collision with root package name */
    int[] f58476l = new int[5003];

    /* renamed from: m  reason: collision with root package name */
    int f58477m = 5003;

    /* renamed from: n  reason: collision with root package name */
    int f58478n = 0;

    /* renamed from: o  reason: collision with root package name */
    boolean f58479o = false;

    /* renamed from: s  reason: collision with root package name */
    int f58483s = 0;

    /* renamed from: t  reason: collision with root package name */
    int f58484t = 0;

    /* renamed from: u  reason: collision with root package name */
    int[] f58485u = {0, 1, 3, 7, 15, 31, 63, 127, 255, FrameMetricsAggregator.EVERY_DURATION, Log.LogWrapper.MAX_MSG_LEN, 2047, 4095, 8191, 16383, 32767, 65535};

    /* renamed from: w  reason: collision with root package name */
    byte[] f58487w = new byte[256];

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(int i4, int i5, byte[] bArr, int i6) {
        this.f58465a = i4;
        this.f58466b = i5;
        this.f58467c = bArr;
        this.f58468d = Math.max(2, i6);
    }

    private int h() {
        int i4 = this.f58469e;
        if (i4 == 0) {
            return -1;
        }
        this.f58469e = i4 - 1;
        byte[] bArr = this.f58467c;
        int i5 = this.f58470f;
        this.f58470f = i5 + 1;
        return bArr[i5] & 255;
    }

    final int a(int i4) {
        return (1 << i4) - 1;
    }

    void b(byte b5, OutputStream outputStream) throws IOException {
        byte[] bArr = this.f58487w;
        int i4 = this.f58486v;
        int i5 = i4 + 1;
        this.f58486v = i5;
        bArr[i4] = b5;
        if (i5 >= 254) {
            g(outputStream);
        }
    }

    void c(OutputStream outputStream) throws IOException {
        d(this.f58477m);
        int i4 = this.f58481q;
        this.f58478n = i4 + 2;
        this.f58479o = true;
        i(i4, outputStream);
    }

    void d(int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            this.f58475k[i5] = -1;
        }
    }

    void e(int i4, OutputStream outputStream) throws IOException {
        int[] iArr;
        this.f58480p = i4;
        int i5 = 0;
        this.f58479o = false;
        this.f58471g = i4;
        this.f58473i = a(i4);
        int i6 = 1 << (i4 - 1);
        this.f58481q = i6;
        this.f58482r = i6 + 1;
        this.f58478n = i6 + 2;
        this.f58486v = 0;
        int h4 = h();
        for (int i7 = this.f58477m; i7 < 65536; i7 *= 2) {
            i5++;
        }
        int i8 = 8 - i5;
        int i9 = this.f58477m;
        d(i9);
        i(this.f58481q, outputStream);
        while (true) {
            int h5 = h();
            if (h5 != -1) {
                int i10 = (h5 << this.f58472h) + h4;
                int i11 = (h5 << i8) ^ h4;
                int[] iArr2 = this.f58475k;
                if (iArr2[i11] == i10) {
                    h4 = this.f58476l[i11];
                } else {
                    if (iArr2[i11] >= 0) {
                        int i12 = i9 - i11;
                        if (i11 == 0) {
                            i12 = 1;
                        }
                        do {
                            i11 -= i12;
                            if (i11 < 0) {
                                i11 += i9;
                            }
                            iArr = this.f58475k;
                            if (iArr[i11] == i10) {
                                h4 = this.f58476l[i11];
                                break;
                            }
                        } while (iArr[i11] >= 0);
                    }
                    i(h4, outputStream);
                    int i13 = this.f58478n;
                    if (i13 < this.f58474j) {
                        int[] iArr3 = this.f58476l;
                        this.f58478n = i13 + 1;
                        iArr3[i11] = i13;
                        this.f58475k[i11] = i10;
                    } else {
                        c(outputStream);
                    }
                    h4 = h5;
                }
            } else {
                i(h4, outputStream);
                i(this.f58482r, outputStream);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(OutputStream outputStream) throws IOException {
        outputStream.write(this.f58468d);
        this.f58469e = this.f58465a * this.f58466b;
        this.f58470f = 0;
        e(this.f58468d + 1, outputStream);
        outputStream.write(0);
    }

    void g(OutputStream outputStream) throws IOException {
        int i4 = this.f58486v;
        if (i4 > 0) {
            outputStream.write(i4);
            outputStream.write(this.f58487w, 0, this.f58486v);
            this.f58486v = 0;
        }
    }

    void i(int i4, OutputStream outputStream) throws IOException {
        int i5 = this.f58483s;
        int[] iArr = this.f58485u;
        int i6 = this.f58484t;
        int i7 = i5 & iArr[i6];
        this.f58483s = i7;
        if (i6 > 0) {
            this.f58483s = i7 | (i4 << i6);
        } else {
            this.f58483s = i4;
        }
        this.f58484t = i6 + this.f58471g;
        while (this.f58484t >= 8) {
            b((byte) (this.f58483s & 255), outputStream);
            this.f58483s >>= 8;
            this.f58484t -= 8;
        }
        if (this.f58478n > this.f58473i || this.f58479o) {
            if (this.f58479o) {
                int i8 = this.f58480p;
                this.f58471g = i8;
                this.f58473i = a(i8);
                this.f58479o = false;
            } else {
                int i9 = this.f58471g + 1;
                this.f58471g = i9;
                if (i9 == this.f58472h) {
                    this.f58473i = this.f58474j;
                } else {
                    this.f58473i = a(i9);
                }
            }
        }
        if (i4 == this.f58482r) {
            while (this.f58484t > 0) {
                b((byte) (this.f58483s & 255), outputStream);
                this.f58483s >>= 8;
                this.f58484t -= 8;
            }
            g(outputStream);
        }
    }
}
