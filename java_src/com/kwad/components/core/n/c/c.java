package com.kwad.components.core.n.c;

import com.kwad.components.offline.api.core.api.ILoggerReporter;
import com.kwad.sdk.service.ServiceProvider;
/* loaded from: classes5.dex */
public final class c {
    private static void a(d dVar, boolean z4) {
        com.kwad.sdk.commercial.b.d(com.kwad.sdk.commercial.c.Br().cz(z4 ? ILoggerReporter.Category.ERROR_LOG : ILoggerReporter.Category.APM_LOG).i(z4 ? 1.0d : 0.01d).N("ad_sdk_offline_component_update", "load_status").t(dVar).a(com.kwai.adclient.kscommerciallogger.model.a.aUS));
    }

    public static void b(String str, long j4, int i4, String str2, String str3) {
        try {
            a(new d().aq(str).D(j4).setErrorCode(i4).as(str2).ar(str3).C(2L), true);
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    public static void d(String str, long j4, String str2) {
        try {
            a(new d().aq(str).as(str2).D(j4).C(1L), false);
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    public static void a(String str, long j4, long j5, String str2) {
        try {
            a(new d().aq(str).D(j4).E(j5).as(str2).C(3L), false);
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }
}
