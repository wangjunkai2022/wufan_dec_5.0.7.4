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
/* compiled from: RequestParameters.java */
/* loaded from: classes6.dex */
public final class b0 extends GeneratedMessageLite<b0, b> implements c0 {

    /* renamed from: f  reason: collision with root package name */
    public static final int f65341f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f65342g = 2;

    /* renamed from: h  reason: collision with root package name */
    public static final int f65343h = 3;

    /* renamed from: i  reason: collision with root package name */
    public static final int f65344i = 4;

    /* renamed from: j  reason: collision with root package name */
    private static final b0 f65345j;

    /* renamed from: k  reason: collision with root package name */
    private static volatile Parser<b0> f65346k;

    /* renamed from: b  reason: collision with root package name */
    private int f65347b;

    /* renamed from: c  reason: collision with root package name */
    private String f65348c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f65349d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f65350e = "";

    /* compiled from: RequestParameters.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65351a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65351a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65351a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65351a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65351a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65351a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65351a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65351a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65351a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: RequestParameters.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<b0, b> implements c0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b V2() {
            copyOnWrite();
            ((b0) this.instance).i3();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((b0) this.instance).clearToken();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((b0) this.instance).h3();
            return this;
        }

        public b X2() {
            copyOnWrite();
            ((b0) this.instance).clearUid();
            return this;
        }

        public b Y2(String str) {
            copyOnWrite();
            ((b0) this.instance).w3(str);
            return this;
        }

        public b Z2(ByteString byteString) {
            copyOnWrite();
            ((b0) this.instance).x3(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.c0
        public ByteString a() {
            return ((b0) this.instance).a();
        }

        public b a3(String str) {
            copyOnWrite();
            ((b0) this.instance).y3(str);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.c0
        public ByteString b() {
            return ((b0) this.instance).b();
        }

        public b b3(ByteString byteString) {
            copyOnWrite();
            ((b0) this.instance).z3(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.c0
        public String c() {
            return ((b0) this.instance).c();
        }

        public b c3(String str) {
            copyOnWrite();
            ((b0) this.instance).setToken(str);
            return this;
        }

        public b d3(ByteString byteString) {
            copyOnWrite();
            ((b0) this.instance).setTokenBytes(byteString);
            return this;
        }

        public b e3(int i4) {
            copyOnWrite();
            ((b0) this.instance).setUid(i4);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.c0
        public String getAppVersion() {
            return ((b0) this.instance).getAppVersion();
        }

        @Override // com.wufan.user.service.protobuf.c0
        public String getToken() {
            return ((b0) this.instance).getToken();
        }

        @Override // com.wufan.user.service.protobuf.c0
        public ByteString getTokenBytes() {
            return ((b0) this.instance).getTokenBytes();
        }

        @Override // com.wufan.user.service.protobuf.c0
        public int getUid() {
            return ((b0) this.instance).getUid();
        }

        private b() {
            super(b0.f65345j);
        }
    }

    static {
        b0 b0Var = new b0();
        f65345j = b0Var;
        b0Var.makeImmutable();
    }

    private b0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToken() {
        this.f65348c = j3().getToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUid() {
        this.f65347b = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3() {
        this.f65350e = j3().getAppVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3() {
        this.f65349d = j3().c();
    }

    public static b0 j3() {
        return f65345j;
    }

    public static b k3() {
        return f65345j.toBuilder();
    }

    public static b l3(b0 b0Var) {
        return f65345j.toBuilder().mergeFrom((b) b0Var);
    }

    public static b0 m3(InputStream inputStream) throws IOException {
        return (b0) GeneratedMessageLite.parseDelimitedFrom(f65345j, inputStream);
    }

    public static b0 n3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (b0) GeneratedMessageLite.parseDelimitedFrom(f65345j, inputStream, extensionRegistryLite);
    }

    public static b0 o3(ByteString byteString) throws InvalidProtocolBufferException {
        return (b0) GeneratedMessageLite.parseFrom(f65345j, byteString);
    }

    public static b0 p3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (b0) GeneratedMessageLite.parseFrom(f65345j, byteString, extensionRegistryLite);
    }

    public static Parser<b0> parser() {
        return f65345j.getParserForType();
    }

    public static b0 q3(CodedInputStream codedInputStream) throws IOException {
        return (b0) GeneratedMessageLite.parseFrom(f65345j, codedInputStream);
    }

    public static b0 r3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (b0) GeneratedMessageLite.parseFrom(f65345j, codedInputStream, extensionRegistryLite);
    }

    public static b0 s3(InputStream inputStream) throws IOException {
        return (b0) GeneratedMessageLite.parseFrom(f65345j, inputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToken(String str) {
        Objects.requireNonNull(str);
        this.f65348c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTokenBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65348c = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUid(int i4) {
        this.f65347b = i4;
    }

    public static b0 t3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (b0) GeneratedMessageLite.parseFrom(f65345j, inputStream, extensionRegistryLite);
    }

    public static b0 u3(byte[] bArr) throws InvalidProtocolBufferException {
        return (b0) GeneratedMessageLite.parseFrom(f65345j, bArr);
    }

    public static b0 v3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (b0) GeneratedMessageLite.parseFrom(f65345j, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w3(String str) {
        Objects.requireNonNull(str);
        this.f65350e = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65350e = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3(String str) {
        Objects.requireNonNull(str);
        this.f65349d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65349d = byteString.toStringUtf8();
    }

    @Override // com.wufan.user.service.protobuf.c0
    public ByteString a() {
        return ByteString.copyFromUtf8(this.f65350e);
    }

    @Override // com.wufan.user.service.protobuf.c0
    public ByteString b() {
        return ByteString.copyFromUtf8(this.f65349d);
    }

    @Override // com.wufan.user.service.protobuf.c0
    public String c() {
        return this.f65349d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65351a[methodToInvoke.ordinal()]) {
            case 1:
                return new b0();
            case 2:
                return f65345j;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                b0 b0Var = (b0) obj2;
                int i4 = this.f65347b;
                boolean z4 = i4 != 0;
                int i5 = b0Var.f65347b;
                this.f65347b = visitor.visitInt(z4, i4, i5 != 0, i5);
                this.f65348c = visitor.visitString(!this.f65348c.isEmpty(), this.f65348c, !b0Var.f65348c.isEmpty(), b0Var.f65348c);
                this.f65349d = visitor.visitString(!this.f65349d.isEmpty(), this.f65349d, !b0Var.f65349d.isEmpty(), b0Var.f65349d);
                this.f65350e = visitor.visitString(!this.f65350e.isEmpty(), this.f65350e, !b0Var.f65350e.isEmpty(), b0Var.f65350e);
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
                                if (readTag == 8) {
                                    this.f65347b = codedInputStream.readInt32();
                                } else if (readTag == 18) {
                                    this.f65348c = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    this.f65349d = codedInputStream.readStringRequireUtf8();
                                } else if (readTag != 34) {
                                    if (!codedInputStream.skipField(readTag)) {
                                    }
                                } else {
                                    this.f65350e = codedInputStream.readStringRequireUtf8();
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
                if (f65346k == null) {
                    synchronized (b0.class) {
                        if (f65346k == null) {
                            f65346k = new GeneratedMessageLite.DefaultInstanceBasedParser(f65345j);
                        }
                    }
                }
                return f65346k;
            default:
                throw new UnsupportedOperationException();
        }
        return f65345j;
    }

    @Override // com.wufan.user.service.protobuf.c0
    public String getAppVersion() {
        return this.f65350e;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int i5 = this.f65347b;
        int computeInt32Size = i5 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i5) : 0;
        if (!this.f65348c.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(2, getToken());
        }
        if (!this.f65349d.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(3, c());
        }
        if (!this.f65350e.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(4, getAppVersion());
        }
        this.memoizedSerializedSize = computeInt32Size;
        return computeInt32Size;
    }

    @Override // com.wufan.user.service.protobuf.c0
    public String getToken() {
        return this.f65348c;
    }

    @Override // com.wufan.user.service.protobuf.c0
    public ByteString getTokenBytes() {
        return ByteString.copyFromUtf8(this.f65348c);
    }

    @Override // com.wufan.user.service.protobuf.c0
    public int getUid() {
        return this.f65347b;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i4 = this.f65347b;
        if (i4 != 0) {
            codedOutputStream.writeInt32(1, i4);
        }
        if (!this.f65348c.isEmpty()) {
            codedOutputStream.writeString(2, getToken());
        }
        if (!this.f65349d.isEmpty()) {
            codedOutputStream.writeString(3, c());
        }
        if (this.f65350e.isEmpty()) {
            return;
        }
        codedOutputStream.writeString(4, getAppVersion());
    }
}
