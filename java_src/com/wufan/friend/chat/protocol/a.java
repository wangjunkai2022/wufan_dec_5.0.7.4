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
/* compiled from: AccountInfo.java */
/* loaded from: classes6.dex */
public final class a extends GeneratedMessageLite<a, b> implements com.wufan.friend.chat.protocol.b {

    /* renamed from: i  reason: collision with root package name */
    public static final int f64958i = 1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f64959j = 2;

    /* renamed from: k  reason: collision with root package name */
    public static final int f64960k = 3;

    /* renamed from: l  reason: collision with root package name */
    public static final int f64961l = 4;

    /* renamed from: m  reason: collision with root package name */
    public static final int f64962m = 5;

    /* renamed from: n  reason: collision with root package name */
    public static final int f64963n = 6;

    /* renamed from: o  reason: collision with root package name */
    public static final int f64964o = 7;

    /* renamed from: p  reason: collision with root package name */
    private static final a f64965p;

    /* renamed from: q  reason: collision with root package name */
    private static volatile Parser<a> f64966q;

    /* renamed from: b  reason: collision with root package name */
    private boolean f64967b;

    /* renamed from: c  reason: collision with root package name */
    private int f64968c;

    /* renamed from: d  reason: collision with root package name */
    private String f64969d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f64970e = "";

    /* renamed from: f  reason: collision with root package name */
    private int f64971f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f64972g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f64973h;

    /* compiled from: AccountInfo.java */
    /* renamed from: com.wufan.friend.chat.protocol.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static /* synthetic */ class C0685a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f64974a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f64974a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64974a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64974a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64974a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f64974a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f64974a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f64974a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f64974a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: AccountInfo.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<a, b> implements com.wufan.friend.chat.protocol.b {
        /* synthetic */ b(C0685a c0685a) {
            this();
        }

        @Override // com.wufan.friend.chat.protocol.b
        public boolean D() {
            return ((a) this.instance).D();
        }

        public b V2() {
            copyOnWrite();
            ((a) this.instance).n3();
            return this;
        }

        public b W2() {
            copyOnWrite();
            ((a) this.instance).clearAvatar();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((a) this.instance).m3();
            return this;
        }

        public b X2() {
            copyOnWrite();
            ((a) this.instance).o3();
            return this;
        }

        public b Y2() {
            copyOnWrite();
            ((a) this.instance).p3();
            return this;
        }

        public b Z2() {
            copyOnWrite();
            ((a) this.instance).clearNickname();
            return this;
        }

        public b a3() {
            copyOnWrite();
            ((a) this.instance).clearVip();
            return this;
        }

        public b b3(int i4) {
            copyOnWrite();
            ((a) this.instance).D3(i4);
            return this;
        }

        public b c3(boolean z4) {
            copyOnWrite();
            ((a) this.instance).E3(z4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.b
        public int d() {
            return ((a) this.instance).d();
        }

        public b d3(String str) {
            copyOnWrite();
            ((a) this.instance).setAvatar(str);
            return this;
        }

        public b e3(ByteString byteString) {
            copyOnWrite();
            ((a) this.instance).setAvatarBytes(byteString);
            return this;
        }

        public b f3(boolean z4) {
            copyOnWrite();
            ((a) this.instance).F3(z4);
            return this;
        }

        public b g3(int i4) {
            copyOnWrite();
            ((a) this.instance).G3(i4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.b
        public String getAvatar() {
            return ((a) this.instance).getAvatar();
        }

        @Override // com.wufan.friend.chat.protocol.b
        public ByteString getAvatarBytes() {
            return ((a) this.instance).getAvatarBytes();
        }

        @Override // com.wufan.friend.chat.protocol.b
        public String getNickname() {
            return ((a) this.instance).getNickname();
        }

        @Override // com.wufan.friend.chat.protocol.b
        public ByteString getNicknameBytes() {
            return ((a) this.instance).getNicknameBytes();
        }

        @Override // com.wufan.friend.chat.protocol.b
        public boolean getVip() {
            return ((a) this.instance).getVip();
        }

        public b h3(String str) {
            copyOnWrite();
            ((a) this.instance).setNickname(str);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.b
        public int i() {
            return ((a) this.instance).i();
        }

        public b i3(ByteString byteString) {
            copyOnWrite();
            ((a) this.instance).setNicknameBytes(byteString);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.b
        public boolean j0() {
            return ((a) this.instance).j0();
        }

        public b j3(boolean z4) {
            copyOnWrite();
            ((a) this.instance).setVip(z4);
            return this;
        }

        private b() {
            super(a.f64965p);
        }
    }

    static {
        a aVar = new a();
        f64965p = aVar;
        aVar.makeImmutable();
    }

    private a() {
    }

    public static a A3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (a) GeneratedMessageLite.parseFrom(f64965p, inputStream, extensionRegistryLite);
    }

    public static a B3(byte[] bArr) throws InvalidProtocolBufferException {
        return (a) GeneratedMessageLite.parseFrom(f64965p, bArr);
    }

    public static a C3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (a) GeneratedMessageLite.parseFrom(f64965p, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D3(int i4) {
        this.f64968c = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E3(boolean z4) {
        this.f64967b = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F3(boolean z4) {
        this.f64973h = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G3(int i4) {
        this.f64971f = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvatar() {
        this.f64970e = q3().getAvatar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNickname() {
        this.f64969d = q3().getNickname();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVip() {
        this.f64972g = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m3() {
        this.f64968c = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n3() {
        this.f64967b = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o3() {
        this.f64973h = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p3() {
        this.f64971f = 0;
    }

    public static Parser<a> parser() {
        return f64965p.getParserForType();
    }

    public static a q3() {
        return f64965p;
    }

    public static b r3() {
        return f64965p.toBuilder();
    }

    public static b s3(a aVar) {
        return f64965p.toBuilder().mergeFrom((b) aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatar(String str) {
        Objects.requireNonNull(str);
        this.f64970e = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatarBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f64970e = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNickname(String str) {
        Objects.requireNonNull(str);
        this.f64969d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNicknameBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.f64969d = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVip(boolean z4) {
        this.f64972g = z4;
    }

    public static a t3(InputStream inputStream) throws IOException {
        return (a) GeneratedMessageLite.parseDelimitedFrom(f64965p, inputStream);
    }

    public static a u3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (a) GeneratedMessageLite.parseDelimitedFrom(f64965p, inputStream, extensionRegistryLite);
    }

    public static a v3(ByteString byteString) throws InvalidProtocolBufferException {
        return (a) GeneratedMessageLite.parseFrom(f64965p, byteString);
    }

    public static a w3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (a) GeneratedMessageLite.parseFrom(f64965p, byteString, extensionRegistryLite);
    }

    public static a x3(CodedInputStream codedInputStream) throws IOException {
        return (a) GeneratedMessageLite.parseFrom(f64965p, codedInputStream);
    }

    public static a y3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (a) GeneratedMessageLite.parseFrom(f64965p, codedInputStream, extensionRegistryLite);
    }

    public static a z3(InputStream inputStream) throws IOException {
        return (a) GeneratedMessageLite.parseFrom(f64965p, inputStream);
    }

    @Override // com.wufan.friend.chat.protocol.b
    public boolean D() {
        return this.f64973h;
    }

    @Override // com.wufan.friend.chat.protocol.b
    public int d() {
        return this.f64968c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C0685a.f64974a[methodToInvoke.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return f64965p;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                a aVar = (a) obj2;
                boolean z4 = this.f64967b;
                boolean z5 = aVar.f64967b;
                this.f64967b = visitor.visitBoolean(z4, z4, z5, z5);
                int i4 = this.f64968c;
                boolean z6 = i4 != 0;
                int i5 = aVar.f64968c;
                this.f64968c = visitor.visitInt(z6, i4, i5 != 0, i5);
                this.f64969d = visitor.visitString(!this.f64969d.isEmpty(), this.f64969d, !aVar.f64969d.isEmpty(), aVar.f64969d);
                this.f64970e = visitor.visitString(!this.f64970e.isEmpty(), this.f64970e, !aVar.f64970e.isEmpty(), aVar.f64970e);
                int i6 = this.f64971f;
                boolean z7 = i6 != 0;
                int i7 = aVar.f64971f;
                this.f64971f = visitor.visitInt(z7, i6, i7 != 0, i7);
                boolean z8 = this.f64972g;
                boolean z9 = aVar.f64972g;
                this.f64972g = visitor.visitBoolean(z8, z8, z9, z9);
                boolean z10 = this.f64973h;
                boolean z11 = aVar.f64973h;
                this.f64973h = visitor.visitBoolean(z10, z10, z11, z11);
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
                                this.f64967b = codedInputStream.readBool();
                            } else if (readTag == 16) {
                                this.f64968c = codedInputStream.readInt32();
                            } else if (readTag == 26) {
                                this.f64969d = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                this.f64970e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 40) {
                                this.f64971f = codedInputStream.readInt32();
                            } else if (readTag == 48) {
                                this.f64972g = codedInputStream.readBool();
                            } else if (readTag != 56) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f64973h = codedInputStream.readBool();
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
                if (f64966q == null) {
                    synchronized (a.class) {
                        if (f64966q == null) {
                            f64966q = new GeneratedMessageLite.DefaultInstanceBasedParser(f64965p);
                        }
                    }
                }
                return f64966q;
            default:
                throw new UnsupportedOperationException();
        }
        return f64965p;
    }

    @Override // com.wufan.friend.chat.protocol.b
    public String getAvatar() {
        return this.f64970e;
    }

    @Override // com.wufan.friend.chat.protocol.b
    public ByteString getAvatarBytes() {
        return ByteString.copyFromUtf8(this.f64970e);
    }

    @Override // com.wufan.friend.chat.protocol.b
    public String getNickname() {
        return this.f64969d;
    }

    @Override // com.wufan.friend.chat.protocol.b
    public ByteString getNicknameBytes() {
        return ByteString.copyFromUtf8(this.f64969d);
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        boolean z4 = this.f64967b;
        int computeBoolSize = z4 ? 0 + CodedOutputStream.computeBoolSize(1, z4) : 0;
        int i5 = this.f64968c;
        if (i5 != 0) {
            computeBoolSize += CodedOutputStream.computeInt32Size(2, i5);
        }
        if (!this.f64969d.isEmpty()) {
            computeBoolSize += CodedOutputStream.computeStringSize(3, getNickname());
        }
        if (!this.f64970e.isEmpty()) {
            computeBoolSize += CodedOutputStream.computeStringSize(4, getAvatar());
        }
        int i6 = this.f64971f;
        if (i6 != 0) {
            computeBoolSize += CodedOutputStream.computeInt32Size(5, i6);
        }
        boolean z5 = this.f64972g;
        if (z5) {
            computeBoolSize += CodedOutputStream.computeBoolSize(6, z5);
        }
        boolean z6 = this.f64973h;
        if (z6) {
            computeBoolSize += CodedOutputStream.computeBoolSize(7, z6);
        }
        this.memoizedSerializedSize = computeBoolSize;
        return computeBoolSize;
    }

    @Override // com.wufan.friend.chat.protocol.b
    public boolean getVip() {
        return this.f64972g;
    }

    @Override // com.wufan.friend.chat.protocol.b
    public int i() {
        return this.f64971f;
    }

    @Override // com.wufan.friend.chat.protocol.b
    public boolean j0() {
        return this.f64967b;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean z4 = this.f64967b;
        if (z4) {
            codedOutputStream.writeBool(1, z4);
        }
        int i4 = this.f64968c;
        if (i4 != 0) {
            codedOutputStream.writeInt32(2, i4);
        }
        if (!this.f64969d.isEmpty()) {
            codedOutputStream.writeString(3, getNickname());
        }
        if (!this.f64970e.isEmpty()) {
            codedOutputStream.writeString(4, getAvatar());
        }
        int i5 = this.f64971f;
        if (i5 != 0) {
            codedOutputStream.writeInt32(5, i5);
        }
        boolean z5 = this.f64972g;
        if (z5) {
            codedOutputStream.writeBool(6, z5);
        }
        boolean z6 = this.f64973h;
        if (z6) {
            codedOutputStream.writeBool(7, z6);
        }
    }
}
