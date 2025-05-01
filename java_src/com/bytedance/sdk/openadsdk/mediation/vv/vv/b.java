package com.bytedance.sdk.openadsdk.mediation.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationExpressRenderListener;
/* loaded from: classes2.dex */
public class b extends com.bytedance.sdk.openadsdk.p.vv.vv.k {
    private Bridge vv;

    public b(Bridge bridge) {
        super(bridge);
        this.vv = bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.p.vv.vv.k, com.bytedance.sdk.openadsdk.TTNativeAd
    public void setExpressRenderListener(TTNativeAd.ExpressRenderListener expressRenderListener) {
        a c5 = a.c(1);
        if (expressRenderListener instanceof MediationExpressRenderListener) {
            c5.h(0, new com.bytedance.sdk.openadsdk.mediation.ad.vv.vv.m.u((MediationExpressRenderListener) expressRenderListener));
            c5.f(1, 1);
        } else {
            c5.h(0, new com.bytedance.sdk.openadsdk.b.vv.vv.vv.m(expressRenderListener));
            c5.f(1, 0);
        }
        Bridge bridge = this.vv;
        if (bridge != null) {
            bridge.call(140111, c5.a(), Void.class);
        }
    }
}
