package com.wufan.friend.chat.protocol;

import com.google.protobuf.AbstractMessageLite;
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
/* compiled from: LoginArgs.java */
/* loaded from: classes6.dex */
public final class t0 extends GeneratedMessageLite<t0, b> implements u0 {

    /* renamed from: e  reason: collision with root package name */
    public static final int f65203e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f65204f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f65205g = 3;

    /* renamed from: h  reason: collision with root package name */
    private static final t0 f65206h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile Parser<t0> f65207i;

    /* renamed from: b  reason: collision with root package name */
    private int f65208b;

    /* renamed from: c  reason: collision with root package name */
    private String f65209c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f65210d = "";

    /* compiled from: LoginArgs.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65211a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65211a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65211a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65211a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65211a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65211a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65211a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65211a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65211a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: LoginArgs.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<t0, b> implements u0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b V2() {
            copyOnWrite();
            ((t0) this.instance).clearNickname();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((t0) this.instance).clearToken();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((t0) this.instance).e3();
            return this;
        }

        public b X2(int i4) {
            copyOnWrite();
            ((t0) this.instance).s3(i4);
            return this;
        }

        public b Y2(String str) {
            copyOnWrite();
            ((t0) this.instance).setNickname(str);
            return this;
        }

        public b Z2(ByteString byteString) {
            copyOnWrite();
            ((t0) this.instance).setNicknameBytes(byteString);
            return this;
        }

        public b a3(String str) {
            copyOnWrite();
            ((t0) this.instance).setToken(str);
            return this;
        }

        public b b3(ByteString byteString) {
            copyOnWrite();
            ((t0) this.instance).setTokenBytes(byteString);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.u0
        public int d() {
            return ((t0) this.instance).d();
        }

        @Override // com.wufan.friend.chat.protocol.u0
        public String getNickname() {
            return ((t0) this.instance).getNickname();
        }

        @Override // com.wufan.friend.chat.protocol.u0
        public ByteString getNicknameBytes() {
            return ((t0) this.instance).getNicknameBytes();
        }

        @Override // com.wufan.friend.chat.protocol.u0
        public String getToken() {
            return ((t0) this.instance).getToken();
        }

        @Override // com.wufan.friend.chat.protocol.u0
        public ByteString getTokenBytes() {
            return ((t0) this.instance).getTokenBytes();
        }

        private b() {
            super(t0.f65206h);
        }
    }

    static {
        t0 t0Var = new t0();
        f65206h = t0Var;
        t0Var.makeImmutable();
    }

    private t0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNickname() {
        this.f65209c = f3().getNickname();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToken() {
        this.f65210d = f3().getToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e3() {
        this.f65208b = 0;
    }

    public static t0 f3() {
        return f65206h;
    }

    public static b g3() {
        return f65206h.toBuilder();
    }

    public static b h3(t0 t0Var) {
        return f65206h.toBuilder().mergeFrom((b) t0Var);
    }

    public static t0 i3(InputStream inputStream) throws IOException {
        return (t0) GeneratedMessageLite.parseDelimitedFrom(f65206h, inputStream);
    }

    public static t0 j3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (t0) GeneratedMessageLite.parseDelimitedFrom(f65206h, inputStream, extensionRegistryLite);
    }

    public static t0 k3(ByteString byteString) throws InvalidProtocolBufferException {
        return (t0) GeneratedMessageLite.parseFrom(f65206h, byteString);
    }

    public static t0 l3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (t0) GeneratedMessageLite.parseFrom(f65206h, byteString, extensionRegistryLite);
    }

    public static t0 m3(CodedInputStream codedInputStream) throws IOException {
        return (t0) GeneratedMessageLite.parseFrom(f65206h, codedInputStream);
    }

    public static t0 n3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (t0) GeneratedMessageLite.parseFrom(f65206h, codedInputStream, extensionRegistryLite);
    }

    public static t0 o3(InputStream inputStream) throws IOException {
        return (t0) GeneratedMessageLite.parseFrom(f65206h, inputStream);
    }

    public static t0 p3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (t0) GeneratedMessageLite.parseFrom(f65206h, inputStream, extensionRegistryLite);
    }

    public static Parser<t0> parser() {
        return f65206h.getParserForType();
    }

    public static t0 q3(byte[] bArr) throws InvalidProtocolBufferException {
        return (t0) GeneratedMessageLite.parseFrom(f65206h, bArr);
    }

    public static t0 r3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (t0) GeneratedMessageLite.parseFrom(f65206h, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3(int i4) {
        this.f65208b = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNickname(String str) {
        Objects.requireNonNull(str);
        this.f65209c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNicknameBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65209c = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToken(String str) {
        Objects.requireNonNull(str);
        this.f65210d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTokenBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65210d = byteString.toStringUtf8();
    }

    @Override // com.wufan.friend.chat.protocol.u0
    public int d() {
        return this.f65208b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65211a[methodToInvoke.ordinal()]) {
            case 1:
                return new t0();
            case 2:
                return f65206h;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                t0 t0Var = (t0) obj2;
                int i4 = this.f65208b;
                boolean z4 = i4 != 0;
                int i5 = t0Var.f65208b;
                this.f65208b = visitor.visitInt(z4, i4, i5 != 0, i5);
                this.f65209c = visitor.visitString(!this.f65209c.isEmpty(), this.f65209c, !t0Var.f65209c.isEmpty(), t0Var.f65209c);
                this.f65210d = visitor.visitString(!this.f65210d.isEmpty(), this.f65210d, !t0Var.f65210d.isEmpty(), t0Var.f65210d);
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
                                this.f65208b = codedInputStream.readInt32();
                            } else if (readTag == 18) {
                                this.f65209c = codedInputStream.readStringRequireUtf8();
                            } else if (readTag != 26) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f65210d = codedInputStream.readStringRequireUtf8();
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
                if (f65207i == null) {
                    synchronized (t0.class) {
                        if (f65207i == null) {
                            f65207i = new GeneratedMessageLite.DefaultInstanceBasedParser(f65206h);
                        }
                    }
                }
                return f65207i;
            default:
                throw new UnsupportedOperationException();
        }
        return f65206h;
    }

    @Override // com.wufan.friend.chat.protocol.u0
    public String getNickname() {
        return this.f65209c;
    }

    @Override // com.wufan.friend.chat.protocol.u0
    public ByteString getNicknameBytes() {
        return ByteString.copyFromUtf8(this.f65209c);
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int i5 = this.f65208b;
        int computeInt32Size = i5 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i5) : 0;
        if (!this.f65209c.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(2, getNickname());
        }
        if (!this.f65210d.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(3, getToken());
        }
        this.memoizedSerializedSize = computeInt32Size;
        return computeInt32Size;
    }

    @Override // com.wufan.friend.chat.protocol.u0
    public String getToken() {
        return this.f65210d;
    }

    @Override // com.wufan.friend.chat.protocol.u0
    public ByteString getTokenBytes() {
        return ByteString.copyFromUtf8(this.f65210d);
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i4 = this.f65208b;
        if (i4 != 0) {
            codedOutputStream.writeInt32(1, i4);
        }
        if (!this.f65209c.isEmpty()) {
            codedOutputStream.writeString(2, getNickname());
        }
        if (this.f65210d.isEmpty()) {
            return;
        }
        codedOutputStream.writeString(3, getToken());
    }
}
