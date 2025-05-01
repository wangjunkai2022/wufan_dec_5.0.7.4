package com.googlecode.mp4parser.boxes.apple;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: TrackProductionApertureDimensionsAtom.java */
/* loaded from: classes3.dex */
public class y0 extends com.googlecode.mp4parser.c {

    /* renamed from: u  reason: collision with root package name */
    public static final String f13724u = "prof";

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f13725v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f13726w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f13727x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f13728y = null;

    /* renamed from: s  reason: collision with root package name */
    double f13729s;

    /* renamed from: t  reason: collision with root package name */
    double f13730t;

    static {
        s();
    }

    public y0() {
        super(f13724u);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("TrackProductionApertureDimensionsAtom.java", y0.class);
        f13725v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getWidth", "com.googlecode.mp4parser.boxes.apple.TrackProductionApertureDimensionsAtom", "", "", "", MethodReflectParams.DOUBLE), 44);
        f13726w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setWidth", "com.googlecode.mp4parser.boxes.apple.TrackProductionApertureDimensionsAtom", MethodReflectParams.DOUBLE, "width", "", "void"), 48);
        f13727x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getHeight", "com.googlecode.mp4parser.boxes.apple.TrackProductionApertureDimensionsAtom", "", "", "", MethodReflectParams.DOUBLE), 52);
        f13728y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setHeight", "com.googlecode.mp4parser.boxes.apple.TrackProductionApertureDimensionsAtom", MethodReflectParams.DOUBLE, "height", "", "void"), 56);
    }

    @Override // com.googlecode.mp4parser.a
    protected void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f13729s = com.coremedia.iso.g.d(byteBuffer);
        this.f13730t = com.coremedia.iso.g.d(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.b(byteBuffer, this.f13729s);
        com.coremedia.iso.i.b(byteBuffer, this.f13730t);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 12L;
    }

    public double v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f13727x, this, this));
        return this.f13730t;
    }

    public double w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f13725v, this, this));
        return this.f13729s;
    }

    public void x(double d5) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f13728y, this, this, org.aspectj.runtime.internal.e.g(d5)));
        this.f13730t = d5;
    }

    public void y(double d5) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f13726w, this, this, org.aspectj.runtime.internal.e.g(d5)));
        this.f13729s = d5;
    }
}
