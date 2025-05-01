package com.coremedia.iso.boxes.apple;

import com.coremedia.iso.i;
import com.facebook.imagepipeline.producers.l;
import com.googlecode.mp4parser.j;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: AppleLosslessSpecificBox.java */
/* loaded from: classes2.dex */
public final class d extends com.googlecode.mp4parser.c {
    public static final String D = "alac";
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
    private static final /* synthetic */ c.b O = null;
    private static final /* synthetic */ c.b P = null;
    private static final /* synthetic */ c.b Q = null;
    private static final /* synthetic */ c.b R = null;
    private static final /* synthetic */ c.b S = null;
    private static final /* synthetic */ c.b T = null;
    private static final /* synthetic */ c.b U = null;
    private static final /* synthetic */ c.b V = null;
    private static final /* synthetic */ c.b W = null;
    private static final /* synthetic */ c.b X = null;
    private static final /* synthetic */ c.b Y = null;
    private static final /* synthetic */ c.b Z = null;
    private long A;
    private long B;
    private long C;

    /* renamed from: s  reason: collision with root package name */
    private long f9520s;

    /* renamed from: t  reason: collision with root package name */
    private int f9521t;

    /* renamed from: u  reason: collision with root package name */
    private int f9522u;

    /* renamed from: v  reason: collision with root package name */
    private int f9523v;

    /* renamed from: w  reason: collision with root package name */
    private int f9524w;

    /* renamed from: x  reason: collision with root package name */
    private int f9525x;

    /* renamed from: y  reason: collision with root package name */
    private int f9526y;

    /* renamed from: z  reason: collision with root package name */
    private int f9527z;

    static {
        s();
    }

    public d() {
        super("alac");
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("AppleLosslessSpecificBox.java", d.class);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getMaxSamplePerFrame", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", MethodReflectParams.LONG), 34);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setMaxSamplePerFrame", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", MethodReflectParams.INT, "maxSamplePerFrame", "", "void"), 38);
        O = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getKModifier", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", MethodReflectParams.INT), 74);
        P = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setKModifier", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", MethodReflectParams.INT, "kModifier", "", "void"), 78);
        Q = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getChannels", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", MethodReflectParams.INT), 82);
        R = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setChannels", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", MethodReflectParams.INT, "channels", "", "void"), 86);
        S = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getUnknown2", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", MethodReflectParams.INT), 90);
        T = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setUnknown2", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", MethodReflectParams.INT, "unknown2", "", "void"), 94);
        U = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getMaxCodedFrameSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", MethodReflectParams.LONG), 98);
        V = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setMaxCodedFrameSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", MethodReflectParams.INT, "maxCodedFrameSize", "", "void"), 102);
        W = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getBitRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", MethodReflectParams.LONG), 106);
        X = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setBitRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", MethodReflectParams.INT, "bitRate", "", "void"), 110);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getUnknown1", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", MethodReflectParams.INT), 42);
        Y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSampleRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", MethodReflectParams.LONG), 114);
        Z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setSampleRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", MethodReflectParams.INT, "sampleRate", "", "void"), 118);
        H = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setUnknown1", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", MethodReflectParams.INT, "unknown1", "", "void"), 46);
        I = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSampleSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", MethodReflectParams.INT), 50);
        J = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setSampleSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", MethodReflectParams.INT, l.f12270q, "", "void"), 54);
        K = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getHistoryMult", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", MethodReflectParams.INT), 58);
        L = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setHistoryMult", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", MethodReflectParams.INT, "historyMult", "", "void"), 62);
        M = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getInitialHistory", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", MethodReflectParams.INT), 66);
        N = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setInitialHistory", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", MethodReflectParams.INT, "initialHistory", "", "void"), 70);
    }

    public long A() {
        j.b().c(org.aspectj.runtime.reflect.e.v(U, this, this));
        return this.A;
    }

    public long B() {
        j.b().c(org.aspectj.runtime.reflect.e.v(E, this, this));
        return this.f9520s;
    }

    public long C() {
        j.b().c(org.aspectj.runtime.reflect.e.v(Y, this, this));
        return this.C;
    }

    public int D() {
        j.b().c(org.aspectj.runtime.reflect.e.v(I, this, this));
        return this.f9522u;
    }

    public int E() {
        j.b().c(org.aspectj.runtime.reflect.e.v(G, this, this));
        return this.f9521t;
    }

    public int F() {
        j.b().c(org.aspectj.runtime.reflect.e.v(S, this, this));
        return this.f9527z;
    }

    public void G(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(X, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.B = i4;
    }

    public void H(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(R, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9526y = i4;
    }

    public void I(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(L, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9523v = i4;
    }

    public void J(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(N, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9524w = i4;
    }

    public void K(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(P, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9525x = i4;
    }

    public void L(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(V, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.A = i4;
    }

    public void M(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(F, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9520s = i4;
    }

    public void N(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(Z, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.C = i4;
    }

    public void O(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(J, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9522u = i4;
    }

    public void P(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(H, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9521t = i4;
    }

    public void Q(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(T, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9527z = i4;
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9520s = com.coremedia.iso.g.l(byteBuffer);
        this.f9521t = com.coremedia.iso.g.p(byteBuffer);
        this.f9522u = com.coremedia.iso.g.p(byteBuffer);
        this.f9523v = com.coremedia.iso.g.p(byteBuffer);
        this.f9524w = com.coremedia.iso.g.p(byteBuffer);
        this.f9525x = com.coremedia.iso.g.p(byteBuffer);
        this.f9526y = com.coremedia.iso.g.p(byteBuffer);
        this.f9527z = com.coremedia.iso.g.i(byteBuffer);
        this.A = com.coremedia.iso.g.l(byteBuffer);
        this.B = com.coremedia.iso.g.l(byteBuffer);
        this.C = com.coremedia.iso.g.l(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        i.i(byteBuffer, this.f9520s);
        i.m(byteBuffer, this.f9521t);
        i.m(byteBuffer, this.f9522u);
        i.m(byteBuffer, this.f9523v);
        i.m(byteBuffer, this.f9524w);
        i.m(byteBuffer, this.f9525x);
        i.m(byteBuffer, this.f9526y);
        i.f(byteBuffer, this.f9527z);
        i.i(byteBuffer, this.A);
        i.i(byteBuffer, this.B);
        i.i(byteBuffer, this.C);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 28L;
    }

    public long v() {
        j.b().c(org.aspectj.runtime.reflect.e.v(W, this, this));
        return this.B;
    }

    public int w() {
        j.b().c(org.aspectj.runtime.reflect.e.v(Q, this, this));
        return this.f9526y;
    }

    public int x() {
        j.b().c(org.aspectj.runtime.reflect.e.v(K, this, this));
        return this.f9523v;
    }

    public int y() {
        j.b().c(org.aspectj.runtime.reflect.e.v(M, this, this));
        return this.f9524w;
    }

    public int z() {
        j.b().c(org.aspectj.runtime.reflect.e.v(O, this, this));
        return this.f9525x;
    }
}
