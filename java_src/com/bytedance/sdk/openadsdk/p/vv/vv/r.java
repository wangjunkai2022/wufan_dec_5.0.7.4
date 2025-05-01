package com.bytedance.sdk.openadsdk.p.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTImage;
/* loaded from: classes2.dex */
public class r extends TTImage {
    private final Bridge vv;

    public r(Bridge bridge) {
        this.vv = bridge == null ? a.f8191d : bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.TTImage
    public double getDuration() {
        return this.vv.values().doubleValue(230004);
    }

    @Override // com.bytedance.sdk.openadsdk.TTImage
    public int getHeight() {
        return this.vv.values().intValue(230002);
    }

    @Override // com.bytedance.sdk.openadsdk.TTImage
    public String getImageUrl() {
        return (String) this.vv.values().objectValue(230003, String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.TTImage
    public int getWidth() {
        return this.vv.values().intValue(230001);
    }

    @Override // com.bytedance.sdk.openadsdk.TTImage
    public boolean isValid() {
        return this.vv.values().booleanValue(230005);
    }
}
