package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.Map;
/* loaded from: classes3.dex */
public abstract class UPCEANReader extends OneDReader {
    static final int[][] L_AND_G_PATTERNS;
    static final int[][] L_PATTERNS;
    private static final int MAX_AVG_VARIANCE = 122;
    private static final int MAX_INDIVIDUAL_VARIANCE = 179;
    static final int[] START_END_PATTERN = {1, 1, 1};
    static final int[] MIDDLE_PATTERN = {1, 1, 1, 1, 1};
    private final StringBuilder decodeRowStringBuffer = new StringBuilder(20);
    private final UPCEANExtensionSupport extensionReader = new UPCEANExtensionSupport();
    private final EANManufacturerOrgSupport eanManSupport = new EANManufacturerOrgSupport();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        L_PATTERNS = iArr;
        int[][] iArr2 = new int[20];
        L_AND_G_PATTERNS = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i4 = 10; i4 < 20; i4++) {
            int[] iArr3 = L_PATTERNS[i4 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i5 = 0; i5 < iArr3.length; i5++) {
                iArr4[i5] = iArr3[(iArr3.length - i5) - 1];
            }
            L_AND_G_PATTERNS[i4] = iArr4;
        }
    }

    private static boolean checkStandardUPCEANChecksum(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i4 = 0;
        for (int i5 = length - 2; i5 >= 0; i5 -= 2) {
            int charAt = charSequence.charAt(i5) - '0';
            if (charAt < 0 || charAt > 9) {
                throw FormatException.getFormatInstance();
            }
            i4 += charAt;
        }
        int i6 = i4 * 3;
        for (int i7 = length - 1; i7 >= 0; i7 -= 2) {
            int charAt2 = charSequence.charAt(i7) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw FormatException.getFormatInstance();
            }
            i6 += charAt2;
        }
        return i6 % 10 == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodeDigit(BitArray bitArray, int[] iArr, int i4, int[][] iArr2) throws NotFoundException {
        OneDReader.recordPattern(bitArray, i4, iArr);
        int length = iArr2.length;
        int i5 = 122;
        int i6 = -1;
        for (int i7 = 0; i7 < length; i7++) {
            int patternMatchVariance = OneDReader.patternMatchVariance(iArr, iArr2[i7], 179);
            if (patternMatchVariance < i5) {
                i6 = i7;
                i5 = patternMatchVariance;
            }
        }
        if (i6 >= 0) {
            return i6;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] findGuardPattern(BitArray bitArray, int i4, boolean z4, int[] iArr) throws NotFoundException {
        return findGuardPattern(bitArray, i4, z4, iArr, new int[iArr.length]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] findStartGuardPattern(BitArray bitArray) throws NotFoundException {
        int[] iArr = new int[START_END_PATTERN.length];
        int[] iArr2 = null;
        boolean z4 = false;
        int i4 = 0;
        while (!z4) {
            int[] iArr3 = START_END_PATTERN;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = findGuardPattern(bitArray, i4, false, iArr3, iArr);
            int i5 = iArr2[0];
            int i6 = iArr2[1];
            int i7 = i5 - (i6 - i5);
            if (i7 >= 0) {
                z4 = bitArray.isRange(i7, i5, false);
            }
            i4 = i6;
        }
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean checkChecksum(String str) throws ChecksumException, FormatException {
        return checkStandardUPCEANChecksum(str);
    }

    int[] decodeEnd(BitArray bitArray, int i4) throws NotFoundException {
        return findGuardPattern(bitArray, i4, false, START_END_PATTERN);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb) throws NotFoundException;

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i4, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return decodeRow(i4, bitArray, findStartGuardPattern(bitArray), map);
    }

    abstract BarcodeFormat getBarcodeFormat();

    static int[] findGuardPattern(BitArray bitArray, int i4, boolean z4, int[] iArr, int[] iArr2) throws NotFoundException {
        int length = iArr.length;
        int size = bitArray.getSize();
        int nextUnset = z4 ? bitArray.getNextUnset(i4) : bitArray.getNextSet(i4);
        boolean z5 = z4;
        int i5 = 0;
        int i6 = nextUnset;
        while (nextUnset < size) {
            if (bitArray.get(nextUnset) ^ z5) {
                iArr2[i5] = iArr2[i5] + 1;
            } else {
                int i7 = length - 1;
                if (i5 != i7) {
                    i5++;
                } else if (OneDReader.patternMatchVariance(iArr2, iArr, 179) < 122) {
                    return new int[]{i6, nextUnset};
                } else {
                    i6 += iArr2[0] + iArr2[1];
                    int i8 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i8);
                    iArr2[i8] = 0;
                    iArr2[i7] = 0;
                    i5--;
                }
                iArr2[i5] = 1;
                z5 = !z5;
            }
            nextUnset++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public Result decodeRow(int i4, BitArray bitArray, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        String lookupCountryIdentifier;
        ResultPointCallback resultPointCallback = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint((iArr[0] + iArr[1]) / 2.0f, i4));
        }
        StringBuilder sb = this.decodeRowStringBuffer;
        sb.setLength(0);
        int decodeMiddle = decodeMiddle(bitArray, iArr, sb);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint(decodeMiddle, i4));
        }
        int[] decodeEnd = decodeEnd(bitArray, decodeMiddle);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint((decodeEnd[0] + decodeEnd[1]) / 2.0f, i4));
        }
        int i5 = decodeEnd[1];
        int i6 = (i5 - decodeEnd[0]) + i5;
        if (i6 < bitArray.getSize() && bitArray.isRange(i5, i6, false)) {
            String sb2 = sb.toString();
            if (checkChecksum(sb2)) {
                BarcodeFormat barcodeFormat = getBarcodeFormat();
                float f5 = i4;
                Result result = new Result(sb2, null, new ResultPoint[]{new ResultPoint((iArr[1] + iArr[0]) / 2.0f, f5), new ResultPoint((decodeEnd[1] + decodeEnd[0]) / 2.0f, f5)}, barcodeFormat);
                try {
                    Result decodeRow = this.extensionReader.decodeRow(i4, bitArray, decodeEnd[1]);
                    result.putAllMetadata(decodeRow.getResultMetadata());
                    result.addResultPoints(decodeRow.getResultPoints());
                } catch (ReaderException unused) {
                }
                if ((barcodeFormat == BarcodeFormat.EAN_13 || barcodeFormat == BarcodeFormat.UPC_A) && (lookupCountryIdentifier = this.eanManSupport.lookupCountryIdentifier(sb2)) != null) {
                    result.putMetadata(ResultMetadataType.POSSIBLE_COUNTRY, lookupCountryIdentifier);
                }
                return result;
            }
            throw ChecksumException.getChecksumInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
