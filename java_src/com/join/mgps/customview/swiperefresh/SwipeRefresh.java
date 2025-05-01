package com.join.mgps.customview.swiperefresh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class SwipeRefresh extends ViewGroup implements NestedScrollingParent, NestedScrollingChild {
    private static final int A1 = 300;
    private static final int B1 = 200;
    private static final int C1 = 200;
    private static final int D1 = 16777215;
    private static final int E1 = 64;
    public static final int O = 0;
    public static final int P = 1;
    @VisibleForTesting
    static final int Q = 50;
    @VisibleForTesting
    static final int R = 56;
    private static final int T = 255;
    private static final int U = 76;
    private static final float V = 2.0f;
    private static final int W = -1;

    /* renamed from: p0  reason: collision with root package name */
    private static final float f48745p0 = 0.5f;

    /* renamed from: p1  reason: collision with root package name */
    private static final float f48746p1 = 0.8f;

    /* renamed from: v1  reason: collision with root package name */
    private static final int f48747v1 = 150;
    int A;
    MaterialProgressDrawable B;
    private Animation C;
    private Animation D;
    private Animation E;
    private Animation F;
    private Animation G;
    boolean H;
    private int I;
    boolean J;
    private i K;
    private Animation.AnimationListener L;
    private final Animation M;
    private final Animation N;

    /* renamed from: b  reason: collision with root package name */
    private View f48748b;

    /* renamed from: c  reason: collision with root package name */
    j f48749c;

    /* renamed from: d  reason: collision with root package name */
    boolean f48750d;

    /* renamed from: e  reason: collision with root package name */
    private int f48751e;

    /* renamed from: f  reason: collision with root package name */
    private float f48752f;

    /* renamed from: g  reason: collision with root package name */
    private float f48753g;

    /* renamed from: h  reason: collision with root package name */
    private final NestedScrollingParentHelper f48754h;

    /* renamed from: i  reason: collision with root package name */
    private final NestedScrollingChildHelper f48755i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f48756j;

    /* renamed from: k  reason: collision with root package name */
    private final int[] f48757k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f48758l;

    /* renamed from: m  reason: collision with root package name */
    private int f48759m;

    /* renamed from: n  reason: collision with root package name */
    int f48760n;

    /* renamed from: o  reason: collision with root package name */
    private float f48761o;

    /* renamed from: p  reason: collision with root package name */
    private float f48762p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f48763q;

    /* renamed from: r  reason: collision with root package name */
    private int f48764r;

    /* renamed from: s  reason: collision with root package name */
    boolean f48765s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f48766t;

    /* renamed from: u  reason: collision with root package name */
    private final DecelerateInterpolator f48767u;

    /* renamed from: v  reason: collision with root package name */
    CircleImageView f48768v;

    /* renamed from: w  reason: collision with root package name */
    private int f48769w;

    /* renamed from: x  reason: collision with root package name */
    protected int f48770x;

    /* renamed from: y  reason: collision with root package name */
    float f48771y;

    /* renamed from: z  reason: collision with root package name */
    protected int f48772z;
    private static final String S = SwipeRefresh.class.getSimpleName();
    private static final int[] F1 = {16842766};

    /* loaded from: classes4.dex */
    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        @SuppressLint({"NewApi"})
        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefresh swipeRefresh = SwipeRefresh.this;
            if (swipeRefresh.f48750d) {
                swipeRefresh.B.setAlpha(255);
                SwipeRefresh.this.B.start();
                SwipeRefresh swipeRefresh2 = SwipeRefresh.this;
                if (swipeRefresh2.H && (jVar = swipeRefresh2.f48749c) != null) {
                    jVar.onRefresh();
                }
                SwipeRefresh swipeRefresh3 = SwipeRefresh.this;
                swipeRefresh3.f48760n = swipeRefresh3.f48768v.getTop();
                return;
            }
            swipeRefresh.m();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f5, Transformation transformation) {
            SwipeRefresh.this.setAnimationProgress(f5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends Animation {
        c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f5, Transformation transformation) {
            SwipeRefresh.this.setAnimationProgress(1.0f - f5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d extends Animation {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f48776b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f48777c;

        d(int i4, int i5) {
            this.f48776b = i4;
            this.f48777c = i5;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f5, Transformation transformation) {
            MaterialProgressDrawable materialProgressDrawable = SwipeRefresh.this.B;
            int i4 = this.f48776b;
            materialProgressDrawable.setAlpha((int) (i4 + ((this.f48777c - i4) * f5)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefresh swipeRefresh = SwipeRefresh.this;
            if (swipeRefresh.f48765s) {
                return;
            }
            swipeRefresh.t(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes4.dex */
    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f5, Transformation transformation) {
            int i4;
            SwipeRefresh swipeRefresh = SwipeRefresh.this;
            if (!swipeRefresh.J) {
                i4 = swipeRefresh.A - Math.abs(swipeRefresh.f48772z);
            } else {
                i4 = swipeRefresh.A;
            }
            SwipeRefresh swipeRefresh2 = SwipeRefresh.this;
            int i5 = swipeRefresh2.f48770x;
            SwipeRefresh.this.o((i5 + ((int) ((i4 - i5) * f5))) - swipeRefresh2.f48768v.getTop(), false);
            SwipeRefresh.this.B.e(1.0f - f5);
        }
    }

    /* loaded from: classes4.dex */
    class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f5, Transformation transformation) {
            SwipeRefresh.this.k(f5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f5, Transformation transformation) {
            SwipeRefresh swipeRefresh = SwipeRefresh.this;
            float f6 = swipeRefresh.f48771y;
            swipeRefresh.setAnimationProgress(f6 + ((-f6) * f5));
            SwipeRefresh.this.k(f5);
        }
    }

    /* loaded from: classes4.dex */
    public interface i {
        boolean a(SwipeRefresh swipeRefresh, @Nullable View view);
    }

    /* loaded from: classes4.dex */
    public interface j {
        void onRefresh();
    }

    public SwipeRefresh(Context context) {
        this(context, null);
    }

    private void a(int i4, Animation.AnimationListener animationListener) {
        this.f48770x = i4;
        this.M.reset();
        this.M.setDuration(200L);
        this.M.setInterpolator(this.f48767u);
        if (animationListener != null) {
            this.f48768v.setAnimationListener(animationListener);
        }
        this.f48768v.clearAnimation();
        this.f48768v.startAnimation(this.M);
    }

    private void b(int i4, Animation.AnimationListener animationListener) {
        if (this.f48765s) {
            u(i4, animationListener);
            return;
        }
        this.f48770x = i4;
        this.N.reset();
        this.N.setDuration(200L);
        this.N.setInterpolator(this.f48767u);
        if (animationListener != null) {
            this.f48768v.setAnimationListener(animationListener);
        }
        this.f48768v.clearAnimation();
        this.f48768v.startAnimation(this.N);
    }

    private void d() {
        this.f48768v = new CircleImageView(getContext(), 16777215);
        MaterialProgressDrawable materialProgressDrawable = new MaterialProgressDrawable(getContext(), this);
        this.B = materialProgressDrawable;
        materialProgressDrawable.f(16777215);
        AnimationDrawable animationDrawable = (AnimationDrawable) getResources().getDrawable(R.drawable.loading_animation1);
        this.f48768v.setImageDrawable(animationDrawable);
        animationDrawable.start();
        this.f48768v.setVisibility(8);
        addView(this.f48768v);
    }

    private void e() {
        if (this.f48748b == null) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (!childAt.equals(this.f48768v)) {
                    this.f48748b = childAt;
                    return;
                }
            }
        }
    }

    private void f(float f5) {
        if (f5 > this.f48752f) {
            n(true, true);
            return;
        }
        this.f48750d = false;
        this.B.k(0.0f, 0.0f);
        b(this.f48760n, this.f48765s ? null : new e());
        this.B.m(false);
    }

    private boolean g() {
        return Build.VERSION.SDK_INT < 11;
    }

    private boolean h(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    @SuppressLint({"NewApi"})
    private void j(float f5) {
        this.B.m(true);
        float min = Math.min(1.0f, Math.abs(f5 / this.f48752f));
        double d5 = min;
        Double.isNaN(d5);
        float max = (((float) Math.max(d5 - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f5) - this.f48752f;
        float f6 = this.J ? this.A - this.f48772z : this.A;
        double max2 = Math.max(0.0f, Math.min(abs, f6 * 2.0f) / f6) / 4.0f;
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f7 = ((float) (max2 - pow)) * 2.0f;
        int i4 = this.f48772z + ((int) ((f6 * min) + (f6 * f7 * 2.0f)));
        if (this.f48768v.getVisibility() != 0) {
            this.f48768v.setVisibility(0);
        }
        if (!this.f48765s) {
            ViewCompat.setScaleX(this.f48768v, 1.0f);
            ViewCompat.setScaleY(this.f48768v, 1.0f);
        }
        if (this.f48765s) {
            setAnimationProgress(Math.min(1.0f, f5 / this.f48752f));
        }
        if (f5 < this.f48752f) {
            if (this.B.getAlpha() > 76 && !h(this.E)) {
                s();
            }
        } else if (this.B.getAlpha() < 255 && !h(this.F)) {
            r();
        }
        this.B.k(0.0f, Math.min((float) f48746p1, max * f48746p1));
        this.B.e(Math.min(1.0f, max));
        this.B.h((((max * 0.4f) - 0.25f) + (f7 * 2.0f)) * 0.5f);
        o(i4 - this.f48760n, true);
    }

    private void l(MotionEvent motionEvent) {
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (motionEvent.getPointerId(actionIndex) == this.f48764r) {
            this.f48764r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void n(boolean z4, boolean z5) {
        if (this.f48750d != z4) {
            this.H = z5;
            e();
            this.f48750d = z4;
            if (z4) {
                a(this.f48760n, this.L);
            } else {
                t(this.L);
            }
        }
    }

    @SuppressLint({"NewApi"})
    private Animation p(int i4, int i5) {
        if (this.f48765s && g()) {
            return null;
        }
        d dVar = new d(i4, i5);
        dVar.setDuration(300L);
        this.f48768v.setAnimationListener(null);
        this.f48768v.clearAnimation();
        this.f48768v.startAnimation(dVar);
        return dVar;
    }

    @SuppressLint({"NewApi"})
    private void q(float f5) {
        float f6 = this.f48762p;
        int i4 = this.f48751e;
        if (f5 - f6 <= i4 || this.f48763q) {
            return;
        }
        this.f48761o = f6 + i4;
        this.f48763q = true;
        this.B.setAlpha(76);
    }

    @SuppressLint({"NewApi"})
    private void r() {
        this.F = p(this.B.getAlpha(), 255);
    }

    @SuppressLint({"NewApi"})
    private void s() {
        this.E = p(this.B.getAlpha(), 76);
    }

    @SuppressLint({"NewApi"})
    private void setColorViewAlpha(int i4) {
        this.f48768v.getBackground().setAlpha(i4);
        this.B.setAlpha(i4);
    }

    @SuppressLint({"NewApi"})
    private void u(int i4, Animation.AnimationListener animationListener) {
        this.f48770x = i4;
        if (g()) {
            this.f48771y = this.B.getAlpha();
        } else {
            this.f48771y = ViewCompat.getScaleX(this.f48768v);
        }
        h hVar = new h();
        this.G = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f48768v.setAnimationListener(animationListener);
        }
        this.f48768v.clearAnimation();
        this.f48768v.startAnimation(this.G);
    }

    @SuppressLint({"NewApi"})
    private void v(Animation.AnimationListener animationListener) {
        this.f48768v.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 11) {
            this.B.setAlpha(255);
        }
        b bVar = new b();
        this.C = bVar;
        bVar.setDuration(this.f48759m);
        if (animationListener != null) {
            this.f48768v.setAnimationListener(animationListener);
        }
        this.f48768v.clearAnimation();
        this.f48768v.startAnimation(this.C);
    }

    public boolean c() {
        i iVar = this.K;
        if (iVar != null) {
            return iVar.a(this, this.f48748b);
        }
        if (Build.VERSION.SDK_INT < 14) {
            View view = this.f48748b;
            if (!(view instanceof AbsListView)) {
                return ViewCompat.canScrollVertically(view, -1) || this.f48748b.getScrollY() > 0;
            }
            AbsListView absListView = (AbsListView) view;
            return absListView.getChildCount() > 0 && (absListView.getFirstVisiblePosition() > 0 || absListView.getChildAt(0).getTop() < absListView.getPaddingTop());
        }
        return ViewCompat.canScrollVertically(this.f48748b, -1);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f5, float f6, boolean z4) {
        return this.f48755i.dispatchNestedFling(f5, f6, z4);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f5, float f6) {
        return this.f48755i.dispatchNestedPreFling(f5, f6);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return this.f48755i.dispatchNestedPreScroll(i4, i5, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return this.f48755i.dispatchNestedScroll(i4, i5, i6, i7, iArr);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i4, int i5) {
        int i6 = this.f48769w;
        return i6 < 0 ? i5 : i5 == i4 + (-1) ? i6 : i5 >= i6 ? i5 + 1 : i5;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f48754h.getNestedScrollAxes();
    }

    public int getProgressCircleDiameter() {
        return this.I;
    }

    public int getProgressViewEndOffset() {
        return this.A;
    }

    public int getProgressViewStartOffset() {
        return this.f48772z;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.f48755i.hasNestedScrollingParent();
    }

    public boolean i() {
        return this.f48750d;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.f48755i.isNestedScrollingEnabled();
    }

    void k(float f5) {
        int i4 = this.f48770x;
        o((i4 + ((int) ((this.f48772z - i4) * f5))) - this.f48768v.getTop(), false);
    }

    void m() {
        this.f48768v.clearAnimation();
        this.B.stop();
        this.f48768v.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f48765s) {
            setAnimationProgress(0.0f);
        } else {
            o(this.f48772z - this.f48760n, true);
        }
        this.f48760n = this.f48768v.getTop();
    }

    void o(int i4, boolean z4) {
        this.f48768v.bringToFront();
        ViewCompat.offsetTopAndBottom(this.f48768v, i4);
        this.f48760n = this.f48768v.getTop();
        if (!z4 || Build.VERSION.SDK_INT >= 11) {
            return;
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        e();
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (this.f48766t && actionMasked == 0) {
            this.f48766t = false;
        }
        if (!isEnabled() || this.f48766t || c() || this.f48750d || this.f48758l) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i4 = this.f48764r;
                    if (i4 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i4)) < 0) {
                        return false;
                    }
                    q(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        l(motionEvent);
                    }
                }
            }
            this.f48763q = false;
            this.f48764r = -1;
        } else {
            o(this.f48772z - this.f48768v.getTop(), true);
            int pointerId = motionEvent.getPointerId(0);
            this.f48764r = pointerId;
            this.f48763q = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f48762p = motionEvent.getY(findPointerIndex2);
        }
        return this.f48763q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f48748b == null) {
            e();
        }
        View view = this.f48748b;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f48768v.getMeasuredWidth();
        int measuredHeight2 = this.f48768v.getMeasuredHeight();
        int i8 = measuredWidth / 2;
        int i9 = measuredWidth2 / 2;
        int i10 = this.f48760n;
        this.f48768v.layout(i8 - i9, i10, i8 + i9, measuredHeight2 + i10);
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f48748b == null) {
            e();
        }
        View view = this.f48748b;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f48768v.measure(View.MeasureSpec.makeMeasureSpec(this.I, 1073741824), View.MeasureSpec.makeMeasureSpec(this.I, 1073741824));
        this.f48769w = -1;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            if (getChildAt(i6) == this.f48768v) {
                this.f48769w = i6;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f5, float f6, boolean z4) {
        return dispatchNestedFling(f5, f6, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f5, float f6) {
        return dispatchNestedPreFling(f5, f6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        if (i5 > 0) {
            float f5 = this.f48753g;
            if (f5 > 0.0f) {
                float f6 = i5;
                if (f6 > f5) {
                    iArr[1] = i5 - ((int) f5);
                    this.f48753g = 0.0f;
                } else {
                    this.f48753g = f5 - f6;
                    iArr[1] = i5;
                }
                j(this.f48753g);
            }
        }
        if (this.J && i5 > 0 && this.f48753g == 0.0f && Math.abs(i5 - iArr[1]) > 0) {
            this.f48768v.setVisibility(8);
        }
        int[] iArr2 = this.f48756j;
        if (dispatchNestedPreScroll(i4 - iArr[0], i5 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        dispatchNestedScroll(i4, i5, i6, i7, this.f48757k);
        int i8 = i7 + this.f48757k[1];
        if (i8 >= 0 || c()) {
            return;
        }
        float abs = this.f48753g + Math.abs(i8);
        this.f48753g = abs;
        j(abs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i4) {
        this.f48754h.onNestedScrollAccepted(view, view2, i4);
        startNestedScroll(i4 & 2);
        this.f48753g = 0.0f;
        this.f48758l = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i4) {
        return (!isEnabled() || this.f48766t || this.f48750d || (i4 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        this.f48754h.onStopNestedScroll(view);
        this.f48758l = false;
        float f5 = this.f48753g;
        if (f5 > 0.0f) {
            f(f5);
            this.f48753g = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (this.f48766t && actionMasked == 0) {
            this.f48766t = false;
        }
        if (!isEnabled() || this.f48766t || c() || this.f48750d || this.f48758l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f48764r = motionEvent.getPointerId(0);
            this.f48763q = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f48764r);
            if (findPointerIndex < 0) {
                return false;
            }
            if (this.f48763q) {
                this.f48763q = false;
                f((motionEvent.getY(findPointerIndex) - this.f48761o) * 0.5f);
            }
            this.f48764r = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f48764r);
            if (findPointerIndex2 < 0) {
                return false;
            }
            float y2 = motionEvent.getY(findPointerIndex2);
            q(y2);
            if (this.f48763q) {
                float f5 = (y2 - this.f48761o) * 0.5f;
                if (f5 <= 0.0f) {
                    return false;
                }
                j(f5);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                if (actionIndex < 0) {
                    return false;
                }
                this.f48764r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                l(motionEvent);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z4) {
        if (Build.VERSION.SDK_INT >= 21 || !(this.f48748b instanceof AbsListView)) {
            View view = this.f48748b;
            if (view == null || ViewCompat.isNestedScrollingEnabled(view)) {
                super.requestDisallowInterceptTouchEvent(z4);
            }
        }
    }

    void setAnimationProgress(float f5) {
        if (g()) {
            setColorViewAlpha((int) (f5 * 255.0f));
            return;
        }
        ViewCompat.setScaleX(this.f48768v, f5);
        ViewCompat.setScaleY(this.f48768v, f5);
    }

    @Deprecated
    public void setColorScheme(@ColorInt int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@ColorInt int... iArr) {
        e();
        this.B.g(iArr);
    }

    public void setColorSchemeResources(@ColorRes int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            iArr2[i4] = ContextCompat.getColor(context, iArr[i4]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i4) {
        this.f48752f = i4;
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        if (z4) {
            return;
        }
        m();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z4) {
        this.f48755i.setNestedScrollingEnabled(z4);
    }

    public void setOnChildScrollUpCallback(@Nullable i iVar) {
        this.K = iVar;
    }

    public void setOnRefreshListener(j jVar) {
        this.f48749c = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i4) {
        setProgressBackgroundColorSchemeResource(i4);
    }

    public void setProgressBackgroundColorSchemeColor(@ColorInt int i4) {
        this.f48768v.setBackgroundColor(i4);
        this.B.f(i4);
    }

    public void setProgressBackgroundColorSchemeResource(@ColorRes int i4) {
        setProgressBackgroundColorSchemeColor(ContextCompat.getColor(getContext(), i4));
    }

    public void setProgressViewEndTarget(boolean z4, int i4) {
        this.A = i4;
        this.f48765s = z4;
        this.f48768v.invalidate();
    }

    public void setProgressViewOffset(boolean z4, int i4, int i5) {
        this.f48765s = z4;
        this.f48772z = i4;
        this.A = i5;
        this.J = true;
        m();
        this.f48750d = false;
    }

    public void setRefreshing(boolean z4) {
        int i4;
        if (z4 && this.f48750d != z4) {
            this.f48750d = z4;
            if (!this.J) {
                i4 = this.A + this.f48772z;
            } else {
                i4 = this.A;
            }
            o(i4 - this.f48760n, true);
            this.H = false;
            v(this.L);
            return;
        }
        n(z4, false);
    }

    public void setSize(int i4) {
        if (i4 == 0 || i4 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i4 == 0) {
                this.I = (int) (displayMetrics.density * 56.0f);
            } else {
                this.I = (int) (displayMetrics.density * 50.0f);
            }
            this.f48768v.setImageDrawable(null);
            this.B.o(i4);
            this.f48768v.setImageDrawable(this.B);
        }
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i4) {
        return this.f48755i.startNestedScroll(i4);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.f48755i.stopNestedScroll();
    }

    void t(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.D = cVar;
        cVar.setDuration(150L);
        this.f48768v.setAnimationListener(animationListener);
        this.f48768v.clearAnimation();
        this.f48768v.startAnimation(this.D);
    }

    public SwipeRefresh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48750d = false;
        this.f48752f = -1.0f;
        this.f48756j = new int[2];
        this.f48757k = new int[2];
        this.f48764r = -1;
        this.f48769w = -1;
        this.L = new a();
        this.M = new f();
        this.N = new g();
        this.f48751e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f48759m = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f48767u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.I = (int) (displayMetrics.density * 50.0f);
        d();
        ViewCompat.setChildrenDrawingOrderEnabled(this, true);
        int i4 = (int) (displayMetrics.density * 64.0f);
        this.A = i4;
        this.f48752f = i4;
        this.f48754h = new NestedScrollingParentHelper(this);
        this.f48755i = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        int i5 = -this.I;
        this.f48760n = i5;
        this.f48772z = i5;
        k(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, F1);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }
}
