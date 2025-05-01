package com.bytedance.sdk.openadsdk.mediation;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.live.TTLiveAuthCallback;
import com.bytedance.sdk.openadsdk.live.TTLiveToken;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
/* loaded from: classes2.dex */
public class MediationTTLiveAuthCallBackImpl implements TTLiveAuthCallback {
    private Bridge vv;

    public MediationTTLiveAuthCallBackImpl(Bridge bridge) {
        this.vv = bridge;
    }

    @Override // com.bytedance.sdk.openadsdk.live.TTLiveAuthCallback
    public void onAuth(TTLiveToken tTLiveToken) {
        if (this.vv == null || tTLiveToken == null) {
            return;
        }
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        create.add(8520, tTLiveToken.name);
        create.add(8521, tTLiveToken.accessToken);
        create.add(8522, tTLiveToken.openId);
        create.add(8523, tTLiveToken.expireAt);
        create.add(8524, tTLiveToken.refreshToken);
        this.vv.call(8527, create.build(), null);
    }

    @Override // com.bytedance.sdk.openadsdk.live.TTLiveAuthCallback
    public void onFailed(Throwable th) {
        if (this.vv == null || th == null) {
            return;
        }
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        create.add(8014, th);
        this.vv.call(8528, create.build(), null);
    }
}
