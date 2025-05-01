package com.kwad.sdk.api.core;

import android.content.Context;
/* loaded from: classes5.dex */
public class ApiViewUtil {
    public static int px2dip(Context context, float f5) {
        return (int) ((f5 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
