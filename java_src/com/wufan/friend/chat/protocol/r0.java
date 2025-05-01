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
/* compiled from: LocalBattleGameInfo.java */
/* loaded from: classes6.dex */
public final class r0 extends GeneratedMessageLite<r0, b> implements s0 {

    /* renamed from: e  reason: collision with root package name */
    public static final int f65168e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f65169f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f65170g = 3;

    /* renamed from: h  reason: collision with root package name */
    private static final r0 f65171h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile Parser<r0> f65172i;

    /* renamed from: b  reason: collision with root package name */
    private long f65173b;

    /* renamed from: c  reason: collision with root package name */
    private String f65174c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f65175d = "";

    /* compiled from: LocalBattleGameInfo.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65176a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65176a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65176a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65176a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65176a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65176a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65176a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65176a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65176a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: LocalBattleGameInfo.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<r0, b> implements s0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.friend.chat.protocol.s0
        public String J1() {
            return ((r0) this.instance).J1();
        }

        public b V2() {
            copyOnWrite();
            ((r0) this.instance).clearGameName();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((r0) this.instance).e3();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((r0) this.instance).clearGameId();
            return this;
        }

        public b X2(long j4) {
            copyOnWrite();
            ((r0) this.instance).setGameId(j4);
            return this;
        }

        public b Y2(String str) {
            copyOnWrite();
            ((r0) this.instance).setGameName(str);
            return this;
        }

        public b Z2(ByteString byteString) {
            copyOnWrite();
            ((r0) this.instance).setGameNameBytes(byteString);
            return this;
        }

        public b a3(String str) {
            copyOnWrite();
            ((r0) this.instance).s3(str);
            return this;
        }

        public b b3(ByteString byteString) {
            copyOnWrite();
            ((r0) this.instance).t3(byteString);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.s0
        public long getGameId() {
            return ((r0) this.instance).getGameId();
        }

        @Override // com.wufan.friend.chat.protocol.s0
        public String getGameName() {
            return ((r0) this.instance).getGameName();
        }

        @Override // com.wufan.friend.chat.protocol.s0
        public ByteString getGameNameBytes() {
            return ((r0) this.instance).getGameNameBytes();
        }

        @Override // com.wufan.friend.chat.protocol.s0
        public ByteString y2() {
            return ((r0) this.instance).y2();
        }

        private b() {
            super(r0.f65171h);
        }
    }

    static {
        r0 r0Var = new r0();
        f65171h = r0Var;
        r0Var.makeImmutable();
    }

    private r0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGameId() {
        this.f65173b = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGameName() {
        this.f65174c = f3().getGameName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e3() {
        this.f65175d = f3().J1();
    }

    public static r0 f3() {
        return f65171h;
    }

    public static b g3() {
        return f65171h.toBuilder();
    }

    public static b h3(r0 r0Var) {
        return f65171h.toBuilder().mergeFrom((b) r0Var);
    }

    public static r0 i3(InputStream inputStream) throws IOException {
        return (r0) GeneratedMessageLite.parseDelimitedFrom(f65171h, inputStream);
    }

    public static r0 j3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (r0) GeneratedMessageLite.parseDelimitedFrom(f65171h, inputStream, extensionRegistryLite);
    }

    public static r0 k3(ByteString byteString) throws InvalidProtocolBufferException {
        return (r0) GeneratedMessageLite.parseFrom(f65171h, byteString);
    }

    public static r0 l3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (r0) GeneratedMessageLite.parseFrom(f65171h, byteString, extensionRegistryLite);
    }

    public static r0 m3(CodedInputStream codedInputStream) throws IOException {
        return (r0) GeneratedMessageLite.parseFrom(f65171h, codedInputStream);
    }

    public static r0 n3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (r0) GeneratedMessageLite.parseFrom(f65171h, codedInputStream, extensionRegistryLite);
    }

    public static r0 o3(InputStream inputStream) throws IOException {
        return (r0) GeneratedMessageLite.parseFrom(f65171h, inputStream);
    }

    public static r0 p3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (r0) GeneratedMessageLite.parseFrom(f65171h, inputStream, extensionRegistryLite);
    }

    public static Parser<r0> parser() {
        return f65171h.getParserForType();
    }

    public static r0 q3(byte[] bArr) throws InvalidProtocolBufferException {
        return (r0) GeneratedMessageLite.parseFrom(f65171h, bArr);
    }

    public static r0 r3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (r0) GeneratedMessageLite.parseFrom(f65171h, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3(String str) {
        Objects.requireNonNull(str);
        this.f65175d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameId(long j4) {
        this.f65173b = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameName(String str) {
        Objects.requireNonNull(str);
        this.f65174c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameNameBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65174c = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65175d = byteString.toStringUtf8();
    }

    @Override // com.wufan.friend.chat.protocol.s0
    public String J1() {
        return this.f65175d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z4 = false;
        switch (a.f65176a[methodToInvoke.ordinal()]) {
            case 1:
                return new r0();
            case 2:
                return f65171h;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                r0 r0Var = (r0) obj2;
                long j4 = this.f65173b;
                boolean z5 = j4 != 0;
                long j5 = r0Var.f65173b;
                this.f65173b = visitor.visitLong(z5, j4, j5 != 0, j5);
                this.f65174c = visitor.visitString(!this.f65174c.isEmpty(), this.f65174c, !r0Var.f65174c.isEmpty(), r0Var.f65174c);
                this.f65175d = visitor.visitString(!this.f65175d.isEmpty(), this.f65175d, !r0Var.f65175d.isEmpty(), r0Var.f65175d);
                GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z4) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f65173b = codedInputStream.readInt64();
                            } else if (readTag == 18) {
                                this.f65174c = codedInputStream.readStringRequireUtf8();
                            } else if (readTag != 26) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f65175d = codedInputStream.readStringRequireUtf8();
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
                if (f65172i == null) {
                    synchronized (r0.class) {
                        if (f65172i == null) {
                            f65172i = new GeneratedMessageLite.DefaultInstanceBasedParser(f65171h);
                        }
                    }
                }
                return f65172i;
            default:
                throw new UnsupportedOperationException();
        }
        return f65171h;
    }

    @Override // com.wufan.friend.chat.protocol.s0
    public long getGameId() {
        return this.f65173b;
    }

    @Override // com.wufan.friend.chat.protocol.s0
    public String getGameName() {
        return this.f65174c;
    }

    @Override // com.wufan.friend.chat.protocol.s0
    public ByteString getGameNameBytes() {
        return ByteString.copyFromUtf8(this.f65174c);
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        long j4 = this.f65173b;
        int computeInt64Size = j4 != 0 ? 0 + CodedOutputStream.computeInt64Size(1, j4) : 0;
        if (!this.f65174c.isEmpty()) {
            computeInt64Size += CodedOutputStream.computeStringSize(2, getGameName());
        }
        if (!this.f65175d.isEmpty()) {
            computeInt64Size += CodedOutputStream.computeStringSize(3, J1());
        }
        this.memoizedSerializedSize = computeInt64Size;
        return computeInt64Size;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j4 = this.f65173b;
        if (j4 != 0) {
            codedOutputStream.writeInt64(1, j4);
        }
        if (!this.f65174c.isEmpty()) {
            codedOutputStream.writeString(2, getGameName());
        }
        if (this.f65175d.isEmpty()) {
            return;
        }
        codedOutputStream.writeString(3, J1());
    }

    @Override // com.wufan.friend.chat.protocol.s0
    public ByteString y2() {
        return ByteString.copyFromUtf8(this.f65175d);
    }
}
