package com.bytedance.sdk.openadsdk.mediation.ad.vv.vv.m;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationDislikeCallback;
/* loaded from: classes2.dex */
public class m implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final IMediationDislikeCallback f8859m;
    private ValueSet vv = a.f8190c;

    public m(IMediationDislikeCallback iMediationDislikeCallback) {
        this.f8859m = iMediationDislikeCallback;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        IMediationDislikeCallback iMediationDislikeCallback = this.f8859m;
        if (iMediationDislikeCallback == null) {
            return null;
        }
        switch (i4) {
            case 268013:
                this.f8859m.onSelected(valueSet.intValue(0), (String) valueSet.objectValue(1, String.class));
                break;
            case 268014:
                iMediationDislikeCallback.onCancel();
                break;
            case 268015:
                iMediationDislikeCallback.onShow();
                break;
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
