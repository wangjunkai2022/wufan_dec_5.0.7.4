package com.wufan.friend.chat.protocol;

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
/* compiled from: AckArgs.java */
/* loaded from: classes6.dex */
public final class c extends GeneratedMessageLite<c, b> implements d {

    /* renamed from: e  reason: collision with root package name */
    public static final int f64980e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f64981f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f64982g = 3;

    /* renamed from: h  reason: collision with root package name */
    private static final c f64983h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile Parser<c> f64984i;

    /* renamed from: b  reason: collision with root package name */
    private long f64985b;

    /* renamed from: c  reason: collision with root package name */
    private long f64986c;

    /* renamed from: d  reason: collision with root package name */
    private String f64987d = "";

    /* compiled from: AckArgs.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f64988a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f64988a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64988a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64988a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64988a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f64988a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f64988a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f64988a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f64988a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: AckArgs.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<c, b> implements d {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.friend.chat.protocol.d
        public String K() {
            return ((c) this.instance).K();
        }

        @Override // com.wufan.friend.chat.protocol.d
        public ByteString N() {
            return ((c) this.instance).N();
        }

        @Override // com.wufan.friend.chat.protocol.d
        public long O() {
            return ((c) this.instance).O();
        }

        @Override // com.wufan.friend.chat.protocol.d
        public long Q() {
            return ((c) this.instance).Q();
        }

        public b V2() {
            copyOnWrite();
            ((c) this.instance).e3();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((c) this.instance).f3();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((c) this.instance).d3();
            return this;
        }

        public b X2(String str) {
            copyOnWrite();
            ((c) this.instance).t3(str);
            return this;
        }

        public b Y2(ByteString byteString) {
            copyOnWrite();
            ((c) this.instance).u3(byteString);
            return this;
        }

        public b Z2(long j4) {
            copyOnWrite();
            ((c) this.instance).v3(j4);
            return this;
        }

        public b a3(long j4) {
            copyOnWrite();
            ((c) this.instance).w3(j4);
            return this;
        }

        private b() {
            super(c.f64983h);
        }
    }

    static {
        c cVar = new c();
        f64983h = cVar;
        cVar.makeImmutable();
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d3() {
        this.f64987d = g3().K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e3() {
        this.f64985b = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f3() {
        this.f64986c = 0L;
    }

    public static c g3() {
        return f64983h;
    }

    public static b h3() {
        return f64983h.toBuilder();
    }

    public static b i3(c cVar) {
        return f64983h.toBuilder().mergeFrom((b) cVar);
    }

    public static c j3(InputStream inputStream) throws IOException {
        return (c) GeneratedMessageLite.parseDelimitedFrom(f64983h, inputStream);
    }

    public static c k3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (c) GeneratedMessageLite.parseDelimitedFrom(f64983h, inputStream, extensionRegistryLite);
    }

    public static c l3(ByteString byteString) throws InvalidProtocolBufferException {
        return (c) GeneratedMessageLite.parseFrom(f64983h, byteString);
    }

    public static c m3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (c) GeneratedMessageLite.parseFrom(f64983h, byteString, extensionRegistryLite);
    }

    public static c n3(CodedInputStream codedInputStream) throws IOException {
        return (c) GeneratedMessageLite.parseFrom(f64983h, codedInputStream);
    }

    public static c o3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (c) GeneratedMessageLite.parseFrom(f64983h, codedInputStream, extensionRegistryLite);
    }

    public static c p3(InputStream inputStream) throws IOException {
        return (c) GeneratedMessageLite.parseFrom(f64983h, inputStream);
    }

    public static Parser<c> parser() {
        return f64983h.getParserForType();
    }

    public static c q3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (c) GeneratedMessageLite.parseFrom(f64983h, inputStream, extensionRegistryLite);
    }

    public static c r3(byte[] bArr) throws InvalidProtocolBufferException {
        return (c) GeneratedMessageLite.parseFrom(f64983h, bArr);
    }

    public static c s3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (c) GeneratedMessageLite.parseFrom(f64983h, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t3(String str) {
        Objects.requireNonNull(str);
        this.f64987d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f64987d = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v3(long j4) {
        this.f64985b = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w3(long j4) {
        this.f64986c = j4;
    }

    @Override // com.wufan.friend.chat.protocol.d
    public String K() {
        return this.f64987d;
    }

    @Override // com.wufan.friend.chat.protocol.d
    public ByteString N() {
        return ByteString.copyFromUtf8(this.f64987d);
    }

    @Override // com.wufan.friend.chat.protocol.d
    public long O() {
        return this.f64986c;
    }

    @Override // com.wufan.friend.chat.protocol.d
    public long Q() {
        return this.f64985b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z4 = false;
        switch (a.f64988a[methodToInvoke.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return f64983h;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                c cVar = (c) obj2;
                long j4 = this.f64985b;
                boolean z5 = j4 != 0;
                long j5 = cVar.f64985b;
                this.f64985b = visitor.visitLong(z5, j4, j5 != 0, j5);
                long j6 = this.f64986c;
                boolean z6 = j6 != 0;
                long j7 = cVar.f64986c;
                this.f64986c = visitor.visitLong(z6, j6, j7 != 0, j7);
                this.f64987d = visitor.visitString(!this.f64987d.isEmpty(), this.f64987d, !cVar.f64987d.isEmpty(), cVar.f64987d);
                GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z4) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f64985b = codedInputStream.readInt64();
                            } else if (readTag == 16) {
                                this.f64986c = codedInputStream.readInt64();
                            } else if (readTag != 26) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f64987d = codedInputStream.readStringRequireUtf8();
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
                if (f64984i == null) {
                    synchronized (c.class) {
                        if (f64984i == null) {
                            f64984i = new GeneratedMessageLite.DefaultInstanceBasedParser(f64983h);
                        }
                    }
                }
                return f64984i;
            default:
                throw new UnsupportedOperationException();
        }
        return f64983h;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        long j4 = this.f64985b;
        int computeInt64Size = j4 != 0 ? 0 + CodedOutputStream.computeInt64Size(1, j4) : 0;
        long j5 = this.f64986c;
        if (j5 != 0) {
            computeInt64Size += CodedOutputStream.computeInt64Size(2, j5);
        }
        if (!this.f64987d.isEmpty()) {
            computeInt64Size += CodedOutputStream.computeStringSize(3, K());
        }
        this.memoizedSerializedSize = computeInt64Size;
        return computeInt64Size;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j4 = this.f64985b;
        if (j4 != 0) {
            codedOutputStream.writeInt64(1, j4);
        }
        long j5 = this.f64986c;
        if (j5 != 0) {
            codedOutputStream.writeInt64(2, j5);
        }
        if (this.f64987d.isEmpty()) {
            return;
        }
        codedOutputStream.writeString(3, K());
    }
}
