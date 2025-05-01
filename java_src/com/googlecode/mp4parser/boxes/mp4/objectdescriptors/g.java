package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
/* compiled from: ESDescriptor.java */
@Descriptor(tags = {3})
/* loaded from: classes3.dex */
public class g extends b {

    /* renamed from: r  reason: collision with root package name */
    private static Logger f13948r = Logger.getLogger(g.class.getName());

    /* renamed from: e  reason: collision with root package name */
    int f13949e;

    /* renamed from: f  reason: collision with root package name */
    int f13950f;

    /* renamed from: g  reason: collision with root package name */
    int f13951g;

    /* renamed from: h  reason: collision with root package name */
    int f13952h;

    /* renamed from: i  reason: collision with root package name */
    int f13953i;

    /* renamed from: k  reason: collision with root package name */
    String f13955k;

    /* renamed from: l  reason: collision with root package name */
    int f13956l;

    /* renamed from: m  reason: collision with root package name */
    int f13957m;

    /* renamed from: n  reason: collision with root package name */
    int f13958n;

    /* renamed from: o  reason: collision with root package name */
    e f13959o;

    /* renamed from: p  reason: collision with root package name */
    n f13960p;

    /* renamed from: j  reason: collision with root package name */
    int f13954j = 0;

    /* renamed from: q  reason: collision with root package name */
    List<b> f13961q = new ArrayList();

    public void A(int i4) {
        this.f13950f = i4;
    }

    public void B(int i4) {
        this.f13953i = i4;
    }

    public void C(int i4) {
        this.f13951g = i4;
    }

    public void D(int i4) {
        this.f13954j = i4;
    }

    public void E(String str) {
        this.f13955k = str;
    }

    public void F(int i4) {
        this.f13958n = i4;
    }

    public void G(int i4) {
        this.f13952h = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f13951g == gVar.f13951g && this.f13954j == gVar.f13954j && this.f13957m == gVar.f13957m && this.f13949e == gVar.f13949e && this.f13958n == gVar.f13958n && this.f13952h == gVar.f13952h && this.f13956l == gVar.f13956l && this.f13950f == gVar.f13950f && this.f13953i == gVar.f13953i) {
            String str = this.f13955k;
            if (str == null ? gVar.f13955k == null : str.equals(gVar.f13955k)) {
                e eVar = this.f13959o;
                if (eVar == null ? gVar.f13959o == null : eVar.equals(gVar.f13959o)) {
                    List<b> list = this.f13961q;
                    if (list == null ? gVar.f13961q == null : list.equals(gVar.f13961q)) {
                        n nVar = this.f13960p;
                        n nVar2 = gVar.f13960p;
                        return nVar == null ? nVar2 == null : nVar.equals(nVar2);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public void f(ByteBuffer byteBuffer) throws IOException {
        this.f13949e = com.coremedia.iso.g.i(byteBuffer);
        int p4 = com.coremedia.iso.g.p(byteBuffer);
        int i4 = p4 >>> 7;
        this.f13950f = i4;
        this.f13951g = (p4 >>> 6) & 1;
        this.f13952h = (p4 >>> 5) & 1;
        this.f13953i = p4 & 31;
        if (i4 == 1) {
            this.f13957m = com.coremedia.iso.g.i(byteBuffer);
        }
        if (this.f13951g == 1) {
            int p5 = com.coremedia.iso.g.p(byteBuffer);
            this.f13954j = p5;
            this.f13955k = com.coremedia.iso.g.h(byteBuffer, p5);
        }
        if (this.f13952h == 1) {
            this.f13958n = com.coremedia.iso.g.i(byteBuffer);
        }
        int b5 = b() + 1 + 2 + 1 + (this.f13950f == 1 ? 2 : 0) + (this.f13951g == 1 ? this.f13954j + 1 : 0) + (this.f13952h == 1 ? 2 : 0);
        int position = byteBuffer.position();
        if (a() > b5 + 2) {
            b a5 = l.a(-1, byteBuffer);
            long position2 = byteBuffer.position() - position;
            Logger logger = f13948r;
            StringBuilder sb = new StringBuilder();
            sb.append(a5);
            sb.append(" - ESDescriptor1 read: ");
            sb.append(position2);
            sb.append(", size: ");
            sb.append(a5 != null ? Integer.valueOf(a5.a()) : null);
            logger.finer(sb.toString());
            if (a5 != null) {
                int a6 = a5.a();
                byteBuffer.position(position + a6);
                b5 += a6;
            } else {
                b5 = (int) (b5 + position2);
            }
            if (a5 instanceof e) {
                this.f13959o = (e) a5;
            }
        }
        int position3 = byteBuffer.position();
        if (a() > b5 + 2) {
            b a7 = l.a(-1, byteBuffer);
            long position4 = byteBuffer.position() - position3;
            Logger logger2 = f13948r;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a7);
            sb2.append(" - ESDescriptor2 read: ");
            sb2.append(position4);
            sb2.append(", size: ");
            sb2.append(a7 != null ? Integer.valueOf(a7.a()) : null);
            logger2.finer(sb2.toString());
            if (a7 != null) {
                int a8 = a7.a();
                byteBuffer.position(position3 + a8);
                b5 += a8;
            } else {
                b5 = (int) (b5 + position4);
            }
            if (a7 instanceof n) {
                this.f13960p = (n) a7;
            }
        } else {
            f13948r.warning("SLConfigDescriptor is missing!");
        }
        while (a() - b5 > 2) {
            int position5 = byteBuffer.position();
            b a9 = l.a(-1, byteBuffer);
            long position6 = byteBuffer.position() - position5;
            Logger logger3 = f13948r;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a9);
            sb3.append(" - ESDescriptor3 read: ");
            sb3.append(position6);
            sb3.append(", size: ");
            sb3.append(a9 != null ? Integer.valueOf(a9.a()) : null);
            logger3.finer(sb3.toString());
            if (a9 != null) {
                int a10 = a9.a();
                byteBuffer.position(position5 + a10);
                b5 += a10;
            } else {
                b5 = (int) (b5 + position6);
            }
            this.f13961q.add(a9);
        }
    }

    public e g() {
        return this.f13959o;
    }

    public int h() {
        return this.f13957m;
    }

    public int hashCode() {
        int i4 = ((((((((((this.f13949e * 31) + this.f13950f) * 31) + this.f13951g) * 31) + this.f13952h) * 31) + this.f13953i) * 31) + this.f13954j) * 31;
        String str = this.f13955k;
        int hashCode = (((((((i4 + (str != null ? str.hashCode() : 0)) * 31) + this.f13956l) * 31) + this.f13957m) * 31) + this.f13958n) * 31;
        e eVar = this.f13959o;
        int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        n nVar = this.f13960p;
        int hashCode3 = (hashCode2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        List<b> list = this.f13961q;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public int i() {
        return this.f13949e;
    }

    public List<b> j() {
        return this.f13961q;
    }

    public int k() {
        return this.f13956l;
    }

    public n l() {
        return this.f13960p;
    }

    public int m() {
        return this.f13950f;
    }

    public int n() {
        return this.f13953i;
    }

    public int o() {
        return this.f13951g;
    }

    public int p() {
        return this.f13954j;
    }

    public String q() {
        return this.f13955k;
    }

    public int r() {
        return this.f13958n;
    }

    public int s() {
        return this.f13952h;
    }

    public ByteBuffer t() {
        ByteBuffer allocate = ByteBuffer.allocate(u());
        com.coremedia.iso.i.m(allocate, 3);
        com.coremedia.iso.i.m(allocate, u() - 2);
        com.coremedia.iso.i.f(allocate, this.f13949e);
        com.coremedia.iso.i.m(allocate, (this.f13950f << 7) | (this.f13951g << 6) | (this.f13952h << 5) | (this.f13953i & 31));
        if (this.f13950f > 0) {
            com.coremedia.iso.i.f(allocate, this.f13957m);
        }
        if (this.f13951g > 0) {
            com.coremedia.iso.i.m(allocate, this.f13954j);
            com.coremedia.iso.i.n(allocate, this.f13955k);
        }
        if (this.f13952h > 0) {
            com.coremedia.iso.i.f(allocate, this.f13958n);
        }
        ByteBuffer p4 = this.f13959o.p();
        ByteBuffer h4 = this.f13960p.h();
        allocate.put(p4.array());
        allocate.put(h4.array());
        return allocate;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public String toString() {
        return "ESDescriptor{esId=" + this.f13949e + ", streamDependenceFlag=" + this.f13950f + ", URLFlag=" + this.f13951g + ", oCRstreamFlag=" + this.f13952h + ", streamPriority=" + this.f13953i + ", URLLength=" + this.f13954j + ", URLString='" + this.f13955k + "', remoteODFlag=" + this.f13956l + ", dependsOnEsId=" + this.f13957m + ", oCREsId=" + this.f13958n + ", decoderConfigDescriptor=" + this.f13959o + ", slConfigDescriptor=" + this.f13960p + '}';
    }

    public int u() {
        int i4 = this.f13950f > 0 ? 7 : 5;
        if (this.f13951g > 0) {
            i4 += this.f13954j + 1;
        }
        if (this.f13952h > 0) {
            i4 += 2;
        }
        return i4 + this.f13959o.q() + this.f13960p.i();
    }

    public void v(e eVar) {
        this.f13959o = eVar;
    }

    public void w(int i4) {
        this.f13957m = i4;
    }

    public void x(int i4) {
        this.f13949e = i4;
    }

    public void y(int i4) {
        this.f13956l = i4;
    }

    public void z(n nVar) {
        this.f13960p = nVar;
    }
}
