package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.uc.crashsdk.export.LogType;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* compiled from: AudioSpecificConfig.java */
@Descriptor(objectTypeIndication = 64, tags = {5})
/* loaded from: classes3.dex */
public class a extends com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b {
    public static Map<Integer, Integer> W = new HashMap();
    public static Map<Integer, String> X = new HashMap();
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public boolean V;

    /* renamed from: e  reason: collision with root package name */
    byte[] f13879e;

    /* renamed from: f  reason: collision with root package name */
    public C0301a f13880f;

    /* renamed from: g  reason: collision with root package name */
    public int f13881g;

    /* renamed from: h  reason: collision with root package name */
    public int f13882h;

    /* renamed from: i  reason: collision with root package name */
    public int f13883i;

    /* renamed from: j  reason: collision with root package name */
    public int f13884j;

    /* renamed from: k  reason: collision with root package name */
    public int f13885k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f13886l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f13887m;

    /* renamed from: n  reason: collision with root package name */
    public int f13888n;

    /* renamed from: o  reason: collision with root package name */
    public int f13889o;

    /* renamed from: p  reason: collision with root package name */
    public int f13890p;

    /* renamed from: q  reason: collision with root package name */
    public int f13891q;

    /* renamed from: r  reason: collision with root package name */
    public int f13892r;

    /* renamed from: s  reason: collision with root package name */
    public int f13893s;

    /* renamed from: t  reason: collision with root package name */
    public int f13894t;

    /* renamed from: u  reason: collision with root package name */
    public int f13895u;

    /* renamed from: v  reason: collision with root package name */
    public int f13896v;

    /* renamed from: w  reason: collision with root package name */
    public int f13897w;

    /* renamed from: x  reason: collision with root package name */
    public int f13898x;

    /* renamed from: y  reason: collision with root package name */
    public int f13899y;

    /* renamed from: z  reason: collision with root package name */
    public int f13900z;

    /* compiled from: AudioSpecificConfig.java */
    /* renamed from: com.googlecode.mp4parser.boxes.mp4.objectdescriptors.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0301a {

        /* renamed from: i  reason: collision with root package name */
        private static final int f13901i = 0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f13902a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f13903b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f13904c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f13905d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f13906e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f13907f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f13908g;

        public C0301a(int i4, c cVar) {
            int i5;
            this.f13902a = cVar.d();
            this.f13903b = cVar.d();
            this.f13904c = cVar.d();
            this.f13905d = cVar.d();
            boolean d5 = cVar.d();
            this.f13906e = d5;
            if (d5) {
                this.f13907f = cVar.d();
                this.f13908g = cVar.d();
                a(i4, cVar);
            }
            while (cVar.c(4) != 0) {
                int c5 = cVar.c(4);
                if (c5 == 15) {
                    i5 = cVar.c(8);
                    c5 += i5;
                } else {
                    i5 = 0;
                }
                if (i5 == 255) {
                    c5 += cVar.c(16);
                }
                for (int i6 = 0; i6 < c5; i6++) {
                    cVar.c(8);
                }
            }
        }

        public void a(int i4, c cVar) {
            int i5;
            switch (i4) {
                case 1:
                case 2:
                    i5 = 1;
                    break;
                case 3:
                    i5 = 2;
                    break;
                case 4:
                case 5:
                case 6:
                    i5 = 3;
                    break;
                case 7:
                    i5 = 4;
                    break;
                default:
                    i5 = 0;
                    break;
            }
            for (int i6 = 0; i6 < i5; i6++) {
                new b(cVar);
            }
        }
    }

    /* compiled from: AudioSpecificConfig.java */
    /* loaded from: classes3.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f13910a;

        /* renamed from: b  reason: collision with root package name */
        public int f13911b;

        /* renamed from: c  reason: collision with root package name */
        public int f13912c;

        /* renamed from: d  reason: collision with root package name */
        public int f13913d;

        /* renamed from: e  reason: collision with root package name */
        public int f13914e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f13915f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f13916g;

        /* renamed from: h  reason: collision with root package name */
        public int f13917h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f13918i;

        /* renamed from: j  reason: collision with root package name */
        public int f13919j;

        /* renamed from: k  reason: collision with root package name */
        public int f13920k;

        /* renamed from: l  reason: collision with root package name */
        public int f13921l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f13922m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f13923n;

        public b(c cVar) {
            this.f13910a = cVar.d();
            this.f13911b = cVar.c(4);
            this.f13912c = cVar.c(4);
            this.f13913d = cVar.c(3);
            this.f13914e = cVar.c(2);
            this.f13915f = cVar.d();
            this.f13916g = cVar.d();
            if (this.f13915f) {
                this.f13917h = cVar.c(2);
                this.f13918i = cVar.d();
                this.f13919j = cVar.c(2);
            }
            if (this.f13916g) {
                this.f13920k = cVar.c(2);
                this.f13921l = cVar.c(2);
                this.f13922m = cVar.d();
            }
            this.f13923n = cVar.d();
        }
    }

    static {
        W.put(0, 96000);
        W.put(1, 88200);
        W.put(2, 64000);
        W.put(3, 48000);
        W.put(4, 44100);
        W.put(5, Integer.valueOf((int) LogType.UNEXP_KNOWN_REASON));
        W.put(6, 24000);
        W.put(7, 22050);
        W.put(8, 16000);
        W.put(9, 12000);
        W.put(10, 11025);
        W.put(11, 8000);
        X.put(1, "AAC main");
        X.put(2, "AAC LC");
        X.put(3, "AAC SSR");
        X.put(4, "AAC LTP");
        X.put(5, "SBR");
        X.put(6, "AAC Scalable");
        X.put(7, "TwinVQ");
        X.put(8, "CELP");
        X.put(9, "HVXC");
        X.put(10, "(reserved)");
        X.put(11, "(reserved)");
        X.put(12, "TTSI");
        X.put(13, "Main synthetic");
        X.put(14, "Wavetable synthesis");
        X.put(15, "General MIDI");
        X.put(16, "Algorithmic Synthesis and Audio FX");
        X.put(17, "ER AAC LC");
        X.put(18, "(reserved)");
        X.put(19, "ER AAC LTP");
        X.put(20, "ER AAC Scalable");
        X.put(21, "ER TwinVQ");
        X.put(22, "ER BSAC");
        X.put(23, "ER AAC LD");
        X.put(24, "ER CELP");
        X.put(25, "ER HVXC");
        X.put(26, "ER HILN");
        X.put(27, "ER Parametric");
        X.put(28, "SSC");
        X.put(29, "PS");
        X.put(30, "MPEG Surround");
        X.put(31, "(escape)");
        X.put(32, "Layer-1");
        X.put(33, "Layer-2");
        X.put(34, "Layer-3");
        X.put(35, "DST");
        X.put(36, "ALS");
        X.put(37, "SLS");
        X.put(38, "SLS non-core");
        X.put(39, "ER AAC ELD");
        X.put(40, "SMR Simple");
        X.put(41, "SMR Main");
    }

    private int g() {
        return 0;
    }

    private int i(c cVar) throws IOException {
        int c5 = cVar.c(5);
        return c5 == 31 ? cVar.c(6) + 32 : c5;
    }

    private void n(int i4, int i5, int i6, c cVar) throws IOException {
        this.K = cVar.c(1);
        this.L = cVar.c(2);
        int c5 = cVar.c(1);
        this.M = c5;
        if (c5 == 1) {
            this.N = cVar.c(1);
        }
    }

    private void o(int i4, int i5, int i6, c cVar) throws IOException {
        this.f13896v = cVar.c(1);
        int c5 = cVar.c(1);
        this.f13897w = c5;
        if (c5 == 1) {
            this.f13898x = cVar.c(14);
        }
        this.f13899y = cVar.c(1);
        if (i5 != 0) {
            if (i6 == 6 || i6 == 20) {
                this.f13900z = cVar.c(3);
            }
            if (this.f13899y == 1) {
                if (i6 == 22) {
                    this.A = cVar.c(5);
                    this.B = cVar.c(11);
                }
                if (i6 == 17 || i6 == 19 || i6 == 20 || i6 == 23) {
                    this.C = cVar.d();
                    this.D = cVar.d();
                    this.E = cVar.d();
                }
                this.F = cVar.c(1);
            }
            this.G = true;
            return;
        }
        throw new UnsupportedOperationException("can't parse program_config_element yet");
    }

    private void p(int i4, int i5, int i6, c cVar) throws IOException {
        this.O = cVar.c(1);
        this.P = cVar.c(8);
        this.Q = cVar.c(4);
        this.R = cVar.c(12);
        this.S = cVar.c(2);
    }

    private void q(int i4, int i5, int i6, c cVar) throws IOException {
        int c5 = cVar.c(1);
        this.T = c5;
        if (c5 == 1) {
            this.U = cVar.c(2);
        }
    }

    private void r(int i4, int i5, int i6, c cVar) throws IOException {
        int c5 = cVar.c(2);
        this.I = c5;
        if (c5 != 1) {
            n(i4, i5, i6, cVar);
        }
        if (this.I != 0) {
            p(i4, i5, i6, cVar);
        }
        this.J = cVar.c(1);
        this.V = true;
    }

    private void s(int i4, int i5, int i6, c cVar) throws IOException {
        int c5 = cVar.c(1);
        this.H = c5;
        if (c5 == 1) {
            r(i4, i5, i6, cVar);
        } else {
            q(i4, i5, i6, cVar);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.D == aVar.D && this.C == aVar.C && this.E == aVar.E && this.f13881g == aVar.f13881g && this.f13884j == aVar.f13884j && this.f13898x == aVar.f13898x && this.f13897w == aVar.f13897w && this.f13894t == aVar.f13894t && this.f13893s == aVar.f13893s && this.M == aVar.M && this.f13885k == aVar.f13885k && this.f13890p == aVar.f13890p && this.f13899y == aVar.f13899y && this.F == aVar.F && this.f13889o == aVar.f13889o && this.f13888n == aVar.f13888n && this.f13892r == aVar.f13892r && this.f13896v == aVar.f13896v && this.G == aVar.G && this.S == aVar.S && this.T == aVar.T && this.U == aVar.U && this.R == aVar.R && this.P == aVar.P && this.O == aVar.O && this.Q == aVar.Q && this.L == aVar.L && this.K == aVar.K && this.H == aVar.H && this.f13900z == aVar.f13900z && this.B == aVar.B && this.A == aVar.A && this.J == aVar.J && this.I == aVar.I && this.V == aVar.V && this.f13887m == aVar.f13887m && this.f13891q == aVar.f13891q && this.f13883i == aVar.f13883i && this.f13882h == aVar.f13882h && this.f13886l == aVar.f13886l && this.f13895u == aVar.f13895u && this.N == aVar.N && Arrays.equals(this.f13879e, aVar.f13879e);
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public void f(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.f13927b);
        byteBuffer.position(byteBuffer.position() + this.f13927b);
        byte[] bArr = new byte[this.f13927b];
        this.f13879e = bArr;
        slice.get(bArr);
        slice.rewind();
        c cVar = new c(slice);
        this.f13881g = i(cVar);
        int c5 = cVar.c(4);
        this.f13882h = c5;
        if (c5 == 15) {
            this.f13883i = cVar.c(24);
        }
        this.f13884j = cVar.c(4);
        int i4 = this.f13881g;
        if (i4 != 5 && i4 != 29) {
            this.f13885k = 0;
        } else {
            this.f13885k = 5;
            this.f13886l = true;
            if (i4 == 29) {
                this.f13887m = true;
            }
            int c6 = cVar.c(4);
            this.f13888n = c6;
            if (c6 == 15) {
                this.f13889o = cVar.c(24);
            }
            int i5 = i(cVar);
            this.f13881g = i5;
            if (i5 == 22) {
                this.f13890p = cVar.c(4);
            }
        }
        int i6 = this.f13881g;
        switch (i6) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                o(this.f13882h, this.f13884j, i6, cVar);
                break;
            case 8:
                throw new UnsupportedOperationException("can't parse CelpSpecificConfig yet");
            case 9:
                throw new UnsupportedOperationException("can't parse HvxcSpecificConfig yet");
            case 12:
                throw new UnsupportedOperationException("can't parse TTSSpecificConfig yet");
            case 13:
            case 14:
            case 15:
            case 16:
                throw new UnsupportedOperationException("can't parse StructuredAudioSpecificConfig yet");
            case 24:
                throw new UnsupportedOperationException("can't parse ErrorResilientCelpSpecificConfig yet");
            case 25:
                throw new UnsupportedOperationException("can't parse ErrorResilientHvxcSpecificConfig yet");
            case 26:
            case 27:
                s(this.f13882h, this.f13884j, i6, cVar);
                break;
            case 28:
                throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
            case 30:
                this.f13891q = cVar.c(1);
                throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
            case 32:
            case 33:
            case 34:
                throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
            case 35:
                throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
            case 36:
                this.f13892r = cVar.c(5);
                throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
            case 37:
            case 38:
                throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
            case 39:
                this.f13880f = new C0301a(this.f13884j, cVar);
                break;
            case 40:
            case 41:
                throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
        }
        int i7 = this.f13881g;
        if (i7 != 17 && i7 != 39) {
            switch (i7) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    if (this.f13885k != 5 || cVar.e() < 16) {
                        return;
                    }
                    int c7 = cVar.c(11);
                    this.f13895u = c7;
                    if (c7 == 695) {
                        int i8 = i(cVar);
                        this.f13885k = i8;
                        if (i8 == 5) {
                            boolean d5 = cVar.d();
                            this.f13886l = d5;
                            if (d5) {
                                int c8 = cVar.c(4);
                                this.f13888n = c8;
                                if (c8 == 15) {
                                    this.f13889o = cVar.c(24);
                                }
                                if (cVar.e() >= 12) {
                                    int c9 = cVar.c(11);
                                    this.f13895u = c9;
                                    if (c9 == 1352) {
                                        this.f13887m = cVar.d();
                                    }
                                }
                            }
                        }
                        if (this.f13885k == 22) {
                            boolean d6 = cVar.d();
                            this.f13886l = d6;
                            if (d6) {
                                int c10 = cVar.c(4);
                                this.f13888n = c10;
                                if (c10 == 15) {
                                    this.f13889o = cVar.c(24);
                                }
                            }
                            this.f13890p = cVar.c(4);
                            return;
                        }
                        return;
                    }
                    return;
            }
        }
        int c11 = cVar.c(2);
        this.f13893s = c11;
        if (c11 != 2 && c11 != 3) {
            if (c11 == 3) {
                int c12 = cVar.c(1);
                this.f13894t = c12;
                if (c12 == 0) {
                    throw new RuntimeException("not implemented");
                }
            }
            if (this.f13885k != 5) {
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
    }

    public int h() {
        return this.f13881g;
    }

    public int hashCode() {
        byte[] bArr = this.f13879e;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((bArr != null ? Arrays.hashCode(bArr) : 0) * 31) + this.f13881g) * 31) + this.f13882h) * 31) + this.f13883i) * 31) + this.f13884j) * 31) + this.f13885k) * 31) + (this.f13886l ? 1 : 0)) * 31) + (this.f13887m ? 1 : 0)) * 31) + this.f13888n) * 31) + this.f13889o) * 31) + this.f13890p) * 31) + this.f13891q) * 31) + this.f13892r) * 31) + this.f13893s) * 31) + this.f13894t) * 31) + this.f13895u) * 31) + this.f13896v) * 31) + this.f13897w) * 31) + this.f13898x) * 31) + this.f13899y) * 31) + this.f13900z) * 31) + this.A) * 31) + this.B) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + this.F) * 31) + (this.G ? 1 : 0)) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + this.T) * 31) + this.U) * 31) + (this.V ? 1 : 0);
    }

    public int j() {
        return this.f13884j;
    }

    public byte[] k() {
        return this.f13879e;
    }

    public int l() {
        return this.f13885k;
    }

    public int m() {
        int i4 = this.f13882h;
        return i4 == 15 ? this.f13883i : W.get(Integer.valueOf(i4)).intValue();
    }

    public ByteBuffer t() {
        ByteBuffer allocate = ByteBuffer.allocate(u());
        com.coremedia.iso.i.m(allocate, 5);
        com.coremedia.iso.i.m(allocate, u() - 2);
        d dVar = new d(allocate);
        dVar.a(this.f13881g, 5);
        dVar.a(this.f13882h, 4);
        if (this.f13882h != 15) {
            dVar.a(this.f13884j, 4);
            return allocate;
        }
        throw new UnsupportedOperationException("can't serialize that yet");
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioSpecificConfig");
        sb.append("{configBytes=");
        sb.append(com.coremedia.iso.e.b(this.f13879e));
        sb.append(", audioObjectType=");
        sb.append(this.f13881g);
        sb.append(" (");
        sb.append(X.get(Integer.valueOf(this.f13881g)));
        sb.append(")");
        sb.append(", samplingFrequencyIndex=");
        sb.append(this.f13882h);
        sb.append(" (");
        sb.append(W.get(Integer.valueOf(this.f13882h)));
        sb.append(")");
        sb.append(", samplingFrequency=");
        sb.append(this.f13883i);
        sb.append(", channelConfiguration=");
        sb.append(this.f13884j);
        if (this.f13885k > 0) {
            sb.append(", extensionAudioObjectType=");
            sb.append(this.f13885k);
            sb.append(" (");
            sb.append(X.get(Integer.valueOf(this.f13885k)));
            sb.append(")");
            sb.append(", sbrPresentFlag=");
            sb.append(this.f13886l);
            sb.append(", psPresentFlag=");
            sb.append(this.f13887m);
            sb.append(", extensionSamplingFrequencyIndex=");
            sb.append(this.f13888n);
            sb.append(" (");
            sb.append(W.get(Integer.valueOf(this.f13888n)));
            sb.append(")");
            sb.append(", extensionSamplingFrequency=");
            sb.append(this.f13889o);
            sb.append(", extensionChannelConfiguration=");
            sb.append(this.f13890p);
        }
        sb.append(", syncExtensionType=");
        sb.append(this.f13895u);
        if (this.G) {
            sb.append(", frameLengthFlag=");
            sb.append(this.f13896v);
            sb.append(", dependsOnCoreCoder=");
            sb.append(this.f13897w);
            sb.append(", coreCoderDelay=");
            sb.append(this.f13898x);
            sb.append(", extensionFlag=");
            sb.append(this.f13899y);
            sb.append(", layerNr=");
            sb.append(this.f13900z);
            sb.append(", numOfSubFrame=");
            sb.append(this.A);
            sb.append(", layer_length=");
            sb.append(this.B);
            sb.append(", aacSectionDataResilienceFlag=");
            sb.append(this.C);
            sb.append(", aacScalefactorDataResilienceFlag=");
            sb.append(this.D);
            sb.append(", aacSpectralDataResilienceFlag=");
            sb.append(this.E);
            sb.append(", extensionFlag3=");
            sb.append(this.F);
        }
        if (this.V) {
            sb.append(", isBaseLayer=");
            sb.append(this.H);
            sb.append(", paraMode=");
            sb.append(this.I);
            sb.append(", paraExtensionFlag=");
            sb.append(this.J);
            sb.append(", hvxcVarMode=");
            sb.append(this.K);
            sb.append(", hvxcRateMode=");
            sb.append(this.L);
            sb.append(", erHvxcExtensionFlag=");
            sb.append(this.M);
            sb.append(", var_ScalableFlag=");
            sb.append(this.N);
            sb.append(", hilnQuantMode=");
            sb.append(this.O);
            sb.append(", hilnMaxNumLine=");
            sb.append(this.P);
            sb.append(", hilnSampleRateCode=");
            sb.append(this.Q);
            sb.append(", hilnFrameLength=");
            sb.append(this.R);
            sb.append(", hilnContMode=");
            sb.append(this.S);
            sb.append(", hilnEnhaLayer=");
            sb.append(this.T);
            sb.append(", hilnEnhaQuantMode=");
            sb.append(this.U);
        }
        sb.append('}');
        return sb.toString();
    }

    public int u() {
        if (this.f13881g == 2) {
            return g() + 4;
        }
        throw new UnsupportedOperationException("can't serialize that yet");
    }

    public void v(int i4) {
        this.f13881g = i4;
    }

    public void w(int i4) {
        this.f13884j = i4;
    }

    public void x(int i4) {
        this.f13883i = i4;
    }

    public void y(int i4) {
        this.f13882h = i4;
    }
}
