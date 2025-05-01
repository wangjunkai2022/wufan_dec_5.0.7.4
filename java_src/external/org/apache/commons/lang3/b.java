package external.org.apache.commons.lang3;
/* compiled from: CharSequenceUtils.java */
/* loaded from: classes.dex */
public class b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(CharSequence charSequence, int i4, int i5) {
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(i4, i5);
        }
        int length = charSequence.length();
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < length) {
            if (charSequence.charAt(i5) == i4) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(CharSequence charSequence, CharSequence charSequence2, int i4) {
        return charSequence.toString().indexOf(charSequence2.toString(), i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(CharSequence charSequence, int i4, int i5) {
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(i4, i5);
        }
        int length = charSequence.length();
        if (i5 < 0) {
            return -1;
        }
        if (i5 >= length) {
            i5 = length - 1;
        }
        while (i5 >= 0) {
            if (charSequence.charAt(i5) == i4) {
                return i5;
            }
            i5--;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(CharSequence charSequence, CharSequence charSequence2, int i4) {
        return charSequence.toString().lastIndexOf(charSequence2.toString(), i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(CharSequence charSequence, boolean z4, int i4, CharSequence charSequence2, int i5, int i6) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return ((String) charSequence).regionMatches(z4, i4, (String) charSequence2, i5, i6);
        }
        return charSequence.toString().regionMatches(z4, i4, charSequence2.toString(), i5, i6);
    }

    public static CharSequence f(CharSequence charSequence, int i4) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.subSequence(i4, charSequence.length());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static char[] g(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return ((String) charSequence).toCharArray();
        }
        int length = charSequence.length();
        char[] cArr = new char[charSequence.length()];
        for (int i4 = 0; i4 < length; i4++) {
            cArr[i4] = charSequence.charAt(i4);
        }
        return cArr;
    }
}
