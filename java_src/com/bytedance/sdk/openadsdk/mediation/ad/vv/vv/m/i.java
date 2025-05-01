package com.bytedance.sdk.openadsdk.mediation.ad.vv.vv.m;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationSplashRequestInfo;
/* loaded from: classes2.dex */
public class i implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final IMediationSplashRequestInfo f8858m;
    private ValueSet vv = a.f8190c;

    public i(IMediationSplashRequestInfo iMediationSplashRequestInfo) {
        this.f8858m = iMediationSplashRequestInfo;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        IMediationSplashRequestInfo iMediationSplashRequestInfo = this.f8858m;
        if (iMediationSplashRequestInfo == null) {
            return null;
        }
        switch (i4) {
            case 267001:
                return (T) iMediationSplashRequestInfo.getAdnName();
            case 267002:
                return (T) iMediationSplashRequestInfo.getAdnSlotId();
            case 267003:
                return (T) iMediationSplashRequestInfo.getAppId();
            case 267004:
                return (T) iMediationSplashRequestInfo.getAppkey();
            default:
                return null;
        }
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
