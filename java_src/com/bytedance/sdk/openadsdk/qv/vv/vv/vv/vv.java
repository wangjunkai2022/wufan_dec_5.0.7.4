package com.bytedance.sdk.openadsdk.qv.vv.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTDrawFeedAd;
/* loaded from: classes2.dex */
public class vv implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final TTDrawFeedAd.DrawVideoListener f8981m;
    private ValueSet vv = a.f8190c;

    public vv(TTDrawFeedAd.DrawVideoListener drawVideoListener) {
        this.f8981m = drawVideoListener;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        TTDrawFeedAd.DrawVideoListener drawVideoListener = this.f8981m;
        if (drawVideoListener == null) {
            return null;
        }
        switch (i4) {
            case 171101:
                drawVideoListener.onClick();
                break;
            case 171102:
                drawVideoListener.onClickRetry();
                break;
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
