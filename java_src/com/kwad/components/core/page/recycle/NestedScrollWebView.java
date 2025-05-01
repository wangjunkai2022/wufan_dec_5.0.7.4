package com.kwad.components.core.page.recycle;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.VelocityTrackerCompat;
import com.kwad.sdk.core.webview.KsAdWebView;
/* loaded from: classes5.dex */
public class NestedScrollWebView extends KsAdWebView implements NestedScrollingChild {
    private int QA;
    private int Qq;
    private int Qr;
    private final int[] Qs;
    private final int[] Qt;
    private int Qu;
    private boolean Qv;
    private int Qw;
    private int Qx;
    private NestedScrollingChildHelper Qy;
    private VelocityTracker Qz;

    public NestedScrollWebView(Context context) {
        super(context);
        this.Qs = new int[2];
        this.Qt = new int[2];
        qs();
    }

    private void qs() {
        this.QA = 0;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.Qy = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        this.Qx = viewConfiguration.getScaledMaximumFlingVelocity();
        this.Qw = viewConfiguration.getScaledMinimumFlingVelocity();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f5, float f6, boolean z4) {
        return this.Qy.dispatchNestedFling(f5, f6, z4);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f5, float f6) {
        return this.Qy.dispatchNestedPreFling(f5, f6);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return this.Qy.dispatchNestedPreScroll(i4, i5, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return this.Qy.dispatchNestedScroll(i4, i5, i6, i7, iArr);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.Qy.hasNestedScrollingParent();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.Qy.isNestedScrollingEnabled();
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        int screenHeight;
        if (this.QA != 0) {
            int statusBarHeight = com.kwad.components.core.s.d.rG() ? com.kwad.sdk.c.a.a.getStatusBarHeight(getContext()) : 0;
            if (getContext() instanceof Activity) {
                screenHeight = com.kwad.sdk.c.a.a.e((Activity) getContext());
            } else {
                screenHeight = com.kwad.sdk.c.a.a.getScreenHeight(getContext());
            }
            i5 = View.MeasureSpec.makeMeasureSpec((screenHeight - statusBarHeight) - this.QA, 1073741824);
        }
        super.onMeasure(i4, i5);
    }

    @Override // com.kwad.sdk.core.webview.KsAdWebView, android.webkit.WebView, android.view.View
    public void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
        if (hasFocus()) {
            return;
        }
        requestFocus();
    }

    @Override // com.kwad.sdk.core.webview.KsAdWebView, android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int[] iArr;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        boolean z4 = false;
        if (actionMasked == 0) {
            this.Qu = 0;
        }
        if (this.Qz == null) {
            this.Qz = VelocityTracker.obtain();
        }
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        int y2 = (int) motionEvent.getY();
        motionEvent.offsetLocation(0.0f, this.Qu);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i4 = this.Qq - y2;
                    if (dispatchNestedPreScroll(0, i4, this.Qt, this.Qs)) {
                        i4 -= this.Qt[1];
                        obtain.offsetLocation(0.0f, this.Qs[1]);
                        this.Qu += this.Qs[1];
                    }
                    int scrollY = getScrollY();
                    this.Qq = y2 - this.Qs[1];
                    int max = Math.max(0, scrollY + i4);
                    int i5 = i4 - (max - scrollY);
                    if (dispatchNestedScroll(0, max - i5, 0, i5, this.Qs)) {
                        this.Qq = this.Qq - this.Qs[1];
                        obtain.offsetLocation(0.0f, iArr[1]);
                        this.Qu += this.Qs[1];
                    }
                    if (Math.abs(this.Qt[1]) < 5 && Math.abs(this.Qs[1]) < 5) {
                        if (this.Qv) {
                            this.Qv = false;
                            onTouchEvent = false;
                        } else {
                            onTouchEvent = super.onTouchEvent(obtain);
                        }
                        obtain.recycle();
                    } else {
                        if (!this.Qv) {
                            this.Qv = true;
                            super.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        }
                        onTouchEvent = false;
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        stopNestedScroll();
                        onTouchEvent = super.onTouchEvent(motionEvent);
                    }
                    onTouchEvent = false;
                }
            }
            this.Qz.addMovement(motionEvent);
            this.Qz.computeCurrentVelocity(1000, this.Qx);
            float f5 = -VelocityTrackerCompat.getYVelocity(this.Qz, MotionEventCompat.getPointerId(motionEvent, actionIndex));
            if (Math.abs(f5) > this.Qw && !dispatchNestedPreFling(0.0f, f5) && hasNestedScrollingParent()) {
                dispatchNestedFling(0.0f, f5, true);
            }
            boolean onTouchEvent2 = super.onTouchEvent(motionEvent);
            stopNestedScroll();
            if (Math.abs(motionEvent.getY() - this.Qq) < 10.0f) {
                Math.abs(motionEvent.getX() - this.Qr);
            }
            onTouchEvent = onTouchEvent2;
            z4 = true;
        } else {
            this.Qq = y2;
            this.Qr = (int) motionEvent.getX();
            startNestedScroll(2);
            int[] iArr2 = this.Qt;
            iArr2[0] = 0;
            iArr2[1] = 0;
            int[] iArr3 = this.Qs;
            iArr3[0] = 0;
            iArr3[1] = 0;
            onTouchEvent = super.onTouchEvent(motionEvent);
            this.Qv = false;
        }
        if (!z4) {
            this.Qz.addMovement(motionEvent);
        }
        return onTouchEvent;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z4) {
        this.Qy.setNestedScrollingEnabled(z4);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i4) {
        return this.Qy.startNestedScroll(i4);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.Qy.stopNestedScroll();
    }

    public NestedScrollWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Qs = new int[2];
        this.Qt = new int[2];
        qs();
    }

    public NestedScrollWebView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.Qs = new int[2];
        this.Qt = new int[2];
        qs();
    }
}
