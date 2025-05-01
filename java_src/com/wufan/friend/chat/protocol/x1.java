package com.wufan.friend.chat.protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.wufan.friend.chat.protocol.k;
import com.wufan.friend.chat.protocol.l1;
import com.wufan.friend.chat.protocol.p0;
import com.wufan.friend.chat.protocol.v0;
import com.wufan.friend.chat.protocol.y0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* compiled from: ResponseData.java */
/* loaded from: classes6.dex */
public final class x1 extends GeneratedMessageLite<x1, b> implements y1 {

    /* renamed from: g  reason: collision with root package name */
    public static final int f65281g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f65282h = 2;

    /* renamed from: i  reason: collision with root package name */
    public static final int f65283i = 3;

    /* renamed from: j  reason: collision with root package name */
    public static final int f65284j = 4;

    /* renamed from: k  reason: collision with root package name */
    public static final int f65285k = 5;

    /* renamed from: l  reason: collision with root package name */
    private static final x1 f65286l;

    /* renamed from: m  reason: collision with root package name */
    private static volatile Parser<x1> f65287m;

    /* renamed from: b  reason: collision with root package name */
    private v0 f65288b;

    /* renamed from: c  reason: collision with root package name */
    private y0 f65289c;

    /* renamed from: d  reason: collision with root package name */
    private l1 f65290d;

    /* renamed from: e  reason: collision with root package name */
    private p0 f65291e;

    /* renamed from: f  reason: collision with root package name */
    private k f65292f;

    /* compiled from: ResponseData.java */
    /* loaded from: classes6.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65293a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f65293a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65293a[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65293a[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65293a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65293a[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65293a[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65293a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65293a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: ResponseData.java */
    /* loaded from: classes6.dex */
    public static final class b extends GeneratedMessageLite.Builder<x1, b> implements y1 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.wufan.friend.chat.protocol.y1
        public l1 F1() {
            return ((x1) this.instance).F1();
        }

        @Override // com.wufan.friend.chat.protocol.y1
        public k K0() {
            return ((x1) this.instance).K0();
        }

        @Override // com.wufan.friend.chat.protocol.y1
        public boolean V0() {
            return ((x1) this.instance).V0();
        }

        public b V2() {
            copyOnWrite();
            ((x1) this.instance).r3();
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.y1
        public p0 W0() {
            return ((x1) this.instance).W0();
        }

        public b W2() {
            copyOnWrite();
            ((x1) this.instance).s3();
            return this;
        }

        public b X0() {
            copyOnWrite();
            ((x1) this.instance).q3();
            return this;
        }

        public b X2() {
            copyOnWrite();
            ((x1) this.instance).clearNotification();
            return this;
        }

        public b Y2() {
            copyOnWrite();
            ((x1) this.instance).t3();
            return this;
        }

        public b Z2(k kVar) {
            copyOnWrite();
            ((x1) this.instance).v3(kVar);
            return this;
        }

        public b a3(p0 p0Var) {
            copyOnWrite();
            ((x1) this.instance).w3(p0Var);
            return this;
        }

        public b b3(v0 v0Var) {
            copyOnWrite();
            ((x1) this.instance).x3(v0Var);
            return this;
        }

        public b c3(y0 y0Var) {
            copyOnWrite();
            ((x1) this.instance).y3(y0Var);
            return this;
        }

        public b d3(l1 l1Var) {
            copyOnWrite();
            ((x1) this.instance).z3(l1Var);
            return this;
        }

        public b e3(k.b bVar) {
            copyOnWrite();
            ((x1) this.instance).M3(bVar);
            return this;
        }

        public b f3(k kVar) {
            copyOnWrite();
            ((x1) this.instance).N3(kVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.y1
        public boolean g1() {
            return ((x1) this.instance).g1();
        }

        public b g3(p0.b bVar) {
            copyOnWrite();
            ((x1) this.instance).O3(bVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.y1
        public y0 getNotification() {
            return ((x1) this.instance).getNotification();
        }

        public b h3(p0 p0Var) {
            copyOnWrite();
            ((x1) this.instance).P3(p0Var);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.y1
        public boolean hasNotification() {
            return ((x1) this.instance).hasNotification();
        }

        public b i3(v0.b bVar) {
            copyOnWrite();
            ((x1) this.instance).Q3(bVar);
            return this;
        }

        public b j3(v0 v0Var) {
            copyOnWrite();
            ((x1) this.instance).R3(v0Var);
            return this;
        }

        public b k3(y0.b bVar) {
            copyOnWrite();
            ((x1) this.instance).S3(bVar);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.y1
        public boolean l1() {
            return ((x1) this.instance).l1();
        }

        public b l3(y0 y0Var) {
            copyOnWrite();
            ((x1) this.instance).T3(y0Var);
            return this;
        }

        public b m3(l1.b bVar) {
            copyOnWrite();
            ((x1) this.instance).U3(bVar);
            return this;
        }

        public b n3(l1 l1Var) {
            copyOnWrite();
            ((x1) this.instance).V3(l1Var);
            return this;
        }

        @Override // com.wufan.friend.chat.protocol.y1
        public boolean o1() {
            return ((x1) this.instance).o1();
        }

        @Override // com.wufan.friend.chat.protocol.y1
        public v0 z2() {
            return ((x1) this.instance).z2();
        }

        private b() {
            super(x1.f65286l);
        }
    }

    static {
        x1 x1Var = new x1();
        f65286l = x1Var;
        x1Var.makeImmutable();
    }

    private x1() {
    }

    public static b A3() {
        return f65286l.toBuilder();
    }

    public static b B3(x1 x1Var) {
        return f65286l.toBuilder().mergeFrom((b) x1Var);
    }

    public static x1 C3(InputStream inputStream) throws IOException {
        return (x1) GeneratedMessageLite.parseDelimitedFrom(f65286l, inputStream);
    }

    public static x1 D3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (x1) GeneratedMessageLite.parseDelimitedFrom(f65286l, inputStream, extensionRegistryLite);
    }

    public static x1 E3(ByteString byteString) throws InvalidProtocolBufferException {
        return (x1) GeneratedMessageLite.parseFrom(f65286l, byteString);
    }

    public static x1 F3(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (x1) GeneratedMessageLite.parseFrom(f65286l, byteString, extensionRegistryLite);
    }

    public static x1 G3(CodedInputStream codedInputStream) throws IOException {
        return (x1) GeneratedMessageLite.parseFrom(f65286l, codedInputStream);
    }

    public static x1 H3(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (x1) GeneratedMessageLite.parseFrom(f65286l, codedInputStream, extensionRegistryLite);
    }

    public static x1 I3(InputStream inputStream) throws IOException {
        return (x1) GeneratedMessageLite.parseFrom(f65286l, inputStream);
    }

    public static x1 J3(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (x1) GeneratedMessageLite.parseFrom(f65286l, inputStream, extensionRegistryLite);
    }

    public static x1 K3(byte[] bArr) throws InvalidProtocolBufferException {
        return (x1) GeneratedMessageLite.parseFrom(f65286l, bArr);
    }

    public static x1 L3(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (x1) GeneratedMessageLite.parseFrom(f65286l, bArr, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M3(k.b bVar) {
        this.f65292f = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N3(k kVar) {
        Objects.requireNonNull(kVar);
        this.f65292f = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O3(p0.b bVar) {
        this.f65291e = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P3(p0 p0Var) {
        Objects.requireNonNull(p0Var);
        this.f65291e = p0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q3(v0.b bVar) {
        this.f65288b = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R3(v0 v0Var) {
        Objects.requireNonNull(v0Var);
        this.f65288b = v0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S3(y0.b bVar) {
        this.f65289c = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T3(y0 y0Var) {
        Objects.requireNonNull(y0Var);
        this.f65289c = y0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U3(l1.b bVar) {
        this.f65290d = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V3(l1 l1Var) {
        Objects.requireNonNull(l1Var);
        this.f65290d = l1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNotification() {
        this.f65289c = null;
    }

    public static Parser<x1> parser() {
        return f65286l.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q3() {
        this.f65292f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3() {
        this.f65291e = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s3() {
        this.f65288b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t3() {
        this.f65290d = null;
    }

    public static x1 u3() {
        return f65286l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v3(k kVar) {
        k kVar2 = this.f65292f;
        if (kVar2 != null && kVar2 != k.c3()) {
            this.f65292f = k.e3(this.f65292f).mergeFrom((k.b) kVar).buildPartial();
        } else {
            this.f65292f = kVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w3(p0 p0Var) {
        p0 p0Var2 = this.f65291e;
        if (p0Var2 != null && p0Var2 != p0.m3()) {
            this.f65291e = p0.q3(this.f65291e).mergeFrom((p0.b) p0Var).buildPartial();
        } else {
            this.f65291e = p0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3(v0 v0Var) {
        v0 v0Var2 = this.f65288b;
        if (v0Var2 != null && v0Var2 != v0.c3()) {
            this.f65288b = v0.e3(this.f65288b).mergeFrom((v0.b) v0Var).buildPartial();
        } else {
            this.f65288b = v0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3(y0 y0Var) {
        y0 y0Var2 = this.f65289c;
        if (y0Var2 != null && y0Var2 != y0.M4()) {
            this.f65289c = y0.f5(this.f65289c).mergeFrom((y0.b) y0Var).buildPartial();
        } else {
            this.f65289c = y0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z3(l1 l1Var) {
        l1 l1Var2 = this.f65290d;
        if (l1Var2 != null && l1Var2 != l1.m3()) {
            this.f65290d = l1.q3(this.f65290d).mergeFrom((l1.b) l1Var).buildPartial();
        } else {
            this.f65290d = l1Var;
        }
    }

    @Override // com.wufan.friend.chat.protocol.y1
    public l1 F1() {
        l1 l1Var = this.f65290d;
        return l1Var == null ? l1.m3() : l1Var;
    }

    @Override // com.wufan.friend.chat.protocol.y1
    public k K0() {
        k kVar = this.f65292f;
        return kVar == null ? k.c3() : kVar;
    }

    @Override // com.wufan.friend.chat.protocol.y1
    public boolean V0() {
        return this.f65292f != null;
    }

    @Override // com.wufan.friend.chat.protocol.y1
    public p0 W0() {
        p0 p0Var = this.f65291e;
        return p0Var == null ? p0.m3() : p0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f65293a[methodToInvoke.ordinal()]) {
            case 1:
                return new x1();
            case 2:
                return f65286l;
            case 3:
                return null;
            case 4:
                return new b(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                x1 x1Var = (x1) obj2;
                this.f65288b = (v0) visitor.visitMessage(this.f65288b, x1Var.f65288b);
                this.f65289c = (y0) visitor.visitMessage(this.f65289c, x1Var.f65289c);
                this.f65290d = (l1) visitor.visitMessage(this.f65290d, x1Var.f65290d);
                this.f65291e = (p0) visitor.visitMessage(this.f65291e, x1Var.f65291e);
                this.f65292f = (k) visitor.visitMessage(this.f65292f, x1Var.f65292f);
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
                            if (readTag == 10) {
                                v0 v0Var = this.f65288b;
                                v0.b builder = v0Var != null ? v0Var.toBuilder() : null;
                                v0 v0Var2 = (v0) codedInputStream.readMessage(v0.parser(), extensionRegistryLite);
                                this.f65288b = v0Var2;
                                if (builder != null) {
                                    builder.mergeFrom((v0.b) v0Var2);
                                    this.f65288b = builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                y0 y0Var = this.f65289c;
                                y0.b builder2 = y0Var != null ? y0Var.toBuilder() : null;
                                y0 y0Var2 = (y0) codedInputStream.readMessage(y0.parser(), extensionRegistryLite);
                                this.f65289c = y0Var2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((y0.b) y0Var2);
                                    this.f65289c = builder2.buildPartial();
                                }
                            } else if (readTag == 26) {
                                l1 l1Var = this.f65290d;
                                l1.b builder3 = l1Var != null ? l1Var.toBuilder() : null;
                                l1 l1Var2 = (l1) codedInputStream.readMessage(l1.parser(), extensionRegistryLite);
                                this.f65290d = l1Var2;
                                if (builder3 != null) {
                                    builder3.mergeFrom((l1.b) l1Var2);
                                    this.f65290d = builder3.buildPartial();
                                }
                            } else if (readTag == 34) {
                                p0 p0Var = this.f65291e;
                                p0.b builder4 = p0Var != null ? p0Var.toBuilder() : null;
                                p0 p0Var2 = (p0) codedInputStream.readMessage(p0.parser(), extensionRegistryLite);
                                this.f65291e = p0Var2;
                                if (builder4 != null) {
                                    builder4.mergeFrom((p0.b) p0Var2);
                                    this.f65291e = builder4.buildPartial();
                                }
                            } else if (readTag != 42) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                k kVar = this.f65292f;
                                k.b builder5 = kVar != null ? kVar.toBuilder() : null;
                                k kVar2 = (k) codedInputStream.readMessage(k.parser(), extensionRegistryLite);
                                this.f65292f = kVar2;
                                if (builder5 != null) {
                                    builder5.mergeFrom((k.b) kVar2);
                                    this.f65292f = builder5.buildPartial();
                                }
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
                if (f65287m == null) {
                    synchronized (x1.class) {
                        if (f65287m == null) {
                            f65287m = new GeneratedMessageLite.DefaultInstanceBasedParser(f65286l);
                        }
                    }
                }
                return f65287m;
            default:
                throw new UnsupportedOperationException();
        }
        return f65286l;
    }

    @Override // com.wufan.friend.chat.protocol.y1
    public boolean g1() {
        return this.f65291e != null;
    }

    @Override // com.wufan.friend.chat.protocol.y1
    public y0 getNotification() {
        y0 y0Var = this.f65289c;
        return y0Var == null ? y0.M4() : y0Var;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int computeMessageSize = this.f65288b != null ? 0 + CodedOutputStream.computeMessageSize(1, z2()) : 0;
        if (this.f65289c != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(2, getNotification());
        }
        if (this.f65290d != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(3, F1());
        }
        if (this.f65291e != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(4, W0());
        }
        if (this.f65292f != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(5, K0());
        }
        this.memoizedSerializedSize = computeMessageSize;
        return computeMessageSize;
    }

    @Override // com.wufan.friend.chat.protocol.y1
    public boolean hasNotification() {
        return this.f65289c != null;
    }

    @Override // com.wufan.friend.chat.protocol.y1
    public boolean l1() {
        return this.f65290d != null;
    }

    @Override // com.wufan.friend.chat.protocol.y1
    public boolean o1() {
        return this.f65288b != null;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f65288b != null) {
            codedOutputStream.writeMessage(1, z2());
        }
        if (this.f65289c != null) {
            codedOutputStream.writeMessage(2, getNotification());
        }
        if (this.f65290d != null) {
            codedOutputStream.writeMessage(3, F1());
        }
        if (this.f65291e != null) {
            codedOutputStream.writeMessage(4, W0());
        }
        if (this.f65292f != null) {
            codedOutputStream.writeMessage(5, K0());
        }
    }

    @Override // com.wufan.friend.chat.protocol.y1
    public v0 z2() {
        v0 v0Var = this.f65288b;
        return v0Var == null ? v0.c3() : v0Var;
    }
}
