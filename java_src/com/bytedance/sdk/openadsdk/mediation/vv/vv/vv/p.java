package com.bytedance.sdk.openadsdk.mediation.vv.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.mediation.IMediationNativeTokenInfo;
/* loaded from: classes2.dex */
public class p implements IMediationNativeTokenInfo {
    private final Bridge vv;

    public p(Bridge bridge) {
        this.vv = bridge == null ? a.f8191d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationNativeTokenInfo
    public void loadNativeAdByAdm(String str, TTAdNative.FeedAdListener feedAdListener) {
        a c5 = a.c(2);
        c5.i(0, str);
        c5.h(1, new com.bytedance.sdk.openadsdk.n.vv.vv.vv.m(feedAdListener));
        this.vv.call(270028, c5.a(), Void.class);
    }
}
