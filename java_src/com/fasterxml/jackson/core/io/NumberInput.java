package com.fasterxml.jackson.core.io;

import java.math.BigDecimal;
/* loaded from: classes.dex */
public final class NumberInput {
    static final long L_BILLION = 1000000000;
    public static final String NASTY_SMALL_DOUBLE = "2.2250738585072012e-308";
    static final String MIN_LONG_STR_NO_SIGN = String.valueOf(Long.MIN_VALUE).substring(1);
    static final String MAX_LONG_STR = String.valueOf(Long.MAX_VALUE);

    private static NumberFormatException _badBD(String str) {
        return new NumberFormatException("Value \"" + str + "\" can not be represented as BigDecimal");
    }

    public static boolean inLongRange(char[] cArr, int i4, int i5, boolean z4) {
        String str = z4 ? MIN_LONG_STR_NO_SIGN : MAX_LONG_STR;
        int length = str.length();
        if (i5 < length) {
            return true;
        }
        if (i5 > length) {
            return false;
        }
        for (int i6 = 0; i6 < length; i6++) {
            int charAt = cArr[i4 + i6] - str.charAt(i6);
            if (charAt != 0) {
                return charAt < 0;
            }
        }
        return true;
    }

    public static double parseAsDouble(String str, double d5) {
        if (str == null) {
            return d5;
        }
        String trim = str.trim();
        if (trim.length() == 0) {
            return d5;
        }
        try {
            return parseDouble(trim);
        } catch (NumberFormatException unused) {
            return d5;
        }
    }

    public static int parseAsInt(String str, int i4) {
        String trim;
        int length;
        if (str == null || (length = (trim = str.trim()).length()) == 0) {
            return i4;
        }
        int i5 = 0;
        if (length > 0) {
            char charAt = trim.charAt(0);
            if (charAt == '+') {
                trim = trim.substring(1);
                length = trim.length();
            } else if (charAt == '-') {
                i5 = 1;
            }
        }
        while (i5 < length) {
            char charAt2 = trim.charAt(i5);
            if (charAt2 > '9' || charAt2 < '0') {
                try {
                    return (int) parseDouble(trim);
                } catch (NumberFormatException unused) {
                    return i4;
                }
            }
            i5++;
        }
        try {
            return Integer.parseInt(trim);
        } catch (NumberFormatException unused2) {
            return i4;
        }
    }

    public static long parseAsLong(String str, long j4) {
        String trim;
        int length;
        if (str == null || (length = (trim = str.trim()).length()) == 0) {
            return j4;
        }
        int i4 = 0;
        if (length > 0) {
            char charAt = trim.charAt(0);
            if (charAt == '+') {
                trim = trim.substring(1);
                length = trim.length();
            } else if (charAt == '-') {
                i4 = 1;
            }
        }
        while (i4 < length) {
            char charAt2 = trim.charAt(i4);
            if (charAt2 > '9' || charAt2 < '0') {
                try {
                    return (long) parseDouble(trim);
                } catch (NumberFormatException unused) {
                    return j4;
                }
            }
            i4++;
        }
        try {
            return Long.parseLong(trim);
        } catch (NumberFormatException unused2) {
            return j4;
        }
    }

    public static BigDecimal parseBigDecimal(String str) throws NumberFormatException {
        try {
            return new BigDecimal(str);
        } catch (NumberFormatException unused) {
            throw _badBD(str);
        }
    }

    public static double parseDouble(String str) throws NumberFormatException {
        if (NASTY_SMALL_DOUBLE.equals(str)) {
            return Double.MIN_VALUE;
        }
        return Double.parseDouble(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int parseInt(char[] cArr, int i4, int i5) {
        int i6 = cArr[(i4 + i5) - 1] - '0';
        switch (i5) {
            case 2:
                break;
            case 3:
                i6 += (cArr[i4] - '0') * 100;
                i4++;
                break;
            case 4:
                i6 += (cArr[i4] - '0') * 1000;
                i4++;
                i6 += (cArr[i4] - '0') * 100;
                i4++;
                break;
            case 5:
                i6 += (cArr[i4] - '0') * 10000;
                i4++;
                i6 += (cArr[i4] - '0') * 1000;
                i4++;
                i6 += (cArr[i4] - '0') * 100;
                i4++;
                break;
            case 6:
                i6 += (cArr[i4] - '0') * 100000;
                i4++;
                i6 += (cArr[i4] - '0') * 10000;
                i4++;
                i6 += (cArr[i4] - '0') * 1000;
                i4++;
                i6 += (cArr[i4] - '0') * 100;
                i4++;
                break;
            case 7:
                i6 += (cArr[i4] - '0') * 1000000;
                i4++;
                i6 += (cArr[i4] - '0') * 100000;
                i4++;
                i6 += (cArr[i4] - '0') * 10000;
                i4++;
                i6 += (cArr[i4] - '0') * 1000;
                i4++;
                i6 += (cArr[i4] - '0') * 100;
                i4++;
                break;
            case 8:
                i6 += (cArr[i4] - '0') * 10000000;
                i4++;
                i6 += (cArr[i4] - '0') * 1000000;
                i4++;
                i6 += (cArr[i4] - '0') * 100000;
                i4++;
                i6 += (cArr[i4] - '0') * 10000;
                i4++;
                i6 += (cArr[i4] - '0') * 1000;
                i4++;
                i6 += (cArr[i4] - '0') * 100;
                i4++;
                break;
            case 9:
                i6 += (cArr[i4] - '0') * 100000000;
                i4++;
                i6 += (cArr[i4] - '0') * 10000000;
                i4++;
                i6 += (cArr[i4] - '0') * 1000000;
                i4++;
                i6 += (cArr[i4] - '0') * 100000;
                i4++;
                i6 += (cArr[i4] - '0') * 10000;
                i4++;
                i6 += (cArr[i4] - '0') * 1000;
                i4++;
                i6 += (cArr[i4] - '0') * 100;
                i4++;
                break;
            default:
                return i6;
        }
        return i6 + ((cArr[i4] - '0') * 10);
    }

    public static long parseLong(char[] cArr, int i4, int i5) {
        int i6 = i5 - 9;
        return (parseInt(cArr, i4, i6) * 1000000000) + parseInt(cArr, i4 + i6, 9);
    }

    public static BigDecimal parseBigDecimal(char[] cArr) throws NumberFormatException {
        return parseBigDecimal(cArr, 0, cArr.length);
    }

    public static long parseLong(String str) {
        if (str.length() <= 9) {
            return parseInt(str);
        }
        return Long.parseLong(str);
    }

    public static boolean inLongRange(String str, boolean z4) {
        String str2 = z4 ? MIN_LONG_STR_NO_SIGN : MAX_LONG_STR;
        int length = str2.length();
        int length2 = str.length();
        if (length2 < length) {
            return true;
        }
        if (length2 > length) {
            return false;
        }
        for (int i4 = 0; i4 < length; i4++) {
            int charAt = str.charAt(i4) - str2.charAt(i4);
            if (charAt != 0) {
                return charAt < 0;
            }
        }
        return true;
    }

    public static BigDecimal parseBigDecimal(char[] cArr, int i4, int i5) throws NumberFormatException {
        try {
            return new BigDecimal(cArr, i4, i5);
        } catch (NumberFormatException unused) {
            throw _badBD(new String(cArr, i4, i5));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0075, code lost:
        return java.lang.Integer.parseInt(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int parseInt(java.lang.String r8) {
        /*
            r0 = 0
            char r1 = r8.charAt(r0)
            int r2 = r8.length()
            r3 = 1
            r4 = 45
            if (r1 != r4) goto Lf
            r0 = 1
        Lf:
            r4 = 10
            if (r0 == 0) goto L25
            if (r2 == r3) goto L20
            if (r2 <= r4) goto L18
            goto L20
        L18:
            r1 = 2
            char r3 = r8.charAt(r3)
            r1 = r3
            r3 = 2
            goto L2e
        L20:
            int r8 = java.lang.Integer.parseInt(r8)
            return r8
        L25:
            r5 = 9
            if (r2 <= r5) goto L2e
            int r8 = java.lang.Integer.parseInt(r8)
            return r8
        L2e:
            r5 = 57
            if (r1 > r5) goto L84
            r6 = 48
            if (r1 >= r6) goto L37
            goto L84
        L37:
            int r1 = r1 - r6
            if (r3 >= r2) goto L80
            int r7 = r3 + 1
            char r3 = r8.charAt(r3)
            if (r3 > r5) goto L7b
            if (r3 >= r6) goto L45
            goto L7b
        L45:
            int r1 = r1 * 10
            int r3 = r3 - r6
            int r1 = r1 + r3
            if (r7 >= r2) goto L80
            int r3 = r7 + 1
            char r7 = r8.charAt(r7)
            if (r7 > r5) goto L76
            if (r7 >= r6) goto L56
            goto L76
        L56:
            int r1 = r1 * 10
            int r7 = r7 - r6
            int r1 = r1 + r7
            if (r3 >= r2) goto L80
        L5c:
            int r7 = r3 + 1
            char r3 = r8.charAt(r3)
            if (r3 > r5) goto L71
            if (r3 >= r6) goto L67
            goto L71
        L67:
            int r1 = r1 * 10
            int r3 = r3 + (-48)
            int r1 = r1 + r3
            if (r7 < r2) goto L6f
            goto L80
        L6f:
            r3 = r7
            goto L5c
        L71:
            int r8 = java.lang.Integer.parseInt(r8)
            return r8
        L76:
            int r8 = java.lang.Integer.parseInt(r8)
            return r8
        L7b:
            int r8 = java.lang.Integer.parseInt(r8)
            return r8
        L80:
            if (r0 == 0) goto L83
            int r1 = -r1
        L83:
            return r1
        L84:
            int r8 = java.lang.Integer.parseInt(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.NumberInput.parseInt(java.lang.String):int");
    }
}
