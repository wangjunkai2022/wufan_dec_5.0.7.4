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
/* compiled from: RecommendPlayer.java */
/* loaded from: classes6.dex */
public final class j1 extends GeneratedMessageLite<j1, b> implements n1 {

    /* renamed from: j  reason: collision with root package name */
    public static final int f65085j = 1;

    /* renamed from: k  reason: collision with root package name */
    public static final int f65086k = 2;

    /* renamed from: l  reason: collision with root package name */
    public static final int f65087l = 3;

    /* renamed from: m  reason: collision with root package name */
    public static final int f65088m = 4;

    /* renamed from: n  reason: collision with root package name */
    public static final int f65089n = 5;

    /* renamed from: o  reason: collision with root package name */
    public static final int f65090o = 6;

    /* renamed from: p  reason: collision with root package name */
    public static final int f65091p = 7;

    /* renamed from: q  reason: collision with root package name */
    public static final int f65092q = 8;

    /* renamed from: r  reason: collision with root package name */
    private static final j1 f65093r;

    /* renamed from: s  reason: collision with root package name */
    private static volatile Parser<j1> f65094s;

    /* renamed from: b  reason: collision with root package name */
    private int f65095b;

    /* renamed from: e  reason: collision with root package name */
    private long f65098e;

    /* renamed from: g  reason: collision with root package name */
    private int f65100g;

    /* renamed from: i  reason: collision with root package name */
    private boolean f65102i;

    /* renamed from: c  reason: collision with root package name */
    private String f65096c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f65097d = "";

    /* renamed from: f  reason: collision with root package name */
    private String f65099f = "";

    /* renamed from: h  reason: collision with root package name */
    private String f65101h = "";

    /* compiled from: RecommendPlayer.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65103a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65103a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65103a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65103a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65103a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65103a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65103a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65103a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65103a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: RecommendPlayer.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<j1, b> implements n1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.friend.chat.protocol.n1
        public boolean D() {
            return ((j1) this.instance).D();
        }

        public b V2() {
            copyOnWrite();
            ((j1) this.instance).clearAvatar();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((j1) this.instance).r3();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((j1) this.instance).q3();
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.n1
        public ByteString X1() {
            return ((j1) this.instance).X1();
        }

        public b X2() {
            copyOnWrite();
            ((j1) this.instance).clearGameId();
            return this;
        }

        public b Y2() {
            copyOnWrite();
            ((j1) this.instance).clearGameName();
            return this;
        }

        public b Z2() {
            copyOnWrite();
            ((j1) this.instance).s3();
            return this;
        }

        public b a3() {
            copyOnWrite();
            ((j1) this.instance).t3();
            return this;
        }

        public b b3() {
            copyOnWrite();
            ((j1) this.instance).clearNickname();
            return this;
        }

        public b c3(int i4) {
            copyOnWrite();
            ((j1) this.instance).H3(i4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.n1
        public int d() {
            return ((j1) this.instance).d();
        }

        public b d3(String str) {
            copyOnWrite();
            ((j1) this.instance).setAvatar(str);
            return this;
        }

        public b e3(ByteString byteString) {
            copyOnWrite();
            ((j1) this.instance).setAvatarBytes(byteString);
            return this;
        }

        public b f3(boolean z4) {
            copyOnWrite();
            ((j1) this.instance).I3(z4);
            return this;
        }

        public b g3(long j4) {
            copyOnWrite();
            ((j1) this.instance).setGameId(j4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.n1
        public String getAvatar() {
            return ((j1) this.instance).getAvatar();
        }

        @Override // com.wufan.friend.chat.protocol.n1
        public ByteString getAvatarBytes() {
            return ((j1) this.instance).getAvatarBytes();
        }

        @Override // com.wufan.friend.chat.protocol.n1
        public long getGameId() {
            return ((j1) this.instance).getGameId();
        }

        @Override // com.wufan.friend.chat.protocol.n1
        public String getGameName() {
            return ((j1) this.instance).getGameName();
        }

        @Override // com.wufan.friend.chat.protocol.n1
        public ByteString getGameNameBytes() {
            return ((j1) this.instance).getGameNameBytes();
        }

        @Override // com.wufan.friend.chat.protocol.n1
        public String getNickname() {
            return ((j1) this.instance).getNickname();
        }

        @Override // com.wufan.friend.chat.protocol.n1
        public ByteString getNicknameBytes() {
            return ((j1) this.instance).getNicknameBytes();
        }

        public b h3(String str) {
            copyOnWrite();
            ((j1) this.instance).setGameName(str);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.n1
        public int i() {
            return ((j1) this.instance).i();
        }

        public b i3(ByteString byteString) {
            copyOnWrite();
            ((j1) this.instance).setGameNameBytes(byteString);
            return this;
        }

        public b j3(int i4) {
            copyOnWrite();
            ((j1) this.instance).J3(i4);
            return this;
        }

        public b k3(String str) {
            copyOnWrite();
            ((j1) this.instance).K3(str);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.n1
        public String l0() {
            return ((j1) this.instance).l0();
        }

        public b l3(ByteString byteString) {
            copyOnWrite();
            ((j1) this.instance).L3(byteString);
            return this;
        }

        public b m3(String str) {
            copyOnWrite();
            ((j1) this.instance).setNickname(str);
            return this;
        }

        public b n3(ByteString byteString) {
            copyOnWrite();
            ((j1) this.instance).setNicknameBytes(byteString);
            return this;
        }

        private b() {
            super(j1.f65093r);
        }
    }

    static {
        j1 j1Var = new j1();
        f65093r = j1Var;
        j1Var.makeImmutable();
    }

    private j1() {
    }

    public static j1 A3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (j1) GeneratedMessageLite.parseFrom(f65093r, byteString, extensionRegistryLite);
    }

    public static j1 B3(CodedInputStream codedInputStream) throws IOException {
        return (j1) GeneratedMessageLite.parseFrom(f65093r, codedInputStream);
    }

    public static j1 C3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (j1) GeneratedMessageLite.parseFrom(f65093r, codedInputStream, extensionRegistryLite);
    }

    public static j1 D3(InputStream inputStream) throws IOException {
        return (j1) GeneratedMessageLite.parseFrom(f65093r, inputStream);
    }

    public static j1 E3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (j1) GeneratedMessageLite.parseFrom(f65093r, inputStream, extensionRegistryLite);
    }

    public static j1 F3(byte[] bArr) throws InvalidProtocolBufferException {
        return (j1) GeneratedMessageLite.parseFrom(f65093r, bArr);
    }

    public static j1 G3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (j1) GeneratedMessageLite.parseFrom(f65093r, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H3(int i4) {
        this.f65095b = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I3(boolean z4) {
        this.f65102i = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J3(int i4) {
        this.f65100g = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K3(String str) {
        Objects.requireNonNull(str);
        this.f65101h = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65101h = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvatar() {
        this.f65096c = u3().getAvatar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGameId() {
        this.f65098e = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGameName() {
        this.f65099f = u3().getGameName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNickname() {
        this.f65097d = u3().getNickname();
    }

    public static Parser<j1> parser() {
        return f65093r.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q3() {
        this.f65095b = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3() {
        this.f65102i = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3() {
        this.f65100g = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatar(String str) {
        Objects.requireNonNull(str);
        this.f65096c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatarBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65096c = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameId(long j4) {
        this.f65098e = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameName(String str) {
        Objects.requireNonNull(str);
        this.f65099f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameNameBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65099f = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNickname(String str) {
        Objects.requireNonNull(str);
        this.f65097d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNicknameBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65097d = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t3() {
        this.f65101h = u3().l0();
    }

    public static j1 u3() {
        return f65093r;
    }

    public static b v3() {
        return f65093r.toBuilder();
    }

    public static b w3(j1 j1Var) {
        return f65093r.toBuilder().mergeFrom((b) j1Var);
    }

    public static j1 x3(InputStream inputStream) throws IOException {
        return (j1) GeneratedMessageLite.parseDelimitedFrom(f65093r, inputStream);
    }

    public static j1 y3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (j1) GeneratedMessageLite.parseDelimitedFrom(f65093r, inputStream, extensionRegistryLite);
    }

    public static j1 z3(ByteString byteString) throws InvalidProtocolBufferException {
        return (j1) GeneratedMessageLite.parseFrom(f65093r, byteString);
    }

    @Override // com.wufan.friend.chat.protocol.n1
    public boolean D() {
        return this.f65102i;
    }

    @Override // com.wufan.friend.chat.protocol.n1
    public ByteString X1() {
        return ByteString.copyFromUtf8(this.f65101h);
    }

    @Override // com.wufan.friend.chat.protocol.n1
    public int d() {
        return this.f65095b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65103a[methodToInvoke.ordinal()]) {
            case 1:
                return new j1();
            case 2:
                return f65093r;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                j1 j1Var = (j1) obj2;
                int i4 = this.f65095b;
                boolean z4 = i4 != 0;
                int i5 = j1Var.f65095b;
                this.f65095b = visitor.visitInt(z4, i4, i5 != 0, i5);
                this.f65096c = visitor.visitString(!this.f65096c.isEmpty(), this.f65096c, !j1Var.f65096c.isEmpty(), j1Var.f65096c);
                this.f65097d = visitor.visitString(!this.f65097d.isEmpty(), this.f65097d, !j1Var.f65097d.isEmpty(), j1Var.f65097d);
                long j4 = this.f65098e;
                boolean z5 = j4 != 0;
                long j5 = j1Var.f65098e;
                this.f65098e = visitor.visitLong(z5, j4, j5 != 0, j5);
                this.f65099f = visitor.visitString(!this.f65099f.isEmpty(), this.f65099f, !j1Var.f65099f.isEmpty(), j1Var.f65099f);
                int i6 = this.f65100g;
                boolean z6 = i6 != 0;
                int i7 = j1Var.f65100g;
                this.f65100g = visitor.visitInt(z6, i6, i7 != 0, i7);
                this.f65101h = visitor.visitString(!this.f65101h.isEmpty(), this.f65101h, !j1Var.f65101h.isEmpty(), j1Var.f65101h);
                boolean z7 = this.f65102i;
                boolean z8 = j1Var.f65102i;
                this.f65102i = visitor.visitBoolean(z7, z7, z8, z8);
                GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!r1) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f65095b = codedInputStream.readInt32();
                            } else if (readTag == 18) {
                                this.f65096c = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.f65097d = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 32) {
                                this.f65098e = codedInputStream.readInt64();
                            } else if (readTag == 42) {
                                this.f65099f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 48) {
                                this.f65100g = codedInputStream.readInt32();
                            } else if (readTag == 58) {
                                this.f65101h = codedInputStream.readStringRequireUtf8();
                            } else if (readTag != 64) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f65102i = codedInputStream.readBool();
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
                if (f65094s == null) {
                    synchronized (j1.class) {
                        if (f65094s == null) {
                            f65094s = new GeneratedMessageLite.DefaultInstanceBasedParser(f65093r);
                        }
                    }
                }
                return f65094s;
            default:
                throw new UnsupportedOperationException();
        }
        return f65093r;
    }

    @Override // com.wufan.friend.chat.protocol.n1
    public String getAvatar() {
        return this.f65096c;
    }

    @Override // com.wufan.friend.chat.protocol.n1
    public ByteString getAvatarBytes() {
        return ByteString.copyFromUtf8(this.f65096c);
    }

    @Override // com.wufan.friend.chat.protocol.n1
    public long getGameId() {
        return this.f65098e;
    }

    @Override // com.wufan.friend.chat.protocol.n1
    public String getGameName() {
        return this.f65099f;
    }

    @Override // com.wufan.friend.chat.protocol.n1
    public ByteString getGameNameBytes() {
        return ByteString.copyFromUtf8(this.f65099f);
    }

    @Override // com.wufan.friend.chat.protocol.n1
    public String getNickname() {
        return this.f65097d;
    }

    @Override // com.wufan.friend.chat.protocol.n1
    public ByteString getNicknameBytes() {
        return ByteString.copyFromUtf8(this.f65097d);
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int i5 = this.f65095b;
        int computeInt32Size = i5 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i5) : 0;
        if (!this.f65096c.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(2, getAvatar());
        }
        if (!this.f65097d.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(3, getNickname());
        }
        long j4 = this.f65098e;
        if (j4 != 0) {
            computeInt32Size += CodedOutputStream.computeInt64Size(4, j4);
        }
        if (!this.f65099f.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(5, getGameName());
        }
        int i6 = this.f65100g;
        if (i6 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(6, i6);
        }
        if (!this.f65101h.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(7, l0());
        }
        boolean z4 = this.f65102i;
        if (z4) {
            computeInt32Size += CodedOutputStream.computeBoolSize(8, z4);
        }
        this.memoizedSerializedSize = computeInt32Size;
        return computeInt32Size;
    }

    @Override // com.wufan.friend.chat.protocol.n1
    public int i() {
        return this.f65100g;
    }

    @Override // com.wufan.friend.chat.protocol.n1
    public String l0() {
        return this.f65101h;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i4 = this.f65095b;
        if (i4 != 0) {
            codedOutputStream.writeInt32(1, i4);
        }
        if (!this.f65096c.isEmpty()) {
            codedOutputStream.writeString(2, getAvatar());
        }
        if (!this.f65097d.isEmpty()) {
            codedOutputStream.writeString(3, getNickname());
        }
        long j4 = this.f65098e;
        if (j4 != 0) {
            codedOutputStream.writeInt64(4, j4);
        }
        if (!this.f65099f.isEmpty()) {
            codedOutputStream.writeString(5, getGameName());
        }
        int i5 = this.f65100g;
        if (i5 != 0) {
            codedOutputStream.writeInt32(6, i5);
        }
        if (!this.f65101h.isEmpty()) {
            codedOutputStream.writeString(7, l0());
        }
        boolean z4 = this.f65102i;
        if (z4) {
            codedOutputStream.writeBool(8, z4);
        }
    }
}
