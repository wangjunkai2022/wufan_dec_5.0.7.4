package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.join.mgps.enums.ScrollState;
/* loaded from: classes4.dex */
public class ObservableWebView extends WebView {

    /* renamed from: b  reason: collision with root package name */
    String f47521b;

    /* renamed from: c  reason: collision with root package name */
    private int f47522c;

    /* renamed from: d  reason: collision with root package name */
    private ScrollState f47523d;

    /* renamed from: e  reason: collision with root package name */
    float f47524e;

    /* renamed from: f  reason: collision with root package name */
    float f47525f;

    public ObservableWebView(Context context) {
        super(context);
        this.f47521b = getClass().getSimpleName();
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
        int i8 = this.f47522c;
        if (i8 < i5) {
            this.f47523d = ScrollState.UP;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (i5 < i8) {
            this.f47523d = ScrollState.DOWN;
            StringBuilder sb = new StringBuilder();
            sb.append("getScrollY()=");
            sb.append(getScrollY());
            if (getScrollY() == 0) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.f47522c = i5;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f47524e = motionEvent.getX();
            this.f47525f = motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (actionMasked == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (actionMasked == 2) {
            if (Math.abs(motionEvent.getX() - this.f47524e) > Math.abs(motionEvent.getY() - this.f47525f)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            } else {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (getScrollY() == 0) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public ObservableWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47521b = getClass().getSimpleName();
    }

    public ObservableWebView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47521b = getClass().getSimpleName();
    }
}
