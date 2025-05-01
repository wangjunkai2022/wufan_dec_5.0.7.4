package com.kwad.sdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
/* loaded from: classes5.dex */
public class d extends ViewPager {
    private int aTX;
    private boolean aTY;

    public d(@NonNull Context context) {
        super(context);
        this.aTY = false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean canScrollHorizontally(int i4) {
        if (this.aTY) {
            return super.canScrollHorizontally(i4);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.aTY) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int x4 = (int) motionEvent.getX();
        int action = motionEvent.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2) {
            int i4 = x4 - this.aTX;
            if (getCurrentItem() == 0 && i4 > 0) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.aTX = x4;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.aTY && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.aTY && super.onTouchEvent(motionEvent);
    }

    public void setScrollable(boolean z4) {
        this.aTY = z4;
    }

    public d(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.aTY = false;
    }
}
