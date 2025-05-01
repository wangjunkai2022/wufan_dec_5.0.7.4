package com.join.mgps.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.join.mgps.Util.t1;
import com.join.mgps.socket.entity.f;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
/* loaded from: classes4.dex */
public class SocketClientService extends Service {

    /* renamed from: e  reason: collision with root package name */
    private static final String f54548e = SocketClientService.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    String f54549b;

    /* renamed from: c  reason: collision with root package name */
    public a f54550c = new a();

    /* renamed from: d  reason: collision with root package name */
    int f54551d = 3;

    /* loaded from: classes4.dex */
    public class a extends Binder {
        public Socket socket = null;

        /* renamed from: com.join.mgps.service.SocketClientService$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class RunnableC0378a implements Runnable {
            RunnableC0378a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                while (SocketClientService.this.f54551d > 0) {
                    try {
                        t1.b(1000);
                        a.this.socket = new Socket();
                        a.this.socket.setKeepAlive(true);
                        a.this.socket.setTcpNoDelay(true);
                        a.this.socket.setSoLinger(true, 0);
                        a.this.socket.setSendBufferSize(1048576);
                        a.this.socket.setReceiveBufferSize(1048576);
                        a.this.socket.connect(new InetSocketAddress(SocketClientService.this.f54549b, 4000), 10000);
                        a.this.postSocketConnectedStatus(1);
                        String unused = SocketClientService.f54548e;
                        SocketClientService.this.f54551d = 0;
                    } catch (Exception e5) {
                        SocketClientService socketClientService = SocketClientService.this;
                        int i4 = socketClientService.f54551d - 1;
                        socketClientService.f54551d = i4;
                        if (i4 <= 0) {
                            String unused2 = SocketClientService.f54548e;
                            a.this.postSocketConnectedStatus(2);
                        }
                        e5.printStackTrace();
                    }
                }
            }
        }

        public a() {
        }

        public Socket getSocket() {
            return this.socket;
        }

        public void newSocket() {
            new Thread(new RunnableC0378a()).start();
        }

        void postSocketConnectedStatus(int i4) {
            f fVar = new f();
            fVar.f54710a = i4;
            org.greenrobot.eventbus.c.f().o(fVar);
        }
    }

    void b() {
        Socket socket;
        a aVar = this.f54550c;
        if (aVar == null || (socket = aVar.socket) == null || socket.isClosed()) {
            return;
        }
        try {
            this.f54550c.socket.close();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        this.f54549b = intent.getStringExtra(com.alipay.sdk.cons.c.f4843f);
        return this.f54550c;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        b();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        this.f54551d = 3;
        return 1;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return true;
    }
}
