package com.wufan.user.service.protobuf;

import com.android.dx.io.Opcodes;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.wufan.user.service.protobuf.d;
import com.wufan.user.service.protobuf.h;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* compiled from: UserInfo.java */
/* loaded from: classes6.dex */
public final class n0 extends GeneratedMessageLite<n0, b> implements o0 {
    public static final int A1 = 23;
    public static final int B1 = 24;
    public static final int C1 = 25;
    public static final int D1 = 26;
    public static final int E1 = 27;
    public static final int F1 = 28;
    public static final int G = 1;
    public static final int G1 = 30;
    public static final int H = 2;
    private static final n0 H1;
    public static final int I = 29;
    private static volatile Parser<n0> I1 = null;
    public static final int J = 3;
    public static final int K = 4;
    public static final int L = 5;
    public static final int M = 6;
    public static final int N = 7;
    public static final int O = 8;
    public static final int P = 9;
    public static final int Q = 10;
    public static final int R = 11;
    public static final int S = 12;
    public static final int T = 13;
    public static final int U = 14;
    public static final int V = 15;
    public static final int W = 16;
    public static final int X = 17;
    public static final int Y = 18;
    public static final int Z = 19;

    /* renamed from: p0  reason: collision with root package name */
    public static final int f65472p0 = 20;

    /* renamed from: p1  reason: collision with root package name */
    public static final int f65473p1 = 21;

    /* renamed from: v1  reason: collision with root package name */
    public static final int f65474v1 = 22;
    private int A;
    private int B;
    private long F;

    /* renamed from: b  reason: collision with root package name */
    private int f65475b;

    /* renamed from: c  reason: collision with root package name */
    private int f65476c;

    /* renamed from: f  reason: collision with root package name */
    private int f65479f;

    /* renamed from: g  reason: collision with root package name */
    private long f65480g;

    /* renamed from: h  reason: collision with root package name */
    private long f65481h;

    /* renamed from: j  reason: collision with root package name */
    private int f65483j;

    /* renamed from: k  reason: collision with root package name */
    private int f65484k;

    /* renamed from: l  reason: collision with root package name */
    private int f65485l;

    /* renamed from: n  reason: collision with root package name */
    private int f65487n;

    /* renamed from: p  reason: collision with root package name */
    private int f65489p;

    /* renamed from: q  reason: collision with root package name */
    private int f65490q;

    /* renamed from: r  reason: collision with root package name */
    private int f65491r;

    /* renamed from: s  reason: collision with root package name */
    private long f65492s;

    /* renamed from: t  reason: collision with root package name */
    private int f65493t;

    /* renamed from: u  reason: collision with root package name */
    private int f65494u;

    /* renamed from: v  reason: collision with root package name */
    private h f65495v;

    /* renamed from: w  reason: collision with root package name */
    private int f65496w;

    /* renamed from: y  reason: collision with root package name */
    private int f65498y;

    /* renamed from: z  reason: collision with root package name */
    private int f65499z;

    /* renamed from: d  reason: collision with root package name */
    private String f65477d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f65478e = "";

    /* renamed from: i  reason: collision with root package name */
    private String f65482i = "";

    /* renamed from: m  reason: collision with root package name */
    private String f65486m = "";

    /* renamed from: o  reason: collision with root package name */
    private String f65488o = "";

    /* renamed from: x  reason: collision with root package name */
    private String f65497x = "";
    private String C = "";
    private String D = "";
    private Internal.ProtobufList<d> E = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: UserInfo.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65500a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65500a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65500a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65500a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65500a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65500a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65500a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65500a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65500a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: UserInfo.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<n0, b> implements o0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A3() {
            copyOnWrite();
            ((n0) this.instance).X4();
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public ByteString B() {
            return ((n0) this.instance).B();
        }

        public b B3() {
            copyOnWrite();
            ((n0) this.instance).Y4();
            return this;
        }

        public b C3() {
            copyOnWrite();
            ((n0) this.instance).Z4();
            return this;
        }

        public b D3(h hVar) {
            copyOnWrite();
            ((n0) this.instance).e5(hVar);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public int E0() {
            return ((n0) this.instance).E0();
        }

        @Override // com.wufan.user.service.protobuf.o0
        public int E1() {
            return ((n0) this.instance).E1();
        }

        public b E3(int i4) {
            copyOnWrite();
            ((n0) this.instance).r5(i4);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public h F2() {
            return ((n0) this.instance).F2();
        }

        public b F3(String str) {
            copyOnWrite();
            ((n0) this.instance).s5(str);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public String G() {
            return ((n0) this.instance).G();
        }

        public b G3(ByteString byteString) {
            copyOnWrite();
            ((n0) this.instance).t5(byteString);
            return this;
        }

        public b H3(int i4) {
            copyOnWrite();
            ((n0) this.instance).u5(i4);
            return this;
        }

        public b I3(String str) {
            copyOnWrite();
            ((n0) this.instance).v5(str);
            return this;
        }

        public b J3(ByteString byteString) {
            copyOnWrite();
            ((n0) this.instance).w5(byteString);
            return this;
        }

        public b K3(String str) {
            copyOnWrite();
            ((n0) this.instance).x5(str);
            return this;
        }

        public b L3(ByteString byteString) {
            copyOnWrite();
            ((n0) this.instance).y5(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public int M() {
            return ((n0) this.instance).M();
        }

        public b M3(int i4) {
            copyOnWrite();
            ((n0) this.instance).z5(i4);
            return this;
        }

        public b N3(int i4, d.b bVar) {
            copyOnWrite();
            ((n0) this.instance).A5(i4, bVar);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public long O1() {
            return ((n0) this.instance).O1();
        }

        @Override // com.wufan.user.service.protobuf.o0
        public int O2() {
            return ((n0) this.instance).O2();
        }

        public b O3(int i4, d dVar) {
            copyOnWrite();
            ((n0) this.instance).B5(i4, dVar);
            return this;
        }

        public b P3(int i4) {
            copyOnWrite();
            ((n0) this.instance).C5(i4);
            return this;
        }

        public b Q3(int i4) {
            copyOnWrite();
            ((n0) this.instance).D5(i4);
            return this;
        }

        public b R3(int i4) {
            copyOnWrite();
            ((n0) this.instance).E5(i4);
            return this;
        }

        public b S3(int i4) {
            copyOnWrite();
            ((n0) this.instance).F5(i4);
            return this;
        }

        public b T3(int i4) {
            copyOnWrite();
            ((n0) this.instance).G5(i4);
            return this;
        }

        public b U3(int i4) {
            copyOnWrite();
            ((n0) this.instance).H5(i4);
            return this;
        }

        public b V2(int i4, d.b bVar) {
            copyOnWrite();
            ((n0) this.instance).w4(i4, bVar);
            return this;
        }

        public b V3(int i4) {
            copyOnWrite();
            ((n0) this.instance).I5(i4);
            return this;
        }

        public b W2(int i4, d dVar) {
            copyOnWrite();
            ((n0) this.instance).x4(i4, dVar);
            return this;
        }

        public b W3(int i4) {
            copyOnWrite();
            ((n0) this.instance).J5(i4);
            return this;
        }

        public b X0(Iterable<? extends d> iterable) {
            copyOnWrite();
            ((n0) this.instance).v4(iterable);
            return this;
        }

        public b X2(d.b bVar) {
            copyOnWrite();
            ((n0) this.instance).y4(bVar);
            return this;
        }

        public b X3(long j4) {
            copyOnWrite();
            ((n0) this.instance).K5(j4);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public int Y0() {
            return ((n0) this.instance).Y0();
        }

        public b Y2(d dVar) {
            copyOnWrite();
            ((n0) this.instance).z4(dVar);
            return this;
        }

        public b Y3(h.b bVar) {
            copyOnWrite();
            ((n0) this.instance).L5(bVar);
            return this;
        }

        public b Z2() {
            copyOnWrite();
            ((n0) this.instance).clearAccount();
            return this;
        }

        public b Z3(h hVar) {
            copyOnWrite();
            ((n0) this.instance).M5(hVar);
            return this;
        }

        public b a3() {
            copyOnWrite();
            ((n0) this.instance).A4();
            return this;
        }

        public b a4(String str) {
            copyOnWrite();
            ((n0) this.instance).N5(str);
            return this;
        }

        public b b3() {
            copyOnWrite();
            ((n0) this.instance).B4();
            return this;
        }

        public b b4(ByteString byteString) {
            copyOnWrite();
            ((n0) this.instance).O5(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public int c0() {
            return ((n0) this.instance).c0();
        }

        public b c3() {
            copyOnWrite();
            ((n0) this.instance).C4();
            return this;
        }

        public b c4(String str) {
            copyOnWrite();
            ((n0) this.instance).setNickname(str);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public String d0() {
            return ((n0) this.instance).d0();
        }

        public b d3() {
            copyOnWrite();
            ((n0) this.instance).D4();
            return this;
        }

        public b d4(ByteString byteString) {
            copyOnWrite();
            ((n0) this.instance).setNicknameBytes(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public ByteString e0() {
            return ((n0) this.instance).e0();
        }

        public b e3() {
            copyOnWrite();
            ((n0) this.instance).E4();
            return this;
        }

        public b e4(long j4) {
            copyOnWrite();
            ((n0) this.instance).P5(j4);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public List<d> f0() {
            return Collections.unmodifiableList(((n0) this.instance).f0());
        }

        @Override // com.wufan.user.service.protobuf.o0
        public ByteString f2() {
            return ((n0) this.instance).f2();
        }

        public b f3() {
            copyOnWrite();
            ((n0) this.instance).F4();
            return this;
        }

        public b f4(String str) {
            copyOnWrite();
            ((n0) this.instance).Q5(str);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public int g0() {
            return ((n0) this.instance).g0();
        }

        public b g3() {
            copyOnWrite();
            ((n0) this.instance).G4();
            return this;
        }

        public b g4(ByteString byteString) {
            copyOnWrite();
            ((n0) this.instance).R5(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public String getAccount() {
            return ((n0) this.instance).getAccount();
        }

        @Override // com.wufan.user.service.protobuf.o0
        public String getNickname() {
            return ((n0) this.instance).getNickname();
        }

        @Override // com.wufan.user.service.protobuf.o0
        public ByteString getNicknameBytes() {
            return ((n0) this.instance).getNicknameBytes();
        }

        @Override // com.wufan.user.service.protobuf.o0
        public String getToken() {
            return ((n0) this.instance).getToken();
        }

        @Override // com.wufan.user.service.protobuf.o0
        public ByteString getTokenBytes() {
            return ((n0) this.instance).getTokenBytes();
        }

        @Override // com.wufan.user.service.protobuf.o0
        public int getUid() {
            return ((n0) this.instance).getUid();
        }

        @Override // com.wufan.user.service.protobuf.o0
        public ByteString h() {
            return ((n0) this.instance).h();
        }

        @Override // com.wufan.user.service.protobuf.o0
        public long h0() {
            return ((n0) this.instance).h0();
        }

        public b h3() {
            copyOnWrite();
            ((n0) this.instance).H4();
            return this;
        }

        public b h4(int i4) {
            copyOnWrite();
            ((n0) this.instance).S5(i4);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public int i() {
            return ((n0) this.instance).i();
        }

        public b i3() {
            copyOnWrite();
            ((n0) this.instance).I4();
            return this;
        }

        public b i4(long j4) {
            copyOnWrite();
            ((n0) this.instance).T5(j4);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public int j1() {
            return ((n0) this.instance).j1();
        }

        public b j3() {
            copyOnWrite();
            ((n0) this.instance).J4();
            return this;
        }

        public b j4(int i4) {
            copyOnWrite();
            ((n0) this.instance).U5(i4);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public String k1() {
            return ((n0) this.instance).k1();
        }

        @Override // com.wufan.user.service.protobuf.o0
        public int k2() {
            return ((n0) this.instance).k2();
        }

        public b k3() {
            copyOnWrite();
            ((n0) this.instance).K4();
            return this;
        }

        public b k4(String str) {
            copyOnWrite();
            ((n0) this.instance).V5(str);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public int l2() {
            return ((n0) this.instance).l2();
        }

        public b l3() {
            copyOnWrite();
            ((n0) this.instance).L4();
            return this;
        }

        public b l4(ByteString byteString) {
            copyOnWrite();
            ((n0) this.instance).W5(byteString);
            return this;
        }

        public b m3() {
            copyOnWrite();
            ((n0) this.instance).M4();
            return this;
        }

        public b m4(int i4) {
            copyOnWrite();
            ((n0) this.instance).X5(i4);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public int n2() {
            return ((n0) this.instance).n2();
        }

        public b n3() {
            copyOnWrite();
            ((n0) this.instance).N4();
            return this;
        }

        public b n4(String str) {
            copyOnWrite();
            ((n0) this.instance).setToken(str);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public d o0(int i4) {
            return ((n0) this.instance).o0(i4);
        }

        public b o3() {
            copyOnWrite();
            ((n0) this.instance).O4();
            return this;
        }

        public b o4(ByteString byteString) {
            copyOnWrite();
            ((n0) this.instance).setTokenBytes(byteString);
            return this;
        }

        public b p3() {
            copyOnWrite();
            ((n0) this.instance).P4();
            return this;
        }

        public b p4(int i4) {
            copyOnWrite();
            ((n0) this.instance).setUid(i4);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public long q2() {
            return ((n0) this.instance).q2();
        }

        public b q3() {
            copyOnWrite();
            ((n0) this.instance).clearNickname();
            return this;
        }

        public b q4(long j4) {
            copyOnWrite();
            ((n0) this.instance).Y5(j4);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public boolean r2() {
            return ((n0) this.instance).r2();
        }

        public b r3() {
            copyOnWrite();
            ((n0) this.instance).Q4();
            return this;
        }

        public b r4(int i4) {
            copyOnWrite();
            ((n0) this.instance).Z5(i4);
            return this;
        }

        public b s3() {
            copyOnWrite();
            ((n0) this.instance).R4();
            return this;
        }

        public b s4(int i4) {
            copyOnWrite();
            ((n0) this.instance).a6(i4);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public int t2() {
            return ((n0) this.instance).t2();
        }

        public b t3() {
            copyOnWrite();
            ((n0) this.instance).S4();
            return this;
        }

        public b u3() {
            copyOnWrite();
            ((n0) this.instance).T4();
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public int v1() {
            return ((n0) this.instance).v1();
        }

        public b v3() {
            copyOnWrite();
            ((n0) this.instance).U4();
            return this;
        }

        public b w3() {
            copyOnWrite();
            ((n0) this.instance).V4();
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public ByteString x() {
            return ((n0) this.instance).x();
        }

        @Override // com.wufan.user.service.protobuf.o0
        public int x2() {
            return ((n0) this.instance).x2();
        }

        public b x3() {
            copyOnWrite();
            ((n0) this.instance).W4();
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public long y() {
            return ((n0) this.instance).y();
        }

        @Override // com.wufan.user.service.protobuf.o0
        public String y0() {
            return ((n0) this.instance).y0();
        }

        public b y3() {
            copyOnWrite();
            ((n0) this.instance).clearToken();
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o0
        public String z() {
            return ((n0) this.instance).z();
        }

        @Override // com.wufan.user.service.protobuf.o0
        public int z0() {
            return ((n0) this.instance).z0();
        }

        @Override // com.wufan.user.service.protobuf.o0
        public ByteString z1() {
            return ((n0) this.instance).z1();
        }

        public b z3() {
            copyOnWrite();
            ((n0) this.instance).clearUid();
            return this;
        }

        private b() {
            super(n0.H1);
        }
    }

    static {
        n0 n0Var = new n0();
        H1 = n0Var;
        n0Var.makeImmutable();
    }

    private n0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A4() {
        this.f65489p = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A5(int i4, d.b bVar) {
        a5();
        this.E.set(i4, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B4() {
        this.f65488o = b5().k1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B5(int i4, d dVar) {
        Objects.requireNonNull(dVar);
        a5();
        this.E.set(i4, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C4() {
        this.f65482i = b5().d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C5(int i4) {
        this.f65483j = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D4() {
        this.f65485l = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D5(int i4) {
        this.f65494u = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E4() {
        this.E = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E5(int i4) {
        this.A = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F4() {
        this.f65483j = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F5(int i4) {
        this.f65498y = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G4() {
        this.f65494u = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G5(int i4) {
        this.f65499z = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H4() {
        this.A = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H5(int i4) {
        this.f65496w = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I4() {
        this.f65498y = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I5(int i4) {
        this.f65484k = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J4() {
        this.f65499z = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J5(int i4) {
        this.f65493t = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K4() {
        this.f65496w = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K5(long j4) {
        this.F = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L4() {
        this.f65484k = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L5(h.b bVar) {
        this.f65495v = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M4() {
        this.f65493t = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M5(h hVar) {
        Objects.requireNonNull(hVar);
        this.f65495v = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N4() {
        this.F = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N5(String str) {
        Objects.requireNonNull(str);
        this.f65486m = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O4() {
        this.f65495v = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O5(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65486m = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P4() {
        this.f65486m = b5().z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P5(long j4) {
        this.f65480g = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q4() {
        this.f65480g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q5(String str) {
        Objects.requireNonNull(str);
        this.f65497x = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R4() {
        this.f65497x = b5().y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R5(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65497x = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S4() {
        this.f65479f = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S5(int i4) {
        this.f65479f = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T4() {
        this.f65481h = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T5(long j4) {
        this.f65481h = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U4() {
        this.f65491r = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U5(int i4) {
        this.f65491r = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V4() {
        this.D = b5().G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V5(String str) {
        Objects.requireNonNull(str);
        this.D = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W4() {
        this.f65487n = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W5(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.D = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X4() {
        this.f65492s = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X5(int i4) {
        this.f65487n = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y4() {
        this.B = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y5(long j4) {
        this.f65492s = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z4() {
        this.f65490q = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z5(int i4) {
        this.B = i4;
    }

    private void a5() {
        if (this.E.isModifiable()) {
            return;
        }
        this.E = GeneratedMessageLite.mutableCopy(this.E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a6(int i4) {
        this.f65490q = i4;
    }

    public static n0 b5() {
        return H1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccount() {
        this.f65477d = b5().getAccount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNickname() {
        this.f65478e = b5().getNickname();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToken() {
        this.C = b5().getToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUid() {
        this.f65476c = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e5(h hVar) {
        h hVar2 = this.f65495v;
        if (hVar2 != null && hVar2 != h.f3()) {
            this.f65495v = h.h3(this.f65495v).mergeFrom((h.b) hVar).buildPartial();
        } else {
            this.f65495v = hVar;
        }
    }

    public static b f5() {
        return H1.toBuilder();
    }

    public static b g5(n0 n0Var) {
        return H1.toBuilder().mergeFrom((b) n0Var);
    }

    public static n0 h5(InputStream inputStream) throws IOException {
        return (n0) GeneratedMessageLite.parseDelimitedFrom(H1, inputStream);
    }

    public static n0 i5(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (n0) GeneratedMessageLite.parseDelimitedFrom(H1, inputStream, extensionRegistryLite);
    }

    public static n0 j5(ByteString byteString) throws InvalidProtocolBufferException {
        return (n0) GeneratedMessageLite.parseFrom(H1, byteString);
    }

    public static n0 k5(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (n0) GeneratedMessageLite.parseFrom(H1, byteString, extensionRegistryLite);
    }

    public static n0 l5(CodedInputStream codedInputStream) throws IOException {
        return (n0) GeneratedMessageLite.parseFrom(H1, codedInputStream);
    }

    public static n0 m5(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (n0) GeneratedMessageLite.parseFrom(H1, codedInputStream, extensionRegistryLite);
    }

    public static n0 n5(InputStream inputStream) throws IOException {
        return (n0) GeneratedMessageLite.parseFrom(H1, inputStream);
    }

    public static n0 o5(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (n0) GeneratedMessageLite.parseFrom(H1, inputStream, extensionRegistryLite);
    }

    public static n0 p5(byte[] bArr) throws InvalidProtocolBufferException {
        return (n0) GeneratedMessageLite.parseFrom(H1, bArr);
    }

    public static Parser<n0> parser() {
        return H1.getParserForType();
    }

    public static n0 q5(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (n0) GeneratedMessageLite.parseFrom(H1, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r5(int i4) {
        a5();
        this.E.remove(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s5(String str) {
        Objects.requireNonNull(str);
        this.f65477d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNickname(String str) {
        Objects.requireNonNull(str);
        this.f65478e = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNicknameBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65478e = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToken(String str) {
        Objects.requireNonNull(str);
        this.C = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTokenBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.C = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUid(int i4) {
        this.f65476c = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t5(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65477d = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u5(int i4) {
        this.f65489p = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v4(Iterable<? extends d> iterable) {
        a5();
        AbstractMessageLite.addAll(iterable, this.E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v5(String str) {
        Objects.requireNonNull(str);
        this.f65488o = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w4(int i4, d.b bVar) {
        a5();
        this.E.add(i4, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w5(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65488o = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x4(int i4, d dVar) {
        Objects.requireNonNull(dVar);
        a5();
        this.E.add(i4, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x5(String str) {
        Objects.requireNonNull(str);
        this.f65482i = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y4(d.b bVar) {
        a5();
        this.E.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y5(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65482i = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z4(d dVar) {
        Objects.requireNonNull(dVar);
        a5();
        this.E.add(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z5(int i4) {
        this.f65485l = i4;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public ByteString B() {
        return ByteString.copyFromUtf8(this.D);
    }

    @Override // com.wufan.user.service.protobuf.o0
    public int E0() {
        return this.f65496w;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public int E1() {
        return this.f65499z;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public h F2() {
        h hVar = this.f65495v;
        return hVar == null ? h.f3() : hVar;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public String G() {
        return this.D;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public int M() {
        return this.f65490q;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public long O1() {
        return this.f65480g;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public int O2() {
        return this.f65494u;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public int Y0() {
        return this.f65485l;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public int c0() {
        return this.E.size();
    }

    public e c5(int i4) {
        return this.E.get(i4);
    }

    @Override // com.wufan.user.service.protobuf.o0
    public String d0() {
        return this.f65482i;
    }

    public List<? extends e> d5() {
        return this.E;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z4 = false;
        switch (a.f65500a[methodToInvoke.ordinal()]) {
            case 1:
                return new n0();
            case 2:
                return H1;
            case 3:
                this.E.makeImmutable();
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                n0 n0Var = (n0) obj2;
                int i4 = this.f65476c;
                boolean z5 = i4 != 0;
                int i5 = n0Var.f65476c;
                this.f65476c = visitor.visitInt(z5, i4, i5 != 0, i5);
                this.f65477d = visitor.visitString(!this.f65477d.isEmpty(), this.f65477d, !n0Var.f65477d.isEmpty(), n0Var.f65477d);
                this.f65478e = visitor.visitString(!this.f65478e.isEmpty(), this.f65478e, !n0Var.f65478e.isEmpty(), n0Var.f65478e);
                int i6 = this.f65479f;
                boolean z6 = i6 != 0;
                int i7 = n0Var.f65479f;
                this.f65479f = visitor.visitInt(z6, i6, i7 != 0, i7);
                long j4 = this.f65480g;
                boolean z7 = j4 != 0;
                long j5 = n0Var.f65480g;
                this.f65480g = visitor.visitLong(z7, j4, j5 != 0, j5);
                long j6 = this.f65481h;
                boolean z8 = j6 != 0;
                long j7 = n0Var.f65481h;
                this.f65481h = visitor.visitLong(z8, j6, j7 != 0, j7);
                this.f65482i = visitor.visitString(!this.f65482i.isEmpty(), this.f65482i, !n0Var.f65482i.isEmpty(), n0Var.f65482i);
                int i8 = this.f65483j;
                boolean z9 = i8 != 0;
                int i9 = n0Var.f65483j;
                this.f65483j = visitor.visitInt(z9, i8, i9 != 0, i9);
                int i10 = this.f65484k;
                boolean z10 = i10 != 0;
                int i11 = n0Var.f65484k;
                this.f65484k = visitor.visitInt(z10, i10, i11 != 0, i11);
                int i12 = this.f65485l;
                boolean z11 = i12 != 0;
                int i13 = n0Var.f65485l;
                this.f65485l = visitor.visitInt(z11, i12, i13 != 0, i13);
                this.f65486m = visitor.visitString(!this.f65486m.isEmpty(), this.f65486m, !n0Var.f65486m.isEmpty(), n0Var.f65486m);
                int i14 = this.f65487n;
                boolean z12 = i14 != 0;
                int i15 = n0Var.f65487n;
                this.f65487n = visitor.visitInt(z12, i14, i15 != 0, i15);
                this.f65488o = visitor.visitString(!this.f65488o.isEmpty(), this.f65488o, !n0Var.f65488o.isEmpty(), n0Var.f65488o);
                int i16 = this.f65489p;
                boolean z13 = i16 != 0;
                int i17 = n0Var.f65489p;
                this.f65489p = visitor.visitInt(z13, i16, i17 != 0, i17);
                int i18 = this.f65490q;
                boolean z14 = i18 != 0;
                int i19 = n0Var.f65490q;
                this.f65490q = visitor.visitInt(z14, i18, i19 != 0, i19);
                int i20 = this.f65491r;
                boolean z15 = i20 != 0;
                int i21 = n0Var.f65491r;
                this.f65491r = visitor.visitInt(z15, i20, i21 != 0, i21);
                long j8 = this.f65492s;
                boolean z16 = j8 != 0;
                long j9 = n0Var.f65492s;
                this.f65492s = visitor.visitLong(z16, j8, j9 != 0, j9);
                int i22 = this.f65493t;
                boolean z17 = i22 != 0;
                int i23 = n0Var.f65493t;
                this.f65493t = visitor.visitInt(z17, i22, i23 != 0, i23);
                int i24 = this.f65494u;
                boolean z18 = i24 != 0;
                int i25 = n0Var.f65494u;
                this.f65494u = visitor.visitInt(z18, i24, i25 != 0, i25);
                this.f65495v = (h) visitor.visitMessage(this.f65495v, n0Var.f65495v);
                int i26 = this.f65496w;
                boolean z19 = i26 != 0;
                int i27 = n0Var.f65496w;
                this.f65496w = visitor.visitInt(z19, i26, i27 != 0, i27);
                this.f65497x = visitor.visitString(!this.f65497x.isEmpty(), this.f65497x, !n0Var.f65497x.isEmpty(), n0Var.f65497x);
                int i28 = this.f65498y;
                boolean z20 = i28 != 0;
                int i29 = n0Var.f65498y;
                this.f65498y = visitor.visitInt(z20, i28, i29 != 0, i29);
                int i30 = this.f65499z;
                boolean z21 = i30 != 0;
                int i31 = n0Var.f65499z;
                this.f65499z = visitor.visitInt(z21, i30, i31 != 0, i31);
                int i32 = this.A;
                boolean z22 = i32 != 0;
                int i33 = n0Var.A;
                this.A = visitor.visitInt(z22, i32, i33 != 0, i33);
                int i34 = this.B;
                boolean z23 = i34 != 0;
                int i35 = n0Var.B;
                this.B = visitor.visitInt(z23, i34, i35 != 0, i35);
                this.C = visitor.visitString(!this.C.isEmpty(), this.C, !n0Var.C.isEmpty(), n0Var.C);
                this.D = visitor.visitString(!this.D.isEmpty(), this.D, !n0Var.D.isEmpty(), n0Var.D);
                this.E = visitor.visitList(this.E, n0Var.E);
                long j10 = this.F;
                boolean z24 = j10 != 0;
                long j11 = n0Var.F;
                this.F = visitor.visitLong(z24, j10, j11 != 0, j11);
                if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                    this.f65475b |= n0Var.f65475b;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z4) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                break;
                            case 8:
                                this.f65476c = codedInputStream.readInt32();
                                continue;
                            case 18:
                                this.f65477d = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 24:
                                this.f65479f = codedInputStream.readInt32();
                                continue;
                            case 32:
                                this.f65480g = codedInputStream.readInt64();
                                continue;
                            case 40:
                                this.f65481h = codedInputStream.readInt64();
                                continue;
                            case 50:
                                this.f65482i = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 56:
                                this.f65483j = codedInputStream.readInt32();
                                continue;
                            case 64:
                                this.f65484k = codedInputStream.readInt32();
                                continue;
                            case 72:
                                this.f65485l = codedInputStream.readInt32();
                                continue;
                            case 82:
                                this.f65486m = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 88:
                                this.f65487n = codedInputStream.readInt32();
                                continue;
                            case 98:
                                this.f65488o = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 104:
                                this.f65489p = codedInputStream.readInt32();
                                continue;
                            case 112:
                                this.f65490q = codedInputStream.readInt32();
                                continue;
                            case 120:
                                this.f65491r = codedInputStream.readInt32();
                                continue;
                            case 128:
                                this.f65492s = codedInputStream.readInt64();
                                continue;
                            case 136:
                                this.f65493t = codedInputStream.readInt32();
                                continue;
                            case 144:
                                this.f65494u = codedInputStream.readInt32();
                                continue;
                            case 154:
                                h hVar = this.f65495v;
                                h.b builder = hVar != null ? hVar.toBuilder() : null;
                                h hVar2 = (h) codedInputStream.readMessage(h.parser(), extensionRegistryLite);
                                this.f65495v = hVar2;
                                if (builder != null) {
                                    builder.mergeFrom((h.b) hVar2);
                                    this.f65495v = builder.buildPartial();
                                } else {
                                    continue;
                                }
                            case 160:
                                this.f65496w = codedInputStream.readInt32();
                                continue;
                            case 170:
                                this.f65497x = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 176:
                                this.f65498y = codedInputStream.readInt32();
                                continue;
                            case 184:
                                this.f65499z = codedInputStream.readInt32();
                                continue;
                            case 192:
                                this.A = codedInputStream.readInt32();
                                continue;
                            case 200:
                                this.B = codedInputStream.readInt32();
                                continue;
                            case 210:
                                this.C = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 218:
                                this.D = codedInputStream.readStringRequireUtf8();
                                continue;
                            case Opcodes.USHR_INT_LIT8 /* 226 */:
                                if (!this.E.isModifiable()) {
                                    this.E = GeneratedMessageLite.mutableCopy(this.E);
                                }
                                this.E.add((d) codedInputStream.readMessage(d.parser(), extensionRegistryLite));
                                continue;
                            case 234:
                                this.f65478e = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 240:
                                this.F = codedInputStream.readInt64();
                                continue;
                            default:
                                if (!codedInputStream.skipField(readTag)) {
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        z4 = true;
                    } catch (InvalidProtocolBufferException e5) {
                        throw new RuntimeException(e5.setUnfinishedMessage(this));
                    } catch (IOException e6) {
                        throw new RuntimeException(new InvalidProtocolBufferException(e6.getMessage()).setUnfinishedMessage(this));
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (I1 == null) {
                    synchronized (n0.class) {
                        if (I1 == null) {
                            I1 = new GeneratedMessageLite.DefaultInstanceBasedParser(H1);
                        }
                    }
                }
                return I1;
            default:
                throw new UnsupportedOperationException();
        }
        return H1;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public ByteString e0() {
        return ByteString.copyFromUtf8(this.f65497x);
    }

    @Override // com.wufan.user.service.protobuf.o0
    public List<d> f0() {
        return this.E;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public ByteString f2() {
        return ByteString.copyFromUtf8(this.f65488o);
    }

    @Override // com.wufan.user.service.protobuf.o0
    public int g0() {
        return this.B;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public String getAccount() {
        return this.f65477d;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public String getNickname() {
        return this.f65478e;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public ByteString getNicknameBytes() {
        return ByteString.copyFromUtf8(this.f65478e);
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int i5 = this.f65476c;
        int computeInt32Size = i5 != 0 ? CodedOutputStream.computeInt32Size(1, i5) + 0 : 0;
        if (!this.f65477d.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(2, getAccount());
        }
        int i6 = this.f65479f;
        if (i6 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(3, i6);
        }
        long j4 = this.f65480g;
        if (j4 != 0) {
            computeInt32Size += CodedOutputStream.computeInt64Size(4, j4);
        }
        long j5 = this.f65481h;
        if (j5 != 0) {
            computeInt32Size += CodedOutputStream.computeInt64Size(5, j5);
        }
        if (!this.f65482i.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(6, d0());
        }
        int i7 = this.f65483j;
        if (i7 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(7, i7);
        }
        int i8 = this.f65484k;
        if (i8 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(8, i8);
        }
        int i9 = this.f65485l;
        if (i9 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(9, i9);
        }
        if (!this.f65486m.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(10, z());
        }
        int i10 = this.f65487n;
        if (i10 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(11, i10);
        }
        if (!this.f65488o.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(12, k1());
        }
        int i11 = this.f65489p;
        if (i11 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(13, i11);
        }
        int i12 = this.f65490q;
        if (i12 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(14, i12);
        }
        int i13 = this.f65491r;
        if (i13 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(15, i13);
        }
        long j6 = this.f65492s;
        if (j6 != 0) {
            computeInt32Size += CodedOutputStream.computeInt64Size(16, j6);
        }
        int i14 = this.f65493t;
        if (i14 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(17, i14);
        }
        int i15 = this.f65494u;
        if (i15 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(18, i15);
        }
        if (this.f65495v != null) {
            computeInt32Size += CodedOutputStream.computeMessageSize(19, F2());
        }
        int i16 = this.f65496w;
        if (i16 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(20, i16);
        }
        if (!this.f65497x.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(21, y0());
        }
        int i17 = this.f65498y;
        if (i17 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(22, i17);
        }
        int i18 = this.f65499z;
        if (i18 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(23, i18);
        }
        int i19 = this.A;
        if (i19 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(24, i19);
        }
        int i20 = this.B;
        if (i20 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(25, i20);
        }
        if (!this.C.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(26, getToken());
        }
        if (!this.D.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(27, G());
        }
        for (int i21 = 0; i21 < this.E.size(); i21++) {
            computeInt32Size += CodedOutputStream.computeMessageSize(28, this.E.get(i21));
        }
        if (!this.f65478e.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(29, getNickname());
        }
        long j7 = this.F;
        if (j7 != 0) {
            computeInt32Size += CodedOutputStream.computeInt64Size(30, j7);
        }
        this.memoizedSerializedSize = computeInt32Size;
        return computeInt32Size;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public String getToken() {
        return this.C;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public ByteString getTokenBytes() {
        return ByteString.copyFromUtf8(this.C);
    }

    @Override // com.wufan.user.service.protobuf.o0
    public int getUid() {
        return this.f65476c;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public ByteString h() {
        return ByteString.copyFromUtf8(this.f65477d);
    }

    @Override // com.wufan.user.service.protobuf.o0
    public long h0() {
        return this.F;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public int i() {
        return this.f65484k;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public int j1() {
        return this.f65491r;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public String k1() {
        return this.f65488o;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public int k2() {
        return this.f65487n;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public int l2() {
        return this.A;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public int n2() {
        return this.f65489p;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public d o0(int i4) {
        return this.E.get(i4);
    }

    @Override // com.wufan.user.service.protobuf.o0
    public long q2() {
        return this.f65481h;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public boolean r2() {
        return this.f65495v != null;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public int t2() {
        return this.f65498y;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public int v1() {
        return this.f65483j;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i4 = this.f65476c;
        if (i4 != 0) {
            codedOutputStream.writeInt32(1, i4);
        }
        if (!this.f65477d.isEmpty()) {
            codedOutputStream.writeString(2, getAccount());
        }
        int i5 = this.f65479f;
        if (i5 != 0) {
            codedOutputStream.writeInt32(3, i5);
        }
        long j4 = this.f65480g;
        if (j4 != 0) {
            codedOutputStream.writeInt64(4, j4);
        }
        long j5 = this.f65481h;
        if (j5 != 0) {
            codedOutputStream.writeInt64(5, j5);
        }
        if (!this.f65482i.isEmpty()) {
            codedOutputStream.writeString(6, d0());
        }
        int i6 = this.f65483j;
        if (i6 != 0) {
            codedOutputStream.writeInt32(7, i6);
        }
        int i7 = this.f65484k;
        if (i7 != 0) {
            codedOutputStream.writeInt32(8, i7);
        }
        int i8 = this.f65485l;
        if (i8 != 0) {
            codedOutputStream.writeInt32(9, i8);
        }
        if (!this.f65486m.isEmpty()) {
            codedOutputStream.writeString(10, z());
        }
        int i9 = this.f65487n;
        if (i9 != 0) {
            codedOutputStream.writeInt32(11, i9);
        }
        if (!this.f65488o.isEmpty()) {
            codedOutputStream.writeString(12, k1());
        }
        int i10 = this.f65489p;
        if (i10 != 0) {
            codedOutputStream.writeInt32(13, i10);
        }
        int i11 = this.f65490q;
        if (i11 != 0) {
            codedOutputStream.writeInt32(14, i11);
        }
        int i12 = this.f65491r;
        if (i12 != 0) {
            codedOutputStream.writeInt32(15, i12);
        }
        long j6 = this.f65492s;
        if (j6 != 0) {
            codedOutputStream.writeInt64(16, j6);
        }
        int i13 = this.f65493t;
        if (i13 != 0) {
            codedOutputStream.writeInt32(17, i13);
        }
        int i14 = this.f65494u;
        if (i14 != 0) {
            codedOutputStream.writeInt32(18, i14);
        }
        if (this.f65495v != null) {
            codedOutputStream.writeMessage(19, F2());
        }
        int i15 = this.f65496w;
        if (i15 != 0) {
            codedOutputStream.writeInt32(20, i15);
        }
        if (!this.f65497x.isEmpty()) {
            codedOutputStream.writeString(21, y0());
        }
        int i16 = this.f65498y;
        if (i16 != 0) {
            codedOutputStream.writeInt32(22, i16);
        }
        int i17 = this.f65499z;
        if (i17 != 0) {
            codedOutputStream.writeInt32(23, i17);
        }
        int i18 = this.A;
        if (i18 != 0) {
            codedOutputStream.writeInt32(24, i18);
        }
        int i19 = this.B;
        if (i19 != 0) {
            codedOutputStream.writeInt32(25, i19);
        }
        if (!this.C.isEmpty()) {
            codedOutputStream.writeString(26, getToken());
        }
        if (!this.D.isEmpty()) {
            codedOutputStream.writeString(27, G());
        }
        for (int i20 = 0; i20 < this.E.size(); i20++) {
            codedOutputStream.writeMessage(28, this.E.get(i20));
        }
        if (!this.f65478e.isEmpty()) {
            codedOutputStream.writeString(29, getNickname());
        }
        long j7 = this.F;
        if (j7 != 0) {
            codedOutputStream.writeInt64(30, j7);
        }
    }

    @Override // com.wufan.user.service.protobuf.o0
    public ByteString x() {
        return ByteString.copyFromUtf8(this.f65486m);
    }

    @Override // com.wufan.user.service.protobuf.o0
    public int x2() {
        return this.f65493t;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public long y() {
        return this.f65492s;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public String y0() {
        return this.f65497x;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public String z() {
        return this.f65486m;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public int z0() {
        return this.f65479f;
    }

    @Override // com.wufan.user.service.protobuf.o0
    public ByteString z1() {
        return ByteString.copyFromUtf8(this.f65482i);
    }
}
