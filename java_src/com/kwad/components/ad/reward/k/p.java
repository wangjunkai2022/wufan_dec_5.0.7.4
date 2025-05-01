package com.kwad.components.ad.reward.k;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.components.core.webview.jshandler.ak;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.az;
import com.kwad.sdk.utils.bo;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class p extends ak {
    private WeakReference<com.kwad.components.ad.reward.g> qi;
    private long xn;
    private String xo;

    public p(com.kwad.components.ad.reward.g gVar, String str, long j4, com.kwad.sdk.core.webview.b bVar) {
        super(bVar);
        this.xn = -1L;
        this.xo = str;
        this.xn = j4;
        if (gVar != null) {
            this.qi = new WeakReference<>(gVar);
        }
    }

    private static boolean R(String str) {
        try {
            return new JSONObject(str).optInt("elementType") == 18;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.kwad.components.core.webview.jshandler.ak
    public final void b(boolean z4, AdTemplate adTemplate, @Nullable JSONObject jSONObject, @Nullable com.kwad.sdk.core.adlog.c.b bVar) {
        com.kwad.components.ad.reward.j.b.a(z4, adTemplate, null, bVar);
    }

    private boolean b(ak.b bVar) {
        WeakReference<com.kwad.components.ad.reward.g> weakReference;
        if (bVar.getActionType() == 140 && com.kwad.sdk.core.config.d.zz() && R(bVar.sT()) && (weakReference = this.qi) != null && weakReference.get() != null) {
            final com.kwad.components.ad.reward.g gVar = this.qi.get();
            bo.runOnUiThreadDelay(new az() { // from class: com.kwad.components.ad.reward.k.p.1
                @Override // com.kwad.sdk.utils.az
                public final void doTask() {
                    gVar.y(p.this.xo);
                }
            }, 1500L);
            return true;
        }
        return false;
    }

    @Override // com.kwad.components.core.webview.jshandler.ak
    public final void a(@NonNull ak.b bVar) {
        if (b(bVar)) {
            return;
        }
        super.a(bVar);
    }

    @Override // com.kwad.components.core.webview.jshandler.ak
    public final void a(com.kwad.sdk.core.adlog.c.b bVar) {
        super.a(bVar);
        WeakReference<com.kwad.components.ad.reward.g> weakReference = this.qi;
        if (weakReference != null && weakReference.get() != null) {
            bVar.ao(this.qi.get().oK.getPlayDuration());
            return;
        }
        long j4 = this.xn;
        if (j4 > 0) {
            bVar.ao(j4);
        }
    }
}
