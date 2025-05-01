package com.join.android.app.component.photoviewer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
/* loaded from: classes3.dex */
public class MultiTouchViewPager extends ViewPager {

    /* renamed from: b  reason: collision with root package name */
    private boolean f15187b;

    public MultiTouchViewPager(Context context) {
        super(context);
        this.f15187b = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1 && this.f15187b) {
            requestDisallowInterceptTouchEvent(false);
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            requestDisallowInterceptTouchEvent(true);
            return dispatchTouchEvent;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z4) {
        this.f15187b = z4;
        super.requestDisallowInterceptTouchEvent(z4);
    }

    public MultiTouchViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15187b = false;
    }
}
