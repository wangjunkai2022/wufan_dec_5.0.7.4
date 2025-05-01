package com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo;
import com.kwad.sdk.api.KsNativeAd;
/* loaded from: classes2.dex */
public class c implements Bridge, IMediationCustomizeVideo {

    /* renamed from: b  reason: collision with root package name */
    private KsNativeAd f1556b;

    public c(KsNativeAd ksNativeAd) {
        this.f1556b = ksNativeAd;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (i4 == 8165) {
            reportVideoStart();
            return null;
        } else if (i4 == 8168) {
            reportVideoFinish();
            return null;
        } else {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
    public String getVideoUrl() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
    public void reportVideoAutoStart() {
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
    public void reportVideoBreak(long j4) {
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
    public void reportVideoContinue(long j4) {
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
    public void reportVideoError(long j4, int i4, int i5) {
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
    public void reportVideoFinish() {
        KsNativeAd ksNativeAd = this.f1556b;
        if (ksNativeAd != null) {
            ksNativeAd.reportAdVideoPlayEnd();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
    public void reportVideoPause(long j4) {
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
    public void reportVideoStart() {
        KsNativeAd ksNativeAd = this.f1556b;
        if (ksNativeAd != null) {
            ksNativeAd.reportAdVideoPlayStart();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo
    public void reportVideoStartError(int i4, int i5) {
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return null;
    }
}
