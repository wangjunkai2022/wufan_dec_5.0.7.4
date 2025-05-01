package com.kwai.library.ipneigh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.regex.Pattern;
/* loaded from: classes5.dex */
final class b {
    private static final Pattern aVE = Pattern.compile("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$");

    @SuppressLint({"DefaultLocale"})
    public static String ev(int i4) {
        return String.format("%d.%d.%d.%d", Integer.valueOf(i4 & 255), Integer.valueOf((i4 >> 8) & 255), Integer.valueOf((i4 >> 16) & 255), Integer.valueOf((i4 >> 24) & 255));
    }

    public static String hA(String str) {
        if (str == null) {
            return "";
        }
        String[] split = str.split("\\s+");
        return (split.length >= 5 && hz(split[4])) ? split[4] : "";
    }

    private static boolean hz(String str) {
        if (str == null) {
            return false;
        }
        return aVE.matcher(str).matches();
    }

    public static boolean isWifiConnected(Context context) {
        try {
            NetworkInfo networkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getNetworkInfo(1);
            if (networkInfo != null) {
                if (networkInfo.isConnected()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
