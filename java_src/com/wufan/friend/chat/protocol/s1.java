package com.wufan.friend.chat.protocol;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.wufan.friend.chat.protocol.t1;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* compiled from: Request.java */
/* loaded from: classes6.dex */
public final class s1 extends GeneratedMessageLite<s1, b> implements v1 {

    /* renamed from: i  reason: collision with root package name */
    public static final int f65177i = 1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f65178j = 2;

    /* renamed from: k  reason: collision with root package name */
    public static final int f65179k = 3;

    /* renamed from: l  reason: collision with root package name */
    public static final int f65180l = 4;

    /* renamed from: m  reason: collision with root package name */
    public static final int f65181m = 5;

    /* renamed from: n  reason: collision with root package name */
    public static final int f65182n = 6;

    /* renamed from: o  reason: collision with root package name */
    public static final int f65183o = 7;

    /* renamed from: p  reason: collision with root package name */
    private static final s1 f65184p;

    /* renamed from: q  reason: collision with root package name */
    private static volatile Parser<s1> f65185q;

    /* renamed from: b  reason: collision with root package name */
    private long f65186b;

    /* renamed from: c  reason: collision with root package name */
    private long f65187c;

    /* renamed from: d  reason: collision with root package name */
    private int f65188d;

    /* renamed from: e  reason: collision with root package name */
    private int f65189e;

    /* renamed from: f  reason: collision with root package name */
    private int f65190f;

    /* renamed from: g  reason: collision with root package name */
    private String f65191g = "";

    /* renamed from: h  reason: collision with root package name */
    private t1 f65192h;

    /* compiled from: Request.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65193a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65193a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65193a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65193a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65193a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65193a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65193a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65193a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65193a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: Request.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<s1, b> implements v1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.friend.chat.protocol.v1
        public int C() {
            return ((s1) this.instance).C();
        }

        @Override // com.wufan.friend.chat.protocol.v1
        public ServiceName E() {
            return ((s1) this.instance).E();
        }

        @Override // com.wufan.friend.chat.protocol.v1
        public int I() {
            return ((s1) this.instance).I();
        }

        @Override // com.wufan.friend.chat.protocol.v1
        public t1 J() {
            return ((s1) this.instance).J();
        }

        public b V2() {
            copyOnWrite();
            ((s1) this.instance).r3();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((s1) this.instance).s3();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((s1) this.instance).q3();
            return this;
        }

        public b X2() {
            copyOnWrite();
            ((s1) this.instance).clearPlatform();
            return this;
        }

        public b Y2() {
            copyOnWrite();
            ((s1) this.instance).clearRequestId();
            return this;
        }

        public b Z2() {
            copyOnWrite();
            ((s1) this.instance).t3();
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.v1
        public ByteString a() {
            return ((s1) this.instance).a();
        }

        public b a3() {
            copyOnWrite();
            ((s1) this.instance).clearTimestamp();
            return this;
        }

        public b b3(t1 t1Var) {
            copyOnWrite();
            ((s1) this.instance).v3(t1Var);
            return this;
        }

        public b c3(String str) {
            copyOnWrite();
            ((s1) this.instance).I3(str);
            return this;
        }

        public b d3(ByteString byteString) {
            copyOnWrite();
            ((s1) this.instance).J3(byteString);
            return this;
        }

        public b e3(t1.b bVar) {
            copyOnWrite();
            ((s1) this.instance).K3(bVar);
            return this;
        }

        public b f3(t1 t1Var) {
            copyOnWrite();
            ((s1) this.instance).L3(t1Var);
            return this;
        }

        public b g3(ServicePath servicePath) {
            copyOnWrite();
            ((s1) this.instance).M3(servicePath);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.v1
        public String getAppVersion() {
            return ((s1) this.instance).getAppVersion();
        }

        @Override // com.wufan.friend.chat.protocol.v1
        public ServicePath getPath() {
            return ((s1) this.instance).getPath();
        }

        @Override // com.wufan.friend.chat.protocol.v1
        public Platform getPlatform() {
            return ((s1) this.instance).getPlatform();
        }

        @Override // com.wufan.friend.chat.protocol.v1
        public int getPlatformValue() {
            return ((s1) this.instance).getPlatformValue();
        }

        @Override // com.wufan.friend.chat.protocol.v1
        public long getRequestId() {
            return ((s1) this.instance).getRequestId();
        }

        @Override // com.wufan.friend.chat.protocol.v1
        public long getTimestamp() {
            return ((s1) this.instance).getTimestamp();
        }

        public b h3(int i4) {
            copyOnWrite();
            ((s1) this.instance).N3(i4);
            return this;
        }

        public b i3(Platform platform) {
            copyOnWrite();
            ((s1) this.instance).O3(platform);
            return this;
        }

        public b j3(int i4) {
            copyOnWrite();
            ((s1) this.instance).setPlatformValue(i4);
            return this;
        }

        public b k3(long j4) {
            copyOnWrite();
            ((s1) this.instance).setRequestId(j4);
            return this;
        }

        public b l3(ServiceName serviceName) {
            copyOnWrite();
            ((s1) this.instance).P3(serviceName);
            return this;
        }

        public b m3(int i4) {
            copyOnWrite();
            ((s1) this.instance).Q3(i4);
            return this;
        }

        public b n3(long j4) {
            copyOnWrite();
            ((s1) this.instance).setTimestamp(j4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.v1
        public boolean x1() {
            return ((s1) this.instance).x1();
        }

        private b() {
            super(s1.f65184p);
        }
    }

    static {
        s1 s1Var = new s1();
        f65184p = s1Var;
        s1Var.makeImmutable();
    }

    private s1() {
    }

    public static s1 A3(ByteString byteString) throws InvalidProtocolBufferException {
        return (s1) GeneratedMessageLite.parseFrom(f65184p, byteString);
    }

    public static s1 B3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (s1) GeneratedMessageLite.parseFrom(f65184p, byteString, extensionRegistryLite);
    }

    public static s1 C3(CodedInputStream codedInputStream) throws IOException {
        return (s1) GeneratedMessageLite.parseFrom(f65184p, codedInputStream);
    }

    public static s1 D3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (s1) GeneratedMessageLite.parseFrom(f65184p, codedInputStream, extensionRegistryLite);
    }

    public static s1 E3(InputStream inputStream) throws IOException {
        return (s1) GeneratedMessageLite.parseFrom(f65184p, inputStream);
    }

    public static s1 F3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (s1) GeneratedMessageLite.parseFrom(f65184p, inputStream, extensionRegistryLite);
    }

    public static s1 G3(byte[] bArr) throws InvalidProtocolBufferException {
        return (s1) GeneratedMessageLite.parseFrom(f65184p, bArr);
    }

    public static s1 H3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (s1) GeneratedMessageLite.parseFrom(f65184p, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I3(String str) {
        Objects.requireNonNull(str);
        this.f65191g = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65191g = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K3(t1.b bVar) {
        this.f65192h = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L3(t1 t1Var) {
        Objects.requireNonNull(t1Var);
        this.f65192h = t1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M3(ServicePath servicePath) {
        Objects.requireNonNull(servicePath);
        this.f65190f = servicePath.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N3(int i4) {
        this.f65190f = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O3(Platform platform) {
        Objects.requireNonNull(platform);
        this.f65188d = platform.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P3(ServiceName serviceName) {
        Objects.requireNonNull(serviceName);
        this.f65189e = serviceName.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q3(int i4) {
        this.f65189e = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlatform() {
        this.f65188d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestId() {
        this.f65186b = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.f65187c = 0L;
    }

    public static Parser<s1> parser() {
        return f65184p.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q3() {
        this.f65191g = u3().getAppVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3() {
        this.f65192h = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3() {
        this.f65190f = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformValue(int i4) {
        this.f65188d = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestId(long j4) {
        this.f65186b = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(long j4) {
        this.f65187c = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t3() {
        this.f65189e = 0;
    }

    public static s1 u3() {
        return f65184p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v3(t1 t1Var) {
        t1 t1Var2 = this.f65192h;
        if (t1Var2 != null && t1Var2 != t1.U3()) {
            this.f65192h = t1.g4(this.f65192h).mergeFrom((t1.b) t1Var).buildPartial();
        } else {
            this.f65192h = t1Var;
        }
    }

    public static b w3() {
        return f65184p.toBuilder();
    }

    public static b x3(s1 s1Var) {
        return f65184p.toBuilder().mergeFrom((b) s1Var);
    }

    public static s1 y3(InputStream inputStream) throws IOException {
        return (s1) GeneratedMessageLite.parseDelimitedFrom(f65184p, inputStream);
    }

    public static s1 z3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (s1) GeneratedMessageLite.parseDelimitedFrom(f65184p, inputStream, extensionRegistryLite);
    }

    @Override // com.wufan.friend.chat.protocol.v1
    public int C() {
        return this.f65189e;
    }

    @Override // com.wufan.friend.chat.protocol.v1
    public ServiceName E() {
        ServiceName forNumber = ServiceName.forNumber(this.f65189e);
        return forNumber == null ? ServiceName.UNRECOGNIZED : forNumber;
    }

    @Override // com.wufan.friend.chat.protocol.v1
    public int I() {
        return this.f65190f;
    }

    @Override // com.wufan.friend.chat.protocol.v1
    public t1 J() {
        t1 t1Var = this.f65192h;
        return t1Var == null ? t1.U3() : t1Var;
    }

    @Override // com.wufan.friend.chat.protocol.v1
    public ByteString a() {
        return ByteString.copyFromUtf8(this.f65191g);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65193a[methodToInvoke.ordinal()]) {
            case 1:
                return new s1();
            case 2:
                return f65184p;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                s1 s1Var = (s1) obj2;
                long j4 = this.f65186b;
                boolean z4 = j4 != 0;
                long j5 = s1Var.f65186b;
                this.f65186b = visitor.visitLong(z4, j4, j5 != 0, j5);
                long j6 = this.f65187c;
                boolean z5 = j6 != 0;
                long j7 = s1Var.f65187c;
                this.f65187c = visitor.visitLong(z5, j6, j7 != 0, j7);
                int i4 = this.f65188d;
                boolean z6 = i4 != 0;
                int i5 = s1Var.f65188d;
                this.f65188d = visitor.visitInt(z6, i4, i5 != 0, i5);
                int i6 = this.f65189e;
                boolean z7 = i6 != 0;
                int i7 = s1Var.f65189e;
                this.f65189e = visitor.visitInt(z7, i6, i7 != 0, i7);
                int i8 = this.f65190f;
                boolean z8 = i8 != 0;
                int i9 = s1Var.f65190f;
                this.f65190f = visitor.visitInt(z8, i8, i9 != 0, i9);
                this.f65191g = visitor.visitString(!this.f65191g.isEmpty(), this.f65191g, !s1Var.f65191g.isEmpty(), s1Var.f65191g);
                this.f65192h = (t1) visitor.visitMessage(this.f65192h, s1Var.f65192h);
                GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!r1) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.f65186b = codedInputStream.readInt64();
                                } else if (readTag == 16) {
                                    this.f65187c = codedInputStream.readInt64();
                                } else if (readTag == 24) {
                                    this.f65188d = codedInputStream.readEnum();
                                } else if (readTag == 32) {
                                    this.f65189e = codedInputStream.readEnum();
                                } else if (readTag == 40) {
                                    this.f65190f = codedInputStream.readEnum();
                                } else if (readTag == 50) {
                                    this.f65191g = codedInputStream.readStringRequireUtf8();
                                } else if (readTag != 58) {
                                    if (!codedInputStream.skipField(readTag)) {
                                    }
                                } else {
                                    t1 t1Var = this.f65192h;
                                    t1.b builder = t1Var != null ? t1Var.toBuilder() : null;
                                    t1 t1Var2 = (t1) codedInputStream.readMessage(t1.parser(), extensionRegistryLite);
                                    this.f65192h = t1Var2;
                                    if (builder != null) {
                                        builder.mergeFrom((t1.b) t1Var2);
                                        this.f65192h = builder.buildPartial();
                                    }
                                }
                            }
                            r1 = true;
                        } catch (InvalidProtocolBufferException e5) {
                            throw new RuntimeException(e5.setUnfinishedMessage(this));
                        }
                    } catch (IOException e6) {
                        throw new RuntimeException(new InvalidProtocolBufferException(e6.getMessage()).setUnfinishedMessage(this));
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (f65185q == null) {
                    synchronized (s1.class) {
                        if (f65185q == null) {
                            f65185q = new GeneratedMessageLite.DefaultInstanceBasedParser(f65184p);
                        }
                    }
                }
                return f65185q;
            default:
                throw new UnsupportedOperationException();
        }
        return f65184p;
    }

    @Override // com.wufan.friend.chat.protocol.v1
    public String getAppVersion() {
        return this.f65191g;
    }

    @Override // com.wufan.friend.chat.protocol.v1
    public ServicePath getPath() {
        ServicePath forNumber = ServicePath.forNumber(this.f65190f);
        return forNumber == null ? ServicePath.UNRECOGNIZED : forNumber;
    }

    @Override // com.wufan.friend.chat.protocol.v1
    public Platform getPlatform() {
        Platform forNumber = Platform.forNumber(this.f65188d);
        return forNumber == null ? Platform.UNRECOGNIZED : forNumber;
    }

    @Override // com.wufan.friend.chat.protocol.v1
    public int getPlatformValue() {
        return this.f65188d;
    }

    @Override // com.wufan.friend.chat.protocol.v1
    public long getRequestId() {
        return this.f65186b;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        long j4 = this.f65186b;
        int computeInt64Size = j4 != 0 ? 0 + CodedOutputStream.computeInt64Size(1, j4) : 0;
        long j5 = this.f65187c;
        if (j5 != 0) {
            computeInt64Size += CodedOutputStream.computeInt64Size(2, j5);
        }
        if (this.f65188d != Platform.UNDEFINED_PT.getNumber()) {
            computeInt64Size += CodedOutputStream.computeEnumSize(3, this.f65188d);
        }
        if (this.f65189e != ServiceName.UNDEFINED_SN.getNumber()) {
            computeInt64Size += CodedOutputStream.computeEnumSize(4, this.f65189e);
        }
        if (this.f65190f != ServicePath.UNDEFINED_SP.getNumber()) {
            computeInt64Size += CodedOutputStream.computeEnumSize(5, this.f65190f);
        }
        if (!this.f65191g.isEmpty()) {
            computeInt64Size += CodedOutputStream.computeStringSize(6, getAppVersion());
        }
        if (this.f65192h != null) {
            computeInt64Size += CodedOutputStream.computeMessageSize(7, J());
        }
        this.memoizedSerializedSize = computeInt64Size;
        return computeInt64Size;
    }

    @Override // com.wufan.friend.chat.protocol.v1
    public long getTimestamp() {
        return this.f65187c;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j4 = this.f65186b;
        if (j4 != 0) {
            codedOutputStream.writeInt64(1, j4);
        }
        long j5 = this.f65187c;
        if (j5 != 0) {
            codedOutputStream.writeInt64(2, j5);
        }
        if (this.f65188d != Platform.UNDEFINED_PT.getNumber()) {
            codedOutputStream.writeEnum(3, this.f65188d);
        }
        if (this.f65189e != ServiceName.UNDEFINED_SN.getNumber()) {
            codedOutputStream.writeEnum(4, this.f65189e);
        }
        if (this.f65190f != ServicePath.UNDEFINED_SP.getNumber()) {
            codedOutputStream.writeEnum(5, this.f65190f);
        }
        if (!this.f65191g.isEmpty()) {
            codedOutputStream.writeString(6, getAppVersion());
        }
        if (this.f65192h != null) {
            codedOutputStream.writeMessage(7, J());
        }
    }

    @Override // com.wufan.friend.chat.protocol.v1
    public boolean x1() {
        return this.f65192h != null;
    }
}
