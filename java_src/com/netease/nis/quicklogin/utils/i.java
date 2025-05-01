package com.netease.nis.quicklogin.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ViewTool.java */
/* loaded from: classes5.dex */
public class i {
    public static void a(View view, int i4) {
        if (view == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.bottomMargin = a(view.getContext(), i4);
        marginLayoutParams.topMargin = 0;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(marginLayoutParams);
        layoutParams.addRule(12);
        view.setLayoutParams(layoutParams);
    }

    public static void b(View view, int i4) {
        if (view == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = a(view.getContext(), i4);
        view.setLayoutParams(marginLayoutParams);
    }

    public static void c(View view, int i4) {
        if (view == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.rightMargin = a(view.getContext(), i4);
        view.setLayoutParams(marginLayoutParams);
    }

    public static void d(View view, int i4) {
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.topMargin = a(context, i4);
        marginLayoutParams.bottomMargin = 0;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(marginLayoutParams);
        layoutParams.addRule(10);
        view.setLayoutParams(layoutParams);
    }

    public static void e(View view, int i4) {
        if (view != null && (view.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams.leftMargin = a(view.getContext(), i4);
            layoutParams.addRule(9);
            view.setLayoutParams(layoutParams);
        }
    }

    public static void b(View view) {
        if (view != null && (view.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams.addRule(14);
            view.setLayoutParams(layoutParams);
        }
    }

    public static void c(View view) {
        if (view != null && (view.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams.addRule(14);
            layoutParams.addRule(12);
            view.setLayoutParams(layoutParams);
        }
    }

    public static void a(Activity activity, int i4, int i5, int i6, int i7, boolean z4) {
        Context applicationContext = activity.getApplicationContext();
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        activity.getWindow().getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
        attributes.width = a(applicationContext, i4);
        attributes.height = a(applicationContext, i5);
        attributes.x = i6;
        if (z4) {
            attributes.gravity = 80;
        } else {
            attributes.y = i7;
        }
        activity.getWindow().setAttributes(attributes);
    }

    public static int b(Context context, float f5) {
        return (int) TypedValue.applyDimension(2, f5, context.getResources().getDisplayMetrics());
    }

    public static int b(Context context) {
        int top;
        if (!(context instanceof Activity) || (top = ((Activity) context).getWindow().findViewById(16908290).getTop()) == 0) {
            return 50;
        }
        return top - a(context);
    }

    public static List<View> a(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                View childAt = viewGroup.getChildAt(i4);
                arrayList.add(childAt);
                arrayList.addAll(a(childAt));
            }
        }
        return arrayList;
    }

    public static int a(Context context, float f5) {
        return (int) ((f5 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int a(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", q.a.f73126a);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 25;
    }

    public static void a(Activity activity, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = activity.getWindow();
            if (i4 != 0) {
                window.clearFlags(TTAdConstant.KEY_CLICK_AREA);
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(i4);
            }
        }
    }

    public static void a(Activity activity, boolean z4) {
        Window window = activity.getWindow();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            window.addFlags(Integer.MIN_VALUE);
        }
        if (!z4) {
            window.getDecorView().setSystemUiVisibility(0);
        } else if (i4 >= 23) {
            window.getDecorView().setSystemUiVisibility(8192);
        }
    }
}
