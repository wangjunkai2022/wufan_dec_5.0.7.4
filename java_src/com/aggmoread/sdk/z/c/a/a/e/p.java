package com.aggmoread.sdk.z.c.a.a.e;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
/* loaded from: classes2.dex */
public class p {
    public static int a(double d5) {
        return a(com.aggmoread.sdk.z.c.a.a.d.b.j.f3429q, d5);
    }

    public static int a(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        int i4 = Build.VERSION.SDK_INT;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (i4 >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        } else {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }

    public static int a(Context context, double d5) {
        double d6 = context.getResources().getDisplayMetrics().density;
        Double.isNaN(d6);
        return (int) ((d5 * d6) + 0.5d);
    }

    public static int b(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        int i4 = Build.VERSION.SDK_INT;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (i4 >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        } else {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics.widthPixels;
    }
}
