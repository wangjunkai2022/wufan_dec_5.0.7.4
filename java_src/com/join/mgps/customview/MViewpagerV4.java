package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
/* loaded from: classes4.dex */
public class MViewpagerV4 extends ViewPager {

    /* renamed from: b  reason: collision with root package name */
    private boolean f47387b;

    public MViewpagerV4(Context context) {
        super(context);
        this.f47387b = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4 = this.f47387b;
        return !z4 ? super.onInterceptTouchEvent(motionEvent) : z4;
    }

    public void setIntercept(boolean z4) {
        this.f47387b = z4;
    }

    public MViewpagerV4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47387b = true;
    }
}
