package com.join.mgps.helper;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import com.join.android.app.common.utils.j;
import com.join.mgps.Util.WifiUtils;
import com.join.mgps.broadcast.WifiapBroadcast;
import com.join.mgps.data.c;
import com.join.mgps.socket.entity.b;
import w1.f;
/* loaded from: classes3.dex */
public class MGWifiFightServerManger implements WifiapBroadcast.a {
    private f fightConnectListener;
    private Context mContext;
    private WifiUtils mWifiUtils;
    private WifiapBroadcast mWifiapBroadcast;
    private WifiServerThread wifiServerThread;

    /* loaded from: classes3.dex */
    class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f53413a;

        a(f fVar) {
            this.f53413a = fVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i4 = message.what;
            if (i4 == 9001) {
                this.f53413a.k(message.obj.toString());
            } else if (i4 != 9002) {
                switch (i4) {
                    case c.B /* 9007 */:
                        this.f53413a.onSuccess("");
                        return;
                    case c.C /* 9008 */:
                        this.f53413a.a(c.C);
                        return;
                    case c.D /* 9009 */:
                        this.f53413a.g();
                        return;
                    default:
                        return;
                }
            } else {
                this.f53413a.b();
            }
        }
    }

    public MGWifiFightServerManger(Context context, f fVar, String str, String str2) {
        this.mContext = context;
        this.fightConnectListener = fVar;
        this.mWifiUtils = WifiUtils.getInstance(context);
        this.wifiServerThread = new WifiServerThread(context, new a(fVar), str, str2);
        initBroadcast();
    }

    public void disConnect() {
        WifiServerThread wifiServerThread = this.wifiServerThread;
        if (wifiServerThread != null) {
            wifiServerThread.disConnect();
        }
    }

    @Override // com.join.mgps.broadcast.WifiapBroadcast.a
    public void handleConnectChange() {
    }

    public void initBroadcast() {
        this.mWifiapBroadcast = new WifiapBroadcast();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.setPriority(Integer.MAX_VALUE);
        try {
            this.mContext.registerReceiver(this.mWifiapBroadcast, intentFilter);
        } catch (Exception unused) {
        }
    }

    @Override // com.join.mgps.broadcast.WifiapBroadcast.a
    public void scanResultsAvailable() {
    }

    public void shutDown() {
        WifiServerThread wifiServerThread = this.wifiServerThread;
        if (wifiServerThread != null) {
            wifiServerThread.disConnect();
        }
    }

    public void shutDownServer() {
        WifiServerThread wifiServerThread = this.wifiServerThread;
        if (wifiServerThread != null) {
            wifiServerThread.disConnect();
        }
        this.wifiServerThread.shutDown();
    }

    public void startGame() {
        this.wifiServerThread.startGame();
    }

    public void startServer(String str) {
        String e5 = j.e(this.mContext);
        if (j.k(this.mContext) && !e5.equals(b.f54683j)) {
            this.wifiServerThread.run();
            return;
        }
        this.mWifiUtils.OpenWifi();
        this.fightConnectListener.a(0);
    }

    public void unregisterBroadCast() {
        this.mContext.unregisterReceiver(this.mWifiapBroadcast);
    }

    @Override // com.join.mgps.broadcast.WifiapBroadcast.a
    public void wifiStatusNotification() {
    }
}
