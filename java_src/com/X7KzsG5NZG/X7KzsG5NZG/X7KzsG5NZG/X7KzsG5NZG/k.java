package com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.JProtect;
import com.bytedance.msdk.adapter.gdt.GdtSplashLoader;
import com.bytedance.sdk.openadsdk.mediation.MediationApiLog;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.qq.e.ads.splash.SplashAD;
import com.qq.e.ads.splash.SplashADZoomOutListener;
import com.qq.e.comm.managers.setting.GlobalSetting;
import com.qq.e.comm.util.AdError;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class k extends MediationBaseAdBridge {

    /* renamed from: b  reason: collision with root package name */
    private SplashAD f1901b;

    /* renamed from: c  reason: collision with root package name */
    private final GdtSplashLoader f1902c;

    /* renamed from: d  reason: collision with root package name */
    private int f1903d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f1904e;

    /* renamed from: f  reason: collision with root package name */
    SplashADZoomOutListener f1905f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f1906b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f1907c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f1908d;

        a(Context context, int i4, boolean z4) {
            this.f1906b = context;
            this.f1907c = i4;
            this.f1908d = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.j(this.f1906b, this.f1907c, this.f1908d);
            l.d(getClass().getName(), this.f1906b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f1910b;

        b(ViewGroup viewGroup) {
            this.f1910b = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.k(this.f1910b);
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
            return k.this.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements Callable<Bitmap> {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Bitmap call() {
            return k.this.q();
        }
    }

    /* loaded from: classes.dex */
    class e implements SplashADZoomOutListener {

        /* renamed from: b  reason: collision with root package name */
        public long f1914b;

        e() {
        }

        @Override // com.qq.e.ads.splash.SplashADZoomOutListener
        public boolean isSupportZoomOut() {
            MediationApiLog.i("TMe", "GdtSplashLoader isSupportZoomOut");
            return true;
        }

        @Override // com.qq.e.ads.splash.SplashADListener
        @JProtect
        public void onADClicked() {
            MediationApiLog.i("TMe", "GdtSplashLoader onADClicked");
            Bridge bridge = k.this.mGMAd;
            if (bridge != null) {
                bridge.call(1009, null, Void.class);
            }
        }

        @Override // com.qq.e.ads.splash.SplashADListener
        public void onADDismissed() {
            MediationApiLog.i("TMe", "GdtSplashLoader onADDismissed");
            Bridge bridge = k.this.mGMAd;
            if (bridge != null) {
                bridge.call(1011, null, Void.class);
            }
        }

        @Override // com.qq.e.ads.splash.SplashADListener
        @JProtect
        public void onADExposure() {
            MediationApiLog.i("TMe", "GdtSplashLoader onADExposure");
            Bridge bridge = k.this.mGMAd;
            if (bridge != null) {
                bridge.call(1008, null, Void.class);
            }
        }

        @Override // com.qq.e.ads.splash.SplashADListener
        @JProtect
        public void onADLoaded(long j4) {
            StringBuilder sb;
            MediationApiLog.i("TMe", "GdtSplashLoader onADLoaded");
            long elapsedRealtime = j4 - SystemClock.elapsedRealtime();
            if (k.this.f1901b == null || elapsedRealtime <= 1000) {
                k.this.f1902c.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "暂无广告");
                return;
            }
            if (!k.this.f1902c.isClientBidding()) {
                if (k.this.f1902c.isMultiBidding()) {
                    k kVar = k.this;
                    kVar.setLevelTag(kVar.f1901b.getECPMLevel());
                    sb = new StringBuilder();
                    sb.append("GdtSplashLoader GDT_多阶底价 splash 返回的 价格标签：");
                    sb.append(k.this.f1901b.getECPMLevel());
                }
                GdtSplashLoader gdtSplashLoader = k.this.f1902c;
                k kVar2 = k.this;
                gdtSplashLoader.notifyAdSuccess(kVar2, kVar2.mGMAd);
            }
            k kVar3 = k.this;
            kVar3.setCpm(kVar3.f1901b.getECPM() != -1 ? k.this.f1901b.getECPM() : 0.0d);
            sb = new StringBuilder();
            sb.append("GdtSplashLoader GDT_clientBidding splash 返回的 cpm价格：");
            sb.append(k.this.f1901b.getECPM());
            MediationApiLog.i("TMe", sb.toString());
            GdtSplashLoader gdtSplashLoader2 = k.this.f1902c;
            k kVar22 = k.this;
            gdtSplashLoader2.notifyAdSuccess(kVar22, kVar22.mGMAd);
        }

        @Override // com.qq.e.ads.splash.SplashADListener
        public void onADPresent() {
        }

        @Override // com.qq.e.ads.splash.SplashADListener
        public void onADTick(long j4) {
            MediationApiLog.i("TMe", "GdtSplashLoader onADTick");
            this.f1914b = j4;
        }

        @Override // com.qq.e.ads.splash.SplashADListener
        @JProtect
        public void onNoAD(AdError adError) {
            if (adError == null) {
                MediationApiLog.i("TMe", "GdtSplashLoader onNoAD ");
                k.this.f1902c.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "暂无广告");
                return;
            }
            MediationApiLog.i("TMe", "GdtSplashLoader onNoAD err_code:" + adError.getErrorCode() + "  msg:" + adError.getErrorMsg());
            if (adError.getErrorCode() != 4004 && adError.getErrorCode() != 4005) {
                k.this.f1902c.notifyAdFailed(adError.getErrorCode(), adError.getErrorMsg());
                return;
            }
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8014, adError.getErrorCode());
            create.add(8015, adError.getErrorMsg());
            k.this.mGMAd.call(1017, create.build(), Void.class);
        }

        @Override // com.qq.e.ads.splash.SplashADZoomOutListener
        public void onZoomOut() {
            MediationApiLog.i("TMe", "GdtSplashLoader onZoomOut");
            Bridge bridge = k.this.mGMAd;
            if (bridge != null) {
                bridge.call(1051, null, Void.class);
            }
        }

        @Override // com.qq.e.ads.splash.SplashADZoomOutListener
        public void onZoomOutPlayFinish() {
            MediationApiLog.i("TMe", "GdtSplashLoader onZoomOutPlayFinish");
            Bridge bridge = k.this.mGMAd;
            if (bridge != null) {
                bridge.call(1052, null, Void.class);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.f1901b.sendWinNotification((int) k.this.getCpm());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1917b;

        g(int i4) {
            this.f1917b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.f1901b.sendLossNotification(0, this.f1917b, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class h implements Callable<String> {
        h() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public String call() {
            return k.this.w();
        }
    }

    /* loaded from: classes2.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.n();
        }
    }

    public k(MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge, Context context, GdtSplashLoader gdtSplashLoader) {
        super(mediationAdSlotValueSet, bridge);
        this.f1903d = 2;
        this.f1905f = new e();
        this.f1902c = gdtSplashLoader;
        this.f1904e = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a.e(gdtSplashLoader, mediationAdSlotValueSet);
        int originType = mediationAdSlotValueSet.getOriginType();
        this.f1903d = originType;
        if (originType == 0 || originType == 1 || originType == 2) {
            return;
        }
        this.f1903d = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JProtect
    public void j(Context context, int i4, boolean z4) {
        if (context instanceof Activity) {
            if (!this.f1902c.getSplashShakeButton()) {
                HashMap hashMap = new HashMap();
                hashMap.put("shakable", "0");
                GlobalSetting.setExtraUserData(hashMap);
            }
            if (i4 < 0) {
                i4 = 3000;
            } else if (i4 > 5000) {
                i4 = 5000;
            }
            SplashAD splashAD = new SplashAD(context, this.f1902c.getAdnId(), this.f1905f, i4);
            this.f1901b = splashAD;
            if (z4) {
                splashAD.preLoad();
            }
            int i5 = this.f1903d;
            if (i5 == 2) {
                this.f1901b.fetchAdOnly();
            } else if (i5 == 0 || i5 == 1) {
                this.f1901b.fetchFullScreenAdOnly();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(ViewGroup viewGroup) {
        if (this.f1901b == null || viewGroup == null) {
            return;
        }
        viewGroup.removeAllViews();
        Context context = viewGroup.getContext();
        if (context instanceof Activity) {
            ViewGroup viewGroup2 = (ViewGroup) ((Activity) context).findViewById(16908290);
            if (viewGroup.getParent() == null) {
                if (viewGroup2 != null) {
                    viewGroup.setAlpha(0.0f);
                    viewGroup2.addView(viewGroup);
                }
                r(viewGroup);
                if (viewGroup2 != null) {
                    viewGroup2.removeView(viewGroup);
                    viewGroup.setAlpha(1.0f);
                    return;
                }
                return;
            }
        }
        r(viewGroup);
    }

    private void o(Context context, int i4, boolean z4) {
        l.c(new a(context, i4, z4));
    }

    private void p(ViewGroup viewGroup) {
        l.e(new b(viewGroup));
    }

    private void r(ViewGroup viewGroup) {
        int i4 = this.f1903d;
        if (i4 == 2) {
            this.f1901b.showAd(viewGroup);
        } else if (i4 == 0 || i4 == 1) {
            this.f1901b.showFullScreenAd(viewGroup);
        }
    }

    private String u() {
        return this.f1904e ? v() : w();
    }

    private String v() {
        try {
            return (String) l.a(new h()).get(500L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String w() {
        Object obj;
        try {
            SplashAD splashAD = this.f1901b;
            if (splashAD == null || (obj = splashAD.getExtraInfo().get("request_id")) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public MediationConstant.AdIsReadyStatus b() {
        SplashAD splashAD = this.f1901b;
        return (splashAD == null || !splashAD.isValid() || this.f1902c.hasNotifyFail()) ? MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY : MediationConstant.AdIsReadyStatus.AD_IS_READY;
    }

    public void c(Context context, int i4, boolean z4) {
        if (this.f1904e) {
            o(context, i4, z4);
        } else {
            j(context, i4, z4);
        }
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (i4 == 6162) {
            MediationApiLog.i("TMe", "GdtSplashLoader splashMinWindowAnimationFinish");
            if (this.f1904e) {
                l.e(new i());
            } else {
                n();
            }
        } else if (i4 == 6163) {
            MediationApiLog.i("TMe", "GdtSplashLoader getSplashBitMap");
            return (T) t();
        } else if (i4 == 8142) {
            MediationApiLog.i("TMe", "GdtSplashLoader bidWinNotify");
            Map<String, Object> map = (Map) valueSet.objectValue(8006, Map.class);
            if (map != null) {
                g(map);
            }
        } else if (i4 == 8144) {
            MediationApiLog.i("TMe", "GdtSplashLoader bidLoseNotify");
            Map<String, Object> map2 = (Map) valueSet.objectValue(8006, Map.class);
            if (map2 != null) {
                l(map2);
            }
        } else if (i4 == 6152) {
            MediationApiLog.i("TMe", "GdtSplashLoader showSplashAd");
            ViewGroup viewGroup = (ViewGroup) valueSet.objectValue(20060, ViewGroup.class);
            if (viewGroup != null) {
                d(viewGroup);
            }
        } else if (i4 != 6154 && i4 != 6153 && i4 != 6161) {
            if (i4 == 8109) {
                onDestroy();
            } else if (i4 == 8120) {
                return (T) Boolean.valueOf(hasDestroyed());
            } else {
                if (i4 == 8121) {
                    return (T) isReadyStatus();
                }
                if (i4 == 8147) {
                    return (T) u();
                }
            }
        }
        return (T) MediationValueUtil.checkClassType(cls);
    }

    public void d(ViewGroup viewGroup) {
        if (this.f1904e) {
            p(viewGroup);
        } else {
            k(viewGroup);
        }
    }

    public void g(Map<String, Object> map) {
        SplashAD splashAD;
        if (this.f1902c.isClientBidding() && (splashAD = this.f1901b) != null) {
            try {
                if (this.f1904e) {
                    l.c(new f());
                } else {
                    splashAD.sendWinNotification((int) getCpm());
                }
            } catch (Exception unused) {
            }
        }
    }

    public MediationConstant.AdIsReadyStatus h() {
        try {
            MediationConstant.AdIsReadyStatus adIsReadyStatus = (MediationConstant.AdIsReadyStatus) l.a(new c()).get(500L, TimeUnit.MILLISECONDS);
            return adIsReadyStatus != null ? adIsReadyStatus : MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY;
        } catch (Exception e5) {
            e5.printStackTrace();
            return MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
    public boolean hasDestroyed() {
        return this.f1901b == null;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
    public MediationConstant.AdIsReadyStatus isReadyStatus() {
        return this.f1904e ? h() : b();
    }

    public void l(Map<String, Object> map) {
        if (!this.f1902c.isClientBidding() || this.f1901b == null || map == null) {
            return;
        }
        try {
            Object obj = map.get(MediationConstant.BIDDING_LOSE_REASON);
            if (obj instanceof MediationConstant.BiddingLossReason) {
                int a5 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a.a((MediationConstant.BiddingLossReason) obj);
                if (this.f1904e) {
                    l.c(new g(a5));
                } else {
                    this.f1901b.sendLossNotification(0, a5, null);
                }
            }
        } catch (Exception unused) {
        }
    }

    public void n() {
        SplashAD splashAD = this.f1901b;
        if (splashAD != null) {
            splashAD.zoomOutAnimationFinish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
    public void onDestroy() {
        this.f1901b = null;
        this.f1905f = null;
    }

    public Bitmap q() {
        SplashAD splashAD = this.f1901b;
        if (splashAD != null) {
            splashAD.getZoomOutBitmap();
            return null;
        }
        return null;
    }

    public Bitmap s() {
        try {
            Bitmap bitmap = (Bitmap) l.a(new d()).get(500L, TimeUnit.MILLISECONDS);
            if (bitmap != null) {
                return bitmap;
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public Bitmap t() {
        return this.f1904e ? s() : q();
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return null;
    }
}
