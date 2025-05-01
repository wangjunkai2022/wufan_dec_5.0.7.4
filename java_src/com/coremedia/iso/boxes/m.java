package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: DataEntryUrnBox.java */
/* loaded from: classes2.dex */
public class m extends com.googlecode.mp4parser.c {

    /* renamed from: u  reason: collision with root package name */
    public static final String f9775u = "urn ";

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9776v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9777w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f9778x = null;

    /* renamed from: s  reason: collision with root package name */
    private String f9779s;

    /* renamed from: t  reason: collision with root package name */
    private String f9780t;

    static {
        s();
    }

    public m() {
        super(f9775u);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("DataEntryUrnBox.java", m.class);
        f9776v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getName", "com.coremedia.iso.boxes.DataEntryUrnBox", "", "", "", "java.lang.String"), 40);
        f9777w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLocation", "com.coremedia.iso.boxes.DataEntryUrnBox", "", "", "", "java.lang.String"), 44);
        f9778x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.DataEntryUrnBox", "", "", "", "java.lang.String"), 67);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        this.f9779s = com.coremedia.iso.g.g(byteBuffer);
        this.f9780t = com.coremedia.iso.g.g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        byteBuffer.put(com.coremedia.iso.l.b(this.f9779s));
        byteBuffer.put((byte) 0);
        byteBuffer.put(com.coremedia.iso.l.b(this.f9780t));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return com.coremedia.iso.l.c(this.f9779s) + 1 + com.coremedia.iso.l.c(this.f9780t) + 1;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9778x, this, this));
        return "DataEntryUrlBox[name=" + w() + ";location=" + v() + "]";
    }

    public String v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9777w, this, this));
        return this.f9780t;
    }

    public String w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9776v, this, this));
        return this.f9779s;
    }
}
