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
/* compiled from: MessageCheckTokenRequestParameters.java */
/* loaded from: classes6.dex */
public final class k extends GeneratedMessageLite<k, b> implements l {

    /* renamed from: f  reason: collision with root package name */
    public static final int f65433f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f65434g = 2;

    /* renamed from: h  reason: collision with root package name */
    public static final int f65435h = 3;

    /* renamed from: i  reason: collision with root package name */
    public static final int f65436i = 4;

    /* renamed from: j  reason: collision with root package name */
    private static final k f65437j;

    /* renamed from: k  reason: collision with root package name */
    private static volatile Parser<k> f65438k;

    /* renamed from: b  reason: collision with root package name */
    private int f65439b;

    /* renamed from: c  reason: collision with root package name */
    private String f65440c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f65441d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f65442e = "";

    /* compiled from: MessageCheckTokenRequestParameters.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65443a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65443a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65443a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65443a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65443a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65443a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65443a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65443a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65443a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: MessageCheckTokenRequestParameters.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<k, b> implements l {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b V2() {
            copyOnWrite();
            ((k) this.instance).i3();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((k) this.instance).clearToken();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((k) this.instance).h3();
            return this;
        }

        public b X2() {
            copyOnWrite();
            ((k) this.instance).clearUid();
            return this;
        }

        public b Y2(String str) {
            copyOnWrite();
            ((k) this.instance).w3(str);
            return this;
        }

        public b Z2(ByteString byteString) {
            copyOnWrite();
            ((k) this.instance).x3(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.l
        public ByteString a() {
            return ((k) this.instance).a();
        }

        public b a3(String str) {
            copyOnWrite();
            ((k) this.instance).y3(str);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.l
        public ByteString b() {
            return ((k) this.instance).b();
        }

        public b b3(ByteString byteString) {
            copyOnWrite();
            ((k) this.instance).z3(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.l
        public String c() {
            return ((k) this.instance).c();
        }

        public b c3(String str) {
            copyOnWrite();
            ((k) this.instance).setToken(str);
            return this;
        }

        public b d3(ByteString byteString) {
            copyOnWrite();
            ((k) this.instance).setTokenBytes(byteString);
            return this;
        }

        public b e3(int i4) {
            copyOnWrite();
            ((k) this.instance).setUid(i4);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.l
        public String getAppVersion() {
            return ((k) this.instance).getAppVersion();
        }

        @Override // com.wufan.user.service.protobuf.l
        public String getToken() {
            return ((k) this.instance).getToken();
        }

        @Override // com.wufan.user.service.protobuf.l
        public ByteString getTokenBytes() {
            return ((k) this.instance).getTokenBytes();
        }

        @Override // com.wufan.user.service.protobuf.l
        public int getUid() {
            return ((k) this.instance).getUid();
        }

        private b() {
            super(k.f65437j);
        }
    }

    static {
        k kVar = new k();
        f65437j = kVar;
        kVar.makeImmutable();
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToken() {
        this.f65440c = j3().getToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUid() {
        this.f65439b = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3() {
        this.f65441d = j3().getAppVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3() {
        this.f65442e = j3().c();
    }

    public static k j3() {
        return f65437j;
    }

    public static b k3() {
        return f65437j.toBuilder();
    }

    public static b l3(k kVar) {
        return f65437j.toBuilder().mergeFrom((b) kVar);
    }

    public static k m3(InputStream inputStream) throws IOException {
        return (k) GeneratedMessageLite.parseDelimitedFrom(f65437j, inputStream);
    }

    public static k n3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (k) GeneratedMessageLite.parseDelimitedFrom(f65437j, inputStream, extensionRegistryLite);
    }

    public static k o3(ByteString byteString) throws InvalidProtocolBufferException {
        return (k) GeneratedMessageLite.parseFrom(f65437j, byteString);
    }

    public static k p3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (k) GeneratedMessageLite.parseFrom(f65437j, byteString, extensionRegistryLite);
    }

    public static Parser<k> parser() {
        return f65437j.getParserForType();
    }

    public static k q3(CodedInputStream codedInputStream) throws IOException {
        return (k) GeneratedMessageLite.parseFrom(f65437j, codedInputStream);
    }

    public static k r3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (k) GeneratedMessageLite.parseFrom(f65437j, codedInputStream, extensionRegistryLite);
    }

    public static k s3(InputStream inputStream) throws IOException {
        return (k) GeneratedMessageLite.parseFrom(f65437j, inputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToken(String str) {
        Objects.requireNonNull(str);
        this.f65440c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTokenBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65440c = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUid(int i4) {
        this.f65439b = i4;
    }

    public static k t3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (k) GeneratedMessageLite.parseFrom(f65437j, inputStream, extensionRegistryLite);
    }

    public static k u3(byte[] bArr) throws InvalidProtocolBufferException {
        return (k) GeneratedMessageLite.parseFrom(f65437j, bArr);
    }

    public static k v3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (k) GeneratedMessageLite.parseFrom(f65437j, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w3(String str) {
        Objects.requireNonNull(str);
        this.f65441d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65441d = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3(String str) {
        Objects.requireNonNull(str);
        this.f65442e = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65442e = byteString.toStringUtf8();
    }

    @Override // com.wufan.user.service.protobuf.l
    public ByteString a() {
        return ByteString.copyFromUtf8(this.f65441d);
    }

    @Override // com.wufan.user.service.protobuf.l
    public ByteString b() {
        return ByteString.copyFromUtf8(this.f65442e);
    }

    @Override // com.wufan.user.service.protobuf.l
    public String c() {
        return this.f65442e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65443a[methodToInvoke.ordinal()]) {
            case 1:
                return new k();
            case 2:
                return f65437j;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                k kVar = (k) obj2;
                int i4 = this.f65439b;
                boolean z4 = i4 != 0;
                int i5 = kVar.f65439b;
                this.f65439b = visitor.visitInt(z4, i4, i5 != 0, i5);
                this.f65440c = visitor.visitString(!this.f65440c.isEmpty(), this.f65440c, !kVar.f65440c.isEmpty(), kVar.f65440c);
                this.f65441d = visitor.visitString(!this.f65441d.isEmpty(), this.f65441d, !kVar.f65441d.isEmpty(), kVar.f65441d);
                this.f65442e = visitor.visitString(!this.f65442e.isEmpty(), this.f65442e, !kVar.f65442e.isEmpty(), kVar.f65442e);
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
                                    this.f65439b = codedInputStream.readInt32();
                                } else if (readTag == 18) {
                                    this.f65440c = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    this.f65441d = codedInputStream.readStringRequireUtf8();
                                } else if (readTag != 34) {
                                    if (!codedInputStream.skipField(readTag)) {
                                    }
                                } else {
                                    this.f65442e = codedInputStream.readStringRequireUtf8();
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
                if (f65438k == null) {
                    synchronized (k.class) {
                        if (f65438k == null) {
                            f65438k = new GeneratedMessageLite.DefaultInstanceBasedParser(f65437j);
                        }
                    }
                }
                return f65438k;
            default:
                throw new UnsupportedOperationException();
        }
        return f65437j;
    }

    @Override // com.wufan.user.service.protobuf.l
    public String getAppVersion() {
        return this.f65441d;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int i5 = this.f65439b;
        int computeInt32Size = i5 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i5) : 0;
        if (!this.f65440c.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(2, getToken());
        }
        if (!this.f65441d.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(3, getAppVersion());
        }
        if (!this.f65442e.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(4, c());
        }
        this.memoizedSerializedSize = computeInt32Size;
        return computeInt32Size;
    }

    @Override // com.wufan.user.service.protobuf.l
    public String getToken() {
        return this.f65440c;
    }

    @Override // com.wufan.user.service.protobuf.l
    public ByteString getTokenBytes() {
        return ByteString.copyFromUtf8(this.f65440c);
    }

    @Override // com.wufan.user.service.protobuf.l
    public int getUid() {
        return this.f65439b;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i4 = this.f65439b;
        if (i4 != 0) {
            codedOutputStream.writeInt32(1, i4);
        }
        if (!this.f65440c.isEmpty()) {
            codedOutputStream.writeString(2, getToken());
        }
        if (!this.f65441d.isEmpty()) {
            codedOutputStream.writeString(3, getAppVersion());
        }
        if (this.f65442e.isEmpty()) {
            return;
        }
        codedOutputStream.writeString(4, c());
    }
}
