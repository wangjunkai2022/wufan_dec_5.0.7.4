package com.ta.utdid2.android.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.join.mgps.Util.h0;
/* loaded from: classes5.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final String f62054a = "Wi-Fi";

    /* renamed from: b  reason: collision with root package name */
    public static final String f62055b = "00-00-00-00-00-00";

    /* renamed from: c  reason: collision with root package name */
    private static final String f62056c = "NetworkUtils";

    /* renamed from: d  reason: collision with root package name */
    private static ConnectivityManager f62057d;

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f62058e = {4, 7, 2, 1};

    private static String a(int i4) {
        return (i4 & 255) + h0.f27805a + ((i4 >> 8) & 255) + h0.f27805a + ((i4 >> 16) & 255) + h0.f27805a + ((i4 >> 24) & 255);
    }

    public static ConnectivityManager b(Context context) {
        if (context == null) {
            return null;
        }
        if (f62057d == null) {
            f62057d = (ConnectivityManager) context.getSystemService("connectivity");
        }
        return f62057d;
    }

    public static String[] c(Context context) {
        String[] strArr = {"Unknown", "Unknown"};
        if (context.getPackageManager().checkPermission(com.kuaishou.weapon.p0.g.f55582b, context.getPackageName()) != 0) {
            strArr[0] = "Unknown";
            return strArr;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            strArr[0] = "Unknown";
            return strArr;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo != null && networkInfo.getState() == NetworkInfo.State.CONNECTED) {
            strArr[0] = "Wi-Fi";
            return strArr;
        }
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
        if (networkInfo2 != null && networkInfo2.getState() == NetworkInfo.State.CONNECTED) {
            strArr[0] = "2G/3G";
            strArr[1] = networkInfo2.getSubtypeName();
        }
        return strArr;
    }

    public static String d(Context context) {
        WifiInfo connectionInfo;
        if (context == null || (connectionInfo = ((WifiManager) context.getSystemService(NetworkUtil.NETWORK_TYPE_WIFI)).getConnectionInfo()) == null) {
            return f62055b;
        }
        String macAddress = connectionInfo.getMacAddress();
        return i.c(macAddress) ? f62055b : macAddress;
    }

    public static String e(Context context) {
        if (context != null) {
            try {
                WifiInfo connectionInfo = ((WifiManager) context.getSystemService(NetworkUtil.NETWORK_TYPE_WIFI)).getConnectionInfo();
                if (connectionInfo != null) {
                    return a(connectionInfo.getIpAddress());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static boolean f(Context context) {
        ConnectivityManager b5 = b(context);
        if (b5 != null) {
            try {
                NetworkInfo activeNetworkInfo = b5.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.isConnected();
                }
                return false;
            } catch (Exception e5) {
                e5.toString();
                return false;
            }
        }
        return false;
    }

    public static boolean g(Context context) {
        ConnectivityManager b5 = b(context);
        if (b5 != null) {
            try {
                NetworkInfo activeNetworkInfo = b5.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    int subtype = activeNetworkInfo.getSubtype();
                    if (d.f62050b) {
                        StringBuilder sb = new StringBuilder("subType:");
                        sb.append(subtype);
                        sb.append(": name:");
                        sb.append(activeNetworkInfo.getSubtypeName());
                    }
                    for (int i4 : f62058e) {
                        if (i4 == subtype) {
                            return true;
                        }
                    }
                }
            } catch (Exception e5) {
                e5.toString();
            }
        }
        return false;
    }

    public static boolean h(Context context) {
        if (context != null) {
            try {
                if (c(context)[0].equals("Wi-Fi")) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
