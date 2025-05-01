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
/* compiled from: MemberInfo.java */
/* loaded from: classes6.dex */
public final class f extends GeneratedMessageLite<f, b> implements g {

    /* renamed from: g  reason: collision with root package name */
    public static final int f65374g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f65375h = 2;

    /* renamed from: i  reason: collision with root package name */
    public static final int f65376i = 3;

    /* renamed from: j  reason: collision with root package name */
    public static final int f65377j = 4;

    /* renamed from: k  reason: collision with root package name */
    public static final int f65378k = 5;

    /* renamed from: l  reason: collision with root package name */
    private static final f f65379l;

    /* renamed from: m  reason: collision with root package name */
    private static volatile Parser<f> f65380m;

    /* renamed from: b  reason: collision with root package name */
    private int f65381b;

    /* renamed from: c  reason: collision with root package name */
    private int f65382c;

    /* renamed from: d  reason: collision with root package name */
    private int f65383d;

    /* renamed from: e  reason: collision with root package name */
    private long f65384e;

    /* renamed from: f  reason: collision with root package name */
    private String f65385f = "";

    /* compiled from: MemberInfo.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65386a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65386a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65386a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65386a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65386a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65386a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65386a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65386a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65386a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: MemberInfo.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<f, b> implements g {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.user.service.protobuf.g
        public ByteString B() {
            return ((f) this.instance).B();
        }

        @Override // com.wufan.user.service.protobuf.g
        public String G() {
            return ((f) this.instance).G();
        }

        @Override // com.wufan.user.service.protobuf.g
        public int M() {
            return ((f) this.instance).M();
        }

        @Override // com.wufan.user.service.protobuf.g
        public int V1() {
            return ((f) this.instance).V1();
        }

        public b V2() {
            copyOnWrite();
            ((f) this.instance).i3();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((f) this.instance).clearUid();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((f) this.instance).h3();
            return this;
        }

        public b X2() {
            copyOnWrite();
            ((f) this.instance).j3();
            return this;
        }

        public b Y2() {
            copyOnWrite();
            ((f) this.instance).k3();
            return this;
        }

        public b Z2(String str) {
            copyOnWrite();
            ((f) this.instance).y3(str);
            return this;
        }

        public b a3(ByteString byteString) {
            copyOnWrite();
            ((f) this.instance).z3(byteString);
            return this;
        }

        public b b3(int i4) {
            copyOnWrite();
            ((f) this.instance).A3(i4);
            return this;
        }

        public b c3(int i4) {
            copyOnWrite();
            ((f) this.instance).setUid(i4);
            return this;
        }

        public b d3(long j4) {
            copyOnWrite();
            ((f) this.instance).B3(j4);
            return this;
        }

        public b e3(int i4) {
            copyOnWrite();
            ((f) this.instance).C3(i4);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.g
        public int getUid() {
            return ((f) this.instance).getUid();
        }

        @Override // com.wufan.user.service.protobuf.g
        public long y() {
            return ((f) this.instance).y();
        }

        private b() {
            super(f.f65379l);
        }
    }

    static {
        f fVar = new f();
        f65379l = fVar;
        fVar.makeImmutable();
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3(int i4) {
        this.f65383d = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3(long j4) {
        this.f65384e = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3(int i4) {
        this.f65382c = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUid() {
        this.f65381b = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3() {
        this.f65385f = l3().G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3() {
        this.f65383d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3() {
        this.f65384e = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3() {
        this.f65382c = 0;
    }

    public static f l3() {
        return f65379l;
    }

    public static b m3() {
        return f65379l.toBuilder();
    }

    public static b n3(f fVar) {
        return f65379l.toBuilder().mergeFrom((b) fVar);
    }

    public static f o3(InputStream inputStream) throws IOException {
        return (f) GeneratedMessageLite.parseDelimitedFrom(f65379l, inputStream);
    }

    public static f p3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (f) GeneratedMessageLite.parseDelimitedFrom(f65379l, inputStream, extensionRegistryLite);
    }

    public static Parser<f> parser() {
        return f65379l.getParserForType();
    }

    public static f q3(ByteString byteString) throws InvalidProtocolBufferException {
        return (f) GeneratedMessageLite.parseFrom(f65379l, byteString);
    }

    public static f r3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (f) GeneratedMessageLite.parseFrom(f65379l, byteString, extensionRegistryLite);
    }

    public static f s3(CodedInputStream codedInputStream) throws IOException {
        return (f) GeneratedMessageLite.parseFrom(f65379l, codedInputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUid(int i4) {
        this.f65381b = i4;
    }

    public static f t3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (f) GeneratedMessageLite.parseFrom(f65379l, codedInputStream, extensionRegistryLite);
    }

    public static f u3(InputStream inputStream) throws IOException {
        return (f) GeneratedMessageLite.parseFrom(f65379l, inputStream);
    }

    public static f v3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (f) GeneratedMessageLite.parseFrom(f65379l, inputStream, extensionRegistryLite);
    }

    public static f w3(byte[] bArr) throws InvalidProtocolBufferException {
        return (f) GeneratedMessageLite.parseFrom(f65379l, bArr);
    }

    public static f x3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (f) GeneratedMessageLite.parseFrom(f65379l, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3(String str) {
        Objects.requireNonNull(str);
        this.f65385f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65385f = byteString.toStringUtf8();
    }

    @Override // com.wufan.user.service.protobuf.g
    public ByteString B() {
        return ByteString.copyFromUtf8(this.f65385f);
    }

    @Override // com.wufan.user.service.protobuf.g
    public String G() {
        return this.f65385f;
    }

    @Override // com.wufan.user.service.protobuf.g
    public int M() {
        return this.f65382c;
    }

    @Override // com.wufan.user.service.protobuf.g
    public int V1() {
        return this.f65383d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z4 = false;
        switch (a.f65386a[methodToInvoke.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return f65379l;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                f fVar = (f) obj2;
                int i4 = this.f65381b;
                boolean z5 = i4 != 0;
                int i5 = fVar.f65381b;
                this.f65381b = visitor.visitInt(z5, i4, i5 != 0, i5);
                int i6 = this.f65382c;
                boolean z6 = i6 != 0;
                int i7 = fVar.f65382c;
                this.f65382c = visitor.visitInt(z6, i6, i7 != 0, i7);
                int i8 = this.f65383d;
                boolean z7 = i8 != 0;
                int i9 = fVar.f65383d;
                this.f65383d = visitor.visitInt(z7, i8, i9 != 0, i9);
                long j4 = this.f65384e;
                boolean z8 = j4 != 0;
                long j5 = fVar.f65384e;
                this.f65384e = visitor.visitLong(z8, j4, j5 != 0, j5);
                this.f65385f = visitor.visitString(!this.f65385f.isEmpty(), this.f65385f, !fVar.f65385f.isEmpty(), fVar.f65385f);
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
                                this.f65381b = codedInputStream.readInt32();
                            } else if (readTag == 16) {
                                this.f65382c = codedInputStream.readInt32();
                            } else if (readTag == 24) {
                                this.f65383d = codedInputStream.readInt32();
                            } else if (readTag == 32) {
                                this.f65384e = codedInputStream.readInt64();
                            } else if (readTag != 42) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f65385f = codedInputStream.readStringRequireUtf8();
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
                if (f65380m == null) {
                    synchronized (f.class) {
                        if (f65380m == null) {
                            f65380m = new GeneratedMessageLite.DefaultInstanceBasedParser(f65379l);
                        }
                    }
                }
                return f65380m;
            default:
                throw new UnsupportedOperationException();
        }
        return f65379l;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int i5 = this.f65381b;
        int computeInt32Size = i5 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i5) : 0;
        int i6 = this.f65382c;
        if (i6 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(2, i6);
        }
        int i7 = this.f65383d;
        if (i7 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(3, i7);
        }
        long j4 = this.f65384e;
        if (j4 != 0) {
            computeInt32Size += CodedOutputStream.computeInt64Size(4, j4);
        }
        if (!this.f65385f.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(5, G());
        }
        this.memoizedSerializedSize = computeInt32Size;
        return computeInt32Size;
    }

    @Override // com.wufan.user.service.protobuf.g
    public int getUid() {
        return this.f65381b;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i4 = this.f65381b;
        if (i4 != 0) {
            codedOutputStream.writeInt32(1, i4);
        }
        int i5 = this.f65382c;
        if (i5 != 0) {
            codedOutputStream.writeInt32(2, i5);
        }
        int i6 = this.f65383d;
        if (i6 != 0) {
            codedOutputStream.writeInt32(3, i6);
        }
        long j4 = this.f65384e;
        if (j4 != 0) {
            codedOutputStream.writeInt64(4, j4);
        }
        if (this.f65385f.isEmpty()) {
            return;
        }
        codedOutputStream.writeString(5, G());
    }

    @Override // com.wufan.user.service.protobuf.g
    public long y() {
        return this.f65384e;
    }
}
