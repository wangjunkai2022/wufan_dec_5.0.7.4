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
import com.qq.e.comm.managers.setting.GlobalSetting;
import java.util.Map;
/* compiled from: TTRewardVideo.java */
/* loaded from: classes.dex */
public class z extends d {

    /* renamed from: m  reason: collision with root package name */
    private TTAdNative f39752m;

    /* renamed from: n  reason: collision with root package name */
    private TTRewardVideoAd f39753n;

    /* renamed from: o  reason: collision with root package name */
    private AdSlot f39754o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f39755p;

    /* renamed from: q  reason: collision with root package name */
    private b f39756q;

    /* renamed from: r  reason: collision with root package name */
    private TTRewardVideoAd.RewardAdInteractionListener f39757r;

    /* compiled from: TTRewardVideo.java */
    /* loaded from: classes4.dex */
    class a implements TTRewardVideoAd.RewardAdInteractionListener {
        a() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onAdClose() {
            d.i(z.this.f39677a, 3);
            z.this.onADClose();
            z zVar = z.this;
            zVar.c(zVar.f39682f);
            z zVar2 = z.this;
            zVar2.a(zVar2.f39682f, zVar2.f39683g, zVar2.f39684h);
            z zVar3 = z.this;
            zVar3.d(zVar3.f39682f, zVar3.f39683g, zVar3.f39684h, zVar3.f39687k);
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onAdShow() {
            z.this.f39755p = false;
            d.i(z.this.f39677a, 1);
            z.this.onADShow();
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onAdVideoBarClick() {
            d.i(z.this.f39677a, 2);
            w0.c(z.this.f39680d, "rewardVideoAd bar click");
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onRewardArrived(boolean z4, int i4, Bundle bundle) {
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onRewardVerify(boolean z4, int i4, String str, int i5, String str2) {
            String str3 = z.this.f39680d;
            w0.c(str3, "verify:" + z4 + " amount:" + i4 + " name:" + str);
            d.i(z.this.f39677a, 6);
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onSkippedVideo() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onVideoComplete() {
            d.i(z.this.f39677a, 4);
            z.this.onVideoComplete();
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onVideoError() {
            z zVar = z.this;
            Map<String, Object> map = zVar.f39687k;
            if (map != null) {
                d.j(zVar.f39677a, 5, map);
            } else {
                d.i(zVar.f39677a, 5);
            }
        }
    }

    public z(Context context, String str, String str2) {
        super(GlobalSetting.TT_SDK_WRAPPER, context, str, str2);
        this.f39755p = false;
    }

    private void x(boolean z4) {
        this.f39754o = new AdSlot.Builder().setCodeId(this.f39679c).setAdCount(1).setImageAcceptedSize(1080, 1920).setAdLoadType(z4 ? TTAdLoadType.LOAD : TTAdLoadType.PRELOAD).setUserID("user123").setMediaExtra("media_extra").build();
    }

    @Override // com.join.mgps.ad.d
    public void e() {
        if (this.f39756q == null) {
            this.f39756q = new b();
        }
        com.join.mgps.ad.adapter.e.d(this.f39677a, this.f39678b, new s1.a() { // from class: com.join.mgps.ad.y
            @Override // s1.a
            public final void a() {
                z.this.onInitSuccess();
            }
        });
    }

    @Override // com.join.mgps.ad.d
    protected boolean f() {
        if (d.f39676l) {
            StringBuilder sb = new StringBuilder();
            sb.append("RewardVideoAd:");
            sb.append(this.f39753n != null);
            sb.append("hasLoaded:");
            sb.append(this.f39755p);
        }
        return this.f39753n != null && this.f39755p;
    }

    @Override // com.join.mgps.ad.d
    public void h(boolean z4) {
        try {
            this.f39755p = false;
            if (d.f39676l) {
                StringBuilder sb = new StringBuilder();
                sb.append("load:");
                sb.append(z4);
            }
            x(z4);
            if (this.f39756q == null) {
                this.f39756q = new b();
            }
            this.f39756q.a(z4);
            if (this.f39686j) {
                return;
            }
            this.f39686j = true;
            if (this.f39752m == null && TTAdSdk.getAdManager() != null) {
                this.f39752m = TTAdSdk.getAdManager().createAdNative(this.f39677a);
            }
            TTAdNative tTAdNative = this.f39752m;
            if (tTAdNative != null) {
                tTAdNative.loadRewardVideoAd(this.f39754o, this.f39756q);
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
        if (this.f39757r == null) {
            this.f39757r = new a();
        }
        this.f39753n.setRewardAdInteractionListener(this.f39757r);
        this.f39753n.showRewardVideoAd(activity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TTRewardVideo.java */
    /* loaded from: classes4.dex */
    public class b implements TTAdNative.RewardVideoAdListener, TTAdSdk.InitCallback {

        /* renamed from: a  reason: collision with root package name */
        boolean f39759a = false;

        b() {
        }

        public void a(boolean z4) {
            this.f39759a = z4;
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
        public void fail(int i4, String str) {
            z zVar = z.this;
            Map<String, Object> map = zVar.f39687k;
            if (map != null) {
                d.j(zVar.f39677a, 5, map);
            } else {
                d.i(zVar.f39677a, 5);
            }
            z.this.onError(i4, str);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
        public void onError(int i4, String str) {
            z.this.f39755p = false;
            z zVar = z.this;
            zVar.f39686j = false;
            Map<String, Object> map = zVar.f39687k;
            if (map != null) {
                d.j(zVar.f39677a, 5, map);
            } else {
                d.i(zVar.f39677a, 5);
            }
            z.this.onError(i4, str);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
        public void onRewardVideoAdLoad(TTRewardVideoAd tTRewardVideoAd) {
            w0.c(z.this.f39680d, "rewardVideoAd loaded");
            z.this.f39755p = true;
            z zVar = z.this;
            zVar.f39686j = false;
            zVar.f39753n = tTRewardVideoAd;
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
        public void onRewardVideoCached() {
            w0.c(z.this.f39680d, "rewardVideoAd video cached");
            z.this.f39755p = true;
            z zVar = z.this;
            zVar.f39686j = false;
            zVar.onVideoCached();
            z.this.b(this.f39759a);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
        public void success() {
            z.this.onInitSuccess();
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
        public void onRewardVideoCached(TTRewardVideoAd tTRewardVideoAd) {
            z.this.f39755p = true;
            z zVar = z.this;
            zVar.f39686j = false;
            zVar.f39753n = tTRewardVideoAd;
            z.this.onVideoCached();
        }
    }
}
