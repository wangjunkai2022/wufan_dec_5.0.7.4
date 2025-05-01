package com.wufan.user.service.protobuf;

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
/* compiled from: MemberTitleInfo.java */
/* loaded from: classes6.dex */
public final class h extends GeneratedMessageLite<h, b> implements i {

    /* renamed from: e  reason: collision with root package name */
    public static final int f65398e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f65399f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f65400g = 3;

    /* renamed from: h  reason: collision with root package name */
    private static final h f65401h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile Parser<h> f65402i;

    /* renamed from: c  reason: collision with root package name */
    private int f65404c;

    /* renamed from: b  reason: collision with root package name */
    private String f65403b = "";

    /* renamed from: d  reason: collision with root package name */
    private String f65405d = "";

    /* compiled from: MemberTitleInfo.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65406a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65406a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65406a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65406a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65406a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65406a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65406a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65406a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65406a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: MemberTitleInfo.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<h, b> implements i {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b V2() {
            copyOnWrite();
            ((h) this.instance).clearBattleTitleColor();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((h) this.instance).e3();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((h) this.instance).clearBattleTitle();
            return this;
        }

        public b X2(String str) {
            copyOnWrite();
            ((h) this.instance).setBattleTitle(str);
            return this;
        }

        public b Y2(ByteString byteString) {
            copyOnWrite();
            ((h) this.instance).setBattleTitleBytes(byteString);
            return this;
        }

        public b Z2(String str) {
            copyOnWrite();
            ((h) this.instance).setBattleTitleColor(str);
            return this;
        }

        public b a3(ByteString byteString) {
            copyOnWrite();
            ((h) this.instance).setBattleTitleColorBytes(byteString);
            return this;
        }

        public b b3(int i4) {
            copyOnWrite();
            ((h) this.instance).s3(i4);
            return this;
        }

        @Override // com.wufan.user.service.protobuf.i
        public String getBattleTitle() {
            return ((h) this.instance).getBattleTitle();
        }

        @Override // com.wufan.user.service.protobuf.i
        public ByteString getBattleTitleBytes() {
            return ((h) this.instance).getBattleTitleBytes();
        }

        @Override // com.wufan.user.service.protobuf.i
        public String getBattleTitleColor() {
            return ((h) this.instance).getBattleTitleColor();
        }

        @Override // com.wufan.user.service.protobuf.i
        public ByteString getBattleTitleColorBytes() {
            return ((h) this.instance).getBattleTitleColorBytes();
        }

        @Override // com.wufan.user.service.protobuf.i
        public int i() {
            return ((h) this.instance).i();
        }

        private b() {
            super(h.f65401h);
        }
    }

    static {
        h hVar = new h();
        f65401h = hVar;
        hVar.makeImmutable();
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBattleTitle() {
        this.f65403b = f3().getBattleTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBattleTitleColor() {
        this.f65405d = f3().getBattleTitleColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e3() {
        this.f65404c = 0;
    }

    public static h f3() {
        return f65401h;
    }

    public static b g3() {
        return f65401h.toBuilder();
    }

    public static b h3(h hVar) {
        return f65401h.toBuilder().mergeFrom((b) hVar);
    }

    public static h i3(InputStream inputStream) throws IOException {
        return (h) GeneratedMessageLite.parseDelimitedFrom(f65401h, inputStream);
    }

    public static h j3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (h) GeneratedMessageLite.parseDelimitedFrom(f65401h, inputStream, extensionRegistryLite);
    }

    public static h k3(ByteString byteString) throws InvalidProtocolBufferException {
        return (h) GeneratedMessageLite.parseFrom(f65401h, byteString);
    }

    public static h l3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (h) GeneratedMessageLite.parseFrom(f65401h, byteString, extensionRegistryLite);
    }

    public static h m3(CodedInputStream codedInputStream) throws IOException {
        return (h) GeneratedMessageLite.parseFrom(f65401h, codedInputStream);
    }

    public static h n3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (h) GeneratedMessageLite.parseFrom(f65401h, codedInputStream, extensionRegistryLite);
    }

    public static h o3(InputStream inputStream) throws IOException {
        return (h) GeneratedMessageLite.parseFrom(f65401h, inputStream);
    }

    public static h p3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (h) GeneratedMessageLite.parseFrom(f65401h, inputStream, extensionRegistryLite);
    }

    public static Parser<h> parser() {
        return f65401h.getParserForType();
    }

    public static h q3(byte[] bArr) throws InvalidProtocolBufferException {
        return (h) GeneratedMessageLite.parseFrom(f65401h, bArr);
    }

    public static h r3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (h) GeneratedMessageLite.parseFrom(f65401h, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3(int i4) {
        this.f65404c = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBattleTitle(String str) {
        Objects.requireNonNull(str);
        this.f65403b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBattleTitleBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65403b = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBattleTitleColor(String str) {
        Objects.requireNonNull(str);
        this.f65405d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBattleTitleColorBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f65405d = byteString.toStringUtf8();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65406a[methodToInvoke.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return f65401h;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                h hVar = (h) obj2;
                this.f65403b = visitor.visitString(!this.f65403b.isEmpty(), this.f65403b, !hVar.f65403b.isEmpty(), hVar.f65403b);
                int i4 = this.f65404c;
                boolean z4 = i4 != 0;
                int i5 = hVar.f65404c;
                this.f65404c = visitor.visitInt(z4, i4, i5 != 0, i5);
                this.f65405d = visitor.visitString(!this.f65405d.isEmpty(), this.f65405d, !hVar.f65405d.isEmpty(), hVar.f65405d);
                GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!r1) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.f65403b = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.f65404c = codedInputStream.readInt32();
                            } else if (readTag != 26) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f65405d = codedInputStream.readStringRequireUtf8();
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
                if (f65402i == null) {
                    synchronized (h.class) {
                        if (f65402i == null) {
                            f65402i = new GeneratedMessageLite.DefaultInstanceBasedParser(f65401h);
                        }
                    }
                }
                return f65402i;
            default:
                throw new UnsupportedOperationException();
        }
        return f65401h;
    }

    @Override // com.wufan.user.service.protobuf.i
    public String getBattleTitle() {
        return this.f65403b;
    }

    @Override // com.wufan.user.service.protobuf.i
    public ByteString getBattleTitleBytes() {
        return ByteString.copyFromUtf8(this.f65403b);
    }

    @Override // com.wufan.user.service.protobuf.i
    public String getBattleTitleColor() {
        return this.f65405d;
    }

    @Override // com.wufan.user.service.protobuf.i
    public ByteString getBattleTitleColorBytes() {
        return ByteString.copyFromUtf8(this.f65405d);
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int computeStringSize = this.f65403b.isEmpty() ? 0 : 0 + CodedOutputStream.computeStringSize(1, getBattleTitle());
        int i5 = this.f65404c;
        if (i5 != 0) {
            computeStringSize += CodedOutputStream.computeInt32Size(2, i5);
        }
        if (!this.f65405d.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(3, getBattleTitleColor());
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    @Override // com.wufan.user.service.protobuf.i
    public int i() {
        return this.f65404c;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f65403b.isEmpty()) {
            codedOutputStream.writeString(1, getBattleTitle());
        }
        int i4 = this.f65404c;
        if (i4 != 0) {
            codedOutputStream.writeInt32(2, i4);
        }
        if (this.f65405d.isEmpty()) {
            return;
        }
        codedOutputStream.writeString(3, getBattleTitleColor());
    }
}
