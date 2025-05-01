package com.bytedance.sdk.openadsdk.m.vv.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.CSJSplashAd;
/* loaded from: classes2.dex */
public class p implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final CSJSplashAd.SplashClickEyeListener f8806m;
    private ValueSet vv = a.f8190c;

    public p(CSJSplashAd.SplashClickEyeListener splashClickEyeListener) {
        this.f8806m = splashClickEyeListener;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        CSJSplashAd.SplashClickEyeListener splashClickEyeListener = this.f8806m;
        if (splashClickEyeListener == null) {
            return null;
        }
        switch (i4) {
            case 113101:
                this.f8806m.onSplashClickEyeReadyToShow(new com.bytedance.sdk.openadsdk.p.vv.vv.m((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 113102:
                splashClickEyeListener.onSplashClickEyeClick();
                break;
            case 113103:
                splashClickEyeListener.onSplashClickEyeClose();
                break;
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
