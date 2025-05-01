package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.boxes.b1;
import com.coremedia.iso.boxes.d0;
import com.coremedia.iso.boxes.d1;
import com.coremedia.iso.boxes.e0;
import com.coremedia.iso.boxes.f0;
import com.coremedia.iso.boxes.f1;
import com.coremedia.iso.boxes.fragment.k;
import com.coremedia.iso.boxes.fragment.m;
import com.coremedia.iso.boxes.fragment.n;
import com.coremedia.iso.boxes.g1;
import com.coremedia.iso.boxes.h0;
import com.coremedia.iso.boxes.i;
import com.coremedia.iso.boxes.i0;
import com.coremedia.iso.boxes.j;
import com.coremedia.iso.boxes.j0;
import com.coremedia.iso.boxes.l;
import com.coremedia.iso.boxes.m1;
import com.coremedia.iso.boxes.o;
import com.coremedia.iso.boxes.q;
import com.coremedia.iso.boxes.r;
import com.coremedia.iso.boxes.r0;
import com.coremedia.iso.boxes.s;
import com.coremedia.iso.boxes.s0;
import com.coremedia.iso.boxes.t0;
import com.coremedia.iso.boxes.u0;
import com.coremedia.iso.boxes.v0;
import com.coremedia.iso.boxes.x;
import com.coremedia.iso.boxes.x0;
import com.coremedia.iso.boxes.y;
import com.coremedia.iso.boxes.y0;
import com.coremedia.iso.boxes.z0;
import com.coremedia.iso.i;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.f;
import com.googlecode.mp4parser.util.m;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
/* compiled from: FragmentedMp4Builder.java */
/* loaded from: classes3.dex */
public class d implements e {

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f13178b = Logger.getLogger(d.class.getName());

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ boolean f13179c = false;

    /* renamed from: a  reason: collision with root package name */
    protected c f13180a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentedMp4Builder.java */
    /* loaded from: classes3.dex */
    public class a implements Comparator<com.googlecode.mp4parser.authoring.h> {

        /* renamed from: c  reason: collision with root package name */
        private final /* synthetic */ Map f13182c;

        /* renamed from: d  reason: collision with root package name */
        private final /* synthetic */ int f13183d;

        a(Map map, int i4) {
            this.f13182c = map;
            this.f13183d = i4;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(com.googlecode.mp4parser.authoring.h hVar, com.googlecode.mp4parser.authoring.h hVar2) {
            long j4 = ((long[]) this.f13182c.get(hVar))[this.f13183d];
            long j5 = ((long[]) this.f13182c.get(hVar2))[this.f13183d];
            long[] O = hVar.O();
            long[] O2 = hVar2.O();
            long j6 = 0;
            for (int i4 = 1; i4 < j4; i4++) {
                j6 += O[i4 - 1];
            }
            long j7 = 0;
            for (int i5 = 1; i5 < j5; i5++) {
                j7 += O2[i5 - 1];
            }
            double d5 = j6;
            double h4 = hVar.M().h();
            Double.isNaN(d5);
            Double.isNaN(h4);
            double d6 = d5 / h4;
            double d7 = j7;
            double h5 = hVar2.M().h();
            Double.isNaN(d7);
            Double.isNaN(h5);
            return (int) ((d6 - (d7 / h5)) * 100.0d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentedMp4Builder.java */
    /* loaded from: classes3.dex */
    public class b implements com.coremedia.iso.boxes.d {

        /* renamed from: b  reason: collision with root package name */
        j f13184b;

        /* renamed from: c  reason: collision with root package name */
        long f13185c = -1;

        /* renamed from: e  reason: collision with root package name */
        private final /* synthetic */ long f13187e;

        /* renamed from: f  reason: collision with root package name */
        private final /* synthetic */ long f13188f;

        /* renamed from: g  reason: collision with root package name */
        private final /* synthetic */ com.googlecode.mp4parser.authoring.h f13189g;

        /* renamed from: h  reason: collision with root package name */
        private final /* synthetic */ int f13190h;

        b(long j4, long j5, com.googlecode.mp4parser.authoring.h hVar, int i4) {
            this.f13187e = j4;
            this.f13188f = j5;
            this.f13189g = hVar;
            this.f13190h = i4;
        }

        @Override // com.coremedia.iso.boxes.d
        public void a(WritableByteChannel writableByteChannel) throws IOException {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            i.i(allocate, com.googlecode.mp4parser.util.c.a(getSize()));
            allocate.put(com.coremedia.iso.f.C(getType()));
            allocate.rewind();
            writableByteChannel.write(allocate);
            for (com.googlecode.mp4parser.authoring.f fVar : d.this.H(this.f13187e, this.f13188f, this.f13189g, this.f13190h)) {
                fVar.b(writableByteChannel);
            }
        }

        @Override // com.coremedia.iso.boxes.d
        public j getParent() {
            return this.f13184b;
        }

        @Override // com.coremedia.iso.boxes.d
        public long getSize() {
            long j4 = this.f13185c;
            if (j4 != -1) {
                return j4;
            }
            long j5 = 8;
            for (com.googlecode.mp4parser.authoring.f fVar : d.this.H(this.f13187e, this.f13188f, this.f13189g, this.f13190h)) {
                j5 += fVar.getSize();
            }
            this.f13185c = j5;
            return j5;
        }

        @Override // com.coremedia.iso.boxes.d
        public String getType() {
            return com.coremedia.iso.boxes.mdat.a.f9798h;
        }

        @Override // com.coremedia.iso.boxes.d
        public long j() {
            throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
        }

        @Override // com.coremedia.iso.boxes.d
        public void k(com.googlecode.mp4parser.e eVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        }

        @Override // com.coremedia.iso.boxes.d
        public void p(j jVar) {
            this.f13184b = jVar;
        }
    }

    private long I(com.googlecode.mp4parser.authoring.d dVar, com.googlecode.mp4parser.authoring.h hVar) {
        return (hVar.getDuration() * dVar.e()) / hVar.M().h();
    }

    protected void A(long j4, long j5, com.googlecode.mp4parser.authoring.h hVar, int i4, com.coremedia.iso.boxes.fragment.c cVar) {
        k kVar = new k();
        cVar.v(kVar);
        x(j4, j5, hVar, i4, kVar);
        w(j4, hVar, kVar);
        D(j4, j5, hVar, i4, kVar);
        if (hVar instanceof com.googlecode.mp4parser.authoring.tracks.g) {
            com.googlecode.mp4parser.authoring.tracks.g gVar = (com.googlecode.mp4parser.authoring.tracks.g) hVar;
            s(j4, j5, gVar, i4, kVar);
            t(j4, j5, gVar, i4, kVar);
            r(j4, j5, gVar, i4, kVar);
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> entry : hVar.I().entrySet()) {
            String type = entry.getKey().getType();
            List list = (List) hashMap.get(type);
            if (list == null) {
                list = new ArrayList();
                hashMap.put(type, list);
            }
            list.add(entry.getKey());
        }
        Iterator it2 = hashMap.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.e eVar = new com.googlecode.mp4parser.boxes.mp4.samplegrouping.e();
            eVar.z((List) entry2.getValue());
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.f fVar = new com.googlecode.mp4parser.boxes.mp4.samplegrouping.f();
            fVar.z((String) entry2.getKey());
            long j6 = 1;
            f.a aVar = null;
            for (int a5 = com.googlecode.mp4parser.util.c.a(j4 - 1); a5 < com.googlecode.mp4parser.util.c.a(j5 - j6); a5++) {
                int i5 = 0;
                int i6 = 0;
                while (i5 < ((List) entry2.getValue()).size()) {
                    Iterator it3 = it2;
                    i6 = Arrays.binarySearch(hVar.I().get((com.googlecode.mp4parser.boxes.mp4.samplegrouping.b) ((List) entry2.getValue()).get(i5)), (long) a5) >= 0 ? i5 + 1 : i6;
                    i5++;
                    it2 = it3;
                    j6 = 1;
                }
                if (aVar != null && aVar.a() == i6) {
                    aVar.d(aVar.b() + j6);
                } else {
                    f.a aVar2 = new f.a(j6, i6);
                    fVar.v().add(aVar2);
                    aVar = aVar2;
                }
            }
            kVar.v(eVar);
            kVar.v(fVar);
        }
    }

    protected com.coremedia.iso.boxes.d B(com.googlecode.mp4parser.authoring.h hVar, com.googlecode.mp4parser.authoring.d dVar) {
        Logger logger = f13178b;
        logger.fine("Creating Track " + hVar);
        f1 f1Var = new f1();
        f1Var.v(z(dVar, hVar));
        com.coremedia.iso.boxes.d c5 = c(hVar, dVar);
        if (c5 != null) {
            f1Var.v(c5);
        }
        f1Var.v(h(hVar, dVar));
        return f1Var;
    }

    protected com.coremedia.iso.boxes.d C(com.googlecode.mp4parser.authoring.d dVar, com.googlecode.mp4parser.authoring.h hVar) {
        com.coremedia.iso.boxes.fragment.i iVar = new com.coremedia.iso.boxes.fragment.i();
        iVar.F(hVar.M().i());
        iVar.B(1L);
        iVar.C(0L);
        iVar.E(0L);
        com.coremedia.iso.boxes.fragment.g gVar = new com.coremedia.iso.boxes.fragment.g();
        if ("soun".equals(hVar.getHandler()) || "subt".equals(hVar.getHandler())) {
            gVar.k(2);
            gVar.m(2);
        }
        iVar.D(gVar);
        return iVar;
    }

    protected void D(long j4, long j5, com.googlecode.mp4parser.authoring.h hVar, int i4, k kVar) {
        long[] jArr;
        long j6;
        n nVar = new n();
        nVar.setVersion(1);
        long[] G = G(j4, j5, hVar, i4);
        nVar.L(true);
        nVar.N(true);
        ArrayList arrayList = new ArrayList(com.googlecode.mp4parser.util.c.a(j5 - j4));
        List<i.a> n4 = hVar.n();
        i.a[] aVarArr = (n4 == null || n4.size() <= 0) ? null : (i.a[]) n4.toArray(new i.a[n4.size()]);
        long a5 = aVarArr != null ? aVarArr[0].a() : -1;
        nVar.K(a5 > 0);
        long j7 = 1;
        int i5 = 0;
        while (j7 < j4) {
            long[] jArr2 = G;
            if (aVarArr != null) {
                a5--;
                j6 = 0;
                if (a5 == 0) {
                    if (aVarArr.length - i5 > 1) {
                        i5++;
                        a5 = aVarArr[i5].a();
                    }
                    j7++;
                    G = jArr2;
                }
            } else {
                j6 = 0;
            }
            j7++;
            G = jArr2;
        }
        boolean z4 = ((hVar.U() == null || hVar.U().isEmpty()) && (hVar.q() == null || hVar.q().length == 0)) ? false : true;
        nVar.M(z4);
        int i6 = 0;
        while (i6 < G.length) {
            n.a aVar = new n.a();
            aVar.p(G[i6]);
            if (z4) {
                com.coremedia.iso.boxes.fragment.g gVar = new com.coremedia.iso.boxes.fragment.g();
                if (hVar.U() != null && !hVar.U().isEmpty()) {
                    r0.a aVar2 = hVar.U().get(i6);
                    gVar.k(aVar2.c());
                    gVar.m(aVar2.e());
                    gVar.l(aVar2.d());
                }
                if (hVar.q() == null || hVar.q().length <= 0) {
                    jArr = G;
                } else {
                    jArr = G;
                    if (Arrays.binarySearch(hVar.q(), j4 + i6) >= 0) {
                        gVar.n(false);
                        gVar.k(2);
                    } else {
                        gVar.n(true);
                        gVar.k(1);
                    }
                }
                aVar.o(gVar);
            } else {
                jArr = G;
            }
            aVar.n(hVar.O()[com.googlecode.mp4parser.util.c.a((j4 + i6) - 1)]);
            if (aVarArr != null) {
                aVar.m(aVarArr[i5].b());
                a5--;
                if (a5 == 0 && aVarArr.length - i5 > 1) {
                    i5++;
                    a5 = aVarArr[i5].a();
                }
            }
            arrayList.add(aVar);
            i6++;
            G = jArr;
        }
        nVar.I(arrayList);
        kVar.v(nVar);
    }

    public Date E() {
        return new Date();
    }

    public c F() {
        return this.f13180a;
    }

    protected long[] G(long j4, long j5, com.googlecode.mp4parser.authoring.h hVar, int i4) {
        List<com.googlecode.mp4parser.authoring.f> H = H(j4, j5, hVar, i4);
        int size = H.size();
        long[] jArr = new long[size];
        for (int i5 = 0; i5 < size; i5++) {
            jArr[i5] = H.get(i5).getSize();
        }
        return jArr;
    }

    protected List<com.googlecode.mp4parser.authoring.f> H(long j4, long j5, com.googlecode.mp4parser.authoring.h hVar, int i4) {
        return hVar.x().subList(com.googlecode.mp4parser.util.c.a(j4) - 1, com.googlecode.mp4parser.util.c.a(j5) - 1);
    }

    public void J(c cVar) {
        this.f13180a = cVar;
    }

    protected List<com.googlecode.mp4parser.authoring.h> K(List<com.googlecode.mp4parser.authoring.h> list, int i4, Map<com.googlecode.mp4parser.authoring.h, long[]> map) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList, new a(map, i4));
        return linkedList;
    }

    @Override // com.googlecode.mp4parser.authoring.builder.e
    public j a(com.googlecode.mp4parser.authoring.d dVar) {
        Logger logger = f13178b;
        logger.fine("Creating movie " + dVar);
        if (this.f13180a == null) {
            com.googlecode.mp4parser.authoring.h hVar = null;
            Iterator<com.googlecode.mp4parser.authoring.h> it2 = dVar.g().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                com.googlecode.mp4parser.authoring.h next = it2.next();
                if (next.getHandler().equals("vide")) {
                    hVar = next;
                    break;
                }
            }
            this.f13180a = new g(dVar, hVar, -1);
        }
        com.googlecode.mp4parser.d dVar2 = new com.googlecode.mp4parser.d();
        dVar2.v(e(dVar));
        dVar2.v(o(dVar));
        for (com.coremedia.iso.boxes.d dVar3 : n(dVar)) {
            dVar2.v(dVar3);
        }
        dVar2.v(k(dVar, dVar2));
        return dVar2;
    }

    protected com.coremedia.iso.boxes.n b(com.googlecode.mp4parser.authoring.d dVar, com.googlecode.mp4parser.authoring.h hVar) {
        com.coremedia.iso.boxes.n nVar = new com.coremedia.iso.boxes.n();
        o oVar = new o();
        nVar.v(oVar);
        l lVar = new l();
        lVar.setFlags(1);
        oVar.v(lVar);
        return nVar;
    }

    protected com.coremedia.iso.boxes.d c(com.googlecode.mp4parser.authoring.h hVar, com.googlecode.mp4parser.authoring.d dVar) {
        if (hVar.H() == null || hVar.H().size() <= 0) {
            return null;
        }
        r rVar = new r();
        rVar.setVersion(1);
        ArrayList arrayList = new ArrayList();
        for (com.googlecode.mp4parser.authoring.c cVar : hVar.H()) {
            double c5 = cVar.c();
            double e5 = dVar.e();
            Double.isNaN(e5);
            arrayList.add(new r.a(rVar, Math.round(c5 * e5), (cVar.b() * hVar.M().h()) / cVar.d(), cVar.a()));
        }
        rVar.w(arrayList);
        q qVar = new q();
        qVar.v(rVar);
        return qVar;
    }

    protected int d(List<com.coremedia.iso.boxes.d> list, com.googlecode.mp4parser.authoring.h hVar, long[] jArr, int i4, int i5) {
        if (i4 < jArr.length) {
            long j4 = jArr[i4];
            int i6 = i4 + 1;
            long size = i6 < jArr.length ? jArr[i6] : hVar.x().size() + 1;
            if (j4 != size) {
                long j5 = size;
                list.add(m(j4, j5, hVar, i5));
                int i7 = i5 + 1;
                list.add(f(j4, j5, hVar, i5));
                return i7;
            }
            return i5;
        }
        return i5;
    }

    public com.coremedia.iso.boxes.d e(com.googlecode.mp4parser.authoring.d dVar) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("isom");
        linkedList.add("iso2");
        linkedList.add(com.coremedia.iso.boxes.sampleentry.h.f9920z);
        return new s("isom", 0L, linkedList);
    }

    protected com.coremedia.iso.boxes.d f(long j4, long j5, com.googlecode.mp4parser.authoring.h hVar, int i4) {
        return new b(j4, j5, hVar, i4);
    }

    protected com.coremedia.iso.boxes.d g(com.googlecode.mp4parser.authoring.d dVar, com.googlecode.mp4parser.authoring.h hVar) {
        e0 e0Var = new e0();
        e0Var.A(hVar.M().a());
        e0Var.D(E());
        e0Var.B(0L);
        e0Var.E(hVar.M().h());
        e0Var.C(hVar.M().d());
        return e0Var;
    }

    protected com.coremedia.iso.boxes.d h(com.googlecode.mp4parser.authoring.h hVar, com.googlecode.mp4parser.authoring.d dVar) {
        d0 d0Var = new d0();
        d0Var.v(g(dVar, hVar));
        d0Var.v(i(hVar, dVar));
        d0Var.v(l(hVar, dVar));
        return d0Var;
    }

    protected com.coremedia.iso.boxes.d i(com.googlecode.mp4parser.authoring.h hVar, com.googlecode.mp4parser.authoring.d dVar) {
        x xVar = new x();
        xVar.y(hVar.getHandler());
        return xVar;
    }

    protected void j(long j4, long j5, com.googlecode.mp4parser.authoring.h hVar, int i4, com.coremedia.iso.boxes.fragment.c cVar) {
        com.coremedia.iso.boxes.fragment.d dVar = new com.coremedia.iso.boxes.fragment.d();
        dVar.w(i4);
        cVar.v(dVar);
    }

    protected com.coremedia.iso.boxes.d k(com.googlecode.mp4parser.authoring.d dVar, j jVar) {
        com.coremedia.iso.boxes.fragment.e eVar = new com.coremedia.iso.boxes.fragment.e();
        for (com.googlecode.mp4parser.authoring.h hVar : dVar.g()) {
            eVar.v(y(hVar, jVar));
        }
        com.coremedia.iso.boxes.fragment.f fVar = new com.coremedia.iso.boxes.fragment.f();
        eVar.v(fVar);
        fVar.w(eVar.getSize());
        return eVar;
    }

    protected com.coremedia.iso.boxes.d l(com.googlecode.mp4parser.authoring.h hVar, com.googlecode.mp4parser.authoring.d dVar) {
        f0 f0Var = new f0();
        if (hVar.getHandler().equals("vide")) {
            f0Var.v(new m1());
        } else if (hVar.getHandler().equals("soun")) {
            f0Var.v(new y0());
        } else if (hVar.getHandler().equals("text")) {
            f0Var.v(new j0());
        } else if (hVar.getHandler().equals("subt")) {
            f0Var.v(new b1());
        } else if (hVar.getHandler().equals("hint")) {
            f0Var.v(new y());
        } else if (hVar.getHandler().equals("sbtl")) {
            f0Var.v(new j0());
        }
        f0Var.v(b(dVar, hVar));
        f0Var.v(u(dVar, hVar));
        return f0Var;
    }

    protected com.coremedia.iso.boxes.d m(long j4, long j5, com.googlecode.mp4parser.authoring.h hVar, int i4) {
        com.coremedia.iso.boxes.fragment.c cVar = new com.coremedia.iso.boxes.fragment.c();
        j(j4, j5, hVar, i4, cVar);
        A(j4, j5, hVar, i4, cVar);
        n nVar = cVar.N().get(0);
        nVar.G(1);
        nVar.G((int) (cVar.getSize() + 8));
        return cVar;
    }

    protected List<com.coremedia.iso.boxes.d> n(com.googlecode.mp4parser.authoring.d dVar) {
        List<com.coremedia.iso.boxes.d> linkedList = new LinkedList<>();
        HashMap hashMap = new HashMap();
        int i4 = 0;
        for (com.googlecode.mp4parser.authoring.h hVar : dVar.g()) {
            long[] a5 = this.f13180a.a(hVar);
            hashMap.put(hVar, a5);
            i4 = Math.max(i4, a5.length);
        }
        int i5 = 1;
        int i6 = 0;
        while (i6 < i4) {
            int i7 = i5;
            for (com.googlecode.mp4parser.authoring.h hVar2 : K(dVar.g(), i6, hashMap)) {
                i7 = d(linkedList, hVar2, (long[]) hashMap.get(hVar2), i6, i7);
            }
            i6++;
            i5 = i7;
        }
        return linkedList;
    }

    protected com.coremedia.iso.boxes.d o(com.googlecode.mp4parser.authoring.d dVar) {
        h0 h0Var = new h0();
        h0Var.v(q(dVar));
        for (com.googlecode.mp4parser.authoring.h hVar : dVar.g()) {
            h0Var.v(B(hVar, dVar));
        }
        h0Var.v(p(dVar));
        return h0Var;
    }

    protected com.coremedia.iso.boxes.d p(com.googlecode.mp4parser.authoring.d dVar) {
        com.coremedia.iso.boxes.fragment.a aVar = new com.coremedia.iso.boxes.fragment.a();
        com.coremedia.iso.boxes.fragment.b bVar = new com.coremedia.iso.boxes.fragment.b();
        bVar.setVersion(1);
        for (com.googlecode.mp4parser.authoring.h hVar : dVar.g()) {
            long I = I(dVar, hVar);
            if (bVar.v() < I) {
                bVar.w(I);
            }
        }
        aVar.v(bVar);
        for (com.googlecode.mp4parser.authoring.h hVar2 : dVar.g()) {
            aVar.v(C(dVar, hVar2));
        }
        return aVar;
    }

    protected com.coremedia.iso.boxes.d q(com.googlecode.mp4parser.authoring.d dVar) {
        i0 i0Var = new i0();
        i0Var.setVersion(1);
        i0Var.J(E());
        i0Var.N(E());
        long j4 = 0;
        i0Var.L(0L);
        i0Var.V(dVar.e());
        for (com.googlecode.mp4parser.authoring.h hVar : dVar.g()) {
            if (j4 < hVar.M().i()) {
                j4 = hVar.M().i();
            }
        }
        i0Var.O(j4 + 1);
        return i0Var;
    }

    protected void r(long j4, long j5, com.googlecode.mp4parser.authoring.tracks.g gVar, int i4, k kVar) {
        com.coremedia.iso.boxes.d next;
        x0 x0Var = (x0) m.e(gVar.o(), "enc.[0]/sinf[0]/schm[0]");
        com.mp4parser.iso14496.part12.b bVar = new com.mp4parser.iso14496.part12.b();
        kVar.v(bVar);
        bVar.y("cenc");
        bVar.setFlags(1);
        long j6 = 8;
        Iterator<com.coremedia.iso.boxes.d> it2 = kVar.t().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            com.coremedia.iso.boxes.d next2 = it2.next();
            if (next2 instanceof com.googlecode.mp4parser.boxes.dece.d) {
                j6 += ((com.googlecode.mp4parser.boxes.dece.d) next2).x();
                break;
            }
            j6 += next2.getSize();
        }
        long j7 = j6 + 16;
        Iterator<com.coremedia.iso.boxes.d> it3 = ((com.coremedia.iso.boxes.fragment.c) kVar.getParent()).t().iterator();
        while (it3.hasNext() && (next = it3.next()) != kVar) {
            j7 += next.getSize();
        }
        bVar.A(new long[]{j7});
    }

    protected void s(long j4, long j5, com.googlecode.mp4parser.authoring.tracks.g gVar, int i4, k kVar) {
        s0 o4 = gVar.o();
        x0 x0Var = (x0) m.e(o4, "enc.[0]/sinf[0]/schm[0]");
        com.mp4parser.iso23001.part7.c cVar = (com.mp4parser.iso23001.part7.c) m.e(o4, "enc.[0]/sinf[0]/schi[0]/tenc[0]");
        com.mp4parser.iso14496.part12.c cVar2 = new com.mp4parser.iso14496.part12.c();
        cVar2.B("cenc");
        cVar2.setFlags(1);
        if (gVar.F()) {
            int a5 = com.googlecode.mp4parser.util.c.a(j5 - j4);
            short[] sArr = new short[a5];
            List<com.mp4parser.iso23001.part7.a> subList = gVar.R().subList(com.googlecode.mp4parser.util.c.a(j4 - 1), com.googlecode.mp4parser.util.c.a(j5 - 1));
            for (int i5 = 0; i5 < a5; i5++) {
                sArr[i5] = (short) subList.get(i5).b();
            }
            cVar2.F(sArr);
        } else {
            cVar2.D(cVar.w());
            cVar2.E(com.googlecode.mp4parser.util.c.a(j5 - j4));
        }
        kVar.v(cVar2);
    }

    protected void t(long j4, long j5, com.googlecode.mp4parser.authoring.tracks.g gVar, int i4, k kVar) {
        com.googlecode.mp4parser.boxes.dece.d dVar = new com.googlecode.mp4parser.boxes.dece.d();
        dVar.C(gVar.F());
        dVar.B(gVar.R().subList(com.googlecode.mp4parser.util.c.a(j4 - 1), com.googlecode.mp4parser.util.c.a(j5 - 1)));
        kVar.v(dVar);
    }

    protected com.coremedia.iso.boxes.d u(com.googlecode.mp4parser.authoring.d dVar, com.googlecode.mp4parser.authoring.h hVar) {
        u0 u0Var = new u0();
        v(hVar, u0Var);
        u0Var.v(new d1());
        u0Var.v(new v0());
        u0Var.v(new t0());
        u0Var.v(new z0());
        return u0Var;
    }

    protected void v(com.googlecode.mp4parser.authoring.h hVar, u0 u0Var) {
        u0Var.v(hVar.o());
    }

    protected void w(long j4, com.googlecode.mp4parser.authoring.h hVar, k kVar) {
        com.coremedia.iso.boxes.fragment.j jVar = new com.coremedia.iso.boxes.fragment.j();
        jVar.setVersion(1);
        long[] O = hVar.O();
        long j5 = 0;
        for (int i4 = 1; i4 < j4; i4++) {
            j5 += O[i4 - 1];
        }
        jVar.w(j5);
        kVar.v(jVar);
    }

    protected void x(long j4, long j5, com.googlecode.mp4parser.authoring.h hVar, int i4, k kVar) {
        com.coremedia.iso.boxes.fragment.l lVar = new com.coremedia.iso.boxes.fragment.l();
        lVar.L(new com.coremedia.iso.boxes.fragment.g());
        lVar.I(-1L);
        lVar.P(hVar.M().i());
        lVar.J(true);
        kVar.v(lVar);
    }

    protected com.coremedia.iso.boxes.d y(com.googlecode.mp4parser.authoring.h hVar, j jVar) {
        com.coremedia.iso.boxes.fragment.g x4;
        com.coremedia.iso.boxes.fragment.m mVar;
        LinkedList linkedList;
        com.coremedia.iso.boxes.fragment.i iVar;
        Iterator<com.coremedia.iso.boxes.d> it2;
        int i4;
        int i5;
        int i6;
        List list;
        List list2;
        com.coremedia.iso.boxes.d dVar;
        LinkedList linkedList2;
        com.coremedia.iso.boxes.fragment.m mVar2 = new com.coremedia.iso.boxes.fragment.m();
        mVar2.setVersion(1);
        LinkedList linkedList3 = new LinkedList();
        r4 = null;
        for (com.coremedia.iso.boxes.fragment.i iVar2 : m.h(jVar, "moov/mvex/trex")) {
            com.coremedia.iso.boxes.fragment.i iVar3 = iVar2;
            mVar2 = mVar2;
            linkedList3 = linkedList3;
            if (iVar2.A() != hVar.M().i()) {
                iVar2 = iVar3;
            }
        }
        Iterator<com.coremedia.iso.boxes.d> it3 = jVar.t().iterator();
        long j4 = 0;
        long j5 = 0;
        while (it3.hasNext()) {
            com.coremedia.iso.boxes.d next = it3.next();
            if (next instanceof com.coremedia.iso.boxes.fragment.c) {
                List g4 = ((com.coremedia.iso.boxes.fragment.c) next).g(k.class);
                int i7 = 0;
                int i8 = 0;
                while (i8 < g4.size()) {
                    k kVar = (k) g4.get(i8);
                    if (kVar.C().A() == hVar.M().i()) {
                        List g5 = kVar.g(n.class);
                        int i9 = 0;
                        while (i9 < g5.size()) {
                            LinkedList linkedList4 = new LinkedList();
                            n nVar = (n) g5.get(i9);
                            long j6 = j5;
                            int i10 = 0;
                            while (i10 < nVar.w().size()) {
                                n.a aVar = nVar.w().get(i10);
                                if (i10 == 0 && nVar.B()) {
                                    x4 = nVar.x();
                                } else if (nVar.E()) {
                                    x4 = aVar.k();
                                } else {
                                    x4 = iVar2.x();
                                }
                                if (x4 == null && hVar.getHandler().equals("vide")) {
                                    throw new RuntimeException("Cannot find SampleFlags for video track but it's required to build tfra");
                                }
                                if (x4 == null || x4.d() == 2) {
                                    mVar = mVar2;
                                    linkedList = linkedList3;
                                    iVar = iVar2;
                                    it2 = it3;
                                    i4 = i10;
                                    i5 = i9;
                                    i6 = i8;
                                    list = g5;
                                    list2 = g4;
                                    dVar = next;
                                    linkedList2 = linkedList4;
                                    linkedList2.add(new m.a(j6, j4, i8 + 1, i9 + 1, i10 + 1));
                                } else {
                                    mVar = mVar2;
                                    linkedList = linkedList3;
                                    iVar = iVar2;
                                    it2 = it3;
                                    i4 = i10;
                                    i5 = i9;
                                    linkedList2 = linkedList4;
                                    i6 = i8;
                                    list = g5;
                                    list2 = g4;
                                    dVar = next;
                                }
                                j6 += aVar.j();
                                i10 = i4 + 1;
                                g4 = list2;
                                linkedList4 = linkedList2;
                                mVar2 = mVar;
                                linkedList3 = linkedList;
                                iVar2 = iVar;
                                it3 = it2;
                                next = dVar;
                                i9 = i5;
                                i8 = i6;
                                g5 = list;
                                i7 = 0;
                            }
                            if (linkedList4.size() == nVar.w().size() && nVar.w().size() > 0) {
                                linkedList3.add((m.a) linkedList4.get(i7));
                            } else {
                                linkedList3.addAll(linkedList4);
                            }
                            i9++;
                            j5 = j6;
                        }
                        continue;
                    }
                    i8++;
                    g4 = g4;
                    mVar2 = mVar2;
                    linkedList3 = linkedList3;
                    iVar2 = iVar2;
                    it3 = it3;
                    next = next;
                    i7 = 0;
                }
                continue;
            }
            j4 += next.getSize();
            mVar2 = mVar2;
            linkedList3 = linkedList3;
            iVar2 = iVar2;
            it3 = it3;
        }
        mVar2.C(linkedList3);
        mVar2.G(hVar.M().i());
        return mVar2;
    }

    protected com.coremedia.iso.boxes.d z(com.googlecode.mp4parser.authoring.d dVar, com.googlecode.mp4parser.authoring.h hVar) {
        g1 g1Var = new g1();
        g1Var.setVersion(1);
        g1Var.setFlags(7);
        g1Var.J(hVar.M().b());
        g1Var.K(hVar.M().a());
        g1Var.L(0L);
        g1Var.N(hVar.M().c());
        g1Var.W(hVar.M().k());
        g1Var.R(hVar.M().e());
        g1Var.T(E());
        g1Var.U(hVar.M().i());
        g1Var.V(hVar.M().j());
        return g1Var;
    }
}
