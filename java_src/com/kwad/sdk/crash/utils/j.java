package com.kwad.sdk.crash.utils;
/* loaded from: classes5.dex */
public final class j {
    public static String aF(long j4) {
        String valueOf;
        String valueOf2;
        long j5 = j4 / 60000;
        long j6 = (j4 - (60000 * j5)) / 1000;
        if (j5 < 10) {
            valueOf = "0" + j5;
        } else {
            valueOf = String.valueOf(j5);
        }
        if (j6 < 10) {
            valueOf2 = "0" + j6;
        } else {
            valueOf2 = String.valueOf(j6);
        }
        return valueOf + ":" + valueOf2;
    }
}
