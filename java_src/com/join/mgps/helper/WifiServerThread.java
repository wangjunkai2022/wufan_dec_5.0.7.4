package com.join.mgps.helper;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.join.android.app.common.utils.JsonMapper;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.aidl.FightProtocal;
import com.join.mgps.aidl.FightProtocalManager;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class WifiServerThread {
    private static final int SERVERPORT = 8193;
    private Handler handler;
    private Context mContext;
    private String mGameId;
    private String mGameName;
    private ServerSocket mserverSocket;
    private String TAG = getClass().getSimpleName();
    private Boolean isrun = Boolean.TRUE;
    private Boolean shutDownPositive = Boolean.FALSE;
    private List<c> clientMap = new ArrayList(0);
    private JsonMapper jsonMapper = JsonMapper.getInstance();
    private boolean checking = true;

    /* loaded from: classes3.dex */
    class a extends Thread {
        a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            try {
                try {
                    WifiServerThread.this.clientMap.clear();
                    if (WifiServerThread.this.mserverSocket != null) {
                        WifiServerThread.this.mserverSocket.close();
                        WifiServerThread.this.mserverSocket = null;
                    }
                    WifiServerThread.this.mserverSocket = new ServerSocket(8193);
                    WifiServerThread.this.handler.sendEmptyMessage(com.join.mgps.data.c.B);
                    while (WifiServerThread.this.isrun.booleanValue() && !WifiServerThread.this.mserverSocket.isClosed()) {
                        String unused = WifiServerThread.this.TAG;
                        c cVar = new c(WifiServerThread.this.mserverSocket.accept());
                        WifiServerThread.this.clientMap.clear();
                        WifiServerThread.this.clientMap.add(cVar);
                        new Thread(cVar).start();
                    }
                    String unused2 = WifiServerThread.this.TAG;
                    if (WifiServerThread.this.mserverSocket != null) {
                        try {
                            WifiServerThread.this.mserverSocket.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                    String unused3 = WifiServerThread.this.TAG;
                    if (WifiServerThread.this.shutDownPositive.booleanValue()) {
                        return;
                    }
                    WifiServerThread.this.handler.sendEmptyMessage(com.join.mgps.data.c.C);
                }
            } catch (SocketException e7) {
                e7.printStackTrace();
            }
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (WifiServerThread.this.clientMap.size() != 0) {
                    for (c cVar : WifiServerThread.this.clientMap) {
                        cVar.c();
                    }
                    return;
                }
                WifiServerThread.this.shutDown();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private Socket f53422b;

        /* renamed from: c  reason: collision with root package name */
        private BufferedOutputStream f53423c;

        /* renamed from: d  reason: collision with root package name */
        private DataInputStream f53424d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f53425e = false;

        /* renamed from: f  reason: collision with root package name */
        private boolean f53426f = false;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    String disconnect = FightProtocalManager.disconnect();
                    String unused = WifiServerThread.this.TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("disconnect ");
                    sb.append(disconnect);
                    c.this.f53423c.write(disconnect.getBytes());
                    c.this.f53423c.flush();
                } catch (IOException e5) {
                    e5.printStackTrace();
                    WifiServerThread.this.shutDown();
                }
            }
        }

        public c(Socket socket) {
            this.f53422b = null;
            this.f53422b = socket;
            try {
                this.f53423c = new BufferedOutputStream(this.f53422b.getOutputStream());
                this.f53424d = new DataInputStream(this.f53422b.getInputStream());
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }

        private void d(byte[] bArr) {
            try {
                String str = new String(bArr, "utf8");
                String unused = WifiServerThread.this.TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("server send=");
                sb.append(str);
                this.f53423c.write(bArr);
                this.f53423c.flush();
            } catch (Exception e5) {
                e5.printStackTrace();
                WifiServerThread.this.checking = false;
                WifiServerThread.this.handler.sendEmptyMessage(9002);
                WifiServerThread.this.isrun = Boolean.FALSE;
            }
        }

        public void b(boolean z4) {
            Socket socket = this.f53422b;
            if (socket != null) {
                try {
                    if (!socket.isClosed()) {
                        this.f53422b.shutdownInput();
                        this.f53422b.shutdownOutput();
                        this.f53422b.close();
                    }
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            if (z4) {
                WifiServerThread.this.handler.sendEmptyMessage(com.join.mgps.data.c.D);
            } else {
                WifiServerThread.this.handler.sendEmptyMessage(9002);
            }
        }

        public void c() {
            new Thread(new a()).start();
        }

        public void e() {
            try {
                this.f53423c.write(FightProtocalManager.startGame().getBytes());
                this.f53423c.flush();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                d(FightProtocalManager.ackSignal(WifiServerThread.this.mGameId, WifiServerThread.this.mGameName, AccountUtil_.getInstance_(WifiServerThread.this.mContext).getAccountData().d0()).getBytes());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            while (!this.f53422b.isClosed()) {
                try {
                    Message message = new Message();
                    int available = this.f53424d.available();
                    while (available == 0) {
                        available = this.f53424d.available();
                    }
                    byte[] bArr = new byte[available];
                    this.f53424d.read(bArr);
                    String str = new String(bArr, "utf8");
                    String unused = WifiServerThread.this.TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("server receive:");
                    sb.append(available);
                    FightProtocal fightProtocal = (FightProtocal) WifiServerThread.this.jsonMapper.fromJson(str, FightProtocal.class);
                    if (fightProtocal != null) {
                        if (fightProtocal.getType() == FightProtocal.TYPE_ACK && FightProtocalManager.ackReceivedSignal(fightProtocal)) {
                            this.f53426f = false;
                            message.what = 9001;
                            message.obj = fightProtocal.getBrand() + "-" + fightProtocal.getOpponent();
                            WifiServerThread.this.handler.sendMessage(message);
                            fightProtocal.setBrand(Build.BRAND);
                            fightProtocal.setOpponent(AccountUtil_.getInstance_(WifiServerThread.this.mContext).getAccountData().d0());
                            d(WifiServerThread.this.jsonMapper.toJson(fightProtocal).getBytes());
                            String unused2 = WifiServerThread.this.TAG;
                            this.f53426f = true;
                        } else if (fightProtocal.getType() == FightProtocal.TYPE_DISCONNECT) {
                            String unused3 = WifiServerThread.this.TAG;
                            if (!this.f53426f) {
                                return;
                            }
                            d(FightProtocalManager.ackDisconnect(fightProtocal).getBytes());
                            b(false);
                            WifiServerThread.this.shutDown();
                        } else if (fightProtocal.getType() == FightProtocal.TYPE_AckDISCONNECT) {
                            String unused4 = WifiServerThread.this.TAG;
                            this.f53426f = false;
                            b(true);
                            WifiServerThread.this.shutDown();
                        }
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
        }
    }

    public WifiServerThread(Context context, Handler handler, String str, String str2) {
        this.mContext = context;
        this.handler = handler;
        this.mGameId = str;
        this.mGameName = str2;
    }

    public void disConnect() {
        new Thread(new b()).start();
    }

    public byte[] getData() {
        return this.clientMap.size() == 0 ? new byte[0] : new byte[0];
    }

    public void run() {
        if (this.mserverSocket != null) {
            shutDown();
        }
        this.isrun = Boolean.TRUE;
        new a().start();
    }

    public void send(byte[] bArr) {
        if (this.clientMap.size() == 0) {
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("server send:");
            sb.append(new String(bArr, "utf8"));
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
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }

    public void startGame() {
        if (this.clientMap.size() == 0) {
            shutDown();
            return;
        }
        for (c cVar : this.clientMap) {
            cVar.e();
        }
    }
}
