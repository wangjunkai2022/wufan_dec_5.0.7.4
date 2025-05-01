package com.wufan.friend.chat.protocol;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.wufan.friend.chat.protocol.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* compiled from: RejectBattleInviteNotification.java */
/* loaded from: classes6.dex */
public final class q1 extends GeneratedMessageLite<q1, b> implements r1 {

    /* renamed from: d  reason: collision with root package name */
    public static final int f65154d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f65155e = 2;

    /* renamed from: f  reason: collision with root package name */
    private static final q1 f65156f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile Parser<q1> f65157g;

    /* renamed from: b  reason: collision with root package name */
    private com.wufan.friend.chat.protocol.a f65158b;

    /* renamed from: c  reason: collision with root package name */
    private String f65159c = "";

    /* compiled from: RejectBattleInviteNotification.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65160a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65160a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65160a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65160a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65160a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65160a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65160a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65160a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65160a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: RejectBattleInviteNotification.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<q1, b> implements r1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b V2() {
            copyOnWrite();
            ((q1) this.instance).clearMessage();
            return this;
        }

        public b W2(com.wufan.friend.chat.protocol.a aVar) {
            copyOnWrite();
            ((q1) this.instance).f3(aVar);
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((q1) this.instance).d3();
            return this;
        }

        public b X2(a.b bVar) {
            copyOnWrite();
            ((q1) this.instance).s3(bVar);
            return this;
        }

        public b Y2(com.wufan.friend.chat.protocol.a aVar) {
            copyOnWrite();
            ((q1) this.instance).t3(aVar);
            return this;
        }

        public b Z2(String str) {
            copyOnWrite();
            ((q1) this.instance).setMessage(str);
            return this;
        }

        public b a3(ByteString byteString) {
            copyOnWrite();
            ((q1) this.instance).setMessageBytes(byteString);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.r1
        public boolean e() {
            return ((q1) this.instance).e();
        }

        @Override // com.wufan.friend.chat.protocol.r1
        public com.wufan.friend.chat.protocol.a g() {
            return ((q1) this.instance).g();
        }

        @Override // com.wufan.friend.chat.protocol.r1
        public String getMessage() {
            return ((q1) this.instance).getMessage();
        }

        @Override // com.wufan.friend.chat.protocol.r1
        public ByteString getMessageBytes() {
            return ((q1) this.instance).getMessageBytes();
        }

        private b() {
            super(q1.f65156f);
        }
    }

    static {
        q1 q1Var = new q1();
        f65156f = q1Var;
        q1Var.makeImmutable();
    }

    private q1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.f65159c = e3().getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d3() {
        this.f65158b = null;
    }

    public static q1 e3() {
        return f65156f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f3(com.wufan.friend.chat.protocol.a aVar) {
        com.wufan.friend.chat.protocol.a aVar2 = this.f65158b;
        if (aVar2 != null && aVar2 != com.wufan.friend.chat.protocol.a.q3()) {
            this.f65158b = com.wufan.friend.chat.protocol.a.s3(this.f65158b).mergeFrom((a.b) aVar).buildPartial();
        } else {
            this.f65158b = aVar;
        }
    }

    public static b g3() {
        return f65156f.toBuilder();
    }

    public static b h3(q1 q1Var) {
        return f65156f.toBuilder().mergeFrom((b) q1Var);
    }

    public static q1 i3(InputStream inputStream) throws IOException {
        return (q1) GeneratedMessageLite.parseDelimitedFrom(f65156f, inputStream);
    }

    public static q1 j3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (q1) GeneratedMessageLite.parseDelimitedFrom(f65156f, inputStream, extensionRegistryLite);
    }

    public static q1 k3(ByteString byteString) throws InvalidProtocolBufferException {
        return (q1) GeneratedMessageLite.parseFrom(f65156f, byteString);
    }

    public static q1 l3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (q1) GeneratedMessageLite.parseFrom(f65156f, byteString, extensionRegistryLite);
    }

    public static q1 m3(CodedInputStream codedInputStream) throws IOException {
        return (q1) GeneratedMessageLite.parseFrom(f65156f, codedInputStream);
    }

    public static q1 n3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (q1) GeneratedMessageLite.parseFrom(f65156f, codedInputStream, extensionRegistryLite);
    }

    public static q1 o3(InputStream inputStream) throws IOException {
        return (q1) GeneratedMessageLite.parseFrom(f65156f, inputStream);
    }

    public static q1 p3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (q1) GeneratedMessageLite.parseFrom(f65156f, inputStream, extensionRegistryLite);
    }

    public static Parser<q1> parser() {
        return f65156f.getParserForType();
    }

    public static q1 q3(byte[] bArr) throws InvalidProtocolBufferException {
        return (q1) GeneratedMessageLite.parseFrom(f65156f, bArr);
    }

    public static q1 r3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (q1) GeneratedMessageLite.parseFrom(f65156f, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3(a.b bVar) {
        this.f65158b = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        Objects.requireNonNull(str);
        this.f65159c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65159c = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t3(com.wufan.friend.chat.protocol.a aVar) {
        Objects.requireNonNull(aVar);
        this.f65158b = aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65160a[methodToInvoke.ordinal()]) {
            case 1:
                return new q1();
            case 2:
                return f65156f;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                q1 q1Var = (q1) obj2;
                this.f65158b = (com.wufan.friend.chat.protocol.a) visitor.visitMessage(this.f65158b, q1Var.f65158b);
                this.f65159c = visitor.visitString(!this.f65159c.isEmpty(), this.f65159c, true ^ q1Var.f65159c.isEmpty(), q1Var.f65159c);
                GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z4 = false;
                while (!z4) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                com.wufan.friend.chat.protocol.a aVar = this.f65158b;
                                a.b builder = aVar != null ? aVar.toBuilder() : null;
                                com.wufan.friend.chat.protocol.a aVar2 = (com.wufan.friend.chat.protocol.a) codedInputStream.readMessage(com.wufan.friend.chat.protocol.a.parser(), extensionRegistryLite);
                                this.f65158b = aVar2;
                                if (builder != null) {
                                    builder.mergeFrom((a.b) aVar2);
                                    this.f65158b = builder.buildPartial();
                                }
                            } else if (readTag != 18) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f65159c = codedInputStream.readStringRequireUtf8();
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
                if (f65157g == null) {
                    synchronized (q1.class) {
                        if (f65157g == null) {
                            f65157g = new GeneratedMessageLite.DefaultInstanceBasedParser(f65156f);
                        }
                    }
                }
                return f65157g;
            default:
                throw new UnsupportedOperationException();
        }
        return f65156f;
    }

    @Override // com.wufan.friend.chat.protocol.r1
    public boolean e() {
        return this.f65158b != null;
    }

    @Override // com.wufan.friend.chat.protocol.r1
    public com.wufan.friend.chat.protocol.a g() {
        com.wufan.friend.chat.protocol.a aVar = this.f65158b;
        return aVar == null ? com.wufan.friend.chat.protocol.a.q3() : aVar;
    }

    @Override // com.wufan.friend.chat.protocol.r1
    public String getMessage() {
        return this.f65159c;
    }

    @Override // com.wufan.friend.chat.protocol.r1
    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.f65159c);
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int computeMessageSize = this.f65158b != null ? 0 + CodedOutputStream.computeMessageSize(1, g()) : 0;
        if (!this.f65159c.isEmpty()) {
            computeMessageSize += CodedOutputStream.computeStringSize(2, getMessage());
        }
        this.memoizedSerializedSize = computeMessageSize;
        return computeMessageSize;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f65158b != null) {
            codedOutputStream.writeMessage(1, g());
        }
        if (this.f65159c.isEmpty()) {
            return;
        }
        codedOutputStream.writeString(2, getMessage());
    }
}
