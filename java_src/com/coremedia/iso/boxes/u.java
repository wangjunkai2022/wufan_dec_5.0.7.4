package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: FreeSpaceBox.java */
/* loaded from: classes2.dex */
public class u extends com.googlecode.mp4parser.a {

    /* renamed from: p  reason: collision with root package name */
    public static final String f9954p = "skip";

    /* renamed from: q  reason: collision with root package name */
    private static final /* synthetic */ c.b f9955q = null;

    /* renamed from: r  reason: collision with root package name */
    private static final /* synthetic */ c.b f9956r = null;

    /* renamed from: s  reason: collision with root package name */
    private static final /* synthetic */ c.b f9957s = null;

    /* renamed from: o  reason: collision with root package name */
    byte[] f9958o;

    static {
        s();
    }

    public u() {
        super(f9954p);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("FreeSpaceBox.java", u.class);
        f9955q = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setData", "com.coremedia.iso.boxes.FreeSpaceBox", "[B", "data", "", "void"), 42);
        f9956r = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getData", "com.coremedia.iso.boxes.FreeSpaceBox", "", "", "", "[B"), 46);
        f9957s = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.FreeSpaceBox", "", "", "", "java.lang.String"), 61);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.f9958o = bArr;
        byteBuffer.get(bArr);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f9958o);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return this.f9958o.length;
    }

    public byte[] t() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9956r, this, this));
        return this.f9958o;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9957s, this, this));
        return "FreeSpaceBox[size=" + this.f9958o.length + ";type=" + getType() + "]";
    }

    public void u(byte[] bArr) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9955q, this, this, bArr));
        this.f9958o = bArr;
    }
}
