package com.bytedance.sdk.openadsdk.wv.vv.vv.m;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTFeedAd;
/* loaded from: classes2.dex */
public class m implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final TTFeedAd.VideoRewardListener f8990m;
    private ValueSet vv = a.f8190c;

    public m(TTFeedAd.VideoRewardListener videoRewardListener) {
        this.f8990m = videoRewardListener;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (this.f8990m != null && i4 == 163101) {
            this.f8990m.onFeedRewardCountDown(valueSet.intValue(0));
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
