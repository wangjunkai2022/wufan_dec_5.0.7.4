package com.alipay.security.mobile.module.deviceinfo;

import android.content.Context;
import android.location.LocationManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.join.mgps.activity.BuildQRCodeActivity_;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private Context f5018a;

    /* renamed from: b  reason: collision with root package name */
    private String f5019b;

    /* renamed from: c  reason: collision with root package name */
    private String f5020c;

    /* renamed from: d  reason: collision with root package name */
    private String f5021d;

    /* renamed from: e  reason: collision with root package name */
    private String f5022e;

    /* renamed from: f  reason: collision with root package name */
    private String f5023f;

    /* renamed from: g  reason: collision with root package name */
    private String f5024g;

    /* renamed from: h  reason: collision with root package name */
    private String f5025h;

    /* renamed from: i  reason: collision with root package name */
    private String f5026i;

    /* renamed from: j  reason: collision with root package name */
    private String f5027j;

    /* renamed from: k  reason: collision with root package name */
    private String f5028k;

    /* renamed from: l  reason: collision with root package name */
    volatile int f5029l = 0;

    private f() {
    }

    private String A() {
        return this.f5028k;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e1 A[Catch: all -> 0x00eb, TRY_LEAVE, TryCatch #8 {all -> 0x00eb, blocks: (B:58:0x00d8, B:61:0x00e1), top: B:110:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f9 A[Catch: Exception -> 0x0195, TryCatch #7 {Exception -> 0x0195, blocks: (B:62:0x00eb, B:64:0x00f9, B:66:0x0116, B:67:0x013b, B:69:0x0143, B:71:0x0149, B:73:0x0151, B:75:0x0159, B:77:0x0161, B:79:0x0174, B:81:0x018b), top: B:108:0x00eb }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0143 A[Catch: Exception -> 0x0195, TryCatch #7 {Exception -> 0x0195, blocks: (B:62:0x00eb, B:64:0x00f9, B:66:0x0116, B:67:0x013b, B:69:0x0143, B:71:0x0149, B:73:0x0151, B:75:0x0159, B:77:0x0161, B:79:0x0174, B:81:0x018b), top: B:108:0x00eb }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c5 A[Catch: Exception -> 0x01f2, TRY_LEAVE, TryCatch #10 {Exception -> 0x01f2, blocks: (B:85:0x0199, B:87:0x01c5), top: B:114:0x0199 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.alipay.security.mobile.module.deviceinfo.f a(android.content.Context r17) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.security.mobile.module.deviceinfo.f.a(android.content.Context):com.alipay.security.mobile.module.deviceinfo.f");
    }

    private void b(int i4) {
        this.f5029l = i4;
    }

    private void c(String str) {
        this.f5019b = str;
    }

    private boolean d() {
        return this.f5029l != 0;
    }

    private double e() {
        return this.f5029l;
    }

    private void f(String str) {
        this.f5020c = str;
    }

    private List<Map<String, String>> g() {
        WifiManager wifiManager;
        List<ScanResult> scanResults;
        ArrayList arrayList = new ArrayList();
        Context context = this.f5018a;
        if (context == null || (wifiManager = (WifiManager) context.getSystemService(NetworkUtil.NETWORK_TYPE_WIFI)) == null || (scanResults = wifiManager.getScanResults()) == null) {
            return arrayList;
        }
        for (ScanResult scanResult : scanResults) {
            HashMap hashMap = new HashMap();
            String str = scanResult.BSSID;
            if (str == null) {
                str = "";
            }
            hashMap.put("wifiMac", str);
            hashMap.put(BuildQRCodeActivity_.E, scanResult.SSID);
            StringBuilder sb = new StringBuilder();
            sb.append(scanResult.level);
            hashMap.put("rssi", sb.toString());
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    private void h(String str) {
        this.f5021d = str;
    }

    private void i(String str) {
        this.f5022e = str;
    }

    private boolean j() {
        LocationManager locationManager;
        Context context = this.f5018a;
        if (context == null || (locationManager = (LocationManager) context.getSystemService("location")) == null) {
            return false;
        }
        return locationManager.isProviderEnabled("gps");
    }

    private void k(String str) {
        this.f5023f = str;
    }

    private boolean l() {
        WifiManager wifiManager;
        WifiInfo connectionInfo;
        WifiManager wifiManager2;
        List<WifiConfiguration> configuredNetworks;
        Context context = this.f5018a;
        if (context == null || (wifiManager = (WifiManager) context.getSystemService(NetworkUtil.NETWORK_TYPE_WIFI)) == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
            return false;
        }
        Context context2 = this.f5018a;
        String ssid = connectionInfo.getSSID();
        WifiConfiguration wifiConfiguration = null;
        if (context2 != null && ssid != null && (wifiManager2 = (WifiManager) context2.getSystemService(NetworkUtil.NETWORK_TYPE_WIFI)) != null && (configuredNetworks = wifiManager2.getConfiguredNetworks()) != null) {
            Iterator<WifiConfiguration> it2 = configuredNetworks.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                WifiConfiguration next = it2.next();
                if (next.SSID.equals(ssid)) {
                    wifiConfiguration = next;
                    break;
                }
            }
        }
        if (wifiConfiguration == null) {
            return false;
        }
        char c5 = 3;
        if (wifiConfiguration.allowedKeyManagement.get(1)) {
            c5 = 2;
        } else if (!wifiConfiguration.allowedKeyManagement.get(2) && !wifiConfiguration.allowedKeyManagement.get(3)) {
            c5 = wifiConfiguration.wepKeys[0] != null ? (char) 1 : (char) 0;
        }
        return c5 != 0;
    }

    private String m() {
        return this.f5019b;
    }

    private void n(String str) {
        this.f5024g = str;
    }

    private String o() {
        return this.f5020c;
    }

    private void p(String str) {
        this.f5025h = str;
    }

    private String q() {
        return this.f5021d;
    }

    private void r(String str) {
        this.f5026i = str;
    }

    private String s() {
        return this.f5022e;
    }

    private void t(String str) {
        this.f5027j = str;
    }

    private String u() {
        return this.f5023f;
    }

    private void v(String str) {
        this.f5028k = str;
    }

    private String w() {
        return this.f5024g;
    }

    private String x() {
        return this.f5025h;
    }

    private String y() {
        return this.f5026i;
    }

    private String z() {
        return this.f5027j;
    }
}
