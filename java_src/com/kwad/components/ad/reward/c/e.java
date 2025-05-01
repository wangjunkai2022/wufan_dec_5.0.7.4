package com.kwad.components.ad.reward.c;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ksad.json.annotation.KsJson;
/* loaded from: classes5.dex */
public final class e implements com.kwad.sdk.core.webview.c.a {
    private String TAG;
    private com.kwad.sdk.core.webview.c.c nt;

    @KsJson
    /* loaded from: classes5.dex */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public String rr;
    }

    public e() {
        String str = "ExtraDialogListener" + hashCode();
        this.TAG = str;
        com.kwad.sdk.core.e.c.d(str, "create: ");
    }

    private void F(String str) {
        if (TextUtils.isEmpty(str) || this.nt == null) {
            return;
        }
        a aVar = new a();
        aVar.rr = str;
        this.nt.a(aVar);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, @NonNull com.kwad.sdk.core.webview.c.c cVar) {
        String str2 = this.TAG;
        com.kwad.sdk.core.e.c.d(str2, "handleJsCall: " + cVar);
        this.nt = cVar;
    }

    public final void gR() {
        com.kwad.sdk.core.e.c.d(this.TAG, "notifyDialogClose: ");
        F("close");
    }

    @Override // com.kwad.sdk.core.webview.c.a
    @NonNull
    public final String getKey() {
        return "registerExtraDialogListener";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
        com.kwad.sdk.core.e.c.d(this.TAG, "onDestroy: ");
        this.nt = null;
    }
}
