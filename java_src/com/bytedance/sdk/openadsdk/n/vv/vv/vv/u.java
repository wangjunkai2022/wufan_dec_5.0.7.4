package com.bytedance.sdk.openadsdk.n.vv.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.p.vv.vv.j;
/* loaded from: classes2.dex */
public class u implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final TTAdNative.RewardVideoAdListener f8962m;
    private ValueSet vv = a.f8190c;

    public u(TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        this.f8962m = rewardVideoAdListener;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        TTAdNative.RewardVideoAdListener rewardVideoAdListener = this.f8962m;
        if (rewardVideoAdListener == null) {
            return null;
        }
        switch (i4) {
            case 124101:
                this.f8962m.onError(valueSet.intValue(0), (String) valueSet.objectValue(1, String.class));
                break;
            case 124102:
                this.f8962m.onRewardVideoAdLoad(new j((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 124103:
                this.f8962m.onRewardVideoCached(new j((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 124104:
                rewardVideoAdListener.onRewardVideoCached();
                break;
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
