package com.papa.gsyvideoplayer.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: AnimatedGifEncoder.java */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    protected int f58380a;

    /* renamed from: b  reason: collision with root package name */
    protected int f58381b;

    /* renamed from: f  reason: collision with root package name */
    protected int f58385f;

    /* renamed from: j  reason: collision with root package name */
    protected OutputStream f58389j;

    /* renamed from: k  reason: collision with root package name */
    protected Bitmap f58390k;

    /* renamed from: l  reason: collision with root package name */
    protected byte[] f58391l;

    /* renamed from: m  reason: collision with root package name */
    protected byte[] f58392m;

    /* renamed from: n  reason: collision with root package name */
    protected int f58393n;

    /* renamed from: o  reason: collision with root package name */
    protected byte[] f58394o;

    /* renamed from: c  reason: collision with root package name */
    protected int f58382c = 0;

    /* renamed from: d  reason: collision with root package name */
    protected int f58383d = 0;

    /* renamed from: e  reason: collision with root package name */
    protected int f58384e = -1;

    /* renamed from: g  reason: collision with root package name */
    protected int f58386g = -1;

    /* renamed from: h  reason: collision with root package name */
    protected int f58387h = 0;

    /* renamed from: i  reason: collision with root package name */
    protected boolean f58388i = false;

    /* renamed from: p  reason: collision with root package name */
    protected boolean[] f58395p = new boolean[256];

    /* renamed from: q  reason: collision with root package name */
    protected int f58396q = 7;

    /* renamed from: r  reason: collision with root package name */
    protected int f58397r = -1;

    /* renamed from: s  reason: collision with root package name */
    protected boolean f58398s = false;

    /* renamed from: t  reason: collision with root package name */
    protected boolean f58399t = true;

    /* renamed from: u  reason: collision with root package name */
    protected boolean f58400u = false;

    /* renamed from: v  reason: collision with root package name */
    protected int f58401v = 10;

    public boolean a(Bitmap bitmap) {
        if (bitmap == null || !this.f58388i) {
            return false;
        }
        try {
            if (!this.f58400u) {
                m(bitmap.getWidth(), bitmap.getHeight());
            }
            this.f58390k = bitmap;
            f();
            b();
            if (this.f58399t) {
                r();
                t();
                if (this.f58386g >= 0) {
                    s();
                }
            }
            p();
            q();
            if (!this.f58399t) {
                t();
            }
            u();
            this.f58399t = false;
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    protected void b() {
        byte[] bArr = this.f58391l;
        int length = bArr.length;
        int i4 = length / 3;
        this.f58392m = new byte[i4];
        m mVar = new m(bArr, length, this.f58401v);
        this.f58394o = mVar.h();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[] bArr2 = this.f58394o;
            if (i6 >= bArr2.length) {
                break;
            }
            byte b5 = bArr2[i6];
            int i7 = i6 + 2;
            bArr2[i6] = bArr2[i7];
            bArr2[i7] = b5;
            this.f58395p[i6 / 3] = false;
            i6 += 3;
        }
        int i8 = 0;
        while (i5 < i4) {
            byte[] bArr3 = this.f58391l;
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            int g4 = mVar.g(bArr3[i8] & 255, bArr3[i9] & 255, bArr3[i10] & 255);
            this.f58395p[g4] = true;
            this.f58392m[i5] = (byte) g4;
            i5++;
            i8 = i10 + 1;
        }
        this.f58391l = null;
        this.f58393n = 8;
        this.f58396q = 7;
        int i11 = this.f58384e;
        if (i11 != -1) {
            this.f58385f = c(i11);
        }
    }

    protected int c(int i4) {
        byte[] bArr = this.f58394o;
        if (bArr == null) {
            return -1;
        }
        int i5 = (i4 >> 16) & 255;
        int i6 = (i4 >> 8) & 255;
        int i7 = 0;
        int i8 = (i4 >> 0) & 255;
        int length = bArr.length;
        int i9 = 0;
        int i10 = 16777216;
        while (i7 < length) {
            byte[] bArr2 = this.f58394o;
            int i11 = i7 + 1;
            int i12 = i5 - (bArr2[i7] & 255);
            int i13 = i11 + 1;
            int i14 = i6 - (bArr2[i11] & 255);
            int i15 = i8 - (bArr2[i13] & 255);
            int i16 = (i12 * i12) + (i14 * i14) + (i15 * i15);
            int i17 = i13 / 3;
            if (this.f58395p[i17] && i16 < i10) {
                i10 = i16;
                i9 = i17;
            }
            i7 = i13 + 1;
        }
        return i9;
    }

    public boolean d() {
        boolean z4;
        if (this.f58388i) {
            this.f58388i = false;
            try {
                this.f58389j.write(59);
                this.f58389j.flush();
                if (this.f58398s) {
                    this.f58389j.close();
                }
                z4 = true;
            } catch (IOException unused) {
                z4 = false;
            }
            this.f58385f = 0;
            this.f58389j = null;
            this.f58390k = null;
            this.f58391l = null;
            this.f58392m = null;
            this.f58394o = null;
            this.f58398s = false;
            this.f58399t = true;
            return z4;
        }
        return false;
    }

    protected int[] e(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return iArr;
    }

    protected void f() {
        int width = this.f58390k.getWidth();
        int height = this.f58390k.getHeight();
        int i4 = this.f58380a;
        if (width != i4 || height != this.f58381b) {
            Bitmap createBitmap = Bitmap.createBitmap(i4, this.f58381b, Bitmap.Config.RGB_565);
            new Canvas(createBitmap).drawBitmap(this.f58390k, 0.0f, 0.0f, new Paint());
            this.f58390k = createBitmap;
        }
        int[] e5 = e(this.f58390k);
        this.f58391l = new byte[e5.length * 3];
        for (int i5 = 0; i5 < e5.length; i5++) {
            int i6 = e5[i5];
            int i7 = i5 * 3;
            byte[] bArr = this.f58391l;
            int i8 = i7 + 1;
            bArr[i7] = (byte) ((i6 >> 0) & 255);
            bArr[i8] = (byte) ((i6 >> 8) & 255);
            bArr[i8 + 1] = (byte) ((i6 >> 16) & 255);
        }
    }

    public void g(int i4) {
        this.f58387h = i4 / 10;
    }

    public void h(int i4) {
        if (i4 >= 0) {
            this.f58397r = i4;
        }
    }

    public void i(float f5) {
        if (f5 != 0.0f) {
            this.f58387h = (int) (100.0f / f5);
        }
    }

    public void j(int i4, int i5) {
        this.f58382c = i4;
        this.f58383d = i5;
    }

    public void k(int i4) {
        if (i4 < 1) {
            i4 = 1;
        }
        this.f58401v = i4;
    }

    public void l(int i4) {
        if (i4 >= 0) {
            this.f58386g = i4;
        }
    }

    public void m(int i4, int i5) {
        this.f58380a = i4;
        this.f58381b = i5;
        if (i4 < 1) {
            this.f58380a = 320;
        }
        if (i5 < 1) {
            this.f58381b = 240;
        }
        this.f58400u = true;
    }

    public void n(int i4) {
        this.f58384e = i4;
    }

    public boolean o(OutputStream outputStream) {
        boolean z4 = false;
        if (outputStream == null) {
            return false;
        }
        this.f58398s = false;
        this.f58389j = outputStream;
        try {
            w("GIF89a");
            z4 = true;
        } catch (IOException unused) {
        }
        this.f58388i = z4;
        return z4;
    }

    protected void p() throws IOException {
        int i4;
        int i5;
        this.f58389j.write(33);
        this.f58389j.write(249);
        this.f58389j.write(4);
        if (this.f58384e == -1) {
            i4 = 0;
            i5 = 0;
        } else {
            i4 = 1;
            i5 = 2;
        }
        int i6 = this.f58397r;
        if (i6 >= 0) {
            i5 = i6 & 7;
        }
        this.f58389j.write(i4 | (i5 << 2) | 0 | 0);
        v(this.f58387h);
        this.f58389j.write(this.f58385f);
        this.f58389j.write(0);
    }

    protected void q() throws IOException {
        this.f58389j.write(44);
        v(this.f58382c);
        v(this.f58383d);
        v(this.f58380a);
        v(this.f58381b);
        if (this.f58399t) {
            this.f58389j.write(0);
        } else {
            this.f58389j.write(this.f58396q | 128);
        }
    }

    protected void r() throws IOException {
        v(this.f58380a);
        v(this.f58381b);
        this.f58389j.write(this.f58396q | 240);
        this.f58389j.write(0);
        this.f58389j.write(0);
    }

    protected void s() throws IOException {
        this.f58389j.write(33);
        this.f58389j.write(255);
        this.f58389j.write(11);
        w("NETSCAPE2.0");
        this.f58389j.write(3);
        this.f58389j.write(1);
        v(this.f58386g);
        this.f58389j.write(0);
    }

    protected void t() throws IOException {
        OutputStream outputStream = this.f58389j;
        byte[] bArr = this.f58394o;
        outputStream.write(bArr, 0, bArr.length);
        int length = 768 - this.f58394o.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.f58389j.write(0);
        }
    }

    protected void u() throws IOException {
        new h(this.f58380a, this.f58381b, this.f58392m, this.f58393n).f(this.f58389j);
    }

    protected void v(int i4) throws IOException {
        this.f58389j.write(i4 & 255);
        this.f58389j.write((i4 >> 8) & 255);
    }

    protected void w(String str) throws IOException {
        for (int i4 = 0; i4 < str.length(); i4++) {
            this.f58389j.write((byte) str.charAt(i4));
        }
    }
}
