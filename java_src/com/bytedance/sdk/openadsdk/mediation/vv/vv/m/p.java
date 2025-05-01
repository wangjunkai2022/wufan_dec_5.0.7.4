package com.bytedance.sdk.openadsdk.mediation.vv.vv.m;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.mediation.IMediationNativeAdTokenCallback;
/* loaded from: classes2.dex */
public class p implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final IMediationNativeAdTokenCallback f8956m;
    private ValueSet vv = a.f8190c;

    public p(IMediationNativeAdTokenCallback iMediationNativeAdTokenCallback) {
        this.f8956m = iMediationNativeAdTokenCallback;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (this.f8956m == null) {
            return null;
        }
        switch (i4) {
            case 270026:
                com.bytedance.sdk.openadsdk.mediation.vv.vv.vv.p pVar = new com.bytedance.sdk.openadsdk.mediation.vv.vv.vv.p((Bridge) valueSet.objectValue(1, Bridge.class));
                this.f8956m.onAdTokenLoaded((String) valueSet.objectValue(0, String.class), pVar);
                break;
            case 270027:
                this.f8956m.onAdTokenLoadedFail(valueSet.intValue(0), (String) valueSet.objectValue(1, String.class));
                break;
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
