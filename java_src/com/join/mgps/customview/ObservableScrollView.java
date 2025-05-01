package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
import androidx.core.view.MotionEventCompat;
import com.join.mgps.enums.ScrollState;
/* loaded from: classes4.dex */
public class ObservableScrollView extends ScrollView {

    /* renamed from: b  reason: collision with root package name */
    String f47511b;

    /* renamed from: c  reason: collision with root package name */
    private w1.m f47512c;

    /* renamed from: d  reason: collision with root package name */
    private int f47513d;

    /* renamed from: e  reason: collision with root package name */
    private int f47514e;

    /* renamed from: f  reason: collision with root package name */
    private ScrollState f47515f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f47516g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f47517h;

    /* renamed from: i  reason: collision with root package name */
    boolean f47518i;

    /* renamed from: j  reason: collision with root package name */
    float f47519j;

    /* renamed from: k  reason: collision with root package name */
    float f47520k;

    public ObservableScrollView(Context context) {
        super(context);
        this.f47511b = getClass().getSimpleName();
        this.f47518i = false;
    }

    public int getCurrentScrollY() {
        return this.f47514e;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (MotionEventCompat.getActionMasked(motionEvent) == 0) {
            this.f47517h = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
        w1.m mVar = this.f47512c;
        if (mVar != null) {
            mVar.a(i5, this.f47516g, this.f47517h);
        }
        if (this.f47516g) {
            this.f47516g = false;
        }
        int i8 = this.f47513d;
        if (i8 < i5) {
            this.f47515f = ScrollState.UP;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (i5 < i8) {
            this.f47515f = ScrollState.DOWN;
            StringBuilder sb = new StringBuilder();
            sb.append("getScrollY()=");
            sb.append(getScrollY());
            if (getScrollY() == 0) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.f47513d = i5;
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f47518i = false;
            this.f47519j = motionEvent.getX();
            this.f47520k = motionEvent.getY();
            this.f47517h = true;
            this.f47516g = true;
            w1.m mVar = this.f47512c;
            if (mVar != null) {
                mVar.c();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (actionMasked == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (actionMasked == 2) {
            if (Math.abs(motionEvent.getX() - this.f47519j) > Math.abs(motionEvent.getY() - this.f47520k)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            } else {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (getScrollY() == 0) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.f47518i = true;
        } else if (actionMasked == 3) {
            this.f47517h = false;
            w1.m mVar2 = this.f47512c;
            if (mVar2 != null) {
                mVar2.b(this.f47515f);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setScrollViewCallbacks(w1.m mVar) {
        this.f47512c = mVar;
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47511b = getClass().getSimpleName();
        this.f47518i = false;
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47511b = getClass().getSimpleName();
        this.f47518i = false;
    }
}
