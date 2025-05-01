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
/* compiled from: PopWindowNotification.java */
/* loaded from: classes6.dex */
public final class h1 extends GeneratedMessageLite<h1, b> implements i1 {

    /* renamed from: b  reason: collision with root package name */
    private static final h1 f65070b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile Parser<h1> f65071c;

    /* compiled from: PopWindowNotification.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65072a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65072a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65072a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65072a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65072a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65072a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65072a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65072a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65072a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: PopWindowNotification.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<h1, b> implements i1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(h1.f65070b);
        }
    }

    static {
        h1 h1Var = new h1();
        f65070b = h1Var;
        h1Var.makeImmutable();
    }

    private h1() {
    }

    public static h1 W2() {
        return f65070b;
    }

    public static b X2() {
        return f65070b.toBuilder();
    }

    public static b Y2(h1 h1Var) {
        return f65070b.toBuilder().mergeFrom((b) h1Var);
    }

    public static h1 Z2(InputStream inputStream) throws IOException {
        return (h1) GeneratedMessageLite.parseDelimitedFrom(f65070b, inputStream);
    }

    public static h1 a3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (h1) GeneratedMessageLite.parseDelimitedFrom(f65070b, inputStream, extensionRegistryLite);
    }

    public static h1 b3(ByteString byteString) throws InvalidProtocolBufferException {
        return (h1) GeneratedMessageLite.parseFrom(f65070b, byteString);
    }

    public static h1 c3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (h1) GeneratedMessageLite.parseFrom(f65070b, byteString, extensionRegistryLite);
    }

    public static h1 d3(CodedInputStream codedInputStream) throws IOException {
        return (h1) GeneratedMessageLite.parseFrom(f65070b, codedInputStream);
    }

    public static h1 e3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (h1) GeneratedMessageLite.parseFrom(f65070b, codedInputStream, extensionRegistryLite);
    }

    public static h1 f3(InputStream inputStream) throws IOException {
        return (h1) GeneratedMessageLite.parseFrom(f65070b, inputStream);
    }

    public static h1 g3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (h1) GeneratedMessageLite.parseFrom(f65070b, inputStream, extensionRegistryLite);
    }

    public static h1 h3(byte[] bArr) throws InvalidProtocolBufferException {
        return (h1) GeneratedMessageLite.parseFrom(f65070b, bArr);
    }

    public static h1 i3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (h1) GeneratedMessageLite.parseFrom(f65070b, bArr, extensionRegistryLite);
    }

    public static Parser<h1> parser() {
        return f65070b.getParserForType();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65072a[methodToInvoke.ordinal()]) {
            case 1:
                return new h1();
            case 2:
                return f65070b;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                h1 h1Var = (h1) obj2;
                GeneratedMessageLite.MergeFromVisitor mergeFromVisitor = GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z4 = false;
                while (!z4) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag == 0 || !codedInputStream.skipField(readTag)) {
                                z4 = true;
                            }
                        } catch (IOException e5) {
                            throw new RuntimeException(new InvalidProtocolBufferException(e5.getMessage()).setUnfinishedMessage(this));
                        }
                    } catch (InvalidProtocolBufferException e6) {
                        throw new RuntimeException(e6.setUnfinishedMessage(this));
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (f65071c == null) {
                    synchronized (h1.class) {
                        if (f65071c == null) {
                            f65071c = new GeneratedMessageLite.DefaultInstanceBasedParser(f65070b);
                        }
                    }
                }
                return f65071c;
            default:
                throw new UnsupportedOperationException();
        }
        return f65070b;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        this.memoizedSerializedSize = 0;
        return 0;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
    }
}
