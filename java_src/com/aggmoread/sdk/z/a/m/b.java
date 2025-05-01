package com.aggmoread.sdk.z.a.m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.TextView;
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    static final String f2308a = "b";

    public static int a(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return (int) (displayMetrics.widthPixels / displayMetrics.density);
    }

    public static int a(Context context, double d5) {
        double d6 = context.getResources().getDisplayMetrics().density;
        Double.isNaN(d6);
        return (int) ((d5 * d6) + 0.5d);
    }

    public static Drawable a(int i4, float f5, int i5, int i6, int i7) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i4);
        gradientDrawable.setAlpha((int) (f5 * 255.0f));
        if (i7 > 0) {
            gradientDrawable.setStroke(i6, i7);
        }
        gradientDrawable.setCornerRadius(i5);
        return gradientDrawable;
    }

    public static void a(TextView textView, int i4) {
        if (textView != null) {
            textView.setTextSize(1, i4);
        }
    }

    public static boolean a(View view) {
        if (view == null) {
            return false;
        }
        boolean z4 = view.getVisibility() == 0;
        boolean isShown = view.isShown();
        boolean globalVisibleRect = Build.VERSION.SDK_INT >= 26 ? view.getGlobalVisibleRect(new Rect()) : true;
        String str = f2308a;
        com.aggmoread.sdk.z.a.d.c(str, "isShown enter , isVisible = " + z4 + " , isShown = " + isShown + " , isVisibleRect = " + globalVisibleRect);
        return z4 && isShown && globalVisibleRect;
    }

    public static boolean a(View view, View view2) {
        if (view == null || view2 == null) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }
}
