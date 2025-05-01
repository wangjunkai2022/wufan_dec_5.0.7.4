package com.bytedance.sdk.openadsdk.p.vv.vv;

import android.app.Activity;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdInteractionListener;
import com.bytedance.sdk.openadsdk.TTAppDownloadListener;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationRewardManager;
import java.util.Map;
/* loaded from: classes2.dex */
public class j implements TTRewardVideoAd {
    private final Bridge vv;

    public j(Bridge bridge) {
        this.vv = bridge == null ? a.f8191d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public long getExpirationTimestamp() {
        return this.vv.values().longValue(120004);
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public int getInteractionType() {
        return this.vv.values().intValue(120001);
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public Map<String, Object> getMediaExtraInfo() {
        return (Map) this.vv.values().objectValue(120002, Map.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public MediationRewardManager getMediationManager() {
        return new com.bytedance.sdk.openadsdk.mediation.manager.vv.vv.vv.o((Bridge) this.vv.call(121109, a.c(0).a(), Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public int getRewardVideoAdType() {
        return this.vv.values().intValue(120003);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d5, String str, String str2) {
        a c5 = a.c(3);
        c5.h(0, d5);
        c5.i(1, str);
        c5.i(2, str2);
        this.vv.call(210102, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void setAdInteractionListener(TTAdInteractionListener tTAdInteractionListener) {
        a c5 = a.c(1);
        c5.h(0, new com.bytedance.sdk.openadsdk.p.vv.m.vv(tTAdInteractionListener));
        this.vv.call(210104, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public void setDownloadListener(TTAppDownloadListener tTAppDownloadListener) {
        a c5 = a.c(1);
        c5.h(0, new com.bytedance.sdk.openadsdk.p.vv.m.m(tTAppDownloadListener));
        this.vv.call(120104, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void setPrice(Double d5) {
        a c5 = a.c(1);
        c5.h(0, d5);
        this.vv.call(210103, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public void setRewardAdInteractionListener(TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener) {
        a c5 = a.c(1);
        c5.h(0, new com.bytedance.sdk.openadsdk.r.vv.vv.vv.vv(rewardAdInteractionListener));
        this.vv.call(120101, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public void setRewardPlayAgainController(TTRewardVideoAd.RewardAdPlayAgainController rewardAdPlayAgainController) {
        a c5 = a.c(1);
        c5.h(0, new com.bytedance.sdk.openadsdk.r.vv.vv.vv.m(rewardAdPlayAgainController));
        this.vv.call(120103, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public void setRewardPlayAgainInteractionListener(TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener) {
        a c5 = a.c(1);
        c5.h(0, new com.bytedance.sdk.openadsdk.r.vv.vv.vv.vv(rewardAdInteractionListener));
        this.vv.call(120102, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public void setShowDownLoadBar(boolean z4) {
        a c5 = a.c(1);
        c5.j(0, z4);
        this.vv.call(120107, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public void showRewardVideoAd(Activity activity) {
        a c5 = a.c(1);
        c5.h(0, activity);
        this.vv.call(120105, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d5) {
        a c5 = a.c(1);
        c5.h(0, d5);
        this.vv.call(210101, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd
    public void showRewardVideoAd(Activity activity, TTAdConstant.RitScenes ritScenes, String str) {
        a c5 = a.c(3);
        c5.h(0, activity);
        c5.h(1, ritScenes);
        c5.i(2, str);
        this.vv.call(120106, c5.a(), Void.class);
    }
}
