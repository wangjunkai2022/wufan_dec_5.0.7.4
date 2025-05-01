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
public final class HeartArgs extends GeneratedMessageLite<HeartArgs, b> implements k0 {

    /* renamed from: c  reason: collision with root package name */
    public static final int f64923c = 1;

    /* renamed from: d  reason: collision with root package name */
    private static final HeartArgs f64924d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile Parser<HeartArgs> f64925e;

    /* renamed from: b  reason: collision with root package name */
    private int f64926b;

    /* loaded from: classes6.dex */
    public enum State implements Internal.EnumLite {
        UNKNOWN_HST(0),
        APP(1),
        SIMULATOR(2),
        UNRECOGNIZED(-1);
        
        public static final int APP_VALUE = 1;
        public static final int SIMULATOR_VALUE = 2;
        public static final int UNKNOWN_HST_VALUE = 0;
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
                    return SIMULATOR;
                }
                return APP;
            }
            return UNKNOWN_HST;
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
        static final /* synthetic */ int[] f64927a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f64927a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64927a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64927a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64927a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f64927a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f64927a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f64927a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f64927a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<HeartArgs, b> implements k0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b V2(State state) {
            copyOnWrite();
            ((HeartArgs) this.instance).m3(state);
            return this;
        }

        public b W2(int i4) {
            copyOnWrite();
            ((HeartArgs) this.instance).setStateValue(i4);
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((HeartArgs) this.instance).clearState();
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.k0
        public State getState() {
            return ((HeartArgs) this.instance).getState();
        }

        @Override // com.wufan.friend.chat.protocol.k0
        public int getStateValue() {
            return ((HeartArgs) this.instance).getStateValue();
        }

        private b() {
            super(HeartArgs.f64924d);
        }
    }

    static {
        HeartArgs heartArgs = new HeartArgs();
        f64924d = heartArgs;
        heartArgs.makeImmutable();
    }

    private HeartArgs() {
    }

    public static HeartArgs Z2() {
        return f64924d;
    }

    public static b a3() {
        return f64924d.toBuilder();
    }

    public static b b3(HeartArgs heartArgs) {
        return f64924d.toBuilder().mergeFrom((b) heartArgs);
    }

    public static HeartArgs c3(InputStream inputStream) throws IOException {
        return (HeartArgs) GeneratedMessageLite.parseDelimitedFrom(f64924d, inputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.f64926b = 0;
    }

    public static HeartArgs d3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HeartArgs) GeneratedMessageLite.parseDelimitedFrom(f64924d, inputStream, extensionRegistryLite);
    }

    public static HeartArgs e3(ByteString byteString) throws InvalidProtocolBufferException {
        return (HeartArgs) GeneratedMessageLite.parseFrom(f64924d, byteString);
    }

    public static HeartArgs f3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HeartArgs) GeneratedMessageLite.parseFrom(f64924d, byteString, extensionRegistryLite);
    }

    public static HeartArgs g3(CodedInputStream codedInputStream) throws IOException {
        return (HeartArgs) GeneratedMessageLite.parseFrom(f64924d, codedInputStream);
    }

    public static HeartArgs h3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HeartArgs) GeneratedMessageLite.parseFrom(f64924d, codedInputStream, extensionRegistryLite);
    }

    public static HeartArgs i3(InputStream inputStream) throws IOException {
        return (HeartArgs) GeneratedMessageLite.parseFrom(f64924d, inputStream);
    }

    public static HeartArgs j3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HeartArgs) GeneratedMessageLite.parseFrom(f64924d, inputStream, extensionRegistryLite);
    }

    public static HeartArgs k3(byte[] bArr) throws InvalidProtocolBufferException {
        return (HeartArgs) GeneratedMessageLite.parseFrom(f64924d, bArr);
    }

    public static HeartArgs l3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HeartArgs) GeneratedMessageLite.parseFrom(f64924d, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m3(State state) {
        Objects.requireNonNull(state);
        this.f64926b = state.getNumber();
    }

    public static Parser<HeartArgs> parser() {
        return f64924d.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateValue(int i4) {
        this.f64926b = i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f64927a[methodToInvoke.ordinal()]) {
            case 1:
                return new HeartArgs();
            case 2:
                return f64924d;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                HeartArgs heartArgs = (HeartArgs) obj2;
                int i4 = this.f64926b;
                boolean z4 = i4 != 0;
                int i5 = heartArgs.f64926b;
                this.f64926b = visitor.visitInt(z4, i4, i5 != 0, i5);
                GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!r1) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag != 8) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f64926b = codedInputStream.readEnum();
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
                if (f64925e == null) {
                    synchronized (HeartArgs.class) {
                        if (f64925e == null) {
                            f64925e = new GeneratedMessageLite.DefaultInstanceBasedParser(f64924d);
                        }
                    }
                }
                return f64925e;
            default:
                throw new UnsupportedOperationException();
        }
        return f64924d;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int computeEnumSize = this.f64926b != State.UNKNOWN_HST.getNumber() ? 0 + CodedOutputStream.computeEnumSize(1, this.f64926b) : 0;
        this.memoizedSerializedSize = computeEnumSize;
        return computeEnumSize;
    }

    @Override // com.wufan.friend.chat.protocol.k0
    public State getState() {
        State forNumber = State.forNumber(this.f64926b);
        return forNumber == null ? State.UNRECOGNIZED : forNumber;
    }

    @Override // com.wufan.friend.chat.protocol.k0
    public int getStateValue() {
        return this.f64926b;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f64926b != State.UNKNOWN_HST.getNumber()) {
            codedOutputStream.writeEnum(1, this.f64926b);
        }
    }
}
