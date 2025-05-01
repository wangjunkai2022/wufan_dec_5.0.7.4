package com.wufan.user.service.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.wufan.user.service.protobuf.enumeration.LoginType;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* compiled from: UserRegStatusRequestArgs.java */
/* loaded from: classes6.dex */
public final class s0 extends GeneratedMessageLite<s0, b> implements t0 {

    /* renamed from: f  reason: collision with root package name */
    public static final int f65512f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f65513g = 2;

    /* renamed from: h  reason: collision with root package name */
    public static final int f65514h = 3;

    /* renamed from: i  reason: collision with root package name */
    public static final int f65515i = 4;

    /* renamed from: j  reason: collision with root package name */
    private static final s0 f65516j;

    /* renamed from: k  reason: collision with root package name */
    private static volatile Parser<s0> f65517k;

    /* renamed from: c  reason: collision with root package name */
    private int f65519c;

    /* renamed from: b  reason: collision with root package name */
    private String f65518b = "";

    /* renamed from: d  reason: collision with root package name */
    private String f65520d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f65521e = "";

    /* compiled from: UserRegStatusRequestArgs.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65522a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65522a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65522a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65522a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65522a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65522a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65522a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65522a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65522a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: UserRegStatusRequestArgs.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<s0, b> implements t0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.user.service.protobuf.t0
        public ByteString A2() {
            return ((s0) this.instance).A2();
        }

        @Override // com.wufan.user.service.protobuf.t0
        public String Q2() {
            return ((s0) this.instance).Q2();
        }

        public b V2() {
            copyOnWrite();
            ((s0) this.instance).j3();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((s0) this.instance).k3();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((s0) this.instance).i3();
            return this;
        }

        public b X2() {
            copyOnWrite();
            ((s0) this.instance).l3();
            return this;
        }

        public b Y2(String str) {
            copyOnWrite();
            ((s0) this.instance).z3(str);
            return this;
        }

        public b Z2(ByteString byteString) {
            copyOnWrite();
            ((s0) this.instance).A3(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.t0
        public ByteString a() {
            return ((s0) this.instance).a();
        }

        public b a3(String str) {
            copyOnWrite();
            ((s0) this.instance).B3(str);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.t0
        public ByteString b() {
            return ((s0) this.instance).b();
        }

        public b b3(ByteString byteString) {
            copyOnWrite();
            ((s0) this.instance).C3(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.t0
        public String c() {
            return ((s0) this.instance).c();
        }

        public b c3(LoginType loginType) {
            copyOnWrite();
            ((s0) this.instance).D3(loginType);
            return this;
        }

        public b d3(int i4) {
            copyOnWrite();
            ((s0) this.instance).E3(i4);
            return this;
        }

        public b e3(String str) {
            copyOnWrite();
            ((s0) this.instance).F3(str);
            return this;
        }

        public b f3(ByteString byteString) {
            copyOnWrite();
            ((s0) this.instance).G3(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.t0
        public String getAppVersion() {
            return ((s0) this.instance).getAppVersion();
        }

        @Override // com.wufan.user.service.protobuf.t0
        public LoginType n0() {
            return ((s0) this.instance).n0();
        }

        @Override // com.wufan.user.service.protobuf.t0
        public int x0() {
            return ((s0) this.instance).x0();
        }

        private b() {
            super(s0.f65516j);
        }
    }

    static {
        s0 s0Var = new s0();
        f65516j = s0Var;
        s0Var.makeImmutable();
    }

    private s0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65521e = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3(String str) {
        Objects.requireNonNull(str);
        this.f65518b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65518b = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D3(LoginType loginType) {
        Objects.requireNonNull(loginType);
        this.f65519c = loginType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E3(int i4) {
        this.f65519c = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F3(String str) {
        Objects.requireNonNull(str);
        this.f65520d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65520d = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3() {
        this.f65521e = m3().getAppVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3() {
        this.f65518b = m3().Q2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3() {
        this.f65519c = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3() {
        this.f65520d = m3().c();
    }

    public static s0 m3() {
        return f65516j;
    }

    public static b n3() {
        return f65516j.toBuilder();
    }

    public static b o3(s0 s0Var) {
        return f65516j.toBuilder().mergeFrom((b) s0Var);
    }

    public static s0 p3(InputStream inputStream) throws IOException {
        return (s0) GeneratedMessageLite.parseDelimitedFrom(f65516j, inputStream);
    }

    public static Parser<s0> parser() {
        return f65516j.getParserForType();
    }

    public static s0 q3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (s0) GeneratedMessageLite.parseDelimitedFrom(f65516j, inputStream, extensionRegistryLite);
    }

    public static s0 r3(ByteString byteString) throws InvalidProtocolBufferException {
        return (s0) GeneratedMessageLite.parseFrom(f65516j, byteString);
    }

    public static s0 s3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (s0) GeneratedMessageLite.parseFrom(f65516j, byteString, extensionRegistryLite);
    }

    public static s0 t3(CodedInputStream codedInputStream) throws IOException {
        return (s0) GeneratedMessageLite.parseFrom(f65516j, codedInputStream);
    }

    public static s0 u3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (s0) GeneratedMessageLite.parseFrom(f65516j, codedInputStream, extensionRegistryLite);
    }

    public static s0 v3(InputStream inputStream) throws IOException {
        return (s0) GeneratedMessageLite.parseFrom(f65516j, inputStream);
    }

    public static s0 w3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (s0) GeneratedMessageLite.parseFrom(f65516j, inputStream, extensionRegistryLite);
    }

    public static s0 x3(byte[] bArr) throws InvalidProtocolBufferException {
        return (s0) GeneratedMessageLite.parseFrom(f65516j, bArr);
    }

    public static s0 y3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (s0) GeneratedMessageLite.parseFrom(f65516j, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(String str) {
        Objects.requireNonNull(str);
        this.f65521e = str;
    }

    @Override // com.wufan.user.service.protobuf.t0
    public ByteString A2() {
        return ByteString.copyFromUtf8(this.f65518b);
    }

    @Override // com.wufan.user.service.protobuf.t0
    public String Q2() {
        return this.f65518b;
    }

    @Override // com.wufan.user.service.protobuf.t0
    public ByteString a() {
        return ByteString.copyFromUtf8(this.f65521e);
    }

    @Override // com.wufan.user.service.protobuf.t0
    public ByteString b() {
        return ByteString.copyFromUtf8(this.f65520d);
    }

    @Override // com.wufan.user.service.protobuf.t0
    public String c() {
        return this.f65520d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65522a[methodToInvoke.ordinal()]) {
            case 1:
                return new s0();
            case 2:
                return f65516j;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                s0 s0Var = (s0) obj2;
                this.f65518b = visitor.visitString(!this.f65518b.isEmpty(), this.f65518b, !s0Var.f65518b.isEmpty(), s0Var.f65518b);
                int i4 = this.f65519c;
                boolean z4 = i4 != 0;
                int i5 = s0Var.f65519c;
                this.f65519c = visitor.visitInt(z4, i4, i5 != 0, i5);
                this.f65520d = visitor.visitString(!this.f65520d.isEmpty(), this.f65520d, !s0Var.f65520d.isEmpty(), s0Var.f65520d);
                this.f65521e = visitor.visitString(!this.f65521e.isEmpty(), this.f65521e, !s0Var.f65521e.isEmpty(), s0Var.f65521e);
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
                                if (readTag == 10) {
                                    this.f65518b = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 16) {
                                    this.f65519c = codedInputStream.readEnum();
                                } else if (readTag == 26) {
                                    this.f65520d = codedInputStream.readStringRequireUtf8();
                                } else if (readTag != 34) {
                                    if (!codedInputStream.skipField(readTag)) {
                                    }
                                } else {
                                    this.f65521e = codedInputStream.readStringRequireUtf8();
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
                if (f65517k == null) {
                    synchronized (s0.class) {
                        if (f65517k == null) {
                            f65517k = new GeneratedMessageLite.DefaultInstanceBasedParser(f65516j);
                        }
                    }
                }
                return f65517k;
            default:
                throw new UnsupportedOperationException();
        }
        return f65516j;
    }

    @Override // com.wufan.user.service.protobuf.t0
    public String getAppVersion() {
        return this.f65521e;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int computeStringSize = this.f65518b.isEmpty() ? 0 : 0 + CodedOutputStream.computeStringSize(1, Q2());
        if (this.f65519c != LoginType.QQ.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(2, this.f65519c);
        }
        if (!this.f65520d.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(3, c());
        }
        if (!this.f65521e.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(4, getAppVersion());
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    @Override // com.wufan.user.service.protobuf.t0
    public LoginType n0() {
        LoginType forNumber = LoginType.forNumber(this.f65519c);
        return forNumber == null ? LoginType.UNRECOGNIZED : forNumber;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f65518b.isEmpty()) {
            codedOutputStream.writeString(1, Q2());
        }
        if (this.f65519c != LoginType.QQ.getNumber()) {
            codedOutputStream.writeEnum(2, this.f65519c);
        }
        if (!this.f65520d.isEmpty()) {
            codedOutputStream.writeString(3, c());
        }
        if (this.f65521e.isEmpty()) {
            return;
        }
        codedOutputStream.writeString(4, getAppVersion());
    }

    @Override // com.wufan.user.service.protobuf.t0
    public int x0() {
        return this.f65519c;
    }
}
