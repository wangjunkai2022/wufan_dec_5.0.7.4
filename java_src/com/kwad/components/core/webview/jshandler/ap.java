package com.kwad.components.core.webview.jshandler;

import android.content.Context;
import androidx.annotation.NonNull;
import com.kwad.sdk.commercial.smallApp.JumpFrom;
import com.kwad.sdk.core.response.model.AdTemplate;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class ap implements com.kwad.sdk.core.webview.c.a {
    private AdTemplate mAdTemplate;
    private Context mContext;

    public ap(Context context, AdTemplate adTemplate) {
        this.mContext = context;
        this.mAdTemplate = adTemplate;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, @NonNull com.kwad.sdk.core.webview.c.c cVar) {
        AdTemplate adTemplate;
        com.kwad.components.core.webview.a.c cVar2 = new com.kwad.components.core.webview.a.c();
        if (this.mContext == null) {
            com.kwad.sdk.core.adlog.c.j(this.mAdTemplate, 2);
            cVar.onError(-1, "context为空");
            return;
        }
        AdTemplate adTemplate2 = null;
        try {
            cVar2.parseJson(new JSONObject(str));
            adTemplate = this.mAdTemplate;
        } catch (Exception e5) {
            e = e5;
        }
        try {
            int i4 = cVar2.Wy;
            if (i4 > 0) {
                adTemplate = com.kwad.sdk.core.response.b.c.a(com.kwad.components.core.n.a.d.a.a.at(i4), cVar2.JK);
            }
            if (adTemplate == null) {
                com.kwad.sdk.core.adlog.c.j(this.mAdTemplate, 2);
                cVar.onError(-1, "adTemplate为空：" + cVar2.Wy);
                return;
            }
            if (com.kwad.components.core.e.d.e.a(this.mContext, cVar2.aJ(com.kwad.sdk.core.response.b.a.df(com.kwad.sdk.core.response.b.e.dS(adTemplate))), JumpFrom.H5, adTemplate) == 1) {
                cVar.a(null);
            } else {
                cVar.onError(-1, "跳转失败");
            }
        } catch (Exception e6) {
            e = e6;
            adTemplate2 = adTemplate;
            com.kwad.sdk.core.adlog.c.j(adTemplate2, 2);
            cVar.onError(-1, "解析失败");
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @NonNull
    public final String getKey() {
        return "openWechatMiniProgram";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}
