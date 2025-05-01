package com.join.mgps.customview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ViewCompat;
/* loaded from: classes4.dex */
public class NestedWebView extends WebView implements NestedScrollingChild3 {

    /* renamed from: o  reason: collision with root package name */
    private static final String f47471o = "NestedWebView";

    /* renamed from: p  reason: collision with root package name */
    private static final int f47472p = -1;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f47473b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f47474c;

    /* renamed from: d  reason: collision with root package name */
    private int f47475d;

    /* renamed from: e  reason: collision with root package name */
    private NestedScrollingChildHelper f47476e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f47477f;

    /* renamed from: g  reason: collision with root package name */
    private VelocityTracker f47478g;

    /* renamed from: h  reason: collision with root package name */
    private int f47479h;

    /* renamed from: i  reason: collision with root package name */
    private int f47480i;

    /* renamed from: j  reason: collision with root package name */
    private int f47481j;

    /* renamed from: k  reason: collision with root package name */
    private OverScroller f47482k;

    /* renamed from: l  reason: collision with root package name */
    private int f47483l;

    /* renamed from: m  reason: collision with root package name */
    private int f47484m;

    /* renamed from: n  reason: collision with root package name */
    private int f47485n;

    public NestedWebView(Context context) {
        this(context, null);
    }

    private void a() {
        this.f47482k.abortAnimation();
        stopNestedScroll(1);
    }

    private void b() {
        this.f47477f = false;
        i();
        stopNestedScroll();
    }

    private void c(int i4) {
        this.f47482k.fling(getScrollX(), getScrollY(), 0, i4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, getHeight() / 2);
        j(true);
    }

    private void d() {
        VelocityTracker velocityTracker = this.f47478g;
        if (velocityTracker == null) {
            this.f47478g = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void e() {
        this.f47482k = new OverScroller(getContext());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f47479h = viewConfiguration.getScaledTouchSlop();
        this.f47483l = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f47484m = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void f() {
        if (this.f47478g == null) {
            this.f47478g = VelocityTracker.obtain();
        }
    }

    private void g(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
        if (motionEvent.getPointerId(action) == this.f47480i) {
            int i4 = action == 0 ? 1 : 0;
            this.f47475d = (int) motionEvent.getY(i4);
            this.f47480i = motionEvent.getPointerId(i4);
            VelocityTracker velocityTracker = this.f47478g;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean h(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = 0
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
        L4e:
            r2 = 1
            goto L55
        L50:
            if (r3 >= r7) goto L54
            r3 = r7
            goto L4e
        L54:
            r2 = 0
        L55:
            if (r6 <= r1) goto L5a
            r6 = r1
        L58:
            r1 = 1
            goto L5f
        L5a:
            if (r6 >= r8) goto L5e
            r6 = r8
            goto L58
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L7e
            boolean r7 = r12.hasNestedScrollingParent(r5)
            if (r7 != 0) goto L7e
            android.widget.OverScroller r7 = r0.f47482k
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L85
            if (r1 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.customview.NestedWebView.h(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    private void i() {
        VelocityTracker velocityTracker = this.f47478g;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f47478g = null;
        }
    }

    private void j(boolean z4) {
        if (z4) {
            startNestedScroll(2, 1);
        } else {
            stopNestedScroll(1);
        }
        this.f47485n = getScrollY();
        ViewCompat.postInvalidateOnAnimation(this);
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
        if (this.f47482k.isFinished()) {
            return;
        }
        this.f47482k.computeScrollOffset();
        int currY = this.f47482k.getCurrY();
        int i4 = currY - this.f47485n;
        this.f47485n = currY;
        int[] iArr = this.f47474c;
        iArr[1] = 0;
        dispatchNestedPreScroll(0, i4, iArr, null, 1);
        int i5 = i4 - this.f47474c[1];
        if (i5 != 0) {
            int scrollY = getScrollY();
            h(0, i5, getScrollX(), scrollY, 0, getScrollRange(), 0, 0, false);
            int scrollY2 = i5 - (getScrollY() - scrollY);
            int[] iArr2 = this.f47474c;
            iArr2[1] = 0;
            dispatchNestedScroll(0, 0, 0, scrollY2, this.f47473b, 1, iArr2);
            i5 = scrollY2 - this.f47474c[1];
        }
        if (i5 != 0) {
            a();
        }
        if (this.f47482k.isFinished()) {
            return;
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f5, float f6, boolean z4) {
        return this.f47476e.dispatchNestedFling(f5, f6, false);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f5, float f6) {
        return this.f47476e.dispatchNestedPreFling(f5, f6);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i4, i5, iArr, iArr2, 0);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return dispatchNestedScroll(i4, i5, i6, i7, iArr, 0);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return 2;
    }

    int getScrollRange() {
        return computeVerticalScrollRange();
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i4) {
        return this.f47476e.hasNestedScrollingParent(i4);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.f47476e.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f47477f) {
            return true;
        }
        int i4 = action & 255;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = this.f47480i;
                    if (i5 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i5);
                        if (findPointerIndex == -1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid pointerId=");
                            sb.append(i5);
                            sb.append(" in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.f47475d) > this.f47479h && (2 & getNestedScrollAxes()) == 0) {
                                this.f47477f = true;
                                this.f47475d = y2;
                                f();
                                this.f47478g.addMovement(motionEvent);
                                this.f47481j = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i4 != 3) {
                    if (i4 == 6) {
                        g(motionEvent);
                    }
                }
            }
            this.f47477f = false;
            this.f47480i = -1;
            i();
            if (this.f47482k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                ViewCompat.postInvalidateOnAnimation(this);
            }
            stopNestedScroll();
        } else {
            this.f47475d = (int) motionEvent.getY();
            this.f47480i = motionEvent.getPointerId(0);
            d();
            this.f47478g.addMovement(motionEvent);
            this.f47482k.computeScrollOffset();
            this.f47477f = !this.f47482k.isFinished();
            startNestedScroll(2);
        }
        return this.f47477f;
    }

    @Override // android.webkit.WebView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        f();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f47481j = 0;
        }
        obtain.offsetLocation(0.0f, this.f47481j);
        if (actionMasked == 0) {
            boolean z4 = !this.f47482k.isFinished();
            this.f47477f = z4;
            if (z4 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f47482k.isFinished()) {
                a();
            }
            this.f47475d = (int) motionEvent.getY();
            this.f47480i = motionEvent.getPointerId(0);
            startNestedScroll(2, 0);
        } else if (actionMasked == 1) {
            VelocityTracker velocityTracker = this.f47478g;
            velocityTracker.computeCurrentVelocity(1000, this.f47484m);
            int yVelocity = (int) velocityTracker.getYVelocity(this.f47480i);
            if (Math.abs(yVelocity) > this.f47483l) {
                int i4 = -yVelocity;
                float f5 = i4;
                if (!dispatchNestedPreFling(0.0f, f5)) {
                    dispatchNestedFling(0.0f, f5, true);
                    c(i4);
                }
            } else if (this.f47482k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                ViewCompat.postInvalidateOnAnimation(this);
            }
            this.f47480i = -1;
            b();
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f47480i);
            if (findPointerIndex == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid pointerId=");
                sb.append(this.f47480i);
                sb.append(" in onTouchEvent");
            } else {
                int y2 = (int) motionEvent.getY(findPointerIndex);
                int i5 = this.f47475d - y2;
                if (dispatchNestedPreScroll(0, i5, this.f47474c, this.f47473b, 0)) {
                    i5 -= this.f47474c[1];
                    this.f47481j += this.f47473b[1];
                }
                if (!this.f47477f && Math.abs(i5) > this.f47479h) {
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    this.f47477f = true;
                    if (i5 > 0) {
                        i5 -= this.f47479h;
                    } else {
                        i5 += this.f47479h;
                    }
                }
                int i6 = i5;
                if (this.f47477f) {
                    this.f47475d = y2 - this.f47473b[1];
                    int scrollY = getScrollY();
                    if (h(0, i6, 0, scrollY, 0, getScrollRange(), 0, 0, true) && !hasNestedScrollingParent(0)) {
                        this.f47478g.clear();
                    }
                    int scrollY2 = getScrollY() - scrollY;
                    int[] iArr = this.f47474c;
                    iArr[1] = 0;
                    dispatchNestedScroll(0, scrollY2, 0, i6 - scrollY2, this.f47473b, 0, iArr);
                    int i7 = this.f47475d;
                    int[] iArr2 = this.f47473b;
                    this.f47475d = i7 - iArr2[1];
                    this.f47481j += iArr2[1];
                }
            }
        } else if (actionMasked == 3) {
            if (this.f47477f && this.f47482k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                ViewCompat.postInvalidateOnAnimation(this);
            }
            this.f47480i = -1;
            b();
        } else if (actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            this.f47475d = (int) motionEvent.getY(actionIndex);
            this.f47480i = motionEvent.getPointerId(actionIndex);
        } else if (actionMasked == 6) {
            g(motionEvent);
            this.f47475d = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f47480i));
        }
        VelocityTracker velocityTracker2 = this.f47478g;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected boolean overScrollBy(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z4) {
        if (this.f47477f) {
            return true;
        }
        h(i4, i5, i6, i7, i8, i9, i10, i11, z4);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z4) {
        if (z4) {
            i();
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z4) {
        this.f47476e.setNestedScrollingEnabled(z4);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i4, int i5) {
        return this.f47476e.startNestedScroll(i4, i5);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i4) {
        this.f47476e.stopNestedScroll(i4);
    }

    public NestedWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842885);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2, int i6) {
        return this.f47476e.dispatchNestedPreScroll(i4, i5, iArr, iArr2, i6);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr, int i8) {
        return this.f47476e.dispatchNestedScroll(i4, i5, i6, i7, iArr, i8);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i4) {
        return startNestedScroll(i4, 0);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public NestedWebView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47473b = new int[2];
        this.f47474c = new int[2];
        this.f47477f = false;
        this.f47480i = -1;
        setOverScrollMode(2);
        e();
        this.f47476e = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public void dispatchNestedScroll(int i4, int i5, int i6, int i7, @Nullable int[] iArr, int i8, @NonNull int[] iArr2) {
        this.f47476e.dispatchNestedScroll(i4, i5, i6, i7, iArr, i8, iArr2);
    }
}
