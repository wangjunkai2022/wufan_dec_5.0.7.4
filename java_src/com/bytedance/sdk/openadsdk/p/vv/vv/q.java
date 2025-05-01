package com.bytedance.sdk.openadsdk.p.vv.vv;

import android.app.Activity;
import android.view.View;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.DislikeInfo;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdInteractionListener;
import com.bytedance.sdk.openadsdk.TTAppDownloadListener;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationNativeManager;
import java.util.Map;
/* loaded from: classes2.dex */
public class q implements TTNativeExpressAd {
    private final Bridge vv;

    public q(Bridge bridge) {
        this.vv = bridge == null ? a.f8191d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void destroy() {
        this.vv.call(150105, a.c(0).a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public TTAdDislike getDislikeDialog(Activity activity) {
        a c5 = a.c(1);
        c5.h(0, activity);
        return new qv((Bridge) this.vv.call(150108, c5.a(), Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public DislikeInfo getDislikeInfo() {
        return new i((Bridge) this.vv.values().objectValue(150003, Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public View getExpressAdView() {
        return (View) this.vv.values().objectValue(150001, View.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public int getImageMode() {
        return this.vv.values().intValue(150002);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public int getInteractionType() {
        return this.vv.values().intValue(150004);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public Map<String, Object> getMediaExtraInfo() {
        return (Map) this.vv.values().objectValue(150005, Map.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public MediationNativeManager getMediationManager() {
        return new com.bytedance.sdk.openadsdk.mediation.manager.vv.vv.vv.i((Bridge) this.vv.call(150113, a.c(0).a(), Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d5, String str, String str2) {
        a c5 = a.c(3);
        c5.h(0, d5);
        c5.i(1, str);
        c5.i(2, str2);
        this.vv.call(210102, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void render() {
        this.vv.call(150104, a.c(0).a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void setAdInteractionListener(TTAdInteractionListener tTAdInteractionListener) {
        a c5 = a.c(1);
        c5.h(0, new com.bytedance.sdk.openadsdk.p.vv.m.vv(tTAdInteractionListener));
        this.vv.call(210104, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setCanInterruptVideoPlay(boolean z4) {
        a c5 = a.c(1);
        c5.j(0, z4);
        this.vv.call(150112, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setDislikeCallback(Activity activity, TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
        a c5 = a.c(2);
        c5.h(0, activity);
        c5.h(1, new com.bytedance.sdk.openadsdk.u.vv.vv.vv.vv(dislikeInteractionCallback));
        this.vv.call(150106, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setDislikeDialog(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        a c5 = a.c(1);
        c5.h(0, tTDislikeDialogAbstract);
        this.vv.call(150107, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setDownloadListener(TTAppDownloadListener tTAppDownloadListener) {
        a c5 = a.c(1);
        c5.h(0, new com.bytedance.sdk.openadsdk.p.vv.m.m(tTAppDownloadListener));
        this.vv.call(150103, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setExpressInteractionListener(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
        a c5 = a.c(1);
        c5.h(0, new com.bytedance.sdk.openadsdk.jh.vv.vv.vv.m(expressAdInteractionListener));
        this.vv.call(150101, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void setPrice(Double d5) {
        a c5 = a.c(1);
        c5.h(0, d5);
        this.vv.call(210103, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setSlideIntervalTime(int i4) {
        a c5 = a.c(1);
        c5.f(0, i4);
        this.vv.call(150110, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setVideoAdListener(TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener) {
        a c5 = a.c(1);
        c5.h(0, new com.bytedance.sdk.openadsdk.jh.vv.vv.vv.p(expressVideoAdListener));
        this.vv.call(150111, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void showInteractionExpressAd(Activity activity) {
        a c5 = a.c(1);
        c5.h(0, activity);
        this.vv.call(150109, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void uploadDislikeEvent(String str) {
        a c5 = a.c(1);
        c5.i(0, str);
        this.vv.call(150114, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d5) {
        a c5 = a.c(1);
        c5.h(0, d5);
        this.vv.call(210101, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setExpressInteractionListener(TTNativeExpressAd.AdInteractionListener adInteractionListener) {
        a c5 = a.c(1);
        c5.h(0, new com.bytedance.sdk.openadsdk.jh.vv.vv.vv.vv(adInteractionListener));
        this.vv.call(150102, c5.a(), Void.class);
    }
}
