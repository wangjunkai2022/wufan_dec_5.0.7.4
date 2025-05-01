package com.donkingliang.consecutivescroller;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class ConsecutiveViewPager extends ViewPager implements a {

    /* renamed from: b  reason: collision with root package name */
    private int f10255b;

    public ConsecutiveViewPager(@NonNull Context context) {
        super(context);
    }

    private void a(View view) {
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
        view.setOverScrollMode(2);
        ViewCompat.setNestedScrollingEnabled(view, false);
    }

    private boolean b() {
        ViewParent parent = getParent();
        if (parent instanceof ConsecutiveScrollerLayout) {
            ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) parent;
            return consecutiveScrollerLayout.indexOfChild(this) == consecutiveScrollerLayout.getChildCount() - 1;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i4, layoutParams);
        if (c.t(this)) {
            a(view);
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).setClipToPadding(false);
            }
        }
    }

    public int getAdjustHeight() {
        return this.f10255b;
    }

    @Override // com.donkingliang.consecutivescroller.a
    public View getCurrentScrollerView() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getX() == getScrollX() + getPaddingLeft()) {
                return childAt;
            }
        }
        return this;
    }

    @Override // com.donkingliang.consecutivescroller.a
    public List<View> getScrolledViews() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        if (childCount > 0) {
            for (int i4 = 0; i4 < childCount; i4++) {
                arrayList.add(getChildAt(i4));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i4, int i5) {
        if (b() && this.f10255b > 0) {
            super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(ViewGroup.getDefaultSize(0, i5) - this.f10255b, View.MeasureSpec.getMode(i5)));
        } else {
            super.onMeasure(i4, i5);
        }
    }

    public void setAdjustHeight(int i4) {
        if (this.f10255b != i4) {
            this.f10255b = i4;
            requestLayout();
        }
    }

    public ConsecutiveViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
