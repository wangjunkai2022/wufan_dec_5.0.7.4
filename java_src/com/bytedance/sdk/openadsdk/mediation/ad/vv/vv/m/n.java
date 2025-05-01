package com.bytedance.sdk.openadsdk.mediation.ad.vv.vv.m;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationShakeViewListener;
/* loaded from: classes2.dex */
public class n implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final MediationShakeViewListener f8860m;
    private ValueSet vv = a.f8190c;

    public n(MediationShakeViewListener mediationShakeViewListener) {
        this.f8860m = mediationShakeViewListener;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        MediationShakeViewListener mediationShakeViewListener = this.f8860m;
        if (mediationShakeViewListener != null && i4 == 270012) {
            mediationShakeViewListener.onDismissed();
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
