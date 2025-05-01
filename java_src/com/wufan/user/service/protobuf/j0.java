package com.wufan.user.service.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.wufan.user.service.protobuf.enumeration.TheThirdPartLoginType;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* compiled from: TheThirdPartyLoginRequestParameters.java */
/* loaded from: classes6.dex */
public final class j0 extends GeneratedMessageLite<j0, b> implements k0 {

    /* renamed from: f  reason: collision with root package name */
    public static final int f65422f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f65423g = 2;

    /* renamed from: h  reason: collision with root package name */
    public static final int f65424h = 3;

    /* renamed from: i  reason: collision with root package name */
    public static final int f65425i = 4;

    /* renamed from: j  reason: collision with root package name */
    private static final j0 f65426j;

    /* renamed from: k  reason: collision with root package name */
    private static volatile Parser<j0> f65427k;

    /* renamed from: c  reason: collision with root package name */
    private int f65429c;

    /* renamed from: b  reason: collision with root package name */
    private String f65428b = "";

    /* renamed from: d  reason: collision with root package name */
    private String f65430d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f65431e = "";

    /* compiled from: TheThirdPartyLoginRequestParameters.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65432a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65432a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65432a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65432a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65432a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65432a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65432a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65432a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65432a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: TheThirdPartyLoginRequestParameters.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<j0, b> implements k0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b V2() {
            copyOnWrite();
            ((j0) this.instance).j3();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((j0) this.instance).k3();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((j0) this.instance).i3();
            return this;
        }

        public b X2() {
            copyOnWrite();
            ((j0) this.instance).l3();
            return this;
        }

        public b Y2(String str) {
            copyOnWrite();
            ((j0) this.instance).z3(str);
            return this;
        }

        public b Z2(ByteString byteString) {
            copyOnWrite();
            ((j0) this.instance).A3(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.k0
        public ByteString a() {
            return ((j0) this.instance).a();
        }

        public b a3(String str) {
            copyOnWrite();
            ((j0) this.instance).B3(str);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.k0
        public ByteString b() {
            return ((j0) this.instance).b();
        }

        public b b3(ByteString byteString) {
            copyOnWrite();
            ((j0) this.instance).C3(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.k0
        public String c() {
            return ((j0) this.instance).c();
        }

        public b c3(TheThirdPartLoginType theThirdPartLoginType) {
            copyOnWrite();
            ((j0) this.instance).D3(theThirdPartLoginType);
            return this;
        }

        public b d3(int i4) {
            copyOnWrite();
            ((j0) this.instance).E3(i4);
            return this;
        }

        public b e3(String str) {
            copyOnWrite();
            ((j0) this.instance).F3(str);
            return this;
        }

        public b f3(ByteString byteString) {
            copyOnWrite();
            ((j0) this.instance).G3(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.k0
        public String getAppVersion() {
            return ((j0) this.instance).getAppVersion();
        }

        @Override // com.wufan.user.service.protobuf.k0
        public String l() {
            return ((j0) this.instance).l();
        }

        @Override // com.wufan.user.service.protobuf.k0
        public int n() {
            return ((j0) this.instance).n();
        }

        @Override // com.wufan.user.service.protobuf.k0
        public ByteString o() {
            return ((j0) this.instance).o();
        }

        @Override // com.wufan.user.service.protobuf.k0
        public TheThirdPartLoginType t() {
            return ((j0) this.instance).t();
        }

        private b() {
            super(j0.f65426j);
        }
    }

    static {
        j0 j0Var = new j0();
        f65426j = j0Var;
        j0Var.makeImmutable();
    }

    private j0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65431e = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3(String str) {
        Objects.requireNonNull(str);
        this.f65430d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65430d = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D3(TheThirdPartLoginType theThirdPartLoginType) {
        Objects.requireNonNull(theThirdPartLoginType);
        this.f65429c = theThirdPartLoginType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E3(int i4) {
        this.f65429c = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F3(String str) {
        Objects.requireNonNull(str);
        this.f65428b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65428b = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3() {
        this.f65431e = m3().getAppVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3() {
        this.f65430d = m3().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3() {
        this.f65429c = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3() {
        this.f65428b = m3().l();
    }

    public static j0 m3() {
        return f65426j;
    }

    public static b n3() {
        return f65426j.toBuilder();
    }

    public static b o3(j0 j0Var) {
        return f65426j.toBuilder().mergeFrom((b) j0Var);
    }

    public static j0 p3(InputStream inputStream) throws IOException {
        return (j0) GeneratedMessageLite.parseDelimitedFrom(f65426j, inputStream);
    }

    public static Parser<j0> parser() {
        return f65426j.getParserForType();
    }

    public static j0 q3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (j0) GeneratedMessageLite.parseDelimitedFrom(f65426j, inputStream, extensionRegistryLite);
    }

    public static j0 r3(ByteString byteString) throws InvalidProtocolBufferException {
        return (j0) GeneratedMessageLite.parseFrom(f65426j, byteString);
    }

    public static j0 s3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (j0) GeneratedMessageLite.parseFrom(f65426j, byteString, extensionRegistryLite);
    }

    public static j0 t3(CodedInputStream codedInputStream) throws IOException {
        return (j0) GeneratedMessageLite.parseFrom(f65426j, codedInputStream);
    }

    public static j0 u3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (j0) GeneratedMessageLite.parseFrom(f65426j, codedInputStream, extensionRegistryLite);
    }

    public static j0 v3(InputStream inputStream) throws IOException {
        return (j0) GeneratedMessageLite.parseFrom(f65426j, inputStream);
    }

    public static j0 w3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (j0) GeneratedMessageLite.parseFrom(f65426j, inputStream, extensionRegistryLite);
    }

    public static j0 x3(byte[] bArr) throws InvalidProtocolBufferException {
        return (j0) GeneratedMessageLite.parseFrom(f65426j, bArr);
    }

    public static j0 y3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (j0) GeneratedMessageLite.parseFrom(f65426j, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(String str) {
        Objects.requireNonNull(str);
        this.f65431e = str;
    }

    @Override // com.wufan.user.service.protobuf.k0
    public ByteString a() {
        return ByteString.copyFromUtf8(this.f65431e);
    }

    @Override // com.wufan.user.service.protobuf.k0
    public ByteString b() {
        return ByteString.copyFromUtf8(this.f65430d);
    }

    @Override // com.wufan.user.service.protobuf.k0
    public String c() {
        return this.f65430d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65432a[methodToInvoke.ordinal()]) {
            case 1:
                return new j0();
            case 2:
                return f65426j;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                j0 j0Var = (j0) obj2;
                this.f65428b = visitor.visitString(!this.f65428b.isEmpty(), this.f65428b, !j0Var.f65428b.isEmpty(), j0Var.f65428b);
                int i4 = this.f65429c;
                boolean z4 = i4 != 0;
                int i5 = j0Var.f65429c;
                this.f65429c = visitor.visitInt(z4, i4, i5 != 0, i5);
                this.f65430d = visitor.visitString(!this.f65430d.isEmpty(), this.f65430d, !j0Var.f65430d.isEmpty(), j0Var.f65430d);
                this.f65431e = visitor.visitString(!this.f65431e.isEmpty(), this.f65431e, !j0Var.f65431e.isEmpty(), j0Var.f65431e);
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
                                    this.f65428b = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 16) {
                                    this.f65429c = codedInputStream.readEnum();
                                } else if (readTag == 26) {
                                    this.f65430d = codedInputStream.readStringRequireUtf8();
                                } else if (readTag != 34) {
                                    if (!codedInputStream.skipField(readTag)) {
                                    }
                                } else {
                                    this.f65431e = codedInputStream.readStringRequireUtf8();
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
                if (f65427k == null) {
                    synchronized (j0.class) {
                        if (f65427k == null) {
                            f65427k = new GeneratedMessageLite.DefaultInstanceBasedParser(f65426j);
                        }
                    }
                }
                return f65427k;
            default:
                throw new UnsupportedOperationException();
        }
        return f65426j;
    }

    @Override // com.wufan.user.service.protobuf.k0
    public String getAppVersion() {
        return this.f65431e;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int computeStringSize = this.f65428b.isEmpty() ? 0 : 0 + CodedOutputStream.computeStringSize(1, l());
        if (this.f65429c != TheThirdPartLoginType.T_PAPA.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(2, this.f65429c);
        }
        if (!this.f65430d.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(3, c());
        }
        if (!this.f65431e.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(4, getAppVersion());
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    @Override // com.wufan.user.service.protobuf.k0
    public String l() {
        return this.f65428b;
    }

    @Override // com.wufan.user.service.protobuf.k0
    public int n() {
        return this.f65429c;
    }

    @Override // com.wufan.user.service.protobuf.k0
    public ByteString o() {
        return ByteString.copyFromUtf8(this.f65428b);
    }

    @Override // com.wufan.user.service.protobuf.k0
    public TheThirdPartLoginType t() {
        TheThirdPartLoginType forNumber = TheThirdPartLoginType.forNumber(this.f65429c);
        return forNumber == null ? TheThirdPartLoginType.UNRECOGNIZED : forNumber;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f65428b.isEmpty()) {
            codedOutputStream.writeString(1, l());
        }
        if (this.f65429c != TheThirdPartLoginType.T_PAPA.getNumber()) {
            codedOutputStream.writeEnum(2, this.f65429c);
        }
        if (!this.f65430d.isEmpty()) {
            codedOutputStream.writeString(3, c());
        }
        if (this.f65431e.isEmpty()) {
            return;
        }
        codedOutputStream.writeString(4, getAppVersion());
    }
}
