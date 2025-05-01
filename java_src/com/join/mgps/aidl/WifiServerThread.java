package com.join.mgps.aidl;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.join.mgps.aidl.Client;
import com.join.mgps.data.c;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public class WifiServerThread {
    private static final int SERVERPORT = 8193;
    private Context context;
    private Handler handler;
    private ServerSocket mserverSocket;
    private int single;
    private String TAG = getClass().getSimpleName();
    private Boolean isrun = Boolean.TRUE;
    private Map<String, Client> clientMap = new HashMap(0);

    /* loaded from: classes4.dex */
    class a extends Thread {
        a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            try {
                WifiServerThread.this.mserverSocket = new ServerSocket(8193);
                while (WifiServerThread.this.isrun.booleanValue() && !WifiServerThread.this.mserverSocket.isClosed()) {
                    String unused = WifiServerThread.this.TAG;
                    Socket accept = WifiServerThread.this.mserverSocket.accept();
                    b bVar = new b(accept);
                    Client client = new Client();
                    client.setUuid(accept.getInetAddress().getHostAddress());
                    client.setsClient(bVar);
                    WifiServerThread.this.clientMap.put(accept.getInetAddress().getHostAddress(), client);
                    new Thread(bVar).start();
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
            }
        }
    }

    /* loaded from: classes4.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private Socket f46189b;

        /* renamed from: d  reason: collision with root package name */
        private BufferedOutputStream f46191d;

        /* renamed from: e  reason: collision with root package name */
        DataInputStream f46192e;

        /* renamed from: h  reason: collision with root package name */
        private Client f46195h;

        /* renamed from: i  reason: collision with root package name */
        private Object f46196i;

        /* renamed from: c  reason: collision with root package name */
        private BufferedReader f46190c = null;

        /* renamed from: f  reason: collision with root package name */
        private List<byte[]> f46193f = new ArrayList(0);

        /* renamed from: g  reason: collision with root package name */
        private boolean f46194g = false;

        public b(Socket socket) {
            this.f46189b = null;
            this.f46189b = socket;
            try {
                this.f46191d = new BufferedOutputStream(this.f46189b.getOutputStream());
                this.f46192e = new DataInputStream(this.f46189b.getInputStream());
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }

        public void a() {
            Socket socket = this.f46189b;
            if (socket != null) {
                try {
                    if (!socket.isClosed()) {
                        this.f46189b.shutdownInput();
                        this.f46189b.shutdownOutput();
                        this.f46189b.close();
                    }
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            WifiServerThread.this.handler.sendEmptyMessage(9002);
        }

        public byte[] b() {
            byte[] bArr = this.f46193f.get(0);
            this.f46193f.remove(0);
            return bArr;
        }

        public String c() {
            return this.f46189b.getInetAddress().getHostAddress();
        }

        public boolean d() {
            Socket socket = this.f46189b;
            if (socket == null || socket.isInputShutdown() || this.f46189b.isOutputShutdown()) {
                return true;
            }
            return this.f46189b.isClosed();
        }

        public void e(byte[] bArr) {
            try {
                String str = new String(bArr, "gbk");
                String unused = WifiServerThread.this.TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("server send=");
                sb.append(str);
                this.f46191d.write(bArr);
                this.f46191d.flush();
            } catch (Exception e5) {
                e5.printStackTrace();
                WifiServerThread.this.handler.sendEmptyMessage(9002);
                WifiServerThread.this.isrun = Boolean.FALSE;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f46195h = (Client) WifiServerThread.this.clientMap.get(this.f46189b.getInetAddress().getHostAddress());
            WifiServerThread.this.single = (int) (Math.random() * 100.0d);
            String unused = WifiServerThread.this.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("send =wifiap_single_acknowledge");
            sb.append(WifiServerThread.this.single);
            try {
                this.f46191d.write((c.f49027r + WifiServerThread.this.single).getBytes());
                this.f46191d.flush();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            while (!this.f46189b.isClosed()) {
                try {
                    Message message = new Message();
                    int available = this.f46192e.available();
                    while (available == 0) {
                        available = this.f46192e.available();
                    }
                    byte[] bArr = new byte[available];
                    this.f46192e.read(bArr);
                    String str = new String(bArr, "gbk");
                    String unused2 = WifiServerThread.this.TAG;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("server receive:");
                    sb2.append(available);
                    this.f46195h.setLastResponseTime(System.currentTimeMillis());
                    if (!this.f46194g && str.startsWith(c.f49027r) && Integer.parseInt(str.split(c.f49027r)[1].replace("\n", "")) == WifiServerThread.this.single + 1) {
                        String unused3 = WifiServerThread.this.TAG;
                        ((Client) WifiServerThread.this.clientMap.get(this.f46189b.getInetAddress().getHostAddress())).setStatus(Client.ClientStatus.BOUND);
                        message.what = 9001;
                        WifiServerThread.this.handler.sendMessage(message);
                        this.f46194g = true;
                        if (this.f46195h == null) {
                            this.f46189b.close();
                            return;
                        }
                        continue;
                    } else if (!str.startsWith(c.f49029t)) {
                        if (str.startsWith(c.f49030u)) {
                            a();
                        } else {
                            this.f46193f.add(bArr);
                        }
                    }
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
        }
    }

    public WifiServerThread(Context context, Handler handler) {
        this.context = context;
        this.handler = handler;
    }

    public void close() {
        for (Map.Entry<String, Client> entry : this.clientMap.entrySet()) {
            entry.getValue().getsClient().a();
            this.clientMap.clear();
        }
    }

    public byte[] getData() {
        if (this.clientMap.size() == 0) {
            return new byte[0];
        }
        Iterator<Map.Entry<String, Client>> it2 = this.clientMap.entrySet().iterator();
        return it2.hasNext() ? it2.next().getValue().getsClient().b() : new byte[0];
    }

    public String getIP() {
        Iterator<Map.Entry<String, Client>> it2 = this.clientMap.entrySet().iterator();
        return it2.hasNext() ? it2.next().getValue().getsClient().c() : com.join.mgps.socket.entity.b.f54683j;
    }

    public boolean isShutDown() {
        ServerSocket serverSocket = this.mserverSocket;
        if (serverSocket == null) {
            return true;
        }
        return serverSocket.isClosed();
    }

    public void run() {
        ServerSocket serverSocket = this.mserverSocket;
        if (serverSocket == null || serverSocket.isClosed()) {
            new a().start();
        }
    }

    public void send(InputStream inputStream) {
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
        for (Map.Entry<String, Client> entry : this.clientMap.entrySet()) {
            entry.getValue().getsClient().e(bArr);
        }
    }

    public void shutDown() {
        try {
            if (this.mserverSocket != null) {
                send(c.f49030u.getBytes("gbk"));
                close();
                this.mserverSocket.close();
            }
            this.isrun = Boolean.FALSE;
            this.mserverSocket = null;
            System.gc();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }
}
