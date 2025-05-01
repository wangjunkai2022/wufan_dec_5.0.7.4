package com.bytedance.sdk.openadsdk.u.vv.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTAdDislike;
/* loaded from: classes2.dex */
public class vv implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final TTAdDislike.DislikeInteractionCallback f8984m;
    private ValueSet vv = a.f8190c;

    public vv(TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
        this.f8984m = dislikeInteractionCallback;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback = this.f8984m;
        if (dislikeInteractionCallback == null) {
            return null;
        }
        switch (i4) {
            case 244101:
                dislikeInteractionCallback.onShow();
                break;
            case 244102:
                boolean booleanValue = valueSet.booleanValue(2);
                this.f8984m.onSelected(valueSet.intValue(0), (String) valueSet.objectValue(1, String.class), booleanValue);
                break;
            case 244103:
                dislikeInteractionCallback.onCancel();
                break;
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
