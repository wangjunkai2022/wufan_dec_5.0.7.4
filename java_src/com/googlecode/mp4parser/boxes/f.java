package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.j;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: MLPSpecificBox.java */
/* loaded from: classes3.dex */
public class f extends com.googlecode.mp4parser.a {
    private static final /* synthetic */ c.b A = null;

    /* renamed from: s  reason: collision with root package name */
    public static final String f13839s = "dmlp";

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ c.b f13840t = null;

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f13841u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f13842v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f13843w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f13844x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f13845y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f13846z = null;

    /* renamed from: o  reason: collision with root package name */
    int f13847o;

    /* renamed from: p  reason: collision with root package name */
    int f13848p;

    /* renamed from: q  reason: collision with root package name */
    int f13849q;

    /* renamed from: r  reason: collision with root package name */
    int f13850r;

    static {
        s();
    }

    public f() {
        super(f13839s);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("MLPSpecificBox.java", f.class);
        f13840t = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getFormat_info", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", MethodReflectParams.INT), 49);
        f13841u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setFormat_info", "com.googlecode.mp4parser.boxes.MLPSpecificBox", MethodReflectParams.INT, "format_info", "", "void"), 53);
        f13842v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getPeak_data_rate", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", MethodReflectParams.INT), 57);
        f13843w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setPeak_data_rate", "com.googlecode.mp4parser.boxes.MLPSpecificBox", MethodReflectParams.INT, "peak_data_rate", "", "void"), 61);
        f13844x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getReserved", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", MethodReflectParams.INT), 65);
        f13845y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setReserved", "com.googlecode.mp4parser.boxes.MLPSpecificBox", MethodReflectParams.INT, "reserved", "", "void"), 69);
        f13846z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getReserved2", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", MethodReflectParams.INT), 73);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setReserved2", "com.googlecode.mp4parser.boxes.MLPSpecificBox", MethodReflectParams.INT, "reserved2", "", "void"), 77);
    }

    public void A(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(A, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13850r = i4;
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(byteBuffer);
        this.f13847o = cVar.c(32);
        this.f13848p = cVar.c(15);
        this.f13849q = cVar.c(1);
        this.f13850r = cVar.c(32);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.d dVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.d(byteBuffer);
        dVar.a(this.f13847o, 32);
        dVar.a(this.f13848p, 15);
        dVar.a(this.f13849q, 1);
        dVar.a(this.f13850r, 32);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 10L;
    }

    public int t() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f13840t, this, this));
        return this.f13847o;
    }

    public int u() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f13842v, this, this));
        return this.f13848p;
    }

    public int v() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f13844x, this, this));
        return this.f13849q;
    }

    public int w() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f13846z, this, this));
        return this.f13850r;
    }

    public void x(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f13841u, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13847o = i4;
    }

    public void y(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f13843w, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13848p = i4;
    }

    public void z(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f13845y, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13849q = i4;
    }
}
