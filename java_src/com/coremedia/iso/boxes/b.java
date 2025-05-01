package com.coremedia.iso.boxes;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: AlbumBox.java */
/* loaded from: classes2.dex */
public class b extends com.googlecode.mp4parser.c {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;
    private static final /* synthetic */ c.b C = null;

    /* renamed from: v  reason: collision with root package name */
    public static final String f9531v = "albm";

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9532w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f9533x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f9534y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f9535z = null;

    /* renamed from: s  reason: collision with root package name */
    private String f9536s;

    /* renamed from: t  reason: collision with root package name */
    private String f9537t;

    /* renamed from: u  reason: collision with root package name */
    private int f9538u;

    static {
        s();
    }

    public b() {
        super(f9531v);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("AlbumBox.java", b.class);
        f9532w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLanguage", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"), 51);
        f9533x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getAlbumTitle", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"), 55);
        f9534y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getTrackNumber", "com.coremedia.iso.boxes.AlbumBox", "", "", "", MethodReflectParams.INT), 59);
        f9535z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLanguage", "com.coremedia.iso.boxes.AlbumBox", "java.lang.String", "language", "", "void"), 63);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setAlbumTitle", "com.coremedia.iso.boxes.AlbumBox", "java.lang.String", "albumTitle", "", "void"), 67);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setTrackNumber", "com.coremedia.iso.boxes.AlbumBox", MethodReflectParams.INT, "trackNumber", "", "void"), 71);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"), 103);
    }

    public void A(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(B, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9538u = i4;
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9536s = com.coremedia.iso.g.f(byteBuffer);
        this.f9537t = com.coremedia.iso.g.g(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            this.f9538u = com.coremedia.iso.g.p(byteBuffer);
        } else {
            this.f9538u = -1;
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.d(byteBuffer, this.f9536s);
        byteBuffer.put(com.coremedia.iso.l.b(this.f9537t));
        byteBuffer.put((byte) 0);
        int i4 = this.f9538u;
        if (i4 != -1) {
            com.coremedia.iso.i.m(byteBuffer, i4);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return com.coremedia.iso.l.c(this.f9537t) + 6 + 1 + (this.f9538u == -1 ? 0 : 1);
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(C, this, this));
        StringBuilder sb = new StringBuilder();
        sb.append("AlbumBox[language=");
        sb.append(w());
        sb.append(";");
        sb.append("albumTitle=");
        sb.append(v());
        if (this.f9538u >= 0) {
            sb.append(";trackNumber=");
            sb.append(x());
        }
        sb.append("]");
        return sb.toString();
    }

    public String v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9533x, this, this));
        return this.f9537t;
    }

    public String w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9532w, this, this));
        return this.f9536s;
    }

    public int x() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9534y, this, this));
        return this.f9538u;
    }

    public void y(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(A, this, this, str));
        this.f9537t = str;
    }

    public void z(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9535z, this, this, str));
        this.f9536s = str;
    }
}
