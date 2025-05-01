package com.join.mgps.customview;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
/* loaded from: classes4.dex */
public class PullableScrollView extends ScrollView {

    /* renamed from: b  reason: collision with root package name */
    public boolean f47576b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f47577c;

    /* renamed from: d  reason: collision with root package name */
    private a f47578d;

    /* renamed from: e  reason: collision with root package name */
    private float f47579e;

    /* renamed from: f  reason: collision with root package name */
    private float f47580f;

    /* renamed from: g  reason: collision with root package name */
    private float f47581g;

    /* renamed from: h  reason: collision with root package name */
    private float f47582h;

    /* loaded from: classes4.dex */
    public interface a {
        void a(ScrollView scrollView, int i4, int i5, int i6, int i7);
    }

    public PullableScrollView(Context context) {
        super(context);
        this.f47577c = true;
    }

    public boolean a() {
        return this.f47576b;
    }

    @Override // android.widget.ScrollView, android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (!this.f47577c || Build.VERSION.SDK_INT >= 11) {
            return super.getBottomFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.widget.ScrollView, android.view.View
    protected float getTopFadingEdgeStrength() {
        if (!this.f47577c || Build.VERSION.SDK_INT >= 11) {
            return super.getTopFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f47580f = 0.0f;
            this.f47579e = 0.0f;
            this.f47581g = motionEvent.getX();
            this.f47582h = motionEvent.getY();
        } else if (action == 2) {
            float x4 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.f47579e += Math.abs(x4 - this.f47581g);
            float abs = this.f47580f + Math.abs(y2 - this.f47582h);
            this.f47580f = abs;
            this.f47581g = x4;
            this.f47582h = y2;
            if (this.f47579e > abs) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
        a aVar = this.f47578d;
        if (aVar != null) {
            aVar.a(this, i4, i5, i6, i7);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setIsInnerScroll(boolean z4) {
        this.f47576b = z4;
    }

    public void setOnScrollChangedListener(a aVar) {
        this.f47578d = aVar;
    }

    public PullableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47577c = true;
    }

    public PullableScrollView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47577c = true;
    }
}
