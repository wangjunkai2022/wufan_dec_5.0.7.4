package com.join.mgps.Util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: MeasureUtil.java */
/* loaded from: classes3.dex */
public class c1 {
    public static int a(Context context, float f5) {
        return (int) ((f5 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int b(Activity activity) {
        Resources resources = activity.getResources();
        resources.getIdentifier("config_showNavigationBar", "bool", q.a.f73126a);
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", q.a.f73126a);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static Point c(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        return point;
    }

    public static int d(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", q.a.f73126a);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int e(Context context) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.actionBarSize});
        int dimension = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        return dimension;
    }

    public static int f(Context context, float f5) {
        return (int) ((f5 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int g(Context context, float f5) {
        return (int) ((f5 / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static void h(ListView listView) {
        ListAdapter adapter = listView.getAdapter();
        if (adapter == null) {
            return;
        }
        int paddingTop = listView.getPaddingTop() + listView.getPaddingBottom();
        for (int i4 = 0; i4 < adapter.getCount(); i4++) {
            View view = adapter.getView(i4, null, listView);
            if (view instanceof ViewGroup) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(0, 0);
            paddingTop += view.getMeasuredHeight();
        }
        ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
        layoutParams.height = paddingTop + (listView.getDividerHeight() * (adapter.getCount() - 1));
        listView.setLayoutParams(layoutParams);
    }

    public static void i(ListView listView) {
        ListAdapter adapter = listView.getAdapter();
        if (adapter == null) {
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), Integer.MIN_VALUE);
        View view = null;
        int i4 = 0;
        for (int i5 = 0; i5 < adapter.getCount(); i5++) {
            view = adapter.getView(i5, view, listView);
            if (i5 == 0) {
                view.setLayoutParams(new ViewGroup.LayoutParams(makeMeasureSpec, -2));
            }
            view.measure(makeMeasureSpec, 0);
            i4 += view.getMeasuredHeight();
        }
        ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
        layoutParams.height = i4 + (listView.getDividerHeight() * (adapter.getCount() - 1));
        listView.setLayoutParams(layoutParams);
        listView.requestLayout();
    }

    public static int j(Context context, float f5) {
        return (int) ((f5 * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
