package com.join.mgps.aidl;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.join.android.app.common.utils.JsonMapper;
import com.join.mgps.Util.AccountUtil_;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.List;
import java.util.Vector;
/* loaded from: classes4.dex */
public class MGWifiServerThread {
    private static final int SERVERPORT = 8193;
    private Handler handler;
    private Context mContext;
    private ServerSocket mserverSocket;
    private String TAG = getClass().getSimpleName();
    private Boolean isrun = Boolean.TRUE;
    private Boolean shutDownPositive = Boolean.FALSE;
    private List<b> clientMap = new Vector(0);
    private boolean isDisconnected = false;
    long lastSyncTime = 0;
    boolean monitoring = true;

    /* loaded from: classes4.dex */
    class a extends Thread {
        a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            try {
                try {
                    MGWifiServerThread.this.clientMap.clear();
                    if (MGWifiServerThread.this.mserverSocket != null) {
                        MGWifiServerThread.this.mserverSocket.close();
                        MGWifiServerThread.this.mserverSocket = null;
                    }
                    MGWifiServerThread.this.mserverSocket = new ServerSocket(8193);
                    StringBuilder sb = new StringBuilder();
                    sb.append("tbl>>>isrun:");
                    sb.append(MGWifiServerThread.this.isrun);
                    MGWifiServerThread.this.handler.sendEmptyMessage(com.join.mgps.data.c.B);
                    while (MGWifiServerThread.this.isrun.booleanValue()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("tbl>>>mserverSocket.isClosed():");
                        sb2.append(MGWifiServerThread.this.mserverSocket.isClosed());
                        if (MGWifiServerThread.this.mserverSocket.isClosed()) {
                            break;
                        }
                        String unused = MGWifiServerThread.this.TAG;
                        b bVar = new b(MGWifiServerThread.this.mserverSocket.accept());
                        MGWifiServerThread.this.clientMap.add(bVar);
                        new Thread(bVar).start();
                    }
                    String unused2 = MGWifiServerThread.this.TAG;
                    if (MGWifiServerThread.this.mserverSocket != null) {
                        try {
                            MGWifiServerThread.this.mserverSocket.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                } catch (SocketException e6) {
                    e6.printStackTrace();
                }
            } catch (Exception e7) {
                e7.printStackTrace();
                String unused3 = MGWifiServerThread.this.TAG;
                if (MGWifiServerThread.this.shutDownPositive.booleanValue()) {
                    return;
                }
                MGWifiServerThread.this.handler.sendEmptyMessage(com.join.mgps.data.c.C);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private Socket f46179b;

        /* renamed from: c  reason: collision with root package name */
        private BufferedOutputStream f46180c;

        /* renamed from: d  reason: collision with root package name */
        private DataInputStream f46181d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f46182e = false;

        /* loaded from: classes4.dex */
        class a extends Thread {
            a() {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                super.run();
                while (true) {
                    try {
                        Thread.sleep(1000L);
                        b.this.f46180c.write(FightProtocalManager.ackSync().getBytes());
                        b.this.f46180c.flush();
                    } catch (Exception e5) {
                        e5.printStackTrace();
                        return;
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.join.mgps.aidl.MGWifiServerThread$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class C0347b extends Thread {
            C0347b() {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                super.run();
                try {
                    b.this.f46180c.write(FightProtocalManager.startGame().getBytes());
                    b.this.f46180c.flush();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class c extends Thread {
            c() {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                super.run();
                try {
                    MGWifiServerThread.this.monitoring = false;
                    String disconnect = FightProtocalManager.disconnect();
                    String unused = MGWifiServerThread.this.TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("disconnect ");
                    sb.append(disconnect);
                    b.this.f46180c.write(disconnect.getBytes());
                    b.this.f46180c.flush();
                } catch (IOException e5) {
                    e5.printStackTrace();
                    MGWifiServerThread.this.shutDown();
                }
            }
        }

        public b(Socket socket) {
            this.f46179b = null;
            this.f46179b = socket;
            try {
                this.f46180c = new BufferedOutputStream(this.f46179b.getOutputStream());
                this.f46181d = new DataInputStream(this.f46179b.getInputStream());
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }

        private void d(byte[] bArr) {
            try {
                String str = new String(bArr, "gbk");
                String unused = MGWifiServerThread.this.TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("server send=");
                sb.append(str);
                this.f46180c.write(bArr);
                this.f46180c.flush();
            } catch (Exception e5) {
                e5.printStackTrace();
                MGWifiServerThread.this.handler.sendEmptyMessage(9002);
                MGWifiServerThread.this.isrun = Boolean.FALSE;
            }
        }

        public void b(boolean z4) {
            Socket socket = this.f46179b;
            if (socket != null) {
                try {
                    if (!socket.isClosed()) {
                        this.f46179b.shutdownInput();
                        this.f46179b.shutdownOutput();
                        this.f46179b.close();
                    }
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            if (z4) {
                MGWifiServerThread.this.handler.sendEmptyMessage(com.join.mgps.data.c.D);
            } else {
                MGWifiServerThread.this.handler.sendEmptyMessage(9002);
            }
        }

        public void c() {
            new c().start();
        }

        public void e() {
            new C0347b().start();
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f46180c.write(FightProtocalManager.ackSignal("", "", AccountUtil_.getInstance_(MGWifiServerThread.this.mContext).getAccountData().d0()).getBytes());
                this.f46180c.flush();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            while (!this.f46179b.isClosed()) {
                try {
                    int available = this.f46181d.available();
                    while (available == 0) {
                        available = this.f46181d.available();
                    }
                    byte[] bArr = new byte[available];
                    this.f46181d.read(bArr);
                    String str = new String(bArr, "gbk");
                    String unused = MGWifiServerThread.this.TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("tbl>>>server receive:");
                    sb.append(available);
                    FightProtocal fightProtocal = null;
                    try {
                        fightProtocal = (FightProtocal) JsonMapper.getInstance().fromJson(str, FightProtocal.class);
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                    if (fightProtocal != null) {
                        if (fightProtocal.getType() == FightProtocal.TYPE_ACK && FightProtocalManager.ackReceivedSignal(fightProtocal)) {
                            String unused2 = MGWifiServerThread.this.TAG;
                            Message message = new Message();
                            message.what = 9001;
                            message.obj = fightProtocal.getBrand() + "-" + fightProtocal.getOpponent();
                            MGWifiServerThread.this.handler.sendMessage(message);
                            fightProtocal.setBrand(Build.BRAND);
                            fightProtocal.setOpponent(AccountUtil_.getInstance_(MGWifiServerThread.this.mContext).getAccountData().d0());
                            d(JsonMapper.getInstance().toJson(fightProtocal).getBytes());
                            new c().start();
                            new a().start();
                        } else if (fightProtocal.getType() == FightProtocal.TYPE_DISCONNECT) {
                            String unused3 = MGWifiServerThread.this.TAG;
                            MGWifiServerThread.this.monitoring = false;
                            d(FightProtocalManager.ackDisconnect(fightProtocal).getBytes());
                            b(false);
                            MGWifiServerThread.this.shutDown();
                        } else if (fightProtocal.getType() == FightProtocal.TYPE_AckDISCONNECT) {
                            String unused4 = MGWifiServerThread.this.TAG;
                            MGWifiServerThread.this.monitoring = false;
                            b(true);
                            MGWifiServerThread.this.shutDown();
                        } else if (fightProtocal.getType() == FightProtocal.TYPE_SYNC) {
                            MGWifiServerThread.this.lastSyncTime = System.currentTimeMillis();
                        }
                    }
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
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
            while (MGWifiServerThread.this.monitoring) {
                try {
                    Thread.sleep(500L);
                    if (MGWifiServerThread.this.lastSyncTime != 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        MGWifiServerThread mGWifiServerThread = MGWifiServerThread.this;
                        if (currentTimeMillis - mGWifiServerThread.lastSyncTime > 4000) {
                            if (mGWifiServerThread.monitoring) {
                                mGWifiServerThread.handler.sendEmptyMessage(9002);
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

    public MGWifiServerThread(Context context, Handler handler) {
        this.mContext = context;
        this.handler = handler;
    }

    public void disConnect() {
        if (this.clientMap.size() == 0) {
            shutDown();
            return;
        }
        for (b bVar : this.clientMap) {
            bVar.c();
        }
    }

    public byte[] getData() {
        return this.clientMap.size() == 0 ? new byte[0] : new byte[0];
    }

    public void run() {
        if (this.mserverSocket != null) {
            shutDown();
        }
        new a().start();
    }

    public void send(byte[] bArr) {
        if (this.clientMap.size() == 0) {
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("server send:");
            sb.append(new String(bArr, "gbk"));
        } catch (UnsupportedEncodingException e5) {
            e5.printStackTrace();
        }
    }

    public void shutDown() {
        try {
            this.shutDownPositive = Boolean.TRUE;
            if (this.mserverSocket != null) {
                this.clientMap.clear();
                this.mserverSocket.close();
            }
            this.isrun = Boolean.FALSE;
            this.mserverSocket = null;
            System.gc();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void startGame() {
        if (this.clientMap.size() == 0) {
            shutDown();
            return;
        }
        for (b bVar : this.clientMap) {
            bVar.e();
        }
    }
}
