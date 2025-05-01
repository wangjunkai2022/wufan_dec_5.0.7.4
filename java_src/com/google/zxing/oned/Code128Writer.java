package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;
import java.util.Map;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* loaded from: classes3.dex */
public final class Code128Writer extends UPCEANWriter {
    private static final int CODE_CODE_B = 100;
    private static final int CODE_CODE_C = 99;
    private static final int CODE_FNC_1 = 102;
    private static final int CODE_FNC_2 = 97;
    private static final int CODE_FNC_3 = 96;
    private static final int CODE_FNC_4_B = 100;
    private static final int CODE_START_B = 104;
    private static final int CODE_START_C = 105;
    private static final int CODE_STOP = 106;
    private static final char ESCAPE_FNC_1 = 241;
    private static final char ESCAPE_FNC_2 = 242;
    private static final char ESCAPE_FNC_3 = 243;
    private static final char ESCAPE_FNC_4 = 244;

    private static boolean isDigits(CharSequence charSequence, int i4, int i5) {
        int i6 = i5 + i4;
        int length = charSequence.length();
        while (i4 < i6 && i4 < length) {
            char charAt = charSequence.charAt(i4);
            if (charAt < '0' || charAt > '9') {
                if (charAt != 241) {
                    return false;
                }
                i6++;
            }
            i4++;
        }
        return i6 <= length;
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i4, int i5, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.encode(str, barcodeFormat, i4, i5, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got " + barcodeFormat);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public byte[] encode(String str) {
        int length = str.length();
        if (length >= 1 && length <= 80) {
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                char charAt = str.charAt(i5);
                if (charAt < ' ' || charAt > '~') {
                    switch (charAt) {
                        case 241:
                        case 242:
                        case 243:
                        case IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE /* 244 */:
                            break;
                        default:
                            throw new IllegalArgumentException("Bad character in input: " + charAt);
                    }
                }
            }
            ArrayList<int[]> arrayList = new ArrayList();
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 1;
            while (i6 < length) {
                int i10 = 100;
                int i11 = isDigits(str, i6, i8 == 99 ? 2 : 4) ? 99 : 100;
                if (i11 == i8) {
                    if (i8 != 100) {
                        switch (str.charAt(i6)) {
                            case 241:
                                i10 = 102;
                                break;
                            case 242:
                                i10 = 97;
                                break;
                            case 243:
                                i10 = 96;
                                break;
                            case IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE /* 244 */:
                                break;
                            default:
                                int i12 = i6 + 2;
                                i10 = Integer.parseInt(str.substring(i6, i12));
                                i6 = i12;
                                break;
                        }
                    } else {
                        i10 = str.charAt(i6) - ' ';
                    }
                    i6++;
                } else {
                    i10 = i8 == 0 ? i11 == 100 ? 104 : 105 : i11;
                    i8 = i11;
                }
                arrayList.add(Code128Reader.CODE_PATTERNS[i10]);
                i7 += i10 * i9;
                if (i6 != 0) {
                    i9++;
                }
            }
            int[][] iArr = Code128Reader.CODE_PATTERNS;
            arrayList.add(iArr[i7 % 103]);
            arrayList.add(iArr[106]);
            int i13 = 0;
            for (int[] iArr2 : arrayList) {
                for (int i14 : iArr2) {
                    i13 += i14;
                }
            }
            byte[] bArr = new byte[i13];
            for (int[] iArr3 : arrayList) {
                i4 += OneDimensionalCodeWriter.appendPattern(bArr, i4, iArr3, 1);
            }
            return bArr;
        }
        throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got " + length);
    }
}
