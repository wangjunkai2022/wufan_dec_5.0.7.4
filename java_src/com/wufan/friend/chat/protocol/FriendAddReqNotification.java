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
public final class FriendAddReqNotification extends GeneratedMessageLite<FriendAddReqNotification, b> implements s {

    /* renamed from: e  reason: collision with root package name */
    public static final int f64914e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f64915f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f64916g = 3;

    /* renamed from: h  reason: collision with root package name */
    private static final FriendAddReqNotification f64917h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile Parser<FriendAddReqNotification> f64918i;

    /* renamed from: b  reason: collision with root package name */
    private boolean f64919b;

    /* renamed from: c  reason: collision with root package name */
    private int f64920c;

    /* renamed from: d  reason: collision with root package name */
    private int f64921d;

    /* loaded from: classes6.dex */
    public enum State implements Internal.EnumLite {
        CHANGE_FRIEND_REQUEST(0),
        GIVE_LIKE(1),
        UNRECOGNIZED(-1);
        
        public static final int CHANGE_FRIEND_REQUEST_VALUE = 0;
        public static final int GIVE_LIKE_VALUE = 1;
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
                return GIVE_LIKE;
            }
            return CHANGE_FRIEND_REQUEST;
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
        static final /* synthetic */ int[] f64922a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f64922a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64922a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64922a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64922a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f64922a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f64922a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f64922a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f64922a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<FriendAddReqNotification, b> implements s {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b V2() {
            copyOnWrite();
            ((FriendAddReqNotification) this.instance).d3();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((FriendAddReqNotification) this.instance).clearType();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((FriendAddReqNotification) this.instance).clearCount();
            return this;
        }

        public b X2(int i4) {
            copyOnWrite();
            ((FriendAddReqNotification) this.instance).setCount(i4);
            return this;
        }

        public b Y2(boolean z4) {
            copyOnWrite();
            ((FriendAddReqNotification) this.instance).r3(z4);
            return this;
        }

        public b Z2(State state) {
            copyOnWrite();
            ((FriendAddReqNotification) this.instance).s3(state);
            return this;
        }

        public b a3(int i4) {
            copyOnWrite();
            ((FriendAddReqNotification) this.instance).setTypeValue(i4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.s
        public int getCount() {
            return ((FriendAddReqNotification) this.instance).getCount();
        }

        @Override // com.wufan.friend.chat.protocol.s
        public boolean getStatus() {
            return ((FriendAddReqNotification) this.instance).getStatus();
        }

        @Override // com.wufan.friend.chat.protocol.s
        public State getType() {
            return ((FriendAddReqNotification) this.instance).getType();
        }

        @Override // com.wufan.friend.chat.protocol.s
        public int getTypeValue() {
            return ((FriendAddReqNotification) this.instance).getTypeValue();
        }

        private b() {
            super(FriendAddReqNotification.f64917h);
        }
    }

    static {
        FriendAddReqNotification friendAddReqNotification = new FriendAddReqNotification();
        f64917h = friendAddReqNotification;
        friendAddReqNotification.makeImmutable();
    }

    private FriendAddReqNotification() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCount() {
        this.f64921d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.f64920c = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d3() {
        this.f64919b = false;
    }

    public static FriendAddReqNotification e3() {
        return f64917h;
    }

    public static b f3() {
        return f64917h.toBuilder();
    }

    public static b g3(FriendAddReqNotification friendAddReqNotification) {
        return f64917h.toBuilder().mergeFrom((b) friendAddReqNotification);
    }

    public static FriendAddReqNotification h3(InputStream inputStream) throws IOException {
        return (FriendAddReqNotification) GeneratedMessageLite.parseDelimitedFrom(f64917h, inputStream);
    }

    public static FriendAddReqNotification i3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FriendAddReqNotification) GeneratedMessageLite.parseDelimitedFrom(f64917h, inputStream, extensionRegistryLite);
    }

    public static FriendAddReqNotification j3(ByteString byteString) throws InvalidProtocolBufferException {
        return (FriendAddReqNotification) GeneratedMessageLite.parseFrom(f64917h, byteString);
    }

    public static FriendAddReqNotification k3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FriendAddReqNotification) GeneratedMessageLite.parseFrom(f64917h, byteString, extensionRegistryLite);
    }

    public static FriendAddReqNotification l3(CodedInputStream codedInputStream) throws IOException {
        return (FriendAddReqNotification) GeneratedMessageLite.parseFrom(f64917h, codedInputStream);
    }

    public static FriendAddReqNotification m3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FriendAddReqNotification) GeneratedMessageLite.parseFrom(f64917h, codedInputStream, extensionRegistryLite);
    }

    public static FriendAddReqNotification n3(InputStream inputStream) throws IOException {
        return (FriendAddReqNotification) GeneratedMessageLite.parseFrom(f64917h, inputStream);
    }

    public static FriendAddReqNotification o3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FriendAddReqNotification) GeneratedMessageLite.parseFrom(f64917h, inputStream, extensionRegistryLite);
    }

    public static FriendAddReqNotification p3(byte[] bArr) throws InvalidProtocolBufferException {
        return (FriendAddReqNotification) GeneratedMessageLite.parseFrom(f64917h, bArr);
    }

    public static Parser<FriendAddReqNotification> parser() {
        return f64917h.getParserForType();
    }

    public static FriendAddReqNotification q3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FriendAddReqNotification) GeneratedMessageLite.parseFrom(f64917h, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3(boolean z4) {
        this.f64919b = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3(State state) {
        Objects.requireNonNull(state);
        this.f64920c = state.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCount(int i4) {
        this.f64921d = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i4) {
        this.f64920c = i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f64922a[methodToInvoke.ordinal()]) {
            case 1:
                return new FriendAddReqNotification();
            case 2:
                return f64917h;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                FriendAddReqNotification friendAddReqNotification = (FriendAddReqNotification) obj2;
                boolean z4 = this.f64919b;
                boolean z5 = friendAddReqNotification.f64919b;
                this.f64919b = visitor.visitBoolean(z4, z4, z5, z5);
                int i4 = this.f64920c;
                boolean z6 = i4 != 0;
                int i5 = friendAddReqNotification.f64920c;
                this.f64920c = visitor.visitInt(z6, i4, i5 != 0, i5);
                int i6 = this.f64921d;
                boolean z7 = i6 != 0;
                int i7 = friendAddReqNotification.f64921d;
                this.f64921d = visitor.visitInt(z7, i6, i7 != 0, i7);
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
                                this.f64919b = codedInputStream.readBool();
                            } else if (readTag == 16) {
                                this.f64920c = codedInputStream.readEnum();
                            } else if (readTag != 24) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f64921d = codedInputStream.readInt32();
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
                if (f64918i == null) {
                    synchronized (FriendAddReqNotification.class) {
                        if (f64918i == null) {
                            f64918i = new GeneratedMessageLite.DefaultInstanceBasedParser(f64917h);
                        }
                    }
                }
                return f64918i;
            default:
                throw new UnsupportedOperationException();
        }
        return f64917h;
    }

    @Override // com.wufan.friend.chat.protocol.s
    public int getCount() {
        return this.f64921d;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        boolean z4 = this.f64919b;
        int computeBoolSize = z4 ? 0 + CodedOutputStream.computeBoolSize(1, z4) : 0;
        if (this.f64920c != State.CHANGE_FRIEND_REQUEST.getNumber()) {
            computeBoolSize += CodedOutputStream.computeEnumSize(2, this.f64920c);
        }
        int i5 = this.f64921d;
        if (i5 != 0) {
            computeBoolSize += CodedOutputStream.computeInt32Size(3, i5);
        }
        this.memoizedSerializedSize = computeBoolSize;
        return computeBoolSize;
    }

    @Override // com.wufan.friend.chat.protocol.s
    public boolean getStatus() {
        return this.f64919b;
    }

    @Override // com.wufan.friend.chat.protocol.s
    public State getType() {
        State forNumber = State.forNumber(this.f64920c);
        return forNumber == null ? State.UNRECOGNIZED : forNumber;
    }

    @Override // com.wufan.friend.chat.protocol.s
    public int getTypeValue() {
        return this.f64920c;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean z4 = this.f64919b;
        if (z4) {
            codedOutputStream.writeBool(1, z4);
        }
        if (this.f64920c != State.CHANGE_FRIEND_REQUEST.getNumber()) {
            codedOutputStream.writeEnum(2, this.f64920c);
        }
        int i4 = this.f64921d;
        if (i4 != 0) {
            codedOutputStream.writeInt32(3, i4);
        }
    }
}
