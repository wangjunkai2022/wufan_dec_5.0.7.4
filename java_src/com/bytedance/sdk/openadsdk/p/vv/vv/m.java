package com.bytedance.sdk.openadsdk.p.vv.vv;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.CSJSplashAd;
import com.bytedance.sdk.openadsdk.TTAdInteractionListener;
import com.bytedance.sdk.openadsdk.TTAppDownloadListener;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationSplashManager;
import java.util.Map;
/* loaded from: classes2.dex */
public class m implements CSJSplashAd {
    private final Bridge vv;

    public m(Bridge bridge) {
        this.vv = bridge == null ? a.f8191d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public int getInteractionType() {
        return this.vv.values().intValue(110004);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public Map<String, Object> getMediaExtraInfo() {
        return (Map) this.vv.values().objectValue(110005, Map.class);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public MediationSplashManager getMediationManager() {
        return new com.bytedance.sdk.openadsdk.mediation.manager.vv.vv.vv.u((Bridge) this.vv.call(110110, a.c(0).a(), Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public View getSplashCardView() {
        return (View) this.vv.values().objectValue(110003, View.class);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public int[] getSplashClickEyeSizeToDp() {
        return (int[]) this.vv.values().objectValue(110006, int[].class);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public View getSplashClickEyeView() {
        return (View) this.vv.values().objectValue(110002, View.class);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public View getSplashView() {
        return (View) this.vv.values().objectValue(110001, View.class);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public void hideSkipButton() {
        this.vv.call(110101, a.c(0).a(), Void.class);
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

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public void setDownloadListener(TTAppDownloadListener tTAppDownloadListener) {
        a c5 = a.c(1);
        c5.h(0, new com.bytedance.sdk.openadsdk.p.vv.m.m(tTAppDownloadListener));
        this.vv.call(110102, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void setPrice(Double d5) {
        a c5 = a.c(1);
        c5.h(0, d5);
        this.vv.call(210103, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public void setSplashAdListener(CSJSplashAd.SplashAdListener splashAdListener) {
        a c5 = a.c(1);
        c5.h(0, new com.bytedance.sdk.openadsdk.m.vv.vv.vv.vv(splashAdListener));
        this.vv.call(110103, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public void setSplashCardListener(CSJSplashAd.SplashCardListener splashCardListener) {
        a c5 = a.c(1);
        c5.h(0, new com.bytedance.sdk.openadsdk.m.vv.vv.vv.m(splashCardListener));
        this.vv.call(110106, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public void setSplashClickEyeListener(CSJSplashAd.SplashClickEyeListener splashClickEyeListener) {
        a c5 = a.c(1);
        c5.h(0, new com.bytedance.sdk.openadsdk.m.vv.vv.vv.p(splashClickEyeListener));
        this.vv.call(110105, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public void showSplashCardView(ViewGroup viewGroup, Activity activity) {
        a c5 = a.c(2);
        c5.h(0, viewGroup);
        c5.h(1, activity);
        this.vv.call(110109, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public void showSplashClickEyeView(ViewGroup viewGroup) {
        a c5 = a.c(1);
        c5.h(0, viewGroup);
        this.vv.call(110107, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public void showSplashView(ViewGroup viewGroup) {
        a c5 = a.c(1);
        c5.h(0, viewGroup);
        this.vv.call(110108, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.CSJSplashAd
    public void startClickEye() {
        this.vv.call(110104, a.c(0).a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d5) {
        a c5 = a.c(1);
        c5.h(0, d5);
        this.vv.call(210101, c5.a(), Void.class);
    }
}
