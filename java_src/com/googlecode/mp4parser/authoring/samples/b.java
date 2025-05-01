package com.googlecode.mp4parser.authoring.samples;

import com.coremedia.iso.boxes.d;
import com.coremedia.iso.boxes.f1;
import com.coremedia.iso.boxes.fragment.i;
import com.coremedia.iso.boxes.fragment.k;
import com.coremedia.iso.boxes.fragment.l;
import com.coremedia.iso.boxes.fragment.n;
import com.coremedia.iso.boxes.j;
import com.googlecode.mp4parser.authoring.f;
import com.googlecode.mp4parser.util.c;
import com.googlecode.mp4parser.util.m;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: FragmentedMp4SampleList.java */
/* loaded from: classes3.dex */
public class b extends AbstractList<f> {

    /* renamed from: b  reason: collision with root package name */
    j f13245b;

    /* renamed from: c  reason: collision with root package name */
    com.coremedia.iso.f[] f13246c;

    /* renamed from: d  reason: collision with root package name */
    f1 f13247d;

    /* renamed from: e  reason: collision with root package name */
    i f13248e;

    /* renamed from: f  reason: collision with root package name */
    private SoftReference<f>[] f13249f;

    /* renamed from: g  reason: collision with root package name */
    private List<k> f13250g;

    /* renamed from: i  reason: collision with root package name */
    private int[] f13252i;

    /* renamed from: h  reason: collision with root package name */
    private Map<n, SoftReference<ByteBuffer>> f13251h = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    private int f13253j = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentedMp4SampleList.java */
    /* loaded from: classes3.dex */
    public class a implements f {

        /* renamed from: b  reason: collision with root package name */
        private final /* synthetic */ long f13255b;

        /* renamed from: c  reason: collision with root package name */
        private final /* synthetic */ ByteBuffer f13256c;

        /* renamed from: d  reason: collision with root package name */
        private final /* synthetic */ int f13257d;

        a(long j4, ByteBuffer byteBuffer, int i4) {
            this.f13255b = j4;
            this.f13256c = byteBuffer;
            this.f13257d = i4;
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public ByteBuffer a() {
            return (ByteBuffer) ((ByteBuffer) this.f13256c.position(this.f13257d)).slice().limit(c.a(this.f13255b));
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public void b(WritableByteChannel writableByteChannel) throws IOException {
            writableByteChannel.write(a());
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public long getSize() {
            return this.f13255b;
        }
    }

    public b(long j4, j jVar, com.coremedia.iso.f... fVarArr) {
        this.f13247d = null;
        this.f13248e = null;
        this.f13245b = jVar;
        this.f13246c = fVarArr;
        for (f1 f1Var : m.h(jVar, "moov[0]/trak")) {
            if (f1Var.E().C() == j4) {
                this.f13247d = f1Var;
            }
        }
        if (this.f13247d != null) {
            for (i iVar : m.h(jVar, "moov[0]/mvex[0]/trex")) {
                if (iVar.A() == this.f13247d.E().C()) {
                    this.f13248e = iVar;
                }
            }
            this.f13249f = (SoftReference[]) Array.newInstance(SoftReference.class, size());
            c();
            return;
        }
        throw new RuntimeException("This MP4 does not contain track " + j4);
    }

    private int b(k kVar) {
        List<d> t4 = kVar.t();
        int i4 = 0;
        for (int i5 = 0; i5 < t4.size(); i5++) {
            d dVar = t4.get(i5);
            if (dVar instanceof n) {
                i4 += c.a(((n) dVar).z());
            }
        }
        return i4;
    }

    private List<k> c() {
        List<k> list = this.f13250g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (com.coremedia.iso.boxes.fragment.c cVar : this.f13245b.g(com.coremedia.iso.boxes.fragment.c.class)) {
            for (k kVar : cVar.g(k.class)) {
                if (kVar.C().A() == this.f13247d.E().C()) {
                    arrayList.add(kVar);
                }
            }
        }
        com.coremedia.iso.f[] fVarArr = this.f13246c;
        if (fVarArr != null) {
            for (com.coremedia.iso.f fVar : fVarArr) {
                for (com.coremedia.iso.boxes.fragment.c cVar2 : fVar.g(com.coremedia.iso.boxes.fragment.c.class)) {
                    for (k kVar2 : cVar2.g(k.class)) {
                        if (kVar2.C().A() == this.f13247d.E().C()) {
                            arrayList.add(kVar2);
                        }
                    }
                }
            }
        }
        this.f13250g = arrayList;
        this.f13252i = new int[arrayList.size()];
        int i4 = 1;
        for (int i5 = 0; i5 < this.f13250g.size(); i5++) {
            this.f13252i[i5] = i4;
            i4 += b(this.f13250g.get(i5));
        }
        return arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public f get(int i4) {
        long j4;
        ByteBuffer byteBuffer;
        long z4;
        f fVar;
        SoftReference<f>[] softReferenceArr = this.f13249f;
        if (softReferenceArr[i4] == null || (fVar = softReferenceArr[i4].get()) == null) {
            int i5 = i4 + 1;
            int length = this.f13252i.length;
            while (true) {
                length--;
                if (i5 - this.f13252i[length] >= 0) {
                    break;
                }
            }
            k kVar = this.f13250g.get(length);
            int i6 = i5 - this.f13252i[length];
            com.coremedia.iso.boxes.fragment.c cVar = (com.coremedia.iso.boxes.fragment.c) kVar.getParent();
            int i7 = 0;
            for (d dVar : kVar.t()) {
                if (dVar instanceof n) {
                    n nVar = (n) dVar;
                    int i8 = i6 - i7;
                    if (nVar.w().size() < i8) {
                        i7 += nVar.w().size();
                    } else {
                        List<n.a> w4 = nVar.w();
                        l C = kVar.C();
                        boolean F = nVar.F();
                        boolean E = C.E();
                        long j5 = 0;
                        if (F) {
                            j4 = 0;
                        } else {
                            if (E) {
                                z4 = C.y();
                            } else {
                                i iVar = this.f13248e;
                                if (iVar != null) {
                                    z4 = iVar.z();
                                } else {
                                    throw new RuntimeException("File doesn't contain trex box but track fragments aren't fully self contained. Cannot determine sample size.");
                                }
                            }
                            j4 = z4;
                        }
                        SoftReference<ByteBuffer> softReference = this.f13251h.get(nVar);
                        ByteBuffer byteBuffer2 = softReference != null ? softReference.get() : null;
                        if (byteBuffer2 == null) {
                            j jVar = cVar;
                            if (C.B()) {
                                j5 = 0 + C.v();
                                jVar = cVar.getParent();
                            }
                            if (nVar.A()) {
                                j5 += nVar.v();
                            }
                            int i9 = 0;
                            for (n.a aVar : w4) {
                                i9 = F ? (int) (i9 + aVar.l()) : (int) (i9 + j4);
                            }
                            try {
                                ByteBuffer r4 = jVar.r(j5, i9);
                                this.f13251h.put(nVar, new SoftReference<>(r4));
                                byteBuffer = r4;
                            } catch (IOException e5) {
                                throw new RuntimeException(e5);
                            }
                        } else {
                            byteBuffer = byteBuffer2;
                        }
                        int i10 = 0;
                        for (int i11 = 0; i11 < i8; i11++) {
                            i10 = (int) (F ? i10 + w4.get(i11).l() : i10 + j4);
                        }
                        a aVar2 = new a(F ? w4.get(i8).l() : j4, byteBuffer, i10);
                        this.f13249f[i4] = new SoftReference<>(aVar2);
                        return aVar2;
                    }
                }
            }
            throw new RuntimeException("Couldn't find sample in the traf I was looking");
        }
        return fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        int i4 = this.f13253j;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (com.coremedia.iso.boxes.fragment.c cVar : this.f13245b.g(com.coremedia.iso.boxes.fragment.c.class)) {
            for (k kVar : cVar.g(k.class)) {
                if (kVar.C().A() == this.f13247d.E().C()) {
                    i5 = (int) (i5 + ((n) kVar.g(n.class).get(0)).z());
                }
            }
        }
        for (com.coremedia.iso.f fVar : this.f13246c) {
            for (com.coremedia.iso.boxes.fragment.c cVar2 : fVar.g(com.coremedia.iso.boxes.fragment.c.class)) {
                for (k kVar2 : cVar2.g(k.class)) {
                    if (kVar2.C().A() == this.f13247d.E().C()) {
                        i5 = (int) (i5 + ((n) kVar2.g(n.class).get(0)).z());
                    }
                }
            }
        }
        this.f13253j = i5;
        return i5;
    }
}
