package com.googlecode.mp4parser.boxes.apple;

import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.aspectj.lang.c;
/* compiled from: Utf8AppleDataBox.java */
/* loaded from: classes3.dex */
public abstract class z0 extends j {
    private static final /* synthetic */ c.b A = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f13731z = null;

    /* renamed from: y  reason: collision with root package name */
    String f13732y;

    static {
        s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public z0(String str) {
        super(str, 1);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("Utf8AppleDataBox.java", z0.class);
        f13731z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getValue", "com.googlecode.mp4parser.boxes.apple.Utf8AppleDataBox", "", "", "", "java.lang.String"), 21);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setValue", "com.googlecode.mp4parser.boxes.apple.Utf8AppleDataBox", "java.lang.String", "value", "", "void"), 30);
    }

    @Override // com.googlecode.mp4parser.boxes.apple.j
    @DoNotParseDetail
    public byte[] C() {
        return com.coremedia.iso.l.b(this.f13732y);
    }

    public String E() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f13731z, this, this));
        if (!l()) {
            n();
        }
        return this.f13732y;
    }

    public void F(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(A, this, this, str));
        this.f13732y = str;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.j
    protected int v() {
        return this.f13732y.getBytes(Charset.forName("UTF-8")).length;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.j
    protected void y(ByteBuffer byteBuffer) {
        this.f13732y = com.coremedia.iso.g.h(byteBuffer, byteBuffer.remaining());
    }
}
