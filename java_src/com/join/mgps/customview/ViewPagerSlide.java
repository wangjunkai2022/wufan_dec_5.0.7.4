package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
/* loaded from: classes4.dex */
public class ViewPagerSlide extends ViewPager {

    /* renamed from: b  reason: collision with root package name */
    private boolean f48042b;

    public ViewPagerSlide(Context context) {
        super(context);
        this.f48042b = false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4 = this.f48042b;
        return z4 ? super.onInterceptTouchEvent(motionEvent) : z4;
    }

    public void setSlide(boolean z4) {
        this.f48042b = z4;
    }

    public ViewPagerSlide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48042b = false;
    }
}
