package com.kwad.sdk.utils;

import java.util.Formatter;
import java.util.Locale;
/* loaded from: classes5.dex */
public final class bm {
    public static String ai(long j4) {
        if (j4 <= 0 || j4 >= 86400000) {
            return "00:00";
        }
        try {
            long j5 = j4 / 1000;
            long j6 = j5 % 60;
            long j7 = (j5 / 60) % 60;
            long j8 = j5 / 3600;
            Formatter formatter = new Formatter(new StringBuilder(), Locale.getDefault());
            return j8 > 0 ? formatter.format("%d:%02d:%02d", Long.valueOf(j8), Long.valueOf(j7), Long.valueOf(j6)).toString() : formatter.format("%02d:%02d", Long.valueOf(j7), Long.valueOf(j6)).toString();
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.printStackTrace(e5);
            return "";
        }
    }
}
