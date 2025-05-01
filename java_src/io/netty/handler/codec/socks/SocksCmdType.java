package io.netty.handler.codec.socks;
/* loaded from: classes6.dex */
public enum SocksCmdType {
    CONNECT((byte) 1),
    BIND((byte) 2),
    UDP((byte) 3),
    UNKNOWN((byte) -1);
    

    /* renamed from: b  reason: collision with root package name */
    private final byte f69207b;

    SocksCmdType(byte b5) {
        this.f69207b = b5;
    }

    @Deprecated
    public static SocksCmdType fromByte(byte b5) {
        return valueOf(b5);
    }

    public byte byteValue() {
        return this.f69207b;
    }

    public static SocksCmdType valueOf(byte b5) {
        SocksCmdType[] values;
        for (SocksCmdType socksCmdType : values()) {
            if (socksCmdType.f69207b == b5) {
                return socksCmdType;
            }
        }
        return UNKNOWN;
    }
}
