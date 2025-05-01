package com.coremedia.iso.boxes;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: ClassificationBox.java */
/* loaded from: classes2.dex */
public class g extends com.googlecode.mp4parser.c {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;
    private static final /* synthetic */ c.b C = null;
    private static final /* synthetic */ c.b D = null;
    private static final /* synthetic */ c.b E = null;
    private static final /* synthetic */ c.b F = null;

    /* renamed from: w  reason: collision with root package name */
    public static final String f9686w = "clsf";

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f9687x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f9688y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f9689z = null;

    /* renamed from: s  reason: collision with root package name */
    private String f9690s;

    /* renamed from: t  reason: collision with root package name */
    private int f9691t;

    /* renamed from: u  reason: collision with root package name */
    private String f9692u;

    /* renamed from: v  reason: collision with root package name */
    private String f9693v;

    static {
        s();
    }

    public g() {
        super(f9686w);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("ClassificationBox.java", g.class);
        f9687x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLanguage", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 44);
        f9688y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getClassificationEntity", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 48);
        f9689z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getClassificationTableIndex", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", MethodReflectParams.INT), 52);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getClassificationInfo", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 56);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setClassificationEntity", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", "classificationEntity", "", "void"), 60);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setClassificationTableIndex", "com.coremedia.iso.boxes.ClassificationBox", MethodReflectParams.INT, "classificationTableIndex", "", "void"), 64);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLanguage", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", "language", "", "void"), 68);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setClassificationInfo", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", "classificationInfo", "", "void"), 72);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 101);
    }

    public void A(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(E, this, this, str));
        this.f9693v = str;
    }

    public void B(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(C, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9691t = i4;
    }

    public void C(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(D, this, this, str));
        this.f9692u = str;
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        this.f9690s = com.coremedia.iso.f.B(bArr);
        this.f9691t = com.coremedia.iso.g.i(byteBuffer);
        this.f9692u = com.coremedia.iso.g.f(byteBuffer);
        this.f9693v = com.coremedia.iso.g.g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        byteBuffer.put(com.coremedia.iso.f.C(this.f9690s));
        com.coremedia.iso.i.f(byteBuffer, this.f9691t);
        com.coremedia.iso.i.d(byteBuffer, this.f9692u);
        byteBuffer.put(com.coremedia.iso.l.b(this.f9693v));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return com.coremedia.iso.l.c(this.f9693v) + 8 + 1;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(F, this, this));
        return "ClassificationBox[language=" + y() + "classificationEntity=" + v() + ";classificationTableIndex=" + x() + ";language=" + y() + ";classificationInfo=" + w() + "]";
    }

    public String v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9688y, this, this));
        return this.f9690s;
    }

    public String w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(A, this, this));
        return this.f9693v;
    }

    public int x() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9689z, this, this));
        return this.f9691t;
    }

    public String y() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9687x, this, this));
        return this.f9692u;
    }

    public void z(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(B, this, this, str));
        this.f9690s = str;
    }
}
