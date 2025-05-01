package com.kwad.sdk.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.ServiceState;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.net.InetAddress;
/* loaded from: classes5.dex */
public final class ah {
    private static int aQA;
    private static boolean aQB;

    @Nullable
    @SuppressLint({"MissingPermission"})
    public static NetworkInfo cw(Context context) {
        ConnectivityManager connectivityManager;
        if (SystemUtil.b(context, com.kuaishou.weapon.p0.g.f55582b) && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (Exception e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static int cx(Context context) {
        if (context != null && SystemUtil.b(context, com.kuaishou.weapon.p0.g.f55582b) && SystemUtil.b(context, com.kuaishou.weapon.p0.g.f55583c)) {
            try {
                NetworkInfo cw = cw(context);
                if (!(cw != null && cw.isConnected())) {
                    return 0;
                }
                if (1 == cw.getType()) {
                    return 100;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
                if (telephonyManager != null) {
                    int n4 = n(context, telephonyManager.getNetworkType());
                    if (n4 != 20) {
                        switch (n4) {
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
                                return 3;
                            case 13:
                                return 4;
                            default:
                                return 0;
                        }
                    }
                    return 5;
                }
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static int d(Context context, String str, boolean z4) {
        if (context != null && aQA <= 0 && !aQB) {
            try {
                if (!z4) {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
                    if (Build.VERSION.SDK_INT >= 22) {
                        String simOperator = telephonyManager.getSimOperator();
                        char c5 = 65535;
                        int hashCode = simOperator.hashCode();
                        if (hashCode != 49679502) {
                            switch (hashCode) {
                                case 49679470:
                                    if (simOperator.equals("46000")) {
                                        c5 = 0;
                                        break;
                                    }
                                    break;
                                case 49679471:
                                    if (simOperator.equals("46001")) {
                                        c5 = 4;
                                        break;
                                    }
                                    break;
                                case 49679472:
                                    if (simOperator.equals("46002")) {
                                        c5 = 1;
                                        break;
                                    }
                                    break;
                                case 49679473:
                                    if (simOperator.equals("46003")) {
                                        c5 = 7;
                                        break;
                                    }
                                    break;
                                default:
                                    switch (hashCode) {
                                        case 49679475:
                                            if (simOperator.equals("46005")) {
                                                c5 = '\b';
                                                break;
                                            }
                                            break;
                                        case 49679476:
                                            if (simOperator.equals("46006")) {
                                                c5 = 5;
                                                break;
                                            }
                                            break;
                                        case 49679477:
                                            if (simOperator.equals("46007")) {
                                                c5 = 2;
                                                break;
                                            }
                                            break;
                                        case 49679478:
                                            if (simOperator.equals("46008")) {
                                                c5 = 3;
                                                break;
                                            }
                                            break;
                                        case 49679479:
                                            if (simOperator.equals("46009")) {
                                                c5 = 6;
                                                break;
                                            }
                                            break;
                                    }
                            }
                        } else if (simOperator.equals("46011")) {
                            c5 = '\t';
                        }
                        switch (c5) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                                aQA = 1;
                                break;
                            case 4:
                            case 5:
                            case 6:
                                aQA = 3;
                                break;
                            case 7:
                            case '\b':
                            case '\t':
                                aQA = 2;
                                break;
                            default:
                                aQA = 0;
                                break;
                        }
                    }
                } else {
                    aQA = 0;
                }
                if (aQA == 0 && !TextUtils.isEmpty(str)) {
                    if (!str.startsWith("46000") && !str.startsWith("46002")) {
                        if (str.startsWith("46001")) {
                            aQA = 3;
                        } else if (str.startsWith("46003")) {
                            aQA = 2;
                        }
                    }
                    aQA = 1;
                }
            } catch (Exception e5) {
                com.kwad.sdk.core.e.c.printStackTraceOnly(e5);
            }
            int i4 = aQA;
            aQB = i4 == 0;
            return i4;
        }
        return aQA;
    }

    private static boolean gM(@NonNull String str) {
        return str.contains("nrState=NOT_RESTRICTED") || str.contains("nrState=CONNECTED");
    }

    @WorkerThread
    public static boolean gN(String str) {
        return s(str, 3000);
    }

    public static int getActiveNetworkType(Context context) {
        try {
            NetworkInfo cw = cw(context);
            if (cw == null) {
                return -1;
            }
            return cw.getType();
        } catch (Exception unused) {
            return -1;
        }
    }

    private static int getSubId() {
        if (Build.VERSION.SDK_INT >= 24) {
            return SubscriptionManager.getDefaultDataSubscriptionId();
        }
        return -1;
    }

    public static boolean isMobileConnected(Context context) {
        try {
            NetworkInfo cw = cw(context);
            if (cw != null && cw.isConnected()) {
                if (cw.getType() == 0) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean isNetworkConnected(Context context) {
        try {
            NetworkInfo cw = cw(context);
            if (cw != null) {
                if (cw.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static boolean isWifiConnected(Context context) {
        try {
            NetworkInfo cw = cw(context);
            if (cw != null && cw.isConnected()) {
                return 1 == cw.getType();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return false;
    }

    @SuppressLint({"MissingPermission"})
    private static int n(Context context, int i4) {
        ServiceState serviceState;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 26 || !SystemUtil.b(context, com.kuaishou.weapon.p0.g.f55582b)) {
            return i4;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return i4;
            }
            int subId = getSubId();
            if (subId == -1) {
                serviceState = telephonyManager.getServiceState();
            } else {
                serviceState = (context.getApplicationInfo().targetSdkVersion < 29 || i5 < 29) ? (ServiceState) s.callMethod(telephonyManager, "getServiceStateForSubscriber", Integer.valueOf(subId)) : telephonyManager.getServiceState();
            }
            if (serviceState == null) {
                return i4;
            }
            if (au.MP()) {
                Integer num = (Integer) s.a("com.huawei.android.telephony.ServiceStateEx", "getConfigRadioTechnology", serviceState);
                return num != null ? num.intValue() : i4;
            } else if (gM(serviceState.toString())) {
                return 20;
            } else {
                return i4;
            }
        } catch (Exception unused) {
            return i4;
        }
    }

    @WorkerThread
    private static boolean s(String str, int i4) {
        try {
            return InetAddress.getByName(str).isReachable(3000);
        } catch (Throwable unused) {
            return false;
        }
    }
}
