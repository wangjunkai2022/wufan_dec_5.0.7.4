package com.wufan.friend.chat.protocol;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.wufan.friend.chat.protocol.j1;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* compiled from: RecommendPlayerData.java */
/* loaded from: classes6.dex */
public final class l1 extends GeneratedMessageLite<l1, b> implements m1 {

    /* renamed from: c  reason: collision with root package name */
    public static final int f65116c = 1;

    /* renamed from: d  reason: collision with root package name */
    private static final l1 f65117d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile Parser<l1> f65118e;

    /* renamed from: b  reason: collision with root package name */
    private Internal.ProtobufList<j1> f65119b = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: RecommendPlayerData.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65120a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65120a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65120a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65120a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65120a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65120a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65120a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65120a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65120a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: RecommendPlayerData.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<l1, b> implements m1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.friend.chat.protocol.m1
        public int B2() {
            return ((l1) this.instance).B2();
        }

        @Override // com.wufan.friend.chat.protocol.m1
        public List<j1> I1() {
            return Collections.unmodifiableList(((l1) this.instance).I1());
        }

        public b V2(int i4, j1.b bVar) {
            copyOnWrite();
            ((l1) this.instance).g3(i4, bVar);
            return this;
        }

        public b W2(int i4, j1 j1Var) {
            copyOnWrite();
            ((l1) this.instance).h3(i4, j1Var);
            return this;
        }

        public b X0(Iterable<? extends j1> iterable) {
            copyOnWrite();
            ((l1) this.instance).f3(iterable);
            return this;
        }

        public b X2(j1.b bVar) {
            copyOnWrite();
            ((l1) this.instance).i3(bVar);
            return this;
        }

        public b Y2(j1 j1Var) {
            copyOnWrite();
            ((l1) this.instance).j3(j1Var);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.m1
        public j1 Z0(int i4) {
            return ((l1) this.instance).Z0(i4);
        }

        public b Z2() {
            copyOnWrite();
            ((l1) this.instance).k3();
            return this;
        }

        public b a3(int i4) {
            copyOnWrite();
            ((l1) this.instance).B3(i4);
            return this;
        }

        public b b3(int i4, j1.b bVar) {
            copyOnWrite();
            ((l1) this.instance).C3(i4, bVar);
            return this;
        }

        public b c3(int i4, j1 j1Var) {
            copyOnWrite();
            ((l1) this.instance).D3(i4, j1Var);
            return this;
        }

        private b() {
            super(l1.f65117d);
        }
    }

    static {
        l1 l1Var = new l1();
        f65117d = l1Var;
        l1Var.makeImmutable();
    }

    private l1() {
    }

    public static l1 A3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (l1) GeneratedMessageLite.parseFrom(f65117d, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3(int i4) {
        l3();
        this.f65119b.remove(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3(int i4, j1.b bVar) {
        l3();
        this.f65119b.set(i4, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D3(int i4, j1 j1Var) {
        Objects.requireNonNull(j1Var);
        l3();
        this.f65119b.set(i4, j1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f3(Iterable<? extends j1> iterable) {
        l3();
        AbstractMessageLite.addAll(iterable, this.f65119b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g3(int i4, j1.b bVar) {
        l3();
        this.f65119b.add(i4, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3(int i4, j1 j1Var) {
        Objects.requireNonNull(j1Var);
        l3();
        this.f65119b.add(i4, j1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3(j1.b bVar) {
        l3();
        this.f65119b.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3(j1 j1Var) {
        Objects.requireNonNull(j1Var);
        l3();
        this.f65119b.add(j1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3() {
        this.f65119b = GeneratedMessageLite.emptyProtobufList();
    }

    private void l3() {
        if (this.f65119b.isModifiable()) {
            return;
        }
        this.f65119b = GeneratedMessageLite.mutableCopy(this.f65119b);
    }

    public static l1 m3() {
        return f65117d;
    }

    public static b p3() {
        return f65117d.toBuilder();
    }

    public static Parser<l1> parser() {
        return f65117d.getParserForType();
    }

    public static b q3(l1 l1Var) {
        return f65117d.toBuilder().mergeFrom((b) l1Var);
    }

    public static l1 r3(InputStream inputStream) throws IOException {
        return (l1) GeneratedMessageLite.parseDelimitedFrom(f65117d, inputStream);
    }

    public static l1 s3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (l1) GeneratedMessageLite.parseDelimitedFrom(f65117d, inputStream, extensionRegistryLite);
    }

    public static l1 t3(ByteString byteString) throws InvalidProtocolBufferException {
        return (l1) GeneratedMessageLite.parseFrom(f65117d, byteString);
    }

    public static l1 u3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (l1) GeneratedMessageLite.parseFrom(f65117d, byteString, extensionRegistryLite);
    }

    public static l1 v3(CodedInputStream codedInputStream) throws IOException {
        return (l1) GeneratedMessageLite.parseFrom(f65117d, codedInputStream);
    }

    public static l1 w3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (l1) GeneratedMessageLite.parseFrom(f65117d, codedInputStream, extensionRegistryLite);
    }

    public static l1 x3(InputStream inputStream) throws IOException {
        return (l1) GeneratedMessageLite.parseFrom(f65117d, inputStream);
    }

    public static l1 y3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (l1) GeneratedMessageLite.parseFrom(f65117d, inputStream, extensionRegistryLite);
    }

    public static l1 z3(byte[] bArr) throws InvalidProtocolBufferException {
        return (l1) GeneratedMessageLite.parseFrom(f65117d, bArr);
    }

    @Override // com.wufan.friend.chat.protocol.m1
    public int B2() {
        return this.f65119b.size();
    }

    @Override // com.wufan.friend.chat.protocol.m1
    public List<j1> I1() {
        return this.f65119b;
    }

    @Override // com.wufan.friend.chat.protocol.m1
    public j1 Z0(int i4) {
        return this.f65119b.get(i4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65120a[methodToInvoke.ordinal()]) {
            case 1:
                return new l1();
            case 2:
                return f65117d;
            case 3:
                this.f65119b.makeImmutable();
                return null;
            case 4:
                return new b(null);
            case 5:
                this.f65119b = ((GeneratedMessageLite.Visitor) obj).visitList(this.f65119b, ((l1) obj2).f65119b);
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
                            if (readTag != 0) {
                                if (readTag != 10) {
                                    if (!codedInputStream.skipField(readTag)) {
                                    }
                                } else {
                                    if (!this.f65119b.isModifiable()) {
                                        this.f65119b = GeneratedMessageLite.mutableCopy(this.f65119b);
                                    }
                                    this.f65119b.add((j1) codedInputStream.readMessage(j1.parser(), extensionRegistryLite));
                                }
                            }
                            z4 = true;
                        } catch (InvalidProtocolBufferException e5) {
                            throw new RuntimeException(e5.setUnfinishedMessage(this));
                        }
                    } catch (IOException e6) {
                        throw new RuntimeException(new InvalidProtocolBufferException(e6.getMessage()).setUnfinishedMessage(this));
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (f65118e == null) {
                    synchronized (l1.class) {
                        if (f65118e == null) {
                            f65118e = new GeneratedMessageLite.DefaultInstanceBasedParser(f65117d);
                        }
                    }
                }
                return f65118e;
            default:
                throw new UnsupportedOperationException();
        }
        return f65117d;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f65119b.size(); i6++) {
            i5 += CodedOutputStream.computeMessageSize(1, this.f65119b.get(i6));
        }
        this.memoizedSerializedSize = i5;
        return i5;
    }

    public n1 n3(int i4) {
        return this.f65119b.get(i4);
    }

    public List<? extends n1> o3() {
        return this.f65119b;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i4 = 0; i4 < this.f65119b.size(); i4++) {
            codedOutputStream.writeMessage(1, this.f65119b.get(i4));
        }
    }
}
