package com.beizi.ad.internal.b;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.beizi.ad.internal.utilities.HaoboLog;
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
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: HttpProxyCacheServer.java */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final Object f5789a;

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f5790b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, g> f5791c;

    /* renamed from: d  reason: collision with root package name */
    private final ServerSocket f5792d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5793e;

    /* renamed from: f  reason: collision with root package name */
    private final Thread f5794f;

    /* renamed from: g  reason: collision with root package name */
    private final com.beizi.ad.internal.b.c f5795g;

    /* renamed from: h  reason: collision with root package name */
    private final j f5796h;

    /* compiled from: HttpProxyCacheServer.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private File f5797a;

        /* renamed from: d  reason: collision with root package name */
        private com.beizi.ad.internal.b.b.c f5800d;

        /* renamed from: c  reason: collision with root package name */
        private com.beizi.ad.internal.b.a.a f5799c = new com.beizi.ad.internal.b.a.g(IjkMediaMeta.AV_CH_STEREO_LEFT);

        /* renamed from: b  reason: collision with root package name */
        private com.beizi.ad.internal.b.a.c f5798b = new com.beizi.ad.internal.b.a.f();

        public a(Context context) {
            this.f5800d = com.beizi.ad.internal.b.b.d.a(context);
            this.f5797a = q.a(context);
        }

        private com.beizi.ad.internal.b.c b() {
            return new com.beizi.ad.internal.b.c(this.f5797a, this.f5798b, this.f5799c, this.f5800d);
        }

        public a a(long j4) {
            this.f5799c = new com.beizi.ad.internal.b.a.g(j4);
            return this;
        }

        public f a() {
            return new f(b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HttpProxyCacheServer.java */
    /* loaded from: classes2.dex */
    public final class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final Socket f5802b;

        public b(Socket socket) {
            this.f5802b = socket;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.a(this.f5802b);
        }
    }

    /* compiled from: HttpProxyCacheServer.java */
    /* loaded from: classes2.dex */
    private final class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final CountDownLatch f5804b;

        public c(CountDownLatch countDownLatch) {
            this.f5804b = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5804b.countDown();
            f.this.b();
        }
    }

    private String c(String str) {
        String a5 = com.beizi.ad.lance.a.b.a("aHR0cDovLyVzOiVkLyVz");
        if (TextUtils.isEmpty(a5)) {
            return null;
        }
        return String.format(Locale.US, a5, com.beizi.ad.lance.a.b.a("MTI3LjAuMC4x"), Integer.valueOf(this.f5793e), n.b(str));
    }

    private File d(String str) {
        com.beizi.ad.internal.b.c cVar = this.f5795g;
        return new File(cVar.f5777a, cVar.f5778b.a(str));
    }

    private g e(String str) throws m {
        g gVar;
        synchronized (this.f5789a) {
            gVar = this.f5791c.get(str);
            if (gVar == null) {
                gVar = new g(str, this.f5795g);
                this.f5791c.put(str, gVar);
            }
        }
        return gVar;
    }

    public boolean b(String str) {
        k.a(str, "Url can't be null!");
        return d(str).exists();
    }

    private f(com.beizi.ad.internal.b.c cVar) {
        this.f5789a = new Object();
        this.f5790b = Executors.newFixedThreadPool(8);
        this.f5791c = new ConcurrentHashMap();
        this.f5795g = (com.beizi.ad.internal.b.c) k.a(cVar);
        try {
            ServerSocket serverSocket = new ServerSocket(0, 8, InetAddress.getByName(com.beizi.ad.lance.a.b.a("MTI3LjAuMC4x")));
            this.f5792d = serverSocket;
            int localPort = serverSocket.getLocalPort();
            this.f5793e = localPort;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Thread thread = new Thread(new c(countDownLatch));
            this.f5794f = thread;
            thread.start();
            countDownLatch.await();
            this.f5796h = new j(com.beizi.ad.lance.a.b.a("MTI3LjAuMC4x"), localPort);
            String str = HaoboLog.httpProxyCacheServerLogTag;
            HaoboLog.i(str, "Proxy cache server started. Is it alive? " + a());
        } catch (IOException | InterruptedException e5) {
            this.f5790b.shutdown();
            throw new IllegalStateException("Error starting local proxy server", e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Socket accept = this.f5792d.accept();
                String str = HaoboLog.httpProxyCacheServerLogTag;
                HaoboLog.d(str, "Accept new socket " + accept);
                this.f5790b.submit(new b(accept));
            } catch (IOException e5) {
                a(new m("Error during waiting connection", e5));
                return;
            }
        }
    }

    public String a(String str) {
        return a(str, true);
    }

    private int c() {
        int i4;
        synchronized (this.f5789a) {
            i4 = 0;
            for (g gVar : this.f5791c.values()) {
                i4 += gVar.a();
            }
        }
        return i4;
    }

    private void d(Socket socket) {
        try {
            if (socket.isOutputShutdown()) {
                return;
            }
            socket.shutdownOutput();
        } catch (IOException e5) {
            HaoboLog.w(HaoboLog.httpProxyCacheServerLogTag, "Failed to close socket on proxy side: {}. It seems client have already closed connection.", e5);
        }
    }

    public String a(String str, boolean z4) {
        if (!z4 || !b(str)) {
            return a() ? c(str) : str;
        }
        File d5 = d(str);
        a(d5);
        return Uri.fromFile(d5).toString();
    }

    private void e(Socket socket) {
        try {
            if (socket.isClosed()) {
                return;
            }
            socket.close();
        } catch (IOException e5) {
            a(new m("Error closing socket", e5));
        }
    }

    private void b(Socket socket) {
        c(socket);
        d(socket);
        e(socket);
    }

    private boolean a() {
        return this.f5796h.a(3, 70);
    }

    private void c(Socket socket) {
        try {
            if (socket.isInputShutdown()) {
                return;
            }
            socket.shutdownInput();
        } catch (SocketException unused) {
        } catch (IOException e5) {
            a(new m("Error closing socket input stream", e5));
        }
    }

    private void a(File file) {
        try {
            this.f5795g.f5779c.a(file);
        } catch (IOException e5) {
            String str = HaoboLog.httpProxyCacheServerLogTag;
            HaoboLog.e(str, "Error touching file " + file, e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Socket socket) {
        String str;
        StringBuilder sb;
        try {
            try {
                d a5 = d.a(socket.getInputStream());
                String str2 = HaoboLog.httpProxyCacheServerLogTag;
                HaoboLog.d(str2, "Request to cache proxy:" + a5);
                String c5 = n.c(a5.f5783a);
                if (this.f5796h.a(c5)) {
                    this.f5796h.a(socket);
                } else {
                    e(c5).a(a5, socket);
                }
                b(socket);
                str = HaoboLog.httpProxyCacheServerLogTag;
                sb = new StringBuilder();
            } catch (Throwable th) {
                b(socket);
                String str3 = HaoboLog.httpProxyCacheServerLogTag;
                HaoboLog.d(str3, "Opened connections: " + c());
                throw th;
            }
        } catch (m e5) {
            e = e5;
            a(new m("Error processing request", e));
            b(socket);
            str = HaoboLog.httpProxyCacheServerLogTag;
            sb = new StringBuilder();
        } catch (SocketException unused) {
            b(socket);
            str = HaoboLog.httpProxyCacheServerLogTag;
            sb = new StringBuilder();
        } catch (IOException e6) {
            e = e6;
            a(new m("Error processing request", e));
            b(socket);
            str = HaoboLog.httpProxyCacheServerLogTag;
            sb = new StringBuilder();
        }
        sb.append("Opened connections: ");
        sb.append(c());
        HaoboLog.d(str, sb.toString());
    }

    private void a(Throwable th) {
        HaoboLog.e(HaoboLog.httpProxyCacheServerLogTag, "HttpProxyCacheServer error", th);
    }
}
