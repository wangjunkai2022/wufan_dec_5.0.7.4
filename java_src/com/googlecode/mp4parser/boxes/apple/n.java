package com.googlecode.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: AppleGPSCoordinatesBox.java */
/* loaded from: classes3.dex */
public class n extends com.googlecode.mp4parser.a {

    /* renamed from: q  reason: collision with root package name */
    public static final String f13637q = "©xyz";

    /* renamed from: r  reason: collision with root package name */
    private static final int f13638r = 5575;

    /* renamed from: s  reason: collision with root package name */
    private static final /* synthetic */ c.b f13639s = null;

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ c.b f13640t = null;

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f13641u = null;

    /* renamed from: o  reason: collision with root package name */
    String f13642o;

    /* renamed from: p  reason: collision with root package name */
    int f13643p;

    static {
        s();
    }

    public n() {
        super(f13637q);
        this.f13643p = f13638r;
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("AppleGPSCoordinatesBox.java", n.class);
        f13639s = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getValue", "com.googlecode.mp4parser.boxes.apple.AppleGPSCoordinatesBox", "", "", "", "java.lang.String"), 22);
        f13640t = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setValue", "com.googlecode.mp4parser.boxes.apple.AppleGPSCoordinatesBox", "java.lang.String", "iso6709String", "", "void"), 26);
        f13641u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.googlecode.mp4parser.boxes.apple.AppleGPSCoordinatesBox", "", "", "", "java.lang.String"), 52);
    }

    @Override // com.googlecode.mp4parser.a
    protected void b(ByteBuffer byteBuffer) {
        int i4 = byteBuffer.getShort();
        this.f13643p = byteBuffer.getShort();
        byte[] bArr = new byte[i4];
        byteBuffer.get(bArr);
        this.f13642o = com.coremedia.iso.l.a(bArr);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        byteBuffer.putShort((short) this.f13642o.length());
        byteBuffer.putShort((short) this.f13643p);
        byteBuffer.put(com.coremedia.iso.l.b(this.f13642o));
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return com.coremedia.iso.l.c(this.f13642o) + 4;
    }

    public String t() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f13639s, this, this));
        return this.f13642o;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f13641u, this, this));
        return "AppleGPSCoordinatesBox[" + this.f13642o + "]";
    }

    public void u(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f13640t, this, this, str));
        this.f13643p = f13638r;
        this.f13642o = str;
    }
}
