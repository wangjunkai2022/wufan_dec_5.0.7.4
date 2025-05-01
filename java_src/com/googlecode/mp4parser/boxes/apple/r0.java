package com.googlecode.mp4parser.boxes.apple;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: GenericMediaHeaderTextAtom.java */
/* loaded from: classes3.dex */
public class r0 extends com.googlecode.mp4parser.a {
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

    /* renamed from: x  reason: collision with root package name */
    public static final String f13660x = "text";

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f13661y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f13662z = null;

    /* renamed from: o  reason: collision with root package name */
    int f13663o;

    /* renamed from: p  reason: collision with root package name */
    int f13664p;

    /* renamed from: q  reason: collision with root package name */
    int f13665q;

    /* renamed from: r  reason: collision with root package name */
    int f13666r;

    /* renamed from: s  reason: collision with root package name */
    int f13667s;

    /* renamed from: t  reason: collision with root package name */
    int f13668t;

    /* renamed from: u  reason: collision with root package name */
    int f13669u;

    /* renamed from: v  reason: collision with root package name */
    int f13670v;

    /* renamed from: w  reason: collision with root package name */
    int f13671w;

    static {
        s();
    }

    public r0() {
        super("text");
        this.f13663o = 65536;
        this.f13667s = 65536;
        this.f13671w = 1073741824;
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("GenericMediaHeaderTextAtom.java", r0.class);
        f13661y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getUnknown_1", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", MethodReflectParams.INT), 60);
        f13662z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setUnknown_1", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", MethodReflectParams.INT, "unknown_1", "", "void"), 64);
        I = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getUnknown_6", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", MethodReflectParams.INT), 100);
        J = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setUnknown_6", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", MethodReflectParams.INT, "unknown_6", "", "void"), 104);
        K = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getUnknown_7", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", MethodReflectParams.INT), 108);
        L = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setUnknown_7", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", MethodReflectParams.INT, "unknown_7", "", "void"), 112);
        M = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getUnknown_8", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", MethodReflectParams.INT), 116);
        N = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setUnknown_8", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", MethodReflectParams.INT, "unknown_8", "", "void"), 120);
        O = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getUnknown_9", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", MethodReflectParams.INT), 124);
        P = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setUnknown_9", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", MethodReflectParams.INT, "unknown_9", "", "void"), 128);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getUnknown_2", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", MethodReflectParams.INT), 68);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setUnknown_2", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", MethodReflectParams.INT, "unknown_2", "", "void"), 72);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getUnknown_3", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", MethodReflectParams.INT), 76);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setUnknown_3", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", MethodReflectParams.INT, "unknown_3", "", "void"), 80);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getUnknown_4", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", MethodReflectParams.INT), 84);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setUnknown_4", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", MethodReflectParams.INT, "unknown_4", "", "void"), 88);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getUnknown_5", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", MethodReflectParams.INT), 92);
        H = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setUnknown_5", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", MethodReflectParams.INT, "unknown_5", "", "void"), 96);
    }

    public int A() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(M, this, this));
        return this.f13670v;
    }

    public int B() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(O, this, this));
        return this.f13671w;
    }

    public void C(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f13662z, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13663o = i4;
    }

    public void D(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(B, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13664p = i4;
    }

    public void E(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(D, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13665q = i4;
    }

    public void F(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(F, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13666r = i4;
    }

    public void G(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(H, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13667s = i4;
    }

    public void H(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(J, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13668t = i4;
    }

    public void I(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(L, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13669u = i4;
    }

    public void J(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(N, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13670v = i4;
    }

    public void K(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(P, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13671w = i4;
    }

    @Override // com.googlecode.mp4parser.a
    protected void b(ByteBuffer byteBuffer) {
        this.f13663o = byteBuffer.getInt();
        this.f13664p = byteBuffer.getInt();
        this.f13665q = byteBuffer.getInt();
        this.f13666r = byteBuffer.getInt();
        this.f13667s = byteBuffer.getInt();
        this.f13668t = byteBuffer.getInt();
        this.f13669u = byteBuffer.getInt();
        this.f13670v = byteBuffer.getInt();
        this.f13671w = byteBuffer.getInt();
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.f13663o);
        byteBuffer.putInt(this.f13664p);
        byteBuffer.putInt(this.f13665q);
        byteBuffer.putInt(this.f13666r);
        byteBuffer.putInt(this.f13667s);
        byteBuffer.putInt(this.f13668t);
        byteBuffer.putInt(this.f13669u);
        byteBuffer.putInt(this.f13670v);
        byteBuffer.putInt(this.f13671w);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 36L;
    }

    public int t() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f13661y, this, this));
        return this.f13663o;
    }

    public int u() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(A, this, this));
        return this.f13664p;
    }

    public int v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(C, this, this));
        return this.f13665q;
    }

    public int w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(E, this, this));
        return this.f13666r;
    }

    public int x() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(G, this, this));
        return this.f13667s;
    }

    public int y() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(I, this, this));
        return this.f13668t;
    }

    public int z() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(K, this, this));
        return this.f13669u;
    }
}
