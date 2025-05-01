package com.join.mgps.Util;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.efs.sdk.base.core.util.NetworkUtil;
import java.util.List;
/* compiled from: WifiMgr.java */
/* loaded from: classes3.dex */
public class v2 {

    /* renamed from: f  reason: collision with root package name */
    public static final int f28124f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f28125g = 2;

    /* renamed from: h  reason: collision with root package name */
    public static final int f28126h = 3;

    /* renamed from: i  reason: collision with root package name */
    public static final int f28127i = 4;

    /* renamed from: j  reason: collision with root package name */
    private static v2 f28128j;

    /* renamed from: a  reason: collision with root package name */
    private Context f28129a;

    /* renamed from: b  reason: collision with root package name */
    private WifiManager f28130b;

    /* renamed from: c  reason: collision with root package name */
    List<ScanResult> f28131c;

    /* renamed from: d  reason: collision with root package name */
    List<WifiConfiguration> f28132d;

    /* renamed from: e  reason: collision with root package name */
    WifiInfo f28133e;

    private v2(Context context) {
        this.f28129a = context;
        this.f28130b = (WifiManager) context.getApplicationContext().getSystemService(NetworkUtil.NETWORK_TYPE_WIFI);
    }

    public static WifiConfiguration c(String str, String str2, int i4) {
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        wifiConfiguration.allowedAuthAlgorithms.clear();
        wifiConfiguration.allowedGroupCiphers.clear();
        wifiConfiguration.allowedKeyManagement.clear();
        wifiConfiguration.allowedPairwiseCiphers.clear();
        wifiConfiguration.allowedProtocols.clear();
        wifiConfiguration.SSID = m.a.f71493g + str + m.a.f71493g;
        if (i4 == 1) {
            wifiConfiguration.allowedKeyManagement.set(0);
        } else if (i4 == 2) {
            wifiConfiguration.hiddenSSID = true;
            String[] strArr = wifiConfiguration.wepKeys;
            strArr[0] = m.a.f71493g + str2 + m.a.f71493g;
            wifiConfiguration.allowedAuthAlgorithms.set(1);
            wifiConfiguration.allowedGroupCiphers.set(3);
            wifiConfiguration.allowedGroupCiphers.set(2);
            wifiConfiguration.allowedGroupCiphers.set(0);
            wifiConfiguration.allowedGroupCiphers.set(1);
            wifiConfiguration.allowedKeyManagement.set(0);
            wifiConfiguration.wepTxKeyIndex = 0;
        } else if (i4 == 3) {
            wifiConfiguration.preSharedKey = m.a.f71493g + str2 + m.a.f71493g;
            wifiConfiguration.hiddenSSID = true;
            wifiConfiguration.allowedAuthAlgorithms.set(0);
            wifiConfiguration.allowedGroupCiphers.set(2);
            wifiConfiguration.allowedKeyManagement.set(1);
            wifiConfiguration.allowedPairwiseCiphers.set(1);
            wifiConfiguration.allowedProtocols.set(0);
            wifiConfiguration.status = 2;
        } else if (i4 == 4) {
            wifiConfiguration.preSharedKey = m.a.f71493g + str2 + m.a.f71493g;
            wifiConfiguration.hiddenSSID = true;
            wifiConfiguration.allowedAuthAlgorithms.set(0);
            wifiConfiguration.allowedGroupCiphers.set(2);
            wifiConfiguration.allowedGroupCiphers.set(3);
            wifiConfiguration.allowedKeyManagement.set(1);
            wifiConfiguration.allowedPairwiseCiphers.set(1);
            wifiConfiguration.allowedPairwiseCiphers.set(2);
            wifiConfiguration.allowedProtocols.set(1);
            wifiConfiguration.allowedProtocols.set(0);
            wifiConfiguration.status = 2;
        }
        return wifiConfiguration;
    }

    public static v2 h(Context context) {
        if (f28128j == null) {
            synchronized (v2.class) {
                if (f28128j == null) {
                    f28128j = new v2(context);
                }
            }
        }
        return f28128j;
    }

    public boolean a(WifiConfiguration wifiConfiguration) {
        e();
        return this.f28130b.enableNetwork(this.f28130b.addNetwork(wifiConfiguration), true);
    }

    public void b() {
        if (this.f28130b.isWifiEnabled()) {
            this.f28130b.setWifiEnabled(false);
        }
    }

    public void d() {
        WifiManager wifiManager = this.f28130b;
        if (wifiManager != null) {
            wifiManager.setWifiEnabled(false);
        }
    }

    public boolean e() {
        WifiManager wifiManager = this.f28130b;
        if (wifiManager == null || !wifiManager.isWifiEnabled()) {
            return false;
        }
        this.f28130b.disableNetwork(this.f28130b.getConnectionInfo().getNetworkId());
        return this.f28130b.disconnect();
    }

    public String f() {
        int i4 = this.f28130b.getDhcpInfo().ipAddress;
        return (i4 & 255) + h0.f27805a + ((i4 >> 8) & 255) + h0.f27805a + ((i4 >> 16) & 255) + h0.f27805a + ((i4 >> 24) & 255);
    }

    public String g() {
        int i4 = this.f28130b.getDhcpInfo().serverAddress;
        return (i4 & 255) + h0.f27805a + ((i4 >> 8) & 255) + h0.f27805a + ((i4 >> 16) & 255) + h0.f27805a + ((i4 >> 24) & 255);
    }

    public String i() {
        int i4 = this.f28130b.getDhcpInfo().gateway;
        return (i4 & 255) + h0.f27805a + ((i4 >> 8) & 255) + h0.f27805a + ((i4 >> 16) & 255) + h0.f27805a + ((i4 >> 24) & 255);
    }

    public List<ScanResult> j() {
        return this.f28131c;
    }

    public List<WifiConfiguration> k() {
        return this.f28132d;
    }

    public WifiInfo l() {
        WifiInfo connectionInfo = this.f28130b.getConnectionInfo();
        this.f28133e = connectionInfo;
        return connectionInfo;
    }

    public boolean m() {
        WifiManager wifiManager = this.f28130b;
        if (wifiManager == null) {
            return false;
        }
        return wifiManager.isWifiEnabled();
    }

    public void n() {
        if (this.f28130b.isWifiEnabled()) {
            return;
        }
        this.f28130b.setWifiEnabled(true);
    }

    public void o() {
        this.f28130b.startScan();
        this.f28131c = this.f28130b.getScanResults();
        this.f28132d = this.f28130b.getConfiguredNetworks();
    }
}
