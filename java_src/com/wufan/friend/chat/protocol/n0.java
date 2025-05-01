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
/* compiled from: LeaveRoomNotification.java */
/* loaded from: classes6.dex */
public final class n0 extends GeneratedMessageLite<n0, b> implements o0 {

    /* renamed from: d  reason: collision with root package name */
    public static final int f65130d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f65131e = 2;

    /* renamed from: f  reason: collision with root package name */
    private static final n0 f65132f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile Parser<n0> f65133g;

    /* renamed from: b  reason: collision with root package name */
    private int f65134b;

    /* renamed from: c  reason: collision with root package name */
    private long f65135c;

    /* compiled from: LeaveRoomNotification.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65136a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65136a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65136a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65136a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65136a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65136a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65136a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65136a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65136a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: LeaveRoomNotification.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<n0, b> implements o0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b V2() {
            copyOnWrite();
            ((n0) this.instance).b3();
            return this;
        }

        public b W2(int i4) {
            copyOnWrite();
            ((n0) this.instance).p3(i4);
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((n0) this.instance).a3();
            return this;
        }

        public b X2(long j4) {
            copyOnWrite();
            ((n0) this.instance).q3(j4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.o0
        public int d() {
            return ((n0) this.instance).d();
        }

        @Override // com.wufan.friend.chat.protocol.o0
        public long f() {
            return ((n0) this.instance).f();
        }

        private b() {
            super(n0.f65132f);
        }
    }

    static {
        n0 n0Var = new n0();
        f65132f = n0Var;
        n0Var.makeImmutable();
    }

    private n0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a3() {
        this.f65134b = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b3() {
        this.f65135c = 0L;
    }

    public static n0 c3() {
        return f65132f;
    }

    public static b d3() {
        return f65132f.toBuilder();
    }

    public static b e3(n0 n0Var) {
        return f65132f.toBuilder().mergeFrom((b) n0Var);
    }

    public static n0 f3(InputStream inputStream) throws IOException {
        return (n0) GeneratedMessageLite.parseDelimitedFrom(f65132f, inputStream);
    }

    public static n0 g3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (n0) GeneratedMessageLite.parseDelimitedFrom(f65132f, inputStream, extensionRegistryLite);
    }

    public static n0 h3(ByteString byteString) throws InvalidProtocolBufferException {
        return (n0) GeneratedMessageLite.parseFrom(f65132f, byteString);
    }

    public static n0 i3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (n0) GeneratedMessageLite.parseFrom(f65132f, byteString, extensionRegistryLite);
    }

    public static n0 j3(CodedInputStream codedInputStream) throws IOException {
        return (n0) GeneratedMessageLite.parseFrom(f65132f, codedInputStream);
    }

    public static n0 k3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (n0) GeneratedMessageLite.parseFrom(f65132f, codedInputStream, extensionRegistryLite);
    }

    public static n0 l3(InputStream inputStream) throws IOException {
        return (n0) GeneratedMessageLite.parseFrom(f65132f, inputStream);
    }

    public static n0 m3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (n0) GeneratedMessageLite.parseFrom(f65132f, inputStream, extensionRegistryLite);
    }

    public static n0 n3(byte[] bArr) throws InvalidProtocolBufferException {
        return (n0) GeneratedMessageLite.parseFrom(f65132f, bArr);
    }

    public static n0 o3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (n0) GeneratedMessageLite.parseFrom(f65132f, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p3(int i4) {
        this.f65134b = i4;
    }

    public static Parser<n0> parser() {
        return f65132f.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q3(long j4) {
        this.f65135c = j4;
    }

    @Override // com.wufan.friend.chat.protocol.o0
    public int d() {
        return this.f65134b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z4 = false;
        switch (a.f65136a[methodToInvoke.ordinal()]) {
            case 1:
                return new n0();
            case 2:
                return f65132f;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                n0 n0Var = (n0) obj2;
                int i4 = this.f65134b;
                boolean z5 = i4 != 0;
                int i5 = n0Var.f65134b;
                this.f65134b = visitor.visitInt(z5, i4, i5 != 0, i5);
                long j4 = this.f65135c;
                boolean z6 = j4 != 0;
                long j5 = n0Var.f65135c;
                this.f65135c = visitor.visitLong(z6, j4, j5 != 0, j5);
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
                                this.f65134b = codedInputStream.readInt32();
                            } else if (readTag != 16) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f65135c = codedInputStream.readInt64();
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
                if (f65133g == null) {
                    synchronized (n0.class) {
                        if (f65133g == null) {
                            f65133g = new GeneratedMessageLite.DefaultInstanceBasedParser(f65132f);
                        }
                    }
                }
                return f65133g;
            default:
                throw new UnsupportedOperationException();
        }
        return f65132f;
    }

    @Override // com.wufan.friend.chat.protocol.o0
    public long f() {
        return this.f65135c;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int i5 = this.f65134b;
        int computeInt32Size = i5 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i5) : 0;
        long j4 = this.f65135c;
        if (j4 != 0) {
            computeInt32Size += CodedOutputStream.computeInt64Size(2, j4);
        }
        this.memoizedSerializedSize = computeInt32Size;
        return computeInt32Size;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i4 = this.f65134b;
        if (i4 != 0) {
            codedOutputStream.writeInt32(1, i4);
        }
        long j4 = this.f65135c;
        if (j4 != 0) {
            codedOutputStream.writeInt64(2, j4);
        }
    }
}
