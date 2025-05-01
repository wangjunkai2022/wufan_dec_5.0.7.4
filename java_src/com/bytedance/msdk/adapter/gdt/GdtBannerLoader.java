package com.bytedance.msdk.adapter.gdt;

import android.app.Activity;
import android.content.Context;
import com.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.X7KzsG5NZG.e;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
/* loaded from: classes2.dex */
public class GdtBannerLoader extends MediationAdLoaderImpl {
    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl
    public void realLoader(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        if (context instanceof Activity) {
            new e(this).d(context, mediationAdSlotValueSet);
        } else {
            notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_CONTEXT, "context type error, context need activity");
        }
    }
}
