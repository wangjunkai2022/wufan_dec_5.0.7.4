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
/* compiled from: FriendChangePlayStateNotification.java */
/* loaded from: classes6.dex */
public final class v extends GeneratedMessageLite<v, b> implements w {

    /* renamed from: d  reason: collision with root package name */
    public static final int f65235d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f65236e = 2;

    /* renamed from: f  reason: collision with root package name */
    private static final v f65237f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile Parser<v> f65238g;

    /* renamed from: b  reason: collision with root package name */
    private com.wufan.friend.chat.protocol.a f65239b;

    /* renamed from: c  reason: collision with root package name */
    private d1 f65240c;

    /* compiled from: FriendChangePlayStateNotification.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65241a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65241a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65241a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65241a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65241a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65241a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65241a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65241a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65241a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: FriendChangePlayStateNotification.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<v, b> implements w {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.friend.chat.protocol.w
        public boolean R() {
            return ((v) this.instance).R();
        }

        public b V2() {
            copyOnWrite();
            ((v) this.instance).clearState();
            return this;
        }

        public b W2(com.wufan.friend.chat.protocol.a aVar) {
            copyOnWrite();
            ((v) this.instance).g3(aVar);
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((v) this.instance).e3();
            return this;
        }

        public b X2(d1 d1Var) {
            copyOnWrite();
            ((v) this.instance).h3(d1Var);
            return this;
        }

        public b Y2(a.b bVar) {
            copyOnWrite();
            ((v) this.instance).u3(bVar);
            return this;
        }

        public b Z2(com.wufan.friend.chat.protocol.a aVar) {
            copyOnWrite();
            ((v) this.instance).v3(aVar);
            return this;
        }

        public b a3(d1.b bVar) {
            copyOnWrite();
            ((v) this.instance).w3(bVar);
            return this;
        }

        public b b3(d1 d1Var) {
            copyOnWrite();
            ((v) this.instance).x3(d1Var);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.w
        public boolean e() {
            return ((v) this.instance).e();
        }

        @Override // com.wufan.friend.chat.protocol.w
        public com.wufan.friend.chat.protocol.a g() {
            return ((v) this.instance).g();
        }

        @Override // com.wufan.friend.chat.protocol.w
        public d1 getState() {
            return ((v) this.instance).getState();
        }

        private b() {
            super(v.f65237f);
        }
    }

    static {
        v vVar = new v();
        f65237f = vVar;
        vVar.makeImmutable();
    }

    private v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.f65240c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e3() {
        this.f65239b = null;
    }

    public static v f3() {
        return f65237f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g3(com.wufan.friend.chat.protocol.a aVar) {
        com.wufan.friend.chat.protocol.a aVar2 = this.f65239b;
        if (aVar2 != null && aVar2 != com.wufan.friend.chat.protocol.a.q3()) {
            this.f65239b = com.wufan.friend.chat.protocol.a.s3(this.f65239b).mergeFrom((a.b) aVar).buildPartial();
        } else {
            this.f65239b = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3(d1 d1Var) {
        d1 d1Var2 = this.f65240c;
        if (d1Var2 != null && d1Var2 != d1.k3()) {
            this.f65240c = d1.m3(this.f65240c).mergeFrom((d1.b) d1Var).buildPartial();
        } else {
            this.f65240c = d1Var;
        }
    }

    public static b i3() {
        return f65237f.toBuilder();
    }

    public static b j3(v vVar) {
        return f65237f.toBuilder().mergeFrom((b) vVar);
    }

    public static v k3(InputStream inputStream) throws IOException {
        return (v) GeneratedMessageLite.parseDelimitedFrom(f65237f, inputStream);
    }

    public static v l3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (v) GeneratedMessageLite.parseDelimitedFrom(f65237f, inputStream, extensionRegistryLite);
    }

    public static v m3(ByteString byteString) throws InvalidProtocolBufferException {
        return (v) GeneratedMessageLite.parseFrom(f65237f, byteString);
    }

    public static v n3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (v) GeneratedMessageLite.parseFrom(f65237f, byteString, extensionRegistryLite);
    }

    public static v o3(CodedInputStream codedInputStream) throws IOException {
        return (v) GeneratedMessageLite.parseFrom(f65237f, codedInputStream);
    }

    public static v p3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (v) GeneratedMessageLite.parseFrom(f65237f, codedInputStream, extensionRegistryLite);
    }

    public static Parser<v> parser() {
        return f65237f.getParserForType();
    }

    public static v q3(InputStream inputStream) throws IOException {
        return (v) GeneratedMessageLite.parseFrom(f65237f, inputStream);
    }

    public static v r3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (v) GeneratedMessageLite.parseFrom(f65237f, inputStream, extensionRegistryLite);
    }

    public static v s3(byte[] bArr) throws InvalidProtocolBufferException {
        return (v) GeneratedMessageLite.parseFrom(f65237f, bArr);
    }

    public static v t3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (v) GeneratedMessageLite.parseFrom(f65237f, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u3(a.b bVar) {
        this.f65239b = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v3(com.wufan.friend.chat.protocol.a aVar) {
        Objects.requireNonNull(aVar);
        this.f65239b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w3(d1.b bVar) {
        this.f65240c = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3(d1 d1Var) {
        Objects.requireNonNull(d1Var);
        this.f65240c = d1Var;
    }

    @Override // com.wufan.friend.chat.protocol.w
    public boolean R() {
        return this.f65240c != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65241a[methodToInvoke.ordinal()]) {
            case 1:
                return new v();
            case 2:
                return f65237f;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                v vVar = (v) obj2;
                this.f65239b = (com.wufan.friend.chat.protocol.a) visitor.visitMessage(this.f65239b, vVar.f65239b);
                this.f65240c = (d1) visitor.visitMessage(this.f65240c, vVar.f65240c);
                GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z4 = false;
                while (!z4) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    com.wufan.friend.chat.protocol.a aVar = this.f65239b;
                                    a.b builder = aVar != null ? aVar.toBuilder() : null;
                                    com.wufan.friend.chat.protocol.a aVar2 = (com.wufan.friend.chat.protocol.a) codedInputStream.readMessage(com.wufan.friend.chat.protocol.a.parser(), extensionRegistryLite);
                                    this.f65239b = aVar2;
                                    if (builder != null) {
                                        builder.mergeFrom((a.b) aVar2);
                                        this.f65239b = builder.buildPartial();
                                    }
                                } else if (readTag != 18) {
                                    if (!codedInputStream.skipField(readTag)) {
                                    }
                                } else {
                                    d1 d1Var = this.f65240c;
                                    d1.b builder2 = d1Var != null ? d1Var.toBuilder() : null;
                                    d1 d1Var2 = (d1) codedInputStream.readMessage(d1.parser(), extensionRegistryLite);
                                    this.f65240c = d1Var2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((d1.b) d1Var2);
                                        this.f65240c = builder2.buildPartial();
                                    }
                                }
                            }
                            z4 = true;
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
                if (f65238g == null) {
                    synchronized (v.class) {
                        if (f65238g == null) {
                            f65238g = new GeneratedMessageLite.DefaultInstanceBasedParser(f65237f);
                        }
                    }
                }
                return f65238g;
            default:
                throw new UnsupportedOperationException();
        }
        return f65237f;
    }

    @Override // com.wufan.friend.chat.protocol.w
    public boolean e() {
        return this.f65239b != null;
    }

    @Override // com.wufan.friend.chat.protocol.w
    public com.wufan.friend.chat.protocol.a g() {
        com.wufan.friend.chat.protocol.a aVar = this.f65239b;
        return aVar == null ? com.wufan.friend.chat.protocol.a.q3() : aVar;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int computeMessageSize = this.f65239b != null ? 0 + CodedOutputStream.computeMessageSize(1, g()) : 0;
        if (this.f65240c != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(2, getState());
        }
        this.memoizedSerializedSize = computeMessageSize;
        return computeMessageSize;
    }

    @Override // com.wufan.friend.chat.protocol.w
    public d1 getState() {
        d1 d1Var = this.f65240c;
        return d1Var == null ? d1.k3() : d1Var;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f65239b != null) {
            codedOutputStream.writeMessage(1, g());
        }
        if (this.f65240c != null) {
            codedOutputStream.writeMessage(2, getState());
        }
    }
}
