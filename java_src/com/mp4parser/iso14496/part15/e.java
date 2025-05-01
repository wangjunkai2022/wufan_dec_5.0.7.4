package com.mp4parser.iso14496.part15;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: PriotityRangeBox.java */
/* loaded from: classes5.dex */
public class e extends com.googlecode.mp4parser.a {
    private static final /* synthetic */ c.b A = null;

    /* renamed from: s  reason: collision with root package name */
    public static final String f57184s = "svpr";

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ c.b f57185t = null;

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f57186u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f57187v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f57188w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f57189x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f57190y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f57191z = null;

    /* renamed from: o  reason: collision with root package name */
    int f57192o;

    /* renamed from: p  reason: collision with root package name */
    int f57193p;

    /* renamed from: q  reason: collision with root package name */
    int f57194q;

    /* renamed from: r  reason: collision with root package name */
    int f57195r;

    static {
        s();
    }

    public e() {
        super(f57184s);
        this.f57192o = 0;
        this.f57194q = 0;
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("PriotityRangeBox.java", e.class);
        f57185t = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getReserved1", "com.mp4parser.iso14496.part15.PriotityRangeBox", "", "", "", MethodReflectParams.INT), 45);
        f57186u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setReserved1", "com.mp4parser.iso14496.part15.PriotityRangeBox", MethodReflectParams.INT, "reserved1", "", "void"), 49);
        f57187v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getMin_priorityId", "com.mp4parser.iso14496.part15.PriotityRangeBox", "", "", "", MethodReflectParams.INT), 53);
        f57188w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setMin_priorityId", "com.mp4parser.iso14496.part15.PriotityRangeBox", MethodReflectParams.INT, "min_priorityId", "", "void"), 57);
        f57189x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getReserved2", "com.mp4parser.iso14496.part15.PriotityRangeBox", "", "", "", MethodReflectParams.INT), 61);
        f57190y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setReserved2", "com.mp4parser.iso14496.part15.PriotityRangeBox", MethodReflectParams.INT, "reserved2", "", "void"), 65);
        f57191z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getMax_priorityId", "com.mp4parser.iso14496.part15.PriotityRangeBox", "", "", "", MethodReflectParams.INT), 69);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setMax_priorityId", "com.mp4parser.iso14496.part15.PriotityRangeBox", MethodReflectParams.INT, "max_priorityId", "", "void"), 73);
    }

    public void A(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f57190y, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f57194q = i4;
    }

    @Override // com.googlecode.mp4parser.a
    protected void b(ByteBuffer byteBuffer) {
        int p4 = com.coremedia.iso.g.p(byteBuffer);
        this.f57193p = p4;
        this.f57192o = (p4 & 192) >> 6;
        this.f57193p = p4 & 63;
        int p5 = com.coremedia.iso.g.p(byteBuffer);
        this.f57195r = p5;
        this.f57194q = (p5 & 192) >> 6;
        this.f57195r = p5 & 63;
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        com.coremedia.iso.i.m(byteBuffer, (this.f57192o << 6) + this.f57193p);
        com.coremedia.iso.i.m(byteBuffer, (this.f57194q << 6) + this.f57195r);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 2L;
    }

    public int t() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f57191z, this, this));
        return this.f57195r;
    }

    public int u() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f57187v, this, this));
        return this.f57193p;
    }

    public int v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f57185t, this, this));
        return this.f57192o;
    }

    public int w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f57189x, this, this));
        return this.f57194q;
    }

    public void x(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(A, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f57195r = i4;
    }

    public void y(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f57188w, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f57193p = i4;
    }

    public void z(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f57186u, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f57192o = i4;
    }
}
