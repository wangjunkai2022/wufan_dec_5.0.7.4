package io.netty.handler.codec.socks;
/* loaded from: classes6.dex */
public enum SocksProtocolVersion {
    SOCKS4a((byte) 4),
    SOCKS5((byte) 5),
    UNKNOWN((byte) -1);
    

    /* renamed from: b  reason: collision with root package name */
    private final byte f69208b;

    SocksProtocolVersion(byte b5) {
        this.f69208b = b5;
    }

    @Deprecated
    public static SocksProtocolVersion fromByte(byte b5) {
        return valueOf(b5);
    }

    public byte byteValue() {
        return this.f69208b;
    }

    public static SocksProtocolVersion valueOf(byte b5) {
        SocksProtocolVersion[] values;
        for (SocksProtocolVersion socksProtocolVersion : values()) {
            if (socksProtocolVersion.f69208b == b5) {
                return socksProtocolVersion;
            }
        }
        return UNKNOWN;
    }
}
