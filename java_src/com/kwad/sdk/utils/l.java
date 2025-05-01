package com.kwad.sdk.utils;

import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes5.dex */
public final class l {
    public static long aPH = -1;

    public static void el(AdTemplate adTemplate) {
        if (adTemplate != null) {
            adTemplate.mVisibleTimeParam = aPH;
            adTemplate.mOutClickTimeParam = aPH;
        }
    }

    public static void em(AdTemplate adTemplate) {
        if (adTemplate != null) {
            adTemplate.mOutClickTimeParam = System.currentTimeMillis();
        }
    }

    public static void en(AdTemplate adTemplate) {
        if (adTemplate != null) {
            adTemplate.mVisibleTimeParam = System.currentTimeMillis();
        }
    }

    public static long eo(AdTemplate adTemplate) {
        if (adTemplate == null) {
            return System.currentTimeMillis();
        }
        long j4 = adTemplate.mOutClickTimeParam;
        return j4 > 0 ? j4 : adTemplate.mVisibleTimeParam;
    }
}
