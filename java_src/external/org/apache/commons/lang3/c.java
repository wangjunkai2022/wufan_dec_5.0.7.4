package external.org.apache.commons.lang3;
/* compiled from: CharUtils.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f68894a = new String[128];

    /* renamed from: b  reason: collision with root package name */
    public static final char f68895b = '\n';

    /* renamed from: c  reason: collision with root package name */
    public static final char f68896c = '\r';

    static {
        char c5 = 0;
        while (true) {
            String[] strArr = f68894a;
            if (c5 >= strArr.length) {
                return;
            }
            strArr[c5] = String.valueOf(c5);
            c5 = (char) (c5 + 1);
        }
    }

    public static boolean a(char c5) {
        return c5 < 128;
    }

    public static boolean b(char c5) {
        return (c5 >= 'A' && c5 <= 'Z') || (c5 >= 'a' && c5 <= 'z');
    }

    public static boolean c(char c5) {
        return c5 >= 'a' && c5 <= 'z';
    }

    public static boolean d(char c5) {
        return c5 >= 'A' && c5 <= 'Z';
    }

    public static boolean e(char c5) {
        return (c5 >= 'A' && c5 <= 'Z') || (c5 >= 'a' && c5 <= 'z') || (c5 >= '0' && c5 <= '9');
    }

    public static boolean f(char c5) {
        return c5 < ' ' || c5 == 127;
    }

    public static boolean g(char c5) {
        return c5 >= '0' && c5 <= '9';
    }

    public static boolean h(char c5) {
        return c5 >= ' ' && c5 < 127;
    }

    public static char i(Character ch) {
        if (ch != null) {
            return ch.charValue();
        }
        throw new IllegalArgumentException("The Character must not be null");
    }

    public static char j(Character ch, char c5) {
        return ch == null ? c5 : ch.charValue();
    }

    public static char k(String str) {
        if (!e.f0(str)) {
            return str.charAt(0);
        }
        throw new IllegalArgumentException("The String must not be empty");
    }

    public static char l(String str, char c5) {
        return e.f0(str) ? c5 : str.charAt(0);
    }

    @Deprecated
    public static Character m(char c5) {
        return Character.valueOf(c5);
    }

    public static Character n(String str) {
        if (e.f0(str)) {
            return null;
        }
        return Character.valueOf(str.charAt(0));
    }

    public static int o(char c5) {
        if (g(c5)) {
            return c5 - '0';
        }
        throw new IllegalArgumentException("The character " + c5 + " is not in the range '0' - '9'");
    }

    public static int p(char c5, int i4) {
        return !g(c5) ? i4 : c5 - '0';
    }

    public static int q(Character ch) {
        if (ch != null) {
            return o(ch.charValue());
        }
        throw new IllegalArgumentException("The character must not be null");
    }

    public static int r(Character ch, int i4) {
        return ch == null ? i4 : p(ch.charValue(), i4);
    }

    public static String s(char c5) {
        if (c5 < 128) {
            return f68894a[c5];
        }
        return new String(new char[]{c5});
    }

    public static String t(Character ch) {
        if (ch == null) {
            return null;
        }
        return s(ch.charValue());
    }

    public static String u(char c5) {
        if (c5 < 16) {
            return "\\u000" + Integer.toHexString(c5);
        } else if (c5 < 256) {
            return "\\u00" + Integer.toHexString(c5);
        } else if (c5 < 4096) {
            return "\\u0" + Integer.toHexString(c5);
        } else {
            return "\\u" + Integer.toHexString(c5);
        }
    }

    public static String v(Character ch) {
        if (ch == null) {
            return null;
        }
        return u(ch.charValue());
    }
}
