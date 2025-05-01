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
/* compiled from: MobileRegisterRequestParameters.java */
/* loaded from: classes6.dex */
public final class x extends GeneratedMessageLite<x, b> implements y {

    /* renamed from: h  reason: collision with root package name */
    public static final int f65540h = 1;

    /* renamed from: i  reason: collision with root package name */
    public static final int f65541i = 2;

    /* renamed from: j  reason: collision with root package name */
    public static final int f65542j = 3;

    /* renamed from: k  reason: collision with root package name */
    public static final int f65543k = 4;

    /* renamed from: l  reason: collision with root package name */
    public static final int f65544l = 5;

    /* renamed from: m  reason: collision with root package name */
    public static final int f65545m = 6;

    /* renamed from: n  reason: collision with root package name */
    private static final x f65546n;

    /* renamed from: o  reason: collision with root package name */
    private static volatile Parser<x> f65547o;

    /* renamed from: b  reason: collision with root package name */
    private String f65548b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f65549c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f65550d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f65551e = "";

    /* renamed from: f  reason: collision with root package name */
    private String f65552f = "";

    /* renamed from: g  reason: collision with root package name */
    private String f65553g = "";

    /* compiled from: MobileRegisterRequestParameters.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65554a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65554a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65554a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65554a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65554a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65554a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65554a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65554a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65554a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: MobileRegisterRequestParameters.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<x, b> implements y {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b V2() {
            copyOnWrite();
            ((x) this.instance).o3();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((x) this.instance).p3();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((x) this.instance).clearAccount();
            return this;
        }

        public b X2() {
            copyOnWrite();
            ((x) this.instance).clearPassword();
            return this;
        }

        public b Y2() {
            copyOnWrite();
            ((x) this.instance).q3();
            return this;
        }

        public b Z2() {
            copyOnWrite();
            ((x) this.instance).r3();
            return this;
        }

        @Override // com.wufan.user.service.protobuf.y
        public ByteString a() {
            return ((x) this.instance).a();
        }

        public b a3(String str) {
            copyOnWrite();
            ((x) this.instance).F3(str);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.y
        public ByteString b() {
            return ((x) this.instance).b();
        }

        public b b3(ByteString byteString) {
            copyOnWrite();
            ((x) this.instance).G3(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.y
        public String c() {
            return ((x) this.instance).c();
        }

        public b c3(String str) {
            copyOnWrite();
            ((x) this.instance).H3(str);
            return this;
        }

        public b d3(ByteString byteString) {
            copyOnWrite();
            ((x) this.instance).I3(byteString);
            return this;
        }

        public b e3(String str) {
            copyOnWrite();
            ((x) this.instance).J3(str);
            return this;
        }

        public b f3(ByteString byteString) {
            copyOnWrite();
            ((x) this.instance).K3(byteString);
            return this;
        }

        public b g3(String str) {
            copyOnWrite();
            ((x) this.instance).setPassword(str);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.y
        public String getAccount() {
            return ((x) this.instance).getAccount();
        }

        @Override // com.wufan.user.service.protobuf.y
        public String getAppVersion() {
            return ((x) this.instance).getAppVersion();
        }

        @Override // com.wufan.user.service.protobuf.y
        public String getPassword() {
            return ((x) this.instance).getPassword();
        }

        @Override // com.wufan.user.service.protobuf.y
        public ByteString getPasswordBytes() {
            return ((x) this.instance).getPasswordBytes();
        }

        @Override // com.wufan.user.service.protobuf.y
        public ByteString h() {
            return ((x) this.instance).h();
        }

        public b h3(ByteString byteString) {
            copyOnWrite();
            ((x) this.instance).setPasswordBytes(byteString);
            return this;
        }

        public b i3(String str) {
            copyOnWrite();
            ((x) this.instance).L3(str);
            return this;
        }

        public b j3(ByteString byteString) {
            copyOnWrite();
            ((x) this.instance).M3(byteString);
            return this;
        }

        public b k3(String str) {
            copyOnWrite();
            ((x) this.instance).N3(str);
            return this;
        }

        public b l3(ByteString byteString) {
            copyOnWrite();
            ((x) this.instance).O3(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.y
        public ByteString p() {
            return ((x) this.instance).p();
        }

        @Override // com.wufan.user.service.protobuf.y
        public String r() {
            return ((x) this.instance).r();
        }

        @Override // com.wufan.user.service.protobuf.y
        public ByteString s() {
            return ((x) this.instance).s();
        }

        @Override // com.wufan.user.service.protobuf.y
        public String v() {
            return ((x) this.instance).v();
        }

        private b() {
            super(x.f65546n);
        }
    }

    static {
        x xVar = new x();
        f65546n = xVar;
        xVar.makeImmutable();
    }

    private x() {
    }

    public static x A3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (x) GeneratedMessageLite.parseFrom(f65546n, codedInputStream, extensionRegistryLite);
    }

    public static x B3(InputStream inputStream) throws IOException {
        return (x) GeneratedMessageLite.parseFrom(f65546n, inputStream);
    }

    public static x C3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (x) GeneratedMessageLite.parseFrom(f65546n, inputStream, extensionRegistryLite);
    }

    public static x D3(byte[] bArr) throws InvalidProtocolBufferException {
        return (x) GeneratedMessageLite.parseFrom(f65546n, bArr);
    }

    public static x E3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (x) GeneratedMessageLite.parseFrom(f65546n, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F3(String str) {
        Objects.requireNonNull(str);
        this.f65548b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65548b = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H3(String str) {
        Objects.requireNonNull(str);
        this.f65553g = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65553g = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J3(String str) {
        Objects.requireNonNull(str);
        this.f65551e = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65551e = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L3(String str) {
        Objects.requireNonNull(str);
        this.f65552f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65552f = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N3(String str) {
        Objects.requireNonNull(str);
        this.f65550d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65550d = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccount() {
        this.f65548b = s3().getAccount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPassword() {
        this.f65549c = s3().getPassword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o3() {
        this.f65553g = s3().getAppVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p3() {
        this.f65551e = s3().v();
    }

    public static Parser<x> parser() {
        return f65546n.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q3() {
        this.f65552f = s3().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3() {
        this.f65550d = s3().r();
    }

    public static x s3() {
        return f65546n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassword(String str) {
        Objects.requireNonNull(str);
        this.f65549c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPasswordBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65549c = byteString.toStringUtf8();
    }

    public static b t3() {
        return f65546n.toBuilder();
    }

    public static b u3(x xVar) {
        return f65546n.toBuilder().mergeFrom((b) xVar);
    }

    public static x v3(InputStream inputStream) throws IOException {
        return (x) GeneratedMessageLite.parseDelimitedFrom(f65546n, inputStream);
    }

    public static x w3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (x) GeneratedMessageLite.parseDelimitedFrom(f65546n, inputStream, extensionRegistryLite);
    }

    public static x x3(ByteString byteString) throws InvalidProtocolBufferException {
        return (x) GeneratedMessageLite.parseFrom(f65546n, byteString);
    }

    public static x y3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (x) GeneratedMessageLite.parseFrom(f65546n, byteString, extensionRegistryLite);
    }

    public static x z3(CodedInputStream codedInputStream) throws IOException {
        return (x) GeneratedMessageLite.parseFrom(f65546n, codedInputStream);
    }

    @Override // com.wufan.user.service.protobuf.y
    public ByteString a() {
        return ByteString.copyFromUtf8(this.f65553g);
    }

    @Override // com.wufan.user.service.protobuf.y
    public ByteString b() {
        return ByteString.copyFromUtf8(this.f65552f);
    }

    @Override // com.wufan.user.service.protobuf.y
    public String c() {
        return this.f65552f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65554a[methodToInvoke.ordinal()]) {
            case 1:
                return new x();
            case 2:
                return f65546n;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                x xVar = (x) obj2;
                this.f65548b = visitor.visitString(!this.f65548b.isEmpty(), this.f65548b, !xVar.f65548b.isEmpty(), xVar.f65548b);
                this.f65549c = visitor.visitString(!this.f65549c.isEmpty(), this.f65549c, !xVar.f65549c.isEmpty(), xVar.f65549c);
                this.f65550d = visitor.visitString(!this.f65550d.isEmpty(), this.f65550d, !xVar.f65550d.isEmpty(), xVar.f65550d);
                this.f65551e = visitor.visitString(!this.f65551e.isEmpty(), this.f65551e, !xVar.f65551e.isEmpty(), xVar.f65551e);
                this.f65552f = visitor.visitString(!this.f65552f.isEmpty(), this.f65552f, !xVar.f65552f.isEmpty(), xVar.f65552f);
                this.f65553g = visitor.visitString(!this.f65553g.isEmpty(), this.f65553g, true ^ xVar.f65553g.isEmpty(), xVar.f65553g);
                GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z4 = false;
                while (!z4) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.f65548b = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f65549c = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.f65550d = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                this.f65551e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 42) {
                                this.f65552f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag != 50) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f65553g = codedInputStream.readStringRequireUtf8();
                            }
                        }
                        z4 = true;
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
                if (f65547o == null) {
                    synchronized (x.class) {
                        if (f65547o == null) {
                            f65547o = new GeneratedMessageLite.DefaultInstanceBasedParser(f65546n);
                        }
                    }
                }
                return f65547o;
            default:
                throw new UnsupportedOperationException();
        }
        return f65546n;
    }

    @Override // com.wufan.user.service.protobuf.y
    public String getAccount() {
        return this.f65548b;
    }

    @Override // com.wufan.user.service.protobuf.y
    public String getAppVersion() {
        return this.f65553g;
    }

    @Override // com.wufan.user.service.protobuf.y
    public String getPassword() {
        return this.f65549c;
    }

    @Override // com.wufan.user.service.protobuf.y
    public ByteString getPasswordBytes() {
        return ByteString.copyFromUtf8(this.f65549c);
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int computeStringSize = this.f65548b.isEmpty() ? 0 : 0 + CodedOutputStream.computeStringSize(1, getAccount());
        if (!this.f65549c.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(2, getPassword());
        }
        if (!this.f65550d.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(3, r());
        }
        if (!this.f65551e.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(4, v());
        }
        if (!this.f65552f.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(5, c());
        }
        if (!this.f65553g.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(6, getAppVersion());
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    @Override // com.wufan.user.service.protobuf.y
    public ByteString h() {
        return ByteString.copyFromUtf8(this.f65548b);
    }

    @Override // com.wufan.user.service.protobuf.y
    public ByteString p() {
        return ByteString.copyFromUtf8(this.f65550d);
    }

    @Override // com.wufan.user.service.protobuf.y
    public String r() {
        return this.f65550d;
    }

    @Override // com.wufan.user.service.protobuf.y
    public ByteString s() {
        return ByteString.copyFromUtf8(this.f65551e);
    }

    @Override // com.wufan.user.service.protobuf.y
    public String v() {
        return this.f65551e;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f65548b.isEmpty()) {
            codedOutputStream.writeString(1, getAccount());
        }
        if (!this.f65549c.isEmpty()) {
            codedOutputStream.writeString(2, getPassword());
        }
        if (!this.f65550d.isEmpty()) {
            codedOutputStream.writeString(3, r());
        }
        if (!this.f65551e.isEmpty()) {
            codedOutputStream.writeString(4, v());
        }
        if (!this.f65552f.isEmpty()) {
            codedOutputStream.writeString(5, c());
        }
        if (this.f65553g.isEmpty()) {
            return;
        }
        codedOutputStream.writeString(6, getAppVersion());
    }
}
