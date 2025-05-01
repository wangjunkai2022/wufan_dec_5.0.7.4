package com.mp4parser.iso14496.part15;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: TierInfoBox.java */
/* loaded from: classes5.dex */
public class k extends com.googlecode.mp4parser.a {
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
    private static final /* synthetic */ c.b O = null;
    private static final /* synthetic */ c.b P = null;
    private static final /* synthetic */ c.b Q = null;
    private static final /* synthetic */ c.b R = null;
    private static final /* synthetic */ c.b S = null;
    private static final /* synthetic */ c.b T = null;
    private static final /* synthetic */ c.b U = null;
    private static final /* synthetic */ c.b V = null;

    /* renamed from: z  reason: collision with root package name */
    public static final String f57226z = "tiri";

    /* renamed from: o  reason: collision with root package name */
    int f57227o;

    /* renamed from: p  reason: collision with root package name */
    int f57228p;

    /* renamed from: q  reason: collision with root package name */
    int f57229q;

    /* renamed from: r  reason: collision with root package name */
    int f57230r;

    /* renamed from: s  reason: collision with root package name */
    int f57231s;

    /* renamed from: t  reason: collision with root package name */
    int f57232t;

    /* renamed from: u  reason: collision with root package name */
    int f57233u;

    /* renamed from: v  reason: collision with root package name */
    int f57234v;

    /* renamed from: w  reason: collision with root package name */
    int f57235w;

    /* renamed from: x  reason: collision with root package name */
    int f57236x;

    /* renamed from: y  reason: collision with root package name */
    int f57237y;

    static {
        s();
    }

    public k() {
        super(f57226z);
        this.f57231s = 0;
        this.f57236x = 0;
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("TierInfoBox.java", k.class);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getTierID", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", MethodReflectParams.INT), 69);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setTierID", "com.mp4parser.iso14496.part15.TierInfoBox", MethodReflectParams.INT, "tierID", "", "void"), 73);
        K = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getVisualWidth", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", MethodReflectParams.INT), 109);
        L = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setVisualWidth", "com.mp4parser.iso14496.part15.TierInfoBox", MethodReflectParams.INT, "visualWidth", "", "void"), 113);
        M = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getVisualHeight", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", MethodReflectParams.INT), 117);
        N = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setVisualHeight", "com.mp4parser.iso14496.part15.TierInfoBox", MethodReflectParams.INT, "visualHeight", "", "void"), 121);
        O = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDiscardable", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", MethodReflectParams.INT), 125);
        P = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDiscardable", "com.mp4parser.iso14496.part15.TierInfoBox", MethodReflectParams.INT, "discardable", "", "void"), 129);
        Q = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getConstantFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", MethodReflectParams.INT), 133);
        R = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setConstantFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", MethodReflectParams.INT, "constantFrameRate", "", "void"), 137);
        S = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getReserved2", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", MethodReflectParams.INT), 141);
        T = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setReserved2", "com.mp4parser.iso14496.part15.TierInfoBox", MethodReflectParams.INT, "reserved2", "", "void"), 145);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getProfileIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", MethodReflectParams.INT), 77);
        U = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", MethodReflectParams.INT), 149);
        V = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", MethodReflectParams.INT, "frameRate", "", "void"), 153);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setProfileIndication", "com.mp4parser.iso14496.part15.TierInfoBox", MethodReflectParams.INT, "profileIndication", "", "void"), 81);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getProfile_compatibility", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", MethodReflectParams.INT), 85);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setProfile_compatibility", "com.mp4parser.iso14496.part15.TierInfoBox", MethodReflectParams.INT, "profile_compatibility", "", "void"), 89);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLevelIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", MethodReflectParams.INT), 93);
        H = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLevelIndication", "com.mp4parser.iso14496.part15.TierInfoBox", MethodReflectParams.INT, "levelIndication", "", "void"), 97);
        I = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getReserved1", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", MethodReflectParams.INT), 101);
        J = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setReserved1", "com.mp4parser.iso14496.part15.TierInfoBox", MethodReflectParams.INT, "reserved1", "", "void"), 105);
    }

    public int A() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(S, this, this));
        return this.f57236x;
    }

    public int B() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(A, this, this));
        return this.f57227o;
    }

    public int C() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(M, this, this));
        return this.f57233u;
    }

    public int D() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(K, this, this));
        return this.f57232t;
    }

    public void E(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(R, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f57235w = i4;
    }

    public void F(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(P, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f57234v = i4;
    }

    public void G(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(V, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f57237y = i4;
    }

    public void H(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(H, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f57230r = i4;
    }

    public void I(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(D, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f57228p = i4;
    }

    public void J(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(F, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f57229q = i4;
    }

    public void K(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(J, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f57231s = i4;
    }

    public void L(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(T, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f57236x = i4;
    }

    public void M(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(B, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f57227o = i4;
    }

    public void N(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(N, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f57233u = i4;
    }

    public void O(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(L, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f57232t = i4;
    }

    @Override // com.googlecode.mp4parser.a
    protected void b(ByteBuffer byteBuffer) {
        this.f57227o = com.coremedia.iso.g.i(byteBuffer);
        this.f57228p = com.coremedia.iso.g.p(byteBuffer);
        this.f57229q = com.coremedia.iso.g.p(byteBuffer);
        this.f57230r = com.coremedia.iso.g.p(byteBuffer);
        this.f57231s = com.coremedia.iso.g.p(byteBuffer);
        this.f57232t = com.coremedia.iso.g.i(byteBuffer);
        this.f57233u = com.coremedia.iso.g.i(byteBuffer);
        int p4 = com.coremedia.iso.g.p(byteBuffer);
        this.f57234v = (p4 & 192) >> 6;
        this.f57235w = (p4 & 48) >> 4;
        this.f57236x = p4 & 15;
        this.f57237y = com.coremedia.iso.g.i(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        com.coremedia.iso.i.f(byteBuffer, this.f57227o);
        com.coremedia.iso.i.m(byteBuffer, this.f57228p);
        com.coremedia.iso.i.m(byteBuffer, this.f57229q);
        com.coremedia.iso.i.m(byteBuffer, this.f57230r);
        com.coremedia.iso.i.m(byteBuffer, this.f57231s);
        com.coremedia.iso.i.f(byteBuffer, this.f57232t);
        com.coremedia.iso.i.f(byteBuffer, this.f57233u);
        com.coremedia.iso.i.m(byteBuffer, (this.f57234v << 6) + (this.f57235w << 4) + this.f57236x);
        com.coremedia.iso.i.f(byteBuffer, this.f57237y);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 13L;
    }

    public int t() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(Q, this, this));
        return this.f57235w;
    }

    public int u() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(O, this, this));
        return this.f57234v;
    }

    public int v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(U, this, this));
        return this.f57237y;
    }

    public int w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(G, this, this));
        return this.f57230r;
    }

    public int x() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(C, this, this));
        return this.f57228p;
    }

    public int y() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(E, this, this));
        return this.f57229q;
    }

    public int z() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(I, this, this));
        return this.f57231s;
    }
}
