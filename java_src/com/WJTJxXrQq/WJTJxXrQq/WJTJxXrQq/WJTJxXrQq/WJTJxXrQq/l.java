package com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.JProtect;
import com.bytedance.msdk.adapter.ks.KsSplashLoader;
import com.bytedance.sdk.openadsdk.mediation.MediationApiLog;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
import com.kwad.sdk.api.KsSplashScreenAd;
import com.kwad.sdk.api.model.AdExposureFailedReason;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final KsSplashLoader f1691a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1692b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MediationAdSlotValueSet f1693b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f1694c;

        a(MediationAdSlotValueSet mediationAdSlotValueSet, Context context) {
            this.f1693b = mediationAdSlotValueSet;
            this.f1694c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.b(this.f1693b);
            m.d(getClass().getName(), this.f1694c.getApplicationContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends MediationBaseAdBridge {

        /* renamed from: b  reason: collision with root package name */
        private KsSplashScreenAd f1696b;

        /* renamed from: c  reason: collision with root package name */
        KsLoadManager.SplashScreenAdListener f1697c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ViewGroup f1699b;

            a(ViewGroup viewGroup) {
                this.f1699b = viewGroup;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.l(this.f1699b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.l$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0031b implements KsSplashScreenAd.SplashScreenAdInteractionListener {
            C0031b() {
            }

            @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
            public void onAdClicked() {
                MediationApiLog.i("TMe", "KsSplashLoader onAdClicked");
                Bridge bridge = b.this.mGMAd;
                if (bridge != null) {
                    bridge.call(1009, null, Void.class);
                }
            }

            @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
            public void onAdShowEnd() {
                MediationApiLog.i("TMe", "KsSplashLoader onAdShowEnd");
                Bridge bridge = b.this.mGMAd;
                if (bridge != null) {
                    bridge.call(1011, null, Void.class);
                }
            }

            @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
            public void onAdShowError(int i4, String str) {
                MediationApiLog.i("TMe", "KsSplashLoader onAdShowError");
                if (b.this.mGMAd != null) {
                    MediationValueSetBuilder create = MediationValueSetBuilder.create();
                    create.add(8014, i4);
                    create.add(8015, str);
                    b.this.mGMAd.call(1017, create.build(), Void.class);
                }
            }

            @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
            public void onAdShowStart() {
                MediationApiLog.i("TMe", "KsSplashLoader onAdShowStart");
                Bridge bridge = b.this.mGMAd;
                if (bridge != null) {
                    bridge.call(1008, null, Void.class);
                }
            }

            @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
            public void onDownloadTipsDialogCancel() {
            }

            @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
            public void onDownloadTipsDialogDismiss() {
            }

            @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
            public void onDownloadTipsDialogShow() {
            }

            @Override // com.kwad.sdk.api.KsSplashScreenAd.SplashScreenAdInteractionListener
            public void onSkippedAd() {
                MediationApiLog.i("TMe", "KsSplashLoader onSkippedAd");
                Bridge bridge = b.this.mGMAd;
                if (bridge != null) {
                    bridge.call(1019, null, Void.class);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class c implements Callable<MediationConstant.AdIsReadyStatus> {
            c() {
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public MediationConstant.AdIsReadyStatus call() {
                return b.this.a();
            }
        }

        /* loaded from: classes2.dex */
        class d implements KsLoadManager.SplashScreenAdListener {
            d() {
            }

            @Override // com.kwad.sdk.api.KsLoadManager.SplashScreenAdListener
            public void onError(int i4, String str) {
                MediationApiLog.i("TMe", "KsSplashLoader load  onError");
                l.this.f1691a.notifyAdFailed(i4, str);
            }

            @Override // com.kwad.sdk.api.KsLoadManager.SplashScreenAdListener
            public void onRequestResult(int i4) {
            }

            @Override // com.kwad.sdk.api.KsLoadManager.SplashScreenAdListener
            public void onSplashScreenAdLoad(@Nullable KsSplashScreenAd ksSplashScreenAd) {
                MediationApiLog.i("TMe", "KsSplashLoader load  onSplashScreenAdLoad ksSplashScreenAd:" + ksSplashScreenAd);
                if (ksSplashScreenAd == null) {
                    l.this.f1691a.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "ksSplashScreenAd is null");
                    return;
                }
                b.this.f1696b = ksSplashScreenAd;
                if (l.this.f1691a.isClientBidding()) {
                    double ecpm = ksSplashScreenAd.getECPM();
                    b bVar = b.this;
                    if (ecpm <= 0.0d) {
                        ecpm = 0.0d;
                    }
                    bVar.setCpm(ecpm);
                }
                if (b.this.mGMAd != null) {
                    MediationValueSetBuilder create = MediationValueSetBuilder.create();
                    create.add(8059, n.b(b.this.f1696b.getInteractionType()));
                    b.this.mGMAd.call(8140, create.build(), Void.class);
                }
                b.this.setExpress();
                MediationApiLog.i("KsRewardLoader", "load success");
                KsSplashLoader ksSplashLoader = l.this.f1691a;
                b bVar2 = b.this;
                ksSplashLoader.notifyAdSuccess(bVar2, bVar2.mGMAd);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class e implements Callable<String> {
            e() {
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public String call() {
                return b.this.n();
            }
        }

        public b(MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge) {
            super(mediationAdSlotValueSet, bridge);
            this.f1697c = new d();
        }

        private void j(ViewGroup viewGroup) {
            m.e(new a(viewGroup));
        }

        private String k() {
            return l.this.f1692b ? m() : n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(ViewGroup viewGroup) {
            View view;
            KsSplashScreenAd ksSplashScreenAd = this.f1696b;
            if (ksSplashScreenAd == null || viewGroup == null || (view = ksSplashScreenAd.getView(viewGroup.getContext(), new C0031b())) == null) {
                return;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            viewGroup.removeAllViews();
            viewGroup.addView(view);
        }

        private String m() {
            try {
                return (String) m.a(new e()).get(500L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String n() {
            Object obj;
            try {
                KsSplashScreenAd ksSplashScreenAd = this.f1696b;
                if (ksSplashScreenAd == null || (obj = ksSplashScreenAd.getMediaExtraInfo().get("llsid")) == null) {
                    return null;
                }
                return obj.toString();
            } catch (Throwable unused) {
                return null;
            }
        }

        public MediationConstant.AdIsReadyStatus a() {
            KsSplashScreenAd ksSplashScreenAd = this.f1696b;
            return (ksSplashScreenAd == null || !ksSplashScreenAd.isAdEnable()) ? MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY : MediationConstant.AdIsReadyStatus.AD_IS_READY;
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
            if (i4 == 6152) {
                MediationApiLog.i("TMe", "KsSplashLoader showSplashAd");
                ViewGroup viewGroup = (ViewGroup) valueSet.objectValue(20060, ViewGroup.class);
                if (viewGroup != null) {
                    e(viewGroup);
                }
            } else if (i4 != 6154 && i4 != 6153) {
                if (i4 == 6161) {
                    MediationApiLog.i("TMe", "KsSplashLoader showMinWindow");
                    Rect rect = (Rect) valueSet.objectValue(20067, Rect.class);
                    if (rect != null) {
                        d(rect);
                    }
                } else if (i4 == 8109) {
                    onDestroy();
                } else if (i4 == 8120) {
                    return (T) Boolean.valueOf(hasDestroyed());
                } else {
                    if (i4 == 8121) {
                        return (T) isReadyStatus();
                    }
                    if (i4 == 8147) {
                        return (T) k();
                    }
                    if (i4 == 8142) {
                        if (n.i(this.f1696b)) {
                            Map map = (Map) valueSet.objectValue(8006, Map.class);
                            MediationApiLog.i("-------ks_bid_win --------- map = " + map);
                            if (map != null) {
                                long d5 = n.d(map);
                                long l4 = n.l(map);
                                MediationApiLog.i("-------ks_bid_win --------- bidEcpm = " + d5 + " loseBidEcpm = " + l4);
                                KsSplashScreenAd ksSplashScreenAd = this.f1696b;
                                if (ksSplashScreenAd != null) {
                                    ksSplashScreenAd.setBidEcpm(d5, l4);
                                }
                            }
                        }
                    } else if (i4 == 8144 && n.n(this.f1696b)) {
                        Map map2 = (Map) valueSet.objectValue(8006, Map.class);
                        MediationApiLog.i("-------ks_bid_lose --------- map = " + map2);
                        if (map2 != null) {
                            int o4 = n.o(map2);
                            int p4 = n.p(map2);
                            int q4 = n.q(map2);
                            String r4 = n.r(map2);
                            MediationApiLog.i("-------ks_bid_lose --------- bidEcpm = " + p4 + " failureCode = " + o4);
                            if (this.f1696b != null) {
                                AdExposureFailedReason adExposureFailedReason = new AdExposureFailedReason();
                                adExposureFailedReason.setWinEcpm(p4);
                                adExposureFailedReason.setAdnType(q4);
                                adExposureFailedReason.setAdnName(r4);
                                this.f1696b.reportAdExposureFailed(o4, adExposureFailedReason);
                            }
                        }
                    }
                }
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        public void d(Rect rect) {
        }

        public void e(ViewGroup viewGroup) {
            if (l.this.f1692b) {
                j(viewGroup);
            } else {
                l(viewGroup);
            }
        }

        @JProtect
        void g(KsScene ksScene) {
            MediationApiLog.i("TMe", "KsSplashLoader loadAd");
            KsAdSDK.getLoadManager().loadSplashScreenAd(ksScene, this.f1697c);
        }

        public MediationConstant.AdIsReadyStatus h() {
            try {
                MediationConstant.AdIsReadyStatus adIsReadyStatus = (MediationConstant.AdIsReadyStatus) m.a(new c()).get(500L, TimeUnit.MILLISECONDS);
                return adIsReadyStatus != null ? adIsReadyStatus : MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY;
            } catch (Exception e5) {
                e5.printStackTrace();
                return MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY;
            }
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            return this.f1696b == null;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public MediationConstant.AdIsReadyStatus isReadyStatus() {
            return l.this.f1692b ? h() : a();
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            if (this.f1696b != null) {
                this.f1696b = null;
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    public l(KsSplashLoader ksSplashLoader) {
        this.f1691a = ksSplashLoader;
    }

    public void a(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        boolean g4 = n.g(this.f1691a, mediationAdSlotValueSet);
        this.f1692b = g4;
        if (g4) {
            m.c(new a(mediationAdSlotValueSet, context));
        } else {
            b(mediationAdSlotValueSet);
        }
    }

    public void b(MediationAdSlotValueSet mediationAdSlotValueSet) {
        MediationApiLog.i("TMe", "KsSplashLoader realLoader adnId:" + this.f1691a.getAdnId());
        try {
            new b(mediationAdSlotValueSet, this.f1691a.getGMBridge()).g(new KsScene.Builder(Long.valueOf(this.f1691a.getAdnId()).longValue()).build());
        } catch (Exception unused) {
            this.f1691a.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "代码位不合法");
        }
    }
}
