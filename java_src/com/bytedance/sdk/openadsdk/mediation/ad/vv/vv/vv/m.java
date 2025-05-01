package com.bytedance.sdk.openadsdk.mediation.ad.vv.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationDislikeCallback;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationAdDislike;
/* loaded from: classes2.dex */
public class m implements MediationAdDislike {
    private final Bridge vv;

    public m(Bridge bridge) {
        this.vv = bridge == null ? a.f8191d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.MediationAdDislike
    public void setDislikeCallback(IMediationDislikeCallback iMediationDislikeCallback) {
        a c5 = a.c(1);
        c5.h(0, new com.bytedance.sdk.openadsdk.mediation.ad.vv.vv.m.m(iMediationDislikeCallback));
        this.vv.call(270033, c5.a(), Void.class);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.MediationAdDislike
    public void showDislikeDialog() {
        this.vv.call(270032, a.c(0).a(), Void.class);
    }
}
