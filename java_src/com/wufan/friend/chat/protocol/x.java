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
/* compiled from: FriendChangeStateNotification.java */
/* loaded from: classes6.dex */
public final class x extends GeneratedMessageLite<x, b> implements y {

    /* renamed from: e  reason: collision with root package name */
    public static final int f65272e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f65273f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f65274g = 3;

    /* renamed from: h  reason: collision with root package name */
    private static final x f65275h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile Parser<x> f65276i;

    /* renamed from: b  reason: collision with root package name */
    private com.wufan.friend.chat.protocol.a f65277b;

    /* renamed from: c  reason: collision with root package name */
    private int f65278c;

    /* renamed from: d  reason: collision with root package name */
    private d1 f65279d;

    /* compiled from: FriendChangeStateNotification.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65280a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65280a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65280a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65280a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65280a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65280a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65280a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65280a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65280a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: FriendChangeStateNotification.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<x, b> implements y {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b V2() {
            copyOnWrite();
            ((x) this.instance).i3();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((x) this.instance).clearState();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((x) this.instance).h3();
            return this;
        }

        public b X2(com.wufan.friend.chat.protocol.a aVar) {
            copyOnWrite();
            ((x) this.instance).k3(aVar);
            return this;
        }

        public b Y2(d1 d1Var) {
            copyOnWrite();
            ((x) this.instance).l3(d1Var);
            return this;
        }

        public b Z2(a.b bVar) {
            copyOnWrite();
            ((x) this.instance).y3(bVar);
            return this;
        }

        public b a3(com.wufan.friend.chat.protocol.a aVar) {
            copyOnWrite();
            ((x) this.instance).z3(aVar);
            return this;
        }

        public b b3(d1.b bVar) {
            copyOnWrite();
            ((x) this.instance).A3(bVar);
            return this;
        }

        public b c3(d1 d1Var) {
            copyOnWrite();
            ((x) this.instance).B3(d1Var);
            return this;
        }

        public b d3(OnlineState onlineState) {
            copyOnWrite();
            ((x) this.instance).C3(onlineState);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.y
        public boolean e() {
            return ((x) this.instance).e();
        }

        public b e3(int i4) {
            copyOnWrite();
            ((x) this.instance).setStateValue(i4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.y
        public com.wufan.friend.chat.protocol.a g() {
            return ((x) this.instance).g();
        }

        @Override // com.wufan.friend.chat.protocol.y
        public OnlineState getState() {
            return ((x) this.instance).getState();
        }

        @Override // com.wufan.friend.chat.protocol.y
        public int getStateValue() {
            return ((x) this.instance).getStateValue();
        }

        @Override // com.wufan.friend.chat.protocol.y
        public d1 q() {
            return ((x) this.instance).q();
        }

        @Override // com.wufan.friend.chat.protocol.y
        public boolean u() {
            return ((x) this.instance).u();
        }

        private b() {
            super(x.f65275h);
        }
    }

    static {
        x xVar = new x();
        f65275h = xVar;
        xVar.makeImmutable();
    }

    private x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3(d1.b bVar) {
        this.f65279d = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3(d1 d1Var) {
        Objects.requireNonNull(d1Var);
        this.f65279d = d1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3(OnlineState onlineState) {
        Objects.requireNonNull(onlineState);
        this.f65278c = onlineState.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.f65278c = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3() {
        this.f65277b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3() {
        this.f65279d = null;
    }

    public static x j3() {
        return f65275h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3(com.wufan.friend.chat.protocol.a aVar) {
        com.wufan.friend.chat.protocol.a aVar2 = this.f65277b;
        if (aVar2 != null && aVar2 != com.wufan.friend.chat.protocol.a.q3()) {
            this.f65277b = com.wufan.friend.chat.protocol.a.s3(this.f65277b).mergeFrom((a.b) aVar).buildPartial();
        } else {
            this.f65277b = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3(d1 d1Var) {
        d1 d1Var2 = this.f65279d;
        if (d1Var2 != null && d1Var2 != d1.k3()) {
            this.f65279d = d1.m3(this.f65279d).mergeFrom((d1.b) d1Var).buildPartial();
        } else {
            this.f65279d = d1Var;
        }
    }

    public static b m3() {
        return f65275h.toBuilder();
    }

    public static b n3(x xVar) {
        return f65275h.toBuilder().mergeFrom((b) xVar);
    }

    public static x o3(InputStream inputStream) throws IOException {
        return (x) GeneratedMessageLite.parseDelimitedFrom(f65275h, inputStream);
    }

    public static x p3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (x) GeneratedMessageLite.parseDelimitedFrom(f65275h, inputStream, extensionRegistryLite);
    }

    public static Parser<x> parser() {
        return f65275h.getParserForType();
    }

    public static x q3(ByteString byteString) throws InvalidProtocolBufferException {
        return (x) GeneratedMessageLite.parseFrom(f65275h, byteString);
    }

    public static x r3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (x) GeneratedMessageLite.parseFrom(f65275h, byteString, extensionRegistryLite);
    }

    public static x s3(CodedInputStream codedInputStream) throws IOException {
        return (x) GeneratedMessageLite.parseFrom(f65275h, codedInputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateValue(int i4) {
        this.f65278c = i4;
    }

    public static x t3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (x) GeneratedMessageLite.parseFrom(f65275h, codedInputStream, extensionRegistryLite);
    }

    public static x u3(InputStream inputStream) throws IOException {
        return (x) GeneratedMessageLite.parseFrom(f65275h, inputStream);
    }

    public static x v3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (x) GeneratedMessageLite.parseFrom(f65275h, inputStream, extensionRegistryLite);
    }

    public static x w3(byte[] bArr) throws InvalidProtocolBufferException {
        return (x) GeneratedMessageLite.parseFrom(f65275h, bArr);
    }

    public static x x3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (x) GeneratedMessageLite.parseFrom(f65275h, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3(a.b bVar) {
        this.f65277b = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(com.wufan.friend.chat.protocol.a aVar) {
        Objects.requireNonNull(aVar);
        this.f65277b = aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65280a[methodToInvoke.ordinal()]) {
            case 1:
                return new x();
            case 2:
                return f65275h;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                x xVar = (x) obj2;
                this.f65277b = (com.wufan.friend.chat.protocol.a) visitor.visitMessage(this.f65277b, xVar.f65277b);
                int i4 = this.f65278c;
                boolean z4 = i4 != 0;
                int i5 = xVar.f65278c;
                this.f65278c = visitor.visitInt(z4, i4, i5 != 0, i5);
                this.f65279d = (d1) visitor.visitMessage(this.f65279d, xVar.f65279d);
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
                                    com.wufan.friend.chat.protocol.a aVar = this.f65277b;
                                    a.b builder = aVar != null ? aVar.toBuilder() : null;
                                    com.wufan.friend.chat.protocol.a aVar2 = (com.wufan.friend.chat.protocol.a) codedInputStream.readMessage(com.wufan.friend.chat.protocol.a.parser(), extensionRegistryLite);
                                    this.f65277b = aVar2;
                                    if (builder != null) {
                                        builder.mergeFrom((a.b) aVar2);
                                        this.f65277b = builder.buildPartial();
                                    }
                                } else if (readTag == 16) {
                                    this.f65278c = codedInputStream.readEnum();
                                } else if (readTag != 26) {
                                    if (!codedInputStream.skipField(readTag)) {
                                    }
                                } else {
                                    d1 d1Var = this.f65279d;
                                    d1.b builder2 = d1Var != null ? d1Var.toBuilder() : null;
                                    d1 d1Var2 = (d1) codedInputStream.readMessage(d1.parser(), extensionRegistryLite);
                                    this.f65279d = d1Var2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((d1.b) d1Var2);
                                        this.f65279d = builder2.buildPartial();
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
                if (f65276i == null) {
                    synchronized (x.class) {
                        if (f65276i == null) {
                            f65276i = new GeneratedMessageLite.DefaultInstanceBasedParser(f65275h);
                        }
                    }
                }
                return f65276i;
            default:
                throw new UnsupportedOperationException();
        }
        return f65275h;
    }

    @Override // com.wufan.friend.chat.protocol.y
    public boolean e() {
        return this.f65277b != null;
    }

    @Override // com.wufan.friend.chat.protocol.y
    public com.wufan.friend.chat.protocol.a g() {
        com.wufan.friend.chat.protocol.a aVar = this.f65277b;
        return aVar == null ? com.wufan.friend.chat.protocol.a.q3() : aVar;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int computeMessageSize = this.f65277b != null ? 0 + CodedOutputStream.computeMessageSize(1, g()) : 0;
        if (this.f65278c != OnlineState.ONLINE.getNumber()) {
            computeMessageSize += CodedOutputStream.computeEnumSize(2, this.f65278c);
        }
        if (this.f65279d != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(3, q());
        }
        this.memoizedSerializedSize = computeMessageSize;
        return computeMessageSize;
    }

    @Override // com.wufan.friend.chat.protocol.y
    public OnlineState getState() {
        OnlineState forNumber = OnlineState.forNumber(this.f65278c);
        return forNumber == null ? OnlineState.UNRECOGNIZED : forNumber;
    }

    @Override // com.wufan.friend.chat.protocol.y
    public int getStateValue() {
        return this.f65278c;
    }

    @Override // com.wufan.friend.chat.protocol.y
    public d1 q() {
        d1 d1Var = this.f65279d;
        return d1Var == null ? d1.k3() : d1Var;
    }

    @Override // com.wufan.friend.chat.protocol.y
    public boolean u() {
        return this.f65279d != null;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f65277b != null) {
            codedOutputStream.writeMessage(1, g());
        }
        if (this.f65278c != OnlineState.ONLINE.getNumber()) {
            codedOutputStream.writeEnum(2, this.f65278c);
        }
        if (this.f65279d != null) {
            codedOutputStream.writeMessage(3, q());
        }
    }
}
