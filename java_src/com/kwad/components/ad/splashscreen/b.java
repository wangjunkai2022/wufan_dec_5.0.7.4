package com.kwad.components.ad.splashscreen;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.kwad.components.ad.KsAdLoadManager;
import com.kwad.components.core.request.model.ImpInfo;
import com.kwad.components.core.request.model.a;
import com.kwad.components.core.s.m;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
import com.kwad.sdk.api.KsSplashScreenAd;
import com.kwad.sdk.core.response.model.AdResultData;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.internal.api.SceneImpl;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.az;
import com.kwad.sdk.utils.bo;
import io.netty.handler.traffic.AbstractTrafficShapingHandler;
/* loaded from: classes5.dex */
public final class b {
    private static final Handler fS = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class a {
        private volatile boolean Cb;

        private a() {
            this.Cb = false;
        }

        /* synthetic */ a(byte b5) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.components.ad.splashscreen.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0434b {
        private volatile boolean Cc;

        private C0434b() {
            this.Cc = false;
        }

        static /* synthetic */ boolean a(C0434b c0434b, boolean z4) {
            c0434b.Cc = true;
            return true;
        }

        /* synthetic */ C0434b(byte b5) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean a(C0434b c0434b, AdTemplate adTemplate, long j4, long j5, Runnable runnable) {
        if (c0434b.Cc) {
            com.kwad.components.ad.splashscreen.monitor.b.kW();
            com.kwad.components.ad.splashscreen.monitor.b.b(adTemplate, 7, j4, j5);
            com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashAd isTimeOut return ");
            return true;
        }
        fS.removeCallbacks(runnable);
        return false;
    }

    public static void loadSplashScreenAd(@NonNull KsScene ksScene, @NonNull final KsLoadManager.SplashScreenAdListener splashScreenAdListener) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        final SceneImpl covert = SceneImpl.covert(ksScene);
        com.kwad.sdk.commercial.d.d.b(covert);
        com.kwad.components.ad.splashscreen.monitor.b.kW();
        com.kwad.components.ad.splashscreen.monitor.b.p(covert.getPosId());
        boolean a5 = m.rI().a(covert, "loadSplashScreenAd");
        covert.setAdStyle(4);
        covert.setAdNum(1);
        com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashScreenAd ");
        final a aVar = new a((byte) 0);
        aVar.Cb = false;
        final long elapsedRealtime2 = SystemClock.elapsedRealtime();
        final ImpInfo impInfo = new ImpInfo(covert);
        final C0434b c0434b = new C0434b((byte) 0);
        com.kwad.components.core.o.a.qI().qK();
        Handler handler = fS;
        handler.postDelayed(new az() { // from class: com.kwad.components.ad.splashscreen.b.1
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                b.a(ImpInfo.this);
            }
        }, AbstractTrafficShapingHandler.DEFAULT_MAX_TIME);
        final az azVar = new az() { // from class: com.kwad.components.ad.splashscreen.b.2
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                C0434b.a(C0434b.this, true);
                com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashAd mTimeOutRunnable timeOut");
                KsLoadManager.SplashScreenAdListener splashScreenAdListener2 = splashScreenAdListener;
                com.kwad.sdk.core.network.e eVar = com.kwad.sdk.core.network.e.awM;
                splashScreenAdListener2.onError(eVar.errorCode, eVar.msg);
                com.kwad.components.ad.splashscreen.monitor.b.kW();
                com.kwad.sdk.core.network.e eVar2 = com.kwad.sdk.core.network.e.awM;
                com.kwad.components.ad.splashscreen.monitor.b.c(false, eVar2.errorCode, eVar2.msg, covert.getPosId());
                com.kwad.components.core.o.a.qI().aD(4);
            }
        };
        int a6 = com.kwad.sdk.core.config.d.a(com.kwad.components.ad.splashscreen.b.a.CO);
        if (a6 < 0) {
            a6 = 5000;
        }
        handler.postDelayed(azVar, a6);
        final long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
        com.kwad.components.ad.splashscreen.monitor.b.kW();
        com.kwad.components.ad.splashscreen.monitor.b.f(covert.getPosId(), elapsedRealtime3);
        KsAdLoadManager.M();
        KsAdLoadManager.a(new a.C0475a().e(impInfo).aI(true).aJ(a5).a(new com.kwad.components.core.request.d() { // from class: com.kwad.components.ad.splashscreen.b.3
            @Override // com.kwad.components.core.request.d, com.kwad.components.core.request.c
            public final void a(final int i4, final String str, boolean z4) {
                if (!C0434b.this.Cc) {
                    b.fS.removeCallbacks(azVar);
                    if (!aVar.Cb && i4 != com.kwad.sdk.core.network.e.awK.errorCode) {
                        com.kwad.components.ad.splashscreen.monitor.b.kW();
                        com.kwad.components.ad.splashscreen.monitor.b.b(z4, i4, str, covert.getPosId());
                        com.kwad.components.ad.splashscreen.monitor.b.kW();
                        com.kwad.components.ad.splashscreen.monitor.b.c(z4, i4, str, covert.getPosId());
                    }
                    bo.runOnUiThread(new az() { // from class: com.kwad.components.ad.splashscreen.b.3.1
                        @Override // com.kwad.sdk.utils.az
                        public final void doTask() {
                            com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashAd onError:" + String.format("code:%s__msg:%s", Integer.valueOf(i4), str));
                            splashScreenAdListener.onError(i4, str);
                            if (i4 == com.kwad.sdk.core.network.e.awN.errorCode) {
                                com.kwad.components.core.o.a.qI().aD(0);
                            } else {
                                com.kwad.components.core.o.a.qI().aD(3);
                            }
                        }
                    });
                    return;
                }
                com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashAd onError isTimeOut return " + String.format("code:%s__msg:%s", Integer.valueOf(i4), str));
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v8, types: [com.kwad.sdk.api.KsSplashScreenAd, com.kwad.components.ad.splashscreen.KsSplashScreenAdControl] */
            /* JADX WARN: Type inference failed for: r2v9 */
            @Override // com.kwad.components.core.request.d, com.kwad.components.core.request.c
            public final void a(@NonNull final AdResultData adResultData, boolean z4) {
                boolean z5;
                bo.runOnUiThread(new az() { // from class: com.kwad.components.ad.splashscreen.b.3.2
                    @Override // com.kwad.sdk.utils.az
                    public final void doTask() {
                        try {
                            splashScreenAdListener.onRequestResult(adResultData.getAdTemplateList().size());
                            com.kwad.components.ad.splashscreen.monitor.a.kU().o(covert.getPosId());
                        } catch (Throwable th) {
                            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                        }
                    }
                });
                try {
                    if (b.a(adResultData, aVar, this, z4, covert.posId)) {
                        return;
                    }
                    AdTemplate adTemplate = adResultData.getAdTemplateList().get(0);
                    adTemplate.loadDataTime = SystemClock.elapsedRealtime() - elapsedRealtime2;
                    adTemplate.notNetworkRequest = z4;
                    com.kwad.components.ad.splashscreen.monitor.b.kW();
                    com.kwad.components.ad.splashscreen.monitor.b.d(adTemplate, elapsedRealtime3);
                    com.kwad.sdk.commercial.d.d.a(covert, 1);
                    long elapsedRealtime4 = SystemClock.elapsedRealtime();
                    z5 = new KsSplashScreenAdControl(covert, adResultData);
                    if (com.kwad.sdk.core.config.d.a(com.kwad.components.ad.splashscreen.b.a.CS)) {
                        try {
                            SplashPreloadManager.kz();
                            if (SplashPreloadManager.f(adResultData)) {
                                if (b.a(C0434b.this, adTemplate, elapsedRealtime4, elapsedRealtime3, azVar)) {
                                    return;
                                }
                                b.a(splashScreenAdListener, z5, adTemplate);
                                if (SplashPreloadManager.kz().e(adResultData)) {
                                    com.kwad.components.ad.splashscreen.monitor.b.kW();
                                    com.kwad.components.ad.splashscreen.monitor.b.a(adTemplate, 2, elapsedRealtime4, elapsedRealtime3);
                                    com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashAd cache returned");
                                    com.kwad.components.core.o.a.qI().aD(1);
                                    return;
                                } else if (SplashPreloadManager.kz().b(adResultData, true) > 0) {
                                    com.kwad.components.ad.splashscreen.monitor.b.kW();
                                    com.kwad.components.ad.splashscreen.monitor.b.a(adTemplate, 3, elapsedRealtime4, elapsedRealtime3);
                                    com.kwad.components.core.o.a.qI().aD(2);
                                    return;
                                } else {
                                    com.kwad.components.ad.splashscreen.monitor.b.kW();
                                    com.kwad.components.ad.splashscreen.monitor.b.b(adTemplate, 4, elapsedRealtime4, elapsedRealtime3);
                                    return;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            z5 = z4;
                            ServiceProvider.reportSdkCaughtException(th);
                            com.kwad.sdk.core.network.e eVar = com.kwad.sdk.core.network.e.awP;
                            a(eVar.errorCode, eVar.msg, z5);
                        }
                    }
                    SplashPreloadManager.kz();
                    if (!SplashPreloadManager.f(adResultData)) {
                        SplashPreloadManager.kz();
                        if (!SplashPreloadManager.g(adResultData)) {
                            if (b.a(C0434b.this, adTemplate, elapsedRealtime4, elapsedRealtime3, azVar)) {
                                return;
                            }
                            b.a(splashScreenAdListener, z5, adTemplate);
                            com.kwad.components.ad.splashscreen.monitor.b.kW();
                            com.kwad.components.ad.splashscreen.monitor.b.a(adTemplate, 8, elapsedRealtime4, elapsedRealtime3);
                            com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashAd live no cache returned");
                            com.kwad.components.core.o.a.qI().aD(5);
                            return;
                        }
                    }
                    boolean e5 = SplashPreloadManager.kz().e(adResultData);
                    com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashAd onSuccess " + e5);
                    if (e5) {
                        if (b.a(C0434b.this, adTemplate, elapsedRealtime4, elapsedRealtime3, azVar)) {
                            return;
                        }
                        b.a(splashScreenAdListener, z5, adTemplate);
                        com.kwad.components.ad.splashscreen.monitor.b.kW();
                        com.kwad.components.ad.splashscreen.monitor.b.a(adTemplate, 2, elapsedRealtime4, elapsedRealtime3);
                        com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashAd cache returned");
                        com.kwad.components.core.o.a.qI().aD(1);
                        return;
                    }
                    SplashPreloadManager.kz();
                    try {
                        if (!SplashPreloadManager.f(adResultData)) {
                            if (!C0434b.this.Cc) {
                                b.fS.removeCallbacks(azVar);
                                com.kwad.components.ad.splashscreen.monitor.b.kW();
                                com.kwad.components.ad.splashscreen.monitor.b.b(adTemplate, 5, elapsedRealtime4, elapsedRealtime3);
                                aVar.Cb = true;
                                a(com.kwad.sdk.core.network.e.awL.errorCode, "请求成功，但缓存未命中", z4);
                                com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashAd no cache returned");
                                com.kwad.components.core.o.a.qI().aD(3);
                                return;
                            }
                            com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashAd isTimeOut return ");
                            return;
                        }
                        com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashAd image returned");
                        int b5 = SplashPreloadManager.kz().b(adResultData, true);
                        if (b.a(C0434b.this, adTemplate, elapsedRealtime4, elapsedRealtime3, azVar)) {
                            return;
                        }
                        if (b5 > 0) {
                            b.a(splashScreenAdListener, z5, adTemplate);
                            com.kwad.components.ad.splashscreen.monitor.b.kW();
                            com.kwad.components.ad.splashscreen.monitor.b.a(adTemplate, 3, elapsedRealtime4, elapsedRealtime3);
                            com.kwad.components.core.o.a.qI().aD(2);
                            return;
                        }
                        com.kwad.components.ad.splashscreen.monitor.b.kW();
                        com.kwad.components.ad.splashscreen.monitor.b.b(adTemplate, 4, elapsedRealtime4, elapsedRealtime3);
                        aVar.Cb = true;
                        com.kwad.sdk.core.network.e eVar2 = com.kwad.sdk.core.network.e.awN;
                        a(eVar2.errorCode, eVar2.msg, z4);
                    } catch (Throwable th2) {
                        th = th2;
                        ServiceProvider.reportSdkCaughtException(th);
                        com.kwad.sdk.core.network.e eVar3 = com.kwad.sdk.core.network.e.awP;
                        a(eVar3.errorCode, eVar3.msg, z5);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z5 = z4;
                }
            }
        }).ra());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final KsLoadManager.SplashScreenAdListener splashScreenAdListener, final KsSplashScreenAd ksSplashScreenAd, final AdTemplate adTemplate) {
        bo.runOnUiThread(new az() { // from class: com.kwad.components.ad.splashscreen.b.4
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                try {
                    KsAdLoadManager.M().a((KsAdLoadManager) KsSplashScreenAd.this);
                    splashScreenAdListener.onSplashScreenAdLoad(KsSplashScreenAd.this);
                    com.kwad.components.ad.splashscreen.monitor.a.kU().X(adTemplate);
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTrace(th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean a(AdResultData adResultData, a aVar, com.kwad.components.core.request.d dVar, boolean z4, long j4) {
        if (adResultData.getAdTemplateList().size() == 0) {
            com.kwad.components.ad.splashscreen.monitor.b.kW();
            com.kwad.components.ad.splashscreen.monitor.b.c(z4, com.kwad.sdk.core.network.e.awK.errorCode, TextUtils.isEmpty(adResultData.testErrorMsg) ? com.kwad.sdk.core.network.e.awK.msg : adResultData.testErrorMsg, j4);
            aVar.Cb = true;
            dVar.a(com.kwad.sdk.core.network.e.awK.errorCode, TextUtils.isEmpty(adResultData.testErrorMsg) ? com.kwad.sdk.core.network.e.awK.msg : adResultData.testErrorMsg, z4);
            com.kwad.components.core.o.a.qI().aD(3);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(ImpInfo impInfo) {
        final SceneImpl sceneImpl = impInfo.adScene;
        if (TextUtils.isEmpty(sceneImpl.getBidResponse()) && TextUtils.isEmpty(sceneImpl.getBidResponseV2())) {
            com.kwad.components.core.o.a.qI().qL();
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            com.kwad.components.ad.splashscreen.monitor.b.kW();
            com.kwad.components.ad.splashscreen.monitor.b.q(sceneImpl.posId);
            sceneImpl.setAdStyle(4);
            sceneImpl.setAdNum(5);
            ImpInfo impInfo2 = new ImpInfo(sceneImpl);
            com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashScreenCache ");
            KsAdLoadManager.M();
            KsAdLoadManager.a(new a.C0475a().e(impInfo2).aJ(false).a(new com.kwad.components.core.request.d() { // from class: com.kwad.components.ad.splashscreen.b.5
                @Override // com.kwad.components.core.request.d, com.kwad.components.core.request.k
                public final void a(@NonNull AdResultData adResultData) {
                    try {
                        if (adResultData.getAdTemplateList().size() > 0) {
                            int b5 = SplashPreloadManager.kz().b(adResultData, false);
                            com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashScreenCache onSuccess:" + adResultData.getAdTemplateList().size() + " saved " + b5);
                            com.kwad.components.ad.splashscreen.monitor.b.kW();
                            com.kwad.components.ad.splashscreen.monitor.b.a(adResultData.getAdTemplateList(), SystemClock.elapsedRealtime() - elapsedRealtime, SceneImpl.this.getPosId());
                            com.kwad.components.core.o.a.qI().aE(adResultData.getAdTemplateList().size());
                        }
                    } catch (Throwable th) {
                        ServiceProvider.reportSdkCaughtException(th);
                    }
                }

                @Override // com.kwad.components.core.request.d, com.kwad.components.core.request.k
                public final void onError(int i4, String str) {
                    com.kwad.components.ad.splashscreen.monitor.b.kW();
                    com.kwad.components.ad.splashscreen.monitor.b.b(i4, str, SceneImpl.this.getPosId());
                    com.kwad.sdk.core.e.c.d("KsAdSplashScreenLoadManager", "loadSplashScreenCache onError:" + String.format("code:%s__msg:%s", Integer.valueOf(i4), str));
                }
            }).ra());
        }
    }
}
