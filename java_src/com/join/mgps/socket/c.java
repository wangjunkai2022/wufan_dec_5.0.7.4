package com.join.mgps.socket;

import android.content.Context;
import com.join.mgps.Util.h0;
import com.join.mgps.Util.s1;
import com.join.mgps.socket.entity.g;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
/* compiled from: SocketReceiverService.java */
/* loaded from: classes2.dex */
public class c implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    private static final String f54613o = c.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    Socket f54614b;

    /* renamed from: e  reason: collision with root package name */
    Context f54617e;

    /* renamed from: m  reason: collision with root package name */
    a f54625m;

    /* renamed from: c  reason: collision with root package name */
    DataInputStream f54615c = null;

    /* renamed from: d  reason: collision with root package name */
    BufferedOutputStream f54616d = null;

    /* renamed from: f  reason: collision with root package name */
    long f54618f = 0;

    /* renamed from: g  reason: collision with root package name */
    long f54619g = 0;

    /* renamed from: h  reason: collision with root package name */
    String f54620h = null;

    /* renamed from: i  reason: collision with root package name */
    String f54621i = null;

    /* renamed from: j  reason: collision with root package name */
    String f54622j = null;

    /* renamed from: k  reason: collision with root package name */
    int f54623k = 0;

    /* renamed from: l  reason: collision with root package name */
    int f54624l = 1;

    /* renamed from: n  reason: collision with root package name */
    boolean f54626n = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SocketReceiverService.java */
    /* loaded from: classes2.dex */
    public class a extends Thread {

        /* renamed from: b  reason: collision with root package name */
        volatile boolean f54627b = true;

        a() {
        }

        public void a(boolean z4) {
            this.f54627b = z4;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            while (this.f54627b) {
                try {
                    c.this.d();
                    Thread.sleep(1000L);
                } catch (InterruptedException e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    public c(Socket socket, Context context) {
        this.f54614b = socket;
        this.f54617e = context;
    }

    public void a() {
        try {
            DataInputStream dataInputStream = this.f54615c;
            if (dataInputStream != null) {
                dataInputStream.close();
            }
            BufferedOutputStream bufferedOutputStream = this.f54616d;
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
        } catch (IOException e5) {
            e5.printStackTrace();
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
        a aVar = this.f54625m;
        if (aVar != null) {
            aVar.a(false);
        }
        this.f54624l = i4;
        d();
    }

    void d() {
        int b5 = b(this.f54619g, this.f54618f);
        com.join.mgps.socket.entity.c cVar = new com.join.mgps.socket.entity.c();
        cVar.f54696u = b5;
        cVar.f54694s = this.f54621i;
        int i4 = this.f54624l;
        cVar.f54697v = i4;
        cVar.f54699x = this.f54622j;
        cVar.f54695t = this.f54620h;
        cVar.f54673a = 1;
        cVar.f54698w = 1;
        if (i4 == 3 || i4 == 4) {
            StringBuilder sb = new StringBuilder();
            sb.append("receiverFile: 接收完成:::");
            sb.append(this.f54625m.f54627b);
            a aVar = this.f54625m;
            if (aVar != null && aVar.f54627b) {
                return;
            }
        }
        org.greenrobot.eventbus.c.f().o(cVar);
    }

    void e(String str) {
        g gVar = new g();
        gVar.f54711s = str;
        gVar.f54673a = 0;
        org.greenrobot.eventbus.c.f().o(gVar);
    }

    void f(DataInputStream dataInputStream) {
        if (dataInputStream == null) {
            return;
        }
        byte[] bArr = new byte[1048576];
        this.f54618f = 0L;
        this.f54619g = 0L;
        this.f54620h = null;
        this.f54621i = null;
        this.f54622j = null;
        this.f54623k = 0;
        try {
            try {
                try {
                    this.f54619g = dataInputStream.readLong();
                    StringBuilder sb = new StringBuilder();
                    sb.append("receiverFile: 文件大小 ");
                    sb.append(this.f54619g);
                    this.f54621i = dataInputStream.readUTF();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("receiverFile: 文件保存名称 ");
                    sb2.append(this.f54621i);
                    this.f54622j = dataInputStream.readUTF();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("receiverFile: 文件编号 ");
                    sb3.append(this.f54622j);
                    String str = s1.h(this.f54617e) + File.separator + this.f54621i;
                    this.f54620h = str;
                    if (!h0.y(str)) {
                        h0.B(this.f54620h);
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("receiverFile: 文件完整名 ");
                    sb4.append(this.f54620h);
                    this.f54616d = new BufferedOutputStream(new FileOutputStream(new File(this.f54620h)));
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("saveFile: 文件大小：");
                    sb5.append(this.f54619g);
                    sb5.append("::::::文件完整路径：：");
                    sb5.append(this.f54620h);
                    a aVar = new a();
                    this.f54625m = aVar;
                    aVar.start();
                    while (true) {
                        if (!this.f54626n) {
                            break;
                        }
                        long j4 = this.f54618f;
                        long j5 = this.f54619g;
                        if (1048576 + j4 > j5) {
                            int read = dataInputStream.read(bArr, 0, (int) (j5 - j4));
                            this.f54623k = read;
                            if (read != -1) {
                                this.f54616d.write(bArr, 0, read);
                                this.f54618f += this.f54623k;
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("receiverFile: 接收了多少");
                                sb6.append(this.f54623k);
                                sb6.append("----bufferSize-----");
                                if (this.f54619g > this.f54618f) {
                                    this.f54624l = 2;
                                } else {
                                    c(3);
                                    break;
                                }
                            } else {
                                c(4);
                                break;
                            }
                        } else {
                            int read2 = dataInputStream.read(bArr, 0, 1048576);
                            this.f54623k = read2;
                            if (read2 != -1) {
                                this.f54616d.write(bArr, 0, read2);
                                this.f54618f += this.f54623k;
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append("receiverFile000000: 接收了多少");
                                sb7.append(this.f54623k);
                                sb7.append("-----bufferSize------");
                                sb7.append(1048576);
                                if (this.f54619g > this.f54618f) {
                                    this.f54624l = 2;
                                } else {
                                    c(3);
                                    break;
                                }
                            } else {
                                c(4);
                                break;
                            }
                        }
                    }
                    this.f54616d.flush();
                    a aVar2 = this.f54625m;
                    if (aVar2 != null) {
                        aVar2.a(false);
                    }
                    if (this.f54616d != null) {
                        this.f54616d.close();
                    }
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            } catch (IOException e6) {
                h0.i(this.f54620h);
                c(4);
                e6.printStackTrace();
                a aVar3 = this.f54625m;
                if (aVar3 != null) {
                    aVar3.a(false);
                }
                if (this.f54616d != null) {
                    this.f54616d.close();
                }
            }
        } catch (Throwable th) {
            try {
                a aVar4 = this.f54625m;
                if (aVar4 != null) {
                    aVar4.a(false);
                }
                if (this.f54616d != null) {
                    this.f54616d.close();
                }
            } catch (IOException e7) {
                e7.printStackTrace();
            }
            throw th;
        }
    }

    void g(DataInputStream dataInputStream) {
        if (dataInputStream == null) {
            return;
        }
        try {
            String readUTF = dataInputStream.readUTF();
            e(readUTF);
            StringBuilder sb = new StringBuilder();
            sb.append("receiverText: 接收的文本数据为");
            sb.append(readUTF);
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }

    public void h(boolean z4) {
        this.f54626n = z4;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("SocketReceiverService: 接收大小");
            sb.append(this.f54614b.getReceiveBufferSize());
            this.f54615c = new DataInputStream(new BufferedInputStream(this.f54614b.getInputStream()));
            while (this.f54626n) {
                Socket socket = this.f54614b;
                if (socket != null && this.f54615c != null && !socket.isClosed()) {
                    int readInt = this.f54615c.readInt();
                    if (readInt == 1) {
                        g(this.f54615c);
                    } else if (readInt == 2) {
                        f(this.f54615c);
                    }
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e5) {
                        Thread.currentThread().interrupt();
                        e5.printStackTrace();
                    }
                }
            }
        } catch (SocketException e6) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e6.getClass().getName());
            sb2.append(":");
            sb2.append(e6.getMessage());
        } catch (IOException e7) {
            e7.printStackTrace();
        }
    }
}
