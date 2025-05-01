package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.a1;
import com.coremedia.iso.boxes.i;
import com.coremedia.iso.boxes.r0;
import com.coremedia.iso.boxes.s0;
import com.uc.crashsdk.export.LogType;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import okio.Utf8;
/* compiled from: AC3TrackImpl.java */
/* loaded from: classes3.dex */
public class b extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: j  reason: collision with root package name */
    static int[][][][] f13402j;

    /* renamed from: e  reason: collision with root package name */
    private final com.googlecode.mp4parser.e f13403e;

    /* renamed from: f  reason: collision with root package name */
    private List<com.googlecode.mp4parser.authoring.f> f13404f;

    /* renamed from: g  reason: collision with root package name */
    private long[] f13405g;

    /* renamed from: h  reason: collision with root package name */
    private com.googlecode.mp4parser.authoring.i f13406h;

    /* renamed from: i  reason: collision with root package name */
    private s0 f13407i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AC3TrackImpl.java */
    /* loaded from: classes3.dex */
    public class a implements com.googlecode.mp4parser.authoring.f {

        /* renamed from: a  reason: collision with root package name */
        private final long f13408a;

        /* renamed from: b  reason: collision with root package name */
        private final long f13409b;

        /* renamed from: c  reason: collision with root package name */
        private final com.googlecode.mp4parser.e f13410c;

        public a(long j4, long j5, com.googlecode.mp4parser.e eVar) {
            this.f13408a = j4;
            this.f13409b = j5;
            this.f13410c = eVar;
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public ByteBuffer a() {
            try {
                return this.f13410c.Q(this.f13408a, this.f13409b);
            } catch (IOException e5) {
                throw new RuntimeException(e5);
            }
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public void b(WritableByteChannel writableByteChannel) throws IOException {
            this.f13410c.m(this.f13408a, this.f13409b, writableByteChannel);
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public long getSize() {
            return this.f13409b;
        }
    }

    static {
        int[][][][] iArr = (int[][][][]) Array.newInstance(int.class, 19, 2, 3, 2);
        f13402j = iArr;
        iArr[0][0][0][0] = 32;
        iArr[0][1][0][0] = 32;
        iArr[0][0][0][1] = 64;
        iArr[0][1][0][1] = 64;
        iArr[1][0][0][0] = 40;
        iArr[1][1][0][0] = 40;
        iArr[1][0][0][1] = 80;
        iArr[1][1][0][1] = 80;
        iArr[2][0][0][0] = 48;
        iArr[2][1][0][0] = 48;
        iArr[2][0][0][1] = 96;
        iArr[2][1][0][1] = 96;
        iArr[3][0][0][0] = 56;
        iArr[3][1][0][0] = 56;
        iArr[3][0][0][1] = 112;
        iArr[3][1][0][1] = 112;
        iArr[4][0][0][0] = 64;
        iArr[4][1][0][0] = 64;
        iArr[4][0][0][1] = 128;
        iArr[4][1][0][1] = 128;
        iArr[5][0][0][0] = 80;
        iArr[5][1][0][0] = 80;
        iArr[5][0][0][1] = 160;
        iArr[5][1][0][1] = 160;
        iArr[6][0][0][0] = 96;
        iArr[6][1][0][0] = 96;
        iArr[6][0][0][1] = 192;
        iArr[6][1][0][1] = 192;
        iArr[7][0][0][0] = 112;
        iArr[7][1][0][0] = 112;
        iArr[7][0][0][1] = 224;
        iArr[7][1][0][1] = 224;
        iArr[8][0][0][0] = 128;
        iArr[8][1][0][0] = 128;
        iArr[8][0][0][1] = 256;
        iArr[8][1][0][1] = 256;
        iArr[9][0][0][0] = 160;
        iArr[9][1][0][0] = 160;
        iArr[9][0][0][1] = 320;
        iArr[9][1][0][1] = 320;
        iArr[10][0][0][0] = 192;
        iArr[10][1][0][0] = 192;
        iArr[10][0][0][1] = 384;
        iArr[10][1][0][1] = 384;
        iArr[11][0][0][0] = 224;
        iArr[11][1][0][0] = 224;
        iArr[11][0][0][1] = 448;
        iArr[11][1][0][1] = 448;
        iArr[12][0][0][0] = 256;
        iArr[12][1][0][0] = 256;
        iArr[12][0][0][1] = 512;
        iArr[12][1][0][1] = 512;
        iArr[13][0][0][0] = 320;
        iArr[13][1][0][0] = 320;
        iArr[13][0][0][1] = 640;
        iArr[13][1][0][1] = 640;
        iArr[14][0][0][0] = 384;
        iArr[14][1][0][0] = 384;
        iArr[14][0][0][1] = 768;
        iArr[14][1][0][1] = 768;
        iArr[15][0][0][0] = 448;
        iArr[15][1][0][0] = 448;
        iArr[15][0][0][1] = 896;
        iArr[15][1][0][1] = 896;
        iArr[16][0][0][0] = 512;
        iArr[16][1][0][0] = 512;
        iArr[16][0][0][1] = 1024;
        iArr[16][1][0][1] = 1024;
        iArr[17][0][0][0] = 576;
        iArr[17][1][0][0] = 576;
        iArr[17][0][0][1] = 1152;
        iArr[17][1][0][1] = 1152;
        iArr[18][0][0][0] = 640;
        iArr[18][1][0][0] = 640;
        iArr[18][0][0][1] = 1280;
        iArr[18][1][0][1] = 1280;
        iArr[0][0][1][0] = 32;
        iArr[0][1][1][0] = 32;
        iArr[0][0][1][1] = 69;
        iArr[0][1][1][1] = 70;
        iArr[1][0][1][0] = 40;
        iArr[1][1][1][0] = 40;
        iArr[1][0][1][1] = 87;
        iArr[1][1][1][1] = 88;
        iArr[2][0][1][0] = 48;
        iArr[2][1][1][0] = 48;
        iArr[2][0][1][1] = 104;
        iArr[2][1][1][1] = 105;
        iArr[3][0][1][0] = 56;
        iArr[3][1][1][0] = 56;
        iArr[3][0][1][1] = 121;
        iArr[3][1][1][1] = 122;
        iArr[4][0][1][0] = 64;
        iArr[4][1][1][0] = 64;
        iArr[4][0][1][1] = 139;
        iArr[4][1][1][1] = 140;
        iArr[5][0][1][0] = 80;
        iArr[5][1][1][0] = 80;
        iArr[5][0][1][1] = 174;
        iArr[5][1][1][1] = 175;
        iArr[6][0][1][0] = 96;
        iArr[6][1][1][0] = 96;
        iArr[6][0][1][1] = 208;
        iArr[6][1][1][1] = 209;
        iArr[7][0][1][0] = 112;
        iArr[7][1][1][0] = 112;
        iArr[7][0][1][1] = 243;
        iArr[7][1][1][1] = 244;
        iArr[8][0][1][0] = 128;
        iArr[8][1][1][0] = 128;
        iArr[8][0][1][1] = 278;
        iArr[8][1][1][1] = 279;
        iArr[9][0][1][0] = 160;
        iArr[9][1][1][0] = 160;
        iArr[9][0][1][1] = 348;
        iArr[9][1][1][1] = 349;
        iArr[10][0][1][0] = 192;
        iArr[10][1][1][0] = 192;
        iArr[10][0][1][1] = 417;
        iArr[10][1][1][1] = 418;
        iArr[11][0][1][0] = 224;
        iArr[11][1][1][0] = 224;
        iArr[11][0][1][1] = 487;
        iArr[11][1][1][1] = 488;
        iArr[12][0][1][0] = 256;
        iArr[12][1][1][0] = 256;
        iArr[12][0][1][1] = 557;
        iArr[12][1][1][1] = 558;
        iArr[13][0][1][0] = 320;
        iArr[13][1][1][0] = 320;
        iArr[13][0][1][1] = 696;
        iArr[13][1][1][1] = 697;
        iArr[14][0][1][0] = 384;
        iArr[14][1][1][0] = 384;
        iArr[14][0][1][1] = 835;
        iArr[14][1][1][1] = 836;
        iArr[15][0][1][0] = 448;
        iArr[15][1][1][0] = 448;
        iArr[15][0][1][1] = 975;
        iArr[15][1][1][1] = 975;
        iArr[16][0][1][0] = 512;
        iArr[16][1][1][0] = 512;
        iArr[16][0][1][1] = 1114;
        iArr[16][1][1][1] = 1115;
        iArr[17][0][1][0] = 576;
        iArr[17][1][1][0] = 576;
        iArr[17][0][1][1] = 1253;
        iArr[17][1][1][1] = 1254;
        iArr[18][0][1][0] = 640;
        iArr[18][1][1][0] = 640;
        iArr[18][0][1][1] = 1393;
        iArr[18][1][1][1] = 1394;
        iArr[0][0][2][0] = 32;
        iArr[0][1][2][0] = 32;
        iArr[0][0][2][1] = 96;
        iArr[0][1][2][1] = 96;
        iArr[1][0][2][0] = 40;
        iArr[1][1][2][0] = 40;
        iArr[1][0][2][1] = 120;
        iArr[1][1][2][1] = 120;
        iArr[2][0][2][0] = 48;
        iArr[2][1][2][0] = 48;
        iArr[2][0][2][1] = 144;
        iArr[2][1][2][1] = 144;
        iArr[3][0][2][0] = 56;
        iArr[3][1][2][0] = 56;
        iArr[3][0][2][1] = 168;
        iArr[3][1][2][1] = 168;
        iArr[4][0][2][0] = 64;
        iArr[4][1][2][0] = 64;
        iArr[4][0][2][1] = 192;
        iArr[4][1][2][1] = 192;
        iArr[5][0][2][0] = 80;
        iArr[5][1][2][0] = 80;
        iArr[5][0][2][1] = 240;
        iArr[5][1][2][1] = 240;
        iArr[6][0][2][0] = 96;
        iArr[6][1][2][0] = 96;
        iArr[6][0][2][1] = 288;
        iArr[6][1][2][1] = 288;
        iArr[7][0][2][0] = 112;
        iArr[7][1][2][0] = 112;
        iArr[7][0][2][1] = 336;
        iArr[7][1][2][1] = 336;
        iArr[8][0][2][0] = 128;
        iArr[8][1][2][0] = 128;
        iArr[8][0][2][1] = 384;
        iArr[8][1][2][1] = 384;
        iArr[9][0][2][0] = 160;
        iArr[9][1][2][0] = 160;
        iArr[9][0][2][1] = 480;
        iArr[9][1][2][1] = 480;
        iArr[10][0][2][0] = 192;
        iArr[10][1][2][0] = 192;
        iArr[10][0][2][1] = 576;
        iArr[10][1][2][1] = 576;
        iArr[11][0][2][0] = 224;
        iArr[11][1][2][0] = 224;
        iArr[11][0][2][1] = 672;
        iArr[11][1][2][1] = 672;
        iArr[12][0][2][0] = 256;
        iArr[12][1][2][0] = 256;
        iArr[12][0][2][1] = 768;
        iArr[12][1][2][1] = 768;
        iArr[13][0][2][0] = 320;
        iArr[13][1][2][0] = 320;
        iArr[13][0][2][1] = 960;
        iArr[13][1][2][1] = 960;
        iArr[14][0][2][0] = 384;
        iArr[14][1][2][0] = 384;
        iArr[14][0][2][1] = 1152;
        iArr[14][1][2][1] = 1152;
        iArr[15][0][2][0] = 448;
        iArr[15][1][2][0] = 448;
        iArr[15][0][2][1] = 1344;
        iArr[15][1][2][1] = 1344;
        iArr[16][0][2][0] = 512;
        iArr[16][1][2][0] = 512;
        iArr[16][0][2][1] = 1536;
        iArr[16][1][2][1] = 1536;
        iArr[17][0][2][0] = 576;
        iArr[17][1][2][0] = 576;
        iArr[17][0][2][1] = 1728;
        iArr[17][1][2][1] = 1728;
        iArr[18][0][2][0] = 640;
        iArr[18][1][2][0] = 640;
        iArr[18][0][2][1] = 1920;
        iArr[18][1][2][1] = 1920;
    }

    public b(com.googlecode.mp4parser.e eVar) throws IOException {
        this(eVar, "eng");
    }

    private com.coremedia.iso.boxes.sampleentry.c a() throws IOException {
        int i4;
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(this.f13404f.get(0).a());
        if (cVar.c(16) == 2935) {
            cVar.c(16);
            int c5 = cVar.c(2);
            if (c5 == 0) {
                i4 = 48000;
            } else if (c5 == 1) {
                i4 = 44100;
            } else if (c5 != 2) {
                throw new RuntimeException("Unsupported Sample Rate");
            } else {
                i4 = LogType.UNEXP_KNOWN_REASON;
            }
            int c6 = cVar.c(6);
            int c7 = cVar.c(5);
            int c8 = cVar.c(3);
            int c9 = cVar.c(3);
            if (c7 != 16) {
                if (c7 == 9) {
                    i4 /= 2;
                } else if (c7 != 8 && c7 != 6) {
                    throw new RuntimeException("Unsupported bsid");
                }
                if (c9 != 1 && (c9 & 1) == 1) {
                    cVar.c(2);
                }
                if ((c9 & 4) != 0) {
                    cVar.c(2);
                }
                if (c9 == 2) {
                    cVar.c(2);
                }
                switch (c9) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        int c10 = cVar.c(1);
                        com.coremedia.iso.boxes.sampleentry.c cVar2 = new com.coremedia.iso.boxes.sampleentry.c(com.coremedia.iso.boxes.sampleentry.c.I);
                        cVar2.c0(2);
                        cVar2.h0(i4);
                        cVar2.d(1);
                        cVar2.i0(16);
                        com.googlecode.mp4parser.boxes.a aVar = new com.googlecode.mp4parser.boxes.a();
                        aVar.A(c9);
                        aVar.B(c6 >> 1);
                        aVar.C(c7);
                        aVar.D(c8);
                        aVar.E(c5);
                        aVar.F(c10);
                        aVar.G(0);
                        cVar2.v(aVar);
                        return cVar2;
                    default:
                        throw new RuntimeException("Unsupported acmod");
                }
            }
            throw new RuntimeException("You cannot read E-AC-3 track with AC3TrackImpl.class - user EC3TrackImpl.class");
        }
        throw new RuntimeException("Stream doesn't seem to be AC3");
    }

    private int b(int i4, int i5) {
        int i6 = i4 >>> 1;
        int i7 = i4 & 1;
        if (i6 <= 18 && i7 <= 1 && i5 <= 2) {
            return f13402j[i6][i7][i5][1] * 2;
        }
        throw new RuntimeException("Cannot determine framesize of current sample");
    }

    private List<com.googlecode.mp4parser.authoring.f> d() throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(5);
        ArrayList arrayList = new ArrayList();
        while (-1 != this.f13403e.read(allocate)) {
            long b5 = b(allocate.get(4) & Utf8.REPLACEMENT_BYTE, allocate.get(4) >> 6);
            arrayList.add(new a(this.f13403e.position() - 5, b5, this.f13403e));
            com.googlecode.mp4parser.e eVar = this.f13403e;
            eVar.G((eVar.position() - 5) + b5);
            allocate.rewind();
        }
        long[] jArr = new long[arrayList.size()];
        this.f13405g = jArr;
        Arrays.fill(jArr, 1536L);
        return arrayList;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i M() {
        return this.f13406h;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public synchronized long[] O() {
        return this.f13405g;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<r0.a> U() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13403e.close();
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
        return this.f13407i;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public long[] q() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public a1 s() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> x() {
        return this.f13404f;
    }

    public b(com.googlecode.mp4parser.e eVar, String str) throws IOException {
        super(eVar.toString());
        com.googlecode.mp4parser.authoring.i iVar = new com.googlecode.mp4parser.authoring.i();
        this.f13406h = iVar;
        this.f13403e = eVar;
        iVar.o(str);
        this.f13404f = d();
        this.f13407i = new s0();
        com.coremedia.iso.boxes.sampleentry.c a5 = a();
        this.f13407i.v(a5);
        this.f13406h.l(new Date());
        this.f13406h.r(new Date());
        this.f13406h.o(str);
        this.f13406h.s(a5.T());
        this.f13406h.u(1.0f);
    }
}
