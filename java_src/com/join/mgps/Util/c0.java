package com.join.mgps.Util;

import android.content.Context;
/* compiled from: Dip2SpUtil.java */
/* loaded from: classes3.dex */
public class c0 {
    public static int a(Context context, float f5) {
        return (int) ((f5 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int b(Context context, float f5) {
        return (int) ((f5 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int c(Context context, float f5) {
        return (int) ((f5 / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
