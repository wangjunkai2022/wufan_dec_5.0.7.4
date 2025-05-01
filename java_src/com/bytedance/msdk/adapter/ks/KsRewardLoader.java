package com.bytedance.msdk.adapter.ks;

import android.content.Context;
import com.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.WJTJxXrQq.k;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
/* loaded from: classes2.dex */
public class KsRewardLoader extends KsBaseLoader {
    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl
    public void realLoader(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        if (context != null) {
            new k(this).a(context, mediationAdSlotValueSet);
        }
    }
}
