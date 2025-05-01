package io.netty.handler.codec.socks;
/* loaded from: classes6.dex */
public enum SocksAddressType {
    IPv4((byte) 1),
    DOMAIN((byte) 3),
    IPv6((byte) 4),
    UNKNOWN((byte) -1);
    

    /* renamed from: b  reason: collision with root package name */
    private final byte f69203b;

    SocksAddressType(byte b5) {
        this.f69203b = b5;
    }

    @Deprecated
    public static SocksAddressType fromByte(byte b5) {
        return valueOf(b5);
    }

    public byte byteValue() {
        return this.f69203b;
    }

    public static SocksAddressType valueOf(byte b5) {
        SocksAddressType[] values;
        for (SocksAddressType socksAddressType : values()) {
            if (socksAddressType.f69203b == b5) {
                return socksAddressType;
            }
        }
        return UNKNOWN;
    }
}
