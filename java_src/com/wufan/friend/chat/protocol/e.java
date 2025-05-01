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
import com.wufan.friend.chat.protocol.r;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* compiled from: AllFriendNotification.java */
/* loaded from: classes6.dex */
public final class e extends GeneratedMessageLite<e, b> implements f {

    /* renamed from: f  reason: collision with root package name */
    public static final int f65009f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f65010g = 2;

    /* renamed from: h  reason: collision with root package name */
    public static final int f65011h = 3;

    /* renamed from: i  reason: collision with root package name */
    private static final e f65012i;

    /* renamed from: j  reason: collision with root package name */
    private static volatile Parser<e> f65013j;

    /* renamed from: b  reason: collision with root package name */
    private int f65014b;

    /* renamed from: c  reason: collision with root package name */
    private Internal.ProtobufList<r> f65015c = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: d  reason: collision with root package name */
    private Internal.ProtobufList<r> f65016d = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: e  reason: collision with root package name */
    private int f65017e;

    /* compiled from: AllFriendNotification.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65018a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65018a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65018a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65018a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65018a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65018a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65018a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65018a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65018a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: AllFriendNotification.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<e, b> implements f {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.friend.chat.protocol.f
        public List<r> D1() {
            return Collections.unmodifiableList(((e) this.instance).D1());
        }

        @Override // com.wufan.friend.chat.protocol.f
        public int P() {
            return ((e) this.instance).P();
        }

        @Override // com.wufan.friend.chat.protocol.f
        public r R0(int i4) {
            return ((e) this.instance).R0(i4);
        }

        @Override // com.wufan.friend.chat.protocol.f
        public List<r> T0() {
            return Collections.unmodifiableList(((e) this.instance).T0());
        }

        public b V2(Iterable<? extends r> iterable) {
            copyOnWrite();
            ((e) this.instance).r3(iterable);
            return this;
        }

        public b W2(int i4, r.b bVar) {
            copyOnWrite();
            ((e) this.instance).s3(i4, bVar);
            return this;
        }

        public b X0(Iterable<? extends r> iterable) {
            copyOnWrite();
            ((e) this.instance).q3(iterable);
            return this;
        }

        public b X2(int i4, r rVar) {
            copyOnWrite();
            ((e) this.instance).t3(i4, rVar);
            return this;
        }

        public b Y2(r.b bVar) {
            copyOnWrite();
            ((e) this.instance).u3(bVar);
            return this;
        }

        public b Z2(r rVar) {
            copyOnWrite();
            ((e) this.instance).v3(rVar);
            return this;
        }

        public b a3(int i4, r.b bVar) {
            copyOnWrite();
            ((e) this.instance).w3(i4, bVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.f
        public r b2(int i4) {
            return ((e) this.instance).b2(i4);
        }

        public b b3(int i4, r rVar) {
            copyOnWrite();
            ((e) this.instance).x3(i4, rVar);
            return this;
        }

        public b c3(r.b bVar) {
            copyOnWrite();
            ((e) this.instance).y3(bVar);
            return this;
        }

        public b d3(r rVar) {
            copyOnWrite();
            ((e) this.instance).z3(rVar);
            return this;
        }

        public b e3() {
            copyOnWrite();
            ((e) this.instance).A3();
            return this;
        }

        public b f3() {
            copyOnWrite();
            ((e) this.instance).B3();
            return this;
        }

        public b g3() {
            copyOnWrite();
            ((e) this.instance).C3();
            return this;
        }

        public b h3(int i4) {
            copyOnWrite();
            ((e) this.instance).W3(i4);
            return this;
        }

        public b i3(int i4) {
            copyOnWrite();
            ((e) this.instance).X3(i4);
            return this;
        }

        public b j3(int i4) {
            copyOnWrite();
            ((e) this.instance).Y3(i4);
            return this;
        }

        public b k3(int i4, r.b bVar) {
            copyOnWrite();
            ((e) this.instance).Z3(i4, bVar);
            return this;
        }

        public b l3(int i4, r rVar) {
            copyOnWrite();
            ((e) this.instance).a4(i4, rVar);
            return this;
        }

        public b m3(int i4, r.b bVar) {
            copyOnWrite();
            ((e) this.instance).b4(i4, bVar);
            return this;
        }

        public b n3(int i4, r rVar) {
            copyOnWrite();
            ((e) this.instance).c4(i4, rVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.f
        public int v0() {
            return ((e) this.instance).v0();
        }

        @Override // com.wufan.friend.chat.protocol.f
        public int w2() {
            return ((e) this.instance).w2();
        }

        private b() {
            super(e.f65012i);
        }
    }

    static {
        e eVar = new e();
        f65012i = eVar;
        eVar.makeImmutable();
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A3() {
        this.f65017e = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3() {
        this.f65016d = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3() {
        this.f65015c = GeneratedMessageLite.emptyProtobufList();
    }

    private void D3() {
        if (this.f65016d.isModifiable()) {
            return;
        }
        this.f65016d = GeneratedMessageLite.mutableCopy(this.f65016d);
    }

    private void E3() {
        if (this.f65015c.isModifiable()) {
            return;
        }
        this.f65015c = GeneratedMessageLite.mutableCopy(this.f65015c);
    }

    public static e F3() {
        return f65012i;
    }

    public static b K3() {
        return f65012i.toBuilder();
    }

    public static b L3(e eVar) {
        return f65012i.toBuilder().mergeFrom((b) eVar);
    }

    public static e M3(InputStream inputStream) throws IOException {
        return (e) GeneratedMessageLite.parseDelimitedFrom(f65012i, inputStream);
    }

    public static e N3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (e) GeneratedMessageLite.parseDelimitedFrom(f65012i, inputStream, extensionRegistryLite);
    }

    public static e O3(ByteString byteString) throws InvalidProtocolBufferException {
        return (e) GeneratedMessageLite.parseFrom(f65012i, byteString);
    }

    public static e P3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (e) GeneratedMessageLite.parseFrom(f65012i, byteString, extensionRegistryLite);
    }

    public static e Q3(CodedInputStream codedInputStream) throws IOException {
        return (e) GeneratedMessageLite.parseFrom(f65012i, codedInputStream);
    }

    public static e R3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (e) GeneratedMessageLite.parseFrom(f65012i, codedInputStream, extensionRegistryLite);
    }

    public static e S3(InputStream inputStream) throws IOException {
        return (e) GeneratedMessageLite.parseFrom(f65012i, inputStream);
    }

    public static e T3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (e) GeneratedMessageLite.parseFrom(f65012i, inputStream, extensionRegistryLite);
    }

    public static e U3(byte[] bArr) throws InvalidProtocolBufferException {
        return (e) GeneratedMessageLite.parseFrom(f65012i, bArr);
    }

    public static e V3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (e) GeneratedMessageLite.parseFrom(f65012i, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W3(int i4) {
        D3();
        this.f65016d.remove(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X3(int i4) {
        E3();
        this.f65015c.remove(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y3(int i4) {
        this.f65017e = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z3(int i4, r.b bVar) {
        D3();
        this.f65016d.set(i4, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a4(int i4, r rVar) {
        Objects.requireNonNull(rVar);
        D3();
        this.f65016d.set(i4, rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b4(int i4, r.b bVar) {
        E3();
        this.f65015c.set(i4, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c4(int i4, r rVar) {
        Objects.requireNonNull(rVar);
        E3();
        this.f65015c.set(i4, rVar);
    }

    public static Parser<e> parser() {
        return f65012i.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q3(Iterable<? extends r> iterable) {
        D3();
        AbstractMessageLite.addAll(iterable, this.f65016d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3(Iterable<? extends r> iterable) {
        E3();
        AbstractMessageLite.addAll(iterable, this.f65015c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3(int i4, r.b bVar) {
        D3();
        this.f65016d.add(i4, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t3(int i4, r rVar) {
        Objects.requireNonNull(rVar);
        D3();
        this.f65016d.add(i4, rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u3(r.b bVar) {
        D3();
        this.f65016d.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v3(r rVar) {
        Objects.requireNonNull(rVar);
        D3();
        this.f65016d.add(rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w3(int i4, r.b bVar) {
        E3();
        this.f65015c.add(i4, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3(int i4, r rVar) {
        Objects.requireNonNull(rVar);
        E3();
        this.f65015c.add(i4, rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3(r.b bVar) {
        E3();
        this.f65015c.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(r rVar) {
        Objects.requireNonNull(rVar);
        E3();
        this.f65015c.add(rVar);
    }

    @Override // com.wufan.friend.chat.protocol.f
    public List<r> D1() {
        return this.f65015c;
    }

    public b0 G3(int i4) {
        return this.f65016d.get(i4);
    }

    public List<? extends b0> H3() {
        return this.f65016d;
    }

    public b0 I3(int i4) {
        return this.f65015c.get(i4);
    }

    public List<? extends b0> J3() {
        return this.f65015c;
    }

    @Override // com.wufan.friend.chat.protocol.f
    public int P() {
        return this.f65017e;
    }

    @Override // com.wufan.friend.chat.protocol.f
    public r R0(int i4) {
        return this.f65015c.get(i4);
    }

    @Override // com.wufan.friend.chat.protocol.f
    public List<r> T0() {
        return this.f65016d;
    }

    @Override // com.wufan.friend.chat.protocol.f
    public r b2(int i4) {
        return this.f65016d.get(i4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65018a[methodToInvoke.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return f65012i;
            case 3:
                this.f65015c.makeImmutable();
                this.f65016d.makeImmutable();
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                e eVar = (e) obj2;
                this.f65015c = visitor.visitList(this.f65015c, eVar.f65015c);
                this.f65016d = visitor.visitList(this.f65016d, eVar.f65016d);
                int i4 = this.f65017e;
                boolean z4 = i4 != 0;
                int i5 = eVar.f65017e;
                this.f65017e = visitor.visitInt(z4, i4, i5 != 0, i5);
                if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                    this.f65014b |= eVar.f65014b;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!r1) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                if (!this.f65015c.isModifiable()) {
                                    this.f65015c = GeneratedMessageLite.mutableCopy(this.f65015c);
                                }
                                this.f65015c.add((r) codedInputStream.readMessage(r.parser(), extensionRegistryLite));
                            } else if (readTag == 18) {
                                if (!this.f65016d.isModifiable()) {
                                    this.f65016d = GeneratedMessageLite.mutableCopy(this.f65016d);
                                }
                                this.f65016d.add((r) codedInputStream.readMessage(r.parser(), extensionRegistryLite));
                            } else if (readTag != 24) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.f65017e = codedInputStream.readInt32();
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
                if (f65013j == null) {
                    synchronized (e.class) {
                        if (f65013j == null) {
                            f65013j = new GeneratedMessageLite.DefaultInstanceBasedParser(f65012i);
                        }
                    }
                }
                return f65013j;
            default:
                throw new UnsupportedOperationException();
        }
        return f65012i;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f65015c.size(); i6++) {
            i5 += CodedOutputStream.computeMessageSize(1, this.f65015c.get(i6));
        }
        for (int i7 = 0; i7 < this.f65016d.size(); i7++) {
            i5 += CodedOutputStream.computeMessageSize(2, this.f65016d.get(i7));
        }
        int i8 = this.f65017e;
        if (i8 != 0) {
            i5 += CodedOutputStream.computeInt32Size(3, i8);
        }
        this.memoizedSerializedSize = i5;
        return i5;
    }

    @Override // com.wufan.friend.chat.protocol.f
    public int v0() {
        return this.f65015c.size();
    }

    @Override // com.wufan.friend.chat.protocol.f
    public int w2() {
        return this.f65016d.size();
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i4 = 0; i4 < this.f65015c.size(); i4++) {
            codedOutputStream.writeMessage(1, this.f65015c.get(i4));
        }
        for (int i5 = 0; i5 < this.f65016d.size(); i5++) {
            codedOutputStream.writeMessage(2, this.f65016d.get(i5));
        }
        int i6 = this.f65017e;
        if (i6 != 0) {
            codedOutputStream.writeInt32(3, i6);
        }
    }
}
