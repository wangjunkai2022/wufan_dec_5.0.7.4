package com.wufan.friend.chat.protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.wufan.friend.chat.protocol.a;
import com.wufan.friend.chat.protocol.d1;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* compiled from: RecommendPlayerStateChangeNotification.java */
/* loaded from: classes6.dex */
public final class o1 extends GeneratedMessageLite<o1, b> implements p1 {

    /* renamed from: e  reason: collision with root package name */
    public static final int f65137e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f65138f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f65139g = 3;

    /* renamed from: h  reason: collision with root package name */
    private static final o1 f65140h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile Parser<o1> f65141i;

    /* renamed from: b  reason: collision with root package name */
    private com.wufan.friend.chat.protocol.a f65142b;

    /* renamed from: c  reason: collision with root package name */
    private int f65143c;

    /* renamed from: d  reason: collision with root package name */
    private d1 f65144d;

    /* compiled from: RecommendPlayerStateChangeNotification.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65145a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65145a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65145a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65145a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65145a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65145a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65145a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65145a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65145a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: RecommendPlayerStateChangeNotification.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<o1, b> implements p1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b V2() {
            copyOnWrite();
            ((o1) this.instance).i3();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((o1) this.instance).clearState();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((o1) this.instance).h3();
            return this;
        }

        public b X2(com.wufan.friend.chat.protocol.a aVar) {
            copyOnWrite();
            ((o1) this.instance).k3(aVar);
            return this;
        }

        public b Y2(d1 d1Var) {
            copyOnWrite();
            ((o1) this.instance).l3(d1Var);
            return this;
        }

        public b Z2(a.b bVar) {
            copyOnWrite();
            ((o1) this.instance).y3(bVar);
            return this;
        }

        public b a3(com.wufan.friend.chat.protocol.a aVar) {
            copyOnWrite();
            ((o1) this.instance).z3(aVar);
            return this;
        }

        public b b3(d1.b bVar) {
            copyOnWrite();
            ((o1) this.instance).A3(bVar);
            return this;
        }

        public b c3(d1 d1Var) {
            copyOnWrite();
            ((o1) this.instance).B3(d1Var);
            return this;
        }

        public b d3(OnlineState onlineState) {
            copyOnWrite();
            ((o1) this.instance).C3(onlineState);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.p1
        public boolean e() {
            return ((o1) this.instance).e();
        }

        public b e3(int i4) {
            copyOnWrite();
            ((o1) this.instance).setStateValue(i4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.p1
        public com.wufan.friend.chat.protocol.a g() {
            return ((o1) this.instance).g();
        }

        @Override // com.wufan.friend.chat.protocol.p1
        public OnlineState getState() {
            return ((o1) this.instance).getState();
        }

        @Override // com.wufan.friend.chat.protocol.p1
        public int getStateValue() {
            return ((o1) this.instance).getStateValue();
        }

        @Override // com.wufan.friend.chat.protocol.p1
        public d1 q() {
            return ((o1) this.instance).q();
        }

        @Override // com.wufan.friend.chat.protocol.p1
        public boolean u() {
            return ((o1) this.instance).u();
        }

        private b() {
            super(o1.f65140h);
        }
    }

    static {
        o1 o1Var = new o1();
        f65140h = o1Var;
        o1Var.makeImmutable();
    }

    private o1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3(d1.b bVar) {
        this.f65144d = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3(d1 d1Var) {
        Objects.requireNonNull(d1Var);
        this.f65144d = d1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3(OnlineState onlineState) {
        Objects.requireNonNull(onlineState);
        this.f65143c = onlineState.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.f65143c = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3() {
        this.f65142b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3() {
        this.f65144d = null;
    }

    public static o1 j3() {
        return f65140h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3(com.wufan.friend.chat.protocol.a aVar) {
        com.wufan.friend.chat.protocol.a aVar2 = this.f65142b;
        if (aVar2 != null && aVar2 != com.wufan.friend.chat.protocol.a.q3()) {
            this.f65142b = com.wufan.friend.chat.protocol.a.s3(this.f65142b).mergeFrom((a.b) aVar).buildPartial();
        } else {
            this.f65142b = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3(d1 d1Var) {
        d1 d1Var2 = this.f65144d;
        if (d1Var2 != null && d1Var2 != d1.k3()) {
            this.f65144d = d1.m3(this.f65144d).mergeFrom((d1.b) d1Var).buildPartial();
        } else {
            this.f65144d = d1Var;
        }
    }

    public static b m3() {
        return f65140h.toBuilder();
    }

    public static b n3(o1 o1Var) {
        return f65140h.toBuilder().mergeFrom((b) o1Var);
    }

    public static o1 o3(InputStream inputStream) throws IOException {
        return (o1) GeneratedMessageLite.parseDelimitedFrom(f65140h, inputStream);
    }

    public static o1 p3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (o1) GeneratedMessageLite.parseDelimitedFrom(f65140h, inputStream, extensionRegistryLite);
    }

    public static Parser<o1> parser() {
        return f65140h.getParserForType();
    }

    public static o1 q3(ByteString byteString) throws InvalidProtocolBufferException {
        return (o1) GeneratedMessageLite.parseFrom(f65140h, byteString);
    }

    public static o1 r3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (o1) GeneratedMessageLite.parseFrom(f65140h, byteString, extensionRegistryLite);
    }

    public static o1 s3(CodedInputStream codedInputStream) throws IOException {
        return (o1) GeneratedMessageLite.parseFrom(f65140h, codedInputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateValue(int i4) {
        this.f65143c = i4;
    }

    public static o1 t3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (o1) GeneratedMessageLite.parseFrom(f65140h, codedInputStream, extensionRegistryLite);
    }

    public static o1 u3(InputStream inputStream) throws IOException {
        return (o1) GeneratedMessageLite.parseFrom(f65140h, inputStream);
    }

    public static o1 v3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (o1) GeneratedMessageLite.parseFrom(f65140h, inputStream, extensionRegistryLite);
    }

    public static o1 w3(byte[] bArr) throws InvalidProtocolBufferException {
        return (o1) GeneratedMessageLite.parseFrom(f65140h, bArr);
    }

    public static o1 x3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (o1) GeneratedMessageLite.parseFrom(f65140h, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3(a.b bVar) {
        this.f65142b = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(com.wufan.friend.chat.protocol.a aVar) {
        Objects.requireNonNull(aVar);
        this.f65142b = aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65145a[methodToInvoke.ordinal()]) {
            case 1:
                return new o1();
            case 2:
                return f65140h;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                o1 o1Var = (o1) obj2;
                this.f65142b = (com.wufan.friend.chat.protocol.a) visitor.visitMessage(this.f65142b, o1Var.f65142b);
                int i4 = this.f65143c;
                boolean z4 = i4 != 0;
                int i5 = o1Var.f65143c;
                this.f65143c = visitor.visitInt(z4, i4, i5 != 0, i5);
                this.f65144d = (d1) visitor.visitMessage(this.f65144d, o1Var.f65144d);
                GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!r0) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    com.wufan.friend.chat.protocol.a aVar = this.f65142b;
                                    a.b builder = aVar != null ? aVar.toBuilder() : null;
                                    com.wufan.friend.chat.protocol.a aVar2 = (com.wufan.friend.chat.protocol.a) codedInputStream.readMessage(com.wufan.friend.chat.protocol.a.parser(), extensionRegistryLite);
                                    this.f65142b = aVar2;
                                    if (builder != null) {
                                        builder.mergeFrom((a.b) aVar2);
                                        this.f65142b = builder.buildPartial();
                                    }
                                } else if (readTag == 16) {
                                    this.f65143c = codedInputStream.readEnum();
                                } else if (readTag != 26) {
                                    if (!codedInputStream.skipField(readTag)) {
                                    }
                                } else {
                                    d1 d1Var = this.f65144d;
                                    d1.b builder2 = d1Var != null ? d1Var.toBuilder() : null;
                                    d1 d1Var2 = (d1) codedInputStream.readMessage(d1.parser(), extensionRegistryLite);
                                    this.f65144d = d1Var2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((d1.b) d1Var2);
                                        this.f65144d = builder2.buildPartial();
                                    }
                                }
                            }
                            r0 = true;
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
                if (f65141i == null) {
                    synchronized (o1.class) {
                        if (f65141i == null) {
                            f65141i = new GeneratedMessageLite.DefaultInstanceBasedParser(f65140h);
                        }
                    }
                }
                return f65141i;
            default:
                throw new UnsupportedOperationException();
        }
        return f65140h;
    }

    @Override // com.wufan.friend.chat.protocol.p1
    public boolean e() {
        return this.f65142b != null;
    }

    @Override // com.wufan.friend.chat.protocol.p1
    public com.wufan.friend.chat.protocol.a g() {
        com.wufan.friend.chat.protocol.a aVar = this.f65142b;
        return aVar == null ? com.wufan.friend.chat.protocol.a.q3() : aVar;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int computeMessageSize = this.f65142b != null ? 0 + CodedOutputStream.computeMessageSize(1, g()) : 0;
        if (this.f65143c != OnlineState.ONLINE.getNumber()) {
            computeMessageSize += CodedOutputStream.computeEnumSize(2, this.f65143c);
        }
        if (this.f65144d != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(3, q());
        }
        this.memoizedSerializedSize = computeMessageSize;
        return computeMessageSize;
    }

    @Override // com.wufan.friend.chat.protocol.p1
    public OnlineState getState() {
        OnlineState forNumber = OnlineState.forNumber(this.f65143c);
        return forNumber == null ? OnlineState.UNRECOGNIZED : forNumber;
    }

    @Override // com.wufan.friend.chat.protocol.p1
    public int getStateValue() {
        return this.f65143c;
    }

    @Override // com.wufan.friend.chat.protocol.p1
    public d1 q() {
        d1 d1Var = this.f65144d;
        return d1Var == null ? d1.k3() : d1Var;
    }

    @Override // com.wufan.friend.chat.protocol.p1
    public boolean u() {
        return this.f65144d != null;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f65142b != null) {
            codedOutputStream.writeMessage(1, g());
        }
        if (this.f65143c != OnlineState.ONLINE.getNumber()) {
            codedOutputStream.writeEnum(2, this.f65143c);
        }
        if (this.f65144d != null) {
            codedOutputStream.writeMessage(3, q());
        }
    }
}
