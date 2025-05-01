package com.join.mgps.ad;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdLoadType;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.join.mgps.Util.w0;
import com.qq.e.comm.managers.setting.GlobalSetting;
import com.uc.crashsdk.export.LogType;
/* compiled from: TTInteractionRewardVideo.java */
/* loaded from: classes.dex */
public class x extends d {

    /* renamed from: m  reason: collision with root package name */
    private TTAdNative f39742m;

    /* renamed from: n  reason: collision with root package name */
    private TTFullScreenVideoAd f39743n;

    /* renamed from: o  reason: collision with root package name */
    private AdSlot f39744o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f39745p;

    /* renamed from: q  reason: collision with root package name */
    private b f39746q;

    /* renamed from: r  reason: collision with root package name */
    private TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f39747r;

    /* compiled from: TTInteractionRewardVideo.java */
    /* loaded from: classes4.dex */
    class a implements TTFullScreenVideoAd.FullScreenVideoAdInteractionListener {
        a() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onAdClose() {
            d.i(x.this.f39677a, 1004);
            x.this.onADClose();
            x xVar = x.this;
            xVar.c(xVar.f39682f);
            x xVar2 = x.this;
            xVar2.a(xVar2.f39682f, xVar2.f39683g, xVar2.f39684h);
        }

        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onAdShow() {
            x.this.f39745p = false;
            d.i(x.this.f39677a, 1003);
            x.this.onADShow();
        }

        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onAdVideoBarClick() {
            w0.c(x.this.f39680d, "rewardVideoAd onAdClicked");
            x.this.onADClick();
        }

        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onSkippedVideo() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
        public void onVideoComplete() {
            x.this.onVideoComplete();
        }
    }

    public x(Context context, String str, String str2) {
        super(GlobalSetting.TT_SDK_WRAPPER, context, str, str2);
        this.f39745p = false;
    }

    private void y(boolean z4) {
        int i4;
        int i5;
        if (com.join.mgps.ad.adapter.e.b() != null) {
            i4 = com.join.mgps.ad.adapter.e.b().x;
            i5 = com.join.mgps.ad.adapter.e.b().y;
        } else {
            i4 = LogType.UNEXP_ANR;
            i5 = 720;
        }
        this.f39744o = new AdSlot.Builder().setCodeId(this.f39679c).setAdCount(1).setImageAcceptedSize(i4, i5).setAdLoadType(z4 ? TTAdLoadType.LOAD : TTAdLoadType.PRELOAD).setExpressViewAcceptedSize(500.0f, 500.0f).build();
    }

    @Override // com.join.mgps.ad.d
    public void e() {
        if (this.f39746q == null) {
            this.f39746q = new b();
        }
        com.join.mgps.ad.adapter.e.d(this.f39677a, this.f39678b, new s1.a() { // from class: com.join.mgps.ad.w
            @Override // s1.a
            public final void a() {
                x.this.onInitSuccess();
            }
        });
    }

    @Override // com.join.mgps.ad.d
    protected boolean f() {
        if (d.f39676l) {
            StringBuilder sb = new StringBuilder();
            sb.append("RewardVideoAd:");
            sb.append(this.f39743n != null);
            sb.append("hasLoaded:");
            sb.append(this.f39745p);
        }
        return this.f39743n != null && this.f39745p;
    }

    @Override // com.join.mgps.ad.d
    public void h(boolean z4) {
        try {
            this.f39745p = false;
            if (d.f39676l) {
                StringBuilder sb = new StringBuilder();
                sb.append("load:");
                sb.append(z4);
            }
            y(z4);
            if (this.f39746q == null) {
                this.f39746q = new b();
            }
            this.f39746q.a(z4);
            if (this.f39686j) {
                return;
            }
            this.f39686j = true;
            if (this.f39742m == null && TTAdSdk.getAdManager() != null) {
                this.f39742m = TTAdSdk.getAdManager().createAdNative(this.f39677a);
            }
            TTAdNative tTAdNative = this.f39742m;
            if (tTAdNative != null) {
                tTAdNative.loadFullScreenVideoAd(this.f39744o, this.f39746q);
            } else {
                onError(-1, "广告加载错误");
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            this.f39686j = false;
            onError(-1, "广告加载错误");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.ad.d
    public void u(Activity activity) {
        super.u(activity);
        this.f39745p = false;
        if (this.f39747r == null) {
            this.f39747r = new a();
        }
        this.f39743n.setFullScreenVideoAdInteractionListener(this.f39747r);
        this.f39743n.showFullScreenVideoAd(activity);
    }

    public void x() {
        if (this.f39743n != null) {
            this.f39743n = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TTInteractionRewardVideo.java */
    /* loaded from: classes4.dex */
    public class b implements TTAdNative.FullScreenVideoAdListener, TTAdSdk.InitCallback {

        /* renamed from: a  reason: collision with root package name */
        boolean f39749a = false;

        b() {
        }

        public void a(boolean z4) {
            this.f39749a = z4;
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
        public void fail(int i4, String str) {
            x.this.onError(i4, str);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener
        public void onError(int i4, String str) {
            x.this.f39745p = false;
            x xVar = x.this;
            xVar.f39686j = false;
            xVar.onError(i4, str);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener
        public void onFullScreenVideoAdLoad(TTFullScreenVideoAd tTFullScreenVideoAd) {
            w0.c(x.this.f39680d, "rewardVideoAd loaded");
            x.this.f39745p = true;
            x xVar = x.this;
            xVar.f39686j = false;
            xVar.f39743n = tTFullScreenVideoAd;
            x.this.b(this.f39749a);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener
        public void onFullScreenVideoCached() {
            x.this.f39745p = true;
            x xVar = x.this;
            xVar.f39686j = false;
            xVar.onVideoCached();
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
        public void success() {
            x.this.onInitSuccess();
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener
        public void onFullScreenVideoCached(TTFullScreenVideoAd tTFullScreenVideoAd) {
            x.this.f39745p = true;
            x xVar = x.this;
            xVar.f39686j = false;
            xVar.onVideoCached();
        }
    }
}
