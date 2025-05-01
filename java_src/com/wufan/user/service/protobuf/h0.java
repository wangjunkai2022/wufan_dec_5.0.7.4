package com.wufan.user.service.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.wufan.user.service.protobuf.enumeration.ContentType;
import com.wufan.user.service.protobuf.enumeration.SourceType;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* compiled from: SmsCodeRequestParameters.java */
/* loaded from: classes6.dex */
public final class h0 extends GeneratedMessageLite<h0, b> implements i0 {

    /* renamed from: h  reason: collision with root package name */
    public static final int f65407h = 1;

    /* renamed from: i  reason: collision with root package name */
    public static final int f65408i = 2;

    /* renamed from: j  reason: collision with root package name */
    public static final int f65409j = 3;

    /* renamed from: k  reason: collision with root package name */
    public static final int f65410k = 4;

    /* renamed from: l  reason: collision with root package name */
    public static final int f65411l = 5;

    /* renamed from: m  reason: collision with root package name */
    public static final int f65412m = 6;

    /* renamed from: n  reason: collision with root package name */
    private static final h0 f65413n;

    /* renamed from: o  reason: collision with root package name */
    private static volatile Parser<h0> f65414o;

    /* renamed from: b  reason: collision with root package name */
    private int f65415b;

    /* renamed from: c  reason: collision with root package name */
    private int f65416c;

    /* renamed from: d  reason: collision with root package name */
    private int f65417d;

    /* renamed from: e  reason: collision with root package name */
    private String f65418e = "";

    /* renamed from: f  reason: collision with root package name */
    private String f65419f = "";

    /* renamed from: g  reason: collision with root package name */
    private String f65420g = "";

    /* compiled from: SmsCodeRequestParameters.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65421a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65421a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65421a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65421a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65421a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65421a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65421a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65421a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65421a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: SmsCodeRequestParameters.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<h0, b> implements i0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.user.service.protobuf.i0
        public int H2() {
            return ((h0) this.instance).H2();
        }

        @Override // com.wufan.user.service.protobuf.i0
        public int K2() {
            return ((h0) this.instance).K2();
        }

        @Override // com.wufan.user.service.protobuf.i0
        public SourceType P1() {
            return ((h0) this.instance).P1();
        }

        public b V2() {
            copyOnWrite();
            ((h0) this.instance).o3();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((h0) this.instance).p3();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((h0) this.instance).n3();
            return this;
        }

        public b X2() {
            copyOnWrite();
            ((h0) this.instance).q3();
            return this;
        }

        public b Y2() {
            copyOnWrite();
            ((h0) this.instance).r3();
            return this;
        }

        public b Z2() {
            copyOnWrite();
            ((h0) this.instance).clearUid();
            return this;
        }

        @Override // com.wufan.user.service.protobuf.i0
        public ByteString a() {
            return ((h0) this.instance).a();
        }

        public b a3(String str) {
            copyOnWrite();
            ((h0) this.instance).F3(str);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.i0
        public ByteString b() {
            return ((h0) this.instance).b();
        }

        public b b3(ByteString byteString) {
            copyOnWrite();
            ((h0) this.instance).G3(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.i0
        public String c() {
            return ((h0) this.instance).c();
        }

        public b c3(ContentType contentType) {
            copyOnWrite();
            ((h0) this.instance).H3(contentType);
            return this;
        }

        public b d3(int i4) {
            copyOnWrite();
            ((h0) this.instance).I3(i4);
            return this;
        }

        public b e3(String str) {
            copyOnWrite();
            ((h0) this.instance).J3(str);
            return this;
        }

        public b f3(ByteString byteString) {
            copyOnWrite();
            ((h0) this.instance).K3(byteString);
            return this;
        }

        public b g3(String str) {
            copyOnWrite();
            ((h0) this.instance).L3(str);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.i0
        public String getAppVersion() {
            return ((h0) this.instance).getAppVersion();
        }

        @Override // com.wufan.user.service.protobuf.i0
        public ContentType getContentType() {
            return ((h0) this.instance).getContentType();
        }

        @Override // com.wufan.user.service.protobuf.i0
        public int getUid() {
            return ((h0) this.instance).getUid();
        }

        public b h3(ByteString byteString) {
            copyOnWrite();
            ((h0) this.instance).M3(byteString);
            return this;
        }

        public b i3(SourceType sourceType) {
            copyOnWrite();
            ((h0) this.instance).N3(sourceType);
            return this;
        }

        public b j3(int i4) {
            copyOnWrite();
            ((h0) this.instance).O3(i4);
            return this;
        }

        public b k3(int i4) {
            copyOnWrite();
            ((h0) this.instance).setUid(i4);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.i0
        public ByteString x() {
            return ((h0) this.instance).x();
        }

        @Override // com.wufan.user.service.protobuf.i0
        public String z() {
            return ((h0) this.instance).z();
        }

        private b() {
            super(h0.f65413n);
        }
    }

    static {
        h0 h0Var = new h0();
        f65413n = h0Var;
        h0Var.makeImmutable();
    }

    private h0() {
    }

    public static h0 A3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (h0) GeneratedMessageLite.parseFrom(f65413n, codedInputStream, extensionRegistryLite);
    }

    public static h0 B3(InputStream inputStream) throws IOException {
        return (h0) GeneratedMessageLite.parseFrom(f65413n, inputStream);
    }

    public static h0 C3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (h0) GeneratedMessageLite.parseFrom(f65413n, inputStream, extensionRegistryLite);
    }

    public static h0 D3(byte[] bArr) throws InvalidProtocolBufferException {
        return (h0) GeneratedMessageLite.parseFrom(f65413n, bArr);
    }

    public static h0 E3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (h0) GeneratedMessageLite.parseFrom(f65413n, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F3(String str) {
        Objects.requireNonNull(str);
        this.f65420g = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65420g = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H3(ContentType contentType) {
        Objects.requireNonNull(contentType);
        this.f65416c = contentType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I3(int i4) {
        this.f65416c = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J3(String str) {
        Objects.requireNonNull(str);
        this.f65418e = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65418e = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L3(String str) {
        Objects.requireNonNull(str);
        this.f65419f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65419f = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N3(SourceType sourceType) {
        Objects.requireNonNull(sourceType);
        this.f65417d = sourceType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O3(int i4) {
        this.f65417d = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUid() {
        this.f65415b = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n3() {
        this.f65420g = s3().getAppVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o3() {
        this.f65416c = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p3() {
        this.f65418e = s3().z();
    }

    public static Parser<h0> parser() {
        return f65413n.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q3() {
        this.f65419f = s3().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3() {
        this.f65417d = 0;
    }

    public static h0 s3() {
        return f65413n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUid(int i4) {
        this.f65415b = i4;
    }

    public static b t3() {
        return f65413n.toBuilder();
    }

    public static b u3(h0 h0Var) {
        return f65413n.toBuilder().mergeFrom((b) h0Var);
    }

    public static h0 v3(InputStream inputStream) throws IOException {
        return (h0) GeneratedMessageLite.parseDelimitedFrom(f65413n, inputStream);
    }

    public static h0 w3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (h0) GeneratedMessageLite.parseDelimitedFrom(f65413n, inputStream, extensionRegistryLite);
    }

    public static h0 x3(ByteString byteString) throws InvalidProtocolBufferException {
        return (h0) GeneratedMessageLite.parseFrom(f65413n, byteString);
    }

    public static h0 y3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (h0) GeneratedMessageLite.parseFrom(f65413n, byteString, extensionRegistryLite);
    }

    public static h0 z3(CodedInputStream codedInputStream) throws IOException {
        return (h0) GeneratedMessageLite.parseFrom(f65413n, codedInputStream);
    }

    @Override // com.wufan.user.service.protobuf.i0
    public int H2() {
        return this.f65416c;
    }

    @Override // com.wufan.user.service.protobuf.i0
    public int K2() {
        return this.f65417d;
    }

    @Override // com.wufan.user.service.protobuf.i0
    public SourceType P1() {
        SourceType forNumber = SourceType.forNumber(this.f65417d);
        return forNumber == null ? SourceType.UNRECOGNIZED : forNumber;
    }

    @Override // com.wufan.user.service.protobuf.i0
    public ByteString a() {
        return ByteString.copyFromUtf8(this.f65420g);
    }

    @Override // com.wufan.user.service.protobuf.i0
    public ByteString b() {
        return ByteString.copyFromUtf8(this.f65419f);
    }

    @Override // com.wufan.user.service.protobuf.i0
    public String c() {
        return this.f65419f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65421a[methodToInvoke.ordinal()]) {
            case 1:
                return new h0();
            case 2:
                return f65413n;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                h0 h0Var = (h0) obj2;
                int i4 = this.f65415b;
                boolean z4 = i4 != 0;
                int i5 = h0Var.f65415b;
                this.f65415b = visitor.visitInt(z4, i4, i5 != 0, i5);
                int i6 = this.f65416c;
                boolean z5 = i6 != 0;
                int i7 = h0Var.f65416c;
                this.f65416c = visitor.visitInt(z5, i6, i7 != 0, i7);
                int i8 = this.f65417d;
                boolean z6 = i8 != 0;
                int i9 = h0Var.f65417d;
                this.f65417d = visitor.visitInt(z6, i8, i9 != 0, i9);
                this.f65418e = visitor.visitString(!this.f65418e.isEmpty(), this.f65418e, !h0Var.f65418e.isEmpty(), h0Var.f65418e);
                this.f65419f = visitor.visitString(!this.f65419f.isEmpty(), this.f65419f, !h0Var.f65419f.isEmpty(), h0Var.f65419f);
                this.f65420g = visitor.visitString(!this.f65420g.isEmpty(), this.f65420g, !h0Var.f65420g.isEmpty(), h0Var.f65420g);
                GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!r1) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f65415b = codedInputStream.readInt32();
                            } else if (readTag == 16) {
                                this.f65416c = codedInputStream.readEnum();
                            } else if (readTag == 24) {
                                this.f65417d = codedInputStream.readEnum();
                            } else if (readTag == 34) {
                                this.f65418e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 42) {
                                this.f65419f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag != 50) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f65420g = codedInputStream.readStringRequireUtf8();
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
                if (f65414o == null) {
                    synchronized (h0.class) {
                        if (f65414o == null) {
                            f65414o = new GeneratedMessageLite.DefaultInstanceBasedParser(f65413n);
                        }
                    }
                }
                return f65414o;
            default:
                throw new UnsupportedOperationException();
        }
        return f65413n;
    }

    @Override // com.wufan.user.service.protobuf.i0
    public String getAppVersion() {
        return this.f65420g;
    }

    @Override // com.wufan.user.service.protobuf.i0
    public ContentType getContentType() {
        ContentType forNumber = ContentType.forNumber(this.f65416c);
        return forNumber == null ? ContentType.UNRECOGNIZED : forNumber;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int i5 = this.f65415b;
        int computeInt32Size = i5 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i5) : 0;
        if (this.f65416c != ContentType.MOBILE_REG.getNumber()) {
            computeInt32Size += CodedOutputStream.computeEnumSize(2, this.f65416c);
        }
        if (this.f65417d != SourceType.WORLD.getNumber()) {
            computeInt32Size += CodedOutputStream.computeEnumSize(3, this.f65417d);
        }
        if (!this.f65418e.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(4, z());
        }
        if (!this.f65419f.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(5, c());
        }
        if (!this.f65420g.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(6, getAppVersion());
        }
        this.memoizedSerializedSize = computeInt32Size;
        return computeInt32Size;
    }

    @Override // com.wufan.user.service.protobuf.i0
    public int getUid() {
        return this.f65415b;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i4 = this.f65415b;
        if (i4 != 0) {
            codedOutputStream.writeInt32(1, i4);
        }
        if (this.f65416c != ContentType.MOBILE_REG.getNumber()) {
            codedOutputStream.writeEnum(2, this.f65416c);
        }
        if (this.f65417d != SourceType.WORLD.getNumber()) {
            codedOutputStream.writeEnum(3, this.f65417d);
        }
        if (!this.f65418e.isEmpty()) {
            codedOutputStream.writeString(4, z());
        }
        if (!this.f65419f.isEmpty()) {
            codedOutputStream.writeString(5, c());
        }
        if (this.f65420g.isEmpty()) {
            return;
        }
        codedOutputStream.writeString(6, getAppVersion());
    }

    @Override // com.wufan.user.service.protobuf.i0
    public ByteString x() {
        return ByteString.copyFromUtf8(this.f65418e);
    }

    @Override // com.wufan.user.service.protobuf.i0
    public String z() {
        return this.f65418e;
    }
}
