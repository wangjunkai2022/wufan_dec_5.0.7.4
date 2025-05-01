package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: SubtitleMediaHeaderBox.java */
/* loaded from: classes2.dex */
public class b1 extends a {

    /* renamed from: s  reason: collision with root package name */
    public static final String f9542s = "sthd";

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ c.b f9543t = null;

    static {
        s();
    }

    public b1() {
        super(f9542s);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("SubtitleMediaHeaderBox.java", b1.class);
        f9543t = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.SubtitleMediaHeaderBox", "", "", "", "java.lang.String"), 30);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 4L;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9543t, this, this));
        return "SubtitleMediaHeaderBox";
    }
}
