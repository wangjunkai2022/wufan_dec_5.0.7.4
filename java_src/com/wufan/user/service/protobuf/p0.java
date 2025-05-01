package com.wufan.user.service.protobuf;

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
/* compiled from: UserLoginRequestParameters.java */
/* loaded from: classes6.dex */
public final class p0 extends GeneratedMessageLite<p0, b> implements q0 {

    /* renamed from: f  reason: collision with root package name */
    public static final int f65501f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f65502g = 2;

    /* renamed from: h  reason: collision with root package name */
    public static final int f65503h = 3;

    /* renamed from: i  reason: collision with root package name */
    public static final int f65504i = 4;

    /* renamed from: j  reason: collision with root package name */
    private static final p0 f65505j;

    /* renamed from: k  reason: collision with root package name */
    private static volatile Parser<p0> f65506k;

    /* renamed from: b  reason: collision with root package name */
    private String f65507b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f65508c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f65509d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f65510e = "";

    /* compiled from: UserLoginRequestParameters.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65511a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65511a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65511a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65511a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65511a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65511a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65511a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65511a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65511a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: UserLoginRequestParameters.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<p0, b> implements q0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b V2() {
            copyOnWrite();
            ((p0) this.instance).i3();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((p0) this.instance).clearPassword();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((p0) this.instance).clearAccount();
            return this;
        }

        public b X2() {
            copyOnWrite();
            ((p0) this.instance).j3();
            return this;
        }

        public b Y2(String str) {
            copyOnWrite();
            ((p0) this.instance).x3(str);
            return this;
        }

        public b Z2(ByteString byteString) {
            copyOnWrite();
            ((p0) this.instance).y3(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.q0
        public ByteString a() {
            return ((p0) this.instance).a();
        }

        public b a3(String str) {
            copyOnWrite();
            ((p0) this.instance).z3(str);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.q0
        public ByteString b() {
            return ((p0) this.instance).b();
        }

        public b b3(ByteString byteString) {
            copyOnWrite();
            ((p0) this.instance).A3(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.q0
        public String c() {
            return ((p0) this.instance).c();
        }

        public b c3(String str) {
            copyOnWrite();
            ((p0) this.instance).setPassword(str);
            return this;
        }

        public b d3(ByteString byteString) {
            copyOnWrite();
            ((p0) this.instance).setPasswordBytes(byteString);
            return this;
        }

        public b e3(String str) {
            copyOnWrite();
            ((p0) this.instance).B3(str);
            return this;
        }

        public b f3(ByteString byteString) {
            copyOnWrite();
            ((p0) this.instance).C3(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.q0
        public String getAccount() {
            return ((p0) this.instance).getAccount();
        }

        @Override // com.wufan.user.service.protobuf.q0
        public String getAppVersion() {
            return ((p0) this.instance).getAppVersion();
        }

        @Override // com.wufan.user.service.protobuf.q0
        public String getPassword() {
            return ((p0) this.instance).getPassword();
        }

        @Override // com.wufan.user.service.protobuf.q0
        public ByteString getPasswordBytes() {
            return ((p0) this.instance).getPasswordBytes();
        }

        @Override // com.wufan.user.service.protobuf.q0
        public ByteString h() {
            return ((p0) this.instance).h();
        }

        private b() {
            super(p0.f65505j);
        }
    }

    static {
        p0 p0Var = new p0();
        f65505j = p0Var;
        p0Var.makeImmutable();
    }

    private p0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65510e = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3(String str) {
        Objects.requireNonNull(str);
        this.f65509d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65509d = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccount() {
        this.f65507b = k3().getAccount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPassword() {
        this.f65508c = k3().getPassword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3() {
        this.f65510e = k3().getAppVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3() {
        this.f65509d = k3().c();
    }

    public static p0 k3() {
        return f65505j;
    }

    public static b l3() {
        return f65505j.toBuilder();
    }

    public static b m3(p0 p0Var) {
        return f65505j.toBuilder().mergeFrom((b) p0Var);
    }

    public static p0 n3(InputStream inputStream) throws IOException {
        return (p0) GeneratedMessageLite.parseDelimitedFrom(f65505j, inputStream);
    }

    public static p0 o3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (p0) GeneratedMessageLite.parseDelimitedFrom(f65505j, inputStream, extensionRegistryLite);
    }

    public static p0 p3(ByteString byteString) throws InvalidProtocolBufferException {
        return (p0) GeneratedMessageLite.parseFrom(f65505j, byteString);
    }

    public static Parser<p0> parser() {
        return f65505j.getParserForType();
    }

    public static p0 q3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (p0) GeneratedMessageLite.parseFrom(f65505j, byteString, extensionRegistryLite);
    }

    public static p0 r3(CodedInputStream codedInputStream) throws IOException {
        return (p0) GeneratedMessageLite.parseFrom(f65505j, codedInputStream);
    }

    public static p0 s3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (p0) GeneratedMessageLite.parseFrom(f65505j, codedInputStream, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassword(String str) {
        Objects.requireNonNull(str);
        this.f65508c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPasswordBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65508c = byteString.toStringUtf8();
    }

    public static p0 t3(InputStream inputStream) throws IOException {
        return (p0) GeneratedMessageLite.parseFrom(f65505j, inputStream);
    }

    public static p0 u3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (p0) GeneratedMessageLite.parseFrom(f65505j, inputStream, extensionRegistryLite);
    }

    public static p0 v3(byte[] bArr) throws InvalidProtocolBufferException {
        return (p0) GeneratedMessageLite.parseFrom(f65505j, bArr);
    }

    public static p0 w3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (p0) GeneratedMessageLite.parseFrom(f65505j, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3(String str) {
        Objects.requireNonNull(str);
        this.f65507b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65507b = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(String str) {
        Objects.requireNonNull(str);
        this.f65510e = str;
    }

    @Override // com.wufan.user.service.protobuf.q0
    public ByteString a() {
        return ByteString.copyFromUtf8(this.f65510e);
    }

    @Override // com.wufan.user.service.protobuf.q0
    public ByteString b() {
        return ByteString.copyFromUtf8(this.f65509d);
    }

    @Override // com.wufan.user.service.protobuf.q0
    public String c() {
        return this.f65509d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65511a[methodToInvoke.ordinal()]) {
            case 1:
                return new p0();
            case 2:
                return f65505j;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                p0 p0Var = (p0) obj2;
                this.f65507b = visitor.visitString(!this.f65507b.isEmpty(), this.f65507b, !p0Var.f65507b.isEmpty(), p0Var.f65507b);
                this.f65508c = visitor.visitString(!this.f65508c.isEmpty(), this.f65508c, !p0Var.f65508c.isEmpty(), p0Var.f65508c);
                this.f65509d = visitor.visitString(!this.f65509d.isEmpty(), this.f65509d, !p0Var.f65509d.isEmpty(), p0Var.f65509d);
                this.f65510e = visitor.visitString(!this.f65510e.isEmpty(), this.f65510e, true ^ p0Var.f65510e.isEmpty(), p0Var.f65510e);
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
                                    this.f65507b = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    this.f65508c = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    this.f65509d = codedInputStream.readStringRequireUtf8();
                                } else if (readTag != 34) {
                                    if (!codedInputStream.skipField(readTag)) {
                                    }
                                } else {
                                    this.f65510e = codedInputStream.readStringRequireUtf8();
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
                if (f65506k == null) {
                    synchronized (p0.class) {
                        if (f65506k == null) {
                            f65506k = new GeneratedMessageLite.DefaultInstanceBasedParser(f65505j);
                        }
                    }
                }
                return f65506k;
            default:
                throw new UnsupportedOperationException();
        }
        return f65505j;
    }

    @Override // com.wufan.user.service.protobuf.q0
    public String getAccount() {
        return this.f65507b;
    }

    @Override // com.wufan.user.service.protobuf.q0
    public String getAppVersion() {
        return this.f65510e;
    }

    @Override // com.wufan.user.service.protobuf.q0
    public String getPassword() {
        return this.f65508c;
    }

    @Override // com.wufan.user.service.protobuf.q0
    public ByteString getPasswordBytes() {
        return ByteString.copyFromUtf8(this.f65508c);
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int computeStringSize = this.f65507b.isEmpty() ? 0 : 0 + CodedOutputStream.computeStringSize(1, getAccount());
        if (!this.f65508c.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(2, getPassword());
        }
        if (!this.f65509d.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(3, c());
        }
        if (!this.f65510e.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(4, getAppVersion());
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    @Override // com.wufan.user.service.protobuf.q0
    public ByteString h() {
        return ByteString.copyFromUtf8(this.f65507b);
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f65507b.isEmpty()) {
            codedOutputStream.writeString(1, getAccount());
        }
        if (!this.f65508c.isEmpty()) {
            codedOutputStream.writeString(2, getPassword());
        }
        if (!this.f65509d.isEmpty()) {
            codedOutputStream.writeString(3, c());
        }
        if (this.f65510e.isEmpty()) {
            return;
        }
        codedOutputStream.writeString(4, getAppVersion());
    }
}
