package com.android.dx.util;

import m.a;
/* loaded from: classes2.dex */
public final class HexParser {
    private HexParser() {
    }

    public static byte[] parse(String str) {
        String substring;
        int indexOf;
        int length = str.length();
        int i4 = length / 2;
        byte[] bArr = new byte[i4];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int indexOf2 = str.indexOf(10, i6);
            if (indexOf2 < 0) {
                indexOf2 = length;
            }
            int indexOf3 = str.indexOf(35, i6);
            if (indexOf3 >= 0 && indexOf3 < indexOf2) {
                substring = str.substring(i6, indexOf3);
            } else {
                substring = str.substring(i6, indexOf2);
            }
            int i8 = indexOf2 + 1;
            int indexOf4 = substring.indexOf(58);
            if (indexOf4 != -1 && ((indexOf = substring.indexOf(34)) == -1 || indexOf >= indexOf4)) {
                String trim = substring.substring(i5, indexOf4).trim();
                substring = substring.substring(indexOf4 + 1);
                if (Integer.parseInt(trim, 16) != i7) {
                    throw new RuntimeException("bogus offset marker: " + trim);
                }
            }
            int length2 = substring.length();
            int i9 = -1;
            boolean z4 = false;
            for (int i10 = 0; i10 < length2; i10++) {
                char charAt = substring.charAt(i10);
                if (z4) {
                    if (charAt == '\"') {
                        z4 = false;
                    } else {
                        bArr[i7] = (byte) charAt;
                        i7++;
                    }
                } else if (charAt > ' ') {
                    if (charAt != '\"') {
                        int digit = Character.digit(charAt, 16);
                        if (digit == -1) {
                            throw new RuntimeException("bogus digit character: \"" + charAt + a.f71493g);
                        } else if (i9 == -1) {
                            i9 = digit;
                        } else {
                            bArr[i7] = (byte) ((i9 << 4) | digit);
                            i7++;
                            i9 = -1;
                        }
                    } else if (i9 != -1) {
                        throw new RuntimeException("spare digit around offset " + Hex.u4(i7));
                    } else {
                        z4 = true;
                    }
                }
            }
            if (i9 != -1) {
                throw new RuntimeException("spare digit around offset " + Hex.u4(i7));
            } else if (z4) {
                throw new RuntimeException("unterminated quote around offset " + Hex.u4(i7));
            } else {
                i6 = i8;
                i5 = 0;
            }
        }
        if (i7 < i4) {
            byte[] bArr2 = new byte[i7];
            System.arraycopy(bArr, 0, bArr2, 0, i7);
            return bArr2;
        }
        return bArr;
    }
}
