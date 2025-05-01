package com.googlecode.mp4parser.boxes.apple;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: TrackEncodedPixelsDimensionsAtom.java */
/* loaded from: classes3.dex */
public class w0 extends com.googlecode.mp4parser.c {

    /* renamed from: u  reason: collision with root package name */
    public static final String f13703u = "enof";

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f13704v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f13705w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f13706x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f13707y = null;

    /* renamed from: s  reason: collision with root package name */
    double f13708s;

    /* renamed from: t  reason: collision with root package name */
    double f13709t;

    static {
        s();
    }

    public w0() {
        super(f13703u);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("TrackEncodedPixelsDimensionsAtom.java", w0.class);
        f13704v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getWidth", "com.googlecode.mp4parser.boxes.apple.TrackEncodedPixelsDimensionsAtom", "", "", "", MethodReflectParams.DOUBLE), 44);
        f13705w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setWidth", "com.googlecode.mp4parser.boxes.apple.TrackEncodedPixelsDimensionsAtom", MethodReflectParams.DOUBLE, "width", "", "void"), 48);
        f13706x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getHeight", "com.googlecode.mp4parser.boxes.apple.TrackEncodedPixelsDimensionsAtom", "", "", "", MethodReflectParams.DOUBLE), 52);
        f13707y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setHeight", "com.googlecode.mp4parser.boxes.apple.TrackEncodedPixelsDimensionsAtom", MethodReflectParams.DOUBLE, "height", "", "void"), 56);
    }

    @Override // com.googlecode.mp4parser.a
    protected void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f13708s = com.coremedia.iso.g.d(byteBuffer);
        this.f13709t = com.coremedia.iso.g.d(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.b(byteBuffer, this.f13708s);
        com.coremedia.iso.i.b(byteBuffer, this.f13709t);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 12L;
    }

    public double v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f13706x, this, this));
        return this.f13709t;
    }

    public double w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f13704v, this, this));
        return this.f13708s;
    }

    public void x(double d5) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f13707y, this, this, org.aspectj.runtime.internal.e.g(d5)));
        this.f13709t = d5;
    }

    public void y(double d5) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f13705w, this, this, org.aspectj.runtime.internal.e.g(d5)));
        this.f13708s = d5;
    }
}
