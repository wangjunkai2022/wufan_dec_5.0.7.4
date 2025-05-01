package com.kwad.components.core.s;

import java.util.Locale;
/* loaded from: classes5.dex */
public final class e {
    public static String a(long j4, boolean z4) {
        double d5;
        String[] strArr = {" B", " KB", " MB", " GB", " TB", " PB", " EB", " ZB", " YB"};
        if (j4 <= 1) {
            return j4 + "B";
        }
        double d6 = j4;
        int log = (int) (Math.log(d6) / Math.log(1024.0d));
        if (j4 > 1024) {
            double pow = Math.pow(1024.0d, log);
            Double.isNaN(d6);
            d5 = d6 / pow;
        } else {
            Double.isNaN(d6);
            d5 = d6 / 1024.0d;
        }
        return String.format(Locale.ENGLISH, "%.1f%s", Double.valueOf(d5), strArr[log]);
    }
}
