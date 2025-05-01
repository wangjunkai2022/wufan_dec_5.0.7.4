package com.kwad.sdk.commercial.a;

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

    public static void aV(AdTemplate adTemplate) {
        a(adTemplate, b.Bs().cc(3).setAdTemplate(adTemplate));
    }

    public static void aW(AdTemplate adTemplate) {
        a(adTemplate, b.Bs().cc(4).setAdTemplate(adTemplate));
    }

    public static void aX(AdTemplate adTemplate) {
        a(adTemplate, b.Bs().cc(5).setAdTemplate(adTemplate));
    }

    public static void aY(AdTemplate adTemplate) {
        h(adTemplate, 100002, "");
    }

    public static void aZ(AdTemplate adTemplate) {
        a(adTemplate, b.Bs().cc(7).cd(adTemplate.mInstallApkFormUser ? 1 : 2).setAdTemplate(adTemplate));
    }

    public static void ba(AdTemplate adTemplate) {
        int i4 = 1;
        b cd = b.Bs().cc(8).cd(adTemplate.mInstallApkFormUser ? 1 : 2);
        if (!adTemplate.mInstallApkFromSDK) {
            i4 = adTemplate.mClickOpenAppStore ? 2 : 0;
        }
        a(adTemplate, cd.ce(i4).setAdTemplate(adTemplate));
    }

    public static void bb(AdTemplate adTemplate) {
        int i4;
        b cc = b.Bs().cc(10);
        if (adTemplate.mInstallApkFromSDK) {
            i4 = 1;
        } else {
            i4 = adTemplate.mClickOpenAppStore ? 2 : 0;
        }
        a(adTemplate, cc.ce(i4).setAdTemplate(adTemplate));
    }

    public static void h(AdTemplate adTemplate, int i4, String str) {
        a(adTemplate, true, b.Bs().cc(6).setAdTemplate(adTemplate).setErrorCode(i4).setErrorMsg(str));
    }

    public static void i(AdTemplate adTemplate, int i4, String str) {
        a(adTemplate, true, b.Bs().cc(9).cd(adTemplate.mInstallApkFormUser ? 1 : 2).setAdTemplate(adTemplate).setErrorCode(100003).setErrorMsg(str));
    }

    public static void j(AdTemplate adTemplate, long j4) {
        a(adTemplate, b.Bs().cc(2).aj(j4).setAdTemplate(adTemplate));
    }

    public static void o(AdTemplate adTemplate) {
        a(adTemplate, b.Bs().cc(1).setAdTemplate(adTemplate));
    }

    private static void a(AdTemplate adTemplate, boolean z4, com.kwad.sdk.commercial.c.a aVar) {
        try {
            com.kwad.sdk.commercial.b.d(c.Br().cz(z4 ? ILoggerReporter.Category.ERROR_LOG : ILoggerReporter.Category.APM_LOG).i(z4 ? 1.0d : 0.1d).a(d.aT(adTemplate)).N("ad_sdk_download_performance", "status").t(aVar));
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }
}
