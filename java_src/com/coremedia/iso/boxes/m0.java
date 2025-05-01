package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: PerformerBox.java */
/* loaded from: classes2.dex */
public class m0 extends com.googlecode.mp4parser.c {

    /* renamed from: u  reason: collision with root package name */
    public static final String f9781u = "perf";

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9782v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9783w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f9784x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f9785y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f9786z = null;

    /* renamed from: s  reason: collision with root package name */
    private String f9787s;

    /* renamed from: t  reason: collision with root package name */
    private String f9788t;

    static {
        s();
    }

    public m0() {
        super(f9781u);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("PerformerBox.java", m0.class);
        f9782v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLanguage", "com.coremedia.iso.boxes.PerformerBox", "", "", "", "java.lang.String"), 41);
        f9783w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getPerformer", "com.coremedia.iso.boxes.PerformerBox", "", "", "", "java.lang.String"), 45);
        f9784x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLanguage", "com.coremedia.iso.boxes.PerformerBox", "java.lang.String", "language", "", "void"), 49);
        f9785y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setPerformer", "com.coremedia.iso.boxes.PerformerBox", "java.lang.String", "performer", "", "void"), 53);
        f9786z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.PerformerBox", "", "", "", "java.lang.String"), 76);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9787s = com.coremedia.iso.g.f(byteBuffer);
        this.f9788t = com.coremedia.iso.g.g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.d(byteBuffer, this.f9787s);
        byteBuffer.put(com.coremedia.iso.l.b(this.f9788t));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return com.coremedia.iso.l.c(this.f9788t) + 6 + 1;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9786z, this, this));
        return "PerformerBox[language=" + v() + ";performer=" + w() + "]";
    }

    public String v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9782v, this, this));
        return this.f9787s;
    }

    public String w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9783w, this, this));
        return this.f9788t;
    }

    public void x(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9784x, this, this, str));
        this.f9787s = str;
    }

    public void y(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9785y, this, this, str));
        this.f9788t = str;
    }
}
