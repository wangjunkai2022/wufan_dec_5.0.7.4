package com.kwad.sdk.core.adlog.b;

import com.kwad.components.offline.api.core.api.ILoggerReporter;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.service.ServiceProvider;
/* loaded from: classes5.dex */
public final class a {
    private static void a(com.kwad.sdk.core.adlog.a.a aVar, com.kwad.sdk.core.adlog.a.c cVar, b bVar) {
        a(aVar, cVar, false, bVar);
    }

    public static void b(com.kwad.sdk.core.adlog.a.a aVar, com.kwad.sdk.core.adlog.a.c cVar, int i4) {
        try {
            a(aVar, cVar, b.BX().cs(2).cx(i4));
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    public static void c(com.kwad.sdk.core.adlog.a.a aVar, com.kwad.sdk.core.adlog.a.c cVar, int i4) {
        try {
            a(aVar, cVar, true, b.BX().cs(3).cx(i4));
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    public static void d(com.kwad.sdk.core.adlog.a.a aVar, com.kwad.sdk.core.adlog.a.c cVar, int i4) {
        try {
            a(aVar, cVar, b.BX().cs(4).cx(i4));
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    public static void e(com.kwad.sdk.core.adlog.a.a aVar, com.kwad.sdk.core.adlog.a.c cVar, int i4) {
        try {
            a(aVar, cVar, true, b.BX().cs(7).cx(i4));
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    private static void a(com.kwad.sdk.core.adlog.a.a aVar, com.kwad.sdk.core.adlog.a.c cVar, boolean z4, b bVar) {
        com.kwad.sdk.core.adlog.c.a aVar2 = aVar.aqx;
        AdTemplate adTemplate = aVar2.adTemplate;
        bVar.ct(aVar2.apT).cu(aVar.retryCount).cv(aVar.aqz).di(aVar.aqA).cw(cVar.aqI).setAdTemplate(adTemplate);
        com.kwad.sdk.commercial.b.d(com.kwad.sdk.commercial.c.Br().cz(ILoggerReporter.Category.APM_LOG).i(z4 ? 1.0d : 0.1d).a(com.kwad.sdk.commercial.d.aT(adTemplate)).N("ad_sdk_adlog_retry", "status").t(bVar));
    }

    public static void b(com.kwad.sdk.core.adlog.a.a aVar, com.kwad.sdk.core.adlog.a.c cVar, int i4, long j4) {
        try {
            a(aVar, cVar, true, b.BX().cs(6).cx(i4).al(j4));
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    public static void a(com.kwad.sdk.core.adlog.a.a aVar, com.kwad.sdk.core.adlog.a.c cVar, int i4) {
        try {
            a(aVar, cVar, b.BX().cs(1).cx(i4));
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    public static void a(com.kwad.sdk.core.adlog.a.a aVar, com.kwad.sdk.core.adlog.a.c cVar, int i4, long j4) {
        try {
            a(aVar, cVar, b.BX().cs(5).cx(i4).al(j4));
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }
}
