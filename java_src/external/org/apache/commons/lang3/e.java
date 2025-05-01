package external.org.apache.commons.lang3;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;
/* compiled from: StringUtils.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String f68905a = "";

    /* renamed from: b  reason: collision with root package name */
    public static final int f68906b = -1;

    /* renamed from: c  reason: collision with root package name */
    private static final int f68907c = 8192;

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f68908d = Pattern.compile("\\s+");

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: StringUtils.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final Throwable f68909a;

        /* renamed from: b  reason: collision with root package name */
        private static final Method f68910b;

        /* renamed from: c  reason: collision with root package name */
        private static final Pattern f68911c;

        /* renamed from: d  reason: collision with root package name */
        private static final Throwable f68912d;

        /* renamed from: e  reason: collision with root package name */
        private static final Method f68913e;

        /* renamed from: f  reason: collision with root package name */
        private static final Object f68914f;

        /* renamed from: g  reason: collision with root package name */
        private static final Pattern f68915g;

        static {
            Object obj;
            Exception exc;
            Method method;
            Method method2;
            Class<?> loadClass;
            Pattern compile = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
            f68911c = compile;
            f68915g = compile;
            Exception exc2 = null;
            try {
                loadClass = Thread.currentThread().getContextClassLoader().loadClass("java.text.Normalizer$Form");
                obj = loadClass.getField("NFD").get(null);
            } catch (Exception e5) {
                e = e5;
                obj = null;
            }
            try {
                method = Thread.currentThread().getContextClassLoader().loadClass("java.text.Normalizer").getMethod("normalize", CharSequence.class, loadClass);
                exc = null;
                method2 = null;
            } catch (Exception e6) {
                e = e6;
                try {
                    method2 = Thread.currentThread().getContextClassLoader().loadClass("sun.text.Normalizer").getMethod("decompose", String.class, Boolean.TYPE, Integer.TYPE);
                    method = null;
                    exc = null;
                } catch (Exception e7) {
                    exc = e7;
                    method = null;
                    method2 = null;
                }
                exc2 = e;
                f68912d = exc2;
                f68914f = obj;
                f68913e = method;
                f68909a = exc;
                f68910b = method2;
            }
            f68912d = exc2;
            f68914f = obj;
            f68913e = method;
            f68909a = exc;
            f68910b = method2;
        }

        private a() {
        }
    }

    public static String A(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        int T = T(str, str2);
        return T == -1 ? "" : str2.substring(T);
    }

    public static int A0(CharSequence charSequence, CharSequence charSequence2, int i4) {
        if (charSequence != null && charSequence2 != null) {
            if (i4 > charSequence.length() - charSequence2.length()) {
                i4 = charSequence.length() - charSequence2.length();
            }
            if (i4 < 0) {
                return -1;
            }
            if (charSequence2.length() == 0) {
                return i4;
            }
            while (i4 >= 0) {
                if (b.e(charSequence, true, i4, charSequence2, 0, charSequence2.length())) {
                    return i4;
                }
                i4--;
            }
        }
        return -1;
    }

    public static String[] A1(String str, char c5) {
        return D1(str, c5, true);
    }

    public static boolean B(CharSequence charSequence, CharSequence charSequence2) {
        return C(charSequence, charSequence2, false);
    }

    public static int B0(CharSequence charSequence, CharSequence charSequence2, int i4) {
        return M0(charSequence, charSequence2, i4, true);
    }

    public static String[] B1(String str, String str2) {
        return E1(str, str2, -1, true);
    }

    private static boolean C(CharSequence charSequence, CharSequence charSequence2, boolean z4) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == null && charSequence2 == null;
        } else if (charSequence2.length() > charSequence.length()) {
            return false;
        } else {
            return b.e(charSequence, z4, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length());
        }
    }

    public static String C0(String str, int i4) {
        if (str == null) {
            return null;
        }
        return i4 < 0 ? "" : str.length() <= i4 ? str : str.substring(0, i4);
    }

    public static String[] C1(String str, String str2, int i4) {
        return E1(str, str2, i4, true);
    }

    public static boolean D(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!f0(charSequence) && !external.org.apache.commons.lang3.a.z0(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (B(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String D0(String str, int i4) {
        return E0(str, i4, ' ');
    }

    private static String[] D1(String str, char c5, boolean z4) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return external.org.apache.commons.lang3.a.f68835c;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i5 = 0;
        while (i4 < length) {
            if (str.charAt(i4) == c5) {
                if (z5 || z4) {
                    arrayList.add(str.substring(i5, i4));
                    z5 = false;
                    z6 = true;
                }
                i5 = i4 + 1;
                i4 = i5;
            } else {
                i4++;
                z5 = true;
                z6 = false;
            }
        }
        if (z5 || (z4 && z6)) {
            arrayList.add(str.substring(i5, i4));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean E(CharSequence charSequence, CharSequence charSequence2) {
        return C(charSequence, charSequence2, true);
    }

    public static String E0(String str, int i4, char c5) {
        if (str == null) {
            return null;
        }
        int length = i4 - str.length();
        if (length <= 0) {
            return str;
        }
        if (length > 8192) {
            return F0(str, i4, String.valueOf(c5));
        }
        return W0(c5, length).concat(str);
    }

    private static String[] E1(String str, String str2, int i4, boolean z4) {
        int i5;
        boolean z5;
        boolean z6;
        int i6;
        int i7;
        boolean z7;
        boolean z8;
        int i8;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return external.org.apache.commons.lang3.a.f68835c;
        }
        ArrayList arrayList = new ArrayList();
        if (str2 == null) {
            i7 = 0;
            z7 = false;
            z8 = false;
            i8 = 0;
            int i9 = 1;
            while (i7 < length) {
                if (Character.isWhitespace(str.charAt(i7))) {
                    if (z7 || z4) {
                        int i10 = i9 + 1;
                        if (i9 == i4) {
                            i7 = length;
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        arrayList.add(str.substring(i8, i7));
                        i9 = i10;
                        z7 = false;
                    }
                    i8 = i7 + 1;
                    i7 = i8;
                } else {
                    i7++;
                    z7 = true;
                    z8 = false;
                }
            }
        } else {
            if (str2.length() == 1) {
                char charAt = str2.charAt(0);
                i5 = 0;
                z5 = false;
                z6 = false;
                i6 = 0;
                int i11 = 1;
                while (i5 < length) {
                    if (str.charAt(i5) == charAt) {
                        if (z5 || z4) {
                            int i12 = i11 + 1;
                            if (i11 == i4) {
                                i5 = length;
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            arrayList.add(str.substring(i6, i5));
                            i11 = i12;
                            z5 = false;
                        }
                        i6 = i5 + 1;
                        i5 = i6;
                    } else {
                        i5++;
                        z5 = true;
                        z6 = false;
                    }
                }
            } else {
                i5 = 0;
                z5 = false;
                z6 = false;
                i6 = 0;
                int i13 = 1;
                while (i5 < length) {
                    if (str2.indexOf(str.charAt(i5)) >= 0) {
                        if (z5 || z4) {
                            int i14 = i13 + 1;
                            if (i13 == i4) {
                                i5 = length;
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            arrayList.add(str.substring(i6, i5));
                            i13 = i14;
                            z5 = false;
                        }
                        i6 = i5 + 1;
                        i5 = i6;
                    } else {
                        i5++;
                        z5 = true;
                        z6 = false;
                    }
                }
            }
            i7 = i5;
            z7 = z5;
            z8 = z6;
            i8 = i6;
        }
        if (z7 || (z4 && z8)) {
            arrayList.add(str.substring(i8, i7));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean F(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null) {
            return charSequence2 == null;
        }
        return charSequence.equals(charSequence2);
    }

    public static String F0(String str, int i4, String str2) {
        if (str == null) {
            return null;
        }
        if (f0(str2)) {
            str2 = " ";
        }
        int length = str2.length();
        int length2 = i4 - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length != 1 || length2 > 8192) {
            if (length2 == length) {
                return str2.concat(str);
            }
            if (length2 < length) {
                return str2.substring(0, length2).concat(str);
            }
            char[] cArr = new char[length2];
            char[] charArray = str2.toCharArray();
            for (int i5 = 0; i5 < length2; i5++) {
                cArr[i5] = charArray[i5 % length];
            }
            return new String(cArr).concat(str);
        }
        return E0(str, i4, str2.charAt(0));
    }

    public static boolean F1(CharSequence charSequence, CharSequence charSequence2) {
        return G1(charSequence, charSequence2, false);
    }

    public static boolean G(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == charSequence2;
        }
        return b.e(charSequence, true, 0, charSequence2, 0, Math.max(charSequence.length(), charSequence2.length()));
    }

    public static int G0(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    private static boolean G1(CharSequence charSequence, CharSequence charSequence2, boolean z4) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == null && charSequence2 == null;
        } else if (charSequence2.length() > charSequence.length()) {
            return false;
        } else {
            return b.e(charSequence, z4, 0, charSequence2, 0, charSequence2.length());
        }
    }

    public static String H(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        int U = U(strArr);
        return U == -1 ? strArr[0] == null ? "" : strArr[0] : U == 0 ? "" : strArr[0].substring(0, U);
    }

    public static String H0(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase();
    }

    public static boolean H1(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!f0(charSequence) && !external.org.apache.commons.lang3.a.z0(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (F1(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int I(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            int length = charSequence.length();
            int length2 = charSequence2.length();
            if (length == 0) {
                return length2;
            }
            if (length2 == 0) {
                return length;
            }
            if (length > length2) {
                length2 = charSequence.length();
                length = length2;
            } else {
                charSequence2 = charSequence;
                charSequence = charSequence2;
            }
            int i4 = length + 1;
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            for (int i5 = 0; i5 <= length; i5++) {
                iArr[i5] = i5;
            }
            int i6 = 1;
            while (i6 <= length2) {
                char charAt = charSequence.charAt(i6 - 1);
                iArr2[0] = i6;
                for (int i7 = 1; i7 <= length; i7++) {
                    int i8 = i7 - 1;
                    iArr2[i7] = Math.min(Math.min(iArr2[i8] + 1, iArr[i7] + 1), iArr[i8] + (charSequence2.charAt(i8) == charAt ? 0 : 1));
                }
                i6++;
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            return iArr[length];
        }
        throw new IllegalArgumentException("Strings must not be null");
    }

    public static String I0(String str, Locale locale) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(locale);
    }

    public static boolean I1(CharSequence charSequence, CharSequence charSequence2) {
        return G1(charSequence, charSequence2, true);
    }

    public static int J(CharSequence charSequence, CharSequence charSequence2, int i4) {
        int i5;
        int i6;
        CharSequence charSequence3;
        CharSequence charSequence4;
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }
        if (i4 >= 0) {
            int length = charSequence.length();
            int length2 = charSequence2.length();
            if (length == 0) {
                if (length2 <= i4) {
                    return length2;
                }
                return -1;
            } else if (length2 == 0) {
                if (length <= i4) {
                    return length;
                }
                return -1;
            } else {
                if (length > length2) {
                    i6 = charSequence.length();
                    i5 = length2;
                    charSequence4 = charSequence;
                    charSequence3 = charSequence2;
                } else {
                    i5 = length;
                    i6 = length2;
                    charSequence3 = charSequence;
                    charSequence4 = charSequence2;
                }
                int i7 = i5 + 1;
                int[] iArr = new int[i7];
                int[] iArr2 = new int[i7];
                int min = Math.min(i5, i4) + 1;
                char c5 = 0;
                for (int i8 = 0; i8 < min; i8++) {
                    iArr[i8] = i8;
                }
                int i9 = Integer.MAX_VALUE;
                Arrays.fill(iArr, min, i7, Integer.MAX_VALUE);
                Arrays.fill(iArr2, Integer.MAX_VALUE);
                int i10 = 1;
                while (i10 <= i6) {
                    char charAt = charSequence4.charAt(i10 - 1);
                    iArr2[c5] = i10;
                    int max = Math.max(1, i10 - i4);
                    int min2 = Math.min(i5, i10 + i4);
                    if (max > min2) {
                        return -1;
                    }
                    if (max > 1) {
                        iArr2[max - 1] = i9;
                    }
                    while (max <= min2) {
                        int i11 = max - 1;
                        if (charSequence3.charAt(i11) == charAt) {
                            iArr2[max] = iArr[i11];
                        } else {
                            iArr2[max] = Math.min(Math.min(iArr2[i11], iArr[max]), iArr[i11]) + 1;
                        }
                        max++;
                    }
                    i10++;
                    c5 = 0;
                    i9 = Integer.MAX_VALUE;
                    int[] iArr3 = iArr2;
                    iArr2 = iArr;
                    iArr = iArr3;
                }
                if (iArr[i5] <= i4) {
                    return iArr[i5];
                }
                return -1;
            }
        }
        throw new IllegalArgumentException("Threshold must not be negative");
    }

    public static String J0(String str, int i4, int i5) {
        if (str == null) {
            return null;
        }
        if (i5 < 0 || i4 > str.length()) {
            return "";
        }
        if (i4 < 0) {
            i4 = 0;
        }
        int i6 = i5 + i4;
        if (str.length() <= i6) {
            return str.substring(i4);
        }
        return str.substring(i4, i6);
    }

    public static String J1(String str) {
        return K1(str, null);
    }

    public static int K(CharSequence charSequence, int i4) {
        if (f0(charSequence)) {
            return -1;
        }
        return b.a(charSequence, i4, 0);
    }

    public static String K0(String str) {
        if (str == null) {
            return null;
        }
        return f68908d.matcher(d2(str)).replaceAll(" ");
    }

    public static String K1(String str, String str2) {
        return f0(str) ? str : O1(P1(str, str2), str2);
    }

    public static int L(CharSequence charSequence, int i4, int i5) {
        if (f0(charSequence)) {
            return -1;
        }
        return b.a(charSequence, i4, i5);
    }

    public static int L0(CharSequence charSequence, CharSequence charSequence2, int i4) {
        return M0(charSequence, charSequence2, i4, false);
    }

    public static String L1(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (a.f68913e == null) {
                if (a.f68910b == null) {
                    throw new UnsupportedOperationException("The stripAccents(CharSequence) method requires at least Java6, but got: " + a.f68912d + "; or a Sun JVM: " + a.f68909a);
                }
                return R0(str);
            }
            return Q0(str);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("IllegalAccessException occurred", e5);
        } catch (IllegalArgumentException e6) {
            throw new RuntimeException("IllegalArgumentException occurred", e6);
        } catch (SecurityException e7) {
            throw new RuntimeException("SecurityException occurred", e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException("InvocationTargetException occurred", e8);
        }
    }

    public static int M(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return b.b(charSequence, charSequence2, 0);
    }

    private static int M0(CharSequence charSequence, CharSequence charSequence2, int i4, boolean z4) {
        if (charSequence == null || charSequence2 == null || i4 <= 0) {
            return r0;
        }
        int i5 = 0;
        if (charSequence2.length() == 0) {
            if (z4) {
                return charSequence.length();
            }
            return 0;
        }
        r0 = z4 ? charSequence.length() : -1;
        do {
            if (z4) {
                r0 = b.d(charSequence, charSequence2, r0 - 1);
            } else {
                r0 = b.b(charSequence, charSequence2, r0 + 1);
            }
            if (r0 < 0) {
                return r0;
            }
            i5++;
        } while (i5 < i4);
        return r0;
    }

    public static String[] M1(String... strArr) {
        return N1(strArr, null);
    }

    public static int N(CharSequence charSequence, CharSequence charSequence2, int i4) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return b.b(charSequence, charSequence2, i4);
    }

    public static String N0(String str, String str2, int i4, int i5) {
        if (str == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        int length = str.length();
        if (i4 < 0) {
            i4 = 0;
        }
        if (i4 > length) {
            i4 = length;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (i5 > length) {
            i5 = length;
        }
        if (i4 > i5) {
            int i6 = i5;
            i5 = i4;
            i4 = i6;
        }
        StringBuilder sb = new StringBuilder(((length + i4) - i5) + str2.length() + 1);
        sb.append(str.substring(0, i4));
        sb.append(str2);
        sb.append(str.substring(i5));
        return sb.toString();
    }

    public static String[] N1(String[] strArr, String str) {
        int length;
        if (strArr == null || (length = strArr.length) == 0) {
            return strArr;
        }
        String[] strArr2 = new String[length];
        for (int i4 = 0; i4 < length; i4++) {
            strArr2[i4] = K1(strArr[i4], str);
        }
        return strArr2;
    }

    public static int O(CharSequence charSequence, String str) {
        if (f0(charSequence) || f0(str)) {
            return -1;
        }
        return P(charSequence, str.toCharArray());
    }

    public static String O0(String str, char c5) {
        if (f0(str) || str.indexOf(c5) == -1) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i4 = 0;
        for (int i5 = 0; i5 < charArray.length; i5++) {
            if (charArray[i5] != c5) {
                charArray[i4] = charArray[i5];
                i4++;
            }
        }
        return new String(charArray, 0, i4);
    }

    public static String O1(String str, String str2) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return str;
        }
        if (str2 == null) {
            while (length != 0 && Character.isWhitespace(str.charAt(length - 1))) {
                length--;
            }
        } else if (str2.length() == 0) {
            return str;
        } else {
            while (length != 0 && str2.indexOf(str.charAt(length - 1)) != -1) {
                length--;
            }
        }
        return str.substring(0, length);
    }

    public static int P(CharSequence charSequence, char... cArr) {
        if (!f0(charSequence) && !external.org.apache.commons.lang3.a.u0(cArr)) {
            int length = charSequence.length();
            int i4 = length - 1;
            int length2 = cArr.length;
            int i5 = length2 - 1;
            for (int i6 = 0; i6 < length; i6++) {
                char charAt = charSequence.charAt(i6);
                for (int i7 = 0; i7 < length2; i7++) {
                    if (cArr[i7] == charAt && (i6 >= i4 || i7 >= i5 || !Character.isHighSurrogate(charAt) || cArr[i7 + 1] == charSequence.charAt(i6 + 1))) {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }

    public static String P0(String str, String str2) {
        return (f0(str) || f0(str2)) ? str : a1(str, str2, "", -1);
    }

    public static String P1(String str, String str2) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return str;
        }
        int i4 = 0;
        if (str2 == null) {
            while (i4 != length && Character.isWhitespace(str.charAt(i4))) {
                i4++;
            }
        } else if (str2.length() == 0) {
            return str;
        } else {
            while (i4 != length && str2.indexOf(str.charAt(i4)) != -1) {
                i4++;
            }
        }
        return str.substring(i4);
    }

    public static int Q(CharSequence charSequence, CharSequence... charSequenceArr) {
        int b5;
        if (charSequence == null || charSequenceArr == null) {
            return -1;
        }
        int i4 = Integer.MAX_VALUE;
        for (CharSequence charSequence2 : charSequenceArr) {
            if (charSequence2 != null && (b5 = b.b(charSequence, charSequence2, 0)) != -1 && b5 < i4) {
                i4 = b5;
            }
        }
        if (i4 == Integer.MAX_VALUE) {
            return -1;
        }
        return i4;
    }

    private static String Q0(CharSequence charSequence) throws IllegalAccessException, InvocationTargetException {
        if (a.f68913e != null && a.f68914f != null) {
            return a.f68915g.matcher((String) a.f68913e.invoke(null, charSequence, a.f68914f)).replaceAll("");
        }
        throw new IllegalStateException("java.text.Normalizer is not available", a.f68912d);
    }

    public static String Q1(String str) {
        return str == null ? "" : K1(str, null);
    }

    public static int R(CharSequence charSequence, CharSequence charSequence2) {
        if (!f0(charSequence) && !f0(charSequence2)) {
            int length = charSequence.length();
            int i4 = 0;
            while (i4 < length) {
                char charAt = charSequence.charAt(i4);
                boolean z4 = b.a(charSequence2, charAt, 0) >= 0;
                int i5 = i4 + 1;
                if (i5 < length && Character.isHighSurrogate(charAt)) {
                    char charAt2 = charSequence.charAt(i5);
                    if (z4 && b.a(charSequence2, charAt2, 0) < 0) {
                        return i4;
                    }
                } else if (!z4) {
                    return i4;
                }
                i4 = i5;
            }
        }
        return -1;
    }

    private static String R0(CharSequence charSequence) throws IllegalAccessException, InvocationTargetException {
        if (a.f68910b != null) {
            return a.f68911c.matcher((String) a.f68910b.invoke(null, charSequence, Boolean.FALSE, 0)).replaceAll("");
        }
        throw new IllegalStateException("sun.text.Normalizer is not available", a.f68909a);
    }

    public static String R1(String str) {
        if (str == null) {
            return null;
        }
        String K1 = K1(str, null);
        if (K1.length() == 0) {
            return null;
        }
        return K1;
    }

    public static int S(CharSequence charSequence, char... cArr) {
        if (!f0(charSequence) && !external.org.apache.commons.lang3.a.u0(cArr)) {
            int length = charSequence.length();
            int i4 = length - 1;
            int length2 = cArr.length;
            int i5 = length2 - 1;
            for (int i6 = 0; i6 < length; i6++) {
                char charAt = charSequence.charAt(i6);
                for (int i7 = 0; i7 < length2; i7++) {
                    if (cArr[i7] != charAt || (i6 < i4 && i7 < i5 && Character.isHighSurrogate(charAt) && cArr[i7 + 1] != charSequence.charAt(i6 + 1))) {
                    }
                }
                return i6;
            }
        }
        return -1;
    }

    public static String S0(String str, String str2) {
        return (f0(str) || f0(str2) || !str.endsWith(str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    public static String S1(String str, int i4) {
        if (str == null) {
            return null;
        }
        if (i4 < 0) {
            i4 += str.length();
        }
        if (i4 < 0) {
            i4 = 0;
        }
        return i4 > str.length() ? "" : str.substring(i4);
    }

    public static int T(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return -1;
        }
        int i4 = 0;
        if (charSequence != null && charSequence2 != null) {
            while (i4 < charSequence.length() && i4 < charSequence2.length() && charSequence.charAt(i4) == charSequence2.charAt(i4)) {
                i4++;
            }
            if (i4 >= charSequence2.length() && i4 >= charSequence.length()) {
                return -1;
            }
        }
        return i4;
    }

    public static String T0(String str, String str2) {
        return (f0(str) || f0(str2) || !E(str, str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    public static String T1(String str, int i4, int i5) {
        if (str == null) {
            return null;
        }
        if (i5 < 0) {
            i5 += str.length();
        }
        if (i4 < 0) {
            i4 += str.length();
        }
        if (i5 > str.length()) {
            i5 = str.length();
        }
        if (i4 > i5) {
            return "";
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        return str.substring(i4, i5);
    }

    public static int U(CharSequence... charSequenceArr) {
        if (charSequenceArr != null && charSequenceArr.length > 1) {
            int length = charSequenceArr.length;
            int i4 = Integer.MAX_VALUE;
            boolean z4 = true;
            int i5 = 0;
            boolean z5 = false;
            for (int i6 = 0; i6 < length; i6++) {
                if (charSequenceArr[i6] == null) {
                    i4 = 0;
                    z5 = true;
                } else {
                    i4 = Math.min(charSequenceArr[i6].length(), i4);
                    i5 = Math.max(charSequenceArr[i6].length(), i5);
                    z4 = false;
                }
            }
            if (!z4 && (i5 != 0 || z5)) {
                if (i4 == 0) {
                    return 0;
                }
                int i7 = -1;
                for (int i8 = 0; i8 < i4; i8++) {
                    char charAt = charSequenceArr[0].charAt(i8);
                    int i9 = 1;
                    while (true) {
                        if (i9 >= length) {
                            break;
                        } else if (charSequenceArr[i9].charAt(i8) != charAt) {
                            i7 = i8;
                            break;
                        } else {
                            i9++;
                        }
                    }
                    if (i7 != -1) {
                        break;
                    }
                }
                return (i7 != -1 || i4 == i5) ? i7 : i4;
            }
        }
        return -1;
    }

    public static String U0(String str, String str2) {
        return (f0(str) || f0(str2) || !str.startsWith(str2)) ? str : str.substring(str2.length());
    }

    public static String U1(String str, String str2) {
        int indexOf;
        return f0(str) ? str : (str2 == null || (indexOf = str.indexOf(str2)) == -1) ? "" : str.substring(indexOf + str2.length());
    }

    public static int V(CharSequence charSequence, CharSequence charSequence2) {
        return W(charSequence, charSequence2, 0);
    }

    public static String V0(String str, String str2) {
        return (f0(str) || f0(str2) || !I1(str, str2)) ? str : str.substring(str2.length());
    }

    public static String V1(String str, String str2) {
        int lastIndexOf;
        return f0(str) ? str : (f0(str2) || (lastIndexOf = str.lastIndexOf(str2)) == -1 || lastIndexOf == str.length() - str2.length()) ? "" : str.substring(lastIndexOf + str2.length());
    }

    public static int W(CharSequence charSequence, CharSequence charSequence2, int i4) {
        if (charSequence != null && charSequence2 != null) {
            if (i4 < 0) {
                i4 = 0;
            }
            int length = (charSequence.length() - charSequence2.length()) + 1;
            if (i4 > length) {
                return -1;
            }
            if (charSequence2.length() == 0) {
                return i4;
            }
            while (i4 < length) {
                if (b.e(charSequence, true, i4, charSequence2, 0, charSequence2.length())) {
                    return i4;
                }
                i4++;
            }
        }
        return -1;
    }

    public static String W0(char c5, int i4) {
        char[] cArr = new char[i4];
        for (int i5 = i4 - 1; i5 >= 0; i5--) {
            cArr[i5] = c5;
        }
        return new String(cArr);
    }

    public static String W1(String str, String str2) {
        if (f0(str) || str2 == null) {
            return str;
        }
        if (str2.length() == 0) {
            return "";
        }
        int indexOf = str.indexOf(str2);
        return indexOf == -1 ? str : str.substring(0, indexOf);
    }

    public static boolean X(CharSequence charSequence) {
        if (charSequence == null || f0(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isLowerCase(charSequence.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static String X0(String str, int i4) {
        if (str == null) {
            return null;
        }
        if (i4 <= 0) {
            return "";
        }
        int length = str.length();
        if (i4 == 1 || length == 0) {
            return str;
        }
        if (length != 1 || i4 > 8192) {
            int i5 = length * i4;
            if (length != 1) {
                if (length != 2) {
                    StringBuilder sb = new StringBuilder(i5);
                    for (int i6 = 0; i6 < i4; i6++) {
                        sb.append(str);
                    }
                    return sb.toString();
                }
                char charAt = str.charAt(0);
                char charAt2 = str.charAt(1);
                char[] cArr = new char[i5];
                for (int i7 = (i4 * 2) - 2; i7 >= 0; i7 = (i7 - 1) - 1) {
                    cArr[i7] = charAt;
                    cArr[i7 + 1] = charAt2;
                }
                return new String(cArr);
            }
            return W0(str.charAt(0), i4);
        }
        return W0(str.charAt(0), i4);
    }

    public static String X1(String str, String str2) {
        int lastIndexOf;
        return (f0(str) || f0(str2) || (lastIndexOf = str.lastIndexOf(str2)) == -1) ? str : str.substring(0, lastIndexOf);
    }

    public static boolean Y(CharSequence charSequence) {
        if (charSequence == null || f0(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isUpperCase(charSequence.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static String Y0(String str, String str2, int i4) {
        if (str != null && str2 != null) {
            return S0(X0(str + str2, i4), str2);
        }
        return X0(str, i4);
    }

    public static String Y1(String str, String str2) {
        return Z1(str, str2, str2);
    }

    public static boolean Z(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isLetter(charSequence.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static String Z0(String str, String str2, String str3) {
        return a1(str, str2, str3, -1);
    }

    public static String Z1(String str, String str2, String str3) {
        int indexOf;
        int indexOf2;
        if (str == null || str2 == null || str3 == null || (indexOf = str.indexOf(str2)) == -1 || (indexOf2 = str.indexOf(str3, str2.length() + indexOf)) == -1) {
            return null;
        }
        return str.substring(indexOf + str2.length(), indexOf2);
    }

    public static String a(String str, int i4) {
        return b(str, 0, i4);
    }

    public static boolean a0(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isLetter(charSequence.charAt(i4)) && charSequence.charAt(i4) != ' ') {
                return false;
            }
        }
        return true;
    }

    public static String a1(String str, String str2, String str3, int i4) {
        if (f0(str) || f0(str2) || str3 == null || i4 == 0) {
            return str;
        }
        int i5 = 0;
        int indexOf = str.indexOf(str2, 0);
        if (indexOf == -1) {
            return str;
        }
        int length = str2.length();
        int length2 = str3.length() - length;
        if (length2 < 0) {
            length2 = 0;
        }
        int i6 = 64;
        if (i4 < 0) {
            i6 = 16;
        } else if (i4 <= 64) {
            i6 = i4;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length2 * i6));
        while (indexOf != -1) {
            sb.append(str.substring(i5, indexOf));
            sb.append(str3);
            i5 = indexOf + length;
            i4--;
            if (i4 == 0) {
                break;
            }
            indexOf = str.indexOf(str2, i5);
        }
        sb.append(str.substring(i5));
        return sb.toString();
    }

    public static String[] a2(String str, String str2, String str3) {
        int indexOf;
        int i4;
        int indexOf2;
        if (str == null || f0(str2) || f0(str3)) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return external.org.apache.commons.lang3.a.f68835c;
        }
        int length2 = str3.length();
        int length3 = str2.length();
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        while (i5 < length - length2 && (indexOf = str.indexOf(str2, i5)) >= 0 && (indexOf2 = str.indexOf(str3, (i4 = indexOf + length3))) >= 0) {
            arrayList.add(str.substring(i4, indexOf2));
            i5 = indexOf2 + length2;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String b(String str, int i4, int i5) {
        if (str == null) {
            return null;
        }
        if (i5 >= 4) {
            if (str.length() <= i5) {
                return str;
            }
            if (i4 > str.length()) {
                i4 = str.length();
            }
            int i6 = i5 - 3;
            if (str.length() - i4 < i6) {
                i4 = str.length() - i6;
            }
            if (i4 <= 4) {
                return str.substring(0, i6) + "...";
            } else if (i5 >= 7) {
                if ((i5 + i4) - 3 < str.length()) {
                    return "..." + a(str.substring(i4), i6);
                }
                return "..." + str.substring(str.length() - i6);
            } else {
                throw new IllegalArgumentException("Minimum abbreviation width with offset is 7");
            }
        }
        throw new IllegalArgumentException("Minimum abbreviation width is 4");
    }

    public static boolean b0(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isLetterOrDigit(charSequence.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static String b1(String str, char c5, char c6) {
        if (str == null) {
            return null;
        }
        return str.replace(c5, c6);
    }

    public static String b2(String str) {
        if (f0(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i4 = 0; i4 < charArray.length; i4++) {
            char c5 = charArray[i4];
            if (Character.isUpperCase(c5)) {
                charArray[i4] = Character.toLowerCase(c5);
            } else if (Character.isTitleCase(c5)) {
                charArray[i4] = Character.toLowerCase(c5);
            } else if (Character.isLowerCase(c5)) {
                charArray[i4] = Character.toUpperCase(c5);
            }
        }
        return new String(charArray);
    }

    public static String c(String str, String str2, int i4) {
        if (f0(str) || f0(str2) || i4 >= str.length() || i4 < str2.length() + 2) {
            return str;
        }
        int length = i4 - str2.length();
        int i5 = length / 2;
        int i6 = (length % 2) + i5;
        int length2 = str.length() - i5;
        StringBuilder sb = new StringBuilder(i4);
        sb.append(str.substring(0, i6));
        sb.append(str2);
        sb.append(str.substring(length2));
        return sb.toString();
    }

    public static boolean c0(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isLetterOrDigit(charSequence.charAt(i4)) && charSequence.charAt(i4) != ' ') {
                return false;
            }
        }
        return true;
    }

    public static String c1(String str, String str2, String str3) {
        if (f0(str) || f0(str2)) {
            return str;
        }
        if (str3 == null) {
            str3 = "";
        }
        int length = str3.length();
        int length2 = str.length();
        StringBuilder sb = new StringBuilder(length2);
        boolean z4 = false;
        for (int i4 = 0; i4 < length2; i4++) {
            char charAt = str.charAt(i4);
            int indexOf = str2.indexOf(charAt);
            if (indexOf >= 0) {
                if (indexOf < length) {
                    sb.append(str3.charAt(indexOf));
                }
                z4 = true;
            } else {
                sb.append(charAt);
            }
        }
        return z4 ? sb.toString() : str;
    }

    public static String c2(byte[] bArr, String str) throws UnsupportedEncodingException {
        return str == null ? new String(bArr) : new String(bArr, str);
    }

    public static String d(String str) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(length);
        sb.append(Character.toTitleCase(str.charAt(0)));
        sb.append(str.substring(1));
        return sb.toString();
    }

    public static boolean d0(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!c.h(charSequence.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static String d1(String str, String[] strArr, String[] strArr2) {
        return e1(str, strArr, strArr2, false, 0);
    }

    public static String d2(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public static String e(String str, int i4) {
        return f(str, i4, ' ');
    }

    public static boolean e0(CharSequence charSequence) {
        int length;
        if (charSequence != null && (length = charSequence.length()) != 0) {
            for (int i4 = 0; i4 < length; i4++) {
                if (!Character.isWhitespace(charSequence.charAt(i4))) {
                    return false;
                }
            }
        }
        return true;
    }

    private static String e1(String str, String[] strArr, String[] strArr2, boolean z4, int i4) {
        int length;
        if (str == null || str.length() == 0 || strArr == null || strArr.length == 0 || strArr2 == null || strArr2.length == 0) {
            return str;
        }
        if (i4 >= 0) {
            int length2 = strArr.length;
            int length3 = strArr2.length;
            if (length2 == length3) {
                boolean[] zArr = new boolean[length2];
                int i5 = -1;
                int i6 = -1;
                for (int i7 = 0; i7 < length2; i7++) {
                    if (!zArr[i7] && strArr[i7] != null && strArr[i7].length() != 0 && strArr2[i7] != null) {
                        int indexOf = str.indexOf(strArr[i7]);
                        if (indexOf == -1) {
                            zArr[i7] = true;
                        } else if (i5 == -1 || indexOf < i5) {
                            i6 = i7;
                            i5 = indexOf;
                        }
                    }
                }
                if (i5 == -1) {
                    return str;
                }
                int i8 = 0;
                for (int i9 = 0; i9 < strArr.length; i9++) {
                    if (strArr[i9] != null && strArr2[i9] != null && (length = strArr2[i9].length() - strArr[i9].length()) > 0) {
                        i8 += length * 3;
                    }
                }
                StringBuilder sb = new StringBuilder(str.length() + Math.min(i8, str.length() / 5));
                int i10 = 0;
                while (i5 != -1) {
                    while (i10 < i5) {
                        sb.append(str.charAt(i10));
                        i10++;
                    }
                    sb.append(strArr2[i6]);
                    i10 = strArr[i6].length() + i5;
                    i5 = -1;
                    i6 = -1;
                    for (int i11 = 0; i11 < length2; i11++) {
                        if (!zArr[i11] && strArr[i11] != null && strArr[i11].length() != 0 && strArr2[i11] != null) {
                            int indexOf2 = str.indexOf(strArr[i11], i10);
                            if (indexOf2 == -1) {
                                zArr[i11] = true;
                            } else if (i5 == -1 || indexOf2 < i5) {
                                i6 = i11;
                                i5 = indexOf2;
                            }
                        }
                    }
                }
                int length4 = str.length();
                while (i10 < length4) {
                    sb.append(str.charAt(i10));
                    i10++;
                }
                String sb2 = sb.toString();
                return !z4 ? sb2 : e1(sb2, strArr, strArr2, z4, i4 - 1);
            }
            throw new IllegalArgumentException("Search and Replace array lengths don't match: " + length2 + " vs " + length3);
        }
        throw new IllegalStateException("Aborting to protect against StackOverflowError - output of one loop is the input of another");
    }

    public static String e2(String str) {
        return str == null ? "" : str.trim();
    }

    public static String f(String str, int i4, char c5) {
        int length;
        int length2;
        return (str == null || i4 <= 0 || (length2 = i4 - (length = str.length())) <= 0) ? str : l1(E0(str, length + (length2 / 2), c5), i4, c5);
    }

    public static boolean f0(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static String f1(String str, String[] strArr, String[] strArr2) {
        return e1(str, strArr, strArr2, true, strArr == null ? 0 : strArr.length);
    }

    public static String f2(String str) {
        String d22 = d2(str);
        if (f0(d22)) {
            return null;
        }
        return d22;
    }

    public static String g(String str, int i4, String str2) {
        if (str == null || i4 <= 0) {
            return str;
        }
        if (f0(str2)) {
            str2 = " ";
        }
        int length = str.length();
        int i5 = i4 - length;
        return i5 <= 0 ? str : m1(F0(str, length + (i5 / 2), str2), i4, str2);
    }

    public static boolean g0(CharSequence charSequence) {
        return !e0(charSequence);
    }

    public static String g1(String str, String str2, String str3) {
        return a1(str, str2, str3, 1);
    }

    public static String g2(String str) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(length);
        sb.append(Character.toLowerCase(str.charAt(0)));
        sb.append(str.substring(1));
        return sb.toString();
    }

    public static String h(String str) {
        if (f0(str)) {
            return str;
        }
        if (str.length() == 1) {
            char charAt = str.charAt(0);
            return (charAt == '\r' || charAt == '\n') ? "" : str;
        }
        int length = str.length() - 1;
        char charAt2 = str.charAt(length);
        if (charAt2 == '\n') {
            if (str.charAt(length - 1) == '\r') {
                length--;
            }
        } else if (charAt2 != '\r') {
            length++;
        }
        return str.substring(0, length);
    }

    public static boolean h0(CharSequence charSequence) {
        return !f0(charSequence);
    }

    public static String h1(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public static String h2(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }

    @Deprecated
    public static String i(String str, String str2) {
        return S0(str, str2);
    }

    public static boolean i0(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isDigit(charSequence.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static String i1(String str, char c5) {
        if (str == null) {
            return null;
        }
        String[] o12 = o1(str, c5);
        external.org.apache.commons.lang3.a.A2(o12);
        return q0(o12, c5);
    }

    public static String i2(String str, Locale locale) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(locale);
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length < 2) {
            return "";
        }
        int i4 = length - 1;
        String substring = str.substring(0, i4);
        if (str.charAt(i4) == '\n') {
            int i5 = i4 - 1;
            if (substring.charAt(i5) == '\r') {
                return substring.substring(0, i5);
            }
        }
        return substring;
    }

    public static boolean j0(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isDigit(charSequence.charAt(i4)) && charSequence.charAt(i4) != ' ') {
                return false;
            }
        }
        return true;
    }

    public static String j1(String str, int i4) {
        if (str == null) {
            return null;
        }
        return i4 < 0 ? "" : str.length() <= i4 ? str : str.substring(str.length() - i4);
    }

    public static boolean k(CharSequence charSequence, int i4) {
        return !f0(charSequence) && b.a(charSequence, i4, 0) >= 0;
    }

    public static boolean k0(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isWhitespace(charSequence.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static String k1(String str, int i4) {
        return l1(str, i4, ' ');
    }

    public static boolean l(CharSequence charSequence, CharSequence charSequence2) {
        return (charSequence == null || charSequence2 == null || b.b(charSequence, charSequence2, 0) < 0) ? false : true;
    }

    public static String l0(Iterable<?> iterable, char c5) {
        if (iterable == null) {
            return null;
        }
        return n0(iterable.iterator(), c5);
    }

    public static String l1(String str, int i4, char c5) {
        if (str == null) {
            return null;
        }
        int length = i4 - str.length();
        if (length <= 0) {
            return str;
        }
        if (length > 8192) {
            return m1(str, i4, String.valueOf(c5));
        }
        return str.concat(W0(c5, length));
    }

    public static boolean m(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2 == null) {
            return false;
        }
        return n(charSequence, b.g(charSequence2));
    }

    public static String m0(Iterable<?> iterable, String str) {
        if (iterable == null) {
            return null;
        }
        return o0(iterable.iterator(), str);
    }

    public static String m1(String str, int i4, String str2) {
        if (str == null) {
            return null;
        }
        if (f0(str2)) {
            str2 = " ";
        }
        int length = str2.length();
        int length2 = i4 - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length != 1 || length2 > 8192) {
            if (length2 == length) {
                return str.concat(str2);
            }
            if (length2 < length) {
                return str.concat(str2.substring(0, length2));
            }
            char[] cArr = new char[length2];
            char[] charArray = str2.toCharArray();
            for (int i5 = 0; i5 < length2; i5++) {
                cArr[i5] = charArray[i5 % length];
            }
            return str.concat(new String(cArr));
        }
        return l1(str, i4, str2.charAt(0));
    }

    public static boolean n(CharSequence charSequence, char... cArr) {
        if (!f0(charSequence) && !external.org.apache.commons.lang3.a.u0(cArr)) {
            int length = charSequence.length();
            int length2 = cArr.length;
            int i4 = length - 1;
            int i5 = length2 - 1;
            for (int i6 = 0; i6 < length; i6++) {
                char charAt = charSequence.charAt(i6);
                for (int i7 = 0; i7 < length2; i7++) {
                    if (cArr[i7] == charAt) {
                        if (!Character.isHighSurrogate(charAt) || i7 == i5) {
                            return true;
                        }
                        if (i6 < i4 && cArr[i7 + 1] == charSequence.charAt(i6 + 1)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static String n0(Iterator<?> it2, char c5) {
        if (it2 == null) {
            return null;
        }
        if (it2.hasNext()) {
            Object next = it2.next();
            if (!it2.hasNext()) {
                return ObjectUtils.r(next);
            }
            StringBuilder sb = new StringBuilder(256);
            if (next != null) {
                sb.append(next);
            }
            while (it2.hasNext()) {
                sb.append(c5);
                Object next2 = it2.next();
                if (next2 != null) {
                    sb.append(next2);
                }
            }
            return sb.toString();
        }
        return "";
    }

    public static String[] n1(String str) {
        return q1(str, null, -1);
    }

    public static boolean o(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            int length = charSequence2.length();
            int length2 = charSequence.length() - length;
            for (int i4 = 0; i4 <= length2; i4++) {
                if (b.e(charSequence, true, i4, charSequence2, 0, length)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String o0(Iterator<?> it2, String str) {
        if (it2 == null) {
            return null;
        }
        if (it2.hasNext()) {
            Object next = it2.next();
            if (!it2.hasNext()) {
                return ObjectUtils.r(next);
            }
            StringBuilder sb = new StringBuilder(256);
            if (next != null) {
                sb.append(next);
            }
            while (it2.hasNext()) {
                if (str != null) {
                    sb.append(str);
                }
                Object next2 = it2.next();
                if (next2 != null) {
                    sb.append(next2);
                }
            }
            return sb.toString();
        }
        return "";
    }

    public static String[] o1(String str, char c5) {
        return D1(str, c5, false);
    }

    public static boolean p(CharSequence charSequence, String str) {
        if (charSequence == null || str == null) {
            return true;
        }
        return q(charSequence, str.toCharArray());
    }

    public static <T> String p0(T... tArr) {
        return s0(tArr, null);
    }

    public static String[] p1(String str, String str2) {
        return E1(str, str2, -1, false);
    }

    public static boolean q(CharSequence charSequence, char... cArr) {
        if (charSequence != null && cArr != null) {
            int length = charSequence.length();
            int i4 = length - 1;
            int length2 = cArr.length;
            int i5 = length2 - 1;
            for (int i6 = 0; i6 < length; i6++) {
                char charAt = charSequence.charAt(i6);
                for (int i7 = 0; i7 < length2; i7++) {
                    if (cArr[i7] == charAt) {
                        if (!Character.isHighSurrogate(charAt) || i7 == i5) {
                            return false;
                        }
                        if (i6 < i4 && cArr[i7 + 1] == charSequence.charAt(i6 + 1)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static String q0(Object[] objArr, char c5) {
        if (objArr == null) {
            return null;
        }
        return r0(objArr, c5, 0, objArr.length);
    }

    public static String[] q1(String str, String str2, int i4) {
        return E1(str, str2, i4, false);
    }

    public static boolean r(CharSequence charSequence, String str) {
        if (charSequence == null || str == null) {
            return false;
        }
        return s(charSequence, str.toCharArray());
    }

    public static String r0(Object[] objArr, char c5, int i4, int i5) {
        if (objArr == null) {
            return null;
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i6 * 16);
        for (int i7 = i4; i7 < i5; i7++) {
            if (i7 > i4) {
                sb.append(c5);
            }
            if (objArr[i7] != null) {
                sb.append(objArr[i7]);
            }
        }
        return sb.toString();
    }

    public static String[] r1(String str) {
        return s1(str, false);
    }

    public static boolean s(CharSequence charSequence, char... cArr) {
        if (cArr == null || charSequence == null) {
            return false;
        }
        if (charSequence.length() == 0) {
            return true;
        }
        return cArr.length != 0 && S(charSequence, cArr) == -1;
    }

    public static String s0(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        return t0(objArr, str, 0, objArr.length);
    }

    private static String[] s1(String str, boolean z4) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return external.org.apache.commons.lang3.a.f68835c;
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int type = Character.getType(charArray[0]);
        for (int i5 = 1; i5 < charArray.length; i5++) {
            int type2 = Character.getType(charArray[i5]);
            if (type2 != type) {
                if (z4 && type2 == 2 && type == 1) {
                    int i6 = i5 - 1;
                    if (i6 != i4) {
                        arrayList.add(new String(charArray, i4, i6 - i4));
                        i4 = i6;
                    }
                } else {
                    arrayList.add(new String(charArray, i4, i5 - i4));
                    i4 = i5;
                }
                type = type2;
            }
        }
        arrayList.add(new String(charArray, i4, charArray.length - i4));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean t(CharSequence charSequence) {
        if (f0(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (Character.isWhitespace(charSequence.charAt(i4))) {
                return true;
            }
        }
        return false;
    }

    public static String t0(Object[] objArr, String str, int i4, int i5) {
        if (objArr == null) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i6 * 16);
        for (int i7 = i4; i7 < i5; i7++) {
            if (i7 > i4) {
                sb.append(str);
            }
            if (objArr[i7] != null) {
                sb.append(objArr[i7]);
            }
        }
        return sb.toString();
    }

    public static String[] t1(String str) {
        return s1(str, true);
    }

    public static int u(CharSequence charSequence, CharSequence charSequence2) {
        int i4 = 0;
        if (f0(charSequence) || f0(charSequence2)) {
            return 0;
        }
        int i5 = 0;
        while (true) {
            int b5 = b.b(charSequence, charSequence2, i4);
            if (b5 == -1) {
                return i5;
            }
            i5++;
            i4 = b5 + charSequence2.length();
        }
    }

    public static int u0(CharSequence charSequence, int i4) {
        if (f0(charSequence)) {
            return -1;
        }
        return b.c(charSequence, i4, charSequence.length());
    }

    public static String[] u1(String str, String str2) {
        return y1(str, str2, -1, false);
    }

    public static <T extends CharSequence> T v(T t4, T t5) {
        return e0(t4) ? t5 : t4;
    }

    public static int v0(CharSequence charSequence, int i4, int i5) {
        if (f0(charSequence)) {
            return -1;
        }
        return b.c(charSequence, i4, i5);
    }

    public static String[] v1(String str, String str2, int i4) {
        return y1(str, str2, i4, false);
    }

    public static <T extends CharSequence> T w(T t4, T t5) {
        return f0(t4) ? t5 : t4;
    }

    public static int w0(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return b.d(charSequence, charSequence2, charSequence.length());
    }

    public static String[] w1(String str, String str2) {
        return y1(str, str2, -1, true);
    }

    public static String x(String str) {
        return str == null ? "" : str;
    }

    public static int x0(CharSequence charSequence, CharSequence charSequence2, int i4) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return b.d(charSequence, charSequence2, i4);
    }

    public static String[] x1(String str, String str2, int i4) {
        return y1(str, str2, i4, true);
    }

    public static String y(String str, String str2) {
        return str == null ? str2 : str;
    }

    public static int y0(CharSequence charSequence, CharSequence... charSequenceArr) {
        int d5;
        int i4 = -1;
        if (charSequence != null && charSequenceArr != null) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (charSequence2 != null && (d5 = b.d(charSequence, charSequence2, charSequence.length())) > i4) {
                    i4 = d5;
                }
            }
        }
        return i4;
    }

    private static String[] y1(String str, String str2, int i4, boolean z4) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return external.org.apache.commons.lang3.a.f68835c;
        }
        if (str2 != null && !"".equals(str2)) {
            int length2 = str2.length();
            ArrayList arrayList = new ArrayList();
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i5 < length) {
                i5 = str.indexOf(str2, i6);
                if (i5 > -1) {
                    if (i5 > i6) {
                        i7++;
                        if (i7 == i4) {
                            arrayList.add(str.substring(i6));
                        } else {
                            arrayList.add(str.substring(i6, i5));
                        }
                    } else if (z4) {
                        i7++;
                        if (i7 == i4) {
                            arrayList.add(str.substring(i6));
                            i5 = length;
                        } else {
                            arrayList.add("");
                        }
                    }
                    i6 = i5 + length2;
                } else {
                    arrayList.add(str.substring(i6));
                }
                i5 = length;
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return E1(str, null, i4, z4);
    }

    public static String z(String str) {
        if (f0(str)) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            if (!Character.isWhitespace(str.charAt(i5))) {
                cArr[i4] = str.charAt(i5);
                i4++;
            }
        }
        return i4 == length ? str : new String(cArr, 0, i4);
    }

    public static int z0(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return A0(charSequence, charSequence2, charSequence.length());
    }

    public static String[] z1(String str) {
        return E1(str, null, -1, true);
    }
}
