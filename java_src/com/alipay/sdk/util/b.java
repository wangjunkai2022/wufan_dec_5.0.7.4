package com.alipay.sdk.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.efs.sdk.base.core.util.NetworkUtil;
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    private static final String f4927d = "00:00:00:00:00:00";

    /* renamed from: e  reason: collision with root package name */
    private static b f4928e;

    /* renamed from: a  reason: collision with root package name */
    private String f4929a;

    /* renamed from: b  reason: collision with root package name */
    private String f4930b;

    /* renamed from: c  reason: collision with root package name */
    private String f4931c;

    private b(Context context) {
        try {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                f(telephonyManager.getDeviceId());
                String subscriberId = telephonyManager.getSubscriberId();
                if (subscriberId != null) {
                    subscriberId = (subscriberId + "000000000000000").substring(0, 15);
                }
                this.f4929a = subscriberId;
                String macAddress = ((WifiManager) context.getSystemService(NetworkUtil.NETWORK_TYPE_WIFI)).getConnectionInfo().getMacAddress();
                this.f4931c = macAddress;
                if (TextUtils.isEmpty(macAddress)) {
                    this.f4931c = f4927d;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                if (TextUtils.isEmpty(this.f4931c)) {
                    this.f4931c = f4927d;
                }
            }
        } catch (Throwable th) {
            if (TextUtils.isEmpty(this.f4931c)) {
                this.f4931c = f4927d;
            }
            throw th;
        }
    }

    public static b a(Context context) {
        if (f4928e == null) {
            f4928e = new b(context);
        }
        return f4928e;
    }

    private void c(String str) {
        if (str != null) {
            str = (str + "000000000000000").substring(0, 15);
        }
        this.f4929a = str;
    }

    public static d d(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.getType() == 0) {
                return d.a(activeNetworkInfo.getSubtype());
            }
            if (activeNetworkInfo != null && activeNetworkInfo.getType() == 1) {
                return d.WIFI;
            }
            return d.NONE;
        } catch (Exception unused) {
            return d.NONE;
        }
    }

    private void f(String str) {
        if (str != null) {
            byte[] bytes = str.getBytes();
            for (int i4 = 0; i4 < bytes.length; i4++) {
                if (bytes[i4] < 48 || bytes[i4] > 57) {
                    bytes[i4] = 48;
                }
            }
            String str2 = new String(bytes);
            str = (str2 + "000000000000000").substring(0, 15);
        }
        this.f4930b = str;
    }

    public static String h(Context context) {
        String str;
        b a5 = a(context);
        String str2 = a5.e() + "|";
        String b5 = a5.b();
        if (TextUtils.isEmpty(b5)) {
            str = str2 + "000000000000000";
        } else {
            str = str2 + b5;
        }
        return str.substring(0, 8);
    }

    private String i() {
        String str = e() + "|";
        String b5 = b();
        if (TextUtils.isEmpty(b5)) {
            return str + "000000000000000";
        }
        return str + b5;
    }

    public static String j(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getResources().getConfiguration().locale.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public final String b() {
        if (TextUtils.isEmpty(this.f4929a)) {
            this.f4929a = "000000000000000";
        }
        return this.f4929a;
    }

    public final String e() {
        if (TextUtils.isEmpty(this.f4930b)) {
            this.f4930b = "000000000000000";
        }
        return this.f4930b;
    }

    public final String g() {
        return this.f4931c;
    }
}
