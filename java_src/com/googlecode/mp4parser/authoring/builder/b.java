package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.boxes.b1;
import com.coremedia.iso.boxes.c1;
import com.coremedia.iso.boxes.d0;
import com.coremedia.iso.boxes.d1;
import com.coremedia.iso.boxes.e0;
import com.coremedia.iso.boxes.f0;
import com.coremedia.iso.boxes.f1;
import com.coremedia.iso.boxes.g1;
import com.coremedia.iso.boxes.h0;
import com.coremedia.iso.boxes.i;
import com.coremedia.iso.boxes.i0;
import com.coremedia.iso.boxes.j;
import com.coremedia.iso.boxes.j0;
import com.coremedia.iso.boxes.l;
import com.coremedia.iso.boxes.m1;
import com.coremedia.iso.boxes.n;
import com.coremedia.iso.boxes.o;
import com.coremedia.iso.boxes.q;
import com.coremedia.iso.boxes.r;
import com.coremedia.iso.boxes.r0;
import com.coremedia.iso.boxes.s;
import com.coremedia.iso.boxes.t0;
import com.coremedia.iso.boxes.u0;
import com.coremedia.iso.boxes.v0;
import com.coremedia.iso.boxes.x;
import com.coremedia.iso.boxes.y;
import com.coremedia.iso.boxes.y0;
import com.coremedia.iso.boxes.z0;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.f;
import com.googlecode.mp4parser.util.m;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: DefaultMp4Builder.java */
/* loaded from: classes3.dex */
public class b implements e {

    /* renamed from: f  reason: collision with root package name */
    private static Logger f13166f = Logger.getLogger(b.class.getName());

    /* renamed from: g  reason: collision with root package name */
    static final /* synthetic */ boolean f13167g = false;

    /* renamed from: a  reason: collision with root package name */
    Set<z0> f13168a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    Set<com.mp4parser.iso14496.part12.b> f13169b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    HashMap<com.googlecode.mp4parser.authoring.h, List<com.googlecode.mp4parser.authoring.f>> f13170c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    HashMap<com.googlecode.mp4parser.authoring.h, long[]> f13171d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private c f13172e;

    public static long r(long j4, long j5) {
        return j5 == 0 ? j4 : r(j5, j4 % j5);
    }

    private static long w(int[] iArr) {
        long j4 = 0;
        for (int i4 : iArr) {
            j4 += i4;
        }
        return j4;
    }

    private static long x(long[] jArr) {
        long j4 = 0;
        for (long j5 : jArr) {
            j4 += j5;
        }
        return j4;
    }

    @Override // com.googlecode.mp4parser.authoring.builder.e
    public j a(com.googlecode.mp4parser.authoring.d dVar) {
        com.coremedia.iso.boxes.d next;
        if (this.f13172e == null) {
            this.f13172e = new h(dVar, 2);
        }
        f13166f.fine("Creating movie " + dVar);
        Iterator<com.googlecode.mp4parser.authoring.h> it2 = dVar.g().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            com.googlecode.mp4parser.authoring.h next2 = it2.next();
            List<com.googlecode.mp4parser.authoring.f> x4 = next2.x();
            u(next2, x4);
            int size = x4.size();
            long[] jArr = new long[size];
            for (int i4 = 0; i4 < size; i4++) {
                jArr[i4] = x4.get(i4).getSize();
            }
            this.f13171d.put(next2, jArr);
        }
        com.googlecode.mp4parser.d dVar2 = new com.googlecode.mp4parser.d();
        dVar2.v(e(dVar));
        HashMap hashMap = new HashMap();
        for (com.googlecode.mp4parser.authoring.h hVar : dVar.g()) {
            hashMap.put(hVar, s(hVar, dVar));
        }
        h0 f5 = f(dVar, hashMap);
        dVar2.v(f5);
        long j4 = 0;
        for (t0 t0Var : m.f(f5, "trak/mdia/minf/stbl/stsz")) {
            j4 += x(t0Var.y());
        }
        C0292b c0292b = new C0292b(this, dVar, hashMap, j4, null);
        dVar2.v(c0292b);
        long b5 = c0292b.b();
        for (z0 z0Var : this.f13168a) {
            long[] v2 = z0Var.v();
            for (int i5 = 0; i5 < v2.length; i5++) {
                v2[i5] = v2[i5] + b5;
            }
        }
        for (com.mp4parser.iso14496.part12.b bVar : this.f13169b) {
            long size2 = bVar.getSize() + 44;
            j jVar = bVar;
            while (true) {
                j parent = jVar.getParent();
                Iterator<com.coremedia.iso.boxes.d> it3 = parent.t().iterator();
                while (it3.hasNext() && (next = it3.next()) != jVar) {
                    size2 += next.getSize();
                }
                if (!(parent instanceof com.coremedia.iso.boxes.d)) {
                    break;
                }
                jVar = parent;
            }
            long[] x5 = bVar.x();
            for (int i6 = 0; i6 < x5.length; i6++) {
                x5[i6] = x5[i6] + size2;
            }
            bVar.A(x5);
        }
        return dVar2;
    }

    protected void b(com.googlecode.mp4parser.authoring.tracks.g gVar, u0 u0Var, int[] iArr) {
        com.mp4parser.iso14496.part12.c cVar = new com.mp4parser.iso14496.part12.c();
        cVar.B("cenc");
        cVar.setFlags(1);
        List<com.mp4parser.iso23001.part7.a> R = gVar.R();
        if (gVar.F()) {
            int size = R.size();
            short[] sArr = new short[size];
            for (int i4 = 0; i4 < size; i4++) {
                sArr[i4] = (short) R.get(i4).b();
            }
            cVar.F(sArr);
        } else {
            cVar.D(8);
            cVar.E(gVar.x().size());
        }
        com.mp4parser.iso14496.part12.b bVar = new com.mp4parser.iso14496.part12.b();
        com.googlecode.mp4parser.boxes.dece.d dVar = new com.googlecode.mp4parser.boxes.dece.d();
        dVar.C(gVar.F());
        dVar.B(R);
        long x4 = dVar.x();
        long[] jArr = new long[iArr.length];
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            jArr[i6] = x4;
            int i7 = 0;
            while (i7 < iArr[i6]) {
                x4 += R.get(i5).b();
                i7++;
                i5++;
                dVar = dVar;
            }
        }
        bVar.A(jArr);
        u0Var.v(cVar);
        u0Var.v(bVar);
        u0Var.v(dVar);
        this.f13169b.add(bVar);
    }

    protected void c(com.googlecode.mp4parser.authoring.h hVar, u0 u0Var) {
        List<i.a> n4 = hVar.n();
        if (n4 == null || n4.isEmpty()) {
            return;
        }
        i iVar = new i();
        iVar.x(n4);
        u0Var.v(iVar);
    }

    protected com.coremedia.iso.boxes.d d(com.googlecode.mp4parser.authoring.h hVar, com.googlecode.mp4parser.authoring.d dVar) {
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

    protected s e(com.googlecode.mp4parser.authoring.d dVar) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("isom");
        linkedList.add("iso2");
        linkedList.add(com.coremedia.iso.boxes.sampleentry.h.f9920z);
        return new s("isom", 0L, linkedList);
    }

    protected h0 f(com.googlecode.mp4parser.authoring.d dVar, Map<com.googlecode.mp4parser.authoring.h, int[]> map) {
        long duration;
        h0 h0Var = new h0();
        i0 i0Var = new i0();
        i0Var.J(new Date());
        i0Var.N(new Date());
        i0Var.M(dVar.c());
        long t4 = t(dVar);
        long j4 = 0;
        for (com.googlecode.mp4parser.authoring.h hVar : dVar.g()) {
            if (hVar.H() != null && !hVar.H().isEmpty()) {
                long j5 = 0;
                for (com.googlecode.mp4parser.authoring.c cVar : hVar.H()) {
                    j5 += (long) cVar.c();
                }
                duration = j5 * t(dVar);
            } else {
                duration = (hVar.getDuration() * t(dVar)) / hVar.M().h();
            }
            if (duration > j4) {
                j4 = duration;
            }
        }
        i0Var.L(j4);
        i0Var.V(t4);
        long j6 = 0;
        for (com.googlecode.mp4parser.authoring.h hVar2 : dVar.g()) {
            if (j6 < hVar2.M().i()) {
                j6 = hVar2.M().i();
            }
        }
        i0Var.O(j6 + 1);
        h0Var.v(i0Var);
        for (com.googlecode.mp4parser.authoring.h hVar3 : dVar.g()) {
            h0Var.v(p(hVar3, dVar, map));
        }
        com.coremedia.iso.boxes.d q4 = q(dVar);
        if (q4 != null) {
            h0Var.v(q4);
        }
        return h0Var;
    }

    protected void g(com.googlecode.mp4parser.authoring.h hVar, u0 u0Var) {
        if (hVar.U() == null || hVar.U().isEmpty()) {
            return;
        }
        r0 r0Var = new r0();
        r0Var.w(hVar.U());
        u0Var.v(r0Var);
    }

    protected com.coremedia.iso.boxes.d h(com.googlecode.mp4parser.authoring.h hVar, com.googlecode.mp4parser.authoring.d dVar, Map<com.googlecode.mp4parser.authoring.h, int[]> map) {
        u0 u0Var = new u0();
        k(hVar, u0Var);
        n(hVar, u0Var);
        c(hVar, u0Var);
        l(hVar, u0Var);
        g(hVar, u0Var);
        j(hVar, map, u0Var);
        m(hVar, u0Var);
        i(hVar, dVar, map, u0Var);
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
        for (Map.Entry entry2 : hashMap.entrySet()) {
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.e eVar = new com.googlecode.mp4parser.boxes.mp4.samplegrouping.e();
            eVar.z((List) entry2.getValue());
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.f fVar = new com.googlecode.mp4parser.boxes.mp4.samplegrouping.f();
            fVar.z((String) entry2.getKey());
            f.a aVar = null;
            for (int i4 = 0; i4 < hVar.x().size(); i4++) {
                int i5 = 0;
                for (int i6 = 0; i6 < ((List) entry2.getValue()).size(); i6++) {
                    if (Arrays.binarySearch(hVar.I().get((com.googlecode.mp4parser.boxes.mp4.samplegrouping.b) ((List) entry2.getValue()).get(i6)), i4) >= 0) {
                        i5 = i6 + 1;
                    }
                }
                if (aVar != null && aVar.a() == i5) {
                    aVar.d(aVar.b() + 1);
                } else {
                    f.a aVar2 = new f.a(1L, i5);
                    fVar.v().add(aVar2);
                    aVar = aVar2;
                }
            }
            u0Var.v(eVar);
            u0Var.v(fVar);
        }
        if (hVar instanceof com.googlecode.mp4parser.authoring.tracks.g) {
            b((com.googlecode.mp4parser.authoring.tracks.g) hVar, u0Var, map.get(hVar));
        }
        o(hVar, u0Var);
        return u0Var;
    }

    protected void i(com.googlecode.mp4parser.authoring.h hVar, com.googlecode.mp4parser.authoring.d dVar, Map<com.googlecode.mp4parser.authoring.h, int[]> map, u0 u0Var) {
        String str;
        int[] iArr;
        z0 z0Var;
        com.googlecode.mp4parser.authoring.h hVar2 = hVar;
        Map<com.googlecode.mp4parser.authoring.h, int[]> map2 = map;
        int[] iArr2 = map2.get(hVar2);
        z0 z0Var2 = new z0();
        this.f13168a.add(z0Var2);
        long[] jArr = new long[iArr2.length];
        String str2 = "Calculating chunk offsets for track_";
        if (f13166f.isLoggable(Level.FINE)) {
            Logger logger = f13166f;
            logger.fine("Calculating chunk offsets for track_" + hVar.M().i());
        }
        int i4 = 0;
        long j4 = 0;
        while (i4 < iArr2.length) {
            if (f13166f.isLoggable(Level.FINER)) {
                Logger logger2 = f13166f;
                StringBuilder sb = new StringBuilder(str2);
                str = str2;
                sb.append(hVar.M().i());
                sb.append(" chunk ");
                sb.append(i4);
                logger2.finer(sb.toString());
            } else {
                str = str2;
            }
            for (com.googlecode.mp4parser.authoring.h hVar3 : dVar.g()) {
                if (f13166f.isLoggable(Level.FINEST)) {
                    Logger logger3 = f13166f;
                    logger3.finest("Adding offsets of track_" + hVar3.M().i());
                }
                int[] iArr3 = map2.get(hVar3);
                int i5 = 0;
                long j5 = 0;
                while (i5 < i4) {
                    j5 += iArr3[i5];
                    i5++;
                    hVar2 = hVar;
                }
                if (hVar3 == hVar2) {
                    jArr[i4] = j4;
                }
                int a5 = com.googlecode.mp4parser.util.c.a(j5);
                while (true) {
                    iArr = iArr2;
                    z0Var = z0Var2;
                    if (a5 >= iArr3[i4] + j5) {
                        break;
                    }
                    j4 += this.f13171d.get(hVar3)[a5];
                    a5++;
                    iArr2 = iArr;
                    z0Var2 = z0Var;
                }
                hVar2 = hVar;
                map2 = map;
                iArr2 = iArr;
                z0Var2 = z0Var;
            }
            i4++;
            str2 = str;
        }
        z0Var2.w(jArr);
        u0Var.v(z0Var2);
    }

    protected void j(com.googlecode.mp4parser.authoring.h hVar, Map<com.googlecode.mp4parser.authoring.h, int[]> map, u0 u0Var) {
        int[] iArr = map.get(hVar);
        v0 v0Var = new v0();
        v0Var.x(new LinkedList());
        long j4 = -2147483648L;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (j4 != iArr[i4]) {
                v0Var.w().add(new v0.a(i4 + 1, iArr[i4], 1L));
                j4 = iArr[i4];
            }
        }
        u0Var.v(v0Var);
    }

    protected void k(com.googlecode.mp4parser.authoring.h hVar, u0 u0Var) {
        u0Var.v(hVar.o());
    }

    protected void l(com.googlecode.mp4parser.authoring.h hVar, u0 u0Var) {
        long[] q4 = hVar.q();
        if (q4 == null || q4.length <= 0) {
            return;
        }
        c1 c1Var = new c1();
        c1Var.w(q4);
        u0Var.v(c1Var);
    }

    protected void m(com.googlecode.mp4parser.authoring.h hVar, u0 u0Var) {
        t0 t0Var = new t0();
        t0Var.A(this.f13171d.get(hVar));
        u0Var.v(t0Var);
    }

    protected void n(com.googlecode.mp4parser.authoring.h hVar, u0 u0Var) {
        long[] O;
        ArrayList arrayList = new ArrayList();
        d1.a aVar = null;
        for (long j4 : hVar.O()) {
            if (aVar != null && aVar.b() == j4) {
                aVar.c(aVar.a() + 1);
            } else {
                aVar = new d1.a(1L, j4);
                arrayList.add(aVar);
            }
        }
        d1 d1Var = new d1();
        d1Var.x(arrayList);
        u0Var.v(d1Var);
    }

    protected void o(com.googlecode.mp4parser.authoring.h hVar, u0 u0Var) {
        if (hVar.s() != null) {
            u0Var.v(hVar.s());
        }
    }

    protected f1 p(com.googlecode.mp4parser.authoring.h hVar, com.googlecode.mp4parser.authoring.d dVar, Map<com.googlecode.mp4parser.authoring.h, int[]> map) {
        f1 f1Var = new f1();
        g1 g1Var = new g1();
        g1Var.M(true);
        g1Var.O(true);
        g1Var.Q(true);
        g1Var.P(true);
        g1Var.S(hVar.M().f());
        g1Var.J(hVar.M().b());
        g1Var.K(hVar.M().a());
        if (hVar.H() != null && !hVar.H().isEmpty()) {
            long j4 = 0;
            for (com.googlecode.mp4parser.authoring.c cVar : hVar.H()) {
                j4 += (long) cVar.c();
            }
            g1Var.L(j4 * hVar.M().h());
        } else {
            g1Var.L((hVar.getDuration() * t(dVar)) / hVar.M().h());
        }
        g1Var.N(hVar.M().c());
        g1Var.W(hVar.M().k());
        g1Var.R(hVar.M().e());
        g1Var.T(new Date());
        g1Var.U(hVar.M().i());
        g1Var.V(hVar.M().j());
        f1Var.v(g1Var);
        f1Var.v(d(hVar, dVar));
        d0 d0Var = new d0();
        f1Var.v(d0Var);
        e0 e0Var = new e0();
        e0Var.A(hVar.M().a());
        e0Var.B(hVar.getDuration());
        e0Var.E(hVar.M().h());
        e0Var.C(hVar.M().d());
        d0Var.v(e0Var);
        x xVar = new x();
        d0Var.v(xVar);
        xVar.y(hVar.getHandler());
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
        n nVar = new n();
        o oVar = new o();
        nVar.v(oVar);
        l lVar = new l();
        lVar.setFlags(1);
        oVar.v(lVar);
        f0Var.v(nVar);
        f0Var.v(h(hVar, dVar, map));
        d0Var.v(f0Var);
        return f1Var;
    }

    protected com.coremedia.iso.boxes.d q(com.googlecode.mp4parser.authoring.d dVar) {
        return null;
    }

    int[] s(com.googlecode.mp4parser.authoring.h hVar, com.googlecode.mp4parser.authoring.d dVar) {
        long j4;
        long[] a5 = this.f13172e.a(hVar);
        int[] iArr = new int[a5.length];
        int i4 = 0;
        while (i4 < a5.length) {
            long j5 = a5[i4] - 1;
            int i5 = i4 + 1;
            if (a5.length == i5) {
                j4 = hVar.x().size();
            } else {
                j4 = a5[i5] - 1;
            }
            iArr[i4] = com.googlecode.mp4parser.util.c.a(j4 - j5);
            i4 = i5;
        }
        return iArr;
    }

    public long t(com.googlecode.mp4parser.authoring.d dVar) {
        long h4 = dVar.g().iterator().next().M().h();
        for (com.googlecode.mp4parser.authoring.h hVar : dVar.g()) {
            h4 = r(hVar.M().h(), h4);
        }
        return h4;
    }

    protected List<com.googlecode.mp4parser.authoring.f> u(com.googlecode.mp4parser.authoring.h hVar, List<com.googlecode.mp4parser.authoring.f> list) {
        return this.f13170c.put(hVar, list);
    }

    public void v(c cVar) {
        this.f13172e = cVar;
    }

    /* compiled from: DefaultMp4Builder.java */
    /* renamed from: com.googlecode.mp4parser.authoring.builder.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private class C0292b implements com.coremedia.iso.boxes.d {

        /* renamed from: b  reason: collision with root package name */
        List<com.googlecode.mp4parser.authoring.h> f13173b;

        /* renamed from: c  reason: collision with root package name */
        List<List<com.googlecode.mp4parser.authoring.f>> f13174c;

        /* renamed from: d  reason: collision with root package name */
        j f13175d;

        /* renamed from: e  reason: collision with root package name */
        long f13176e;

        private C0292b(com.googlecode.mp4parser.authoring.d dVar, Map<com.googlecode.mp4parser.authoring.h, int[]> map, long j4) {
            this.f13174c = new ArrayList();
            this.f13176e = j4;
            this.f13173b = dVar.g();
            for (int i4 = 0; i4 < map.values().iterator().next().length; i4++) {
                for (com.googlecode.mp4parser.authoring.h hVar : this.f13173b) {
                    int[] iArr = map.get(hVar);
                    long j5 = 0;
                    for (int i5 = 0; i5 < i4; i5++) {
                        j5 += iArr[i5];
                    }
                    this.f13174c.add(b.this.f13170c.get(hVar).subList(com.googlecode.mp4parser.util.c.a(j5), com.googlecode.mp4parser.util.c.a(j5 + iArr[i4])));
                }
            }
        }

        private boolean c(long j4) {
            return j4 + 8 < IjkMediaMeta.AV_CH_WIDE_RIGHT;
        }

        @Override // com.coremedia.iso.boxes.d
        public void a(WritableByteChannel writableByteChannel) throws IOException {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            long size = getSize();
            if (c(size)) {
                com.coremedia.iso.i.i(allocate, size);
            } else {
                com.coremedia.iso.i.i(allocate, 1L);
            }
            allocate.put(com.coremedia.iso.f.C(com.coremedia.iso.boxes.mdat.a.f9798h));
            if (c(size)) {
                allocate.put(new byte[8]);
            } else {
                com.coremedia.iso.i.l(allocate, size);
            }
            allocate.rewind();
            writableByteChannel.write(allocate);
            for (List<com.googlecode.mp4parser.authoring.f> list : this.f13174c) {
                for (com.googlecode.mp4parser.authoring.f fVar : list) {
                    fVar.b(writableByteChannel);
                }
            }
        }

        public long b() {
            com.coremedia.iso.boxes.d next;
            long j4 = 16;
            j jVar = this;
            while (jVar instanceof com.coremedia.iso.boxes.d) {
                C0292b c0292b = jVar;
                Iterator<com.coremedia.iso.boxes.d> it2 = c0292b.getParent().t().iterator();
                while (it2.hasNext() && jVar != (next = it2.next())) {
                    j4 += next.getSize();
                }
                jVar = c0292b.getParent();
            }
            return j4;
        }

        @Override // com.coremedia.iso.boxes.d
        public j getParent() {
            return this.f13175d;
        }

        @Override // com.coremedia.iso.boxes.d
        public long getSize() {
            return this.f13176e + 16;
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
            this.f13175d = jVar;
        }

        /* synthetic */ C0292b(b bVar, com.googlecode.mp4parser.authoring.d dVar, Map map, long j4, C0292b c0292b) {
            this(dVar, map, j4);
        }
    }
}
