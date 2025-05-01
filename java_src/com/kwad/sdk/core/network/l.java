package com.kwad.sdk.core.network;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.kwad.sdk.core.network.f;
import com.kwad.sdk.core.network.idc.DomainException;
import com.kwad.sdk.core.response.model.BaseResultData;
import com.kwad.sdk.export.proxy.AdHttpProxy;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ah;
import com.kwad.sdk.utils.bo;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public abstract class l<R extends f, T extends BaseResultData> extends a<R> {
    private static final String TAG = "Networking";
    @Nullable
    private g<R, T> mListener = null;
    private final com.kwad.sdk.core.network.b.b mMonitorRecorder = com.kwad.sdk.core.network.b.c.ET();

    private void checkAndSetHasData(BaseResultData baseResultData) {
        if (baseResultData.hasData()) {
            this.mMonitorRecorder.dg(1);
        }
    }

    private void checkIpDirect(c cVar) {
        com.kwad.sdk.service.a.f fVar;
        if (cVar == null || cVar.Ew() || (fVar = (com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)) == null || !ah.isNetworkConnected(fVar.getContext())) {
            return;
        }
        com.kwad.sdk.ip.direct.a.Jt();
    }

    private String getHostTypeByUrl(@NonNull String str) {
        return str.contains("/rest/zt/emoticon/package/list") ? "zt" : "api";
    }

    private void notifyOnErrorListener(@NonNull R r4, c cVar, String str) {
        String url = r4.getUrl();
        DomainException domainException = new DomainException(cVar.awC, cVar.awD);
        com.kwad.sdk.core.network.idc.a.EE().a(url, getHostTypeByUrl(url), domainException);
        notifyOnErrorListener((l<R, T>) r4, cVar.code, str);
    }

    private void notifyOnStartRequest(@NonNull R r4) {
        g<R, T> gVar = this.mListener;
        if (gVar == null) {
            return;
        }
        gVar.onStartRequest(r4);
    }

    private void notifyOnSuccess(@NonNull R r4, T t4) {
        if (com.kwad.sdk.core.network.idc.a.EE().EG()) {
            String hostTypeByUrl = getHostTypeByUrl(r4.getUrl());
            if ("api".equals(hostTypeByUrl)) {
                com.kwad.sdk.core.network.idc.a.EE().eb(hostTypeByUrl);
            }
        }
        g<R, T> gVar = this.mListener;
        if (gVar == null) {
            return;
        }
        gVar.onSuccess(r4, t4);
        this.mMonitorRecorder.ES();
    }

    private void onRequest(@NonNull g<R, T> gVar) {
        this.mMonitorRecorder.EM();
        this.mListener = gVar;
    }

    private void parseCommonData(String str, String str2) {
        try {
            q.EA().U(str, new JSONObject(str2).optString("requestSessionData"));
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
    }

    private void reportSdkCaughtException(Throwable th) {
        if (enableCrashReport()) {
            ServiceProvider.reportSdkCaughtException(th);
        } else {
            com.kwad.sdk.core.e.c.printStackTrace(th);
        }
    }

    private void setMonitorRequestId(@NonNull f fVar) {
        Map<String, String> header = fVar.getHeader();
        if (header != null) {
            String str = header.get(d.TRACK_ID_KEY);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.mMonitorRecorder.el(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void afterParseData(T t4) {
    }

    @Override // com.kwad.sdk.core.network.a
    public void cancel() {
        super.cancel();
        this.mListener = null;
    }

    protected boolean enableCrashReport() {
        return true;
    }

    protected boolean enableMonitorReport() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kwad.sdk.core.network.a
    @WorkerThread
    protected void fetchImpl() {
        f fVar;
        Throwable th;
        c cVar = null;
        try {
            this.mMonitorRecorder.EQ();
            fVar = createRequest();
            try {
                notifyOnStartRequest(fVar);
                this.mMonitorRecorder.eh(fVar.getUrl()).ei(fVar.getUrl());
                setMonitorRequestId(fVar);
                if (!ah.isNetworkConnected(((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).getContext())) {
                    e eVar = e.awI;
                    notifyOnErrorListener((l<R, T>) fVar, eVar.errorCode, eVar.msg);
                    this.mMonitorRecorder.df(e.awI.errorCode).ej(e.awI.msg);
                } else {
                    try {
                        String url = fVar.getUrl();
                        AdHttpProxy yy = com.kwad.sdk.g.yy();
                        if (yy instanceof com.kwad.sdk.core.network.c.b) {
                            this.mMonitorRecorder.ek("ok_http").EP();
                        } else {
                            this.mMonitorRecorder.ek(com.facebook.common.util.f.f10923a).EP();
                        }
                        if (isPostByJson()) {
                            cVar = yy.doPost(url, fVar.getHeader(), fVar.getBody());
                        } else {
                            cVar = yy.doPost(url, fVar.getHeader(), fVar.getBodyMap());
                        }
                        com.kwad.sdk.core.e.c.i(TAG, "url: " + url + ", response: " + cVar);
                    } catch (Exception e5) {
                        notifyOnErrorListener((l<R, T>) fVar, e.awP.errorCode, bo.t(e5));
                        com.kwad.sdk.core.e.c.printStackTraceOnly(e5);
                        this.mMonitorRecorder.ej("requestError:" + e5.getMessage());
                    }
                    this.mMonitorRecorder.EN().EO().di(com.kwad.sdk.ip.direct.a.getType());
                    try {
                        onResponse(fVar, cVar);
                    } catch (Exception e6) {
                        notifyOnErrorListener((l<R, T>) fVar, e.awP.errorCode, bo.t(e6));
                        this.mMonitorRecorder.ej("onResponseError:" + e6.getMessage());
                        com.kwad.sdk.core.e.c.printStackTraceOnly(e6);
                    }
                }
                try {
                    if (enableMonitorReport()) {
                        this.mMonitorRecorder.report();
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    try {
                        this.mMonitorRecorder.ej("requestError:" + th.getMessage());
                    } catch (Throwable th3) {
                        try {
                            if (enableMonitorReport()) {
                                this.mMonitorRecorder.report();
                            }
                        } catch (Exception unused2) {
                        }
                        throw th3;
                    }
                } catch (Exception unused3) {
                    notifyOnErrorListener((l<R, T>) fVar, e.awP.errorCode, bo.t(th));
                    com.kwad.sdk.core.e.c.printStackTrace(th);
                    try {
                        if (enableMonitorReport()) {
                            this.mMonitorRecorder.report();
                        }
                    } catch (Exception unused4) {
                    }
                }
            }
        } catch (Throwable th4) {
            fVar = null;
            th = th4;
        }
    }

    protected boolean isPostByJson() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.sdk.core.network.a
    public void onResponse(R r4, c cVar) {
        if (cVar == null) {
            e eVar = e.awI;
            notifyOnErrorListener((l<R, T>) r4, eVar.errorCode, eVar.msg);
            this.mMonitorRecorder.ej("responseBase is null");
            com.kwad.sdk.core.e.c.e(TAG, "request responseBase is null");
            return;
        }
        this.mMonitorRecorder.df(cVar.code);
        checkIpDirect(cVar);
        if (!TextUtils.isEmpty(cVar.awE) && cVar.Ew()) {
            try {
                parseCommonData(r4.getUrl(), cVar.awE);
                T parseData = parseData(cVar.awE);
                afterParseData(parseData);
                String str = cVar.awE;
                if (str != null) {
                    this.mMonitorRecorder.ar(str.length()).ER().dh(parseData.result);
                }
                if (!parseData.isResultOk()) {
                    com.kwad.sdk.core.network.b.b bVar = this.mMonitorRecorder;
                    bVar.ej("serverCodeError:" + parseData.result + ":" + parseData.errorMsg);
                    if (parseData.notifyFailOnResultError()) {
                        notifyOnErrorListener((l<R, T>) r4, parseData.result, parseData.errorMsg);
                        return;
                    }
                }
                if (parseData.isDataEmpty()) {
                    notifyOnErrorListener((l<R, T>) r4, e.awK.errorCode, !TextUtils.isEmpty(parseData.testErrorMsg) ? parseData.testErrorMsg : e.awK.msg);
                    return;
                }
                checkAndSetHasData(parseData);
                notifyOnSuccess(r4, parseData);
                return;
            } catch (Exception e5) {
                e eVar2 = e.awJ;
                notifyOnErrorListener((l<R, T>) r4, eVar2.errorCode, eVar2.msg);
                com.kwad.sdk.core.e.c.printStackTraceOnly(e5);
                com.kwad.sdk.core.network.b.b bVar2 = this.mMonitorRecorder;
                bVar2.ej("parseDataError:" + e5.getMessage());
                return;
            }
        }
        notifyOnErrorListener((l<R, T>) r4, cVar, "网络错误");
        com.kwad.sdk.core.network.b.b bVar3 = this.mMonitorRecorder;
        bVar3.ej("httpCodeError:" + cVar.code + ":" + cVar.awE);
        StringBuilder sb = new StringBuilder("request responseBase httpCodeError:");
        sb.append(cVar.code);
        com.kwad.sdk.core.e.c.w(TAG, sb.toString());
    }

    @NonNull
    protected abstract T parseData(String str);

    public void request(@NonNull g<R, T> gVar) {
        try {
            onRequest(gVar);
            fetch();
        } catch (Throwable th) {
            notifyOnErrorListener((l<R, T>) null, e.awP.errorCode, bo.t(th));
            reportSdkCaughtException(th);
        }
    }

    private void notifyOnErrorListener(@NonNull R r4, int i4, String str) {
        try {
            h.Ex().b(r4, i4);
        } catch (Throwable th) {
            reportSdkCaughtException(th);
        }
        g<R, T> gVar = this.mListener;
        if (gVar == null) {
            return;
        }
        gVar.onError(r4, i4, str);
        this.mMonitorRecorder.ES();
    }
}
