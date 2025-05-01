package com.kwad.sdk.utils;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.join.mgps.activity.BuildQRCodeActivity_;
import com.join.mgps.activity.SimulatorExitPlayActivity_;
import com.kwad.sdk.service.ServiceProvider;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class bv {
    private static boolean aSn;
    private static final List<a> aSo = new ArrayList();

    /* loaded from: classes5.dex */
    public static class a implements com.kwad.sdk.core.b {
        public String aSp;
        public String aSq;
        public int level;

        @Override // com.kwad.sdk.core.b
        public final void parseJson(@Nullable JSONObject jSONObject) {
        }

        @Override // com.kwad.sdk.core.b
        public final JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            t.putValue(jSONObject, SimulatorExitPlayActivity_.O, this.level);
            t.putValue(jSONObject, BuildQRCodeActivity_.E, this.aSp);
            t.putValue(jSONObject, "bssid", this.aSq);
            return jSONObject;
        }
    }

    public static boolean dx(Context context) {
        return (context.getApplicationInfo().targetSdkVersion < 29 || Build.VERSION.SDK_INT < 29) ? Build.VERSION.SDK_INT >= 23 && ContextCompat.checkSelfPermission(context, com.kuaishou.weapon.p0.g.f55587g) == -1 && ContextCompat.checkSelfPermission(context, com.kuaishou.weapon.p0.g.f55588h) == -1 : ContextCompat.checkSelfPermission(context, com.kuaishou.weapon.p0.g.f55587g) == -1;
    }

    public static List<a> o(Context context, int i4) {
        WifiManager wifiManager;
        if (av.Nc()) {
            return new ArrayList();
        }
        if (!aSn && ServiceProvider.Lx().canReadNearbyWifiList()) {
            List<a> list = aSo;
            if (list.isEmpty() && context != null) {
                if (((com.kwad.sdk.service.a.h) ServiceProvider.get(com.kwad.sdk.service.a.h.class)).ab(32L)) {
                    return list;
                }
                try {
                } catch (Exception e5) {
                    aSn = true;
                    com.kwad.sdk.core.e.c.printStackTraceOnly(e5);
                }
                if (dx(context) || (wifiManager = (WifiManager) context.getApplicationContext().getSystemService(NetworkUtil.NETWORK_TYPE_WIFI)) == null) {
                    return list;
                }
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                List<ScanResult> scanResults = wifiManager.getScanResults();
                if (scanResults != null) {
                    for (ScanResult scanResult : scanResults) {
                        a aVar = new a();
                        aVar.aSp = scanResult.SSID;
                        aVar.aSq = scanResult.BSSID;
                        aVar.level = scanResult.level;
                        if (connectionInfo.getBSSID() != null && scanResult.BSSID != null && TextUtils.equals(connectionInfo.getBSSID().replace(m.a.f71493g, ""), scanResult.BSSID.replace(m.a.f71493g, "")) && connectionInfo.getSSID() != null && scanResult.SSID != null && TextUtils.equals(connectionInfo.getSSID().replace(m.a.f71493g, ""), scanResult.SSID.replace(m.a.f71493g, ""))) {
                            aSo.add(0, aVar);
                        } else {
                            aSo.add(aVar);
                        }
                        List<a> list2 = aSo;
                        if (list2.size() >= i4) {
                            return list2;
                        }
                    }
                }
                return aSo;
            }
        }
        return aSo;
    }
}
