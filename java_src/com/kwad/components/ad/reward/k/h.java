package com.kwad.components.ad.reward.k;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class h implements com.kwad.sdk.core.webview.c.a {
    private a xl;

    /* loaded from: classes5.dex */
    public interface a {
        void R(int i4);
    }

    public h(a aVar) {
        this.xl = aVar;
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, @NonNull com.kwad.sdk.core.webview.c.c cVar) {
        if (this.xl != null) {
            int i4 = 0;
            try {
                i4 = new JSONObject(str).optInt("severCheckResult");
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
            this.xl.R(i4);
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @NonNull
    public final String getKey() {
        return "hasReward";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        this.xl = null;
    }
}
