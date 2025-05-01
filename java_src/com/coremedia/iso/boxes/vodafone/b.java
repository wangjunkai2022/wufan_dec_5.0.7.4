package com.coremedia.iso.boxes.vodafone;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.coremedia.iso.l;
import com.googlecode.mp4parser.j;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
import org.aspectj.runtime.reflect.e;
/* compiled from: ContentDistributorIdBox.java */
/* loaded from: classes2.dex */
public class b extends com.googlecode.mp4parser.c {

    /* renamed from: u  reason: collision with root package name */
    public static final String f9978u = "cdis";

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9979v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9980w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f9981x = null;

    /* renamed from: s  reason: collision with root package name */
    private String f9982s;

    /* renamed from: t  reason: collision with root package name */
    private String f9983t;

    static {
        s();
    }

    public b() {
        super(f9978u);
    }

    private static /* synthetic */ void s() {
        e eVar = new e("ContentDistributorIdBox.java", b.class);
        f9979v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLanguage", "com.coremedia.iso.boxes.vodafone.ContentDistributorIdBox", "", "", "", "java.lang.String"), 40);
        f9980w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getContentDistributorId", "com.coremedia.iso.boxes.vodafone.ContentDistributorIdBox", "", "", "", "java.lang.String"), 44);
        f9981x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.vodafone.ContentDistributorIdBox", "", "", "", "java.lang.String"), 68);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9982s = g.f(byteBuffer);
        this.f9983t = g.g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        i.d(byteBuffer, this.f9982s);
        byteBuffer.put(l.b(this.f9983t));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return l.c(this.f9983t) + 2 + 5;
    }

    public String toString() {
        j.b().c(e.v(f9981x, this, this));
        return "ContentDistributorIdBox[language=" + w() + ";contentDistributorId=" + v() + "]";
    }

    public String v() {
        j.b().c(e.v(f9980w, this, this));
        return this.f9983t;
    }

    public String w() {
        j.b().c(e.v(f9979v, this, this));
        return this.f9982s;
    }
}
