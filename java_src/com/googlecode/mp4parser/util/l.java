package com.googlecode.mp4parser.util;

import java.nio.ByteBuffer;
/* compiled from: Matrix.java */
/* loaded from: classes3.dex */
public class l {

    /* renamed from: j  reason: collision with root package name */
    public static final l f14234j = new l(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k  reason: collision with root package name */
    public static final l f14235k = new l(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l  reason: collision with root package name */
    public static final l f14236l = new l(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m  reason: collision with root package name */
    public static final l f14237m = new l(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a  reason: collision with root package name */
    double f14238a;

    /* renamed from: b  reason: collision with root package name */
    double f14239b;

    /* renamed from: c  reason: collision with root package name */
    double f14240c;

    /* renamed from: d  reason: collision with root package name */
    double f14241d;

    /* renamed from: e  reason: collision with root package name */
    double f14242e;

    /* renamed from: f  reason: collision with root package name */
    double f14243f;

    /* renamed from: g  reason: collision with root package name */
    double f14244g;

    /* renamed from: h  reason: collision with root package name */
    double f14245h;

    /* renamed from: i  reason: collision with root package name */
    double f14246i;

    public l(double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13) {
        this.f14238a = d9;
        this.f14239b = d10;
        this.f14240c = d11;
        this.f14241d = d5;
        this.f14242e = d6;
        this.f14243f = d7;
        this.f14244g = d8;
        this.f14245h = d12;
        this.f14246i = d13;
    }

    public static l a(ByteBuffer byteBuffer) {
        return b(com.coremedia.iso.g.d(byteBuffer), com.coremedia.iso.g.d(byteBuffer), com.coremedia.iso.g.c(byteBuffer), com.coremedia.iso.g.d(byteBuffer), com.coremedia.iso.g.d(byteBuffer), com.coremedia.iso.g.c(byteBuffer), com.coremedia.iso.g.d(byteBuffer), com.coremedia.iso.g.d(byteBuffer), com.coremedia.iso.g.c(byteBuffer));
    }

    public static l b(double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13) {
        return new l(d5, d6, d8, d9, d7, d10, d13, d11, d12);
    }

    public void c(ByteBuffer byteBuffer) {
        com.coremedia.iso.i.b(byteBuffer, this.f14241d);
        com.coremedia.iso.i.b(byteBuffer, this.f14242e);
        com.coremedia.iso.i.a(byteBuffer, this.f14238a);
        com.coremedia.iso.i.b(byteBuffer, this.f14243f);
        com.coremedia.iso.i.b(byteBuffer, this.f14244g);
        com.coremedia.iso.i.a(byteBuffer, this.f14239b);
        com.coremedia.iso.i.b(byteBuffer, this.f14245h);
        com.coremedia.iso.i.b(byteBuffer, this.f14246i);
        com.coremedia.iso.i.a(byteBuffer, this.f14240c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return Double.compare(lVar.f14241d, this.f14241d) == 0 && Double.compare(lVar.f14242e, this.f14242e) == 0 && Double.compare(lVar.f14243f, this.f14243f) == 0 && Double.compare(lVar.f14244g, this.f14244g) == 0 && Double.compare(lVar.f14245h, this.f14245h) == 0 && Double.compare(lVar.f14246i, this.f14246i) == 0 && Double.compare(lVar.f14238a, this.f14238a) == 0 && Double.compare(lVar.f14239b, this.f14239b) == 0 && Double.compare(lVar.f14240c, this.f14240c) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f14238a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f14239b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f14240c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f14241d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f14242e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f14243f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f14244g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f14245h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f14246i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public String toString() {
        if (equals(f14234j)) {
            return "Rotate 0°";
        }
        if (equals(f14235k)) {
            return "Rotate 90°";
        }
        if (equals(f14236l)) {
            return "Rotate 180°";
        }
        if (equals(f14237m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f14238a + ", v=" + this.f14239b + ", w=" + this.f14240c + ", a=" + this.f14241d + ", b=" + this.f14242e + ", c=" + this.f14243f + ", d=" + this.f14244g + ", tx=" + this.f14245h + ", ty=" + this.f14246i + '}';
    }
}
