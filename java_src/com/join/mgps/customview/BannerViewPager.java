package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
/* loaded from: classes4.dex */
public class BannerViewPager extends ViewPager {

    /* renamed from: f  reason: collision with root package name */
    public static final int f46412f = 5;

    /* renamed from: b  reason: collision with root package name */
    protected ViewPager f46413b;

    /* renamed from: c  reason: collision with root package name */
    private int f46414c;

    /* renamed from: d  reason: collision with root package name */
    private float f46415d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f46416e;

    public BannerViewPager(Context context) {
        super(context);
        this.f46413b = null;
        this.f46415d = 0.0f;
        this.f46416e = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f46415d = 0.0f;
            this.f46416e = false;
        } else if (action == 1) {
            this.f46415d = 0.0f;
            this.f46416e = false;
        } else if (action == 2) {
            float f5 = this.f46415d;
            if (f5 != 0.0f) {
                this.f46415d = f5 - motionEvent.getX();
            }
            if (Math.abs(this.f46415d) > 5.0f) {
                this.f46416e = true;
            }
            getParent().requestDisallowInterceptTouchEvent(this.f46416e);
            this.f46415d = motionEvent.getX();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getTotalSize() {
        return this.f46414c;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
    }

    public void setTotalSize(int i4) {
        this.f46414c = i4;
    }

    public BannerViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46413b = null;
        this.f46415d = 0.0f;
        this.f46416e = false;
    }
}
