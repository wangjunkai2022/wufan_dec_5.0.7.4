package com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG;

import android.content.Context;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.msdk.adapter.gdt.GdtDrawLoader;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.qq.e.ads.cfg.VideoOption;
import com.qq.e.ads.nativ.NativeADUnifiedListener;
import com.qq.e.ads.nativ.NativeUnifiedAD;
import com.qq.e.ads.nativ.NativeUnifiedADData;
import com.qq.e.comm.util.AdError;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final GdtDrawLoader f1830a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1831b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f1832b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MediationAdSlotValueSet f1833c;

        a(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
            this.f1832b = context;
            this.f1833c = mediationAdSlotValueSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.d(this.f1832b.getApplicationContext(), this.f1833c);
            l.d(getClass().getName(), this.f1832b.getApplicationContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements NativeADUnifiedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MediationAdSlotValueSet f1835a;

        b(MediationAdSlotValueSet mediationAdSlotValueSet) {
            this.f1835a = mediationAdSlotValueSet;
        }

        @Override // com.qq.e.ads.nativ.NativeADUnifiedListener
        public void onADLoaded(List<NativeUnifiedADData> list) {
            if (list == null || list.size() <= 0) {
                f.this.f1830a.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "请求成功，但无广告可用");
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (NativeUnifiedADData nativeUnifiedADData : list) {
                Bridge gMBridge = f.this.f1830a.getGMBridge();
                VideoOption build = new VideoOption.Builder().build();
                if (this.f1835a.getGdtVideoOption() instanceof VideoOption) {
                    build = (VideoOption) this.f1835a.getGdtVideoOption();
                }
                new com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.b(nativeUnifiedADData, f.this.f1830a, gMBridge, build, f.this.f1831b);
                arrayList.add(gMBridge);
            }
            f.this.f1830a.notifyAdSuccess(arrayList);
        }

        @Override // com.qq.e.ads.NativeAbstractAD.BasicADListener
        public void onNoAD(AdError adError) {
            if (adError != null) {
                f.this.f1830a.notifyAdFailed(adError.getErrorCode(), adError.getErrorMsg());
            } else {
                f.this.f1830a.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "error is null");
            }
        }
    }

    public f(GdtDrawLoader gdtDrawLoader) {
        this.f1830a = gdtDrawLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        NativeUnifiedAD nativeUnifiedAD = new NativeUnifiedAD(context, mediationAdSlotValueSet.getADNId(), new b(mediationAdSlotValueSet));
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

    public void b(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        boolean e5 = com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.a.e(this.f1830a, mediationAdSlotValueSet);
        this.f1831b = e5;
        if (e5) {
            l.c(new a(context, mediationAdSlotValueSet));
        } else {
            d(context.getApplicationContext(), mediationAdSlotValueSet);
        }
    }
}
