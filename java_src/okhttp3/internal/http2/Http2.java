package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.Util;
import okio.ByteString;
/* loaded from: classes7.dex */
public final class Http2 {
    static final byte FLAG_ACK = 1;
    static final byte FLAG_COMPRESSED = 32;
    static final byte FLAG_END_HEADERS = 4;
    static final byte FLAG_END_PUSH_PROMISE = 4;
    static final byte FLAG_END_STREAM = 1;
    static final byte FLAG_NONE = 0;
    static final byte FLAG_PADDED = 8;
    static final byte FLAG_PRIORITY = 32;
    static final int INITIAL_MAX_FRAME_SIZE = 16384;
    static final byte TYPE_CONTINUATION = 9;
    static final byte TYPE_DATA = 0;
    static final byte TYPE_GOAWAY = 7;
    static final byte TYPE_HEADERS = 1;
    static final byte TYPE_PING = 6;
    static final byte TYPE_PRIORITY = 2;
    static final byte TYPE_PUSH_PROMISE = 5;
    static final byte TYPE_RST_STREAM = 3;
    static final byte TYPE_SETTINGS = 4;
    static final byte TYPE_WINDOW_UPDATE = 8;
    static final ByteString CONNECTION_PREFACE = ByteString.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    static final String[] FLAGS = new String[64];
    static final String[] BINARY = new String[256];

    static {
        String[] strArr;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String[] strArr2 = BINARY;
            if (i5 >= strArr2.length) {
                break;
            }
            strArr2[i5] = Util.format("%8s", Integer.toBinaryString(i5)).replace(' ', '0');
            i5++;
        }
        String[] strArr3 = FLAGS;
        strArr3[0] = "";
        strArr3[1] = "END_STREAM";
        int[] iArr = {1};
        strArr3[8] = "PADDED";
        for (int i6 = 0; i6 < 1; i6++) {
            int i7 = iArr[i6];
            FLAGS[i7 | 8] = strArr[i7] + "|PADDED";
        }
        String[] strArr4 = FLAGS;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i8 = 0; i8 < 3; i8++) {
            int i9 = iArr2[i8];
            for (int i10 = 0; i10 < 1; i10++) {
                int i11 = iArr[i10];
                String[] strArr5 = FLAGS;
                int i12 = i11 | i9;
                strArr5[i12] = strArr5[i11] + '|' + strArr5[i9];
                strArr5[i12 | 8] = strArr5[i11] + '|' + strArr5[i9] + "|PADDED";
            }
        }
        while (true) {
            String[] strArr6 = FLAGS;
            if (i4 >= strArr6.length) {
                return;
            }
            if (strArr6[i4] == null) {
                strArr6[i4] = BINARY[i4];
            }
            i4++;
        }
    }

    private Http2() {
    }

    static String formatFlags(byte b5, byte b6) {
        if (b6 == 0) {
            return "";
        }
        if (b5 != 2 && b5 != 3) {
            if (b5 == 4 || b5 == 6) {
                return b6 == 1 ? "ACK" : BINARY[b6];
            } else if (b5 != 7 && b5 != 8) {
                String[] strArr = FLAGS;
                String str = b6 < strArr.length ? strArr[b6] : BINARY[b6];
                if (b5 != 5 || (b6 & 4) == 0) {
                    return (b5 != 0 || (b6 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                }
                return str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return BINARY[b6];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String frameLog(boolean z4, int i4, int i5, byte b5, byte b6) {
        String[] strArr = FRAME_NAMES;
        String format = b5 < strArr.length ? strArr[b5] : Util.format("0x%02x", Byte.valueOf(b5));
        String formatFlags = formatFlags(b5, b6);
        Object[] objArr = new Object[5];
        objArr[0] = z4 ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i4);
        objArr[2] = Integer.valueOf(i5);
        objArr[3] = format;
        objArr[4] = formatFlags;
        return Util.format("%s 0x%08x %5d %-13s %s", objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IllegalArgumentException illegalArgument(String str, Object... objArr) {
        throw new IllegalArgumentException(Util.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IOException ioException(String str, Object... objArr) throws IOException {
        throw new IOException(Util.format(str, objArr));
    }
}
