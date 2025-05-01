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
/* compiled from: DialogNotification.java */
/* loaded from: classes6.dex */
public final class p extends GeneratedMessageLite<p, b> implements q {

    /* renamed from: b  reason: collision with root package name */
    private static final p f65146b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile Parser<p> f65147c;

    /* compiled from: DialogNotification.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65148a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65148a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65148a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65148a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65148a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65148a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65148a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65148a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65148a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: DialogNotification.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<p, b> implements q {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(p.f65146b);
        }
    }

    static {
        p pVar = new p();
        f65146b = pVar;
        pVar.makeImmutable();
    }

    private p() {
    }

    public static p W2() {
        return f65146b;
    }

    public static b X2() {
        return f65146b.toBuilder();
    }

    public static b Y2(p pVar) {
        return f65146b.toBuilder().mergeFrom((b) pVar);
    }

    public static p Z2(InputStream inputStream) throws IOException {
        return (p) GeneratedMessageLite.parseDelimitedFrom(f65146b, inputStream);
    }

    public static p a3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (p) GeneratedMessageLite.parseDelimitedFrom(f65146b, inputStream, extensionRegistryLite);
    }

    public static p b3(ByteString byteString) throws InvalidProtocolBufferException {
        return (p) GeneratedMessageLite.parseFrom(f65146b, byteString);
    }

    public static p c3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (p) GeneratedMessageLite.parseFrom(f65146b, byteString, extensionRegistryLite);
    }

    public static p d3(CodedInputStream codedInputStream) throws IOException {
        return (p) GeneratedMessageLite.parseFrom(f65146b, codedInputStream);
    }

    public static p e3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (p) GeneratedMessageLite.parseFrom(f65146b, codedInputStream, extensionRegistryLite);
    }

    public static p f3(InputStream inputStream) throws IOException {
        return (p) GeneratedMessageLite.parseFrom(f65146b, inputStream);
    }

    public static p g3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (p) GeneratedMessageLite.parseFrom(f65146b, inputStream, extensionRegistryLite);
    }

    public static p h3(byte[] bArr) throws InvalidProtocolBufferException {
        return (p) GeneratedMessageLite.parseFrom(f65146b, bArr);
    }

    public static p i3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (p) GeneratedMessageLite.parseFrom(f65146b, bArr, extensionRegistryLite);
    }

    public static Parser<p> parser() {
        return f65146b.getParserForType();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65148a[methodToInvoke.ordinal()]) {
            case 1:
                return new p();
            case 2:
                return f65146b;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                p pVar = (p) obj2;
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
                if (f65147c == null) {
                    synchronized (p.class) {
                        if (f65147c == null) {
                            f65147c = new GeneratedMessageLite.DefaultInstanceBasedParser(f65146b);
                        }
                    }
                }
                return f65147c;
            default:
                throw new UnsupportedOperationException();
        }
        return f65146b;
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
