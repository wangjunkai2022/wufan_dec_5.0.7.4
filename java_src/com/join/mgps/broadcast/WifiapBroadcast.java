package com.join.mgps.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public class WifiapBroadcast extends BroadcastReceiver {

    /* renamed from: c  reason: collision with root package name */
    private static final String f46271c = WifiapBroadcast.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<a> f46272a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private NetworkInfo f46273b;

    /* loaded from: classes4.dex */
    public interface a {
        void handleConnectChange();

        void scanResultsAvailable();

        void wifiStatusNotification();
    }

    public void a(a aVar) {
        if (aVar != null) {
            this.f46272a.add(aVar);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int i4 = 0;
        if (intent.getAction().equals("android.net.wifi.SCAN_RESULTS")) {
            while (i4 < this.f46272a.size()) {
                this.f46272a.get(i4).scanResultsAvailable();
                i4++;
            }
        } else if (intent.getAction().equals("android.net.wifi.WIFI_STATE_CHANGED")) {
            StringBuilder sb = new StringBuilder();
            sb.append("android.net.wifi.WIFI_STATE_CHANGED | ");
            sb.append(intent.getIntExtra("wifi_state", -1));
            sb.append(" | ");
            sb.append(intent.getIntExtra("previous_wifi_state", -1));
            while (i4 < this.f46272a.size()) {
                this.f46272a.get(i4).wifiStatusNotification();
                i4++;
            }
        } else if (intent.getAction().equals("android.net.wifi.STATE_CHANGE")) {
            this.f46273b = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("android.net.wifi.STATE_CHANGE | ");
            sb2.append(this.f46273b.getDetailedState());
            if (this.f46273b.getDetailedState() == NetworkInfo.DetailedState.CONNECTED) {
                while (i4 < this.f46272a.size()) {
                    this.f46272a.get(i4).handleConnectChange();
                    i4++;
                }
            }
        }
    }
}
