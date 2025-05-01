package com.bytedance.sdk.openadsdk.mediation.ad.vv.vv.m;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeToBannerListener;
/* loaded from: classes2.dex */
public class p implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final IMediationNativeToBannerListener f8862m;
    private ValueSet vv = a.f8190c;

    public p(IMediationNativeToBannerListener iMediationNativeToBannerListener) {
        this.f8862m = iMediationNativeToBannerListener;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (this.f8862m != null && i4 == 266013) {
            return (T) this.f8862m.getMediationBannerViewFromNativeAd(new com.bytedance.sdk.openadsdk.mediation.ad.vv.vv.vv.vv((Bridge) valueSet.objectValue(0, Bridge.class)));
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
