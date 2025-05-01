package io.netty.handler.codec.socksx;
/* loaded from: classes6.dex */
public enum SocksVersion {
    SOCKS4a((byte) 4),
    SOCKS5((byte) 5),
    UNKNOWN((byte) -1);
    

    /* renamed from: b  reason: collision with root package name */
    private final byte f69210b;

    SocksVersion(byte b5) {
        this.f69210b = b5;
    }

    public byte byteValue() {
        return this.f69210b;
    }

    public static SocksVersion valueOf(byte b5) {
        SocksVersion socksVersion = SOCKS4a;
        if (b5 == socksVersion.byteValue()) {
            return socksVersion;
        }
        SocksVersion socksVersion2 = SOCKS5;
        return b5 == socksVersion2.byteValue() ? socksVersion2 : UNKNOWN;
    }
}
