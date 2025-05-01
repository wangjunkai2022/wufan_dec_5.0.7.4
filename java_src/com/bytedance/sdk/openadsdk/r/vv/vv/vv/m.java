package com.bytedance.sdk.openadsdk.r.vv.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
/* loaded from: classes2.dex */
public class m implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final TTRewardVideoAd.RewardAdPlayAgainController f8982m;
    private ValueSet vv = a.f8190c;

    public m(TTRewardVideoAd.RewardAdPlayAgainController rewardAdPlayAgainController) {
        this.f8982m = rewardAdPlayAgainController;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (this.f8982m != null && i4 == 122101) {
            this.f8982m.getPlayAgainCondition(valueSet.intValue(0), new com.bytedance.sdk.openadsdk.i.vv.vv.vv.vv.vv((Bridge) valueSet.objectValue(1, Bridge.class)));
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
