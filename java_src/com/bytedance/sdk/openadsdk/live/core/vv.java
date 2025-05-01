package com.bytedance.sdk.openadsdk.live.core;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.android.live.base.api.ILiveHostActionParam;
import java.util.Map;
/* loaded from: classes2.dex */
public class vv implements ILiveHostActionParam {
    private Bridge vv;

    public vv(Bridge bridge) {
        this.vv = bridge;
    }

    @Override // com.bytedance.android.live.base.api.ILiveHostActionParam
    public void logEvent(boolean z4, String str, String str2, Map<String, String> map) {
        Bridge bridge = this.vv;
        if (bridge != null) {
            bridge.call(1, a.b().j(0, z4).i(1, str).i(2, str2).h(3, map).a(), null);
        }
    }
}
