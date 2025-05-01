package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.a1;
import com.coremedia.iso.boxes.i;
import com.coremedia.iso.boxes.r0;
import com.coremedia.iso.boxes.s0;
import com.uc.crashsdk.export.LogType;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: AACTrackImpl.java */
/* loaded from: classes3.dex */
public class a extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: o  reason: collision with root package name */
    static Map<Integer, String> f13372o;

    /* renamed from: p  reason: collision with root package name */
    public static Map<Integer, Integer> f13373p;

    /* renamed from: e  reason: collision with root package name */
    com.googlecode.mp4parser.authoring.i f13374e;

    /* renamed from: f  reason: collision with root package name */
    s0 f13375f;

    /* renamed from: g  reason: collision with root package name */
    long[] f13376g;

    /* renamed from: h  reason: collision with root package name */
    b f13377h;

    /* renamed from: i  reason: collision with root package name */
    int f13378i;

    /* renamed from: j  reason: collision with root package name */
    long f13379j;

    /* renamed from: k  reason: collision with root package name */
    long f13380k;

    /* renamed from: l  reason: collision with root package name */
    private com.googlecode.mp4parser.e f13381l;

    /* renamed from: m  reason: collision with root package name */
    private List<com.googlecode.mp4parser.authoring.f> f13382m;

    /* renamed from: n  reason: collision with root package name */
    private String f13383n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AACTrackImpl.java */
    /* renamed from: com.googlecode.mp4parser.authoring.tracks.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0294a implements com.googlecode.mp4parser.authoring.f {

        /* renamed from: b  reason: collision with root package name */
        private final /* synthetic */ long f13385b;

        /* renamed from: c  reason: collision with root package name */
        private final /* synthetic */ long f13386c;

        C0294a(long j4, long j5) {
            this.f13385b = j4;
            this.f13386c = j5;
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public ByteBuffer a() {
            try {
                return a.this.f13381l.Q(this.f13385b, this.f13386c);
            } catch (IOException e5) {
                throw new RuntimeException(e5);
            }
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public void b(WritableByteChannel writableByteChannel) throws IOException {
            a.this.f13381l.m(this.f13385b, this.f13386c, writableByteChannel);
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public long getSize() {
            return this.f13386c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AACTrackImpl.java */
    /* loaded from: classes3.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        int f13387a;

        /* renamed from: b  reason: collision with root package name */
        int f13388b;

        /* renamed from: c  reason: collision with root package name */
        int f13389c;

        /* renamed from: d  reason: collision with root package name */
        int f13390d;

        /* renamed from: e  reason: collision with root package name */
        int f13391e;

        /* renamed from: f  reason: collision with root package name */
        int f13392f;

        /* renamed from: g  reason: collision with root package name */
        int f13393g;

        /* renamed from: h  reason: collision with root package name */
        int f13394h;

        /* renamed from: i  reason: collision with root package name */
        int f13395i;

        /* renamed from: j  reason: collision with root package name */
        int f13396j;

        /* renamed from: k  reason: collision with root package name */
        int f13397k;

        /* renamed from: l  reason: collision with root package name */
        int f13398l;

        /* renamed from: m  reason: collision with root package name */
        int f13399m;

        /* renamed from: n  reason: collision with root package name */
        int f13400n;

        b() {
        }

        int a() {
            return (this.f13390d == 0 ? 2 : 0) + 7;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f13372o = hashMap;
        hashMap.put(1, "AAC Main");
        f13372o.put(2, "AAC LC (Low Complexity)");
        f13372o.put(3, "AAC SSR (Scalable Sample Rate)");
        f13372o.put(4, "AAC LTP (Long Term Prediction)");
        f13372o.put(5, "SBR (Spectral Band Replication)");
        f13372o.put(6, "AAC Scalable");
        f13372o.put(7, "TwinVQ");
        f13372o.put(8, "CELP (Code Excited Linear Prediction)");
        f13372o.put(9, "HXVC (Harmonic Vector eXcitation Coding)");
        f13372o.put(10, "Reserved");
        f13372o.put(11, "Reserved");
        f13372o.put(12, "TTSI (Text-To-Speech Interface)");
        f13372o.put(13, "Main Synthesis");
        f13372o.put(14, "Wavetable Synthesis");
        f13372o.put(15, "General MIDI");
        f13372o.put(16, "Algorithmic Synthesis and Audio Effects");
        f13372o.put(17, "ER (Error Resilient) AAC LC");
        f13372o.put(18, "Reserved");
        f13372o.put(19, "ER AAC LTP");
        f13372o.put(20, "ER AAC Scalable");
        f13372o.put(21, "ER TwinVQ");
        f13372o.put(22, "ER BSAC (Bit-Sliced Arithmetic Coding)");
        f13372o.put(23, "ER AAC LD (Low Delay)");
        f13372o.put(24, "ER CELP");
        f13372o.put(25, "ER HVXC");
        f13372o.put(26, "ER HILN (Harmonic and Individual Lines plus Noise)");
        f13372o.put(27, "ER Parametric");
        f13372o.put(28, "SSC (SinuSoidal Coding)");
        f13372o.put(29, "PS (Parametric Stereo)");
        f13372o.put(30, "MPEG Surround");
        f13372o.put(31, "(Escape value)");
        f13372o.put(32, "Layer-1");
        f13372o.put(33, "Layer-2");
        f13372o.put(34, "Layer-3");
        f13372o.put(35, "DST (Direct Stream Transfer)");
        f13372o.put(36, "ALS (Audio Lossless)");
        f13372o.put(37, "SLS (Scalable LosslesS)");
        f13372o.put(38, "SLS non-core");
        f13372o.put(39, "ER AAC ELD (Enhanced Low Delay)");
        f13372o.put(40, "SMR (Symbolic Music Representation) Simple");
        f13372o.put(41, "SMR Main");
        f13372o.put(42, "USAC (Unified Speech and Audio Coding) (no SBR)");
        f13372o.put(43, "SAOC (Spatial Audio Object Coding)");
        f13372o.put(44, "LD MPEG Surround");
        f13372o.put(45, "USAC");
        HashMap hashMap2 = new HashMap();
        f13373p = hashMap2;
        hashMap2.put(96000, 0);
        f13373p.put(88200, 1);
        f13373p.put(64000, 2);
        f13373p.put(48000, 3);
        f13373p.put(44100, 4);
        f13373p.put(Integer.valueOf((int) LogType.UNEXP_KNOWN_REASON), 5);
        f13373p.put(24000, 6);
        f13373p.put(22050, 7);
        f13373p.put(16000, 8);
        f13373p.put(12000, 9);
        f13373p.put(11025, 10);
        f13373p.put(8000, 11);
        f13373p.put(0, 96000);
        f13373p.put(1, 88200);
        f13373p.put(2, 64000);
        f13373p.put(3, 48000);
        f13373p.put(4, 44100);
        f13373p.put(5, Integer.valueOf((int) LogType.UNEXP_KNOWN_REASON));
        f13373p.put(6, 24000);
        f13373p.put(7, 22050);
        f13373p.put(8, 16000);
        f13373p.put(9, 12000);
        f13373p.put(10, 11025);
        f13373p.put(11, 8000);
    }

    public a(com.googlecode.mp4parser.e eVar) throws IOException {
        this(eVar, "eng");
    }

    private b b(com.googlecode.mp4parser.e eVar) throws IOException {
        b bVar = new b();
        ByteBuffer allocate = ByteBuffer.allocate(7);
        while (allocate.position() < 7) {
            if (eVar.read(allocate) == -1) {
                return null;
            }
        }
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c((ByteBuffer) allocate.rewind());
        if (cVar.c(12) == 4095) {
            bVar.f13388b = cVar.c(1);
            bVar.f13389c = cVar.c(2);
            bVar.f13390d = cVar.c(1);
            bVar.f13391e = cVar.c(2) + 1;
            int c5 = cVar.c(4);
            bVar.f13387a = c5;
            bVar.f13392f = f13373p.get(Integer.valueOf(c5)).intValue();
            cVar.c(1);
            bVar.f13393g = cVar.c(3);
            bVar.f13394h = cVar.c(1);
            bVar.f13395i = cVar.c(1);
            bVar.f13396j = cVar.c(1);
            bVar.f13397k = cVar.c(1);
            bVar.f13398l = cVar.c(13);
            bVar.f13399m = cVar.c(11);
            int c6 = cVar.c(2) + 1;
            bVar.f13400n = c6;
            if (c6 == 1) {
                if (bVar.f13390d == 0) {
                    eVar.read(ByteBuffer.allocate(2));
                }
                return bVar;
            }
            throw new IOException("This muxer can only work with 1 AAC frame per ADTS frame");
        }
        throw new IOException("Expected Start Word 0xfff");
    }

    private b d(com.googlecode.mp4parser.e eVar) throws IOException {
        b bVar = null;
        while (true) {
            b b5 = b(eVar);
            if (b5 == null) {
                return bVar;
            }
            if (bVar == null) {
                bVar = b5;
            }
            this.f13382m.add(new C0294a(eVar.position(), b5.f13398l - b5.a()));
            eVar.G((eVar.position() + b5.f13398l) - b5.a());
        }
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i M() {
        return this.f13374e;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] O() {
        return this.f13376g;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<r0.a> U() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13381l.close();
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
        return this.f13375f;
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
        return "AACTrackImpl{sampleRate=" + this.f13377h.f13392f + ", channelconfig=" + this.f13377h.f13393g + '}';
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> x() {
        return this.f13382m;
    }

    public a(com.googlecode.mp4parser.e eVar, String str) throws IOException {
        super(eVar.toString());
        double d5;
        double d6;
        this.f13374e = new com.googlecode.mp4parser.authoring.i();
        this.f13383n = "eng";
        this.f13383n = str;
        this.f13381l = eVar;
        this.f13382m = new ArrayList();
        b d7 = d(eVar);
        this.f13377h = d7;
        double d8 = d7.f13392f;
        Double.isNaN(d8);
        double d9 = d8 / 1024.0d;
        double size = this.f13382m.size();
        Double.isNaN(size);
        double d10 = size / d9;
        LinkedList linkedList = new LinkedList();
        Iterator<com.googlecode.mp4parser.authoring.f> it2 = this.f13382m.iterator();
        long j4 = 0;
        while (true) {
            int i4 = 0;
            if (!it2.hasNext()) {
                break;
            }
            int size2 = (int) it2.next().getSize();
            j4 += size2;
            linkedList.add(Integer.valueOf(size2));
            while (linkedList.size() > d9) {
                linkedList.pop();
            }
            if (linkedList.size() == ((int) d9)) {
                Iterator it3 = linkedList.iterator();
                while (it3.hasNext()) {
                    i4 += ((Integer) it3.next()).intValue();
                }
                double d11 = i4;
                Double.isNaN(d11);
                double size3 = linkedList.size();
                Double.isNaN(size3);
                if (((d11 * 8.0d) / size3) * d9 > this.f13379j) {
                    this.f13379j = (int) d6;
                }
            }
        }
        Double.isNaN(j4 * 8);
        this.f13380k = (int) (d5 / d10);
        this.f13378i = 1536;
        this.f13375f = new s0();
        com.coremedia.iso.boxes.sampleentry.c cVar = new com.coremedia.iso.boxes.sampleentry.c(com.coremedia.iso.boxes.sampleentry.c.E);
        int i5 = this.f13377h.f13393g;
        if (i5 == 7) {
            cVar.c0(8);
        } else {
            cVar.c0(i5);
        }
        cVar.h0(this.f13377h.f13392f);
        cVar.d(1);
        cVar.i0(16);
        com.googlecode.mp4parser.boxes.mp4.b bVar = new com.googlecode.mp4parser.boxes.mp4.b();
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.g gVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.g();
        gVar.x(0);
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.n nVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.n();
        nVar.j(2);
        gVar.z(nVar);
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.e eVar2 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.e();
        eVar2.v(64);
        eVar2.w(5);
        eVar2.t(this.f13378i);
        eVar2.u(this.f13379j);
        eVar2.s(this.f13380k);
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.a aVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.a();
        aVar.v(2);
        aVar.y(this.f13377h.f13387a);
        aVar.w(this.f13377h.f13393g);
        eVar2.r(aVar);
        gVar.v(eVar2);
        ByteBuffer t4 = gVar.t();
        bVar.B(gVar);
        bVar.y(t4);
        cVar.v(bVar);
        this.f13375f.v(cVar);
        this.f13374e.l(new Date());
        this.f13374e.r(new Date());
        this.f13374e.o(str);
        this.f13374e.u(1.0f);
        this.f13374e.s(this.f13377h.f13392f);
        long[] jArr = new long[this.f13382m.size()];
        this.f13376g = jArr;
        Arrays.fill(jArr, 1024L);
    }
}
