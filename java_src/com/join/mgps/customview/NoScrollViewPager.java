package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
/* loaded from: classes4.dex */
public class NoScrollViewPager extends ViewPager {

    /* renamed from: b  reason: collision with root package name */
    private boolean f47489b;

    public NoScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47489b = false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f47489b) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f47489b) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void scrollTo(int i4, int i5) {
        super.scrollTo(i4, i5);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i4, boolean z4) {
        super.setCurrentItem(i4, z4);
    }

    public void setNoScroll(boolean z4) {
        this.f47489b = z4;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i4) {
        super.setCurrentItem(i4);
    }

    public NoScrollViewPager(Context context) {
        super(context);
        this.f47489b = false;
    }
}
