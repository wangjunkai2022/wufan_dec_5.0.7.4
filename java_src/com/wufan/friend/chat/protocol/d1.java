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
/* compiled from: PlayState.java */
/* loaded from: classes6.dex */
public final class d1 extends GeneratedMessageLite<d1, b> implements e1 {

    /* renamed from: g  reason: collision with root package name */
    public static final int f64996g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f64997h = 2;

    /* renamed from: i  reason: collision with root package name */
    public static final int f64998i = 3;

    /* renamed from: j  reason: collision with root package name */
    public static final int f64999j = 4;

    /* renamed from: k  reason: collision with root package name */
    public static final int f65000k = 5;

    /* renamed from: l  reason: collision with root package name */
    private static final d1 f65001l;

    /* renamed from: m  reason: collision with root package name */
    private static volatile Parser<d1> f65002m;

    /* renamed from: b  reason: collision with root package name */
    private int f65003b;

    /* renamed from: c  reason: collision with root package name */
    private long f65004c;

    /* renamed from: d  reason: collision with root package name */
    private String f65005d = "";

    /* renamed from: e  reason: collision with root package name */
    private long f65006e;

    /* renamed from: f  reason: collision with root package name */
    private int f65007f;

    /* compiled from: PlayState.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65008a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65008a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65008a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65008a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65008a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65008a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65008a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65008a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65008a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: PlayState.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<d1, b> implements e1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b V2() {
            copyOnWrite();
            ((d1) this.instance).clearGameName();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((d1) this.instance).i3();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((d1) this.instance).clearGameId();
            return this;
        }

        public b X2() {
            copyOnWrite();
            ((d1) this.instance).j3();
            return this;
        }

        public b Y2() {
            copyOnWrite();
            ((d1) this.instance).clearRoomType();
            return this;
        }

        public b Z2(long j4) {
            copyOnWrite();
            ((d1) this.instance).setGameId(j4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.e1
        public PlayType a0() {
            return ((d1) this.instance).a0();
        }

        public b a3(String str) {
            copyOnWrite();
            ((d1) this.instance).setGameName(str);
            return this;
        }

        public b b3(ByteString byteString) {
            copyOnWrite();
            ((d1) this.instance).setGameNameBytes(byteString);
            return this;
        }

        public b c3(long j4) {
            copyOnWrite();
            ((d1) this.instance).x3(j4);
            return this;
        }

        public b d3(PlayType playType) {
            copyOnWrite();
            ((d1) this.instance).y3(playType);
            return this;
        }

        public b e3(int i4) {
            copyOnWrite();
            ((d1) this.instance).z3(i4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.e1
        public long f() {
            return ((d1) this.instance).f();
        }

        public b f3(int i4) {
            copyOnWrite();
            ((d1) this.instance).A3(i4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.e1
        public long getGameId() {
            return ((d1) this.instance).getGameId();
        }

        @Override // com.wufan.friend.chat.protocol.e1
        public String getGameName() {
            return ((d1) this.instance).getGameName();
        }

        @Override // com.wufan.friend.chat.protocol.e1
        public ByteString getGameNameBytes() {
            return ((d1) this.instance).getGameNameBytes();
        }

        @Override // com.wufan.friend.chat.protocol.e1
        public int getRoomType() {
            return ((d1) this.instance).getRoomType();
        }

        @Override // com.wufan.friend.chat.protocol.e1
        public int t0() {
            return ((d1) this.instance).t0();
        }

        private b() {
            super(d1.f65001l);
        }
    }

    static {
        d1 d1Var = new d1();
        f65001l = d1Var;
        d1Var.makeImmutable();
    }

    private d1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3(int i4) {
        this.f65007f = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGameId() {
        this.f65004c = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGameName() {
        this.f65005d = k3().getGameName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomType() {
        this.f65007f = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3() {
        this.f65006e = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3() {
        this.f65003b = 0;
    }

    public static d1 k3() {
        return f65001l;
    }

    public static b l3() {
        return f65001l.toBuilder();
    }

    public static b m3(d1 d1Var) {
        return f65001l.toBuilder().mergeFrom((b) d1Var);
    }

    public static d1 n3(InputStream inputStream) throws IOException {
        return (d1) GeneratedMessageLite.parseDelimitedFrom(f65001l, inputStream);
    }

    public static d1 o3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (d1) GeneratedMessageLite.parseDelimitedFrom(f65001l, inputStream, extensionRegistryLite);
    }

    public static d1 p3(ByteString byteString) throws InvalidProtocolBufferException {
        return (d1) GeneratedMessageLite.parseFrom(f65001l, byteString);
    }

    public static Parser<d1> parser() {
        return f65001l.getParserForType();
    }

    public static d1 q3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (d1) GeneratedMessageLite.parseFrom(f65001l, byteString, extensionRegistryLite);
    }

    public static d1 r3(CodedInputStream codedInputStream) throws IOException {
        return (d1) GeneratedMessageLite.parseFrom(f65001l, codedInputStream);
    }

    public static d1 s3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (d1) GeneratedMessageLite.parseFrom(f65001l, codedInputStream, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameId(long j4) {
        this.f65004c = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameName(String str) {
        Objects.requireNonNull(str);
        this.f65005d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameNameBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65005d = byteString.toStringUtf8();
    }

    public static d1 t3(InputStream inputStream) throws IOException {
        return (d1) GeneratedMessageLite.parseFrom(f65001l, inputStream);
    }

    public static d1 u3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (d1) GeneratedMessageLite.parseFrom(f65001l, inputStream, extensionRegistryLite);
    }

    public static d1 v3(byte[] bArr) throws InvalidProtocolBufferException {
        return (d1) GeneratedMessageLite.parseFrom(f65001l, bArr);
    }

    public static d1 w3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (d1) GeneratedMessageLite.parseFrom(f65001l, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3(long j4) {
        this.f65006e = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3(PlayType playType) {
        Objects.requireNonNull(playType);
        this.f65003b = playType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(int i4) {
        this.f65003b = i4;
    }

    @Override // com.wufan.friend.chat.protocol.e1
    public PlayType a0() {
        PlayType forNumber = PlayType.forNumber(this.f65003b);
        return forNumber == null ? PlayType.UNRECOGNIZED : forNumber;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65008a[methodToInvoke.ordinal()]) {
            case 1:
                return new d1();
            case 2:
                return f65001l;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                d1 d1Var = (d1) obj2;
                int i4 = this.f65003b;
                boolean z4 = i4 != 0;
                int i5 = d1Var.f65003b;
                this.f65003b = visitor.visitInt(z4, i4, i5 != 0, i5);
                long j4 = this.f65004c;
                boolean z5 = j4 != 0;
                long j5 = d1Var.f65004c;
                this.f65004c = visitor.visitLong(z5, j4, j5 != 0, j5);
                this.f65005d = visitor.visitString(!this.f65005d.isEmpty(), this.f65005d, !d1Var.f65005d.isEmpty(), d1Var.f65005d);
                long j6 = this.f65006e;
                boolean z6 = j6 != 0;
                long j7 = d1Var.f65006e;
                this.f65006e = visitor.visitLong(z6, j6, j7 != 0, j7);
                int i6 = this.f65007f;
                boolean z7 = i6 != 0;
                int i7 = d1Var.f65007f;
                this.f65007f = visitor.visitInt(z7, i6, i7 != 0, i7);
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
                                this.f65003b = codedInputStream.readEnum();
                            } else if (readTag == 16) {
                                this.f65004c = codedInputStream.readInt64();
                            } else if (readTag == 26) {
                                this.f65005d = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 32) {
                                this.f65006e = codedInputStream.readInt64();
                            } else if (readTag != 40) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f65007f = codedInputStream.readInt32();
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
                if (f65002m == null) {
                    synchronized (d1.class) {
                        if (f65002m == null) {
                            f65002m = new GeneratedMessageLite.DefaultInstanceBasedParser(f65001l);
                        }
                    }
                }
                return f65002m;
            default:
                throw new UnsupportedOperationException();
        }
        return f65001l;
    }

    @Override // com.wufan.friend.chat.protocol.e1
    public long f() {
        return this.f65006e;
    }

    @Override // com.wufan.friend.chat.protocol.e1
    public long getGameId() {
        return this.f65004c;
    }

    @Override // com.wufan.friend.chat.protocol.e1
    public String getGameName() {
        return this.f65005d;
    }

    @Override // com.wufan.friend.chat.protocol.e1
    public ByteString getGameNameBytes() {
        return ByteString.copyFromUtf8(this.f65005d);
    }

    @Override // com.wufan.friend.chat.protocol.e1
    public int getRoomType() {
        return this.f65007f;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int computeEnumSize = this.f65003b != PlayType.STAND.getNumber() ? 0 + CodedOutputStream.computeEnumSize(1, this.f65003b) : 0;
        long j4 = this.f65004c;
        if (j4 != 0) {
            computeEnumSize += CodedOutputStream.computeInt64Size(2, j4);
        }
        if (!this.f65005d.isEmpty()) {
            computeEnumSize += CodedOutputStream.computeStringSize(3, getGameName());
        }
        long j5 = this.f65006e;
        if (j5 != 0) {
            computeEnumSize += CodedOutputStream.computeInt64Size(4, j5);
        }
        int i5 = this.f65007f;
        if (i5 != 0) {
            computeEnumSize += CodedOutputStream.computeInt32Size(5, i5);
        }
        this.memoizedSerializedSize = computeEnumSize;
        return computeEnumSize;
    }

    @Override // com.wufan.friend.chat.protocol.e1
    public int t0() {
        return this.f65003b;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f65003b != PlayType.STAND.getNumber()) {
            codedOutputStream.writeEnum(1, this.f65003b);
        }
        long j4 = this.f65004c;
        if (j4 != 0) {
            codedOutputStream.writeInt64(2, j4);
        }
        if (!this.f65005d.isEmpty()) {
            codedOutputStream.writeString(3, getGameName());
        }
        long j5 = this.f65006e;
        if (j5 != 0) {
            codedOutputStream.writeInt64(4, j5);
        }
        int i4 = this.f65007f;
        if (i4 != 0) {
            codedOutputStream.writeInt32(5, i4);
        }
    }
}
