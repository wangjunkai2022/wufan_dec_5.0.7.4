package com.heepay.plugin.domain;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.heepay.plugin.c.j;
import com.umeng.analytics.pro.bm;
import java.io.File;
import java.io.FileFilter;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class e {

    /* renamed from: c  reason: collision with root package name */
    private static e f14424c;

    /* renamed from: a  reason: collision with root package name */
    private String f14425a;

    /* renamed from: b  reason: collision with root package name */
    private String f14426b;

    private e() {
    }

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            if (f14424c == null) {
                f14424c = new e();
            }
            eVar = f14424c;
        }
        return eVar;
    }

    public String a(Context context) {
        return j.a().a(context);
    }

    public String a(TelephonyManager telephonyManager) {
        return "";
    }

    public int b() {
        if (Build.VERSION.SDK_INT <= 10) {
            return 1;
        }
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new FileFilter() { // from class: com.heepay.plugin.domain.e.1
                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    String name = file.getName();
                    if (name.startsWith(bm.f63462w)) {
                        for (int i4 = 3; i4 < name.length(); i4++) {
                            if (name.charAt(i4) < '0' || name.charAt(i4) > '9') {
                                return false;
                            }
                        }
                        return true;
                    }
                    return false;
                }
            }).length;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    public int b(TelephonyManager telephonyManager) {
        return telephonyManager.getNetworkType();
    }

    public void b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            this.f14425a = a(context);
            this.f14426b = "PhoneNumber=" + a(telephonyManager) + ", DeviceId=" + this.f14425a + ", SimState=" + g(telephonyManager) + ", SimSerialNumber=" + c(telephonyManager) + ", SimOperatorName=" + d(telephonyManager) + ", SimCountryIso=" + e(telephonyManager) + ", PhoneType=" + f(telephonyManager) + ", SubscriberId=" + h(telephonyManager) + ", SystemName=" + d() + ", SystemModel=" + f() + ", SystemVersion=" + e() + ", NetworkType=" + b(telephonyManager) + ", IP=" + g() + ", CoreCount=" + b();
            StringBuilder sb = new StringBuilder();
            sb.append("mClientInfo:");
            sb.append(this.f14426b);
            com.heepay.plugin.c.c.a(sb.toString());
            try {
                this.f14426b = "SDK|" + com.heepay.plugin.a.d.a(this.f14426b, "39EB339F80B715384793F7EF", "ToHex16");
            } catch (Exception unused) {
                this.f14426b = "";
            }
        }
    }

    public String c() {
        return this.f14425a;
    }

    public String c(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("DeviceId", a(context));
                jSONObject.put("PhoneNumber", a(telephonyManager));
                jSONObject.put("SimState", g(telephonyManager));
                jSONObject.put("SimSerialNumber", c(telephonyManager));
                jSONObject.put("SimOperatorName", d(telephonyManager));
                jSONObject.put("SimCountryIso", e(telephonyManager));
                jSONObject.put("PhoneType", f(telephonyManager));
                jSONObject.put("SubscriberId", h(telephonyManager));
                jSONObject.put("SystemName", d());
                jSONObject.put("SystemModel", f());
                jSONObject.put("SystemVersion", e());
                jSONObject.put("NetworkType", b(telephonyManager));
                jSONObject.put("IP", g());
                jSONObject.put("CoreCount", b());
                String a5 = com.heepay.plugin.a.d.a(jSONObject.toString(), "39EB339F80B715384793F7EF", "ToHex16");
                this.f14426b = a5;
                return a5;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return null;
    }

    public String c(TelephonyManager telephonyManager) {
        return "";
    }

    public String d() {
        return Build.BRAND;
    }

    public String d(TelephonyManager telephonyManager) {
        return telephonyManager.getSimOperatorName();
    }

    public String e() {
        return Build.VERSION.RELEASE;
    }

    public String e(TelephonyManager telephonyManager) {
        return telephonyManager.getSimCountryIso();
    }

    public int f(TelephonyManager telephonyManager) {
        return telephonyManager.getPhoneType();
    }

    public String f() {
        return Build.MODEL;
    }

    public int g(TelephonyManager telephonyManager) {
        return telephonyManager.getSimState();
    }

    public String g() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                        return nextElement.getHostAddress().toString();
                    }
                }
            }
            return null;
        } catch (SocketException unused) {
            return null;
        }
    }

    public String h() {
        return this.f14426b;
    }

    public String h(TelephonyManager telephonyManager) {
        return "";
    }
}
