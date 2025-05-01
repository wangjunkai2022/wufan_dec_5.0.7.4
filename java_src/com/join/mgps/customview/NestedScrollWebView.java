package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
@Deprecated
/* loaded from: classes4.dex */
public class NestedScrollWebView extends WebView implements NestedScrollingChild {

    /* renamed from: g  reason: collision with root package name */
    public static final String f47462g = NestedScrollWebView.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private int f47463b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f47464c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f47465d;

    /* renamed from: e  reason: collision with root package name */
    private int f47466e;

    /* renamed from: f  reason: collision with root package name */
    private NestedScrollingChildHelper f47467f;

    public NestedScrollWebView(Context context) {
        super(context);
        this.f47464c = new int[2];
        this.f47465d = new int[2];
        a();
    }

    private void a() {
        this.f47467f = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f5, float f6, boolean z4) {
        return this.f47467f.dispatchNestedFling(f5, f6, z4);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f5, float f6) {
        return this.f47467f.dispatchNestedPreFling(f5, f6);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return this.f47467f.dispatchNestedPreScroll(i4, i5, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return this.f47467f.dispatchNestedScroll(i4, i5, i6, i7, iArr);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.f47467f.hasNestedScrollingParent();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.f47467f.isNestedScrollingEnabled();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int[] iArr;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (actionMasked == 0) {
            this.f47466e = 0;
        }
        int y2 = (int) motionEvent.getY();
        motionEvent.offsetLocation(0.0f, this.f47466e);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i4 = this.f47463b - y2;
                    if (dispatchNestedPreScroll(0, i4, this.f47465d, this.f47464c)) {
                        i4 -= this.f47465d[1];
                        obtain.offsetLocation(0.0f, this.f47464c[1]);
                        this.f47466e += this.f47464c[1];
                    }
                    int scrollY = getScrollY();
                    this.f47463b = y2 - this.f47464c[1];
                    int max = Math.max(0, scrollY + i4);
                    int i5 = i4 - (max - scrollY);
                    if (dispatchNestedScroll(0, max - i5, 0, i5, this.f47464c)) {
                        this.f47463b = this.f47463b - this.f47464c[1];
                        obtain.offsetLocation(0.0f, iArr[1]);
                        this.f47466e += this.f47464c[1];
                    }
                    if (this.f47465d[1] == 0 && this.f47464c[1] == 0) {
                        obtain.recycle();
                        return super.onTouchEvent(obtain);
                    }
                    return false;
                } else if (actionMasked != 3 && actionMasked != 5) {
                    return false;
                }
            }
            stopNestedScroll();
            return super.onTouchEvent(motionEvent);
        }
        this.f47463b = y2;
        startNestedScroll(2);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z4) {
        this.f47467f.setNestedScrollingEnabled(z4);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i4) {
        return this.f47467f.startNestedScroll(i4);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.f47467f.stopNestedScroll();
    }

    public NestedScrollWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47464c = new int[2];
        this.f47465d = new int[2];
        a();
    }

    public NestedScrollWebView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47464c = new int[2];
        this.f47465d = new int[2];
        a();
    }
}
