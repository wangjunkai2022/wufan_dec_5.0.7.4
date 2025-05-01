package com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.JProtect;
import com.bytedance.msdk.adapter.ks.KsFullVideoLoader;
import com.bytedance.sdk.openadsdk.mediation.MediationApiLog;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsFullScreenVideoAd;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
import com.kwad.sdk.api.KsVideoPlayConfig;
import com.kwad.sdk.api.model.AdExposureFailedReason;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final KsFullVideoLoader f1630a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1631b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MediationAdSlotValueSet f1632b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f1633c;

        a(MediationAdSlotValueSet mediationAdSlotValueSet, Context context) {
            this.f1632b = mediationAdSlotValueSet;
            this.f1633c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.b(this.f1632b);
            m.d(getClass().getName(), this.f1633c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends MediationBaseAdBridge {

        /* renamed from: b  reason: collision with root package name */
        private KsFullScreenVideoAd f1635b;

        /* renamed from: c  reason: collision with root package name */
        KsLoadManager.FullScreenVideoAdListener f1636c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Activity f1638b;

            a(Activity activity) {
                this.f1638b = activity;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.i(this.f1638b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.h$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class CallableC0028b implements Callable<MediationConstant.AdIsReadyStatus> {
            CallableC0028b() {
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public MediationConstant.AdIsReadyStatus call() {
                return b.this.j();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c();
            }
        }

        /* loaded from: classes.dex */
        class d implements KsLoadManager.FullScreenVideoAdListener {

            /* loaded from: classes2.dex */
            class a implements KsFullScreenVideoAd.FullScreenVideoAdInteractionListener {
                a() {
                }

                @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
                public void onAdClicked() {
                    MediationApiLog.i("TMe", "ks_KsFullVideoLoader onAdClicked");
                    Bridge bridge = b.this.mGMAd;
                    if (bridge != null) {
                        bridge.call(1009, null, Void.class);
                    }
                }

                @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
                public void onPageDismiss() {
                    MediationApiLog.i("TMe", "ks_KsFullVideoLoader onPageDismiss");
                    Bridge bridge = b.this.mGMAd;
                    if (bridge != null) {
                        bridge.call(1014, null, Void.class);
                    }
                }

                @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
                public void onSkippedVideo() {
                    MediationApiLog.i("TMe", "ks_KsFullVideoLoader onSkippedVideo");
                    Bridge bridge = b.this.mGMAd;
                    if (bridge != null) {
                        bridge.call(1037, null, Void.class);
                    }
                }

                @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
                public void onVideoPlayEnd() {
                    MediationApiLog.i("TMe", "ks_KsFullVideoLoader onVideoPlayEnd");
                    Bridge bridge = b.this.mGMAd;
                    if (bridge != null) {
                        bridge.call(1026, null, Void.class);
                    }
                }

                @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
                public void onVideoPlayError(int i4, int i5) {
                    MediationApiLog.i("TMe", "ks_KsFullVideoLoader onVideoPlayError");
                    Bridge bridge = b.this.mGMAd;
                    if (bridge != null) {
                        bridge.call(1021, null, Void.class);
                    }
                }

                @Override // com.kwad.sdk.api.KsFullScreenVideoAd.FullScreenVideoAdInteractionListener
                public void onVideoPlayStart() {
                    MediationApiLog.i("TMe", "ks_KsFullVideoLoader onVideoPlayStart");
                    Bridge bridge = b.this.mGMAd;
                    if (bridge != null) {
                        bridge.call(1008, null, Void.class);
                    }
                }
            }

            d() {
            }

            @Override // com.kwad.sdk.api.KsLoadManager.FullScreenVideoAdListener
            @JProtect
            public void onError(int i4, String str) {
                MediationApiLog.i("TMe", "ks_KsFullVideoLoader onError");
                h.this.f1630a.notifyAdFailed(i4, str);
            }

            @Override // com.kwad.sdk.api.KsLoadManager.FullScreenVideoAdListener
            @JProtect
            public void onFullScreenVideoAdLoad(@Nullable List<KsFullScreenVideoAd> list) {
                MediationApiLog.i("TMe", "ks_KsFullVideoLoader onFullScreenVideoAdLoad");
                if (list == null || list.size() == 0 || list.get(0) == null) {
                    h.this.f1630a.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "暂无广告");
                    return;
                }
                b.this.f1635b = list.get(0);
                if (h.this.f1630a.isClientBidding()) {
                    double ecpm = b.this.f1635b.getECPM();
                    b bVar = b.this;
                    if (ecpm <= 0.0d) {
                        ecpm = 0.0d;
                    }
                    bVar.setCpm(ecpm);
                }
                if (b.this.mGMAd != null) {
                    MediationValueSetBuilder create = MediationValueSetBuilder.create();
                    create.add(8059, n.b(b.this.f1635b.getInteractionType()));
                    b.this.mGMAd.call(8140, create.build(), Void.class);
                }
                b.this.setExpress();
                b.this.f1635b.setFullScreenVideoAdInteractionListener(new a());
                KsFullVideoLoader ksFullVideoLoader = h.this.f1630a;
                b bVar2 = b.this;
                ksFullVideoLoader.notifyAdSuccess(bVar2, bVar2.mGMAd);
                h.this.f1630a.notifyAdCache(b.this.mGMAd, MediationConstant.ErrorCode.ADN_AD_NO_CACHE, "没有cache回调");
            }

            @Override // com.kwad.sdk.api.KsLoadManager.FullScreenVideoAdListener
            public void onFullScreenVideoResult(@Nullable List<KsFullScreenVideoAd> list) {
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
                return b.this.p();
            }
        }

        public b(MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge) {
            super(mediationAdSlotValueSet, bridge);
            this.f1636c = new d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JProtect
        public void i(Activity activity) {
            MediationApiLog.i("TMe", "ks_KsFullVideoLoader showAd");
            if (activity == null || this.f1635b == null) {
                return;
            }
            KsVideoPlayConfig.Builder builder = new KsVideoPlayConfig.Builder();
            boolean isMuted = isMuted();
            if (getOrientation() == 2) {
                builder.showLandscape(true);
            }
            builder.videoSoundEnable(!isMuted);
            this.f1635b.showFullScreenVideoAd(activity, builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MediationConstant.AdIsReadyStatus j() {
            MediationApiLog.i("TMe", "ks_KsFullVideoLoader isReadyStatus");
            KsFullScreenVideoAd ksFullScreenVideoAd = this.f1635b;
            return (ksFullScreenVideoAd == null || !ksFullScreenVideoAd.isAdEnable()) ? MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY : MediationConstant.AdIsReadyStatus.AD_IS_READY;
        }

        private void l(Activity activity) {
            m.e(new a(activity));
        }

        private MediationConstant.AdIsReadyStatus m() {
            try {
                MediationConstant.AdIsReadyStatus adIsReadyStatus = (MediationConstant.AdIsReadyStatus) m.a(new CallableC0028b()).get(500L, TimeUnit.MILLISECONDS);
                return adIsReadyStatus != null ? adIsReadyStatus : MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY;
            } catch (Exception e5) {
                e5.printStackTrace();
                return MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY;
            }
        }

        private String n() {
            return h.this.f1631b ? o() : p();
        }

        private String o() {
            try {
                return (String) m.a(new e()).get(500L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String p() {
            Object obj;
            try {
                KsFullScreenVideoAd ksFullScreenVideoAd = this.f1635b;
                if (ksFullScreenVideoAd == null || (obj = ksFullScreenVideoAd.getMediaExtraInfo().get("llsid")) == null) {
                    return null;
                }
                return obj.toString();
            } catch (Throwable unused) {
                return null;
            }
        }

        public void c() {
            MediationApiLog.i("TMe", "ks_KsFullVideoLoader onDestroy");
            KsFullScreenVideoAd ksFullScreenVideoAd = this.f1635b;
            if (ksFullScreenVideoAd != null) {
                ksFullScreenVideoAd.setFullScreenVideoAdInteractionListener(null);
                this.f1635b = null;
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
            if (i4 == 8113) {
                MediationApiLog.i("TMe", "ks_KsFullVideoLoader showAd");
                Activity activity = (Activity) valueSet.objectValue(20033, Activity.class);
                if (activity != null) {
                    d(activity);
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
                    return (T) n();
                }
                if (i4 == 8142) {
                    if (n.i(this.f1635b)) {
                        Map map = (Map) valueSet.objectValue(8006, Map.class);
                        MediationApiLog.i("-------ks_bid_win --------- map = " + map);
                        if (map != null) {
                            long d5 = n.d(map);
                            long l4 = n.l(map);
                            MediationApiLog.i("-------ks_bid_win --------- bidEcpm = " + d5 + " loseBidEcpm = " + l4);
                            KsFullScreenVideoAd ksFullScreenVideoAd = this.f1635b;
                            if (ksFullScreenVideoAd != null) {
                                ksFullScreenVideoAd.setBidEcpm(d5, l4);
                            }
                        }
                    }
                } else if (i4 == 8144 && n.n(this.f1635b)) {
                    Map map2 = (Map) valueSet.objectValue(8006, Map.class);
                    MediationApiLog.i("-------ks_bid_lose --------- map = " + map2);
                    if (map2 != null) {
                        int o4 = n.o(map2);
                        int p4 = n.p(map2);
                        int q4 = n.q(map2);
                        String r4 = n.r(map2);
                        MediationApiLog.i("-------ks_bid_lose --------- bidEcpm = " + p4 + " failureCode = " + o4);
                        if (this.f1635b != null) {
                            AdExposureFailedReason adExposureFailedReason = new AdExposureFailedReason();
                            adExposureFailedReason.setWinEcpm(p4);
                            adExposureFailedReason.setAdnType(q4);
                            adExposureFailedReason.setAdnName(r4);
                            this.f1635b.reportAdExposureFailed(o4, adExposureFailedReason);
                        }
                    }
                }
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        public void d(Activity activity) {
            if (h.this.f1631b) {
                l(activity);
            } else {
                i(activity);
            }
        }

        @JProtect
        public void f(KsScene ksScene) {
            MediationApiLog.i("TMe", "ks_KsFullVideoLoader loadAd");
            KsAdSDK.getLoadManager().loadFullScreenVideoAd(ksScene, this.f1636c);
        }

        public void h() {
            m.e(new c());
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            MediationApiLog.i("TMe", "ks_KsFullVideoLoader hasDestroyed");
            return this.f1635b == null;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public MediationConstant.AdIsReadyStatus isReadyStatus() {
            return h.this.f1631b ? m() : j();
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            if (h.this.f1631b) {
                h();
            } else {
                c();
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    public h(KsFullVideoLoader ksFullVideoLoader) {
        this.f1630a = ksFullVideoLoader;
    }

    public void a(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        boolean g4 = n.g(this.f1630a, mediationAdSlotValueSet);
        this.f1631b = g4;
        if (g4) {
            m.c(new a(mediationAdSlotValueSet, context));
        } else {
            b(mediationAdSlotValueSet);
        }
    }

    public void b(MediationAdSlotValueSet mediationAdSlotValueSet) {
        try {
            new b(mediationAdSlotValueSet, this.f1630a.getGMBridge()).f(new KsScene.Builder(Long.valueOf(this.f1630a.getAdnId()).longValue()).build());
        } catch (Exception unused) {
            this.f1630a.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "代码位不合法");
        }
    }
}
