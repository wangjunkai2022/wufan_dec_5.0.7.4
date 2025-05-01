package com.beizi.ad.internal.b;

import android.text.TextUtils;
import com.beizi.ad.internal.utilities.HaoboLog;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
/* compiled from: HttpUrlSource.java */
/* loaded from: classes2.dex */
public class h implements o {

    /* renamed from: a  reason: collision with root package name */
    private final com.beizi.ad.internal.b.b.c f5813a;

    /* renamed from: b  reason: collision with root package name */
    private p f5814b;

    /* renamed from: c  reason: collision with root package name */
    private HttpURLConnection f5815c;

    /* renamed from: d  reason: collision with root package name */
    private InputStream f5816d;

    public h(String str) {
        this(str, com.beizi.ad.internal.b.b.d.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e() throws com.beizi.ad.internal.b.m {
        /*
            r6 = this;
            java.lang.String r0 = com.beizi.ad.internal.utilities.HaoboLog.httpUrlSourceLogTag
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Read content info failFrom "
            r1.append(r2)
            com.beizi.ad.internal.b.p r2 = r6.f5814b
            java.lang.String r2 = r2.f5830a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.beizi.ad.internal.utilities.HaoboLog.d(r0, r1)
            r0 = 0
            r1 = 10000(0x2710, float:1.4013E-41)
            r2 = 0
            java.net.HttpURLConnection r0 = r6.a(r0, r1)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L63
            int r1 = r0.getContentLength()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            java.lang.String r3 = r0.getContentType()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            java.io.InputStream r2 = r0.getInputStream()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            com.beizi.ad.internal.b.p r4 = new com.beizi.ad.internal.b.p     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            com.beizi.ad.internal.b.p r5 = r6.f5814b     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            java.lang.String r5 = r5.f5830a     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            r4.<init>(r5, r1, r3)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            r6.f5814b = r4     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            com.beizi.ad.internal.b.b.c r1 = r6.f5813a     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            java.lang.String r3 = r4.f5830a     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            r1.a(r3, r4)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            java.lang.String r1 = com.beizi.ad.internal.utilities.HaoboLog.httpUrlSourceLogTag     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            r3.<init>()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            java.lang.String r4 = "Source info fetched: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            com.beizi.ad.internal.b.p r4 = r6.f5814b     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            r3.append(r4)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            com.beizi.ad.internal.utilities.HaoboLog.d(r1, r3)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            com.beizi.ad.internal.b.n.a(r2)
            goto L84
        L5c:
            r1 = move-exception
            goto L88
        L5e:
            r1 = move-exception
            goto L65
        L60:
            r1 = move-exception
            r0 = r2
            goto L88
        L63:
            r1 = move-exception
            r0 = r2
        L65:
            java.lang.String r3 = com.beizi.ad.internal.utilities.HaoboLog.httpUrlSourceLogTag     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r4.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r5 = "Error fetching info failFrom "
            r4.append(r5)     // Catch: java.lang.Throwable -> L5c
            com.beizi.ad.internal.b.p r5 = r6.f5814b     // Catch: java.lang.Throwable -> L5c
            java.lang.String r5 = r5.f5830a     // Catch: java.lang.Throwable -> L5c
            r4.append(r5)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L5c
            com.beizi.ad.internal.utilities.HaoboLog.e(r3, r4, r1)     // Catch: java.lang.Throwable -> L5c
            com.beizi.ad.internal.b.n.a(r2)
            if (r0 == 0) goto L87
        L84:
            r0.disconnect()
        L87:
            return
        L88:
            com.beizi.ad.internal.b.n.a(r2)
            if (r0 == 0) goto L90
            r0.disconnect()
        L90:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.ad.internal.b.h.e():void");
    }

    @Override // com.beizi.ad.internal.b.o
    public synchronized int a() throws m {
        if (this.f5814b.f5831b == Integer.MIN_VALUE) {
            e();
        }
        return this.f5814b.f5831b;
    }

    @Override // com.beizi.ad.internal.b.o
    public void b() throws m {
        HttpURLConnection httpURLConnection = this.f5815c;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (IllegalArgumentException | NullPointerException e5) {
                throw new RuntimeException("Wait... but why? WTF!? ", e5);
            }
        }
    }

    public synchronized String c() throws m {
        if (TextUtils.isEmpty(this.f5814b.f5832c)) {
            e();
        }
        return this.f5814b.f5832c;
    }

    public String d() {
        return this.f5814b.f5830a;
    }

    public String toString() {
        return "HttpUrlSource{sourceInfo='" + this.f5814b + "}";
    }

    public h(String str, com.beizi.ad.internal.b.b.c cVar) {
        this.f5813a = (com.beizi.ad.internal.b.b.c) k.a(cVar);
        p a5 = cVar.a(str);
        this.f5814b = a5 == null ? new p(str, Integer.MIN_VALUE, n.a(str)) : a5;
    }

    @Override // com.beizi.ad.internal.b.o
    public void a(int i4) throws m {
        try {
            HttpURLConnection a5 = a(i4, -1);
            this.f5815c = a5;
            String contentType = a5.getContentType();
            this.f5816d = new BufferedInputStream(this.f5815c.getInputStream(), 8192);
            HttpURLConnection httpURLConnection = this.f5815c;
            p pVar = new p(this.f5814b.f5830a, a(httpURLConnection, i4, httpURLConnection.getResponseCode()), contentType);
            this.f5814b = pVar;
            this.f5813a.a(pVar.f5830a, pVar);
        } catch (IOException e5) {
            throw new m("Error opening connection for " + this.f5814b.f5830a + " with offset " + i4, e5);
        }
    }

    public h(h hVar) {
        this.f5814b = hVar.f5814b;
        this.f5813a = hVar.f5813a;
    }

    private int a(HttpURLConnection httpURLConnection, int i4, int i5) throws IOException {
        int contentLength = httpURLConnection.getContentLength();
        return i5 == 200 ? contentLength : i5 == 206 ? contentLength + i4 : this.f5814b.f5831b;
    }

    @Override // com.beizi.ad.internal.b.o
    public int a(byte[] bArr) throws m {
        InputStream inputStream = this.f5816d;
        if (inputStream != null) {
            try {
                return inputStream.read(bArr, 0, bArr.length);
            } catch (InterruptedIOException e5) {
                throw new i("Reading source " + this.f5814b.f5830a + " is interrupted", e5);
            } catch (IOException e6) {
                throw new m("Error reading data failFrom " + this.f5814b.f5830a, e6);
            }
        }
        throw new m("Error reading data failFrom " + this.f5814b.f5830a + ": connection is absent!");
    }

    private HttpURLConnection a(int i4, int i5) throws IOException, m {
        String str;
        HttpURLConnection httpURLConnection;
        boolean z4;
        String str2 = this.f5814b.f5830a;
        int i6 = 0;
        do {
            String str3 = HaoboLog.httpUrlSourceLogTag;
            StringBuilder sb = new StringBuilder();
            sb.append("Open connection ");
            if (i4 > 0) {
                str = " with offset " + i4;
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(" to ");
            sb.append(str2);
            HaoboLog.d(str3, sb.toString());
            httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
            if (i4 > 0) {
                httpURLConnection.setRequestProperty("Range", "bytes=" + i4 + "-");
            }
            if (i5 > 0) {
                httpURLConnection.setConnectTimeout(i5);
                httpURLConnection.setReadTimeout(i5);
            }
            int responseCode = httpURLConnection.getResponseCode();
            z4 = responseCode == 301 || responseCode == 302 || responseCode == 303;
            if (z4) {
                str2 = httpURLConnection.getHeaderField("Location");
                i6++;
                httpURLConnection.disconnect();
            }
            if (i6 > 5) {
                throw new m("Too many redirects: " + i6);
            }
        } while (z4);
        return httpURLConnection;
    }
}
