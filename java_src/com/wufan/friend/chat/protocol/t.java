package com.wufan.friend.chat.protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.wufan.friend.chat.protocol.a;
import com.wufan.friend.chat.protocol.d1;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* compiled from: FriendAddSuccessNotification.java */
/* loaded from: classes6.dex */
public final class t extends GeneratedMessageLite<t, b> implements u {

    /* renamed from: e  reason: collision with root package name */
    public static final int f65194e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f65195f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f65196g = 3;

    /* renamed from: h  reason: collision with root package name */
    private static final t f65197h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile Parser<t> f65198i;

    /* renamed from: b  reason: collision with root package name */
    private com.wufan.friend.chat.protocol.a f65199b;

    /* renamed from: c  reason: collision with root package name */
    private d1 f65200c;

    /* renamed from: d  reason: collision with root package name */
    private int f65201d;

    /* compiled from: FriendAddSuccessNotification.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65202a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65202a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65202a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65202a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65202a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65202a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65202a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65202a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65202a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: FriendAddSuccessNotification.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<t, b> implements u {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.friend.chat.protocol.u
        public OnlineState U0() {
            return ((t) this.instance).U0();
        }

        public b V2() {
            copyOnWrite();
            ((t) this.instance).i3();
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.u
        public int W() {
            return ((t) this.instance).W();
        }

        public b W2() {
            copyOnWrite();
            ((t) this.instance).j3();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((t) this.instance).h3();
            return this;
        }

        public b X2(com.wufan.friend.chat.protocol.a aVar) {
            copyOnWrite();
            ((t) this.instance).l3(aVar);
            return this;
        }

        public b Y2(d1 d1Var) {
            copyOnWrite();
            ((t) this.instance).m3(d1Var);
            return this;
        }

        public b Z2(a.b bVar) {
            copyOnWrite();
            ((t) this.instance).z3(bVar);
            return this;
        }

        public b a3(com.wufan.friend.chat.protocol.a aVar) {
            copyOnWrite();
            ((t) this.instance).A3(aVar);
            return this;
        }

        public b b3(OnlineState onlineState) {
            copyOnWrite();
            ((t) this.instance).B3(onlineState);
            return this;
        }

        public b c3(int i4) {
            copyOnWrite();
            ((t) this.instance).C3(i4);
            return this;
        }

        public b d3(d1.b bVar) {
            copyOnWrite();
            ((t) this.instance).D3(bVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.u
        public boolean e() {
            return ((t) this.instance).e();
        }

        public b e3(d1 d1Var) {
            copyOnWrite();
            ((t) this.instance).E3(d1Var);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.u
        public com.wufan.friend.chat.protocol.a g() {
            return ((t) this.instance).g();
        }

        @Override // com.wufan.friend.chat.protocol.u
        public d1 q() {
            return ((t) this.instance).q();
        }

        @Override // com.wufan.friend.chat.protocol.u
        public boolean u() {
            return ((t) this.instance).u();
        }

        private b() {
            super(t.f65197h);
        }
    }

    static {
        t tVar = new t();
        f65197h = tVar;
        tVar.makeImmutable();
    }

    private t() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3(com.wufan.friend.chat.protocol.a aVar) {
        Objects.requireNonNull(aVar);
        this.f65199b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3(OnlineState onlineState) {
        Objects.requireNonNull(onlineState);
        this.f65201d = onlineState.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3(int i4) {
        this.f65201d = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D3(d1.b bVar) {
        this.f65200c = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E3(d1 d1Var) {
        Objects.requireNonNull(d1Var);
        this.f65200c = d1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3() {
        this.f65199b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3() {
        this.f65201d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3() {
        this.f65200c = null;
    }

    public static t k3() {
        return f65197h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3(com.wufan.friend.chat.protocol.a aVar) {
        com.wufan.friend.chat.protocol.a aVar2 = this.f65199b;
        if (aVar2 != null && aVar2 != com.wufan.friend.chat.protocol.a.q3()) {
            this.f65199b = com.wufan.friend.chat.protocol.a.s3(this.f65199b).mergeFrom((a.b) aVar).buildPartial();
        } else {
            this.f65199b = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m3(d1 d1Var) {
        d1 d1Var2 = this.f65200c;
        if (d1Var2 != null && d1Var2 != d1.k3()) {
            this.f65200c = d1.m3(this.f65200c).mergeFrom((d1.b) d1Var).buildPartial();
        } else {
            this.f65200c = d1Var;
        }
    }

    public static b n3() {
        return f65197h.toBuilder();
    }

    public static b o3(t tVar) {
        return f65197h.toBuilder().mergeFrom((b) tVar);
    }

    public static t p3(InputStream inputStream) throws IOException {
        return (t) GeneratedMessageLite.parseDelimitedFrom(f65197h, inputStream);
    }

    public static Parser<t> parser() {
        return f65197h.getParserForType();
    }

    public static t q3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (t) GeneratedMessageLite.parseDelimitedFrom(f65197h, inputStream, extensionRegistryLite);
    }

    public static t r3(ByteString byteString) throws InvalidProtocolBufferException {
        return (t) GeneratedMessageLite.parseFrom(f65197h, byteString);
    }

    public static t s3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (t) GeneratedMessageLite.parseFrom(f65197h, byteString, extensionRegistryLite);
    }

    public static t t3(CodedInputStream codedInputStream) throws IOException {
        return (t) GeneratedMessageLite.parseFrom(f65197h, codedInputStream);
    }

    public static t u3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (t) GeneratedMessageLite.parseFrom(f65197h, codedInputStream, extensionRegistryLite);
    }

    public static t v3(InputStream inputStream) throws IOException {
        return (t) GeneratedMessageLite.parseFrom(f65197h, inputStream);
    }

    public static t w3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (t) GeneratedMessageLite.parseFrom(f65197h, inputStream, extensionRegistryLite);
    }

    public static t x3(byte[] bArr) throws InvalidProtocolBufferException {
        return (t) GeneratedMessageLite.parseFrom(f65197h, bArr);
    }

    public static t y3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (t) GeneratedMessageLite.parseFrom(f65197h, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(a.b bVar) {
        this.f65199b = bVar.build();
    }

    @Override // com.wufan.friend.chat.protocol.u
    public OnlineState U0() {
        OnlineState forNumber = OnlineState.forNumber(this.f65201d);
        return forNumber == null ? OnlineState.UNRECOGNIZED : forNumber;
    }

    @Override // com.wufan.friend.chat.protocol.u
    public int W() {
        return this.f65201d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65202a[methodToInvoke.ordinal()]) {
            case 1:
                return new t();
            case 2:
                return f65197h;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                t tVar = (t) obj2;
                this.f65199b = (com.wufan.friend.chat.protocol.a) visitor.visitMessage(this.f65199b, tVar.f65199b);
                this.f65200c = (d1) visitor.visitMessage(this.f65200c, tVar.f65200c);
                int i4 = this.f65201d;
                boolean z4 = i4 != 0;
                int i5 = tVar.f65201d;
                this.f65201d = visitor.visitInt(z4, i4, i5 != 0, i5);
                GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!r0) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    com.wufan.friend.chat.protocol.a aVar = this.f65199b;
                                    a.b builder = aVar != null ? aVar.toBuilder() : null;
                                    com.wufan.friend.chat.protocol.a aVar2 = (com.wufan.friend.chat.protocol.a) codedInputStream.readMessage(com.wufan.friend.chat.protocol.a.parser(), extensionRegistryLite);
                                    this.f65199b = aVar2;
                                    if (builder != null) {
                                        builder.mergeFrom((a.b) aVar2);
                                        this.f65199b = builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    d1 d1Var = this.f65200c;
                                    d1.b builder2 = d1Var != null ? d1Var.toBuilder() : null;
                                    d1 d1Var2 = (d1) codedInputStream.readMessage(d1.parser(), extensionRegistryLite);
                                    this.f65200c = d1Var2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((d1.b) d1Var2);
                                        this.f65200c = builder2.buildPartial();
                                    }
                                } else if (readTag != 24) {
                                    if (!codedInputStream.skipField(readTag)) {
                                    }
                                } else {
                                    this.f65201d = codedInputStream.readEnum();
                                }
                            }
                            r0 = true;
                        } catch (IOException e5) {
                            throw new RuntimeException(new InvalidProtocolBufferException(e5.getMessage()).setUnfinishedMessage(this));
                        }
                    } catch (InvalidProtocolBufferException e6) {
                        throw new RuntimeException(e6.setUnfinishedMessage(this));
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (f65198i == null) {
                    synchronized (t.class) {
                        if (f65198i == null) {
                            f65198i = new GeneratedMessageLite.DefaultInstanceBasedParser(f65197h);
                        }
                    }
                }
                return f65198i;
            default:
                throw new UnsupportedOperationException();
        }
        return f65197h;
    }

    @Override // com.wufan.friend.chat.protocol.u
    public boolean e() {
        return this.f65199b != null;
    }

    @Override // com.wufan.friend.chat.protocol.u
    public com.wufan.friend.chat.protocol.a g() {
        com.wufan.friend.chat.protocol.a aVar = this.f65199b;
        return aVar == null ? com.wufan.friend.chat.protocol.a.q3() : aVar;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int computeMessageSize = this.f65199b != null ? 0 + CodedOutputStream.computeMessageSize(1, g()) : 0;
        if (this.f65200c != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(2, q());
        }
        if (this.f65201d != OnlineState.ONLINE.getNumber()) {
            computeMessageSize += CodedOutputStream.computeEnumSize(3, this.f65201d);
        }
        this.memoizedSerializedSize = computeMessageSize;
        return computeMessageSize;
    }

    @Override // com.wufan.friend.chat.protocol.u
    public d1 q() {
        d1 d1Var = this.f65200c;
        return d1Var == null ? d1.k3() : d1Var;
    }

    @Override // com.wufan.friend.chat.protocol.u
    public boolean u() {
        return this.f65200c != null;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f65199b != null) {
            codedOutputStream.writeMessage(1, g());
        }
        if (this.f65200c != null) {
            codedOutputStream.writeMessage(2, q());
        }
        if (this.f65201d != OnlineState.ONLINE.getNumber()) {
            codedOutputStream.writeEnum(3, this.f65201d);
        }
    }
}
