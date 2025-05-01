package org.jboss.netty.util.internal;

import com.tencent.bugly.Bugly;
import java.util.Objects;
import java.util.regex.Pattern;
/* compiled from: SystemPropertyUtil.java */
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f72835a;

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f72836b = Pattern.compile("-?[0-9]+");

    private j() {
    }

    public static boolean a(String str) {
        return b(str) != null;
    }

    public static String b(String str) {
        return c(str, null);
    }

    public static String c(String str, String str2) {
        Objects.requireNonNull(str, "key");
        if (str.length() != 0) {
            String str3 = null;
            try {
                str3 = System.getProperty(str);
            } catch (Exception e5) {
                if (!f72835a) {
                    h("Unable to retrieve a system property '" + str + "'; default values will be used.", e5);
                    f72835a = true;
                }
            }
            return str3 == null ? str2 : str3;
        }
        throw new IllegalArgumentException("key must not be empty.");
    }

    public static boolean d(String str, boolean z4) {
        String b5 = b(str);
        if (b5 == null) {
            return z4;
        }
        String lowerCase = b5.trim().toLowerCase();
        if (lowerCase.length() == 0 || "true".equals(lowerCase) || "yes".equals(lowerCase) || "1".equals(lowerCase)) {
            return true;
        }
        if (Bugly.SDK_IS_DEV.equals(lowerCase) || "no".equals(lowerCase) || "0".equals(lowerCase)) {
            return false;
        }
        g("Unable to parse the boolean system property '" + str + "':" + lowerCase + " - using the default value: " + z4);
        return z4;
    }

    public static int e(String str, int i4) {
        String b5 = b(str);
        if (b5 == null) {
            return i4;
        }
        String lowerCase = b5.trim().toLowerCase();
        if (f72836b.matcher(lowerCase).matches()) {
            try {
                return Integer.parseInt(lowerCase);
            } catch (Exception unused) {
            }
        }
        g("Unable to parse the integer system property '" + str + "':" + lowerCase + " - using the default value: " + i4);
        return i4;
    }

    public static long f(String str, long j4) {
        String b5 = b(str);
        if (b5 == null) {
            return j4;
        }
        String lowerCase = b5.trim().toLowerCase();
        if (f72836b.matcher(lowerCase).matches()) {
            try {
                return Long.parseLong(lowerCase);
            } catch (Exception unused) {
            }
        }
        g("Unable to parse the long integer system property '" + str + "':" + lowerCase + " - using the default value: " + j4);
        return j4;
    }

    private static void g(String str) {
    }

    private static void h(String str, Exception exc) {
    }
}
