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
/* compiled from: GameInviteArgs.java */
/* loaded from: classes6.dex */
public final class e0 extends GeneratedMessageLite<e0, b> implements f0 {

    /* renamed from: h  reason: collision with root package name */
    public static final int f65019h = 1;

    /* renamed from: i  reason: collision with root package name */
    public static final int f65020i = 2;

    /* renamed from: j  reason: collision with root package name */
    public static final int f65021j = 3;

    /* renamed from: k  reason: collision with root package name */
    public static final int f65022k = 4;

    /* renamed from: l  reason: collision with root package name */
    public static final int f65023l = 5;

    /* renamed from: m  reason: collision with root package name */
    public static final int f65024m = 6;

    /* renamed from: n  reason: collision with root package name */
    private static final e0 f65025n;

    /* renamed from: o  reason: collision with root package name */
    private static volatile Parser<e0> f65026o;

    /* renamed from: b  reason: collision with root package name */
    private int f65027b;

    /* renamed from: c  reason: collision with root package name */
    private long f65028c;

    /* renamed from: d  reason: collision with root package name */
    private long f65029d;

    /* renamed from: e  reason: collision with root package name */
    private String f65030e = "";

    /* renamed from: f  reason: collision with root package name */
    private boolean f65031f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f65032g;

    /* compiled from: GameInviteArgs.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65033a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65033a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65033a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65033a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65033a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65033a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65033a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65033a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65033a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: GameInviteArgs.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<e0, b> implements f0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.friend.chat.protocol.f0
        public boolean A() {
            return ((e0) this.instance).A();
        }

        @Override // com.wufan.friend.chat.protocol.f0
        public boolean F() {
            return ((e0) this.instance).F();
        }

        @Override // com.wufan.friend.chat.protocol.f0
        public int H() {
            return ((e0) this.instance).H();
        }

        @Override // com.wufan.friend.chat.protocol.f0
        public ByteString L() {
            return ((e0) this.instance).L();
        }

        public b V2() {
            copyOnWrite();
            ((e0) this.instance).k3();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((e0) this.instance).clearGameId();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((e0) this.instance).j3();
            return this;
        }

        public b X2() {
            copyOnWrite();
            ((e0) this.instance).l3();
            return this;
        }

        public b Y2() {
            copyOnWrite();
            ((e0) this.instance).m3();
            return this;
        }

        public b Z2() {
            copyOnWrite();
            ((e0) this.instance).n3();
            return this;
        }

        public b a3(boolean z4) {
            copyOnWrite();
            ((e0) this.instance).B3(z4);
            return this;
        }

        public b b3(int i4) {
            copyOnWrite();
            ((e0) this.instance).C3(i4);
            return this;
        }

        public b c3(long j4) {
            copyOnWrite();
            ((e0) this.instance).setGameId(j4);
            return this;
        }

        public b d3(long j4) {
            copyOnWrite();
            ((e0) this.instance).D3(j4);
            return this;
        }

        public b e3(String str) {
            copyOnWrite();
            ((e0) this.instance).E3(str);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.f0
        public long f() {
            return ((e0) this.instance).f();
        }

        public b f3(ByteString byteString) {
            copyOnWrite();
            ((e0) this.instance).F3(byteString);
            return this;
        }

        public b g3(boolean z4) {
            copyOnWrite();
            ((e0) this.instance).G3(z4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.f0
        public long getGameId() {
            return ((e0) this.instance).getGameId();
        }

        @Override // com.wufan.friend.chat.protocol.f0
        public String w() {
            return ((e0) this.instance).w();
        }

        private b() {
            super(e0.f65025n);
        }
    }

    static {
        e0 e0Var = new e0();
        f65025n = e0Var;
        e0Var.makeImmutable();
    }

    private e0() {
    }

    public static e0 A3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (e0) GeneratedMessageLite.parseFrom(f65025n, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3(boolean z4) {
        this.f65031f = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3(int i4) {
        this.f65027b = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D3(long j4) {
        this.f65028c = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E3(String str) {
        Objects.requireNonNull(str);
        this.f65030e = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65030e = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G3(boolean z4) {
        this.f65032g = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGameId() {
        this.f65029d = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3() {
        this.f65031f = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3() {
        this.f65027b = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3() {
        this.f65028c = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m3() {
        this.f65030e = o3().w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n3() {
        this.f65032g = false;
    }

    public static e0 o3() {
        return f65025n;
    }

    public static b p3() {
        return f65025n.toBuilder();
    }

    public static Parser<e0> parser() {
        return f65025n.getParserForType();
    }

    public static b q3(e0 e0Var) {
        return f65025n.toBuilder().mergeFrom((b) e0Var);
    }

    public static e0 r3(InputStream inputStream) throws IOException {
        return (e0) GeneratedMessageLite.parseDelimitedFrom(f65025n, inputStream);
    }

    public static e0 s3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (e0) GeneratedMessageLite.parseDelimitedFrom(f65025n, inputStream, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameId(long j4) {
        this.f65029d = j4;
    }

    public static e0 t3(ByteString byteString) throws InvalidProtocolBufferException {
        return (e0) GeneratedMessageLite.parseFrom(f65025n, byteString);
    }

    public static e0 u3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (e0) GeneratedMessageLite.parseFrom(f65025n, byteString, extensionRegistryLite);
    }

    public static e0 v3(CodedInputStream codedInputStream) throws IOException {
        return (e0) GeneratedMessageLite.parseFrom(f65025n, codedInputStream);
    }

    public static e0 w3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (e0) GeneratedMessageLite.parseFrom(f65025n, codedInputStream, extensionRegistryLite);
    }

    public static e0 x3(InputStream inputStream) throws IOException {
        return (e0) GeneratedMessageLite.parseFrom(f65025n, inputStream);
    }

    public static e0 y3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (e0) GeneratedMessageLite.parseFrom(f65025n, inputStream, extensionRegistryLite);
    }

    public static e0 z3(byte[] bArr) throws InvalidProtocolBufferException {
        return (e0) GeneratedMessageLite.parseFrom(f65025n, bArr);
    }

    @Override // com.wufan.friend.chat.protocol.f0
    public boolean A() {
        return this.f65031f;
    }

    @Override // com.wufan.friend.chat.protocol.f0
    public boolean F() {
        return this.f65032g;
    }

    @Override // com.wufan.friend.chat.protocol.f0
    public int H() {
        return this.f65027b;
    }

    @Override // com.wufan.friend.chat.protocol.f0
    public ByteString L() {
        return ByteString.copyFromUtf8(this.f65030e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z4 = false;
        switch (a.f65033a[methodToInvoke.ordinal()]) {
            case 1:
                return new e0();
            case 2:
                return f65025n;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                e0 e0Var = (e0) obj2;
                int i4 = this.f65027b;
                boolean z5 = i4 != 0;
                int i5 = e0Var.f65027b;
                this.f65027b = visitor.visitInt(z5, i4, i5 != 0, i5);
                long j4 = this.f65028c;
                boolean z6 = j4 != 0;
                long j5 = e0Var.f65028c;
                this.f65028c = visitor.visitLong(z6, j4, j5 != 0, j5);
                long j6 = this.f65029d;
                boolean z7 = j6 != 0;
                long j7 = e0Var.f65029d;
                this.f65029d = visitor.visitLong(z7, j6, j7 != 0, j7);
                this.f65030e = visitor.visitString(!this.f65030e.isEmpty(), this.f65030e, !e0Var.f65030e.isEmpty(), e0Var.f65030e);
                boolean z8 = this.f65031f;
                boolean z9 = e0Var.f65031f;
                this.f65031f = visitor.visitBoolean(z8, z8, z9, z9);
                boolean z10 = this.f65032g;
                boolean z11 = e0Var.f65032g;
                this.f65032g = visitor.visitBoolean(z10, z10, z11, z11);
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
                                this.f65027b = codedInputStream.readInt32();
                            } else if (readTag == 16) {
                                this.f65028c = codedInputStream.readInt64();
                            } else if (readTag == 24) {
                                this.f65029d = codedInputStream.readInt64();
                            } else if (readTag == 34) {
                                this.f65030e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 40) {
                                this.f65031f = codedInputStream.readBool();
                            } else if (readTag != 48) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f65032g = codedInputStream.readBool();
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
                if (f65026o == null) {
                    synchronized (e0.class) {
                        if (f65026o == null) {
                            f65026o = new GeneratedMessageLite.DefaultInstanceBasedParser(f65025n);
                        }
                    }
                }
                return f65026o;
            default:
                throw new UnsupportedOperationException();
        }
        return f65025n;
    }

    @Override // com.wufan.friend.chat.protocol.f0
    public long f() {
        return this.f65028c;
    }

    @Override // com.wufan.friend.chat.protocol.f0
    public long getGameId() {
        return this.f65029d;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int i5 = this.f65027b;
        int computeInt32Size = i5 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i5) : 0;
        long j4 = this.f65028c;
        if (j4 != 0) {
            computeInt32Size += CodedOutputStream.computeInt64Size(2, j4);
        }
        long j5 = this.f65029d;
        if (j5 != 0) {
            computeInt32Size += CodedOutputStream.computeInt64Size(3, j5);
        }
        if (!this.f65030e.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(4, w());
        }
        boolean z4 = this.f65031f;
        if (z4) {
            computeInt32Size += CodedOutputStream.computeBoolSize(5, z4);
        }
        boolean z5 = this.f65032g;
        if (z5) {
            computeInt32Size += CodedOutputStream.computeBoolSize(6, z5);
        }
        this.memoizedSerializedSize = computeInt32Size;
        return computeInt32Size;
    }

    @Override // com.wufan.friend.chat.protocol.f0
    public String w() {
        return this.f65030e;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i4 = this.f65027b;
        if (i4 != 0) {
            codedOutputStream.writeInt32(1, i4);
        }
        long j4 = this.f65028c;
        if (j4 != 0) {
            codedOutputStream.writeInt64(2, j4);
        }
        long j5 = this.f65029d;
        if (j5 != 0) {
            codedOutputStream.writeInt64(3, j5);
        }
        if (!this.f65030e.isEmpty()) {
            codedOutputStream.writeString(4, w());
        }
        boolean z4 = this.f65031f;
        if (z4) {
            codedOutputStream.writeBool(5, z4);
        }
        boolean z5 = this.f65032g;
        if (z5) {
            codedOutputStream.writeBool(6, z5);
        }
    }
}
