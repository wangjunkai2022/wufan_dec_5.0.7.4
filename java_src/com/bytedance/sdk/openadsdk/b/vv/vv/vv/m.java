package com.bytedance.sdk.openadsdk.b.vv.vv.vv;

import android.view.View;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTNativeAd;
/* loaded from: classes2.dex */
public class m implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final TTNativeAd.ExpressRenderListener f8768m;
    private ValueSet vv = a.f8190c;

    public m(TTNativeAd.ExpressRenderListener expressRenderListener) {
        this.f8768m = expressRenderListener;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (this.f8768m != null && i4 == 142101) {
            float floatValue = valueSet.floatValue(1);
            float floatValue2 = valueSet.floatValue(2);
            boolean booleanValue = valueSet.booleanValue(3);
            this.f8768m.onRenderSuccess((View) valueSet.objectValue(0, View.class), floatValue, floatValue2, booleanValue);
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
