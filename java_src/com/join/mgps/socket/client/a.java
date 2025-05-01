package com.join.mgps.socket.client;

import android.content.Context;
import com.join.mgps.socket.c;
import com.join.mgps.socket.d;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/* compiled from: ClientService.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: i  reason: collision with root package name */
    private static final String f54629i = "a";

    /* renamed from: a  reason: collision with root package name */
    private Context f54630a;

    /* renamed from: c  reason: collision with root package name */
    c f54632c;

    /* renamed from: d  reason: collision with root package name */
    d f54633d;

    /* renamed from: e  reason: collision with root package name */
    Socket f54634e;

    /* renamed from: h  reason: collision with root package name */
    com.join.mgps.socket.b f54637h;

    /* renamed from: b  reason: collision with root package name */
    ExecutorService f54631b = Executors.newCachedThreadPool();

    /* renamed from: f  reason: collision with root package name */
    b f54635f = null;

    /* renamed from: g  reason: collision with root package name */
    Future f54636g = null;

    /* compiled from: ClientService.java */
    /* renamed from: com.join.mgps.socket.client.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class RunnableC0382a implements Runnable {
        RunnableC0382a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f();
            a.this.c();
            a.this.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClientService.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        volatile boolean f54639b = true;

        b() {
        }

        public void a(boolean z4) {
            this.f54639b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (this.f54639b) {
                try {
                    a.this.f54637h.k();
                    Thread.sleep(1000L);
                } catch (InterruptedException e5) {
                    Thread.currentThread().interrupt();
                    e5.printStackTrace();
                }
            }
        }
    }

    public a(Context context, Socket socket) {
        this.f54630a = context;
        this.f54634e = socket;
        a(socket);
        this.f54637h = com.join.mgps.socket.b.d();
    }

    void a(Socket socket) {
        if (socket == null || !socket.isConnected()) {
            return;
        }
        this.f54632c = new c(socket, this.f54630a);
        this.f54633d = new d(socket, this.f54630a);
        this.f54631b.execute(this.f54632c);
        this.f54631b.execute(this.f54633d);
    }

    public void b() {
        new Thread(new RunnableC0382a()).start();
    }

    void c() {
        c cVar = this.f54632c;
        if (cVar != null) {
            cVar.h(false);
            this.f54632c.a();
        }
        d dVar = this.f54633d;
        if (dVar != null) {
            dVar.g(false);
            this.f54633d.a();
        }
        ExecutorService executorService = this.f54631b;
        if (executorService != null) {
            executorService.shutdownNow();
        }
    }

    void d() {
        Socket socket = this.f54634e;
        if (socket == null || socket.isClosed()) {
            return;
        }
        try {
            this.f54634e.close();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }

    public void e() {
        b bVar = new b();
        this.f54635f = bVar;
        this.f54636g = this.f54631b.submit(bVar);
    }

    public void f() {
        if (this.f54636g == null || this.f54635f == null) {
            return;
        }
        this.f54635f.a(false);
        this.f54636g.cancel(true);
    }
}
