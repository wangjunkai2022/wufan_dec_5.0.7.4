package com.join.mgps.customview;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Transformation;
import android.widget.Scroller;
import com.facebook.common.statfs.StatFsHelper;
import com.join.mgps.customview.AdapterView;
/* loaded from: classes4.dex */
public final class Gallery extends AbsSpinner implements GestureDetector.OnGestureListener {
    private static final int Q1 = 250;
    private int A1;
    private int B1;
    private final GestureDetector C1;
    private int D1;
    private View E1;
    private final c F1;
    private final Runnable G1;
    private boolean H1;
    private View I1;
    private boolean J1;
    private boolean K1;
    private boolean L1;
    private boolean M1;
    private AdapterView.b N1;
    private boolean O1;
    private boolean P1;
    private int W;

    /* renamed from: p0  reason: collision with root package name */
    private int f47085p0;

    /* renamed from: p1  reason: collision with root package name */
    private float f47086p1;

    /* renamed from: v1  reason: collision with root package name */
    private int f47087v1;

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Gallery.this.L1 = false;
            Gallery.this.p();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Gallery.this.M();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final Scroller f47090b;

        /* renamed from: c  reason: collision with root package name */
        private int f47091c;

        public c() {
            this.f47090b = new Scroller(Gallery.this.getContext());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(boolean z4) {
            this.f47090b.forceFinished(true);
            if (z4) {
                Gallery.this.c0();
            }
        }

        private void d() {
            Gallery.this.removeCallbacks(this);
        }

        public void e(int i4) {
            if (i4 == 0) {
                return;
            }
            d();
            this.f47091c = 0;
            this.f47090b.startScroll(0, 0, -i4, 0, Gallery.this.f47085p0);
            Gallery.this.post(this);
        }

        public void f(int i4) {
            if (i4 == 0) {
                return;
            }
            d();
            int i5 = i4 < 0 ? Integer.MAX_VALUE : 0;
            this.f47091c = i5;
            this.f47090b.fling(i5, 0, i4, 0, 0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
            Gallery.this.post(this);
        }

        public void g(boolean z4) {
            Gallery.this.removeCallbacks(this);
            c(z4);
        }

        @Override // java.lang.Runnable
        public void run() {
            int childCount;
            int max;
            int i4;
            Gallery gallery = Gallery.this;
            if (gallery.f46362t != 0) {
                gallery.H1 = false;
                Scroller scroller = this.f47090b;
                boolean computeScrollOffset = scroller.computeScrollOffset();
                int currX = scroller.getCurrX();
                int i5 = this.f47091c - currX;
                if (i5 > 0) {
                    Gallery gallery2 = Gallery.this;
                    if (gallery2.P1) {
                        Gallery gallery3 = Gallery.this;
                        i4 = (gallery3.f46344b + gallery3.getChildCount()) - 1;
                    } else {
                        i4 = Gallery.this.f46344b;
                    }
                    gallery2.D1 = i4;
                    max = Math.min(((Gallery.this.getWidth() - Gallery.this.getPaddingLeft()) - Gallery.this.getPaddingRight()) - 1, i5);
                } else {
                    Gallery gallery4 = Gallery.this;
                    if (gallery4.P1) {
                        childCount = Gallery.this.f46344b;
                    } else {
                        Gallery gallery5 = Gallery.this;
                        childCount = (gallery5.f46344b + gallery5.getChildCount()) - 1;
                    }
                    gallery4.D1 = childCount;
                    max = Math.max(-(((Gallery.this.getWidth() - Gallery.this.getPaddingRight()) - Gallery.this.getPaddingLeft()) - 1), i5);
                }
                Gallery.this.g0(max);
                if (computeScrollOffset && !Gallery.this.H1) {
                    this.f47091c = currX;
                    Gallery.this.post(this);
                    return;
                }
                c(true);
                return;
            }
            c(true);
        }
    }

    public Gallery(Context context) {
        this(context, null);
    }

    private int I(View view, boolean z4) {
        int measuredHeight = z4 ? getMeasuredHeight() : getHeight();
        int measuredHeight2 = z4 ? view.getMeasuredHeight() : view.getHeight();
        int i4 = this.B1;
        if (i4 == 16) {
            Rect rect = this.Q;
            int i5 = rect.top;
            return i5 + ((((measuredHeight - rect.bottom) - i5) - measuredHeight2) / 2);
        } else if (i4 != 48) {
            if (i4 != 80) {
                return 0;
            }
            return (measuredHeight - this.Q.bottom) - measuredHeight2;
        } else {
            return this.Q.top;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r10.P1 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
        if (r10.P1 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void J(boolean r11) {
        /*
            r10 = this;
            int r0 = r10.getChildCount()
            int r1 = r10.f46344b
            r2 = 0
            if (r11 == 0) goto L38
            int r3 = r10.getPaddingLeft()
            r4 = 0
            r5 = 0
            r6 = 0
        L10:
            if (r4 >= r0) goto L33
            boolean r7 = r10.P1
            if (r7 == 0) goto L1a
            int r7 = r0 + (-1)
            int r7 = r7 - r4
            goto L1b
        L1a:
            r7 = r4
        L1b:
            android.view.View r8 = r10.getChildAt(r7)
            int r9 = r8.getRight()
            if (r9 < r3) goto L26
            goto L33
        L26:
            int r5 = r5 + 1
            com.join.mgps.customview.AbsSpinner$b r6 = r10.T
            int r9 = r1 + r7
            r6.d(r9, r8)
            int r4 = r4 + 1
            r6 = r7
            goto L10
        L33:
            boolean r0 = r10.P1
            if (r0 != 0) goto L6d
            goto L6e
        L38:
            int r3 = r10.getWidth()
            int r4 = r10.getPaddingRight()
            int r3 = r3 - r4
            int r0 = r0 + (-1)
            r4 = r0
            r5 = 0
            r6 = 0
        L46:
            if (r4 < 0) goto L68
            boolean r7 = r10.P1
            if (r7 == 0) goto L4f
            int r7 = r0 - r4
            goto L50
        L4f:
            r7 = r4
        L50:
            android.view.View r8 = r10.getChildAt(r7)
            int r9 = r8.getLeft()
            if (r9 > r3) goto L5b
            goto L68
        L5b:
            int r5 = r5 + 1
            com.join.mgps.customview.AbsSpinner$b r6 = r10.T
            int r9 = r1 + r7
            r6.d(r9, r8)
            int r4 = r4 + (-1)
            r6 = r7
            goto L46
        L68:
            boolean r0 = r10.P1
            if (r0 == 0) goto L6d
            goto L6e
        L6d:
            r2 = r6
        L6e:
            r10.detachViewsFromParent(r2, r5)
            boolean r0 = r10.P1
            if (r11 == r0) goto L7a
            int r11 = r10.f46344b
            int r11 = r11 + r5
            r10.f46344b = r11
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.customview.Gallery.J(boolean):void");
    }

    private boolean K(View view, int i4, long j4) {
        AdapterView.e eVar = this.f46355m;
        boolean a5 = eVar != null ? eVar.a(this, this.E1, this.D1, j4) : false;
        if (!a5) {
            this.N1 = new AdapterView.b(view, i4, j4);
            a5 = super.showContextMenuForChild(this);
        }
        if (a5) {
            performHapticFeedback(0);
        }
        return a5;
    }

    private void L(View view) {
        if (view != null) {
            view.setPressed(true);
        }
        setPressed(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount >= 0) {
                getChildAt(childCount).setPressed(false);
            } else {
                setPressed(false);
                return;
            }
        }
    }

    private void N() {
        if (this.P1) {
            P();
        } else {
            O();
        }
    }

    private void O() {
        int right;
        int i4;
        int i5 = this.W;
        int paddingLeft = getPaddingLeft();
        View childAt = getChildAt(0);
        if (childAt != null) {
            i4 = this.f46344b - 1;
            right = childAt.getLeft() - i5;
        } else {
            right = (getRight() - getLeft()) - getPaddingRight();
            this.H1 = true;
            i4 = 0;
        }
        while (right > paddingLeft && i4 >= 0) {
            View V = V(i4, i4 - this.f46359q, right, false);
            this.f46344b = i4;
            right = V.getLeft() - i5;
            i4--;
        }
    }

    private void P() {
        int i4;
        int right;
        int i5 = this.W;
        int paddingLeft = getPaddingLeft();
        int childCount = getChildCount();
        View childAt = getChildAt(childCount - 1);
        if (childAt != null) {
            i4 = this.f46344b + childCount;
            right = childAt.getLeft() - i5;
        } else {
            i4 = this.f46362t - 1;
            this.f46344b = i4;
            right = (getRight() - getLeft()) - getPaddingRight();
            this.H1 = true;
        }
        while (right > paddingLeft && i4 < this.f46362t) {
            right = V(i4, i4 - this.f46359q, right, false).getLeft() - i5;
            i4++;
        }
    }

    private void Q() {
        if (this.P1) {
            S();
        } else {
            R();
        }
    }

    private void R() {
        int i4;
        int paddingLeft;
        int i5 = this.W;
        int right = (getRight() - getLeft()) - getPaddingRight();
        int childCount = getChildCount();
        int i6 = this.f46362t;
        View childAt = getChildAt(childCount - 1);
        if (childAt != null) {
            i4 = this.f46344b + childCount;
            paddingLeft = childAt.getRight() + i5;
        } else {
            i4 = this.f46362t - 1;
            this.f46344b = i4;
            paddingLeft = getPaddingLeft();
            this.H1 = true;
        }
        while (paddingLeft < right && i4 < i6) {
            paddingLeft = V(i4, i4 - this.f46359q, paddingLeft, true).getRight() + i5;
            i4++;
        }
    }

    private void S() {
        int paddingLeft;
        int i4 = this.W;
        int right = (getRight() - getLeft()) - getPaddingRight();
        int i5 = 0;
        View childAt = getChildAt(0);
        if (childAt != null) {
            i5 = this.f46344b - 1;
            paddingLeft = childAt.getRight() + i4;
        } else {
            paddingLeft = getPaddingLeft();
            this.H1 = true;
        }
        while (paddingLeft < right && i5 >= 0) {
            View V = V(i5, i5 - this.f46359q, paddingLeft, true);
            this.f46344b = i5;
            paddingLeft = V.getRight() + i4;
            i5--;
        }
    }

    private static int T(View view) {
        return view.getLeft();
    }

    private View V(int i4, int i5, int i6, boolean z4) {
        View b5;
        if (!this.f46356n && (b5 = this.T.b(i4)) != null) {
            int left = b5.getLeft();
            this.A1 = Math.max(this.A1, b5.getMeasuredWidth() + left);
            this.f47087v1 = Math.min(this.f47087v1, left);
            f0(b5, i5, i6, z4);
            return b5;
        }
        View view = this.I.getView(i4, null, this);
        f0(view, i5, i6, z4);
        return view;
    }

    private void Y(int i4) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            getChildAt(childCount).offsetLeftAndRight(i4);
        }
    }

    private void a0() {
        if (this.L1) {
            this.L1 = false;
            super.p();
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        View view;
        if (getChildCount() == 0 || (view = this.I1) == null) {
            return;
        }
        int galleryLockPoint = getGalleryLockPoint() - T(view);
        if (galleryLockPoint != 0) {
            this.F1.e(galleryLockPoint);
        } else {
            a0();
        }
    }

    private boolean d0(int i4) {
        View childAt = getChildAt(i4);
        if (childAt != null) {
            this.F1.e(getGalleryLockPoint() - T(childAt));
            return true;
        }
        return false;
    }

    private void e0() {
        if (this.I1 == null) {
            return;
        }
        int galleryLockPoint = getGalleryLockPoint();
        int i4 = Integer.MAX_VALUE;
        int i5 = 0;
        int childCount = getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = getChildAt(childCount);
            if (childAt.getLeft() == galleryLockPoint && childAt.getRight() >= galleryLockPoint) {
                i5 = childCount;
                break;
            }
            int min = Math.min(Math.abs(childAt.getLeft() - galleryLockPoint), Math.abs(childAt.getRight() - galleryLockPoint));
            if (min < i4) {
                i5 = childCount;
                i4 = min;
            }
            childCount--;
        }
        int i6 = this.f46344b + i5;
        if (i6 != this.f46359q) {
            setSelectedPositionInt(i6);
            setNextSelectedPositionInt(i6);
            e();
        }
    }

    private void f0(View view, int i4, int i5, boolean z4) {
        int i6;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, z4 != this.P1 ? -1 : 0, layoutParams);
        view.setSelected(i4 == 0);
        int i7 = this.J;
        Rect rect = this.Q;
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, rect.top + rect.bottom, layoutParams.height);
        int i8 = this.K;
        Rect rect2 = this.Q;
        view.measure(ViewGroup.getChildMeasureSpec(i8, rect2.left + rect2.right, layoutParams.width), childMeasureSpec);
        int I = I(view, true);
        int measuredHeight = view.getMeasuredHeight() + I;
        int measuredWidth = view.getMeasuredWidth();
        if (z4) {
            i6 = measuredWidth + i5;
        } else {
            int i9 = i5 - measuredWidth;
            i6 = i5;
            i5 = i9;
        }
        view.layout(i5, I, i6, measuredHeight);
    }

    private int getGalleryLockPoint() {
        return getPaddingLeft();
    }

    private void h0() {
        View view = this.I1;
        View childAt = getChildAt(this.f46359q - this.f46344b);
        this.I1 = childAt;
        if (childAt == null) {
            return;
        }
        childAt.setSelected(true);
        childAt.setFocusable(true);
        if (hasFocus()) {
            childAt.requestFocus();
        }
        if (view == null || view == childAt) {
            return;
        }
        view.setSelected(false);
        view.setFocusable(false);
    }

    int U(boolean z4, int i4) {
        View childAt = getChildAt((z4 != this.P1 ? this.f46362t - 1 : 0) - this.f46344b);
        if (childAt == null) {
            return i4;
        }
        int T = T(childAt);
        int galleryLockPoint = getGalleryLockPoint();
        if (z4) {
            if (T <= galleryLockPoint) {
                return 0;
            }
        } else if (T >= galleryLockPoint) {
            return 0;
        }
        int i5 = galleryLockPoint - T;
        if (z4) {
            return Math.max(i5, i4);
        }
        return Math.min(i5, i4);
    }

    boolean W() {
        int i4;
        int i5 = this.f46362t;
        if (i5 <= 0 || (i4 = this.f46359q) >= i5 - 1) {
            return false;
        }
        d0((i4 - this.f46344b) + 1);
        return true;
    }

    boolean X() {
        int i4;
        if (this.f46362t <= 0 || (i4 = this.f46359q) <= 0) {
            return false;
        }
        setSelection(i4 - 1);
        return true;
    }

    void Z() {
        b0();
    }

    void b0() {
        if (this.F1.f47090b.isFinished()) {
            c0();
        }
        M();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.LayoutParams;
    }

    @Override // android.view.View
    protected int computeHorizontalScrollExtent() {
        return 1;
    }

    @Override // android.view.View
    protected int computeHorizontalScrollOffset() {
        return this.f46359q;
    }

    @Override // android.view.View
    protected int computeHorizontalScrollRange() {
        return this.f46362t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return keyEvent.dispatch(this, null, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z4) {
        View view = this.I1;
        if (view != null) {
            view.setPressed(z4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetSelected(boolean z4) {
    }

    void g0(int i4) {
        if (getChildCount() == 0) {
            return;
        }
        boolean z4 = i4 < 0;
        int U = U(z4, i4);
        if (U != i4) {
            this.F1.c(false);
            a0();
        }
        Y(U);
        J(z4);
        if (z4) {
            Q();
        } else {
            N();
        }
        this.T.a();
        e0();
        onScrollChanged(0, 0, 0, 0);
        invalidate();
    }

    @Override // com.join.mgps.customview.AbsSpinner, android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i4, int i5) {
        int i6 = this.f46359q - this.f46344b;
        return i6 < 0 ? i5 : i5 == i4 + (-1) ? i6 : i5 >= i6 ? i5 + 1 : i5;
    }

    @Override // android.view.ViewGroup
    protected boolean getChildStaticTransformation(View view, Transformation transformation) {
        transformation.clear();
        transformation.setAlpha(view == this.I1 ? 1.0f : this.f47086p1);
        return true;
    }

    @Override // android.view.View
    protected ContextMenu.ContextMenuInfo getContextMenuInfo() {
        return this.N1;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.F1.g(false);
        int w4 = w((int) motionEvent.getX(), (int) motionEvent.getY());
        this.D1 = w4;
        if (w4 >= 0) {
            View childAt = getChildAt(w4 - this.f46344b);
            this.E1 = childAt;
            childAt.setPressed(true);
        }
        this.O1 = true;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
        if (!this.J1) {
            removeCallbacks(this.G1);
            if (!this.L1) {
                this.L1 = true;
            }
        }
        this.F1.f((int) (-f5));
        return true;
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z4, int i4, Rect rect) {
        View view;
        super.onFocusChanged(z4, i4, rect);
        if (!z4 || (view = this.I1) == null) {
            return;
        }
        view.requestFocus(i4);
        this.I1.setSelected(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 != 66) {
            switch (i4) {
                case 21:
                    if (X()) {
                        playSoundEffect(1);
                    }
                    return true;
                case 22:
                    if (W()) {
                        playSoundEffect(3);
                    }
                    return true;
            }
            return super.onKeyDown(i4, keyEvent);
        }
        this.M1 = true;
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i4, KeyEvent keyEvent) {
        if (i4 != 23 && i4 != 66) {
            return super.onKeyUp(i4, keyEvent);
        }
        if (this.M1 && this.f46362t > 0) {
            L(this.I1);
            postDelayed(new b(), ViewConfiguration.getPressedStateDuration());
            View childAt = getChildAt(this.f46359q - this.f46344b);
            int i5 = this.f46359q;
            n(childAt, i5, this.I.getItemId(i5));
        }
        this.M1 = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.customview.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        this.f46352j = true;
        v(0, false);
        this.f46352j = false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        if (this.D1 < 0) {
            return;
        }
        performHapticFeedback(0);
        K(this.E1, this.D1, i(this.D1));
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
        getParent().requestDisallowInterceptTouchEvent(true);
        if (!this.J1) {
            if (this.O1) {
                if (!this.L1) {
                    this.L1 = true;
                }
                postDelayed(this.G1, 250L);
            }
        } else if (this.L1) {
            this.L1 = false;
        }
        g0(((int) f5) * (-1));
        this.O1 = false;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        int i4 = this.D1;
        if (i4 >= 0) {
            d0(i4 - this.f46344b);
            if (this.K1 || this.D1 == this.f46359q) {
                View view = this.E1;
                int i5 = this.D1;
                n(view, i5, this.I.getItemId(i5));
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            boolean onTouchEvent = this.C1.onTouchEvent(motionEvent);
            int action = motionEvent.getAction();
            if (action == 1) {
                b0();
            } else if (action == 3) {
                Z();
            }
            return onTouchEvent;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.customview.AdapterView
    public void p() {
        if (this.L1) {
            return;
        }
        super.p();
    }

    public void setAnimationDuration(int i4) {
        this.f47085p0 = i4;
    }

    public void setCallbackDuringFling(boolean z4) {
        this.J1 = z4;
    }

    public void setCallbackOnUnselectedItemClick(boolean z4) {
        this.K1 = z4;
    }

    public void setGravity(int i4) {
        if (this.B1 != i4) {
            this.B1 = i4;
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.customview.AdapterView
    public void setSelectedPositionInt(int i4) {
        super.setSelectedPositionInt(i4);
        h0();
    }

    public void setSpacing(int i4) {
        this.W = i4;
    }

    public void setUnselectedAlpha(float f5) {
        this.f47086p1 = f5;
    }

    @Override // android.view.View
    public boolean showContextMenu() {
        int i4;
        if (!isPressed() || (i4 = this.f46359q) < 0) {
            return false;
        }
        return K(getChildAt(i4 - this.f46344b), this.f46359q, this.f46360r);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean showContextMenuForChild(View view) {
        int j4 = j(view);
        if (j4 < 0) {
            return false;
        }
        return K(view, j4, this.I.getItemId(j4));
    }

    @Override // com.join.mgps.customview.AbsSpinner
    void v(int i4, boolean z4) {
        this.P1 = false;
        if (this.f46356n) {
            k();
        }
        if (this.f46362t == 0) {
            y();
            return;
        }
        int i5 = this.f46357o;
        if (i5 >= 0) {
            setSelectedPositionInt(i5);
        }
        x();
        detachAllViewsFromParent();
        this.A1 = 0;
        this.f47087v1 = 0;
        int i6 = this.f46359q;
        this.f46344b = i6;
        V(i6, 0, 0, true).offsetLeftAndRight(getGalleryLockPoint());
        Q();
        N();
        this.T.a();
        invalidate();
        e();
        this.f46356n = false;
        this.f46349g = false;
        setNextSelectedPositionInt(this.f46359q);
        h0();
    }

    public Gallery(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842864);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.LayoutParams(getContext(), attributeSet);
    }

    public Gallery(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.W = 0;
        this.f47085p0 = StatFsHelper.f10899h;
        this.F1 = new c();
        this.G1 = new a();
        this.J1 = true;
        this.K1 = true;
        this.P1 = true;
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.C1 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
    }
}
