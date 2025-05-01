package com.kwad.components.ad.feed.monitor;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
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
    public static Pair<Integer, String> d(@NonNull AdTemplate adTemplate) {
        String K = com.kwad.sdk.core.response.b.a.K(e.dS(adTemplate));
        if (TextUtils.isEmpty(K)) {
            return new Pair<>(2, "empty videoUrl");
        }
        int zA = d.zA();
        String str = "";
        int i4 = 1;
        if (zA < 0) {
            File bZ = com.kwad.sdk.core.diskcache.b.a.DM().bZ(K);
            if (!q.L(bZ)) {
                a.C0525a c0525a = new a.C0525a();
                int i5 = com.kwad.sdk.core.diskcache.b.a.DM().a(K, c0525a) ? 1 : 2;
                str = c0525a.msg;
                i4 = i5;
            }
            adTemplate.setDownloadSize(bZ != null ? bZ.length() : 0L);
        } else if (zA > 0) {
            a.C0525a c0525a2 = new a.C0525a();
            f by = com.kwad.sdk.core.videocache.c.a.by(ServiceProvider.getContext());
            if (!by.eM(K)) {
                i4 = by.a(K, (long) (zA * 1024), c0525a2, null) ? 1 : 2;
            }
            str = c0525a2.msg;
            adTemplate.setDownloadSize(zA * 1024);
        } else {
            adTemplate.setDownloadSize(0L);
        }
        return new Pair<>(Integer.valueOf(i4), str);
    }
}
