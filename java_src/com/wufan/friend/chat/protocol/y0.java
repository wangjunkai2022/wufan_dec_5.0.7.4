package com.wufan.friend.chat.protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.wufan.friend.chat.protocol.FriendAddReqNotification;
import com.wufan.friend.chat.protocol.a;
import com.wufan.friend.chat.protocol.e;
import com.wufan.friend.chat.protocol.f1;
import com.wufan.friend.chat.protocol.g;
import com.wufan.friend.chat.protocol.g0;
import com.wufan.friend.chat.protocol.h1;
import com.wufan.friend.chat.protocol.l0;
import com.wufan.friend.chat.protocol.m;
import com.wufan.friend.chat.protocol.n0;
import com.wufan.friend.chat.protocol.o1;
import com.wufan.friend.chat.protocol.p;
import com.wufan.friend.chat.protocol.q1;
import com.wufan.friend.chat.protocol.t;
import com.wufan.friend.chat.protocol.v;
import com.wufan.friend.chat.protocol.x;
import com.wufan.friend.chat.protocol.z;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* compiled from: NotificationData.java */
/* loaded from: classes6.dex */
public final class y0 extends GeneratedMessageLite<y0, b> implements z0 {
    public static final int A = 6;
    public static final int B = 7;
    public static final int C = 8;
    public static final int D = 9;
    public static final int E = 10;
    public static final int F = 11;
    public static final int G = 12;
    public static final int H = 13;
    public static final int I = 14;
    public static final int J = 15;
    public static final int K = 16;
    public static final int L = 17;
    public static final int M = 18;
    public static final int N = 19;
    public static final int O = 20;
    private static final y0 P;
    private static volatile Parser<y0> Q = null;

    /* renamed from: v  reason: collision with root package name */
    public static final int f65294v = 1;

    /* renamed from: w  reason: collision with root package name */
    public static final int f65295w = 2;

    /* renamed from: x  reason: collision with root package name */
    public static final int f65296x = 3;

    /* renamed from: y  reason: collision with root package name */
    public static final int f65297y = 4;

    /* renamed from: z  reason: collision with root package name */
    public static final int f65298z = 5;

    /* renamed from: b  reason: collision with root package name */
    private long f65299b;

    /* renamed from: c  reason: collision with root package name */
    private long f65300c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f65301d;

    /* renamed from: e  reason: collision with root package name */
    private com.wufan.friend.chat.protocol.a f65302e;

    /* renamed from: f  reason: collision with root package name */
    private p f65303f;

    /* renamed from: g  reason: collision with root package name */
    private h1 f65304g;

    /* renamed from: h  reason: collision with root package name */
    private g0 f65305h;

    /* renamed from: i  reason: collision with root package name */
    private x f65306i;

    /* renamed from: j  reason: collision with root package name */
    private v f65307j;

    /* renamed from: k  reason: collision with root package name */
    private l0 f65308k;

    /* renamed from: l  reason: collision with root package name */
    private g f65309l;

    /* renamed from: m  reason: collision with root package name */
    private m f65310m;

    /* renamed from: n  reason: collision with root package name */
    private FriendAddReqNotification f65311n;

    /* renamed from: o  reason: collision with root package name */
    private n0 f65312o;

    /* renamed from: p  reason: collision with root package name */
    private t f65313p;

    /* renamed from: q  reason: collision with root package name */
    private q1 f65314q;

    /* renamed from: r  reason: collision with root package name */
    private e f65315r;

    /* renamed from: s  reason: collision with root package name */
    private o1 f65316s;

    /* renamed from: t  reason: collision with root package name */
    private z f65317t;

    /* renamed from: u  reason: collision with root package name */
    private f1 f65318u;

    /* compiled from: NotificationData.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65319a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65319a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65319a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65319a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65319a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65319a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65319a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65319a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65319a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: NotificationData.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<y0, b> implements z0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b A3(n0 n0Var) {
            copyOnWrite();
            ((y0) this.instance).Z4(n0Var);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public boolean B0() {
            return ((y0) this.instance).B0();
        }

        public b B3(f1 f1Var) {
            copyOnWrite();
            ((y0) this.instance).a5(f1Var);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public boolean C0() {
            return ((y0) this.instance).C0();
        }

        public b C3(h1 h1Var) {
            copyOnWrite();
            ((y0) this.instance).b5(h1Var);
            return this;
        }

        public b D3(o1 o1Var) {
            copyOnWrite();
            ((y0) this.instance).c5(o1Var);
            return this;
        }

        public b E3(q1 q1Var) {
            copyOnWrite();
            ((y0) this.instance).d5(q1Var);
            return this;
        }

        public b F3(boolean z4) {
            copyOnWrite();
            ((y0) this.instance).q5(z4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public boolean G2() {
            return ((y0) this.instance).G2();
        }

        public b G3(e.b bVar) {
            copyOnWrite();
            ((y0) this.instance).r5(bVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public boolean H1() {
            return ((y0) this.instance).H1();
        }

        public b H3(e eVar) {
            copyOnWrite();
            ((y0) this.instance).s5(eVar);
            return this;
        }

        public b I3(g.b bVar) {
            copyOnWrite();
            ((y0) this.instance).t5(bVar);
            return this;
        }

        public b J3(g gVar) {
            copyOnWrite();
            ((y0) this.instance).u5(gVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public boolean K1() {
            return ((y0) this.instance).K1();
        }

        public b K3(m.b bVar) {
            copyOnWrite();
            ((y0) this.instance).v5(bVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public v L0() {
            return ((y0) this.instance).L0();
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public q1 L1() {
            return ((y0) this.instance).L1();
        }

        public b L3(m mVar) {
            copyOnWrite();
            ((y0) this.instance).w5(mVar);
            return this;
        }

        public b M3(p.b bVar) {
            copyOnWrite();
            ((y0) this.instance).x5(bVar);
            return this;
        }

        public b N3(p pVar) {
            copyOnWrite();
            ((y0) this.instance).y5(pVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public long O() {
            return ((y0) this.instance).O();
        }

        public b O3(FriendAddReqNotification.b bVar) {
            copyOnWrite();
            ((y0) this.instance).z5(bVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public f1 P0() {
            return ((y0) this.instance).P0();
        }

        public b P3(FriendAddReqNotification friendAddReqNotification) {
            copyOnWrite();
            ((y0) this.instance).A5(friendAddReqNotification);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public long Q() {
            return ((y0) this.instance).Q();
        }

        public b Q3(t.b bVar) {
            copyOnWrite();
            ((y0) this.instance).B5(bVar);
            return this;
        }

        public b R3(t tVar) {
            copyOnWrite();
            ((y0) this.instance).C5(tVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public p S() {
            return ((y0) this.instance).S();
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public boolean S1() {
            return ((y0) this.instance).S1();
        }

        public b S3(x.b bVar) {
            copyOnWrite();
            ((y0) this.instance).D5(bVar);
            return this;
        }

        public b T3(x xVar) {
            copyOnWrite();
            ((y0) this.instance).E5(xVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public boolean U2() {
            return ((y0) this.instance).U2();
        }

        public b U3(z.b bVar) {
            copyOnWrite();
            ((y0) this.instance).F5(bVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public com.wufan.friend.chat.protocol.a V() {
            return ((y0) this.instance).V();
        }

        public b V2() {
            copyOnWrite();
            ((y0) this.instance).t4();
            return this;
        }

        public b V3(z zVar) {
            copyOnWrite();
            ((y0) this.instance).G5(zVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public boolean W1() {
            return ((y0) this.instance).W1();
        }

        public b W2() {
            copyOnWrite();
            ((y0) this.instance).u4();
            return this;
        }

        public b W3(v.b bVar) {
            copyOnWrite();
            ((y0) this.instance).H5(bVar);
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((y0) this.instance).s4();
            return this;
        }

        public b X2() {
            copyOnWrite();
            ((y0) this.instance).v4();
            return this;
        }

        public b X3(v vVar) {
            copyOnWrite();
            ((y0) this.instance).I5(vVar);
            return this;
        }

        public b Y2() {
            copyOnWrite();
            ((y0) this.instance).w4();
            return this;
        }

        public b Y3(a.b bVar) {
            copyOnWrite();
            ((y0) this.instance).J5(bVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public boolean Z() {
            return ((y0) this.instance).Z();
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public e Z1() {
            return ((y0) this.instance).Z1();
        }

        public b Z2() {
            copyOnWrite();
            ((y0) this.instance).x4();
            return this;
        }

        public b Z3(com.wufan.friend.chat.protocol.a aVar) {
            copyOnWrite();
            ((y0) this.instance).K5(aVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public boolean a1() {
            return ((y0) this.instance).a1();
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public l0 a2() {
            return ((y0) this.instance).a2();
        }

        public b a3() {
            copyOnWrite();
            ((y0) this.instance).y4();
            return this;
        }

        public b a4(g0.b bVar) {
            copyOnWrite();
            ((y0) this.instance).L5(bVar);
            return this;
        }

        public b b3() {
            copyOnWrite();
            ((y0) this.instance).z4();
            return this;
        }

        public b b4(g0 g0Var) {
            copyOnWrite();
            ((y0) this.instance).M5(g0Var);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public n0 c2() {
            return ((y0) this.instance).c2();
        }

        public b c3() {
            copyOnWrite();
            ((y0) this.instance).A4();
            return this;
        }

        public b c4(l0.b bVar) {
            copyOnWrite();
            ((y0) this.instance).N5(bVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public t d1() {
            return ((y0) this.instance).d1();
        }

        public b d3() {
            copyOnWrite();
            ((y0) this.instance).B4();
            return this;
        }

        public b d4(l0 l0Var) {
            copyOnWrite();
            ((y0) this.instance).O5(l0Var);
            return this;
        }

        public b e3() {
            copyOnWrite();
            ((y0) this.instance).C4();
            return this;
        }

        public b e4(n0.b bVar) {
            copyOnWrite();
            ((y0) this.instance).P5(bVar);
            return this;
        }

        public b f3() {
            copyOnWrite();
            ((y0) this.instance).D4();
            return this;
        }

        public b f4(n0 n0Var) {
            copyOnWrite();
            ((y0) this.instance).Q5(n0Var);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public z g2() {
            return ((y0) this.instance).g2();
        }

        public b g3() {
            copyOnWrite();
            ((y0) this.instance).E4();
            return this;
        }

        public b g4(long j4) {
            copyOnWrite();
            ((y0) this.instance).R5(j4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public boolean h2() {
            return ((y0) this.instance).h2();
        }

        public b h3() {
            copyOnWrite();
            ((y0) this.instance).F4();
            return this;
        }

        public b h4(f1.b bVar) {
            copyOnWrite();
            ((y0) this.instance).S5(bVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public g0 i1() {
            return ((y0) this.instance).i1();
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public boolean i2() {
            return ((y0) this.instance).i2();
        }

        public b i3() {
            copyOnWrite();
            ((y0) this.instance).G4();
            return this;
        }

        public b i4(f1 f1Var) {
            copyOnWrite();
            ((y0) this.instance).T5(f1Var);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public h1 j2() {
            return ((y0) this.instance).j2();
        }

        public b j3() {
            copyOnWrite();
            ((y0) this.instance).H4();
            return this;
        }

        public b j4(h1.b bVar) {
            copyOnWrite();
            ((y0) this.instance).U5(bVar);
            return this;
        }

        public b k3() {
            copyOnWrite();
            ((y0) this.instance).I4();
            return this;
        }

        public b k4(h1 h1Var) {
            copyOnWrite();
            ((y0) this.instance).V5(h1Var);
            return this;
        }

        public b l3() {
            copyOnWrite();
            ((y0) this.instance).J4();
            return this;
        }

        public b l4(o1.b bVar) {
            copyOnWrite();
            ((y0) this.instance).W5(bVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public x m2() {
            return ((y0) this.instance).m2();
        }

        public b m3() {
            copyOnWrite();
            ((y0) this.instance).K4();
            return this;
        }

        public b m4(o1 o1Var) {
            copyOnWrite();
            ((y0) this.instance).X5(o1Var);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public boolean n1() {
            return ((y0) this.instance).n1();
        }

        public b n3() {
            copyOnWrite();
            ((y0) this.instance).L4();
            return this;
        }

        public b n4(q1.b bVar) {
            copyOnWrite();
            ((y0) this.instance).Y5(bVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public boolean o2() {
            return ((y0) this.instance).o2();
        }

        public b o3(e eVar) {
            copyOnWrite();
            ((y0) this.instance).N4(eVar);
            return this;
        }

        public b o4(q1 q1Var) {
            copyOnWrite();
            ((y0) this.instance).Z5(q1Var);
            return this;
        }

        public b p3(g gVar) {
            copyOnWrite();
            ((y0) this.instance).O4(gVar);
            return this;
        }

        public b p4(long j4) {
            copyOnWrite();
            ((y0) this.instance).a6(j4);
            return this;
        }

        public b q3(m mVar) {
            copyOnWrite();
            ((y0) this.instance).P4(mVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public o1 r1() {
            return ((y0) this.instance).r1();
        }

        public b r3(p pVar) {
            copyOnWrite();
            ((y0) this.instance).Q4(pVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public m s0() {
            return ((y0) this.instance).s0();
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public boolean s1() {
            return ((y0) this.instance).s1();
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public boolean s2() {
            return ((y0) this.instance).s2();
        }

        public b s3(FriendAddReqNotification friendAddReqNotification) {
            copyOnWrite();
            ((y0) this.instance).R4(friendAddReqNotification);
            return this;
        }

        public b t3(t tVar) {
            copyOnWrite();
            ((y0) this.instance).S4(tVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public g u0() {
            return ((y0) this.instance).u0();
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public boolean u2() {
            return ((y0) this.instance).u2();
        }

        public b u3(x xVar) {
            copyOnWrite();
            ((y0) this.instance).T4(xVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public boolean v2() {
            return ((y0) this.instance).v2();
        }

        public b v3(z zVar) {
            copyOnWrite();
            ((y0) this.instance).U4(zVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z0
        public FriendAddReqNotification w1() {
            return ((y0) this.instance).w1();
        }

        public b w3(v vVar) {
            copyOnWrite();
            ((y0) this.instance).V4(vVar);
            return this;
        }

        public b x3(com.wufan.friend.chat.protocol.a aVar) {
            copyOnWrite();
            ((y0) this.instance).W4(aVar);
            return this;
        }

        public b y3(g0 g0Var) {
            copyOnWrite();
            ((y0) this.instance).X4(g0Var);
            return this;
        }

        public b z3(l0 l0Var) {
            copyOnWrite();
            ((y0) this.instance).Y4(l0Var);
            return this;
        }

        private b() {
            super(y0.P);
        }
    }

    static {
        y0 y0Var = new y0();
        P = y0Var;
        y0Var.makeImmutable();
    }

    private y0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A4() {
        this.f65317t = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A5(FriendAddReqNotification friendAddReqNotification) {
        Objects.requireNonNull(friendAddReqNotification);
        this.f65311n = friendAddReqNotification;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B4() {
        this.f65307j = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B5(t.b bVar) {
        this.f65313p = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C4() {
        this.f65302e = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C5(t tVar) {
        Objects.requireNonNull(tVar);
        this.f65313p = tVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D4() {
        this.f65305h = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D5(x.b bVar) {
        this.f65306i = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E4() {
        this.f65308k = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E5(x xVar) {
        Objects.requireNonNull(xVar);
        this.f65306i = xVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F4() {
        this.f65312o = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F5(z.b bVar) {
        this.f65317t = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G4() {
        this.f65299b = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G5(z zVar) {
        Objects.requireNonNull(zVar);
        this.f65317t = zVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H4() {
        this.f65318u = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H5(v.b bVar) {
        this.f65307j = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I4() {
        this.f65304g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I5(v vVar) {
        Objects.requireNonNull(vVar);
        this.f65307j = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J4() {
        this.f65316s = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J5(a.b bVar) {
        this.f65302e = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K4() {
        this.f65314q = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K5(com.wufan.friend.chat.protocol.a aVar) {
        Objects.requireNonNull(aVar);
        this.f65302e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L4() {
        this.f65300c = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L5(g0.b bVar) {
        this.f65305h = bVar.build();
    }

    public static y0 M4() {
        return P;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M5(g0 g0Var) {
        Objects.requireNonNull(g0Var);
        this.f65305h = g0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N4(e eVar) {
        e eVar2 = this.f65315r;
        if (eVar2 != null && eVar2 != e.F3()) {
            this.f65315r = e.L3(this.f65315r).mergeFrom((e.b) eVar).buildPartial();
        } else {
            this.f65315r = eVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N5(l0.b bVar) {
        this.f65308k = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O4(g gVar) {
        g gVar2 = this.f65309l;
        if (gVar2 != null && gVar2 != g.p3()) {
            this.f65309l = g.t3(this.f65309l).mergeFrom((g.b) gVar).buildPartial();
        } else {
            this.f65309l = gVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O5(l0 l0Var) {
        Objects.requireNonNull(l0Var);
        this.f65308k = l0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P4(m mVar) {
        m mVar2 = this.f65310m;
        if (mVar2 != null && mVar2 != m.g3()) {
            this.f65310m = m.j3(this.f65310m).mergeFrom((m.b) mVar).buildPartial();
        } else {
            this.f65310m = mVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P5(n0.b bVar) {
        this.f65312o = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q4(p pVar) {
        p pVar2 = this.f65303f;
        if (pVar2 != null && pVar2 != p.W2()) {
            this.f65303f = p.Y2(this.f65303f).mergeFrom((p.b) pVar).buildPartial();
        } else {
            this.f65303f = pVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q5(n0 n0Var) {
        Objects.requireNonNull(n0Var);
        this.f65312o = n0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R4(FriendAddReqNotification friendAddReqNotification) {
        FriendAddReqNotification friendAddReqNotification2 = this.f65311n;
        if (friendAddReqNotification2 != null && friendAddReqNotification2 != FriendAddReqNotification.e3()) {
            this.f65311n = FriendAddReqNotification.g3(this.f65311n).mergeFrom((FriendAddReqNotification.b) friendAddReqNotification).buildPartial();
        } else {
            this.f65311n = friendAddReqNotification;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R5(long j4) {
        this.f65299b = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S4(t tVar) {
        t tVar2 = this.f65313p;
        if (tVar2 != null && tVar2 != t.k3()) {
            this.f65313p = t.o3(this.f65313p).mergeFrom((t.b) tVar).buildPartial();
        } else {
            this.f65313p = tVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S5(f1.b bVar) {
        this.f65318u = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T4(x xVar) {
        x xVar2 = this.f65306i;
        if (xVar2 != null && xVar2 != x.j3()) {
            this.f65306i = x.n3(this.f65306i).mergeFrom((x.b) xVar).buildPartial();
        } else {
            this.f65306i = xVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T5(f1 f1Var) {
        Objects.requireNonNull(f1Var);
        this.f65318u = f1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U4(z zVar) {
        z zVar2 = this.f65317t;
        if (zVar2 != null && zVar2 != z.Z2()) {
            this.f65317t = z.b3(this.f65317t).mergeFrom((z.b) zVar).buildPartial();
        } else {
            this.f65317t = zVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U5(h1.b bVar) {
        this.f65304g = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V4(v vVar) {
        v vVar2 = this.f65307j;
        if (vVar2 != null && vVar2 != v.f3()) {
            this.f65307j = v.j3(this.f65307j).mergeFrom((v.b) vVar).buildPartial();
        } else {
            this.f65307j = vVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V5(h1 h1Var) {
        Objects.requireNonNull(h1Var);
        this.f65304g = h1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W4(com.wufan.friend.chat.protocol.a aVar) {
        com.wufan.friend.chat.protocol.a aVar2 = this.f65302e;
        if (aVar2 != null && aVar2 != com.wufan.friend.chat.protocol.a.q3()) {
            this.f65302e = com.wufan.friend.chat.protocol.a.s3(this.f65302e).mergeFrom((a.b) aVar).buildPartial();
        } else {
            this.f65302e = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W5(o1.b bVar) {
        this.f65316s = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X4(g0 g0Var) {
        g0 g0Var2 = this.f65305h;
        if (g0Var2 != null && g0Var2 != g0.B3()) {
            this.f65305h = g0.D3(this.f65305h).mergeFrom((g0.b) g0Var).buildPartial();
        } else {
            this.f65305h = g0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X5(o1 o1Var) {
        Objects.requireNonNull(o1Var);
        this.f65316s = o1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y4(l0 l0Var) {
        l0 l0Var2 = this.f65308k;
        if (l0Var2 != null && l0Var2 != l0.a3()) {
            this.f65308k = l0.c3(this.f65308k).mergeFrom((l0.b) l0Var).buildPartial();
        } else {
            this.f65308k = l0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y5(q1.b bVar) {
        this.f65314q = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z4(n0 n0Var) {
        n0 n0Var2 = this.f65312o;
        if (n0Var2 != null && n0Var2 != n0.c3()) {
            this.f65312o = n0.e3(this.f65312o).mergeFrom((n0.b) n0Var).buildPartial();
        } else {
            this.f65312o = n0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z5(q1 q1Var) {
        Objects.requireNonNull(q1Var);
        this.f65314q = q1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a5(f1 f1Var) {
        f1 f1Var2 = this.f65318u;
        if (f1Var2 != null && f1Var2 != f1.b3()) {
            this.f65318u = f1.e3(this.f65318u).mergeFrom((f1.b) f1Var).buildPartial();
        } else {
            this.f65318u = f1Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a6(long j4) {
        this.f65300c = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b5(h1 h1Var) {
        h1 h1Var2 = this.f65304g;
        if (h1Var2 != null && h1Var2 != h1.W2()) {
            this.f65304g = h1.Y2(this.f65304g).mergeFrom((h1.b) h1Var).buildPartial();
        } else {
            this.f65304g = h1Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c5(o1 o1Var) {
        o1 o1Var2 = this.f65316s;
        if (o1Var2 != null && o1Var2 != o1.j3()) {
            this.f65316s = o1.n3(this.f65316s).mergeFrom((o1.b) o1Var).buildPartial();
        } else {
            this.f65316s = o1Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d5(q1 q1Var) {
        q1 q1Var2 = this.f65314q;
        if (q1Var2 != null && q1Var2 != q1.e3()) {
            this.f65314q = q1.h3(this.f65314q).mergeFrom((q1.b) q1Var).buildPartial();
        } else {
            this.f65314q = q1Var;
        }
    }

    public static b e5() {
        return P.toBuilder();
    }

    public static b f5(y0 y0Var) {
        return P.toBuilder().mergeFrom((b) y0Var);
    }

    public static y0 g5(InputStream inputStream) throws IOException {
        return (y0) GeneratedMessageLite.parseDelimitedFrom(P, inputStream);
    }

    public static y0 h5(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (y0) GeneratedMessageLite.parseDelimitedFrom(P, inputStream, extensionRegistryLite);
    }

    public static y0 i5(ByteString byteString) throws InvalidProtocolBufferException {
        return (y0) GeneratedMessageLite.parseFrom(P, byteString);
    }

    public static y0 j5(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (y0) GeneratedMessageLite.parseFrom(P, byteString, extensionRegistryLite);
    }

    public static y0 k5(CodedInputStream codedInputStream) throws IOException {
        return (y0) GeneratedMessageLite.parseFrom(P, codedInputStream);
    }

    public static y0 l5(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (y0) GeneratedMessageLite.parseFrom(P, codedInputStream, extensionRegistryLite);
    }

    public static y0 m5(InputStream inputStream) throws IOException {
        return (y0) GeneratedMessageLite.parseFrom(P, inputStream);
    }

    public static y0 n5(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (y0) GeneratedMessageLite.parseFrom(P, inputStream, extensionRegistryLite);
    }

    public static y0 o5(byte[] bArr) throws InvalidProtocolBufferException {
        return (y0) GeneratedMessageLite.parseFrom(P, bArr);
    }

    public static y0 p5(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (y0) GeneratedMessageLite.parseFrom(P, bArr, extensionRegistryLite);
    }

    public static Parser<y0> parser() {
        return P.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q5(boolean z4) {
        this.f65301d = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r5(e.b bVar) {
        this.f65315r = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s4() {
        this.f65301d = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s5(e eVar) {
        Objects.requireNonNull(eVar);
        this.f65315r = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t4() {
        this.f65315r = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t5(g.b bVar) {
        this.f65309l = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u4() {
        this.f65309l = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u5(g gVar) {
        Objects.requireNonNull(gVar);
        this.f65309l = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v4() {
        this.f65310m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v5(m.b bVar) {
        this.f65310m = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w4() {
        this.f65303f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w5(m mVar) {
        Objects.requireNonNull(mVar);
        this.f65310m = mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x4() {
        this.f65311n = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x5(p.b bVar) {
        this.f65303f = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y4() {
        this.f65313p = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y5(p pVar) {
        Objects.requireNonNull(pVar);
        this.f65303f = pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z4() {
        this.f65306i = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z5(FriendAddReqNotification.b bVar) {
        this.f65311n = bVar.build();
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public boolean B0() {
        return this.f65309l != null;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public boolean C0() {
        return this.f65303f != null;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public boolean G2() {
        return this.f65316s != null;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public boolean H1() {
        return this.f65310m != null;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public boolean K1() {
        return this.f65314q != null;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public v L0() {
        v vVar = this.f65307j;
        return vVar == null ? v.f3() : vVar;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public q1 L1() {
        q1 q1Var = this.f65314q;
        return q1Var == null ? q1.e3() : q1Var;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public long O() {
        return this.f65300c;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public f1 P0() {
        f1 f1Var = this.f65318u;
        return f1Var == null ? f1.b3() : f1Var;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public long Q() {
        return this.f65299b;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public p S() {
        p pVar = this.f65303f;
        return pVar == null ? p.W2() : pVar;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public boolean S1() {
        return this.f65315r != null;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public boolean U2() {
        return this.f65311n != null;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public com.wufan.friend.chat.protocol.a V() {
        com.wufan.friend.chat.protocol.a aVar = this.f65302e;
        return aVar == null ? com.wufan.friend.chat.protocol.a.q3() : aVar;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public boolean W1() {
        return this.f65318u != null;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public boolean Z() {
        return this.f65308k != null;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public e Z1() {
        e eVar = this.f65315r;
        return eVar == null ? e.F3() : eVar;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public boolean a1() {
        return this.f65304g != null;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public l0 a2() {
        l0 l0Var = this.f65308k;
        return l0Var == null ? l0.a3() : l0Var;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public n0 c2() {
        n0 n0Var = this.f65312o;
        return n0Var == null ? n0.c3() : n0Var;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public t d1() {
        t tVar = this.f65313p;
        return tVar == null ? t.k3() : tVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z4 = false;
        switch (a.f65319a[methodToInvoke.ordinal()]) {
            case 1:
                return new y0();
            case 2:
                return P;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                y0 y0Var = (y0) obj2;
                long j4 = this.f65299b;
                boolean z5 = j4 != 0;
                long j5 = y0Var.f65299b;
                this.f65299b = visitor.visitLong(z5, j4, j5 != 0, j5);
                long j6 = this.f65300c;
                boolean z6 = j6 != 0;
                long j7 = y0Var.f65300c;
                this.f65300c = visitor.visitLong(z6, j6, j7 != 0, j7);
                boolean z7 = this.f65301d;
                boolean z8 = y0Var.f65301d;
                this.f65301d = visitor.visitBoolean(z7, z7, z8, z8);
                this.f65302e = (com.wufan.friend.chat.protocol.a) visitor.visitMessage(this.f65302e, y0Var.f65302e);
                this.f65303f = (p) visitor.visitMessage(this.f65303f, y0Var.f65303f);
                this.f65304g = (h1) visitor.visitMessage(this.f65304g, y0Var.f65304g);
                this.f65305h = (g0) visitor.visitMessage(this.f65305h, y0Var.f65305h);
                this.f65306i = (x) visitor.visitMessage(this.f65306i, y0Var.f65306i);
                this.f65307j = (v) visitor.visitMessage(this.f65307j, y0Var.f65307j);
                this.f65308k = (l0) visitor.visitMessage(this.f65308k, y0Var.f65308k);
                this.f65309l = (g) visitor.visitMessage(this.f65309l, y0Var.f65309l);
                this.f65310m = (m) visitor.visitMessage(this.f65310m, y0Var.f65310m);
                this.f65311n = (FriendAddReqNotification) visitor.visitMessage(this.f65311n, y0Var.f65311n);
                this.f65312o = (n0) visitor.visitMessage(this.f65312o, y0Var.f65312o);
                this.f65313p = (t) visitor.visitMessage(this.f65313p, y0Var.f65313p);
                this.f65314q = (q1) visitor.visitMessage(this.f65314q, y0Var.f65314q);
                this.f65315r = (e) visitor.visitMessage(this.f65315r, y0Var.f65315r);
                this.f65316s = (o1) visitor.visitMessage(this.f65316s, y0Var.f65316s);
                this.f65317t = (z) visitor.visitMessage(this.f65317t, y0Var.f65317t);
                this.f65318u = (f1) visitor.visitMessage(this.f65318u, y0Var.f65318u);
                GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
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
                                this.f65299b = codedInputStream.readInt64();
                                continue;
                            case 16:
                                this.f65300c = codedInputStream.readInt64();
                                continue;
                            case 24:
                                this.f65301d = codedInputStream.readBool();
                                continue;
                            case 34:
                                com.wufan.friend.chat.protocol.a aVar = this.f65302e;
                                a.b builder = aVar != null ? aVar.toBuilder() : null;
                                com.wufan.friend.chat.protocol.a aVar2 = (com.wufan.friend.chat.protocol.a) codedInputStream.readMessage(com.wufan.friend.chat.protocol.a.parser(), extensionRegistryLite);
                                this.f65302e = aVar2;
                                if (builder != null) {
                                    builder.mergeFrom((a.b) aVar2);
                                    this.f65302e = builder.buildPartial();
                                } else {
                                    continue;
                                }
                            case 42:
                                p pVar = this.f65303f;
                                p.b builder2 = pVar != null ? pVar.toBuilder() : null;
                                p pVar2 = (p) codedInputStream.readMessage(p.parser(), extensionRegistryLite);
                                this.f65303f = pVar2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((p.b) pVar2);
                                    this.f65303f = builder2.buildPartial();
                                } else {
                                    continue;
                                }
                            case 50:
                                h1 h1Var = this.f65304g;
                                h1.b builder3 = h1Var != null ? h1Var.toBuilder() : null;
                                h1 h1Var2 = (h1) codedInputStream.readMessage(h1.parser(), extensionRegistryLite);
                                this.f65304g = h1Var2;
                                if (builder3 != null) {
                                    builder3.mergeFrom((h1.b) h1Var2);
                                    this.f65304g = builder3.buildPartial();
                                } else {
                                    continue;
                                }
                            case 58:
                                g0 g0Var = this.f65305h;
                                g0.b builder4 = g0Var != null ? g0Var.toBuilder() : null;
                                g0 g0Var2 = (g0) codedInputStream.readMessage(g0.parser(), extensionRegistryLite);
                                this.f65305h = g0Var2;
                                if (builder4 != null) {
                                    builder4.mergeFrom((g0.b) g0Var2);
                                    this.f65305h = builder4.buildPartial();
                                } else {
                                    continue;
                                }
                            case 66:
                                x xVar = this.f65306i;
                                x.b builder5 = xVar != null ? xVar.toBuilder() : null;
                                x xVar2 = (x) codedInputStream.readMessage(x.parser(), extensionRegistryLite);
                                this.f65306i = xVar2;
                                if (builder5 != null) {
                                    builder5.mergeFrom((x.b) xVar2);
                                    this.f65306i = builder5.buildPartial();
                                } else {
                                    continue;
                                }
                            case 74:
                                v vVar = this.f65307j;
                                v.b builder6 = vVar != null ? vVar.toBuilder() : null;
                                v vVar2 = (v) codedInputStream.readMessage(v.parser(), extensionRegistryLite);
                                this.f65307j = vVar2;
                                if (builder6 != null) {
                                    builder6.mergeFrom((v.b) vVar2);
                                    this.f65307j = builder6.buildPartial();
                                } else {
                                    continue;
                                }
                            case 82:
                                l0 l0Var = this.f65308k;
                                l0.b builder7 = l0Var != null ? l0Var.toBuilder() : null;
                                l0 l0Var2 = (l0) codedInputStream.readMessage(l0.parser(), extensionRegistryLite);
                                this.f65308k = l0Var2;
                                if (builder7 != null) {
                                    builder7.mergeFrom((l0.b) l0Var2);
                                    this.f65308k = builder7.buildPartial();
                                } else {
                                    continue;
                                }
                            case 90:
                                g gVar = this.f65309l;
                                g.b builder8 = gVar != null ? gVar.toBuilder() : null;
                                g gVar2 = (g) codedInputStream.readMessage(g.parser(), extensionRegistryLite);
                                this.f65309l = gVar2;
                                if (builder8 != null) {
                                    builder8.mergeFrom((g.b) gVar2);
                                    this.f65309l = builder8.buildPartial();
                                } else {
                                    continue;
                                }
                            case 98:
                                m mVar = this.f65310m;
                                m.b builder9 = mVar != null ? mVar.toBuilder() : null;
                                m mVar2 = (m) codedInputStream.readMessage(m.parser(), extensionRegistryLite);
                                this.f65310m = mVar2;
                                if (builder9 != null) {
                                    builder9.mergeFrom((m.b) mVar2);
                                    this.f65310m = builder9.buildPartial();
                                } else {
                                    continue;
                                }
                            case 106:
                                FriendAddReqNotification friendAddReqNotification = this.f65311n;
                                FriendAddReqNotification.b builder10 = friendAddReqNotification != null ? friendAddReqNotification.toBuilder() : null;
                                FriendAddReqNotification friendAddReqNotification2 = (FriendAddReqNotification) codedInputStream.readMessage(FriendAddReqNotification.parser(), extensionRegistryLite);
                                this.f65311n = friendAddReqNotification2;
                                if (builder10 != null) {
                                    builder10.mergeFrom((FriendAddReqNotification.b) friendAddReqNotification2);
                                    this.f65311n = builder10.buildPartial();
                                } else {
                                    continue;
                                }
                            case 114:
                                n0 n0Var = this.f65312o;
                                n0.b builder11 = n0Var != null ? n0Var.toBuilder() : null;
                                n0 n0Var2 = (n0) codedInputStream.readMessage(n0.parser(), extensionRegistryLite);
                                this.f65312o = n0Var2;
                                if (builder11 != null) {
                                    builder11.mergeFrom((n0.b) n0Var2);
                                    this.f65312o = builder11.buildPartial();
                                } else {
                                    continue;
                                }
                            case 122:
                                t tVar = this.f65313p;
                                t.b builder12 = tVar != null ? tVar.toBuilder() : null;
                                t tVar2 = (t) codedInputStream.readMessage(t.parser(), extensionRegistryLite);
                                this.f65313p = tVar2;
                                if (builder12 != null) {
                                    builder12.mergeFrom((t.b) tVar2);
                                    this.f65313p = builder12.buildPartial();
                                } else {
                                    continue;
                                }
                            case 130:
                                q1 q1Var = this.f65314q;
                                q1.b builder13 = q1Var != null ? q1Var.toBuilder() : null;
                                q1 q1Var2 = (q1) codedInputStream.readMessage(q1.parser(), extensionRegistryLite);
                                this.f65314q = q1Var2;
                                if (builder13 != null) {
                                    builder13.mergeFrom((q1.b) q1Var2);
                                    this.f65314q = builder13.buildPartial();
                                } else {
                                    continue;
                                }
                            case 138:
                                e eVar = this.f65315r;
                                e.b builder14 = eVar != null ? eVar.toBuilder() : null;
                                e eVar2 = (e) codedInputStream.readMessage(e.parser(), extensionRegistryLite);
                                this.f65315r = eVar2;
                                if (builder14 != null) {
                                    builder14.mergeFrom((e.b) eVar2);
                                    this.f65315r = builder14.buildPartial();
                                } else {
                                    continue;
                                }
                            case 146:
                                o1 o1Var = this.f65316s;
                                o1.b builder15 = o1Var != null ? o1Var.toBuilder() : null;
                                o1 o1Var2 = (o1) codedInputStream.readMessage(o1.parser(), extensionRegistryLite);
                                this.f65316s = o1Var2;
                                if (builder15 != null) {
                                    builder15.mergeFrom((o1.b) o1Var2);
                                    this.f65316s = builder15.buildPartial();
                                } else {
                                    continue;
                                }
                            case 154:
                                z zVar = this.f65317t;
                                z.b builder16 = zVar != null ? zVar.toBuilder() : null;
                                z zVar2 = (z) codedInputStream.readMessage(z.parser(), extensionRegistryLite);
                                this.f65317t = zVar2;
                                if (builder16 != null) {
                                    builder16.mergeFrom((z.b) zVar2);
                                    this.f65317t = builder16.buildPartial();
                                } else {
                                    continue;
                                }
                            case 162:
                                f1 f1Var = this.f65318u;
                                f1.b builder17 = f1Var != null ? f1Var.toBuilder() : null;
                                f1 f1Var2 = (f1) codedInputStream.readMessage(f1.parser(), extensionRegistryLite);
                                this.f65318u = f1Var2;
                                if (builder17 != null) {
                                    builder17.mergeFrom((f1.b) f1Var2);
                                    this.f65318u = builder17.buildPartial();
                                } else {
                                    continue;
                                }
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
                if (Q == null) {
                    synchronized (y0.class) {
                        if (Q == null) {
                            Q = new GeneratedMessageLite.DefaultInstanceBasedParser(P);
                        }
                    }
                }
                return Q;
            default:
                throw new UnsupportedOperationException();
        }
        return P;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public z g2() {
        z zVar = this.f65317t;
        return zVar == null ? z.Z2() : zVar;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        long j4 = this.f65299b;
        int computeInt64Size = j4 != 0 ? 0 + CodedOutputStream.computeInt64Size(1, j4) : 0;
        long j5 = this.f65300c;
        if (j5 != 0) {
            computeInt64Size += CodedOutputStream.computeInt64Size(2, j5);
        }
        boolean z4 = this.f65301d;
        if (z4) {
            computeInt64Size += CodedOutputStream.computeBoolSize(3, z4);
        }
        if (this.f65302e != null) {
            computeInt64Size += CodedOutputStream.computeMessageSize(4, V());
        }
        if (this.f65303f != null) {
            computeInt64Size += CodedOutputStream.computeMessageSize(5, S());
        }
        if (this.f65304g != null) {
            computeInt64Size += CodedOutputStream.computeMessageSize(6, j2());
        }
        if (this.f65305h != null) {
            computeInt64Size += CodedOutputStream.computeMessageSize(7, i1());
        }
        if (this.f65306i != null) {
            computeInt64Size += CodedOutputStream.computeMessageSize(8, m2());
        }
        if (this.f65307j != null) {
            computeInt64Size += CodedOutputStream.computeMessageSize(9, L0());
        }
        if (this.f65308k != null) {
            computeInt64Size += CodedOutputStream.computeMessageSize(10, a2());
        }
        if (this.f65309l != null) {
            computeInt64Size += CodedOutputStream.computeMessageSize(11, u0());
        }
        if (this.f65310m != null) {
            computeInt64Size += CodedOutputStream.computeMessageSize(12, s0());
        }
        if (this.f65311n != null) {
            computeInt64Size += CodedOutputStream.computeMessageSize(13, w1());
        }
        if (this.f65312o != null) {
            computeInt64Size += CodedOutputStream.computeMessageSize(14, c2());
        }
        if (this.f65313p != null) {
            computeInt64Size += CodedOutputStream.computeMessageSize(15, d1());
        }
        if (this.f65314q != null) {
            computeInt64Size += CodedOutputStream.computeMessageSize(16, L1());
        }
        if (this.f65315r != null) {
            computeInt64Size += CodedOutputStream.computeMessageSize(17, Z1());
        }
        if (this.f65316s != null) {
            computeInt64Size += CodedOutputStream.computeMessageSize(18, r1());
        }
        if (this.f65317t != null) {
            computeInt64Size += CodedOutputStream.computeMessageSize(19, g2());
        }
        if (this.f65318u != null) {
            computeInt64Size += CodedOutputStream.computeMessageSize(20, P0());
        }
        this.memoizedSerializedSize = computeInt64Size;
        return computeInt64Size;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public boolean h2() {
        return this.f65307j != null;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public g0 i1() {
        g0 g0Var = this.f65305h;
        return g0Var == null ? g0.B3() : g0Var;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public boolean i2() {
        return this.f65305h != null;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public h1 j2() {
        h1 h1Var = this.f65304g;
        return h1Var == null ? h1.W2() : h1Var;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public x m2() {
        x xVar = this.f65306i;
        return xVar == null ? x.j3() : xVar;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public boolean n1() {
        return this.f65301d;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public boolean o2() {
        return this.f65302e != null;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public o1 r1() {
        o1 o1Var = this.f65316s;
        return o1Var == null ? o1.j3() : o1Var;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public m s0() {
        m mVar = this.f65310m;
        return mVar == null ? m.g3() : mVar;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public boolean s1() {
        return this.f65313p != null;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public boolean s2() {
        return this.f65306i != null;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public g u0() {
        g gVar = this.f65309l;
        return gVar == null ? g.p3() : gVar;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public boolean u2() {
        return this.f65317t != null;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public boolean v2() {
        return this.f65312o != null;
    }

    @Override // com.wufan.friend.chat.protocol.z0
    public FriendAddReqNotification w1() {
        FriendAddReqNotification friendAddReqNotification = this.f65311n;
        return friendAddReqNotification == null ? FriendAddReqNotification.e3() : friendAddReqNotification;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j4 = this.f65299b;
        if (j4 != 0) {
            codedOutputStream.writeInt64(1, j4);
        }
        long j5 = this.f65300c;
        if (j5 != 0) {
            codedOutputStream.writeInt64(2, j5);
        }
        boolean z4 = this.f65301d;
        if (z4) {
            codedOutputStream.writeBool(3, z4);
        }
        if (this.f65302e != null) {
            codedOutputStream.writeMessage(4, V());
        }
        if (this.f65303f != null) {
            codedOutputStream.writeMessage(5, S());
        }
        if (this.f65304g != null) {
            codedOutputStream.writeMessage(6, j2());
        }
        if (this.f65305h != null) {
            codedOutputStream.writeMessage(7, i1());
        }
        if (this.f65306i != null) {
            codedOutputStream.writeMessage(8, m2());
        }
        if (this.f65307j != null) {
            codedOutputStream.writeMessage(9, L0());
        }
        if (this.f65308k != null) {
            codedOutputStream.writeMessage(10, a2());
        }
        if (this.f65309l != null) {
            codedOutputStream.writeMessage(11, u0());
        }
        if (this.f65310m != null) {
            codedOutputStream.writeMessage(12, s0());
        }
        if (this.f65311n != null) {
            codedOutputStream.writeMessage(13, w1());
        }
        if (this.f65312o != null) {
            codedOutputStream.writeMessage(14, c2());
        }
        if (this.f65313p != null) {
            codedOutputStream.writeMessage(15, d1());
        }
        if (this.f65314q != null) {
            codedOutputStream.writeMessage(16, L1());
        }
        if (this.f65315r != null) {
            codedOutputStream.writeMessage(17, Z1());
        }
        if (this.f65316s != null) {
            codedOutputStream.writeMessage(18, r1());
        }
        if (this.f65317t != null) {
            codedOutputStream.writeMessage(19, g2());
        }
        if (this.f65318u != null) {
            codedOutputStream.writeMessage(20, P0());
        }
    }
}
