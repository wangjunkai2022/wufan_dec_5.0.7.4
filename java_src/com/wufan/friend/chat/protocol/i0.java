package com.wufan.friend.chat.protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: GetLocalBattleGameArgs.java */
/* loaded from: classes6.dex */
public final class i0 extends GeneratedMessageLite<i0, b> implements j0 {

    /* renamed from: d  reason: collision with root package name */
    public static final int f65078d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f65079e = 2;

    /* renamed from: f  reason: collision with root package name */
    private static final i0 f65080f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile Parser<i0> f65081g;

    /* renamed from: b  reason: collision with root package name */
    private int f65082b;

    /* renamed from: c  reason: collision with root package name */
    private long f65083c;

    /* compiled from: GetLocalBattleGameArgs.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65084a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65084a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65084a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65084a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65084a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65084a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65084a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65084a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65084a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: GetLocalBattleGameArgs.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<i0, b> implements j0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b V2() {
            copyOnWrite();
            ((i0) this.instance).clearGameId();
            return this;
        }

        public b W2(int i4) {
            copyOnWrite();
            ((i0) this.instance).o3(i4);
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((i0) this.instance).a3();
            return this;
        }

        public b X2(long j4) {
            copyOnWrite();
            ((i0) this.instance).setGameId(j4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.j0
        public int d() {
            return ((i0) this.instance).d();
        }

        @Override // com.wufan.friend.chat.protocol.j0
        public long getGameId() {
            return ((i0) this.instance).getGameId();
        }

        private b() {
            super(i0.f65080f);
        }
    }

    static {
        i0 i0Var = new i0();
        f65080f = i0Var;
        i0Var.makeImmutable();
    }

    private i0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a3() {
        this.f65082b = 0;
    }

    public static i0 b3() {
        return f65080f;
    }

    public static b c3() {
        return f65080f.toBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGameId() {
        this.f65083c = 0L;
    }

    public static b d3(i0 i0Var) {
        return f65080f.toBuilder().mergeFrom((b) i0Var);
    }

    public static i0 e3(InputStream inputStream) throws IOException {
        return (i0) GeneratedMessageLite.parseDelimitedFrom(f65080f, inputStream);
    }

    public static i0 f3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (i0) GeneratedMessageLite.parseDelimitedFrom(f65080f, inputStream, extensionRegistryLite);
    }

    public static i0 g3(ByteString byteString) throws InvalidProtocolBufferException {
        return (i0) GeneratedMessageLite.parseFrom(f65080f, byteString);
    }

    public static i0 h3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (i0) GeneratedMessageLite.parseFrom(f65080f, byteString, extensionRegistryLite);
    }

    public static i0 i3(CodedInputStream codedInputStream) throws IOException {
        return (i0) GeneratedMessageLite.parseFrom(f65080f, codedInputStream);
    }

    public static i0 j3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (i0) GeneratedMessageLite.parseFrom(f65080f, codedInputStream, extensionRegistryLite);
    }

    public static i0 k3(InputStream inputStream) throws IOException {
        return (i0) GeneratedMessageLite.parseFrom(f65080f, inputStream);
    }

    public static i0 l3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (i0) GeneratedMessageLite.parseFrom(f65080f, inputStream, extensionRegistryLite);
    }

    public static i0 m3(byte[] bArr) throws InvalidProtocolBufferException {
        return (i0) GeneratedMessageLite.parseFrom(f65080f, bArr);
    }

    public static i0 n3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (i0) GeneratedMessageLite.parseFrom(f65080f, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o3(int i4) {
        this.f65082b = i4;
    }

    public static Parser<i0> parser() {
        return f65080f.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameId(long j4) {
        this.f65083c = j4;
    }

    @Override // com.wufan.friend.chat.protocol.j0
    public int d() {
        return this.f65082b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z4 = false;
        switch (a.f65084a[methodToInvoke.ordinal()]) {
            case 1:
                return new i0();
            case 2:
                return f65080f;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                i0 i0Var = (i0) obj2;
                int i4 = this.f65082b;
                boolean z5 = i4 != 0;
                int i5 = i0Var.f65082b;
                this.f65082b = visitor.visitInt(z5, i4, i5 != 0, i5);
                long j4 = this.f65083c;
                boolean z6 = j4 != 0;
                long j5 = i0Var.f65083c;
                this.f65083c = visitor.visitLong(z6, j4, j5 != 0, j5);
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
                                this.f65082b = codedInputStream.readInt32();
                            } else if (readTag != 16) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f65083c = codedInputStream.readInt64();
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
                if (f65081g == null) {
                    synchronized (i0.class) {
                        if (f65081g == null) {
                            f65081g = new GeneratedMessageLite.DefaultInstanceBasedParser(f65080f);
                        }
                    }
                }
                return f65081g;
            default:
                throw new UnsupportedOperationException();
        }
        return f65080f;
    }

    @Override // com.wufan.friend.chat.protocol.j0
    public long getGameId() {
        return this.f65083c;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int i5 = this.f65082b;
        int computeInt32Size = i5 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i5) : 0;
        long j4 = this.f65083c;
        if (j4 != 0) {
            computeInt32Size += CodedOutputStream.computeInt64Size(2, j4);
        }
        this.memoizedSerializedSize = computeInt32Size;
        return computeInt32Size;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i4 = this.f65082b;
        if (i4 != 0) {
            codedOutputStream.writeInt32(1, i4);
        }
        long j4 = this.f65083c;
        if (j4 != 0) {
            codedOutputStream.writeInt64(2, j4);
        }
    }
}
