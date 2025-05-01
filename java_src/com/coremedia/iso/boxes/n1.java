package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: XmlBox.java */
/* loaded from: classes2.dex */
public class n1 extends com.googlecode.mp4parser.c {

    /* renamed from: t  reason: collision with root package name */
    public static final String f9813t = "xml ";

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f9814u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9815v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9816w = null;

    /* renamed from: s  reason: collision with root package name */
    String f9817s;

    static {
        s();
    }

    public n1() {
        super(f9813t);
        this.f9817s = "";
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("XmlBox.java", n1.class);
        f9814u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getXml", "com.coremedia.iso.boxes.XmlBox", "", "", "", "java.lang.String"), 20);
        f9815v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setXml", "com.coremedia.iso.boxes.XmlBox", "java.lang.String", "xml", "", "void"), 24);
        f9816w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.XmlBox", "", "", "", "java.lang.String"), 46);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9817s = com.coremedia.iso.g.h(byteBuffer, byteBuffer.remaining());
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        byteBuffer.put(com.coremedia.iso.l.b(this.f9817s));
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return com.coremedia.iso.l.c(this.f9817s) + 4;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9816w, this, this));
        return "XmlBox{xml='" + this.f9817s + "'}";
    }

    public String v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9814u, this, this));
        return this.f9817s;
    }

    public void w(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9815v, this, this, str));
        this.f9817s = str;
    }
}
