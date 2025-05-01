package com.kwad.components.ad.reward;

import androidx.annotation.Nullable;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.bh;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class o {

    /* loaded from: classes5.dex */
    static class a {
        private String errorMsg;
        private boolean qt;

        public a(String str) {
            JSONObject jSONObject;
            this.errorMsg = "-";
            try {
                jSONObject = new JSONObject(str);
            } catch (Throwable th) {
                th.printStackTrace();
                this.qt = false;
                this.errorMsg = "数据解析失败";
                jSONObject = null;
            }
            parseJson(jSONObject);
        }

        private void parseJson(@Nullable JSONObject jSONObject) {
            if (jSONObject != null) {
                this.qt = jSONObject.optBoolean("isValid");
                this.errorMsg = jSONObject.toString();
            }
        }

        public final boolean isValid() {
            return this.qt;
        }
    }

    public static void b(final AdTemplate adTemplate, AdInfo adInfo) {
        final String bP = com.kwad.sdk.core.response.b.a.bP(adInfo);
        com.kwad.sdk.core.e.c.d("ServerCallbackHandle", "handleRewardVerify callbackUrl: " + bP);
        if (bh.isNullString(bP)) {
            return;
        }
        com.kwad.sdk.utils.g.execute(new Runnable() { // from class: com.kwad.components.ad.reward.o.1
            private void E(String str) {
                com.kwad.components.core.o.a.qI().g(adTemplate, 1, str);
            }

            private void gp() {
                com.kwad.components.core.o.a.qI().g(adTemplate, 0, "success");
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    com.kwad.sdk.core.network.c doGet = com.kwad.sdk.g.yy().doGet(bP, null);
                    if (doGet == null) {
                        E("Network Error: url invalid");
                    } else if (doGet.code == 200) {
                        a aVar = new a(doGet.awE);
                        if (!aVar.isValid()) {
                            E(aVar.errorMsg);
                        } else {
                            gp();
                        }
                    } else {
                        E("Network Error: " + doGet.awE);
                    }
                } catch (Throwable th) {
                    E("Request Error: " + th.getMessage());
                }
            }
        });
    }
}
