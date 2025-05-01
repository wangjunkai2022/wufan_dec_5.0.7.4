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
public final class PlayGameArgs extends GeneratedMessageLite<PlayGameArgs, b> implements c1 {

    /* renamed from: j  reason: collision with root package name */
    public static final int f64928j = 1;

    /* renamed from: k  reason: collision with root package name */
    public static final int f64929k = 2;

    /* renamed from: l  reason: collision with root package name */
    public static final int f64930l = 3;

    /* renamed from: m  reason: collision with root package name */
    public static final int f64931m = 4;

    /* renamed from: n  reason: collision with root package name */
    public static final int f64932n = 5;

    /* renamed from: o  reason: collision with root package name */
    public static final int f64933o = 6;

    /* renamed from: p  reason: collision with root package name */
    public static final int f64934p = 7;

    /* renamed from: q  reason: collision with root package name */
    private static final PlayGameArgs f64935q;

    /* renamed from: r  reason: collision with root package name */
    private static volatile Parser<PlayGameArgs> f64936r;

    /* renamed from: b  reason: collision with root package name */
    private int f64937b;

    /* renamed from: c  reason: collision with root package name */
    private int f64938c;

    /* renamed from: d  reason: collision with root package name */
    private long f64939d;

    /* renamed from: e  reason: collision with root package name */
    private int f64940e;

    /* renamed from: f  reason: collision with root package name */
    private long f64941f;

    /* renamed from: g  reason: collision with root package name */
    private int f64942g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f64943h;

    /* renamed from: i  reason: collision with root package name */
    private Internal.LongList f64944i = GeneratedMessageLite.emptyLongList();

    /* loaded from: classes6.dex */
    public enum State implements Internal.EnumLite {
        START(0),
        RUNNING(1),
        OVER(2),
        UNRECOGNIZED(-1);
        
        public static final int OVER_VALUE = 2;
        public static final int RUNNING_VALUE = 1;
        public static final int START_VALUE = 0;
        private static final Internal.EnumLiteMap<State> internalValueMap = new a();
        private final int value;

        /* loaded from: classes6.dex */
        class a implements Internal.EnumLiteMap<State> {
            a() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a */
            public State findValueByNumber(int i4) {
                return State.forNumber(i4);
            }
        }

        State(int i4) {
            this.value = i4;
        }

        public static State forNumber(int i4) {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        return null;
                    }
                    return OVER;
                }
                return RUNNING;
            }
            return START;
        }

        public static Internal.EnumLiteMap<State> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static State valueOf(int i4) {
            return forNumber(i4);
        }
    }

    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f64945a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f64945a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64945a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64945a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64945a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f64945a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f64945a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f64945a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f64945a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<PlayGameArgs, b> implements c1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.friend.chat.protocol.c1
        public boolean F() {
            return ((PlayGameArgs) this.instance).F();
        }

        @Override // com.wufan.friend.chat.protocol.c1
        public int Q1() {
            return ((PlayGameArgs) this.instance).Q1();
        }

        @Override // com.wufan.friend.chat.protocol.c1
        public List<Long> R2() {
            return Collections.unmodifiableList(((PlayGameArgs) this.instance).R2());
        }

        public b V2(long j4) {
            copyOnWrite();
            ((PlayGameArgs) this.instance).p3(j4);
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((PlayGameArgs) this.instance).q3();
            return this;
        }

        public b X0(Iterable<? extends Long> iterable) {
            copyOnWrite();
            ((PlayGameArgs) this.instance).o3(iterable);
            return this;
        }

        public b X2() {
            copyOnWrite();
            ((PlayGameArgs) this.instance).clearGameId();
            return this;
        }

        public b Y2() {
            copyOnWrite();
            ((PlayGameArgs) this.instance).r3();
            return this;
        }

        public b Z2() {
            copyOnWrite();
            ((PlayGameArgs) this.instance).s3();
            return this;
        }

        public b a3() {
            copyOnWrite();
            ((PlayGameArgs) this.instance).clearState();
            return this;
        }

        public b b3() {
            copyOnWrite();
            ((PlayGameArgs) this.instance).clearType();
            return this;
        }

        public b c3() {
            copyOnWrite();
            ((PlayGameArgs) this.instance).t3();
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.c1
        public int d() {
            return ((PlayGameArgs) this.instance).d();
        }

        public b d3(int i4) {
            copyOnWrite();
            ((PlayGameArgs) this.instance).I3(i4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.c1
        public long e2(int i4) {
            return ((PlayGameArgs) this.instance).e2(i4);
        }

        public b e3(long j4) {
            copyOnWrite();
            ((PlayGameArgs) this.instance).setGameId(j4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.c1
        public long f() {
            return ((PlayGameArgs) this.instance).f();
        }

        public b f3(long j4) {
            copyOnWrite();
            ((PlayGameArgs) this.instance).J3(j4);
            return this;
        }

        public b g3(int i4, long j4) {
            copyOnWrite();
            ((PlayGameArgs) this.instance).K3(i4, j4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.c1
        public long getGameId() {
            return ((PlayGameArgs) this.instance).getGameId();
        }

        @Override // com.wufan.friend.chat.protocol.c1
        public State getState() {
            return ((PlayGameArgs) this.instance).getState();
        }

        @Override // com.wufan.friend.chat.protocol.c1
        public int getStateValue() {
            return ((PlayGameArgs) this.instance).getStateValue();
        }

        @Override // com.wufan.friend.chat.protocol.c1
        public PlayType getType() {
            return ((PlayGameArgs) this.instance).getType();
        }

        @Override // com.wufan.friend.chat.protocol.c1
        public int getTypeValue() {
            return ((PlayGameArgs) this.instance).getTypeValue();
        }

        public b h3(State state) {
            copyOnWrite();
            ((PlayGameArgs) this.instance).L3(state);
            return this;
        }

        public b i3(int i4) {
            copyOnWrite();
            ((PlayGameArgs) this.instance).setStateValue(i4);
            return this;
        }

        public b j3(PlayType playType) {
            copyOnWrite();
            ((PlayGameArgs) this.instance).M3(playType);
            return this;
        }

        public b k3(int i4) {
            copyOnWrite();
            ((PlayGameArgs) this.instance).setTypeValue(i4);
            return this;
        }

        public b l3(boolean z4) {
            copyOnWrite();
            ((PlayGameArgs) this.instance).N3(z4);
            return this;
        }

        private b() {
            super(PlayGameArgs.f64935q);
        }
    }

    static {
        PlayGameArgs playGameArgs = new PlayGameArgs();
        f64935q = playGameArgs;
        playGameArgs.makeImmutable();
    }

    private PlayGameArgs() {
    }

    public static PlayGameArgs A3(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayGameArgs) GeneratedMessageLite.parseFrom(f64935q, byteString);
    }

    public static PlayGameArgs B3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayGameArgs) GeneratedMessageLite.parseFrom(f64935q, byteString, extensionRegistryLite);
    }

    public static PlayGameArgs C3(CodedInputStream codedInputStream) throws IOException {
        return (PlayGameArgs) GeneratedMessageLite.parseFrom(f64935q, codedInputStream);
    }

    public static PlayGameArgs D3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayGameArgs) GeneratedMessageLite.parseFrom(f64935q, codedInputStream, extensionRegistryLite);
    }

    public static PlayGameArgs E3(InputStream inputStream) throws IOException {
        return (PlayGameArgs) GeneratedMessageLite.parseFrom(f64935q, inputStream);
    }

    public static PlayGameArgs F3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayGameArgs) GeneratedMessageLite.parseFrom(f64935q, inputStream, extensionRegistryLite);
    }

    public static PlayGameArgs G3(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayGameArgs) GeneratedMessageLite.parseFrom(f64935q, bArr);
    }

    public static PlayGameArgs H3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayGameArgs) GeneratedMessageLite.parseFrom(f64935q, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I3(int i4) {
        this.f64942g = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J3(long j4) {
        this.f64941f = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K3(int i4, long j4) {
        u3();
        this.f64944i.setLong(i4, j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L3(State state) {
        Objects.requireNonNull(state);
        this.f64938c = state.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M3(PlayType playType) {
        Objects.requireNonNull(playType);
        this.f64940e = playType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N3(boolean z4) {
        this.f64943h = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGameId() {
        this.f64939d = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.f64938c = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.f64940e = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o3(Iterable<? extends Long> iterable) {
        u3();
        AbstractMessageLite.addAll(iterable, this.f64944i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p3(long j4) {
        u3();
        this.f64944i.addLong(j4);
    }

    public static Parser<PlayGameArgs> parser() {
        return f64935q.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q3() {
        this.f64942g = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3() {
        this.f64941f = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3() {
        this.f64944i = GeneratedMessageLite.emptyLongList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameId(long j4) {
        this.f64939d = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateValue(int i4) {
        this.f64938c = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i4) {
        this.f64940e = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t3() {
        this.f64943h = false;
    }

    private void u3() {
        if (this.f64944i.isModifiable()) {
            return;
        }
        this.f64944i = GeneratedMessageLite.mutableCopy(this.f64944i);
    }

    public static PlayGameArgs v3() {
        return f64935q;
    }

    public static b w3() {
        return f64935q.toBuilder();
    }

    public static b x3(PlayGameArgs playGameArgs) {
        return f64935q.toBuilder().mergeFrom((b) playGameArgs);
    }

    public static PlayGameArgs y3(InputStream inputStream) throws IOException {
        return (PlayGameArgs) GeneratedMessageLite.parseDelimitedFrom(f64935q, inputStream);
    }

    public static PlayGameArgs z3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayGameArgs) GeneratedMessageLite.parseDelimitedFrom(f64935q, inputStream, extensionRegistryLite);
    }

    @Override // com.wufan.friend.chat.protocol.c1
    public boolean F() {
        return this.f64943h;
    }

    @Override // com.wufan.friend.chat.protocol.c1
    public int Q1() {
        return this.f64944i.size();
    }

    @Override // com.wufan.friend.chat.protocol.c1
    public List<Long> R2() {
        return this.f64944i;
    }

    @Override // com.wufan.friend.chat.protocol.c1
    public int d() {
        return this.f64942g;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f64945a[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayGameArgs();
            case 2:
                return f64935q;
            case 3:
                this.f64944i.makeImmutable();
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                PlayGameArgs playGameArgs = (PlayGameArgs) obj2;
                int i4 = this.f64938c;
                boolean z4 = i4 != 0;
                int i5 = playGameArgs.f64938c;
                this.f64938c = visitor.visitInt(z4, i4, i5 != 0, i5);
                long j4 = this.f64939d;
                boolean z5 = j4 != 0;
                long j5 = playGameArgs.f64939d;
                this.f64939d = visitor.visitLong(z5, j4, j5 != 0, j5);
                int i6 = this.f64940e;
                boolean z6 = i6 != 0;
                int i7 = playGameArgs.f64940e;
                this.f64940e = visitor.visitInt(z6, i6, i7 != 0, i7);
                long j6 = this.f64941f;
                boolean z7 = j6 != 0;
                long j7 = playGameArgs.f64941f;
                this.f64941f = visitor.visitLong(z7, j6, j7 != 0, j7);
                int i8 = this.f64942g;
                boolean z8 = i8 != 0;
                int i9 = playGameArgs.f64942g;
                this.f64942g = visitor.visitInt(z8, i8, i9 != 0, i9);
                boolean z9 = this.f64943h;
                boolean z10 = playGameArgs.f64943h;
                this.f64943h = visitor.visitBoolean(z9, z9, z10, z10);
                this.f64944i = visitor.visitLongList(this.f64944i, playGameArgs.f64944i);
                if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                    this.f64937b |= playGameArgs.f64937b;
                }
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
                                    this.f64938c = codedInputStream.readEnum();
                                } else if (readTag == 16) {
                                    this.f64939d = codedInputStream.readInt64();
                                } else if (readTag == 24) {
                                    this.f64940e = codedInputStream.readEnum();
                                } else if (readTag == 32) {
                                    this.f64941f = codedInputStream.readInt64();
                                } else if (readTag == 40) {
                                    this.f64942g = codedInputStream.readInt32();
                                } else if (readTag == 48) {
                                    this.f64943h = codedInputStream.readBool();
                                } else if (readTag == 56) {
                                    if (!this.f64944i.isModifiable()) {
                                        this.f64944i = GeneratedMessageLite.mutableCopy(this.f64944i);
                                    }
                                    this.f64944i.addLong(codedInputStream.readInt64());
                                } else if (readTag != 58) {
                                    if (!codedInputStream.skipField(readTag)) {
                                    }
                                } else {
                                    int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if (!this.f64944i.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f64944i = GeneratedMessageLite.mutableCopy(this.f64944i);
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f64944i.addLong(codedInputStream.readInt64());
                                    }
                                    codedInputStream.popLimit(pushLimit);
                                }
                            }
                            r1 = true;
                        } catch (IOException e5) {
                            throw new RuntimeException(new InvalidProtocolBufferException(e5.getMessage()).setUnfinishedMessage(this));
                        }
                    } catch (InvalidProtocolBufferException e6) {
                        throw new RuntimeException(e6.setUnfinishedMessage(this));
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (f64936r == null) {
                    synchronized (PlayGameArgs.class) {
                        if (f64936r == null) {
                            f64936r = new GeneratedMessageLite.DefaultInstanceBasedParser(f64935q);
                        }
                    }
                }
                return f64936r;
            default:
                throw new UnsupportedOperationException();
        }
        return f64935q;
    }

    @Override // com.wufan.friend.chat.protocol.c1
    public long e2(int i4) {
        return this.f64944i.getLong(i4);
    }

    @Override // com.wufan.friend.chat.protocol.c1
    public long f() {
        return this.f64941f;
    }

    @Override // com.wufan.friend.chat.protocol.c1
    public long getGameId() {
        return this.f64939d;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int computeEnumSize = this.f64938c != State.START.getNumber() ? CodedOutputStream.computeEnumSize(1, this.f64938c) + 0 : 0;
        long j4 = this.f64939d;
        if (j4 != 0) {
            computeEnumSize += CodedOutputStream.computeInt64Size(2, j4);
        }
        if (this.f64940e != PlayType.STAND.getNumber()) {
            computeEnumSize += CodedOutputStream.computeEnumSize(3, this.f64940e);
        }
        long j5 = this.f64941f;
        if (j5 != 0) {
            computeEnumSize += CodedOutputStream.computeInt64Size(4, j5);
        }
        int i5 = this.f64942g;
        if (i5 != 0) {
            computeEnumSize += CodedOutputStream.computeInt32Size(5, i5);
        }
        boolean z4 = this.f64943h;
        if (z4) {
            computeEnumSize += CodedOutputStream.computeBoolSize(6, z4);
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.f64944i.size(); i7++) {
            i6 += CodedOutputStream.computeInt64SizeNoTag(this.f64944i.getLong(i7));
        }
        int size = computeEnumSize + i6 + (R2().size() * 1);
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // com.wufan.friend.chat.protocol.c1
    public State getState() {
        State forNumber = State.forNumber(this.f64938c);
        return forNumber == null ? State.UNRECOGNIZED : forNumber;
    }

    @Override // com.wufan.friend.chat.protocol.c1
    public int getStateValue() {
        return this.f64938c;
    }

    @Override // com.wufan.friend.chat.protocol.c1
    public PlayType getType() {
        PlayType forNumber = PlayType.forNumber(this.f64940e);
        return forNumber == null ? PlayType.UNRECOGNIZED : forNumber;
    }

    @Override // com.wufan.friend.chat.protocol.c1
    public int getTypeValue() {
        return this.f64940e;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if (this.f64938c != State.START.getNumber()) {
            codedOutputStream.writeEnum(1, this.f64938c);
        }
        long j4 = this.f64939d;
        if (j4 != 0) {
            codedOutputStream.writeInt64(2, j4);
        }
        if (this.f64940e != PlayType.STAND.getNumber()) {
            codedOutputStream.writeEnum(3, this.f64940e);
        }
        long j5 = this.f64941f;
        if (j5 != 0) {
            codedOutputStream.writeInt64(4, j5);
        }
        int i4 = this.f64942g;
        if (i4 != 0) {
            codedOutputStream.writeInt32(5, i4);
        }
        boolean z4 = this.f64943h;
        if (z4) {
            codedOutputStream.writeBool(6, z4);
        }
        for (int i5 = 0; i5 < this.f64944i.size(); i5++) {
            codedOutputStream.writeInt64(7, this.f64944i.getLong(i5));
        }
    }
}
