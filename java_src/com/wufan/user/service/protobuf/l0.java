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
/* compiled from: TheThirdPartyRegisterRequestParameters.java */
/* loaded from: classes6.dex */
public final class l0 extends GeneratedMessageLite<l0, b> implements m0 {

    /* renamed from: j  reason: collision with root package name */
    public static final int f65444j = 1;

    /* renamed from: k  reason: collision with root package name */
    public static final int f65445k = 2;

    /* renamed from: l  reason: collision with root package name */
    public static final int f65446l = 3;

    /* renamed from: m  reason: collision with root package name */
    public static final int f65447m = 4;

    /* renamed from: n  reason: collision with root package name */
    public static final int f65448n = 5;

    /* renamed from: o  reason: collision with root package name */
    public static final int f65449o = 6;

    /* renamed from: p  reason: collision with root package name */
    public static final int f65450p = 7;

    /* renamed from: q  reason: collision with root package name */
    public static final int f65451q = 8;

    /* renamed from: r  reason: collision with root package name */
    private static final l0 f65452r;

    /* renamed from: s  reason: collision with root package name */
    private static volatile Parser<l0> f65453s;

    /* renamed from: e  reason: collision with root package name */
    private int f65457e;

    /* renamed from: b  reason: collision with root package name */
    private String f65454b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f65455c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f65456d = "";

    /* renamed from: f  reason: collision with root package name */
    private String f65458f = "";

    /* renamed from: g  reason: collision with root package name */
    private String f65459g = "";

    /* renamed from: h  reason: collision with root package name */
    private String f65460h = "";

    /* renamed from: i  reason: collision with root package name */
    private String f65461i = "";

    /* compiled from: TheThirdPartyRegisterRequestParameters.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65462a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65462a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65462a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65462a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65462a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65462a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65462a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65462a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65462a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: TheThirdPartyRegisterRequestParameters.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<l0, b> implements m0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b V2() {
            copyOnWrite();
            ((l0) this.instance).u3();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((l0) this.instance).v3();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((l0) this.instance).clearAccount();
            return this;
        }

        public b X2() {
            copyOnWrite();
            ((l0) this.instance).clearPassword();
            return this;
        }

        public b Y2() {
            copyOnWrite();
            ((l0) this.instance).w3();
            return this;
        }

        public b Z2() {
            copyOnWrite();
            ((l0) this.instance).x3();
            return this;
        }

        @Override // com.wufan.user.service.protobuf.m0
        public ByteString a() {
            return ((l0) this.instance).a();
        }

        public b a3() {
            copyOnWrite();
            ((l0) this.instance).y3();
            return this;
        }

        @Override // com.wufan.user.service.protobuf.m0
        public ByteString b() {
            return ((l0) this.instance).b();
        }

        public b b3() {
            copyOnWrite();
            ((l0) this.instance).z3();
            return this;
        }

        @Override // com.wufan.user.service.protobuf.m0
        public String c() {
            return ((l0) this.instance).c();
        }

        public b c3(String str) {
            copyOnWrite();
            ((l0) this.instance).N3(str);
            return this;
        }

        public b d3(ByteString byteString) {
            copyOnWrite();
            ((l0) this.instance).O3(byteString);
            return this;
        }

        public b e3(String str) {
            copyOnWrite();
            ((l0) this.instance).P3(str);
            return this;
        }

        public b f3(ByteString byteString) {
            copyOnWrite();
            ((l0) this.instance).Q3(byteString);
            return this;
        }

        public b g3(String str) {
            copyOnWrite();
            ((l0) this.instance).R3(str);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.m0
        public String getAccount() {
            return ((l0) this.instance).getAccount();
        }

        @Override // com.wufan.user.service.protobuf.m0
        public String getAppVersion() {
            return ((l0) this.instance).getAppVersion();
        }

        @Override // com.wufan.user.service.protobuf.m0
        public String getPassword() {
            return ((l0) this.instance).getPassword();
        }

        @Override // com.wufan.user.service.protobuf.m0
        public ByteString getPasswordBytes() {
            return ((l0) this.instance).getPasswordBytes();
        }

        @Override // com.wufan.user.service.protobuf.m0
        public ByteString h() {
            return ((l0) this.instance).h();
        }

        public b h3(ByteString byteString) {
            copyOnWrite();
            ((l0) this.instance).S3(byteString);
            return this;
        }

        public b i3(String str) {
            copyOnWrite();
            ((l0) this.instance).setPassword(str);
            return this;
        }

        public b j3(ByteString byteString) {
            copyOnWrite();
            ((l0) this.instance).setPasswordBytes(byteString);
            return this;
        }

        public b k3(String str) {
            copyOnWrite();
            ((l0) this.instance).T3(str);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.m0
        public String l() {
            return ((l0) this.instance).l();
        }

        public b l3(ByteString byteString) {
            copyOnWrite();
            ((l0) this.instance).U3(byteString);
            return this;
        }

        public b m3(String str) {
            copyOnWrite();
            ((l0) this.instance).V3(str);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.m0
        public int n() {
            return ((l0) this.instance).n();
        }

        public b n3(ByteString byteString) {
            copyOnWrite();
            ((l0) this.instance).W3(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.m0
        public ByteString o() {
            return ((l0) this.instance).o();
        }

        public b o3(TheThirdPartLoginType theThirdPartLoginType) {
            copyOnWrite();
            ((l0) this.instance).X3(theThirdPartLoginType);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.m0
        public ByteString p() {
            return ((l0) this.instance).p();
        }

        public b p3(int i4) {
            copyOnWrite();
            ((l0) this.instance).Y3(i4);
            return this;
        }

        public b q3(String str) {
            copyOnWrite();
            ((l0) this.instance).Z3(str);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.m0
        public String r() {
            return ((l0) this.instance).r();
        }

        public b r3(ByteString byteString) {
            copyOnWrite();
            ((l0) this.instance).a4(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.m0
        public ByteString s() {
            return ((l0) this.instance).s();
        }

        @Override // com.wufan.user.service.protobuf.m0
        public TheThirdPartLoginType t() {
            return ((l0) this.instance).t();
        }

        @Override // com.wufan.user.service.protobuf.m0
        public String v() {
            return ((l0) this.instance).v();
        }

        private b() {
            super(l0.f65452r);
        }
    }

    static {
        l0 l0Var = new l0();
        f65452r = l0Var;
        l0Var.makeImmutable();
    }

    private l0() {
    }

    public static l0 A3() {
        return f65452r;
    }

    public static b B3() {
        return f65452r.toBuilder();
    }

    public static b C3(l0 l0Var) {
        return f65452r.toBuilder().mergeFrom((b) l0Var);
    }

    public static l0 D3(InputStream inputStream) throws IOException {
        return (l0) GeneratedMessageLite.parseDelimitedFrom(f65452r, inputStream);
    }

    public static l0 E3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (l0) GeneratedMessageLite.parseDelimitedFrom(f65452r, inputStream, extensionRegistryLite);
    }

    public static l0 F3(ByteString byteString) throws InvalidProtocolBufferException {
        return (l0) GeneratedMessageLite.parseFrom(f65452r, byteString);
    }

    public static l0 G3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (l0) GeneratedMessageLite.parseFrom(f65452r, byteString, extensionRegistryLite);
    }

    public static l0 H3(CodedInputStream codedInputStream) throws IOException {
        return (l0) GeneratedMessageLite.parseFrom(f65452r, codedInputStream);
    }

    public static l0 I3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (l0) GeneratedMessageLite.parseFrom(f65452r, codedInputStream, extensionRegistryLite);
    }

    public static l0 J3(InputStream inputStream) throws IOException {
        return (l0) GeneratedMessageLite.parseFrom(f65452r, inputStream);
    }

    public static l0 K3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (l0) GeneratedMessageLite.parseFrom(f65452r, inputStream, extensionRegistryLite);
    }

    public static l0 L3(byte[] bArr) throws InvalidProtocolBufferException {
        return (l0) GeneratedMessageLite.parseFrom(f65452r, bArr);
    }

    public static l0 M3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (l0) GeneratedMessageLite.parseFrom(f65452r, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N3(String str) {
        Objects.requireNonNull(str);
        this.f65454b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65454b = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P3(String str) {
        Objects.requireNonNull(str);
        this.f65461i = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65461i = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R3(String str) {
        Objects.requireNonNull(str);
        this.f65459g = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65459g = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T3(String str) {
        Objects.requireNonNull(str);
        this.f65460h = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65460h = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V3(String str) {
        Objects.requireNonNull(str);
        this.f65458f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65458f = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X3(TheThirdPartLoginType theThirdPartLoginType) {
        Objects.requireNonNull(theThirdPartLoginType);
        this.f65457e = theThirdPartLoginType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y3(int i4) {
        this.f65457e = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z3(String str) {
        Objects.requireNonNull(str);
        this.f65456d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a4(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65456d = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccount() {
        this.f65454b = A3().getAccount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPassword() {
        this.f65455c = A3().getPassword();
    }

    public static Parser<l0> parser() {
        return f65452r.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassword(String str) {
        Objects.requireNonNull(str);
        this.f65455c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPasswordBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65455c = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u3() {
        this.f65461i = A3().getAppVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v3() {
        this.f65459g = A3().v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w3() {
        this.f65460h = A3().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3() {
        this.f65458f = A3().r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3() {
        this.f65457e = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3() {
        this.f65456d = A3().l();
    }

    @Override // com.wufan.user.service.protobuf.m0
    public ByteString a() {
        return ByteString.copyFromUtf8(this.f65461i);
    }

    @Override // com.wufan.user.service.protobuf.m0
    public ByteString b() {
        return ByteString.copyFromUtf8(this.f65460h);
    }

    @Override // com.wufan.user.service.protobuf.m0
    public String c() {
        return this.f65460h;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65462a[methodToInvoke.ordinal()]) {
            case 1:
                return new l0();
            case 2:
                return f65452r;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                l0 l0Var = (l0) obj2;
                this.f65454b = visitor.visitString(!this.f65454b.isEmpty(), this.f65454b, !l0Var.f65454b.isEmpty(), l0Var.f65454b);
                this.f65455c = visitor.visitString(!this.f65455c.isEmpty(), this.f65455c, !l0Var.f65455c.isEmpty(), l0Var.f65455c);
                this.f65456d = visitor.visitString(!this.f65456d.isEmpty(), this.f65456d, !l0Var.f65456d.isEmpty(), l0Var.f65456d);
                int i4 = this.f65457e;
                boolean z4 = i4 != 0;
                int i5 = l0Var.f65457e;
                this.f65457e = visitor.visitInt(z4, i4, i5 != 0, i5);
                this.f65458f = visitor.visitString(!this.f65458f.isEmpty(), this.f65458f, !l0Var.f65458f.isEmpty(), l0Var.f65458f);
                this.f65459g = visitor.visitString(!this.f65459g.isEmpty(), this.f65459g, !l0Var.f65459g.isEmpty(), l0Var.f65459g);
                this.f65460h = visitor.visitString(!this.f65460h.isEmpty(), this.f65460h, !l0Var.f65460h.isEmpty(), l0Var.f65460h);
                this.f65461i = visitor.visitString(!this.f65461i.isEmpty(), this.f65461i, !l0Var.f65461i.isEmpty(), l0Var.f65461i);
                GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!r1) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.f65454b = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f65455c = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.f65456d = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 32) {
                                this.f65457e = codedInputStream.readEnum();
                            } else if (readTag == 42) {
                                this.f65458f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 50) {
                                this.f65459g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 58) {
                                this.f65460h = codedInputStream.readStringRequireUtf8();
                            } else if (readTag != 66) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f65461i = codedInputStream.readStringRequireUtf8();
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
                if (f65453s == null) {
                    synchronized (l0.class) {
                        if (f65453s == null) {
                            f65453s = new GeneratedMessageLite.DefaultInstanceBasedParser(f65452r);
                        }
                    }
                }
                return f65453s;
            default:
                throw new UnsupportedOperationException();
        }
        return f65452r;
    }

    @Override // com.wufan.user.service.protobuf.m0
    public String getAccount() {
        return this.f65454b;
    }

    @Override // com.wufan.user.service.protobuf.m0
    public String getAppVersion() {
        return this.f65461i;
    }

    @Override // com.wufan.user.service.protobuf.m0
    public String getPassword() {
        return this.f65455c;
    }

    @Override // com.wufan.user.service.protobuf.m0
    public ByteString getPasswordBytes() {
        return ByteString.copyFromUtf8(this.f65455c);
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int computeStringSize = this.f65454b.isEmpty() ? 0 : 0 + CodedOutputStream.computeStringSize(1, getAccount());
        if (!this.f65455c.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(2, getPassword());
        }
        if (!this.f65456d.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(3, l());
        }
        if (this.f65457e != TheThirdPartLoginType.T_PAPA.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(4, this.f65457e);
        }
        if (!this.f65458f.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(5, r());
        }
        if (!this.f65459g.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(6, v());
        }
        if (!this.f65460h.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(7, c());
        }
        if (!this.f65461i.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(8, getAppVersion());
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    @Override // com.wufan.user.service.protobuf.m0
    public ByteString h() {
        return ByteString.copyFromUtf8(this.f65454b);
    }

    @Override // com.wufan.user.service.protobuf.m0
    public String l() {
        return this.f65456d;
    }

    @Override // com.wufan.user.service.protobuf.m0
    public int n() {
        return this.f65457e;
    }

    @Override // com.wufan.user.service.protobuf.m0
    public ByteString o() {
        return ByteString.copyFromUtf8(this.f65456d);
    }

    @Override // com.wufan.user.service.protobuf.m0
    public ByteString p() {
        return ByteString.copyFromUtf8(this.f65458f);
    }

    @Override // com.wufan.user.service.protobuf.m0
    public String r() {
        return this.f65458f;
    }

    @Override // com.wufan.user.service.protobuf.m0
    public ByteString s() {
        return ByteString.copyFromUtf8(this.f65459g);
    }

    @Override // com.wufan.user.service.protobuf.m0
    public TheThirdPartLoginType t() {
        TheThirdPartLoginType forNumber = TheThirdPartLoginType.forNumber(this.f65457e);
        return forNumber == null ? TheThirdPartLoginType.UNRECOGNIZED : forNumber;
    }

    @Override // com.wufan.user.service.protobuf.m0
    public String v() {
        return this.f65459g;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f65454b.isEmpty()) {
            codedOutputStream.writeString(1, getAccount());
        }
        if (!this.f65455c.isEmpty()) {
            codedOutputStream.writeString(2, getPassword());
        }
        if (!this.f65456d.isEmpty()) {
            codedOutputStream.writeString(3, l());
        }
        if (this.f65457e != TheThirdPartLoginType.T_PAPA.getNumber()) {
            codedOutputStream.writeEnum(4, this.f65457e);
        }
        if (!this.f65458f.isEmpty()) {
            codedOutputStream.writeString(5, r());
        }
        if (!this.f65459g.isEmpty()) {
            codedOutputStream.writeString(6, v());
        }
        if (!this.f65460h.isEmpty()) {
            codedOutputStream.writeString(7, c());
        }
        if (this.f65461i.isEmpty()) {
            return;
        }
        codedOutputStream.writeString(8, getAppVersion());
    }
}
