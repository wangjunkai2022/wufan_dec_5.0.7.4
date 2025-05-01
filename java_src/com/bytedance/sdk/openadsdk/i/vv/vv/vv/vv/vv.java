package com.bytedance.sdk.openadsdk.i.vv.vv.vv.vv;

import android.os.Bundle;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
/* loaded from: classes2.dex */
public class vv implements TTRewardVideoAd.RewardAdPlayAgainController.Callback {
    private final Bridge vv;

    public vv(Bridge bridge) {
        this.vv = bridge == null ? a.f8191d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdPlayAgainController.Callback
    public void onConditionReturn(Bundle bundle) {
        a c5 = a.c(1);
        c5.h(0, bundle);
        this.vv.call(123101, c5.a(), Void.class);
    }
}
