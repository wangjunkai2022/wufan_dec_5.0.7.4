package io.netty.handler.codec.socks;
/* loaded from: classes6.dex */
public enum SocksCmdStatus {
    SUCCESS((byte) 0),
    FAILURE((byte) 1),
    FORBIDDEN((byte) 2),
    NETWORK_UNREACHABLE((byte) 3),
    HOST_UNREACHABLE((byte) 4),
    REFUSED((byte) 5),
    TTL_EXPIRED((byte) 6),
    COMMAND_NOT_SUPPORTED((byte) 7),
    ADDRESS_NOT_SUPPORTED((byte) 8),
    UNASSIGNED((byte) -1);
    

    /* renamed from: b  reason: collision with root package name */
    private final byte f69206b;

    SocksCmdStatus(byte b5) {
        this.f69206b = b5;
    }

    @Deprecated
    public static SocksCmdStatus fromByte(byte b5) {
        return valueOf(b5);
    }

    public byte byteValue() {
        return this.f69206b;
    }

    public static SocksCmdStatus valueOf(byte b5) {
        SocksCmdStatus[] values;
        for (SocksCmdStatus socksCmdStatus : values()) {
            if (socksCmdStatus.f69206b == b5) {
                return socksCmdStatus;
            }
        }
        return UNASSIGNED;
    }
}
