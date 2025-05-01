package com.kwad.components.ad.reward.k;

import android.content.DialogInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.webview.jshandler.x;
import com.kwad.sdk.core.response.model.AdTemplate;
import java.lang.ref.WeakReference;
/* loaded from: classes5.dex */
public final class q extends x {
    private long vA;
    private WeakReference<com.kwad.components.ad.reward.g> xq;

    public q(@NonNull com.kwad.sdk.core.webview.b bVar, @Nullable com.kwad.components.core.e.d.c cVar, @Nullable com.kwad.components.ad.reward.g gVar, long j4, @Nullable com.kwad.sdk.core.webview.d.a.a aVar, @Nullable DialogInterface.OnDismissListener onDismissListener) {
        super(bVar, cVar, aVar, onDismissListener);
        this.vA = -1L;
        this.vA = j4;
        if (gVar != null) {
            this.xq = new WeakReference<>(gVar);
        }
    }

    @Override // com.kwad.components.core.webview.jshandler.x
    public final a.C0457a a(a.C0457a c0457a, com.kwad.sdk.core.webview.d.b.a aVar, AdTemplate adTemplate) {
        WeakReference<com.kwad.components.ad.reward.g> weakReference = this.xq;
        long j4 = 0;
        if (weakReference != null && weakReference.get() != null) {
            j4 = this.xq.get().oK.getPlayDuration();
        } else {
            long j5 = this.vA;
            if (j5 > 0) {
                j4 = j5;
            }
        }
        return super.a(c0457a, aVar, adTemplate).w(j4);
    }

    @Override // com.kwad.components.core.webview.jshandler.x
    public final void ji() {
        super.ji();
        if (this.WQ != null) {
            com.kwad.components.ad.reward.c.a.gM().c(this.WQ.getAdTemplate(), com.kwad.components.ad.reward.c.b.STATUS_NONE);
        }
    }
}
