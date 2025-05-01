package com.papa.gsyvideoplayer.utils;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
/* compiled from: NetworkUtils.java */
/* loaded from: classes5.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public static final int f58544a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final int f58545b = 4;

    /* renamed from: c  reason: collision with root package name */
    public static final int f58546c = 3;

    /* renamed from: d  reason: collision with root package name */
    public static final int f58547d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f58548e = 5;

    /* renamed from: f  reason: collision with root package name */
    public static final int f58549f = -1;

    /* renamed from: g  reason: collision with root package name */
    private static final int f58550g = 16;

    /* renamed from: h  reason: collision with root package name */
    private static final int f58551h = 17;

    /* renamed from: i  reason: collision with root package name */
    private static final int f58552i = 18;

    private l() {
    }

    private static NetworkInfo a(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int b(Context context) {
        NetworkInfo a5 = a(context);
        if (a5 == null || !a5.isAvailable()) {
            return -1;
        }
        if (a5.getType() == 1) {
            return 1;
        }
        if (a5.getType() == 0) {
            switch (a5.getSubtype()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    return 2;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    break;
                case 13:
                case 18:
                    return 4;
                default:
                    String subtypeName = a5.getSubtypeName();
                    if (!subtypeName.equalsIgnoreCase("TD-SCDMA") && !subtypeName.equalsIgnoreCase("WCDMA") && !subtypeName.equalsIgnoreCase("CDMA2000")) {
                        return 5;
                    }
                    break;
            }
            return 3;
        }
        return 5;
    }

    public static String c(Context context) {
        int b5 = b(context);
        return b5 != -1 ? b5 != 1 ? b5 != 2 ? b5 != 3 ? b5 != 4 ? "NETWORK_UNKNOWN" : "NETWORK_4G" : "NETWORK_3G" : "NETWORK_2G" : "NETWORK_WIFI" : "NETWORK_NO";
    }

    public static String d(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            return telephonyManager.getNetworkOperatorName();
        }
        return null;
    }

    public static int e(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            return telephonyManager.getPhoneType();
        }
        return -1;
    }

    public static boolean f(Context context) {
        NetworkInfo a5 = a(context);
        return a5 != null && a5.isAvailable() && a5.getSubtype() == 13;
    }

    public static boolean g(Context context) {
        NetworkInfo a5 = a(context);
        return a5 != null && a5.isAvailable();
    }

    public static boolean h(Context context) {
        NetworkInfo a5 = a(context);
        return a5 != null && a5.isConnected();
    }

    public static boolean i(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return connectivityManager != null && connectivityManager.getActiveNetworkInfo().getType() == 1;
    }

    public static void j(Context context) {
        if (Build.VERSION.SDK_INT > 10) {
            context.startActivity(new Intent("android.settings.SETTINGS"));
        } else {
            context.startActivity(new Intent("android.settings.WIRELESS_SETTINGS"));
        }
    }
}
