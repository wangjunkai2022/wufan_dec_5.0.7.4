package com.googlecode.mp4parser.boxes.apple;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: BaseMediaInfoAtom.java */
/* loaded from: classes3.dex */
public class o0 extends com.googlecode.mp4parser.c {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;
    private static final /* synthetic */ c.b C = null;
    private static final /* synthetic */ c.b D = null;
    private static final /* synthetic */ c.b E = null;
    private static final /* synthetic */ c.b F = null;
    private static final /* synthetic */ c.b G = null;
    private static final /* synthetic */ c.b H = null;
    private static final /* synthetic */ c.b I = null;
    private static final /* synthetic */ c.b J = null;
    private static final /* synthetic */ c.b K = null;
    private static final /* synthetic */ c.b L = null;

    /* renamed from: y  reason: collision with root package name */
    public static final String f13644y = "gmin";

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f13645z = null;

    /* renamed from: s  reason: collision with root package name */
    short f13646s;

    /* renamed from: t  reason: collision with root package name */
    int f13647t;

    /* renamed from: u  reason: collision with root package name */
    int f13648u;

    /* renamed from: v  reason: collision with root package name */
    int f13649v;

    /* renamed from: w  reason: collision with root package name */
    short f13650w;

    /* renamed from: x  reason: collision with root package name */
    short f13651x;

    static {
        s();
    }

    public o0() {
        super(f13644y);
        this.f13646s = (short) 64;
        this.f13647t = 32768;
        this.f13648u = 32768;
        this.f13649v = 32768;
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("BaseMediaInfoAtom.java", o0.class);
        f13645z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getGraphicsMode", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", MethodReflectParams.SHORT), 54);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setGraphicsMode", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", MethodReflectParams.SHORT, "graphicsMode", "", "void"), 58);
        J = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getReserved", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", MethodReflectParams.SHORT), 94);
        K = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setReserved", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", MethodReflectParams.SHORT, "reserved", "", "void"), 98);
        L = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "java.lang.String"), 103);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getOpColorR", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", MethodReflectParams.INT), 62);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setOpColorR", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", MethodReflectParams.INT, "opColorR", "", "void"), 66);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getOpColorG", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", MethodReflectParams.INT), 70);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setOpColorG", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", MethodReflectParams.INT, "opColorG", "", "void"), 74);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getOpColorB", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", MethodReflectParams.INT), 78);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setOpColorB", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", MethodReflectParams.INT, "opColorB", "", "void"), 82);
        H = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getBalance", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", MethodReflectParams.SHORT), 86);
        I = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setBalance", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", MethodReflectParams.SHORT, "balance", "", "void"), 90);
    }

    public short A() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(J, this, this));
        return this.f13651x;
    }

    public void B(short s4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(I, this, this, org.aspectj.runtime.internal.e.o(s4)));
        this.f13650w = s4;
    }

    public void C(short s4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(A, this, this, org.aspectj.runtime.internal.e.o(s4)));
        this.f13646s = s4;
    }

    public void D(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(G, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13649v = i4;
    }

    public void E(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(E, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13648u = i4;
    }

    public void F(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(C, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13647t = i4;
    }

    public void G(short s4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(K, this, this, org.aspectj.runtime.internal.e.o(s4)));
        this.f13651x = s4;
    }

    @Override // com.googlecode.mp4parser.a
    protected void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f13646s = byteBuffer.getShort();
        this.f13647t = com.coremedia.iso.g.i(byteBuffer);
        this.f13648u = com.coremedia.iso.g.i(byteBuffer);
        this.f13649v = com.coremedia.iso.g.i(byteBuffer);
        this.f13650w = byteBuffer.getShort();
        this.f13651x = byteBuffer.getShort();
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        byteBuffer.putShort(this.f13646s);
        com.coremedia.iso.i.f(byteBuffer, this.f13647t);
        com.coremedia.iso.i.f(byteBuffer, this.f13648u);
        com.coremedia.iso.i.f(byteBuffer, this.f13649v);
        byteBuffer.putShort(this.f13650w);
        byteBuffer.putShort(this.f13651x);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 16L;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(L, this, this));
        return "BaseMediaInfoAtom{graphicsMode=" + ((int) this.f13646s) + ", opColorR=" + this.f13647t + ", opColorG=" + this.f13648u + ", opColorB=" + this.f13649v + ", balance=" + ((int) this.f13650w) + ", reserved=" + ((int) this.f13651x) + '}';
    }

    public short v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(H, this, this));
        return this.f13650w;
    }

    public short w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f13645z, this, this));
        return this.f13646s;
    }

    public int x() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(F, this, this));
        return this.f13649v;
    }

    public int y() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(D, this, this));
        return this.f13648u;
    }

    public int z() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(B, this, this));
        return this.f13647t;
    }
}
