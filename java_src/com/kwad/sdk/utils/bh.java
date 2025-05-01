package com.kwad.sdk.utils;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;
/* loaded from: classes5.dex */
public final class bh {
    private static final SimpleDateFormat aRi;
    private static final SimpleDateFormat aRj;
    private static final SimpleDateFormat aRk;
    private static final SimpleDateFormat aRl;
    private static final SimpleDateFormat aRm;
    private static final SimpleDateFormat aRn;
    private static final SimpleDateFormat aRo;

    static {
        Locale locale = Locale.US;
        aRi = new SimpleDateFormat("MM/dd", locale);
        aRj = new SimpleDateFormat("yyyy/MM/dd", locale);
        aRk = new SimpleDateFormat("MM月dd日", locale);
        aRl = new SimpleDateFormat("yyyy年MM月dd日", locale);
        aRm = new SimpleDateFormat("HH:mm", locale);
        aRn = new SimpleDateFormat("MM-dd", locale);
        aRo = new SimpleDateFormat("yyyy-MM-dd", locale);
    }

    public static boolean gZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches(".*\\.kpg.*");
    }

    public static boolean isEquals(String str, String str2) {
        return !TextUtils.isEmpty(str) && str.equals(str2);
    }

    public static boolean isNullString(String str) {
        return TextUtils.isEmpty(str) || "null".equalsIgnoreCase(str);
    }
}
