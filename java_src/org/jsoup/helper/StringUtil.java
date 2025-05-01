package org.jsoup.helper;

import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes7.dex */
public final class StringUtil {
    private static final String[] padding = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          "};

    public static boolean in(String str, String... strArr) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isBlank(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i4 = 0; i4 < length; i4++) {
                if (!isWhitespace(str.codePointAt(i4))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isDigit(str.codePointAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isWhitespace(int i4) {
        return i4 == 32 || i4 == 9 || i4 == 10 || i4 == 12 || i4 == 13;
    }

    public static String join(Collection collection, String str) {
        return join(collection.iterator(), str);
    }

    public static String normaliseWhitespace(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        int i4 = 0;
        boolean z4 = false;
        boolean z5 = false;
        while (i4 < length) {
            int codePointAt = str.codePointAt(i4);
            if (!isWhitespace(codePointAt)) {
                sb.appendCodePoint(codePointAt);
                z5 = false;
            } else if (z5) {
                z4 = true;
            } else {
                if (codePointAt != 32) {
                    z4 = true;
                }
                sb.append(' ');
                z5 = true;
            }
            i4 += Character.charCount(codePointAt);
        }
        return z4 ? sb.toString() : str;
    }

    public static String padding(int i4) {
        if (i4 >= 0) {
            String[] strArr = padding;
            if (i4 < strArr.length) {
                return strArr[i4];
            }
            char[] cArr = new char[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                cArr[i5] = ' ';
            }
            return String.valueOf(cArr);
        }
        throw new IllegalArgumentException("width must be > 0");
    }

    public static String join(Iterator it2, String str) {
        if (it2.hasNext()) {
            String obj = it2.next().toString();
            if (it2.hasNext()) {
                StringBuilder sb = new StringBuilder(64);
                sb.append(obj);
                while (it2.hasNext()) {
                    sb.append(str);
                    sb.append(it2.next());
                }
                return sb.toString();
            }
            return obj;
        }
        return "";
    }
}
