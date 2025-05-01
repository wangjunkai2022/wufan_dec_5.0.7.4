package com.googlecode.mp4parser.boxes.dece;

import com.coremedia.iso.g;
import com.coremedia.iso.l;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.googlecode.mp4parser.j;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
import org.aspectj.runtime.reflect.e;
/* compiled from: AssetInformationBox.java */
/* loaded from: classes3.dex */
public class a extends com.googlecode.mp4parser.c {

    /* renamed from: u  reason: collision with root package name */
    public static final String f13789u = "ainf";

    /* renamed from: v  reason: collision with root package name */
    static final /* synthetic */ boolean f13790v = false;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f13791w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f13792x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f13793y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f13794z = null;

    /* renamed from: s  reason: collision with root package name */
    String f13795s;

    /* renamed from: t  reason: collision with root package name */
    String f13796t;

    /* compiled from: AssetInformationBox.java */
    /* renamed from: com.googlecode.mp4parser.boxes.dece.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0299a {

        /* renamed from: a  reason: collision with root package name */
        public String f13797a;

        /* renamed from: b  reason: collision with root package name */
        public String f13798b;

        /* renamed from: c  reason: collision with root package name */
        public String f13799c;

        public C0299a(String str, String str2, String str3) {
            this.f13797a = str;
            this.f13798b = str2;
            this.f13799c = str3;
        }

        public int a() {
            return l.c(this.f13797a) + 3 + l.c(this.f13798b) + l.c(this.f13799c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0299a c0299a = (C0299a) obj;
            return this.f13799c.equals(c0299a.f13799c) && this.f13797a.equals(c0299a.f13797a) && this.f13798b.equals(c0299a.f13798b);
        }

        public int hashCode() {
            return (((this.f13797a.hashCode() * 31) + this.f13798b.hashCode()) * 31) + this.f13799c.hashCode();
        }

        public String toString() {
            return "{namespace='" + this.f13797a + "', profileLevelIdc='" + this.f13798b + "', assetId='" + this.f13799c + "'}";
        }
    }

    static {
        s();
    }

    public a() {
        super(f13789u);
        this.f13795s = "";
        this.f13796t = "0000";
    }

    private static /* synthetic */ void s() {
        e eVar = new e("AssetInformationBox.java", a.class);
        f13791w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getApid", "com.googlecode.mp4parser.boxes.dece.AssetInformationBox", "", "", "", "java.lang.String"), 131);
        f13792x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setApid", "com.googlecode.mp4parser.boxes.dece.AssetInformationBox", "java.lang.String", "apid", "", "void"), 135);
        f13793y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getProfileVersion", "com.googlecode.mp4parser.boxes.dece.AssetInformationBox", "", "", "", "java.lang.String"), 139);
        f13794z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setProfileVersion", "com.googlecode.mp4parser.boxes.dece.AssetInformationBox", "java.lang.String", "profileVersion", "", "void"), 143);
    }

    public void A(String str) {
        j.b().c(e.w(f13794z, this, this, str));
        this.f13796t = str;
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f13796t = g.h(byteBuffer, 4);
        this.f13795s = g.g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        if (getVersion() == 0) {
            byteBuffer.put(l.b(this.f13796t), 0, 4);
            byteBuffer.put(l.b(this.f13795s));
            byteBuffer.put((byte) 0);
            return;
        }
        throw new RuntimeException("Unknown ainf version " + getVersion());
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return l.c(this.f13795s) + 9;
    }

    public String v() {
        j.b().c(e.v(f13791w, this, this));
        return this.f13795s;
    }

    public String w() {
        j.b().c(e.v(f13793y, this, this));
        return this.f13796t;
    }

    @DoNotParseDetail
    public boolean x() {
        return (getFlags() & 1) == 1;
    }

    public void y(String str) {
        j.b().c(e.w(f13792x, this, this, str));
        this.f13795s = str;
    }

    @DoNotParseDetail
    public void z(boolean z4) {
        int flags = getFlags();
        if (x() ^ z4) {
            if (z4) {
                setFlags(flags | 1);
            } else {
                setFlags(16777214 & flags);
            }
        }
    }
}
