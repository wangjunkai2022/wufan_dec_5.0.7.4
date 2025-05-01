package com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG;

import android.content.Context;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.msdk.adapter.gdt.GdtNativeLoader;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.qq.e.ads.cfg.VideoOption;
import com.qq.e.ads.nativ.ADSize;
import com.qq.e.ads.nativ.NativeADUnifiedListener;
import com.qq.e.ads.nativ.NativeExpressAD;
import com.qq.e.ads.nativ.NativeExpressADView;
import com.qq.e.ads.nativ.NativeUnifiedAD;
import com.qq.e.ads.nativ.NativeUnifiedADData;
import com.qq.e.comm.util.AdError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class i {

    /* renamed from: f  reason: collision with root package name */
    private static Map<NativeExpressADView, d> f1874f = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private MediationAdSlotValueSet f1875a;

    /* renamed from: b  reason: collision with root package name */
    private final GdtNativeLoader f1876b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1877c;

    /* renamed from: d  reason: collision with root package name */
    private final NativeExpressAD.NativeExpressADListener f1878d = new b();

    /* renamed from: e  reason: collision with root package name */
    private final NativeADUnifiedListener f1879e = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f1880b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MediationAdSlotValueSet f1881c;

        a(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
            this.f1880b = context;
            this.f1881c = mediationAdSlotValueSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.g(this.f1880b, this.f1881c);
            l.d(getClass().getName(), this.f1880b);
        }
    }

    /* loaded from: classes2.dex */
    class b implements NativeExpressAD.NativeExpressADListener {
        b() {
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onADClicked(NativeExpressADView nativeExpressADView) {
            d dVar;
            if (i.f1874f == null || (dVar = (d) i.f1874f.get(nativeExpressADView)) == null) {
                return;
            }
            dVar.notifyOnClickAd();
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onADClosed(NativeExpressADView nativeExpressADView) {
            if (i.f1874f != null) {
                d dVar = (d) i.f1874f.get(nativeExpressADView);
                if (dVar != null) {
                    dVar.b();
                }
                i.f1874f.remove(nativeExpressADView);
            }
            if (nativeExpressADView != null) {
                nativeExpressADView.destroy();
            }
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onADExposure(NativeExpressADView nativeExpressADView) {
            d dVar;
            if (i.f1874f == null || (dVar = (d) i.f1874f.get(nativeExpressADView)) == null) {
                return;
            }
            dVar.notifyOnShowAd();
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onADLeftApplication(NativeExpressADView nativeExpressADView) {
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onADLoaded(List<NativeExpressADView> list) {
            if (list == null || list.size() == 0) {
                i.this.f1876b.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "list is empty");
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (NativeExpressADView nativeExpressADView : list) {
                if (nativeExpressADView != null && nativeExpressADView.getBoundData() != null) {
                    Bridge gMBridge = i.this.f1876b.getGMBridge();
                    Map map = i.f1874f;
                    i iVar = i.this;
                    map.put(nativeExpressADView, new d(iVar, iVar.f1876b, gMBridge, nativeExpressADView, i.this.f1877c));
                    arrayList.add(gMBridge);
                }
            }
            i.this.f1876b.notifyAdSuccess(arrayList);
        }

        @Override // com.qq.e.ads.NativeAbstractAD.BasicADListener
        public void onNoAD(AdError adError) {
            if (adError != null) {
                i.this.f1876b.notifyAdFailed(adError.getErrorCode(), adError.getErrorMsg());
            } else {
                i.this.f1876b.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "adError is null");
            }
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onRenderFail(NativeExpressADView nativeExpressADView) {
            d dVar;
            if (i.f1874f == null || (dVar = (d) i.f1874f.get(nativeExpressADView)) == null) {
                return;
            }
            dVar.notifyRenderFail(nativeExpressADView, MediationConstant.ErrorCode.ADN_AD_RENDER_FAIL, "渲染失败");
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onRenderSuccess(NativeExpressADView nativeExpressADView) {
            d dVar;
            if (i.f1874f == null || (dVar = (d) i.f1874f.get(nativeExpressADView)) == null) {
                return;
            }
            dVar.notifyRenderSuccess(-1.0f, -2.0f);
        }
    }

    /* loaded from: classes2.dex */
    class c implements NativeADUnifiedListener {
        c() {
        }

        @Override // com.qq.e.ads.nativ.NativeADUnifiedListener
        public void onADLoaded(List<NativeUnifiedADData> list) {
            if (list == null || list.size() <= 0) {
                i.this.f1876b.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "请求成功，但无广告可用");
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (NativeUnifiedADData nativeUnifiedADData : list) {
                if (nativeUnifiedADData != null) {
                    Bridge gMBridge = i.this.f1876b.getGMBridge();
                    VideoOption build = new VideoOption.Builder().build();
                    if (i.this.f1875a != null) {
                        Object gdtNativeLogoParams = i.this.f1875a.getGdtNativeLogoParams();
                        r2 = gdtNativeLogoParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) gdtNativeLogoParams : null;
                        if (i.this.f1875a.getGdtVideoOption() instanceof VideoOption) {
                            build = (VideoOption) i.this.f1875a.getGdtVideoOption();
                        }
                    }
                    new com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.c(i.this.f1876b, gMBridge, nativeUnifiedADData, r2, build, i.this.f1877c);
                    arrayList.add(gMBridge);
                }
            }
            i.this.f1876b.notifyAdSuccess(arrayList);
        }

        @Override // com.qq.e.ads.NativeAbstractAD.BasicADListener
        public void onNoAD(AdError adError) {
            if (adError != null) {
                i.this.f1876b.notifyAdFailed(adError.getErrorCode(), adError.getErrorMsg());
            } else {
                i.this.f1876b.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "请求失败");
            }
        }
    }

    public i(GdtNativeLoader gdtNativeLoader) {
        this.f1876b = gdtNativeLoader;
    }

    private ADSize b(MediationAdSlotValueSet mediationAdSlotValueSet) {
        return mediationAdSlotValueSet.getExpressWidth() > 0.0f ? new ADSize((int) mediationAdSlotValueSet.getExpressWidth(), -2) : new ADSize(-1, -2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        this.f1875a = mediationAdSlotValueSet;
        boolean isExpress = mediationAdSlotValueSet.isExpress();
        Context applicationContext = context.getApplicationContext();
        if (isExpress) {
            j(applicationContext, mediationAdSlotValueSet);
        } else {
            k(applicationContext, mediationAdSlotValueSet);
        }
    }

    private void j(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        NativeExpressAD nativeExpressAD = this.f1876b.isServerBidding() ? new NativeExpressAD(context, b(mediationAdSlotValueSet), mediationAdSlotValueSet.getADNId(), this.f1878d, this.f1876b.getAdm()) : new NativeExpressAD(context, b(mediationAdSlotValueSet), mediationAdSlotValueSet.getADNId(), this.f1878d);
        int gdtMaxVideoDuration = mediationAdSlotValueSet.getGdtMaxVideoDuration();
        int gdtMinVideoDuration = mediationAdSlotValueSet.getGdtMinVideoDuration();
        if (gdtMinVideoDuration > 0) {
            nativeExpressAD.setMinVideoDuration(gdtMinVideoDuration);
        }
        if (gdtMaxVideoDuration > 0) {
            nativeExpressAD.setMaxVideoDuration(gdtMaxVideoDuration);
        }
        nativeExpressAD.setVideoOption(mediationAdSlotValueSet.getGdtVideoOption() instanceof VideoOption ? (VideoOption) mediationAdSlotValueSet.getGdtVideoOption() : new VideoOption.Builder().build());
        nativeExpressAD.loadAD(mediationAdSlotValueSet.getAdCount());
    }

    private void k(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        NativeUnifiedAD nativeUnifiedAD = this.f1876b.isServerBidding() ? new NativeUnifiedAD(context, this.f1876b.getAdnId(), this.f1879e, this.f1876b.getAdm()) : new NativeUnifiedAD(context, this.f1876b.getAdnId(), this.f1879e);
        int gdtMaxVideoDuration = mediationAdSlotValueSet.getGdtMaxVideoDuration();
        int gdtMinVideoDuration = mediationAdSlotValueSet.getGdtMinVideoDuration();
        if (gdtMinVideoDuration > 0) {
            nativeUnifiedAD.setMinVideoDuration(gdtMinVideoDuration);
        }
        if (gdtMaxVideoDuration > 0) {
            nativeUnifiedAD.setMaxVideoDuration(gdtMaxVideoDuration);
        }
        nativeUnifiedAD.loadData(mediationAdSlotValueSet.getAdCount());
    }

    public Map<NativeExpressADView, d> c() {
        return f1874f;
    }

    public void d(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        boolean e5 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a.e(this.f1876b, mediationAdSlotValueSet);
        this.f1877c = e5;
        if (e5) {
            l.c(new a(context, mediationAdSlotValueSet));
        } else {
            g(context, mediationAdSlotValueSet);
        }
    }
}
