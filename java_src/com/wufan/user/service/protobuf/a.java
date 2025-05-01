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
/* compiled from: ErrorMsg.java */
/* loaded from: classes6.dex */
public final class a extends GeneratedMessageLite<a, b> implements com.wufan.user.service.protobuf.b {

    /* renamed from: d  reason: collision with root package name */
    public static final int f65334d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f65335e = 3;

    /* renamed from: f  reason: collision with root package name */
    private static final a f65336f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile Parser<a> f65337g;

    /* renamed from: b  reason: collision with root package name */
    private int f65338b;

    /* renamed from: c  reason: collision with root package name */
    private String f65339c = "";

    /* compiled from: ErrorMsg.java */
    /* renamed from: com.wufan.user.service.protobuf.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static /* synthetic */ class C0686a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65340a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65340a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65340a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65340a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65340a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65340a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65340a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65340a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65340a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: ErrorMsg.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<a, b> implements com.wufan.user.service.protobuf.b {
        /* synthetic */ b(C0686a c0686a) {
            this();
        }

        public b V2() {
            copyOnWrite();
            ((a) this.instance).b3();
            return this;
        }

        public b W2(int i4) {
            copyOnWrite();
            ((a) this.instance).p3(i4);
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((a) this.instance).clearError();
            return this;
        }

        public b X2(String str) {
            copyOnWrite();
            ((a) this.instance).q3(str);
            return this;
        }

        public b Y2(ByteString byteString) {
            copyOnWrite();
            ((a) this.instance).r3(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.b
        public int getError() {
            return ((a) this.instance).getError();
        }

        @Override // com.wufan.user.service.protobuf.b
        public ByteString j() {
            return ((a) this.instance).j();
        }

        @Override // com.wufan.user.service.protobuf.b
        public String k() {
            return ((a) this.instance).k();
        }

        private b() {
            super(a.f65336f);
        }
    }

    static {
        a aVar = new a();
        f65336f = aVar;
        aVar.makeImmutable();
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b3() {
        this.f65339c = c3().k();
    }

    public static a c3() {
        return f65336f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearError() {
        this.f65338b = 0;
    }

    public static b d3() {
        return f65336f.toBuilder();
    }

    public static b e3(a aVar) {
        return f65336f.toBuilder().mergeFrom((b) aVar);
    }

    public static a f3(InputStream inputStream) throws IOException {
        return (a) GeneratedMessageLite.parseDelimitedFrom(f65336f, inputStream);
    }

    public static a g3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (a) GeneratedMessageLite.parseDelimitedFrom(f65336f, inputStream, extensionRegistryLite);
    }

    public static a h3(ByteString byteString) throws InvalidProtocolBufferException {
        return (a) GeneratedMessageLite.parseFrom(f65336f, byteString);
    }

    public static a i3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (a) GeneratedMessageLite.parseFrom(f65336f, byteString, extensionRegistryLite);
    }

    public static a j3(CodedInputStream codedInputStream) throws IOException {
        return (a) GeneratedMessageLite.parseFrom(f65336f, codedInputStream);
    }

    public static a k3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (a) GeneratedMessageLite.parseFrom(f65336f, codedInputStream, extensionRegistryLite);
    }

    public static a l3(InputStream inputStream) throws IOException {
        return (a) GeneratedMessageLite.parseFrom(f65336f, inputStream);
    }

    public static a m3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (a) GeneratedMessageLite.parseFrom(f65336f, inputStream, extensionRegistryLite);
    }

    public static a n3(byte[] bArr) throws InvalidProtocolBufferException {
        return (a) GeneratedMessageLite.parseFrom(f65336f, bArr);
    }

    public static a o3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (a) GeneratedMessageLite.parseFrom(f65336f, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p3(int i4) {
        this.f65338b = i4;
    }

    public static Parser<a> parser() {
        return f65336f.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q3(String str) {
        Objects.requireNonNull(str);
        this.f65339c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65339c = byteString.toStringUtf8();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C0686a.f65340a[methodToInvoke.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return f65336f;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                a aVar = (a) obj2;
                int i4 = this.f65338b;
                boolean z4 = i4 != 0;
                int i5 = aVar.f65338b;
                this.f65338b = visitor.visitInt(z4, i4, i5 != 0, i5);
                this.f65339c = visitor.visitString(!this.f65339c.isEmpty(), this.f65339c, !aVar.f65339c.isEmpty(), aVar.f65339c);
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
                                this.f65338b = codedInputStream.readInt32();
                            } else if (readTag != 26) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f65339c = codedInputStream.readStringRequireUtf8();
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
                if (f65337g == null) {
                    synchronized (a.class) {
                        if (f65337g == null) {
                            f65337g = new GeneratedMessageLite.DefaultInstanceBasedParser(f65336f);
                        }
                    }
                }
                return f65337g;
            default:
                throw new UnsupportedOperationException();
        }
        return f65336f;
    }

    @Override // com.wufan.user.service.protobuf.b
    public int getError() {
        return this.f65338b;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int i5 = this.f65338b;
        int computeInt32Size = i5 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i5) : 0;
        if (!this.f65339c.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(3, k());
        }
        this.memoizedSerializedSize = computeInt32Size;
        return computeInt32Size;
    }

    @Override // com.wufan.user.service.protobuf.b
    public ByteString j() {
        return ByteString.copyFromUtf8(this.f65339c);
    }

    @Override // com.wufan.user.service.protobuf.b
    public String k() {
        return this.f65339c;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i4 = this.f65338b;
        if (i4 != 0) {
            codedOutputStream.writeInt32(1, i4);
        }
        if (this.f65339c.isEmpty()) {
            return;
        }
        codedOutputStream.writeString(3, k());
    }
}
