package com.bytedance.sdk.openadsdk.mediation.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.mediation.IMediationInterstitialFullAdListener;
/* loaded from: classes2.dex */
public class r extends com.bytedance.sdk.openadsdk.p.vv.vv.jh {
    private Bridge vv;

    public r(Bridge bridge) {
        super(bridge);
        this.vv = bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.p.vv.vv.jh, com.bytedance.sdk.openadsdk.TTFullScreenVideoAd
    public void setFullScreenVideoAdInteractionListener(TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener) {
        a c5 = a.c(1);
        if (fullScreenVideoAdInteractionListener instanceof IMediationInterstitialFullAdListener) {
            c5.h(0, new com.bytedance.sdk.openadsdk.mediation.vv.vv.m.m((IMediationInterstitialFullAdListener) fullScreenVideoAdInteractionListener));
            c5.f(1, 1);
        } else {
            c5.h(0, new com.bytedance.sdk.openadsdk.k.vv.vv.vv.vv(fullScreenVideoAdInteractionListener));
            c5.f(1, 0);
        }
        Bridge bridge = this.vv;
        if (bridge != null) {
            bridge.call(130101, c5.a(), Void.class);
        }
    }
}
