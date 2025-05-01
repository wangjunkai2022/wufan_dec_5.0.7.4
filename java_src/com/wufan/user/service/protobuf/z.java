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
/* compiled from: Request.java */
/* loaded from: classes6.dex */
public final class z extends GeneratedMessageLite<z, b> implements a0 {

    /* renamed from: k  reason: collision with root package name */
    public static final int f65555k = 1;

    /* renamed from: l  reason: collision with root package name */
    public static final int f65556l = 2;

    /* renamed from: m  reason: collision with root package name */
    public static final int f65557m = 3;

    /* renamed from: n  reason: collision with root package name */
    public static final int f65558n = 4;

    /* renamed from: o  reason: collision with root package name */
    public static final int f65559o = 5;

    /* renamed from: p  reason: collision with root package name */
    public static final int f65560p = 6;

    /* renamed from: q  reason: collision with root package name */
    public static final int f65561q = 7;

    /* renamed from: r  reason: collision with root package name */
    public static final int f65562r = 8;

    /* renamed from: s  reason: collision with root package name */
    public static final int f65563s = 9;

    /* renamed from: t  reason: collision with root package name */
    private static final z f65564t;

    /* renamed from: u  reason: collision with root package name */
    private static volatile Parser<z> f65565u;

    /* renamed from: e  reason: collision with root package name */
    private int f65569e;

    /* renamed from: b  reason: collision with root package name */
    private String f65566b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f65567c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f65568d = "";

    /* renamed from: f  reason: collision with root package name */
    private String f65570f = "";

    /* renamed from: g  reason: collision with root package name */
    private String f65571g = "";

    /* renamed from: h  reason: collision with root package name */
    private String f65572h = "";

    /* renamed from: i  reason: collision with root package name */
    private String f65573i = "";

    /* renamed from: j  reason: collision with root package name */
    private String f65574j = "";

    /* compiled from: Request.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65575a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65575a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65575a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65575a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65575a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65575a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65575a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65575a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65575a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: Request.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<z, b> implements a0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.user.service.protobuf.a0
        public ByteString M1() {
            return ((z) this.instance).M1();
        }

        public b V2() {
            copyOnWrite();
            ((z) this.instance).x3();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((z) this.instance).y3();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((z) this.instance).clearAccount();
            return this;
        }

        public b X2() {
            copyOnWrite();
            ((z) this.instance).z3();
            return this;
        }

        public b Y2() {
            copyOnWrite();
            ((z) this.instance).clearPassword();
            return this;
        }

        public b Z2() {
            copyOnWrite();
            ((z) this.instance).A3();
            return this;
        }

        @Override // com.wufan.user.service.protobuf.a0
        public ByteString a() {
            return ((z) this.instance).a();
        }

        public b a3() {
            copyOnWrite();
            ((z) this.instance).B3();
            return this;
        }

        @Override // com.wufan.user.service.protobuf.a0
        public ByteString b() {
            return ((z) this.instance).b();
        }

        public b b3() {
            copyOnWrite();
            ((z) this.instance).C3();
            return this;
        }

        @Override // com.wufan.user.service.protobuf.a0
        public String c() {
            return ((z) this.instance).c();
        }

        public b c3() {
            copyOnWrite();
            ((z) this.instance).D3();
            return this;
        }

        public b d3(String str) {
            copyOnWrite();
            ((z) this.instance).R3(str);
            return this;
        }

        public b e3(ByteString byteString) {
            copyOnWrite();
            ((z) this.instance).S3(byteString);
            return this;
        }

        public b f3(String str) {
            copyOnWrite();
            ((z) this.instance).T3(str);
            return this;
        }

        public b g3(ByteString byteString) {
            copyOnWrite();
            ((z) this.instance).U3(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.a0
        public String getAccount() {
            return ((z) this.instance).getAccount();
        }

        @Override // com.wufan.user.service.protobuf.a0
        public String getAppId() {
            return ((z) this.instance).getAppId();
        }

        @Override // com.wufan.user.service.protobuf.a0
        public String getAppVersion() {
            return ((z) this.instance).getAppVersion();
        }

        @Override // com.wufan.user.service.protobuf.a0
        public String getPassword() {
            return ((z) this.instance).getPassword();
        }

        @Override // com.wufan.user.service.protobuf.a0
        public ByteString getPasswordBytes() {
            return ((z) this.instance).getPasswordBytes();
        }

        @Override // com.wufan.user.service.protobuf.a0
        public ByteString h() {
            return ((z) this.instance).h();
        }

        public b h3(String str) {
            copyOnWrite();
            ((z) this.instance).V3(str);
            return this;
        }

        public b i3(ByteString byteString) {
            copyOnWrite();
            ((z) this.instance).W3(byteString);
            return this;
        }

        public b j3(String str) {
            copyOnWrite();
            ((z) this.instance).X3(str);
            return this;
        }

        public b k3(ByteString byteString) {
            copyOnWrite();
            ((z) this.instance).Y3(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.a0
        public String l() {
            return ((z) this.instance).l();
        }

        public b l3(String str) {
            copyOnWrite();
            ((z) this.instance).setPassword(str);
            return this;
        }

        public b m3(ByteString byteString) {
            copyOnWrite();
            ((z) this.instance).setPasswordBytes(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.a0
        public int n() {
            return ((z) this.instance).n();
        }

        public b n3(String str) {
            copyOnWrite();
            ((z) this.instance).Z3(str);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.a0
        public ByteString o() {
            return ((z) this.instance).o();
        }

        public b o3(ByteString byteString) {
            copyOnWrite();
            ((z) this.instance).a4(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.a0
        public ByteString p() {
            return ((z) this.instance).p();
        }

        public b p3(String str) {
            copyOnWrite();
            ((z) this.instance).b4(str);
            return this;
        }

        public b q3(ByteString byteString) {
            copyOnWrite();
            ((z) this.instance).c4(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.a0
        public String r() {
            return ((z) this.instance).r();
        }

        public b r3(TheThirdPartLoginType theThirdPartLoginType) {
            copyOnWrite();
            ((z) this.instance).d4(theThirdPartLoginType);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.a0
        public ByteString s() {
            return ((z) this.instance).s();
        }

        public b s3(int i4) {
            copyOnWrite();
            ((z) this.instance).e4(i4);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.a0
        public TheThirdPartLoginType t() {
            return ((z) this.instance).t();
        }

        public b t3(String str) {
            copyOnWrite();
            ((z) this.instance).f4(str);
            return this;
        }

        public b u3(ByteString byteString) {
            copyOnWrite();
            ((z) this.instance).g4(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.a0
        public String v() {
            return ((z) this.instance).v();
        }

        private b() {
            super(z.f65564t);
        }
    }

    static {
        z zVar = new z();
        f65564t = zVar;
        zVar.makeImmutable();
    }

    private z() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3() {
        this.f65572h = E3().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3() {
        this.f65570f = E3().r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3() {
        this.f65569e = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D3() {
        this.f65568d = E3().l();
    }

    public static z E3() {
        return f65564t;
    }

    public static b F3() {
        return f65564t.toBuilder();
    }

    public static b G3(z zVar) {
        return f65564t.toBuilder().mergeFrom((b) zVar);
    }

    public static z H3(InputStream inputStream) throws IOException {
        return (z) GeneratedMessageLite.parseDelimitedFrom(f65564t, inputStream);
    }

    public static z I3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (z) GeneratedMessageLite.parseDelimitedFrom(f65564t, inputStream, extensionRegistryLite);
    }

    public static z J3(ByteString byteString) throws InvalidProtocolBufferException {
        return (z) GeneratedMessageLite.parseFrom(f65564t, byteString);
    }

    public static z K3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (z) GeneratedMessageLite.parseFrom(f65564t, byteString, extensionRegistryLite);
    }

    public static z L3(CodedInputStream codedInputStream) throws IOException {
        return (z) GeneratedMessageLite.parseFrom(f65564t, codedInputStream);
    }

    public static z M3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (z) GeneratedMessageLite.parseFrom(f65564t, codedInputStream, extensionRegistryLite);
    }

    public static z N3(InputStream inputStream) throws IOException {
        return (z) GeneratedMessageLite.parseFrom(f65564t, inputStream);
    }

    public static z O3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (z) GeneratedMessageLite.parseFrom(f65564t, inputStream, extensionRegistryLite);
    }

    public static z P3(byte[] bArr) throws InvalidProtocolBufferException {
        return (z) GeneratedMessageLite.parseFrom(f65564t, bArr);
    }

    public static z Q3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (z) GeneratedMessageLite.parseFrom(f65564t, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R3(String str) {
        Objects.requireNonNull(str);
        this.f65566b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65566b = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T3(String str) {
        Objects.requireNonNull(str);
        this.f65574j = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65574j = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V3(String str) {
        Objects.requireNonNull(str);
        this.f65573i = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65573i = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X3(String str) {
        Objects.requireNonNull(str);
        this.f65571g = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65571g = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z3(String str) {
        Objects.requireNonNull(str);
        this.f65572h = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a4(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65572h = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b4(String str) {
        Objects.requireNonNull(str);
        this.f65570f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c4(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65570f = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccount() {
        this.f65566b = E3().getAccount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPassword() {
        this.f65567c = E3().getPassword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d4(TheThirdPartLoginType theThirdPartLoginType) {
        Objects.requireNonNull(theThirdPartLoginType);
        this.f65569e = theThirdPartLoginType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e4(int i4) {
        this.f65569e = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f4(String str) {
        Objects.requireNonNull(str);
        this.f65568d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g4(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65568d = byteString.toStringUtf8();
    }

    public static Parser<z> parser() {
        return f65564t.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassword(String str) {
        Objects.requireNonNull(str);
        this.f65567c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPasswordBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65567c = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3() {
        this.f65574j = E3().getAppId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3() {
        this.f65573i = E3().getAppVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3() {
        this.f65571g = E3().v();
    }

    @Override // com.wufan.user.service.protobuf.a0
    public ByteString M1() {
        return ByteString.copyFromUtf8(this.f65574j);
    }

    @Override // com.wufan.user.service.protobuf.a0
    public ByteString a() {
        return ByteString.copyFromUtf8(this.f65573i);
    }

    @Override // com.wufan.user.service.protobuf.a0
    public ByteString b() {
        return ByteString.copyFromUtf8(this.f65572h);
    }

    @Override // com.wufan.user.service.protobuf.a0
    public String c() {
        return this.f65572h;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65575a[methodToInvoke.ordinal()]) {
            case 1:
                return new z();
            case 2:
                return f65564t;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                z zVar = (z) obj2;
                this.f65566b = visitor.visitString(!this.f65566b.isEmpty(), this.f65566b, !zVar.f65566b.isEmpty(), zVar.f65566b);
                this.f65567c = visitor.visitString(!this.f65567c.isEmpty(), this.f65567c, !zVar.f65567c.isEmpty(), zVar.f65567c);
                this.f65568d = visitor.visitString(!this.f65568d.isEmpty(), this.f65568d, !zVar.f65568d.isEmpty(), zVar.f65568d);
                int i4 = this.f65569e;
                boolean z4 = i4 != 0;
                int i5 = zVar.f65569e;
                this.f65569e = visitor.visitInt(z4, i4, i5 != 0, i5);
                this.f65570f = visitor.visitString(!this.f65570f.isEmpty(), this.f65570f, !zVar.f65570f.isEmpty(), zVar.f65570f);
                this.f65571g = visitor.visitString(!this.f65571g.isEmpty(), this.f65571g, !zVar.f65571g.isEmpty(), zVar.f65571g);
                this.f65572h = visitor.visitString(!this.f65572h.isEmpty(), this.f65572h, !zVar.f65572h.isEmpty(), zVar.f65572h);
                this.f65573i = visitor.visitString(!this.f65573i.isEmpty(), this.f65573i, !zVar.f65573i.isEmpty(), zVar.f65573i);
                this.f65574j = visitor.visitString(!this.f65574j.isEmpty(), this.f65574j, !zVar.f65574j.isEmpty(), zVar.f65574j);
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
                                this.f65566b = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f65567c = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.f65568d = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 32) {
                                this.f65569e = codedInputStream.readEnum();
                            } else if (readTag == 42) {
                                this.f65570f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 50) {
                                this.f65571g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 58) {
                                this.f65572h = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 66) {
                                this.f65573i = codedInputStream.readStringRequireUtf8();
                            } else if (readTag != 74) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f65574j = codedInputStream.readStringRequireUtf8();
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
                if (f65565u == null) {
                    synchronized (z.class) {
                        if (f65565u == null) {
                            f65565u = new GeneratedMessageLite.DefaultInstanceBasedParser(f65564t);
                        }
                    }
                }
                return f65565u;
            default:
                throw new UnsupportedOperationException();
        }
        return f65564t;
    }

    @Override // com.wufan.user.service.protobuf.a0
    public String getAccount() {
        return this.f65566b;
    }

    @Override // com.wufan.user.service.protobuf.a0
    public String getAppId() {
        return this.f65574j;
    }

    @Override // com.wufan.user.service.protobuf.a0
    public String getAppVersion() {
        return this.f65573i;
    }

    @Override // com.wufan.user.service.protobuf.a0
    public String getPassword() {
        return this.f65567c;
    }

    @Override // com.wufan.user.service.protobuf.a0
    public ByteString getPasswordBytes() {
        return ByteString.copyFromUtf8(this.f65567c);
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int computeStringSize = this.f65566b.isEmpty() ? 0 : 0 + CodedOutputStream.computeStringSize(1, getAccount());
        if (!this.f65567c.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(2, getPassword());
        }
        if (!this.f65568d.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(3, l());
        }
        if (this.f65569e != TheThirdPartLoginType.T_PAPA.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(4, this.f65569e);
        }
        if (!this.f65570f.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(5, r());
        }
        if (!this.f65571g.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(6, v());
        }
        if (!this.f65572h.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(7, c());
        }
        if (!this.f65573i.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(8, getAppVersion());
        }
        if (!this.f65574j.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(9, getAppId());
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    @Override // com.wufan.user.service.protobuf.a0
    public ByteString h() {
        return ByteString.copyFromUtf8(this.f65566b);
    }

    @Override // com.wufan.user.service.protobuf.a0
    public String l() {
        return this.f65568d;
    }

    @Override // com.wufan.user.service.protobuf.a0
    public int n() {
        return this.f65569e;
    }

    @Override // com.wufan.user.service.protobuf.a0
    public ByteString o() {
        return ByteString.copyFromUtf8(this.f65568d);
    }

    @Override // com.wufan.user.service.protobuf.a0
    public ByteString p() {
        return ByteString.copyFromUtf8(this.f65570f);
    }

    @Override // com.wufan.user.service.protobuf.a0
    public String r() {
        return this.f65570f;
    }

    @Override // com.wufan.user.service.protobuf.a0
    public ByteString s() {
        return ByteString.copyFromUtf8(this.f65571g);
    }

    @Override // com.wufan.user.service.protobuf.a0
    public TheThirdPartLoginType t() {
        TheThirdPartLoginType forNumber = TheThirdPartLoginType.forNumber(this.f65569e);
        return forNumber == null ? TheThirdPartLoginType.UNRECOGNIZED : forNumber;
    }

    @Override // com.wufan.user.service.protobuf.a0
    public String v() {
        return this.f65571g;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f65566b.isEmpty()) {
            codedOutputStream.writeString(1, getAccount());
        }
        if (!this.f65567c.isEmpty()) {
            codedOutputStream.writeString(2, getPassword());
        }
        if (!this.f65568d.isEmpty()) {
            codedOutputStream.writeString(3, l());
        }
        if (this.f65569e != TheThirdPartLoginType.T_PAPA.getNumber()) {
            codedOutputStream.writeEnum(4, this.f65569e);
        }
        if (!this.f65570f.isEmpty()) {
            codedOutputStream.writeString(5, r());
        }
        if (!this.f65571g.isEmpty()) {
            codedOutputStream.writeString(6, v());
        }
        if (!this.f65572h.isEmpty()) {
            codedOutputStream.writeString(7, c());
        }
        if (!this.f65573i.isEmpty()) {
            codedOutputStream.writeString(8, getAppVersion());
        }
        if (this.f65574j.isEmpty()) {
            return;
        }
        codedOutputStream.writeString(9, getAppId());
    }
}
