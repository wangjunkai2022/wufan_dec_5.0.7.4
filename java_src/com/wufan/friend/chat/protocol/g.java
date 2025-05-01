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
/* compiled from: AllOnlineFriendNotification.java */
/* loaded from: classes6.dex */
public final class g extends GeneratedMessageLite<g, b> implements h {

    /* renamed from: e  reason: collision with root package name */
    public static final int f65039e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f65040f = 2;

    /* renamed from: g  reason: collision with root package name */
    private static final g f65041g;

    /* renamed from: h  reason: collision with root package name */
    private static volatile Parser<g> f65042h;

    /* renamed from: b  reason: collision with root package name */
    private int f65043b;

    /* renamed from: c  reason: collision with root package name */
    private Internal.ProtobufList<r> f65044c = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: d  reason: collision with root package name */
    private int f65045d;

    /* compiled from: AllOnlineFriendNotification.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65046a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65046a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65046a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65046a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65046a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65046a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65046a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65046a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65046a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: AllOnlineFriendNotification.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<g, b> implements h {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.friend.chat.protocol.h
        public int G1() {
            return ((g) this.instance).G1();
        }

        @Override // com.wufan.friend.chat.protocol.h
        public List<r> O0() {
            return Collections.unmodifiableList(((g) this.instance).O0());
        }

        @Override // com.wufan.friend.chat.protocol.h
        public int P() {
            return ((g) this.instance).P();
        }

        @Override // com.wufan.friend.chat.protocol.h
        public r R1(int i4) {
            return ((g) this.instance).R1(i4);
        }

        public b V2(int i4, r.b bVar) {
            copyOnWrite();
            ((g) this.instance).i3(i4, bVar);
            return this;
        }

        public b W2(int i4, r rVar) {
            copyOnWrite();
            ((g) this.instance).j3(i4, rVar);
            return this;
        }

        public b X0(Iterable<? extends r> iterable) {
            copyOnWrite();
            ((g) this.instance).h3(iterable);
            return this;
        }

        public b X2(r.b bVar) {
            copyOnWrite();
            ((g) this.instance).k3(bVar);
            return this;
        }

        public b Y2(r rVar) {
            copyOnWrite();
            ((g) this.instance).l3(rVar);
            return this;
        }

        public b Z2() {
            copyOnWrite();
            ((g) this.instance).m3();
            return this;
        }

        public b a3() {
            copyOnWrite();
            ((g) this.instance).n3();
            return this;
        }

        public b b3(int i4) {
            copyOnWrite();
            ((g) this.instance).E3(i4);
            return this;
        }

        public b c3(int i4) {
            copyOnWrite();
            ((g) this.instance).F3(i4);
            return this;
        }

        public b d3(int i4, r.b bVar) {
            copyOnWrite();
            ((g) this.instance).G3(i4, bVar);
            return this;
        }

        public b e3(int i4, r rVar) {
            copyOnWrite();
            ((g) this.instance).H3(i4, rVar);
            return this;
        }

        private b() {
            super(g.f65041g);
        }
    }

    static {
        g gVar = new g();
        f65041g = gVar;
        gVar.makeImmutable();
    }

    private g() {
    }

    public static g A3(InputStream inputStream) throws IOException {
        return (g) GeneratedMessageLite.parseFrom(f65041g, inputStream);
    }

    public static g B3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (g) GeneratedMessageLite.parseFrom(f65041g, inputStream, extensionRegistryLite);
    }

    public static g C3(byte[] bArr) throws InvalidProtocolBufferException {
        return (g) GeneratedMessageLite.parseFrom(f65041g, bArr);
    }

    public static g D3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (g) GeneratedMessageLite.parseFrom(f65041g, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E3(int i4) {
        o3();
        this.f65044c.remove(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F3(int i4) {
        this.f65045d = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G3(int i4, r.b bVar) {
        o3();
        this.f65044c.set(i4, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H3(int i4, r rVar) {
        Objects.requireNonNull(rVar);
        o3();
        this.f65044c.set(i4, rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h3(Iterable<? extends r> iterable) {
        o3();
        AbstractMessageLite.addAll(iterable, this.f65044c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3(int i4, r.b bVar) {
        o3();
        this.f65044c.add(i4, bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3(int i4, r rVar) {
        Objects.requireNonNull(rVar);
        o3();
        this.f65044c.add(i4, rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3(r.b bVar) {
        o3();
        this.f65044c.add(bVar.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3(r rVar) {
        Objects.requireNonNull(rVar);
        o3();
        this.f65044c.add(rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m3() {
        this.f65045d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n3() {
        this.f65044c = GeneratedMessageLite.emptyProtobufList();
    }

    private void o3() {
        if (this.f65044c.isModifiable()) {
            return;
        }
        this.f65044c = GeneratedMessageLite.mutableCopy(this.f65044c);
    }

    public static g p3() {
        return f65041g;
    }

    public static Parser<g> parser() {
        return f65041g.getParserForType();
    }

    public static b s3() {
        return f65041g.toBuilder();
    }

    public static b t3(g gVar) {
        return f65041g.toBuilder().mergeFrom((b) gVar);
    }

    public static g u3(InputStream inputStream) throws IOException {
        return (g) GeneratedMessageLite.parseDelimitedFrom(f65041g, inputStream);
    }

    public static g v3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (g) GeneratedMessageLite.parseDelimitedFrom(f65041g, inputStream, extensionRegistryLite);
    }

    public static g w3(ByteString byteString) throws InvalidProtocolBufferException {
        return (g) GeneratedMessageLite.parseFrom(f65041g, byteString);
    }

    public static g x3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (g) GeneratedMessageLite.parseFrom(f65041g, byteString, extensionRegistryLite);
    }

    public static g y3(CodedInputStream codedInputStream) throws IOException {
        return (g) GeneratedMessageLite.parseFrom(f65041g, codedInputStream);
    }

    public static g z3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (g) GeneratedMessageLite.parseFrom(f65041g, codedInputStream, extensionRegistryLite);
    }

    @Override // com.wufan.friend.chat.protocol.h
    public int G1() {
        return this.f65044c.size();
    }

    @Override // com.wufan.friend.chat.protocol.h
    public List<r> O0() {
        return this.f65044c;
    }

    @Override // com.wufan.friend.chat.protocol.h
    public int P() {
        return this.f65045d;
    }

    @Override // com.wufan.friend.chat.protocol.h
    public r R1(int i4) {
        return this.f65044c.get(i4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65046a[methodToInvoke.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return f65041g;
            case 3:
                this.f65044c.makeImmutable();
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                g gVar = (g) obj2;
                this.f65044c = visitor.visitList(this.f65044c, gVar.f65044c);
                int i4 = this.f65045d;
                boolean z4 = i4 != 0;
                int i5 = gVar.f65045d;
                this.f65045d = visitor.visitInt(z4, i4, i5 != 0, i5);
                if (visitor == GeneratedMessageLite.MergeFromVisitor.INSTANCE) {
                    this.f65043b |= gVar.f65043b;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!r1) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    if (!this.f65044c.isModifiable()) {
                                        this.f65044c = GeneratedMessageLite.mutableCopy(this.f65044c);
                                    }
                                    this.f65044c.add((r) codedInputStream.readMessage(r.parser(), extensionRegistryLite));
                                } else if (readTag != 16) {
                                    if (!codedInputStream.skipField(readTag)) {
                                    }
                                } else {
                                    this.f65045d = codedInputStream.readInt32();
                                }
                            }
                            r1 = true;
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
                if (f65042h == null) {
                    synchronized (g.class) {
                        if (f65042h == null) {
                            f65042h = new GeneratedMessageLite.DefaultInstanceBasedParser(f65041g);
                        }
                    }
                }
                return f65042h;
            default:
                throw new UnsupportedOperationException();
        }
        return f65041g;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f65044c.size(); i6++) {
            i5 += CodedOutputStream.computeMessageSize(1, this.f65044c.get(i6));
        }
        int i7 = this.f65045d;
        if (i7 != 0) {
            i5 += CodedOutputStream.computeInt32Size(2, i7);
        }
        this.memoizedSerializedSize = i5;
        return i5;
    }

    public b0 q3(int i4) {
        return this.f65044c.get(i4);
    }

    public List<? extends b0> r3() {
        return this.f65044c;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i4 = 0; i4 < this.f65044c.size(); i4++) {
            codedOutputStream.writeMessage(1, this.f65044c.get(i4));
        }
        int i5 = this.f65045d;
        if (i5 != 0) {
            codedOutputStream.writeInt32(2, i5);
        }
    }
}
