package com.bytedance.sdk.openadsdk.api;

import com.bykv.vk.openvk.api.proto.EventListener;
import com.bykv.vk.openvk.api.proto.Result;
/* loaded from: classes2.dex */
public class m {
    protected EventListener vv;

    /* JADX INFO: Access modifiers changed from: protected */
    public void vv(int i4, Result result) {
        if (vv()) {
            return;
        }
        this.vv.onEvent(i4, result);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void vv(int i4) {
        vv(i4, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean vv() {
        return this.vv == null;
    }
}
