package com.mp4parser.iso14496.part30;

import com.coremedia.iso.g;
import com.coremedia.iso.l;
import com.googlecode.mp4parser.j;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: WebVTTSourceLabelBox.java */
/* loaded from: classes5.dex */
public class c extends com.googlecode.mp4parser.a {

    /* renamed from: p  reason: collision with root package name */
    public static final String f57243p = "vlab";

    /* renamed from: q  reason: collision with root package name */
    private static final /* synthetic */ c.b f57244q = null;

    /* renamed from: r  reason: collision with root package name */
    private static final /* synthetic */ c.b f57245r = null;

    /* renamed from: o  reason: collision with root package name */
    String f57246o;

    static {
        s();
    }

    public c() {
        super(f57243p);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("WebVTTSourceLabelBox.java", c.class);
        f57244q = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSourceLabel", "com.mp4parser.iso14496.part30.WebVTTSourceLabelBox", "", "", "", "java.lang.String"), 37);
        f57245r = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setSourceLabel", "com.mp4parser.iso14496.part30.WebVTTSourceLabelBox", "java.lang.String", "sourceLabel", "", "void"), 41);
    }

    @Override // com.googlecode.mp4parser.a
    protected void b(ByteBuffer byteBuffer) {
        this.f57246o = g.h(byteBuffer, byteBuffer.remaining());
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        byteBuffer.put(l.b(this.f57246o));
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return l.c(this.f57246o);
    }

    public String t() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f57244q, this, this));
        return this.f57246o;
    }

    public void u(String str) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f57245r, this, this, str));
        this.f57246o = str;
    }
}
