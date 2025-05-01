package com.bytedance.sdk.openadsdk.mediation.vv.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.mediation.IMediationDrawTokenInfo;
/* loaded from: classes2.dex */
public class vv implements IMediationDrawTokenInfo {
    private final Bridge vv;

    public vv(Bridge bridge) {
        this.vv = bridge == null ? a.f8191d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.IMediationDrawTokenInfo
    public void loadDrawAdByAdm(String str, TTAdNative.DrawFeedAdListener drawFeedAdListener) {
        a c5 = a.c(2);
        c5.i(0, str);
        c5.h(1, new com.bytedance.sdk.openadsdk.n.vv.vv.vv.vv(drawFeedAdListener));
        this.vv.call(270031, c5.a(), Void.class);
    }
}
