package com.join.mgps.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.join.mgps.socket.entity.f;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
/* loaded from: classes4.dex */
public class SocketServerService extends Service {

    /* renamed from: c  reason: collision with root package name */
    private static final String f54553c = SocketServerService.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private a f54554b = new a();

    /* loaded from: classes4.dex */
    public class a extends Binder {
        private ServerSocket mSocketService;
        private boolean mointor = true;
        private Socket mSocket = null;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.join.mgps.service.SocketServerService$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class RunnableC0379a implements Runnable {
            RunnableC0379a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                String unused = SocketServerService.f54553c;
                while (a.this.mointor) {
                    try {
                        a aVar = a.this;
                        aVar.mSocket = aVar.mSocketService.accept();
                        a.this.mointor = false;
                        a.this.postSocketConnectedStatus(1);
                        String unused2 = SocketServerService.f54553c;
                    } catch (IOException e5) {
                        a.this.postSocketConnectedStatus(2);
                        a.this.mointor = false;
                        e5.printStackTrace();
                    }
                }
            }
        }

        public a() {
        }

        private void acceptClient() {
            new Thread(new RunnableC0379a()).start();
        }

        public Socket getSocket() {
            return this.mSocket;
        }

        public void newServerSocket() {
            try {
                String unused = SocketServerService.f54553c;
                ServerSocket serverSocket = new ServerSocket();
                this.mSocketService = serverSocket;
                serverSocket.setReceiveBufferSize(1048576);
                this.mSocketService.bind(new InetSocketAddress(4000));
                acceptClient();
            } catch (IOException e5) {
                postSocketConnectedStatus(2);
                e5.printStackTrace();
            }
        }

        void postSocketConnectedStatus(int i4) {
            f fVar = new f();
            fVar.f54710a = i4;
            org.greenrobot.eventbus.c.f().o(fVar);
        }

        public void setMonitor(boolean z4) {
            this.mointor = z4;
        }
    }

    void b() {
        a aVar = this.f54554b;
        if (aVar == null) {
            return;
        }
        if (aVar.mSocketService != null && !this.f54554b.mSocketService.isClosed()) {
            try {
                this.f54554b.mSocketService.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
        if (this.f54554b.mSocket == null || this.f54554b.mSocket.isClosed()) {
            return;
        }
        try {
            this.f54554b.mSocket.close();
        } catch (IOException e6) {
            e6.printStackTrace();
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return this.f54554b;
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
        return 1;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return true;
    }
}
