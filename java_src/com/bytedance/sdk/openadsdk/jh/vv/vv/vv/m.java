package com.bytedance.sdk.openadsdk.jh.vv.vv.vv;

import android.view.View;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
/* loaded from: classes2.dex */
public class m implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final TTNativeExpressAd.ExpressAdInteractionListener f8793m;
    private ValueSet vv = a.f8190c;

    public m(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
        this.f8793m = expressAdInteractionListener;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (this.f8793m == null) {
            return null;
        }
        switch (i4) {
            case 151101:
                int intValue = valueSet.intValue(1);
                this.f8793m.onAdClicked((View) valueSet.objectValue(0, View.class), intValue);
                break;
            case 151102:
                int intValue2 = valueSet.intValue(1);
                this.f8793m.onAdShow((View) valueSet.objectValue(0, View.class), intValue2);
                break;
            case 151103:
                int intValue3 = valueSet.intValue(2);
                this.f8793m.onRenderFail((View) valueSet.objectValue(0, View.class), (String) valueSet.objectValue(1, String.class), intValue3);
                break;
            case 151104:
                float floatValue = valueSet.floatValue(1);
                float floatValue2 = valueSet.floatValue(2);
                this.f8793m.onRenderSuccess((View) valueSet.objectValue(0, View.class), floatValue, floatValue2);
                break;
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
