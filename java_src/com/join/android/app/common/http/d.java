package com.join.android.app.common.http;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.gson.JsonObject;
import com.papa.sim.statistic.JsonMapper;
import io.netty.handler.codec.http.multipart.HttpPostBodyUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Dispatcher;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
/* compiled from: OkHttpClientManager.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: k  reason: collision with root package name */
    private static final String f14633k = "OkHttpClientManager";

    /* renamed from: l  reason: collision with root package name */
    private static d f14634l;

    /* renamed from: a  reason: collision with root package name */
    private OkHttpClient f14635a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f14636b;

    /* renamed from: c  reason: collision with root package name */
    private JsonMapper f14637c;

    /* renamed from: d  reason: collision with root package name */
    private l f14638d = new l();

    /* renamed from: e  reason: collision with root package name */
    private j f14639e = new j();

    /* renamed from: f  reason: collision with root package name */
    private i f14640f = new i();

    /* renamed from: g  reason: collision with root package name */
    private k f14641g = new k();

    /* renamed from: h  reason: collision with root package name */
    private q f14642h = new q();

    /* renamed from: i  reason: collision with root package name */
    private o f14643i = new o();

    /* renamed from: j  reason: collision with root package name */
    private final p<String> f14644j = new h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OkHttpClientManager.java */
    /* loaded from: classes3.dex */
    public class a implements HostnameVerifier {
        a() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    /* compiled from: OkHttpClientManager.java */
    /* loaded from: classes3.dex */
    class b implements X509TrustManager {
        b() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    /* compiled from: OkHttpClientManager.java */
    /* loaded from: classes3.dex */
    class c implements HostnameVerifier {
        c() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OkHttpClientManager.java */
    /* renamed from: com.join.android.app.common.http.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0310d implements CookieJar {

        /* renamed from: a  reason: collision with root package name */
        private final HashMap<HttpUrl, List<Cookie>> f14646a = new HashMap<>();

        C0310d() {
        }

        @Override // okhttp3.CookieJar
        public List<Cookie> loadForRequest(HttpUrl httpUrl) {
            List<Cookie> list = this.f14646a.get(httpUrl);
            return list != null ? list : new ArrayList();
        }

        @Override // okhttp3.CookieJar
        public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
            this.f14646a.put(httpUrl, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OkHttpClientManager.java */
    /* loaded from: classes3.dex */
    public class e implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f14648a;

        e(p pVar) {
            this.f14648a = pVar;
        }

        public void a(Request request, IOException iOException) {
            d.this.T(request, iOException, this.f14648a);
        }

        public void b(Response response) {
            try {
                String string = response.body().string();
                p pVar = this.f14648a;
                Type type = pVar.f14686a;
                if (type == String.class) {
                    d.this.U(string, pVar);
                } else if (type instanceof ParameterizedType) {
                    Class<?>[] C = d.this.C(type);
                    int length = C.length - 1;
                    Class<?>[] clsArr = new Class[length];
                    System.arraycopy(C, 1, clsArr, 0, length);
                    d.this.U(d.this.f14637c.fromJson(string, d.this.f14637c.createCollectionType(C[0], clsArr)), this.f14648a);
                } else {
                    d.this.U(d.this.f14637c.fromJson(string, Class.forName(type.toString().replace("class ", ""))), this.f14648a);
                }
            } catch (Exception e5) {
                d.this.T(response.request(), e5, this.f14648a);
            }
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            a(call.request(), iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            b(response);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OkHttpClientManager.java */
    /* loaded from: classes3.dex */
    public class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f14650b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Request f14651c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Exception f14652d;

        f(p pVar, Request request, Exception exc) {
            this.f14650b = pVar;
            this.f14651c = request;
            this.f14652d = exc;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14650b.d(this.f14651c, this.f14652d);
            this.f14650b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OkHttpClientManager.java */
    /* loaded from: classes3.dex */
    public class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f14654b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f14655c;

        g(p pVar, Object obj) {
            this.f14654b = pVar;
            this.f14655c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14654b.e(this.f14655c);
            this.f14654b.b();
        }
    }

    /* compiled from: OkHttpClientManager.java */
    /* loaded from: classes3.dex */
    class h extends p<String> {
        h() {
        }

        @Override // com.join.android.app.common.http.d.p
        public void d(Request request, Exception exc) {
        }

        @Override // com.join.android.app.common.http.d.p
        /* renamed from: f */
        public void e(String str) {
        }
    }

    /* compiled from: OkHttpClientManager.java */
    /* loaded from: classes3.dex */
    public class i {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OkHttpClientManager.java */
        /* loaded from: classes3.dex */
        public class a implements Callback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ImageView f14659a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f14660b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f14661c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Object f14662d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OkHttpClientManager.java */
            /* renamed from: com.join.android.app.common.http.d$i$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class RunnableC0311a implements Runnable {

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ Bitmap f14664b;

                RunnableC0311a(Bitmap bitmap) {
                    this.f14664b = bitmap;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.f14659a.setImageBitmap(this.f14664b);
                }
            }

            a(ImageView imageView, int i4, String str, Object obj) {
                this.f14659a = imageView;
                this.f14660b = i4;
                this.f14661c = str;
                this.f14662d = obj;
            }

            public void a(Request request, IOException iOException) {
                i.this.e(this.f14659a, this.f14660b);
            }

            public void b(Response response) {
                Throwable th;
                InputStream inputStream;
                InputStream inputStream2 = null;
                try {
                    try {
                        try {
                            inputStream = response.body().byteStream();
                        } catch (Exception unused) {
                        }
                    } catch (Throwable th2) {
                        InputStream inputStream3 = inputStream2;
                        th = th2;
                        inputStream = inputStream3;
                    }
                    try {
                        int a5 = m.a(m.d(inputStream), m.f(this.f14659a));
                        try {
                            inputStream.reset();
                        } catch (IOException unused2) {
                            inputStream = d.this.f14641g.c(this.f14661c, this.f14662d).body().byteStream();
                        }
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = false;
                        options.inSampleSize = a5;
                        d.this.f14636b.post(new RunnableC0311a(BitmapFactory.decodeStream(inputStream, null, options)));
                    } catch (Exception unused3) {
                        inputStream2 = inputStream;
                        i.this.e(this.f14659a, this.f14660b);
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        throw th;
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                a(call.request(), iOException);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                b(response);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OkHttpClientManager.java */
        /* loaded from: classes3.dex */
        public class b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ImageView f14666b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f14667c;

            b(ImageView imageView, int i4) {
                this.f14666b = imageView;
                this.f14667c = i4;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f14666b.setImageResource(this.f14667c);
            }
        }

        public i() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(ImageView imageView, int i4) {
            d.this.f14636b.post(new b(imageView, i4));
        }

        public void b(ImageView imageView, String str) {
            c(imageView, str, -1, null);
        }

        public void c(ImageView imageView, String str, int i4, Object obj) {
            d.this.f14635a.newCall(new Request.Builder().url(str).build()).enqueue(new a(imageView, i4, str, obj));
        }

        public void d(ImageView imageView, String str, Object obj) {
            c(imageView, str, -1, obj);
        }
    }

    /* compiled from: OkHttpClientManager.java */
    /* loaded from: classes3.dex */
    public class j {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OkHttpClientManager.java */
        /* loaded from: classes3.dex */
        public class a implements Callback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p f14670a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f14671b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f14672c;

            a(p pVar, String str, String str2) {
                this.f14670a = pVar;
                this.f14671b = str;
                this.f14672c = str2;
            }

            public void a(Request request, IOException iOException) {
                d.this.T(request, iOException, this.f14670a);
            }

            /* JADX WARN: Removed duplicated region for block: B:50:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void b(okhttp3.Response r8) {
                /*
                    r7 = this;
                    r0 = 2048(0x800, float:2.87E-42)
                    byte[] r0 = new byte[r0]
                    r1 = 0
                    okhttp3.ResponseBody r2 = r8.body()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L63
                    java.io.InputStream r2 = r2.byteStream()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L63
                    java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5c
                    java.lang.String r4 = r7.f14671b     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5c
                    r3.<init>(r4)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5c
                    boolean r4 = r3.exists()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5c
                    if (r4 != 0) goto L1d
                    r3.mkdirs()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5c
                L1d:
                    java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5c
                    com.join.android.app.common.http.d$j r5 = com.join.android.app.common.http.d.j.this     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5c
                    com.join.android.app.common.http.d r5 = com.join.android.app.common.http.d.this     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5c
                    java.lang.String r6 = r7.f14672c     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5c
                    java.lang.String r5 = com.join.android.app.common.http.d.j(r5, r6)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5c
                    r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5c
                    java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5c
                    r3.<init>(r4)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5c
                L31:
                    int r1 = r2.read(r0)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
                    r5 = -1
                    if (r1 == r5) goto L3d
                    r5 = 0
                    r3.write(r0, r5, r1)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
                    goto L31
                L3d:
                    r3.flush()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
                    com.join.android.app.common.http.d$j r0 = com.join.android.app.common.http.d.j.this     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
                    com.join.android.app.common.http.d r0 = com.join.android.app.common.http.d.this     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
                    java.lang.String r1 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
                    com.join.android.app.common.http.d$p r4 = r7.f14670a     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
                    com.join.android.app.common.http.d.g(r0, r1, r4)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
                    r2.close()     // Catch: java.io.IOException -> L50
                L50:
                    r3.close()     // Catch: java.io.IOException -> L7c
                    goto L7c
                L54:
                    r8 = move-exception
                    goto L5a
                L56:
                    r0 = move-exception
                    goto L5e
                L58:
                    r8 = move-exception
                    r3 = r1
                L5a:
                    r1 = r2
                    goto L7e
                L5c:
                    r0 = move-exception
                    r3 = r1
                L5e:
                    r1 = r2
                    goto L65
                L60:
                    r8 = move-exception
                    r3 = r1
                    goto L7e
                L63:
                    r0 = move-exception
                    r3 = r1
                L65:
                    com.join.android.app.common.http.d$j r2 = com.join.android.app.common.http.d.j.this     // Catch: java.lang.Throwable -> L7d
                    com.join.android.app.common.http.d r2 = com.join.android.app.common.http.d.this     // Catch: java.lang.Throwable -> L7d
                    okhttp3.Request r8 = r8.request()     // Catch: java.lang.Throwable -> L7d
                    com.join.android.app.common.http.d$p r4 = r7.f14670a     // Catch: java.lang.Throwable -> L7d
                    com.join.android.app.common.http.d.f(r2, r8, r0, r4)     // Catch: java.lang.Throwable -> L7d
                    if (r1 == 0) goto L79
                    r1.close()     // Catch: java.io.IOException -> L78
                    goto L79
                L78:
                L79:
                    if (r3 == 0) goto L7c
                    goto L50
                L7c:
                    return
                L7d:
                    r8 = move-exception
                L7e:
                    if (r1 == 0) goto L85
                    r1.close()     // Catch: java.io.IOException -> L84
                    goto L85
                L84:
                L85:
                    if (r3 == 0) goto L8a
                    r3.close()     // Catch: java.io.IOException -> L8a
                L8a:
                    goto L8c
                L8b:
                    throw r8
                L8c:
                    goto L8b
                */
                throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.common.http.d.j.a.b(okhttp3.Response):void");
            }

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                a(call.request(), iOException);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                b(response);
            }
        }

        public j() {
        }

        public void a(String str, String str2, p pVar) {
            b(str, str2, pVar, null);
        }

        public void b(String str, String str2, p pVar, Object obj) {
            d.this.f14635a.newCall(new Request.Builder().url(str).tag(obj).build()).enqueue(new a(pVar, str2, str));
        }
    }

    /* compiled from: OkHttpClientManager.java */
    /* loaded from: classes3.dex */
    public class k {
        public k() {
        }

        private Request a(String str, Object obj) {
            Request.Builder url = new Request.Builder().url(str);
            if (obj != null) {
                url.tag(obj);
            }
            return url.build();
        }

        public Response b(String str) throws IOException {
            return c(str, null);
        }

        public Response c(String str, Object obj) throws IOException {
            return d(a(str, obj));
        }

        public Response d(Request request) throws IOException {
            return d.this.f14635a.newCall(request).execute();
        }

        public String e(String str) throws IOException {
            return f(str, null);
        }

        public String f(String str, Object obj) throws IOException {
            return c(str, obj).body().string();
        }

        public void g(String str, p pVar) {
            h(str, pVar, null);
        }

        public void h(String str, p pVar, Object obj) {
            i(a(str, obj), pVar);
        }

        public void i(Request request, p pVar) {
            d.this.w(pVar, request);
        }
    }

    /* compiled from: OkHttpClientManager.java */
    /* loaded from: classes3.dex */
    public class l {

        /* compiled from: OkHttpClientManager.java */
        /* loaded from: classes3.dex */
        public class a implements X509TrustManager {

            /* renamed from: a  reason: collision with root package name */
            private X509TrustManager f14676a;

            /* renamed from: b  reason: collision with root package name */
            private X509TrustManager f14677b;

            public a(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyStoreException {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                this.f14676a = l.this.b(trustManagerFactory.getTrustManagers());
                this.f14677b = x509TrustManager;
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                try {
                    this.f14676a.checkServerTrusted(x509CertificateArr, str);
                } catch (CertificateException unused) {
                    this.f14677b.checkServerTrusted(x509CertificateArr, str);
                }
            }

            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        }

        public l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public X509TrustManager b(TrustManager[] trustManagerArr) {
            for (TrustManager trustManager : trustManagerArr) {
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            return null;
        }

        public KeyManager[] c(InputStream inputStream, String str) {
            if (inputStream != null && str != null) {
                try {
                    KeyStore keyStore = KeyStore.getInstance("BKS");
                    keyStore.load(inputStream, str.toCharArray());
                    KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                    keyManagerFactory.init(keyStore, str.toCharArray());
                    return keyManagerFactory.getKeyManagers();
                } catch (IOException e5) {
                    e5.printStackTrace();
                } catch (KeyStoreException e6) {
                    e6.printStackTrace();
                } catch (NoSuchAlgorithmException e7) {
                    e7.printStackTrace();
                } catch (UnrecoverableKeyException e8) {
                    e8.printStackTrace();
                } catch (CertificateException e9) {
                    e9.printStackTrace();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            return null;
        }

        public TrustManager[] d(InputStream... inputStreamArr) {
            if (inputStreamArr != null && inputStreamArr.length > 0) {
                try {
                    CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                    KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                    keyStore.load(null);
                    int length = inputStreamArr.length;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < length) {
                        InputStream inputStream = inputStreamArr[i4];
                        int i6 = i5 + 1;
                        keyStore.setCertificateEntry(Integer.toString(i5), certificateFactory.generateCertificate(inputStream));
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        i4++;
                        i5 = i6;
                    }
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init(keyStore);
                    return trustManagerFactory.getTrustManagers();
                } catch (KeyStoreException e5) {
                    e5.printStackTrace();
                } catch (NoSuchAlgorithmException e6) {
                    e6.printStackTrace();
                } catch (CertificateException e7) {
                    e7.printStackTrace();
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
            return null;
        }

        public void e(InputStream... inputStreamArr) {
            f(inputStreamArr, null, null);
        }

        public void f(InputStream[] inputStreamArr, InputStream inputStream, String str) {
            try {
                TrustManager[] d5 = d(inputStreamArr);
                KeyManager[] c5 = c(inputStream, str);
                SSLContext sSLContext = SSLContext.getInstance(SSLConnectionSocketFactory.TLS);
                sSLContext.init(c5, new TrustManager[]{new a(b(d5))}, new SecureRandom());
                d.this.f14635a.newBuilder().sslSocketFactory(sSLContext.getSocketFactory());
            } catch (KeyManagementException e5) {
                e5.printStackTrace();
            } catch (KeyStoreException e6) {
                e6.printStackTrace();
            } catch (NoSuchAlgorithmException e7) {
                e7.printStackTrace();
            }
        }
    }

    /* compiled from: OkHttpClientManager.java */
    /* loaded from: classes3.dex */
    public static class m {

        /* compiled from: OkHttpClientManager.java */
        /* loaded from: classes3.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            int f14679a;

            /* renamed from: b  reason: collision with root package name */
            int f14680b;

            public a() {
            }

            public String toString() {
                return "ImageSize{width=" + this.f14679a + ", height=" + this.f14680b + '}';
            }

            public a(int i4, int i5) {
                this.f14679a = i4;
                this.f14680b = i5;
            }
        }

        public static int a(a aVar, a aVar2) {
            int i4 = aVar.f14679a;
            int i5 = aVar.f14680b;
            int i6 = aVar2.f14679a;
            int i7 = aVar2.f14680b;
            if (i4 <= i6 || i5 <= i7) {
                return 1;
            }
            return Math.max(Math.round(i4 / i6), Math.round(i5 / i7));
        }

        private static int b(View view) {
            int i4 = 0;
            if (view == null) {
                return 0;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.height != -2) {
                i4 = view.getWidth();
            }
            if (i4 <= 0 && layoutParams != null) {
                i4 = layoutParams.height;
            }
            if (i4 <= 0) {
                i4 = e(view, "mMaxHeight");
            }
            return i4 <= 0 ? view.getContext().getResources().getDisplayMetrics().heightPixels : i4;
        }

        private static int c(View view) {
            int i4 = 0;
            if (view == null) {
                return 0;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.width != -2) {
                i4 = view.getWidth();
            }
            if (i4 <= 0 && layoutParams != null) {
                i4 = layoutParams.width;
            }
            if (i4 <= 0) {
                i4 = e(view, "mMaxWidth");
            }
            return i4 <= 0 ? view.getContext().getResources().getDisplayMetrics().widthPixels : i4;
        }

        public static a d(InputStream inputStream) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(inputStream, null, options);
            return new a(options.outWidth, options.outHeight);
        }

        private static int e(Object obj, String str) {
            try {
                Field declaredField = ImageView.class.getDeclaredField(str);
                declaredField.setAccessible(true);
                int i4 = declaredField.getInt(obj);
                if (i4 <= 0 || i4 >= Integer.MAX_VALUE) {
                    return 0;
                }
                return i4;
            } catch (Exception unused) {
                return 0;
            }
        }

        public static a f(View view) {
            a aVar = new a();
            aVar.f14679a = c(view);
            aVar.f14680b = b(view);
            return aVar;
        }
    }

    /* compiled from: OkHttpClientManager.java */
    /* loaded from: classes3.dex */
    public static class n {

        /* renamed from: a  reason: collision with root package name */
        String f14681a;

        /* renamed from: b  reason: collision with root package name */
        String f14682b;

        public n() {
        }

        public n(String str, String str2) {
            this.f14681a = str;
            this.f14682b = str2;
        }
    }

    /* compiled from: OkHttpClientManager.java */
    /* loaded from: classes3.dex */
    public class o {

        /* renamed from: a  reason: collision with root package name */
        private final MediaType f14683a = MediaType.parse("application/octet-stream;charset=utf-8");

        /* renamed from: b  reason: collision with root package name */
        private final MediaType f14684b = MediaType.parse("text/plain;charset=utf-8");

        public o() {
        }

        private Request a(String str, RequestBody requestBody, Object obj) {
            Request.Builder post = new Request.Builder().url(str).post(requestBody);
            if (obj != null) {
                post.tag(obj);
            }
            return post.build();
        }

        public Response b(String str, File file) throws IOException {
            return c(str, file, null);
        }

        public Response c(String str, File file, Object obj) throws IOException {
            return d.this.f14635a.newCall(a(str, RequestBody.create(this.f14683a, file), obj)).execute();
        }

        public Response d(String str, String str2) throws IOException {
            return e(str, str2, null);
        }

        public Response e(String str, String str2, Object obj) throws IOException {
            return d.this.f14635a.newCall(a(str, RequestBody.create(this.f14684b, str2), obj)).execute();
        }

        public Response f(String str, byte[] bArr) throws IOException {
            return g(str, bArr, null);
        }

        public Response g(String str, byte[] bArr, Object obj) throws IOException {
            return d.this.f14635a.newCall(a(str, RequestBody.create(this.f14683a, bArr), obj)).execute();
        }

        public Response h(String str, n[] nVarArr) throws IOException {
            return i(str, nVarArr, null);
        }

        public Response i(String str, n[] nVarArr, Object obj) throws IOException {
            return d.this.f14635a.newCall(d.this.s(str, nVarArr, obj)).execute();
        }

        public String j(String str, n[] nVarArr) throws IOException {
            return k(str, nVarArr, null);
        }

        public String k(String str, n[] nVarArr, Object obj) throws IOException {
            return i(str, nVarArr, obj).body().string();
        }

        public void l(String str, File file, p pVar) {
            m(str, file, pVar, null);
        }

        public void m(String str, File file, p pVar, Object obj) {
            w(str, file, MediaType.parse("application/octet-stream;charset=utf-8"), pVar, obj);
        }

        public void n(String str, String str2, p pVar) {
            o(str, str2, pVar, null);
        }

        public void o(String str, String str2, p pVar, Object obj) {
            x(str, str2, MediaType.parse("application/json;charset=utf-8"), pVar, obj);
        }

        public void p(String str, Map<String, String> map, p pVar) {
            q(str, map, pVar, null);
        }

        public void q(String str, Map<String, String> map, p pVar, Object obj) {
            u(str, d.this.M(map), pVar, obj);
        }

        public void r(String str, byte[] bArr, p pVar) {
            s(str, bArr, pVar, null);
        }

        public void s(String str, byte[] bArr, p pVar, Object obj) {
            y(str, bArr, MediaType.parse("application/octet-stream;charset=utf-8"), pVar, obj);
        }

        public void t(String str, n[] nVarArr, p pVar) {
            u(str, nVarArr, pVar, null);
        }

        public void u(String str, n[] nVarArr, p pVar, Object obj) {
            d.this.w(pVar, d.this.s(str, nVarArr, obj));
        }

        public void v(String str, JsonObject jsonObject, p pVar, Object obj) {
            MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
            for (String str2 : jsonObject.keySet()) {
                String obj2 = str2.toString();
                type.addFormDataPart(obj2, jsonObject.get(obj2).getAsString());
            }
            d.this.w(pVar, a(str, type.build(), obj));
        }

        public void w(String str, File file, MediaType mediaType, p pVar, Object obj) {
            d.this.w(pVar, a(str, RequestBody.create(mediaType, file), obj));
        }

        public void x(String str, String str2, MediaType mediaType, p pVar, Object obj) {
            d.this.w(pVar, a(str, RequestBody.create(mediaType, str2), obj));
        }

        public void y(String str, byte[] bArr, MediaType mediaType, p pVar, Object obj) {
            d.this.w(pVar, a(str, RequestBody.create(mediaType, bArr), obj));
        }
    }

    /* compiled from: OkHttpClientManager.java */
    /* loaded from: classes3.dex */
    public static abstract class p<T> {

        /* renamed from: a  reason: collision with root package name */
        Type f14686a = a(getClass());

        static Type a(Class<?> cls) {
            Type genericSuperclass = cls.getGenericSuperclass();
            if (!(genericSuperclass instanceof Class)) {
                return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
            }
            throw new RuntimeException("Missing type parameter.");
        }

        public void b() {
        }

        public void c(Request request) {
        }

        public abstract void d(Request request, Exception exc);

        public abstract void e(T t4);
    }

    /* compiled from: OkHttpClientManager.java */
    /* loaded from: classes3.dex */
    public class q {
        public q() {
        }

        private Request a(String str, File[] fileArr, String[] strArr, n[] nVarArr, Object obj) {
            n[] X = d.this.X(nVarArr);
            MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
            for (n nVar : X) {
                type.addPart(Headers.of("Content-Disposition", "form-data; name=\"" + nVar.f14681a + m.a.f71493g), RequestBody.create((MediaType) null, nVar.f14682b));
            }
            if (fileArr != null) {
                for (int i4 = 0; i4 < fileArr.length; i4++) {
                    File file = fileArr[i4];
                    String name = file.getName();
                    type.addPart(Headers.of("Content-Disposition", "form-data; name=\"" + strArr[i4] + "\"; filename=\"" + name + m.a.f71493g), RequestBody.create(MediaType.parse(d.this.J(name)), file));
                }
            }
            return new Request.Builder().url(str).post(type.build()).tag(obj).build();
        }

        public Response b(String str, String str2, File file, Object obj) throws IOException {
            return d(str, new String[]{str2}, new File[]{file}, null, obj);
        }

        public Response c(String str, String str2, File file, n[] nVarArr, Object obj) throws IOException {
            return d(str, new String[]{str2}, new File[]{file}, nVarArr, obj);
        }

        public Response d(String str, String[] strArr, File[] fileArr, n[] nVarArr, Object obj) throws IOException {
            return d.this.f14635a.newCall(a(str, fileArr, strArr, nVarArr, obj)).execute();
        }

        public void e(String str, String str2, File file, p pVar, Object obj) throws IOException {
            g(str, new String[]{str2}, new File[]{file}, null, pVar, obj);
        }

        public void f(String str, String str2, File file, n[] nVarArr, p pVar, Object obj) {
            g(str, new String[]{str2}, new File[]{file}, nVarArr, pVar, obj);
        }

        public void g(String str, String[] strArr, File[] fileArr, n[] nVarArr, p pVar, Object obj) {
            d.this.w(pVar, a(str, fileArr, strArr, nVarArr, obj));
        }
    }

    private d() {
        L();
        this.f14636b = new Handler(Looper.getMainLooper());
        this.f14637c = JsonMapper.e();
    }

    public static i A() {
        return G().b();
    }

    public static j B() {
        return G().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Class<?>[] C(Type type) {
        Class<?>[] clsArr = new Class[1];
        try {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type type2 = parameterizedType.getActualTypeArguments()[0];
                String obj = parameterizedType.getRawType().toString();
                if (obj.startsWith("class ")) {
                    obj = obj.replace("class ", "");
                } else if (obj.startsWith("interface ")) {
                    obj = obj.replace("interface ", "");
                }
                clsArr[0] = Class.forName(obj);
                return v(clsArr, C(type2));
            }
            String obj2 = type.toString();
            if (obj2.startsWith("class ")) {
                obj2 = obj2.replace("class ", "");
            } else if (obj2.startsWith("interface ")) {
                obj2 = obj2.replace("interface ", "");
            }
            clsArr[0] = Class.forName(obj2);
            return clsArr;
        } catch (ClassNotFoundException e5) {
            e5.printStackTrace();
            return clsArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String D(String str) {
        int lastIndexOf = str.lastIndexOf(net.lingala.zip4j.util.e.F0);
        return lastIndexOf < 0 ? str : str.substring(lastIndexOf + 1, str.length());
    }

    public static l F() {
        return G().d();
    }

    public static d G() {
        if (f14634l == null) {
            synchronized (d.class) {
                if (f14634l == null) {
                    f14634l = new d();
                }
            }
        }
        return f14634l;
    }

    public static q I() {
        return G().e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String J(String str) {
        String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(str);
        return contentTypeFor == null ? HttpPostBodyUtil.DEFAULT_BINARY_CONTENT_TYPE : contentTypeFor;
    }

    private void K() {
    }

    private void L() {
        OkHttpClient.Builder V = V(new OkHttpClient.Builder());
        V.hostnameVerifier(new a());
        this.f14635a = V.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public n[] M(Map<String, String> map) {
        int i4 = 0;
        if (map == null) {
            return new n[0];
        }
        n[] nVarArr = new n[map.size()];
        for (Map.Entry<String, String> entry : map.entrySet()) {
            nVarArr[i4] = new n(entry.getKey(), entry.getValue());
            i4++;
        }
        return nVarArr;
    }

    public static void N(String str, String str2, p pVar) {
        G().H().o(str, str2, pVar, null);
    }

    public static void O(String str, String str2, p pVar, Object obj) {
        G().H().o(str, str2, pVar, obj);
    }

    public static void P(String str, Map<String, String> map, p pVar) {
        G().H().q(str, map, pVar, null);
    }

    public static void Q(String str, Map<String, String> map, p pVar, Object obj) {
        G().H().q(str, map, pVar, obj);
    }

    public static void R(String str, n[] nVarArr, p pVar) {
        G().H().u(str, nVarArr, pVar, null);
    }

    public static void S(String str, n[] nVarArr, p pVar, Object obj) {
        G().H().u(str, nVarArr, pVar, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(Request request, Exception exc, p pVar) {
        this.f14636b.post(new f(pVar, request, exc));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(Object obj, p pVar) {
        this.f14636b.post(new g(pVar, obj));
    }

    private OkHttpClient.Builder V(OkHttpClient.Builder builder) {
        return builder.cookieJar(new C0310d());
    }

    public static OkHttpClient W() throws Exception {
        b bVar = new b();
        SSLContext sSLContext = SSLContext.getInstance(SSLConnectionSocketFactory.SSL);
        sSLContext.init(null, new TrustManager[]{bVar}, new SecureRandom());
        return new OkHttpClient.Builder().sslSocketFactory(sSLContext.getSocketFactory(), bVar).hostnameVerifier(new c()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public n[] X(n[] nVarArr) {
        return nVarArr == null ? new n[0] : nVarArr;
    }

    private void a(Object obj) {
        Dispatcher dispatcher = this.f14635a.dispatcher();
        synchronized (dispatcher) {
            for (Call call : dispatcher.queuedCalls()) {
                if (obj.equals(call.request().tag())) {
                    call.cancel();
                }
            }
            for (Call call2 : dispatcher.runningCalls()) {
                if (obj.equals(call2.request().tag())) {
                    call2.cancel();
                }
            }
        }
    }

    private i b() {
        return this.f14640f;
    }

    private j c() {
        return this.f14639e;
    }

    private l d() {
        return this.f14638d;
    }

    private q e() {
        return this.f14642h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Request s(String str, n[] nVarArr, Object obj) {
        if (nVarArr == null) {
            nVarArr = new n[0];
        }
        FormBody.Builder builder = new FormBody.Builder();
        for (n nVar : nVarArr) {
            try {
                builder.add(nVar.f14681a, nVar.f14682b);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        FormBody build = builder.build();
        Request.Builder builder2 = new Request.Builder();
        builder2.url(str).post(build);
        if (obj != null) {
            builder2.tag(obj);
        }
        return builder2.build();
    }

    public static void t(Object obj) {
        G().a(obj);
    }

    private Class<?>[] v(Class<?>[] clsArr, Class<?>[] clsArr2) {
        Class<?>[] clsArr3 = new Class[clsArr.length + clsArr2.length];
        System.arraycopy(clsArr, 0, clsArr3, 0, clsArr.length);
        System.arraycopy(clsArr2, 0, clsArr3, clsArr.length, clsArr2.length);
        return clsArr3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(p pVar, Request request) {
        if (pVar == null) {
            pVar = this.f14644j;
        }
        pVar.c(request);
        this.f14635a.newCall(request).enqueue(new e(pVar));
    }

    public static void x(String str, p pVar) {
        G().E().h(str, pVar, null);
    }

    public static void y(String str, p pVar, Object obj) {
        G().E().h(str, pVar, obj);
    }

    public static OkHttpClient z() {
        return G().u();
    }

    public k E() {
        return this.f14641g;
    }

    public o H() {
        return this.f14643i;
    }

    public OkHttpClient u() {
        return this.f14635a;
    }
}
