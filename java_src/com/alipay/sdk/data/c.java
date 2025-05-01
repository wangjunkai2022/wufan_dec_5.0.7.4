package com.alipay.sdk.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.TextView;
import com.alipay.sdk.util.j;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.qq.e.comm.constants.ErrorCode;
import java.util.HashMap;
import java.util.Random;
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    private static final String f4865d = "virtualImeiAndImsi";

    /* renamed from: e  reason: collision with root package name */
    private static final String f4866e = "virtual_imei";

    /* renamed from: f  reason: collision with root package name */
    private static final String f4867f = "virtual_imsi";

    /* renamed from: g  reason: collision with root package name */
    private static c f4868g;

    /* renamed from: a  reason: collision with root package name */
    public String f4869a;

    /* renamed from: b  reason: collision with root package name */
    public String f4870b = "sdk-and-lite";

    /* renamed from: c  reason: collision with root package name */
    public String f4871c;

    private c() {
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            if (f4868g == null) {
                f4868g = new c();
            }
            cVar = f4868g;
        }
        return cVar;
    }

    private static String b(Context context) {
        return Float.toString(new TextView(context).getTextSize());
    }

    public static String c(Context context, HashMap<String, String> hashMap) {
        try {
            return k.a.a(context, hashMap);
        } catch (Throwable unused) {
            return "";
        }
    }

    private String d(n.b bVar) {
        String b5;
        Context context = m.b.b().f71504a;
        com.alipay.sdk.util.b a5 = com.alipay.sdk.util.b.a(context);
        if (TextUtils.isEmpty(this.f4869a)) {
            String d5 = j.d();
            String k4 = j.k();
            String q4 = j.q(context);
            String str = com.alipay.sdk.cons.a.f4812a;
            String substring = str.substring(0, str.indexOf("://"));
            String s4 = j.s(context);
            String f5 = Float.toString(new TextView(context).getTextSize());
            this.f4869a = "Msp/15.0.8 (" + d5 + ";" + k4 + ";" + q4 + ";" + substring + ";" + s4 + ";" + f5;
        }
        String a6 = com.alipay.sdk.util.b.d(context).a();
        String b6 = a5.b();
        String e5 = a5.e();
        Context context2 = m.b.b().f71504a;
        SharedPreferences sharedPreferences = context2.getSharedPreferences(f4865d, 0);
        String string = sharedPreferences.getString(f4867f, null);
        if (TextUtils.isEmpty(string)) {
            if (TextUtils.isEmpty(n.b.a().f71677a)) {
                String e6 = m.b.b().e();
                b5 = TextUtils.isEmpty(e6) ? f() : e6.substring(3, 18);
            } else {
                b5 = com.alipay.sdk.util.b.a(context2).b();
            }
            string = b5;
            sharedPreferences.edit().putString(f4867f, string).commit();
        }
        Context context3 = m.b.b().f71504a;
        SharedPreferences sharedPreferences2 = context3.getSharedPreferences(f4865d, 0);
        String string2 = sharedPreferences2.getString(f4866e, null);
        if (TextUtils.isEmpty(string2)) {
            string2 = TextUtils.isEmpty(n.b.a().f71677a) ? f() : com.alipay.sdk.util.b.a(context3).e();
            sharedPreferences2.edit().putString(f4866e, string2).commit();
        }
        if (bVar != null) {
            this.f4871c = bVar.f71678b;
        }
        String replace = Build.MANUFACTURER.replace(";", " ");
        String replace2 = Build.MODEL.replace(";", " ");
        boolean d6 = m.b.d();
        String g4 = a5.g();
        WifiInfo connectionInfo = ((WifiManager) context.getSystemService(NetworkUtil.NETWORK_TYPE_WIFI)).getConnectionInfo();
        String ssid = connectionInfo != null ? connectionInfo.getSSID() : "-1";
        WifiInfo connectionInfo2 = ((WifiManager) context.getSystemService(NetworkUtil.NETWORK_TYPE_WIFI)).getConnectionInfo();
        String bssid = connectionInfo2 != null ? connectionInfo2.getBSSID() : "00";
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4869a);
        sb.append(";");
        sb.append(a6);
        sb.append(";");
        sb.append("-1;-1");
        sb.append(";");
        sb.append("1");
        sb.append(";");
        sb.append(b6);
        sb.append(";");
        sb.append(e5);
        sb.append(";");
        sb.append(this.f4871c);
        sb.append(";");
        sb.append(replace);
        sb.append(";");
        sb.append(replace2);
        sb.append(";");
        sb.append(d6);
        sb.append(";");
        sb.append(g4);
        sb.append(";-1;-1;");
        sb.append(this.f4870b);
        sb.append(";");
        sb.append(string);
        sb.append(";");
        sb.append(string2);
        sb.append(";");
        sb.append(ssid);
        sb.append(";");
        sb.append(bssid);
        if (bVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(com.alipay.sdk.cons.b.f4830c, bVar.f71677a);
            hashMap.put(com.alipay.sdk.cons.b.f4834g, m.b.b().e());
            String c5 = c(context, hashMap);
            if (!TextUtils.isEmpty(c5)) {
                sb.append(";");
                sb.append(c5);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public static String f() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        Random random = new Random();
        return hexString + (random.nextInt(ErrorCode.PrivateError.LOAD_TIME_OUT) + 1000);
    }

    private static String g(Context context) {
        WifiInfo connectionInfo = ((WifiManager) context.getSystemService(NetworkUtil.NETWORK_TYPE_WIFI)).getConnectionInfo();
        return connectionInfo != null ? connectionInfo.getSSID() : "-1";
    }

    private String h() {
        return this.f4871c;
    }

    private static String i(Context context) {
        WifiInfo connectionInfo = ((WifiManager) context.getSystemService(NetworkUtil.NETWORK_TYPE_WIFI)).getConnectionInfo();
        return connectionInfo != null ? connectionInfo.getBSSID() : "00";
    }

    private static String j() {
        return "1";
    }

    private static String k() {
        return "-1;-1";
    }

    private static String l() {
        String e5;
        Context context = m.b.b().f71504a;
        SharedPreferences sharedPreferences = context.getSharedPreferences(f4865d, 0);
        String string = sharedPreferences.getString(f4866e, null);
        if (TextUtils.isEmpty(string)) {
            if (TextUtils.isEmpty(n.b.a().f71677a)) {
                e5 = f();
            } else {
                e5 = com.alipay.sdk.util.b.a(context).e();
            }
            String str = e5;
            sharedPreferences.edit().putString(f4866e, str).commit();
            return str;
        }
        return string;
    }

    private static String m() {
        String b5;
        Context context = m.b.b().f71504a;
        SharedPreferences sharedPreferences = context.getSharedPreferences(f4865d, 0);
        String string = sharedPreferences.getString(f4867f, null);
        if (TextUtils.isEmpty(string)) {
            if (TextUtils.isEmpty(n.b.a().f71677a)) {
                String e5 = m.b.b().e();
                if (TextUtils.isEmpty(e5)) {
                    b5 = f();
                } else {
                    b5 = e5.substring(3, 18);
                }
            } else {
                b5 = com.alipay.sdk.util.b.a(context).b();
            }
            String str = b5;
            sharedPreferences.edit().putString(f4867f, str).commit();
            return str;
        }
        return string;
    }

    public final synchronized void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        PreferenceManager.getDefaultSharedPreferences(m.b.b().f71504a).edit().putString(com.alipay.sdk.cons.b.f4836i, str).commit();
        com.alipay.sdk.cons.a.f4813b = str;
    }
}
