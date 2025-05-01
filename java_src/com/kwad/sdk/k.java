package com.kwad.sdk;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.join.mgps.Util.h0;
import com.kwad.framework.filedownloader.f.c;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.q;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
/* loaded from: classes5.dex */
public final class k implements com.kwad.framework.filedownloader.a.b {
    private final OkHttpClient alI;
    private final Request.Builder alJ;
    private Request alK;
    private Response alL;

    /* loaded from: classes5.dex */
    public static class a implements c.b {
        private volatile OkHttpClient alI;
        private OkHttpClient.Builder alM;

        public a() {
        }

        @Override // com.kwad.framework.filedownloader.f.c.b
        public final com.kwad.framework.filedownloader.a.b bh(String str) {
            if (this.alI == null) {
                synchronized (a.class) {
                    if (this.alI == null) {
                        OkHttpClient.Builder builder = this.alM;
                        this.alI = builder != null ? builder.build() : new OkHttpClient();
                        this.alM = null;
                    }
                }
            }
            return new k(str, this.alI, (byte) 0);
        }

        public a(boolean z4) {
            if (z4) {
                this.alM = k.zH();
            } else {
                this.alM = k.zI();
            }
        }
    }

    /* synthetic */ k(String str, OkHttpClient okHttpClient, byte b5) {
        this(str, okHttpClient);
    }

    private String cc(String str) {
        String bg = bg("Content-Type");
        String extension = q.getExtension(str);
        String str2 = ".apk";
        if (!TextUtils.isEmpty(bg) && TextUtils.isEmpty(extension)) {
            String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(bg);
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            if (!TextUtils.isEmpty(extensionFromMimeType)) {
                str2 = h0.f27805a + extensionFromMimeType;
            }
            sb.append(str2);
            return sb.toString();
        } else if (TextUtils.isEmpty(str)) {
            return System.currentTimeMillis() + ".apk";
        } else {
            return str;
        }
    }

    private static OkHttpClient.Builder zF() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return builder.connectTimeout(com.join.mgps.data.c.f49010a, timeUnit).addInterceptor(new com.kwad.sdk.j.a()).readTimeout(0L, timeUnit).connectionPool(new ConnectionPool(6, 60000L, timeUnit)).retryOnConnectionFailure(true);
    }

    private static OkHttpClient.Builder zG() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return builder.connectTimeout(com.join.mgps.data.c.f49010a, timeUnit).addInterceptor(new com.kwad.sdk.j.a()).protocols(Util.immutableList(Protocol.HTTP_1_1)).readTimeout(0L, timeUnit).connectionPool(new ConnectionPool(6, 60000L, timeUnit)).retryOnConnectionFailure(true);
    }

    static /* synthetic */ OkHttpClient.Builder zH() {
        return zG();
    }

    static /* synthetic */ OkHttpClient.Builder zI() {
        return zF();
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final void addHeader(String str, String str2) {
        this.alJ.addHeader(str, str2);
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final String bg(String str) {
        String str2;
        if ("Content-Disposition".equals(str)) {
            try {
            } catch (Exception unused) {
                str2 = "";
            }
            if (TextUtils.isEmpty(com.kwad.framework.filedownloader.f.f.by(this.alL.header(str)))) {
                List<String> pathSegments = this.alL.request().url().pathSegments();
                str2 = pathSegments.get(pathSegments.size() - 1);
                return "attachment; filename=\"" + cc(str2) + m.a.f71493g;
            }
            return this.alL.header(str);
        }
        Response response = this.alL;
        if (response == null) {
            return null;
        }
        return response.header(str);
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final void execute() {
        if (this.alK == null) {
            this.alK = this.alJ.build();
        }
        this.alL = this.alI.newCall(this.alK).execute();
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final InputStream getInputStream() {
        Response response = this.alL;
        if (response != null) {
            return ((com.kwad.sdk.service.a.j) ServiceProvider.get(com.kwad.sdk.service.a.j.class)).wrapInputStream(response.body().byteStream());
        }
        throw new IllegalStateException("Please invoke #execute first!");
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final int getResponseCode() {
        Response response = this.alL;
        if (response != null) {
            return response.code();
        }
        throw new IllegalStateException("Please invoke #execute first!");
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final Map<String, List<String>> vG() {
        if (this.alK == null) {
            this.alK = this.alJ.build();
        }
        return this.alK.headers().toMultimap();
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final Map<String, List<String>> vH() {
        Response response = this.alL;
        if (response == null) {
            return null;
        }
        return response.headers().toMultimap();
    }

    @Override // com.kwad.framework.filedownloader.a.b
    public final void vI() {
        this.alK = null;
        Response response = this.alL;
        if (response != null && response.body() != null) {
            com.kwad.sdk.crash.utils.b.closeQuietly(this.alL.body());
        }
        this.alL = null;
    }

    private k(Request.Builder builder, OkHttpClient okHttpClient) {
        this.alJ = builder;
        this.alI = okHttpClient;
    }

    private k(String str, OkHttpClient okHttpClient) {
        this(new Request.Builder().url(str), okHttpClient);
    }
}
