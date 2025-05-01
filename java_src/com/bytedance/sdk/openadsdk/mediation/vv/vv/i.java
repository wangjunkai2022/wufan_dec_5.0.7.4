package com.bytedance.sdk.openadsdk.mediation.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTAdNative;
/* loaded from: classes2.dex */
public class i extends com.bytedance.sdk.openadsdk.n.vv.vv.vv.p {
    private TTAdNative.FullScreenVideoAdListener vv;

    public i(TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        super(fullScreenVideoAdListener);
        this.vv = fullScreenVideoAdListener;
    }

    @Override // com.bytedance.sdk.openadsdk.n.vv.vv.vv.p, com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (i4 == 132102) {
            if (this.vv != null) {
                this.vv.onFullScreenVideoAdLoad(new r((Bridge) valueSet.objectValue(0, Bridge.class)));
                return null;
            }
        } else if (i4 == 132103 && this.vv != null) {
            this.vv.onFullScreenVideoCached(new r((Bridge) valueSet.objectValue(0, Bridge.class)));
            return null;
        }
        return (T) super.call(i4, valueSet, cls);
    }
}
