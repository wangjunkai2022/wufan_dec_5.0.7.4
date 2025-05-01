package androidx.emoji2.text.flatbuffer;

import com.papa91.arc.ext.Log;
import io.netty.handler.codec.memcache.binary.BinaryMemcacheOpcodes;
import java.nio.ByteBuffer;
/* loaded from: classes2.dex */
public abstract class Utf8 {
    private static Utf8 DEFAULT;

    /* loaded from: classes2.dex */
    static class DecodeUtil {
        DecodeUtil() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void handleFourBytes(byte b5, byte b6, byte b7, byte b8, char[] cArr, int i4) throws IllegalArgumentException {
            if (!isNotTrailingByte(b6) && (((b5 << BinaryMemcacheOpcodes.TOUCH) + (b6 + 112)) >> 30) == 0 && !isNotTrailingByte(b7) && !isNotTrailingByte(b8)) {
                int trailingByteValue = ((b5 & 7) << 18) | (trailingByteValue(b6) << 12) | (trailingByteValue(b7) << 6) | trailingByteValue(b8);
                cArr[i4] = highSurrogate(trailingByteValue);
                cArr[i4 + 1] = lowSurrogate(trailingByteValue);
                return;
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void handleOneByte(byte b5, char[] cArr, int i4) {
            cArr[i4] = (char) b5;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void handleThreeBytes(byte b5, byte b6, byte b7, char[] cArr, int i4) throws IllegalArgumentException {
            if (!isNotTrailingByte(b6) && ((b5 != -32 || b6 >= -96) && ((b5 != -19 || b6 < -96) && !isNotTrailingByte(b7)))) {
                cArr[i4] = (char) (((b5 & 15) << 12) | (trailingByteValue(b6) << 6) | trailingByteValue(b7));
                return;
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void handleTwoBytes(byte b5, byte b6, char[] cArr, int i4) throws IllegalArgumentException {
            if (b5 >= -62) {
                if (!isNotTrailingByte(b6)) {
                    cArr[i4] = (char) (((b5 & 31) << 6) | trailingByteValue(b6));
                    return;
                }
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }

        private static char highSurrogate(int i4) {
            return (char) ((i4 >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
        }

        private static boolean isNotTrailingByte(byte b5) {
            return b5 > -65;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static boolean isOneByte(byte b5) {
            return b5 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static boolean isThreeBytes(byte b5) {
            return b5 < -16;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static boolean isTwoBytes(byte b5) {
            return b5 < -32;
        }

        private static char lowSurrogate(int i4) {
            return (char) ((i4 & Log.LogWrapper.MAX_MSG_LEN) + 56320);
        }

        private static int trailingByteValue(byte b5) {
            return b5 & okio.Utf8.REPLACEMENT_BYTE;
        }
    }

    /* loaded from: classes2.dex */
    static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i4, int i5) {
            super("Unpaired surrogate at index " + i4 + " of " + i5);
        }
    }

    public static Utf8 getDefault() {
        if (DEFAULT == null) {
            DEFAULT = new Utf8Safe();
        }
        return DEFAULT;
    }

    public static void setDefault(Utf8 utf8) {
        DEFAULT = utf8;
    }

    public abstract String decodeUtf8(ByteBuffer byteBuffer, int i4, int i5);

    public abstract void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int encodedLength(CharSequence charSequence);
}
