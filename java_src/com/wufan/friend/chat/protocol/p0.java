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
import com.wufan.friend.chat.protocol.r0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* compiled from: LocalBattleGameData.java */
/* loaded from: classes6.dex */
public final class p0 extends GeneratedMessageLite<p0, b> implements q0 {

    /* renamed from: c  reason: collision with root package name */
    public static final int f65149c = 1;

    /* renamed from: d  reason: collision with root package name */
    private static final p0 f65150d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile Parser<p0> f65151e;

    /* renamed from: b  reason: collision with root package name */
    private Internal.ProtobufList<r0> f65152b = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: LocalBattleGameData.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65153a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65153a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65153a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65153a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65153a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65153a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65153a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65153a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65153a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: LocalBattleGameData.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<p0, b> implements q0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.friend.chat.protocol.q0
        public r0 L2(int i4) {
            return ((p0) this.instance).L2(i4);
        }

        public b V2(int i4, r0.b bVar) {
            copyOnWrite();
            ((p0) this.instance).g3(i4, bVar);
            return this;
        }

        public b W2(int i4, r0 r0Var) {
            copyOnWrite();
            ((p0) this.instance).h3(i4, r0Var);
            return this;
        }

        public b X0(Iterable<? extends r0> iterable) {
            copyOnWrite();
            ((p0) this.instance).f3(iterable);
            return this;
        }

        public b X2(r0.b bVar) {
            copyOnWrite();
            ((p0) this.instance).i3(bVar);
            return this;
        }

        public b Y2(r0 r0Var) {
            copyOnWrite();
            ((p0) this.instance).j3(r0Var);
            return this;
        }

        public b Z2() {
            copyOnWrite();
            ((p0) this.instance).k3();
            return this;
        }

        public b a3(int i4) {
            copyOnWrite();
            ((p0) this.instance).B3(i4);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.q0
        public List<r0> b1() {
            return Collections.unmodifiableList(((p0) this.instance).b1());
        }

        public b b3(int i4, r0.b bVar) {
            copyOnWrite();
            ((p0) this.instance).C3(i4, bVar);
            return this;
        }

        public b c3(int i4, r0 r0Var) {
            copyOnWrite();
            ((p0) this.instance).D3(i4, r0Var);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.q0
        public int f1() {
            return ((p0) this.instance).f1();
        }

        private b() {
            super(p0.f65150d);
        }
    }

    static {
        p0 p0Var = new p0();
        f65150d = p0Var;
        p0Var.makeImmutable();
    }

    private p0() {
    }

    public static p0 A3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (p0) GeneratedMessageLite.parseFrom(f65150d, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3(int i4) {
        l3();
        this.f65152b.remove(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3(int i4, r0.b bVar) {
        l3();
        this.f65152b.set(i4, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D3(int i4, r0 r0Var) {
        Objects.requireNonNull(r0Var);
        l3();
        this.f65152b.set(i4, r0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f3(Iterable<? extends r0> iterable) {
        l3();
        AbstractMessageLite.addAll(iterable, this.f65152b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g3(int i4, r0.b bVar) {
        l3();
        this.f65152b.add(i4, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3(int i4, r0 r0Var) {
        Objects.requireNonNull(r0Var);
        l3();
        this.f65152b.add(i4, r0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3(r0.b bVar) {
        l3();
        this.f65152b.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3(r0 r0Var) {
        Objects.requireNonNull(r0Var);
        l3();
        this.f65152b.add(r0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3() {
        this.f65152b = GeneratedMessageLite.emptyProtobufList();
    }

    private void l3() {
        if (this.f65152b.isModifiable()) {
            return;
        }
        this.f65152b = GeneratedMessageLite.mutableCopy(this.f65152b);
    }

    public static p0 m3() {
        return f65150d;
    }

    public static b p3() {
        return f65150d.toBuilder();
    }

    public static Parser<p0> parser() {
        return f65150d.getParserForType();
    }

    public static b q3(p0 p0Var) {
        return f65150d.toBuilder().mergeFrom((b) p0Var);
    }

    public static p0 r3(InputStream inputStream) throws IOException {
        return (p0) GeneratedMessageLite.parseDelimitedFrom(f65150d, inputStream);
    }

    public static p0 s3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (p0) GeneratedMessageLite.parseDelimitedFrom(f65150d, inputStream, extensionRegistryLite);
    }

    public static p0 t3(ByteString byteString) throws InvalidProtocolBufferException {
        return (p0) GeneratedMessageLite.parseFrom(f65150d, byteString);
    }

    public static p0 u3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (p0) GeneratedMessageLite.parseFrom(f65150d, byteString, extensionRegistryLite);
    }

    public static p0 v3(CodedInputStream codedInputStream) throws IOException {
        return (p0) GeneratedMessageLite.parseFrom(f65150d, codedInputStream);
    }

    public static p0 w3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (p0) GeneratedMessageLite.parseFrom(f65150d, codedInputStream, extensionRegistryLite);
    }

    public static p0 x3(InputStream inputStream) throws IOException {
        return (p0) GeneratedMessageLite.parseFrom(f65150d, inputStream);
    }

    public static p0 y3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (p0) GeneratedMessageLite.parseFrom(f65150d, inputStream, extensionRegistryLite);
    }

    public static p0 z3(byte[] bArr) throws InvalidProtocolBufferException {
        return (p0) GeneratedMessageLite.parseFrom(f65150d, bArr);
    }

    @Override // com.wufan.friend.chat.protocol.q0
    public r0 L2(int i4) {
        return this.f65152b.get(i4);
    }

    @Override // com.wufan.friend.chat.protocol.q0
    public List<r0> b1() {
        return this.f65152b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65153a[methodToInvoke.ordinal()]) {
            case 1:
                return new p0();
            case 2:
                return f65150d;
            case 3:
                this.f65152b.makeImmutable();
                return null;
            case 4:
                return new b(null);
            case 5:
                this.f65152b = ((GeneratedMessageLite.Visitor) obj).visitList(this.f65152b, ((p0) obj2).f65152b);
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
                                    if (!this.f65152b.isModifiable()) {
                                        this.f65152b = GeneratedMessageLite.mutableCopy(this.f65152b);
                                    }
                                    this.f65152b.add((r0) codedInputStream.readMessage(r0.parser(), extensionRegistryLite));
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
                if (f65151e == null) {
                    synchronized (p0.class) {
                        if (f65151e == null) {
                            f65151e = new GeneratedMessageLite.DefaultInstanceBasedParser(f65150d);
                        }
                    }
                }
                return f65151e;
            default:
                throw new UnsupportedOperationException();
        }
        return f65150d;
    }

    @Override // com.wufan.friend.chat.protocol.q0
    public int f1() {
        return this.f65152b.size();
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f65152b.size(); i6++) {
            i5 += CodedOutputStream.computeMessageSize(1, this.f65152b.get(i6));
        }
        this.memoizedSerializedSize = i5;
        return i5;
    }

    public s0 n3(int i4) {
        return this.f65152b.get(i4);
    }

    public List<? extends s0> o3() {
        return this.f65152b;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i4 = 0; i4 < this.f65152b.size(); i4++) {
            codedOutputStream.writeMessage(1, this.f65152b.get(i4));
        }
    }
}
