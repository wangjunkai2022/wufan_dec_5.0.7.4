package com.coremedia.iso.boxes;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: CompositionShiftLeastGreatestAtom.java */
/* loaded from: classes2.dex */
public class h extends com.googlecode.mp4parser.c {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;
    private static final /* synthetic */ c.b C = null;
    private static final /* synthetic */ c.b D = null;
    private static final /* synthetic */ c.b E = null;
    private static final /* synthetic */ c.b F = null;
    private static final /* synthetic */ c.b G = null;
    private static final /* synthetic */ c.b H = null;

    /* renamed from: x  reason: collision with root package name */
    public static final String f9708x = "cslg";

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f9709y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f9710z = null;

    /* renamed from: s  reason: collision with root package name */
    int f9711s;

    /* renamed from: t  reason: collision with root package name */
    int f9712t;

    /* renamed from: u  reason: collision with root package name */
    int f9713u;

    /* renamed from: v  reason: collision with root package name */
    int f9714v;

    /* renamed from: w  reason: collision with root package name */
    int f9715w;

    static {
        s();
    }

    public h() {
        super(f9708x);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("CompositionShiftLeastGreatestAtom.java", h.class);
        f9709y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getCompositionOffsetToDisplayOffsetShift", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", MethodReflectParams.INT), 66);
        f9710z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setCompositionOffsetToDisplayOffsetShift", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", MethodReflectParams.INT, "compositionOffsetToDisplayOffsetShift", "", "void"), 70);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLeastDisplayOffset", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", MethodReflectParams.INT), 74);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLeastDisplayOffset", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", MethodReflectParams.INT, "leastDisplayOffset", "", "void"), 78);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getGreatestDisplayOffset", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", MethodReflectParams.INT), 82);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setGreatestDisplayOffset", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", MethodReflectParams.INT, "greatestDisplayOffset", "", "void"), 86);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDisplayStartTime", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", MethodReflectParams.INT), 90);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDisplayStartTime", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", MethodReflectParams.INT, "displayStartTime", "", "void"), 94);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDisplayEndTime", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", MethodReflectParams.INT), 98);
        H = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDisplayEndTime", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", MethodReflectParams.INT, "displayEndTime", "", "void"), 102);
    }

    public void A(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9710z, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9711s = i4;
    }

    public void B(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(H, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9715w = i4;
    }

    public void C(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(F, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9714v = i4;
    }

    public void D(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(D, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9713u = i4;
    }

    public void E(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(B, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9712t = i4;
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9711s = byteBuffer.getInt();
        this.f9712t = byteBuffer.getInt();
        this.f9713u = byteBuffer.getInt();
        this.f9714v = byteBuffer.getInt();
        this.f9715w = byteBuffer.getInt();
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        byteBuffer.putInt(this.f9711s);
        byteBuffer.putInt(this.f9712t);
        byteBuffer.putInt(this.f9713u);
        byteBuffer.putInt(this.f9714v);
        byteBuffer.putInt(this.f9715w);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 24L;
    }

    public int v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9709y, this, this));
        return this.f9711s;
    }

    public int w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(G, this, this));
        return this.f9715w;
    }

    public int x() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(E, this, this));
        return this.f9714v;
    }

    public int y() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(C, this, this));
        return this.f9713u;
    }

    public int z() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(A, this, this));
        return this.f9712t;
    }
}
