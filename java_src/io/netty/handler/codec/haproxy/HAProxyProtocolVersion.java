package io.netty.handler.codec.haproxy;
/* loaded from: classes6.dex */
public enum HAProxyProtocolVersion {
    V1((byte) 16),
    V2((byte) 32);
    
    private static final byte VERSION_MASK = -16;
    private final byte byteValue;

    HAProxyProtocolVersion(byte b5) {
        this.byteValue = b5;
    }

    public byte byteValue() {
        return this.byteValue;
    }

    public static HAProxyProtocolVersion valueOf(byte b5) {
        int i4 = b5 & VERSION_MASK;
        byte b6 = (byte) i4;
        if (b6 != 16) {
            if (b6 == 32) {
                return V2;
            }
            throw new IllegalArgumentException("unknown version: " + i4);
        }
        return V1;
    }
}
