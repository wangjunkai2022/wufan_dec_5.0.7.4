package com.join.mgps.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.join.mgps.socket.entity.b;
import org.greenrobot.eventbus.c;
/* loaded from: classes4.dex */
public class ApWifiConnectedReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f53983a = ApWifiConnectedReceiver.class.getSimpleName();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (WifiAPBroadcastReceiver.f53999b.equals(action)) {
            if (intent.getIntExtra("wifi_state", 0) == 11) {
                c.f().o(b.f54681h);
                return;
            }
            return;
        }
        "android.net.wifi.WIFI_HOTSPOT_CLIENTS_CHANGED".equals(action);
    }
}
