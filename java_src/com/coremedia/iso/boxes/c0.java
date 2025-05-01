package com.coremedia.iso.boxes;

import com.j256.ormlite.stmt.query.SimpleComparison;
import com.join.mgps.activity.SearchHintActivity_;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: KeywordsBox.java */
/* loaded from: classes2.dex */
public class c0 extends com.googlecode.mp4parser.c {

    /* renamed from: u  reason: collision with root package name */
    public static final String f9552u = "kywd";

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9553v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9554w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f9555x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f9556y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f9557z = null;

    /* renamed from: s  reason: collision with root package name */
    private String f9558s;

    /* renamed from: t  reason: collision with root package name */
    private String[] f9559t;

    static {
        s();
    }

    public c0() {
        super(f9552u);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("KeywordsBox.java", c0.class);
        f9553v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLanguage", "com.coremedia.iso.boxes.KeywordsBox", "", "", "", "java.lang.String"), 40);
        f9554w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getKeywords", "com.coremedia.iso.boxes.KeywordsBox", "", "", "", "[Ljava.lang.String;"), 44);
        f9555x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLanguage", "com.coremedia.iso.boxes.KeywordsBox", "java.lang.String", "language", "", "void"), 48);
        f9556y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setKeywords", "com.coremedia.iso.boxes.KeywordsBox", "[Ljava.lang.String;", SearchHintActivity_.S1, "", "void"), 52);
        f9557z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.KeywordsBox", "", "", "", "java.lang.String"), 87);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9558s = com.coremedia.iso.g.f(byteBuffer);
        int p4 = com.coremedia.iso.g.p(byteBuffer);
        this.f9559t = new String[p4];
        for (int i4 = 0; i4 < p4; i4++) {
            com.coremedia.iso.g.p(byteBuffer);
            this.f9559t[i4] = com.coremedia.iso.g.g(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        String[] strArr;
        u(byteBuffer);
        com.coremedia.iso.i.d(byteBuffer, this.f9558s);
        com.coremedia.iso.i.m(byteBuffer, this.f9559t.length);
        for (String str : this.f9559t) {
            com.coremedia.iso.i.m(byteBuffer, com.coremedia.iso.l.c(str) + 1);
            byteBuffer.put(com.coremedia.iso.l.b(str));
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        long j4 = 7;
        for (String str : this.f9559t) {
            j4 += com.coremedia.iso.l.c(str) + 1 + 1;
        }
        return j4;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9557z, this, this));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("KeywordsBox[language=");
        stringBuffer.append(w());
        for (int i4 = 0; i4 < this.f9559t.length; i4++) {
            stringBuffer.append(";keyword");
            stringBuffer.append(i4);
            stringBuffer.append(SimpleComparison.EQUAL_TO_OPERATION);
            stringBuffer.append(this.f9559t[i4]);
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public String[] v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9554w, this, this));
        return this.f9559t;
    }

    public String w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9553v, this, this));
        return this.f9558s;
    }

    public void x(String[] strArr) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9556y, this, this, strArr));
        this.f9559t = strArr;
    }

    public void y(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9555x, this, this, str));
        this.f9558s = str;
    }
}
