package com.coremedia.iso.boxes.vodafone;

import com.coremedia.iso.g;
import com.coremedia.iso.l;
import com.googlecode.mp4parser.j;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
import org.aspectj.runtime.reflect.e;
/* compiled from: CoverUriBox.java */
/* loaded from: classes2.dex */
public class c extends com.googlecode.mp4parser.c {

    /* renamed from: t  reason: collision with root package name */
    public static final String f9984t = "cvru";

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f9985u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9986v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9987w = null;

    /* renamed from: s  reason: collision with root package name */
    private String f9988s;

    static {
        s();
    }

    public c() {
        super(f9984t);
    }

    private static /* synthetic */ void s() {
        e eVar = new e("CoverUriBox.java", c.class);
        f9985u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getCoverUri", "com.coremedia.iso.boxes.vodafone.CoverUriBox", "", "", "", "java.lang.String"), 38);
        f9986v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setCoverUri", "com.coremedia.iso.boxes.vodafone.CoverUriBox", "java.lang.String", "coverUri", "", "void"), 42);
        f9987w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.vodafone.CoverUriBox", "", "", "", "java.lang.String"), 64);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9988s = g.g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        byteBuffer.put(l.b(this.f9988s));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return l.c(this.f9988s) + 5;
    }

    public String toString() {
        j.b().c(e.v(f9987w, this, this));
        return "CoverUriBox[coverUri=" + v() + "]";
    }

    public String v() {
        j.b().c(e.v(f9985u, this, this));
        return this.f9988s;
    }

    public void w(String str) {
        j.b().c(e.w(f9986v, this, this, str));
        this.f9988s = str;
    }
}
