package com.join.mgps.aidl;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.join.android.app.common.utils.JsonMapper;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.WifiUtils;
import com.join.mgps.Util.t1;
import com.join.mgps.Util.w0;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class MGWifiClientThread {
    public static final int SERVERPORT = 8193;
    private BufferedOutputStream bufferedOutputStream;
    public Context context;

    /* renamed from: in  reason: collision with root package name */
    public InputStream f46172in;
    private DataInputStream ind;
    private Handler mHandler;
    public Socket socket;
    private String ssid;
    private String TAG = getClass().getSimpleName();
    private JsonMapper jsonMapper = JsonMapper.getInstance();
    private boolean ping = true;
    private List<byte[]> datas = new ArrayList(0);
    long lastSyncTime = 0;
    boolean monitoring = true;

    /* loaded from: classes4.dex */
    class a extends Thread {

        /* renamed from: com.join.mgps.aidl.MGWifiClientThread$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class RunnableC0345a implements Runnable {

            /* renamed from: com.join.mgps.aidl.MGWifiClientThread$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            class C0346a extends Thread {
                C0346a() {
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    super.run();
                    while (true) {
                        try {
                            Thread.sleep(1000L);
                            MGWifiClientThread.this.bufferedOutputStream.write(FightProtocalManager.ackSync().getBytes());
                            MGWifiClientThread.this.bufferedOutputStream.flush();
                        } catch (Exception e5) {
                            e5.printStackTrace();
                            return;
                        }
                    }
                }
            }

            RunnableC0345a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    Socket socket = MGWifiClientThread.this.socket;
                    if (socket != null && socket.isClosed()) {
                        break;
                    }
                    try {
                        int available = MGWifiClientThread.this.ind.available();
                        while (available == 0) {
                            available = MGWifiClientThread.this.ind.available();
                        }
                        byte[] bArr = new byte[available];
                        MGWifiClientThread.this.ind.read(bArr);
                        String str = new String(bArr, "gbk");
                        String unused = MGWifiClientThread.this.TAG;
                        StringBuilder sb = new StringBuilder();
                        sb.append("client Receiver:");
                        sb.append(str);
                        FightProtocal fightProtocal = (FightProtocal) MGWifiClientThread.this.jsonMapper.fromJson(str, FightProtocal.class);
                        if (fightProtocal.getType() == FightProtocal.TYPE_ACK) {
                            try {
                                if (fightProtocal.getNo() == FightProtocalManager.ackSignal) {
                                    Message message = new Message();
                                    message.what = 9001;
                                    message.obj = fightProtocal.getBrand() + "-" + fightProtocal.getOpponent();
                                    MGWifiClientThread.this.mHandler.sendMessage(message);
                                    new c().start();
                                    new C0346a().start();
                                } else {
                                    fightProtocal.setOpponent(AccountUtil_.getInstance_(MGWifiClientThread.this.context).getAccountData().d0());
                                    MGWifiClientThread.this.bufferedOutputStream.write(FightProtocalManager.ackSignalClient(fightProtocal).getBytes());
                                    MGWifiClientThread.this.bufferedOutputStream.flush();
                                }
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        } else if (fightProtocal.getType() == FightProtocal.TYPE_DISCONNECT) {
                            MGWifiClientThread mGWifiClientThread = MGWifiClientThread.this;
                            mGWifiClientThread.monitoring = false;
                            mGWifiClientThread.bufferedOutputStream.write(FightProtocalManager.ackDisconnect(fightProtocal).getBytes());
                            MGWifiClientThread.this.bufferedOutputStream.flush();
                            MGWifiClientThread.this.socket.close();
                            MGWifiClientThread.this.mHandler.sendEmptyMessage(9002);
                        } else if (fightProtocal.getType() == FightProtocal.TYPE_AckDISCONNECT) {
                            MGWifiClientThread mGWifiClientThread2 = MGWifiClientThread.this;
                            mGWifiClientThread2.monitoring = false;
                            mGWifiClientThread2.socket.close();
                            MGWifiClientThread.this.mHandler.sendEmptyMessage(com.join.mgps.data.c.D);
                        } else if (fightProtocal.getType() == FightProtocal.TYPE_STARTGAME) {
                            String unused2 = MGWifiClientThread.this.TAG;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("start game:");
                            sb2.append(available);
                            MGWifiClientThread mGWifiClientThread3 = MGWifiClientThread.this;
                            mGWifiClientThread3.monitoring = false;
                            mGWifiClientThread3.socket.close();
                            MGWifiClientThread.this.mHandler.sendEmptyMessage(com.join.mgps.data.c.f49035z);
                        } else if (fightProtocal.getType() == FightProtocal.TYPE_SYNC) {
                            MGWifiClientThread.this.lastSyncTime = System.currentTimeMillis();
                        }
                    } catch (Exception e6) {
                        String unused3 = MGWifiClientThread.this.TAG;
                        e6.toString();
                        MGWifiClientThread.this.ssid = "-1";
                        MGWifiClientThread.this.mHandler.sendEmptyMessage(9003);
                        try {
                            Socket socket2 = MGWifiClientThread.this.socket;
                            if (socket2 == null) {
                                break;
                            }
                            socket2.close();
                            break;
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                    }
                }
                MGWifiClientThread.this.ssid = "-1";
                String unused4 = MGWifiClientThread.this.TAG;
            }
        }

        a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            while (MGWifiClientThread.this.ping) {
                int dhcpInfo = WifiUtils.getInstance(MGWifiClientThread.this.context).getDhcpInfo();
                boolean pingCmd = WifiUtils.getInstance(MGWifiClientThread.this.context).pingCmd(com.join.mgps.socket.entity.b.f54682i);
                w0.a("xxxxxxxxx" + dhcpInfo + ";p=" + pingCmd + ";ip=" + WifiUtils.getInstance(MGWifiClientThread.this.context).getServerIPAddress(), new Object[0]);
                if (pingCmd) {
                    break;
                }
                t1.b(1000);
            }
            int i4 = 3;
            while (i4 > 0) {
                try {
                    MGWifiClientThread.this.socket = new Socket();
                    MGWifiClientThread.this.socket.connect(new InetSocketAddress(com.join.mgps.socket.entity.b.f54682i, 8193));
                    MGWifiClientThread.this.socket.setKeepAlive(true);
                    MGWifiClientThread.this.ind = new DataInputStream(MGWifiClientThread.this.socket.getInputStream());
                    MGWifiClientThread.this.bufferedOutputStream = new BufferedOutputStream(MGWifiClientThread.this.socket.getOutputStream());
                    new Thread(new RunnableC0345a()).start();
                    return;
                } catch (Exception e5) {
                    t1.b(1000);
                    String unused = MGWifiClientThread.this.TAG;
                    i4--;
                    if (i4 == 0) {
                    }
                    MGWifiClientThread.this.socket = null;
                    e5.printStackTrace();
                } finally {
                    MGWifiClientThread.this.ssid = "-1";
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    class b extends Thread {
        b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            try {
                MGWifiClientThread.this.ssid = "-1";
                MGWifiClientThread mGWifiClientThread = MGWifiClientThread.this;
                mGWifiClientThread.monitoring = false;
                mGWifiClientThread.bufferedOutputStream.write(FightProtocalManager.disconnect().getBytes());
                MGWifiClientThread.this.bufferedOutputStream.flush();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* loaded from: classes4.dex */
    class c extends Thread {
        c() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            while (MGWifiClientThread.this.monitoring) {
                try {
                    Thread.sleep(500L);
                    if (MGWifiClientThread.this.lastSyncTime != 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        MGWifiClientThread mGWifiClientThread = MGWifiClientThread.this;
                        if (currentTimeMillis - mGWifiClientThread.lastSyncTime > 4000) {
                            if (mGWifiClientThread.monitoring) {
                                mGWifiClientThread.mHandler.sendEmptyMessage(9002);
                                return;
                            }
                            return;
                        }
                        continue;
                    }
                } catch (InterruptedException e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    public MGWifiClientThread(Context context, Handler handler, String str) {
        this.context = context;
        this.mHandler = handler;
        this.ssid = str;
    }

    public void close() {
        if (this.socket != null) {
            try {
                send(com.join.mgps.data.c.f49030u.getBytes("gbk"));
                this.socket.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
        this.ssid = "-1";
        this.socket = null;
        System.gc();
    }

    public void destroy() {
        this.ping = false;
        Socket socket = this.socket;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            this.socket = null;
        }
    }

    public void disConnect() {
        new b().start();
    }

    public byte[] get() {
        byte[] bArr = this.datas.get(0);
        this.datas.remove(0);
        return bArr;
    }

    public String getSsid() {
        return this.ssid;
    }

    public void run() {
        new a().start();
    }

    public void send(byte[] bArr) {
        Socket socket = this.socket;
        if (socket == null || socket.isClosed()) {
            return;
        }
        try {
            this.bufferedOutputStream.write(bArr);
            this.bufferedOutputStream.flush();
        } catch (Exception e5) {
            e5.printStackTrace();
            close();
        }
    }

    public void setSsid(String str) {
        this.ssid = str;
    }

    public void close(boolean z4) {
        try {
            this.ssid = "-1";
            Socket socket = this.socket;
            if (socket != null) {
                socket.close();
            }
            if (z4) {
                this.mHandler.sendEmptyMessage(9002);
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }
}
