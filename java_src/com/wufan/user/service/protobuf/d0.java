package com.wufan.user.service.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.wufan.user.service.protobuf.n0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* compiled from: ResponseResult.java */
/* loaded from: classes6.dex */
public final class d0 extends GeneratedMessageLite<d0, b> implements e0 {

    /* renamed from: e  reason: collision with root package name */
    public static final int f65365e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f65366f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f65367g = 3;

    /* renamed from: h  reason: collision with root package name */
    private static final d0 f65368h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile Parser<d0> f65369i;

    /* renamed from: b  reason: collision with root package name */
    private int f65370b;

    /* renamed from: c  reason: collision with root package name */
    private n0 f65371c;

    /* renamed from: d  reason: collision with root package name */
    private String f65372d = "";

    /* compiled from: ResponseResult.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65373a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65373a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65373a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65373a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65373a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65373a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65373a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65373a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65373a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: ResponseResult.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<d0, b> implements e0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b V2() {
            copyOnWrite();
            ((d0) this.instance).clearError();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((d0) this.instance).g3();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((d0) this.instance).f3();
            return this;
        }

        public b X2(n0 n0Var) {
            copyOnWrite();
            ((d0) this.instance).i3(n0Var);
            return this;
        }

        public b Y2(n0.b bVar) {
            copyOnWrite();
            ((d0) this.instance).v3(bVar);
            return this;
        }

        public b Z2(n0 n0Var) {
            copyOnWrite();
            ((d0) this.instance).w3(n0Var);
            return this;
        }

        public b a3(int i4) {
            copyOnWrite();
            ((d0) this.instance).x3(i4);
            return this;
        }

        public b b3(String str) {
            copyOnWrite();
            ((d0) this.instance).y3(str);
            return this;
        }

        public b c3(ByteString byteString) {
            copyOnWrite();
            ((d0) this.instance).z3(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.e0
        public n0 getData() {
            return ((d0) this.instance).getData();
        }

        @Override // com.wufan.user.service.protobuf.e0
        public int getError() {
            return ((d0) this.instance).getError();
        }

        @Override // com.wufan.user.service.protobuf.e0
        public ByteString j() {
            return ((d0) this.instance).j();
        }

        @Override // com.wufan.user.service.protobuf.e0
        public String k() {
            return ((d0) this.instance).k();
        }

        @Override // com.wufan.user.service.protobuf.e0
        public boolean m() {
            return ((d0) this.instance).m();
        }

        private b() {
            super(d0.f65368h);
        }
    }

    static {
        d0 d0Var = new d0();
        f65368h = d0Var;
        d0Var.makeImmutable();
    }

    private d0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearError() {
        this.f65370b = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f3() {
        this.f65371c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g3() {
        this.f65372d = h3().k();
    }

    public static d0 h3() {
        return f65368h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3(n0 n0Var) {
        n0 n0Var2 = this.f65371c;
        if (n0Var2 != null && n0Var2 != n0.b5()) {
            this.f65371c = n0.g5(this.f65371c).mergeFrom((n0.b) n0Var).buildPartial();
        } else {
            this.f65371c = n0Var;
        }
    }

    public static b j3() {
        return f65368h.toBuilder();
    }

    public static b k3(d0 d0Var) {
        return f65368h.toBuilder().mergeFrom((b) d0Var);
    }

    public static d0 l3(InputStream inputStream) throws IOException {
        return (d0) GeneratedMessageLite.parseDelimitedFrom(f65368h, inputStream);
    }

    public static d0 m3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (d0) GeneratedMessageLite.parseDelimitedFrom(f65368h, inputStream, extensionRegistryLite);
    }

    public static d0 n3(ByteString byteString) throws InvalidProtocolBufferException {
        return (d0) GeneratedMessageLite.parseFrom(f65368h, byteString);
    }

    public static d0 o3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (d0) GeneratedMessageLite.parseFrom(f65368h, byteString, extensionRegistryLite);
    }

    public static d0 p3(CodedInputStream codedInputStream) throws IOException {
        return (d0) GeneratedMessageLite.parseFrom(f65368h, codedInputStream);
    }

    public static Parser<d0> parser() {
        return f65368h.getParserForType();
    }

    public static d0 q3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (d0) GeneratedMessageLite.parseFrom(f65368h, codedInputStream, extensionRegistryLite);
    }

    public static d0 r3(InputStream inputStream) throws IOException {
        return (d0) GeneratedMessageLite.parseFrom(f65368h, inputStream);
    }

    public static d0 s3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (d0) GeneratedMessageLite.parseFrom(f65368h, inputStream, extensionRegistryLite);
    }

    public static d0 t3(byte[] bArr) throws InvalidProtocolBufferException {
        return (d0) GeneratedMessageLite.parseFrom(f65368h, bArr);
    }

    public static d0 u3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (d0) GeneratedMessageLite.parseFrom(f65368h, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v3(n0.b bVar) {
        this.f65371c = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w3(n0 n0Var) {
        Objects.requireNonNull(n0Var);
        this.f65371c = n0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3(int i4) {
        this.f65370b = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3(String str) {
        Objects.requireNonNull(str);
        this.f65372d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65372d = byteString.toStringUtf8();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65373a[methodToInvoke.ordinal()]) {
            case 1:
                return new d0();
            case 2:
                return f65368h;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                d0 d0Var = (d0) obj2;
                int i4 = this.f65370b;
                boolean z4 = i4 != 0;
                int i5 = d0Var.f65370b;
                this.f65370b = visitor.visitInt(z4, i4, i5 != 0, i5);
                this.f65371c = (n0) visitor.visitMessage(this.f65371c, d0Var.f65371c);
                this.f65372d = visitor.visitString(!this.f65372d.isEmpty(), this.f65372d, !d0Var.f65372d.isEmpty(), d0Var.f65372d);
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
                                this.f65370b = codedInputStream.readInt32();
                            } else if (readTag == 18) {
                                n0 n0Var = this.f65371c;
                                n0.b builder = n0Var != null ? n0Var.toBuilder() : null;
                                n0 n0Var2 = (n0) codedInputStream.readMessage(n0.parser(), extensionRegistryLite);
                                this.f65371c = n0Var2;
                                if (builder != null) {
                                    builder.mergeFrom((n0.b) n0Var2);
                                    this.f65371c = builder.buildPartial();
                                }
                            } else if (readTag != 26) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f65372d = codedInputStream.readStringRequireUtf8();
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
                if (f65369i == null) {
                    synchronized (d0.class) {
                        if (f65369i == null) {
                            f65369i = new GeneratedMessageLite.DefaultInstanceBasedParser(f65368h);
                        }
                    }
                }
                return f65369i;
            default:
                throw new UnsupportedOperationException();
        }
        return f65368h;
    }

    @Override // com.wufan.user.service.protobuf.e0
    public n0 getData() {
        n0 n0Var = this.f65371c;
        return n0Var == null ? n0.b5() : n0Var;
    }

    @Override // com.wufan.user.service.protobuf.e0
    public int getError() {
        return this.f65370b;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int i5 = this.f65370b;
        int computeInt32Size = i5 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i5) : 0;
        if (this.f65371c != null) {
            computeInt32Size += CodedOutputStream.computeMessageSize(2, getData());
        }
        if (!this.f65372d.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(3, k());
        }
        this.memoizedSerializedSize = computeInt32Size;
        return computeInt32Size;
    }

    @Override // com.wufan.user.service.protobuf.e0
    public ByteString j() {
        return ByteString.copyFromUtf8(this.f65372d);
    }

    @Override // com.wufan.user.service.protobuf.e0
    public String k() {
        return this.f65372d;
    }

    @Override // com.wufan.user.service.protobuf.e0
    public boolean m() {
        return this.f65371c != null;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i4 = this.f65370b;
        if (i4 != 0) {
            codedOutputStream.writeInt32(1, i4);
        }
        if (this.f65371c != null) {
            codedOutputStream.writeMessage(2, getData());
        }
        if (this.f65372d.isEmpty()) {
            return;
        }
        codedOutputStream.writeString(3, k());
    }
}
