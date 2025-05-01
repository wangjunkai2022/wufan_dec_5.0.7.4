package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: UserBox.java */
/* loaded from: classes2.dex */
public class k1 extends com.googlecode.mp4parser.a {

    /* renamed from: p  reason: collision with root package name */
    public static final String f9761p = "uuid";

    /* renamed from: q  reason: collision with root package name */
    private static final /* synthetic */ c.b f9762q = null;

    /* renamed from: r  reason: collision with root package name */
    private static final /* synthetic */ c.b f9763r = null;

    /* renamed from: s  reason: collision with root package name */
    private static final /* synthetic */ c.b f9764s = null;

    /* renamed from: o  reason: collision with root package name */
    byte[] f9765o;

    static {
        s();
    }

    public k1(byte[] bArr) {
        super(f9761p, bArr);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("UserBox.java", k1.class);
        f9762q = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.UserBox", "", "", "", "java.lang.String"), 40);
        f9763r = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getData", "com.coremedia.iso.boxes.UserBox", "", "", "", "[B"), 47);
        f9764s = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setData", "com.coremedia.iso.boxes.UserBox", "[B", "data", "", "void"), 51);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.f9765o = bArr;
        byteBuffer.get(bArr);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f9765o);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return this.f9765o.length;
    }

    public byte[] t() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9763r, this, this));
        return this.f9765o;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9762q, this, this));
        return "UserBox[type=" + getType() + ";userType=" + new String(i()) + ";contentLength=" + this.f9765o.length + "]";
    }

    public void u(byte[] bArr) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9764s, this, this, bArr));
        this.f9765o = bArr;
    }
}
