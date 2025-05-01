package com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.JProtect;
import com.bytedance.msdk.adapter.gdt.GdtBannerLoader;
import com.bytedance.msdk.adapter.gdt.R;
import com.bytedance.sdk.openadsdk.mediation.MediationApiLog;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.qq.e.ads.banner2.UnifiedBannerADListener;
import com.qq.e.ads.banner2.UnifiedBannerView;
import com.qq.e.ads.cfg.VideoOption;
import com.qq.e.ads.nativ.ADSize;
import com.qq.e.ads.nativ.MediaView;
import com.qq.e.ads.nativ.NativeADEventListener;
import com.qq.e.ads.nativ.NativeADMediaListener;
import com.qq.e.ads.nativ.NativeADUnifiedListener;
import com.qq.e.ads.nativ.NativeExpressAD;
import com.qq.e.ads.nativ.NativeExpressADView;
import com.qq.e.ads.nativ.NativeExpressMediaListener;
import com.qq.e.ads.nativ.NativeUnifiedAD;
import com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo;
import com.qq.e.ads.nativ.NativeUnifiedADData;
import com.qq.e.ads.nativ.widget.NativeAdContainer;
import com.qq.e.comm.pi.AdData;
import com.qq.e.comm.util.AdError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private MediationAdSlotValueSet f1773a;

    /* renamed from: b  reason: collision with root package name */
    private Bridge f1774b;

    /* renamed from: c  reason: collision with root package name */
    private FrameLayout.LayoutParams f1775c;

    /* renamed from: d  reason: collision with root package name */
    private final GdtBannerLoader f1776d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1777e;

    /* renamed from: f  reason: collision with root package name */
    private final NativeExpressAD.NativeExpressADListener f1778f = new b();

    /* renamed from: g  reason: collision with root package name */
    private final NativeADUnifiedListener f1779g = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MediationAdSlotValueSet f1780b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f1781c;

        a(MediationAdSlotValueSet mediationAdSlotValueSet, Context context) {
            this.f1780b = mediationAdSlotValueSet;
            this.f1781c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.f(this.f1780b, this.f1781c);
            l.d(getClass().getName(), this.f1781c);
        }
    }

    /* loaded from: classes2.dex */
    class b implements NativeExpressAD.NativeExpressADListener {

        /* renamed from: a  reason: collision with root package name */
        f f1783a;

        b() {
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onADClicked(NativeExpressADView nativeExpressADView) {
            f fVar = this.f1783a;
            if (fVar != null) {
                fVar.j();
            }
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onADClosed(NativeExpressADView nativeExpressADView) {
            f fVar = this.f1783a;
            if (fVar != null) {
                fVar.g();
            }
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onADExposure(NativeExpressADView nativeExpressADView) {
            f fVar = this.f1783a;
            if (fVar != null) {
                fVar.k();
            }
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onADLeftApplication(NativeExpressADView nativeExpressADView) {
            f fVar = this.f1783a;
            if (fVar != null) {
                fVar.d();
            }
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onADLoaded(List<NativeExpressADView> list) {
            if (list == null || list.size() == 0) {
                e.this.f1776d.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "load list is null or empty");
                return;
            }
            for (NativeExpressADView nativeExpressADView : list) {
                if (nativeExpressADView != null) {
                    e eVar = e.this;
                    f fVar = new f(nativeExpressADView, eVar.f1773a, e.this.f1774b);
                    this.f1783a = fVar;
                    fVar.l();
                    return;
                }
            }
        }

        @Override // com.qq.e.ads.NativeAbstractAD.BasicADListener
        public void onNoAD(AdError adError) {
            if (adError != null) {
                e.this.f1776d.notifyAdFailed(adError.getErrorCode(), adError.getErrorMsg());
            } else {
                e.this.f1776d.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "error is null");
            }
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onRenderFail(NativeExpressADView nativeExpressADView) {
            e.this.f1776d.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "render fail");
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onRenderSuccess(NativeExpressADView nativeExpressADView) {
            e.this.f1776d.notifyAdSuccess(this.f1783a, e.this.f1774b);
        }
    }

    /* loaded from: classes2.dex */
    class c implements NativeADUnifiedListener {
        c() {
        }

        @Override // com.qq.e.ads.nativ.NativeADUnifiedListener
        public void onADLoaded(List<NativeUnifiedADData> list) {
            if (list == null || list.size() <= 0) {
                e.this.f1776d.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "load list is empty");
                return;
            }
            for (NativeUnifiedADData nativeUnifiedADData : list) {
                if (nativeUnifiedADData != null) {
                    GdtBannerLoader gdtBannerLoader = e.this.f1776d;
                    e eVar = e.this;
                    gdtBannerLoader.notifyAdSuccess(new C0038e(nativeUnifiedADData, eVar.f1773a, e.this.f1774b), e.this.f1774b);
                    return;
                }
            }
        }

        @Override // com.qq.e.ads.NativeAbstractAD.BasicADListener
        public void onNoAD(AdError adError) {
            if (adError != null) {
                e.this.f1776d.notifyAdFailed(adError.getErrorCode(), adError.getErrorMsg());
            } else {
                e.this.f1776d.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "error is null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d extends MediationBaseAdBridge {

        /* renamed from: b  reason: collision with root package name */
        private UnifiedBannerView f1786b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f1787c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f1788d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a implements UnifiedBannerADListener {
            a() {
            }

            @Override // com.qq.e.ads.banner2.UnifiedBannerADListener
            public void onADClicked() {
                Bridge bridge = d.this.mGMAd;
                if (bridge != null) {
                    bridge.call(1009, null, Void.class);
                }
            }

            @Override // com.qq.e.ads.banner2.UnifiedBannerADListener
            public void onADClosed() {
                Bridge bridge = d.this.mGMAd;
                if (bridge != null) {
                    bridge.call(1014, null, Void.class);
                }
            }

            @Override // com.qq.e.ads.banner2.UnifiedBannerADListener
            public void onADExposure() {
                Bridge bridge = d.this.mGMAd;
                if (bridge != null) {
                    bridge.call(1008, null, Void.class);
                }
            }

            @Override // com.qq.e.ads.banner2.UnifiedBannerADListener
            public void onADLeftApplication() {
                Bridge bridge = d.this.mGMAd;
                if (bridge != null) {
                    bridge.call(1016, null, Void.class);
                }
            }

            @Override // com.qq.e.ads.banner2.UnifiedBannerADListener
            public void onADReceive() {
                if (d.this.f1787c) {
                    return;
                }
                d.this.f1787c = true;
                if (d.this.f1786b != null) {
                    if (e.this.f1776d.isClientBidding()) {
                        int ecpm = d.this.f1786b.getECPM();
                        d.this.setCpm(ecpm > 0 ? ecpm : 0.0d);
                    } else if (e.this.f1776d.isMultiBidding()) {
                        d dVar = d.this;
                        dVar.setCpmLevel(dVar.f1786b.getECPMLevel());
                    }
                }
                GdtBannerLoader gdtBannerLoader = e.this.f1776d;
                d dVar2 = d.this;
                gdtBannerLoader.notifyAdSuccess(dVar2, dVar2.mGMAd);
            }

            @Override // com.qq.e.ads.banner2.UnifiedBannerADListener
            public void onNoAD(AdError adError) {
                if (d.this.f1787c) {
                    return;
                }
                d.this.f1787c = true;
                e.this.f1776d.notifyAdFailed(adError != null ? adError.getErrorCode() : -1, adError != null ? adError.getErrorMsg() : "位置错误");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class b implements Callable<MediationConstant.AdIsReadyStatus> {
            b() {
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public MediationConstant.AdIsReadyStatus call() {
                return d.this.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f1786b != null) {
                    d.this.f1786b.destroy();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.e$d$d  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0036d implements Runnable {
            RunnableC0036d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f1786b.sendWinNotification((int) d.this.getCpm());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.e$d$e  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0037e implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f1794b;

            RunnableC0037e(int i4) {
                this.f1794b = i4;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f1786b.sendLossNotification(0, this.f1794b, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class f implements Callable<String> {
            f() {
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public String call() {
                return d.this.m();
            }
        }

        public d(MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge) {
            super(mediationAdSlotValueSet, bridge);
            this.f1787c = false;
            this.f1788d = false;
        }

        private View i() {
            return this.f1786b;
        }

        private String k() {
            return e.this.f1777e ? l() : m();
        }

        private String l() {
            try {
                return (String) l.a(new f()).get(500L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String m() {
            Object obj;
            try {
                UnifiedBannerView unifiedBannerView = this.f1786b;
                if (unifiedBannerView == null || (obj = unifiedBannerView.getExtraInfo().get("request_id")) == null) {
                    return null;
                }
                return obj.toString();
            } catch (Throwable unused) {
                return null;
            }
        }

        public MediationConstant.AdIsReadyStatus a() {
            UnifiedBannerView unifiedBannerView = this.f1786b;
            return (unifiedBannerView == null || !unifiedBannerView.isValid()) ? MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY : MediationConstant.AdIsReadyStatus.AD_IS_READY;
        }

        void b(Context context) {
            if (context instanceof Activity) {
                UnifiedBannerView unifiedBannerView = new UnifiedBannerView((Activity) context, e.this.f1776d.getAdnId(), new a());
                this.f1786b = unifiedBannerView;
                unifiedBannerView.setRefresh(0);
                this.f1786b.loadAD();
            }
        }

        public void c(Map<String, Object> map) {
            if (e.this.f1776d.isClientBidding() && this.f1786b != null) {
                try {
                    if (e.this.f1777e) {
                        l.c(new RunnableC0036d());
                    } else {
                        this.f1786b.sendWinNotification((int) getCpm());
                    }
                } catch (Exception unused) {
                }
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
            if (i4 == 6081) {
                return (T) i();
            }
            if (i4 == 8121) {
                return (T) isReadyStatus();
            }
            if (i4 == 8120) {
                return (T) Boolean.valueOf(hasDestroyed());
            }
            if (i4 == 8109) {
                onDestroy();
            } else if (i4 == 8142) {
                MediationApiLog.i("TMe", "GdtBannerLoader bidWinNotify");
                Map<String, Object> map = (Map) valueSet.objectValue(8006, Map.class);
                if (map != null) {
                    c(map);
                }
            } else if (i4 == 8144) {
                MediationApiLog.i("TMe", "GdtBannerLoader bidLoseNotify");
                Map<String, Object> map2 = (Map) valueSet.objectValue(8006, Map.class);
                if (map2 != null) {
                    h(map2);
                }
            } else if (i4 == 8147) {
                return (T) k();
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        public MediationConstant.AdIsReadyStatus f() {
            try {
                MediationConstant.AdIsReadyStatus adIsReadyStatus = (MediationConstant.AdIsReadyStatus) l.a(new b()).get(500L, TimeUnit.MILLISECONDS);
                return adIsReadyStatus != null ? adIsReadyStatus : MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY;
            } catch (Exception e5) {
                e5.printStackTrace();
                return MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY;
            }
        }

        public void h(Map<String, Object> map) {
            if (!e.this.f1776d.isClientBidding() || this.f1786b == null || map == null) {
                return;
            }
            try {
                Object obj = map.get(MediationConstant.BIDDING_LOSE_REASON);
                if (obj instanceof MediationConstant.BiddingLossReason) {
                    int a5 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a.a((MediationConstant.BiddingLossReason) obj);
                    if (e.this.f1777e) {
                        l.c(new RunnableC0037e(a5));
                    } else {
                        this.f1786b.sendLossNotification(0, a5, null);
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            return this.f1788d;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public MediationConstant.AdIsReadyStatus isReadyStatus() {
            return e.this.f1777e ? f() : a();
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            this.f1788d = true;
            new Handler(Looper.getMainLooper()).post(new c());
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0038e extends MediationBaseAdBridge {

        /* renamed from: b  reason: collision with root package name */
        private String f1797b;

        /* renamed from: c  reason: collision with root package name */
        NativeUnifiedADData f1798c;

        /* renamed from: d  reason: collision with root package name */
        private volatile boolean f1799d;

        /* renamed from: e  reason: collision with root package name */
        NativeADMediaListener f1800e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.e$e$a */
        /* loaded from: classes2.dex */
        public class a implements NativeADEventListener {
            a() {
            }

            @Override // com.qq.e.ads.nativ.NativeADEventListener
            public void onADClicked() {
                Bridge bridge = C0038e.this.mGMAd;
                if (bridge != null) {
                    bridge.call(1009, null, Void.class);
                }
            }

            @Override // com.qq.e.ads.nativ.NativeADEventListener
            public void onADError(AdError adError) {
            }

            @Override // com.qq.e.ads.nativ.NativeADEventListener
            public void onADExposed() {
                Bridge bridge = C0038e.this.mGMAd;
                if (bridge != null) {
                    bridge.call(1008, null, Void.class);
                }
            }

            @Override // com.qq.e.ads.nativ.NativeADEventListener
            public void onADStatusChanged() {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.e$e$b */
        /* loaded from: classes2.dex */
        public class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NativeUnifiedADData nativeUnifiedADData = C0038e.this.f1798c;
                if (nativeUnifiedADData != null) {
                    nativeUnifiedADData.destroy();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.e$e$c */
        /* loaded from: classes2.dex */
        public class c implements Callable<MediationConstant.AdIsReadyStatus> {
            c() {
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public MediationConstant.AdIsReadyStatus call() {
                return C0038e.this.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.e$e$d */
        /* loaded from: classes2.dex */
        public class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0038e c0038e = C0038e.this;
                c0038e.f1798c.sendWinNotification((int) c0038e.getCpm());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.e$e$e  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0039e implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f1806b;

            RunnableC0039e(int i4) {
                this.f1806b = i4;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0038e.this.f1798c.sendLossNotification(0, this.f1806b, null);
            }
        }

        /* renamed from: com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.e$e$f */
        /* loaded from: classes.dex */
        class f implements NativeADMediaListener {
            f() {
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            @JProtect
            public void onVideoClicked() {
                MediationApiLog.i(C0038e.this.f1797b, "onVideoClicked");
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            @JProtect
            public void onVideoCompleted() {
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            @JProtect
            public void onVideoError(AdError adError) {
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            public void onVideoInit() {
                MediationApiLog.i(C0038e.this.f1797b, "onVideoInit: ");
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            public void onVideoLoaded(int i4) {
                MediationApiLog.i(C0038e.this.f1797b, "onVideoLoaded: ");
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            public void onVideoLoading() {
                MediationApiLog.i(C0038e.this.f1797b, "onVideoLoading: ");
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            @JProtect
            public void onVideoPause() {
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            public void onVideoReady() {
                MediationApiLog.i(C0038e.this.f1797b, "onVideoReady");
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            @JProtect
            public void onVideoResume() {
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            @JProtect
            public void onVideoStart() {
                MediationApiLog.i(C0038e.this.f1797b, "onVideoStart");
            }

            @Override // com.qq.e.ads.nativ.NativeADMediaListener
            public void onVideoStop() {
                MediationApiLog.i(C0038e.this.f1797b, "onVideoStop");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.e$e$g */
        /* loaded from: classes2.dex */
        public class g implements Callable<String> {
            g() {
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public String call() {
                return C0038e.this.k();
            }
        }

        /* renamed from: com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.e$e$h */
        /* loaded from: classes2.dex */
        class h implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Activity f1810b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ViewGroup f1811c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ List f1812d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ List f1813e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ List f1814f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ Bridge f1815g;

            h(Activity activity, ViewGroup viewGroup, List list, List list2, List list3, Bridge bridge) {
                this.f1810b = activity;
                this.f1811c = viewGroup;
                this.f1812d = list;
                this.f1813e = list2;
                this.f1814f = list3;
                this.f1815g = bridge;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0038e.this.c(this.f1810b, this.f1811c, this.f1812d, this.f1813e, this.f1814f, com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a.b(this.f1815g));
            }
        }

        C0038e(NativeUnifiedADData nativeUnifiedADData, MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge) {
            super(mediationAdSlotValueSet, bridge);
            this.f1797b = "GdtBanner-gdtNativeAd";
            this.f1799d = false;
            this.f1800e = new f();
            this.f1798c = nativeUnifiedADData;
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            NativeUnifiedADAppMiitInfo appMiitInfo = this.f1798c.getAppMiitInfo();
            if (appMiitInfo != null) {
                create.add(8056, appMiitInfo.getAppName());
                create.add(8057, appMiitInfo.getAuthorName());
                create.add(8078, appMiitInfo.getPackageSizeBytes());
                create.add(8047, (int) appMiitInfo.getPackageSizeBytes());
                create.add(8079, appMiitInfo.getPermissionsUrl());
                create.add(com.join.mgps.socket.entity.b.f54685l, appMiitInfo.getPrivacyAgreement());
                create.add(8081, appMiitInfo.getVersionName());
                try {
                    create.add(8551, appMiitInfo.getDescriptionUrl());
                } catch (Throwable unused) {
                }
            }
            create.add(8045, this.f1798c.getTitle());
            create.add(8046, this.f1798c.getDesc());
            create.add(8061, this.f1798c.getCTAText());
            create.add(8048, this.f1798c.getIconUrl());
            create.add(8050, this.f1798c.getImgUrl());
            create.add(8052, this.f1798c.getPictureWidth());
            create.add(8051, this.f1798c.getPictureHeight());
            create.add(8053, this.f1798c.getImgList());
            create.add(8082, this.f1798c.getAppScore());
            create.add(8049, this.f1798c.getTitle());
            create.add(8055, this.f1798c.isAppAd());
            if (e.this.f1776d.isClientBidding()) {
                create.add(8016, Math.max(this.f1798c.getECPM(), 0.0d));
            } else if (e.this.f1776d.isMultiBidding()) {
                create.add(8058, this.f1798c.getECPMLevel());
            }
            if (this.f1798c.getAdPatternType() == 2) {
                create.add(8060, 5);
            } else if (this.f1798c.getAdPatternType() == 4 || this.f1798c.getAdPatternType() == 1) {
                create.add(8060, 3);
            } else if (this.f1798c.getAdPatternType() == 3) {
                create.add(8060, 4);
            }
            if (this.f1798c.isAppAd()) {
                create.add(8059, 4);
            } else {
                create.add(8059, 3);
            }
            create.add(8033, false);
            bridge.call(8140, create.build(), Void.class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JProtect
        public void c(Context context, @NonNull ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, MediationViewBinder mediationViewBinder) {
            NativeAdContainer nativeAdContainer;
            Object tag;
            if (this.f1798c != null) {
                if (list3 != null) {
                    if (list2 == null) {
                        list2 = new ArrayList<>();
                    }
                    list2.addAll(list3);
                }
                List<View> list4 = list2;
                int i4 = 0;
                if (viewGroup.getChildAt(0) instanceof NativeAdContainer) {
                    nativeAdContainer = (NativeAdContainer) viewGroup.getChildAt(0);
                    while (i4 < nativeAdContainer.getChildCount()) {
                        View childAt = nativeAdContainer.getChildAt(i4);
                        if (childAt == null || ((tag = childAt.getTag(R.id.tt_mediation_gdt_developer_view_tag_key)) != null && (tag instanceof String) && ((String) tag).equals(MediationConstant.TT_GDT_NATIVE_VIEW_TAG))) {
                            i4++;
                        } else {
                            nativeAdContainer.removeView(childAt);
                        }
                    }
                } else {
                    nativeAdContainer = new NativeAdContainer(context);
                    nativeAdContainer.setTag(R.id.tt_mediation_gdt_developer_view_root_tag_key, MediationConstant.TT_GDT_NATIVE_ROOT_VIEW_TAG);
                    while (viewGroup.getChildCount() > 0) {
                        View childAt2 = viewGroup.getChildAt(0);
                        childAt2.setTag(R.id.tt_mediation_gdt_developer_view_tag_key, MediationConstant.TT_GDT_NATIVE_VIEW_TAG);
                        int indexOfChild = viewGroup.indexOfChild(childAt2);
                        viewGroup.removeViewInLayout(childAt2);
                        nativeAdContainer.addView(childAt2, indexOfChild, childAt2.getLayoutParams());
                    }
                    viewGroup.removeAllViews();
                    viewGroup.addView(nativeAdContainer, -1, -1);
                }
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(mediationViewBinder.mediaViewId);
                this.f1798c.bindAdToView(context, nativeAdContainer, e.this.f1775c, list, list4);
                if (viewGroup2 != null && this.f1798c.getAdPatternType() == 2) {
                    MediaView mediaView = new MediaView(context);
                    viewGroup2.removeAllViews();
                    viewGroup2.addView(mediaView, -1, -1);
                    VideoOption build = new VideoOption.Builder().build();
                    if (e.this.f1773a != null && (e.this.f1773a.getGdtVideoOption() instanceof VideoOption)) {
                        build = (VideoOption) e.this.f1773a.getGdtVideoOption();
                    }
                    this.f1798c.bindMediaView(mediaView, build, this.f1800e);
                }
                if (!TextUtils.isEmpty(this.f1798c.getCTAText())) {
                    View findViewById = viewGroup.findViewById(mediationViewBinder.callToActionId);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(findViewById);
                    this.f1798c.bindCTAViews(arrayList);
                }
                this.f1798c.setNativeAdEventListener(new a());
            }
        }

        private String i() {
            return e.this.f1777e ? j() : k();
        }

        private String j() {
            try {
                return (String) l.a(new g()).get(500L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String k() {
            Object obj;
            try {
                NativeUnifiedADData nativeUnifiedADData = this.f1798c;
                if (nativeUnifiedADData == null || (obj = nativeUnifiedADData.getExtraInfo().get("request_id")) == null) {
                    return null;
                }
                return obj.toString();
            } catch (Throwable unused) {
                return null;
            }
        }

        public MediationConstant.AdIsReadyStatus a() {
            NativeUnifiedADData nativeUnifiedADData = this.f1798c;
            return (nativeUnifiedADData == null || !nativeUnifiedADData.isValid()) ? MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY : MediationConstant.AdIsReadyStatus.AD_IS_READY;
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
            if (i4 == 8121) {
                return (T) isReadyStatus();
            }
            if (i4 == 8120) {
                return (T) Boolean.valueOf(hasDestroyed());
            }
            if (i4 == 8159) {
                Activity activity = (Activity) valueSet.objectValue(20033, Activity.class);
                ViewGroup viewGroup = (ViewGroup) valueSet.objectValue(8067, ViewGroup.class);
                List<View> list = (List) valueSet.objectValue(8068, List.class);
                List<View> list2 = (List) valueSet.objectValue(8069, List.class);
                List<View> list3 = (List) valueSet.objectValue(8070, List.class);
                Bridge bridge = (Bridge) valueSet.objectValue(8071, Bridge.class);
                if (e.this.f1777e) {
                    l.e(new h(activity, viewGroup, list, list2, list3, bridge));
                } else {
                    c(activity, viewGroup, list, list2, list3, com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a.b(bridge));
                }
            } else if (i4 == 8109) {
                onDestroy();
            } else if (i4 == 8142) {
                MediationApiLog.i(this.f1797b, "GdtBannerLoader Native bidWinNotify");
                Map<String, Object> map = (Map) valueSet.objectValue(8006, Map.class);
                if (map != null) {
                    e(map);
                }
            } else if (i4 == 8144) {
                MediationApiLog.i(this.f1797b, "GdtBannerLoader Native bidLoseNotify");
                Map<String, Object> map2 = (Map) valueSet.objectValue(8006, Map.class);
                if (map2 != null) {
                    h(map2);
                }
            } else if (i4 == 8147) {
                return (T) i();
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        public void e(Map<String, Object> map) {
            if (e.this.f1776d.isClientBidding() && this.f1798c != null) {
                try {
                    if (e.this.f1777e) {
                        l.c(new d());
                    } else {
                        this.f1798c.sendWinNotification((int) getCpm());
                    }
                } catch (Exception unused) {
                }
            }
        }

        public MediationConstant.AdIsReadyStatus f() {
            try {
                MediationConstant.AdIsReadyStatus adIsReadyStatus = (MediationConstant.AdIsReadyStatus) l.a(new c()).get(500L, TimeUnit.MILLISECONDS);
                return adIsReadyStatus != null ? adIsReadyStatus : MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY;
            } catch (Exception e5) {
                e5.printStackTrace();
                return MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY;
            }
        }

        public void h(Map<String, Object> map) {
            if (!e.this.f1776d.isClientBidding() || this.f1798c == null || map == null) {
                return;
            }
            try {
                Object obj = map.get(MediationConstant.BIDDING_LOSE_REASON);
                if (obj instanceof MediationConstant.BiddingLossReason) {
                    int a5 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a.a((MediationConstant.BiddingLossReason) obj);
                    if (e.this.f1777e) {
                        l.c(new RunnableC0039e(a5));
                    } else {
                        this.f1798c.sendLossNotification(0, a5, null);
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            return this.f1799d;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public MediationConstant.AdIsReadyStatus isReadyStatus() {
            return e.this.f1777e ? f() : a();
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            this.f1799d = true;
            new Handler(Looper.getMainLooper()).post(new b());
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f extends MediationBaseAdBridge {

        /* renamed from: b  reason: collision with root package name */
        private String f1817b;

        /* renamed from: c  reason: collision with root package name */
        NativeExpressADView f1818c;

        /* renamed from: d  reason: collision with root package name */
        private volatile boolean f1819d;

        /* renamed from: e  reason: collision with root package name */
        private final NativeExpressMediaListener f1820e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NativeExpressADView nativeExpressADView = f.this.f1818c;
                if (nativeExpressADView != null) {
                    nativeExpressADView.render();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NativeExpressADView nativeExpressADView = f.this.f1818c;
                if (nativeExpressADView != null) {
                    nativeExpressADView.destroy();
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
                return f.this.n();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = f.this;
                fVar.f1818c.sendWinNotification((int) fVar.getCpm());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.e$f$e  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0040e implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f1826b;

            RunnableC0040e(int i4) {
                this.f1826b = i4;
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.f1818c.sendLossNotification(0, this.f1826b, null);
            }
        }

        /* renamed from: com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.e$f$f  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0041f implements NativeExpressMediaListener {
            C0041f() {
            }

            @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
            public void onVideoCached(NativeExpressADView nativeExpressADView) {
                MediationApiLog.i(f.this.f1817b, "onVideoCached");
            }

            @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
            @JProtect
            public void onVideoComplete(NativeExpressADView nativeExpressADView) {
            }

            @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
            @JProtect
            public void onVideoError(NativeExpressADView nativeExpressADView, AdError adError) {
            }

            @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
            public void onVideoInit(NativeExpressADView nativeExpressADView) {
                String str = f.this.f1817b;
                MediationApiLog.i(str, "onVideoInit: " + f.this.c((AdData.VideoPlayer) nativeExpressADView.getBoundData().getProperty(AdData.VideoPlayer.class)));
            }

            @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
            public void onVideoLoading(NativeExpressADView nativeExpressADView) {
                MediationApiLog.i(f.this.f1817b, "onVideoLoading");
            }

            @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
            public void onVideoPageClose(NativeExpressADView nativeExpressADView) {
            }

            @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
            public void onVideoPageOpen(NativeExpressADView nativeExpressADView) {
            }

            @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
            @JProtect
            public void onVideoPause(NativeExpressADView nativeExpressADView) {
            }

            @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
            public void onVideoReady(NativeExpressADView nativeExpressADView, long j4) {
            }

            @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
            @JProtect
            public void onVideoStart(NativeExpressADView nativeExpressADView) {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class g implements Callable<String> {
            g() {
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public String call() {
                return f.this.r();
            }
        }

        f(NativeExpressADView nativeExpressADView, MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge) {
            super(mediationAdSlotValueSet, bridge);
            this.f1817b = "GdtBanenrLoader-TTExpressAd";
            this.f1819d = false;
            C0041f c0041f = new C0041f();
            this.f1820e = c0041f;
            this.f1818c = nativeExpressADView;
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            AdData boundData = nativeExpressADView.getBoundData();
            if (boundData.getAdPatternType() == 2) {
                nativeExpressADView.setMediaListener(c0041f);
                create.add(8060, 5);
            } else if (boundData.getAdPatternType() == 4 || boundData.getAdPatternType() == 1 || boundData.getAdPatternType() != 3) {
                create.add(8060, 3);
            } else {
                create.add(8060, 4);
            }
            create.add(8033, true);
            create.add(8045, boundData.getTitle());
            create.add(8046, boundData.getDesc());
            create.add(8059, 3);
            bridge.call(8140, create.build(), Void.class);
            if (e.this.f1776d.isClientBidding()) {
                setCpm(boundData.getECPM() != -1 ? boundData.getECPM() : 0.0d);
            } else if (e.this.f1776d.isMultiBidding()) {
                setCpmLevel(boundData.getECPMLevel());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String c(AdData.VideoPlayer videoPlayer) {
            if (videoPlayer != null) {
                return "{state:" + videoPlayer.getVideoState() + ",duration:" + videoPlayer.getDuration() + ",position:" + videoPlayer.getCurrentPosition() + "}";
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MediationConstant.AdIsReadyStatus n() {
            NativeExpressADView nativeExpressADView = this.f1818c;
            return (nativeExpressADView == null || !nativeExpressADView.isValid()) ? MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY : MediationConstant.AdIsReadyStatus.AD_IS_READY;
        }

        private MediationConstant.AdIsReadyStatus o() {
            try {
                MediationConstant.AdIsReadyStatus adIsReadyStatus = (MediationConstant.AdIsReadyStatus) l.a(new c()).get(500L, TimeUnit.MILLISECONDS);
                return adIsReadyStatus != null ? adIsReadyStatus : MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY;
            } catch (Exception e5) {
                e5.printStackTrace();
                return MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY;
            }
        }

        private String p() {
            return e.this.f1777e ? q() : r();
        }

        private String q() {
            try {
                return (String) l.a(new g()).get(500L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String r() {
            Object obj;
            try {
                NativeExpressADView nativeExpressADView = this.f1818c;
                if (nativeExpressADView == null || (obj = nativeExpressADView.getExtraInfo().get("request_id")) == null) {
                    return null;
                }
                return obj.toString();
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
            if (i4 == 6081) {
                return (T) m();
            }
            if (i4 == 8121) {
                return (T) isReadyStatus();
            }
            if (i4 == 8120) {
                return (T) Boolean.valueOf(hasDestroyed());
            }
            if (i4 == 8109) {
                onDestroy();
            } else if (i4 == 8142) {
                MediationApiLog.i(this.f1817b, "GdtBannerLoader ExpressNative bidWinNotify");
                Map<String, Object> map = (Map) valueSet.objectValue(8006, Map.class);
                if (map != null) {
                    e(map);
                }
            } else if (i4 == 8144) {
                MediationApiLog.i(this.f1817b, "GdtBannerLoader ExpressNative bidLoseNotify");
                Map<String, Object> map2 = (Map) valueSet.objectValue(8006, Map.class);
                if (map2 != null) {
                    h(map2);
                }
            } else if (i4 == 8147) {
                return (T) p();
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        public void d() {
            Bridge bridge = this.mGMAd;
            if (bridge != null) {
                bridge.call(1016, null, Void.class);
            }
        }

        public void e(Map<String, Object> map) {
            if (e.this.f1776d.isClientBidding() && this.f1818c != null) {
                try {
                    if (e.this.f1777e) {
                        l.c(new d());
                    } else {
                        this.f1818c.sendWinNotification((int) getCpm());
                    }
                } catch (Exception unused) {
                }
            }
        }

        public void g() {
            Bridge bridge = this.mGMAd;
            if (bridge != null) {
                bridge.call(1014, null, Void.class);
            }
        }

        public void h(Map<String, Object> map) {
            if (!e.this.f1776d.isClientBidding() || this.f1818c == null || map == null) {
                return;
            }
            try {
                Object obj = map.get(MediationConstant.BIDDING_LOSE_REASON);
                if (obj instanceof MediationConstant.BiddingLossReason) {
                    int a5 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a.a((MediationConstant.BiddingLossReason) obj);
                    if (e.this.f1777e) {
                        l.c(new RunnableC0040e(a5));
                    } else {
                        this.f1818c.sendLossNotification(0, a5, null);
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            return this.f1819d;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public MediationConstant.AdIsReadyStatus isReadyStatus() {
            return e.this.f1777e ? o() : n();
        }

        public void j() {
            Bridge bridge = this.mGMAd;
            if (bridge != null) {
                bridge.call(1009, null, Void.class);
            }
        }

        public void k() {
            Bridge bridge = this.mGMAd;
            if (bridge != null) {
                bridge.call(1008, null, Void.class);
            }
        }

        @JProtect
        public void l() {
            if (e.this.f1777e) {
                l.e(new a());
                return;
            }
            NativeExpressADView nativeExpressADView = this.f1818c;
            if (nativeExpressADView != null) {
                nativeExpressADView.render();
            }
        }

        @JProtect
        public View m() {
            return this.f1818c;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            new Handler(Looper.getMainLooper()).post(new b());
            this.f1819d = true;
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    public e(GdtBannerLoader gdtBannerLoader) {
        this.f1776d = gdtBannerLoader;
    }

    private ADSize b(MediationAdSlotValueSet mediationAdSlotValueSet) {
        ADSize aDSize = new ADSize(-1, -2);
        float expressWidth = mediationAdSlotValueSet.getExpressWidth();
        float expressHeight = mediationAdSlotValueSet.getExpressHeight();
        return expressWidth > 0.0f ? (com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a.f(mediationAdSlotValueSet) || expressHeight == 0.0f) ? new ADSize((int) expressWidth, -2) : new ADSize((int) expressWidth, (int) expressHeight) : aDSize;
    }

    private void c(Context context) {
        NativeExpressAD nativeExpressAD = this.f1776d.isServerBidding() ? new NativeExpressAD(context, b(this.f1773a), this.f1776d.getAdnId(), this.f1778f, this.f1776d.getAdm()) : new NativeExpressAD(context, b(this.f1773a), this.f1776d.getAdnId(), this.f1778f);
        int gdtMaxVideoDuration = this.f1773a.getGdtMaxVideoDuration();
        int gdtMinVideoDuration = this.f1773a.getGdtMinVideoDuration();
        if (gdtMinVideoDuration > 0) {
            nativeExpressAD.setMinVideoDuration(gdtMinVideoDuration);
        }
        if (gdtMaxVideoDuration > 0) {
            nativeExpressAD.setMaxVideoDuration(gdtMaxVideoDuration);
        }
        nativeExpressAD.setVideoOption(this.f1773a.getGdtVideoOption() instanceof VideoOption ? (VideoOption) this.f1773a.getGdtVideoOption() : new VideoOption.Builder().build());
        nativeExpressAD.loadAD(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(MediationAdSlotValueSet mediationAdSlotValueSet, Context context) {
        if (mediationAdSlotValueSet.getAdSubType() != 4) {
            new d(mediationAdSlotValueSet, this.f1774b).b(context);
            return;
        }
        int originType = mediationAdSlotValueSet.getOriginType();
        if (originType == 1) {
            c(context.getApplicationContext());
        } else if (originType == 2) {
            h(context.getApplicationContext());
        } else {
            this.f1776d.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "originType is mismatch");
        }
    }

    private void h(Context context) {
        NativeUnifiedAD nativeUnifiedAD = this.f1776d.isServerBidding() ? new NativeUnifiedAD(context, this.f1776d.getAdnId(), this.f1779g, this.f1776d.getAdm()) : new NativeUnifiedAD(context, this.f1776d.getAdnId(), this.f1779g);
        int gdtMaxVideoDuration = this.f1773a.getGdtMaxVideoDuration();
        int gdtMinVideoDuration = this.f1773a.getGdtMinVideoDuration();
        if (gdtMinVideoDuration > 0) {
            nativeUnifiedAD.setMinVideoDuration(gdtMinVideoDuration);
        }
        if (gdtMaxVideoDuration > 0) {
            nativeUnifiedAD.setMaxVideoDuration(gdtMaxVideoDuration);
        }
        Object gdtNativeLogoParams = this.f1773a.getGdtNativeLogoParams();
        if (gdtNativeLogoParams instanceof FrameLayout.LayoutParams) {
            this.f1775c = (FrameLayout.LayoutParams) gdtNativeLogoParams;
        }
        nativeUnifiedAD.loadData(1);
    }

    public void d(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        if (context == null || mediationAdSlotValueSet == null) {
            this.f1776d.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "context is null or adSlotValueSet is null");
            return;
        }
        this.f1773a = mediationAdSlotValueSet;
        this.f1774b = this.f1776d.getGMBridge();
        boolean e5 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a.e(this.f1776d, mediationAdSlotValueSet);
        this.f1777e = e5;
        if (e5) {
            l.c(new a(mediationAdSlotValueSet, context));
        } else {
            f(mediationAdSlotValueSet, context);
        }
    }
}
