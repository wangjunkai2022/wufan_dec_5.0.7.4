package com.wufan.friend.chat.protocol;

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
import java.util.Objects;
/* loaded from: classes6.dex */
public final class ChatRoomArgs extends GeneratedMessageLite<ChatRoomArgs, b> implements o {

    /* renamed from: e  reason: collision with root package name */
    public static final int f64905e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f64906f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f64907g = 3;

    /* renamed from: h  reason: collision with root package name */
    private static final ChatRoomArgs f64908h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile Parser<ChatRoomArgs> f64909i;

    /* renamed from: b  reason: collision with root package name */
    private int f64910b;

    /* renamed from: c  reason: collision with root package name */
    private long f64911c;

    /* renamed from: d  reason: collision with root package name */
    private int f64912d;

    /* loaded from: classes6.dex */
    public enum State implements Internal.EnumLite {
        JOIN(0),
        LEAVE(1),
        UNRECOGNIZED(-1);
        
        public static final int JOIN_VALUE = 0;
        public static final int LEAVE_VALUE = 1;
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
                    return null;
                }
                return LEAVE;
            }
            return JOIN;
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
        static final /* synthetic */ int[] f64913a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f64913a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64913a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64913a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64913a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f64913a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f64913a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f64913a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f64913a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<ChatRoomArgs, b> implements o {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b V2() {
            copyOnWrite();
            ((ChatRoomArgs) this.instance).e3();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((ChatRoomArgs) this.instance).clearState();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((ChatRoomArgs) this.instance).d3();
            return this;
        }

        public b X2(int i4) {
            copyOnWrite();
            ((ChatRoomArgs) this.instance).s3(i4);
            return this;
        }

        public b Y2(long j4) {
            copyOnWrite();
            ((ChatRoomArgs) this.instance).t3(j4);
            return this;
        }

        public b Z2(State state) {
            copyOnWrite();
            ((ChatRoomArgs) this.instance).u3(state);
            return this;
        }

        public b a3(int i4) {
            copyOnWrite();
            ((ChatRoomArgs) this.instance).setStateValue(i4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.o
        public int d() {
            return ((ChatRoomArgs) this.instance).d();
        }

        @Override // com.wufan.friend.chat.protocol.o
        public long f() {
            return ((ChatRoomArgs) this.instance).f();
        }

        @Override // com.wufan.friend.chat.protocol.o
        public State getState() {
            return ((ChatRoomArgs) this.instance).getState();
        }

        @Override // com.wufan.friend.chat.protocol.o
        public int getStateValue() {
            return ((ChatRoomArgs) this.instance).getStateValue();
        }

        private b() {
            super(ChatRoomArgs.f64908h);
        }
    }

    static {
        ChatRoomArgs chatRoomArgs = new ChatRoomArgs();
        f64908h = chatRoomArgs;
        chatRoomArgs.makeImmutable();
    }

    private ChatRoomArgs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.f64910b = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d3() {
        this.f64912d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e3() {
        this.f64911c = 0L;
    }

    public static ChatRoomArgs f3() {
        return f64908h;
    }

    public static b g3() {
        return f64908h.toBuilder();
    }

    public static b h3(ChatRoomArgs chatRoomArgs) {
        return f64908h.toBuilder().mergeFrom((b) chatRoomArgs);
    }

    public static ChatRoomArgs i3(InputStream inputStream) throws IOException {
        return (ChatRoomArgs) GeneratedMessageLite.parseDelimitedFrom(f64908h, inputStream);
    }

    public static ChatRoomArgs j3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChatRoomArgs) GeneratedMessageLite.parseDelimitedFrom(f64908h, inputStream, extensionRegistryLite);
    }

    public static ChatRoomArgs k3(ByteString byteString) throws InvalidProtocolBufferException {
        return (ChatRoomArgs) GeneratedMessageLite.parseFrom(f64908h, byteString);
    }

    public static ChatRoomArgs l3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChatRoomArgs) GeneratedMessageLite.parseFrom(f64908h, byteString, extensionRegistryLite);
    }

    public static ChatRoomArgs m3(CodedInputStream codedInputStream) throws IOException {
        return (ChatRoomArgs) GeneratedMessageLite.parseFrom(f64908h, codedInputStream);
    }

    public static ChatRoomArgs n3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChatRoomArgs) GeneratedMessageLite.parseFrom(f64908h, codedInputStream, extensionRegistryLite);
    }

    public static ChatRoomArgs o3(InputStream inputStream) throws IOException {
        return (ChatRoomArgs) GeneratedMessageLite.parseFrom(f64908h, inputStream);
    }

    public static ChatRoomArgs p3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChatRoomArgs) GeneratedMessageLite.parseFrom(f64908h, inputStream, extensionRegistryLite);
    }

    public static Parser<ChatRoomArgs> parser() {
        return f64908h.getParserForType();
    }

    public static ChatRoomArgs q3(byte[] bArr) throws InvalidProtocolBufferException {
        return (ChatRoomArgs) GeneratedMessageLite.parseFrom(f64908h, bArr);
    }

    public static ChatRoomArgs r3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChatRoomArgs) GeneratedMessageLite.parseFrom(f64908h, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3(int i4) {
        this.f64912d = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateValue(int i4) {
        this.f64910b = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t3(long j4) {
        this.f64911c = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u3(State state) {
        Objects.requireNonNull(state);
        this.f64910b = state.getNumber();
    }

    @Override // com.wufan.friend.chat.protocol.o
    public int d() {
        return this.f64912d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f64913a[methodToInvoke.ordinal()]) {
            case 1:
                return new ChatRoomArgs();
            case 2:
                return f64908h;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                ChatRoomArgs chatRoomArgs = (ChatRoomArgs) obj2;
                int i4 = this.f64910b;
                boolean z4 = i4 != 0;
                int i5 = chatRoomArgs.f64910b;
                this.f64910b = visitor.visitInt(z4, i4, i5 != 0, i5);
                long j4 = this.f64911c;
                boolean z5 = j4 != 0;
                long j5 = chatRoomArgs.f64911c;
                this.f64911c = visitor.visitLong(z5, j4, j5 != 0, j5);
                int i6 = this.f64912d;
                boolean z6 = i6 != 0;
                int i7 = chatRoomArgs.f64912d;
                this.f64912d = visitor.visitInt(z6, i6, i7 != 0, i7);
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
                                this.f64910b = codedInputStream.readEnum();
                            } else if (readTag == 16) {
                                this.f64911c = codedInputStream.readInt64();
                            } else if (readTag != 24) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f64912d = codedInputStream.readInt32();
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
                if (f64909i == null) {
                    synchronized (ChatRoomArgs.class) {
                        if (f64909i == null) {
                            f64909i = new GeneratedMessageLite.DefaultInstanceBasedParser(f64908h);
                        }
                    }
                }
                return f64909i;
            default:
                throw new UnsupportedOperationException();
        }
        return f64908h;
    }

    @Override // com.wufan.friend.chat.protocol.o
    public long f() {
        return this.f64911c;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int computeEnumSize = this.f64910b != State.JOIN.getNumber() ? 0 + CodedOutputStream.computeEnumSize(1, this.f64910b) : 0;
        long j4 = this.f64911c;
        if (j4 != 0) {
            computeEnumSize += CodedOutputStream.computeInt64Size(2, j4);
        }
        int i5 = this.f64912d;
        if (i5 != 0) {
            computeEnumSize += CodedOutputStream.computeInt32Size(3, i5);
        }
        this.memoizedSerializedSize = computeEnumSize;
        return computeEnumSize;
    }

    @Override // com.wufan.friend.chat.protocol.o
    public State getState() {
        State forNumber = State.forNumber(this.f64910b);
        return forNumber == null ? State.UNRECOGNIZED : forNumber;
    }

    @Override // com.wufan.friend.chat.protocol.o
    public int getStateValue() {
        return this.f64910b;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f64910b != State.JOIN.getNumber()) {
            codedOutputStream.writeEnum(1, this.f64910b);
        }
        long j4 = this.f64911c;
        if (j4 != 0) {
            codedOutputStream.writeInt64(2, j4);
        }
        int i4 = this.f64912d;
        if (i4 != 0) {
            codedOutputStream.writeInt32(3, i4);
        }
    }
}
