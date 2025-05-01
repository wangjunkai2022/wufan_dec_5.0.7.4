package com.bytedance.sdk.openadsdk.mediation.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationAdDislike;
/* loaded from: classes2.dex */
public class k implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final MediationAdDislike f8952m;
    private ValueSet vv = a.f8190c;

    public k(MediationAdDislike mediationAdDislike) {
        this.f8952m = mediationAdDislike;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        MediationAdDislike mediationAdDislike = this.f8952m;
        if (mediationAdDislike == null) {
            return null;
        }
        switch (i4) {
            case 270032:
                mediationAdDislike.showDislikeDialog();
                break;
            case 270033:
                this.f8952m.setDislikeCallback(new u((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
