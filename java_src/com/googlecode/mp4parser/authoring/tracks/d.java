package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.a1;
import com.coremedia.iso.boxes.i;
import com.coremedia.iso.boxes.r0;
import com.coremedia.iso.boxes.s0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* compiled from: AppendTrack.java */
/* loaded from: classes3.dex */
public class d extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: g  reason: collision with root package name */
    private static com.googlecode.mp4parser.util.j f13424g = com.googlecode.mp4parser.util.j.a(d.class);

    /* renamed from: e  reason: collision with root package name */
    com.googlecode.mp4parser.authoring.h[] f13425e;

    /* renamed from: f  reason: collision with root package name */
    s0 f13426f;

    public d(com.googlecode.mp4parser.authoring.h... hVarArr) throws IOException {
        super(a(hVarArr));
        this.f13425e = hVarArr;
        for (com.googlecode.mp4parser.authoring.h hVar : hVarArr) {
            s0 s0Var = this.f13426f;
            if (s0Var == null) {
                s0 s0Var2 = new s0();
                this.f13426f = s0Var2;
                s0Var2.v((com.coremedia.iso.boxes.d) hVar.o().g(com.coremedia.iso.boxes.sampleentry.f.class).get(0));
            } else {
                this.f13426f = h(s0Var, hVar.o());
            }
        }
    }

    public static String a(com.googlecode.mp4parser.authoring.h... hVarArr) {
        String str = "";
        for (com.googlecode.mp4parser.authoring.h hVar : hVarArr) {
            str = String.valueOf(str) + hVar.getName() + " + ";
        }
        return str.substring(0, str.length() - 3);
    }

    private com.coremedia.iso.boxes.sampleentry.c b(com.coremedia.iso.boxes.sampleentry.c cVar, com.coremedia.iso.boxes.sampleentry.c cVar2) {
        com.coremedia.iso.boxes.sampleentry.c cVar3 = new com.coremedia.iso.boxes.sampleentry.c(cVar2.getType());
        if (cVar.C() == cVar2.C()) {
            cVar3.Z(cVar.C());
            if (cVar.D() == cVar2.D()) {
                cVar3.a0(cVar.D());
                if (cVar.E() == cVar2.E()) {
                    cVar3.b0(cVar.E());
                    if (cVar.J() == cVar2.J()) {
                        cVar3.c0(cVar.J());
                        if (cVar.N() == cVar2.N()) {
                            cVar3.e0(cVar.N());
                            if (cVar.K() == cVar2.K()) {
                                cVar3.d0(cVar.K());
                                if (cVar.T() == cVar2.T()) {
                                    cVar3.h0(cVar.T());
                                    if (cVar.V() == cVar2.V()) {
                                        cVar3.i0(cVar.V());
                                        if (cVar.W() == cVar2.W()) {
                                            cVar3.j0(cVar.W());
                                            if (cVar.X() == cVar2.X()) {
                                                cVar3.k0(cVar.X());
                                                if (Arrays.equals(cVar.Y(), cVar2.Y())) {
                                                    cVar3.l0(cVar.Y());
                                                    if (cVar.t().size() == cVar2.t().size()) {
                                                        Iterator<com.coremedia.iso.boxes.d> it2 = cVar2.t().iterator();
                                                        for (com.coremedia.iso.boxes.d dVar : cVar.t()) {
                                                            com.coremedia.iso.boxes.d next = it2.next();
                                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                                            try {
                                                                dVar.a(Channels.newChannel(byteArrayOutputStream));
                                                                next.a(Channels.newChannel(byteArrayOutputStream2));
                                                                if (Arrays.equals(byteArrayOutputStream.toByteArray(), byteArrayOutputStream2.toByteArray())) {
                                                                    cVar3.v(dVar);
                                                                } else if (com.googlecode.mp4parser.boxes.mp4.b.A.equals(dVar.getType()) && com.googlecode.mp4parser.boxes.mp4.b.A.equals(next.getType())) {
                                                                    com.googlecode.mp4parser.boxes.mp4.b bVar = (com.googlecode.mp4parser.boxes.mp4.b) dVar;
                                                                    bVar.z(d(bVar.A(), ((com.googlecode.mp4parser.boxes.mp4.b) next).A()));
                                                                    cVar3.v(dVar);
                                                                }
                                                            } catch (IOException e5) {
                                                                f13424g.d(e5.getMessage());
                                                                return null;
                                                            }
                                                        }
                                                    }
                                                    return cVar3;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return null;
                        }
                        f13424g.c("ChannelCount differ");
                    }
                    return null;
                }
                f13424g.c("BytesPerSample differ");
            }
            return null;
        }
        f13424g.c("BytesPerFrame differ");
        return null;
    }

    private com.googlecode.mp4parser.boxes.mp4.objectdescriptors.g d(com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b bVar, com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b bVar2) {
        if ((bVar instanceof com.googlecode.mp4parser.boxes.mp4.objectdescriptors.g) && (bVar2 instanceof com.googlecode.mp4parser.boxes.mp4.objectdescriptors.g)) {
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.g gVar = (com.googlecode.mp4parser.boxes.mp4.objectdescriptors.g) bVar;
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.g gVar2 = (com.googlecode.mp4parser.boxes.mp4.objectdescriptors.g) bVar2;
            if (gVar.o() != gVar2.o()) {
                return null;
            }
            gVar.p();
            gVar2.p();
            if (gVar.h() == gVar2.h() && gVar.i() == gVar2.i() && gVar.r() == gVar2.r() && gVar.s() == gVar2.s() && gVar.k() == gVar2.k() && gVar.m() == gVar2.m()) {
                gVar.n();
                gVar2.n();
                if (gVar.q() != null) {
                    gVar.q().equals(gVar2.q());
                } else {
                    gVar2.q();
                }
                if (gVar.g() == null ? gVar2.g() != null : !gVar.g().equals(gVar2.g())) {
                    com.googlecode.mp4parser.boxes.mp4.objectdescriptors.e g4 = gVar.g();
                    com.googlecode.mp4parser.boxes.mp4.objectdescriptors.e g5 = gVar2.g();
                    if (g4.g() != null && g5.g() != null && !g4.g().equals(g5.g())) {
                        return null;
                    }
                    if (g4.h() != g5.h()) {
                        g4.s((g4.h() + g5.h()) / 2);
                    }
                    g4.i();
                    g5.i();
                    if (g4.j() == null ? g5.j() != null : !g4.j().equals(g5.j())) {
                        return null;
                    }
                    if (g4.k() != g5.k()) {
                        g4.u(Math.max(g4.k(), g5.k()));
                    }
                    if (!g4.m().equals(g5.m()) || g4.l() != g5.l() || g4.n() != g5.n() || g4.o() != g5.o()) {
                        return null;
                    }
                }
                if (gVar.j() == null ? gVar2.j() == null : gVar.j().equals(gVar2.j())) {
                    if (gVar.l() == null ? gVar2.l() == null : gVar.l().equals(gVar2.l())) {
                        return gVar;
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        f13424g.c("I can only merge ESDescriptors");
        return null;
    }

    private com.coremedia.iso.boxes.sampleentry.f g(com.coremedia.iso.boxes.sampleentry.f fVar, com.coremedia.iso.boxes.sampleentry.f fVar2) {
        if (fVar.getType().equals(fVar2.getType())) {
            if ((fVar instanceof com.coremedia.iso.boxes.sampleentry.h) && (fVar2 instanceof com.coremedia.iso.boxes.sampleentry.h)) {
                return j((com.coremedia.iso.boxes.sampleentry.h) fVar, (com.coremedia.iso.boxes.sampleentry.h) fVar2);
            }
            if ((fVar instanceof com.coremedia.iso.boxes.sampleentry.c) && (fVar2 instanceof com.coremedia.iso.boxes.sampleentry.c)) {
                return b((com.coremedia.iso.boxes.sampleentry.c) fVar, (com.coremedia.iso.boxes.sampleentry.c) fVar2);
            }
            return null;
        }
        return null;
    }

    private s0 h(s0 s0Var, s0 s0Var2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            s0Var.a(Channels.newChannel(byteArrayOutputStream));
            s0Var2.a(Channels.newChannel(byteArrayOutputStream2));
            if (!Arrays.equals(byteArrayOutputStream2.toByteArray(), byteArrayOutputStream.toByteArray())) {
                com.coremedia.iso.boxes.sampleentry.f g4 = g((com.coremedia.iso.boxes.sampleentry.f) s0Var.g(com.coremedia.iso.boxes.sampleentry.f.class).get(0), (com.coremedia.iso.boxes.sampleentry.f) s0Var2.g(com.coremedia.iso.boxes.sampleentry.f.class).get(0));
                if (g4 == null) {
                    throw new IOException("Cannot merge " + s0Var.g(com.coremedia.iso.boxes.sampleentry.f.class).get(0) + " and " + s0Var2.g(com.coremedia.iso.boxes.sampleentry.f.class).get(0));
                }
                s0Var.b(Collections.singletonList(g4));
            }
            return s0Var;
        } catch (IOException e5) {
            f13424g.c(e5.getMessage());
            return null;
        }
    }

    private com.coremedia.iso.boxes.sampleentry.h j(com.coremedia.iso.boxes.sampleentry.h hVar, com.coremedia.iso.boxes.sampleentry.h hVar2) {
        com.coremedia.iso.boxes.sampleentry.h hVar3 = new com.coremedia.iso.boxes.sampleentry.h();
        if (hVar.K() == hVar2.K()) {
            hVar3.X(hVar.K());
            hVar3.S(hVar.C());
            if (hVar.D() == hVar2.D()) {
                hVar3.T(hVar.D());
                if (hVar.E() == hVar2.E()) {
                    hVar3.V(hVar.E());
                    if (hVar.J() == hVar2.J()) {
                        hVar3.W(hVar.J());
                        if (hVar.P() == hVar2.P()) {
                            hVar3.a0(hVar.P());
                            if (hVar.N() == hVar2.N()) {
                                hVar3.Z(hVar.N());
                                if (hVar.K() == hVar2.K()) {
                                    hVar3.X(hVar.K());
                                    if (hVar.t().size() == hVar2.t().size()) {
                                        Iterator<com.coremedia.iso.boxes.d> it2 = hVar2.t().iterator();
                                        for (com.coremedia.iso.boxes.d dVar : hVar.t()) {
                                            com.coremedia.iso.boxes.d next = it2.next();
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                            try {
                                                dVar.a(Channels.newChannel(byteArrayOutputStream));
                                                next.a(Channels.newChannel(byteArrayOutputStream2));
                                                if (Arrays.equals(byteArrayOutputStream.toByteArray(), byteArrayOutputStream2.toByteArray())) {
                                                    hVar3.v(dVar);
                                                } else if ((dVar instanceof com.googlecode.mp4parser.boxes.mp4.a) && (next instanceof com.googlecode.mp4parser.boxes.mp4.a)) {
                                                    com.googlecode.mp4parser.boxes.mp4.a aVar = (com.googlecode.mp4parser.boxes.mp4.a) dVar;
                                                    aVar.z(d(aVar.w(), ((com.googlecode.mp4parser.boxes.mp4.a) next).w()));
                                                    hVar3.v(dVar);
                                                }
                                            } catch (IOException e5) {
                                                f13424g.d(e5.getMessage());
                                                return null;
                                            }
                                        }
                                    }
                                    return hVar3;
                                }
                                f13424g.c("horizontal resolution differs");
                                return null;
                            }
                            f13424g.c("vert resolution differs");
                            return null;
                        }
                        f13424g.c("width differs");
                        return null;
                    }
                    f13424g.c("height differs");
                    return null;
                }
                f13424g.c("frame count differs");
                return null;
            }
            f13424g.c("Depth differs");
            return null;
        }
        f13424g.c("Horizontal Resolution differs");
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i M() {
        return this.f13425e[0].M();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public synchronized long[] O() {
        long[] jArr;
        int i4 = 0;
        for (com.googlecode.mp4parser.authoring.h hVar : this.f13425e) {
            i4 += hVar.O().length;
        }
        jArr = new long[i4];
        int i5 = 0;
        for (com.googlecode.mp4parser.authoring.h hVar2 : this.f13425e) {
            long[] O = hVar2.O();
            int length = O.length;
            int i6 = 0;
            while (i6 < length) {
                jArr[i5] = O[i6];
                i6++;
                i5++;
            }
        }
        return jArr;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<r0.a> U() {
        if (this.f13425e[0].U() == null || this.f13425e[0].U().isEmpty()) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (com.googlecode.mp4parser.authoring.h hVar : this.f13425e) {
            linkedList.addAll(hVar.U());
        }
        return linkedList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        for (com.googlecode.mp4parser.authoring.h hVar : this.f13425e) {
            hVar.close();
        }
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return this.f13425e[0].getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<i.a> n() {
        if (this.f13425e[0].n() == null || this.f13425e[0].n().isEmpty()) {
            return null;
        }
        LinkedList<int[]> linkedList = new LinkedList();
        for (com.googlecode.mp4parser.authoring.h hVar : this.f13425e) {
            linkedList.add(com.coremedia.iso.boxes.i.v(hVar.n()));
        }
        LinkedList linkedList2 = new LinkedList();
        for (int[] iArr : linkedList) {
            for (int i4 : iArr) {
                if (!linkedList2.isEmpty() && ((i.a) linkedList2.getLast()).b() == i4) {
                    i.a aVar = (i.a) linkedList2.getLast();
                    aVar.c(aVar.a() + 1);
                } else {
                    linkedList2.add(new i.a(1, i4));
                }
            }
        }
        return linkedList2;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public s0 o() {
        return this.f13426f;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public long[] q() {
        if (this.f13425e[0].q() == null || this.f13425e[0].q().length <= 0) {
            return null;
        }
        int i4 = 0;
        for (com.googlecode.mp4parser.authoring.h hVar : this.f13425e) {
            i4 += hVar.q().length;
        }
        long[] jArr = new long[i4];
        long j4 = 0;
        int i5 = 0;
        for (com.googlecode.mp4parser.authoring.h hVar2 : this.f13425e) {
            long[] q4 = hVar2.q();
            int length = q4.length;
            int i6 = 0;
            while (i6 < length) {
                jArr[i5] = q4[i6] + j4;
                i6++;
                i5++;
            }
            j4 += hVar2.x().size();
        }
        return jArr;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public a1 s() {
        return this.f13425e[0].s();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> x() {
        ArrayList arrayList = new ArrayList();
        for (com.googlecode.mp4parser.authoring.h hVar : this.f13425e) {
            arrayList.addAll(hVar.x());
        }
        return arrayList;
    }
}
