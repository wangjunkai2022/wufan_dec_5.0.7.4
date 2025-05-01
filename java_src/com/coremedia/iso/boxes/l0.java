package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: OriginalFormatBox.java */
/* loaded from: classes2.dex */
public class l0 extends com.googlecode.mp4parser.a {

    /* renamed from: p  reason: collision with root package name */
    public static final String f9768p = "frma";

    /* renamed from: q  reason: collision with root package name */
    static final /* synthetic */ boolean f9769q = false;

    /* renamed from: r  reason: collision with root package name */
    private static final /* synthetic */ c.b f9770r = null;

    /* renamed from: s  reason: collision with root package name */
    private static final /* synthetic */ c.b f9771s = null;

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ c.b f9772t = null;

    /* renamed from: o  reason: collision with root package name */
    private String f9773o;

    static {
        s();
    }

    public l0() {
        super(f9768p);
        this.f9773o = "    ";
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("OriginalFormatBox.java", l0.class);
        f9770r = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDataFormat", "com.coremedia.iso.boxes.OriginalFormatBox", "", "", "", "java.lang.String"), 42);
        f9771s = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDataFormat", "com.coremedia.iso.boxes.OriginalFormatBox", "java.lang.String", "dataFormat", "", "void"), 47);
        f9772t = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.OriginalFormatBox", "", "", "", "java.lang.String"), 67);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        this.f9773o = com.coremedia.iso.g.b(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        byteBuffer.put(com.coremedia.iso.f.C(this.f9773o));
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 4L;
    }

    public String t() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9770r, this, this));
        return this.f9773o;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9772t, this, this));
        return "OriginalFormatBox[dataFormat=" + t() + "]";
    }

    public void u(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9771s, this, this, str));
        this.f9773o = str;
    }
}
