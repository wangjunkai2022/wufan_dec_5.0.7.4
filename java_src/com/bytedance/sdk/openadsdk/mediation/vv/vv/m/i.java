package com.bytedance.sdk.openadsdk.mediation.vv.vv.m;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.mediation.IMediationPreloadRequestInfo;
/* loaded from: classes2.dex */
public class i implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final IMediationPreloadRequestInfo f8953m;
    private ValueSet vv = a.f8190c;

    public i(IMediationPreloadRequestInfo iMediationPreloadRequestInfo) {
        this.f8953m = iMediationPreloadRequestInfo;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        IMediationPreloadRequestInfo iMediationPreloadRequestInfo = this.f8953m;
        if (iMediationPreloadRequestInfo == null) {
            return null;
        }
        switch (i4) {
            case 271044:
                return (T) Integer.class.cast(Integer.valueOf(iMediationPreloadRequestInfo.getAdType()));
            case 271045:
                return (T) iMediationPreloadRequestInfo.getAdSlot();
            case 271046:
                return (T) iMediationPreloadRequestInfo.getPrimeRitList();
            default:
                return null;
        }
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
