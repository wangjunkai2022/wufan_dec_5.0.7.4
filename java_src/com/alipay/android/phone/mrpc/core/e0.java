package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
/* loaded from: classes2.dex */
public final class e0 implements Callable<e> {

    /* renamed from: r  reason: collision with root package name */
    private static final HttpRequestRetryHandler f4557r = new o();

    /* renamed from: b  reason: collision with root package name */
    protected z f4558b;

    /* renamed from: c  reason: collision with root package name */
    protected Context f4559c;

    /* renamed from: d  reason: collision with root package name */
    protected c0 f4560d;

    /* renamed from: e  reason: collision with root package name */
    private HttpUriRequest f4561e;

    /* renamed from: h  reason: collision with root package name */
    private CookieManager f4564h;

    /* renamed from: i  reason: collision with root package name */
    private AbstractHttpEntity f4565i;

    /* renamed from: j  reason: collision with root package name */
    private HttpHost f4566j;

    /* renamed from: k  reason: collision with root package name */
    private URL f4567k;

    /* renamed from: l  reason: collision with root package name */
    String f4568l;

    /* renamed from: q  reason: collision with root package name */
    private String f4573q;

    /* renamed from: f  reason: collision with root package name */
    private HttpContext f4562f = new BasicHttpContext();

    /* renamed from: g  reason: collision with root package name */
    private CookieStore f4563g = new BasicCookieStore();

    /* renamed from: m  reason: collision with root package name */
    private int f4569m = 0;

    /* renamed from: n  reason: collision with root package name */
    private boolean f4570n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f4571o = false;

    /* renamed from: p  reason: collision with root package name */
    private String f4572p = null;

    public e0(z zVar, c0 c0Var) {
        this.f4558b = zVar;
        this.f4559c = zVar.f4619a;
        this.f4560d = c0Var;
    }

    private static long a(String[] strArr) {
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if ("max-age".equalsIgnoreCase(strArr[i4])) {
                int i5 = i4 + 1;
                if (strArr[i5] != null) {
                    try {
                        return Long.parseLong(strArr[i5]);
                    } catch (Exception unused) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return 0L;
    }

    private e b(HttpResponse httpResponse, int i4, String str) {
        String str2;
        Thread.currentThread().getId();
        HttpEntity entity = httpResponse.getEntity();
        ByteArrayOutputStream byteArrayOutputStream = null;
        String str3 = null;
        if (entity == null || httpResponse.getStatusLine().getStatusCode() != 200) {
            if (entity == null) {
                httpResponse.getStatusLine().getStatusCode();
                return null;
            }
            return null;
        }
        Thread.currentThread().getId();
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                f(entity, byteArrayOutputStream2);
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                this.f4571o = false;
                this.f4558b.g(System.currentTimeMillis() - currentTimeMillis);
                this.f4558b.d(byteArray.length);
                d0 d0Var = new d0(c(httpResponse), i4, str, byteArray);
                long g4 = g(httpResponse);
                Header contentType = httpResponse.getEntity().getContentType();
                if (contentType != null) {
                    HashMap<String, String> e5 = e(contentType.getValue());
                    str3 = e5.get("Content-Type");
                    str2 = e5.get("charset");
                } else {
                    str2 = null;
                }
                d0Var.a(str3);
                d0Var.f4553g = str2;
                d0Var.f4551e = System.currentTimeMillis();
                d0Var.f4552f = g4;
                try {
                    byteArrayOutputStream2.close();
                    return d0Var;
                } catch (IOException e6) {
                    throw new RuntimeException("ArrayOutputStream close error!", e6.getCause());
                }
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e7) {
                        throw new RuntimeException("ArrayOutputStream close error!", e7.getCause());
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static b c(HttpResponse httpResponse) {
        Header[] allHeaders;
        b bVar = new b();
        for (Header header : httpResponse.getAllHeaders()) {
            bVar.c(header.getName(), header.getValue());
        }
        return bVar;
    }

    private static HashMap<String, String> e(String str) {
        String[] split;
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str2 : str.split(";")) {
            String[] split2 = str2.indexOf(61) == -1 ? new String[]{"Content-Type", str2} : str2.split(SimpleComparison.EQUAL_TO_OPERATION);
            hashMap.put(split2[0], split2[1]);
        }
        return hashMap;
    }

    private void f(HttpEntity httpEntity, OutputStream outputStream) {
        InputStream c5 = p.c(httpEntity);
        long contentLength = httpEntity.getContentLength();
        try {
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = c5.read(bArr);
                    if (read == -1 || this.f4560d.f4547a) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    if (this.f4560d.a() != null && contentLength > 0) {
                        this.f4560d.a();
                    }
                }
                outputStream.flush();
            } catch (Exception e5) {
                e5.getCause();
                throw new IOException("HttpWorker Request Error!" + e5.getLocalizedMessage());
            }
        } finally {
            f0.a(c5);
        }
    }

    private static long g(HttpResponse httpResponse) {
        Header firstHeader = httpResponse.getFirstHeader("Cache-Control");
        if (firstHeader != null) {
            String[] split = firstHeader.getValue().split(SimpleComparison.EQUAL_TO_OPERATION);
            if (split.length >= 2) {
                try {
                    return a(split);
                } catch (NumberFormatException unused) {
                }
            }
        }
        Header firstHeader2 = httpResponse.getFirstHeader("Expires");
        if (firstHeader2 != null) {
            return p.i(firstHeader2.getValue()) - System.currentTimeMillis();
        }
        return 0L;
    }

    private URI h() {
        String str = this.f4560d.f4541c;
        String str2 = this.f4568l;
        if (str2 != null) {
            str = str2;
        }
        if (str != null) {
            return new URI(str);
        }
        throw new RuntimeException("url should not be null");
    }

    private HttpUriRequest i() {
        HttpUriRequest httpUriRequest = this.f4561e;
        if (httpUriRequest != null) {
            return httpUriRequest;
        }
        if (this.f4565i == null) {
            c0 c0Var = this.f4560d;
            byte[] bArr = c0Var.f4542d;
            String d5 = c0Var.d("gzip");
            if (bArr != null) {
                this.f4565i = TextUtils.equals(d5, "true") ? p.f(bArr) : new ByteArrayEntity(bArr);
                this.f4565i.setContentType(this.f4560d.f4543e);
            }
        }
        AbstractHttpEntity abstractHttpEntity = this.f4565i;
        if (abstractHttpEntity != null) {
            HttpPost httpPost = new HttpPost(h());
            httpPost.setEntity(abstractHttpEntity);
            this.f4561e = httpPost;
        } else {
            this.f4561e = new HttpGet(h());
        }
        return this.f4561e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc A[Catch: Exception -> 0x023c, NullPointerException -> 0x025e, IOException -> 0x027d, UnknownHostException -> 0x02a2, HttpHostConnectException -> 0x02c9, NoHttpResponseException -> 0x02ed, SocketTimeoutException -> 0x0313, ConnectTimeoutException -> 0x0339, ConnectionPoolTimeoutException -> 0x035e, SSLException -> 0x0383, SSLPeerUnverifiedException -> 0x03a8, SSLHandshakeException -> 0x03cd, URISyntaxException -> 0x03f2, a -> 0x03ff, TryCatch #3 {ConnectionPoolTimeoutException -> 0x035e, HttpHostConnectException -> 0x02c9, a -> 0x03ff, NullPointerException -> 0x025e, SocketTimeoutException -> 0x0313, URISyntaxException -> 0x03f2, UnknownHostException -> 0x02a2, SSLHandshakeException -> 0x03cd, SSLPeerUnverifiedException -> 0x03a8, SSLException -> 0x0383, NoHttpResponseException -> 0x02ed, ConnectTimeoutException -> 0x0339, IOException -> 0x027d, Exception -> 0x023c, blocks: (B:4:0x0006, B:18:0x0032, B:20:0x003a, B:21:0x003f, B:23:0x0045, B:25:0x004b, B:26:0x004f, B:28:0x0055, B:29:0x0063, B:31:0x00c5, B:33:0x00cb, B:35:0x00d5, B:38:0x00de, B:40:0x00ea, B:44:0x00f4, B:48:0x0114, B:50:0x011c, B:51:0x0129, B:53:0x014d, B:54:0x0154, B:56:0x015a, B:57:0x015e, B:59:0x0164, B:61:0x0170, B:65:0x019f, B:66:0x01b9, B:74:0x01d6, B:75:0x01ef, B:76:0x01f0, B:78:0x01f8, B:80:0x01fe, B:84:0x020a, B:86:0x020e, B:88:0x021c, B:90:0x0222, B:92:0x022c, B:47:0x00fc, B:94:0x0230, B:95:0x023b, B:7:0x0017, B:9:0x001b, B:11:0x001f, B:13:0x0025, B:16:0x002d), top: B:181:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011c A[Catch: Exception -> 0x023c, NullPointerException -> 0x025e, IOException -> 0x027d, UnknownHostException -> 0x02a2, HttpHostConnectException -> 0x02c9, NoHttpResponseException -> 0x02ed, SocketTimeoutException -> 0x0313, ConnectTimeoutException -> 0x0339, ConnectionPoolTimeoutException -> 0x035e, SSLException -> 0x0383, SSLPeerUnverifiedException -> 0x03a8, SSLHandshakeException -> 0x03cd, URISyntaxException -> 0x03f2, a -> 0x03ff, TryCatch #3 {ConnectionPoolTimeoutException -> 0x035e, HttpHostConnectException -> 0x02c9, a -> 0x03ff, NullPointerException -> 0x025e, SocketTimeoutException -> 0x0313, URISyntaxException -> 0x03f2, UnknownHostException -> 0x02a2, SSLHandshakeException -> 0x03cd, SSLPeerUnverifiedException -> 0x03a8, SSLException -> 0x0383, NoHttpResponseException -> 0x02ed, ConnectTimeoutException -> 0x0339, IOException -> 0x027d, Exception -> 0x023c, blocks: (B:4:0x0006, B:18:0x0032, B:20:0x003a, B:21:0x003f, B:23:0x0045, B:25:0x004b, B:26:0x004f, B:28:0x0055, B:29:0x0063, B:31:0x00c5, B:33:0x00cb, B:35:0x00d5, B:38:0x00de, B:40:0x00ea, B:44:0x00f4, B:48:0x0114, B:50:0x011c, B:51:0x0129, B:53:0x014d, B:54:0x0154, B:56:0x015a, B:57:0x015e, B:59:0x0164, B:61:0x0170, B:65:0x019f, B:66:0x01b9, B:74:0x01d6, B:75:0x01ef, B:76:0x01f0, B:78:0x01f8, B:80:0x01fe, B:84:0x020a, B:86:0x020e, B:88:0x021c, B:90:0x0222, B:92:0x022c, B:47:0x00fc, B:94:0x0230, B:95:0x023b, B:7:0x0017, B:9:0x001b, B:11:0x001f, B:13:0x0025, B:16:0x002d), top: B:181:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014d A[Catch: Exception -> 0x023c, NullPointerException -> 0x025e, IOException -> 0x027d, UnknownHostException -> 0x02a2, HttpHostConnectException -> 0x02c9, NoHttpResponseException -> 0x02ed, SocketTimeoutException -> 0x0313, ConnectTimeoutException -> 0x0339, ConnectionPoolTimeoutException -> 0x035e, SSLException -> 0x0383, SSLPeerUnverifiedException -> 0x03a8, SSLHandshakeException -> 0x03cd, URISyntaxException -> 0x03f2, a -> 0x03ff, TryCatch #3 {ConnectionPoolTimeoutException -> 0x035e, HttpHostConnectException -> 0x02c9, a -> 0x03ff, NullPointerException -> 0x025e, SocketTimeoutException -> 0x0313, URISyntaxException -> 0x03f2, UnknownHostException -> 0x02a2, SSLHandshakeException -> 0x03cd, SSLPeerUnverifiedException -> 0x03a8, SSLException -> 0x0383, NoHttpResponseException -> 0x02ed, ConnectTimeoutException -> 0x0339, IOException -> 0x027d, Exception -> 0x023c, blocks: (B:4:0x0006, B:18:0x0032, B:20:0x003a, B:21:0x003f, B:23:0x0045, B:25:0x004b, B:26:0x004f, B:28:0x0055, B:29:0x0063, B:31:0x00c5, B:33:0x00cb, B:35:0x00d5, B:38:0x00de, B:40:0x00ea, B:44:0x00f4, B:48:0x0114, B:50:0x011c, B:51:0x0129, B:53:0x014d, B:54:0x0154, B:56:0x015a, B:57:0x015e, B:59:0x0164, B:61:0x0170, B:65:0x019f, B:66:0x01b9, B:74:0x01d6, B:75:0x01ef, B:76:0x01f0, B:78:0x01f8, B:80:0x01fe, B:84:0x020a, B:86:0x020e, B:88:0x021c, B:90:0x0222, B:92:0x022c, B:47:0x00fc, B:94:0x0230, B:95:0x023b, B:7:0x0017, B:9:0x001b, B:11:0x001f, B:13:0x0025, B:16:0x002d), top: B:181:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015a A[Catch: Exception -> 0x023c, NullPointerException -> 0x025e, IOException -> 0x027d, UnknownHostException -> 0x02a2, HttpHostConnectException -> 0x02c9, NoHttpResponseException -> 0x02ed, SocketTimeoutException -> 0x0313, ConnectTimeoutException -> 0x0339, ConnectionPoolTimeoutException -> 0x035e, SSLException -> 0x0383, SSLPeerUnverifiedException -> 0x03a8, SSLHandshakeException -> 0x03cd, URISyntaxException -> 0x03f2, a -> 0x03ff, TryCatch #3 {ConnectionPoolTimeoutException -> 0x035e, HttpHostConnectException -> 0x02c9, a -> 0x03ff, NullPointerException -> 0x025e, SocketTimeoutException -> 0x0313, URISyntaxException -> 0x03f2, UnknownHostException -> 0x02a2, SSLHandshakeException -> 0x03cd, SSLPeerUnverifiedException -> 0x03a8, SSLException -> 0x0383, NoHttpResponseException -> 0x02ed, ConnectTimeoutException -> 0x0339, IOException -> 0x027d, Exception -> 0x023c, blocks: (B:4:0x0006, B:18:0x0032, B:20:0x003a, B:21:0x003f, B:23:0x0045, B:25:0x004b, B:26:0x004f, B:28:0x0055, B:29:0x0063, B:31:0x00c5, B:33:0x00cb, B:35:0x00d5, B:38:0x00de, B:40:0x00ea, B:44:0x00f4, B:48:0x0114, B:50:0x011c, B:51:0x0129, B:53:0x014d, B:54:0x0154, B:56:0x015a, B:57:0x015e, B:59:0x0164, B:61:0x0170, B:65:0x019f, B:66:0x01b9, B:74:0x01d6, B:75:0x01ef, B:76:0x01f0, B:78:0x01f8, B:80:0x01fe, B:84:0x020a, B:86:0x020e, B:88:0x021c, B:90:0x0222, B:92:0x022c, B:47:0x00fc, B:94:0x0230, B:95:0x023b, B:7:0x0017, B:9:0x001b, B:11:0x001f, B:13:0x0025, B:16:0x002d), top: B:181:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01cd  */
    @Override // java.util.concurrent.Callable
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.alipay.android.phone.mrpc.core.e call() {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.phone.mrpc.core.e0.call():com.alipay.android.phone.mrpc.core.e");
    }

    private void k() {
        HttpUriRequest httpUriRequest = this.f4561e;
        if (httpUriRequest != null) {
            httpUriRequest.abort();
        }
    }

    private String l() {
        if (TextUtils.isEmpty(this.f4573q)) {
            String d5 = this.f4560d.d("operationType");
            this.f4573q = d5;
            return d5;
        }
        return this.f4573q;
    }

    private int m() {
        URL n4 = n();
        return n4.getPort() == -1 ? n4.getDefaultPort() : n4.getPort();
    }

    private URL n() {
        URL url = this.f4567k;
        if (url != null) {
            return url;
        }
        URL url2 = new URL(this.f4560d.f4541c);
        this.f4567k = url2;
        return url2;
    }

    private CookieManager o() {
        CookieManager cookieManager = this.f4564h;
        if (cookieManager != null) {
            return cookieManager;
        }
        CookieManager cookieManager2 = CookieManager.getInstance();
        this.f4564h = cookieManager2;
        return cookieManager2;
    }

    public final c0 d() {
        return this.f4560d;
    }
}
