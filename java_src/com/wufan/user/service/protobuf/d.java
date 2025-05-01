package com.wufan.user.service.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: GameListPermission.java */
/* loaded from: classes6.dex */
public final class d extends GeneratedMessageLite<d, b> implements e {

    /* renamed from: g  reason: collision with root package name */
    public static final int f65352g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f65353h = 2;

    /* renamed from: i  reason: collision with root package name */
    public static final int f65354i = 3;

    /* renamed from: j  reason: collision with root package name */
    public static final int f65355j = 4;

    /* renamed from: k  reason: collision with root package name */
    public static final int f65356k = 5;

    /* renamed from: l  reason: collision with root package name */
    private static final d f65357l;

    /* renamed from: m  reason: collision with root package name */
    private static volatile Parser<d> f65358m;

    /* renamed from: b  reason: collision with root package name */
    private long f65359b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f65360c;

    /* renamed from: d  reason: collision with root package name */
    private long f65361d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f65362e;

    /* renamed from: f  reason: collision with root package name */
    private long f65363f;

    /* compiled from: GameListPermission.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65364a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65364a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65364a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65364a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65364a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65364a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65364a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65364a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65364a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: GameListPermission.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<d, b> implements e {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.user.service.protobuf.e
        public boolean T() {
            return ((d) this.instance).T();
        }

        public b V2() {
            copyOnWrite();
            ((d) this.instance).clearGameId();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((d) this.instance).h3();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((d) this.instance).g3();
            return this;
        }

        public b X2() {
            copyOnWrite();
            ((d) this.instance).i3();
            return this;
        }

        public b Y2() {
            copyOnWrite();
            ((d) this.instance).j3();
            return this;
        }

        public b Z2(long j4) {
            copyOnWrite();
            ((d) this.instance).x3(j4);
            return this;
        }

        public b a3(long j4) {
            copyOnWrite();
            ((d) this.instance).setGameId(j4);
            return this;
        }

        public b b3(boolean z4) {
            copyOnWrite();
            ((d) this.instance).y3(z4);
            return this;
        }

        public b c3(boolean z4) {
            copyOnWrite();
            ((d) this.instance).z3(z4);
            return this;
        }

        public b d3(long j4) {
            copyOnWrite();
            ((d) this.instance).A3(j4);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.e
        public long getGameId() {
            return ((d) this.instance).getGameId();
        }

        @Override // com.wufan.user.service.protobuf.e
        public boolean p2() {
            return ((d) this.instance).p2();
        }

        @Override // com.wufan.user.service.protobuf.e
        public long t1() {
            return ((d) this.instance).t1();
        }

        @Override // com.wufan.user.service.protobuf.e
        public long y1() {
            return ((d) this.instance).y1();
        }

        private b() {
            super(d.f65357l);
        }
    }

    static {
        d dVar = new d();
        f65357l = dVar;
        dVar.makeImmutable();
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3(long j4) {
        this.f65361d = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGameId() {
        this.f65359b = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g3() {
        this.f65363f = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3() {
        this.f65362e = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3() {
        this.f65360c = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3() {
        this.f65361d = 0L;
    }

    public static d k3() {
        return f65357l;
    }

    public static b l3() {
        return f65357l.toBuilder();
    }

    public static b m3(d dVar) {
        return f65357l.toBuilder().mergeFrom((b) dVar);
    }

    public static d n3(InputStream inputStream) throws IOException {
        return (d) GeneratedMessageLite.parseDelimitedFrom(f65357l, inputStream);
    }

    public static d o3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (d) GeneratedMessageLite.parseDelimitedFrom(f65357l, inputStream, extensionRegistryLite);
    }

    public static d p3(ByteString byteString) throws InvalidProtocolBufferException {
        return (d) GeneratedMessageLite.parseFrom(f65357l, byteString);
    }

    public static Parser<d> parser() {
        return f65357l.getParserForType();
    }

    public static d q3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (d) GeneratedMessageLite.parseFrom(f65357l, byteString, extensionRegistryLite);
    }

    public static d r3(CodedInputStream codedInputStream) throws IOException {
        return (d) GeneratedMessageLite.parseFrom(f65357l, codedInputStream);
    }

    public static d s3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (d) GeneratedMessageLite.parseFrom(f65357l, codedInputStream, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameId(long j4) {
        this.f65359b = j4;
    }

    public static d t3(InputStream inputStream) throws IOException {
        return (d) GeneratedMessageLite.parseFrom(f65357l, inputStream);
    }

    public static d u3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (d) GeneratedMessageLite.parseFrom(f65357l, inputStream, extensionRegistryLite);
    }

    public static d v3(byte[] bArr) throws InvalidProtocolBufferException {
        return (d) GeneratedMessageLite.parseFrom(f65357l, bArr);
    }

    public static d w3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (d) GeneratedMessageLite.parseFrom(f65357l, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3(long j4) {
        this.f65363f = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3(boolean z4) {
        this.f65362e = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(boolean z4) {
        this.f65360c = z4;
    }

    @Override // com.wufan.user.service.protobuf.e
    public boolean T() {
        return this.f65360c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z4 = false;
        switch (a.f65364a[methodToInvoke.ordinal()]) {
            case 1:
                return new d();
            case 2:
                return f65357l;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                d dVar = (d) obj2;
                long j4 = this.f65359b;
                boolean z5 = j4 != 0;
                long j5 = dVar.f65359b;
                this.f65359b = visitor.visitLong(z5, j4, j5 != 0, j5);
                boolean z6 = this.f65360c;
                boolean z7 = dVar.f65360c;
                this.f65360c = visitor.visitBoolean(z6, z6, z7, z7);
                long j6 = this.f65361d;
                boolean z8 = j6 != 0;
                long j7 = dVar.f65361d;
                this.f65361d = visitor.visitLong(z8, j6, j7 != 0, j7);
                boolean z9 = this.f65362e;
                boolean z10 = dVar.f65362e;
                this.f65362e = visitor.visitBoolean(z9, z9, z10, z10);
                long j8 = this.f65363f;
                boolean z11 = j8 != 0;
                long j9 = dVar.f65363f;
                this.f65363f = visitor.visitLong(z11, j8, j9 != 0, j9);
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
                                this.f65359b = codedInputStream.readInt64();
                            } else if (readTag == 16) {
                                this.f65360c = codedInputStream.readBool();
                            } else if (readTag == 24) {
                                this.f65361d = codedInputStream.readInt64();
                            } else if (readTag == 32) {
                                this.f65362e = codedInputStream.readBool();
                            } else if (readTag != 40) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f65363f = codedInputStream.readInt64();
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
                if (f65358m == null) {
                    synchronized (d.class) {
                        if (f65358m == null) {
                            f65358m = new GeneratedMessageLite.DefaultInstanceBasedParser(f65357l);
                        }
                    }
                }
                return f65358m;
            default:
                throw new UnsupportedOperationException();
        }
        return f65357l;
    }

    @Override // com.wufan.user.service.protobuf.e
    public long getGameId() {
        return this.f65359b;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        long j4 = this.f65359b;
        int computeInt64Size = j4 != 0 ? 0 + CodedOutputStream.computeInt64Size(1, j4) : 0;
        boolean z4 = this.f65360c;
        if (z4) {
            computeInt64Size += CodedOutputStream.computeBoolSize(2, z4);
        }
        long j5 = this.f65361d;
        if (j5 != 0) {
            computeInt64Size += CodedOutputStream.computeInt64Size(3, j5);
        }
        boolean z5 = this.f65362e;
        if (z5) {
            computeInt64Size += CodedOutputStream.computeBoolSize(4, z5);
        }
        long j6 = this.f65363f;
        if (j6 != 0) {
            computeInt64Size += CodedOutputStream.computeInt64Size(5, j6);
        }
        this.memoizedSerializedSize = computeInt64Size;
        return computeInt64Size;
    }

    @Override // com.wufan.user.service.protobuf.e
    public boolean p2() {
        return this.f65362e;
    }

    @Override // com.wufan.user.service.protobuf.e
    public long t1() {
        return this.f65363f;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j4 = this.f65359b;
        if (j4 != 0) {
            codedOutputStream.writeInt64(1, j4);
        }
        boolean z4 = this.f65360c;
        if (z4) {
            codedOutputStream.writeBool(2, z4);
        }
        long j5 = this.f65361d;
        if (j5 != 0) {
            codedOutputStream.writeInt64(3, j5);
        }
        boolean z5 = this.f65362e;
        if (z5) {
            codedOutputStream.writeBool(4, z5);
        }
        long j6 = this.f65363f;
        if (j6 != 0) {
            codedOutputStream.writeInt64(5, j6);
        }
    }

    @Override // com.wufan.user.service.protobuf.e
    public long y1() {
        return this.f65361d;
    }
}
