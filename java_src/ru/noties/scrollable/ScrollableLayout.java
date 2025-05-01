package ru.noties.scrollable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.join.android.app.mgsim.wufun.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes7.dex */
public class ScrollableLayout extends FrameLayout {
    private static final long M = 200;
    private static final int N = 100;
    private static final float O = 0.0565f;
    private boolean A;
    private ViewTreeObserver.OnGlobalLayoutListener B;
    private int C;
    private boolean D;
    private l E;
    private int F;
    private View G;
    private ValueAnimator H;
    private ValueAnimator.AnimatorUpdateListener I;
    private boolean J;
    private final Runnable K;
    private final Runnable L;

    /* renamed from: b  reason: collision with root package name */
    private final Rect f73264b;

    /* renamed from: c  reason: collision with root package name */
    private final List<k> f73265c;

    /* renamed from: d  reason: collision with root package name */
    private n f73266d;

    /* renamed from: e  reason: collision with root package name */
    private GestureDetector f73267e;

    /* renamed from: f  reason: collision with root package name */
    private GestureDetector f73268f;

    /* renamed from: g  reason: collision with root package name */
    private ru.noties.scrollable.b f73269g;

    /* renamed from: h  reason: collision with root package name */
    private int f73270h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f73271i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f73272j;

    /* renamed from: k  reason: collision with root package name */
    private g f73273k;

    /* renamed from: l  reason: collision with root package name */
    private ru.noties.scrollable.c f73274l;

    /* renamed from: m  reason: collision with root package name */
    private ValueAnimator f73275m;

    /* renamed from: n  reason: collision with root package name */
    private ValueAnimator.AnimatorUpdateListener f73276n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f73277o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f73278p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f73279q;

    /* renamed from: r  reason: collision with root package name */
    private ru.noties.scrollable.e f73280r;

    /* renamed from: s  reason: collision with root package name */
    private ru.noties.scrollable.d f73281s;

    /* renamed from: t  reason: collision with root package name */
    private View f73282t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f73283u;

    /* renamed from: v  reason: collision with root package name */
    private long f73284v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f73285w;

    /* renamed from: x  reason: collision with root package name */
    private float f73286x;

    /* renamed from: y  reason: collision with root package name */
    private float f73287y;

    /* renamed from: z  reason: collision with root package name */
    private ru.noties.scrollable.j f73288z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public class a implements h {
        a() {
        }

        @Override // ru.noties.scrollable.ScrollableLayout.h
        public void a(MotionEvent motionEvent) {
            ScrollableLayout.super.dispatchTouchEvent(motionEvent);
        }
    }

    /* loaded from: classes7.dex */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f73292b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f73293c;

        b(int i4, int i5) {
            this.f73292b = i4;
            this.f73293c = i5;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ScrollableLayout.this.scrollTo(0, (int) (this.f73292b + (this.f73293c * valueAnimator.getAnimatedFraction()) + 0.5f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f73295b;

        c(View view) {
            this.f73295b = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ScrollableLayout.this.f73270h = this.f73295b.getMeasuredHeight();
        }
    }

    /* loaded from: classes7.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean c5 = ScrollableLayout.this.f73266d.c();
            ScrollableLayout.this.f73278p = c5;
            if (c5) {
                int f5 = ScrollableLayout.this.f73266d.f();
                if (f5 - ScrollableLayout.this.getScrollY() != 0) {
                    ScrollableLayout.this.scrollTo(0, f5);
                }
                ScrollableLayout.this.post(this);
            }
        }
    }

    /* loaded from: classes7.dex */
    class e implements Runnable {

        /* loaded from: classes7.dex */
        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f73299b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f73300c;

            a(int i4, int i5) {
                this.f73299b = i4;
                this.f73300c = i5;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ScrollableLayout.this.scrollTo(0, (int) (this.f73299b + (this.f73300c * valueAnimator.getAnimatedFraction()) + 0.5f));
            }
        }

        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int scrollY;
            long j4;
            ScrollableLayout.this.z(false);
            if (ScrollableLayout.this.f73277o || ScrollableLayout.this.f73278p || (scrollY = ScrollableLayout.this.getScrollY()) == 0 || scrollY == ScrollableLayout.this.f73270h) {
                return;
            }
            ru.noties.scrollable.c cVar = ScrollableLayout.this.f73274l;
            ScrollableLayout scrollableLayout = ScrollableLayout.this;
            int b5 = cVar.b(scrollableLayout, scrollY, scrollableLayout.f73270h);
            if (scrollY == b5) {
                return;
            }
            if (ScrollableLayout.this.f73275m == null) {
                ScrollableLayout.this.f73275m = ValueAnimator.ofFloat(0.0f, 1.0f);
                ScrollableLayout.this.f73275m.setEvaluator(new FloatEvaluator());
                ScrollableLayout.this.f73275m.addListener(new j(ScrollableLayout.this, null));
            } else {
                if (ScrollableLayout.this.f73276n != null) {
                    ScrollableLayout.this.f73275m.removeUpdateListener(ScrollableLayout.this.f73276n);
                }
                if (ScrollableLayout.this.f73275m.isRunning()) {
                    ScrollableLayout.this.f73275m.end();
                }
            }
            ScrollableLayout.this.f73276n = new a(scrollY, b5 - scrollY);
            ScrollableLayout.this.f73275m.addUpdateListener(ScrollableLayout.this.f73276n);
            if (ScrollableLayout.this.f73280r != null) {
                ru.noties.scrollable.e eVar = ScrollableLayout.this.f73280r;
                ScrollableLayout scrollableLayout2 = ScrollableLayout.this;
                j4 = eVar.a(scrollableLayout2, scrollY, b5, scrollableLayout2.f73270h);
            } else {
                j4 = 200;
            }
            ScrollableLayout.this.f73275m.setDuration(j4);
            if (ScrollableLayout.this.f73281s != null) {
                ScrollableLayout.this.f73281s.a(ScrollableLayout.this.f73275m);
            }
            ScrollableLayout.this.f73275m.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public class f extends ru.noties.scrollable.h {

        /* renamed from: e  reason: collision with root package name */
        private static final int f73302e = 12;

        /* renamed from: b  reason: collision with root package name */
        private final int f73303b;

        /* renamed from: c  reason: collision with root package name */
        private final float f73304c;

        f(Context context) {
            this.f73303b = ru.noties.scrollable.g.a(context, 12);
            this.f73304c = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        }

        @Override // ru.noties.scrollable.h, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
            int scrollY;
            if (Math.abs(f6) >= this.f73304c && Math.abs(f5) <= Math.abs(f6) && (scrollY = ScrollableLayout.this.getScrollY()) >= 0 && scrollY <= ScrollableLayout.this.f73270h) {
                int i4 = -((int) (0.5f + f6));
                if (!ScrollableLayout.this.f73283u && ScrollableLayout.this.f73288z != null && ScrollableLayout.this.f73270h != ScrollableLayout.this.getScrollY() && i4 > 0 && ScrollableLayout.this.f73269g != null && ScrollableLayout.this.f73269g.q(1)) {
                    ScrollableLayout.this.f73266d.d(0, scrollY, 0, i4, 0, 0, 0, Integer.MAX_VALUE);
                    ScrollableLayout.this.f73288z.F(ScrollableLayout.this.f73266d.h() - ScrollableLayout.this.f73270h, ScrollableLayout.this.f73266d.k(f6));
                    ScrollableLayout.this.f73266d.a();
                }
                ScrollableLayout.this.f73266d.d(0, scrollY, 0, i4, 0, 0, 0, ScrollableLayout.this.f73270h);
                if (ScrollableLayout.this.f73266d.c()) {
                    int h4 = ScrollableLayout.this.f73266d.h();
                    if (Math.abs(scrollY - h4) < this.f73303b) {
                        ScrollableLayout.this.f73266d.a();
                        return false;
                    }
                    if (h4 != scrollY && ScrollableLayout.this.f73274l != null) {
                        ru.noties.scrollable.c cVar = ScrollableLayout.this.f73274l;
                        ScrollableLayout scrollableLayout = ScrollableLayout.this;
                        h4 = cVar.a(scrollableLayout, h4 - scrollY < 0, scrollY, h4, scrollableLayout.f73270h);
                        ScrollableLayout.this.f73266d.l(h4);
                    }
                    return h4 != scrollY && ScrollableLayout.this.B(h4) >= 0;
                }
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        final h f73306a;

        g(h hVar) {
            this.f73306a = hVar;
        }

        void a(MotionEvent motionEvent, int i4) {
            int action = motionEvent.getAction();
            motionEvent.setAction(i4);
            this.f73306a.a(motionEvent);
            motionEvent.setAction(action);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public interface h {
        void a(MotionEvent motionEvent);
    }

    /* loaded from: classes7.dex */
    private class j extends AnimatorListenerAdapter {

        /* renamed from: b  reason: collision with root package name */
        private boolean f73309b;

        private j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ScrollableLayout.this.f73277o = this.f73309b;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ScrollableLayout.this.f73277o = this.f73309b;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f73309b = ScrollableLayout.this.f73277o;
            ScrollableLayout.this.f73277o = true;
        }

        /* synthetic */ j(ScrollableLayout scrollableLayout, a aVar) {
            this();
        }
    }

    public ScrollableLayout(Context context) {
        super(context);
        this.f73264b = new Rect();
        this.f73265c = new ArrayList(3);
        this.K = new d();
        this.L = new e();
        C(context, null);
    }

    private void A() {
        l lVar = this.E;
        if (lVar != null && this.D) {
            lVar.b(this);
        }
        this.D = false;
    }

    private void C(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScrollableLayout);
        try {
            this.f73266d = D(context, null, obtainStyledAttributes.getBoolean(8, false));
            setFriction(obtainStyledAttributes.getFloat(6, O));
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(7, 0);
            this.f73270h = dimensionPixelSize;
            this.A = obtainStyledAttributes.getBoolean(0, dimensionPixelSize == 0);
            this.C = obtainStyledAttributes.getResourceId(1, 0);
            setConsiderIdleMillis(obtainStyledAttributes.getInteger(4, 100));
            if (obtainStyledAttributes.getBoolean(5, false)) {
                setCloseUpAlgorithm(new ru.noties.scrollable.f());
            }
            int integer = obtainStyledAttributes.getInteger(2, -1);
            if (integer != -1) {
                setCloseUpIdleAnimationTime(new o(integer));
            }
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                setCloseAnimatorConfigurator(new ru.noties.scrollable.i(AnimationUtils.loadInterpolator(context, resourceId)));
            }
            this.F = obtainStyledAttributes.getResourceId(9, 0);
            obtainStyledAttributes.recycle();
            this.f73267e = new GestureDetector(context, new i(this, null));
            this.f73268f = new GestureDetector(context, new f(context));
            this.f73273k = new g(new a());
            this.f73287y = ViewConfiguration.get(context).getScaledTouchSlop();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private boolean y(int i4) {
        View view = this.G;
        return view != null && view.canScrollVertically(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(boolean z4) {
        if (z4) {
            removeCallbacks(this.L);
        }
        ValueAnimator valueAnimator = this.f73275m;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f73276n;
        if (animatorUpdateListener != null) {
            this.f73275m.removeUpdateListener(animatorUpdateListener);
        }
        this.f73275m.end();
    }

    protected int B(int i4) {
        int scrollY = getScrollY();
        if (scrollY == i4) {
            return -1;
        }
        int i5 = i4 - scrollY;
        boolean z4 = i5 < 0;
        ru.noties.scrollable.b bVar = this.f73269g;
        if (bVar != null) {
            if (z4) {
                if (!this.f73283u && !this.f73277o && bVar.q(i5)) {
                    return -1;
                }
            } else if ((!this.f73283u && !this.f73277o && y(i5)) || (scrollY == this.f73270h && !this.f73269g.q(i5))) {
                return -1;
            }
        }
        if (i4 < 0) {
            return 0;
        }
        int i6 = this.f73270h;
        return i4 > i6 ? i6 : i4;
    }

    protected n D(Context context, Interpolator interpolator, boolean z4) {
        return new n(context, interpolator, z4);
    }

    public boolean E() {
        return this.A;
    }

    public boolean F() {
        return this.f73277o;
    }

    protected void G(boolean z4) {
        View childAt;
        if (getChildCount() == 0) {
            return;
        }
        int i4 = this.C;
        if (i4 != 0) {
            childAt = findViewById(i4);
        } else {
            childAt = getChildAt(0);
        }
        if (childAt == null) {
            return;
        }
        if (!z4) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.B;
            if (onGlobalLayoutListener != null) {
                p.a(childAt, onGlobalLayoutListener);
                this.B = null;
            }
        } else if (this.B == null) {
            this.B = new c(childAt);
            childAt.getViewTreeObserver().addOnGlobalLayoutListener(this.B);
        }
    }

    public void H(k kVar) {
        if (kVar != null) {
            this.f73265c.remove(kVar);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i4) {
        return false;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i4) {
        ru.noties.scrollable.b bVar;
        boolean z4 = getScrollY() > 0;
        if (i4 >= 0 || !z4) {
            return i4 > 0 && (bVar = this.f73269g) != null && bVar.q(i4);
        }
        return true;
    }

    @Override // android.view.View
    protected int computeVerticalScrollRange() {
        return this.f73270h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f73277o) {
            this.f73279q = false;
            this.f73283u = false;
            this.f73271i = false;
            this.f73272j = false;
            this.D = false;
            removeCallbacks(this.L);
            removeCallbacks(this.K);
            return super.dispatchTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f73279q = true;
            this.f73266d.a();
            View view = this.f73282t;
            if (view != null && view.getGlobalVisibleRect(this.f73264b)) {
                this.f73283u = this.f73264b.contains((int) (motionEvent.getRawX() + 0.5f), (int) (motionEvent.getRawY() + 0.5f));
            } else {
                this.f73283u = false;
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f73279q = false;
            if (this.f73274l != null) {
                removeCallbacks(this.L);
                postDelayed(this.L, this.f73284v);
            }
            if (this.f73285w) {
                if (actionMasked == 1 && Float.compare(Math.abs(motionEvent.getRawY() - this.f73286x), this.f73287y) < 0) {
                    motionEvent.setAction(3);
                }
                this.f73285w = false;
            }
            A();
        }
        boolean z4 = this.f73271i;
        boolean z5 = this.f73272j;
        this.f73272j = this.f73268f.onTouchEvent(motionEvent);
        this.f73271i = this.f73267e.onTouchEvent(motionEvent);
        removeCallbacks(this.K);
        post(this.K);
        boolean z6 = this.f73271i || this.f73272j;
        boolean z7 = z4 || z5;
        boolean z8 = actionMasked == 2 && !z6 && z7 && getScrollY() == this.f73270h;
        if (z6 || z7) {
            this.f73273k.a(motionEvent, 3);
            if (!z7) {
                return true;
            }
        }
        if (z8) {
            this.f73273k.a(motionEvent, 0);
            this.f73286x = motionEvent.getRawY();
            this.f73285w = true;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public long getConsiderIdleMillis() {
        return this.f73284v;
    }

    public int getMaxScrollY() {
        return this.f73270h;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.H.cancel();
        }
        ValueAnimator valueAnimator2 = this.f73275m;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f73275m.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        View childAt;
        super.onFinishInflate();
        if (this.A) {
            G(true);
        }
        int i4 = this.F;
        if (i4 != 0) {
            childAt = findViewById(i4);
        } else {
            childAt = getChildCount() > 0 ? getChildAt(0) : null;
        }
        this.G = childAt;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        if (childCount > 0) {
            int i8 = 0;
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                childAt.layout(i4, i8, i6, childAt.getMeasuredHeight() + i8);
                i8 += childAt.getMeasuredHeight();
            }
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ScrollableLayoutSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ScrollableLayoutSavedState scrollableLayoutSavedState = (ScrollableLayoutSavedState) parcelable;
        super.onRestoreInstanceState(scrollableLayoutSavedState.getSuperState());
        setScrollY(scrollableLayoutSavedState.f73289b);
        boolean z4 = scrollableLayoutSavedState.f73290c;
        this.A = z4;
        G(z4);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ScrollableLayoutSavedState scrollableLayoutSavedState = new ScrollableLayoutSavedState(super.onSaveInstanceState());
        scrollableLayoutSavedState.f73289b = getScrollY();
        scrollableLayoutSavedState.f73290c = this.A;
        return scrollableLayoutSavedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i4, int i5, int i6, int i7) {
        boolean z4 = i5 != i7;
        int size = z4 ? this.f73265c.size() : 0;
        if (size > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                this.f73265c.get(i8).a(i5, i7, this.f73270h);
            }
        }
        if (this.f73274l != null) {
            removeCallbacks(this.L);
            if (!this.f73277o && z4 && !this.f73279q) {
                postDelayed(this.L, this.f73284v);
            }
        }
        super.onScrollChanged(i4, i5, i6, i7);
    }

    @Override // android.view.View
    public void scrollTo(int i4, int i5) {
        int B = B(i5);
        if (B < 0) {
            return;
        }
        super.scrollTo(0, B);
    }

    public void setAutoMaxScroll(boolean z4) {
        this.A = z4;
        G(z4);
    }

    public void setCanScrollVerticallyDelegate(ru.noties.scrollable.b bVar) {
        this.f73269g = bVar;
    }

    public void setCloseAnimatorConfigurator(ru.noties.scrollable.d dVar) {
        this.f73281s = dVar;
    }

    public void setCloseUpAlgorithm(ru.noties.scrollable.c cVar) {
        this.f73274l = cVar;
    }

    public void setCloseUpIdleAnimationTime(ru.noties.scrollable.e eVar) {
        this.f73280r = eVar;
    }

    public void setConsiderIdleMillis(long j4) {
        this.f73284v = j4;
    }

    public void setDraggableView(View view) {
        this.f73282t = view;
    }

    public void setFriction(float f5) {
        this.f73266d.m(f5);
    }

    public void setIsIndex(boolean z4) {
        this.J = z4;
    }

    public void setMaxScrollY(int i4) {
        this.f73270h = i4;
        G(false);
    }

    public void setOnFlingOverListener(ru.noties.scrollable.j jVar) {
        this.f73288z = jVar;
    }

    @Deprecated
    public void setOnScrollChangedListener(k kVar) {
        this.f73265c.clear();
        w(kVar);
    }

    public void setOverScrollListener(l lVar) {
        this.E = lVar;
    }

    public void setSelfUpdateScroll(boolean z4) {
        this.f73277o = z4;
    }

    public void w(k kVar) {
        if (kVar != null) {
            this.f73265c.add(kVar);
        }
    }

    public ValueAnimator x(int i4) {
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.H = ofFloat;
            ofFloat.setEvaluator(new FloatEvaluator());
            this.H.addListener(new j(this, null));
        } else {
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.I;
            if (animatorUpdateListener != null) {
                valueAnimator.removeUpdateListener(animatorUpdateListener);
            }
            if (this.H.isRunning()) {
                this.H.end();
            }
        }
        if (i4 < 0) {
            i4 = 0;
        } else {
            int i5 = this.f73270h;
            if (i4 > i5) {
                i4 = i5;
            }
        }
        int scrollY = getScrollY();
        b bVar = new b(scrollY, i4 - scrollY);
        this.I = bVar;
        this.H.addUpdateListener(bVar);
        return this.H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static class ScrollableLayoutSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<ScrollableLayoutSavedState> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        int f73289b;

        /* renamed from: c  reason: collision with root package name */
        boolean f73290c;

        /* loaded from: classes7.dex */
        class a implements Parcelable.Creator<ScrollableLayoutSavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public ScrollableLayoutSavedState createFromParcel(Parcel parcel) {
                return new ScrollableLayoutSavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public ScrollableLayoutSavedState[] newArray(int i4) {
                return new ScrollableLayoutSavedState[i4];
            }
        }

        ScrollableLayoutSavedState(Parcel parcel) {
            super(parcel);
            this.f73289b = parcel.readInt();
            this.f73290c = parcel.readByte() == 1;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f73289b);
            parcel.writeByte(this.f73290c ? (byte) 1 : (byte) 0);
        }

        ScrollableLayoutSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public class i extends ru.noties.scrollable.h {

        /* renamed from: b  reason: collision with root package name */
        private final int f73307b;

        private i() {
            this.f73307b = ViewConfiguration.get(ScrollableLayout.this.getContext()).getScaledTouchSlop();
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00a7 A[RETURN] */
        @Override // ru.noties.scrollable.h, android.view.GestureDetector.OnGestureListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onScroll(android.view.MotionEvent r4, android.view.MotionEvent r5, float r6, float r7) {
            /*
                r3 = this;
                float r4 = java.lang.Math.abs(r6)
                float r5 = java.lang.Math.abs(r7)
                r6 = 0
                int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r5 > 0) goto La8
                int r5 = r3.f73307b
                float r5 = (float) r5
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 <= 0) goto L16
                goto La8
            L16:
                ru.noties.scrollable.ScrollableLayout r4 = ru.noties.scrollable.ScrollableLayout.this
                int r4 = r4.getScrollY()
                r5 = 1056964608(0x3f000000, float:0.5)
                float r7 = r7 + r5
                int r5 = (int) r7
                ru.noties.scrollable.ScrollableLayout r7 = ru.noties.scrollable.ScrollableLayout.this
                ru.noties.scrollable.l r7 = ru.noties.scrollable.ScrollableLayout.f(r7)
                r0 = 1
                if (r7 != 0) goto L39
                ru.noties.scrollable.ScrollableLayout r7 = ru.noties.scrollable.ScrollableLayout.this
                int r5 = r5 + r4
                r7.scrollTo(r6, r5)
                ru.noties.scrollable.ScrollableLayout r5 = ru.noties.scrollable.ScrollableLayout.this
                int r5 = r5.getScrollY()
                if (r4 == r5) goto L38
                r6 = 1
            L38:
                return r6
            L39:
                r7 = -1
                if (r5 >= 0) goto L3e
                r1 = -1
                goto L3f
            L3e:
                r1 = 1
            L3f:
                ru.noties.scrollable.ScrollableLayout r2 = ru.noties.scrollable.ScrollableLayout.this
                boolean r2 = ru.noties.scrollable.ScrollableLayout.g(r2)
                if (r2 != 0) goto L53
                ru.noties.scrollable.ScrollableLayout r2 = ru.noties.scrollable.ScrollableLayout.this
                if (r4 != 0) goto L4f
                if (r1 != r7) goto L4f
                r7 = 1
                goto L50
            L4f:
                r7 = 0
            L50:
                ru.noties.scrollable.ScrollableLayout.h(r2, r7)
            L53:
                ru.noties.scrollable.ScrollableLayout r7 = ru.noties.scrollable.ScrollableLayout.this
                boolean r7 = ru.noties.scrollable.ScrollableLayout.g(r7)
                if (r7 == 0) goto L94
                if (r1 != r0) goto L89
                if (r4 != 0) goto L89
                ru.noties.scrollable.ScrollableLayout r7 = ru.noties.scrollable.ScrollableLayout.this
                ru.noties.scrollable.l r7 = ru.noties.scrollable.ScrollableLayout.f(r7)
                ru.noties.scrollable.ScrollableLayout r1 = ru.noties.scrollable.ScrollableLayout.this
                boolean r7 = r7.a(r1, r5)
                if (r7 == 0) goto L7a
                ru.noties.scrollable.ScrollableLayout r7 = ru.noties.scrollable.ScrollableLayout.this
                ru.noties.scrollable.l r7 = ru.noties.scrollable.ScrollableLayout.f(r7)
                ru.noties.scrollable.ScrollableLayout r1 = ru.noties.scrollable.ScrollableLayout.this
                r7.c(r1, r5)
                r7 = 1
                goto L95
            L7a:
                ru.noties.scrollable.ScrollableLayout r7 = ru.noties.scrollable.ScrollableLayout.this
                ru.noties.scrollable.l r7 = ru.noties.scrollable.ScrollableLayout.f(r7)
                r7.clear()
                ru.noties.scrollable.ScrollableLayout r7 = ru.noties.scrollable.ScrollableLayout.this
                ru.noties.scrollable.ScrollableLayout.h(r7, r6)
                goto L94
            L89:
                ru.noties.scrollable.ScrollableLayout r7 = ru.noties.scrollable.ScrollableLayout.this
                ru.noties.scrollable.l r7 = ru.noties.scrollable.ScrollableLayout.f(r7)
                ru.noties.scrollable.ScrollableLayout r1 = ru.noties.scrollable.ScrollableLayout.this
                r7.c(r1, r5)
            L94:
                r7 = 0
            L95:
                if (r7 != 0) goto La7
                ru.noties.scrollable.ScrollableLayout r7 = ru.noties.scrollable.ScrollableLayout.this
                int r5 = r5 + r4
                r7.scrollTo(r6, r5)
                ru.noties.scrollable.ScrollableLayout r5 = ru.noties.scrollable.ScrollableLayout.this
                int r5 = r5.getScrollY()
                if (r4 == r5) goto La6
                r6 = 1
            La6:
                return r6
            La7:
                return r0
            La8:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.noties.scrollable.ScrollableLayout.i.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
        }

        /* synthetic */ i(ScrollableLayout scrollableLayout, a aVar) {
            this();
        }
    }

    public ScrollableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f73264b = new Rect();
        this.f73265c = new ArrayList(3);
        this.K = new d();
        this.L = new e();
        C(context, attributeSet);
    }

    public ScrollableLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f73264b = new Rect();
        this.f73265c = new ArrayList(3);
        this.K = new d();
        this.L = new e();
        C(context, attributeSet);
    }
}
