package com.bytedance.msdk.adapter.gdt;

import android.app.Activity;
import android.content.Context;
import com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.h;
import com.bytedance.sdk.openadsdk.mediation.MediationApiLog;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
/* loaded from: classes2.dex */
public class GdtInterstitialLoader extends MediationAdLoaderImpl {
    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl
    public void realLoader(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        int i4;
        String str;
        if (context instanceof Activity) {
            MediationApiLog.i("TTMediationSDK", "GdtInterstitialLoader realLoader adnId:" + getAdnId());
            if (mediationAdSlotValueSet != null) {
                new h(mediationAdSlotValueSet, getGMBridge(), this).d(context);
                return;
            } else {
                i4 = MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL;
                str = "context is null or adSlotValueSet is null";
            }
        } else {
            i4 = MediationConstant.ErrorCode.ADN_AD_CONTEXT;
            str = "context type error, context need activity";
        }
        notifyAdFailed(i4, str);
    }
}
