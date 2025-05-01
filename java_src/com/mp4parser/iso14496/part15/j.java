package com.mp4parser.iso14496.part15;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: TierBitRateBox.java */
/* loaded from: classes5.dex */
public class j extends com.googlecode.mp4parser.a {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;
    private static final /* synthetic */ c.b C = null;
    private static final /* synthetic */ c.b D = null;
    private static final /* synthetic */ c.b E = null;
    private static final /* synthetic */ c.b F = null;
    private static final /* synthetic */ c.b G = null;

    /* renamed from: u  reason: collision with root package name */
    public static final String f57214u = "tibr";

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f57215v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f57216w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f57217x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f57218y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f57219z = null;

    /* renamed from: o  reason: collision with root package name */
    long f57220o;

    /* renamed from: p  reason: collision with root package name */
    long f57221p;

    /* renamed from: q  reason: collision with root package name */
    long f57222q;

    /* renamed from: r  reason: collision with root package name */
    long f57223r;

    /* renamed from: s  reason: collision with root package name */
    long f57224s;

    /* renamed from: t  reason: collision with root package name */
    long f57225t;

    static {
        s();
    }

    public j() {
        super(f57214u);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("TierBitRateBox.java", j.class);
        f57215v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", MethodReflectParams.LONG), 52);
        f57216w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", MethodReflectParams.LONG, "baseBitRate", "", "void"), 56);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getTierAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", MethodReflectParams.LONG), 92);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setTierAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", MethodReflectParams.LONG, "tierAvgBitRate", "", "void"), 96);
        f57217x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", MethodReflectParams.LONG), 60);
        f57218y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", MethodReflectParams.LONG, "maxBitRate", "", "void"), 64);
        f57219z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", MethodReflectParams.LONG), 68);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", MethodReflectParams.LONG, "avgBitRate", "", "void"), 72);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getTierBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", MethodReflectParams.LONG), 76);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setTierBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", MethodReflectParams.LONG, "tierBaseBitRate", "", "void"), 80);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getTierMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", MethodReflectParams.LONG), 84);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setTierMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", MethodReflectParams.LONG, "tierMaxBitRate", "", "void"), 88);
    }

    public void A(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f57216w, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f57220o = j4;
    }

    public void B(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f57218y, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f57221p = j4;
    }

    public void C(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(G, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f57225t = j4;
    }

    public void D(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(C, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f57223r = j4;
    }

    public void E(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(E, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f57224s = j4;
    }

    @Override // com.googlecode.mp4parser.a
    protected void b(ByteBuffer byteBuffer) {
        this.f57220o = com.coremedia.iso.g.l(byteBuffer);
        this.f57221p = com.coremedia.iso.g.l(byteBuffer);
        this.f57222q = com.coremedia.iso.g.l(byteBuffer);
        this.f57223r = com.coremedia.iso.g.l(byteBuffer);
        this.f57224s = com.coremedia.iso.g.l(byteBuffer);
        this.f57225t = com.coremedia.iso.g.l(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        com.coremedia.iso.i.i(byteBuffer, this.f57220o);
        com.coremedia.iso.i.i(byteBuffer, this.f57221p);
        com.coremedia.iso.i.i(byteBuffer, this.f57222q);
        com.coremedia.iso.i.i(byteBuffer, this.f57223r);
        com.coremedia.iso.i.i(byteBuffer, this.f57224s);
        com.coremedia.iso.i.i(byteBuffer, this.f57225t);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 24L;
    }

    public long t() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f57219z, this, this));
        return this.f57222q;
    }

    public long u() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f57215v, this, this));
        return this.f57220o;
    }

    public long v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f57217x, this, this));
        return this.f57221p;
    }

    public long w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(F, this, this));
        return this.f57225t;
    }

    public long x() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(B, this, this));
        return this.f57223r;
    }

    public long y() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(D, this, this));
        return this.f57224s;
    }

    public void z(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(A, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f57222q = j4;
    }
}
