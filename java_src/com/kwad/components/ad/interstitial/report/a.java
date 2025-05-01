package com.kwad.components.ad.interstitial.report;

import com.kwad.components.offline.api.core.api.ILoggerReporter;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.l;
import com.kwad.sdk.service.ServiceProvider;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
/* loaded from: classes5.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.components.ad.interstitial.report.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0415a {
        private static final a lq = new a();
    }

    private static void a(String str, com.kwad.sdk.commercial.c.a aVar) {
        if (l.zJ().yY()) {
            try {
                com.kwad.sdk.commercial.b.d(com.kwad.sdk.commercial.c.Br().cz(ILoggerReporter.Category.APM_LOG).i(0.01d).N("ad_sdk_interstitial_callback", str).a(BusinessType.AD_INTERSTITIAL).t(aVar).a(com.kwai.adclient.kscommerciallogger.model.a.aUS));
            } catch (Throwable th) {
                ServiceProvider.reportSdkCaughtException(th);
            }
        }
    }

    public static a dN() {
        return C0415a.lq;
    }

    public final void b(AdTemplate adTemplate, long j4, long j5) {
        a("callback_type", new InterstitialReportInfo().setCallbackType(2L).setClickSceneType(j4).setItemClickType(j5).setAdTemplate(adTemplate));
    }

    public final void m(AdTemplate adTemplate) {
        a("callback_type", new InterstitialReportInfo().setCallbackType(1L).setAdTemplate(adTemplate));
    }

    public final void n(AdTemplate adTemplate) {
        a("callback_type", new InterstitialReportInfo().setCallbackType(3L).setAdTemplate(adTemplate));
    }

    public final void a(AdTemplate adTemplate, long j4, long j5) {
        a("action_type", new InterstitialReportInfo().setActionType(1L).setClickSceneType(j4).setItemClickType(j5).setAdTemplate(adTemplate));
    }

    public final void a(AdTemplate adTemplate, double d5) {
        a("action_type", new InterstitialReportInfo().setActionType(2L).setVisiblePercent(d5).setAdTemplate(adTemplate));
    }
}
