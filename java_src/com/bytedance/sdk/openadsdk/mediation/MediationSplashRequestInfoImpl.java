package com.bytedance.sdk.openadsdk.mediation;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.ad.IMediationSplashRequestInfo;
/* loaded from: classes2.dex */
public class MediationSplashRequestInfoImpl implements Bridge {
    private IMediationSplashRequestInfo vv;

    public MediationSplashRequestInfoImpl(IMediationSplashRequestInfo iMediationSplashRequestInfo) {
        this.vv = iMediationSplashRequestInfo;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        IMediationSplashRequestInfo iMediationSplashRequestInfo;
        if (i4 == 8530) {
            IMediationSplashRequestInfo iMediationSplashRequestInfo2 = this.vv;
            if (iMediationSplashRequestInfo2 != null) {
                return (T) iMediationSplashRequestInfo2.getAdnName();
            }
            return null;
        } else if (i4 == 8532) {
            IMediationSplashRequestInfo iMediationSplashRequestInfo3 = this.vv;
            if (iMediationSplashRequestInfo3 != null) {
                return (T) iMediationSplashRequestInfo3.getAppId();
            }
            return null;
        } else if (i4 == 8533) {
            IMediationSplashRequestInfo iMediationSplashRequestInfo4 = this.vv;
            if (iMediationSplashRequestInfo4 != null) {
                return (T) iMediationSplashRequestInfo4.getAppkey();
            }
            return null;
        } else if (i4 != 8531 || (iMediationSplashRequestInfo = this.vv) == null) {
            return null;
        } else {
            return (T) iMediationSplashRequestInfo.getAdnSlotId();
        }
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return null;
    }
}
