package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.boxes.a1;
import com.coremedia.iso.boxes.d1;
import com.coremedia.iso.boxes.e0;
import com.coremedia.iso.boxes.f1;
import com.coremedia.iso.boxes.fragment.k;
import com.coremedia.iso.boxes.fragment.l;
import com.coremedia.iso.boxes.fragment.n;
import com.coremedia.iso.boxes.g1;
import com.coremedia.iso.boxes.i;
import com.coremedia.iso.boxes.i0;
import com.coremedia.iso.boxes.r;
import com.coremedia.iso.boxes.r0;
import com.coremedia.iso.boxes.s0;
import com.coremedia.iso.boxes.u0;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.f;
import com.googlecode.mp4parser.util.m;
import com.join.mgps.Util.h0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: Mp4TrackImpl.java */
/* loaded from: classes3.dex */
public class e extends a {

    /* renamed from: e  reason: collision with root package name */
    f1 f13204e;

    /* renamed from: f  reason: collision with root package name */
    com.coremedia.iso.f[] f13205f;

    /* renamed from: g  reason: collision with root package name */
    private List<f> f13206g;

    /* renamed from: h  reason: collision with root package name */
    private s0 f13207h;

    /* renamed from: i  reason: collision with root package name */
    private long[] f13208i;

    /* renamed from: j  reason: collision with root package name */
    private List<i.a> f13209j;

    /* renamed from: k  reason: collision with root package name */
    private long[] f13210k;

    /* renamed from: l  reason: collision with root package name */
    private List<r0.a> f13211l;

    /* renamed from: m  reason: collision with root package name */
    private i f13212m;

    /* renamed from: n  reason: collision with root package name */
    private String f13213n;

    /* renamed from: o  reason: collision with root package name */
    private a1 f13214o;

    public e(String str, f1 f1Var, com.coremedia.iso.f... fVarArr) {
        super(str);
        Iterator it2;
        long j4;
        Iterator it3;
        ArrayList arrayList;
        Iterator it4;
        Iterator it5;
        com.coremedia.iso.boxes.fragment.g x4;
        int i4;
        int i5 = 0;
        this.f13210k = new long[0];
        this.f13212m = new i();
        this.f13214o = null;
        long C = f1Var.E().C();
        this.f13206g = new com.coremedia.iso.boxes.mdat.b(f1Var, fVarArr);
        u0 D = f1Var.C().E().D();
        this.f13213n = f1Var.C().C().v();
        ArrayList arrayList2 = new ArrayList();
        this.f13209j = new ArrayList();
        this.f13211l = new ArrayList();
        arrayList2.addAll(D.P().w());
        if (D.D() != null) {
            this.f13209j.addAll(D.D().w());
        }
        if (D.E() != null) {
            this.f13211l.addAll(D.E().v());
        }
        if (D.N() != null) {
            this.f13210k = D.N().v();
        }
        String str2 = a1.f9498t;
        this.f13214o = (a1) m.e(D, a1.f9498t);
        ArrayList<com.coremedia.iso.boxes.fragment.c> arrayList3 = new ArrayList();
        arrayList3.addAll(((com.coremedia.iso.boxes.d) f1Var.getParent()).getParent().g(com.coremedia.iso.boxes.fragment.c.class));
        int length = fVarArr.length;
        int i6 = 0;
        while (i6 < length) {
            ArrayList arrayList4 = arrayList3;
            arrayList4.addAll(fVarArr[i6].g(com.coremedia.iso.boxes.fragment.c.class));
            i6++;
            arrayList3 = arrayList4;
            C = C;
            i5 = 0;
        }
        this.f13207h = D.o();
        List g4 = f1Var.getParent().g(com.coremedia.iso.boxes.fragment.a.class);
        if (g4.size() > 0) {
            Iterator it6 = g4.iterator();
            while (it6.hasNext()) {
                for (com.coremedia.iso.boxes.fragment.i iVar : ((com.coremedia.iso.boxes.fragment.a) it6.next()).g(com.coremedia.iso.boxes.fragment.i.class)) {
                    if (iVar.A() == C) {
                        if (m.h(((com.coremedia.iso.boxes.d) f1Var.getParent()).getParent(), "/moof/traf/subs").size() > 0) {
                            this.f13214o = new a1();
                        }
                        LinkedList<Long> linkedList = new LinkedList();
                        Iterator it7 = arrayList3.iterator();
                        long j5 = 1;
                        while (it7.hasNext()) {
                            Iterator it8 = ((com.coremedia.iso.boxes.fragment.c) it7.next()).g(k.class).iterator();
                            while (it8.hasNext()) {
                                k kVar = (k) it8.next();
                                if (kVar.C().A() == C) {
                                    a1 a1Var = (a1) m.e(kVar, str2);
                                    if (a1Var != null) {
                                        j4 = C;
                                        long j6 = (j5 - i5) - 1;
                                        for (a1.a aVar : a1Var.v()) {
                                            a1.a aVar2 = new a1.a();
                                            Iterator it9 = it6;
                                            String str3 = str2;
                                            aVar2.c().addAll(aVar.c());
                                            long j7 = 0;
                                            if (j6 != 0) {
                                                aVar2.d(j6 + aVar.a());
                                            } else {
                                                j7 = j6;
                                                aVar2.d(aVar.a());
                                            }
                                            j6 = j7;
                                            this.f13214o.v().add(aVar2);
                                            it6 = it9;
                                            str2 = str3;
                                        }
                                        it2 = it6;
                                    } else {
                                        it2 = it6;
                                        j4 = C;
                                    }
                                    String str4 = str2;
                                    Iterator it10 = kVar.g(n.class).iterator();
                                    while (it10.hasNext()) {
                                        n nVar = (n) it10.next();
                                        l C2 = ((k) nVar.getParent()).C();
                                        int i7 = 1;
                                        boolean z4 = true;
                                        for (n.a aVar3 : nVar.w()) {
                                            if (nVar.D()) {
                                                if (arrayList2.size() != 0) {
                                                    it3 = it10;
                                                    if (((d1.a) arrayList2.get(arrayList2.size() - 1)).b() == aVar3.j()) {
                                                        d1.a aVar4 = (d1.a) arrayList2.get(arrayList2.size() - i7);
                                                        arrayList = arrayList3;
                                                        it4 = it7;
                                                        it5 = it8;
                                                        aVar4.c(aVar4.a() + 1);
                                                    }
                                                } else {
                                                    it3 = it10;
                                                }
                                                arrayList = arrayList3;
                                                it4 = it7;
                                                it5 = it8;
                                                arrayList2.add(new d1.a(1L, aVar3.j()));
                                            } else {
                                                it3 = it10;
                                                arrayList = arrayList3;
                                                it4 = it7;
                                                it5 = it8;
                                                if (C2.C()) {
                                                    arrayList2.add(new d1.a(1L, C2.w()));
                                                } else {
                                                    arrayList2.add(new d1.a(1L, iVar.w()));
                                                }
                                            }
                                            if (nVar.C()) {
                                                if (this.f13209j.size() != 0) {
                                                    List<i.a> list = this.f13209j;
                                                    i4 = 1;
                                                    if (list.get(list.size() - 1).b() == aVar3.i()) {
                                                        List<i.a> list2 = this.f13209j;
                                                        i.a aVar5 = list2.get(list2.size() - 1);
                                                        aVar5.c(aVar5.a() + 1);
                                                    }
                                                } else {
                                                    i4 = 1;
                                                }
                                                this.f13209j.add(new i.a(i4, com.googlecode.mp4parser.util.c.a(aVar3.i())));
                                            }
                                            if (nVar.E()) {
                                                x4 = aVar3.k();
                                            } else if (z4 && nVar.B()) {
                                                x4 = nVar.x();
                                            } else if (C2.D()) {
                                                x4 = C2.x();
                                            } else {
                                                x4 = iVar.x();
                                            }
                                            if (x4 != null && !x4.h()) {
                                                linkedList.add(Long.valueOf(j5));
                                            }
                                            j5++;
                                            arrayList3 = arrayList;
                                            it10 = it3;
                                            it7 = it4;
                                            it8 = it5;
                                            i7 = 1;
                                            z4 = false;
                                        }
                                    }
                                    it6 = it2;
                                    C = j4;
                                    str2 = str4;
                                    i5 = 0;
                                }
                            }
                        }
                        long[] jArr = this.f13210k;
                        long[] jArr2 = new long[jArr.length + linkedList.size()];
                        this.f13210k = jArr2;
                        System.arraycopy(jArr, i5, jArr2, i5, jArr.length);
                        int length2 = jArr.length;
                        for (Long l4 : linkedList) {
                            this.f13210k[length2] = l4.longValue();
                            length2++;
                        }
                    }
                }
            }
            new ArrayList();
            new ArrayList();
            for (com.coremedia.iso.boxes.fragment.c cVar : arrayList3) {
                for (k kVar2 : cVar.g(k.class)) {
                    if (kVar2.C().A() == C) {
                        this.f13157d = a(m.h(kVar2, com.googlecode.mp4parser.boxes.mp4.samplegrouping.e.f13999u), m.h(kVar2, com.googlecode.mp4parser.boxes.mp4.samplegrouping.f.f14007v), this.f13157d);
                    }
                }
            }
        } else {
            this.f13157d = a(D.g(com.googlecode.mp4parser.boxes.mp4.samplegrouping.e.class), D.g(com.googlecode.mp4parser.boxes.mp4.samplegrouping.f.class), this.f13157d);
        }
        this.f13208i = d1.v(arrayList2);
        e0 D2 = f1Var.C().D();
        g1 E = f1Var.E();
        this.f13212m.t(E.C());
        this.f13212m.l(D2.v());
        this.f13212m.o(D2.x());
        this.f13212m.r(D2.y());
        this.f13212m.s(D2.z());
        this.f13212m.n(E.y());
        this.f13212m.v(E.E());
        this.f13212m.p(E.z());
        this.f13212m.q(E.A());
        r rVar = (r) m.e(f1Var, "edts/elst");
        i0 i0Var = (i0) m.e(f1Var, "../mvhd");
        if (rVar != null) {
            for (Iterator<r.a> it11 = rVar.v().iterator(); it11.hasNext(); it11 = it11) {
                r.a next = it11.next();
                List<c> list3 = this.f13156c;
                long c5 = next.c();
                long z5 = D2.z();
                double b5 = next.b();
                double d5 = next.d();
                e0 e0Var = D2;
                double H = i0Var.H();
                Double.isNaN(d5);
                Double.isNaN(H);
                list3.add(new c(c5, z5, b5, d5 / H));
                D2 = e0Var;
            }
        }
    }

    private Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> a(List<com.googlecode.mp4parser.boxes.mp4.samplegrouping.e> list, List<com.googlecode.mp4parser.boxes.mp4.samplegrouping.f> list2, Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> map) {
        for (com.googlecode.mp4parser.boxes.mp4.samplegrouping.e eVar : list) {
            boolean z4 = false;
            for (com.googlecode.mp4parser.boxes.mp4.samplegrouping.f fVar : list2) {
                if (fVar.w().equals(eVar.w().get(0).getType())) {
                    int i4 = 0;
                    for (f.a aVar : fVar.v()) {
                        if (aVar.a() > 0) {
                            com.googlecode.mp4parser.boxes.mp4.samplegrouping.b bVar = eVar.w().get(aVar.a() - 1);
                            long[] jArr = map.get(bVar);
                            if (jArr == null) {
                                jArr = new long[0];
                            }
                            long[] jArr2 = new long[com.googlecode.mp4parser.util.c.a(aVar.b()) + jArr.length];
                            System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
                            for (int i5 = 0; i5 < aVar.b(); i5++) {
                                jArr2[jArr.length + i5] = i4 + i5;
                            }
                            map.put(bVar, jArr2);
                        }
                        i4 = (int) (i4 + aVar.b());
                    }
                    z4 = true;
                }
            }
            if (!z4) {
                throw new RuntimeException("Could not find SampleToGroupBox for " + eVar.w().get(0).getType() + h0.f27805a);
            }
        }
        return map;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public i M() {
        return this.f13212m;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public synchronized long[] O() {
        return this.f13208i;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<r0.a> U() {
        return this.f13211l;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        com.coremedia.iso.boxes.j parent = this.f13204e.getParent();
        if (parent instanceof com.googlecode.mp4parser.d) {
            ((com.googlecode.mp4parser.d) parent).close();
        }
        for (com.coremedia.iso.f fVar : this.f13205f) {
            fVar.close();
        }
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return this.f13213n;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<i.a> n() {
        return this.f13209j;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public s0 o() {
        return this.f13207h;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public long[] q() {
        if (this.f13210k.length == this.f13206g.size()) {
            return null;
        }
        return this.f13210k;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public a1 s() {
        return this.f13214o;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<f> x() {
        return this.f13206g;
    }
}
