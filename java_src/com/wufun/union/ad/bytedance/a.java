package com.wufun.union.ad.bytedance;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdConfig;
import com.bytedance.sdk.openadsdk.TTAdLoadType;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.wufun.union.ad.AdChannel;
import com.wufun.union.ad.AdService;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ChannelTT.java */
/* loaded from: classes6.dex */
public class a extends AdChannel {

    /* renamed from: m  reason: collision with root package name */
    public static final int f65600m = 0;

    /* renamed from: n  reason: collision with root package name */
    public static final int f65601n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f65602o = 2;

    /* renamed from: p  reason: collision with root package name */
    public static final int f65603p = 3;

    /* renamed from: q  reason: collision with root package name */
    public static final int f65604q = 4;

    /* renamed from: r  reason: collision with root package name */
    public static final int f65605r = 5;

    /* renamed from: s  reason: collision with root package name */
    public static final int f65606s = 6;

    /* renamed from: t  reason: collision with root package name */
    public static final int f65607t = 7;

    /* renamed from: u  reason: collision with root package name */
    public static final int f65608u = 8;

    /* renamed from: j  reason: collision with root package name */
    private boolean f65609j = false;

    /* renamed from: k  reason: collision with root package name */
    TTAdNative f65610k;

    /* renamed from: l  reason: collision with root package name */
    TTRewardVideoAd f65611l;

    /* compiled from: ChannelTT.java */
    /* renamed from: com.wufun.union.ad.bytedance.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    class C0687a implements TTAdSdk.InitCallback {
        C0687a() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
        public void fail(int i4, String str) {
            ((AdChannel) a.this).f65577b = false;
            a aVar = a.this;
            Boolean bool = Boolean.FALSE;
            aVar.i(0, bool, "[" + i4 + ", " + str + "]");
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
        public void success() {
            ((AdChannel) a.this).f65577b = true;
            a.this.i(0, Boolean.TRUE, "");
        }
    }

    /* compiled from: ChannelTT.java */
    /* loaded from: classes6.dex */
    class b implements TTAdNative.RewardVideoAdListener {
        b() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
        public void onError(int i4, String str) {
            a aVar = a.this;
            Boolean bool = Boolean.FALSE;
            aVar.i(1, bool, "[" + i4 + ", " + str + "]");
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
        public void onRewardVideoAdLoad(TTRewardVideoAd tTRewardVideoAd) {
            a aVar = a.this;
            aVar.f65611l = tTRewardVideoAd;
            ((AdChannel) aVar).f65576a = true;
            a.this.i(1, Boolean.TRUE, "");
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
        public void onRewardVideoCached() {
            ((AdChannel) a.this).f65576a = true;
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
        public void onRewardVideoCached(TTRewardVideoAd tTRewardVideoAd) {
            a aVar = a.this;
            aVar.f65611l = tTRewardVideoAd;
            ((AdChannel) aVar).f65576a = true;
        }
    }

    /* compiled from: ChannelTT.java */
    /* loaded from: classes6.dex */
    class c implements TTRewardVideoAd.RewardAdInteractionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f65614a;

        c(Activity activity) {
            this.f65614a = activity;
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onAdClose() {
            try {
                this.f65614a.finish();
                a.this.i(6, Boolean.TRUE, "");
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onAdShow() {
            a.this.i(3, Boolean.TRUE, "");
            Context context = ((AdChannel) a.this).f65580e;
            String str = ((AdChannel) a.this).f65584i;
            AdService.i(context, str, "smallExpAdSDK", ((AdChannel) a.this).f65582g + "");
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onAdVideoBarClick() {
            a.this.i(5, Boolean.TRUE, "");
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onRewardArrived(boolean z4, int i4, Bundle bundle) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("isRewardValid", Boolean.valueOf(z4));
                jSONObject.putOpt(MediationConstant.KEY_REWARD_TYPE, Integer.valueOf(i4));
                com.wufun.union.ad.bytedance.b bVar = new com.wufun.union.ad.bytedance.b(bundle);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("rewardAmount", Integer.valueOf(bVar.a()));
                jSONObject2.putOpt("rewardName", bVar.b());
                jSONObject2.putOpt("rewardPropose", Float.valueOf(bVar.c()));
                jSONObject2.putOpt(MediationConstant.KEY_ERROR_CODE, Integer.valueOf(bVar.d()));
                jSONObject2.putOpt(MediationConstant.KEY_ERROR_MSG, bVar.e());
                jSONObject.putOpt(MediationConstant.KEY_EXTRA_INFO, jSONObject2);
                a.this.i(8, Boolean.TRUE, jSONObject.toString());
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onRewardVerify(boolean z4, int i4, String str, int i5, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("rewardVerify", Boolean.valueOf(z4));
                jSONObject.putOpt("rewardAmount", Integer.valueOf(i4));
                jSONObject.putOpt("rewardName", str);
                jSONObject.putOpt("code", Integer.valueOf(i5));
                jSONObject.putOpt("msg", str2);
                a.this.i(7, Boolean.TRUE, jSONObject.toString());
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onSkippedVideo() {
            a.this.i(4, Boolean.TRUE, "");
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onVideoComplete() {
            a.this.i(2, Boolean.TRUE, "");
            Context context = ((AdChannel) a.this).f65580e;
            String str = ((AdChannel) a.this).f65584i;
            AdService.i(context, str, "smallVideoDoneAdSDK", ((AdChannel) a.this).f65582g + "");
        }

        @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
        public void onVideoError() {
            a.this.i(2, Boolean.FALSE, "");
        }
    }

    public a() {
        this.f65578c = AdChannel.Type.TT;
    }

    @Override // com.wufun.union.ad.AdChannel
    public void d(Context context, String str) {
        this.f65580e = context;
        TTAdSdk.init(context, new TTAdConfig.Builder().appId(str).useTextureView(true).appName("悟饭游戏厅_android").titleBarTheme(0).directDownloadNetworkType(4, 3, 5).supportMultiProcess(true).allowShowNotify(true).build(), new C0687a());
        this.f65610k = TTAdSdk.getAdManager().createAdNative(context);
    }

    @Override // com.wufun.union.ad.AdChannel
    public void h(String str, float f5, float f6) {
        if (this.f65610k != null && TTAdSdk.isInitSuccess()) {
            if (TextUtils.isEmpty(str)) {
                i(1, Boolean.FALSE, "ad code id is must not null");
                return;
            }
            this.f65583h = str;
            this.f65610k.loadRewardVideoAd(new AdSlot.Builder().setCodeId(str).setExpressViewAcceptedSize(f5, f6).setOrientation(2).setAdLoadType(TTAdLoadType.PRELOAD).build(), new b());
            return;
        }
        i(1, Boolean.FALSE, "ad sdk not init");
    }

    @Override // com.wufun.union.ad.AdChannel
    public void m(Activity activity) {
        if (activity == null) {
            return;
        }
        if (this.f65611l != null && this.f65576a) {
            c cVar = new c(activity);
            this.f65611l.setRewardAdInteractionListener(cVar);
            this.f65611l.setRewardPlayAgainInteractionListener(cVar);
            this.f65611l.showRewardVideoAd(activity);
            this.f65611l = null;
            this.f65576a = false;
            if (!this.f65609j || TextUtils.isEmpty(this.f65583h)) {
                return;
            }
            g(this.f65583h);
        } else if (TextUtils.isEmpty(this.f65583h)) {
        } else {
            g(this.f65583h);
        }
    }
}
