package com.bytedance.sdk.openadsdk.p.vv.vv;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.ComplianceInfo;
import com.bytedance.sdk.openadsdk.DislikeInfo;
import com.bytedance.sdk.openadsdk.DownloadStatusController;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdInteractionListener;
import com.bytedance.sdk.openadsdk.TTAppDownloadListener;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.TTImage;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationViewBinder;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationNativeManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class b implements TTFeedAd {
    private final Bridge vv;

    public b(Bridge bridge) {
        this.vv = bridge == null ? a.f8191d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void destroy() {
        this.vv.call(140114, a.c(0).a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public Bitmap getAdLogo() {
        return (Bitmap) this.vv.values().objectValue(140002, Bitmap.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public View getAdView() {
        return (View) this.vv.values().objectValue(140016, View.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd
    public int getAdViewHeight() {
        return this.vv.values().intValue(160004);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd
    public int getAdViewWidth() {
        return this.vv.values().intValue(160003);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public int getAppCommentNum() {
        return this.vv.values().intValue(140006);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public int getAppScore() {
        return this.vv.values().intValue(140005);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public int getAppSize() {
        return this.vv.values().intValue(140007);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public String getButtonText() {
        return (String) this.vv.values().objectValue(140018, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public ComplianceInfo getComplianceInfo() {
        return new p((Bridge) this.vv.values().objectValue(140014, Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd
    public TTFeedAd.CustomizeVideo getCustomVideo() {
        return new com.bytedance.sdk.openadsdk.wv.vv.vv.vv.vv((Bridge) this.vv.values().objectValue(160002, Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public String getDescription() {
        return (String) this.vv.values().objectValue(140004, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public TTAdDislike getDislikeDialog(Activity activity) {
        a c5 = a.c(1);
        c5.h(0, activity);
        return new qv((Bridge) this.vv.call(140101, c5.a(), Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public DislikeInfo getDislikeInfo() {
        return new i((Bridge) this.vv.values().objectValue(140013, Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public DownloadStatusController getDownloadStatusController() {
        return new o((Bridge) this.vv.values().objectValue(140015, Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public TTImage getIcon() {
        return new r((Bridge) this.vv.values().objectValue(140009, Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public List<TTImage> getImageList() {
        List<Bridge> list = (List) this.vv.values().objectValue(140010, List.class);
        if (list == null) {
            list = new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList();
        for (Bridge bridge : list) {
            arrayList.add(new r(bridge));
        }
        return arrayList;
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public int getImageMode() {
        return this.vv.values().intValue(140012);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public int getInteractionType() {
        return this.vv.values().intValue(140011);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public Map<String, Object> getMediaExtraInfo() {
        return (Map) this.vv.values().objectValue(140017, Map.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public MediationNativeManager getMediationManager() {
        return new com.bytedance.sdk.openadsdk.mediation.manager.vv.vv.vv.i((Bridge) this.vv.call(140116, a.c(0).a(), Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public String getSource() {
        return (String) this.vv.values().objectValue(140008, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public String getTitle() {
        return (String) this.vv.values().objectValue(140003, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public TTImage getVideoCoverImage() {
        return new r((Bridge) this.vv.values().objectValue(140001, Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd
    public double getVideoDuration() {
        return this.vv.values().doubleValue(160001);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d5, String str, String str2) {
        a c5 = a.c(3);
        c5.h(0, d5);
        c5.i(1, str);
        c5.i(2, str2);
        this.vv.call(210102, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, View view, TTNativeAd.AdInteractionListener adInteractionListener) {
        a c5 = a.c(3);
        c5.h(0, viewGroup);
        c5.h(1, view);
        c5.h(2, new com.bytedance.sdk.openadsdk.b.vv.vv.vv.vv(adInteractionListener));
        this.vv.call(140103, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void render() {
        this.vv.call(140110, a.c(0).a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void setActivityForDownloadApp(Activity activity) {
        a c5 = a.c(1);
        c5.h(0, activity);
        this.vv.call(140109, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void setAdInteractionListener(TTAdInteractionListener tTAdInteractionListener) {
        a c5 = a.c(1);
        c5.h(0, new com.bytedance.sdk.openadsdk.p.vv.m.vv(tTAdInteractionListener));
        this.vv.call(210104, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void setDislikeCallback(Activity activity, TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
        a c5 = a.c(2);
        c5.h(0, activity);
        c5.h(1, new com.bytedance.sdk.openadsdk.u.vv.vv.vv.vv(dislikeInteractionCallback));
        this.vv.call(140112, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void setDislikeDialog(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        a c5 = a.c(1);
        c5.h(0, tTDislikeDialogAbstract);
        this.vv.call(140113, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void setDownloadListener(TTAppDownloadListener tTAppDownloadListener) {
        a c5 = a.c(1);
        c5.h(0, new com.bytedance.sdk.openadsdk.p.vv.m.m(tTAppDownloadListener));
        this.vv.call(140108, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void setExpressRenderListener(TTNativeAd.ExpressRenderListener expressRenderListener) {
        a c5 = a.c(1);
        c5.h(0, new com.bytedance.sdk.openadsdk.b.vv.vv.vv.m(expressRenderListener));
        this.vv.call(140111, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void setPrice(Double d5) {
        a c5 = a.c(1);
        c5.h(0, d5);
        this.vv.call(210103, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd
    public void setVideoAdListener(TTFeedAd.VideoAdListener videoAdListener) {
        a c5 = a.c(1);
        c5.h(0, new com.bytedance.sdk.openadsdk.wv.vv.vv.m.vv(videoAdListener));
        this.vv.call(160101, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd
    public void setVideoRewardListener(TTFeedAd.VideoRewardListener videoRewardListener) {
        a c5 = a.c(1);
        c5.h(0, new com.bytedance.sdk.openadsdk.wv.vv.vv.m.m(videoRewardListener));
        this.vv.call(160102, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void showInteractionExpressAd(Activity activity) {
        a c5 = a.c(1);
        c5.h(0, activity);
        this.vv.call(140115, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void uploadDislikeEvent(String str) {
        a c5 = a.c(1);
        c5.i(0, str);
        this.vv.call(140118, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d5) {
        a c5 = a.c(1);
        c5.h(0, d5);
        this.vv.call(210101, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public TTAdDislike getDislikeDialog(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        a c5 = a.c(1);
        c5.h(0, tTDislikeDialogAbstract);
        return new qv((Bridge) this.vv.call(140102, c5.a(), Bridge.class));
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, TTNativeAd.AdInteractionListener adInteractionListener) {
        a c5 = a.c(4);
        c5.h(0, viewGroup);
        c5.h(1, list);
        c5.h(2, list2);
        c5.h(3, new com.bytedance.sdk.openadsdk.b.vv.vv.vv.vv(adInteractionListener));
        this.vv.call(140104, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, TTNativeAd.AdInteractionListener adInteractionListener) {
        a c5 = a.c(5);
        c5.h(0, viewGroup);
        c5.h(1, list);
        c5.h(2, list2);
        c5.h(3, view);
        c5.h(4, new com.bytedance.sdk.openadsdk.b.vv.vv.vv.vv(adInteractionListener));
        this.vv.call(140105, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, View view, TTNativeAd.AdInteractionListener adInteractionListener) {
        a c5 = a.c(6);
        c5.h(0, viewGroup);
        c5.h(1, list);
        c5.h(2, list2);
        c5.h(3, list3);
        c5.h(4, view);
        c5.h(5, new com.bytedance.sdk.openadsdk.b.vv.vv.vv.vv(adInteractionListener));
        this.vv.call(140106, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, List<View> list4, View view, TTNativeAd.AdInteractionListener adInteractionListener) {
        a c5 = a.c(7);
        c5.h(0, viewGroup);
        c5.h(1, list);
        c5.h(2, list2);
        c5.h(3, list3);
        c5.h(4, list4);
        c5.h(5, view);
        c5.h(6, new com.bytedance.sdk.openadsdk.b.vv.vv.vv.vv(adInteractionListener));
        this.vv.call(140107, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void registerViewForInteraction(Activity activity, ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, TTNativeAd.AdInteractionListener adInteractionListener, IMediationViewBinder iMediationViewBinder) {
        a c5 = a.c(7);
        c5.h(0, activity);
        c5.h(1, viewGroup);
        c5.h(2, list);
        c5.h(3, list2);
        c5.h(4, list3);
        c5.h(5, new com.bytedance.sdk.openadsdk.b.vv.vv.vv.vv(adInteractionListener));
        c5.h(6, new com.bytedance.sdk.openadsdk.mediation.ad.vv.vv.m.o(iMediationViewBinder));
        this.vv.call(140117, c5.a(), Void.class);
    }
}
