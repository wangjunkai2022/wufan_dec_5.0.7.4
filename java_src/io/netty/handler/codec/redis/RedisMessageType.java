package io.netty.handler.codec.redis;

import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.http.HttpConstants;
import io.netty.handler.codec.memcache.binary.BinaryMemcacheOpcodes;
/* loaded from: classes6.dex */
public enum RedisMessageType {
    INLINE_COMMAND(null, true),
    SIMPLE_STRING((byte) 43, true),
    ERROR((byte) 45, true),
    INTEGER(Byte.valueOf((byte) HttpConstants.COLON), true),
    BULK_STRING(Byte.valueOf((byte) BinaryMemcacheOpcodes.GATKQ), false),
    ARRAY_HEADER((byte) 42, false);
    
    private final boolean inline;
    private final Byte value;

    RedisMessageType(Byte b5, boolean z4) {
        this.value = b5;
        this.inline = z4;
    }

    public static RedisMessageType readFrom(ByteBuf byteBuf, boolean z4) {
        int readerIndex = byteBuf.readerIndex();
        RedisMessageType valueOf = valueOf(byteBuf.readByte());
        if (valueOf == INLINE_COMMAND) {
            if (z4) {
                byteBuf.readerIndex(readerIndex);
            } else {
                throw new RedisCodecException("Decoding of inline commands is disabled");
            }
        }
        return valueOf;
    }

    public boolean isInline() {
        return this.inline;
    }

    public int length() {
        return this.value != null ? 1 : 0;
    }

    public void writeTo(ByteBuf byteBuf) {
        Byte b5 = this.value;
        if (b5 == null) {
            return;
        }
        byteBuf.writeByte(b5.byteValue());
    }

    private static RedisMessageType valueOf(byte b5) {
        if (b5 != 36) {
            if (b5 != 45) {
                if (b5 != 58) {
                    if (b5 != 42) {
                        if (b5 != 43) {
                            return INLINE_COMMAND;
                        }
                        return SIMPLE_STRING;
                    }
                    return ARRAY_HEADER;
                }
                return INTEGER;
            }
            return ERROR;
        }
        return BULK_STRING;
    }
}
