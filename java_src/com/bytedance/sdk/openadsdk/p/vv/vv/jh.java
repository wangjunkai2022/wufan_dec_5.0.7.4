package com.bytedance.sdk.openadsdk.p.vv.vv;

import android.app.Activity;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdInteractionListener;
import com.bytedance.sdk.openadsdk.TTAppDownloadListener;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationFullScreenManager;
import java.util.Map;
/* loaded from: classes2.dex */
public class jh implements TTFullScreenVideoAd {
    private final Bridge vv;

    public jh(Bridge bridge) {
        this.vv = bridge == null ? a.f8191d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public long getExpirationTimestamp() {
        return this.vv.values().longValue(130004);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public int getFullVideoAdType() {
        return this.vv.values().intValue(130003);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public int getInteractionType() {
        return this.vv.values().intValue(130001);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public Map<String, Object> getMediaExtraInfo() {
        return (Map) this.vv.values().objectValue(130002, Map.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public MediationFullScreenManager getMediationManager() {
        return new com.bytedance.sdk.openadsdk.mediation.manager.vv.vv.vv.p((Bridge) this.vv.call(130106, a.c(0).a(), Bridge.class));
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

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public void setDownloadListener(TTAppDownloadListener tTAppDownloadListener) {
        a c5 = a.c(1);
        c5.h(0, new com.bytedance.sdk.openadsdk.p.vv.m.m(tTAppDownloadListener));
        this.vv.call(130102, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public void setFullScreenVideoAdInteractionListener(TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener) {
        a c5 = a.c(1);
        c5.h(0, new com.bytedance.sdk.openadsdk.k.vv.vv.vv.vv(fullScreenVideoAdInteractionListener));
        this.vv.call(130101, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void setPrice(Double d5) {
        a c5 = a.c(1);
        c5.h(0, d5);
        this.vv.call(210103, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public void setShowDownLoadBar(boolean z4) {
        a c5 = a.c(1);
        c5.j(0, z4);
        this.vv.call(130105, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public void showFullScreenVideoAd(Activity activity) {
        a c5 = a.c(1);
        c5.h(0, activity);
        this.vv.call(130103, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d5) {
        a c5 = a.c(1);
        c5.h(0, d5);
        this.vv.call(210101, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public void showFullScreenVideoAd(Activity activity, TTAdConstant.RitScenes ritScenes, String str) {
        a c5 = a.c(3);
        c5.h(0, activity);
        c5.h(1, ritScenes);
        c5.i(2, str);
        this.vv.call(130104, c5.a(), Void.class);
    }
}
