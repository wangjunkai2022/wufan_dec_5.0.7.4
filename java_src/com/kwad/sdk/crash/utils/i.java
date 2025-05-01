package com.kwad.sdk.crash.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes5.dex */
public final class i {
    private static SimpleDateFormat aJh = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String aE(long j4) {
        return j4 <= 0 ? "unknown" : aJh.format(new Date(j4));
    }
}
