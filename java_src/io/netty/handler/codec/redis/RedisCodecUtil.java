package io.netty.handler.codec.redis;

import io.netty.handler.codec.http2.Http2CodecUtil;
import io.netty.util.CharsetUtil;
import io.netty.util.internal.PlatformDependent;
/* loaded from: classes6.dex */
final class RedisCodecUtil {
    private RedisCodecUtil() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] longToAsciiBytes(long j4) {
        return Long.toString(j4).getBytes(CharsetUtil.US_ASCII);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static short makeShort(char c5, char c6) {
        return (short) (PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? c5 | (c6 << '\b') : (c5 << '\b') | c6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] shortToBytes(short s4) {
        byte[] bArr = new byte[2];
        if (PlatformDependent.BIG_ENDIAN_NATIVE_ORDER) {
            bArr[1] = (byte) ((s4 >> 8) & 255);
            bArr[0] = (byte) (s4 & Http2CodecUtil.MAX_UNSIGNED_BYTE);
        } else {
            bArr[0] = (byte) ((s4 >> 8) & 255);
            bArr[1] = (byte) (s4 & Http2CodecUtil.MAX_UNSIGNED_BYTE);
        }
        return bArr;
    }
}
