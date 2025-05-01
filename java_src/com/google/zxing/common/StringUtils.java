package com.google.zxing.common;

import com.google.zxing.DecodeHintType;
import java.util.Map;
/* loaded from: classes3.dex */
public final class StringUtils {
    private static final boolean ASSUME_SHIFT_JIS;
    private static final String EUC_JP = "EUC_JP";
    public static final String GB2312 = "GB2312";
    private static final String ISO88591 = "ISO8859_1";
    private static final String PLATFORM_DEFAULT_ENCODING;
    public static final String SHIFT_JIS = "SJIS";
    private static final String UTF8 = "UTF8";

    static {
        String property = System.getProperty("file.encoding");
        PLATFORM_DEFAULT_ENCODING = property;
        ASSUME_SHIFT_JIS = SHIFT_JIS.equalsIgnoreCase(property) || EUC_JP.equalsIgnoreCase(property);
    }

    private StringUtils() {
    }

    public static String guessEncoding(byte[] bArr, Map<DecodeHintType, ?> map) {
        int i4;
        int i5;
        String str;
        if (map == null || (str = (String) map.get(DecodeHintType.CHARACTER_SET)) == null) {
            if (bArr.length > 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65) {
                return "UTF8";
            }
            int length = bArr.length;
            boolean z4 = true;
            boolean z5 = true;
            boolean z6 = true;
            int i6 = 0;
            boolean z7 = false;
            int i7 = 0;
            int i8 = 0;
            boolean z8 = false;
            boolean z9 = false;
            for (int i9 = 0; i9 < length && (z4 || z5 || z6); i9++) {
                int i10 = bArr[i9] & 255;
                if (i10 < 128 || i10 > 191) {
                    if (i6 > 0) {
                        z6 = false;
                    }
                    if (i10 >= 192 && i10 <= 253) {
                        for (int i11 = i10; (i11 & 64) != 0; i11 <<= 1) {
                            i6++;
                        }
                        z7 = true;
                    }
                } else if (i6 > 0) {
                    i6--;
                }
                if ((i10 == 194 || i10 == 195) && i9 < length - 1 && (i4 = bArr[i9 + 1] & 255) <= 191 && ((i10 == 194 && i4 >= 160) || (i10 == 195 && i4 >= 128))) {
                    z8 = true;
                }
                if (i10 >= 127 && i10 <= 159) {
                    z4 = false;
                }
                if (i10 >= 161 && i10 <= 223 && !z9) {
                    i8++;
                }
                if (!z9 && ((i10 >= 240 && i10 <= 255) || i10 == 128 || i10 == 160)) {
                    z5 = false;
                }
                if (((i10 < 129 || i10 > 159) && (i10 < 224 || i10 > 239)) || z9) {
                    z9 = false;
                } else {
                    if (i9 < bArr.length - 1 && (i5 = bArr[i9 + 1] & 255) >= 64 && i5 <= 252) {
                        i7++;
                    } else {
                        z5 = false;
                    }
                    z9 = true;
                }
            }
            return (z5 && ASSUME_SHIFT_JIS) ? SHIFT_JIS : ((i6 > 0 ? false : z6) && z7) ? "UTF8" : (!z5 || (i7 < 3 && i8 * 20 <= length)) ? (z8 || !z4) ? PLATFORM_DEFAULT_ENCODING : GB2312 : SHIFT_JIS;
        }
        return str;
    }
}
