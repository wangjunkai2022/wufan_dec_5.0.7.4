package com.google.zxing.pdf417.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.DecoderResult;
import external.org.apache.commons.lang3.d;
import io.netty.util.internal.StringUtil;
import java.math.BigInteger;
import kotlin.text.Typography;
import org.apache.http.conn.ssl.TokenParser;
/* loaded from: classes3.dex */
final class DecodedBitStreamParser {
    private static final int AL = 28;
    private static final int AS = 27;
    private static final int BEGIN_MACRO_PDF417_CONTROL_BLOCK = 928;
    private static final int BEGIN_MACRO_PDF417_OPTIONAL_FIELD = 923;
    private static final int BYTE_COMPACTION_MODE_LATCH = 901;
    private static final int BYTE_COMPACTION_MODE_LATCH_6 = 924;
    private static final BigInteger[] EXP900;
    private static final int LL = 27;
    private static final int MACRO_PDF417_TERMINATOR = 922;
    private static final int MAX_NUMERIC_CODEWORDS = 15;
    private static final int ML = 28;
    private static final int MODE_SHIFT_TO_BYTE_COMPACTION_MODE = 913;
    private static final int NUMERIC_COMPACTION_MODE_LATCH = 902;
    private static final int PAL = 29;
    private static final int PL = 25;
    private static final int PS = 29;
    private static final int TEXT_COMPACTION_MODE_LATCH = 900;
    private static final char[] PUNCT_CHARS = {';', Typography.less, Typography.greater, '@', '[', TokenParser.ESCAPE, '}', '_', '`', '~', '!', '\r', '\t', StringUtil.COMMA, ':', '\n', '-', d.f68897a, '$', '/', '\"', '|', '*', '(', ')', '?', '{', '}', '\''};
    private static final char[] MIXED_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', Typography.amp, '\r', '\t', StringUtil.COMMA, ':', '#', '-', d.f68897a, '$', '/', '+', '%', '*', '=', '^'};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.zxing.pdf417.decoder.DecodedBitStreamParser$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode;

        static {
            int[] iArr = new int[Mode.values().length];
            $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode = iArr;
            try {
                iArr[Mode.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public enum Mode {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        EXP900 = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = valueOf;
        int i4 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = EXP900;
            if (i4 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i4] = bigIntegerArr2[i4 - 1].multiply(valueOf);
            i4++;
        }
    }

    private DecodedBitStreamParser() {
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057 A[LOOP:1: B:24:0x0055->B:25:0x0057, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int byteCompaction(int r24, int[] r25, int r26, java.lang.StringBuilder r27) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.DecodedBitStreamParser.byteCompaction(int, int[], int, java.lang.StringBuilder):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DecoderResult decode(int[] iArr) throws FormatException {
        int byteCompaction;
        StringBuilder sb = new StringBuilder(100);
        int i4 = iArr[1];
        int i5 = 2;
        while (i5 < iArr[0]) {
            if (i4 == MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                byteCompaction = byteCompaction(i4, iArr, i5, sb);
            } else if (i4 != BYTE_COMPACTION_MODE_LATCH_6) {
                switch (i4) {
                    case 900:
                        byteCompaction = textCompaction(iArr, i5, sb);
                        break;
                    case 901:
                        byteCompaction = byteCompaction(i4, iArr, i5, sb);
                        break;
                    case 902:
                        byteCompaction = numericCompaction(iArr, i5, sb);
                        break;
                    default:
                        byteCompaction = textCompaction(iArr, i5 - 1, sb);
                        break;
                }
            } else {
                byteCompaction = byteCompaction(i4, iArr, i5, sb);
            }
            if (byteCompaction < iArr.length) {
                i5 = byteCompaction + 1;
                i4 = iArr[byteCompaction];
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        return new DecoderResult(null, sb.toString(), null, null);
    }

    private static String decodeBase900toBase10(int[] iArr, int i4) throws FormatException {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i5 = 0; i5 < i4; i5++) {
            bigInteger = bigInteger.add(EXP900[(i4 - i5) - 1].multiply(BigInteger.valueOf(iArr[i5])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw FormatException.getFormatInstance();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r6 == 26) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void decodeTextCompaction(int[] r15, int[] r16, int r17, java.lang.StringBuilder r18) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.DecodedBitStreamParser.decodeTextCompaction(int[], int[], int, java.lang.StringBuilder):void");
    }

    private static int numericCompaction(int[] iArr, int i4, StringBuilder sb) throws FormatException {
        int[] iArr2 = new int[15];
        boolean z4 = false;
        int i5 = 0;
        while (i4 < iArr[0] && !z4) {
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            if (i6 == iArr[0]) {
                z4 = true;
            }
            if (i7 < 900) {
                iArr2[i5] = i7;
                i5++;
            } else if (i7 == 900 || i7 == 901 || i7 == BYTE_COMPACTION_MODE_LATCH_6 || i7 == BEGIN_MACRO_PDF417_CONTROL_BLOCK || i7 == BEGIN_MACRO_PDF417_OPTIONAL_FIELD || i7 == MACRO_PDF417_TERMINATOR) {
                i6--;
                z4 = true;
            }
            if (i5 % 15 == 0 || i7 == 902 || z4) {
                sb.append(decodeBase900toBase10(iArr2, i5));
                i5 = 0;
            }
            i4 = i6;
        }
        return i4;
    }

    private static int textCompaction(int[] iArr, int i4, StringBuilder sb) {
        int[] iArr2 = new int[iArr[0] << 1];
        int[] iArr3 = new int[iArr[0] << 1];
        boolean z4 = false;
        int i5 = 0;
        while (i4 < iArr[0] && !z4) {
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            if (i7 < 900) {
                iArr2[i5] = i7 / 30;
                iArr2[i5 + 1] = i7 % 30;
                i5 += 2;
            } else if (i7 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                if (i7 != BYTE_COMPACTION_MODE_LATCH_6) {
                    switch (i7) {
                    }
                }
                i4 = i6 - 1;
                z4 = true;
            } else {
                iArr2[i5] = MODE_SHIFT_TO_BYTE_COMPACTION_MODE;
                i4 = i6 + 1;
                iArr3[i5] = iArr[i6];
                i5++;
            }
            i4 = i6;
        }
        decodeTextCompaction(iArr2, iArr3, i5, sb);
        return i4;
    }
}
