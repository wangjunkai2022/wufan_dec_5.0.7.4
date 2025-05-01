package com.join.mgps.helper;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import com.join.mgps.broadcast.WifiapBroadcast;
import w1.f;
/* loaded from: classes3.dex */
public class MGWifiFightClientManger implements WifiapBroadcast.a {
    private b enterRoomProcess;
    private long enteringStartTime;
    private f fightConnectListener;
    public Handler handler = new a();
    private Context mContext;
    private WifiapBroadcast mWifiapBroadcast;
    private WifiClientThread wifiClientThread;

    /* loaded from: classes3.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i4 = message.what;
            if (i4 == 9005) {
                MGWifiFightClientManger.this.fightConnectListener.i();
            } else if (i4 == 20000) {
                MGWifiFightClientManger.this.enterRoomProcess.a();
                MGWifiFightClientManger.this.fightConnectListener.f();
            } else if (i4 == 9009) {
                MGWifiFightClientManger.this.fightConnectListener.g();
            } else if (i4 != 9010) {
                switch (i4) {
                    case 9001:
                        MGWifiFightClientManger.this.enterRoomProcess.a();
                        MGWifiFightClientManger.this.fightConnectListener.k(message.obj.toString());
                        return;
                    case 9002:
                        MGWifiFightClientManger.this.fightConnectListener.b();
                        return;
                    case 9003:
                        MGWifiFightClientManger.this.enterRoomProcess.a();
                        MGWifiFightClientManger.this.fightConnectListener.d();
                        return;
                    default:
                        return;
                }
            } else {
                MGWifiFightClientManger.this.enterRoomProcess.a();
                MGWifiFightClientManger.this.fightConnectListener.j(message.obj.toString());
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private boolean f53411b = true;

        public b() {
        }

        public void a() {
            this.f53411b = false;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (this.f53411b) {
                if (System.currentTimeMillis() - MGWifiFightClientManger.this.enteringStartTime >= 20000) {
                    MGWifiFightClientManger.this.handler.sendMessage(MGWifiFightClientManger.this.handler.obtainMessage(20000));
                    return;
                }
                try {
                    Thread.sleep(100L);
                } catch (Exception unused) {
                }
            }
        }
    }

    public MGWifiFightClientManger(Context context, f fVar) {
        this.mContext = context;
        this.fightConnectListener = fVar;
        initBroadcast();
    }

    private void startMonitorEnteringRoom() {
        this.enteringStartTime = System.currentTimeMillis();
        this.enterRoomProcess = new b();
        new Thread(this.enterRoomProcess).start();
    }

    public void connect(String str, String str2) {
        startMonitorEnteringRoom();
        WifiClientThread wifiClientThread = new WifiClientThread(this.mContext, this.handler);
        this.wifiClientThread = wifiClientThread;
        wifiClientThread.run(str, str2);
    }

    public void disConnect() {
        WifiClientThread wifiClientThread = this.wifiClientThread;
        if (wifiClientThread != null) {
            wifiClientThread.disConnect();
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

    public void unregisterBroadCast() {
        this.mContext.unregisterReceiver(this.mWifiapBroadcast);
    }

    @Override // com.join.mgps.broadcast.WifiapBroadcast.a
    public void wifiStatusNotification() {
    }
}
