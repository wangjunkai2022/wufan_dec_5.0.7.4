package com.wufan.friend.chat.protocol;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* compiled from: GameInviteNotification.java */
/* loaded from: classes6.dex */
public final class g0 extends GeneratedMessageLite<g0, b> implements h0 {

    /* renamed from: l  reason: collision with root package name */
    public static final int f65047l = 1;

    /* renamed from: m  reason: collision with root package name */
    public static final int f65048m = 2;

    /* renamed from: n  reason: collision with root package name */
    public static final int f65049n = 3;

    /* renamed from: o  reason: collision with root package name */
    public static final int f65050o = 4;

    /* renamed from: p  reason: collision with root package name */
    public static final int f65051p = 5;

    /* renamed from: q  reason: collision with root package name */
    public static final int f65052q = 6;

    /* renamed from: r  reason: collision with root package name */
    public static final int f65053r = 7;

    /* renamed from: s  reason: collision with root package name */
    public static final int f65054s = 8;

    /* renamed from: t  reason: collision with root package name */
    public static final int f65055t = 9;

    /* renamed from: u  reason: collision with root package name */
    public static final int f65056u = 10;

    /* renamed from: v  reason: collision with root package name */
    private static final g0 f65057v;

    /* renamed from: w  reason: collision with root package name */
    private static volatile Parser<g0> f65058w;

    /* renamed from: b  reason: collision with root package name */
    private int f65059b;

    /* renamed from: d  reason: collision with root package name */
    private long f65061d;

    /* renamed from: e  reason: collision with root package name */
    private long f65062e;

    /* renamed from: i  reason: collision with root package name */
    private boolean f65066i;

    /* renamed from: j  reason: collision with root package name */
    private int f65067j;

    /* renamed from: k  reason: collision with root package name */
    private int f65068k;

    /* renamed from: c  reason: collision with root package name */
    private String f65060c = "";

    /* renamed from: f  reason: collision with root package name */
    private String f65063f = "";

    /* renamed from: g  reason: collision with root package name */
    private String f65064g = "";

    /* renamed from: h  reason: collision with root package name */
    private String f65065h = "";

    /* compiled from: GameInviteNotification.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65069a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65069a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65069a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65069a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65069a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65069a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65069a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65069a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65069a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: GameInviteNotification.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<g0, b> implements h0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.friend.chat.protocol.h0
        public boolean A() {
            return ((g0) this.instance).A();
        }

        @Override // com.wufan.friend.chat.protocol.h0
        public ByteString L() {
            return ((g0) this.instance).L();
        }

        public b V2() {
            copyOnWrite();
            ((g0) this.instance).clearAvatar();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((g0) this.instance).v3();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((g0) this.instance).u3();
            return this;
        }

        public b X2() {
            copyOnWrite();
            ((g0) this.instance).w3();
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.h0
        public String Y() {
            return ((g0) this.instance).Y();
        }

        public b Y2() {
            copyOnWrite();
            ((g0) this.instance).x3();
            return this;
        }

        public b Z2() {
            copyOnWrite();
            ((g0) this.instance).clearGameId();
            return this;
        }

        public b a3() {
            copyOnWrite();
            ((g0) this.instance).clearGameName();
            return this;
        }

        public b b3() {
            copyOnWrite();
            ((g0) this.instance).y3();
            return this;
        }

        public b c3() {
            copyOnWrite();
            ((g0) this.instance).z3();
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.h0
        public int d() {
            return ((g0) this.instance).d();
        }

        public b d3() {
            copyOnWrite();
            ((g0) this.instance).A3();
            return this;
        }

        public b e3(int i4) {
            copyOnWrite();
            ((g0) this.instance).O3(i4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.h0
        public long f() {
            return ((g0) this.instance).f();
        }

        public b f3(String str) {
            copyOnWrite();
            ((g0) this.instance).setAvatar(str);
            return this;
        }

        public b g3(ByteString byteString) {
            copyOnWrite();
            ((g0) this.instance).setAvatarBytes(byteString);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.h0
        public String getAvatar() {
            return ((g0) this.instance).getAvatar();
        }

        @Override // com.wufan.friend.chat.protocol.h0
        public ByteString getAvatarBytes() {
            return ((g0) this.instance).getAvatarBytes();
        }

        @Override // com.wufan.friend.chat.protocol.h0
        public long getGameId() {
            return ((g0) this.instance).getGameId();
        }

        @Override // com.wufan.friend.chat.protocol.h0
        public String getGameName() {
            return ((g0) this.instance).getGameName();
        }

        @Override // com.wufan.friend.chat.protocol.h0
        public ByteString getGameNameBytes() {
            return ((g0) this.instance).getGameNameBytes();
        }

        @Override // com.wufan.friend.chat.protocol.h0
        public int getSource() {
            return ((g0) this.instance).getSource();
        }

        public b h3(boolean z4) {
            copyOnWrite();
            ((g0) this.instance).P3(z4);
            return this;
        }

        public b i3(int i4) {
            copyOnWrite();
            ((g0) this.instance).Q3(i4);
            return this;
        }

        public b j3(String str) {
            copyOnWrite();
            ((g0) this.instance).R3(str);
            return this;
        }

        public b k3(ByteString byteString) {
            copyOnWrite();
            ((g0) this.instance).S3(byteString);
            return this;
        }

        public b l3(long j4) {
            copyOnWrite();
            ((g0) this.instance).setGameId(j4);
            return this;
        }

        public b m3(String str) {
            copyOnWrite();
            ((g0) this.instance).setGameName(str);
            return this;
        }

        public b n3(ByteString byteString) {
            copyOnWrite();
            ((g0) this.instance).setGameNameBytes(byteString);
            return this;
        }

        public b o3(long j4) {
            copyOnWrite();
            ((g0) this.instance).T3(j4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.h0
        public ByteString p1() {
            return ((g0) this.instance).p1();
        }

        public b p3(String str) {
            copyOnWrite();
            ((g0) this.instance).U3(str);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.h0
        public int q0() {
            return ((g0) this.instance).q0();
        }

        public b q3(ByteString byteString) {
            copyOnWrite();
            ((g0) this.instance).V3(byteString);
            return this;
        }

        public b r3(int i4) {
            copyOnWrite();
            ((g0) this.instance).W3(i4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.h0
        public String w() {
            return ((g0) this.instance).w();
        }

        private b() {
            super(g0.f65057v);
        }
    }

    static {
        g0 g0Var = new g0();
        f65057v = g0Var;
        g0Var.makeImmutable();
    }

    private g0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3() {
        this.f65068k = 0;
    }

    public static g0 B3() {
        return f65057v;
    }

    public static b C3() {
        return f65057v.toBuilder();
    }

    public static b D3(g0 g0Var) {
        return f65057v.toBuilder().mergeFrom((b) g0Var);
    }

    public static g0 E3(InputStream inputStream) throws IOException {
        return (g0) GeneratedMessageLite.parseDelimitedFrom(f65057v, inputStream);
    }

    public static g0 F3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (g0) GeneratedMessageLite.parseDelimitedFrom(f65057v, inputStream, extensionRegistryLite);
    }

    public static g0 G3(ByteString byteString) throws InvalidProtocolBufferException {
        return (g0) GeneratedMessageLite.parseFrom(f65057v, byteString);
    }

    public static g0 H3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (g0) GeneratedMessageLite.parseFrom(f65057v, byteString, extensionRegistryLite);
    }

    public static g0 I3(CodedInputStream codedInputStream) throws IOException {
        return (g0) GeneratedMessageLite.parseFrom(f65057v, codedInputStream);
    }

    public static g0 J3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (g0) GeneratedMessageLite.parseFrom(f65057v, codedInputStream, extensionRegistryLite);
    }

    public static g0 K3(InputStream inputStream) throws IOException {
        return (g0) GeneratedMessageLite.parseFrom(f65057v, inputStream);
    }

    public static g0 L3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (g0) GeneratedMessageLite.parseFrom(f65057v, inputStream, extensionRegistryLite);
    }

    public static g0 M3(byte[] bArr) throws InvalidProtocolBufferException {
        return (g0) GeneratedMessageLite.parseFrom(f65057v, bArr);
    }

    public static g0 N3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (g0) GeneratedMessageLite.parseFrom(f65057v, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O3(int i4) {
        this.f65067j = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P3(boolean z4) {
        this.f65066i = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q3(int i4) {
        this.f65059b = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R3(String str) {
        Objects.requireNonNull(str);
        this.f65060c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65060c = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T3(long j4) {
        this.f65061d = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U3(String str) {
        Objects.requireNonNull(str);
        this.f65065h = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65065h = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W3(int i4) {
        this.f65068k = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvatar() {
        this.f65063f = B3().getAvatar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGameId() {
        this.f65062e = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGameName() {
        this.f65064g = B3().getGameName();
    }

    public static Parser<g0> parser() {
        return f65057v.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatar(String str) {
        Objects.requireNonNull(str);
        this.f65063f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatarBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65063f = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameId(long j4) {
        this.f65062e = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameName(String str) {
        Objects.requireNonNull(str);
        this.f65064g = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameNameBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65064g = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u3() {
        this.f65067j = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v3() {
        this.f65066i = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w3() {
        this.f65059b = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3() {
        this.f65060c = B3().Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3() {
        this.f65061d = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3() {
        this.f65065h = B3().w();
    }

    @Override // com.wufan.friend.chat.protocol.h0
    public boolean A() {
        return this.f65066i;
    }

    @Override // com.wufan.friend.chat.protocol.h0
    public ByteString L() {
        return ByteString.copyFromUtf8(this.f65065h);
    }

    @Override // com.wufan.friend.chat.protocol.h0
    public String Y() {
        return this.f65060c;
    }

    @Override // com.wufan.friend.chat.protocol.h0
    public int d() {
        return this.f65067j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65069a[methodToInvoke.ordinal()]) {
            case 1:
                return new g0();
            case 2:
                return f65057v;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                g0 g0Var = (g0) obj2;
                int i4 = this.f65059b;
                boolean z4 = i4 != 0;
                int i5 = g0Var.f65059b;
                this.f65059b = visitor.visitInt(z4, i4, i5 != 0, i5);
                this.f65060c = visitor.visitString(!this.f65060c.isEmpty(), this.f65060c, !g0Var.f65060c.isEmpty(), g0Var.f65060c);
                long j4 = this.f65061d;
                boolean z5 = j4 != 0;
                long j5 = g0Var.f65061d;
                this.f65061d = visitor.visitLong(z5, j4, j5 != 0, j5);
                long j6 = this.f65062e;
                boolean z6 = j6 != 0;
                long j7 = g0Var.f65062e;
                this.f65062e = visitor.visitLong(z6, j6, j7 != 0, j7);
                this.f65063f = visitor.visitString(!this.f65063f.isEmpty(), this.f65063f, !g0Var.f65063f.isEmpty(), g0Var.f65063f);
                this.f65064g = visitor.visitString(!this.f65064g.isEmpty(), this.f65064g, !g0Var.f65064g.isEmpty(), g0Var.f65064g);
                this.f65065h = visitor.visitString(!this.f65065h.isEmpty(), this.f65065h, !g0Var.f65065h.isEmpty(), g0Var.f65065h);
                boolean z7 = this.f65066i;
                boolean z8 = g0Var.f65066i;
                this.f65066i = visitor.visitBoolean(z7, z7, z8, z8);
                int i6 = this.f65067j;
                boolean z9 = i6 != 0;
                int i7 = g0Var.f65067j;
                this.f65067j = visitor.visitInt(z9, i6, i7 != 0, i7);
                int i8 = this.f65068k;
                boolean z10 = i8 != 0;
                int i9 = g0Var.f65068k;
                this.f65068k = visitor.visitInt(z10, i8, i9 != 0, i9);
                GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!r1) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                break;
                            case 8:
                                this.f65059b = codedInputStream.readInt32();
                                continue;
                            case 18:
                                this.f65060c = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 24:
                                this.f65061d = codedInputStream.readInt64();
                                continue;
                            case 32:
                                this.f65062e = codedInputStream.readInt64();
                                continue;
                            case 42:
                                this.f65063f = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 50:
                                this.f65064g = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 58:
                                this.f65065h = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 64:
                                this.f65066i = codedInputStream.readBool();
                                continue;
                            case 72:
                                this.f65067j = codedInputStream.readInt32();
                                continue;
                            case 80:
                                this.f65068k = codedInputStream.readInt32();
                                continue;
                            default:
                                if (!codedInputStream.skipField(readTag)) {
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        r1 = true;
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
                if (f65058w == null) {
                    synchronized (g0.class) {
                        if (f65058w == null) {
                            f65058w = new GeneratedMessageLite.DefaultInstanceBasedParser(f65057v);
                        }
                    }
                }
                return f65058w;
            default:
                throw new UnsupportedOperationException();
        }
        return f65057v;
    }

    @Override // com.wufan.friend.chat.protocol.h0
    public long f() {
        return this.f65061d;
    }

    @Override // com.wufan.friend.chat.protocol.h0
    public String getAvatar() {
        return this.f65063f;
    }

    @Override // com.wufan.friend.chat.protocol.h0
    public ByteString getAvatarBytes() {
        return ByteString.copyFromUtf8(this.f65063f);
    }

    @Override // com.wufan.friend.chat.protocol.h0
    public long getGameId() {
        return this.f65062e;
    }

    @Override // com.wufan.friend.chat.protocol.h0
    public String getGameName() {
        return this.f65064g;
    }

    @Override // com.wufan.friend.chat.protocol.h0
    public ByteString getGameNameBytes() {
        return ByteString.copyFromUtf8(this.f65064g);
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int i5 = this.f65059b;
        int computeInt32Size = i5 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i5) : 0;
        if (!this.f65060c.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(2, Y());
        }
        long j4 = this.f65061d;
        if (j4 != 0) {
            computeInt32Size += CodedOutputStream.computeInt64Size(3, j4);
        }
        long j5 = this.f65062e;
        if (j5 != 0) {
            computeInt32Size += CodedOutputStream.computeInt64Size(4, j5);
        }
        if (!this.f65063f.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(5, getAvatar());
        }
        if (!this.f65064g.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(6, getGameName());
        }
        if (!this.f65065h.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(7, w());
        }
        boolean z4 = this.f65066i;
        if (z4) {
            computeInt32Size += CodedOutputStream.computeBoolSize(8, z4);
        }
        int i6 = this.f65067j;
        if (i6 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(9, i6);
        }
        int i7 = this.f65068k;
        if (i7 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(10, i7);
        }
        this.memoizedSerializedSize = computeInt32Size;
        return computeInt32Size;
    }

    @Override // com.wufan.friend.chat.protocol.h0
    public int getSource() {
        return this.f65068k;
    }

    @Override // com.wufan.friend.chat.protocol.h0
    public ByteString p1() {
        return ByteString.copyFromUtf8(this.f65060c);
    }

    @Override // com.wufan.friend.chat.protocol.h0
    public int q0() {
        return this.f65059b;
    }

    @Override // com.wufan.friend.chat.protocol.h0
    public String w() {
        return this.f65065h;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i4 = this.f65059b;
        if (i4 != 0) {
            codedOutputStream.writeInt32(1, i4);
        }
        if (!this.f65060c.isEmpty()) {
            codedOutputStream.writeString(2, Y());
        }
        long j4 = this.f65061d;
        if (j4 != 0) {
            codedOutputStream.writeInt64(3, j4);
        }
        long j5 = this.f65062e;
        if (j5 != 0) {
            codedOutputStream.writeInt64(4, j5);
        }
        if (!this.f65063f.isEmpty()) {
            codedOutputStream.writeString(5, getAvatar());
        }
        if (!this.f65064g.isEmpty()) {
            codedOutputStream.writeString(6, getGameName());
        }
        if (!this.f65065h.isEmpty()) {
            codedOutputStream.writeString(7, w());
        }
        boolean z4 = this.f65066i;
        if (z4) {
            codedOutputStream.writeBool(8, z4);
        }
        int i5 = this.f65067j;
        if (i5 != 0) {
            codedOutputStream.writeInt32(9, i5);
        }
        int i6 = this.f65068k;
        if (i6 != 0) {
            codedOutputStream.writeInt32(10, i6);
        }
    }
}
