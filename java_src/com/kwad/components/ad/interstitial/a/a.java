package com.kwad.components.ad.interstitial.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.kwad.components.ad.interstitial.report.b;
import com.kwad.sdk.core.config.d;
import com.kwad.sdk.core.network.a.a;
import com.kwad.sdk.core.response.b.e;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.videocache.f;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.q;
import java.io.File;
/* loaded from: classes5.dex */
public final class a {
    public static boolean j(@NonNull AdTemplate adTemplate) {
        boolean z4;
        f by;
        String K = com.kwad.sdk.core.response.b.a.K(e.dS(adTemplate));
        if (TextUtils.isEmpty(K)) {
            b.dP().b(adTemplate, "empty videoUrl");
            return false;
        }
        b.dP().o(adTemplate);
        int zA = d.zA();
        String str = "";
        if (zA < 0) {
            File bZ = com.kwad.sdk.core.diskcache.b.a.DM().bZ(K);
            if (q.L(bZ)) {
                z4 = true;
            } else {
                a.C0525a c0525a = new a.C0525a();
                z4 = com.kwad.sdk.core.diskcache.b.a.DM().a(K, c0525a);
                str = c0525a.msg;
            }
            adTemplate.setDownloadSize(bZ != null ? bZ.length() : 0L);
            adTemplate.setDownloadType(2);
        } else if (zA > 0) {
            a.C0525a c0525a2 = new a.C0525a();
            if (d.Do() == 1) {
                by = com.kwad.sdk.core.videocache.c.a.b(ServiceProvider.getContext(), 1, 0);
            } else if (d.Do() == 2) {
                by = com.kwad.sdk.core.videocache.c.a.b(ServiceProvider.getContext(), 1, 1);
            } else {
                by = com.kwad.sdk.core.videocache.c.a.by(ServiceProvider.getContext());
            }
            z4 = !by.eM(K) ? by.a(K, zA * 1024, c0525a2, null) : true;
            str = c0525a2.msg;
            adTemplate.setDownloadSize(zA * 1024);
            adTemplate.setDownloadType(3);
        } else {
            adTemplate.setDownloadSize(0L);
            adTemplate.setDownloadType(1);
            z4 = true;
        }
        if (!z4) {
            adTemplate.setDownloadStatus(2);
            b.dP().b(adTemplate, str);
            com.kwad.components.ad.interstitial.report.realtime.a.dV();
            com.kwad.components.ad.interstitial.report.realtime.a.b(str, adTemplate);
        } else {
            adTemplate.setDownloadStatus(1);
        }
        return z4;
    }
}
