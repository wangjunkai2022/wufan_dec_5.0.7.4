package com.bytedance.sdk.openadsdk.n.vv.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.p.vv.vv.jh;
/* loaded from: classes2.dex */
public class p implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final TTAdNative.FullScreenVideoAdListener f8961m;
    private ValueSet vv = a.f8190c;

    public p(TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        this.f8961m = fullScreenVideoAdListener;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener = this.f8961m;
        if (fullScreenVideoAdListener == null) {
            return null;
        }
        switch (i4) {
            case 132101:
                this.f8961m.onError(valueSet.intValue(0), (String) valueSet.objectValue(1, String.class));
                break;
            case 132102:
                this.f8961m.onFullScreenVideoAdLoad(new jh((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 132103:
                this.f8961m.onFullScreenVideoCached(new jh((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 132104:
                fullScreenVideoAdListener.onFullScreenVideoCached();
                break;
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
