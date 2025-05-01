package com.wufan.friend.chat.protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.wufan.friend.chat.protocol.ChatRoomArgs;
import com.wufan.friend.chat.protocol.HeartArgs;
import com.wufan.friend.chat.protocol.PlayGameArgs;
import com.wufan.friend.chat.protocol.RecommendPlayerArgs;
import com.wufan.friend.chat.protocol.a1;
import com.wufan.friend.chat.protocol.c;
import com.wufan.friend.chat.protocol.e0;
import com.wufan.friend.chat.protocol.i;
import com.wufan.friend.chat.protocol.i0;
import com.wufan.friend.chat.protocol.t0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* compiled from: RequestArgs.java */
/* loaded from: classes6.dex */
public final class t1 extends GeneratedMessageLite<t1, b> implements u1 {

    /* renamed from: l  reason: collision with root package name */
    public static final int f65212l = 1;

    /* renamed from: m  reason: collision with root package name */
    public static final int f65213m = 2;

    /* renamed from: n  reason: collision with root package name */
    public static final int f65214n = 3;

    /* renamed from: o  reason: collision with root package name */
    public static final int f65215o = 4;

    /* renamed from: p  reason: collision with root package name */
    public static final int f65216p = 5;

    /* renamed from: q  reason: collision with root package name */
    public static final int f65217q = 6;

    /* renamed from: r  reason: collision with root package name */
    public static final int f65218r = 7;

    /* renamed from: s  reason: collision with root package name */
    public static final int f65219s = 8;

    /* renamed from: t  reason: collision with root package name */
    public static final int f65220t = 9;

    /* renamed from: u  reason: collision with root package name */
    public static final int f65221u = 10;

    /* renamed from: v  reason: collision with root package name */
    private static final t1 f65222v;

    /* renamed from: w  reason: collision with root package name */
    private static volatile Parser<t1> f65223w;

    /* renamed from: b  reason: collision with root package name */
    private t0 f65224b;

    /* renamed from: c  reason: collision with root package name */
    private c f65225c;

    /* renamed from: d  reason: collision with root package name */
    private HeartArgs f65226d;

    /* renamed from: e  reason: collision with root package name */
    private e0 f65227e;

    /* renamed from: f  reason: collision with root package name */
    private a1 f65228f;

    /* renamed from: g  reason: collision with root package name */
    private PlayGameArgs f65229g;

    /* renamed from: h  reason: collision with root package name */
    private ChatRoomArgs f65230h;

    /* renamed from: i  reason: collision with root package name */
    private i f65231i;

    /* renamed from: j  reason: collision with root package name */
    private RecommendPlayerArgs f65232j;

    /* renamed from: k  reason: collision with root package name */
    private i0 f65233k;

    /* compiled from: RequestArgs.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65234a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65234a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65234a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65234a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65234a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65234a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65234a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65234a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65234a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: RequestArgs.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<t1, b> implements u1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.friend.chat.protocol.u1
        public boolean A1() {
            return ((t1) this.instance).A1();
        }

        public b A3(t0.b bVar) {
            copyOnWrite();
            ((t1) this.instance).D4(bVar);
            return this;
        }

        public b B3(t0 t0Var) {
            copyOnWrite();
            ((t1) this.instance).E4(t0Var);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.u1
        public ChatRoomArgs C1() {
            return ((t1) this.instance).C1();
        }

        @Override // com.wufan.friend.chat.protocol.u1
        public HeartArgs C2() {
            return ((t1) this.instance).C2();
        }

        public b C3(PlayGameArgs.b bVar) {
            copyOnWrite();
            ((t1) this.instance).F4(bVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.u1
        public boolean D2() {
            return ((t1) this.instance).D2();
        }

        public b D3(PlayGameArgs playGameArgs) {
            copyOnWrite();
            ((t1) this.instance).G4(playGameArgs);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.u1
        public boolean E2() {
            return ((t1) this.instance).E2();
        }

        public b E3(RecommendPlayerArgs.b bVar) {
            copyOnWrite();
            ((t1) this.instance).H4(bVar);
            return this;
        }

        public b F3(RecommendPlayerArgs recommendPlayerArgs) {
            copyOnWrite();
            ((t1) this.instance).I4(recommendPlayerArgs);
            return this;
        }

        public b G3(a1.b bVar) {
            copyOnWrite();
            ((t1) this.instance).J4(bVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.u1
        public PlayGameArgs H0() {
            return ((t1) this.instance).H0();
        }

        public b H3(a1 a1Var) {
            copyOnWrite();
            ((t1) this.instance).K4(a1Var);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.u1
        public boolean I0() {
            return ((t1) this.instance).I0();
        }

        @Override // com.wufan.friend.chat.protocol.u1
        public RecommendPlayerArgs I2() {
            return ((t1) this.instance).I2();
        }

        @Override // com.wufan.friend.chat.protocol.u1
        public e0 J0() {
            return ((t1) this.instance).J0();
        }

        @Override // com.wufan.friend.chat.protocol.u1
        public i0 J2() {
            return ((t1) this.instance).J2();
        }

        @Override // com.wufan.friend.chat.protocol.u1
        public t0 M0() {
            return ((t1) this.instance).M0();
        }

        @Override // com.wufan.friend.chat.protocol.u1
        public a1 N0() {
            return ((t1) this.instance).N0();
        }

        @Override // com.wufan.friend.chat.protocol.u1
        public i N2() {
            return ((t1) this.instance).N2();
        }

        @Override // com.wufan.friend.chat.protocol.u1
        public c P2() {
            return ((t1) this.instance).P2();
        }

        @Override // com.wufan.friend.chat.protocol.u1
        public boolean T1() {
            return ((t1) this.instance).T1();
        }

        @Override // com.wufan.friend.chat.protocol.u1
        public boolean T2() {
            return ((t1) this.instance).T2();
        }

        @Override // com.wufan.friend.chat.protocol.u1
        public boolean U1() {
            return ((t1) this.instance).U1();
        }

        public b V2() {
            copyOnWrite();
            ((t1) this.instance).L3();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((t1) this.instance).M3();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((t1) this.instance).K3();
            return this;
        }

        public b X2() {
            copyOnWrite();
            ((t1) this.instance).N3();
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.u1
        public boolean Y1() {
            return ((t1) this.instance).Y1();
        }

        public b Y2() {
            copyOnWrite();
            ((t1) this.instance).O3();
            return this;
        }

        public b Z2() {
            copyOnWrite();
            ((t1) this.instance).P3();
            return this;
        }

        public b a3() {
            copyOnWrite();
            ((t1) this.instance).Q3();
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.u1
        public boolean b0() {
            return ((t1) this.instance).b0();
        }

        public b b3() {
            copyOnWrite();
            ((t1) this.instance).R3();
            return this;
        }

        public b c3() {
            copyOnWrite();
            ((t1) this.instance).S3();
            return this;
        }

        public b d3() {
            copyOnWrite();
            ((t1) this.instance).T3();
            return this;
        }

        public b e3(c cVar) {
            copyOnWrite();
            ((t1) this.instance).V3(cVar);
            return this;
        }

        public b f3(i iVar) {
            copyOnWrite();
            ((t1) this.instance).W3(iVar);
            return this;
        }

        public b g3(ChatRoomArgs chatRoomArgs) {
            copyOnWrite();
            ((t1) this.instance).X3(chatRoomArgs);
            return this;
        }

        public b h3(e0 e0Var) {
            copyOnWrite();
            ((t1) this.instance).Y3(e0Var);
            return this;
        }

        public b i3(HeartArgs heartArgs) {
            copyOnWrite();
            ((t1) this.instance).Z3(heartArgs);
            return this;
        }

        public b j3(i0 i0Var) {
            copyOnWrite();
            ((t1) this.instance).a4(i0Var);
            return this;
        }

        public b k3(t0 t0Var) {
            copyOnWrite();
            ((t1) this.instance).b4(t0Var);
            return this;
        }

        public b l3(PlayGameArgs playGameArgs) {
            copyOnWrite();
            ((t1) this.instance).c4(playGameArgs);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.u1
        public boolean m0() {
            return ((t1) this.instance).m0();
        }

        public b m3(RecommendPlayerArgs recommendPlayerArgs) {
            copyOnWrite();
            ((t1) this.instance).d4(recommendPlayerArgs);
            return this;
        }

        public b n3(a1 a1Var) {
            copyOnWrite();
            ((t1) this.instance).e4(a1Var);
            return this;
        }

        public b o3(c.b bVar) {
            copyOnWrite();
            ((t1) this.instance).r4(bVar);
            return this;
        }

        public b p3(c cVar) {
            copyOnWrite();
            ((t1) this.instance).s4(cVar);
            return this;
        }

        public b q3(i.b bVar) {
            copyOnWrite();
            ((t1) this.instance).t4(bVar);
            return this;
        }

        public b r3(i iVar) {
            copyOnWrite();
            ((t1) this.instance).u4(iVar);
            return this;
        }

        public b s3(ChatRoomArgs.b bVar) {
            copyOnWrite();
            ((t1) this.instance).v4(bVar);
            return this;
        }

        public b t3(ChatRoomArgs chatRoomArgs) {
            copyOnWrite();
            ((t1) this.instance).w4(chatRoomArgs);
            return this;
        }

        public b u3(e0.b bVar) {
            copyOnWrite();
            ((t1) this.instance).x4(bVar);
            return this;
        }

        public b v3(e0 e0Var) {
            copyOnWrite();
            ((t1) this.instance).y4(e0Var);
            return this;
        }

        public b w3(HeartArgs.b bVar) {
            copyOnWrite();
            ((t1) this.instance).z4(bVar);
            return this;
        }

        public b x3(HeartArgs heartArgs) {
            copyOnWrite();
            ((t1) this.instance).A4(heartArgs);
            return this;
        }

        public b y3(i0.b bVar) {
            copyOnWrite();
            ((t1) this.instance).B4(bVar);
            return this;
        }

        public b z3(i0 i0Var) {
            copyOnWrite();
            ((t1) this.instance).C4(i0Var);
            return this;
        }

        private b() {
            super(t1.f65222v);
        }
    }

    static {
        t1 t1Var = new t1();
        f65222v = t1Var;
        t1Var.makeImmutable();
    }

    private t1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A4(HeartArgs heartArgs) {
        Objects.requireNonNull(heartArgs);
        this.f65226d = heartArgs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B4(i0.b bVar) {
        this.f65233k = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C4(i0 i0Var) {
        Objects.requireNonNull(i0Var);
        this.f65233k = i0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D4(t0.b bVar) {
        this.f65224b = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E4(t0 t0Var) {
        Objects.requireNonNull(t0Var);
        this.f65224b = t0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F4(PlayGameArgs.b bVar) {
        this.f65229g = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G4(PlayGameArgs playGameArgs) {
        Objects.requireNonNull(playGameArgs);
        this.f65229g = playGameArgs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H4(RecommendPlayerArgs.b bVar) {
        this.f65232j = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I4(RecommendPlayerArgs recommendPlayerArgs) {
        Objects.requireNonNull(recommendPlayerArgs);
        this.f65232j = recommendPlayerArgs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J4(a1.b bVar) {
        this.f65228f = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K3() {
        this.f65225c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K4(a1 a1Var) {
        Objects.requireNonNull(a1Var);
        this.f65228f = a1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L3() {
        this.f65231i = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M3() {
        this.f65230h = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N3() {
        this.f65227e = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O3() {
        this.f65226d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P3() {
        this.f65233k = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q3() {
        this.f65224b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R3() {
        this.f65229g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S3() {
        this.f65232j = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T3() {
        this.f65228f = null;
    }

    public static t1 U3() {
        return f65222v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V3(c cVar) {
        c cVar2 = this.f65225c;
        if (cVar2 != null && cVar2 != c.g3()) {
            this.f65225c = c.i3(this.f65225c).mergeFrom((c.b) cVar).buildPartial();
        } else {
            this.f65225c = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W3(i iVar) {
        i iVar2 = this.f65231i;
        if (iVar2 != null && iVar2 != i.Z2()) {
            this.f65231i = i.b3(this.f65231i).mergeFrom((i.b) iVar).buildPartial();
        } else {
            this.f65231i = iVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X3(ChatRoomArgs chatRoomArgs) {
        ChatRoomArgs chatRoomArgs2 = this.f65230h;
        if (chatRoomArgs2 != null && chatRoomArgs2 != ChatRoomArgs.f3()) {
            this.f65230h = ChatRoomArgs.h3(this.f65230h).mergeFrom((ChatRoomArgs.b) chatRoomArgs).buildPartial();
        } else {
            this.f65230h = chatRoomArgs;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y3(e0 e0Var) {
        e0 e0Var2 = this.f65227e;
        if (e0Var2 != null && e0Var2 != e0.o3()) {
            this.f65227e = e0.q3(this.f65227e).mergeFrom((e0.b) e0Var).buildPartial();
        } else {
            this.f65227e = e0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z3(HeartArgs heartArgs) {
        HeartArgs heartArgs2 = this.f65226d;
        if (heartArgs2 != null && heartArgs2 != HeartArgs.Z2()) {
            this.f65226d = HeartArgs.b3(this.f65226d).mergeFrom((HeartArgs.b) heartArgs).buildPartial();
        } else {
            this.f65226d = heartArgs;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a4(i0 i0Var) {
        i0 i0Var2 = this.f65233k;
        if (i0Var2 != null && i0Var2 != i0.b3()) {
            this.f65233k = i0.d3(this.f65233k).mergeFrom((i0.b) i0Var).buildPartial();
        } else {
            this.f65233k = i0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b4(t0 t0Var) {
        t0 t0Var2 = this.f65224b;
        if (t0Var2 != null && t0Var2 != t0.f3()) {
            this.f65224b = t0.h3(this.f65224b).mergeFrom((t0.b) t0Var).buildPartial();
        } else {
            this.f65224b = t0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c4(PlayGameArgs playGameArgs) {
        PlayGameArgs playGameArgs2 = this.f65229g;
        if (playGameArgs2 != null && playGameArgs2 != PlayGameArgs.v3()) {
            this.f65229g = PlayGameArgs.x3(this.f65229g).mergeFrom((PlayGameArgs.b) playGameArgs).buildPartial();
        } else {
            this.f65229g = playGameArgs;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d4(RecommendPlayerArgs recommendPlayerArgs) {
        RecommendPlayerArgs recommendPlayerArgs2 = this.f65232j;
        if (recommendPlayerArgs2 != null && recommendPlayerArgs2 != RecommendPlayerArgs.o3()) {
            this.f65232j = RecommendPlayerArgs.q3(this.f65232j).mergeFrom((RecommendPlayerArgs.b) recommendPlayerArgs).buildPartial();
        } else {
            this.f65232j = recommendPlayerArgs;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e4(a1 a1Var) {
        a1 a1Var2 = this.f65228f;
        if (a1Var2 != null && a1Var2 != a1.Z2()) {
            this.f65228f = a1.b3(this.f65228f).mergeFrom((a1.b) a1Var).buildPartial();
        } else {
            this.f65228f = a1Var;
        }
    }

    public static b f4() {
        return f65222v.toBuilder();
    }

    public static b g4(t1 t1Var) {
        return f65222v.toBuilder().mergeFrom((b) t1Var);
    }

    public static t1 h4(InputStream inputStream) throws IOException {
        return (t1) GeneratedMessageLite.parseDelimitedFrom(f65222v, inputStream);
    }

    public static t1 i4(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (t1) GeneratedMessageLite.parseDelimitedFrom(f65222v, inputStream, extensionRegistryLite);
    }

    public static t1 j4(ByteString byteString) throws InvalidProtocolBufferException {
        return (t1) GeneratedMessageLite.parseFrom(f65222v, byteString);
    }

    public static t1 k4(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (t1) GeneratedMessageLite.parseFrom(f65222v, byteString, extensionRegistryLite);
    }

    public static t1 l4(CodedInputStream codedInputStream) throws IOException {
        return (t1) GeneratedMessageLite.parseFrom(f65222v, codedInputStream);
    }

    public static t1 m4(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (t1) GeneratedMessageLite.parseFrom(f65222v, codedInputStream, extensionRegistryLite);
    }

    public static t1 n4(InputStream inputStream) throws IOException {
        return (t1) GeneratedMessageLite.parseFrom(f65222v, inputStream);
    }

    public static t1 o4(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (t1) GeneratedMessageLite.parseFrom(f65222v, inputStream, extensionRegistryLite);
    }

    public static t1 p4(byte[] bArr) throws InvalidProtocolBufferException {
        return (t1) GeneratedMessageLite.parseFrom(f65222v, bArr);
    }

    public static Parser<t1> parser() {
        return f65222v.getParserForType();
    }

    public static t1 q4(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (t1) GeneratedMessageLite.parseFrom(f65222v, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r4(c.b bVar) {
        this.f65225c = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s4(c cVar) {
        Objects.requireNonNull(cVar);
        this.f65225c = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t4(i.b bVar) {
        this.f65231i = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u4(i iVar) {
        Objects.requireNonNull(iVar);
        this.f65231i = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v4(ChatRoomArgs.b bVar) {
        this.f65230h = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w4(ChatRoomArgs chatRoomArgs) {
        Objects.requireNonNull(chatRoomArgs);
        this.f65230h = chatRoomArgs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x4(e0.b bVar) {
        this.f65227e = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y4(e0 e0Var) {
        Objects.requireNonNull(e0Var);
        this.f65227e = e0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z4(HeartArgs.b bVar) {
        this.f65226d = bVar.build();
    }

    @Override // com.wufan.friend.chat.protocol.u1
    public boolean A1() {
        return this.f65231i != null;
    }

    @Override // com.wufan.friend.chat.protocol.u1
    public ChatRoomArgs C1() {
        ChatRoomArgs chatRoomArgs = this.f65230h;
        return chatRoomArgs == null ? ChatRoomArgs.f3() : chatRoomArgs;
    }

    @Override // com.wufan.friend.chat.protocol.u1
    public HeartArgs C2() {
        HeartArgs heartArgs = this.f65226d;
        return heartArgs == null ? HeartArgs.Z2() : heartArgs;
    }

    @Override // com.wufan.friend.chat.protocol.u1
    public boolean D2() {
        return this.f65224b != null;
    }

    @Override // com.wufan.friend.chat.protocol.u1
    public boolean E2() {
        return this.f65232j != null;
    }

    @Override // com.wufan.friend.chat.protocol.u1
    public PlayGameArgs H0() {
        PlayGameArgs playGameArgs = this.f65229g;
        return playGameArgs == null ? PlayGameArgs.v3() : playGameArgs;
    }

    @Override // com.wufan.friend.chat.protocol.u1
    public boolean I0() {
        return this.f65230h != null;
    }

    @Override // com.wufan.friend.chat.protocol.u1
    public RecommendPlayerArgs I2() {
        RecommendPlayerArgs recommendPlayerArgs = this.f65232j;
        return recommendPlayerArgs == null ? RecommendPlayerArgs.o3() : recommendPlayerArgs;
    }

    @Override // com.wufan.friend.chat.protocol.u1
    public e0 J0() {
        e0 e0Var = this.f65227e;
        return e0Var == null ? e0.o3() : e0Var;
    }

    @Override // com.wufan.friend.chat.protocol.u1
    public i0 J2() {
        i0 i0Var = this.f65233k;
        return i0Var == null ? i0.b3() : i0Var;
    }

    @Override // com.wufan.friend.chat.protocol.u1
    public t0 M0() {
        t0 t0Var = this.f65224b;
        return t0Var == null ? t0.f3() : t0Var;
    }

    @Override // com.wufan.friend.chat.protocol.u1
    public a1 N0() {
        a1 a1Var = this.f65228f;
        return a1Var == null ? a1.Z2() : a1Var;
    }

    @Override // com.wufan.friend.chat.protocol.u1
    public i N2() {
        i iVar = this.f65231i;
        return iVar == null ? i.Z2() : iVar;
    }

    @Override // com.wufan.friend.chat.protocol.u1
    public c P2() {
        c cVar = this.f65225c;
        return cVar == null ? c.g3() : cVar;
    }

    @Override // com.wufan.friend.chat.protocol.u1
    public boolean T1() {
        return this.f65229g != null;
    }

    @Override // com.wufan.friend.chat.protocol.u1
    public boolean T2() {
        return this.f65233k != null;
    }

    @Override // com.wufan.friend.chat.protocol.u1
    public boolean U1() {
        return this.f65226d != null;
    }

    @Override // com.wufan.friend.chat.protocol.u1
    public boolean Y1() {
        return this.f65228f != null;
    }

    @Override // com.wufan.friend.chat.protocol.u1
    public boolean b0() {
        return this.f65227e != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65234a[methodToInvoke.ordinal()]) {
            case 1:
                return new t1();
            case 2:
                return f65222v;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                t1 t1Var = (t1) obj2;
                this.f65224b = (t0) visitor.visitMessage(this.f65224b, t1Var.f65224b);
                this.f65225c = (c) visitor.visitMessage(this.f65225c, t1Var.f65225c);
                this.f65226d = (HeartArgs) visitor.visitMessage(this.f65226d, t1Var.f65226d);
                this.f65227e = (e0) visitor.visitMessage(this.f65227e, t1Var.f65227e);
                this.f65228f = (a1) visitor.visitMessage(this.f65228f, t1Var.f65228f);
                this.f65229g = (PlayGameArgs) visitor.visitMessage(this.f65229g, t1Var.f65229g);
                this.f65230h = (ChatRoomArgs) visitor.visitMessage(this.f65230h, t1Var.f65230h);
                this.f65231i = (i) visitor.visitMessage(this.f65231i, t1Var.f65231i);
                this.f65232j = (RecommendPlayerArgs) visitor.visitMessage(this.f65232j, t1Var.f65232j);
                this.f65233k = (i0) visitor.visitMessage(this.f65233k, t1Var.f65233k);
                GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z4 = false;
                while (!z4) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                break;
                            case 10:
                                t0 t0Var = this.f65224b;
                                t0.b builder = t0Var != null ? t0Var.toBuilder() : null;
                                t0 t0Var2 = (t0) codedInputStream.readMessage(t0.parser(), extensionRegistryLite);
                                this.f65224b = t0Var2;
                                if (builder != null) {
                                    builder.mergeFrom((t0.b) t0Var2);
                                    this.f65224b = builder.buildPartial();
                                } else {
                                    continue;
                                }
                            case 18:
                                c cVar = this.f65225c;
                                c.b builder2 = cVar != null ? cVar.toBuilder() : null;
                                c cVar2 = (c) codedInputStream.readMessage(c.parser(), extensionRegistryLite);
                                this.f65225c = cVar2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((c.b) cVar2);
                                    this.f65225c = builder2.buildPartial();
                                } else {
                                    continue;
                                }
                            case 26:
                                HeartArgs heartArgs = this.f65226d;
                                HeartArgs.b builder3 = heartArgs != null ? heartArgs.toBuilder() : null;
                                HeartArgs heartArgs2 = (HeartArgs) codedInputStream.readMessage(HeartArgs.parser(), extensionRegistryLite);
                                this.f65226d = heartArgs2;
                                if (builder3 != null) {
                                    builder3.mergeFrom((HeartArgs.b) heartArgs2);
                                    this.f65226d = builder3.buildPartial();
                                } else {
                                    continue;
                                }
                            case 34:
                                e0 e0Var = this.f65227e;
                                e0.b builder4 = e0Var != null ? e0Var.toBuilder() : null;
                                e0 e0Var2 = (e0) codedInputStream.readMessage(e0.parser(), extensionRegistryLite);
                                this.f65227e = e0Var2;
                                if (builder4 != null) {
                                    builder4.mergeFrom((e0.b) e0Var2);
                                    this.f65227e = builder4.buildPartial();
                                } else {
                                    continue;
                                }
                            case 42:
                                a1 a1Var = this.f65228f;
                                a1.b builder5 = a1Var != null ? a1Var.toBuilder() : null;
                                a1 a1Var2 = (a1) codedInputStream.readMessage(a1.parser(), extensionRegistryLite);
                                this.f65228f = a1Var2;
                                if (builder5 != null) {
                                    builder5.mergeFrom((a1.b) a1Var2);
                                    this.f65228f = builder5.buildPartial();
                                } else {
                                    continue;
                                }
                            case 50:
                                PlayGameArgs playGameArgs = this.f65229g;
                                PlayGameArgs.b builder6 = playGameArgs != null ? playGameArgs.toBuilder() : null;
                                PlayGameArgs playGameArgs2 = (PlayGameArgs) codedInputStream.readMessage(PlayGameArgs.parser(), extensionRegistryLite);
                                this.f65229g = playGameArgs2;
                                if (builder6 != null) {
                                    builder6.mergeFrom((PlayGameArgs.b) playGameArgs2);
                                    this.f65229g = builder6.buildPartial();
                                } else {
                                    continue;
                                }
                            case 58:
                                ChatRoomArgs chatRoomArgs = this.f65230h;
                                ChatRoomArgs.b builder7 = chatRoomArgs != null ? chatRoomArgs.toBuilder() : null;
                                ChatRoomArgs chatRoomArgs2 = (ChatRoomArgs) codedInputStream.readMessage(ChatRoomArgs.parser(), extensionRegistryLite);
                                this.f65230h = chatRoomArgs2;
                                if (builder7 != null) {
                                    builder7.mergeFrom((ChatRoomArgs.b) chatRoomArgs2);
                                    this.f65230h = builder7.buildPartial();
                                } else {
                                    continue;
                                }
                            case 66:
                                i iVar = this.f65231i;
                                i.b builder8 = iVar != null ? iVar.toBuilder() : null;
                                i iVar2 = (i) codedInputStream.readMessage(i.parser(), extensionRegistryLite);
                                this.f65231i = iVar2;
                                if (builder8 != null) {
                                    builder8.mergeFrom((i.b) iVar2);
                                    this.f65231i = builder8.buildPartial();
                                } else {
                                    continue;
                                }
                            case 74:
                                RecommendPlayerArgs recommendPlayerArgs = this.f65232j;
                                RecommendPlayerArgs.b builder9 = recommendPlayerArgs != null ? recommendPlayerArgs.toBuilder() : null;
                                RecommendPlayerArgs recommendPlayerArgs2 = (RecommendPlayerArgs) codedInputStream.readMessage(RecommendPlayerArgs.parser(), extensionRegistryLite);
                                this.f65232j = recommendPlayerArgs2;
                                if (builder9 != null) {
                                    builder9.mergeFrom((RecommendPlayerArgs.b) recommendPlayerArgs2);
                                    this.f65232j = builder9.buildPartial();
                                } else {
                                    continue;
                                }
                            case 82:
                                i0 i0Var = this.f65233k;
                                i0.b builder10 = i0Var != null ? i0Var.toBuilder() : null;
                                i0 i0Var2 = (i0) codedInputStream.readMessage(i0.parser(), extensionRegistryLite);
                                this.f65233k = i0Var2;
                                if (builder10 != null) {
                                    builder10.mergeFrom((i0.b) i0Var2);
                                    this.f65233k = builder10.buildPartial();
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
                if (f65223w == null) {
                    synchronized (t1.class) {
                        if (f65223w == null) {
                            f65223w = new GeneratedMessageLite.DefaultInstanceBasedParser(f65222v);
                        }
                    }
                }
                return f65223w;
            default:
                throw new UnsupportedOperationException();
        }
        return f65222v;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int computeMessageSize = this.f65224b != null ? 0 + CodedOutputStream.computeMessageSize(1, M0()) : 0;
        if (this.f65225c != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(2, P2());
        }
        if (this.f65226d != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(3, C2());
        }
        if (this.f65227e != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(4, J0());
        }
        if (this.f65228f != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(5, N0());
        }
        if (this.f65229g != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(6, H0());
        }
        if (this.f65230h != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(7, C1());
        }
        if (this.f65231i != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(8, N2());
        }
        if (this.f65232j != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(9, I2());
        }
        if (this.f65233k != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(10, J2());
        }
        this.memoizedSerializedSize = computeMessageSize;
        return computeMessageSize;
    }

    @Override // com.wufan.friend.chat.protocol.u1
    public boolean m0() {
        return this.f65225c != null;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f65224b != null) {
            codedOutputStream.writeMessage(1, M0());
        }
        if (this.f65225c != null) {
            codedOutputStream.writeMessage(2, P2());
        }
        if (this.f65226d != null) {
            codedOutputStream.writeMessage(3, C2());
        }
        if (this.f65227e != null) {
            codedOutputStream.writeMessage(4, J0());
        }
        if (this.f65228f != null) {
            codedOutputStream.writeMessage(5, N0());
        }
        if (this.f65229g != null) {
            codedOutputStream.writeMessage(6, H0());
        }
        if (this.f65230h != null) {
            codedOutputStream.writeMessage(7, C1());
        }
        if (this.f65231i != null) {
            codedOutputStream.writeMessage(8, N2());
        }
        if (this.f65232j != null) {
            codedOutputStream.writeMessage(9, I2());
        }
        if (this.f65233k != null) {
            codedOutputStream.writeMessage(10, J2());
        }
    }
}
