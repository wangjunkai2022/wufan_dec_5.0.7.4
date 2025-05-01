package com.kwad.components.ad.j;

import android.content.Context;
import androidx.annotation.Nullable;
import com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView;
import com.kwad.sdk.service.ServiceProvider;
/* loaded from: classes5.dex */
public final class b {
    @Nullable
    public static IAdLiveOfflineView a(com.kwad.components.core.n.a.a.a aVar, Context context, int i4) {
        try {
            return aVar.getView(context, i4);
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTrace(th);
            ServiceProvider.reportSdkCaughtException(th);
            return null;
        }
    }
}
