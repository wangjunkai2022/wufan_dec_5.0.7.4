package com.wufan.friend.chat.protocol;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.wufan.friend.chat.protocol.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* compiled from: ChatMessageNotification.java */
/* loaded from: classes6.dex */
public final class m extends GeneratedMessageLite<m, b> implements n {

    /* renamed from: e  reason: collision with root package name */
    public static final int f65121e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f65122f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f65123g = 3;

    /* renamed from: h  reason: collision with root package name */
    private static final m f65124h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile Parser<m> f65125i;

    /* renamed from: b  reason: collision with root package name */
    private com.wufan.friend.chat.protocol.a f65126b;

    /* renamed from: c  reason: collision with root package name */
    private String f65127c = "";

    /* renamed from: d  reason: collision with root package name */
    private long f65128d;

    /* compiled from: ChatMessageNotification.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65129a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65129a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65129a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65129a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65129a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65129a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65129a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65129a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65129a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: ChatMessageNotification.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<m, b> implements n {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b V2() {
            copyOnWrite();
            ((m) this.instance).clearMessage();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((m) this.instance).clearTimestamp();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((m) this.instance).f3();
            return this;
        }

        public b X2(com.wufan.friend.chat.protocol.a aVar) {
            copyOnWrite();
            ((m) this.instance).h3(aVar);
            return this;
        }

        public b Y2(a.b bVar) {
            copyOnWrite();
            ((m) this.instance).u3(bVar);
            return this;
        }

        public b Z2(com.wufan.friend.chat.protocol.a aVar) {
            copyOnWrite();
            ((m) this.instance).v3(aVar);
            return this;
        }

        public b a3(String str) {
            copyOnWrite();
            ((m) this.instance).setMessage(str);
            return this;
        }

        public b b3(ByteString byteString) {
            copyOnWrite();
            ((m) this.instance).setMessageBytes(byteString);
            return this;
        }

        public b c3(long j4) {
            copyOnWrite();
            ((m) this.instance).setTimestamp(j4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.n
        public boolean e() {
            return ((m) this.instance).e();
        }

        @Override // com.wufan.friend.chat.protocol.n
        public com.wufan.friend.chat.protocol.a g() {
            return ((m) this.instance).g();
        }

        @Override // com.wufan.friend.chat.protocol.n
        public String getMessage() {
            return ((m) this.instance).getMessage();
        }

        @Override // com.wufan.friend.chat.protocol.n
        public ByteString getMessageBytes() {
            return ((m) this.instance).getMessageBytes();
        }

        @Override // com.wufan.friend.chat.protocol.n
        public long getTimestamp() {
            return ((m) this.instance).getTimestamp();
        }

        private b() {
            super(m.f65124h);
        }
    }

    static {
        m mVar = new m();
        f65124h = mVar;
        mVar.makeImmutable();
    }

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.f65127c = g3().getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.f65128d = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f3() {
        this.f65126b = null;
    }

    public static m g3() {
        return f65124h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3(com.wufan.friend.chat.protocol.a aVar) {
        com.wufan.friend.chat.protocol.a aVar2 = this.f65126b;
        if (aVar2 != null && aVar2 != com.wufan.friend.chat.protocol.a.q3()) {
            this.f65126b = com.wufan.friend.chat.protocol.a.s3(this.f65126b).mergeFrom((a.b) aVar).buildPartial();
        } else {
            this.f65126b = aVar;
        }
    }

    public static b i3() {
        return f65124h.toBuilder();
    }

    public static b j3(m mVar) {
        return f65124h.toBuilder().mergeFrom((b) mVar);
    }

    public static m k3(InputStream inputStream) throws IOException {
        return (m) GeneratedMessageLite.parseDelimitedFrom(f65124h, inputStream);
    }

    public static m l3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (m) GeneratedMessageLite.parseDelimitedFrom(f65124h, inputStream, extensionRegistryLite);
    }

    public static m m3(ByteString byteString) throws InvalidProtocolBufferException {
        return (m) GeneratedMessageLite.parseFrom(f65124h, byteString);
    }

    public static m n3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (m) GeneratedMessageLite.parseFrom(f65124h, byteString, extensionRegistryLite);
    }

    public static m o3(CodedInputStream codedInputStream) throws IOException {
        return (m) GeneratedMessageLite.parseFrom(f65124h, codedInputStream);
    }

    public static m p3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (m) GeneratedMessageLite.parseFrom(f65124h, codedInputStream, extensionRegistryLite);
    }

    public static Parser<m> parser() {
        return f65124h.getParserForType();
    }

    public static m q3(InputStream inputStream) throws IOException {
        return (m) GeneratedMessageLite.parseFrom(f65124h, inputStream);
    }

    public static m r3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (m) GeneratedMessageLite.parseFrom(f65124h, inputStream, extensionRegistryLite);
    }

    public static m s3(byte[] bArr) throws InvalidProtocolBufferException {
        return (m) GeneratedMessageLite.parseFrom(f65124h, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        Objects.requireNonNull(str);
        this.f65127c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65127c = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(long j4) {
        this.f65128d = j4;
    }

    public static m t3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (m) GeneratedMessageLite.parseFrom(f65124h, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u3(a.b bVar) {
        this.f65126b = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v3(com.wufan.friend.chat.protocol.a aVar) {
        Objects.requireNonNull(aVar);
        this.f65126b = aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z4 = false;
        switch (a.f65129a[methodToInvoke.ordinal()]) {
            case 1:
                return new m();
            case 2:
                return f65124h;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                m mVar = (m) obj2;
                this.f65126b = (com.wufan.friend.chat.protocol.a) visitor.visitMessage(this.f65126b, mVar.f65126b);
                this.f65127c = visitor.visitString(!this.f65127c.isEmpty(), this.f65127c, !mVar.f65127c.isEmpty(), mVar.f65127c);
                long j4 = this.f65128d;
                boolean z5 = j4 != 0;
                long j5 = mVar.f65128d;
                this.f65128d = visitor.visitLong(z5, j4, j5 != 0, j5);
                GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z4) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                com.wufan.friend.chat.protocol.a aVar = this.f65126b;
                                a.b builder = aVar != null ? aVar.toBuilder() : null;
                                com.wufan.friend.chat.protocol.a aVar2 = (com.wufan.friend.chat.protocol.a) codedInputStream.readMessage(com.wufan.friend.chat.protocol.a.parser(), extensionRegistryLite);
                                this.f65126b = aVar2;
                                if (builder != null) {
                                    builder.mergeFrom((a.b) aVar2);
                                    this.f65126b = builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                this.f65127c = codedInputStream.readStringRequireUtf8();
                            } else if (readTag != 24) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f65128d = codedInputStream.readInt64();
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
                if (f65125i == null) {
                    synchronized (m.class) {
                        if (f65125i == null) {
                            f65125i = new GeneratedMessageLite.DefaultInstanceBasedParser(f65124h);
                        }
                    }
                }
                return f65125i;
            default:
                throw new UnsupportedOperationException();
        }
        return f65124h;
    }

    @Override // com.wufan.friend.chat.protocol.n
    public boolean e() {
        return this.f65126b != null;
    }

    @Override // com.wufan.friend.chat.protocol.n
    public com.wufan.friend.chat.protocol.a g() {
        com.wufan.friend.chat.protocol.a aVar = this.f65126b;
        return aVar == null ? com.wufan.friend.chat.protocol.a.q3() : aVar;
    }

    @Override // com.wufan.friend.chat.protocol.n
    public String getMessage() {
        return this.f65127c;
    }

    @Override // com.wufan.friend.chat.protocol.n
    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.f65127c);
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int computeMessageSize = this.f65126b != null ? 0 + CodedOutputStream.computeMessageSize(1, g()) : 0;
        if (!this.f65127c.isEmpty()) {
            computeMessageSize += CodedOutputStream.computeStringSize(2, getMessage());
        }
        long j4 = this.f65128d;
        if (j4 != 0) {
            computeMessageSize += CodedOutputStream.computeInt64Size(3, j4);
        }
        this.memoizedSerializedSize = computeMessageSize;
        return computeMessageSize;
    }

    @Override // com.wufan.friend.chat.protocol.n
    public long getTimestamp() {
        return this.f65128d;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f65126b != null) {
            codedOutputStream.writeMessage(1, g());
        }
        if (!this.f65127c.isEmpty()) {
            codedOutputStream.writeString(2, getMessage());
        }
        long j4 = this.f65128d;
        if (j4 != 0) {
            codedOutputStream.writeInt64(3, j4);
        }
    }
}
