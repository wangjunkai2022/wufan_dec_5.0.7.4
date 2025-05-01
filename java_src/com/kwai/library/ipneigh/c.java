package com.kwai.library.ipneigh;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.efs.sdk.base.core.util.NetworkUtil;
/* loaded from: classes5.dex */
public final class c {
    private static d b(Context context, boolean z4, boolean z5) {
        String str;
        try {
            if (!b.isWifiConnected(context)) {
                return new d("", false, "");
            }
            String ev = b.ev(((WifiManager) context.getApplicationContext().getSystemService(NetworkUtil.NETWORK_TYPE_WIFI)).getDhcpInfo().gateway);
            if (z4) {
                str = "";
            } else {
                str = a.hy("timeout 5 ip neigh show " + ev);
            }
            if (z4 || TextUtils.isEmpty(str)) {
                str = KwaiIpNeigh.i(ev, false);
            }
            String hA = b.hA(str);
            return new d(hA, !TextUtils.isEmpty(hA), str);
        } catch (Throwable th) {
            return new d("", false, th.getMessage());
        }
    }

    public static d dK(Context context) {
        return y(context, false);
    }

    private static d y(Context context, boolean z4) {
        return b(context, false, false);
    }
}
