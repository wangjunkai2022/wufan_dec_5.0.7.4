package com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.msdk.adapter.ks.KsRewardLoader;
import com.bytedance.sdk.openadsdk.mediation.MediationApiLog;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsRewardVideoAd;
import com.kwad.sdk.api.KsScene;
import com.kwad.sdk.api.KsVideoPlayConfig;
import com.kwad.sdk.api.model.AdExposureFailedReason;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final KsRewardLoader f1673a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1674b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MediationAdSlotValueSet f1675b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f1676c;

        a(MediationAdSlotValueSet mediationAdSlotValueSet, Context context) {
            this.f1675b = mediationAdSlotValueSet;
            this.f1676c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.c(this.f1675b);
            m.d(getClass().getName(), this.f1676c.getApplicationContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b extends MediationBaseAdBridge {

        /* renamed from: b  reason: collision with root package name */
        private KsRewardVideoAd f1678b;

        /* renamed from: c  reason: collision with root package name */
        private KsRewardLoader f1679c;

        /* renamed from: d  reason: collision with root package name */
        private Bridge f1680d;

        /* renamed from: e  reason: collision with root package name */
        private MediationAdSlotValueSet f1681e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1682f;

        /* renamed from: g  reason: collision with root package name */
        KsLoadManager.RewardVideoAdListener f1683g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.i();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.k$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class CallableC0030b implements Callable<MediationConstant.AdIsReadyStatus> {
            CallableC0030b() {
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public MediationConstant.AdIsReadyStatus call() {
                return b.this.n();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class c implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Activity f1686b;

            c(Activity activity) {
                this.f1686b = activity;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.j(this.f1686b);
            }
        }

        /* loaded from: classes2.dex */
        class d implements KsLoadManager.RewardVideoAdListener {

            /* loaded from: classes2.dex */
            class a implements KsRewardVideoAd.RewardAdInteractionListener {
                a() {
                }

                @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                public void onAdClicked() {
                    MediationApiLog.i("KsRewardLoader", "onAdClicked");
                    if (b.this.f1680d != null) {
                        b.this.f1680d.call(8115, null, Void.class);
                    }
                }

                @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                public void onExtraRewardVerify(int i4) {
                    MediationApiLog.i("KsRewardLoader", "onExtraRewardVerify");
                }

                @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                public void onPageDismiss() {
                    MediationApiLog.i("KsRewardLoader", "onPageDismiss");
                    if (b.this.f1680d != null) {
                        b.this.f1680d.call(8116, null, Void.class);
                    }
                }

                @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                public void onRewardStepVerify(int i4, int i5) {
                    MediationApiLog.i("KsRewardLoader", "onRewardStepVerify");
                }

                @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                public void onRewardVerify() {
                    MediationApiLog.i("KsRewardLoader", "onRewardVerify");
                    if (b.this.f1680d != null) {
                        MediationValueSetBuilder create = MediationValueSetBuilder.create();
                        create.add(8017, true);
                        create.add(8018, b.this.f1681e.getRewardAmount());
                        create.add(8019, b.this.f1681e.getRewardName());
                        b.this.f1680d.call(8231, create.build(), Void.class);
                    }
                }

                @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                public void onVideoPlayEnd() {
                    MediationApiLog.i("KsRewardLoader", "onVideoPlayEnd");
                    if (b.this.f1680d != null) {
                        b.this.f1680d.call(8118, null, Void.class);
                    }
                }

                @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                public void onVideoPlayError(int i4, int i5) {
                    MediationApiLog.i("KsRewardLoader", "onVideoPlayError");
                    if (b.this.f1680d != null) {
                        b.this.f1680d.call(8117, null, Void.class);
                    }
                }

                @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                public void onVideoPlayStart() {
                    MediationApiLog.i("KsRewardLoader", "onVideoPlayStart");
                    if (b.this.f1680d != null) {
                        b.this.f1680d.call(8230, null, Void.class);
                    }
                }

                @Override // com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener
                public void onVideoSkipToEnd(long j4) {
                    MediationApiLog.i("KsRewardLoader", "onVideoSkipToEnd");
                    if (b.this.f1680d != null) {
                        b.this.f1680d.call(8119, null, Void.class);
                    }
                }
            }

            d() {
            }

            @Override // com.kwad.sdk.api.KsLoadManager.RewardVideoAdListener
            public void onError(int i4, String str) {
                MediationApiLog.i("KsRewardLoader", "load fail");
                b.this.f1679c.notifyAdFailed(i4, str);
            }

            @Override // com.kwad.sdk.api.KsLoadManager.RewardVideoAdListener
            public void onRewardVideoAdLoad(@Nullable List<KsRewardVideoAd> list) {
                if (list == null || list.size() == 0 || list.get(0) == null) {
                    b.this.f1679c.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "广告位空");
                    return;
                }
                b.this.f1678b = list.get(0);
                MediationValueSetBuilder create = MediationValueSetBuilder.create();
                if (b.this.f1679c.isClientBidding()) {
                    double ecpm = b.this.f1678b.getECPM();
                    create.add(8016, ecpm > 0.0d ? ecpm : 0.0d);
                    b.this.setCpm(ecpm);
                }
                if (b.this.f1680d != null) {
                    MediationValueSetBuilder create2 = MediationValueSetBuilder.create();
                    create2.add(8059, n.b(b.this.f1678b.getInteractionType()));
                    b.this.f1680d.call(8140, create2.build(), Void.class);
                }
                b.this.f1678b.setRewardAdInteractionListener(new a());
                if (b.this.f1679c != null) {
                    MediationApiLog.i("KsRewardLoader", "load success");
                    KsRewardLoader ksRewardLoader = b.this.f1679c;
                    b bVar = b.this;
                    ksRewardLoader.notifyAdSuccess(bVar, bVar.f1680d);
                }
                if (b.this.f1679c != null) {
                    MediationApiLog.i("KsRewardLoader", "cache success");
                    b.this.f1679c.notifyAdCache(b.this.f1680d, MediationConstant.ErrorCode.ADN_AD_NO_CACHE, "没有cache回调");
                }
            }

            @Override // com.kwad.sdk.api.KsLoadManager.RewardVideoAdListener
            public void onRewardVideoResult(@Nullable List<KsRewardVideoAd> list) {
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
                return b.this.v();
            }
        }

        public b(KsRewardLoader ksRewardLoader, MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge, boolean z4) {
            super(mediationAdSlotValueSet, bridge);
            this.f1683g = new d();
            this.f1679c = ksRewardLoader;
            this.f1681e = mediationAdSlotValueSet;
            this.f1680d = bridge;
            this.f1682f = z4;
            b();
        }

        private void b() {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8035, this);
            this.f1680d.call(8128, create.build(), Void.class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(KsScene ksScene) {
            if (KsAdSDK.getLoadManager() != null) {
                KsAdSDK.getLoadManager().loadRewardVideoAd(ksScene, this.f1683g);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i() {
            KsRewardVideoAd ksRewardVideoAd = this.f1678b;
            if (ksRewardVideoAd != null) {
                ksRewardVideoAd.setRewardAdInteractionListener(null);
                this.f1678b = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(Activity activity) {
            if (this.f1678b != null) {
                KsVideoPlayConfig.Builder builder = new KsVideoPlayConfig.Builder();
                MediationAdSlotValueSet mediationAdSlotValueSet = this.f1681e;
                boolean isMuted = mediationAdSlotValueSet != null ? mediationAdSlotValueSet.isMuted() : false;
                MediationAdSlotValueSet mediationAdSlotValueSet2 = this.f1681e;
                if (mediationAdSlotValueSet2 != null && mediationAdSlotValueSet2.getOrientation() == 2) {
                    builder.showLandscape(true);
                }
                builder.videoSoundEnable(!isMuted);
                this.f1678b.showRewardVideoAd(activity, builder.build());
            }
        }

        private void l() {
            m.e(new a());
        }

        private void m(Activity activity) {
            m.e(new c(activity));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MediationConstant.AdIsReadyStatus n() {
            KsRewardVideoAd ksRewardVideoAd = this.f1678b;
            return (ksRewardVideoAd == null || !ksRewardVideoAd.isAdEnable()) ? MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY : MediationConstant.AdIsReadyStatus.AD_IS_READY;
        }

        private MediationConstant.AdIsReadyStatus q() {
            try {
                MediationConstant.AdIsReadyStatus adIsReadyStatus = (MediationConstant.AdIsReadyStatus) m.a(new CallableC0030b()).get(500L, TimeUnit.MILLISECONDS);
                return adIsReadyStatus != null ? adIsReadyStatus : MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY;
            } catch (Exception e5) {
                e5.printStackTrace();
                return MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY;
            }
        }

        private String s() {
            return this.f1682f ? t() : v();
        }

        private String t() {
            try {
                return (String) m.a(new e()).get(500L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String v() {
            Object obj;
            try {
                KsRewardVideoAd ksRewardVideoAd = this.f1678b;
                if (ksRewardVideoAd == null || (obj = ksRewardVideoAd.getMediaExtraInfo().get("llsid")) == null) {
                    return null;
                }
                return obj.toString();
            } catch (Throwable unused) {
                return null;
            }
        }

        public void c(Activity activity) {
            if (this.f1682f) {
                m(activity);
            } else {
                j(activity);
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
            if (i4 == 8113) {
                Activity activity = (Activity) valueSet.objectValue(20033, Activity.class);
                if (activity != null) {
                    c(activity);
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
                    return (T) s();
                }
                if (i4 == 8142) {
                    if (n.i(this.f1678b)) {
                        Map map = (Map) valueSet.objectValue(8006, Map.class);
                        MediationApiLog.i("-------ks_bid_win --------- map = " + map);
                        if (map != null) {
                            long d5 = n.d(map);
                            long l4 = n.l(map);
                            MediationApiLog.i("-------ks_bid_win --------- bidEcpm = " + d5 + " loseBidEcpm = " + l4);
                            KsRewardVideoAd ksRewardVideoAd = this.f1678b;
                            if (ksRewardVideoAd != null) {
                                ksRewardVideoAd.setBidEcpm(d5, l4);
                            }
                        }
                    }
                } else if (i4 == 8144 && n.n(this.f1678b)) {
                    Map map2 = (Map) valueSet.objectValue(8006, Map.class);
                    MediationApiLog.i("-------ks_bid_lose --------- map = " + map2);
                    if (map2 != null) {
                        int o4 = n.o(map2);
                        int p4 = n.p(map2);
                        int q4 = n.q(map2);
                        String r4 = n.r(map2);
                        MediationApiLog.i("-------ks_bid_lose --------- bidEcpm = " + p4 + " failureCode = " + o4);
                        if (this.f1678b != null) {
                            AdExposureFailedReason adExposureFailedReason = new AdExposureFailedReason();
                            adExposureFailedReason.setWinEcpm(p4);
                            adExposureFailedReason.setAdnType(q4);
                            adExposureFailedReason.setAdnName(r4);
                            this.f1678b.reportAdExposureFailed(o4, adExposureFailedReason);
                        }
                    }
                }
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            return this.f1678b == null;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public MediationConstant.AdIsReadyStatus isReadyStatus() {
            return this.f1682f ? q() : n();
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            if (this.f1682f) {
                l();
            } else {
                i();
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    public k(KsRewardLoader ksRewardLoader) {
        this.f1673a = ksRewardLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(MediationAdSlotValueSet mediationAdSlotValueSet) {
        try {
            KsScene.Builder builder = new KsScene.Builder(Long.valueOf(mediationAdSlotValueSet.getADNId()).longValue());
            HashMap hashMap = new HashMap();
            String userId = mediationAdSlotValueSet.getUserId();
            if (userId != null) {
                hashMap.put("thirdUserId", userId);
            }
            Map<String, Object> extraObject = mediationAdSlotValueSet.getExtraObject();
            if (extraObject != null && extraObject.get(MediationConstant.ADN_KS) != null) {
                hashMap.put("extraData", String.valueOf(extraObject.get(MediationConstant.ADN_KS)));
            }
            if (hashMap.size() > 0) {
                builder.rewardCallbackExtraData(hashMap);
            }
            KsScene build = builder.build();
            KsRewardLoader ksRewardLoader = this.f1673a;
            new b(ksRewardLoader, mediationAdSlotValueSet, ksRewardLoader.getGMBridge(), this.f1674b).g(build);
        } catch (Exception unused) {
            this.f1673a.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "代码位不合法");
        }
    }

    public void a(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        boolean g4 = n.g(this.f1673a, mediationAdSlotValueSet);
        this.f1674b = g4;
        if (g4) {
            m.c(new a(mediationAdSlotValueSet, context));
        } else {
            c(mediationAdSlotValueSet);
        }
    }
}
