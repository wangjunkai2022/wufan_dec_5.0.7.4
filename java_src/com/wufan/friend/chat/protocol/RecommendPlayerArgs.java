package com.wufan.friend.chat.protocol;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* loaded from: classes6.dex */
public final class RecommendPlayerArgs extends GeneratedMessageLite<RecommendPlayerArgs, b> implements k1 {

    /* renamed from: g  reason: collision with root package name */
    public static final int f64946g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f64947h = 2;

    /* renamed from: i  reason: collision with root package name */
    public static final int f64948i = 3;

    /* renamed from: j  reason: collision with root package name */
    public static final int f64949j = 4;

    /* renamed from: k  reason: collision with root package name */
    private static final RecommendPlayerArgs f64950k;

    /* renamed from: l  reason: collision with root package name */
    private static volatile Parser<RecommendPlayerArgs> f64951l;

    /* renamed from: b  reason: collision with root package name */
    private int f64952b;

    /* renamed from: c  reason: collision with root package name */
    private int f64953c;

    /* renamed from: d  reason: collision with root package name */
    private Internal.LongList f64954d = GeneratedMessageLite.emptyLongList();

    /* renamed from: e  reason: collision with root package name */
    private String f64955e = "";

    /* renamed from: f  reason: collision with root package name */
    private long f64956f;

    /* loaded from: classes6.dex */
    public enum FriendLocationPageType implements Internal.EnumLite {
        BATTLE_HOME_PAGE(0),
        BATTLE_ROOM_LIST(1),
        BATTLE_ROOM(2),
        GAME_HOME_PAGE(3),
        UNRECOGNIZED(-1);
        
        public static final int BATTLE_HOME_PAGE_VALUE = 0;
        public static final int BATTLE_ROOM_LIST_VALUE = 1;
        public static final int BATTLE_ROOM_VALUE = 2;
        public static final int GAME_HOME_PAGE_VALUE = 3;
        private static final Internal.EnumLiteMap<FriendLocationPageType> internalValueMap = new a();
        private final int value;

        /* loaded from: classes6.dex */
        class a implements Internal.EnumLiteMap<FriendLocationPageType> {
            a() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a */
            public FriendLocationPageType findValueByNumber(int i4) {
                return FriendLocationPageType.forNumber(i4);
            }
        }

        FriendLocationPageType(int i4) {
            this.value = i4;
        }

        public static FriendLocationPageType forNumber(int i4) {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            return null;
                        }
                        return GAME_HOME_PAGE;
                    }
                    return BATTLE_ROOM;
                }
                return BATTLE_ROOM_LIST;
            }
            return BATTLE_HOME_PAGE;
        }

        public static Internal.EnumLiteMap<FriendLocationPageType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static FriendLocationPageType valueOf(int i4) {
            return forNumber(i4);
        }
    }

    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f64957a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f64957a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64957a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64957a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64957a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f64957a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f64957a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f64957a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f64957a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<RecommendPlayerArgs, b> implements k1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.friend.chat.protocol.k1
        public long A0(int i4) {
            return ((RecommendPlayerArgs) this.instance).A0(i4);
        }

        @Override // com.wufan.friend.chat.protocol.k1
        public FriendLocationPageType F0() {
            return ((RecommendPlayerArgs) this.instance).F0();
        }

        public b V2(long j4) {
            copyOnWrite();
            ((RecommendPlayerArgs) this.instance).j3(j4);
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((RecommendPlayerArgs) this.instance).clearGameId();
            return this;
        }

        public b X0(Iterable<? extends Long> iterable) {
            copyOnWrite();
            ((RecommendPlayerArgs) this.instance).i3(iterable);
            return this;
        }

        public b X2() {
            copyOnWrite();
            ((RecommendPlayerArgs) this.instance).k3();
            return this;
        }

        public b Y2() {
            copyOnWrite();
            ((RecommendPlayerArgs) this.instance).l3();
            return this;
        }

        public b Z2() {
            copyOnWrite();
            ((RecommendPlayerArgs) this.instance).m3();
            return this;
        }

        public b a3(long j4) {
            copyOnWrite();
            ((RecommendPlayerArgs) this.instance).setGameId(j4);
            return this;
        }

        public b b3(String str) {
            copyOnWrite();
            ((RecommendPlayerArgs) this.instance).B3(str);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.k1
        public ByteString c1() {
            return ((RecommendPlayerArgs) this.instance).c1();
        }

        public b c3(ByteString byteString) {
            copyOnWrite();
            ((RecommendPlayerArgs) this.instance).C3(byteString);
            return this;
        }

        public b d3(int i4, long j4) {
            copyOnWrite();
            ((RecommendPlayerArgs) this.instance).D3(i4, j4);
            return this;
        }

        public b e3(FriendLocationPageType friendLocationPageType) {
            copyOnWrite();
            ((RecommendPlayerArgs) this.instance).E3(friendLocationPageType);
            return this;
        }

        public b f3(int i4) {
            copyOnWrite();
            ((RecommendPlayerArgs) this.instance).F3(i4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.k1
        public long getGameId() {
            return ((RecommendPlayerArgs) this.instance).getGameId();
        }

        @Override // com.wufan.friend.chat.protocol.k1
        public int k0() {
            return ((RecommendPlayerArgs) this.instance).k0();
        }

        @Override // com.wufan.friend.chat.protocol.k1
        public int q1() {
            return ((RecommendPlayerArgs) this.instance).q1();
        }

        @Override // com.wufan.friend.chat.protocol.k1
        public List<Long> u1() {
            return Collections.unmodifiableList(((RecommendPlayerArgs) this.instance).u1());
        }

        @Override // com.wufan.friend.chat.protocol.k1
        public String w0() {
            return ((RecommendPlayerArgs) this.instance).w0();
        }

        private b() {
            super(RecommendPlayerArgs.f64950k);
        }
    }

    static {
        RecommendPlayerArgs recommendPlayerArgs = new RecommendPlayerArgs();
        f64950k = recommendPlayerArgs;
        recommendPlayerArgs.makeImmutable();
    }

    private RecommendPlayerArgs() {
    }

    public static RecommendPlayerArgs A3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendPlayerArgs) GeneratedMessageLite.parseFrom(f64950k, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3(String str) {
        Objects.requireNonNull(str);
        this.f64955e = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f64955e = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D3(int i4, long j4) {
        n3();
        this.f64954d.setLong(i4, j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E3(FriendLocationPageType friendLocationPageType) {
        Objects.requireNonNull(friendLocationPageType);
        this.f64953c = friendLocationPageType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F3(int i4) {
        this.f64953c = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGameId() {
        this.f64956f = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3(Iterable<? extends Long> iterable) {
        n3();
        AbstractMessageLite.addAll(iterable, this.f64954d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3(long j4) {
        n3();
        this.f64954d.addLong(j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3() {
        this.f64955e = o3().w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3() {
        this.f64954d = GeneratedMessageLite.emptyLongList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m3() {
        this.f64953c = 0;
    }

    private void n3() {
        if (this.f64954d.isModifiable()) {
            return;
        }
        this.f64954d = GeneratedMessageLite.mutableCopy(this.f64954d);
    }

    public static RecommendPlayerArgs o3() {
        return f64950k;
    }

    public static b p3() {
        return f64950k.toBuilder();
    }

    public static Parser<RecommendPlayerArgs> parser() {
        return f64950k.getParserForType();
    }

    public static b q3(RecommendPlayerArgs recommendPlayerArgs) {
        return f64950k.toBuilder().mergeFrom((b) recommendPlayerArgs);
    }

    public static RecommendPlayerArgs r3(InputStream inputStream) throws IOException {
        return (RecommendPlayerArgs) GeneratedMessageLite.parseDelimitedFrom(f64950k, inputStream);
    }

    public static RecommendPlayerArgs s3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendPlayerArgs) GeneratedMessageLite.parseDelimitedFrom(f64950k, inputStream, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameId(long j4) {
        this.f64956f = j4;
    }

    public static RecommendPlayerArgs t3(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendPlayerArgs) GeneratedMessageLite.parseFrom(f64950k, byteString);
    }

    public static RecommendPlayerArgs u3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendPlayerArgs) GeneratedMessageLite.parseFrom(f64950k, byteString, extensionRegistryLite);
    }

    public static RecommendPlayerArgs v3(CodedInputStream codedInputStream) throws IOException {
        return (RecommendPlayerArgs) GeneratedMessageLite.parseFrom(f64950k, codedInputStream);
    }

    public static RecommendPlayerArgs w3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendPlayerArgs) GeneratedMessageLite.parseFrom(f64950k, codedInputStream, extensionRegistryLite);
    }

    public static RecommendPlayerArgs x3(InputStream inputStream) throws IOException {
        return (RecommendPlayerArgs) GeneratedMessageLite.parseFrom(f64950k, inputStream);
    }

    public static RecommendPlayerArgs y3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendPlayerArgs) GeneratedMessageLite.parseFrom(f64950k, inputStream, extensionRegistryLite);
    }

    public static RecommendPlayerArgs z3(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendPlayerArgs) GeneratedMessageLite.parseFrom(f64950k, bArr);
    }

    @Override // com.wufan.friend.chat.protocol.k1
    public long A0(int i4) {
        return this.f64954d.getLong(i4);
    }

    @Override // com.wufan.friend.chat.protocol.k1
    public FriendLocationPageType F0() {
        FriendLocationPageType forNumber = FriendLocationPageType.forNumber(this.f64953c);
        return forNumber == null ? FriendLocationPageType.UNRECOGNIZED : forNumber;
    }

    @Override // com.wufan.friend.chat.protocol.k1
    public ByteString c1() {
        return ByteString.copyFromUtf8(this.f64955e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z4 = false;
        switch (a.f64957a[methodToInvoke.ordinal()]) {
            case 1:
                return new RecommendPlayerArgs();
            case 2:
                return f64950k;
            case 3:
                this.f64954d.makeImmutable();
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                RecommendPlayerArgs recommendPlayerArgs = (RecommendPlayerArgs) obj2;
                int i4 = this.f64953c;
                boolean z5 = i4 != 0;
                int i5 = recommendPlayerArgs.f64953c;
                this.f64953c = visitor.visitInt(z5, i4, i5 != 0, i5);
                this.f64954d = visitor.visitLongList(this.f64954d, recommendPlayerArgs.f64954d);
                this.f64955e = visitor.visitString(!this.f64955e.isEmpty(), this.f64955e, !recommendPlayerArgs.f64955e.isEmpty(), recommendPlayerArgs.f64955e);
                long j4 = this.f64956f;
                boolean z6 = j4 != 0;
                long j5 = recommendPlayerArgs.f64956f;
                this.f64956f = visitor.visitLong(z6, j4, j5 != 0, j5);
                if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                    this.f64952b |= recommendPlayerArgs.f64952b;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z4) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f64953c = codedInputStream.readEnum();
                            } else if (readTag == 16) {
                                if (!this.f64954d.isModifiable()) {
                                    this.f64954d = GeneratedMessageLite.mutableCopy(this.f64954d);
                                }
                                this.f64954d.addLong(codedInputStream.readInt64());
                            } else if (readTag == 18) {
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if (!this.f64954d.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f64954d = GeneratedMessageLite.mutableCopy(this.f64954d);
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f64954d.addLong(codedInputStream.readInt64());
                                }
                                codedInputStream.popLimit(pushLimit);
                            } else if (readTag == 26) {
                                this.f64955e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag != 32) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f64956f = codedInputStream.readInt64();
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
                if (f64951l == null) {
                    synchronized (RecommendPlayerArgs.class) {
                        if (f64951l == null) {
                            f64951l = new GeneratedMessageLite.DefaultInstanceBasedParser(f64950k);
                        }
                    }
                }
                return f64951l;
            default:
                throw new UnsupportedOperationException();
        }
        return f64950k;
    }

    @Override // com.wufan.friend.chat.protocol.k1
    public long getGameId() {
        return this.f64956f;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int computeEnumSize = this.f64953c != FriendLocationPageType.BATTLE_HOME_PAGE.getNumber() ? CodedOutputStream.computeEnumSize(1, this.f64953c) + 0 : 0;
        int i5 = 0;
        for (int i6 = 0; i6 < this.f64954d.size(); i6++) {
            i5 += CodedOutputStream.computeInt64SizeNoTag(this.f64954d.getLong(i6));
        }
        int size = computeEnumSize + i5 + (u1().size() * 1);
        if (!this.f64955e.isEmpty()) {
            size += CodedOutputStream.computeStringSize(3, w0());
        }
        long j4 = this.f64956f;
        if (j4 != 0) {
            size += CodedOutputStream.computeInt64Size(4, j4);
        }
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // com.wufan.friend.chat.protocol.k1
    public int k0() {
        return this.f64954d.size();
    }

    @Override // com.wufan.friend.chat.protocol.k1
    public int q1() {
        return this.f64953c;
    }

    @Override // com.wufan.friend.chat.protocol.k1
    public List<Long> u1() {
        return this.f64954d;
    }

    @Override // com.wufan.friend.chat.protocol.k1
    public String w0() {
        return this.f64955e;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if (this.f64953c != FriendLocationPageType.BATTLE_HOME_PAGE.getNumber()) {
            codedOutputStream.writeEnum(1, this.f64953c);
        }
        for (int i4 = 0; i4 < this.f64954d.size(); i4++) {
            codedOutputStream.writeInt64(2, this.f64954d.getLong(i4));
        }
        if (!this.f64955e.isEmpty()) {
            codedOutputStream.writeString(3, w0());
        }
        long j4 = this.f64956f;
        if (j4 != 0) {
            codedOutputStream.writeInt64(4, j4);
        }
    }
}
