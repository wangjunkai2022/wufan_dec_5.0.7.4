package com.bytedance.sdk.openadsdk.b.vv.vv.vv;

import android.view.View;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.p.vv.vv.t;
/* loaded from: classes2.dex */
public class vv implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final TTNativeAd.AdInteractionListener f8769m;
    private ValueSet vv = a.f8190c;

    public vv(TTNativeAd.AdInteractionListener adInteractionListener) {
        this.f8769m = adInteractionListener;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (this.f8769m == null) {
            return null;
        }
        switch (i4) {
            case 141101:
                t tVar = new t((Bridge) valueSet.objectValue(1, Bridge.class));
                this.f8769m.onAdClicked((View) valueSet.objectValue(0, View.class), tVar);
                break;
            case 141102:
                t tVar2 = new t((Bridge) valueSet.objectValue(1, Bridge.class));
                this.f8769m.onAdCreativeClick((View) valueSet.objectValue(0, View.class), tVar2);
                break;
            case 141103:
                this.f8769m.onAdShow(new t((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
