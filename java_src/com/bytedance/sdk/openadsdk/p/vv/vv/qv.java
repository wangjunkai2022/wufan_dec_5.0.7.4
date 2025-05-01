package com.bytedance.sdk.openadsdk.p.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTAdDislike;
/* loaded from: classes2.dex */
public class qv implements TTAdDislike {
    private final Bridge vv;

    public qv(Bridge bridge) {
        this.vv = bridge == null ? a.f8191d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdDislike
    public boolean isShow() {
        return ((Boolean) this.vv.call(240105, a.c(0).a(), Boolean.TYPE)).booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdDislike
    public void resetDislikeStatus() {
        this.vv.call(240104, a.c(0).a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdDislike
    public void setDislikeInteractionCallback(TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
        a c5 = a.c(1);
        c5.h(0, new com.bytedance.sdk.openadsdk.u.vv.vv.vv.vv(dislikeInteractionCallback));
        this.vv.call(240102, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdDislike
    public void setDislikeSource(String str) {
        a c5 = a.c(1);
        c5.i(0, str);
        this.vv.call(240103, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdDislike
    public void showDislikeDialog() {
        this.vv.call(240101, a.c(0).a(), Void.class);
    }
}
