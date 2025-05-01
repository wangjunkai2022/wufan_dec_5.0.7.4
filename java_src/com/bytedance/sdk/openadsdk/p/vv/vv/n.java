package com.bytedance.sdk.openadsdk.p.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.PersonalizationPrompt;
/* loaded from: classes2.dex */
public class n implements PersonalizationPrompt {
    private final Bridge vv;

    public n(Bridge bridge) {
        this.vv = bridge == null ? a.f8191d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.PersonalizationPrompt
    public String getName() {
        return (String) this.vv.values().objectValue(242002, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.PersonalizationPrompt
    public String getUrl() {
        return (String) this.vv.values().objectValue(242001, String.class);
    }
}
