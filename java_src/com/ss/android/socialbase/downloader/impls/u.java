package com.ss.android.socialbase.downloader.impls;

import java.io.IOException;
import java.util.List;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
/* loaded from: classes5.dex */
public class u implements com.ss.android.socialbase.downloader.network.qv {
    @Override // com.ss.android.socialbase.downloader.network.qv
    public com.ss.android.socialbase.downloader.network.n vv(String str, List<com.ss.android.socialbase.downloader.model.p> list) throws IOException {
        OkHttpClient la = com.ss.android.socialbase.downloader.downloader.p.la();
        if (la != null) {
            Request.Builder head = new Request.Builder().url(str).head();
            if (list != null && list.size() > 0) {
                for (com.ss.android.socialbase.downloader.model.p pVar : list) {
                    head.addHeader(pVar.vv(), com.ss.android.socialbase.downloader.wv.u.n(pVar.m()));
                }
            }
            final Call newCall = la.newCall(head.build());
            final Response execute = newCall.execute();
            if (execute != null) {
                if (com.ss.android.socialbase.downloader.wv.vv.vv(2097152)) {
                    execute.close();
                }
                return new com.ss.android.socialbase.downloader.network.n() { // from class: com.ss.android.socialbase.downloader.impls.u.1
                    @Override // com.ss.android.socialbase.downloader.network.n
                    public int m() throws IOException {
                        return execute.code();
                    }

                    @Override // com.ss.android.socialbase.downloader.network.n
                    public void p() {
                        Call call = newCall;
                        if (call == null || call.isCanceled()) {
                            return;
                        }
                        newCall.cancel();
                    }

                    @Override // com.ss.android.socialbase.downloader.network.n
                    public String vv(String str2) {
                        return execute.header(str2);
                    }
                };
            }
            throw new IOException("can't get response");
        }
        throw new IOException("can't get httpClient");
    }
}
