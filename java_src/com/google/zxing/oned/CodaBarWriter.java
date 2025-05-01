package com.google.zxing.oned;

import external.org.apache.commons.lang3.d;
/* loaded from: classes3.dex */
public class CodaBarWriter extends OneDimensionalCodeWriter {
    public CodaBarWriter() {
        super(20);
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public byte[] encode(String str) {
        int i4;
        if (CodaBarReader.arrayContains(new char[]{'A', 'B', 'C', 'D'}, Character.toUpperCase(str.charAt(0)))) {
            if (CodaBarReader.arrayContains(new char[]{'T', 'N', '*', 'E'}, Character.toUpperCase(str.charAt(str.length() - 1)))) {
                int i5 = 20;
                char[] cArr = {'/', ':', '+', d.f68897a};
                for (int i6 = 1; i6 < str.length() - 1; i6++) {
                    if (Character.isDigit(str.charAt(i6)) || str.charAt(i6) == '-' || str.charAt(i6) == '$') {
                        i5 += 9;
                    } else if (!CodaBarReader.arrayContains(cArr, str.charAt(i6))) {
                        throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i6) + '\'');
                    } else {
                        i5 += 10;
                    }
                }
                byte[] bArr = new byte[i5 + (str.length() - 1)];
                int i7 = 0;
                for (int i8 = 0; i8 < str.length(); i8++) {
                    char upperCase = Character.toUpperCase(str.charAt(i8));
                    if (i8 == str.length() - 1) {
                        if (upperCase == '*') {
                            upperCase = 'C';
                        } else if (upperCase == 'E') {
                            upperCase = 'D';
                        }
                    }
                    int i9 = 0;
                    while (true) {
                        char[] cArr2 = CodaBarReader.ALPHABET;
                        if (i9 >= cArr2.length) {
                            i4 = 0;
                            break;
                        } else if (upperCase == cArr2[i9]) {
                            i4 = CodaBarReader.CHARACTER_ENCODINGS[i9];
                            break;
                        } else {
                            i9++;
                        }
                    }
                    int i10 = 0;
                    byte b5 = 1;
                    while (true) {
                        int i11 = 0;
                        while (i10 < 7) {
                            bArr[i7] = b5;
                            i7++;
                            if (((i4 >> (6 - i10)) & 1) == 0 || i11 == 1) {
                                b5 = (byte) (b5 ^ 1);
                                i10++;
                            } else {
                                i11++;
                            }
                        }
                        break;
                    }
                    if (i8 < str.length() - 1) {
                        bArr[i7] = 0;
                        i7++;
                    }
                }
                return bArr;
            }
            throw new IllegalArgumentException("Codabar should end with one of the following: 'T', 'N', '*' or 'E'");
        }
        throw new IllegalArgumentException("Codabar should start with one of the following: 'A', 'B', 'C' or 'D'");
    }
}
