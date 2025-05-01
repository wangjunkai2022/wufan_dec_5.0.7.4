package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: TitleBox.java */
/* loaded from: classes2.dex */
public class e1 extends com.googlecode.mp4parser.c {

    /* renamed from: u  reason: collision with root package name */
    public static final String f9593u = "titl";

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9594v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9595w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f9596x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f9597y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f9598z = null;

    /* renamed from: s  reason: collision with root package name */
    private String f9599s;

    /* renamed from: t  reason: collision with root package name */
    private String f9600t;

    static {
        s();
    }

    public e1() {
        super(f9593u);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("TitleBox.java", e1.class);
        f9594v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLanguage", "com.coremedia.iso.boxes.TitleBox", "", "", "", "java.lang.String"), 46);
        f9595w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getTitle", "com.coremedia.iso.boxes.TitleBox", "", "", "", "java.lang.String"), 50);
        f9596x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLanguage", "com.coremedia.iso.boxes.TitleBox", "java.lang.String", "language", "", "void"), 59);
        f9597y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setTitle", "com.coremedia.iso.boxes.TitleBox", "java.lang.String", "title", "", "void"), 63);
        f9598z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.TitleBox", "", "", "", "java.lang.String"), 86);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9599s = com.coremedia.iso.g.f(byteBuffer);
        this.f9600t = com.coremedia.iso.g.g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.d(byteBuffer, this.f9599s);
        byteBuffer.put(com.coremedia.iso.l.b(this.f9600t));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return com.coremedia.iso.l.c(this.f9600t) + 7;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9598z, this, this));
        return "TitleBox[language=" + v() + ";title=" + w() + "]";
    }

    public String v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9594v, this, this));
        return this.f9599s;
    }

    public String w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9595w, this, this));
        return this.f9600t;
    }

    public void x(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9596x, this, this, str));
        this.f9599s = str;
    }

    public void y(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9597y, this, this, str));
        this.f9600t = str;
    }
}
