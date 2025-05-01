package com.danikula.videocache;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: HttpProxyCacheServer.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: i  reason: collision with root package name */
    private static final String f10081i = "127.0.0.1";

    /* renamed from: a  reason: collision with root package name */
    private final Object f10082a;

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f10083b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, j> f10084c;

    /* renamed from: d  reason: collision with root package name */
    private final ServerSocket f10085d;

    /* renamed from: e  reason: collision with root package name */
    private final int f10086e;

    /* renamed from: f  reason: collision with root package name */
    private final Thread f10087f;

    /* renamed from: g  reason: collision with root package name */
    private final e f10088g;

    /* renamed from: h  reason: collision with root package name */
    private final m f10089h;

    /* compiled from: HttpProxyCacheServer.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: f  reason: collision with root package name */
        private static final long f10090f = 536870912;

        /* renamed from: a  reason: collision with root package name */
        private File f10091a;

        /* renamed from: d  reason: collision with root package name */
        private com.danikula.videocache.sourcestorage.c f10094d;

        /* renamed from: c  reason: collision with root package name */
        private com.danikula.videocache.file.a f10093c = new com.danikula.videocache.file.h(536870912);

        /* renamed from: b  reason: collision with root package name */
        private com.danikula.videocache.file.c f10092b = new com.danikula.videocache.file.f();

        /* renamed from: e  reason: collision with root package name */
        private b0.b f10095e = new b0.a();

        public b(Context context) {
            this.f10094d = com.danikula.videocache.sourcestorage.d.b(context);
            this.f10091a = s.c(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public e c() {
            return new e(this.f10091a, this.f10092b, this.f10093c, this.f10094d, this.f10095e);
        }

        public i b() {
            return new i(c());
        }

        public b d(File file) {
            this.f10091a = (File) n.d(file);
            return this;
        }

        public b e(com.danikula.videocache.file.a aVar) {
            this.f10093c = (com.danikula.videocache.file.a) n.d(aVar);
            return this;
        }

        public b f(com.danikula.videocache.file.c cVar) {
            this.f10092b = (com.danikula.videocache.file.c) n.d(cVar);
            return this;
        }

        public b g(b0.b bVar) {
            this.f10095e = (b0.b) n.d(bVar);
            return this;
        }

        public b h(int i4) {
            this.f10093c = new com.danikula.videocache.file.g(i4);
            return this;
        }

        public b i(long j4) {
            this.f10093c = new com.danikula.videocache.file.h(j4);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HttpProxyCacheServer.java */
    /* loaded from: classes2.dex */
    public final class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final Socket f10096b;

        public c(Socket socket) {
            this.f10096b = socket;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.o(this.f10096b);
        }
    }

    /* compiled from: HttpProxyCacheServer.java */
    /* loaded from: classes2.dex */
    private final class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final CountDownLatch f10098b;

        public d(CountDownLatch countDownLatch) {
            this.f10098b = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10098b.countDown();
            i.this.w();
        }
    }

    private String c(String str) {
        return String.format(Locale.US, "http://%s:%d/%s", f10081i, Integer.valueOf(this.f10086e), p.f(str));
    }

    private void d(Socket socket) {
        try {
            if (socket.isClosed()) {
                return;
            }
            socket.close();
        } catch (IOException unused) {
        }
    }

    private void e(Socket socket) {
        try {
            if (socket.isInputShutdown()) {
                return;
            }
            socket.shutdownInput();
        } catch (SocketException | IOException unused) {
        }
    }

    private void f(Socket socket) {
        try {
            if (socket.isOutputShutdown()) {
                return;
            }
            socket.shutdownOutput();
        } catch (IOException e5) {
            h.k("Failed to close socket on proxy side: {}. It seems client have already closed connection.", e5.getMessage());
        }
    }

    private File g(String str) {
        e eVar = this.f10088g;
        return new File(eVar.f10055a, eVar.f10056b.generate(str));
    }

    private j h(String str) throws ProxyCacheException {
        j jVar;
        synchronized (this.f10082a) {
            jVar = this.f10084c.get(str);
            if (jVar == null) {
                jVar = new j(str, this.f10088g);
                this.f10084c.put(str, jVar);
            }
        }
        return jVar;
    }

    private int i() {
        int i4;
        synchronized (this.f10082a) {
            i4 = 0;
            for (j jVar : this.f10084c.values()) {
                i4 += jVar.b();
            }
        }
        return i4;
    }

    private boolean l() {
        return this.f10089h.e(3, 70);
    }

    private void n(Throwable th) {
        h.g("HttpProxyCacheServer error", th.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(Socket socket) {
        StringBuilder sb;
        try {
            try {
                f c5 = f.c(socket.getInputStream());
                String e5 = p.e(c5.f10062a);
                if (this.f10089h.d(e5)) {
                    this.f10089h.g(socket);
                } else {
                    h(e5).d(c5, socket);
                }
                q(socket);
                sb = new StringBuilder();
            } catch (Throwable th) {
                q(socket);
                h.h("Opened connections: " + i());
                throw th;
            }
        } catch (ProxyCacheException e6) {
            e = e6;
            n(new ProxyCacheException("Error processing request", e));
            q(socket);
            sb = new StringBuilder();
        } catch (SocketException unused) {
            q(socket);
            sb = new StringBuilder();
        } catch (IOException e7) {
            e = e7;
            n(new ProxyCacheException("Error processing request", e));
            q(socket);
            sb = new StringBuilder();
        }
        sb.append("Opened connections: ");
        sb.append(i());
        h.h(sb.toString());
    }

    private void q(Socket socket) {
        e(socket);
        f(socket);
        d(socket);
    }

    private void s() {
        synchronized (this.f10082a) {
            for (j jVar : this.f10084c.values()) {
                jVar.f();
            }
            this.f10084c.clear();
        }
    }

    private void t(File file) {
        try {
            this.f10088g.f10057c.a(file);
        } catch (IOException e5) {
            h.f("Error touching file " + file, e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                this.f10083b.submit(new c(this.f10085d.accept()));
            } catch (IOException e5) {
                n(new ProxyCacheException("Error during waiting connection", e5));
                return;
            }
        }
    }

    public String j(String str) {
        return k(str, true);
    }

    public String k(String str, boolean z4) {
        if (!z4 || !m(str)) {
            return l() ? c(str) : str;
        }
        File g4 = g(str);
        t(g4);
        return Uri.fromFile(g4).toString();
    }

    public boolean m(String str) {
        n.e(str, "Url can't be null!");
        return g(str).exists();
    }

    public void p(com.danikula.videocache.d dVar, String str) {
        n.a(dVar, str);
        synchronized (this.f10082a) {
            try {
                h(str).e(dVar);
            } catch (ProxyCacheException e5) {
                h.k("Error registering cache listener", e5.getMessage());
            }
        }
    }

    public void r() {
        h.h("Shutdown proxy server");
        s();
        this.f10088g.f10058d.release();
        this.f10087f.interrupt();
        try {
            if (this.f10085d.isClosed()) {
                return;
            }
            this.f10085d.close();
        } catch (IOException e5) {
            n(new ProxyCacheException("Error shutting down proxy server", e5));
        }
    }

    public void u(com.danikula.videocache.d dVar) {
        n.d(dVar);
        synchronized (this.f10082a) {
            for (j jVar : this.f10084c.values()) {
                jVar.h(dVar);
            }
        }
    }

    public void v(com.danikula.videocache.d dVar, String str) {
        n.a(dVar, str);
        synchronized (this.f10082a) {
            try {
                h(str).h(dVar);
            } catch (ProxyCacheException e5) {
                h.k("Error registering cache listener", e5.getMessage());
            }
        }
    }

    public i(Context context) {
        this(new b(context).c());
    }

    private i(e eVar) {
        this.f10082a = new Object();
        this.f10083b = Executors.newFixedThreadPool(8);
        this.f10084c = new ConcurrentHashMap();
        this.f10088g = (e) n.d(eVar);
        try {
            ServerSocket serverSocket = new ServerSocket(0, 8, InetAddress.getByName(f10081i));
            this.f10085d = serverSocket;
            int localPort = serverSocket.getLocalPort();
            this.f10086e = localPort;
            l.a(f10081i, localPort);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Thread thread = new Thread(new d(countDownLatch));
            this.f10087f = thread;
            thread.start();
            countDownLatch.await();
            this.f10089h = new m(f10081i, localPort);
            h.h("Proxy cache server started. Is it alive? " + l());
        } catch (IOException | InterruptedException e5) {
            this.f10083b.shutdown();
            throw new IllegalStateException("Error starting local proxy server", e5);
        }
    }
}
