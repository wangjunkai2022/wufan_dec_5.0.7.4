package com.kwad.sdk.core.network;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.sdk.core.network.NormalResultData;
import com.kwad.sdk.core.network.n;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.bo;
/* loaded from: classes5.dex */
public abstract class m<R extends n, T extends NormalResultData> extends a<R> {
    private static final String TAG = "NormalNetworking";
    @Nullable
    private g<R, T> mListener = null;

    private void onRequest(@NonNull g<R, T> gVar) {
        this.mListener = gVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.sdk.core.network.a
    public void cancel() {
        super.cancel();
        this.mListener = null;
    }

    protected abstract T createResponseData();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kwad.sdk.core.network.a
    protected void fetchImpl() {
        c cVar;
        n nVar = (n) createRequest();
        try {
            String url = nVar.getUrl();
            if (nVar.getMethod().equals("POST")) {
                cVar = com.kwad.sdk.g.yy().doPost(url, nVar.getHeader(), nVar.getBody());
            } else {
                cVar = com.kwad.sdk.g.yy().doGet(url, nVar.getHeader());
            }
            if (cVar != null && cVar.code == 200) {
                com.kwad.sdk.core.e.c.d(TAG, "normal request success:" + cVar.code);
            } else {
                com.kwad.sdk.core.e.c.d(TAG, "normal request failed");
            }
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.printStackTrace(e5);
            cVar = 0 == 0 ? new c() : null;
            cVar.code = -1;
            cVar.awD = e5;
        }
        onResponse((m<R, T>) nVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kwad.sdk.core.network.a
    protected /* bridge */ /* synthetic */ void onResponse(f fVar, c cVar) {
        onResponse((m<R, T>) ((n) fVar), cVar);
    }

    protected void parseResponse(T t4, c cVar) {
        t4.parseResponse(cVar);
    }

    public void request(@NonNull g<R, T> gVar) {
        try {
            onRequest(gVar);
            fetch();
        } catch (Throwable th) {
            gVar.onError(null, e.awP.errorCode, bo.t(th));
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    protected void onResponse(R r4, c cVar) {
        if (this.mListener == null) {
            return;
        }
        if (cVar.Ew()) {
            T createResponseData = createResponseData();
            parseResponse(createResponseData, cVar);
            this.mListener.onSuccess(r4, createResponseData);
            return;
        }
        g<R, T> gVar = this.mListener;
        int i4 = cVar.code;
        Exception exc = cVar.awD;
        gVar.onError(r4, i4, exc != null ? exc.getMessage() : "");
    }
}
