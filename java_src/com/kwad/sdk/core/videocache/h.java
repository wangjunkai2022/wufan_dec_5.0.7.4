package com.kwad.sdk.core.videocache;

import android.text.TextUtils;
import com.kwad.sdk.core.network.r;
import com.kwad.sdk.utils.aq;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
/* loaded from: classes5.dex */
public final class h extends p {
    private final com.kwad.sdk.core.videocache.d.c aCW;
    private final com.kwad.sdk.core.videocache.b.b aCX;
    private n aDu;
    private HttpURLConnection aDv;
    private InputStream aDw;

    public h(String str, com.kwad.sdk.core.videocache.d.c cVar, com.kwad.sdk.core.videocache.b.b bVar) {
        this.aCW = (com.kwad.sdk.core.videocache.d.c) aq.checkNotNull(cVar);
        this.aCX = (com.kwad.sdk.core.videocache.b.b) aq.checkNotNull(bVar);
        n eT = cVar.eT(str);
        this.aDu = eT == null ? new n(str, -2147483648L, l.eR(str)) : eT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.net.URLConnection] */
    private void Hh() {
        HttpURLConnection httpURLConnection;
        com.kwad.sdk.core.e.c.d("HttpUrlSource", "Read content info from " + this.aDu.url);
        ?? r02 = 10000;
        InputStream inputStream = null;
        try {
            try {
                httpURLConnection = c(0L, 10000);
                try {
                    long d5 = d(httpURLConnection);
                    String contentType = httpURLConnection.getContentType();
                    inputStream = httpURLConnection.getInputStream();
                    n nVar = new n(this.aDu.url, d5, contentType);
                    this.aDu = nVar;
                    this.aCW.a(nVar.url, nVar);
                    com.kwad.sdk.core.e.c.d("HttpUrlSource", "Source info fetched: " + this.aDu);
                    r02 = httpURLConnection;
                } catch (IOException unused) {
                    com.kwad.sdk.core.e.c.e("HttpUrlSource", "Error fetching info from " + this.aDu.url);
                    r02 = httpURLConnection;
                    com.kwad.sdk.crash.utils.b.closeQuietly(inputStream);
                    com.kwad.sdk.crash.utils.b.a(r02);
                }
            } catch (Throwable th) {
                th = th;
                com.kwad.sdk.crash.utils.b.closeQuietly(inputStream);
                com.kwad.sdk.crash.utils.b.a(r02);
                throw th;
            }
        } catch (IOException unused2) {
            httpURLConnection = null;
        } catch (Throwable th2) {
            th = th2;
            r02 = 0;
            com.kwad.sdk.crash.utils.b.closeQuietly(inputStream);
            com.kwad.sdk.crash.utils.b.a(r02);
            throw th;
        }
        com.kwad.sdk.crash.utils.b.closeQuietly(inputStream);
        com.kwad.sdk.crash.utils.b.a(r02);
    }

    private void Hj() {
        n eT;
        com.kwad.sdk.core.videocache.d.c cVar = this.aCW;
        if (cVar == null || !(cVar instanceof com.kwad.sdk.core.videocache.d.b) || (eT = cVar.eT(getUrl())) == null || TextUtils.isEmpty(eT.aDL) || eT.aDK == -2147483648L) {
            return;
        }
        this.aDu = eT;
    }

    private long a(HttpURLConnection httpURLConnection, long j4, int i4) {
        long d5 = d(httpURLConnection);
        return i4 == 200 ? d5 : i4 == 206 ? d5 + j4 : this.aDu.aDK;
    }

    private HttpURLConnection c(long j4, int i4) {
        String str;
        HttpURLConnection httpURLConnection;
        boolean z4;
        String str2 = this.aDu.url;
        int i5 = 0;
        do {
            StringBuilder sb = new StringBuilder("Open connection ");
            if (j4 > 0) {
                str = " with offset " + j4;
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(" to ");
            sb.append(str2);
            com.kwad.sdk.core.e.c.d("HttpUrlSource", sb.toString());
            httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
            r.wrapHttpURLConnection(httpURLConnection);
            a(httpURLConnection, str2);
            if (j4 > 0) {
                httpURLConnection.setRequestProperty("Range", "bytes=" + j4 + "-");
            }
            if (i4 > 0) {
                httpURLConnection.setConnectTimeout(i4);
                httpURLConnection.setReadTimeout(i4);
            }
            com.kwad.sdk.core.network.p.b(httpURLConnection);
            int responseCode = httpURLConnection.getResponseCode();
            z4 = responseCode == 301 || responseCode == 302 || responseCode == 303;
            if (z4) {
                str2 = httpURLConnection.getHeaderField("Location");
                i5++;
                httpURLConnection.disconnect();
            }
            if (i5 > 5) {
                throw new ProxyCacheException("Too many redirects: " + i5);
            }
        } while (z4);
        return httpURLConnection;
    }

    private static long d(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Content-Length");
        if (headerField == null) {
            return -1L;
        }
        return Long.parseLong(headerField);
    }

    @Override // com.kwad.sdk.core.videocache.p
    public final synchronized String Hi() {
        if (TextUtils.isEmpty(this.aDu.aDL)) {
            Hj();
        }
        if (TextUtils.isEmpty(this.aDu.aDL)) {
            Hh();
        }
        return this.aDu.aDL;
    }

    @Override // com.kwad.sdk.core.videocache.m
    public final void aA(long j4) {
        try {
            HttpURLConnection c5 = c(j4, -1);
            this.aDv = c5;
            String contentType = c5.getContentType();
            this.aDw = new BufferedInputStream(this.aDv.getInputStream(), 1024);
            HttpURLConnection httpURLConnection = this.aDv;
            n nVar = new n(this.aDu.url, a(httpURLConnection, j4, httpURLConnection.getResponseCode()), contentType);
            this.aDu = nVar;
            this.aCW.a(nVar.url, nVar);
        } catch (IOException e5) {
            throw new ProxyCacheException("Error opening connection for " + this.aDu.url + " with offset " + j4, e5);
        }
    }

    @Override // com.kwad.sdk.core.videocache.m
    public final void close() {
        HttpURLConnection httpURLConnection = this.aDv;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (ArrayIndexOutOfBoundsException unused) {
                com.kwad.sdk.core.e.c.e("HttpUrlSource", "Error closing connection correctly. Should happen only on Android L. If anybody know how to fix it, please visit https://github.com/danikula/AndroidVideoCache/issues/88. Until good solution is not know, just ignore this issue.");
            } catch (IllegalArgumentException e5) {
                e = e5;
                throw new RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me danikula@gmail.com or create issue here https://github.com/danikula/AndroidVideoCache/issues.", e);
            } catch (NullPointerException e6) {
                e = e6;
                throw new RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me danikula@gmail.com or create issue here https://github.com/danikula/AndroidVideoCache/issues.", e);
            }
        }
    }

    @Override // com.kwad.sdk.core.videocache.p
    public final String getUrl() {
        return this.aDu.url;
    }

    @Override // com.kwad.sdk.core.videocache.m
    public final synchronized long length() {
        if (this.aDu.aDK == -2147483648L) {
            Hj();
        }
        if (this.aDu.aDK == -2147483648L) {
            Hh();
        }
        return this.aDu.aDK;
    }

    @Override // com.kwad.sdk.core.videocache.m
    public final int read(byte[] bArr) {
        InputStream inputStream = this.aDw;
        if (inputStream != null) {
            try {
                return inputStream.read(bArr, 0, 1024);
            } catch (InterruptedIOException e5) {
                throw new InterruptedProxyCacheException("Reading source " + this.aDu.url + " is interrupted", e5);
            } catch (IOException e6) {
                throw new ProxyCacheException("Error reading data from " + this.aDu.url, e6);
            }
        }
        throw new ProxyCacheException("Error reading data from " + this.aDu.url + ": connection is absent!");
    }

    @Override // com.kwad.sdk.core.videocache.p
    public final String toString() {
        return "HttpUrlSource{sourceInfo='" + this.aDu + "}";
    }

    private void a(HttpURLConnection httpURLConnection, String str) {
        for (Map.Entry<String, String> entry : this.aCX.Hq().entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    public h(h hVar) {
        this.aDu = hVar.aDu;
        this.aCW = hVar.aCW;
        this.aCX = hVar.aCX;
    }
}
