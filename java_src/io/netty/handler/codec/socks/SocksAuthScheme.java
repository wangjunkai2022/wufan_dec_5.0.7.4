package io.netty.handler.codec.socks;
/* loaded from: classes6.dex */
public enum SocksAuthScheme {
    NO_AUTH((byte) 0),
    AUTH_GSSAPI((byte) 1),
    AUTH_PASSWORD((byte) 2),
    UNKNOWN((byte) -1);
    

    /* renamed from: b  reason: collision with root package name */
    private final byte f69204b;

    SocksAuthScheme(byte b5) {
        this.f69204b = b5;
    }

    @Deprecated
    public static SocksAuthScheme fromByte(byte b5) {
        return valueOf(b5);
    }

    public byte byteValue() {
        return this.f69204b;
    }

    public static SocksAuthScheme valueOf(byte b5) {
        SocksAuthScheme[] values;
        for (SocksAuthScheme socksAuthScheme : values()) {
            if (socksAuthScheme.f69204b == b5) {
                return socksAuthScheme;
            }
        }
        return UNKNOWN;
    }
}
