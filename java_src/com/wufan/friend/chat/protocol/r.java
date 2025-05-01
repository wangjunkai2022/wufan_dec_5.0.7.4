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
/* compiled from: Friend.java */
/* loaded from: classes6.dex */
public final class r extends GeneratedMessageLite<r, b> implements b0 {

    /* renamed from: d  reason: collision with root package name */
    public static final int f65161d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f65162e = 2;

    /* renamed from: f  reason: collision with root package name */
    private static final r f65163f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile Parser<r> f65164g;

    /* renamed from: b  reason: collision with root package name */
    private com.wufan.friend.chat.protocol.a f65165b;

    /* renamed from: c  reason: collision with root package name */
    private d1 f65166c;

    /* compiled from: Friend.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65167a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65167a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65167a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65167a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65167a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65167a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65167a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65167a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65167a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: Friend.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<r, b> implements b0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.friend.chat.protocol.b0
        public boolean R() {
            return ((r) this.instance).R();
        }

        public b V2() {
            copyOnWrite();
            ((r) this.instance).clearState();
            return this;
        }

        public b W2(com.wufan.friend.chat.protocol.a aVar) {
            copyOnWrite();
            ((r) this.instance).f3(aVar);
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((r) this.instance).clearAccount();
            return this;
        }

        public b X2(d1 d1Var) {
            copyOnWrite();
            ((r) this.instance).g3(d1Var);
            return this;
        }

        public b Y2(a.b bVar) {
            copyOnWrite();
            ((r) this.instance).t3(bVar);
            return this;
        }

        public b Z2(com.wufan.friend.chat.protocol.a aVar) {
            copyOnWrite();
            ((r) this.instance).u3(aVar);
            return this;
        }

        public b a3(d1.b bVar) {
            copyOnWrite();
            ((r) this.instance).v3(bVar);
            return this;
        }

        public b b3(d1 d1Var) {
            copyOnWrite();
            ((r) this.instance).w3(d1Var);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.b0
        public com.wufan.friend.chat.protocol.a getAccount() {
            return ((r) this.instance).getAccount();
        }

        @Override // com.wufan.friend.chat.protocol.b0
        public d1 getState() {
            return ((r) this.instance).getState();
        }

        @Override // com.wufan.friend.chat.protocol.b0
        public boolean hasAccount() {
            return ((r) this.instance).hasAccount();
        }

        private b() {
            super(r.f65163f);
        }
    }

    static {
        r rVar = new r();
        f65163f = rVar;
        rVar.makeImmutable();
    }

    private r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccount() {
        this.f65165b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.f65166c = null;
    }

    public static r e3() {
        return f65163f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f3(com.wufan.friend.chat.protocol.a aVar) {
        com.wufan.friend.chat.protocol.a aVar2 = this.f65165b;
        if (aVar2 != null && aVar2 != com.wufan.friend.chat.protocol.a.q3()) {
            this.f65165b = com.wufan.friend.chat.protocol.a.s3(this.f65165b).mergeFrom((a.b) aVar).buildPartial();
        } else {
            this.f65165b = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g3(d1 d1Var) {
        d1 d1Var2 = this.f65166c;
        if (d1Var2 != null && d1Var2 != d1.k3()) {
            this.f65166c = d1.m3(this.f65166c).mergeFrom((d1.b) d1Var).buildPartial();
        } else {
            this.f65166c = d1Var;
        }
    }

    public static b h3() {
        return f65163f.toBuilder();
    }

    public static b i3(r rVar) {
        return f65163f.toBuilder().mergeFrom((b) rVar);
    }

    public static r j3(InputStream inputStream) throws IOException {
        return (r) GeneratedMessageLite.parseDelimitedFrom(f65163f, inputStream);
    }

    public static r k3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (r) GeneratedMessageLite.parseDelimitedFrom(f65163f, inputStream, extensionRegistryLite);
    }

    public static r l3(ByteString byteString) throws InvalidProtocolBufferException {
        return (r) GeneratedMessageLite.parseFrom(f65163f, byteString);
    }

    public static r m3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (r) GeneratedMessageLite.parseFrom(f65163f, byteString, extensionRegistryLite);
    }

    public static r n3(CodedInputStream codedInputStream) throws IOException {
        return (r) GeneratedMessageLite.parseFrom(f65163f, codedInputStream);
    }

    public static r o3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (r) GeneratedMessageLite.parseFrom(f65163f, codedInputStream, extensionRegistryLite);
    }

    public static r p3(InputStream inputStream) throws IOException {
        return (r) GeneratedMessageLite.parseFrom(f65163f, inputStream);
    }

    public static Parser<r> parser() {
        return f65163f.getParserForType();
    }

    public static r q3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (r) GeneratedMessageLite.parseFrom(f65163f, inputStream, extensionRegistryLite);
    }

    public static r r3(byte[] bArr) throws InvalidProtocolBufferException {
        return (r) GeneratedMessageLite.parseFrom(f65163f, bArr);
    }

    public static r s3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (r) GeneratedMessageLite.parseFrom(f65163f, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t3(a.b bVar) {
        this.f65165b = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u3(com.wufan.friend.chat.protocol.a aVar) {
        Objects.requireNonNull(aVar);
        this.f65165b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v3(d1.b bVar) {
        this.f65166c = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w3(d1 d1Var) {
        Objects.requireNonNull(d1Var);
        this.f65166c = d1Var;
    }

    @Override // com.wufan.friend.chat.protocol.b0
    public boolean R() {
        return this.f65166c != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65167a[methodToInvoke.ordinal()]) {
            case 1:
                return new r();
            case 2:
                return f65163f;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                r rVar = (r) obj2;
                this.f65165b = (com.wufan.friend.chat.protocol.a) visitor.visitMessage(this.f65165b, rVar.f65165b);
                this.f65166c = (d1) visitor.visitMessage(this.f65166c, rVar.f65166c);
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
                                    com.wufan.friend.chat.protocol.a aVar = this.f65165b;
                                    a.b builder = aVar != null ? aVar.toBuilder() : null;
                                    com.wufan.friend.chat.protocol.a aVar2 = (com.wufan.friend.chat.protocol.a) codedInputStream.readMessage(com.wufan.friend.chat.protocol.a.parser(), extensionRegistryLite);
                                    this.f65165b = aVar2;
                                    if (builder != null) {
                                        builder.mergeFrom((a.b) aVar2);
                                        this.f65165b = builder.buildPartial();
                                    }
                                } else if (readTag != 18) {
                                    if (!codedInputStream.skipField(readTag)) {
                                    }
                                } else {
                                    d1 d1Var = this.f65166c;
                                    d1.b builder2 = d1Var != null ? d1Var.toBuilder() : null;
                                    d1 d1Var2 = (d1) codedInputStream.readMessage(d1.parser(), extensionRegistryLite);
                                    this.f65166c = d1Var2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((d1.b) d1Var2);
                                        this.f65166c = builder2.buildPartial();
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
                if (f65164g == null) {
                    synchronized (r.class) {
                        if (f65164g == null) {
                            f65164g = new GeneratedMessageLite.DefaultInstanceBasedParser(f65163f);
                        }
                    }
                }
                return f65164g;
            default:
                throw new UnsupportedOperationException();
        }
        return f65163f;
    }

    @Override // com.wufan.friend.chat.protocol.b0
    public com.wufan.friend.chat.protocol.a getAccount() {
        com.wufan.friend.chat.protocol.a aVar = this.f65165b;
        return aVar == null ? com.wufan.friend.chat.protocol.a.q3() : aVar;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int computeMessageSize = this.f65165b != null ? 0 + CodedOutputStream.computeMessageSize(1, getAccount()) : 0;
        if (this.f65166c != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(2, getState());
        }
        this.memoizedSerializedSize = computeMessageSize;
        return computeMessageSize;
    }

    @Override // com.wufan.friend.chat.protocol.b0
    public d1 getState() {
        d1 d1Var = this.f65166c;
        return d1Var == null ? d1.k3() : d1Var;
    }

    @Override // com.wufan.friend.chat.protocol.b0
    public boolean hasAccount() {
        return this.f65165b != null;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f65165b != null) {
            codedOutputStream.writeMessage(1, getAccount());
        }
        if (this.f65166c != null) {
            codedOutputStream.writeMessage(2, getState());
        }
    }
}
