package com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq;

import android.content.Context;
import android.view.View;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.MediationApiLog;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.kwad.sdk.api.KsDrawAd;
import com.kwad.sdk.api.model.AdExposureFailedReason;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class b extends MediationNativeAd {

    /* renamed from: b  reason: collision with root package name */
    private KsDrawAd f1548b;

    /* renamed from: c  reason: collision with root package name */
    private View f1549c;

    /* renamed from: d  reason: collision with root package name */
    private MediationAdSlotValueSet f1550d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1551e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<Context> f1552f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements KsDrawAd.AdInteractionListener {
        a() {
        }

        @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
        public void onAdClicked() {
            b.this.notifyOnClickAd();
        }

        @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
        public void onAdShow() {
            b.this.notifyOnShowAd();
        }

        @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
        public void onVideoPlayEnd() {
            b.this.notifyOnVideoComplete();
        }

        @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
        public void onVideoPlayError() {
            b.this.notifyOnVideoError(MediationConstant.ErrorCode.ADN_AD_VIDEO_ERROR, "no msg");
        }

        @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
        public void onVideoPlayPause() {
            b.this.notifyOnVideoPause();
        }

        @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
        public void onVideoPlayResume() {
            b.this.notifyOnVideoResume();
        }

        @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
        public void onVideoPlayStart() {
            b.this.notifyOnVideoStart();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class CallableC0023b implements Callable<String> {
        CallableC0023b() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public String call() {
            return b.this.i();
        }
    }

    /* loaded from: classes2.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Context context;
            if (b.this.f1548b == null || (context = (Context) b.this.f1552f.get()) == null) {
                return;
            }
            b bVar = b.this;
            bVar.f1549c = bVar.f1548b.getDrawView(context);
            b bVar2 = b.this;
            bVar2.notifyRenderSuccess(bVar2.f1550d.getWidth(), b.this.f1550d.getHeight());
        }
    }

    public b(Context context, MediationAdLoaderImpl mediationAdLoaderImpl, Bridge bridge, KsDrawAd ksDrawAd, MediationAdSlotValueSet mediationAdSlotValueSet, boolean z4) {
        super(mediationAdLoaderImpl, bridge);
        this.f1552f = new WeakReference<>(context);
        this.f1548b = ksDrawAd;
        this.f1550d = mediationAdSlotValueSet;
        this.f1551e = z4;
        c();
    }

    private void c() {
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        create.add(8055, this.f1548b.getInteractionType() == 1);
        create.add(8059, n.b(this.f1548b.getInteractionType()));
        if (isClientBidding()) {
            create.add(8016, Math.max(this.f1548b.getECPM(), 0.0d));
        }
        create.add(8033, true);
        notifyNativeValue(create.build());
        this.f1548b.setAdInteractionListener(new a());
    }

    private String e() {
        return this.f1551e ? f() : i();
    }

    private String f() {
        try {
            return (String) m.a(new CallableC0023b()).get(500L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String i() {
        Object obj;
        try {
            KsDrawAd ksDrawAd = this.f1548b;
            if (ksDrawAd == null || (obj = ksDrawAd.getMediaExtraInfo().get("llsid")) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd, com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        Context context;
        if (i4 == 6083) {
            if (this.f1551e) {
                m.e(new c());
            } else if (this.f1548b != null && (context = this.f1552f.get()) != null) {
                this.f1549c = this.f1548b.getDrawView(context);
                notifyRenderSuccess(this.f1550d.getWidth(), this.f1550d.getHeight());
            }
        } else if (i4 == 6081) {
            return (T) this.f1549c;
        } else {
            if (i4 == 8120) {
                return (T) Boolean.valueOf(this.f1548b == null);
            } else if (i4 == 8109) {
                this.f1548b = null;
            } else if (i4 == 8147) {
                return (T) e();
            } else {
                if (i4 == 8142) {
                    if (n.i(this.f1548b)) {
                        Map map = (Map) valueSet.objectValue(8006, Map.class);
                        MediationApiLog.i("-------ks_bid_win --------- map = " + map);
                        if (map != null) {
                            long d5 = n.d(map);
                            long l4 = n.l(map);
                            MediationApiLog.i("-------ks_bid_win --------- bidEcpm = " + d5 + " loseBidEcpm = " + l4);
                            KsDrawAd ksDrawAd = this.f1548b;
                            if (ksDrawAd != null) {
                                ksDrawAd.setBidEcpm(d5, l4);
                            }
                        }
                    }
                } else if (i4 == 8144 && n.n(this.f1548b)) {
                    Map map2 = (Map) valueSet.objectValue(8006, Map.class);
                    MediationApiLog.i("-------ks_bid_lose --------- map = " + map2);
                    if (map2 != null) {
                        int o4 = n.o(map2);
                        int p4 = n.p(map2);
                        int q4 = n.q(map2);
                        String r4 = n.r(map2);
                        MediationApiLog.i("-------ks_bid_lose --------- bidEcpm = " + p4 + " failureCode = " + o4);
                        if (this.f1548b != null) {
                            AdExposureFailedReason adExposureFailedReason = new AdExposureFailedReason();
                            adExposureFailedReason.setWinEcpm(p4);
                            adExposureFailedReason.setAdnType(q4);
                            adExposureFailedReason.setAdnName(r4);
                            this.f1548b.reportAdExposureFailed(o4, adExposureFailedReason);
                        }
                    }
                }
            }
        }
        return (T) MediationValueUtil.checkClassType(cls);
    }
}
