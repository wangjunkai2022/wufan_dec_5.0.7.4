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
import java.util.Objects;
/* compiled from: OnlineStateArgs.java */
/* loaded from: classes6.dex */
public final class a1 extends GeneratedMessageLite<a1, b> implements b1 {

    /* renamed from: c  reason: collision with root package name */
    public static final int f64975c = 1;

    /* renamed from: d  reason: collision with root package name */
    private static final a1 f64976d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile Parser<a1> f64977e;

    /* renamed from: b  reason: collision with root package name */
    private int f64978b;

    /* compiled from: OnlineStateArgs.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f64979a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f64979a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64979a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64979a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64979a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f64979a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f64979a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f64979a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f64979a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: OnlineStateArgs.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<a1, b> implements b1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b V2(OnlineState onlineState) {
            copyOnWrite();
            ((a1) this.instance).m3(onlineState);
            return this;
        }

        public b W2(int i4) {
            copyOnWrite();
            ((a1) this.instance).setStateValue(i4);
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((a1) this.instance).clearState();
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.b1
        public OnlineState getState() {
            return ((a1) this.instance).getState();
        }

        @Override // com.wufan.friend.chat.protocol.b1
        public int getStateValue() {
            return ((a1) this.instance).getStateValue();
        }

        private b() {
            super(a1.f64976d);
        }
    }

    static {
        a1 a1Var = new a1();
        f64976d = a1Var;
        a1Var.makeImmutable();
    }

    private a1() {
    }

    public static a1 Z2() {
        return f64976d;
    }

    public static b a3() {
        return f64976d.toBuilder();
    }

    public static b b3(a1 a1Var) {
        return f64976d.toBuilder().mergeFrom((b) a1Var);
    }

    public static a1 c3(InputStream inputStream) throws IOException {
        return (a1) GeneratedMessageLite.parseDelimitedFrom(f64976d, inputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.f64978b = 0;
    }

    public static a1 d3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (a1) GeneratedMessageLite.parseDelimitedFrom(f64976d, inputStream, extensionRegistryLite);
    }

    public static a1 e3(ByteString byteString) throws InvalidProtocolBufferException {
        return (a1) GeneratedMessageLite.parseFrom(f64976d, byteString);
    }

    public static a1 f3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (a1) GeneratedMessageLite.parseFrom(f64976d, byteString, extensionRegistryLite);
    }

    public static a1 g3(CodedInputStream codedInputStream) throws IOException {
        return (a1) GeneratedMessageLite.parseFrom(f64976d, codedInputStream);
    }

    public static a1 h3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (a1) GeneratedMessageLite.parseFrom(f64976d, codedInputStream, extensionRegistryLite);
    }

    public static a1 i3(InputStream inputStream) throws IOException {
        return (a1) GeneratedMessageLite.parseFrom(f64976d, inputStream);
    }

    public static a1 j3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (a1) GeneratedMessageLite.parseFrom(f64976d, inputStream, extensionRegistryLite);
    }

    public static a1 k3(byte[] bArr) throws InvalidProtocolBufferException {
        return (a1) GeneratedMessageLite.parseFrom(f64976d, bArr);
    }

    public static a1 l3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (a1) GeneratedMessageLite.parseFrom(f64976d, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m3(OnlineState onlineState) {
        Objects.requireNonNull(onlineState);
        this.f64978b = onlineState.getNumber();
    }

    public static Parser<a1> parser() {
        return f64976d.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateValue(int i4) {
        this.f64978b = i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f64979a[methodToInvoke.ordinal()]) {
            case 1:
                return new a1();
            case 2:
                return f64976d;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                a1 a1Var = (a1) obj2;
                int i4 = this.f64978b;
                boolean z4 = i4 != 0;
                int i5 = a1Var.f64978b;
                this.f64978b = visitor.visitInt(z4, i4, i5 != 0, i5);
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
                                this.f64978b = codedInputStream.readEnum();
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
                if (f64977e == null) {
                    synchronized (a1.class) {
                        if (f64977e == null) {
                            f64977e = new GeneratedMessageLite.DefaultInstanceBasedParser(f64976d);
                        }
                    }
                }
                return f64977e;
            default:
                throw new UnsupportedOperationException();
        }
        return f64976d;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int computeEnumSize = this.f64978b != OnlineState.ONLINE.getNumber() ? 0 + CodedOutputStream.computeEnumSize(1, this.f64978b) : 0;
        this.memoizedSerializedSize = computeEnumSize;
        return computeEnumSize;
    }

    @Override // com.wufan.friend.chat.protocol.b1
    public OnlineState getState() {
        OnlineState forNumber = OnlineState.forNumber(this.f64978b);
        return forNumber == null ? OnlineState.UNRECOGNIZED : forNumber;
    }

    @Override // com.wufan.friend.chat.protocol.b1
    public int getStateValue() {
        return this.f64978b;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f64978b != OnlineState.ONLINE.getNumber()) {
            codedOutputStream.writeEnum(1, this.f64978b);
        }
    }
}
