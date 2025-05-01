package io.netty.handler.codec.socks;
/* loaded from: classes6.dex */
public enum SocksAuthStatus {
    SUCCESS((byte) 0),
    FAILURE((byte) -1);
    

    /* renamed from: b  reason: collision with root package name */
    private final byte f69205b;

    SocksAuthStatus(byte b5) {
        this.f69205b = b5;
    }

    @Deprecated
    public static SocksAuthStatus fromByte(byte b5) {
        return valueOf(b5);
    }

    public byte byteValue() {
        return this.f69205b;
    }

    public static SocksAuthStatus valueOf(byte b5) {
        SocksAuthStatus[] values;
        for (SocksAuthStatus socksAuthStatus : values()) {
            if (socksAuthStatus.f69205b == b5) {
                return socksAuthStatus;
            }
        }
        return FAILURE;
    }
}
