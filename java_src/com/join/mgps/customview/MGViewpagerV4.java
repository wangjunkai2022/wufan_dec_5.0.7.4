package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
/* loaded from: classes4.dex */
public class MGViewpagerV4 extends ViewPager {

    /* renamed from: b  reason: collision with root package name */
    private boolean f47377b;

    public MGViewpagerV4(Context context) {
        super(context);
        this.f47377b = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4 = this.f47377b;
        return !z4 ? super.onInterceptTouchEvent(motionEvent) : z4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i4, int i5) {
        int i6 = 0;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt != null) {
                childAt.measure(i4, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i6) {
                    i6 = measuredHeight;
                }
            }
        }
        super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
    }

    public void setIntercept(boolean z4) {
        this.f47377b = z4;
    }

    public MGViewpagerV4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47377b = true;
    }
}
