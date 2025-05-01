package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.boxes.f1;
import com.coremedia.iso.boxes.fragment.k;
import com.coremedia.iso.boxes.fragment.n;
import com.coremedia.iso.boxes.h0;
import com.coremedia.iso.boxes.x0;
import com.googlecode.mp4parser.util.m;
import com.mp4parser.iso23001.part7.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
/* compiled from: CencMp4TrackImplImpl.java */
/* loaded from: classes3.dex */
public class b extends e implements com.googlecode.mp4parser.authoring.tracks.g {

    /* renamed from: r  reason: collision with root package name */
    static final /* synthetic */ boolean f13158r = false;

    /* renamed from: p  reason: collision with root package name */
    private List<com.mp4parser.iso23001.part7.a> f13159p;

    /* renamed from: q  reason: collision with root package name */
    private UUID f13160q;

    /* compiled from: CencMp4TrackImplImpl.java */
    /* loaded from: classes3.dex */
    private class a {

        /* renamed from: e  reason: collision with root package name */
        static final /* synthetic */ boolean f13161e = false;

        /* renamed from: a  reason: collision with root package name */
        private com.coremedia.iso.boxes.j f13162a;

        /* renamed from: b  reason: collision with root package name */
        private com.mp4parser.iso14496.part12.c f13163b;

        /* renamed from: c  reason: collision with root package name */
        private com.mp4parser.iso14496.part12.b f13164c;

        public a(com.coremedia.iso.boxes.j jVar) {
            this.f13162a = jVar;
        }

        public com.mp4parser.iso14496.part12.b c() {
            return this.f13164c;
        }

        public com.mp4parser.iso14496.part12.c d() {
            return this.f13163b;
        }

        public a e() {
            List g4 = this.f13162a.g(com.mp4parser.iso14496.part12.c.class);
            List g5 = this.f13162a.g(com.mp4parser.iso14496.part12.b.class);
            this.f13163b = null;
            this.f13164c = null;
            for (int i4 = 0; i4 < g4.size(); i4++) {
                if ((this.f13163b == null && ((com.mp4parser.iso14496.part12.c) g4.get(i4)).v() == null) || "cenc".equals(((com.mp4parser.iso14496.part12.c) g4.get(i4)).v())) {
                    this.f13163b = (com.mp4parser.iso14496.part12.c) g4.get(i4);
                } else {
                    com.mp4parser.iso14496.part12.c cVar = this.f13163b;
                    if (cVar != null && cVar.v() == null && "cenc".equals(((com.mp4parser.iso14496.part12.c) g4.get(i4)).v())) {
                        this.f13163b = (com.mp4parser.iso14496.part12.c) g4.get(i4);
                    } else {
                        throw new RuntimeException("Are there two cenc labeled saiz?");
                    }
                }
                if ((this.f13164c == null && ((com.mp4parser.iso14496.part12.b) g5.get(i4)).v() == null) || "cenc".equals(((com.mp4parser.iso14496.part12.b) g5.get(i4)).v())) {
                    this.f13164c = (com.mp4parser.iso14496.part12.b) g5.get(i4);
                } else {
                    com.mp4parser.iso14496.part12.b bVar = this.f13164c;
                    if (bVar != null && bVar.v() == null && "cenc".equals(((com.mp4parser.iso14496.part12.b) g5.get(i4)).v())) {
                        this.f13164c = (com.mp4parser.iso14496.part12.b) g5.get(i4);
                    } else {
                        throw new RuntimeException("Are there two cenc labeled saio?");
                    }
                }
            }
            return this;
        }
    }

    public b(String str, f1 f1Var, com.coremedia.iso.f... fVarArr) throws IOException {
        super(str, f1Var, fVarArr);
        long j4;
        int i4;
        com.coremedia.iso.boxes.j jVar;
        long j5;
        int i5;
        x0 x0Var = (x0) m.e(f1Var, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schm[0]");
        this.f13159p = new ArrayList();
        long C = f1Var.E().C();
        if (f1Var.getParent().g(com.coremedia.iso.boxes.fragment.a.class).size() > 0) {
            Iterator it2 = ((com.coremedia.iso.boxes.d) f1Var.getParent()).getParent().g(com.coremedia.iso.boxes.fragment.c.class).iterator();
            while (it2.hasNext()) {
                com.coremedia.iso.boxes.fragment.c cVar = (com.coremedia.iso.boxes.fragment.c) it2.next();
                Iterator it3 = cVar.g(k.class).iterator();
                while (it3.hasNext()) {
                    k kVar = (k) it3.next();
                    if (kVar.C().A() == C) {
                        com.mp4parser.iso23001.part7.c cVar2 = (com.mp4parser.iso23001.part7.c) m.e(f1Var, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schi[0]/tenc[0]");
                        this.f13160q = cVar2.x();
                        if (kVar.C().B()) {
                            jVar = ((com.coremedia.iso.boxes.d) f1Var.getParent()).getParent();
                            j5 = kVar.C().v();
                        } else {
                            jVar = cVar;
                            j5 = 0;
                        }
                        a e5 = new a(kVar).e();
                        com.mp4parser.iso14496.part12.b c5 = e5.c();
                        com.mp4parser.iso14496.part12.c d5 = e5.d();
                        long[] x4 = c5.x();
                        List g4 = kVar.g(n.class);
                        long j6 = C;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < x4.length) {
                            int size = ((n) g4.get(i6)).w().size();
                            long j7 = x4[i6];
                            Iterator it4 = it2;
                            long[] jArr = x4;
                            List list = g4;
                            int i8 = i7;
                            long j8 = 0;
                            while (true) {
                                i5 = i7 + size;
                                if (i8 >= i5) {
                                    break;
                                }
                                j8 += d5.A(i8);
                                i8++;
                                cVar = cVar;
                                it3 = it3;
                            }
                            ByteBuffer r4 = jVar.r(j5 + j7, j8);
                            int i9 = i7;
                            while (i9 < i5) {
                                this.f13159p.add(b(cVar2.w(), r4, d5.A(i9)));
                                i9++;
                                i5 = i5;
                                cVar = cVar;
                                it3 = it3;
                            }
                            i6++;
                            x4 = jArr;
                            i7 = i5;
                            g4 = list;
                            it2 = it4;
                        }
                        C = j6;
                    }
                }
            }
            return;
        }
        com.mp4parser.iso23001.part7.c cVar3 = (com.mp4parser.iso23001.part7.c) m.e(f1Var, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schi[0]/tenc[0]");
        this.f13160q = cVar3.x();
        com.coremedia.iso.boxes.f fVar = (com.coremedia.iso.boxes.f) m.e(f1Var, "mdia[0]/minf[0]/stbl[0]/stco[0]");
        long[] v2 = f1Var.D().K().v((fVar == null ? (com.coremedia.iso.boxes.f) m.e(f1Var, "mdia[0]/minf[0]/stbl[0]/co64[0]") : fVar).v().length);
        a e6 = new a((com.coremedia.iso.boxes.j) m.e(f1Var, "mdia[0]/minf[0]/stbl[0]")).e();
        com.mp4parser.iso14496.part12.b bVar = e6.f13164c;
        com.mp4parser.iso14496.part12.c cVar4 = e6.f13163b;
        com.coremedia.iso.boxes.j parent = ((h0) f1Var.getParent()).getParent();
        if (bVar.x().length == 1) {
            long j9 = bVar.x()[0];
            if (cVar4.x() > 0) {
                i4 = (cVar4.y() * cVar4.x()) + 0;
            } else {
                i4 = 0;
                for (int i10 = 0; i10 < cVar4.y(); i10++) {
                    i4 += cVar4.z()[i10];
                }
            }
            ByteBuffer r5 = parent.r(j9, i4);
            for (int i11 = 0; i11 < cVar4.y(); i11++) {
                this.f13159p.add(b(cVar3.w(), r5, cVar4.A(i11)));
            }
        } else if (bVar.x().length == v2.length) {
            int i12 = 0;
            for (int i13 = 0; i13 < v2.length; i13++) {
                long j10 = bVar.x()[i13];
                if (cVar4.x() > 0) {
                    j4 = (cVar4.y() * v2[i13]) + 0;
                } else {
                    j4 = 0;
                    for (int i14 = 0; i14 < v2[i13]; i14++) {
                        j4 += cVar4.A(i12 + i14);
                    }
                }
                ByteBuffer r6 = parent.r(j10, j4);
                for (int i15 = 0; i15 < v2[i13]; i15++) {
                    this.f13159p.add(b(cVar3.w(), r6, cVar4.A(i12 + i15)));
                }
                i12 = (int) (i12 + v2[i13]);
            }
        } else {
            throw new RuntimeException("Number of saio offsets must be either 1 or number of chunks");
        }
    }

    private com.mp4parser.iso23001.part7.a b(int i4, ByteBuffer byteBuffer, long j4) {
        com.mp4parser.iso23001.part7.a aVar = new com.mp4parser.iso23001.part7.a();
        if (j4 > 0) {
            byte[] bArr = new byte[i4];
            aVar.f57254a = bArr;
            byteBuffer.get(bArr);
            if (j4 > i4) {
                aVar.f57255b = new a.k[com.coremedia.iso.g.i(byteBuffer)];
                int i5 = 0;
                while (true) {
                    a.k[] kVarArr = aVar.f57255b;
                    if (i5 >= kVarArr.length) {
                        break;
                    }
                    kVarArr[i5] = aVar.a(com.coremedia.iso.g.i(byteBuffer), com.coremedia.iso.g.l(byteBuffer));
                    i5++;
                }
            }
        }
        return aVar;
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.g
    public boolean F() {
        return false;
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.g
    public UUID L() {
        return this.f13160q;
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.g
    public List<com.mp4parser.iso23001.part7.a> R() {
        return this.f13159p;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public String getName() {
        return "enc(" + super.getName() + ")";
    }

    public String toString() {
        return "CencMp4TrackImpl{handler='" + getHandler() + "'}";
    }
}
