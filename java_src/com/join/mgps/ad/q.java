package com.join.mgps.ad;

import android.content.Context;
import android.util.TypedValue;
/* compiled from: PxUtils.java */
/* loaded from: classes4.dex */
public class q {
    public static int a(Context context, int i4) {
        return (int) TypedValue.applyDimension(1, i4, context.getApplicationContext().getResources().getDisplayMetrics());
    }

    public static int b(Context context) {
        return context.getApplicationContext().getResources().getDisplayMetrics().heightPixels;
    }

    public static int c(Context context) {
        return context.getApplicationContext().getResources().getDisplayMetrics().widthPixels;
    }

    public static int d(Context context, int i4) {
        return (int) ((i4 / context.getApplicationContext().getResources().getDisplayMetrics().density) + 0.5f);
    }
}
