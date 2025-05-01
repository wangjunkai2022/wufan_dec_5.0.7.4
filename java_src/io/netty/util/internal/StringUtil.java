package io.netty.util.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes6.dex */
public final class StringUtil {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final char CARRIAGE_RETURN = '\r';
    public static final char COMMA = ',';
    private static final int CSV_NUMBER_ESCAPE_CHARACTERS = 7;
    public static final char DOUBLE_QUOTE = '\"';
    public static final String EMPTY_STRING = "";
    private static final byte[] HEX2B;
    public static final char LINE_FEED = '\n';
    private static final char PACKAGE_SEPARATOR_CHAR = '.';
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final String NEWLINE = SystemPropertyUtil.get("line.separator", "\n");
    private static final String[] BYTE2HEX_PAD = new String[256];
    private static final String[] BYTE2HEX_NOPAD = new String[256];

    static {
        String str;
        int i4 = 0;
        while (true) {
            String[] strArr = BYTE2HEX_PAD;
            if (i4 < strArr.length) {
                String hexString = Integer.toHexString(i4);
                if (i4 > 15) {
                    str = hexString;
                } else {
                    str = '0' + hexString;
                }
                strArr[i4] = str;
                BYTE2HEX_NOPAD[i4] = hexString;
                i4++;
            } else {
                byte[] bArr = new byte[65536];
                HEX2B = bArr;
                Arrays.fill(bArr, (byte) -1);
                bArr[48] = 0;
                bArr[49] = 1;
                bArr[50] = 2;
                bArr[51] = 3;
                bArr[52] = 4;
                bArr[53] = 5;
                bArr[54] = 6;
                bArr[55] = 7;
                bArr[56] = 8;
                bArr[57] = 9;
                bArr[65] = 10;
                bArr[66] = 11;
                bArr[67] = 12;
                bArr[68] = 13;
                bArr[69] = 14;
                bArr[70] = 15;
                bArr[97] = 10;
                bArr[98] = 11;
                bArr[99] = 12;
                bArr[100] = 13;
                bArr[101] = 14;
                bArr[102] = 15;
                return;
            }
        }
    }

    private StringUtil() {
    }

    public static String byteToHexString(int i4) {
        return BYTE2HEX_NOPAD[i4 & 255];
    }

    public static String byteToHexStringPadded(int i4) {
        return BYTE2HEX_PAD[i4 & 255];
    }

    public static boolean commonSuffixOfLength(String str, String str2, int i4) {
        return str != null && str2 != null && i4 >= 0 && str.regionMatches(str.length() - i4, str2, str2.length() - i4, i4);
    }

    public static byte decodeHexByte(CharSequence charSequence, int i4) {
        int decodeHexNibble = decodeHexNibble(charSequence.charAt(i4));
        int decodeHexNibble2 = decodeHexNibble(charSequence.charAt(i4 + 1));
        if (decodeHexNibble == -1 || decodeHexNibble2 == -1) {
            throw new IllegalArgumentException(String.format("invalid hex byte '%s' at index %d of '%s'", charSequence.subSequence(i4, i4 + 2), Integer.valueOf(i4), charSequence));
        }
        return (byte) ((decodeHexNibble << 4) + decodeHexNibble2);
    }

    public static byte[] decodeHexDump(CharSequence charSequence, int i4, int i5) {
        if (i5 < 0 || (i5 & 1) != 0) {
            throw new IllegalArgumentException("length: " + i5);
        } else if (i5 == 0) {
            return EmptyArrays.EMPTY_BYTES;
        } else {
            byte[] bArr = new byte[i5 >>> 1];
            for (int i6 = 0; i6 < i5; i6 += 2) {
                bArr[i6 >>> 1] = decodeHexByte(charSequence, i4 + i6);
            }
            return bArr;
        }
    }

    public static int decodeHexNibble(char c5) {
        return HEX2B[c5];
    }

    public static boolean endsWith(CharSequence charSequence, char c5) {
        int length = charSequence.length();
        return length > 0 && charSequence.charAt(length - 1) == c5;
    }

    public static CharSequence escapeCsv(CharSequence charSequence) {
        return escapeCsv(charSequence, false);
    }

    private static int indexOfFirstNonOwsChar(CharSequence charSequence, int i4) {
        int i5 = 0;
        while (i5 < i4 && isOws(charSequence.charAt(i5))) {
            i5++;
        }
        return i5;
    }

    private static int indexOfLastNonOwsChar(CharSequence charSequence, int i4, int i5) {
        int i6 = i5 - 1;
        while (i6 > i4 && isOws(charSequence.charAt(i6))) {
            i6--;
        }
        return i6;
    }

    public static int indexOfNonWhiteSpace(CharSequence charSequence, int i4) {
        while (i4 < charSequence.length()) {
            if (!Character.isWhitespace(charSequence.charAt(i4))) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static int indexOfWhiteSpace(CharSequence charSequence, int i4) {
        while (i4 < charSequence.length()) {
            if (Character.isWhitespace(charSequence.charAt(i4))) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    private static boolean isDoubleQuote(char c5) {
        return c5 == '\"';
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private static boolean isOws(char c5) {
        return c5 == ' ' || c5 == '\t';
    }

    public static boolean isSurrogate(char c5) {
        return c5 >= 55296 && c5 <= 57343;
    }

    public static CharSequence join(CharSequence charSequence, Iterable<? extends CharSequence> iterable) {
        ObjectUtil.checkNotNull(charSequence, "separator");
        ObjectUtil.checkNotNull(iterable, "elements");
        Iterator<? extends CharSequence> it2 = iterable.iterator();
        if (it2.hasNext()) {
            CharSequence next = it2.next();
            if (it2.hasNext()) {
                StringBuilder sb = new StringBuilder(next);
                do {
                    sb.append(charSequence);
                    sb.append(it2.next());
                } while (it2.hasNext());
                return sb;
            }
            return next;
        }
        return "";
    }

    public static int length(String str) {
        if (str == null) {
            return 0;
        }
        return str.length();
    }

    private static IllegalArgumentException newInvalidEscapedCsvFieldException(CharSequence charSequence, int i4) {
        return new IllegalArgumentException("invalid escaped CSV field: " + ((Object) charSequence) + " index: " + i4);
    }

    public static String simpleClassName(Object obj) {
        return obj == null ? "null_object" : simpleClassName(obj.getClass());
    }

    public static String substringAfter(String str, char c5) {
        int indexOf = str.indexOf(c5);
        if (indexOf >= 0) {
            return str.substring(indexOf + 1);
        }
        return null;
    }

    public static String toHexString(byte[] bArr) {
        return toHexString(bArr, 0, bArr.length);
    }

    public static String toHexStringPadded(byte[] bArr) {
        return toHexStringPadded(bArr, 0, bArr.length);
    }

    public static CharSequence trimOws(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return charSequence;
        }
        int indexOfFirstNonOwsChar = indexOfFirstNonOwsChar(charSequence, length);
        int indexOfLastNonOwsChar = indexOfLastNonOwsChar(charSequence, indexOfFirstNonOwsChar, length);
        return (indexOfFirstNonOwsChar == 0 && indexOfLastNonOwsChar == length + (-1)) ? charSequence : charSequence.subSequence(indexOfFirstNonOwsChar, indexOfLastNonOwsChar + 1);
    }

    public static CharSequence unescapeCsv(CharSequence charSequence) {
        int length = ((CharSequence) ObjectUtil.checkNotNull(charSequence, "value")).length();
        if (length == 0) {
            return charSequence;
        }
        int i4 = length - 1;
        boolean z4 = false;
        if (isDoubleQuote(charSequence.charAt(0)) && isDoubleQuote(charSequence.charAt(i4)) && length != 1) {
            z4 = true;
        }
        if (!z4) {
            validateCsvFormat(charSequence);
            return charSequence;
        }
        StringBuilder stringBuilder = InternalThreadLocalMap.get().stringBuilder();
        int i5 = 1;
        while (i5 < i4) {
            char charAt = charSequence.charAt(i5);
            if (charAt == '\"') {
                int i6 = i5 + 1;
                if (!isDoubleQuote(charSequence.charAt(i6)) || i6 == i4) {
                    throw newInvalidEscapedCsvFieldException(charSequence, i5);
                }
                i5 = i6;
            }
            stringBuilder.append(charAt);
            i5++;
        }
        return stringBuilder.toString();
    }

    public static List<CharSequence> unescapeCsvFields(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList(2);
        StringBuilder stringBuilder = InternalThreadLocalMap.get().stringBuilder();
        int length = charSequence.length() - 1;
        int i4 = 0;
        boolean z4 = false;
        while (i4 <= length) {
            char charAt = charSequence.charAt(i4);
            if (!z4) {
                if (charAt != '\n' && charAt != '\r') {
                    if (charAt != '\"') {
                        if (charAt != ',') {
                            stringBuilder.append(charAt);
                        } else {
                            arrayList.add(stringBuilder.toString());
                            stringBuilder.setLength(0);
                        }
                    } else if (stringBuilder.length() == 0) {
                        z4 = true;
                    }
                }
                throw newInvalidEscapedCsvFieldException(charSequence, i4);
            } else if (charAt != '\"') {
                stringBuilder.append(charAt);
            } else if (i4 == length) {
                arrayList.add(stringBuilder.toString());
                return arrayList;
            } else {
                i4++;
                char charAt2 = charSequence.charAt(i4);
                if (charAt2 == '\"') {
                    stringBuilder.append('\"');
                } else if (charAt2 == ',') {
                    arrayList.add(stringBuilder.toString());
                    stringBuilder.setLength(0);
                    z4 = false;
                } else {
                    throw newInvalidEscapedCsvFieldException(charSequence, i4 - 1);
                }
            }
            i4++;
        }
        if (!z4) {
            arrayList.add(stringBuilder.toString());
            return arrayList;
        }
        throw newInvalidEscapedCsvFieldException(charSequence, length);
    }

    private static void validateCsvFormat(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = charSequence.charAt(i4);
            if (charAt == '\n' || charAt == '\r' || charAt == '\"' || charAt == ',') {
                throw newInvalidEscapedCsvFieldException(charSequence, i4);
            }
        }
    }

    public static <T extends Appendable> T byteToHexString(T t4, int i4) {
        try {
            t4.append(byteToHexString(i4));
        } catch (IOException e5) {
            PlatformDependent.throwException(e5);
        }
        return t4;
    }

    public static <T extends Appendable> T byteToHexStringPadded(T t4, int i4) {
        try {
            t4.append(byteToHexStringPadded(i4));
        } catch (IOException e5) {
            PlatformDependent.throwException(e5);
        }
        return t4;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence escapeCsv(java.lang.CharSequence r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.StringUtil.escapeCsv(java.lang.CharSequence, boolean):java.lang.CharSequence");
    }

    public static String simpleClassName(Class<?> cls) {
        String name = ((Class) ObjectUtil.checkNotNull(cls, "clazz")).getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf > -1 ? name.substring(lastIndexOf + 1) : name;
    }

    public static String toHexString(byte[] bArr, int i4, int i5) {
        return ((StringBuilder) toHexString(new StringBuilder(i5 << 1), bArr, i4, i5)).toString();
    }

    public static String toHexStringPadded(byte[] bArr, int i4, int i5) {
        return ((StringBuilder) toHexStringPadded(new StringBuilder(i5 << 1), bArr, i4, i5)).toString();
    }

    public static <T extends Appendable> T toHexString(T t4, byte[] bArr) {
        return (T) toHexString(t4, bArr, 0, bArr.length);
    }

    public static <T extends Appendable> T toHexStringPadded(T t4, byte[] bArr) {
        return (T) toHexStringPadded(t4, bArr, 0, bArr.length);
    }

    public static <T extends Appendable> T toHexString(T t4, byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return t4;
        }
        int i6 = i5 + i4;
        int i7 = i6 - 1;
        while (i4 < i7 && bArr[i4] == 0) {
            i4++;
        }
        int i8 = i4 + 1;
        byteToHexString(t4, bArr[i4]);
        toHexStringPadded(t4, bArr, i8, i6 - i8);
        return t4;
    }

    public static <T extends Appendable> T toHexStringPadded(T t4, byte[] bArr, int i4, int i5) {
        int i6 = i5 + i4;
        while (i4 < i6) {
            byteToHexStringPadded(t4, bArr[i4]);
            i4++;
        }
        return t4;
    }

    public static byte[] decodeHexDump(CharSequence charSequence) {
        return decodeHexDump(charSequence, 0, charSequence.length());
    }
}
