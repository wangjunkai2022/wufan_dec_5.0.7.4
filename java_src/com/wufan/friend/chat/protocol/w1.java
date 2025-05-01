package com.wufan.friend.chat.protocol;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.wufan.friend.chat.protocol.x1;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* compiled from: Response.java */
/* loaded from: classes6.dex */
public final class w1 extends GeneratedMessageLite<w1, b> implements z1 {

    /* renamed from: l  reason: collision with root package name */
    public static final int f65249l = 1;

    /* renamed from: m  reason: collision with root package name */
    public static final int f65250m = 2;

    /* renamed from: n  reason: collision with root package name */
    public static final int f65251n = 3;

    /* renamed from: o  reason: collision with root package name */
    public static final int f65252o = 4;

    /* renamed from: p  reason: collision with root package name */
    public static final int f65253p = 5;

    /* renamed from: q  reason: collision with root package name */
    public static final int f65254q = 6;

    /* renamed from: r  reason: collision with root package name */
    public static final int f65255r = 7;

    /* renamed from: s  reason: collision with root package name */
    public static final int f65256s = 8;

    /* renamed from: t  reason: collision with root package name */
    public static final int f65257t = 9;

    /* renamed from: u  reason: collision with root package name */
    public static final int f65258u = 10;

    /* renamed from: v  reason: collision with root package name */
    private static final w1 f65259v;

    /* renamed from: w  reason: collision with root package name */
    private static volatile Parser<w1> f65260w;

    /* renamed from: b  reason: collision with root package name */
    private long f65261b;

    /* renamed from: c  reason: collision with root package name */
    private long f65262c;

    /* renamed from: d  reason: collision with root package name */
    private int f65263d;

    /* renamed from: e  reason: collision with root package name */
    private int f65264e;

    /* renamed from: f  reason: collision with root package name */
    private int f65265f;

    /* renamed from: h  reason: collision with root package name */
    private int f65267h;

    /* renamed from: j  reason: collision with root package name */
    private int f65269j;

    /* renamed from: k  reason: collision with root package name */
    private x1 f65270k;

    /* renamed from: g  reason: collision with root package name */
    private String f65266g = "";

    /* renamed from: i  reason: collision with root package name */
    private String f65268i = "";

    /* compiled from: Response.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65271a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65271a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65271a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65271a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65271a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65271a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65271a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65271a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65271a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: Response.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<w1, b> implements z1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.friend.chat.protocol.z1
        public int B1() {
            return ((w1) this.instance).B1();
        }

        @Override // com.wufan.friend.chat.protocol.z1
        public int C() {
            return ((w1) this.instance).C();
        }

        @Override // com.wufan.friend.chat.protocol.z1
        public ServiceName E() {
            return ((w1) this.instance).E();
        }

        @Override // com.wufan.friend.chat.protocol.z1
        public int I() {
            return ((w1) this.instance).I();
        }

        @Override // com.wufan.friend.chat.protocol.z1
        public String K() {
            return ((w1) this.instance).K();
        }

        @Override // com.wufan.friend.chat.protocol.z1
        public ByteString N() {
            return ((w1) this.instance).N();
        }

        @Override // com.wufan.friend.chat.protocol.z1
        public NotificationType U() {
            return ((w1) this.instance).U();
        }

        public b V2() {
            copyOnWrite();
            ((w1) this.instance).A3();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((w1) this.instance).clearMessage();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((w1) this.instance).z3();
            return this;
        }

        public b X2() {
            copyOnWrite();
            ((w1) this.instance).B3();
            return this;
        }

        public b Y2() {
            copyOnWrite();
            ((w1) this.instance).C3();
            return this;
        }

        public b Z2() {
            copyOnWrite();
            ((w1) this.instance).clearRequestId();
            return this;
        }

        public b a3() {
            copyOnWrite();
            ((w1) this.instance).D3();
            return this;
        }

        public b b3() {
            copyOnWrite();
            ((w1) this.instance).E3();
            return this;
        }

        public b c3() {
            copyOnWrite();
            ((w1) this.instance).F3();
            return this;
        }

        public b d3() {
            copyOnWrite();
            ((w1) this.instance).clearTimestamp();
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z1
        public int e1() {
            return ((w1) this.instance).e1();
        }

        public b e3(x1 x1Var) {
            copyOnWrite();
            ((w1) this.instance).H3(x1Var);
            return this;
        }

        public b f3(x1.b bVar) {
            copyOnWrite();
            ((w1) this.instance).U3(bVar);
            return this;
        }

        public b g3(x1 x1Var) {
            copyOnWrite();
            ((w1) this.instance).V3(x1Var);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z1
        public x1 getData() {
            return ((w1) this.instance).getData();
        }

        @Override // com.wufan.friend.chat.protocol.z1
        public String getMessage() {
            return ((w1) this.instance).getMessage();
        }

        @Override // com.wufan.friend.chat.protocol.z1
        public ByteString getMessageBytes() {
            return ((w1) this.instance).getMessageBytes();
        }

        @Override // com.wufan.friend.chat.protocol.z1
        public ServicePath getPath() {
            return ((w1) this.instance).getPath();
        }

        @Override // com.wufan.friend.chat.protocol.z1
        public long getRequestId() {
            return ((w1) this.instance).getRequestId();
        }

        @Override // com.wufan.friend.chat.protocol.z1
        public ResponseStatus getStatus() {
            return ((w1) this.instance).getStatus();
        }

        @Override // com.wufan.friend.chat.protocol.z1
        public long getTimestamp() {
            return ((w1) this.instance).getTimestamp();
        }

        @Override // com.wufan.friend.chat.protocol.z1
        public int h1() {
            return ((w1) this.instance).h1();
        }

        public b h3(String str) {
            copyOnWrite();
            ((w1) this.instance).W3(str);
            return this;
        }

        public b i3(ByteString byteString) {
            copyOnWrite();
            ((w1) this.instance).X3(byteString);
            return this;
        }

        public b j3(String str) {
            copyOnWrite();
            ((w1) this.instance).setMessage(str);
            return this;
        }

        public b k3(ByteString byteString) {
            copyOnWrite();
            ((w1) this.instance).setMessageBytes(byteString);
            return this;
        }

        public b l3(NotificationType notificationType) {
            copyOnWrite();
            ((w1) this.instance).Y3(notificationType);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z1
        public boolean m() {
            return ((w1) this.instance).m();
        }

        public b m3(int i4) {
            copyOnWrite();
            ((w1) this.instance).Z3(i4);
            return this;
        }

        public b n3(ServicePath servicePath) {
            copyOnWrite();
            ((w1) this.instance).a4(servicePath);
            return this;
        }

        public b o3(int i4) {
            copyOnWrite();
            ((w1) this.instance).b4(i4);
            return this;
        }

        public b p3(long j4) {
            copyOnWrite();
            ((w1) this.instance).setRequestId(j4);
            return this;
        }

        public b q3(ResponseType responseType) {
            copyOnWrite();
            ((w1) this.instance).c4(responseType);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.z1
        public ResponseType r0() {
            return ((w1) this.instance).r0();
        }

        public b r3(int i4) {
            copyOnWrite();
            ((w1) this.instance).d4(i4);
            return this;
        }

        public b s3(ServiceName serviceName) {
            copyOnWrite();
            ((w1) this.instance).e4(serviceName);
            return this;
        }

        public b t3(int i4) {
            copyOnWrite();
            ((w1) this.instance).f4(i4);
            return this;
        }

        public b u3(ResponseStatus responseStatus) {
            copyOnWrite();
            ((w1) this.instance).g4(responseStatus);
            return this;
        }

        public b v3(int i4) {
            copyOnWrite();
            ((w1) this.instance).h4(i4);
            return this;
        }

        public b w3(long j4) {
            copyOnWrite();
            ((w1) this.instance).setTimestamp(j4);
            return this;
        }

        private b() {
            super(w1.f65259v);
        }
    }

    static {
        w1 w1Var = new w1();
        f65259v = w1Var;
        w1Var.makeImmutable();
    }

    private w1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3() {
        this.f65266g = G3().K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3() {
        this.f65269j = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3() {
        this.f65265f = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D3() {
        this.f65263d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E3() {
        this.f65264e = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F3() {
        this.f65267h = 0;
    }

    public static w1 G3() {
        return f65259v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H3(x1 x1Var) {
        x1 x1Var2 = this.f65270k;
        if (x1Var2 != null && x1Var2 != x1.u3()) {
            this.f65270k = x1.B3(this.f65270k).mergeFrom((x1.b) x1Var).buildPartial();
        } else {
            this.f65270k = x1Var;
        }
    }

    public static b I3() {
        return f65259v.toBuilder();
    }

    public static b J3(w1 w1Var) {
        return f65259v.toBuilder().mergeFrom((b) w1Var);
    }

    public static w1 K3(InputStream inputStream) throws IOException {
        return (w1) GeneratedMessageLite.parseDelimitedFrom(f65259v, inputStream);
    }

    public static w1 L3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (w1) GeneratedMessageLite.parseDelimitedFrom(f65259v, inputStream, extensionRegistryLite);
    }

    public static w1 M3(ByteString byteString) throws InvalidProtocolBufferException {
        return (w1) GeneratedMessageLite.parseFrom(f65259v, byteString);
    }

    public static w1 N3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (w1) GeneratedMessageLite.parseFrom(f65259v, byteString, extensionRegistryLite);
    }

    public static w1 O3(CodedInputStream codedInputStream) throws IOException {
        return (w1) GeneratedMessageLite.parseFrom(f65259v, codedInputStream);
    }

    public static w1 P3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (w1) GeneratedMessageLite.parseFrom(f65259v, codedInputStream, extensionRegistryLite);
    }

    public static w1 Q3(InputStream inputStream) throws IOException {
        return (w1) GeneratedMessageLite.parseFrom(f65259v, inputStream);
    }

    public static w1 R3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (w1) GeneratedMessageLite.parseFrom(f65259v, inputStream, extensionRegistryLite);
    }

    public static w1 S3(byte[] bArr) throws InvalidProtocolBufferException {
        return (w1) GeneratedMessageLite.parseFrom(f65259v, bArr);
    }

    public static w1 T3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (w1) GeneratedMessageLite.parseFrom(f65259v, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U3(x1.b bVar) {
        this.f65270k = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V3(x1 x1Var) {
        Objects.requireNonNull(x1Var);
        this.f65270k = x1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W3(String str) {
        Objects.requireNonNull(str);
        this.f65266g = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65266g = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y3(NotificationType notificationType) {
        Objects.requireNonNull(notificationType);
        this.f65269j = notificationType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z3(int i4) {
        this.f65269j = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a4(ServicePath servicePath) {
        Objects.requireNonNull(servicePath);
        this.f65265f = servicePath.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b4(int i4) {
        this.f65265f = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c4(ResponseType responseType) {
        Objects.requireNonNull(responseType);
        this.f65263d = responseType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.f65268i = G3().getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestId() {
        this.f65261b = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.f65262c = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d4(int i4) {
        this.f65263d = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e4(ServiceName serviceName) {
        Objects.requireNonNull(serviceName);
        this.f65264e = serviceName.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f4(int i4) {
        this.f65264e = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g4(ResponseStatus responseStatus) {
        Objects.requireNonNull(responseStatus);
        this.f65267h = responseStatus.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h4(int i4) {
        this.f65267h = i4;
    }

    public static Parser<w1> parser() {
        return f65259v.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        Objects.requireNonNull(str);
        this.f65268i = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65268i = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestId(long j4) {
        this.f65261b = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(long j4) {
        this.f65262c = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3() {
        this.f65270k = null;
    }

    @Override // com.wufan.friend.chat.protocol.z1
    public int B1() {
        return this.f65269j;
    }

    @Override // com.wufan.friend.chat.protocol.z1
    public int C() {
        return this.f65264e;
    }

    @Override // com.wufan.friend.chat.protocol.z1
    public ServiceName E() {
        ServiceName forNumber = ServiceName.forNumber(this.f65264e);
        return forNumber == null ? ServiceName.UNRECOGNIZED : forNumber;
    }

    @Override // com.wufan.friend.chat.protocol.z1
    public int I() {
        return this.f65265f;
    }

    @Override // com.wufan.friend.chat.protocol.z1
    public String K() {
        return this.f65266g;
    }

    @Override // com.wufan.friend.chat.protocol.z1
    public ByteString N() {
        return ByteString.copyFromUtf8(this.f65266g);
    }

    @Override // com.wufan.friend.chat.protocol.z1
    public NotificationType U() {
        NotificationType forNumber = NotificationType.forNumber(this.f65269j);
        return forNumber == null ? NotificationType.UNRECOGNIZED : forNumber;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65271a[methodToInvoke.ordinal()]) {
            case 1:
                return new w1();
            case 2:
                return f65259v;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                w1 w1Var = (w1) obj2;
                long j4 = this.f65261b;
                boolean z4 = j4 != 0;
                long j5 = w1Var.f65261b;
                this.f65261b = visitor.visitLong(z4, j4, j5 != 0, j5);
                long j6 = this.f65262c;
                boolean z5 = j6 != 0;
                long j7 = w1Var.f65262c;
                this.f65262c = visitor.visitLong(z5, j6, j7 != 0, j7);
                int i4 = this.f65263d;
                boolean z6 = i4 != 0;
                int i5 = w1Var.f65263d;
                this.f65263d = visitor.visitInt(z6, i4, i5 != 0, i5);
                int i6 = this.f65264e;
                boolean z7 = i6 != 0;
                int i7 = w1Var.f65264e;
                this.f65264e = visitor.visitInt(z7, i6, i7 != 0, i7);
                int i8 = this.f65265f;
                boolean z8 = i8 != 0;
                int i9 = w1Var.f65265f;
                this.f65265f = visitor.visitInt(z8, i8, i9 != 0, i9);
                this.f65266g = visitor.visitString(!this.f65266g.isEmpty(), this.f65266g, !w1Var.f65266g.isEmpty(), w1Var.f65266g);
                int i10 = this.f65267h;
                boolean z9 = i10 != 0;
                int i11 = w1Var.f65267h;
                this.f65267h = visitor.visitInt(z9, i10, i11 != 0, i11);
                this.f65268i = visitor.visitString(!this.f65268i.isEmpty(), this.f65268i, !w1Var.f65268i.isEmpty(), w1Var.f65268i);
                int i12 = this.f65269j;
                boolean z10 = i12 != 0;
                int i13 = w1Var.f65269j;
                this.f65269j = visitor.visitInt(z10, i12, i13 != 0, i13);
                this.f65270k = (x1) visitor.visitMessage(this.f65270k, w1Var.f65270k);
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
                                this.f65261b = codedInputStream.readInt64();
                                continue;
                            case 16:
                                this.f65262c = codedInputStream.readInt64();
                                continue;
                            case 24:
                                this.f65263d = codedInputStream.readEnum();
                                continue;
                            case 32:
                                this.f65264e = codedInputStream.readEnum();
                                continue;
                            case 40:
                                this.f65265f = codedInputStream.readEnum();
                                continue;
                            case 50:
                                this.f65266g = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 56:
                                this.f65267h = codedInputStream.readEnum();
                                continue;
                            case 66:
                                this.f65268i = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 72:
                                this.f65269j = codedInputStream.readEnum();
                                continue;
                            case 82:
                                x1 x1Var = this.f65270k;
                                x1.b builder = x1Var != null ? x1Var.toBuilder() : null;
                                x1 x1Var2 = (x1) codedInputStream.readMessage(x1.parser(), extensionRegistryLite);
                                this.f65270k = x1Var2;
                                if (builder != null) {
                                    builder.mergeFrom((x1.b) x1Var2);
                                    this.f65270k = builder.buildPartial();
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
                if (f65260w == null) {
                    synchronized (w1.class) {
                        if (f65260w == null) {
                            f65260w = new GeneratedMessageLite.DefaultInstanceBasedParser(f65259v);
                        }
                    }
                }
                return f65260w;
            default:
                throw new UnsupportedOperationException();
        }
        return f65259v;
    }

    @Override // com.wufan.friend.chat.protocol.z1
    public int e1() {
        return this.f65267h;
    }

    @Override // com.wufan.friend.chat.protocol.z1
    public x1 getData() {
        x1 x1Var = this.f65270k;
        return x1Var == null ? x1.u3() : x1Var;
    }

    @Override // com.wufan.friend.chat.protocol.z1
    public String getMessage() {
        return this.f65268i;
    }

    @Override // com.wufan.friend.chat.protocol.z1
    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.f65268i);
    }

    @Override // com.wufan.friend.chat.protocol.z1
    public ServicePath getPath() {
        ServicePath forNumber = ServicePath.forNumber(this.f65265f);
        return forNumber == null ? ServicePath.UNRECOGNIZED : forNumber;
    }

    @Override // com.wufan.friend.chat.protocol.z1
    public long getRequestId() {
        return this.f65261b;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        long j4 = this.f65261b;
        int computeInt64Size = j4 != 0 ? 0 + CodedOutputStream.computeInt64Size(1, j4) : 0;
        long j5 = this.f65262c;
        if (j5 != 0) {
            computeInt64Size += CodedOutputStream.computeInt64Size(2, j5);
        }
        if (this.f65263d != ResponseType.UNDEFINED_CT.getNumber()) {
            computeInt64Size += CodedOutputStream.computeEnumSize(3, this.f65263d);
        }
        if (this.f65264e != ServiceName.UNDEFINED_SN.getNumber()) {
            computeInt64Size += CodedOutputStream.computeEnumSize(4, this.f65264e);
        }
        if (this.f65265f != ServicePath.UNDEFINED_SP.getNumber()) {
            computeInt64Size += CodedOutputStream.computeEnumSize(5, this.f65265f);
        }
        if (!this.f65266g.isEmpty()) {
            computeInt64Size += CodedOutputStream.computeStringSize(6, K());
        }
        if (this.f65267h != ResponseStatus.UNKNOWN_RS.getNumber()) {
            computeInt64Size += CodedOutputStream.computeEnumSize(7, this.f65267h);
        }
        if (!this.f65268i.isEmpty()) {
            computeInt64Size += CodedOutputStream.computeStringSize(8, getMessage());
        }
        if (this.f65269j != NotificationType.UNKNOWN_NT.getNumber()) {
            computeInt64Size += CodedOutputStream.computeEnumSize(9, this.f65269j);
        }
        if (this.f65270k != null) {
            computeInt64Size += CodedOutputStream.computeMessageSize(10, getData());
        }
        this.memoizedSerializedSize = computeInt64Size;
        return computeInt64Size;
    }

    @Override // com.wufan.friend.chat.protocol.z1
    public ResponseStatus getStatus() {
        ResponseStatus forNumber = ResponseStatus.forNumber(this.f65267h);
        return forNumber == null ? ResponseStatus.UNRECOGNIZED : forNumber;
    }

    @Override // com.wufan.friend.chat.protocol.z1
    public long getTimestamp() {
        return this.f65262c;
    }

    @Override // com.wufan.friend.chat.protocol.z1
    public int h1() {
        return this.f65263d;
    }

    @Override // com.wufan.friend.chat.protocol.z1
    public boolean m() {
        return this.f65270k != null;
    }

    @Override // com.wufan.friend.chat.protocol.z1
    public ResponseType r0() {
        ResponseType forNumber = ResponseType.forNumber(this.f65263d);
        return forNumber == null ? ResponseType.UNRECOGNIZED : forNumber;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j4 = this.f65261b;
        if (j4 != 0) {
            codedOutputStream.writeInt64(1, j4);
        }
        long j5 = this.f65262c;
        if (j5 != 0) {
            codedOutputStream.writeInt64(2, j5);
        }
        if (this.f65263d != ResponseType.UNDEFINED_CT.getNumber()) {
            codedOutputStream.writeEnum(3, this.f65263d);
        }
        if (this.f65264e != ServiceName.UNDEFINED_SN.getNumber()) {
            codedOutputStream.writeEnum(4, this.f65264e);
        }
        if (this.f65265f != ServicePath.UNDEFINED_SP.getNumber()) {
            codedOutputStream.writeEnum(5, this.f65265f);
        }
        if (!this.f65266g.isEmpty()) {
            codedOutputStream.writeString(6, K());
        }
        if (this.f65267h != ResponseStatus.UNKNOWN_RS.getNumber()) {
            codedOutputStream.writeEnum(7, this.f65267h);
        }
        if (!this.f65268i.isEmpty()) {
            codedOutputStream.writeString(8, getMessage());
        }
        if (this.f65269j != NotificationType.UNKNOWN_NT.getNumber()) {
            codedOutputStream.writeEnum(9, this.f65269j);
        }
        if (this.f65270k != null) {
            codedOutputStream.writeMessage(10, getData());
        }
    }
}
