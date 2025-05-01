package com.bytedance.sdk.openadsdk.wv.vv.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTFeedAd;
/* loaded from: classes2.dex */
public class vv implements TTFeedAd.CustomizeVideo {
    private final Bridge vv;

    public vv(Bridge bridge) {
        this.vv = bridge == null ? a.f8191d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd.CustomizeVideo
    public String getVideoUrl() {
        return (String) this.vv.call(162101, a.c(0).a(), String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd.CustomizeVideo
    public void reportVideoAutoStart() {
        this.vv.call(162107, a.c(0).a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd.CustomizeVideo
    public void reportVideoBreak(long j4) {
        a c5 = a.c(1);
        c5.g(0, j4);
        this.vv.call(162106, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd.CustomizeVideo
    public void reportVideoContinue(long j4) {
        a c5 = a.c(1);
        c5.g(0, j4);
        this.vv.call(162104, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd.CustomizeVideo
    public void reportVideoError(long j4, int i4, int i5) {
        a c5 = a.c(3);
        c5.g(0, j4);
        c5.f(1, i4);
        c5.f(2, i5);
        this.vv.call(162109, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd.CustomizeVideo
    public void reportVideoFinish() {
        this.vv.call(162105, a.c(0).a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd.CustomizeVideo
    public void reportVideoPause(long j4) {
        a c5 = a.c(1);
        c5.g(0, j4);
        this.vv.call(162103, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd.CustomizeVideo
    public void reportVideoStart() {
        this.vv.call(162102, a.c(0).a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTFeedAd.CustomizeVideo
    public void reportVideoStartError(int i4, int i5) {
        a c5 = a.c(2);
        c5.f(0, i4);
        c5.f(1, i5);
        this.vv.call(162108, c5.a(), Void.class);
    }
}
