package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.i;
import com.googlecode.mp4parser.j;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: AmrSpecificBox.java */
/* loaded from: classes2.dex */
public class b extends com.googlecode.mp4parser.a {
    private static final /* synthetic */ c.b A = null;

    /* renamed from: t  reason: collision with root package name */
    public static final String f9872t = "damr";

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f9873u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9874v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9875w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f9876x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f9877y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f9878z = null;

    /* renamed from: o  reason: collision with root package name */
    private String f9879o;

    /* renamed from: p  reason: collision with root package name */
    private int f9880p;

    /* renamed from: q  reason: collision with root package name */
    private int f9881q;

    /* renamed from: r  reason: collision with root package name */
    private int f9882r;

    /* renamed from: s  reason: collision with root package name */
    private int f9883s;

    static {
        s();
    }

    public b() {
        super(f9872t);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("AmrSpecificBox.java", b.class);
        f9873u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getVendor", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "java.lang.String"), 46);
        f9874v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDecoderVersion", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", MethodReflectParams.INT), 50);
        f9875w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getModeSet", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", MethodReflectParams.INT), 54);
        f9876x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getModeChangePeriod", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", MethodReflectParams.INT), 58);
        f9877y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getFramesPerSample", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", MethodReflectParams.INT), 62);
        f9878z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getContent", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 84);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "java.lang.String"), 92);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        this.f9879o = com.coremedia.iso.f.B(bArr);
        this.f9880p = com.coremedia.iso.g.p(byteBuffer);
        this.f9881q = com.coremedia.iso.g.i(byteBuffer);
        this.f9882r = com.coremedia.iso.g.p(byteBuffer);
        this.f9883s = com.coremedia.iso.g.p(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    public void c(ByteBuffer byteBuffer) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f9878z, this, this, byteBuffer));
        byteBuffer.put(com.coremedia.iso.f.C(this.f9879o));
        i.m(byteBuffer, this.f9880p);
        i.f(byteBuffer, this.f9881q);
        i.m(byteBuffer, this.f9882r);
        i.m(byteBuffer, this.f9883s);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 9L;
    }

    public int t() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f9874v, this, this));
        return this.f9880p;
    }

    public String toString() {
        j.b().c(org.aspectj.runtime.reflect.e.v(A, this, this));
        return "AmrSpecificBox[vendor=" + x() + ";decoderVersion=" + t() + ";modeSet=" + w() + ";modeChangePeriod=" + v() + ";framesPerSample=" + u() + "]";
    }

    public int u() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f9877y, this, this));
        return this.f9883s;
    }

    public int v() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f9876x, this, this));
        return this.f9882r;
    }

    public int w() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f9875w, this, this));
        return this.f9881q;
    }

    public String x() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f9873u, this, this));
        return this.f9879o;
    }
}
