package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.j;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: AC3SpecificBox.java */
/* loaded from: classes3.dex */
public class a extends com.googlecode.mp4parser.a {
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

    /* renamed from: v  reason: collision with root package name */
    public static final String f13607v = "dac3";

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f13608w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f13609x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f13610y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f13611z = null;

    /* renamed from: o  reason: collision with root package name */
    int f13612o;

    /* renamed from: p  reason: collision with root package name */
    int f13613p;

    /* renamed from: q  reason: collision with root package name */
    int f13614q;

    /* renamed from: r  reason: collision with root package name */
    int f13615r;

    /* renamed from: s  reason: collision with root package name */
    int f13616s;

    /* renamed from: t  reason: collision with root package name */
    int f13617t;

    /* renamed from: u  reason: collision with root package name */
    int f13618u;

    static {
        s();
    }

    public a() {
        super(f13607v);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("AC3SpecificBox.java", a.class);
        f13608w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getFscod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", MethodReflectParams.INT), 55);
        f13609x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setFscod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", MethodReflectParams.INT, "fscod", "", "void"), 59);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getBitRateCode", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", MethodReflectParams.INT), 95);
        H = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setBitRateCode", "com.googlecode.mp4parser.boxes.AC3SpecificBox", MethodReflectParams.INT, "bitRateCode", "", "void"), 99);
        I = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getReserved", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", MethodReflectParams.INT), 103);
        J = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setReserved", "com.googlecode.mp4parser.boxes.AC3SpecificBox", MethodReflectParams.INT, "reserved", "", "void"), 107);
        K = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "java.lang.String"), 112);
        f13610y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getBsid", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", MethodReflectParams.INT), 63);
        f13611z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setBsid", "com.googlecode.mp4parser.boxes.AC3SpecificBox", MethodReflectParams.INT, "bsid", "", "void"), 67);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getBsmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", MethodReflectParams.INT), 71);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setBsmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", MethodReflectParams.INT, "bsmod", "", "void"), 75);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getAcmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", MethodReflectParams.INT), 79);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setAcmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", MethodReflectParams.INT, "acmod", "", "void"), 83);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLfeon", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", MethodReflectParams.INT), 87);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLfeon", "com.googlecode.mp4parser.boxes.AC3SpecificBox", MethodReflectParams.INT, "lfeon", "", "void"), 91);
    }

    public void A(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(D, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13615r = i4;
    }

    public void B(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(H, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13617t = i4;
    }

    public void C(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f13611z, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13613p = i4;
    }

    public void D(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(B, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13614q = i4;
    }

    public void E(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f13609x, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13612o = i4;
    }

    public void F(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(F, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13616s = i4;
    }

    public void G(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(J, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13618u = i4;
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(byteBuffer);
        this.f13612o = cVar.c(2);
        this.f13613p = cVar.c(5);
        this.f13614q = cVar.c(3);
        this.f13615r = cVar.c(3);
        this.f13616s = cVar.c(1);
        this.f13617t = cVar.c(5);
        this.f13618u = cVar.c(5);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.d dVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.d(byteBuffer);
        dVar.a(this.f13612o, 2);
        dVar.a(this.f13613p, 5);
        dVar.a(this.f13614q, 3);
        dVar.a(this.f13615r, 3);
        dVar.a(this.f13616s, 1);
        dVar.a(this.f13617t, 5);
        dVar.a(this.f13618u, 5);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 3L;
    }

    public int t() {
        j.b().c(org.aspectj.runtime.reflect.e.v(C, this, this));
        return this.f13615r;
    }

    public String toString() {
        j.b().c(org.aspectj.runtime.reflect.e.v(K, this, this));
        return "AC3SpecificBox{fscod=" + this.f13612o + ", bsid=" + this.f13613p + ", bsmod=" + this.f13614q + ", acmod=" + this.f13615r + ", lfeon=" + this.f13616s + ", bitRateCode=" + this.f13617t + ", reserved=" + this.f13618u + '}';
    }

    public int u() {
        j.b().c(org.aspectj.runtime.reflect.e.v(G, this, this));
        return this.f13617t;
    }

    public int v() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f13610y, this, this));
        return this.f13613p;
    }

    public int w() {
        j.b().c(org.aspectj.runtime.reflect.e.v(A, this, this));
        return this.f13614q;
    }

    public int x() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f13608w, this, this));
        return this.f13612o;
    }

    public int y() {
        j.b().c(org.aspectj.runtime.reflect.e.v(E, this, this));
        return this.f13616s;
    }

    public int z() {
        j.b().c(org.aspectj.runtime.reflect.e.v(I, this, this));
        return this.f13618u;
    }
}
