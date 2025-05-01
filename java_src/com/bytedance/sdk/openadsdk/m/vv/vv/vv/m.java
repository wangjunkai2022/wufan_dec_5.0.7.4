package com.bytedance.sdk.openadsdk.m.vv.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.CSJSplashAd;
/* loaded from: classes2.dex */
public class m implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final CSJSplashAd.SplashCardListener f8805m;
    private ValueSet vv = a.f8190c;

    public m(CSJSplashAd.SplashCardListener splashCardListener) {
        this.f8805m = splashCardListener;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        CSJSplashAd.SplashCardListener splashCardListener = this.f8805m;
        if (splashCardListener == null) {
            return null;
        }
        switch (i4) {
            case 112102:
                splashCardListener.onSplashCardClick();
                break;
            case 112103:
                splashCardListener.onSplashCardClose();
                break;
            case 121201:
                this.f8805m.onSplashCardReadyToShow(new com.bytedance.sdk.openadsdk.p.vv.vv.m((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
