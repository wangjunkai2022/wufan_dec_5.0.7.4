package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: UnknownBox.java */
/* loaded from: classes2.dex */
public class j1 extends com.googlecode.mp4parser.a {

    /* renamed from: p  reason: collision with root package name */
    private static final /* synthetic */ c.b f9742p = null;

    /* renamed from: q  reason: collision with root package name */
    private static final /* synthetic */ c.b f9743q = null;

    /* renamed from: o  reason: collision with root package name */
    ByteBuffer f9744o;

    static {
        s();
    }

    public j1(String str) {
        super(str);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("UnknownBox.java", j1.class);
        f9742p = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getData", "com.coremedia.iso.boxes.UnknownBox", "", "", "", "java.nio.ByteBuffer"), 52);
        f9743q = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setData", "com.coremedia.iso.boxes.UnknownBox", "java.nio.ByteBuffer", "data", "", "void"), 56);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        this.f9744o = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        this.f9744o.rewind();
        byteBuffer.put(this.f9744o);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return this.f9744o.limit();
    }

    public ByteBuffer t() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9742p, this, this));
        return this.f9744o;
    }

    public void u(ByteBuffer byteBuffer) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9743q, this, this, byteBuffer));
        this.f9744o = byteBuffer;
    }
}
