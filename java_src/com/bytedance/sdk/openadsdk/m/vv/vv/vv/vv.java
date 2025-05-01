package com.bytedance.sdk.openadsdk.m.vv.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.CSJSplashAd;
/* loaded from: classes2.dex */
public class vv implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final CSJSplashAd.SplashAdListener f8807m;
    private ValueSet vv = a.f8190c;

    public vv(CSJSplashAd.SplashAdListener splashAdListener) {
        this.f8807m = splashAdListener;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (this.f8807m == null) {
            return null;
        }
        switch (i4) {
            case 111101:
                this.f8807m.onSplashAdShow(new com.bytedance.sdk.openadsdk.p.vv.vv.m((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 111102:
                this.f8807m.onSplashAdClick(new com.bytedance.sdk.openadsdk.p.vv.vv.m((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 111103:
                this.f8807m.onSplashAdClose(new com.bytedance.sdk.openadsdk.p.vv.vv.m((Bridge) valueSet.objectValue(0, Bridge.class)), valueSet.intValue(1));
                break;
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
