package com.bytedance.sdk.openadsdk.mediation.ad.vv.vv.m;

import android.view.View;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationExpressRenderListener;
/* loaded from: classes2.dex */
public class u implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final MediationExpressRenderListener f8863m;
    private ValueSet vv = a.f8190c;

    public u(MediationExpressRenderListener mediationExpressRenderListener) {
        this.f8863m = mediationExpressRenderListener;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        MediationExpressRenderListener mediationExpressRenderListener = this.f8863m;
        if (mediationExpressRenderListener == null) {
            return null;
        }
        switch (i4) {
            case 142101:
                float floatValue = valueSet.floatValue(1);
                float floatValue2 = valueSet.floatValue(2);
                boolean booleanValue = valueSet.booleanValue(3);
                this.f8863m.onRenderSuccess((View) valueSet.objectValue(0, View.class), floatValue, floatValue2, booleanValue);
                break;
            case 142102:
                int intValue = valueSet.intValue(2);
                this.f8863m.onRenderFail((View) valueSet.objectValue(0, View.class), (String) valueSet.objectValue(1, String.class), intValue);
                break;
            case 142103:
                mediationExpressRenderListener.onAdClick();
                break;
            case 142104:
                mediationExpressRenderListener.onAdShow();
                break;
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
