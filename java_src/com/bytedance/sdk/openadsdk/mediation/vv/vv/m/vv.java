package com.bytedance.sdk.openadsdk.mediation.vv.vv.m;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.mediation.IMediationDrawAdTokenCallback;
/* loaded from: classes2.dex */
public class vv implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final IMediationDrawAdTokenCallback f8957m;
    private ValueSet vv = a.f8190c;

    public vv(IMediationDrawAdTokenCallback iMediationDrawAdTokenCallback) {
        this.f8957m = iMediationDrawAdTokenCallback;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (this.f8957m == null) {
            return null;
        }
        switch (i4) {
            case 270029:
                com.bytedance.sdk.openadsdk.mediation.vv.vv.vv.vv vvVar = new com.bytedance.sdk.openadsdk.mediation.vv.vv.vv.vv((Bridge) valueSet.objectValue(1, Bridge.class));
                this.f8957m.onAdTokenLoaded((String) valueSet.objectValue(0, String.class), vvVar);
                break;
            case 270030:
                this.f8957m.onAdTokenLoadedFail(valueSet.intValue(0), (String) valueSet.objectValue(1, String.class));
                break;
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
