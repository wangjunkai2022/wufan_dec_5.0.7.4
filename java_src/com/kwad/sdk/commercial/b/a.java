package com.kwad.sdk.commercial.b;

import com.kwad.components.offline.api.core.api.ILoggerReporter;
import com.kwad.sdk.commercial.c;
import com.kwad.sdk.commercial.d;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.service.ServiceProvider;
/* loaded from: classes5.dex */
public final class a {
    private static void a(AdTemplate adTemplate, com.kwad.sdk.commercial.c.a aVar) {
        a(adTemplate, false, aVar);
    }

    public static void b(AdTemplate adTemplate, String str, String str2, int i4, int i5) {
        try {
            a(adTemplate, b.Bt().cf(2).cB(str).cC(str2).ch(i4).cg(i5));
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    private static void a(AdTemplate adTemplate, boolean z4, com.kwad.sdk.commercial.c.a aVar) {
        aVar.setAdTemplate(adTemplate);
        com.kwad.sdk.commercial.b.d(c.Br().cz(ILoggerReporter.Category.APM_LOG).i(z4 ? 0.1d : 0.01d).a(d.aT(adTemplate)).N("ad_sdk_appstore_performance", "status").t(aVar));
    }

    public static void a(AdTemplate adTemplate, String str, int i4, int i5) {
        try {
            a(adTemplate, "", str, i4, i5, "marketUrl is empty");
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    public static void a(AdTemplate adTemplate, String str, String str2, int i4, int i5) {
        try {
            a(adTemplate, b.Bt().cf(1).cB(str).cC(str2).ch(i4).cg(i5));
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    public static void a(AdTemplate adTemplate, String str, String str2, int i4, int i5, String str3) {
        try {
            a(adTemplate, true, b.Bt().cf(4).cB(str).cC(str2).ch(i4).cg(i5).setErrorCode(100006).setErrorMsg(str3));
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }
}
