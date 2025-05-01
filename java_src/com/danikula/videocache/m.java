package com.danikula.videocache;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Pinger.java */
/* loaded from: classes2.dex */
public class m {

    /* renamed from: d  reason: collision with root package name */
    private static final String f10121d = "ping";

    /* renamed from: e  reason: collision with root package name */
    private static final String f10122e = "ping ok";

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f10123a = Executors.newSingleThreadExecutor();

    /* renamed from: b  reason: collision with root package name */
    private final String f10124b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10125c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Pinger.java */
    /* loaded from: classes2.dex */
    public class b implements Callable<Boolean> {
        private b() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() throws Exception {
            return Boolean.valueOf(m.this.f());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(String str, int i4) {
        this.f10124b = (String) n.d(str);
        this.f10125c = i4;
    }

    private List<Proxy> b() {
        try {
            return ProxySelector.getDefault().select(new URI(c()));
        } catch (URISyntaxException e5) {
            throw new IllegalStateException(e5);
        }
    }

    private String c() {
        return String.format(Locale.US, "http://%s:%d/%s", this.f10124b, Integer.valueOf(this.f10125c), f10121d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() throws ProxyCacheException {
        k kVar = new k(c());
        try {
            byte[] bytes = f10122e.getBytes();
            kVar.a(0L);
            byte[] bArr = new byte[bytes.length];
            kVar.read(bArr);
            boolean equals = Arrays.equals(bytes, bArr);
            h.h("Ping response: `" + new String(bArr) + "`, pinged? " + equals);
            return equals;
        } catch (ProxyCacheException e5) {
            h.f("Error reading ping response", e5);
            return false;
        } finally {
            kVar.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(String str) {
        return f10121d.equals(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e(int i4, int i5) {
        n.b(i4 >= 1);
        n.b(i5 > 0);
        int i6 = 0;
        while (i6 < i4) {
            try {
            } catch (InterruptedException e5) {
                e = e5;
                h.f("Error pinging server due to unexpected error", e);
            } catch (ExecutionException e6) {
                e = e6;
                h.f("Error pinging server due to unexpected error", e);
            } catch (TimeoutException unused) {
                h.j("Error pinging server (attempt: " + i6 + ", timeout: " + i5 + "). ");
            }
            if (((Boolean) this.f10123a.submit(new b()).get(i5, TimeUnit.MILLISECONDS)).booleanValue()) {
                return true;
            }
            i6++;
            i5 *= 2;
        }
        String format = String.format(Locale.US, "Error pinging server (attempts: %d, max timeout: %d). If you see this message, please, report at https://github.com/danikula/AndroidVideoCache/issues/134. Default proxies are: %s", Integer.valueOf(i6), Integer.valueOf(i5 / 2), b());
        h.f(format, new ProxyCacheException(format));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Socket socket) throws IOException {
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
        outputStream.write(f10122e.getBytes());
    }
}
