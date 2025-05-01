package com.join.mgps.ad;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdLoadType;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.join.mgps.Util.w0;
import java.util.Map;
/* compiled from: GroMRewardVideo.java */
/* loaded from: classes4.dex */
public class l extends d {

    /* renamed from: m  reason: collision with root package name */
    private TTAdNative f39717m;

    /* renamed from: n  reason: collision with root package name */
    private TTRewardVideoAd f39718n;

    /* renamed from: o  reason: collision with root package name */
    private AdSlot f39719o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f39720p;

    /* renamed from: q  reason: collision with root package name */
    private b f39721q;

    /* renamed from: r  reason: collision with root package name */
    private TTRewardVideoAd.RewardAdInteractionListener f39722r;

    /* compiled from: GroMRewardVideo.java */
    /* loaded from: classes4.dex */
    class a implements TTRewardVideoAd.RewardAdInteractionListener {
        a() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onAdClose() {
            d.i(l.this.f39677a, 3);
            l.this.onADClose();
            l lVar = l.this;
            lVar.c(lVar.f39682f);
            l lVar2 = l.this;
            lVar2.a(lVar2.f39682f, lVar2.f39683g, lVar2.f39684h);
            l lVar3 = l.this;
            lVar3.d(lVar3.f39682f, lVar3.f39683g, lVar3.f39684h, lVar3.f39687k);
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onAdShow() {
            l.this.f39720p = false;
            d.i(l.this.f39677a, 1);
            l.this.onADShow();
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onAdVideoBarClick() {
            d.i(l.this.f39677a, 2);
            w0.c(l.this.f39680d, "rewardVideoAd bar click");
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onRewardArrived(boolean z4, int i4, Bundle bundle) {
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onRewardVerify(boolean z4, int i4, String str, int i5, String str2) {
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onSkippedVideo() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onVideoComplete() {
            d.i(l.this.f39677a, 4);
            l.this.onVideoComplete();
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onVideoError() {
        }
    }

    public l(Context context, String str, String str2) {
        super("GroMore", context, str, str2);
        this.f39720p = false;
    }

    private void x(boolean z4) {
        this.f39719o = new AdSlot.Builder().setCodeId(this.f39679c).setAdCount(1).setImageAcceptedSize(1080, 1920).setAdLoadType(z4 ? TTAdLoadType.LOAD : TTAdLoadType.PRELOAD).setUserID("user123").setMediaExtra("media_extra").build();
    }

    @Override // com.join.mgps.ad.d
    public void e() {
        if (this.f39721q == null) {
            this.f39721q = new b();
        }
        com.join.mgps.ad.adapter.e.d(this.f39677a, this.f39678b, new s1.a() { // from class: com.join.mgps.ad.k
            @Override // s1.a
            public final void a() {
                l.this.onInitSuccess();
            }
        });
    }

    @Override // com.join.mgps.ad.d
    protected boolean f() {
        if (d.f39676l) {
            StringBuilder sb = new StringBuilder();
            sb.append("RewardVideoAd:");
            sb.append(this.f39718n != null);
            sb.append("hasLoaded:");
            sb.append(this.f39720p);
        }
        return this.f39718n != null && this.f39720p;
    }

    @Override // com.join.mgps.ad.d
    public void h(boolean z4) {
        try {
            this.f39720p = false;
            if (d.f39676l) {
                StringBuilder sb = new StringBuilder();
                sb.append("load:");
                sb.append(z4);
            }
            y();
            x(z4);
            if (this.f39721q == null) {
                this.f39721q = new b();
            }
            this.f39721q.a(z4);
            if (this.f39686j) {
                return;
            }
            this.f39686j = true;
            if (this.f39717m == null && TTAdSdk.getAdManager() != null) {
                this.f39717m = TTAdSdk.getAdManager().createAdNative(this.f39677a);
            }
            TTAdNative tTAdNative = this.f39717m;
            if (tTAdNative != null) {
                tTAdNative.loadRewardVideoAd(this.f39719o, this.f39721q);
                return;
            }
            Map<String, Object> map = this.f39687k;
            if (map != null) {
                d.j(this.f39677a, 5, map);
            } else {
                d.i(this.f39677a, 5);
            }
            onError(-1, "广告加载错误");
        } catch (Exception e5) {
            e5.printStackTrace();
            this.f39686j = false;
            Map<String, Object> map2 = this.f39687k;
            if (map2 != null) {
                d.j(this.f39677a, 5, map2);
            } else {
                d.i(this.f39677a, 5);
            }
            onError(-1, "广告加载错误");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.ad.d
    public void u(Activity activity) {
        super.u(activity);
        if (this.f39722r == null) {
            this.f39722r = new a();
        }
        this.f39718n.setRewardAdInteractionListener(this.f39722r);
        this.f39718n.showRewardVideoAd(this.f39681e);
        this.f39718n = null;
    }

    public void y() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GroMRewardVideo.java */
    /* loaded from: classes4.dex */
    public class b implements TTAdNative.RewardVideoAdListener, TTAdSdk.InitCallback {

        /* renamed from: a  reason: collision with root package name */
        boolean f39724a = false;

        b() {
        }

        public void a(boolean z4) {
            this.f39724a = z4;
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
        public void fail(int i4, String str) {
            l lVar = l.this;
            Map<String, Object> map = lVar.f39687k;
            if (map != null) {
                d.j(lVar.f39677a, 5, map);
            } else {
                d.i(lVar.f39677a, 5);
            }
            l.this.onError(i4, str);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
        public void onError(int i4, String str) {
            l.this.f39720p = false;
            l lVar = l.this;
            lVar.f39686j = false;
            Map<String, Object> map = lVar.f39687k;
            if (map != null) {
                d.j(lVar.f39677a, 5, map);
            } else {
                d.i(lVar.f39677a, 5);
            }
            l.this.onError(i4, str);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
        public void onRewardVideoAdLoad(TTRewardVideoAd tTRewardVideoAd) {
            w0.c(l.this.f39680d, "rewardVideoAd loaded");
            l.this.f39720p = true;
            l lVar = l.this;
            lVar.f39686j = false;
            lVar.f39718n = tTRewardVideoAd;
            l.this.b(this.f39724a);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
        public void onRewardVideoCached() {
            w0.c(l.this.f39680d, "rewardVideoAd video cached");
            l.this.f39720p = true;
            l lVar = l.this;
            lVar.f39686j = false;
            lVar.onVideoCached();
            l.this.b(this.f39724a);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
        public void success() {
            l.this.onInitSuccess();
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
        public void onRewardVideoCached(TTRewardVideoAd tTRewardVideoAd) {
            l.this.f39720p = true;
            l lVar = l.this;
            lVar.f39686j = false;
            lVar.f39718n = tTRewardVideoAd;
            l.this.onVideoCached();
        }
    }
}
