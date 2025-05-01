package com.bytedance.sdk.openadsdk.mediation.bridge.custom.native_ad;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationNativeAdAppInfo;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
/* loaded from: classes2.dex */
public class MediationNativeAppInfoImpl implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private MediationValueSetBuilder f8899m = MediationValueSetBuilder.create();
    private MediationNativeAdAppInfo vv;

    public MediationNativeAppInfoImpl(MediationNativeAdAppInfo mediationNativeAdAppInfo) {
        this.vv = mediationNativeAdAppInfo;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        MediationNativeAdAppInfo mediationNativeAdAppInfo = this.vv;
        if (mediationNativeAdAppInfo != null) {
            this.f8899m.add(8505, mediationNativeAdAppInfo.getAppName());
            this.f8899m.add(8506, this.vv.getAuthorName());
            this.f8899m.add(8507, this.vv.getPackageSizeBytes());
            this.f8899m.add(8508, this.vv.getPermissionsUrl());
            this.f8899m.add(8509, this.vv.getPermissionsMap());
            this.f8899m.add(8510, this.vv.getPrivacyAgreement());
            this.f8899m.add(8511, this.vv.getVersionName());
            this.f8899m.add(8512, this.vv.getAppInfoExtra());
        }
        return this.f8899m.build();
    }
}
