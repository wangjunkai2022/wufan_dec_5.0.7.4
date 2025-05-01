package com.bytedance.sdk.openadsdk.mediation.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationDislikeCallback;
/* loaded from: classes2.dex */
public class u implements IMediationDislikeCallback {
    private final Bridge vv;

    public u(Bridge bridge) {
        this.vv = bridge == null ? a.f8191d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationDislikeCallback
    public void onCancel() {
        this.vv.call(268014, a.c(0).a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationDislikeCallback
    public void onSelected(int i4, String str) {
        a c5 = a.c(2);
        c5.f(0, i4);
        c5.i(1, str);
        this.vv.call(268013, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.IMediationDislikeCallback
    public void onShow() {
        this.vv.call(268015, a.c(0).a(), Void.class);
    }
}
