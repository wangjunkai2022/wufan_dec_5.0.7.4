package com.kwad.library.solder.lib;
/* loaded from: classes5.dex */
public final class a {
    private static String C(String str, String str2) {
        return "[" + str + "]: " + str2 + " " + xz();
    }

    public static void e(String str, String str2) {
        C(str, str2);
    }

    private static String xz() {
        return "";
    }

    public static void e(String str, Throwable th) {
        C(str, "");
    }

    public static void e(String str, String str2, Throwable th) {
        C(str, str2);
    }
}
