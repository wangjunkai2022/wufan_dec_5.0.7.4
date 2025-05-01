package io.netty.handler.codec.socks;
/* loaded from: classes6.dex */
public enum SocksSubnegotiationVersion {
    AUTH_PASSWORD((byte) 1),
    UNKNOWN((byte) -1);
    

    /* renamed from: b  reason: collision with root package name */
    private final byte f69209b;

    SocksSubnegotiationVersion(byte b5) {
        this.f69209b = b5;
    }

    @Deprecated
    public static SocksSubnegotiationVersion fromByte(byte b5) {
        return valueOf(b5);
    }

    public byte byteValue() {
        return this.f69209b;
    }

    public static SocksSubnegotiationVersion valueOf(byte b5) {
        SocksSubnegotiationVersion[] values;
        for (SocksSubnegotiationVersion socksSubnegotiationVersion : values()) {
            if (socksSubnegotiationVersion.f69209b == b5) {
                return socksSubnegotiationVersion;
            }
        }
        return UNKNOWN;
    }
}
