package com.kwad.components.ad.splashscreen.monitor;

import androidx.annotation.NonNull;
import com.kwad.components.offline.api.core.api.ILoggerReporter;
import com.kwad.sdk.core.response.b.e;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.l;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
/* loaded from: classes5.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.components.ad.splashscreen.monitor.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0435a {
        private static final a CV = new a();
    }

    private static SplashMonitorInfo V(@NonNull AdTemplate adTemplate) {
        AdInfo dS = e.dS(adTemplate);
        return new SplashMonitorInfo().setPreloadId(com.kwad.sdk.core.response.b.a.aY(dS)).setCreativeId(com.kwad.sdk.core.response.b.a.J(dS)).setMaterialType(com.kwad.sdk.core.response.b.a.bb(dS) ? 1 : 2).setAdTemplate(adTemplate);
    }

    private static void c(com.kwad.sdk.commercial.c.a aVar) {
        if (l.zJ().yY()) {
            com.kwad.sdk.commercial.b.d(com.kwad.sdk.commercial.c.Br().cz(ILoggerReporter.Category.APM_LOG).i(0.01d).N("ad_sdk_splash_callback", "callback_type").a(BusinessType.AD_SPLASH).t(aVar).a(com.kwai.adclient.kscommerciallogger.model.a.aUS));
        }
    }

    private static void d(com.kwad.sdk.commercial.c.a aVar) {
        if (l.zJ().yY()) {
            com.kwad.sdk.commercial.b.d(com.kwad.sdk.commercial.c.Br().cz(ILoggerReporter.Category.APM_LOG).i(0.01d).N("ad_sdk_splash_action", "action_type").a(BusinessType.AD_SPLASH).t(aVar).a(com.kwai.adclient.kscommerciallogger.model.a.aUS));
        }
    }

    public static a kU() {
        return C0435a.CV;
    }

    public final void W(@NonNull AdTemplate adTemplate) {
        c(V(adTemplate).setCallbackType(2));
    }

    public final void X(@NonNull AdTemplate adTemplate) {
        c(V(adTemplate).setCallbackType(5));
    }

    public final void Y(@NonNull AdTemplate adTemplate) {
        d(V(adTemplate).setActionType(1));
    }

    public final void Z(@NonNull AdTemplate adTemplate) {
        d(V(adTemplate).setActionType(2));
    }

    public final void m(@NonNull AdTemplate adTemplate) {
        c(V(adTemplate).setCallbackType(1));
    }

    public final void n(@NonNull AdTemplate adTemplate) {
        c(V(adTemplate).setCallbackType(3));
    }

    public final void o(long j4) {
        c(new SplashMonitorInfo().setCallbackType(4).setPosId(j4));
    }
}
