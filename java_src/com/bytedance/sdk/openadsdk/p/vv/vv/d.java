package com.bytedance.sdk.openadsdk.p.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTWidgetManager;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class d extends TTWidgetManager {
    private final Bridge vv;

    public d(Bridge bridge) {
        this.vv = bridge == null ? a.f8191d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.TTWidgetManager
    public boolean updateWidgetWithType(int i4, JSONObject jSONObject) {
        a c5 = a.c(2);
        c5.f(0, i4);
        c5.h(1, jSONObject);
        return ((Boolean) this.vv.call(264001, c5.a(), Boolean.TYPE)).booleanValue();
    }
}
