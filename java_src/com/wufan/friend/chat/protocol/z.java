package com.wufan.friend.chat.protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: FriendDeleteSuccessNotification.java */
/* loaded from: classes6.dex */
public final class z extends GeneratedMessageLite<z, b> implements a0 {

    /* renamed from: c  reason: collision with root package name */
    public static final int f65320c = 1;

    /* renamed from: d  reason: collision with root package name */
    private static final z f65321d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile Parser<z> f65322e;

    /* renamed from: b  reason: collision with root package name */
    private int f65323b;

    /* compiled from: FriendDeleteSuccessNotification.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65324a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65324a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65324a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65324a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65324a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65324a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65324a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65324a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65324a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: FriendDeleteSuccessNotification.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<z, b> implements a0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.friend.chat.protocol.a0
        public int H() {
            return ((z) this.instance).H();
        }

        public b V2(int i4) {
            copyOnWrite();
            ((z) this.instance).m3(i4);
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((z) this.instance).Y2();
            return this;
        }

        private b() {
            super(z.f65321d);
        }
    }

    static {
        z zVar = new z();
        f65321d = zVar;
        zVar.makeImmutable();
    }

    private z() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y2() {
        this.f65323b = 0;
    }

    public static z Z2() {
        return f65321d;
    }

    public static b a3() {
        return f65321d.toBuilder();
    }

    public static b b3(z zVar) {
        return f65321d.toBuilder().mergeFrom((b) zVar);
    }

    public static z c3(InputStream inputStream) throws IOException {
        return (z) GeneratedMessageLite.parseDelimitedFrom(f65321d, inputStream);
    }

    public static z d3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (z) GeneratedMessageLite.parseDelimitedFrom(f65321d, inputStream, extensionRegistryLite);
    }

    public static z e3(ByteString byteString) throws InvalidProtocolBufferException {
        return (z) GeneratedMessageLite.parseFrom(f65321d, byteString);
    }

    public static z f3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (z) GeneratedMessageLite.parseFrom(f65321d, byteString, extensionRegistryLite);
    }

    public static z g3(CodedInputStream codedInputStream) throws IOException {
        return (z) GeneratedMessageLite.parseFrom(f65321d, codedInputStream);
    }

    public static z h3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (z) GeneratedMessageLite.parseFrom(f65321d, codedInputStream, extensionRegistryLite);
    }

    public static z i3(InputStream inputStream) throws IOException {
        return (z) GeneratedMessageLite.parseFrom(f65321d, inputStream);
    }

    public static z j3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (z) GeneratedMessageLite.parseFrom(f65321d, inputStream, extensionRegistryLite);
    }

    public static z k3(byte[] bArr) throws InvalidProtocolBufferException {
        return (z) GeneratedMessageLite.parseFrom(f65321d, bArr);
    }

    public static z l3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (z) GeneratedMessageLite.parseFrom(f65321d, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m3(int i4) {
        this.f65323b = i4;
    }

    public static Parser<z> parser() {
        return f65321d.getParserForType();
    }

    @Override // com.wufan.friend.chat.protocol.a0
    public int H() {
        return this.f65323b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65324a[methodToInvoke.ordinal()]) {
            case 1:
                return new z();
            case 2:
                return f65321d;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                z zVar = (z) obj2;
                int i4 = this.f65323b;
                boolean z4 = i4 != 0;
                int i5 = zVar.f65323b;
                this.f65323b = visitor.visitInt(z4, i4, i5 != 0, i5);
                GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!r1) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag != 8) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f65323b = codedInputStream.readInt32();
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
                if (f65322e == null) {
                    synchronized (z.class) {
                        if (f65322e == null) {
                            f65322e = new GeneratedMessageLite.DefaultInstanceBasedParser(f65321d);
                        }
                    }
                }
                return f65322e;
            default:
                throw new UnsupportedOperationException();
        }
        return f65321d;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int i5 = this.f65323b;
        int computeInt32Size = i5 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i5) : 0;
        this.memoizedSerializedSize = computeInt32Size;
        return computeInt32Size;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i4 = this.f65323b;
        if (i4 != 0) {
            codedOutputStream.writeInt32(1, i4);
        }
    }
}
