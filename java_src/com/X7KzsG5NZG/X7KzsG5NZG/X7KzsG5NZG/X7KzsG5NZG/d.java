package com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG;

import android.os.Handler;
import android.os.Looper;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.msdk.adapter.gdt.GdtNativeLoader;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.qq.e.ads.nativ.NativeExpressADView;
import com.qq.e.ads.nativ.NativeExpressMediaListener;
import com.qq.e.comm.pi.AdData;
import com.qq.e.comm.util.AdError;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class d extends MediationNativeAd {

    /* renamed from: b  reason: collision with root package name */
    private NativeExpressADView f1761b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f1762c;

    /* renamed from: d  reason: collision with root package name */
    private i f1763d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1764e;

    /* renamed from: f  reason: collision with root package name */
    private NativeExpressMediaListener f1765f;

    /* loaded from: classes2.dex */
    class a implements NativeExpressMediaListener {
        a() {
        }

        @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
        public void onVideoCached(NativeExpressADView nativeExpressADView) {
        }

        @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
        public void onVideoComplete(NativeExpressADView nativeExpressADView) {
            d.this.notifyOnVideoComplete();
        }

        @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
        public void onVideoError(NativeExpressADView nativeExpressADView, AdError adError) {
            d dVar = d.this;
            if (adError != null) {
                dVar.notifyOnVideoError(adError.getErrorCode(), adError.getErrorMsg());
            } else {
                dVar.notifyOnVideoError(MediationConstant.ErrorCode.ADN_AD_VIDEO_ERROR, "aderror is null");
            }
        }

        @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
        public void onVideoInit(NativeExpressADView nativeExpressADView) {
        }

        @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
        public void onVideoLoading(NativeExpressADView nativeExpressADView) {
        }

        @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
        public void onVideoPageClose(NativeExpressADView nativeExpressADView) {
        }

        @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
        public void onVideoPageOpen(NativeExpressADView nativeExpressADView) {
        }

        @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
        public void onVideoPause(NativeExpressADView nativeExpressADView) {
            d.this.notifyOnVideoPause();
        }

        @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
        public void onVideoReady(NativeExpressADView nativeExpressADView, long j4) {
        }

        @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
        public void onVideoStart(NativeExpressADView nativeExpressADView) {
            d.this.notifyOnVideoStart();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Callable<String> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public String call() {
            return d.this.g();
        }
    }

    /* loaded from: classes2.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d.this.f1761b != null) {
                d.this.f1761b.render();
            }
        }
    }

    /* renamed from: com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class RunnableC0035d implements Runnable {
        RunnableC0035d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d.this.f1761b != null) {
                d.this.f1761b.destroy();
            }
        }
    }

    /* loaded from: classes2.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f1761b.sendWinNotification((int) d.this.getCpm());
        }
    }

    /* loaded from: classes2.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1771b;

        f(int i4) {
            this.f1771b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f1761b.sendLossNotification(0, this.f1771b, null);
        }
    }

    public d(i iVar, GdtNativeLoader gdtNativeLoader, Bridge bridge, NativeExpressADView nativeExpressADView, boolean z4) {
        super(gdtNativeLoader, bridge);
        this.f1762c = false;
        this.f1765f = new a();
        this.f1761b = nativeExpressADView;
        this.f1763d = iVar;
        this.f1764e = z4;
        d();
    }

    private void d() {
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        AdData boundData = this.f1761b.getBoundData();
        if (boundData.getAdPatternType() == 2) {
            this.f1761b.setMediaListener(this.f1765f);
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
        if (isClientBidding()) {
            create.add(8016, Math.max(boundData.getECPM(), 0.0d));
        } else if (isMultiBidding()) {
            create.add(8058, boundData.getECPMLevel());
        }
        create.add(8033, true);
        notifyNativeValue(create.build());
    }

    private String e() {
        return this.f1764e ? f() : g();
    }

    private String f() {
        try {
            return (String) l.a(new b()).get(500L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String g() {
        Object obj;
        try {
            NativeExpressADView nativeExpressADView = this.f1761b;
            if (nativeExpressADView == null || (obj = nativeExpressADView.getExtraInfo().get("request_id")) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public void b() {
        notifyDislikeClick("gdt信息流模板dislike接口无关闭原因", new HashMap());
        notifyDislikeSelect(-1, "gdt信息流模板dislike接口无关闭原因");
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd, com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (i4 == 6083) {
            if (this.f1764e) {
                l.e(new c());
            } else {
                NativeExpressADView nativeExpressADView = this.f1761b;
                if (nativeExpressADView != null) {
                    nativeExpressADView.render();
                }
            }
        } else if (i4 == 6081) {
            if (isServerBidding()) {
                NativeExpressADView nativeExpressADView2 = this.f1761b;
                nativeExpressADView2.setBidECPM(nativeExpressADView2.getECPM());
            }
            return (T) this.f1761b;
        } else if (i4 == 8135) {
            return (T) Boolean.TRUE;
        } else {
            if (i4 == 8109) {
                this.f1762c = true;
                if (this.f1763d.c() != null) {
                    this.f1763d.c().remove(this.f1761b);
                }
                new Handler(Looper.getMainLooper()).post(new RunnableC0035d());
            } else if (i4 == 8120) {
                return (T) Boolean.valueOf(this.f1762c);
            } else {
                try {
                    if (i4 == 8142) {
                        NativeExpressADView nativeExpressADView3 = this.f1761b;
                        if (nativeExpressADView3 != null) {
                            if (this.f1764e) {
                                l.c(new e());
                            } else {
                                nativeExpressADView3.sendWinNotification((int) getCpm());
                            }
                        }
                    } else if (i4 == 8144) {
                        Map map = (Map) valueSet.objectValue(8006, Map.class);
                        if (map != null && this.f1761b != null) {
                            Object obj = map.get(MediationConstant.BIDDING_LOSE_REASON);
                            if (obj instanceof MediationConstant.BiddingLossReason) {
                                int a5 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a.a((MediationConstant.BiddingLossReason) obj);
                                if (this.f1764e) {
                                    l.c(new f(a5));
                                } else {
                                    this.f1761b.sendLossNotification(0, a5, null);
                                }
                            }
                        }
                    } else if (i4 == 8147) {
                        return (T) e();
                    }
                } catch (Exception unused) {
                }
            }
        }
        return (T) MediationValueUtil.checkClassType(cls);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd, com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return null;
    }
}
