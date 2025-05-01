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
/* compiled from: ResponseStatusResult.java */
/* loaded from: classes6.dex */
public final class f0 extends GeneratedMessageLite<f0, b> implements g0 {

    /* renamed from: f  reason: collision with root package name */
    public static final int f65387f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f65388g = 2;

    /* renamed from: h  reason: collision with root package name */
    public static final int f65389h = 3;

    /* renamed from: i  reason: collision with root package name */
    public static final int f65390i = 4;

    /* renamed from: j  reason: collision with root package name */
    private static final f0 f65391j;

    /* renamed from: k  reason: collision with root package name */
    private static volatile Parser<f0> f65392k;

    /* renamed from: b  reason: collision with root package name */
    private int f65393b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f65394c;

    /* renamed from: d  reason: collision with root package name */
    private String f65395d = "";

    /* renamed from: e  reason: collision with root package name */
    private boolean f65396e;

    /* compiled from: ResponseStatusResult.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65397a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65397a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65397a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65397a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65397a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65397a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65397a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65397a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65397a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: ResponseStatusResult.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<f0, b> implements g0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.user.service.protobuf.g0
        public boolean M2() {
            return ((f0) this.instance).M2();
        }

        public b V2() {
            copyOnWrite();
            ((f0) this.instance).f3();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((f0) this.instance).g3();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((f0) this.instance).clearError();
            return this;
        }

        public b X2() {
            copyOnWrite();
            ((f0) this.instance).h3();
            return this;
        }

        public b Y2(int i4) {
            copyOnWrite();
            ((f0) this.instance).v3(i4);
            return this;
        }

        public b Z2(String str) {
            copyOnWrite();
            ((f0) this.instance).w3(str);
            return this;
        }

        public b a3(ByteString byteString) {
            copyOnWrite();
            ((f0) this.instance).x3(byteString);
            return this;
        }

        public b b3(boolean z4) {
            copyOnWrite();
            ((f0) this.instance).y3(z4);
            return this;
        }

        public b c3(boolean z4) {
            copyOnWrite();
            ((f0) this.instance).z3(z4);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.g0
        public int getError() {
            return ((f0) this.instance).getError();
        }

        @Override // com.wufan.user.service.protobuf.g0
        public boolean getStatus() {
            return ((f0) this.instance).getStatus();
        }

        @Override // com.wufan.user.service.protobuf.g0
        public ByteString j() {
            return ((f0) this.instance).j();
        }

        @Override // com.wufan.user.service.protobuf.g0
        public String k() {
            return ((f0) this.instance).k();
        }

        private b() {
            super(f0.f65391j);
        }
    }

    static {
        f0 f0Var = new f0();
        f65391j = f0Var;
        f0Var.makeImmutable();
    }

    private f0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearError() {
        this.f65393b = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f3() {
        this.f65395d = i3().k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g3() {
        this.f65396e = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3() {
        this.f65394c = false;
    }

    public static f0 i3() {
        return f65391j;
    }

    public static b j3() {
        return f65391j.toBuilder();
    }

    public static b k3(f0 f0Var) {
        return f65391j.toBuilder().mergeFrom((b) f0Var);
    }

    public static f0 l3(InputStream inputStream) throws IOException {
        return (f0) GeneratedMessageLite.parseDelimitedFrom(f65391j, inputStream);
    }

    public static f0 m3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (f0) GeneratedMessageLite.parseDelimitedFrom(f65391j, inputStream, extensionRegistryLite);
    }

    public static f0 n3(ByteString byteString) throws InvalidProtocolBufferException {
        return (f0) GeneratedMessageLite.parseFrom(f65391j, byteString);
    }

    public static f0 o3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (f0) GeneratedMessageLite.parseFrom(f65391j, byteString, extensionRegistryLite);
    }

    public static f0 p3(CodedInputStream codedInputStream) throws IOException {
        return (f0) GeneratedMessageLite.parseFrom(f65391j, codedInputStream);
    }

    public static Parser<f0> parser() {
        return f65391j.getParserForType();
    }

    public static f0 q3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (f0) GeneratedMessageLite.parseFrom(f65391j, codedInputStream, extensionRegistryLite);
    }

    public static f0 r3(InputStream inputStream) throws IOException {
        return (f0) GeneratedMessageLite.parseFrom(f65391j, inputStream);
    }

    public static f0 s3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (f0) GeneratedMessageLite.parseFrom(f65391j, inputStream, extensionRegistryLite);
    }

    public static f0 t3(byte[] bArr) throws InvalidProtocolBufferException {
        return (f0) GeneratedMessageLite.parseFrom(f65391j, bArr);
    }

    public static f0 u3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (f0) GeneratedMessageLite.parseFrom(f65391j, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v3(int i4) {
        this.f65393b = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w3(String str) {
        Objects.requireNonNull(str);
        this.f65395d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65395d = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3(boolean z4) {
        this.f65396e = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(boolean z4) {
        this.f65394c = z4;
    }

    @Override // com.wufan.user.service.protobuf.g0
    public boolean M2() {
        return this.f65396e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65397a[methodToInvoke.ordinal()]) {
            case 1:
                return new f0();
            case 2:
                return f65391j;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                f0 f0Var = (f0) obj2;
                int i4 = this.f65393b;
                boolean z4 = i4 != 0;
                int i5 = f0Var.f65393b;
                this.f65393b = visitor.visitInt(z4, i4, i5 != 0, i5);
                boolean z5 = this.f65394c;
                boolean z6 = f0Var.f65394c;
                this.f65394c = visitor.visitBoolean(z5, z5, z6, z6);
                this.f65395d = visitor.visitString(!this.f65395d.isEmpty(), this.f65395d, !f0Var.f65395d.isEmpty(), f0Var.f65395d);
                boolean z7 = this.f65396e;
                boolean z8 = f0Var.f65396e;
                this.f65396e = visitor.visitBoolean(z7, z7, z8, z8);
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
                                    this.f65393b = codedInputStream.readInt32();
                                } else if (readTag == 16) {
                                    this.f65394c = codedInputStream.readBool();
                                } else if (readTag == 26) {
                                    this.f65395d = codedInputStream.readStringRequireUtf8();
                                } else if (readTag != 32) {
                                    if (!codedInputStream.skipField(readTag)) {
                                    }
                                } else {
                                    this.f65396e = codedInputStream.readBool();
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
                if (f65392k == null) {
                    synchronized (f0.class) {
                        if (f65392k == null) {
                            f65392k = new GeneratedMessageLite.DefaultInstanceBasedParser(f65391j);
                        }
                    }
                }
                return f65392k;
            default:
                throw new UnsupportedOperationException();
        }
        return f65391j;
    }

    @Override // com.wufan.user.service.protobuf.g0
    public int getError() {
        return this.f65393b;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int i5 = this.f65393b;
        int computeInt32Size = i5 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i5) : 0;
        boolean z4 = this.f65394c;
        if (z4) {
            computeInt32Size += CodedOutputStream.computeBoolSize(2, z4);
        }
        if (!this.f65395d.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(3, k());
        }
        boolean z5 = this.f65396e;
        if (z5) {
            computeInt32Size += CodedOutputStream.computeBoolSize(4, z5);
        }
        this.memoizedSerializedSize = computeInt32Size;
        return computeInt32Size;
    }

    @Override // com.wufan.user.service.protobuf.g0
    public boolean getStatus() {
        return this.f65394c;
    }

    @Override // com.wufan.user.service.protobuf.g0
    public ByteString j() {
        return ByteString.copyFromUtf8(this.f65395d);
    }

    @Override // com.wufan.user.service.protobuf.g0
    public String k() {
        return this.f65395d;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i4 = this.f65393b;
        if (i4 != 0) {
            codedOutputStream.writeInt32(1, i4);
        }
        boolean z4 = this.f65394c;
        if (z4) {
            codedOutputStream.writeBool(2, z4);
        }
        if (!this.f65395d.isEmpty()) {
            codedOutputStream.writeString(3, k());
        }
        boolean z5 = this.f65396e;
        if (z5) {
            codedOutputStream.writeBool(4, z5);
        }
    }
}
