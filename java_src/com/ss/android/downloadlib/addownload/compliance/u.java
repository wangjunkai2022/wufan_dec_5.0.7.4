package com.ss.android.downloadlib.addownload.compliance;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.download.api.config.g;
import com.ss.android.downloadlib.addownload.b;
import com.tencent.cos.common.COSHttpResponseKey;
import com.umeng.analytics.pro.bm;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class u {
    private final AtomicInteger vv;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class vv {
        private static u vv = new u();
    }

    private u() {
        this.vv = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String m() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.vv.get() < 3 ? "https://apps.bytesfield.com" : "https://apps.bytesfield-b.com");
        sb.append("/customer/api/app/deep_link");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(@NonNull final com.ss.android.downloadlib.addownload.m.o oVar, final String str, final byte[] bArr, final qv qvVar) {
        b.i().vv(str, bArr, "application/json; charset=utf-8", 0, new g() { // from class: com.ss.android.downloadlib.addownload.compliance.u.2
            @Override // com.ss.android.download.api.config.g
            public void vv(String str2) {
                u.this.vv(oVar, str2, qvVar);
            }

            @Override // com.ss.android.download.api.config.g
            public void vv(Throwable th) {
                u.this.vv(oVar, str, bArr, qvVar);
            }
        });
    }

    public static u vv() {
        return vv.vv;
    }

    public void vv(final com.ss.android.downloadlib.addownload.m.o oVar, final qv qvVar) {
        if (b.i() == null) {
            com.ss.android.downloadlib.o.p.vv().vv("getDownloadNetworkFactory == NULL");
            vv(401, oVar);
            return;
        }
        com.ss.android.downloadlib.i.vv().vv(new Runnable() { // from class: com.ss.android.downloadlib.addownload.compliance.u.1
            @Override // java.lang.Runnable
            public void run() {
                u uVar = u.this;
                uVar.m(oVar, uVar.m(), u.this.vv(oVar, true, 4), qvVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(com.ss.android.downloadlib.addownload.m.o oVar, String str, byte[] bArr, qv qvVar) {
        if (this.vv.get() < 6) {
            this.vv.incrementAndGet();
            m(oVar, str, bArr, qvVar);
            return;
        }
        vv("当前网络不佳，请稍后再试");
        this.vv.set(0);
        vv(402, oVar);
    }

    private void vv(final String str) {
        com.ss.android.downloadlib.n.vv().m().post(new Runnable() { // from class: com.ss.android.downloadlib.addownload.compliance.u.3
            @Override // java.lang.Runnable
            public void run() {
                b.p().vv(6, b.getContext(), null, str, null, 0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] vv(com.ss.android.downloadlib.addownload.m.o oVar, boolean z4, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(COSHttpResponseKey.DOWNLOAD_URL, oVar.vv());
            jSONObject.put(bm.f63454o, oVar.o());
            jSONObject.put("call_scene", 50);
            if (z4) {
                jSONObject.put("sender_package_name", b.getContext().getPackageName());
                jSONObject.put("sender_version", b.k().f60344o);
                if (i4 > 0) {
                    jSONObject.put("store", i4);
                }
            } else {
                jSONObject.put("id", String.valueOf(oVar.m()));
                if (oVar.y().getDeepLink() != null) {
                    if (TextUtils.isEmpty(oVar.y().getDeepLink().getWebUrl())) {
                        com.ss.android.downloadlib.o.p.vv().vv("web_url is null");
                    }
                    jSONObject.put("web_url", oVar.y().getDeepLink().getWebUrl());
                } else {
                    com.ss.android.downloadlib.o.p.vv().vv("deeplink is null");
                }
            }
        } catch (Exception unused) {
            com.ss.android.downloadlib.o.p.vv().vv("param build error");
        }
        return jSONObject.toString().getBytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vv(@NonNull com.ss.android.downloadlib.addownload.m.o oVar, String str, qv qvVar) {
        try {
            if (TextUtils.isEmpty(str)) {
                com.ss.android.downloadlib.o.p.vv().vv("response content is null");
                vv(404, oVar);
                qvVar.vv();
                return;
            }
            this.vv.set(0);
            o n4 = o.n(str);
            if (n4.vv() != 0) {
                vv(403, oVar);
                qvVar.vv();
            } else if (TextUtils.isEmpty(n4.m())) {
                vv(405, oVar);
                qvVar.vv();
            } else {
                qvVar.vv(n4.m());
            }
        } catch (Exception e5) {
            com.ss.android.downloadlib.o.p.vv().vv(e5, "DownloadMiuiMarketHelper parseResponse");
        }
    }

    public void vv(int i4, com.ss.android.downloadlib.addownload.m.o oVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("download_miui_market_fail_code", Integer.valueOf(i4));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.ss.android.downloadlib.i.vv.vv().vv("get_miui_market_compliance_error", jSONObject, oVar);
    }

    public void vv(int i4, com.ss.android.downloadlib.addownload.m.o oVar, JSONObject jSONObject) {
        try {
            jSONObject.putOpt("download_miui_market_success_result", Integer.valueOf(i4));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.ss.android.downloadlib.i.vv.vv().vv("get_miui_market_compliance_success", jSONObject, oVar);
    }
}
