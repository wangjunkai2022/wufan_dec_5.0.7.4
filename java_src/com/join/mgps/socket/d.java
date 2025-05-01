package com.join.mgps.socket;

import android.content.Context;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.h0;
import com.join.mgps.socket.entity.e;
import com.join.mgps.socket.entity.h;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
/* compiled from: SocketSendService.java */
/* loaded from: classes2.dex */
public class d implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    private static final String f54641n = d.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    Socket f54644d;

    /* renamed from: e  reason: collision with root package name */
    Context f54645e;

    /* renamed from: k  reason: collision with root package name */
    a f54651k;

    /* renamed from: b  reason: collision with root package name */
    DataOutputStream f54642b = null;

    /* renamed from: c  reason: collision with root package name */
    BufferedInputStream f54643c = null;

    /* renamed from: f  reason: collision with root package name */
    long f54646f = 0;

    /* renamed from: g  reason: collision with root package name */
    long f54647g = 0;

    /* renamed from: h  reason: collision with root package name */
    String f54648h = null;

    /* renamed from: i  reason: collision with root package name */
    String f54649i = null;

    /* renamed from: j  reason: collision with root package name */
    int f54650j = 2;

    /* renamed from: l  reason: collision with root package name */
    boolean f54652l = true;

    /* renamed from: m  reason: collision with root package name */
    String f54653m = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SocketSendService.java */
    /* loaded from: classes2.dex */
    public class a extends Thread {

        /* renamed from: b  reason: collision with root package name */
        volatile boolean f54654b = true;

        a() {
        }

        public void a(boolean z4) {
            this.f54654b = z4;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            while (this.f54654b) {
                try {
                    d.this.d();
                    Thread.sleep(1000L);
                } catch (InterruptedException e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    public d(Socket socket, Context context) {
        this.f54644d = socket;
        this.f54645e = context;
    }

    public void a() {
        try {
            DataOutputStream dataOutputStream = this.f54642b;
            if (dataOutputStream != null) {
                dataOutputStream.close();
            }
            BufferedInputStream bufferedInputStream = this.f54643c;
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
        } catch (SocketException e5) {
            StringBuilder sb = new StringBuilder();
            sb.append(e5.getClass().getName());
            sb.append(":");
            sb.append(e5.getMessage());
        } catch (IOException e6) {
            e6.printStackTrace();
        }
    }

    int b(long j4, long j5) {
        int i4 = (int) ((((float) j5) / ((float) j4)) * 100.0f);
        StringBuilder sb = new StringBuilder();
        sb.append("getReceiverProgress: ");
        sb.append(i4);
        sb.append(":::size::::");
        sb.append(j5);
        return i4;
    }

    void c(int i4) {
        a aVar = this.f54651k;
        if (aVar != null) {
            aVar.a(false);
        }
        this.f54650j = i4;
        d();
    }

    void d() {
        a aVar;
        int b5 = b(this.f54647g, this.f54646f);
        com.join.mgps.socket.entity.c cVar = new com.join.mgps.socket.entity.c();
        cVar.f54696u = b5;
        cVar.f54694s = this.f54648h;
        cVar.f54695t = this.f54653m;
        int i4 = this.f54650j;
        cVar.f54697v = i4;
        cVar.f54673a = 1;
        cVar.f54699x = this.f54649i;
        cVar.f54698w = 0;
        if ((i4 == 3 || i4 == 4) && (aVar = this.f54651k) != null && aVar.f54654b) {
            return;
        }
        org.greenrobot.eventbus.c.f().o(cVar);
    }

    void e(com.join.mgps.socket.entity.d dVar) {
        a aVar;
        if (this.f54642b == null || dVar == null) {
            return;
        }
        this.f54646f = 0L;
        this.f54647g = 0L;
        this.f54648h = null;
        String b5 = dVar.b();
        this.f54653m = b5;
        this.f54649i = null;
        if (h0.x(b5)) {
            try {
                try {
                    this.f54643c = new BufferedInputStream(new FileInputStream(new File(this.f54653m)));
                    this.f54642b.writeInt(2);
                    this.f54642b.flush();
                    long c5 = dVar.c();
                    this.f54647g = c5;
                    this.f54642b.writeLong(c5);
                    this.f54642b.flush();
                    String a5 = dVar.a();
                    this.f54648h = a5;
                    this.f54642b.writeUTF(a5);
                    this.f54642b.flush();
                    String d5 = dVar.d();
                    this.f54649i = d5;
                    this.f54642b.writeUTF(d5);
                    this.f54642b.flush();
                    byte[] bArr = new byte[1048576];
                    a aVar2 = new a();
                    this.f54651k = aVar2;
                    aVar2.start();
                    while (true) {
                        int read = this.f54643c.read(bArr, 0, 1048576);
                        if (read == -1) {
                            break;
                        }
                        this.f54642b.write(bArr, 0, read);
                        long j4 = this.f54646f + read;
                        this.f54646f = j4;
                        if (j4 < this.f54647g) {
                            this.f54650j = 2;
                        } else {
                            c(3);
                        }
                    }
                    this.f54642b.flush();
                    this.f54643c.close();
                    aVar = this.f54651k;
                    if (aVar == null) {
                        return;
                    }
                } catch (Exception e5) {
                    c(4);
                    e5.printStackTrace();
                    aVar = this.f54651k;
                    if (aVar == null) {
                        return;
                    }
                }
                aVar.a(false);
            } catch (Throwable th) {
                a aVar3 = this.f54651k;
                if (aVar3 != null) {
                    aVar3.a(false);
                }
                throw th;
            }
        }
    }

    void f(h hVar) {
        String a5 = hVar.a();
        if (this.f54642b == null || g2.h(a5)) {
            return;
        }
        try {
            if (!a5.equals(com.join.mgps.socket.entity.a.f54660f)) {
                a5.equals(com.join.mgps.socket.entity.a.f54661g);
            }
            this.f54642b.writeInt(1);
            this.f54642b.flush();
            this.f54642b.writeUTF(a5);
            this.f54642b.flush();
            StringBuilder sb = new StringBuilder();
            sb.append("receiverText: 发送的文本数据为");
            sb.append(a5);
        } catch (SocketException e5) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e5.getClass().getName());
            sb2.append(":");
            sb2.append(e5.getMessage());
        } catch (IOException e6) {
            e6.printStackTrace();
        }
    }

    public void g(boolean z4) {
        this.f54652l = z4;
    }

    @Override // java.lang.Runnable
    public void run() {
        e c5;
        try {
            this.f54642b = new DataOutputStream(new BufferedOutputStream(this.f54644d.getOutputStream()));
            while (this.f54652l) {
                Socket socket = this.f54644d;
                if (socket != null && this.f54642b != null && !socket.isClosed() && (c5 = com.join.mgps.socket.a.b().c()) != null) {
                    if (c5 instanceof h) {
                        f((h) c5);
                    } else if (c5 instanceof com.join.mgps.socket.entity.d) {
                        e((com.join.mgps.socket.entity.d) c5);
                    }
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e5) {
                        Thread.currentThread().interrupt();
                        e5.printStackTrace();
                    }
                }
            }
        } catch (IOException e6) {
            e6.printStackTrace();
        }
    }
}
