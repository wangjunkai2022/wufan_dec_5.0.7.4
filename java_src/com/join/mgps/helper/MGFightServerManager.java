package com.join.mgps.helper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.join.mgps.Util.WifiUtils;
import com.join.mgps.Util.j2;
import com.join.mgps.aidl.MGWifiServerThread;
import com.join.mgps.broadcast.WifiapBroadcast;
import com.join.mgps.data.c;
import w1.f;
/* loaded from: classes3.dex */
public class MGFightServerManager implements WifiapBroadcast.a {
    private String apName;
    private f fightConnectListener;
    private Context mContext;
    private String mGameName;
    private WifiUtils mWifiUtils;
    WifiapBroadcast mWifiapBroadcast;
    private b monitorAPProcess;
    private MGWifiServerThread wifiServerThread;
    private String TAG = getClass().getSimpleName();
    @SuppressLint({"HandlerLeak"})
    private Handler handler = new a();

    /* loaded from: classes3.dex */
    class a extends Handler {

        /* renamed from: com.join.mgps.helper.MGFightServerManager$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class HandlerC0369a extends Handler {
            HandlerC0369a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                int i4 = message.what;
                if (i4 == 9001) {
                    if (message.obj != null) {
                        MGFightServerManager.this.fightConnectListener.k(message.obj.toString());
                    } else {
                        MGFightServerManager.this.fightConnectListener.k("客机");
                    }
                } else if (i4 != 9002) {
                    switch (i4) {
                        case c.B /* 9007 */:
                            MGFightServerManager.this.fightConnectListener.onSuccess(MGFightServerManager.this.apName);
                            return;
                        case c.C /* 9008 */:
                            MGFightServerManager.this.fightConnectListener.a(c.C);
                            return;
                        case c.D /* 9009 */:
                            MGFightServerManager.this.fightConnectListener.g();
                            return;
                        default:
                            return;
                    }
                } else {
                    MGFightServerManager.this.fightConnectListener.b();
                }
            }
        }

        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
            if (r5.startsWith(com.join.mgps.data.c.f49025p + r4.f53404a.mGameName) != false) goto L10;
         */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void handleMessage(android.os.Message r5) {
            /*
                r4 = this;
                super.handleMessage(r5)
                int r5 = r5.what
                r0 = 3
                if (r5 == r0) goto La
                goto Laa
            La:
                com.join.mgps.helper.MGFightServerManager r5 = com.join.mgps.helper.MGFightServerManager.this
                com.join.mgps.helper.MGFightServerManager$b r5 = com.join.mgps.helper.MGFightServerManager.access$000(r5)
                r5.b()
                int r5 = android.os.Build.VERSION.SDK_INT
                r1 = 26
                r2 = 1
                if (r5 < r1) goto L1b
                goto L50
            L1b:
                com.join.mgps.helper.MGFightServerManager r5 = com.join.mgps.helper.MGFightServerManager.this
                com.join.mgps.Util.WifiUtils r5 = com.join.mgps.helper.MGFightServerManager.access$100(r5)
                java.lang.String r5 = r5.getApSSID()
                if (r5 == 0) goto L4f
                com.join.mgps.helper.MGFightServerManager r5 = com.join.mgps.helper.MGFightServerManager.this
                com.join.mgps.Util.WifiUtils r5 = com.join.mgps.helper.MGFightServerManager.access$100(r5)
                java.lang.String r5 = r5.getApSSID()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "papa_"
                r1.append(r3)
                com.join.mgps.helper.MGFightServerManager r3 = com.join.mgps.helper.MGFightServerManager.this
                java.lang.String r3 = com.join.mgps.helper.MGFightServerManager.access$200(r3)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                boolean r5 = r5.startsWith(r1)
                if (r5 == 0) goto L4f
                goto L50
            L4f:
                r2 = 0
            L50:
                com.join.mgps.helper.MGFightServerManager r5 = com.join.mgps.helper.MGFightServerManager.this
                com.join.mgps.Util.WifiUtils r5 = com.join.mgps.helper.MGFightServerManager.access$100(r5)
                int r5 = r5.getWifiApStateInt()
                if (r5 == r0) goto L6a
                com.join.mgps.helper.MGFightServerManager r5 = com.join.mgps.helper.MGFightServerManager.this
                com.join.mgps.Util.WifiUtils r5 = com.join.mgps.helper.MGFightServerManager.access$100(r5)
                int r5 = r5.getWifiApStateInt()
                r0 = 13
                if (r5 != r0) goto L9f
            L6a:
                if (r2 == 0) goto L9f
                com.join.mgps.helper.MGFightServerManager r5 = com.join.mgps.helper.MGFightServerManager.this     // Catch: java.lang.Exception -> L9a
                com.join.mgps.aidl.MGWifiServerThread r5 = com.join.mgps.helper.MGFightServerManager.access$300(r5)     // Catch: java.lang.Exception -> L9a
                if (r5 == 0) goto L7d
                com.join.mgps.helper.MGFightServerManager r5 = com.join.mgps.helper.MGFightServerManager.this     // Catch: java.lang.Exception -> L9a
                com.join.mgps.aidl.MGWifiServerThread r5 = com.join.mgps.helper.MGFightServerManager.access$300(r5)     // Catch: java.lang.Exception -> L9a
                r5.shutDown()     // Catch: java.lang.Exception -> L9a
            L7d:
                com.join.mgps.helper.MGFightServerManager r5 = com.join.mgps.helper.MGFightServerManager.this     // Catch: java.lang.Exception -> L9a
                com.join.mgps.aidl.MGWifiServerThread r0 = new com.join.mgps.aidl.MGWifiServerThread     // Catch: java.lang.Exception -> L9a
                android.content.Context r1 = com.join.mgps.helper.MGFightServerManager.access$400(r5)     // Catch: java.lang.Exception -> L9a
                com.join.mgps.helper.MGFightServerManager$a$a r2 = new com.join.mgps.helper.MGFightServerManager$a$a     // Catch: java.lang.Exception -> L9a
                r2.<init>()     // Catch: java.lang.Exception -> L9a
                r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L9a
                com.join.mgps.helper.MGFightServerManager.access$302(r5, r0)     // Catch: java.lang.Exception -> L9a
                com.join.mgps.helper.MGFightServerManager r5 = com.join.mgps.helper.MGFightServerManager.this     // Catch: java.lang.Exception -> L9a
                com.join.mgps.aidl.MGWifiServerThread r5 = com.join.mgps.helper.MGFightServerManager.access$300(r5)     // Catch: java.lang.Exception -> L9a
                r5.run()     // Catch: java.lang.Exception -> L9a
                goto Laa
            L9a:
                r5 = move-exception
                r5.printStackTrace()
                goto Laa
            L9f:
                com.join.mgps.helper.MGFightServerManager r5 = com.join.mgps.helper.MGFightServerManager.this
                w1.f r5 = com.join.mgps.helper.MGFightServerManager.access$600(r5)
                r0 = 9006(0x232e, float:1.262E-41)
                r5.a(r0)
            Laa:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.helper.MGFightServerManager.a.handleMessage(android.os.Message):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public boolean f53406b = false;

        /* renamed from: c  reason: collision with root package name */
        private long f53407c = 0;

        /* renamed from: d  reason: collision with root package name */
        private Thread f53408d = null;

        b() {
        }

        public void a() {
            this.f53408d = new Thread(this);
            this.f53406b = true;
            this.f53407c = System.currentTimeMillis();
            this.f53408d.start();
        }

        public void b() {
            this.f53406b = false;
            this.f53408d = null;
            this.f53407c = 0L;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (this.f53406b) {
                if (MGFightServerManager.this.mWifiUtils.getWifiApStateInt() == 3 || MGFightServerManager.this.mWifiUtils.getWifiApStateInt() == 13 || System.currentTimeMillis() - this.f53407c >= c.f49010a) {
                    MGFightServerManager.this.handler.sendMessage(MGFightServerManager.this.handler.obtainMessage(3));
                }
                try {
                    Thread.sleep(1000L);
                } catch (Exception unused) {
                }
            }
        }
    }

    public MGFightServerManager(Context context, f fVar) {
        this.fightConnectListener = fVar;
        this.mContext = context;
        this.mWifiUtils = WifiUtils.getInstance(context);
    }

    private void createAP(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            this.mWifiUtils.closeWifi();
            if (str.replaceAll(" ", "").length() > 6) {
                str = str.replaceAll(" ", "").substring(0, 6);
            }
            this.mGameName = str;
            String b5 = j2.b(3);
            this.apName = c.f49025p + str + "_" + b5;
            StringBuilder sb = new StringBuilder();
            sb.append("method createAP() called. start create ap:[");
            sb.append(this.apName);
            sb.append("]");
            if (WifiUtils.getInstance(this.mContext).getWifiApStateInt() == 4) {
                this.fightConnectListener.a(c.A);
                return;
            } else {
                WifiUtils wifiUtils = this.mWifiUtils;
                wifiUtils.createWiFiAP(wifiUtils.createAPInfo(this.apName, c.f49026q), true);
            }
        }
        b bVar = this.monitorAPProcess;
        if (bVar == null) {
            this.monitorAPProcess = new b();
        } else {
            bVar.b();
        }
        this.monitorAPProcess.a();
    }

    public void disConnect() {
        MGWifiServerThread mGWifiServerThread = this.wifiServerThread;
        if (mGWifiServerThread != null) {
            mGWifiServerThread.disConnect();
        }
    }

    public WifiapBroadcast getmWifiapBroadcast() {
        return this.mWifiapBroadcast;
    }

    @Override // com.join.mgps.broadcast.WifiapBroadcast.a
    public void handleConnectChange() {
        this.handler.sendMessage(this.handler.obtainMessage(2));
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
        this.handler.sendMessage(this.handler.obtainMessage(1));
    }

    public void shutDown() {
        MGWifiServerThread mGWifiServerThread = this.wifiServerThread;
        if (mGWifiServerThread != null) {
            mGWifiServerThread.disConnect();
        }
    }

    public void shutDownServer() {
        MGWifiServerThread mGWifiServerThread = this.wifiServerThread;
        if (mGWifiServerThread != null) {
            mGWifiServerThread.disConnect();
        }
        this.wifiServerThread.shutDown();
    }

    public void startGame() {
        this.wifiServerThread.startGame();
    }

    public void startServer(String str) {
        createAP(str);
    }

    @Override // com.join.mgps.broadcast.WifiapBroadcast.a
    public void wifiStatusNotification() {
        this.handler.sendMessage(this.handler.obtainMessage(1));
    }
}
