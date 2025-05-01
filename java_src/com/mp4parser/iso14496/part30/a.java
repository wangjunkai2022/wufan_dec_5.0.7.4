package com.mp4parser.iso14496.part30;

import com.coremedia.iso.g;
import com.coremedia.iso.l;
import com.googlecode.mp4parser.j;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: WebVTTConfigurationBox.java */
/* loaded from: classes5.dex */
public class a extends com.googlecode.mp4parser.a {

    /* renamed from: p  reason: collision with root package name */
    public static final String f57238p = "vttC";

    /* renamed from: q  reason: collision with root package name */
    private static final /* synthetic */ c.b f57239q = null;

    /* renamed from: r  reason: collision with root package name */
    private static final /* synthetic */ c.b f57240r = null;

    /* renamed from: o  reason: collision with root package name */
    String f57241o;

    static {
        s();
    }

    public a() {
        super(f57238p);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("WebVTTConfigurationBox.java", a.class);
        f57239q = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getConfig", "com.mp4parser.iso14496.part30.WebVTTConfigurationBox", "", "", "", "java.lang.String"), 36);
        f57240r = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setConfig", "com.mp4parser.iso14496.part30.WebVTTConfigurationBox", "java.lang.String", "config", "", "void"), 40);
    }

    @Override // com.googlecode.mp4parser.a
    protected void b(ByteBuffer byteBuffer) {
        this.f57241o = g.h(byteBuffer, byteBuffer.remaining());
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        byteBuffer.put(l.b(this.f57241o));
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return l.c(this.f57241o);
    }

    public String t() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f57239q, this, this));
        return this.f57241o;
    }

    public void u(String str) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f57240r, this, this, str));
        this.f57241o = str;
    }
}
