package com.googlecode.mp4parser.authoring.tracks;

import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.coremedia.iso.boxes.s0;
import com.uc.crashsdk.export.LogType;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* compiled from: MP3TrackImpl.java */
/* loaded from: classes3.dex */
public class n extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: m  reason: collision with root package name */
    private static final int f13547m = 3;

    /* renamed from: n  reason: collision with root package name */
    private static final int f13548n = 1;

    /* renamed from: o  reason: collision with root package name */
    private static final int[] f13549o = {44100, 48000, LogType.UNEXP_KNOWN_REASON};

    /* renamed from: p  reason: collision with root package name */
    private static final int[] f13550p = {0, LogType.UNEXP_KNOWN_REASON, 40000, 48000, 56000, 64000, MediationConstant.ErrorCode.ADN_INIT_FAIL, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: q  reason: collision with root package name */
    private static final int f13551q = 1152;

    /* renamed from: r  reason: collision with root package name */
    private static final int f13552r = 107;

    /* renamed from: s  reason: collision with root package name */
    private static final int f13553s = 5;

    /* renamed from: e  reason: collision with root package name */
    private final com.googlecode.mp4parser.e f13554e;

    /* renamed from: f  reason: collision with root package name */
    com.googlecode.mp4parser.authoring.i f13555f;

    /* renamed from: g  reason: collision with root package name */
    s0 f13556g;

    /* renamed from: h  reason: collision with root package name */
    a f13557h;

    /* renamed from: i  reason: collision with root package name */
    long f13558i;

    /* renamed from: j  reason: collision with root package name */
    long f13559j;

    /* renamed from: k  reason: collision with root package name */
    private List<com.googlecode.mp4parser.authoring.f> f13560k;

    /* renamed from: l  reason: collision with root package name */
    private long[] f13561l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MP3TrackImpl.java */
    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        int f13562a;

        /* renamed from: b  reason: collision with root package name */
        int f13563b;

        /* renamed from: c  reason: collision with root package name */
        int f13564c;

        /* renamed from: d  reason: collision with root package name */
        int f13565d;

        /* renamed from: e  reason: collision with root package name */
        int f13566e;

        /* renamed from: f  reason: collision with root package name */
        int f13567f;

        /* renamed from: g  reason: collision with root package name */
        int f13568g;

        /* renamed from: h  reason: collision with root package name */
        int f13569h;

        /* renamed from: i  reason: collision with root package name */
        int f13570i;

        /* renamed from: j  reason: collision with root package name */
        int f13571j;

        a() {
        }

        int a() {
            return ((this.f13566e * 144) / this.f13568g) + this.f13569h;
        }
    }

    public n(com.googlecode.mp4parser.e eVar) throws IOException {
        this(eVar, "eng");
    }

    private a a(com.googlecode.mp4parser.e eVar) throws IOException {
        a aVar = new a();
        ByteBuffer allocate = ByteBuffer.allocate(4);
        while (allocate.position() < 4) {
            if (eVar.read(allocate) == -1) {
                return null;
            }
        }
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c((ByteBuffer) allocate.rewind());
        if (cVar.c(11) == 2047) {
            int c5 = cVar.c(2);
            aVar.f13562a = c5;
            if (c5 == 3) {
                int c6 = cVar.c(2);
                aVar.f13563b = c6;
                if (c6 == 1) {
                    aVar.f13564c = cVar.c(1);
                    int c7 = cVar.c(4);
                    aVar.f13565d = c7;
                    int i4 = f13550p[c7];
                    aVar.f13566e = i4;
                    if (i4 != 0) {
                        int c8 = cVar.c(2);
                        aVar.f13567f = c8;
                        int i5 = f13549o[c8];
                        aVar.f13568g = i5;
                        if (i5 != 0) {
                            aVar.f13569h = cVar.c(1);
                            cVar.c(1);
                            int c9 = cVar.c(2);
                            aVar.f13570i = c9;
                            aVar.f13571j = c9 == 3 ? 1 : 2;
                            return aVar;
                        }
                        throw new IOException("Unexpected (reserved) sample rate frequency");
                    }
                    throw new IOException("Unexpected (free/bad) bit rate");
                }
                throw new IOException("Expected Layer III");
            }
            throw new IOException("Expected MPEG Version 1 (ISO/IEC 11172-3)");
        }
        throw new IOException("Expected Start Word 0x7ff");
    }

    private a b(com.googlecode.mp4parser.e eVar) throws IOException {
        a aVar = null;
        while (true) {
            long position = eVar.position();
            a a5 = a(eVar);
            if (a5 == null) {
                return aVar;
            }
            if (aVar == null) {
                aVar = a5;
            }
            eVar.G(position);
            ByteBuffer allocate = ByteBuffer.allocate(a5.a());
            eVar.read(allocate);
            allocate.rewind();
            this.f13560k.add(new com.googlecode.mp4parser.authoring.g(allocate));
        }
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i M() {
        return this.f13555f;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] O() {
        return this.f13561l;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13554e.close();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return "soun";
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public s0 o() {
        return this.f13556g;
    }

    public String toString() {
        return "MP3TrackImpl";
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> x() {
        return this.f13560k;
    }

    public n(com.googlecode.mp4parser.e eVar, String str) throws IOException {
        super(eVar.toString());
        double d5;
        double d6;
        this.f13555f = new com.googlecode.mp4parser.authoring.i();
        this.f13554e = eVar;
        this.f13560k = new LinkedList();
        a b5 = b(eVar);
        this.f13557h = b5;
        double d7 = b5.f13568g;
        Double.isNaN(d7);
        double d8 = d7 / 1152.0d;
        double size = this.f13560k.size();
        Double.isNaN(size);
        double d9 = size / d8;
        LinkedList linkedList = new LinkedList();
        Iterator<com.googlecode.mp4parser.authoring.f> it2 = this.f13560k.iterator();
        long j4 = 0;
        while (true) {
            int i4 = 0;
            if (!it2.hasNext()) {
                Double.isNaN(j4 * 8);
                this.f13559j = (int) (d5 / d9);
                this.f13556g = new s0();
                com.coremedia.iso.boxes.sampleentry.c cVar = new com.coremedia.iso.boxes.sampleentry.c(com.coremedia.iso.boxes.sampleentry.c.E);
                cVar.c0(this.f13557h.f13571j);
                cVar.h0(this.f13557h.f13568g);
                cVar.d(1);
                cVar.i0(16);
                com.googlecode.mp4parser.boxes.mp4.b bVar = new com.googlecode.mp4parser.boxes.mp4.b();
                com.googlecode.mp4parser.boxes.mp4.objectdescriptors.g gVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.g();
                gVar.x(0);
                com.googlecode.mp4parser.boxes.mp4.objectdescriptors.n nVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.n();
                nVar.j(2);
                gVar.z(nVar);
                com.googlecode.mp4parser.boxes.mp4.objectdescriptors.e eVar2 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.e();
                eVar2.v(107);
                eVar2.w(5);
                eVar2.u(this.f13558i);
                eVar2.s(this.f13559j);
                gVar.v(eVar2);
                bVar.y(gVar.t());
                cVar.v(bVar);
                this.f13556g.v(cVar);
                this.f13555f.l(new Date());
                this.f13555f.r(new Date());
                this.f13555f.o(str);
                this.f13555f.u(1.0f);
                this.f13555f.s(this.f13557h.f13568g);
                long[] jArr = new long[this.f13560k.size()];
                this.f13561l = jArr;
                Arrays.fill(jArr, 1152L);
                return;
            }
            int size2 = (int) it2.next().getSize();
            j4 += size2;
            linkedList.add(Integer.valueOf(size2));
            while (linkedList.size() > d8) {
                linkedList.pop();
            }
            if (linkedList.size() == ((int) d8)) {
                Iterator it3 = linkedList.iterator();
                while (it3.hasNext()) {
                    i4 += ((Integer) it3.next()).intValue();
                }
                double d10 = i4;
                Double.isNaN(d10);
                double size3 = linkedList.size();
                Double.isNaN(size3);
                if (((d10 * 8.0d) / size3) * d8 > this.f13558i) {
                    this.f13558i = (int) d6;
                }
            }
        }
    }
}
