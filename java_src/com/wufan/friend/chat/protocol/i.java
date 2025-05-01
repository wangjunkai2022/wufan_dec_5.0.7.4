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
/* compiled from: ChatMessageArgs.java */
/* loaded from: classes6.dex */
public final class i extends GeneratedMessageLite<i, b> implements j {

    /* renamed from: c  reason: collision with root package name */
    public static final int f65073c = 1;

    /* renamed from: d  reason: collision with root package name */
    private static final i f65074d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile Parser<i> f65075e;

    /* renamed from: b  reason: collision with root package name */
    private String f65076b = "";

    /* compiled from: ChatMessageArgs.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65077a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65077a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65077a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65077a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65077a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65077a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65077a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65077a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65077a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: ChatMessageArgs.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<i, b> implements j {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b V2(String str) {
            copyOnWrite();
            ((i) this.instance).setMessage(str);
            return this;
        }

        public b W2(ByteString byteString) {
            copyOnWrite();
            ((i) this.instance).setMessageBytes(byteString);
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((i) this.instance).clearMessage();
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.j
        public String getMessage() {
            return ((i) this.instance).getMessage();
        }

        @Override // com.wufan.friend.chat.protocol.j
        public ByteString getMessageBytes() {
            return ((i) this.instance).getMessageBytes();
        }

        private b() {
            super(i.f65074d);
        }
    }

    static {
        i iVar = new i();
        f65074d = iVar;
        iVar.makeImmutable();
    }

    private i() {
    }

    public static i Z2() {
        return f65074d;
    }

    public static b a3() {
        return f65074d.toBuilder();
    }

    public static b b3(i iVar) {
        return f65074d.toBuilder().mergeFrom((b) iVar);
    }

    public static i c3(InputStream inputStream) throws IOException {
        return (i) GeneratedMessageLite.parseDelimitedFrom(f65074d, inputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.f65076b = Z2().getMessage();
    }

    public static i d3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (i) GeneratedMessageLite.parseDelimitedFrom(f65074d, inputStream, extensionRegistryLite);
    }

    public static i e3(ByteString byteString) throws InvalidProtocolBufferException {
        return (i) GeneratedMessageLite.parseFrom(f65074d, byteString);
    }

    public static i f3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (i) GeneratedMessageLite.parseFrom(f65074d, byteString, extensionRegistryLite);
    }

    public static i g3(CodedInputStream codedInputStream) throws IOException {
        return (i) GeneratedMessageLite.parseFrom(f65074d, codedInputStream);
    }

    public static i h3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (i) GeneratedMessageLite.parseFrom(f65074d, codedInputStream, extensionRegistryLite);
    }

    public static i i3(InputStream inputStream) throws IOException {
        return (i) GeneratedMessageLite.parseFrom(f65074d, inputStream);
    }

    public static i j3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (i) GeneratedMessageLite.parseFrom(f65074d, inputStream, extensionRegistryLite);
    }

    public static i k3(byte[] bArr) throws InvalidProtocolBufferException {
        return (i) GeneratedMessageLite.parseFrom(f65074d, bArr);
    }

    public static i l3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (i) GeneratedMessageLite.parseFrom(f65074d, bArr, extensionRegistryLite);
    }

    public static Parser<i> parser() {
        return f65074d.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        Objects.requireNonNull(str);
        this.f65076b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65076b = byteString.toStringUtf8();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65077a[methodToInvoke.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return f65074d;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                i iVar = (i) obj2;
                this.f65076b = ((GeneratedMessageLite.Visitor) obj).visitString(!this.f65076b.isEmpty(), this.f65076b, true ^ iVar.f65076b.isEmpty(), iVar.f65076b);
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
                                this.f65076b = codedInputStream.readStringRequireUtf8();
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
                if (f65075e == null) {
                    synchronized (i.class) {
                        if (f65075e == null) {
                            f65075e = new GeneratedMessageLite.DefaultInstanceBasedParser(f65074d);
                        }
                    }
                }
                return f65075e;
            default:
                throw new UnsupportedOperationException();
        }
        return f65074d;
    }

    @Override // com.wufan.friend.chat.protocol.j
    public String getMessage() {
        return this.f65076b;
    }

    @Override // com.wufan.friend.chat.protocol.j
    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.f65076b);
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int computeStringSize = this.f65076b.isEmpty() ? 0 : 0 + CodedOutputStream.computeStringSize(1, getMessage());
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f65076b.isEmpty()) {
            return;
        }
        codedOutputStream.writeString(1, getMessage());
    }
}
