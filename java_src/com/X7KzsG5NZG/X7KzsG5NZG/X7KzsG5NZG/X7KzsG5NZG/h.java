package com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG;

import android.app.Activity;
import android.content.Context;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.JProtect;
import com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader;
import com.bytedance.sdk.openadsdk.mediation.MediationApiLog;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.qq.e.ads.cfg.VideoOption;
import com.qq.e.ads.interstitial2.UnifiedInterstitialAD;
import com.qq.e.ads.interstitial2.UnifiedInterstitialADListener;
import com.qq.e.comm.util.AdError;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class h extends MediationBaseAdBridge {

    /* renamed from: b  reason: collision with root package name */
    private UnifiedInterstitialAD f1858b;

    /* renamed from: c  reason: collision with root package name */
    private final MediationAdSlotValueSet f1859c;

    /* renamed from: d  reason: collision with root package name */
    private final GdtInterstitialLoader f1860d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1861e;

    /* renamed from: f  reason: collision with root package name */
    UnifiedInterstitialADListener f1862f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f1863b;

        a(Context context) {
            this.f1863b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.j(this.f1863b);
            l.d(getClass().getName(), this.f1863b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f1865b;

        b(Activity activity) {
            this.f1865b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.c(this.f1865b);
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
            return h.this.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.h();
        }
    }

    /* loaded from: classes.dex */
    class e implements UnifiedInterstitialADListener {
        e() {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        @JProtect
        public void onADClicked() {
            MediationApiLog.i("TMe", "GdtInterstitialLoader onADClicked");
            Bridge bridge = h.this.mGMAd;
            if (bridge != null) {
                bridge.call(1009, null, Void.class);
            }
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        @JProtect
        public void onADClosed() {
            MediationApiLog.i("TMe", "GdtInterstitialLoader onADClosed");
            Bridge bridge = h.this.mGMAd;
            if (bridge != null) {
                bridge.call(1014, null, Void.class);
            }
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        @JProtect
        public void onADExposure() {
            MediationApiLog.i("TMe", "GdtInterstitialLoader onADExposure");
            Bridge bridge = h.this.mGMAd;
            if (bridge != null) {
                bridge.call(1008, null, Void.class);
            }
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        @JProtect
        public void onADLeftApplication() {
            MediationApiLog.i("TMe", "GdtInterstitialLoader onADLeftApplication");
            Bridge bridge = h.this.mGMAd;
            if (bridge != null) {
                bridge.call(1016, null, Void.class);
            }
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        @JProtect
        public void onADOpened() {
            MediationApiLog.i("TMe", "GdtInterstitialLoader onADOpened");
            Bridge bridge = h.this.mGMAd;
            if (bridge != null) {
                bridge.call(1015, null, Void.class);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
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
                java.lang.String r1 = "GdtInterstitialLoader onADReceive"
                com.bytedance.sdk.openadsdk.mediation.MediationApiLog.i(r0, r1)
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h r1 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h.this
                com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader r1 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h.a(r1)
                boolean r1 = r1.isClientBidding()
                if (r1 == 0) goto L49
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h r1 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h.this
                com.qq.e.ads.interstitial2.UnifiedInterstitialAD r2 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h.g(r1)
                int r2 = r2.getECPM()
                r3 = -1
                if (r2 == r3) goto L2c
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h r2 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h.this
                com.qq.e.ads.interstitial2.UnifiedInterstitialAD r2 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h.g(r2)
                int r2 = r2.getECPM()
                double r2 = (double) r2
                goto L2e
            L2c:
                r2 = 0
            L2e:
                r1.setCpm(r2)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "GdtInterstitialLoader GDT_clientBidding 插屏 返回的 cpm价格："
                r1.append(r2)
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h r2 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h.this
                com.qq.e.ads.interstitial2.UnifiedInterstitialAD r2 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h.g(r2)
                int r2 = r2.getECPM()
                r1.append(r2)
                goto L79
            L49:
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h r1 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h.this
                com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader r1 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h.a(r1)
                boolean r1 = r1.isMultiBidding()
                if (r1 == 0) goto L80
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h r1 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h.this
                com.qq.e.ads.interstitial2.UnifiedInterstitialAD r2 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h.g(r1)
                java.lang.String r2 = r2.getECPMLevel()
                r1.setLevelTag(r2)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "GdtInterstitialLoader GDT_多阶底价 插屏 返回的价格标签："
                r1.append(r2)
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h r2 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h.this
                com.qq.e.ads.interstitial2.UnifiedInterstitialAD r2 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h.g(r2)
                java.lang.String r2 = r2.getECPMLevel()
                r1.append(r2)
            L79:
                java.lang.String r1 = r1.toString()
                com.bytedance.sdk.openadsdk.mediation.MediationApiLog.i(r0, r1)
            L80:
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h r0 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h.this
                com.qq.e.ads.interstitial2.UnifiedInterstitialAD r0 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h.g(r0)
                int r0 = r0.getAdPatternType()
                r1 = 2
                if (r0 != r1) goto L91
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h r0 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h.this
                r1 = 5
                goto L94
            L91:
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h r0 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h.this
                r1 = 3
            L94:
                r0.setImageMode(r1)
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h r0 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h.this
                com.bytedance.msdk.adapter.gdt.GdtInterstitialLoader r0 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h.a(r0)
                com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h r1 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h.this
                com.bykv.vk.openvk.api.proto.Bridge r2 = r1.mGMAd
                r0.notifyAdSuccess(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h.e.onADReceive():void");
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        @JProtect
        public void onNoAD(AdError adError) {
            MediationApiLog.i("TMe", "GdtInterstitialLoader onNoAD");
            if (adError != null) {
                h.this.f1860d.notifyAdFailed(adError.getErrorCode(), adError.getErrorMsg());
            } else {
                h.this.f1860d.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "暂无广告");
            }
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onRenderFail() {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onRenderSuccess() {
        }

        @Override // com.qq.e.ads.interstitial2.UnifiedInterstitialADListener
        public void onVideoCached() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f1858b.sendWinNotification((int) h.this.getCpm());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1871b;

        g(int i4) {
            this.f1871b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f1858b.sendLossNotification(0, this.f1871b, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h$h  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class CallableC0043h implements Callable<String> {
        CallableC0043h() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public String call() {
            return h.this.s();
        }
    }

    public h(MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge, GdtInterstitialLoader gdtInterstitialLoader) {
        super(mediationAdSlotValueSet, bridge);
        this.f1862f = new e();
        this.f1859c = mediationAdSlotValueSet;
        this.f1860d = gdtInterstitialLoader;
        this.f1861e = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a.e(gdtInterstitialLoader, mediationAdSlotValueSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JProtect
    public void j(Context context) {
        UnifiedInterstitialAD unifiedInterstitialAD;
        VideoOption build;
        MediationApiLog.i("TMe", "GdtInterstitialLoader loadAd adnId:" + this.f1860d.getAdnId());
        if (!(context instanceof Activity)) {
            MediationApiLog.i("TMe", "GdtInterstitialLoader 传入mContext 不是 Activity 请求中断");
            return;
        }
        this.f1858b = new UnifiedInterstitialAD((Activity) context, this.f1860d.getAdnId(), this.f1862f);
        if (getGdtVideoOption() instanceof VideoOption) {
            unifiedInterstitialAD = this.f1858b;
            build = (VideoOption) getGdtVideoOption();
        } else {
            unifiedInterstitialAD = this.f1858b;
            build = new VideoOption.Builder().build();
        }
        unifiedInterstitialAD.setVideoOption(build);
        if (this.f1859c.getGdtMaxVideoDuration() > 0) {
            this.f1858b.setMaxVideoDuration(this.f1859c.getGdtMaxVideoDuration());
        }
        if (this.f1859c.getGdtMinVideoDuration() > 0) {
            this.f1858b.setMinVideoDuration(this.f1859c.getGdtMinVideoDuration());
        }
        this.f1858b.loadAD();
    }

    private void n(Activity activity) {
        l.e(new b(activity));
    }

    private void o(Context context) {
        l.c(new a(context));
    }

    private MediationConstant.AdIsReadyStatus p() {
        try {
            MediationConstant.AdIsReadyStatus adIsReadyStatus = (MediationConstant.AdIsReadyStatus) l.a(new c()).get(500L, TimeUnit.MILLISECONDS);
            return adIsReadyStatus != null ? adIsReadyStatus : MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY;
        } catch (Exception e5) {
            e5.printStackTrace();
            return MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY;
        }
    }

    private String q() {
        return this.f1861e ? r() : s();
    }

    private String r() {
        try {
            return (String) l.a(new CallableC0043h()).get(500L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String s() {
        Object obj;
        try {
            UnifiedInterstitialAD unifiedInterstitialAD = this.f1858b;
            if (unifiedInterstitialAD == null || (obj = unifiedInterstitialAD.getExtraInfo().get("request_id")) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public MediationConstant.AdIsReadyStatus b() {
        UnifiedInterstitialAD unifiedInterstitialAD = this.f1858b;
        return (unifiedInterstitialAD == null || !unifiedInterstitialAD.isValid()) ? MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY : MediationConstant.AdIsReadyStatus.AD_IS_READY;
    }

    @JProtect
    public void c(Activity activity) {
        if (this.f1858b == null || activity == null || activity.isFinishing()) {
            return;
        }
        this.f1858b.show(activity);
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (i4 == 8142) {
            MediationApiLog.i("TMe", "GdtInterstitialLoader bidWinNotify");
            Map<String, Object> map = (Map) valueSet.objectValue(8006, Map.class);
            if (map != null) {
                f(map);
            }
        } else if (i4 == 8144) {
            MediationApiLog.i("TMe", "GdtInterstitialLoader bidLoseNotify");
            Map<String, Object> map2 = (Map) valueSet.objectValue(8006, Map.class);
            if (map2 != null) {
                k(map2);
            }
        } else if (i4 == 8113) {
            MediationApiLog.i("TMe", "GdtInterstitialLoader showAd");
            Activity activity = (Activity) valueSet.objectValue(20033, Activity.class);
            if (activity != null) {
                i(activity);
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
                return (T) q();
            }
        }
        return (T) MediationValueUtil.checkClassType(cls);
    }

    public void d(Context context) {
        if (this.f1861e) {
            o(context);
        } else {
            j(context);
        }
    }

    public void f(Map<String, Object> map) {
        UnifiedInterstitialAD unifiedInterstitialAD;
        if (this.f1860d.isClientBidding() && (unifiedInterstitialAD = this.f1858b) != null) {
            try {
                if (this.f1861e) {
                    l.c(new f());
                } else {
                    unifiedInterstitialAD.sendWinNotification((int) getCpm());
                }
            } catch (Exception unused) {
            }
        }
    }

    public void h() {
        UnifiedInterstitialAD unifiedInterstitialAD = this.f1858b;
        if (unifiedInterstitialAD != null) {
            unifiedInterstitialAD.destroy();
            this.f1858b = null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
    public boolean hasDestroyed() {
        return this.f1858b == null;
    }

    public void i(Activity activity) {
        if (this.f1861e) {
            n(activity);
        } else {
            c(activity);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
    public MediationConstant.AdIsReadyStatus isReadyStatus() {
        return this.f1861e ? p() : b();
    }

    public void k(Map<String, Object> map) {
        if (!this.f1860d.isClientBidding() || this.f1858b == null || map == null) {
            return;
        }
        try {
            Object obj = map.get(MediationConstant.BIDDING_LOSE_REASON);
            if (obj instanceof MediationConstant.BiddingLossReason) {
                int a5 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a.a((MediationConstant.BiddingLossReason) obj);
                if (this.f1861e) {
                    l.c(new g(a5));
                } else {
                    this.f1858b.sendLossNotification(0, a5, null);
                }
            }
        } catch (Exception unused) {
        }
    }

    public void m() {
        l.e(new d());
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
    public void onDestroy() {
        if (this.f1861e) {
            m();
        } else {
            h();
        }
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return null;
    }
}
