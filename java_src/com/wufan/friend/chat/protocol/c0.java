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
/* compiled from: GameInfo.java */
/* loaded from: classes6.dex */
public final class c0 extends GeneratedMessageLite<c0, b> implements d0 {

    /* renamed from: d  reason: collision with root package name */
    public static final int f64989d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f64990e = 2;

    /* renamed from: f  reason: collision with root package name */
    private static final c0 f64991f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile Parser<c0> f64992g;

    /* renamed from: b  reason: collision with root package name */
    private long f64993b;

    /* renamed from: c  reason: collision with root package name */
    private String f64994c = "";

    /* compiled from: GameInfo.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f64995a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f64995a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64995a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64995a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64995a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f64995a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f64995a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f64995a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f64995a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: GameInfo.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<c0, b> implements d0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.friend.chat.protocol.d0
        public ByteString S0() {
            return ((c0) this.instance).S0();
        }

        public b V2() {
            copyOnWrite();
            ((c0) this.instance).c3();
            return this;
        }

        public b W2(long j4) {
            copyOnWrite();
            ((c0) this.instance).q3(j4);
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((c0) this.instance).b3();
            return this;
        }

        public b X2(String str) {
            copyOnWrite();
            ((c0) this.instance).r3(str);
            return this;
        }

        public b Y2(ByteString byteString) {
            copyOnWrite();
            ((c0) this.instance).s3(byteString);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.d0
        public String getName() {
            return ((c0) this.instance).getName();
        }

        @Override // com.wufan.friend.chat.protocol.d0
        public long m1() {
            return ((c0) this.instance).m1();
        }

        private b() {
            super(c0.f64991f);
        }
    }

    static {
        c0 c0Var = new c0();
        f64991f = c0Var;
        c0Var.makeImmutable();
    }

    private c0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b3() {
        this.f64993b = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3() {
        this.f64994c = d3().getName();
    }

    public static c0 d3() {
        return f64991f;
    }

    public static b e3() {
        return f64991f.toBuilder();
    }

    public static b f3(c0 c0Var) {
        return f64991f.toBuilder().mergeFrom((b) c0Var);
    }

    public static c0 g3(InputStream inputStream) throws IOException {
        return (c0) GeneratedMessageLite.parseDelimitedFrom(f64991f, inputStream);
    }

    public static c0 h3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (c0) GeneratedMessageLite.parseDelimitedFrom(f64991f, inputStream, extensionRegistryLite);
    }

    public static c0 i3(ByteString byteString) throws InvalidProtocolBufferException {
        return (c0) GeneratedMessageLite.parseFrom(f64991f, byteString);
    }

    public static c0 j3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (c0) GeneratedMessageLite.parseFrom(f64991f, byteString, extensionRegistryLite);
    }

    public static c0 k3(CodedInputStream codedInputStream) throws IOException {
        return (c0) GeneratedMessageLite.parseFrom(f64991f, codedInputStream);
    }

    public static c0 l3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (c0) GeneratedMessageLite.parseFrom(f64991f, codedInputStream, extensionRegistryLite);
    }

    public static c0 m3(InputStream inputStream) throws IOException {
        return (c0) GeneratedMessageLite.parseFrom(f64991f, inputStream);
    }

    public static c0 n3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (c0) GeneratedMessageLite.parseFrom(f64991f, inputStream, extensionRegistryLite);
    }

    public static c0 o3(byte[] bArr) throws InvalidProtocolBufferException {
        return (c0) GeneratedMessageLite.parseFrom(f64991f, bArr);
    }

    public static c0 p3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (c0) GeneratedMessageLite.parseFrom(f64991f, bArr, extensionRegistryLite);
    }

    public static Parser<c0> parser() {
        return f64991f.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q3(long j4) {
        this.f64993b = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3(String str) {
        Objects.requireNonNull(str);
        this.f64994c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f64994c = byteString.toStringUtf8();
    }

    @Override // com.wufan.friend.chat.protocol.d0
    public ByteString S0() {
        return ByteString.copyFromUtf8(this.f64994c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z4 = false;
        switch (a.f64995a[methodToInvoke.ordinal()]) {
            case 1:
                return new c0();
            case 2:
                return f64991f;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                c0 c0Var = (c0) obj2;
                long j4 = this.f64993b;
                boolean z5 = j4 != 0;
                long j5 = c0Var.f64993b;
                this.f64993b = visitor.visitLong(z5, j4, j5 != 0, j5);
                this.f64994c = visitor.visitString(!this.f64994c.isEmpty(), this.f64994c, !c0Var.f64994c.isEmpty(), c0Var.f64994c);
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
                                this.f64993b = codedInputStream.readInt64();
                            } else if (readTag != 18) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f64994c = codedInputStream.readStringRequireUtf8();
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
                if (f64992g == null) {
                    synchronized (c0.class) {
                        if (f64992g == null) {
                            f64992g = new GeneratedMessageLite.DefaultInstanceBasedParser(f64991f);
                        }
                    }
                }
                return f64992g;
            default:
                throw new UnsupportedOperationException();
        }
        return f64991f;
    }

    @Override // com.wufan.friend.chat.protocol.d0
    public String getName() {
        return this.f64994c;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        long j4 = this.f64993b;
        int computeInt64Size = j4 != 0 ? 0 + CodedOutputStream.computeInt64Size(1, j4) : 0;
        if (!this.f64994c.isEmpty()) {
            computeInt64Size += CodedOutputStream.computeStringSize(2, getName());
        }
        this.memoizedSerializedSize = computeInt64Size;
        return computeInt64Size;
    }

    @Override // com.wufan.friend.chat.protocol.d0
    public long m1() {
        return this.f64993b;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j4 = this.f64993b;
        if (j4 != 0) {
            codedOutputStream.writeInt64(1, j4);
        }
        if (this.f64994c.isEmpty()) {
            return;
        }
        codedOutputStream.writeString(2, getName());
    }
}
