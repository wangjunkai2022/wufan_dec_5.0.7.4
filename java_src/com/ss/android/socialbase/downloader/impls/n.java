package com.ss.android.socialbase.downloader.impls;

import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.network.IDownloadHttpService;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;
import okhttp3.Call;
import okhttp3.Dns;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
/* loaded from: classes5.dex */
public class n implements IDownloadHttpService {
    private final com.ss.android.socialbase.downloader.wv.qv<String, OkHttpClient> vv = new com.ss.android.socialbase.downloader.wv.qv<>(4, 8);

    private OkHttpClient vv(String str, final String str2) {
        try {
            final String host = Uri.parse(str).getHost();
            if (!TextUtils.isEmpty(host) && !TextUtils.isEmpty(str2)) {
                String str3 = host + "_" + str2;
                synchronized (this.vv) {
                    OkHttpClient okHttpClient = this.vv.get(str3);
                    if (okHttpClient != null) {
                        return okHttpClient;
                    }
                    OkHttpClient.Builder y2 = com.ss.android.socialbase.downloader.downloader.p.y();
                    y2.dns(new Dns() { // from class: com.ss.android.socialbase.downloader.impls.n.2
                    });
                    OkHttpClient build = y2.build();
                    synchronized (this.vv) {
                        this.vv.put(str3, build);
                    }
                    return build;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return com.ss.android.socialbase.downloader.downloader.p.la();
    }

    @Override // com.ss.android.socialbase.downloader.network.IDownloadHttpService
    public com.ss.android.socialbase.downloader.network.wv downloadWithConnection(int i4, String str, List<com.ss.android.socialbase.downloader.model.p> list) throws IOException {
        String str2;
        OkHttpClient la;
        Request.Builder url = new Request.Builder().url(str);
        if (list == null || list.size() <= 0) {
            str2 = null;
        } else {
            str2 = null;
            for (com.ss.android.socialbase.downloader.model.p pVar : list) {
                String vv = pVar.vv();
                if (str2 == null && "ss_d_request_host_ip_114".equals(vv)) {
                    str2 = pVar.m();
                } else {
                    url.addHeader(vv, com.ss.android.socialbase.downloader.wv.u.n(pVar.m()));
                }
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            la = vv(str, str2);
        } else {
            la = com.ss.android.socialbase.downloader.downloader.p.la();
        }
        if (la != null) {
            final Call newCall = la.newCall(url.build());
            final Response execute = newCall.execute();
            if (execute != null) {
                final ResponseBody body = execute.body();
                if (body != null) {
                    InputStream byteStream = body.byteStream();
                    String header = execute.header("Content-Encoding");
                    final GZIPInputStream gZIPInputStream = (header == null || !"gzip".equalsIgnoreCase(header) || (byteStream instanceof GZIPInputStream)) ? byteStream : new GZIPInputStream(byteStream);
                    return new com.ss.android.socialbase.downloader.network.o() { // from class: com.ss.android.socialbase.downloader.impls.n.1
                        @Override // com.ss.android.socialbase.downloader.network.wv
                        public void i() {
                            try {
                                ResponseBody responseBody = body;
                                if (responseBody != null) {
                                    responseBody.close();
                                }
                                Call call = newCall;
                                if (call == null || call.isCanceled()) {
                                    return;
                                }
                                newCall.cancel();
                            } catch (Throwable unused) {
                            }
                        }

                        @Override // com.ss.android.socialbase.downloader.network.n
                        public int m() throws IOException {
                            return execute.code();
                        }

                        @Override // com.ss.android.socialbase.downloader.network.vv
                        public String o() {
                            return "";
                        }

                        @Override // com.ss.android.socialbase.downloader.network.n
                        public void p() {
                            Call call = newCall;
                            if (call == null || call.isCanceled()) {
                                return;
                            }
                            newCall.cancel();
                        }

                        @Override // com.ss.android.socialbase.downloader.network.wv
                        public InputStream vv() throws IOException {
                            return gZIPInputStream;
                        }

                        @Override // com.ss.android.socialbase.downloader.network.n
                        public String vv(String str3) {
                            return execute.header(str3);
                        }
                    };
                }
                return null;
            }
            throw new IOException("can't get response");
        }
        throw new IOException("can't get httpClient");
    }
}
