package com.bytedance.sdk.openadsdk.mediation.vv.vv;

import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.IMediationPreloadRequestInfo;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
/* loaded from: classes2.dex */
public class qv extends com.bytedance.sdk.openadsdk.mediation.vv.vv.m.i {
    private IMediationPreloadRequestInfo vv;

    public qv(IMediationPreloadRequestInfo iMediationPreloadRequestInfo) {
        super(iMediationPreloadRequestInfo);
        this.vv = iMediationPreloadRequestInfo;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.vv.vv.m.i, com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        IMediationPreloadRequestInfo iMediationPreloadRequestInfo = this.vv;
        if (iMediationPreloadRequestInfo == null) {
            return (T) MediationValueUtil.checkClassType(cls);
        }
        if (i4 == 271045) {
            if (iMediationPreloadRequestInfo != null) {
                return (T) vv.vv(iMediationPreloadRequestInfo.getAdSlot());
            }
            return null;
        }
        return (T) super.call(i4, valueSet, cls);
    }
}
