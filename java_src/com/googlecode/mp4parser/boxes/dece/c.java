package com.googlecode.mp4parser.boxes.dece;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.coremedia.iso.l;
import com.googlecode.mp4parser.j;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import org.aspectj.lang.c;
import org.aspectj.runtime.reflect.e;
/* compiled from: ContentInformationBox.java */
/* loaded from: classes3.dex */
public class c extends com.googlecode.mp4parser.c {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;
    private static final /* synthetic */ c.b C = null;
    private static final /* synthetic */ c.b D = null;
    private static final /* synthetic */ c.b E = null;
    private static final /* synthetic */ c.b F = null;
    private static final /* synthetic */ c.b G = null;
    private static final /* synthetic */ c.b H = null;
    private static final /* synthetic */ c.b I = null;
    private static final /* synthetic */ c.b J = null;
    private static final /* synthetic */ c.b K = null;
    private static final /* synthetic */ c.b L = null;
    private static final /* synthetic */ c.b M = null;
    private static final /* synthetic */ c.b N = null;

    /* renamed from: z  reason: collision with root package name */
    public static final String f13808z = "cinf";

    /* renamed from: s  reason: collision with root package name */
    String f13809s;

    /* renamed from: t  reason: collision with root package name */
    String f13810t;

    /* renamed from: u  reason: collision with root package name */
    String f13811u;

    /* renamed from: v  reason: collision with root package name */
    String f13812v;

    /* renamed from: w  reason: collision with root package name */
    String f13813w;

    /* renamed from: x  reason: collision with root package name */
    Map<String, String> f13814x;

    /* renamed from: y  reason: collision with root package name */
    Map<String, String> f13815y;

    /* compiled from: ContentInformationBox.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f13816a;

        /* renamed from: b  reason: collision with root package name */
        String f13817b;

        public a(String str, String str2) {
            this.f13816a = str;
            this.f13817b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            String str = this.f13816a;
            if (str == null ? aVar.f13816a == null : str.equals(aVar.f13816a)) {
                String str2 = this.f13817b;
                String str3 = aVar.f13817b;
                return str2 == null ? str3 == null : str2.equals(str3);
            }
            return false;
        }

        public int hashCode() {
            String str = this.f13816a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f13817b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    static {
        s();
    }

    public c() {
        super(f13808z);
        this.f13814x = new LinkedHashMap();
        this.f13815y = new LinkedHashMap();
    }

    private static /* synthetic */ void s() {
        e eVar = new e("ContentInformationBox.java", c.class);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getMimeSubtypeName", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 144);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setMimeSubtypeName", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "mimeSubtypeName", "", "void"), 148);
        K = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getBrandEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.util.Map"), 184);
        L = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setBrandEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.util.Map", "brandEntries", "", "void"), 188);
        M = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getIdEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.util.Map"), 192);
        N = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setIdEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.util.Map", "idEntries", "", "void"), 196);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getProfileLevelIdc", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 152);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setProfileLevelIdc", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "profileLevelIdc", "", "void"), 156);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getCodecs", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 160);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setCodecs", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "codecs", "", "void"), 164);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getProtection", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 168);
        H = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setProtection", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "protection", "", "void"), 172);
        I = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLanguages", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 176);
        J = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLanguages", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "languages", "", "void"), 180);
    }

    public String A() {
        j.b().c(e.v(C, this, this));
        return this.f13810t;
    }

    public String B() {
        j.b().c(e.v(G, this, this));
        return this.f13812v;
    }

    public void C(Map<String, String> map) {
        j.b().c(e.w(L, this, this, map));
        this.f13814x = map;
    }

    public void D(String str) {
        j.b().c(e.w(F, this, this, str));
        this.f13811u = str;
    }

    public void E(Map<String, String> map) {
        j.b().c(e.w(N, this, this, map));
        this.f13815y = map;
    }

    public void F(String str) {
        j.b().c(e.w(J, this, this, str));
        this.f13813w = str;
    }

    public void G(String str) {
        j.b().c(e.w(B, this, this, str));
        this.f13809s = str;
    }

    public void H(String str) {
        j.b().c(e.w(D, this, this, str));
        this.f13810t = str;
    }

    public void I(String str) {
        j.b().c(e.w(H, this, this, str));
        this.f13812v = str;
    }

    @Override // com.googlecode.mp4parser.a
    protected void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f13809s = g.g(byteBuffer);
        this.f13810t = g.g(byteBuffer);
        this.f13811u = g.g(byteBuffer);
        this.f13812v = g.g(byteBuffer);
        this.f13813w = g.g(byteBuffer);
        int p4 = g.p(byteBuffer);
        while (true) {
            int i4 = p4 - 1;
            if (p4 <= 0) {
                break;
            }
            this.f13814x.put(g.g(byteBuffer), g.g(byteBuffer));
            p4 = i4;
        }
        int p5 = g.p(byteBuffer);
        while (true) {
            int i5 = p5 - 1;
            if (p5 <= 0) {
                return;
            }
            this.f13815y.put(g.g(byteBuffer), g.g(byteBuffer));
            p5 = i5;
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        i.o(byteBuffer, this.f13809s);
        i.o(byteBuffer, this.f13810t);
        i.o(byteBuffer, this.f13811u);
        i.o(byteBuffer, this.f13812v);
        i.o(byteBuffer, this.f13813w);
        i.m(byteBuffer, this.f13814x.size());
        for (Map.Entry<String, String> entry : this.f13814x.entrySet()) {
            i.o(byteBuffer, entry.getKey());
            i.o(byteBuffer, entry.getValue());
        }
        i.m(byteBuffer, this.f13815y.size());
        for (Map.Entry<String, String> entry2 : this.f13815y.entrySet()) {
            i.o(byteBuffer, entry2.getKey());
            i.o(byteBuffer, entry2.getValue());
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        long c5 = l.c(this.f13809s) + 1 + 4 + l.c(this.f13810t) + 1 + l.c(this.f13811u) + 1 + l.c(this.f13812v) + 1 + l.c(this.f13813w) + 1 + 1;
        for (Map.Entry<String, String> entry : this.f13814x.entrySet()) {
            c5 = c5 + l.c(entry.getKey()) + 1 + l.c(entry.getValue()) + 1;
        }
        long j4 = c5 + 1;
        for (Map.Entry<String, String> entry2 : this.f13815y.entrySet()) {
            j4 = j4 + l.c(entry2.getKey()) + 1 + l.c(entry2.getValue()) + 1;
        }
        return j4;
    }

    public Map<String, String> v() {
        j.b().c(e.v(K, this, this));
        return this.f13814x;
    }

    public String w() {
        j.b().c(e.v(E, this, this));
        return this.f13811u;
    }

    public Map<String, String> x() {
        j.b().c(e.v(M, this, this));
        return this.f13815y;
    }

    public String y() {
        j.b().c(e.v(I, this, this));
        return this.f13813w;
    }

    public String z() {
        j.b().c(e.v(A, this, this));
        return this.f13809s;
    }
}
