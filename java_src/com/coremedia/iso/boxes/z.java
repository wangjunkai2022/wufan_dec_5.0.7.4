package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: ItemDataBox.java */
/* loaded from: classes2.dex */
public class z extends com.googlecode.mp4parser.a {

    /* renamed from: p  reason: collision with root package name */
    public static final String f10031p = "idat";

    /* renamed from: q  reason: collision with root package name */
    private static final /* synthetic */ c.b f10032q = null;

    /* renamed from: r  reason: collision with root package name */
    private static final /* synthetic */ c.b f10033r = null;

    /* renamed from: o  reason: collision with root package name */
    ByteBuffer f10034o;

    static {
        s();
    }

    public z() {
        super(f10031p);
        this.f10034o = ByteBuffer.allocate(0);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("ItemDataBox.java", z.class);
        f10032q = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getData", "com.coremedia.iso.boxes.ItemDataBox", "", "", "", "java.nio.ByteBuffer"), 19);
        f10033r = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setData", "com.coremedia.iso.boxes.ItemDataBox", "java.nio.ByteBuffer", "data", "", "void"), 23);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        this.f10034o = byteBuffer.slice();
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f10034o);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return this.f10034o.limit();
    }

    public ByteBuffer t() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f10032q, this, this));
        return this.f10034o;
    }

    public void u(ByteBuffer byteBuffer) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f10033r, this, this, byteBuffer));
        this.f10034o = byteBuffer;
    }
}
