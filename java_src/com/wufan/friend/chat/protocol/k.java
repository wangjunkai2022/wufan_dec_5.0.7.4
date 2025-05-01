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
/* compiled from: ChatMessageMuteData.java */
/* loaded from: classes6.dex */
public final class k extends GeneratedMessageLite<k, b> implements l {

    /* renamed from: d  reason: collision with root package name */
    public static final int f65104d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f65105e = 2;

    /* renamed from: f  reason: collision with root package name */
    private static final k f65106f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile Parser<k> f65107g;

    /* renamed from: b  reason: collision with root package name */
    private boolean f65108b;

    /* renamed from: c  reason: collision with root package name */
    private String f65109c = "";

    /* compiled from: ChatMessageMuteData.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65110a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65110a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65110a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65110a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65110a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65110a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65110a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65110a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65110a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: ChatMessageMuteData.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<k, b> implements l {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.friend.chat.protocol.l
        public boolean G0() {
            return ((k) this.instance).G0();
        }

        public b V2() {
            copyOnWrite();
            ((k) this.instance).b3();
            return this;
        }

        public b W2(String str) {
            copyOnWrite();
            ((k) this.instance).setMessage(str);
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((k) this.instance).clearMessage();
            return this;
        }

        public b X2(ByteString byteString) {
            copyOnWrite();
            ((k) this.instance).setMessageBytes(byteString);
            return this;
        }

        public b Y2(boolean z4) {
            copyOnWrite();
            ((k) this.instance).p3(z4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.l
        public String getMessage() {
            return ((k) this.instance).getMessage();
        }

        @Override // com.wufan.friend.chat.protocol.l
        public ByteString getMessageBytes() {
            return ((k) this.instance).getMessageBytes();
        }

        private b() {
            super(k.f65106f);
        }
    }

    static {
        k kVar = new k();
        f65106f = kVar;
        kVar.makeImmutable();
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b3() {
        this.f65108b = false;
    }

    public static k c3() {
        return f65106f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.f65109c = c3().getMessage();
    }

    public static b d3() {
        return f65106f.toBuilder();
    }

    public static b e3(k kVar) {
        return f65106f.toBuilder().mergeFrom((b) kVar);
    }

    public static k f3(InputStream inputStream) throws IOException {
        return (k) GeneratedMessageLite.parseDelimitedFrom(f65106f, inputStream);
    }

    public static k g3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (k) GeneratedMessageLite.parseDelimitedFrom(f65106f, inputStream, extensionRegistryLite);
    }

    public static k h3(ByteString byteString) throws InvalidProtocolBufferException {
        return (k) GeneratedMessageLite.parseFrom(f65106f, byteString);
    }

    public static k i3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (k) GeneratedMessageLite.parseFrom(f65106f, byteString, extensionRegistryLite);
    }

    public static k j3(CodedInputStream codedInputStream) throws IOException {
        return (k) GeneratedMessageLite.parseFrom(f65106f, codedInputStream);
    }

    public static k k3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (k) GeneratedMessageLite.parseFrom(f65106f, codedInputStream, extensionRegistryLite);
    }

    public static k l3(InputStream inputStream) throws IOException {
        return (k) GeneratedMessageLite.parseFrom(f65106f, inputStream);
    }

    public static k m3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (k) GeneratedMessageLite.parseFrom(f65106f, inputStream, extensionRegistryLite);
    }

    public static k n3(byte[] bArr) throws InvalidProtocolBufferException {
        return (k) GeneratedMessageLite.parseFrom(f65106f, bArr);
    }

    public static k o3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (k) GeneratedMessageLite.parseFrom(f65106f, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p3(boolean z4) {
        this.f65108b = z4;
    }

    public static Parser<k> parser() {
        return f65106f.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        Objects.requireNonNull(str);
        this.f65109c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65109c = byteString.toStringUtf8();
    }

    @Override // com.wufan.friend.chat.protocol.l
    public boolean G0() {
        return this.f65108b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65110a[methodToInvoke.ordinal()]) {
            case 1:
                return new k();
            case 2:
                return f65106f;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                k kVar = (k) obj2;
                boolean z4 = this.f65108b;
                boolean z5 = kVar.f65108b;
                this.f65108b = visitor.visitBoolean(z4, z4, z5, z5);
                this.f65109c = visitor.visitString(!this.f65109c.isEmpty(), this.f65109c, true ^ kVar.f65109c.isEmpty(), kVar.f65109c);
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
                                this.f65108b = codedInputStream.readBool();
                            } else if (readTag != 18) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f65109c = codedInputStream.readStringRequireUtf8();
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
                if (f65107g == null) {
                    synchronized (k.class) {
                        if (f65107g == null) {
                            f65107g = new GeneratedMessageLite.DefaultInstanceBasedParser(f65106f);
                        }
                    }
                }
                return f65107g;
            default:
                throw new UnsupportedOperationException();
        }
        return f65106f;
    }

    @Override // com.wufan.friend.chat.protocol.l
    public String getMessage() {
        return this.f65109c;
    }

    @Override // com.wufan.friend.chat.protocol.l
    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.f65109c);
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        boolean z4 = this.f65108b;
        int computeBoolSize = z4 ? 0 + CodedOutputStream.computeBoolSize(1, z4) : 0;
        if (!this.f65109c.isEmpty()) {
            computeBoolSize += CodedOutputStream.computeStringSize(2, getMessage());
        }
        this.memoizedSerializedSize = computeBoolSize;
        return computeBoolSize;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean z4 = this.f65108b;
        if (z4) {
            codedOutputStream.writeBool(1, z4);
        }
        if (this.f65109c.isEmpty()) {
            return;
        }
        codedOutputStream.writeString(2, getMessage());
    }
}
