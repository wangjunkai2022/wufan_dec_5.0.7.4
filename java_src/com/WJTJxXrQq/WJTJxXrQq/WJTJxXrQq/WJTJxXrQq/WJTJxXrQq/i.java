package com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.JProtect;
import com.bytedance.msdk.adapter.ks.KsInterstitialLoader;
import com.bytedance.sdk.openadsdk.mediation.MediationApiLog;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsInterstitialAd;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
import com.kwad.sdk.api.KsVideoPlayConfig;
import com.kwad.sdk.api.model.AdExposureFailedReason;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final KsInterstitialLoader f1645a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1646b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MediationAdSlotValueSet f1647b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f1648c;

        a(MediationAdSlotValueSet mediationAdSlotValueSet, Context context) {
            this.f1647b = mediationAdSlotValueSet;
            this.f1648c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.c(this.f1647b);
            m.d(getClass().getName(), this.f1648c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends MediationBaseAdBridge {

        /* renamed from: b  reason: collision with root package name */
        private KsInterstitialAd f1650b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f1651c;

        /* renamed from: d  reason: collision with root package name */
        KsLoadManager.InterstitialAdListener f1652d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Activity f1654b;

            a(Activity activity) {
                this.f1654b = activity;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.d(this.f1654b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.i$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0029b implements Runnable {
            RunnableC0029b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c();
            }
        }

        /* loaded from: classes.dex */
        class c implements KsLoadManager.InterstitialAdListener {

            /* loaded from: classes2.dex */
            class a implements KsInterstitialAd.AdInteractionListener {
                a() {
                }

                @Override // com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener
                public void onAdClicked() {
                    MediationApiLog.i("TMe", "ks_KsInterstitialLoader onAdClicked");
                    Bridge bridge = b.this.mGMAd;
                    if (bridge != null) {
                        bridge.call(1009, null, Void.class);
                    }
                }

                @Override // com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener
                public void onAdClosed() {
                    MediationApiLog.i("TMe", "ks_KsInterstitialLoader onAdClosed");
                    b.this.j();
                }

                @Override // com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener
                public void onAdShow() {
                    MediationApiLog.i("TMe", "ks_KsInterstitialLoader onAdShow");
                    Bridge bridge = b.this.mGMAd;
                    if (bridge != null) {
                        bridge.call(1008, null, Void.class);
                    }
                }

                @Override // com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener
                public void onPageDismiss() {
                    MediationApiLog.i("TMe", "ks_KsInterstitialLoader onPageDismiss");
                    b.this.j();
                }

                @Override // com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener
                public void onSkippedAd() {
                    MediationApiLog.i("TMe", "ks_KsInterstitialLoader onSkippedAd");
                    b.this.j();
                }

                @Override // com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener
                public void onVideoPlayEnd() {
                    MediationApiLog.i("TMe", "ks_KsInterstitialLoader onVideoPlayEnd");
                }

                @Override // com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener
                public void onVideoPlayError(int i4, int i5) {
                    MediationApiLog.i("TMe", "ks_KsInterstitialLoader onVideoPlayError");
                }

                @Override // com.kwad.sdk.api.KsInterstitialAd.AdInteractionListener
                public void onVideoPlayStart() {
                    MediationApiLog.i("TMe", "ks_KsInterstitialLoader onVideoPlayStart");
                }
            }

            c() {
            }

            @Override // com.kwad.sdk.api.KsLoadManager.InterstitialAdListener
            @JProtect
            public void onError(int i4, String str) {
                MediationApiLog.i("TMe", "ks_KsInterstitialLoader onError");
                i.this.f1645a.notifyAdFailed(i4, str);
            }

            @Override // com.kwad.sdk.api.KsLoadManager.InterstitialAdListener
            @JProtect
            public void onInterstitialAdLoad(@Nullable List<KsInterstitialAd> list) {
                if (list == null || list.size() == 0) {
                    i.this.f1645a.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "暂无广告");
                    return;
                }
                MediationApiLog.i("TMe", "ks_KsInterstitialLoader onInterstitialAdLoad");
                b.this.f1650b = list.get(0);
                b.this.setExpress();
                if (i.this.f1645a.isClientBidding()) {
                    double ecpm = b.this.f1650b.getECPM();
                    b bVar = b.this;
                    if (ecpm <= 0.0d) {
                        ecpm = 0.0d;
                    }
                    bVar.setCpm(ecpm);
                }
                if (b.this.mGMAd != null) {
                    MediationValueSetBuilder create = MediationValueSetBuilder.create();
                    create.add(8059, n.b(b.this.f1650b.getInteractionType()));
                    b.this.mGMAd.call(8140, create.build(), Void.class);
                }
                KsInterstitialLoader ksInterstitialLoader = i.this.f1645a;
                b bVar2 = b.this;
                ksInterstitialLoader.notifyAdSuccess(bVar2, bVar2.mGMAd);
                b.this.f1650b.setAdInteractionListener(new a());
            }

            @Override // com.kwad.sdk.api.KsLoadManager.InterstitialAdListener
            public void onRequestResult(int i4) {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class d implements Callable<String> {
            d() {
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public String call() {
                return b.this.n();
            }
        }

        public b(MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge) {
            super(mediationAdSlotValueSet, bridge);
            this.f1652d = new c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j() {
            if (this.f1651c) {
                return;
            }
            this.f1651c = true;
            Bridge bridge = this.mGMAd;
            if (bridge != null) {
                bridge.call(1014, null, Void.class);
            }
        }

        private String l() {
            return i.this.f1646b ? m() : n();
        }

        private String m() {
            try {
                return (String) m.a(new d()).get(500L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String n() {
            Object obj;
            try {
                KsInterstitialAd ksInterstitialAd = this.f1650b;
                if (ksInterstitialAd == null || (obj = ksInterstitialAd.getMediaExtraInfo().get("llsid")) == null) {
                    return null;
                }
                return obj.toString();
            } catch (Throwable unused) {
                return null;
            }
        }

        public void c() {
            KsInterstitialAd ksInterstitialAd = this.f1650b;
            if (ksInterstitialAd != null) {
                ksInterstitialAd.setAdInteractionListener(null);
                this.f1650b = null;
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
            if (i4 == 8113) {
                Activity activity = (Activity) valueSet.objectValue(20033, Activity.class);
                if (activity != null) {
                    k(activity);
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
                    return (T) l();
                }
                if (i4 == 8142) {
                    if (n.i(this.f1650b)) {
                        Map map = (Map) valueSet.objectValue(8006, Map.class);
                        MediationApiLog.i("-------ks_bid_win --------- map = " + map);
                        if (map != null) {
                            long d5 = n.d(map);
                            long l4 = n.l(map);
                            MediationApiLog.i("-------ks_bid_win --------- bidEcpm = " + d5 + " loseBidEcpm = " + l4);
                            KsInterstitialAd ksInterstitialAd = this.f1650b;
                            if (ksInterstitialAd != null) {
                                ksInterstitialAd.setBidEcpm(d5, l4);
                            }
                        }
                    }
                } else if (i4 == 8144 && n.n(this.f1650b)) {
                    Map map2 = (Map) valueSet.objectValue(8006, Map.class);
                    MediationApiLog.i("-------ks_bid_lose --------- map = " + map2);
                    if (map2 != null) {
                        int o4 = n.o(map2);
                        int p4 = n.p(map2);
                        int q4 = n.q(map2);
                        String r4 = n.r(map2);
                        MediationApiLog.i("-------ks_bid_lose --------- bidEcpm = " + p4 + " failureCode = " + o4);
                        if (this.f1650b != null) {
                            AdExposureFailedReason adExposureFailedReason = new AdExposureFailedReason();
                            adExposureFailedReason.setWinEcpm(p4);
                            adExposureFailedReason.setAdnType(q4);
                            adExposureFailedReason.setAdnName(r4);
                            this.f1650b.reportAdExposureFailed(o4, adExposureFailedReason);
                        }
                    }
                }
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        @JProtect
        public void d(Activity activity) {
            if (this.f1650b != null) {
                this.f1650b.showInterstitialAd(activity, new KsVideoPlayConfig.Builder().videoSoundEnable(!isMuted()).build());
            }
        }

        @JProtect
        public void e(KsScene ksScene) {
            MediationApiLog.i("TMe", "ks_KsInterstitialLoader loadAd");
            KsAdSDK.getLoadManager().loadInterstitialAd(ksScene, this.f1652d);
        }

        public void f() {
            m.e(new RunnableC0029b());
        }

        public void g(Activity activity) {
            m.e(new a(activity));
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            return this.f1650b == null;
        }

        public void k(Activity activity) {
            if (i.this.f1646b) {
                g(activity);
            } else {
                d(activity);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            if (i.this.f1646b) {
                f();
            } else {
                c();
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    public i(KsInterstitialLoader ksInterstitialLoader) {
        this.f1645a = ksInterstitialLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(MediationAdSlotValueSet mediationAdSlotValueSet) {
        try {
            new b(mediationAdSlotValueSet, this.f1645a.getGMBridge()).e(new KsScene.Builder(Long.valueOf(this.f1645a.getAdnId()).longValue()).build());
        } catch (Exception unused) {
            this.f1645a.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "代码位不合法");
        }
    }

    public void a(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        boolean g4 = n.g(this.f1645a, mediationAdSlotValueSet);
        this.f1646b = g4;
        if (g4) {
            m.c(new a(mediationAdSlotValueSet, context));
        } else {
            c(mediationAdSlotValueSet);
        }
    }
}
