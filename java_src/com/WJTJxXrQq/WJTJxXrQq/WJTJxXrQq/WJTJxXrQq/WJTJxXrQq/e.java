package com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq;

import android.content.Context;
import android.view.View;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.msdk.adapter.ks.KsNativeLoader;
import com.bytedance.sdk.openadsdk.mediation.MediationApiLog;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl;
import com.kwad.sdk.api.KsFeedAd;
import com.kwad.sdk.api.model.AdExposureFailedReason;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class e extends MediationNativeAd {

    /* renamed from: b  reason: collision with root package name */
    private KsFeedAd f1577b;

    /* renamed from: c  reason: collision with root package name */
    private MediationAdSlotValueSet f1578c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1579d;

    /* renamed from: e  reason: collision with root package name */
    private KsNativeLoader f1580e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<Context> f1581f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements KsFeedAd.AdInteractionListener {
        a() {
        }

        @Override // com.kwad.sdk.api.KsFeedAd.AdInteractionListener
        public void onAdClicked() {
            e.this.notifyOnClickAd();
        }

        @Override // com.kwad.sdk.api.KsFeedAd.AdInteractionListener
        public void onAdShow() {
            e.this.notifyOnShowAd();
        }

        @Override // com.kwad.sdk.api.KsFeedAd.AdInteractionListener
        public void onDislikeClicked() {
            e.this.notifyDislikeClick("ks信息流模板dislike接口无关闭原因", new HashMap());
            e.this.notifyDislikeSelect(-1, "ks信息流模板dislike接口无关闭原因");
        }

        @Override // com.kwad.sdk.api.KsFeedAd.AdInteractionListener
        public void onDownloadTipsDialogDismiss() {
        }

        @Override // com.kwad.sdk.api.KsFeedAd.AdInteractionListener
        public void onDownloadTipsDialogShow() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements KsFeedAd.AdRenderListener {
        b() {
        }

        @Override // com.kwad.sdk.api.KsFeedAd.AdRenderListener
        public void onAdRenderFailed(int i4, String str) {
            e.this.b(i4, str);
        }

        @Override // com.kwad.sdk.api.KsFeedAd.AdRenderListener
        public void onAdRenderSuccess(View view) {
            e.this.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements Callable<View> {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public View call() {
            return e.this.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class CallableC0025e implements Callable<String> {
        CallableC0025e() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public String call() {
            return e.this.p();
        }
    }

    public e(Context context, KsFeedAd ksFeedAd, MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge, KsNativeLoader ksNativeLoader, boolean z4) {
        super(ksNativeLoader, bridge);
        this.f1581f = new WeakReference<>(context);
        this.f1577b = ksFeedAd;
        this.f1578c = mediationAdSlotValueSet;
        this.f1580e = ksNativeLoader;
        this.f1579d = z4;
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i4, String str) {
        notifyRenderFail(null, i4, str);
    }

    private void j() {
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        if (isClientBidding()) {
            create.add(8016, Math.max(this.f1577b.getECPM(), 0.0d));
        }
        create.add(8059, n.b(this.f1577b.getInteractionType()));
        create.add(8033, true);
        notifyNativeValue(create.build());
        this.f1577b.setAdInteractionListener(new a());
        if (this.f1578c != null) {
            KSAdVideoPlayConfigImpl kSAdVideoPlayConfigImpl = new KSAdVideoPlayConfigImpl();
            kSAdVideoPlayConfigImpl.setVideoSoundEnable(!this.f1578c.isMuted());
            this.f1577b.setVideoPlayConfig(kSAdVideoPlayConfigImpl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        notifyRenderSuccess(-1.0f, -2.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        try {
            KsFeedAd ksFeedAd = this.f1577b;
            if (ksFeedAd != null) {
                ksFeedAd.render(new b());
            } else {
                b(MediationConstant.ErrorCode.ADN_AD_RENDER_FAIL, "渲染失败");
            }
        } catch (Throwable th) {
            th.printStackTrace();
            if (this.f1577b != null) {
                Context context = this.f1581f.get();
                if ((context != null ? this.f1577b.getFeedView(context) : null) != null) {
                    k();
                    return;
                }
            }
            b(MediationConstant.ErrorCode.ADN_AD_RENDER_FAIL, "渲染失败");
        }
    }

    private void m() {
        m.e(new c());
    }

    private String n() {
        return this.f1579d ? o() : p();
    }

    private String o() {
        try {
            return (String) m.a(new CallableC0025e()).get(500L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String p() {
        Object obj;
        try {
            KsFeedAd ksFeedAd = this.f1577b;
            if (ksFeedAd == null || (obj = ksFeedAd.getMediaExtraInfo().get("llsid")) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public void a() {
        if (this.f1579d) {
            m();
        } else {
            l();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd, com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (i4 == 6083) {
            a();
        } else if (i4 == 6081) {
            return (T) e();
        } else {
            if (i4 == 8135) {
                return (T) Boolean.TRUE;
            }
            if (i4 == 8147) {
                return (T) n();
            }
            if (i4 == 8142) {
                if (n.i(this.f1577b)) {
                    Map map = (Map) valueSet.objectValue(8006, Map.class);
                    MediationApiLog.i("-------ks_bid_win --------- map = " + map);
                    if (map != null) {
                        long d5 = n.d(map);
                        long l4 = n.l(map);
                        MediationApiLog.i("-------ks_bid_win --------- bidEcpm = " + d5 + " loseBidEcpm = " + l4);
                        KsFeedAd ksFeedAd = this.f1577b;
                        if (ksFeedAd != null) {
                            ksFeedAd.setBidEcpm(d5, l4);
                        }
                    }
                }
            } else if (i4 == 8144 && n.n(this.f1577b)) {
                Map map2 = (Map) valueSet.objectValue(8006, Map.class);
                MediationApiLog.i("-------ks_bid_lose --------- map = " + map2);
                if (map2 != null) {
                    int o4 = n.o(map2);
                    int p4 = n.p(map2);
                    int q4 = n.q(map2);
                    String r4 = n.r(map2);
                    MediationApiLog.i("-------ks_bid_lose --------- bidEcpm = " + p4 + " failureCode = " + o4);
                    if (this.f1577b != null) {
                        AdExposureFailedReason adExposureFailedReason = new AdExposureFailedReason();
                        adExposureFailedReason.setWinEcpm(p4);
                        adExposureFailedReason.setAdnType(q4);
                        adExposureFailedReason.setAdnName(r4);
                        this.f1577b.reportAdExposureFailed(o4, adExposureFailedReason);
                    }
                }
            }
        }
        return (T) MediationValueUtil.checkClassType(cls);
    }

    public View e() {
        return this.f1579d ? i() : g();
    }

    public View g() {
        Context context;
        if (this.f1577b == null || (context = this.f1581f.get()) == null) {
            return null;
        }
        return this.f1577b.getFeedView(context);
    }

    public View i() {
        try {
            return (View) m.a(new d()).get(500L, TimeUnit.MILLISECONDS);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd, com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return null;
    }
}
