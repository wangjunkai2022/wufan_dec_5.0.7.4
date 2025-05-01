package com.wufan.user.service.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.wufan.user.service.protobuf.f;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* compiled from: MessageCheckTokenResponseResult.java */
/* loaded from: classes6.dex */
public final class n extends GeneratedMessageLite<n, b> implements o {

    /* renamed from: e  reason: collision with root package name */
    public static final int f65463e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f65464f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f65465g = 3;

    /* renamed from: h  reason: collision with root package name */
    private static final n f65466h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile Parser<n> f65467i;

    /* renamed from: b  reason: collision with root package name */
    private int f65468b;

    /* renamed from: c  reason: collision with root package name */
    private f f65469c;

    /* renamed from: d  reason: collision with root package name */
    private String f65470d = "";

    /* compiled from: MessageCheckTokenResponseResult.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65471a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65471a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65471a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65471a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65471a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65471a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65471a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65471a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65471a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: MessageCheckTokenResponseResult.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<n, b> implements o {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b V2() {
            copyOnWrite();
            ((n) this.instance).clearError();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((n) this.instance).g3();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((n) this.instance).f3();
            return this;
        }

        public b X2(f fVar) {
            copyOnWrite();
            ((n) this.instance).i3(fVar);
            return this;
        }

        public b Y2(f.b bVar) {
            copyOnWrite();
            ((n) this.instance).v3(bVar);
            return this;
        }

        public b Z2(f fVar) {
            copyOnWrite();
            ((n) this.instance).w3(fVar);
            return this;
        }

        public b a3(int i4) {
            copyOnWrite();
            ((n) this.instance).x3(i4);
            return this;
        }

        public b b3(String str) {
            copyOnWrite();
            ((n) this.instance).y3(str);
            return this;
        }

        public b c3(ByteString byteString) {
            copyOnWrite();
            ((n) this.instance).z3(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.o
        public f getData() {
            return ((n) this.instance).getData();
        }

        @Override // com.wufan.user.service.protobuf.o
        public int getError() {
            return ((n) this.instance).getError();
        }

        @Override // com.wufan.user.service.protobuf.o
        public ByteString j() {
            return ((n) this.instance).j();
        }

        @Override // com.wufan.user.service.protobuf.o
        public String k() {
            return ((n) this.instance).k();
        }

        @Override // com.wufan.user.service.protobuf.o
        public boolean m() {
            return ((n) this.instance).m();
        }

        private b() {
            super(n.f65466h);
        }
    }

    static {
        n nVar = new n();
        f65466h = nVar;
        nVar.makeImmutable();
    }

    private n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearError() {
        this.f65468b = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f3() {
        this.f65469c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g3() {
        this.f65470d = h3().k();
    }

    public static n h3() {
        return f65466h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3(f fVar) {
        f fVar2 = this.f65469c;
        if (fVar2 != null && fVar2 != f.l3()) {
            this.f65469c = f.n3(this.f65469c).mergeFrom((f.b) fVar).buildPartial();
        } else {
            this.f65469c = fVar;
        }
    }

    public static b j3() {
        return f65466h.toBuilder();
    }

    public static b k3(n nVar) {
        return f65466h.toBuilder().mergeFrom((b) nVar);
    }

    public static n l3(InputStream inputStream) throws IOException {
        return (n) GeneratedMessageLite.parseDelimitedFrom(f65466h, inputStream);
    }

    public static n m3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (n) GeneratedMessageLite.parseDelimitedFrom(f65466h, inputStream, extensionRegistryLite);
    }

    public static n n3(ByteString byteString) throws InvalidProtocolBufferException {
        return (n) GeneratedMessageLite.parseFrom(f65466h, byteString);
    }

    public static n o3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (n) GeneratedMessageLite.parseFrom(f65466h, byteString, extensionRegistryLite);
    }

    public static n p3(CodedInputStream codedInputStream) throws IOException {
        return (n) GeneratedMessageLite.parseFrom(f65466h, codedInputStream);
    }

    public static Parser<n> parser() {
        return f65466h.getParserForType();
    }

    public static n q3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (n) GeneratedMessageLite.parseFrom(f65466h, codedInputStream, extensionRegistryLite);
    }

    public static n r3(InputStream inputStream) throws IOException {
        return (n) GeneratedMessageLite.parseFrom(f65466h, inputStream);
    }

    public static n s3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (n) GeneratedMessageLite.parseFrom(f65466h, inputStream, extensionRegistryLite);
    }

    public static n t3(byte[] bArr) throws InvalidProtocolBufferException {
        return (n) GeneratedMessageLite.parseFrom(f65466h, bArr);
    }

    public static n u3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (n) GeneratedMessageLite.parseFrom(f65466h, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v3(f.b bVar) {
        this.f65469c = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w3(f fVar) {
        Objects.requireNonNull(fVar);
        this.f65469c = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3(int i4) {
        this.f65468b = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3(String str) {
        Objects.requireNonNull(str);
        this.f65470d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65470d = byteString.toStringUtf8();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65471a[methodToInvoke.ordinal()]) {
            case 1:
                return new n();
            case 2:
                return f65466h;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                n nVar = (n) obj2;
                int i4 = this.f65468b;
                boolean z4 = i4 != 0;
                int i5 = nVar.f65468b;
                this.f65468b = visitor.visitInt(z4, i4, i5 != 0, i5);
                this.f65469c = (f) visitor.visitMessage(this.f65469c, nVar.f65469c);
                this.f65470d = visitor.visitString(!this.f65470d.isEmpty(), this.f65470d, !nVar.f65470d.isEmpty(), nVar.f65470d);
                GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!r0) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f65468b = codedInputStream.readInt32();
                            } else if (readTag == 18) {
                                f fVar = this.f65469c;
                                f.b builder = fVar != null ? fVar.toBuilder() : null;
                                f fVar2 = (f) codedInputStream.readMessage(f.parser(), extensionRegistryLite);
                                this.f65469c = fVar2;
                                if (builder != null) {
                                    builder.mergeFrom((f.b) fVar2);
                                    this.f65469c = builder.buildPartial();
                                }
                            } else if (readTag != 26) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f65470d = codedInputStream.readStringRequireUtf8();
                            }
                        }
                        r0 = true;
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
                if (f65467i == null) {
                    synchronized (n.class) {
                        if (f65467i == null) {
                            f65467i = new GeneratedMessageLite.DefaultInstanceBasedParser(f65466h);
                        }
                    }
                }
                return f65467i;
            default:
                throw new UnsupportedOperationException();
        }
        return f65466h;
    }

    @Override // com.wufan.user.service.protobuf.o
    public f getData() {
        f fVar = this.f65469c;
        return fVar == null ? f.l3() : fVar;
    }

    @Override // com.wufan.user.service.protobuf.o
    public int getError() {
        return this.f65468b;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int i5 = this.f65468b;
        int computeInt32Size = i5 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i5) : 0;
        if (this.f65469c != null) {
            computeInt32Size += CodedOutputStream.computeMessageSize(2, getData());
        }
        if (!this.f65470d.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(3, k());
        }
        this.memoizedSerializedSize = computeInt32Size;
        return computeInt32Size;
    }

    @Override // com.wufan.user.service.protobuf.o
    public ByteString j() {
        return ByteString.copyFromUtf8(this.f65470d);
    }

    @Override // com.wufan.user.service.protobuf.o
    public String k() {
        return this.f65470d;
    }

    @Override // com.wufan.user.service.protobuf.o
    public boolean m() {
        return this.f65469c != null;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i4 = this.f65468b;
        if (i4 != 0) {
            codedOutputStream.writeInt32(1, i4);
        }
        if (this.f65469c != null) {
            codedOutputStream.writeMessage(2, getData());
        }
        if (this.f65470d.isEmpty()) {
            return;
        }
        codedOutputStream.writeString(3, k());
    }
}
