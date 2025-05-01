package com.wufan.friend.chat.protocol;

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
/* compiled from: PlayerBannedNotification.java */
/* loaded from: classes6.dex */
public final class f1 extends GeneratedMessageLite<f1, b> implements g1 {

    /* renamed from: c  reason: collision with root package name */
    public static final int f65034c = 1;

    /* renamed from: d  reason: collision with root package name */
    private static final f1 f65035d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile Parser<f1> f65036e;

    /* renamed from: b  reason: collision with root package name */
    private com.wufan.friend.chat.protocol.a f65037b;

    /* compiled from: PlayerBannedNotification.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65038a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65038a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65038a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65038a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65038a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65038a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65038a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65038a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65038a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: PlayerBannedNotification.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<f1, b> implements g1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.friend.chat.protocol.g1
        public com.wufan.friend.chat.protocol.a S2() {
            return ((f1) this.instance).S2();
        }

        public b V2(com.wufan.friend.chat.protocol.a aVar) {
            copyOnWrite();
            ((f1) this.instance).c3(aVar);
            return this;
        }

        public b W2(a.b bVar) {
            copyOnWrite();
            ((f1) this.instance).p3(bVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.g1
        public boolean X() {
            return ((f1) this.instance).X();
        }

        public b X0() {
            copyOnWrite();
            ((f1) this.instance).a3();
            return this;
        }

        public b X2(com.wufan.friend.chat.protocol.a aVar) {
            copyOnWrite();
            ((f1) this.instance).q3(aVar);
            return this;
        }

        private b() {
            super(f1.f65035d);
        }
    }

    static {
        f1 f1Var = new f1();
        f65035d = f1Var;
        f1Var.makeImmutable();
    }

    private f1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a3() {
        this.f65037b = null;
    }

    public static f1 b3() {
        return f65035d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3(com.wufan.friend.chat.protocol.a aVar) {
        com.wufan.friend.chat.protocol.a aVar2 = this.f65037b;
        if (aVar2 != null && aVar2 != com.wufan.friend.chat.protocol.a.q3()) {
            this.f65037b = com.wufan.friend.chat.protocol.a.s3(this.f65037b).mergeFrom((a.b) aVar).buildPartial();
        } else {
            this.f65037b = aVar;
        }
    }

    public static b d3() {
        return f65035d.toBuilder();
    }

    public static b e3(f1 f1Var) {
        return f65035d.toBuilder().mergeFrom((b) f1Var);
    }

    public static f1 f3(InputStream inputStream) throws IOException {
        return (f1) GeneratedMessageLite.parseDelimitedFrom(f65035d, inputStream);
    }

    public static f1 g3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (f1) GeneratedMessageLite.parseDelimitedFrom(f65035d, inputStream, extensionRegistryLite);
    }

    public static f1 h3(ByteString byteString) throws InvalidProtocolBufferException {
        return (f1) GeneratedMessageLite.parseFrom(f65035d, byteString);
    }

    public static f1 i3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (f1) GeneratedMessageLite.parseFrom(f65035d, byteString, extensionRegistryLite);
    }

    public static f1 j3(CodedInputStream codedInputStream) throws IOException {
        return (f1) GeneratedMessageLite.parseFrom(f65035d, codedInputStream);
    }

    public static f1 k3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (f1) GeneratedMessageLite.parseFrom(f65035d, codedInputStream, extensionRegistryLite);
    }

    public static f1 l3(InputStream inputStream) throws IOException {
        return (f1) GeneratedMessageLite.parseFrom(f65035d, inputStream);
    }

    public static f1 m3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (f1) GeneratedMessageLite.parseFrom(f65035d, inputStream, extensionRegistryLite);
    }

    public static f1 n3(byte[] bArr) throws InvalidProtocolBufferException {
        return (f1) GeneratedMessageLite.parseFrom(f65035d, bArr);
    }

    public static f1 o3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (f1) GeneratedMessageLite.parseFrom(f65035d, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p3(a.b bVar) {
        this.f65037b = bVar.build();
    }

    public static Parser<f1> parser() {
        return f65035d.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q3(com.wufan.friend.chat.protocol.a aVar) {
        Objects.requireNonNull(aVar);
        this.f65037b = aVar;
    }

    @Override // com.wufan.friend.chat.protocol.g1
    public com.wufan.friend.chat.protocol.a S2() {
        com.wufan.friend.chat.protocol.a aVar = this.f65037b;
        return aVar == null ? com.wufan.friend.chat.protocol.a.q3() : aVar;
    }

    @Override // com.wufan.friend.chat.protocol.g1
    public boolean X() {
        return this.f65037b != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65038a[methodToInvoke.ordinal()]) {
            case 1:
                return new f1();
            case 2:
                return f65035d;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                this.f65037b = (com.wufan.friend.chat.protocol.a) ((GeneratedMessageLite.Visitor) obj).visitMessage(this.f65037b, ((f1) obj2).f65037b);
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
                            if (readTag != 10) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                com.wufan.friend.chat.protocol.a aVar = this.f65037b;
                                a.b builder = aVar != null ? aVar.toBuilder() : null;
                                com.wufan.friend.chat.protocol.a aVar2 = (com.wufan.friend.chat.protocol.a) codedInputStream.readMessage(com.wufan.friend.chat.protocol.a.parser(), extensionRegistryLite);
                                this.f65037b = aVar2;
                                if (builder != null) {
                                    builder.mergeFrom((a.b) aVar2);
                                    this.f65037b = builder.buildPartial();
                                }
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
                if (f65036e == null) {
                    synchronized (f1.class) {
                        if (f65036e == null) {
                            f65036e = new GeneratedMessageLite.DefaultInstanceBasedParser(f65035d);
                        }
                    }
                }
                return f65036e;
            default:
                throw new UnsupportedOperationException();
        }
        return f65035d;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int computeMessageSize = this.f65037b != null ? 0 + CodedOutputStream.computeMessageSize(1, S2()) : 0;
        this.memoizedSerializedSize = computeMessageSize;
        return computeMessageSize;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f65037b != null) {
            codedOutputStream.writeMessage(1, S2());
        }
    }
}
