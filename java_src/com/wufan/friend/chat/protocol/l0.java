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
/* compiled from: KickNotification.java */
/* loaded from: classes6.dex */
public final class l0 extends GeneratedMessageLite<l0, b> implements m0 {

    /* renamed from: c  reason: collision with root package name */
    public static final int f65111c = 1;

    /* renamed from: d  reason: collision with root package name */
    private static final l0 f65112d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile Parser<l0> f65113e;

    /* renamed from: b  reason: collision with root package name */
    private String f65114b = "";

    /* compiled from: KickNotification.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65115a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65115a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65115a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65115a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65115a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65115a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65115a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65115a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65115a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: KickNotification.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<l0, b> implements m0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.friend.chat.protocol.m0
        public String N1() {
            return ((l0) this.instance).N1();
        }

        public b V2(String str) {
            copyOnWrite();
            ((l0) this.instance).n3(str);
            return this;
        }

        public b W2(ByteString byteString) {
            copyOnWrite();
            ((l0) this.instance).o3(byteString);
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((l0) this.instance).Z2();
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.m0
        public ByteString d2() {
            return ((l0) this.instance).d2();
        }

        private b() {
            super(l0.f65112d);
        }
    }

    static {
        l0 l0Var = new l0();
        f65112d = l0Var;
        l0Var.makeImmutable();
    }

    private l0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z2() {
        this.f65114b = a3().N1();
    }

    public static l0 a3() {
        return f65112d;
    }

    public static b b3() {
        return f65112d.toBuilder();
    }

    public static b c3(l0 l0Var) {
        return f65112d.toBuilder().mergeFrom((b) l0Var);
    }

    public static l0 d3(InputStream inputStream) throws IOException {
        return (l0) GeneratedMessageLite.parseDelimitedFrom(f65112d, inputStream);
    }

    public static l0 e3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (l0) GeneratedMessageLite.parseDelimitedFrom(f65112d, inputStream, extensionRegistryLite);
    }

    public static l0 f3(ByteString byteString) throws InvalidProtocolBufferException {
        return (l0) GeneratedMessageLite.parseFrom(f65112d, byteString);
    }

    public static l0 g3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (l0) GeneratedMessageLite.parseFrom(f65112d, byteString, extensionRegistryLite);
    }

    public static l0 h3(CodedInputStream codedInputStream) throws IOException {
        return (l0) GeneratedMessageLite.parseFrom(f65112d, codedInputStream);
    }

    public static l0 i3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (l0) GeneratedMessageLite.parseFrom(f65112d, codedInputStream, extensionRegistryLite);
    }

    public static l0 j3(InputStream inputStream) throws IOException {
        return (l0) GeneratedMessageLite.parseFrom(f65112d, inputStream);
    }

    public static l0 k3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (l0) GeneratedMessageLite.parseFrom(f65112d, inputStream, extensionRegistryLite);
    }

    public static l0 l3(byte[] bArr) throws InvalidProtocolBufferException {
        return (l0) GeneratedMessageLite.parseFrom(f65112d, bArr);
    }

    public static l0 m3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (l0) GeneratedMessageLite.parseFrom(f65112d, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n3(String str) {
        Objects.requireNonNull(str);
        this.f65114b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o3(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65114b = byteString.toStringUtf8();
    }

    public static Parser<l0> parser() {
        return f65112d.getParserForType();
    }

    @Override // com.wufan.friend.chat.protocol.m0
    public String N1() {
        return this.f65114b;
    }

    @Override // com.wufan.friend.chat.protocol.m0
    public ByteString d2() {
        return ByteString.copyFromUtf8(this.f65114b);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65115a[methodToInvoke.ordinal()]) {
            case 1:
                return new l0();
            case 2:
                return f65112d;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                l0 l0Var = (l0) obj2;
                this.f65114b = ((GeneratedMessageLite.Visitor) obj).visitString(!this.f65114b.isEmpty(), this.f65114b, true ^ l0Var.f65114b.isEmpty(), l0Var.f65114b);
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
                                this.f65114b = codedInputStream.readStringRequireUtf8();
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
                if (f65113e == null) {
                    synchronized (l0.class) {
                        if (f65113e == null) {
                            f65113e = new GeneratedMessageLite.DefaultInstanceBasedParser(f65112d);
                        }
                    }
                }
                return f65113e;
            default:
                throw new UnsupportedOperationException();
        }
        return f65112d;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int computeStringSize = this.f65114b.isEmpty() ? 0 : 0 + CodedOutputStream.computeStringSize(1, N1());
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f65114b.isEmpty()) {
            return;
        }
        codedOutputStream.writeString(1, N1());
    }
}
