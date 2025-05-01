package com.googlecode.mp4parser.boxes.apple;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: CleanApertureAtom.java */
/* loaded from: classes3.dex */
public class p0 extends com.googlecode.mp4parser.c {

    /* renamed from: u  reason: collision with root package name */
    public static final String f13652u = "clef";

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f13653v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f13654w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f13655x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f13656y = null;

    /* renamed from: s  reason: collision with root package name */
    double f13657s;

    /* renamed from: t  reason: collision with root package name */
    double f13658t;

    static {
        s();
    }

    public p0() {
        super(f13652u);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("CleanApertureAtom.java", p0.class);
        f13653v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getWidth", "com.googlecode.mp4parser.boxes.apple.CleanApertureAtom", "", "", "", MethodReflectParams.DOUBLE), 45);
        f13654w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setWidth", "com.googlecode.mp4parser.boxes.apple.CleanApertureAtom", MethodReflectParams.DOUBLE, "width", "", "void"), 49);
        f13655x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getHeight", "com.googlecode.mp4parser.boxes.apple.CleanApertureAtom", "", "", "", MethodReflectParams.DOUBLE), 53);
        f13656y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setHeight", "com.googlecode.mp4parser.boxes.apple.CleanApertureAtom", MethodReflectParams.DOUBLE, "height", "", "void"), 57);
    }

    @Override // com.googlecode.mp4parser.a
    protected void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f13657s = com.coremedia.iso.g.d(byteBuffer);
        this.f13658t = com.coremedia.iso.g.d(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.b(byteBuffer, this.f13657s);
        com.coremedia.iso.i.b(byteBuffer, this.f13658t);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 12L;
    }

    public double v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f13655x, this, this));
        return this.f13658t;
    }

    public double w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f13653v, this, this));
        return this.f13657s;
    }

    public void x(double d5) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f13656y, this, this, org.aspectj.runtime.internal.e.g(d5)));
        this.f13658t = d5;
    }

    public void y(double d5) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f13654w, this, this, org.aspectj.runtime.internal.e.g(d5)));
        this.f13657s = d5;
    }
}
