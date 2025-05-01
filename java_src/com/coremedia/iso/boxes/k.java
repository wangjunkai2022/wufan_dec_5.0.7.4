package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: CopyrightBox.java */
/* loaded from: classes2.dex */
public class k extends com.googlecode.mp4parser.c {

    /* renamed from: u  reason: collision with root package name */
    public static final String f9745u = "cprt";

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9746v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9747w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f9748x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f9749y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f9750z = null;

    /* renamed from: s  reason: collision with root package name */
    private String f9751s;

    /* renamed from: t  reason: collision with root package name */
    private String f9752t;

    static {
        s();
    }

    public k() {
        super(f9745u);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("CopyrightBox.java", k.class);
        f9746v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLanguage", "com.coremedia.iso.boxes.CopyrightBox", "", "", "", "java.lang.String"), 46);
        f9747w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getCopyright", "com.coremedia.iso.boxes.CopyrightBox", "", "", "", "java.lang.String"), 50);
        f9748x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLanguage", "com.coremedia.iso.boxes.CopyrightBox", "java.lang.String", "language", "", "void"), 54);
        f9749y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setCopyright", "com.coremedia.iso.boxes.CopyrightBox", "java.lang.String", "copyright", "", "void"), 58);
        f9750z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.CopyrightBox", "", "", "", "java.lang.String"), 81);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9751s = com.coremedia.iso.g.f(byteBuffer);
        this.f9752t = com.coremedia.iso.g.g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.d(byteBuffer, this.f9751s);
        byteBuffer.put(com.coremedia.iso.l.b(this.f9752t));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return com.coremedia.iso.l.c(this.f9752t) + 7;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9750z, this, this));
        return "CopyrightBox[language=" + w() + ";copyright=" + v() + "]";
    }

    public String v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9747w, this, this));
        return this.f9752t;
    }

    public String w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9746v, this, this));
        return this.f9751s;
    }

    public void x(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9749y, this, this, str));
        this.f9752t = str;
    }

    public void y(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9748x, this, this, str));
        this.f9751s = str;
    }
}
