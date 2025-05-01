package com.join.mgps.behavior;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.appbar.AppBarLayout;
import com.join.android.app.mgsim.wufun.R;
import java.util.List;
import q.a;
/* loaded from: classes4.dex */
public class TitleBarBehavior extends CoordinatorLayout.Behavior {

    /* renamed from: a  reason: collision with root package name */
    final Rect f46263a;

    /* renamed from: b  reason: collision with root package name */
    final Rect f46264b;

    /* renamed from: c  reason: collision with root package name */
    private int f46265c;

    /* renamed from: d  reason: collision with root package name */
    boolean f46266d;

    /* renamed from: e  reason: collision with root package name */
    int f46267e;

    /* renamed from: f  reason: collision with root package name */
    int f46268f;

    /* renamed from: g  reason: collision with root package name */
    int f46269g;

    public TitleBarBehavior(Context context) {
        this(context, null);
    }

    private static int resolveGravity(int i4) {
        if (i4 == 0) {
            return 8388659;
        }
        return i4;
    }

    AppBarLayout findFirstDependency(List<View> list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view = list.get(i4);
            if (view instanceof AppBarLayout) {
                return (AppBarLayout) view;
            }
        }
        return null;
    }

    int getScrollRange(View view) {
        return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
        return view2 instanceof AppBarLayout;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
        this.f46269g = this.f46268f + this.f46267e + this.f46265c;
        if (view2.getBottom() >= this.f46269g) {
            ViewCompat.offsetTopAndBottom(view, (view2.getBottom() - view.getTop()) - this.f46265c);
            this.f46266d = true;
        } else {
            this.f46266d = false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i4) {
        AppBarLayout findFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view));
        if (findFirstDependency != null) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
            Rect rect = this.f46263a;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, findFirstDependency.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((coordinatorLayout.getHeight() + findFirstDependency.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
            WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(view)) {
                rect.left += lastWindowInsets.getSystemWindowInsetLeft();
                rect.right -= lastWindowInsets.getSystemWindowInsetRight();
            }
            Rect rect2 = this.f46264b;
            if (this.f46266d) {
                GravityCompat.apply(resolveGravity(layoutParams.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i4);
                view.layout(rect2.left, rect2.top - this.f46265c, rect2.right, rect2.bottom);
                return true;
            }
            int i5 = rect2.left;
            int i6 = this.f46269g;
            int i7 = this.f46265c;
            view.layout(i5, i6 - i7, rect2.right, rect2.bottom - i7);
            return true;
        }
        coordinatorLayout.onLayoutChild(view, i4);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6, int i7) {
        AppBarLayout findFirstDependency;
        int i8 = view.getLayoutParams().height;
        if ((i8 == -1 || i8 == -2) && (findFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view))) != null) {
            if (ViewCompat.getFitsSystemWindows(findFirstDependency) && !ViewCompat.getFitsSystemWindows(view)) {
                ViewCompat.setFitsSystemWindows(view, true);
                if (ViewCompat.getFitsSystemWindows(view)) {
                    view.requestLayout();
                    return true;
                }
            }
            int size = View.MeasureSpec.getSize(i6);
            if (size == 0) {
                size = coordinatorLayout.getHeight();
            }
            coordinatorLayout.onMeasureChild(view, i4, i5, View.MeasureSpec.makeMeasureSpec((size - findFirstDependency.getMeasuredHeight()) + getScrollRange(findFirstDependency), i8 == -1 ? 1073741824 : Integer.MIN_VALUE), i7);
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, int i4, int i5) {
        return false;
    }

    public void setOverlayTop(int i4) {
        this.f46265c = i4;
    }

    public TitleBarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46263a = new Rect();
        this.f46264b = new Rect();
        this.f46265c = 60;
        this.f46266d = true;
        this.f46267e = 0;
        this.f46268f = 0;
        this.f46269g = 0;
        this.f46268f = (int) context.getResources().getDimension(R.dimen.wdp96);
        this.f46267e = context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", a.f73126a));
    }
}
