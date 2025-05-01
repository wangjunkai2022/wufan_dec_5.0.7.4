package com.coremedia.iso.boxes;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: SampleSizeBox.java */
/* loaded from: classes2.dex */
public class t0 extends com.googlecode.mp4parser.c {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;
    private static final /* synthetic */ c.b C = null;

    /* renamed from: v  reason: collision with root package name */
    public static final String f9938v = "stsz";

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9939w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f9940x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f9941y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f9942z = null;

    /* renamed from: s  reason: collision with root package name */
    private long f9943s;

    /* renamed from: t  reason: collision with root package name */
    private long[] f9944t;

    /* renamed from: u  reason: collision with root package name */
    int f9945u;

    static {
        s();
    }

    public t0() {
        super(f9938v);
        this.f9944t = new long[0];
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("SampleSizeBox.java", t0.class);
        f9939w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", MethodReflectParams.LONG), 50);
        f9940x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", MethodReflectParams.LONG, com.facebook.imagepipeline.producers.l.f12270q, "", "void"), 54);
        f9941y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", MethodReflectParams.INT, "index", "", MethodReflectParams.LONG), 59);
        f9942z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", MethodReflectParams.LONG), 67);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "[J"), 76);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "", "void"), 80);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "java.lang.String"), 119);
    }

    public void A(long[] jArr) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(B, this, this, jArr));
        this.f9944t = jArr;
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9943s = com.coremedia.iso.g.l(byteBuffer);
        int a5 = com.googlecode.mp4parser.util.c.a(com.coremedia.iso.g.l(byteBuffer));
        this.f9945u = a5;
        if (this.f9943s == 0) {
            this.f9944t = new long[a5];
            for (int i4 = 0; i4 < this.f9945u; i4++) {
                this.f9944t[i4] = com.coremedia.iso.g.l(byteBuffer);
            }
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.i(byteBuffer, this.f9943s);
        if (this.f9943s == 0) {
            com.coremedia.iso.i.i(byteBuffer, this.f9944t.length);
            for (long j4 : this.f9944t) {
                com.coremedia.iso.i.i(byteBuffer, j4);
            }
            return;
        }
        com.coremedia.iso.i.i(byteBuffer, this.f9945u);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return (this.f9943s == 0 ? this.f9944t.length * 4 : 0) + 12;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(C, this, this));
        return "SampleSizeBox[sampleSize=" + w() + ";sampleCount=" + v() + "]";
    }

    public long v() {
        int length;
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9942z, this, this));
        if (this.f9943s > 0) {
            length = this.f9945u;
        } else {
            length = this.f9944t.length;
        }
        return length;
    }

    public long w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9939w, this, this));
        return this.f9943s;
    }

    public long x(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9941y, this, this, org.aspectj.runtime.internal.e.k(i4)));
        long j4 = this.f9943s;
        return j4 > 0 ? j4 : this.f9944t[i4];
    }

    public long[] y() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(A, this, this));
        return this.f9944t;
    }

    public void z(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9940x, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f9943s = j4;
    }
}
