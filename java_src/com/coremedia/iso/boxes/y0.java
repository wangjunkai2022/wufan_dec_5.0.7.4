package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: SoundMediaHeaderBox.java */
/* loaded from: classes2.dex */
public class y0 extends a {

    /* renamed from: t  reason: collision with root package name */
    public static final String f10027t = "smhd";

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f10028u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f10029v = null;

    /* renamed from: s  reason: collision with root package name */
    private float f10030s;

    static {
        s();
    }

    public y0() {
        super(f10027t);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("SoundMediaHeaderBox.java", y0.class);
        f10028u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "", "float"), 36);
        f10029v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "", "java.lang.String"), 58);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f10030s = com.coremedia.iso.g.e(byteBuffer);
        com.coremedia.iso.g.i(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.c(byteBuffer, this.f10030s);
        com.coremedia.iso.i.f(byteBuffer, 0);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 8L;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f10029v, this, this));
        return "SoundMediaHeaderBox[balance=" + v() + "]";
    }

    public float v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f10028u, this, this));
        return this.f10030s;
    }
}
