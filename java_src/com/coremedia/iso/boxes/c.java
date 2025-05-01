package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: AuthorBox.java */
/* loaded from: classes2.dex */
public class c extends com.googlecode.mp4parser.c {

    /* renamed from: u  reason: collision with root package name */
    public static final String f9544u = "auth";

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9545v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9546w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f9547x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f9548y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f9549z = null;

    /* renamed from: s  reason: collision with root package name */
    private String f9550s;

    /* renamed from: t  reason: collision with root package name */
    private String f9551t;

    static {
        s();
    }

    public c() {
        super(f9544u);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("AuthorBox.java", c.class);
        f9545v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLanguage", "com.coremedia.iso.boxes.AuthorBox", "", "", "", "java.lang.String"), 51);
        f9546w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getAuthor", "com.coremedia.iso.boxes.AuthorBox", "", "", "", "java.lang.String"), 60);
        f9547x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLanguage", "com.coremedia.iso.boxes.AuthorBox", "java.lang.String", "language", "", "void"), 64);
        f9548y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setAuthor", "com.coremedia.iso.boxes.AuthorBox", "java.lang.String", "author", "", "void"), 68);
        f9549z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.AuthorBox", "", "", "", "java.lang.String"), 92);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9550s = com.coremedia.iso.g.f(byteBuffer);
        this.f9551t = com.coremedia.iso.g.g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.d(byteBuffer, this.f9550s);
        byteBuffer.put(com.coremedia.iso.l.b(this.f9551t));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return com.coremedia.iso.l.c(this.f9551t) + 7;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9549z, this, this));
        return "AuthorBox[language=" + w() + ";author=" + v() + "]";
    }

    public String v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9546w, this, this));
        return this.f9551t;
    }

    public String w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9545v, this, this));
        return this.f9550s;
    }

    public void x(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9548y, this, this, str));
        this.f9551t = str;
    }

    public void y(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9547x, this, this, str));
        this.f9550s = str;
    }
}
