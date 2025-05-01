package com.googlecode.mp4parser.boxes.apple;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: TimeCodeBox.java */
/* loaded from: classes3.dex */
public class u0 extends com.googlecode.mp4parser.a implements com.coremedia.iso.boxes.sampleentry.f {
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
    private static final /* synthetic */ c.b M = null;
    private static final /* synthetic */ c.b N = null;

    /* renamed from: w  reason: collision with root package name */
    public static final String f13690w = "tmcd";

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f13691x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f13692y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f13693z = null;

    /* renamed from: o  reason: collision with root package name */
    int f13694o;

    /* renamed from: p  reason: collision with root package name */
    int f13695p;

    /* renamed from: q  reason: collision with root package name */
    int f13696q;

    /* renamed from: r  reason: collision with root package name */
    int f13697r;

    /* renamed from: s  reason: collision with root package name */
    int f13698s;

    /* renamed from: t  reason: collision with root package name */
    long f13699t;

    /* renamed from: u  reason: collision with root package name */
    int f13700u;

    /* renamed from: v  reason: collision with root package name */
    byte[] f13701v;

    static {
        s();
    }

    public u0() {
        super(f13690w);
        this.f13701v = new byte[0];
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("TimeCodeBox.java", u0.class);
        f13691x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDataReferenceIndex", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", MethodReflectParams.INT), 81);
        f13692y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDataReferenceIndex", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", MethodReflectParams.INT, "dataReferenceIndex", "", "void"), 85);
        H = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setReserved1", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", MethodReflectParams.INT, "reserved1", "", "void"), 130);
        I = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getReserved2", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", MethodReflectParams.INT), 134);
        J = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setReserved2", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", MethodReflectParams.INT, "reserved2", "", "void"), 138);
        K = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getFlags", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", MethodReflectParams.LONG), 142);
        L = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setFlags", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", MethodReflectParams.LONG, "flags", "", "void"), 146);
        M = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getRest", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "[B"), 150);
        N = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setRest", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "[B", "rest", "", "void"), 154);
        f13693z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "java.lang.String"), 91);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getTimeScale", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", MethodReflectParams.INT), 102);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setTimeScale", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", MethodReflectParams.INT, "timeScale", "", "void"), 106);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getFrameDuration", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", MethodReflectParams.INT), 110);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setFrameDuration", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", MethodReflectParams.INT, "frameDuration", "", "void"), 114);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getNumberOfFrames", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", MethodReflectParams.INT), 118);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setNumberOfFrames", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", MethodReflectParams.INT, "numberOfFrames", "", "void"), 122);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getReserved1", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", MethodReflectParams.INT), 126);
    }

    public void A(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(L, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f13699t = j4;
    }

    public void B(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(D, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13695p = i4;
    }

    public void C(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(F, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13696q = i4;
    }

    public void D(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(H, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13697r = i4;
    }

    public void E(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(J, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13698s = i4;
    }

    public void F(byte[] bArr) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(N, this, this, bArr));
        this.f13701v = bArr;
    }

    public void G(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(B, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13694o = i4;
    }

    @Override // com.googlecode.mp4parser.a
    protected void b(ByteBuffer byteBuffer) {
        byteBuffer.position(6);
        this.f13700u = com.coremedia.iso.g.i(byteBuffer);
        this.f13697r = byteBuffer.getInt();
        this.f13699t = com.coremedia.iso.g.l(byteBuffer);
        this.f13694o = byteBuffer.getInt();
        this.f13695p = byteBuffer.getInt();
        this.f13696q = com.coremedia.iso.g.p(byteBuffer);
        this.f13698s = com.coremedia.iso.g.k(byteBuffer);
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.f13701v = bArr;
        byteBuffer.get(bArr);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        byteBuffer.put(new byte[6]);
        com.coremedia.iso.i.f(byteBuffer, this.f13700u);
        byteBuffer.putInt(this.f13697r);
        com.coremedia.iso.i.i(byteBuffer, this.f13699t);
        byteBuffer.putInt(this.f13694o);
        byteBuffer.putInt(this.f13695p);
        com.coremedia.iso.i.m(byteBuffer, this.f13696q);
        com.coremedia.iso.i.h(byteBuffer, this.f13698s);
        byteBuffer.put(this.f13701v);
    }

    @Override // com.coremedia.iso.boxes.sampleentry.f
    public void d(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f13692y, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13700u = i4;
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return this.f13701v.length + 28;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.f
    public int h() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f13691x, this, this));
        return this.f13700u;
    }

    public long t() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(K, this, this));
        return this.f13699t;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f13693z, this, this));
        return "TimeCodeBox{timeScale=" + this.f13694o + ", frameDuration=" + this.f13695p + ", numberOfFrames=" + this.f13696q + ", reserved1=" + this.f13697r + ", reserved2=" + this.f13698s + ", flags=" + this.f13699t + '}';
    }

    public int u() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(C, this, this));
        return this.f13695p;
    }

    public int v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(E, this, this));
        return this.f13696q;
    }

    public int w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(G, this, this));
        return this.f13697r;
    }

    public int x() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(I, this, this));
        return this.f13698s;
    }

    public byte[] y() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(M, this, this));
        return this.f13701v;
    }

    public int z() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(A, this, this));
        return this.f13694o;
    }
}
