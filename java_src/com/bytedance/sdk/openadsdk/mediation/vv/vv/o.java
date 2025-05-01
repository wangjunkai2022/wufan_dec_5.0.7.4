package com.bytedance.sdk.openadsdk.mediation.vv.vv;

import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationAdSlot;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationNativeToBannerListener;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationSplashRequestInfo;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
/* loaded from: classes2.dex */
public class o extends com.bytedance.sdk.openadsdk.mediation.ad.vv.vv.m.vv {
    private IMediationAdSlot vv;

    public o(IMediationAdSlot iMediationAdSlot) {
        super(iMediationAdSlot);
        this.vv = iMediationAdSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.ad.vv.vv.m.vv, com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (this.vv == null) {
            return (T) MediationValueUtil.checkClassType(cls);
        }
        if (i4 == 266101) {
            return (T) new com.bytedance.sdk.openadsdk.mediation.ad.vv.vv.m.p((IMediationNativeToBannerListener) super.call(i4, null, IMediationNativeToBannerListener.class));
        }
        if (i4 == 266102) {
            IMediationSplashRequestInfo iMediationSplashRequestInfo = (IMediationSplashRequestInfo) super.call(i4, null, IMediationSplashRequestInfo.class);
            if (iMediationSplashRequestInfo != null) {
                return (T) new wv(iMediationSplashRequestInfo);
            }
            return null;
        }
        return (T) super.call(i4, valueSet, cls);
    }
}
