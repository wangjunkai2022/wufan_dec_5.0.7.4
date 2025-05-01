package com.coremedia.iso.boxes;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: SchemeTypeBox.java */
/* loaded from: classes2.dex */
public class x0 extends com.googlecode.mp4parser.c {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;
    private static final /* synthetic */ c.b C = null;
    private static final /* synthetic */ c.b D = null;

    /* renamed from: v  reason: collision with root package name */
    public static final String f10011v = "schm";

    /* renamed from: w  reason: collision with root package name */
    static final /* synthetic */ boolean f10012w = false;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f10013x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f10014y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f10015z = null;

    /* renamed from: s  reason: collision with root package name */
    String f10016s;

    /* renamed from: t  reason: collision with root package name */
    long f10017t;

    /* renamed from: u  reason: collision with root package name */
    String f10018u;

    static {
        s();
    }

    public x0() {
        super(f10011v);
        this.f10016s = "    ";
        this.f10018u = null;
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("SchemeTypeBox.java", x0.class);
        f10013x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSchemeType", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 44);
        f10014y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSchemeVersion", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", MethodReflectParams.LONG), 48);
        f10015z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSchemeUri", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 52);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setSchemeType", "com.coremedia.iso.boxes.SchemeTypeBox", "java.lang.String", "schemeType", "", "void"), 56);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setSchemeVersion", "com.coremedia.iso.boxes.SchemeTypeBox", MethodReflectParams.INT, "schemeVersion", "", "void"), 61);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setSchemeUri", "com.coremedia.iso.boxes.SchemeTypeBox", "java.lang.String", "schemeUri", "", "void"), 65);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 93);
    }

    public void A(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(B, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f10017t = i4;
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f10016s = com.coremedia.iso.g.b(byteBuffer);
        this.f10017t = com.coremedia.iso.g.l(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.f10018u = com.coremedia.iso.g.g(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        byteBuffer.put(com.coremedia.iso.f.C(this.f10016s));
        com.coremedia.iso.i.i(byteBuffer, this.f10017t);
        if ((getFlags() & 1) == 1) {
            byteBuffer.put(com.coremedia.iso.l.b(this.f10018u));
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return ((getFlags() & 1) == 1 ? com.coremedia.iso.l.c(this.f10018u) + 1 : 0) + 12;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(D, this, this));
        return "Schema Type Box[schemeUri=" + this.f10018u + "; schemeType=" + this.f10016s + "; schemeVersion=" + this.f10017t + "; ]";
    }

    public String v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f10013x, this, this));
        return this.f10016s;
    }

    public String w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f10015z, this, this));
        return this.f10018u;
    }

    public long x() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f10014y, this, this));
        return this.f10017t;
    }

    public void y(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(A, this, this, str));
        this.f10016s = str;
    }

    public void z(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(C, this, this, str));
        this.f10018u = str;
    }
}
