package io.netty.handler.codec.haproxy;
/* loaded from: classes6.dex */
public enum HAProxyCommand {
    LOCAL((byte) 0),
    PROXY((byte) 1);
    
    private static final byte COMMAND_MASK = 15;
    private final byte byteValue;

    HAProxyCommand(byte b5) {
        this.byteValue = b5;
    }

    public byte byteValue() {
        return this.byteValue;
    }

    public static HAProxyCommand valueOf(byte b5) {
        int i4 = b5 & 15;
        byte b6 = (byte) i4;
        if (b6 != 0) {
            if (b6 == 1) {
                return PROXY;
            }
            throw new IllegalArgumentException("unknown command: " + i4);
        }
        return LOCAL;
    }
}
