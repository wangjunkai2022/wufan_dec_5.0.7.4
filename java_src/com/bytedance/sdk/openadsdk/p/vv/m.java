package com.bytedance.sdk.openadsdk.p.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTAdNative;
import java.lang.reflect.Method;
/* loaded from: classes2.dex */
public class m implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final TTAdNative.CSJSplashAdListener f8969m;
    private ValueSet vv = a.f8190c;

    public m(TTAdNative.CSJSplashAdListener cSJSplashAdListener) {
        this.f8969m = cSJSplashAdListener;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (this.f8969m == null) {
            return null;
        }
        switch (i4) {
            case 114102:
                Bridge bridge = (Bridge) valueSet.objectValue(0, Bridge.class);
                com.bytedance.sdk.openadsdk.p.vv.vv.m mVar = new com.bytedance.sdk.openadsdk.p.vv.vv.m(bridge);
                if (bridge != null) {
                    try {
                        if (bridge.values().intValue(1) >= 5700) {
                            this.f8969m.onSplashLoadSuccess(mVar);
                        } else {
                            Method declaredMethod = this.f8969m.getClass().getDeclaredMethod("onSplashLoadSuccess", null);
                            if (declaredMethod != null) {
                                declaredMethod.invoke(this.f8969m, new Object[0]);
                            }
                        }
                        break;
                    } catch (Exception e5) {
                        e5.printStackTrace();
                        break;
                    }
                }
                break;
            case 114103:
                this.f8969m.onSplashLoadFail(new com.bytedance.sdk.openadsdk.p.vv.vv.vv((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 114104:
                this.f8969m.onSplashRenderSuccess(new com.bytedance.sdk.openadsdk.p.vv.vv.m((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 114105:
                this.f8969m.onSplashRenderFail(new com.bytedance.sdk.openadsdk.p.vv.vv.m((Bridge) valueSet.objectValue(0, Bridge.class)), new com.bytedance.sdk.openadsdk.p.vv.vv.vv((Bridge) valueSet.objectValue(1, Bridge.class)));
                break;
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
