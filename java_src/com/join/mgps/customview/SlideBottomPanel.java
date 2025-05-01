package com.join.mgps.customview;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.core.view.ViewCompat;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class SlideBottomPanel extends FrameLayout {
    private static final int G = 1;
    private static final int H = 2;
    private static final int I = -1;
    private static final int J = 60;
    private static final int K = 380;
    private static final int L = 30;
    private static final int M = 250;
    private static final int N = 300;
    private static final boolean O = true;
    private static final boolean P = true;
    private static final boolean Q = false;
    private boolean A;
    private Interpolator B;
    private Interpolator C;
    private Context D;
    private DarkFrameLayout E;

    /* renamed from: b  reason: collision with root package name */
    private int f47695b;

    /* renamed from: c  reason: collision with root package name */
    private float f47696c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f47697d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f47698e;

    /* renamed from: f  reason: collision with root package name */
    private float f47699f;

    /* renamed from: g  reason: collision with root package name */
    private float f47700g;

    /* renamed from: h  reason: collision with root package name */
    private float f47701h;

    /* renamed from: i  reason: collision with root package name */
    private int f47702i;

    /* renamed from: j  reason: collision with root package name */
    private int f47703j;

    /* renamed from: k  reason: collision with root package name */
    private VelocityTracker f47704k;

    /* renamed from: l  reason: collision with root package name */
    private int f47705l;

    /* renamed from: m  reason: collision with root package name */
    private float f47706m;

    /* renamed from: n  reason: collision with root package name */
    private float f47707n;

    /* renamed from: o  reason: collision with root package name */
    private float f47708o;

    /* renamed from: p  reason: collision with root package name */
    private float f47709p;

    /* renamed from: q  reason: collision with root package name */
    private long f47710q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f47711r;

    /* renamed from: s  reason: collision with root package name */
    private int f47712s;

    /* renamed from: t  reason: collision with root package name */
    private float f47713t;

    /* renamed from: u  reason: collision with root package name */
    private float f47714u;

    /* renamed from: v  reason: collision with root package name */
    private float f47715v;

    /* renamed from: w  reason: collision with root package name */
    private int f47716w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f47717x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f47718y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f47719z;
    private static final String F = SlideBottomPanel.class.getSimpleName();
    private static float R = 5.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f47720b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f47721c;

        a(View view, int i4) {
            this.f47720b = view;
            this.f47721c = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewCompat.setY(this.f47720b, floatValue);
            if (SlideBottomPanel.this.E == null || !SlideBottomPanel.this.f47717x || floatValue >= this.f47721c) {
                return;
            }
            SlideBottomPanel.this.E.b((int) ((1.0f - (floatValue / this.f47721c)) * 159.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Animator.AnimatorListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f47723b;

        b(View view) {
            this.f47723b = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            SlideBottomPanel.this.f47697d = false;
            SlideBottomPanel.this.f47698e = false;
            SlideBottomPanel.this.A(this.f47723b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SlideBottomPanel.this.f47697d = false;
            SlideBottomPanel.this.f47698e = false;
            SlideBottomPanel.this.A(this.f47723b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            SlideBottomPanel.this.f47697d = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f47725b;

        c(View view) {
            this.f47725b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewCompat.setY(this.f47725b, floatValue);
            if (SlideBottomPanel.this.E == null || !SlideBottomPanel.this.f47717x || SlideBottomPanel.this.E.getCurrentAlpha() == 159) {
                return;
            }
            SlideBottomPanel.this.E.b((int) ((1.0f - (floatValue / (SlideBottomPanel.this.f47705l - SlideBottomPanel.this.f47714u))) * 159.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements Animator.AnimatorListener {
        d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            SlideBottomPanel.this.f47697d = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SlideBottomPanel.this.f47697d = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            SlideBottomPanel.this.f47697d = true;
        }
    }

    public SlideBottomPanel(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(View view) {
        if ((view instanceof ViewGroup) && this.f47719z) {
            try {
                View childAt = ((ViewGroup) view).getChildAt(1);
                if (childAt.getVisibility() != 0) {
                    childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                    childAt.setVisibility(0);
                }
            } catch (NullPointerException e5) {
                e5.printStackTrace();
            }
        }
    }

    private boolean B(int i4) {
        View n4;
        View n5;
        View findViewWithTag = findViewWithTag(2);
        if (!(findViewWithTag instanceof ViewGroup) || (n4 = n((ViewGroup) findViewWithTag, this.f47706m, this.f47707n)) == null) {
            return false;
        }
        if (n4 instanceof AbsListView) {
            AbsListView absListView = (AbsListView) n4;
            if (Build.VERSION.SDK_INT >= 19) {
                return absListView.canScrollList(i4);
            }
            return a(absListView, i4);
        } else if (n4 instanceof ScrollView) {
            ScrollView scrollView = (ScrollView) n4;
            if (Build.VERSION.SDK_INT >= 14) {
                return scrollView.canScrollVertically(i4);
            }
            return z(scrollView, i4);
        } else {
            if ((n4 instanceof ViewGroup) && (n5 = n((ViewGroup) n4, this.f47706m, this.f47707n)) != null && (n5 instanceof ViewGroup)) {
                if (n5 instanceof AbsListView) {
                    AbsListView absListView2 = (AbsListView) n5;
                    if (Build.VERSION.SDK_INT >= 19) {
                        return absListView2.canScrollList(i4);
                    }
                    return a(absListView2, i4);
                } else if (n5 instanceof ScrollView) {
                    ScrollView scrollView2 = (ScrollView) n5;
                    if (Build.VERSION.SDK_INT >= 14) {
                        return scrollView2.canScrollVertically(i4);
                    }
                    return z(scrollView2, i4);
                }
            }
            return false;
        }
    }

    private boolean a(AbsListView absListView, int i4) {
        int childCount = absListView.getChildCount();
        if (childCount == 0) {
            return false;
        }
        int firstVisiblePosition = absListView.getFirstVisiblePosition();
        if (i4 > 0) {
            return firstVisiblePosition + childCount < absListView.getCount() || absListView.getChildAt(childCount + (-1)).getBottom() > absListView.getHeight() - absListView.getPaddingTop();
        }
        return firstVisiblePosition > 0 || absListView.getChildAt(0).getTop() < absListView.getPaddingTop();
    }

    private void i() {
        this.f47704k.computeCurrentVelocity(1000, this.f47702i);
        this.f47699f = this.f47704k.getXVelocity();
        this.f47700g = this.f47704k.getYVelocity();
    }

    private int j(ScrollView scrollView) {
        int childCount = scrollView.getChildCount();
        int height = (scrollView.getHeight() - scrollView.getPaddingBottom()) - scrollView.getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        int bottom = scrollView.getChildAt(0).getBottom();
        int scrollY = scrollView.getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    private double l(float f5, float f6, float f7, float f8) {
        float f9 = f5 - f7;
        float f10 = f6 - f8;
        return Math.sqrt((f9 * f9) + (f10 * f10));
    }

    private int m(int i4) {
        return (int) ((i4 * this.f47696c) + 0.5f);
    }

    private View n(ViewGroup viewGroup, float f5, float f6) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (f5 >= childAt.getLeft() && f5 < childAt.getRight() && f6 >= (childAt.getTop() + this.f47705l) - this.f47713t && f6 < (childAt.getBottom() + this.f47705l) - this.f47713t) {
                return childAt;
            }
        }
        return null;
    }

    private boolean o(MotionEvent motionEvent) {
        this.f47710q = System.currentTimeMillis();
        this.f47706m = motionEvent.getX();
        float y2 = motionEvent.getY();
        this.f47708o = y2;
        this.f47707n = y2;
        boolean z4 = this.f47698e;
        if (!z4 && y2 > this.f47705l - this.f47714u) {
            this.A = true;
            return true;
        }
        if (!z4 && y2 <= this.f47705l - this.f47714u) {
            this.A = false;
        } else if (z4 && y2 > this.f47705l - this.f47713t) {
            this.A = true;
        } else if (z4 && y2 < this.f47705l - this.f47713t) {
            s();
            this.A = false;
        }
        return false;
    }

    private void p(MotionEvent motionEvent) {
        if (this.A) {
            if (this.f47698e && B((int) (this.f47707n - motionEvent.getY()))) {
                return;
            }
            i();
            if (Math.abs(this.f47699f) > Math.abs(this.f47700g)) {
                return;
            }
            if (!this.f47711r && Math.abs(motionEvent.getY() - this.f47707n) > this.f47701h && Math.abs(motionEvent.getX() - this.f47706m) < this.f47701h) {
                this.f47711r = true;
                this.f47708o = motionEvent.getY();
            }
            if (this.f47711r) {
                this.f47709p = motionEvent.getY() - this.f47708o;
                this.f47708o = motionEvent.getY();
                View findViewWithTag = findViewWithTag(2);
                if (this.f47719z && this.f47698e) {
                    t(findViewWithTag);
                }
                if (this.E != null && this.f47717x) {
                    float y2 = ViewCompat.getY(findViewWithTag);
                    int i4 = this.f47705l;
                    if (y2 > i4 - this.f47713t) {
                        float f5 = this.f47714u;
                        if (y2 < i4 - f5) {
                            this.E.b((int) ((1.0f - (y2 / (i4 - f5))) * 159.0f));
                        }
                    }
                }
                if (!this.f47718y) {
                    findViewWithTag.offsetTopAndBottom((int) this.f47709p);
                    return;
                }
                float y4 = ViewCompat.getY(findViewWithTag);
                float f6 = this.f47709p;
                int i5 = this.f47705l;
                float f7 = this.f47713t;
                if (y4 + f6 <= i5 - f7) {
                    findViewWithTag.offsetTopAndBottom((int) ((i5 - f7) - y4));
                    return;
                }
                float f8 = this.f47714u;
                if (y4 + f6 >= i5 - f8) {
                    findViewWithTag.offsetTopAndBottom((int) ((i5 - f8) - y4));
                } else {
                    findViewWithTag.offsetTopAndBottom((int) f6);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.customview.SlideBottomPanel.q(android.view.MotionEvent):void");
    }

    private void s() {
        if (this.f47697d) {
            return;
        }
        View findViewWithTag = findViewWithTag(2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(ViewCompat.getY(findViewWithTag), this.f47705l - this.f47714u);
        ofFloat.setInterpolator(this.C);
        ofFloat.setTarget(findViewWithTag);
        ofFloat.addUpdateListener(new a(findViewWithTag, (int) (this.f47705l - this.f47714u)));
        ofFloat.addListener(new b(findViewWithTag));
        ofFloat.start();
    }

    private void t(View view) {
        if ((view instanceof ViewGroup) && this.f47719z) {
            try {
                ((ViewGroup) view).getChildAt(1).setVisibility(4);
            } catch (NullPointerException e5) {
                e5.printStackTrace();
            }
        }
    }

    private void u() {
        if (this.f47712s != -1) {
            DarkFrameLayout darkFrameLayout = new DarkFrameLayout(this.D);
            this.E = darkFrameLayout;
            darkFrameLayout.addView(LayoutInflater.from(this.D).inflate(this.f47712s, (ViewGroup) null));
            this.E.setTag(1);
            this.E.setSlideBottomPanel(this);
            addView(this.E);
        }
    }

    private void v(MotionEvent motionEvent) {
        if (this.f47704k == null) {
            this.f47704k = VelocityTracker.obtain();
        }
        this.f47704k.addMovement(motionEvent);
    }

    private int x(int i4) {
        return (int) ((i4 / this.f47696c) + 0.5f);
    }

    private void y() {
        VelocityTracker velocityTracker = this.f47704k;
        if (velocityTracker != null) {
            velocityTracker.clear();
            this.f47704k.recycle();
            this.f47704k = null;
        }
    }

    private boolean z(ScrollView scrollView, int i4) {
        int max = Math.max(0, scrollView.getScrollY());
        int j4 = j(scrollView) - scrollView.getHeight();
        if (j4 == 0) {
            return false;
        }
        return i4 < 0 ? max > 0 : max < j4 - 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean o4;
        v(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                q(motionEvent);
                y();
            } else if (action == 2) {
                p(motionEvent);
            }
            o4 = false;
        } else {
            o4 = o(motionEvent);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(o4 || super.dispatchTouchEvent(motionEvent));
        return o4 || super.dispatchTouchEvent(motionEvent);
    }

    public void k() {
        if (this.f47698e || this.f47697d) {
            return;
        }
        if (this.f47717x || this.E != null) {
            this.E.c(true);
        }
        View findViewWithTag = findViewWithTag(2);
        ValueAnimator duration = ValueAnimator.ofFloat(ViewCompat.getY(findViewWithTag), this.f47705l - this.f47713t).setDuration(this.f47716w);
        duration.setTarget(findViewWithTag);
        duration.setInterpolator(this.B);
        duration.addUpdateListener(new c(findViewWithTag));
        duration.addListener(new d());
        duration.start();
        this.f47698e = true;
        t(findViewWithTag);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f47711r;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        this.f47695b = getChildCount();
        int i8 = (int) (this.f47705l - this.f47714u);
        for (int i9 = 0; i9 < this.f47695b; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getTag() != null && ((Integer) childAt.getTag()).intValue() == 1) {
                if (Integer.parseInt(childAt.getTag() + "") == 1) {
                    childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                    childAt.setPadding(0, 0, 0, (int) this.f47714u);
                }
            } else {
                childAt.layout(0, i8, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i8);
                childAt.setTag(2);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        this.f47705l = getMeasuredHeight();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void r() {
        if (this.f47698e) {
            s();
        }
    }

    public boolean w() {
        return this.f47698e;
    }

    public SlideBottomPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlideBottomPanel(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47697d = false;
        this.f47698e = false;
        this.f47711r = false;
        this.f47717x = true;
        this.f47718y = true;
        this.f47719z = false;
        this.A = false;
        this.B = new AccelerateInterpolator();
        this.C = new AccelerateInterpolator();
        this.D = context;
        this.f47696c = getResources().getDisplayMetrics().density;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(this.D);
        this.f47702i = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f47703j = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f47701h = viewConfiguration.getScaledTouchSlop();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SlideBottomPanel, i4, 0);
        this.f47712s = obtainStyledAttributes.getResourceId(1, -1);
        this.f47713t = obtainStyledAttributes.getDimension(6, m(K));
        this.f47718y = obtainStyledAttributes.getBoolean(2, true);
        float dimension = obtainStyledAttributes.getDimension(7, m(60));
        this.f47714u = dimension;
        R = dimension;
        this.f47715v = obtainStyledAttributes.getDimension(5, m(30));
        this.f47716w = obtainStyledAttributes.getInt(0, 250);
        this.f47719z = obtainStyledAttributes.getBoolean(4, false);
        this.f47717x = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        u();
    }
}
