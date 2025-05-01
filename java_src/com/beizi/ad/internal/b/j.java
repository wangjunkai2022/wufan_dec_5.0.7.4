package com.beizi.ad.internal.b;

import android.text.TextUtils;
import com.beizi.ad.internal.utilities.HaoboLog;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
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
public class j {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f5817a = Executors.newSingleThreadExecutor();

    /* renamed from: b  reason: collision with root package name */
    private final String f5818b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5819c;

    /* compiled from: Pinger.java */
    /* loaded from: classes2.dex */
    private class a implements Callable<Boolean> {
        private a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() throws Exception {
            return Boolean.valueOf(j.this.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(String str, int i4) {
        this.f5818b = (String) k.a(str);
        this.f5819c = i4;
    }

    private String b() {
        String a5 = com.beizi.ad.lance.a.b.a("aHR0cDovLyVzOiVkLyVz");
        if (TextUtils.isEmpty(a5)) {
            return null;
        }
        return String.format(Locale.US, a5, this.f5818b, Integer.valueOf(this.f5819c), "ping");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(int i4, int i5) {
        k.a(i4 >= 1);
        k.a(i5 > 0);
        int i6 = 0;
        while (i6 < i4) {
            try {
            } catch (InterruptedException e5) {
                e = e5;
                HaoboLog.e(HaoboLog.pingerLogTag, "Error pinging server due to unexpected error", e);
            } catch (ExecutionException e6) {
                e = e6;
                HaoboLog.e(HaoboLog.pingerLogTag, "Error pinging server due to unexpected error", e);
            } catch (TimeoutException unused) {
                String str = HaoboLog.pingerLogTag;
                HaoboLog.w(str, "Error pinging server (attempt: " + i6 + ", timeout: " + i5 + "). ");
            }
            if (((Boolean) this.f5817a.submit(new a()).get(i5, TimeUnit.MILLISECONDS)).booleanValue()) {
                return true;
            }
            i6++;
            i5 *= 2;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str) {
        return "ping".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Socket socket) throws IOException {
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
        outputStream.write("ping ok".getBytes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() throws m {
        h hVar = new h(b());
        try {
            byte[] bytes = "ping ok".getBytes();
            hVar.a(0);
            byte[] bArr = new byte[bytes.length];
            hVar.a(bArr);
            boolean equals = Arrays.equals(bytes, bArr);
            String str = HaoboLog.pingerLogTag;
            HaoboLog.i(str, "Ping response: `" + new String(bArr) + "`, pinged? " + equals);
            return equals;
        } catch (m e5) {
            HaoboLog.e(HaoboLog.pingerLogTag, "Error reading ping response", e5);
            return false;
        } finally {
            hVar.b();
        }
    }
}
