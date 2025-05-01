package com.beizi.fusion.g;

import android.content.Context;
/* compiled from: AdViewSizeUtils.java */
/* loaded from: classes2.dex */
public class a {
    public static float a(Context context) {
        float f5 = context.getResources().getDisplayMetrics().density;
        float f6 = context.getResources().getDisplayMetrics().widthPixels;
        if (f5 <= 0.0f) {
            f5 = 1.0f;
        }
        return (f6 / f5) + 0.5f;
    }
}
