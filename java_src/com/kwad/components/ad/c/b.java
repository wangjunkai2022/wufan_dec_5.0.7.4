package com.kwad.components.ad.c;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.kwad.components.ad.reward.monitor.c;
import com.kwad.components.core.video.j;
import com.kwad.sdk.core.network.a.a;
import com.kwad.sdk.core.response.b.e;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.response.model.AdVideoPreCacheConfig;
import com.kwad.sdk.core.videocache.f;
import com.kwad.sdk.export.proxy.AdHttpResponseListener;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.q;
import java.io.File;
/* loaded from: classes5.dex */
public final class b {
    @WorkerThread
    public static boolean a(@NonNull AdTemplate adTemplate, boolean z4, final AdVideoPreCacheConfig adVideoPreCacheConfig, final a aVar) {
        String K = com.kwad.sdk.core.response.b.a.K(e.dS(adTemplate));
        if (TextUtils.isEmpty(K)) {
            return false;
        }
        final long adVideoPreCacheSize = adVideoPreCacheConfig.getAdVideoPreCacheSize() * 1024;
        String str = "";
        boolean z5 = true;
        if (adVideoPreCacheSize > 0) {
            long j4 = adVideoPreCacheConfig.isContinueLoadingAll() ? -1L : adVideoPreCacheSize;
            a.C0525a c0525a = new a.C0525a();
            f by = com.kwad.sdk.core.videocache.c.a.by(ServiceProvider.getContext());
            if (by.eL(K)) {
                a(aVar);
            } else {
                z5 = by.a(K, j4, c0525a, new AdHttpResponseListener() { // from class: com.kwad.components.ad.c.b.1
                    private boolean bF = false;

                    @Override // com.kwad.sdk.export.proxy.AdHttpResponseListener
                    public final boolean onReadProgress(long j5, long j6) {
                        if ((j5 >= adVideoPreCacheSize || j5 >= j6) && !this.bF) {
                            this.bF = true;
                            b.a(aVar);
                            if (!adVideoPreCacheConfig.isContinueLoadingAll()) {
                                return true;
                            }
                        }
                        return false;
                    }

                    @Override // com.kwad.sdk.export.proxy.AdHttpResponseListener
                    public final void onResponseEnd() {
                    }

                    @Override // com.kwad.sdk.export.proxy.AdHttpResponseListener
                    public final void onResponseStart() {
                    }
                });
            }
            str = c0525a.msg;
        } else if (adVideoPreCacheSize < 0) {
            File bZ = com.kwad.sdk.core.diskcache.b.a.DM().bZ(K);
            if (!q.L(bZ)) {
                a.C0525a c0525a2 = new a.C0525a();
                z5 = com.kwad.sdk.core.diskcache.b.a.DM().a(K, c0525a2);
                str = c0525a2.msg;
            }
            adTemplate.setDownloadSize(bZ != null ? bZ.length() : 0L);
            if (z5) {
                a(aVar);
            }
        } else {
            a(aVar);
        }
        if (z5) {
            j.m(K, adVideoPreCacheConfig.getAdVideoPreCacheSize());
        } else {
            c.a(z4, adTemplate, str);
            com.kwad.components.ad.reward.monitor.b.a(z4, adTemplate);
            a(aVar, str);
        }
        return z5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(a aVar) {
        if (aVar == null) {
            return;
        }
        aVar.V();
    }

    private static void a(a aVar, String str) {
        if (aVar == null) {
            return;
        }
        aVar.W();
    }
}
