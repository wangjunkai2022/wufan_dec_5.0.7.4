package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: DescriptionBox.java */
/* loaded from: classes2.dex */
public class p extends com.googlecode.mp4parser.c {

    /* renamed from: u  reason: collision with root package name */
    public static final String f9822u = "dscp";

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9823v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9824w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f9825x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f9826y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f9827z = null;

    /* renamed from: s  reason: collision with root package name */
    private String f9828s;

    /* renamed from: t  reason: collision with root package name */
    private String f9829t;

    static {
        s();
    }

    public p() {
        super(f9822u);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("DescriptionBox.java", p.class);
        f9823v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLanguage", "com.coremedia.iso.boxes.DescriptionBox", "", "", "", "java.lang.String"), 40);
        f9824w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDescription", "com.coremedia.iso.boxes.DescriptionBox", "", "", "", "java.lang.String"), 44);
        f9825x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.DescriptionBox", "", "", "", "java.lang.String"), 67);
        f9826y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLanguage", "com.coremedia.iso.boxes.DescriptionBox", "java.lang.String", "language", "", "void"), 71);
        f9827z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDescription", "com.coremedia.iso.boxes.DescriptionBox", "java.lang.String", com.xinzhu.overmind.client.hook.proxies.context.providers.b.f67677k, "", "void"), 75);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9828s = com.coremedia.iso.g.f(byteBuffer);
        this.f9829t = com.coremedia.iso.g.g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.d(byteBuffer, this.f9828s);
        byteBuffer.put(com.coremedia.iso.l.b(this.f9829t));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return com.coremedia.iso.l.c(this.f9829t) + 7;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9825x, this, this));
        return "DescriptionBox[language=" + w() + ";description=" + v() + "]";
    }

    public String v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9824w, this, this));
        return this.f9829t;
    }

    public String w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9823v, this, this));
        return this.f9828s;
    }

    public void x(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9827z, this, this, str));
        this.f9829t = str;
    }

    public void y(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9826y, this, this, str));
        this.f9828s = str;
    }
}
