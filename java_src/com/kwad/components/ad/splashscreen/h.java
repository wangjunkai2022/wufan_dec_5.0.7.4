package com.kwad.components.ad.splashscreen;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.components.ad.splashscreen.monitor.SplashMonitorInfo;
import com.kwad.components.core.e.d.a;
import com.kwad.components.offline.api.tk.model.StyleTemplate;
import com.kwad.sdk.api.KsSplashScreenAd;
import com.kwad.sdk.api.KsVideoPlayConfig;
import com.kwad.sdk.core.adlog.a;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdMatrixInfo;
import com.kwad.sdk.core.response.model.AdResultData;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.view.AdBaseFrameLayout;
import com.kwad.sdk.internal.api.SceneImpl;
import com.kwad.sdk.utils.az;
import com.kwad.sdk.utils.bn;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class h extends com.kwad.sdk.mvp.a {
    public int CC;
    public int CD;
    public long CE;
    public long CF;
    public long CG;
    public long CH;
    public long CI;
    public long CJ;
    public long CK;
    private KsSplashScreenAd.SplashScreenAdInteractionListener Cf;
    @Nullable
    public com.kwad.components.ad.splashscreen.d.a Cr;
    public StyleTemplate Cs;
    public com.kwad.sdk.core.h.a Ct;
    public AdResultData mAdResultData;
    @NonNull
    public SceneImpl mAdScene;
    public com.kwad.components.core.e.d.c mApkDownloadHelper;
    @NonNull
    public AdBaseFrameLayout mRootContainer;
    public bn mTimerHelper;
    @NonNull
    public KsVideoPlayConfig mVideoPlayConfig;
    private List<g> Cu = new CopyOnWriteArrayList();
    private List<f> Cv = new CopyOnWriteArrayList();
    public boolean Cw = false;
    private boolean Cx = false;
    public boolean Cy = false;
    public boolean Cz = false;
    public boolean CA = false;
    public long CB = SystemClock.elapsedRealtime();
    public boolean isWebTimeout = false;

    /* loaded from: classes5.dex */
    public interface a {
        void b(@NonNull com.kwad.sdk.core.adlog.c.b bVar);
    }

    public static boolean U(AdTemplate adTemplate) {
        AdMatrixInfo.SplashPlayCardTKInfo df;
        return com.kwad.sdk.core.config.d.CE() && (df = com.kwad.sdk.core.response.b.b.df(adTemplate)) != null && !TextUtils.isEmpty(df.templateId) && df.renderType == 1;
    }

    private void kQ() {
        kR();
        for (g gVar : this.Cu) {
            gVar.kB();
        }
    }

    private void kR() {
        long ds;
        AdInfo dS = com.kwad.sdk.core.response.b.e.dS(this.mAdTemplate);
        SplashMonitorInfo elementTypes = new SplashMonitorInfo().setStatus(8).setElementTypes(com.kwad.components.core.webview.tachikoma.d.a.tC().tD());
        bn bnVar = this.mTimerHelper;
        SplashMonitorInfo rotateComposeTimeout = elementTypes.setShowEndTime(bnVar != null ? bnVar.getTime() : -1L).setRotateComposeTimeout(this.CA);
        if (U(this.mAdTemplate)) {
            ds = com.kwad.sdk.core.response.b.b.dg(this.mAdTemplate);
        } else {
            ds = com.kwad.sdk.core.response.b.b.ds(com.kwad.sdk.core.response.b.e.dS(this.mAdTemplate));
        }
        com.kwad.sdk.commercial.b.k(rotateComposeTimeout.setTkDefaultTimeout(ds).setSoSource(this.CC).setSoLoadTime(this.CE).setOfflineSource(this.CD).setOfflineLoadTime(this.CF).setTkFileLoadTime(this.CG).setTkInitTime(this.CH).setTkRenderTime(this.CI).setNativeLoadTime(this.CJ).setWebTimeout(this.isWebTimeout).setWebLoadTime(this.CK).setInteractiveStyle(com.kwad.sdk.core.response.b.b.dC(dS)).setInteractivityDefaultStyle(com.kwad.sdk.core.response.b.b.dD(dS)).setCreativeId(com.kwad.sdk.core.response.b.a.J(dS)).setAdTemplate(this.mAdTemplate));
        com.kwad.components.core.webview.tachikoma.d.a.tC().tE();
    }

    private void kS() {
        for (f fVar : this.Cv) {
            fVar.kx();
        }
    }

    public static boolean n(@NonNull AdInfo adInfo) {
        return adInfo.adSplashInfo.fullScreenClickSwitch == 1;
    }

    public static boolean r(AdInfo adInfo) {
        return com.kwad.sdk.core.response.b.b.dl(adInfo) && com.kwad.sdk.core.response.b.a.bc(adInfo);
    }

    public final void Q(Context context) {
        if (this.mAdTemplate.mPvReported) {
            return;
        }
        com.kwad.components.ad.splashscreen.local.a.R(context);
        com.kwad.components.core.s.b.rC().a(this.mAdTemplate, null, null);
        com.kwad.sdk.commercial.d.c.bA(this.mAdTemplate);
        kD();
    }

    public final void X(int i4) {
        for (g gVar : this.Cu) {
            gVar.W(i4);
        }
    }

    public final void a(final int i4, Context context, final int i5, int i6, final a aVar) {
        com.kwad.sdk.core.response.b.e.dS(this.mAdTemplate);
        com.kwad.components.core.e.d.a.a(new a.C0457a(context).ar(this.mAdTemplate).b(this.mApkDownloadHelper).an(i6).ao(i6 == 1).am(i5).al(i4).a(new a.b() { // from class: com.kwad.components.ad.splashscreen.h.1
            @Override // com.kwad.components.core.e.d.a.b
            public final void onAdClicked() {
                com.kwad.components.ad.splashscreen.monitor.a.kU().Y(h.this.mAdTemplate);
                if (h.this.Cf != null) {
                    h.this.Cf.onAdClicked();
                }
                com.kwad.components.ad.splashscreen.monitor.a.kU().W(h.this.mAdTemplate);
                JSONObject jSONObject = new JSONObject();
                try {
                    com.kwad.components.ad.splashscreen.d.a aVar2 = h.this.Cr;
                    if (aVar2 != null) {
                        jSONObject.put("duration", aVar2.getCurrentPosition());
                    }
                } catch (JSONException e5) {
                    com.kwad.sdk.core.e.c.printStackTrace(e5);
                }
                com.kwad.sdk.core.adlog.c.b f5 = new com.kwad.sdk.core.adlog.c.b().cK(i5).f(h.this.mRootContainer.getTouchCoords());
                if (i4 == 2) {
                    f5.cT(6);
                }
                com.kwad.sdk.core.adlog.c.a(h.this.mAdTemplate, f5, jSONObject);
                a aVar3 = aVar;
                if (aVar3 != null) {
                    aVar3.b(f5);
                }
            }
        }));
    }

    public final void c(int i4, Context context, int i5, int i6) {
        a(i4, context, i5, i6, null);
    }

    public final void d(AdResultData adResultData) {
        this.mAdResultData = adResultData;
        this.mAdTemplate = com.kwad.sdk.core.response.b.c.n(adResultData);
    }

    @MainThread
    public final void i(int i4, String str) {
        KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener = this.Cf;
        if (splashScreenAdInteractionListener != null) {
            splashScreenAdInteractionListener.onAdShowError(i4, str);
        }
        com.kwad.components.ad.splashscreen.monitor.b.kW();
        com.kwad.components.ad.splashscreen.monitor.b.e(this.mAdTemplate, i4, String.valueOf(str));
        kQ();
    }

    @MainThread
    public final void kC() {
        this.mAdTemplate.converted = true;
        com.kwad.components.ad.splashscreen.monitor.a.kU().Y(this.mAdTemplate);
        KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener = this.Cf;
        if (splashScreenAdInteractionListener != null) {
            splashScreenAdInteractionListener.onAdClicked();
        }
        com.kwad.components.ad.splashscreen.monitor.a.kU().W(this.mAdTemplate);
    }

    @MainThread
    public final void kD() {
        KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener = this.Cf;
        if (splashScreenAdInteractionListener != null) {
            splashScreenAdInteractionListener.onAdShowStart();
        }
        if (this.Cx) {
            return;
        }
        this.Cx = true;
        com.kwad.components.ad.splashscreen.monitor.b.kW();
        com.kwad.components.ad.splashscreen.monitor.b.f(this.mAdTemplate, SystemClock.elapsedRealtime() - this.mAdTemplate.showStartTime);
        com.kwad.components.ad.splashscreen.monitor.c.ag(this.mAdTemplate);
        com.kwad.components.ad.splashscreen.monitor.a.kU().m(this.mAdTemplate);
        com.kwad.sdk.a.a.c.Au().bj(true);
        bn bnVar = this.mTimerHelper;
        if (bnVar != null) {
            bnVar.startTiming();
        }
    }

    @MainThread
    public final void kE() {
        com.kwad.components.ad.splashscreen.monitor.a.kU().Z(this.mAdTemplate);
        KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener = this.Cf;
        if (splashScreenAdInteractionListener != null) {
            splashScreenAdInteractionListener.onAdShowEnd();
        }
        com.kwad.components.ad.splashscreen.monitor.a.kU().n(this.mAdTemplate);
    }

    public final void kF() {
        KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener = this.Cf;
        if (splashScreenAdInteractionListener != null) {
            splashScreenAdInteractionListener.onAdShowError(0, "onMediaPlayError");
        }
    }

    public final void kG() {
        KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener = this.Cf;
        if (splashScreenAdInteractionListener != null) {
            splashScreenAdInteractionListener.onAdShowStart();
        }
    }

    public final void kH() {
        KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener = this.Cf;
        if (splashScreenAdInteractionListener != null) {
            splashScreenAdInteractionListener.onAdShowEnd();
        }
    }

    public final void kI() {
        KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener = this.Cf;
        if (splashScreenAdInteractionListener != null) {
            splashScreenAdInteractionListener.onSkippedAd();
        }
    }

    public final void kJ() {
        KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener = this.Cf;
        if (splashScreenAdInteractionListener != null) {
            splashScreenAdInteractionListener.onAdClicked();
        }
    }

    public final void kK() {
        KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener = this.Cf;
        if (splashScreenAdInteractionListener != null) {
            splashScreenAdInteractionListener.onDownloadTipsDialogShow();
        }
    }

    public final void kL() {
        KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener = this.Cf;
        if (splashScreenAdInteractionListener != null) {
            splashScreenAdInteractionListener.onDownloadTipsDialogCancel();
        }
    }

    public final void kM() {
        KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener = this.Cf;
        if (splashScreenAdInteractionListener != null) {
            splashScreenAdInteractionListener.onDownloadTipsDialogDismiss();
        }
    }

    @MainThread
    public final void kN() {
        if (this.Cw) {
            return;
        }
        this.Cw = true;
        if (r(com.kwad.sdk.core.response.b.e.dS(this.mAdTemplate)) && !this.mAdTemplate.converted) {
            kS();
        } else {
            a.C0514a c0514a = new a.C0514a();
            bn bnVar = this.mTimerHelper;
            if (bnVar != null) {
                c0514a.duration = bnVar.getTime();
            }
            com.kwad.sdk.core.adlog.c.b(this.mAdTemplate, new com.kwad.sdk.core.adlog.c.b().cL(14).cT(22).b(c0514a), (JSONObject) null);
            com.kwad.components.ad.splashscreen.monitor.a.kU().Z(this.mAdTemplate);
            KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener = this.Cf;
            if (splashScreenAdInteractionListener != null) {
                splashScreenAdInteractionListener.onAdShowEnd();
            }
            com.kwad.components.ad.splashscreen.monitor.a.kU().n(this.mAdTemplate);
        }
        kQ();
    }

    @MainThread
    public final void kO() {
        com.kwad.components.ad.splashscreen.monitor.a.kU().Z(this.mAdTemplate);
        KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener = this.Cf;
        if (splashScreenAdInteractionListener != null) {
            splashScreenAdInteractionListener.onAdShowEnd();
        }
        com.kwad.components.ad.splashscreen.monitor.a.kU().n(this.mAdTemplate);
    }

    @MainThread
    public final void kP() {
        KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener = this.Cf;
        if (splashScreenAdInteractionListener != null) {
            splashScreenAdInteractionListener.onSkippedAd();
        }
        com.kwad.components.ad.splashscreen.monitor.a.kU().n(this.mAdTemplate);
        kQ();
    }

    public final void kT() {
        this.mRootContainer.post(new az() { // from class: com.kwad.components.ad.splashscreen.h.2
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                if (com.kwad.components.core.e.c.b.nQ()) {
                    h.this.mRootContainer.postDelayed(this, 1000L);
                } else {
                    h.this.kO();
                }
            }
        });
    }

    @Override // com.kwad.sdk.mvp.a
    public final void release() {
        com.kwad.components.ad.splashscreen.d.a aVar = this.Cr;
        if (aVar != null) {
            aVar.release();
        }
        com.kwad.sdk.core.h.a aVar2 = this.Ct;
        if (aVar2 != null) {
            aVar2.release();
        }
    }

    public final void setSplashScreenAdListener(KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener) {
        this.Cf = splashScreenAdInteractionListener;
    }

    public final void b(g gVar) {
        this.Cu.remove(gVar);
    }

    public final void b(f fVar) {
        if (fVar == null) {
            return;
        }
        this.Cv.remove(fVar);
    }

    public final void a(g gVar) {
        this.Cu.add(gVar);
    }

    public final void a(f fVar) {
        if (fVar == null) {
            return;
        }
        this.Cv.add(fVar);
    }
}
