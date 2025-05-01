package com.bytedance.msdk.adapter.ks;

import android.content.Context;
import com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.l;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
/* loaded from: classes2.dex */
public class KsSplashLoader extends MediationAdLoaderImpl {
    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl
    public void realLoader(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        if (context != null) {
            new l(this).a(context, mediationAdSlotValueSet);
        }
    }
}
