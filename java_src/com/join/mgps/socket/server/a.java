package com.join.mgps.socket.server;

import android.content.Context;
import com.join.mgps.socket.c;
import com.join.mgps.socket.d;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: SocketService.java */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: f  reason: collision with root package name */
    private static final String f54857f = "a";

    /* renamed from: a  reason: collision with root package name */
    private ExecutorService f54858a = Executors.newCachedThreadPool();

    /* renamed from: b  reason: collision with root package name */
    private Context f54859b;

    /* renamed from: c  reason: collision with root package name */
    Socket f54860c;

    /* renamed from: d  reason: collision with root package name */
    c f54861d;

    /* renamed from: e  reason: collision with root package name */
    d f54862e;

    /* compiled from: SocketService.java */
    /* renamed from: com.join.mgps.socket.server.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class RunnableC0386a implements Runnable {
        RunnableC0386a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.c();
            a.this.d();
        }
    }

    public a(Context context, Socket socket) {
        this.f54859b = context;
        this.f54860c = socket;
        a(socket);
    }

    void a(Socket socket) {
        if (socket == null || !socket.isConnected()) {
            return;
        }
        this.f54861d = new c(socket, this.f54859b);
        this.f54862e = new d(socket, this.f54859b);
        this.f54858a.execute(this.f54861d);
        this.f54858a.execute(this.f54862e);
    }

    public void b() {
        new Thread(new RunnableC0386a()).start();
    }

    void c() {
        c cVar = this.f54861d;
        if (cVar != null) {
            cVar.h(false);
            this.f54861d.a();
        }
        d dVar = this.f54862e;
        if (dVar != null) {
            dVar.g(false);
            this.f54862e.a();
        }
        ExecutorService executorService = this.f54858a;
        if (executorService == null || executorService.isShutdown()) {
            return;
        }
        this.f54858a.shutdownNow();
    }

    void d() {
        Socket socket = this.f54860c;
        if (socket == null || socket.isClosed()) {
            return;
        }
        try {
            this.f54860c.close();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }
}
