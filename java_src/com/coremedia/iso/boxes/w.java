package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: GenreBox.java */
/* loaded from: classes2.dex */
public class w extends com.googlecode.mp4parser.c {

    /* renamed from: u  reason: collision with root package name */
    public static final String f9994u = "gnre";

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9995v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9996w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f9997x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f9998y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f9999z = null;

    /* renamed from: s  reason: collision with root package name */
    private String f10000s;

    /* renamed from: t  reason: collision with root package name */
    private String f10001t;

    static {
        s();
    }

    public w() {
        super(f9994u);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("GenreBox.java", w.class);
        f9995v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLanguage", "com.coremedia.iso.boxes.GenreBox", "", "", "", "java.lang.String"), 42);
        f9996w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getGenre", "com.coremedia.iso.boxes.GenreBox", "", "", "", "java.lang.String"), 46);
        f9997x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLanguage", "com.coremedia.iso.boxes.GenreBox", "java.lang.String", "language", "", "void"), 50);
        f9998y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setGenre", "com.coremedia.iso.boxes.GenreBox", "java.lang.String", "genre", "", "void"), 54);
        f9999z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.GenreBox", "", "", "", "java.lang.String"), 77);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f10000s = com.coremedia.iso.g.f(byteBuffer);
        this.f10001t = com.coremedia.iso.g.g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.d(byteBuffer, this.f10000s);
        byteBuffer.put(com.coremedia.iso.l.b(this.f10001t));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return com.coremedia.iso.l.c(this.f10001t) + 7;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9999z, this, this));
        return "GenreBox[language=" + w() + ";genre=" + v() + "]";
    }

    public String v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9996w, this, this));
        return this.f10001t;
    }

    public String w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9995v, this, this));
        return this.f10000s;
    }

    public void x(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9998y, this, this, str));
        this.f10001t = str;
    }

    public void y(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9997x, this, this, str));
        this.f10000s = str;
    }
}
