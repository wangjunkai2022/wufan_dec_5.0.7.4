package com.papa91.battle.protocol;

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
import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes5.dex */
public final class KickInfo extends GeneratedMessageLite<KickInfo, Builder> implements KickInfoOrBuilder, Serializable {
    public static final int COPPER_FIELD_NUMBER = 2;
    public static final int COUNT_FIELD_NUMBER = 1;
    private static final KickInfo DEFAULT_INSTANCE;
    public static final int ISVIP_FIELD_NUMBER = 3;
    public static final int NICKNAME_FIELD_NUMBER = 4;
    private static volatile Parser<KickInfo> PARSER = null;
    public static final int VIPCOPPER_FIELD_NUMBER = 5;
    private int copper_;
    private int count_;
    private boolean isVIP_;
    private String nickname_ = "";
    private int vipCopper_;

    /* renamed from: com.papa91.battle.protocol.KickInfo$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<KickInfo, Builder> implements KickInfoOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearCopper() {
            copyOnWrite();
            ((KickInfo) this.instance).clearCopper();
            return this;
        }

        public Builder clearCount() {
            copyOnWrite();
            ((KickInfo) this.instance).clearCount();
            return this;
        }

        public Builder clearIsVIP() {
            copyOnWrite();
            ((KickInfo) this.instance).clearIsVIP();
            return this;
        }

        public Builder clearNickname() {
            copyOnWrite();
            ((KickInfo) this.instance).clearNickname();
            return this;
        }

        public Builder clearVipCopper() {
            copyOnWrite();
            ((KickInfo) this.instance).clearVipCopper();
            return this;
        }

        @Override // com.papa91.battle.protocol.KickInfoOrBuilder
        public int getCopper() {
            return ((KickInfo) this.instance).getCopper();
        }

        @Override // com.papa91.battle.protocol.KickInfoOrBuilder
        public int getCount() {
            return ((KickInfo) this.instance).getCount();
        }

        @Override // com.papa91.battle.protocol.KickInfoOrBuilder
        public boolean getIsVIP() {
            return ((KickInfo) this.instance).getIsVIP();
        }

        @Override // com.papa91.battle.protocol.KickInfoOrBuilder
        public String getNickname() {
            return ((KickInfo) this.instance).getNickname();
        }

        @Override // com.papa91.battle.protocol.KickInfoOrBuilder
        public ByteString getNicknameBytes() {
            return ((KickInfo) this.instance).getNicknameBytes();
        }

        @Override // com.papa91.battle.protocol.KickInfoOrBuilder
        public int getVipCopper() {
            return ((KickInfo) this.instance).getVipCopper();
        }

        public Builder setCopper(int i4) {
            copyOnWrite();
            ((KickInfo) this.instance).setCopper(i4);
            return this;
        }

        public Builder setCount(int i4) {
            copyOnWrite();
            ((KickInfo) this.instance).setCount(i4);
            return this;
        }

        public Builder setIsVIP(boolean z4) {
            copyOnWrite();
            ((KickInfo) this.instance).setIsVIP(z4);
            return this;
        }

        public Builder setNickname(String str) {
            copyOnWrite();
            ((KickInfo) this.instance).setNickname(str);
            return this;
        }

        public Builder setNicknameBytes(ByteString byteString) {
            copyOnWrite();
            ((KickInfo) this.instance).setNicknameBytes(byteString);
            return this;
        }

        public Builder setVipCopper(int i4) {
            copyOnWrite();
            ((KickInfo) this.instance).setVipCopper(i4);
            return this;
        }

        private Builder() {
            super(KickInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        KickInfo kickInfo = new KickInfo();
        DEFAULT_INSTANCE = kickInfo;
        kickInfo.makeImmutable();
    }

    private KickInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCopper() {
        this.copper_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCount() {
        this.count_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsVIP() {
        this.isVIP_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNickname() {
        this.nickname_ = getDefaultInstance().getNickname();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVipCopper() {
        this.vipCopper_ = 0;
    }

    public static KickInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static KickInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (KickInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KickInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (KickInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<KickInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCopper(int i4) {
        this.copper_ = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCount(int i4) {
        this.count_ = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsVIP(boolean z4) {
        this.isVIP_ = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNickname(String str) {
        Objects.requireNonNull(str);
        this.nickname_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNicknameBytes(ByteString byteString) {
        Objects.requireNonNull(byteString);
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.nickname_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVipCopper(int i4) {
        this.vipCopper_ = i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new KickInfo();
            case 2:
                return DEFAULT_INSTANCE;
            case 3:
                return null;
            case 4:
                return new Builder(null);
            case 5:
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor) obj;
                KickInfo kickInfo = (KickInfo) obj2;
                int i4 = this.count_;
                boolean z4 = i4 != 0;
                int i5 = kickInfo.count_;
                this.count_ = visitor.visitInt(z4, i4, i5 != 0, i5);
                int i6 = this.copper_;
                boolean z5 = i6 != 0;
                int i7 = kickInfo.copper_;
                this.copper_ = visitor.visitInt(z5, i6, i7 != 0, i7);
                boolean z6 = this.isVIP_;
                boolean z7 = kickInfo.isVIP_;
                this.isVIP_ = visitor.visitBoolean(z6, z6, z7, z7);
                this.nickname_ = visitor.visitString(!this.nickname_.isEmpty(), this.nickname_, !kickInfo.nickname_.isEmpty(), kickInfo.nickname_);
                int i8 = this.vipCopper_;
                boolean z8 = i8 != 0;
                int i9 = kickInfo.vipCopper_;
                this.vipCopper_ = visitor.visitInt(z8, i8, i9 != 0, i9);
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
                                this.count_ = codedInputStream.readInt32();
                            } else if (readTag == 16) {
                                this.copper_ = codedInputStream.readInt32();
                            } else if (readTag == 24) {
                                this.isVIP_ = codedInputStream.readBool();
                            } else if (readTag == 34) {
                                this.nickname_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag != 40) {
                                if (!codedInputStream.skipField(readTag)) {
                                }
                            } else {
                                this.vipCopper_ = codedInputStream.readInt32();
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
                if (PARSER == null) {
                    synchronized (KickInfo.class) {
                        if (PARSER == null) {
                            PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                        }
                    }
                }
                return PARSER;
            default:
                throw new UnsupportedOperationException();
        }
        return DEFAULT_INSTANCE;
    }

    @Override // com.papa91.battle.protocol.KickInfoOrBuilder
    public int getCopper() {
        return this.copper_;
    }

    @Override // com.papa91.battle.protocol.KickInfoOrBuilder
    public int getCount() {
        return this.count_;
    }

    @Override // com.papa91.battle.protocol.KickInfoOrBuilder
    public boolean getIsVIP() {
        return this.isVIP_;
    }

    @Override // com.papa91.battle.protocol.KickInfoOrBuilder
    public String getNickname() {
        return this.nickname_;
    }

    @Override // com.papa91.battle.protocol.KickInfoOrBuilder
    public ByteString getNicknameBytes() {
        return ByteString.copyFromUtf8(this.nickname_);
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i4 = this.memoizedSerializedSize;
        if (i4 != -1) {
            return i4;
        }
        int i5 = this.count_;
        int computeInt32Size = i5 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i5) : 0;
        int i6 = this.copper_;
        if (i6 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(2, i6);
        }
        boolean z4 = this.isVIP_;
        if (z4) {
            computeInt32Size += CodedOutputStream.computeBoolSize(3, z4);
        }
        if (!this.nickname_.isEmpty()) {
            computeInt32Size += CodedOutputStream.computeStringSize(4, getNickname());
        }
        int i7 = this.vipCopper_;
        if (i7 != 0) {
            computeInt32Size += CodedOutputStream.computeInt32Size(5, i7);
        }
        this.memoizedSerializedSize = computeInt32Size;
        return computeInt32Size;
    }

    @Override // com.papa91.battle.protocol.KickInfoOrBuilder
    public int getVipCopper() {
        return this.vipCopper_;
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i4 = this.count_;
        if (i4 != 0) {
            codedOutputStream.writeInt32(1, i4);
        }
        int i5 = this.copper_;
        if (i5 != 0) {
            codedOutputStream.writeInt32(2, i5);
        }
        boolean z4 = this.isVIP_;
        if (z4) {
            codedOutputStream.writeBool(3, z4);
        }
        if (!this.nickname_.isEmpty()) {
            codedOutputStream.writeString(4, getNickname());
        }
        int i6 = this.vipCopper_;
        if (i6 != 0) {
            codedOutputStream.writeInt32(5, i6);
        }
    }

    public static Builder newBuilder(KickInfo kickInfo) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom((Builder) kickInfo);
    }

    public static KickInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KickInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static KickInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KickInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static KickInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (KickInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static KickInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KickInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static KickInfo parseFrom(InputStream inputStream) throws IOException {
        return (KickInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KickInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KickInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static KickInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (KickInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static KickInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KickInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
