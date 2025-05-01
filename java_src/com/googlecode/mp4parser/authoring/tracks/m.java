package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.a1;
import com.coremedia.iso.boxes.i;
import com.coremedia.iso.boxes.r0;
import com.coremedia.iso.boxes.s0;
import com.googlecode.mp4parser.boxes.e;
import com.uc.crashsdk.export.LogType;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
/* compiled from: EC3TrackImpl.java */
/* loaded from: classes3.dex */
public class m extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: m  reason: collision with root package name */
    private static final long f13521m = 20;

    /* renamed from: e  reason: collision with root package name */
    private final com.googlecode.mp4parser.e f13522e;

    /* renamed from: f  reason: collision with root package name */
    com.googlecode.mp4parser.authoring.i f13523f;

    /* renamed from: g  reason: collision with root package name */
    s0 f13524g;

    /* renamed from: h  reason: collision with root package name */
    private int f13525h;

    /* renamed from: i  reason: collision with root package name */
    private int f13526i;

    /* renamed from: j  reason: collision with root package name */
    private List<b> f13527j;

    /* renamed from: k  reason: collision with root package name */
    private List<com.googlecode.mp4parser.authoring.f> f13528k;

    /* renamed from: l  reason: collision with root package name */
    private long[] f13529l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EC3TrackImpl.java */
    /* loaded from: classes3.dex */
    public class a implements com.googlecode.mp4parser.authoring.f {

        /* renamed from: b  reason: collision with root package name */
        private final /* synthetic */ int f13531b;

        a(int i4) {
            this.f13531b = i4;
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public ByteBuffer a() {
            try {
                return m.this.f13522e.Q(this.f13531b, m.this.f13526i);
            } catch (IOException e5) {
                throw new RuntimeException(e5);
            }
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public void b(WritableByteChannel writableByteChannel) throws IOException {
            m.this.f13522e.m(this.f13531b, m.this.f13526i, writableByteChannel);
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public long getSize() {
            return m.this.f13526i;
        }
    }

    /* compiled from: EC3TrackImpl.java */
    /* loaded from: classes3.dex */
    public static class b extends e.a {

        /* renamed from: j  reason: collision with root package name */
        public int f13532j;

        /* renamed from: k  reason: collision with root package name */
        public int f13533k;

        /* renamed from: l  reason: collision with root package name */
        public int f13534l;

        /* renamed from: m  reason: collision with root package name */
        public int f13535m;

        /* renamed from: n  reason: collision with root package name */
        public int f13536n;

        /* renamed from: o  reason: collision with root package name */
        public int f13537o;

        @Override // com.googlecode.mp4parser.boxes.e.a
        public String toString() {
            return "BitStreamInfo{frameSize=" + this.f13532j + ", substreamid=" + this.f13533k + ", bitrate=" + this.f13534l + ", samplerate=" + this.f13535m + ", strmtyp=" + this.f13536n + ", chanmap=" + this.f13537o + '}';
        }
    }

    public m(com.googlecode.mp4parser.e eVar) throws IOException {
        super(eVar.toString());
        this.f13523f = new com.googlecode.mp4parser.authoring.i();
        this.f13527j = new LinkedList();
        this.f13522e = eVar;
        boolean z4 = false;
        while (!z4) {
            b g4 = g();
            if (g4 != null) {
                for (b bVar : this.f13527j) {
                    if (g4.f13536n != 1 && bVar.f13533k == g4.f13533k) {
                        z4 = true;
                    }
                }
                if (!z4) {
                    this.f13527j.add(g4);
                }
            } else {
                throw new IOException();
            }
        }
        if (this.f13527j.size() != 0) {
            int i4 = this.f13527j.get(0).f13535m;
            this.f13524g = new s0();
            com.coremedia.iso.boxes.sampleentry.c cVar = new com.coremedia.iso.boxes.sampleentry.c(com.coremedia.iso.boxes.sampleentry.c.J);
            cVar.c0(2);
            long j4 = i4;
            cVar.h0(j4);
            cVar.d(1);
            cVar.i0(16);
            com.googlecode.mp4parser.boxes.e eVar2 = new com.googlecode.mp4parser.boxes.e();
            int[] iArr = new int[this.f13527j.size()];
            int[] iArr2 = new int[this.f13527j.size()];
            for (b bVar2 : this.f13527j) {
                if (bVar2.f13536n == 1) {
                    int i5 = bVar2.f13533k;
                    iArr[i5] = iArr[i5] + 1;
                    int i6 = bVar2.f13537o;
                    iArr2[i5] = ((i6 >> 5) & 255) | ((i6 >> 6) & 256);
                }
            }
            for (b bVar3 : this.f13527j) {
                if (bVar3.f13536n != 1) {
                    e.a aVar = new e.a();
                    aVar.f13830a = bVar3.f13830a;
                    aVar.f13831b = bVar3.f13831b;
                    aVar.f13832c = bVar3.f13832c;
                    aVar.f13833d = bVar3.f13833d;
                    aVar.f13834e = bVar3.f13834e;
                    aVar.f13835f = 0;
                    int i7 = bVar3.f13533k;
                    aVar.f13836g = iArr[i7];
                    aVar.f13837h = iArr2[i7];
                    aVar.f13838i = 0;
                    eVar2.s(aVar);
                }
                this.f13525h += bVar3.f13534l;
                this.f13526i += bVar3.f13532j;
            }
            eVar2.x(this.f13525h / 1000);
            cVar.v(eVar2);
            this.f13524g.v(cVar);
            this.f13523f.l(new Date());
            this.f13523f.r(new Date());
            this.f13523f.s(j4);
            this.f13523f.u(1.0f);
            eVar.G(0L);
            List<com.googlecode.mp4parser.authoring.f> d5 = d();
            this.f13528k = d5;
            long[] jArr = new long[d5.size()];
            this.f13529l = jArr;
            Arrays.fill(jArr, 1536L);
            return;
        }
        throw new IOException();
    }

    private List<com.googlecode.mp4parser.authoring.f> d() throws IOException {
        int a5 = com.googlecode.mp4parser.util.c.a((this.f13522e.size() - this.f13522e.position()) / this.f13526i);
        ArrayList arrayList = new ArrayList(a5);
        for (int i4 = 0; i4 < a5; i4++) {
            arrayList.add(new a(this.f13526i * i4));
        }
        return arrayList;
    }

    private b g() throws IOException {
        int c5;
        long position = this.f13522e.position();
        ByteBuffer allocate = ByteBuffer.allocate(200);
        this.f13522e.read(allocate);
        allocate.rewind();
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(allocate);
        if (cVar.c(16) != 2935) {
            return null;
        }
        b bVar = new b();
        bVar.f13536n = cVar.c(2);
        bVar.f13533k = cVar.c(3);
        bVar.f13532j = (cVar.c(11) + 1) * 2;
        int c6 = cVar.c(2);
        bVar.f13830a = c6;
        int i4 = -1;
        if (c6 == 3) {
            i4 = cVar.c(2);
            c5 = 3;
        } else {
            c5 = cVar.c(2);
        }
        int i5 = c5 != 0 ? c5 != 1 ? c5 != 2 ? c5 != 3 ? 0 : 6 : 3 : 2 : 1;
        bVar.f13532j *= 6 / i5;
        bVar.f13833d = cVar.c(3);
        bVar.f13834e = cVar.c(1);
        bVar.f13831b = cVar.c(5);
        cVar.c(5);
        if (1 == cVar.c(1)) {
            cVar.c(8);
        }
        if (bVar.f13833d == 0) {
            cVar.c(5);
            if (1 == cVar.c(1)) {
                cVar.c(8);
            }
        }
        if (1 == bVar.f13536n && 1 == cVar.c(1)) {
            bVar.f13537o = cVar.c(16);
        }
        if (1 == cVar.c(1)) {
            if (bVar.f13833d > 2) {
                cVar.c(2);
            }
            int i6 = bVar.f13833d;
            if (1 == (i6 & 1) && i6 > 2) {
                cVar.c(3);
                cVar.c(3);
            }
            if ((bVar.f13833d & 4) > 0) {
                cVar.c(3);
                cVar.c(3);
            }
            if (1 == bVar.f13834e && 1 == cVar.c(1)) {
                cVar.c(5);
            }
            if (bVar.f13536n == 0) {
                if (1 == cVar.c(1)) {
                    cVar.c(6);
                }
                if (bVar.f13833d == 0 && 1 == cVar.c(1)) {
                    cVar.c(6);
                }
                if (1 == cVar.c(1)) {
                    cVar.c(6);
                }
                int c7 = cVar.c(2);
                if (1 == c7) {
                    cVar.c(5);
                } else if (2 == c7) {
                    cVar.c(12);
                } else if (3 == c7) {
                    int c8 = cVar.c(5);
                    if (1 == cVar.c(1)) {
                        cVar.c(5);
                        if (1 == cVar.c(1)) {
                            cVar.c(4);
                        }
                        if (1 == cVar.c(1)) {
                            cVar.c(4);
                        }
                        if (1 == cVar.c(1)) {
                            cVar.c(4);
                        }
                        if (1 == cVar.c(1)) {
                            cVar.c(4);
                        }
                        if (1 == cVar.c(1)) {
                            cVar.c(4);
                        }
                        if (1 == cVar.c(1)) {
                            cVar.c(4);
                        }
                        if (1 == cVar.c(1)) {
                            cVar.c(4);
                        }
                        if (1 == cVar.c(1)) {
                            if (1 == cVar.c(1)) {
                                cVar.c(4);
                            }
                            if (1 == cVar.c(1)) {
                                cVar.c(4);
                            }
                        }
                    }
                    if (1 == cVar.c(1)) {
                        cVar.c(5);
                        if (1 == cVar.c(1)) {
                            cVar.c(7);
                            if (1 == cVar.c(1)) {
                                cVar.c(8);
                            }
                        }
                    }
                    for (int i7 = 0; i7 < c8 + 2; i7++) {
                        cVar.c(8);
                    }
                    cVar.a();
                }
                if (bVar.f13833d < 2) {
                    if (1 == cVar.c(1)) {
                        cVar.c(14);
                    }
                    if (bVar.f13833d == 0 && 1 == cVar.c(1)) {
                        cVar.c(14);
                    }
                    if (1 == cVar.c(1)) {
                        if (c5 == 0) {
                            cVar.c(5);
                        } else {
                            for (int i8 = 0; i8 < i5; i8++) {
                                if (1 == cVar.c(1)) {
                                    cVar.c(5);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (1 == cVar.c(1)) {
            bVar.f13832c = cVar.c(3);
        }
        int i9 = bVar.f13830a;
        if (i9 == 0) {
            bVar.f13535m = 48000;
        } else if (i9 == 1) {
            bVar.f13535m = 44100;
        } else if (i9 == 2) {
            bVar.f13535m = LogType.UNEXP_KNOWN_REASON;
        } else if (i9 == 3) {
            if (i4 == 0) {
                bVar.f13535m = 24000;
            } else if (i4 == 1) {
                bVar.f13535m = 22050;
            } else if (i4 == 2) {
                bVar.f13535m = 16000;
            } else if (i4 == 3) {
                bVar.f13535m = 0;
            }
        }
        int i10 = bVar.f13535m;
        if (i10 == 0) {
            return null;
        }
        double d5 = i10;
        Double.isNaN(d5);
        int i11 = bVar.f13532j;
        double d6 = i11;
        Double.isNaN(d6);
        bVar.f13534l = (int) ((d5 / 1536.0d) * d6 * 8.0d);
        this.f13522e.G(position + i11);
        return bVar;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i M() {
        return this.f13523f;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] O() {
        return this.f13529l;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<r0.a> U() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13522e.close();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return "soun";
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<i.a> n() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public s0 o() {
        return this.f13524g;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public long[] q() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public a1 s() {
        return null;
    }

    public String toString() {
        return "EC3TrackImpl{bitrate=" + this.f13525h + ", bitStreamInfos=" + this.f13527j + '}';
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> x() {
        return this.f13528k;
    }
}
