package com.wufan.user.service.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* compiled from: UserRegStatusResponseField.java */
/* loaded from: classes6.dex */
public final class v0 extends GeneratedMessageLite<v0, b> implements w0 {

    /* renamed from: e  reason: collision with root package name */
    public static final int f65523e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f65524f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f65525g = 3;

    /* renamed from: h  reason: collision with root package name */
    private static final v0 f65526h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile Parser<v0> f65527i;

    /* renamed from: b  reason: collision with root package name */
    private int f65528b;

    /* renamed from: c  reason: collision with root package name */
    private c f65529c;

    /* renamed from: d  reason: collision with root package name */
    private String f65530d = "";

    /* compiled from: UserRegStatusResponseField.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65531a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65531a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65531a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65531a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65531a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65531a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65531a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65531a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65531a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: UserRegStatusResponseField.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<v0, b> implements w0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b V2() {
            copyOnWrite();
            ((v0) this.instance).clearError();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((v0) this.instance).g3();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((v0) this.instance).f3();
            return this;
        }

        public b X2(c cVar) {
            copyOnWrite();
            ((v0) this.instance).i3(cVar);
            return this;
        }

        public b Y2(c.a aVar) {
            copyOnWrite();
            ((v0) this.instance).v3(aVar);
            return this;
        }

        public b Z2(c cVar) {
            copyOnWrite();
            ((v0) this.instance).w3(cVar);
            return this;
        }

        public b a3(int i4) {
            copyOnWrite();
            ((v0) this.instance).x3(i4);
            return this;
        }

        public b b3(String str) {
            copyOnWrite();
            ((v0) this.instance).y3(str);
            return this;
        }

        public b c3(ByteString byteString) {
            copyOnWrite();
            ((v0) this.instance).z3(byteString);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.w0
        public c getData() {
            return ((v0) this.instance).getData();
        }

        @Override // com.wufan.user.service.protobuf.w0
        public int getError() {
            return ((v0) this.instance).getError();
        }

        @Override // com.wufan.user.service.protobuf.w0
        public ByteString j() {
            return ((v0) this.instance).j();
        }

        @Override // com.wufan.user.service.protobuf.w0
        public String k() {
            return ((v0) this.instance).k();
        }

        @Override // com.wufan.user.service.protobuf.w0
        public boolean m() {
            return ((v0) this.instance).m();
        }

        private b() {
            super(v0.f65526h);
        }
    }

    /* compiled from: UserRegStatusResponseField.java */
    /* loaded from: classes6.dex */
    public static final class c extends GeneratedMessageLite<c, a> implements d {

        /* renamed from: e  reason: collision with root package name */
        public static final int f65532e = 4;

        /* renamed from: f  reason: collision with root package name */
        public static final int f65533f = 5;

        /* renamed from: g  reason: collision with root package name */
        public static final int f65534g = 6;

        /* renamed from: h  reason: collision with root package name */
        private static final c f65535h;

        /* renamed from: i  reason: collision with root package name */
        private static volatile Parser<c> f65536i;

        /* renamed from: b  reason: collision with root package name */
        private boolean f65537b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f65538c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f65539d;

        /* compiled from: UserRegStatusResponseField.java */
        /* loaded from: classes6.dex */
        public static final class a extends GeneratedMessageLite.Builder<c, a> implements d {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.wufan.user.service.protobuf.v0.d
            public boolean Q0() {
                return ((c) this.instance).Q0();
            }

            public a V2() {
                copyOnWrite();
                ((c) this.instance).d3();
                return this;
            }

            public a W2() {
                copyOnWrite();
                ((c) this.instance).e3();
                return this;
            }

            public a X0() {
                copyOnWrite();
                ((c) this.instance).c3();
                return this;
            }

            public a X2(boolean z4) {
                copyOnWrite();
                ((c) this.instance).s3(z4);
                return this;
            }

            public a Y2(boolean z4) {
                copyOnWrite();
                ((c) this.instance).t3(z4);
                return this;
            }

            public a Z2(boolean z4) {
                copyOnWrite();
                ((c) this.instance).u3(z4);
                return this;
            }

            @Override // com.wufan.user.service.protobuf.v0.d
            public boolean i0() {
                return ((c) this.instance).i0();
            }

            @Override // com.wufan.user.service.protobuf.v0.d
            public boolean p0() {
                return ((c) this.instance).p0();
            }

            private a() {
                super(c.f65535h);
            }
        }

        static {
            c cVar = new c();
            f65535h = cVar;
            cVar.makeImmutable();
        }

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c3() {
            this.f65539d = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d3() {
            this.f65537b = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e3() {
            this.f65538c = false;
        }

        public static c f3() {
            return f65535h;
        }

        public static a g3() {
            return f65535h.toBuilder();
        }

        public static a h3(c cVar) {
            return f65535h.toBuilder().mergeFrom((a) cVar);
        }

        public static c i3(InputStream inputStream) throws IOException {
            return (c) GeneratedMessageLite.parseDelimitedFrom(f65535h, inputStream);
        }

        public static c j3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (c) GeneratedMessageLite.parseDelimitedFrom(f65535h, inputStream, extensionRegistryLite);
        }

        public static c k3(ByteString byteString) throws InvalidProtocolBufferException {
            return (c) GeneratedMessageLite.parseFrom(f65535h, byteString);
        }

        public static c l3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (c) GeneratedMessageLite.parseFrom(f65535h, byteString, extensionRegistryLite);
        }

        public static c m3(CodedInputStream codedInputStream) throws IOException {
            return (c) GeneratedMessageLite.parseFrom(f65535h, codedInputStream);
        }

        public static c n3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (c) GeneratedMessageLite.parseFrom(f65535h, codedInputStream, extensionRegistryLite);
        }

        public static c o3(InputStream inputStream) throws IOException {
            return (c) GeneratedMessageLite.parseFrom(f65535h, inputStream);
        }

        public static c p3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (c) GeneratedMessageLite.parseFrom(f65535h, inputStream, extensionRegistryLite);
        }

        public static Parser<c> parser() {
            return f65535h.getParserForType();
        }

        public static c q3(byte[] bArr) throws InvalidProtocolBufferException {
            return (c) GeneratedMessageLite.parseFrom(f65535h, bArr);
        }

        public static c r3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (c) GeneratedMessageLite.parseFrom(f65535h, bArr, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s3(boolean z4) {
            this.f65539d = z4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t3(boolean z4) {
            this.f65537b = z4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void u3(boolean z4) {
            this.f65538c = z4;
        }

        @Override // com.wufan.user.service.protobuf.v0.d
        public boolean Q0() {
            return this.f65538c;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.f65531a[methodToInvoke.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return f65535h;
                case 3:
                    return null;
                case 4:
                    return new a(null);
                case 5:
                    GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                    c cVar = (c) obj2;
                    boolean z4 = this.f65537b;
                    boolean z5 = cVar.f65537b;
                    this.f65537b = visitor.visitBoolean(z4, z4, z5, z5);
                    boolean z6 = this.f65538c;
                    boolean z7 = cVar.f65538c;
                    this.f65538c = visitor.visitBoolean(z6, z6, z7, z7);
                    boolean z8 = this.f65539d;
                    boolean z9 = cVar.f65539d;
                    this.f65539d = visitor.visitBoolean(z8, z8, z9, z9);
                    GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 32) {
                                    this.f65537b = codedInputStream.readBool();
                                } else if (readTag == 40) {
                                    this.f65538c = codedInputStream.readBool();
                                } else if (readTag != 48) {
                                    if (!codedInputStream.skipField(readTag)) {
                                    }
                                } else {
                                    this.f65539d = codedInputStream.readBool();
                                }
                            }
                            z10 = true;
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
                    if (f65536i == null) {
                        synchronized (c.class) {
                            if (f65536i == null) {
                                f65536i = new GeneratedMessageLite.DefaultInstanceBasedParser(f65535h);
                            }
                        }
                    }
                    return f65536i;
                default:
                    throw new UnsupportedOperationException();
            }
            return f65535h;
        }

        @Override // com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i4 = this.memoizedSerializedSize;
            if (i4 != -1) {
                return i4;
            }
            boolean z4 = this.f65537b;
            int computeBoolSize = z4 ? 0 + CodedOutputStream.computeBoolSize(4, z4) : 0;
            boolean z5 = this.f65538c;
            if (z5) {
                computeBoolSize += CodedOutputStream.computeBoolSize(5, z5);
            }
            boolean z6 = this.f65539d;
            if (z6) {
                computeBoolSize += CodedOutputStream.computeBoolSize(6, z6);
            }
            this.memoizedSerializedSize = computeBoolSize;
            return computeBoolSize;
        }

        @Override // com.wufan.user.service.protobuf.v0.d
        public boolean i0() {
            return this.f65539d;
        }

        @Override // com.wufan.user.service.protobuf.v0.d
        public boolean p0() {
            return this.f65537b;
        }

        @Override // com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            boolean z4 = this.f65537b;
            if (z4) {
                codedOutputStream.writeBool(4, z4);
            }
            boolean z5 = this.f65538c;
            if (z5) {
                codedOutputStream.writeBool(5, z5);
            }
            boolean z6 = this.f65539d;
            if (z6) {
                codedOutputStream.writeBool(6, z6);
            }
        }
    }

    /* compiled from: UserRegStatusResponseField.java */
    /* loaded from: classes6.dex */
    public interface d extends MessageLiteOrBuilder {
        boolean Q0();

        boolean i0();

        boolean p0();
    }

    static {
        v0 v0Var = new v0();
        f65526h = v0Var;
        v0Var.makeImmutable();
    }

    private v0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearError() {
        this.f65528b = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f3() {
        this.f65529c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g3() {
        this.f65530d = h3().k();
    }

    public static v0 h3() {
        return f65526h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3(c cVar) {
        c cVar2 = this.f65529c;
        if (cVar2 != null && cVar2 != c.f3()) {
            this.f65529c = c.h3(this.f65529c).mergeFrom((c.a) cVar).buildPartial();
        } else {
            this.f65529c = cVar;
        }
    }

    public static b j3() {
        return f65526h.toBuilder();
    }

    public static b k3(v0 v0Var) {
        return f65526h.toBuilder().mergeFrom((b) v0Var);
    }

    public static v0 l3(InputStream inputStream) throws IOException {
        return (v0) GeneratedMessageLite.parseDelimitedFrom(f65526h, inputStream);
    }

    public static v0 m3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (v0) GeneratedMessageLite.parseDelimitedFrom(f65526h, inputStream, extensionRegistryLite);
    }

    public static v0 n3(ByteString byteString) throws InvalidProtocolBufferException {
        return (v0) GeneratedMessageLite.parseFrom(f65526h, byteString);
    }

    public static v0 o3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (v0) GeneratedMessageLite.parseFrom(f65526h, byteString, extensionRegistryLite);
    }

    public static v0 p3(CodedInputStream codedInputStream) throws IOException {
        return (v0) GeneratedMessageLite.parseFrom(f65526h, codedInputStream);
    }

    public static Parser<v0> parser() {
        return f65526h.getParserForType();
    }

    public static v0 q3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (v0) GeneratedMessageLite.parseFrom(f65526h, codedInputStream, extensionRegistryLite);
    }

    public static v0 r3(InputStream inputStream) throws IOException {
        return (v0) GeneratedMessageLite.parseFrom(f65526h, inputStream);
    }

    public static v0 s3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (v0) GeneratedMessageLite.parseFrom(f65526h, inputStream, extensionRegistryLite);
    }

    public static v0 t3(byte[] bArr) throws InvalidProtocolBufferException {
        return (v0) GeneratedMessageLite.parseFrom(f65526h, bArr);
    }

    public static v0 u3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (v0) GeneratedMessageLite.parseFrom(f65526h, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v3(c.a aVar) {
        this.f65529c = aVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w3(c cVar) {
        Objects.requireNonNull(cVar);
        this.f65529c = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3(int i4) {
        this.f65528b = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3(String str) {
        Objects.requireNonNull(str);
        this.f65530d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65530d = byteString.toStringUtf8();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65531a[methodToInvoke.ordinal()]) {
            case 1:
                return new v0();
            case 2:
                return f65526h;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                v0 v0Var = (v0) obj2;
                int i4 = this.f65528b;
                boolean z4 = i4 != 0;
                int i5 = v0Var.f65528b;
                this.f65528b = visitor.visitInt(z4, i4, i5 != 0, i5);
                this.f65529c = (c) visitor.visitMessage(this.f65529c, v0Var.f65529c);
                this.f65530d = visitor.visitString(!this.f65530d.isEmpty(), this.f65530d, !v0Var.f65530d.isEmpty(), v0Var.f65530d);
                GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!r0) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f65528b = codedInputStream.readInt32();
                            } else if (readTag == 18) {
                                c cVar = this.f65529c;
                                c.a builder = cVar != null ? cVar.toBuilder() : null;
                                c cVar2 = (c) codedInputStream.readMessage(c.parser(), extensionRegistryLite);
                                this.f65529c = cVar2;
                                if (builder != null) {
                                    builder.mergeFrom((c.a) cVar2);
                                    this.f65529c = builder.buildPartial();
                                }
                            } else if (readTag != 26) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f65530d = codedInputStream.readStringRequireUtf8();
                            }
                        }
                        r0 = true;
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
                if (f65527i == null) {
                    synchronized (v0.class) {
                        if (f65527i == null) {
                            f65527i = new GeneratedMessageLite.DefaultInstanceBasedParser(f65526h);
                        }
                    }
                }
                return f65527i;
            default:
                throw new UnsupportedOperationException();
        }
        return f65526h;
    }

    @Override // com.wufan.user.service.protobuf.w0
    public c getData() {
        c cVar = this.f65529c;
        return cVar == null ? c.f3() : cVar;
    }

    @Override // com.wufan.user.service.protobuf.w0
    public int getError() {
        return this.f65528b;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int i5 = this.f65528b;
        int computeInt32Size = i5 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i5) : 0;
        if (this.f65529c != null) {
            computeInt32Size += CodedOutputStream.computeMessageSize(2, getData());
        }
        if (!this.f65530d.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(3, k());
        }
        this.memoizedSerializedSize = computeInt32Size;
        return computeInt32Size;
    }

    @Override // com.wufan.user.service.protobuf.w0
    public ByteString j() {
        return ByteString.copyFromUtf8(this.f65530d);
    }

    @Override // com.wufan.user.service.protobuf.w0
    public String k() {
        return this.f65530d;
    }

    @Override // com.wufan.user.service.protobuf.w0
    public boolean m() {
        return this.f65529c != null;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i4 = this.f65528b;
        if (i4 != 0) {
            codedOutputStream.writeInt32(1, i4);
        }
        if (this.f65529c != null) {
            codedOutputStream.writeMessage(2, getData());
        }
        if (this.f65530d.isEmpty()) {
            return;
        }
        codedOutputStream.writeString(3, k());
    }
}
