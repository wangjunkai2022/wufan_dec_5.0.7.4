package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: RatingBox.java */
/* loaded from: classes2.dex */
public class p0 extends com.googlecode.mp4parser.c {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;
    private static final /* synthetic */ c.b C = null;
    private static final /* synthetic */ c.b D = null;
    private static final /* synthetic */ c.b E = null;
    private static final /* synthetic */ c.b F = null;

    /* renamed from: w  reason: collision with root package name */
    public static final String f9830w = "rtng";

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f9831x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f9832y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f9833z = null;

    /* renamed from: s  reason: collision with root package name */
    private String f9834s;

    /* renamed from: t  reason: collision with root package name */
    private String f9835t;

    /* renamed from: u  reason: collision with root package name */
    private String f9836u;

    /* renamed from: v  reason: collision with root package name */
    private String f9837v;

    static {
        s();
    }

    public p0() {
        super(f9830w);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("RatingBox.java", p0.class);
        f9831x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setRatingEntity", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingEntity", "", "void"), 46);
        f9832y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setRatingCriteria", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingCriteria", "", "void"), 50);
        f9833z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLanguage", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "language", "", "void"), 54);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setRatingInfo", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingInfo", "", "void"), 58);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLanguage", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 62);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getRatingEntity", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 73);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getRatingCriteria", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 83);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getRatingInfo", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 87);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 115);
    }

    public void A(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9832y, this, this, str));
        this.f9835t = str;
    }

    public void B(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9831x, this, this, str));
        this.f9834s = str;
    }

    public void C(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(A, this, this, str));
        this.f9837v = str;
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9834s = com.coremedia.iso.g.b(byteBuffer);
        this.f9835t = com.coremedia.iso.g.b(byteBuffer);
        this.f9836u = com.coremedia.iso.g.f(byteBuffer);
        this.f9837v = com.coremedia.iso.g.g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        byteBuffer.put(com.coremedia.iso.f.C(this.f9834s));
        byteBuffer.put(com.coremedia.iso.f.C(this.f9835t));
        com.coremedia.iso.i.d(byteBuffer, this.f9836u);
        byteBuffer.put(com.coremedia.iso.l.b(this.f9837v));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return com.coremedia.iso.l.c(this.f9837v) + 15;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(F, this, this));
        return "RatingBox[language=" + v() + "ratingEntity=" + x() + ";ratingCriteria=" + w() + ";language=" + v() + ";ratingInfo=" + y() + "]";
    }

    public String v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(B, this, this));
        return this.f9836u;
    }

    public String w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(D, this, this));
        return this.f9835t;
    }

    public String x() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(C, this, this));
        return this.f9834s;
    }

    public String y() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(E, this, this));
        return this.f9837v;
    }

    public void z(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9833z, this, this, str));
        this.f9836u = str;
    }
}
