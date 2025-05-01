package com.kwad.sdk.api.loader;

import android.content.Context;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class h {
    static String anF = "autoRevert";

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean K(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return false;
        }
        if (TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            String[] split = str.split("\\.");
            String[] split2 = str2.split("\\.");
            for (int i4 = 0; i4 < split.length && i4 < split2.length; i4++) {
                try {
                    int parseInt = Integer.parseInt(split[i4]) - Integer.parseInt(split2[i4]);
                    if (parseInt > 0) {
                        return true;
                    }
                    if (parseInt < 0) {
                        return false;
                    }
                } catch (NumberFormatException unused) {
                    return false;
                }
            }
            return split.length > split2.length;
        }
        return true;
    }

    public static String aM(Context context) {
        return getVersion(context, "curversion");
    }

    public static String aN(Context context) {
        return getVersion(context, "newversion");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String aO(Context context) {
        return getVersion(context, "apiversion");
    }

    private static void d(Context context, String str, String str2) {
        b.c(context, str, str2);
    }

    private static String getVersion(Context context, String str) {
        return b.b(context, str, "");
    }

    public static void o(Context context, String str) {
        d(context, "curversion", str);
    }

    public static void p(Context context, String str) {
        d(context, "newversion", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void q(Context context, String str) {
        d(context, "apiversion", str);
    }
}
