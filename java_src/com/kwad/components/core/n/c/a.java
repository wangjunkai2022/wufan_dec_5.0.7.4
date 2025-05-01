package com.kwad.components.core.n.c;

import com.kwad.components.offline.api.core.api.ILoggerReporter;
import com.kwad.sdk.service.ServiceProvider;
/* loaded from: classes5.dex */
public final class a {
    private static void a(b bVar) {
        a(bVar, false);
    }

    public static void b(String str, long j4, int i4) {
        try {
            a(new b().an(str).B(j4).aw(i4).A(2L));
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    public static void c(String str, long j4) {
        try {
            a(new b().an(str).B(j4).A(1L));
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    public static void d(String str, long j4) {
        try {
            a(new b().an(str).B(j4).A(6L));
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    private static void a(b bVar, boolean z4) {
        com.kwad.sdk.commercial.b.d(com.kwad.sdk.commercial.c.Br().cz(z4 ? ILoggerReporter.Category.ERROR_LOG : ILoggerReporter.Category.APM_LOG).i(z4 ? 1.0d : 0.01d).N("ad_sdk_offline_component_monitor", "load_status").t(bVar).a(com.kwai.adclient.kscommerciallogger.model.a.aUS));
    }

    public static void c(String str, long j4, String str2) {
        try {
            a(new b().an(str).B(j4).ap(str2).A(4L));
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    public static void b(String str, long j4, String str2) {
        try {
            a(new b().an(str).B(j4).ap(str2).A(3L));
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    public static void a(String str, long j4, int i4, String str2, String str3) {
        try {
            a(new b().an(str).B(j4).setErrorCode(i4).ap(str3).ao(str2).A(7L), true);
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    public static void c(String str, long j4, int i4) {
        try {
            a(new b().an(str).A(8L).aw(i4).B(j4));
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }

    public static void a(String str, long j4, String str2) {
        try {
            a(new b().an(str).ap(str2).B(j4).A(5L));
        } catch (Throwable th) {
            ServiceProvider.reportSdkCaughtException(th);
        }
    }
}
