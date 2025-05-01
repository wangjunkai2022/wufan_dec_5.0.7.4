package com.bytedance.sdk.openadsdk.mediation.vv.vv.m;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.mediation.MediationAppDialogClickListener;
/* loaded from: classes2.dex */
public class o implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final MediationAppDialogClickListener f8955m;
    private ValueSet vv = a.f8190c;

    public o(MediationAppDialogClickListener mediationAppDialogClickListener) {
        this.f8955m = mediationAppDialogClickListener;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (this.f8955m != null && i4 == 270025) {
            this.f8955m.onButtonClick(valueSet.intValue(0));
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
