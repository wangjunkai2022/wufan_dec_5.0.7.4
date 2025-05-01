package com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG;

import android.app.Activity;
import android.content.Context;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.JProtect;
import com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader;
import com.bytedance.sdk.openadsdk.mediation.MediationApiLog;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.qq.e.ads.cfg.VideoOption;
import com.qq.e.ads.interstitial2.UnifiedInterstitialAD;
import com.qq.e.ads.interstitial2.UnifiedInterstitialADListener;
import com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener;
import com.qq.e.ads.rewardvideo.ServerSideVerificationOptions;
import com.qq.e.comm.listeners.ADRewardListener;
import com.qq.e.comm.util.AdError;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class g extends MediationBaseAdBridge {

    /* renamed from: b  reason: collision with root package name */
    private final String f1837b;

    /* renamed from: c  reason: collision with root package name */
    private UnifiedInterstitialAD f1838c;

    /* renamed from: d  reason: collision with root package name */
    private final GdtFullVideoLoader f1839d;

    /* renamed from: e  reason: collision with root package name */
    private final MediationAdSlotValueSet f1840e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1841f;

    /* renamed from: g  reason: collision with root package name */
    UnifiedInterstitialADListener f1842g;

    /* renamed from: h  reason: collision with root package name */
    UnifiedInterstitialMediaListener f1843h;

    /* renamed from: i  reason: collision with root package name */
    ADRewardListener f1844i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1845b;

        a(int i4) {
            this.f1845b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f1838c.sendLossNotification(0, this.f1845b, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f1847b;

        b(Context context) {
            this.f1847b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.k(this.f1847b);
            l.d(getClass().getName(), this.f1847b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements Callable<String> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public String call() {
            return g.this.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f1850b;

        d(Activity activity) {
            this.f1850b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.j(this.f1850b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements Callable<MediationConstant.AdIsReadyStatus> {
        e() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public MediationConstant.AdIsReadyStatus call() {
            return g.this.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.b();
        }
    }

    /* renamed from: com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0042g implements UnifiedInterstitialADListener {
        C0042g() {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        @JProtect
        public void onADClicked() {
            MediationApiLog.i("TMe", "GdtFullVideoLoader onADClicked");
            Bridge bridge = g.this.mGMAd;
            if (bridge != null) {
                bridge.call(1009, null, Void.class);
            }
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        @JProtect
        public void onADClosed() {
            MediationApiLog.i("TMe", "GdtFullVideoLoader onADClosed");
            Bridge bridge = g.this.mGMAd;
            if (bridge != null) {
                bridge.call(1014, null, Void.class);
            }
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        @JProtect
        public void onADExposure() {
            MediationApiLog.i("TMe", "GdtFullVideoLoader onADExposure");
            Bridge bridge = g.this.mGMAd;
            if (bridge != null) {
                bridge.call(1008, null, Void.class);
            }
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onADLeftApplication() {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onADOpened() {
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        @com.bytedance.JProtect
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onADReceive() {
            /*
                r4 = this;
                java.lang.String r0 = "TMe"
                java.lang.String r1 = "GdtFullVideoLoader onADReceive"
                com.bytedance.sdk.openadsdk.mediation.MediationApiLog.i(r0, r1)
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g r1 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.this
                com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader r1 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.h(r1)
                boolean r1 = r1.isClientBidding()
                if (r1 == 0) goto L49
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g r1 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.this
                com.qq.e.ads.interstitial2.UnifiedInterstitialAD r2 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.n(r1)
                int r2 = r2.getECPM()
                r3 = -1
                if (r2 == r3) goto L2c
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g r2 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.this
                com.qq.e.ads.interstitial2.UnifiedInterstitialAD r2 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.n(r2)
                int r2 = r2.getECPM()
                double r2 = (double) r2
                goto L2e
            L2c:
                r2 = 0
            L2e:
                r1.setCpm(r2)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "GdtFullVideoLoader GDT_clientBidding FullVideo 返回的 cpm价格："
                r1.append(r2)
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g r2 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.this
                com.qq.e.ads.interstitial2.UnifiedInterstitialAD r2 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.n(r2)
                int r2 = r2.getECPM()
                r1.append(r2)
                goto L79
            L49:
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g r1 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.this
                com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader r1 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.h(r1)
                boolean r1 = r1.isMultiBidding()
                if (r1 == 0) goto L80
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g r1 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.this
                com.qq.e.ads.interstitial2.UnifiedInterstitialAD r2 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.n(r1)
                java.lang.String r2 = r2.getECPMLevel()
                r1.setLevelTag(r2)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "GdtFullVideoLoader GDT_多阶底价 FullVideo 返回的价格标签："
                r1.append(r2)
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g r2 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.this
                com.qq.e.ads.interstitial2.UnifiedInterstitialAD r2 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.n(r2)
                java.lang.String r2 = r2.getECPMLevel()
                r1.append(r2)
            L79:
                java.lang.String r1 = r1.toString()
                com.bytedance.sdk.openadsdk.mediation.MediationApiLog.i(r0, r1)
            L80:
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g r0 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.this
                com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.n(r0)
                int r0 = r0.getAdPatternType()
                r1 = 2
                if (r0 != r1) goto Lad
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g r0 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.this
                r1 = 5
                r0.setImageMode(r1)
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g r0 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.this
                com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.n(r0)
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g r1 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.this
                com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener r1 = r1.f1843h
                r0.setMediaListener(r1)
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g r0 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.this
                com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.n(r0)
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g r1 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.this
                com.qq.e.comm.listeners.ADRewardListener r1 = r1.f1844i
                r0.setRewardListener(r1)
            Lad:
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g r0 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.this
                com.bytedance.msdk.adapter.gdt.GdtFullVideoLoader r0 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.h(r0)
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g r1 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.this
                com.bykv.vk.openvk.api.proto.Bridge r2 = r1.mGMAd
                r0.notifyAdSuccess(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.g.C0042g.onADReceive():void");
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        @JProtect
        public void onNoAD(AdError adError) {
            MediationApiLog.i("TMe", "GdtFullVideoLoader onNoAD");
            if (adError != null) {
                g.this.f1839d.notifyAdFailed(adError.getErrorCode(), adError.getErrorMsg());
            } else {
                g.this.f1839d.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "暂无广告");
            }
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onRenderFail() {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onRenderSuccess() {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        @JProtect
        public void onVideoCached() {
            MediationApiLog.i("TMe", "GdtFullVideoLoader onVideoCached");
            g.this.f1839d.notifyAdCache(g.this.mGMAd, -1, "");
        }
    }

    /* loaded from: classes.dex */
    class h implements UnifiedInterstitialMediaListener {
        h() {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
        @JProtect
        public void onVideoComplete() {
            MediationApiLog.i("TMe", "GdtFullVideoLoader onVideoComplete");
            Bridge bridge = g.this.mGMAd;
            if (bridge != null) {
                bridge.call(1026, null, Void.class);
            }
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
        @JProtect
        public void onVideoError(AdError adError) {
            MediationApiLog.i("TMe", "GdtFullVideoLoader onVideoError");
            if (g.this.mGMAd == null || adError == null) {
                return;
            }
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8015, adError.getErrorMsg());
            create.add(8014, adError.getErrorCode());
            g.this.mGMAd.call(1021, create.build(), Void.class);
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
        public void onVideoInit() {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
        public void onVideoLoading() {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
        public void onVideoPageClose() {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
        public void onVideoPageOpen() {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
        public void onVideoPause() {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
        public void onVideoReady(long j4) {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener
        public void onVideoStart() {
        }
    }

    /* loaded from: classes2.dex */
    class i implements ADRewardListener {
        i() {
        }

        @Override // com.qq.e.comm.listeners.ADRewardListener
        public void onReward(Map<String, Object> map) {
            MediationApiLog.i("TMe", "GdtFullVideoLoader onRewardVerify");
            if (g.this.mGMAd != null) {
                MediationValueSetBuilder create = MediationValueSetBuilder.create();
                create.add(8017, true);
                create.add(8018, g.this.getRewardAmount());
                create.add(8019, g.this.getRewardName());
                g.this.mGMAd.call(1018, create.build(), Void.class);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f1838c.sendWinNotification((int) g.this.getCpm());
        }
    }

    public g(MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge, GdtFullVideoLoader gdtFullVideoLoader) {
        super(mediationAdSlotValueSet, bridge);
        this.f1837b = "TMe";
        this.f1842g = new C0042g();
        this.f1843h = new h();
        this.f1844i = new i();
        this.f1839d = gdtFullVideoLoader;
        this.f1840e = mediationAdSlotValueSet;
        this.f1841f = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a.e(gdtFullVideoLoader, mediationAdSlotValueSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JProtect
    public void j(Activity activity) {
        UnifiedInterstitialAD unifiedInterstitialAD = this.f1838c;
        if (unifiedInterstitialAD != null) {
            unifiedInterstitialAD.showFullScreenAD(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JProtect
    public void k(Context context) {
        UnifiedInterstitialAD unifiedInterstitialAD;
        VideoOption build;
        String str;
        if (context instanceof Activity) {
            this.f1838c = new UnifiedInterstitialAD((Activity) context, this.f1839d.getAdnId(), this.f1842g);
            if (getGdtVideoOption() instanceof VideoOption) {
                unifiedInterstitialAD = this.f1838c;
                build = (VideoOption) getGdtVideoOption();
            } else {
                unifiedInterstitialAD = this.f1838c;
                build = new VideoOption.Builder().build();
            }
            unifiedInterstitialAD.setVideoOption(build);
            if (this.f1840e.getGdtMinVideoDuration() > 0) {
                this.f1838c.setMaxVideoDuration(this.f1840e.getGdtMinVideoDuration());
            }
            if (this.f1840e.getGdtMaxVideoDuration() > 0) {
                this.f1838c.setMinVideoDuration(this.f1840e.getGdtMaxVideoDuration());
            }
            ServerSideVerificationOptions.Builder builder = new ServerSideVerificationOptions.Builder();
            String userID = getUserID();
            if (userID != null) {
                builder.setUserId(userID);
            }
            Map<String, Object> customData = getCustomData();
            if (customData != null && (customData.get(MediationConstant.ADN_GDT) instanceof String) && (str = (String) customData.get(MediationConstant.ADN_GDT)) != null) {
                builder.setCustomData(str);
            }
            if (userID != null || customData != null) {
                this.f1838c.setServerSideVerificationOptions(builder.build());
            }
            this.f1838c.loadFullScreenAD();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediationConstant.AdIsReadyStatus m() {
        UnifiedInterstitialAD unifiedInterstitialAD = this.f1838c;
        return (unifiedInterstitialAD == null || !unifiedInterstitialAD.isValid()) ? MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY : MediationConstant.AdIsReadyStatus.AD_IS_READY;
    }

    private void o(Activity activity) {
        l.e(new d(activity));
    }

    private void p(Context context) {
        l.c(new b(context));
    }

    private MediationConstant.AdIsReadyStatus q() {
        try {
            MediationConstant.AdIsReadyStatus adIsReadyStatus = (MediationConstant.AdIsReadyStatus) l.a(new e()).get(500L, TimeUnit.MILLISECONDS);
            return adIsReadyStatus != null ? adIsReadyStatus : MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY;
        } catch (Exception e5) {
            e5.printStackTrace();
            return MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY;
        }
    }

    private String s() {
        return this.f1841f ? t() : u();
    }

    private String t() {
        try {
            return (String) l.a(new c()).get(500L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String u() {
        Object obj;
        try {
            UnifiedInterstitialAD unifiedInterstitialAD = this.f1838c;
            if (unifiedInterstitialAD == null || (obj = unifiedInterstitialAD.getExtraInfo().get("request_id")) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public void b() {
        UnifiedInterstitialAD unifiedInterstitialAD = this.f1838c;
        if (unifiedInterstitialAD != null) {
            unifiedInterstitialAD.destroy();
            this.f1838c = null;
        }
    }

    public void c(Activity activity) {
        if (this.f1841f) {
            o(activity);
        } else {
            j(activity);
        }
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (i4 == 8211) {
            MediationApiLog.i("TMe", "GdtFullVideoLoader METHOD_ADN_HAS_AD_VIDEO_CACHED_API");
            return (T) Boolean.TRUE;
        }
        if (i4 == 8142) {
            MediationApiLog.i("TMe", "GdtFullVideoLoader bidWinNotify");
            Map<String, Object> map = (Map) valueSet.objectValue(8006, Map.class);
            if (map != null) {
                g(map);
            }
        } else if (i4 == 8144) {
            MediationApiLog.i("TMe", "GdtFullVideoLoader bidLoseNotify");
            Map<String, Object> map2 = (Map) valueSet.objectValue(8006, Map.class);
            if (map2 != null) {
                l(map2);
            }
        } else if (i4 == 8113) {
            MediationApiLog.i("TMe", "GdtFullVideoLoader showAd");
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
        }
        return (T) MediationValueUtil.checkClassType(cls);
    }

    public void d(Context context) {
        if (this.f1841f) {
            p(context);
        } else {
            k(context);
        }
    }

    public void g(Map<String, Object> map) {
        UnifiedInterstitialAD unifiedInterstitialAD;
        if (this.f1839d.isClientBidding() && (unifiedInterstitialAD = this.f1838c) != null) {
            try {
                if (this.f1841f) {
                    l.c(new j());
                } else {
                    unifiedInterstitialAD.sendWinNotification((int) getCpm());
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
    public boolean hasDestroyed() {
        return this.f1838c == null;
    }

    public void i() {
        l.e(new f());
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
    public MediationConstant.AdIsReadyStatus isReadyStatus() {
        return this.f1841f ? q() : m();
    }

    public void l(Map<String, Object> map) {
        if (!this.f1839d.isClientBidding() || this.f1838c == null || map == null) {
            return;
        }
        try {
            Object obj = map.get(MediationConstant.BIDDING_LOSE_REASON);
            if (obj instanceof MediationConstant.BiddingLossReason) {
                int a5 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a.a((MediationConstant.BiddingLossReason) obj);
                if (this.f1841f) {
                    l.c(new a(a5));
                } else {
                    this.f1838c.sendLossNotification(0, a5, null);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
    public void onDestroy() {
        if (this.f1841f) {
            i();
        } else {
            b();
        }
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return null;
    }
}
