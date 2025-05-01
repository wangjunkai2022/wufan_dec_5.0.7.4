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
/* compiled from: LoginData.java */
/* loaded from: classes6.dex */
public final class v0 extends GeneratedMessageLite<v0, b> implements w0 {

    /* renamed from: d  reason: collision with root package name */
    public static final int f65242d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f65243e = 2;

    /* renamed from: f  reason: collision with root package name */
    private static final v0 f65244f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile Parser<v0> f65245g;

    /* renamed from: b  reason: collision with root package name */
    private boolean f65246b;

    /* renamed from: c  reason: collision with root package name */
    private String f65247c = "";

    /* compiled from: LoginData.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65248a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65248a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65248a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65248a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65248a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65248a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65248a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65248a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65248a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: LoginData.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<v0, b> implements w0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.friend.chat.protocol.w0
        public boolean D0() {
            return ((v0) this.instance).D0();
        }

        public b V2() {
            copyOnWrite();
            ((v0) this.instance).b3();
            return this;
        }

        public b W2(String str) {
            copyOnWrite();
            ((v0) this.instance).setMessage(str);
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((v0) this.instance).clearMessage();
            return this;
        }

        public b X2(ByteString byteString) {
            copyOnWrite();
            ((v0) this.instance).setMessageBytes(byteString);
            return this;
        }

        public b Y2(boolean z4) {
            copyOnWrite();
            ((v0) this.instance).p3(z4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.w0
        public String getMessage() {
            return ((v0) this.instance).getMessage();
        }

        @Override // com.wufan.friend.chat.protocol.w0
        public ByteString getMessageBytes() {
            return ((v0) this.instance).getMessageBytes();
        }

        private b() {
            super(v0.f65244f);
        }
    }

    static {
        v0 v0Var = new v0();
        f65244f = v0Var;
        v0Var.makeImmutable();
    }

    private v0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b3() {
        this.f65246b = false;
    }

    public static v0 c3() {
        return f65244f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.f65247c = c3().getMessage();
    }

    public static b d3() {
        return f65244f.toBuilder();
    }

    public static b e3(v0 v0Var) {
        return f65244f.toBuilder().mergeFrom((b) v0Var);
    }

    public static v0 f3(InputStream inputStream) throws IOException {
        return (v0) GeneratedMessageLite.parseDelimitedFrom(f65244f, inputStream);
    }

    public static v0 g3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (v0) GeneratedMessageLite.parseDelimitedFrom(f65244f, inputStream, extensionRegistryLite);
    }

    public static v0 h3(ByteString byteString) throws InvalidProtocolBufferException {
        return (v0) GeneratedMessageLite.parseFrom(f65244f, byteString);
    }

    public static v0 i3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (v0) GeneratedMessageLite.parseFrom(f65244f, byteString, extensionRegistryLite);
    }

    public static v0 j3(CodedInputStream codedInputStream) throws IOException {
        return (v0) GeneratedMessageLite.parseFrom(f65244f, codedInputStream);
    }

    public static v0 k3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (v0) GeneratedMessageLite.parseFrom(f65244f, codedInputStream, extensionRegistryLite);
    }

    public static v0 l3(InputStream inputStream) throws IOException {
        return (v0) GeneratedMessageLite.parseFrom(f65244f, inputStream);
    }

    public static v0 m3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (v0) GeneratedMessageLite.parseFrom(f65244f, inputStream, extensionRegistryLite);
    }

    public static v0 n3(byte[] bArr) throws InvalidProtocolBufferException {
        return (v0) GeneratedMessageLite.parseFrom(f65244f, bArr);
    }

    public static v0 o3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (v0) GeneratedMessageLite.parseFrom(f65244f, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p3(boolean z4) {
        this.f65246b = z4;
    }

    public static Parser<v0> parser() {
        return f65244f.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        Objects.requireNonNull(str);
        this.f65247c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65247c = byteString.toStringUtf8();
    }

    @Override // com.wufan.friend.chat.protocol.w0
    public boolean D0() {
        return this.f65246b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65248a[methodToInvoke.ordinal()]) {
            case 1:
                return new v0();
            case 2:
                return f65244f;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                v0 v0Var = (v0) obj2;
                boolean z4 = this.f65246b;
                boolean z5 = v0Var.f65246b;
                this.f65246b = visitor.visitBoolean(z4, z4, z5, z5);
                this.f65247c = visitor.visitString(!this.f65247c.isEmpty(), this.f65247c, true ^ v0Var.f65247c.isEmpty(), v0Var.f65247c);
                GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z6 = false;
                while (!z6) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f65246b = codedInputStream.readBool();
                            } else if (readTag != 18) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f65247c = codedInputStream.readStringRequireUtf8();
                            }
                        }
                        z6 = true;
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
                if (f65245g == null) {
                    synchronized (v0.class) {
                        if (f65245g == null) {
                            f65245g = new GeneratedMessageLite.DefaultInstanceBasedParser(f65244f);
                        }
                    }
                }
                return f65245g;
            default:
                throw new UnsupportedOperationException();
        }
        return f65244f;
    }

    @Override // com.wufan.friend.chat.protocol.w0
    public String getMessage() {
        return this.f65247c;
    }

    @Override // com.wufan.friend.chat.protocol.w0
    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.f65247c);
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        boolean z4 = this.f65246b;
        int computeBoolSize = z4 ? 0 + CodedOutputStream.computeBoolSize(1, z4) : 0;
        if (!this.f65247c.isEmpty()) {
            computeBoolSize += CodedOutputStream.computeStringSize(2, getMessage());
        }
        this.memoizedSerializedSize = computeBoolSize;
        return computeBoolSize;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean z4 = this.f65246b;
        if (z4) {
            codedOutputStream.writeBool(1, z4);
        }
        if (this.f65247c.isEmpty()) {
            return;
        }
        codedOutputStream.writeString(2, getMessage());
    }
}
