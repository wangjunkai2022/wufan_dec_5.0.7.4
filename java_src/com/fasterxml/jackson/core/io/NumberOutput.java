package com.fasterxml.jackson.core.io;

import com.join.mgps.Util.v;
/* loaded from: classes.dex */
public final class NumberOutput {
    private static int BILLION = 1000000000;
    private static long BILLION_L = 1000000000;
    private static long MAX_INT_AS_LONG = 2147483647L;
    private static int MILLION = 1000000;
    private static long MIN_INT_AS_LONG = -2147483648L;
    static final String SMALLEST_INT = String.valueOf(Integer.MIN_VALUE);
    static final String SMALLEST_LONG = String.valueOf(Long.MIN_VALUE);
    private static final int[] TRIPLET_TO_CHARS = new int[1000];
    private static final String[] sSmallIntStrs;
    private static final String[] sSmallIntStrs2;

    static {
        int i4 = 0;
        for (int i5 = 0; i5 < 10; i5++) {
            for (int i6 = 0; i6 < 10; i6++) {
                int i7 = 0;
                while (i7 < 10) {
                    TRIPLET_TO_CHARS[i4] = ((i5 + 48) << 16) | ((i6 + 48) << 8) | (i7 + 48);
                    i7++;
                    i4++;
                }
            }
        }
        sSmallIntStrs = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", v.f28122v};
        sSmallIntStrs2 = new String[]{"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    private static int _full3(int i4, char[] cArr, int i5) {
        int i6 = TRIPLET_TO_CHARS[i4];
        int i7 = i5 + 1;
        cArr[i5] = (char) (i6 >> 16);
        int i8 = i7 + 1;
        cArr[i7] = (char) ((i6 >> 8) & 127);
        int i9 = i8 + 1;
        cArr[i8] = (char) (i6 & 127);
        return i9;
    }

    private static int _leading3(int i4, char[] cArr, int i5) {
        int i6 = TRIPLET_TO_CHARS[i4];
        if (i4 > 9) {
            if (i4 > 99) {
                cArr[i5] = (char) (i6 >> 16);
                i5++;
            }
            cArr[i5] = (char) ((i6 >> 8) & 127);
            i5++;
        }
        int i7 = i5 + 1;
        cArr[i5] = (char) (i6 & 127);
        return i7;
    }

    private static int _outputFullBillion(int i4, char[] cArr, int i5) {
        int i6 = i4 / 1000;
        int i7 = i4 - (i6 * 1000);
        int i8 = i6 / 1000;
        int[] iArr = TRIPLET_TO_CHARS;
        int i9 = iArr[i8];
        int i10 = i5 + 1;
        cArr[i5] = (char) (i9 >> 16);
        int i11 = i10 + 1;
        cArr[i10] = (char) ((i9 >> 8) & 127);
        int i12 = i11 + 1;
        cArr[i11] = (char) (i9 & 127);
        int i13 = iArr[i6 - (i8 * 1000)];
        int i14 = i12 + 1;
        cArr[i12] = (char) (i13 >> 16);
        int i15 = i14 + 1;
        cArr[i14] = (char) ((i13 >> 8) & 127);
        int i16 = i15 + 1;
        cArr[i15] = (char) (i13 & 127);
        int i17 = iArr[i7];
        int i18 = i16 + 1;
        cArr[i16] = (char) (i17 >> 16);
        int i19 = i18 + 1;
        cArr[i18] = (char) ((i17 >> 8) & 127);
        int i20 = i19 + 1;
        cArr[i19] = (char) (i17 & 127);
        return i20;
    }

    private static int _outputSmallestI(char[] cArr, int i4) {
        String str = SMALLEST_INT;
        int length = str.length();
        str.getChars(0, length, cArr, i4);
        return i4 + length;
    }

    private static int _outputSmallestL(char[] cArr, int i4) {
        String str = SMALLEST_LONG;
        int length = str.length();
        str.getChars(0, length, cArr, i4);
        return i4 + length;
    }

    private static int _outputUptoBillion(int i4, char[] cArr, int i5) {
        if (i4 < MILLION) {
            if (i4 < 1000) {
                return _leading3(i4, cArr, i5);
            }
            int i6 = i4 / 1000;
            return _outputUptoMillion(cArr, i5, i6, i4 - (i6 * 1000));
        }
        int i7 = i4 / 1000;
        int i8 = i4 - (i7 * 1000);
        int i9 = i7 / 1000;
        int _leading3 = _leading3(i9, cArr, i5);
        int[] iArr = TRIPLET_TO_CHARS;
        int i10 = iArr[i7 - (i9 * 1000)];
        int i11 = _leading3 + 1;
        cArr[_leading3] = (char) (i10 >> 16);
        int i12 = i11 + 1;
        cArr[i11] = (char) ((i10 >> 8) & 127);
        int i13 = i12 + 1;
        cArr[i12] = (char) (i10 & 127);
        int i14 = iArr[i8];
        int i15 = i13 + 1;
        cArr[i13] = (char) (i14 >> 16);
        int i16 = i15 + 1;
        cArr[i15] = (char) ((i14 >> 8) & 127);
        int i17 = i16 + 1;
        cArr[i16] = (char) (i14 & 127);
        return i17;
    }

    private static int _outputUptoMillion(char[] cArr, int i4, int i5, int i6) {
        int[] iArr = TRIPLET_TO_CHARS;
        int i7 = iArr[i5];
        if (i5 > 9) {
            if (i5 > 99) {
                cArr[i4] = (char) (i7 >> 16);
                i4++;
            }
            cArr[i4] = (char) ((i7 >> 8) & 127);
            i4++;
        }
        int i8 = i4 + 1;
        cArr[i4] = (char) (i7 & 127);
        int i9 = iArr[i6];
        int i10 = i8 + 1;
        cArr[i8] = (char) (i9 >> 16);
        int i11 = i10 + 1;
        cArr[i10] = (char) ((i9 >> 8) & 127);
        int i12 = i11 + 1;
        cArr[i11] = (char) (i9 & 127);
        return i12;
    }

    public static boolean notFinite(double d5) {
        return Double.isNaN(d5) || Double.isInfinite(d5);
    }

    public static int outputInt(int i4, char[] cArr, int i5) {
        int i6;
        if (i4 < 0) {
            if (i4 == Integer.MIN_VALUE) {
                return _outputSmallestI(cArr, i5);
            }
            cArr[i5] = '-';
            i4 = -i4;
            i5++;
        }
        if (i4 < MILLION) {
            if (i4 >= 1000) {
                int i7 = i4 / 1000;
                return _full3(i4 - (i7 * 1000), cArr, _leading3(i7, cArr, i5));
            } else if (i4 < 10) {
                cArr[i5] = (char) (i4 + 48);
                return i5 + 1;
            } else {
                return _leading3(i4, cArr, i5);
            }
        }
        int i8 = BILLION;
        if (i4 >= i8) {
            int i9 = i4 - i8;
            if (i9 >= i8) {
                i9 -= i8;
                i6 = i5 + 1;
                cArr[i5] = '2';
            } else {
                i6 = i5 + 1;
                cArr[i5] = '1';
            }
            return _outputFullBillion(i9, cArr, i6);
        }
        int i10 = i4 / 1000;
        int i11 = i10 / 1000;
        return _full3(i4 - (i10 * 1000), cArr, _full3(i10 - (i11 * 1000), cArr, _leading3(i11, cArr, i5)));
    }

    public static int outputLong(long j4, char[] cArr, int i4) {
        int _outputFullBillion;
        if (j4 < 0) {
            if (j4 > MIN_INT_AS_LONG) {
                return outputInt((int) j4, cArr, i4);
            }
            if (j4 == Long.MIN_VALUE) {
                return _outputSmallestL(cArr, i4);
            }
            cArr[i4] = '-';
            j4 = -j4;
            i4++;
        } else if (j4 <= MAX_INT_AS_LONG) {
            return outputInt((int) j4, cArr, i4);
        }
        long j5 = BILLION_L;
        long j6 = j4 / j5;
        long j7 = j4 - (j6 * j5);
        if (j6 < j5) {
            _outputFullBillion = _outputUptoBillion((int) j6, cArr, i4);
        } else {
            long j8 = j6 / j5;
            int _leading3 = _leading3((int) j8, cArr, i4);
            _outputFullBillion = _outputFullBillion((int) (j6 - (j5 * j8)), cArr, _leading3);
        }
        return _outputFullBillion((int) j7, cArr, _outputFullBillion);
    }

    public static String toString(int i4) {
        String[] strArr = sSmallIntStrs;
        if (i4 < strArr.length) {
            if (i4 >= 0) {
                return strArr[i4];
            }
            int i5 = (-i4) - 1;
            String[] strArr2 = sSmallIntStrs2;
            if (i5 < strArr2.length) {
                return strArr2[i5];
            }
        }
        return Integer.toString(i4);
    }

    public static boolean notFinite(float f5) {
        return Float.isNaN(f5) || Float.isInfinite(f5);
    }

    private static int _outputSmallestI(byte[] bArr, int i4) {
        int length = SMALLEST_INT.length();
        int i5 = 0;
        while (i5 < length) {
            bArr[i4] = (byte) SMALLEST_INT.charAt(i5);
            i5++;
            i4++;
        }
        return i4;
    }

    private static int _outputSmallestL(byte[] bArr, int i4) {
        int length = SMALLEST_LONG.length();
        int i5 = 0;
        while (i5 < length) {
            bArr[i4] = (byte) SMALLEST_LONG.charAt(i5);
            i5++;
            i4++;
        }
        return i4;
    }

    private static int _full3(int i4, byte[] bArr, int i5) {
        int i6 = TRIPLET_TO_CHARS[i4];
        int i7 = i5 + 1;
        bArr[i5] = (byte) (i6 >> 16);
        int i8 = i7 + 1;
        bArr[i7] = (byte) (i6 >> 8);
        int i9 = i8 + 1;
        bArr[i8] = (byte) i6;
        return i9;
    }

    private static int _leading3(int i4, byte[] bArr, int i5) {
        int i6 = TRIPLET_TO_CHARS[i4];
        if (i4 > 9) {
            if (i4 > 99) {
                bArr[i5] = (byte) (i6 >> 16);
                i5++;
            }
            bArr[i5] = (byte) (i6 >> 8);
            i5++;
        }
        int i7 = i5 + 1;
        bArr[i5] = (byte) i6;
        return i7;
    }

    public static String toString(long j4) {
        if (j4 <= 2147483647L && j4 >= -2147483648L) {
            return toString((int) j4);
        }
        return Long.toString(j4);
    }

    public static String toString(double d5) {
        return Double.toString(d5);
    }

    private static int _outputUptoMillion(byte[] bArr, int i4, int i5, int i6) {
        int[] iArr = TRIPLET_TO_CHARS;
        int i7 = iArr[i5];
        if (i5 > 9) {
            if (i5 > 99) {
                bArr[i4] = (byte) (i7 >> 16);
                i4++;
            }
            bArr[i4] = (byte) (i7 >> 8);
            i4++;
        }
        int i8 = i4 + 1;
        bArr[i4] = (byte) i7;
        int i9 = iArr[i6];
        int i10 = i8 + 1;
        bArr[i8] = (byte) (i9 >> 16);
        int i11 = i10 + 1;
        bArr[i10] = (byte) (i9 >> 8);
        int i12 = i11 + 1;
        bArr[i11] = (byte) i9;
        return i12;
    }

    public static String toString(float f5) {
        return Float.toString(f5);
    }

    public static int outputLong(long j4, byte[] bArr, int i4) {
        int _outputFullBillion;
        if (j4 < 0) {
            if (j4 > MIN_INT_AS_LONG) {
                return outputInt((int) j4, bArr, i4);
            }
            if (j4 == Long.MIN_VALUE) {
                return _outputSmallestL(bArr, i4);
            }
            bArr[i4] = 45;
            j4 = -j4;
            i4++;
        } else if (j4 <= MAX_INT_AS_LONG) {
            return outputInt((int) j4, bArr, i4);
        }
        long j5 = BILLION_L;
        long j6 = j4 / j5;
        long j7 = j4 - (j6 * j5);
        if (j6 < j5) {
            _outputFullBillion = _outputUptoBillion((int) j6, bArr, i4);
        } else {
            long j8 = j6 / j5;
            int _leading3 = _leading3((int) j8, bArr, i4);
            _outputFullBillion = _outputFullBillion((int) (j6 - (j5 * j8)), bArr, _leading3);
        }
        return _outputFullBillion((int) j7, bArr, _outputFullBillion);
    }

    private static int _outputFullBillion(int i4, byte[] bArr, int i5) {
        int i6 = i4 / 1000;
        int i7 = i4 - (i6 * 1000);
        int i8 = i6 / 1000;
        int i9 = i6 - (i8 * 1000);
        int[] iArr = TRIPLET_TO_CHARS;
        int i10 = iArr[i8];
        int i11 = i5 + 1;
        bArr[i5] = (byte) (i10 >> 16);
        int i12 = i11 + 1;
        bArr[i11] = (byte) (i10 >> 8);
        int i13 = i12 + 1;
        bArr[i12] = (byte) i10;
        int i14 = iArr[i9];
        int i15 = i13 + 1;
        bArr[i13] = (byte) (i14 >> 16);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (i14 >> 8);
        int i17 = i16 + 1;
        bArr[i16] = (byte) i14;
        int i18 = iArr[i7];
        int i19 = i17 + 1;
        bArr[i17] = (byte) (i18 >> 16);
        int i20 = i19 + 1;
        bArr[i19] = (byte) (i18 >> 8);
        int i21 = i20 + 1;
        bArr[i20] = (byte) i18;
        return i21;
    }

    private static int _outputUptoBillion(int i4, byte[] bArr, int i5) {
        if (i4 < MILLION) {
            if (i4 < 1000) {
                return _leading3(i4, bArr, i5);
            }
            int i6 = i4 / 1000;
            return _outputUptoMillion(bArr, i5, i6, i4 - (i6 * 1000));
        }
        int i7 = i4 / 1000;
        int i8 = i4 - (i7 * 1000);
        int i9 = i7 / 1000;
        int _leading3 = _leading3(i9, bArr, i5);
        int[] iArr = TRIPLET_TO_CHARS;
        int i10 = iArr[i7 - (i9 * 1000)];
        int i11 = _leading3 + 1;
        bArr[_leading3] = (byte) (i10 >> 16);
        int i12 = i11 + 1;
        bArr[i11] = (byte) (i10 >> 8);
        int i13 = i12 + 1;
        bArr[i12] = (byte) i10;
        int i14 = iArr[i8];
        int i15 = i13 + 1;
        bArr[i13] = (byte) (i14 >> 16);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (i14 >> 8);
        int i17 = i16 + 1;
        bArr[i16] = (byte) i14;
        return i17;
    }

    public static int outputInt(int i4, byte[] bArr, int i5) {
        int i6;
        if (i4 < 0) {
            if (i4 == Integer.MIN_VALUE) {
                return _outputSmallestI(bArr, i5);
            }
            bArr[i5] = 45;
            i4 = -i4;
            i5++;
        }
        if (i4 < MILLION) {
            if (i4 >= 1000) {
                int i7 = i4 / 1000;
                return _full3(i4 - (i7 * 1000), bArr, _leading3(i7, bArr, i5));
            } else if (i4 < 10) {
                int i8 = i5 + 1;
                bArr[i5] = (byte) (i4 + 48);
                return i8;
            } else {
                return _leading3(i4, bArr, i5);
            }
        }
        int i9 = BILLION;
        if (i4 >= i9) {
            int i10 = i4 - i9;
            if (i10 >= i9) {
                i10 -= i9;
                i6 = i5 + 1;
                bArr[i5] = 50;
            } else {
                i6 = i5 + 1;
                bArr[i5] = 49;
            }
            return _outputFullBillion(i10, bArr, i6);
        }
        int i11 = i4 / 1000;
        int i12 = i11 / 1000;
        return _full3(i4 - (i11 * 1000), bArr, _full3(i11 - (i12 * 1000), bArr, _leading3(i12, bArr, i5)));
    }
}
