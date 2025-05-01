package com.flipboard.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.join.android.app.mgsim.wufun.R;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes3.dex */
public class BottomSheetLayout extends FrameLayout {
    private static final Property<BottomSheetLayout, Float> J = new a(Float.class, "sheetTranslation");
    private static final long K = 300;
    private int A;
    private final boolean B;
    private final int C;
    private int D;
    private int E;
    private float F;
    private float G;
    private float H;
    private State I;

    /* renamed from: b  reason: collision with root package name */
    private Runnable f12846b;

    /* renamed from: c  reason: collision with root package name */
    private Rect f12847c;

    /* renamed from: d  reason: collision with root package name */
    private State f12848d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12849e;

    /* renamed from: f  reason: collision with root package name */
    private TimeInterpolator f12850f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12851g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f12852h;

    /* renamed from: i  reason: collision with root package name */
    private float f12853i;

    /* renamed from: j  reason: collision with root package name */
    private VelocityTracker f12854j;

    /* renamed from: k  reason: collision with root package name */
    private float f12855k;

    /* renamed from: l  reason: collision with root package name */
    private float f12856l;

    /* renamed from: m  reason: collision with root package name */
    private com.flipboard.bottomsheet.c f12857m;

    /* renamed from: n  reason: collision with root package name */
    private com.flipboard.bottomsheet.c f12858n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f12859o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f12860p;

    /* renamed from: q  reason: collision with root package name */
    private Animator f12861q;

    /* renamed from: r  reason: collision with root package name */
    private CopyOnWriteArraySet<com.flipboard.bottomsheet.b> f12862r;

    /* renamed from: s  reason: collision with root package name */
    private CopyOnWriteArraySet<j> f12863s;

    /* renamed from: t  reason: collision with root package name */
    private View.OnLayoutChangeListener f12864t;

    /* renamed from: u  reason: collision with root package name */
    private View f12865u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f12866v;

    /* renamed from: w  reason: collision with root package name */
    private int f12867w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f12868x;

    /* renamed from: y  reason: collision with root package name */
    private float f12869y;

    /* renamed from: z  reason: collision with root package name */
    private float f12870z;

    /* loaded from: classes3.dex */
    public enum State {
        HIDDEN,
        PREPARING,
        PEEKED,
        EXPANDED
    }

    /* loaded from: classes3.dex */
    class a extends Property<BottomSheetLayout, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(BottomSheetLayout bottomSheetLayout) {
            return Float.valueOf(bottomSheetLayout.f12853i);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(BottomSheetLayout bottomSheetLayout, Float f5) {
            bottomSheetLayout.setSheetTranslation(f5.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends h {
        b() {
            super(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            if (this.f12881b) {
                return;
            }
            BottomSheetLayout.this.f12861q = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends h {
        c() {
            super(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            if (this.f12881b) {
                return;
            }
            BottomSheetLayout.this.f12861q = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f12873b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.flipboard.bottomsheet.c f12874c;

        d(View view, com.flipboard.bottomsheet.c cVar) {
            this.f12873b = view;
            this.f12874c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetLayout.this.J(this.f12873b, this.f12874c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements ViewTreeObserver.OnPreDrawListener {

        /* loaded from: classes3.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BottomSheetLayout.this.getSheetView() != null) {
                    BottomSheetLayout.this.D();
                }
            }
        }

        e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            BottomSheetLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
            BottomSheetLayout.this.post(new a());
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f implements View.OnLayoutChangeListener {
        f() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            int measuredHeight = view.getMeasuredHeight();
            if (BottomSheetLayout.this.f12848d != State.HIDDEN) {
                if (measuredHeight < BottomSheetLayout.this.f12867w) {
                    if (BottomSheetLayout.this.f12848d == State.EXPANDED) {
                        BottomSheetLayout.this.setState(State.PEEKED);
                    }
                    BottomSheetLayout.this.setSheetTranslation(measuredHeight);
                } else if (BottomSheetLayout.this.f12867w > 0 && measuredHeight > BottomSheetLayout.this.f12867w && BottomSheetLayout.this.f12848d == State.PEEKED) {
                    float f5 = measuredHeight;
                    if (f5 == BottomSheetLayout.this.getMaxSheetTranslation()) {
                        BottomSheetLayout.this.setState(State.EXPANDED);
                    }
                    BottomSheetLayout.this.setSheetTranslation(f5);
                }
            }
            BottomSheetLayout.this.f12867w = measuredHeight;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g extends h {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f12879c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(View view) {
            super(null);
            this.f12879c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f12881b) {
                return;
            }
            BottomSheetLayout.this.f12861q = null;
            BottomSheetLayout.this.setState(State.HIDDEN);
            BottomSheetLayout.this.setSheetLayerTypeIfEnabled(0);
            BottomSheetLayout.this.removeView(this.f12879c);
            Iterator it2 = BottomSheetLayout.this.f12862r.iterator();
            while (it2.hasNext()) {
                ((com.flipboard.bottomsheet.b) it2.next()).a(BottomSheetLayout.this);
            }
            BottomSheetLayout.this.f12858n = null;
            if (BottomSheetLayout.this.f12846b != null) {
                BottomSheetLayout.this.f12846b.run();
                BottomSheetLayout.this.f12846b = null;
            }
        }
    }

    /* loaded from: classes3.dex */
    private static class h extends AnimatorListenerAdapter {

        /* renamed from: b  reason: collision with root package name */
        protected boolean f12881b;

        private h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f12881b = true;
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    private static class i extends com.flipboard.bottomsheet.a {
        private i() {
        }

        @Override // com.flipboard.bottomsheet.c
        public void b(float f5, float f6, float f7, BottomSheetLayout bottomSheetLayout, View view) {
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public interface j {
        void a(State state);
    }

    public BottomSheetLayout(Context context) {
        super(context);
        this.f12847c = new Rect();
        this.f12848d = State.HIDDEN;
        this.f12849e = false;
        this.f12850f = new DecelerateInterpolator(1.6f);
        this.f12857m = new i(null);
        this.f12859o = true;
        this.f12860p = true;
        this.f12862r = new CopyOnWriteArraySet<>();
        this.f12863s = new CopyOnWriteArraySet<>();
        this.f12866v = true;
        this.A = 0;
        this.B = getResources().getBoolean(R.bool.bottomsheet_is_tablet);
        this.C = getResources().getDimensionPixelSize(R.dimen.bottomsheet_default_sheet_width);
        this.D = 0;
        this.E = 0;
        x();
    }

    public static boolean B(Context context) {
        return context.getResources().getBoolean(R.bool.bottomsheet_is_tablet);
    }

    private boolean C(float f5) {
        return !this.B || (f5 >= ((float) this.D) && f5 <= ((float) this.E));
    }

    public static int E(Context context) {
        if (B(context)) {
            return context.getResources().getDimensionPixelSize(R.dimen.bottomsheet_default_sheet_width);
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    private void K(float f5) {
        com.flipboard.bottomsheet.c cVar = this.f12858n;
        if (cVar != null) {
            cVar.b(f5, getMaxSheetTranslation(), getPeekSheetTranslation(), this, getContentView());
            return;
        }
        com.flipboard.bottomsheet.c cVar2 = this.f12857m;
        if (cVar2 != null) {
            cVar2.b(f5, getMaxSheetTranslation(), getPeekSheetTranslation(), this, getContentView());
        }
    }

    private float getDefaultPeekTranslation() {
        return w() ? this.f12869y : getSheetView().getHeight();
    }

    private boolean o(View view, float f5, float f6) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                View childAt = viewGroup.getChildAt(i4);
                int left = childAt.getLeft() - view.getScrollX();
                int top = childAt.getTop() - view.getScrollY();
                float f7 = left;
                if ((f5 > f7 && f5 < ((float) (childAt.getRight() - view.getScrollX())) && f6 > ((float) top) && f6 < ((float) (childAt.getBottom() - view.getScrollY()))) && o(childAt, f5 - f7, f6 - top)) {
                    return true;
                }
            }
        }
        return view.canScrollVertically(-1);
    }

    private void p() {
        Animator animator = this.f12861q;
        if (animator != null) {
            animator.cancel();
        }
    }

    private static <T> T q(T t4, String str) {
        Objects.requireNonNull(t4, str);
        return t4;
    }

    private void s(Runnable runnable) {
        if (this.f12848d == State.HIDDEN) {
            this.f12846b = null;
            return;
        }
        this.f12846b = runnable;
        View sheetView = getSheetView();
        sheetView.removeOnLayoutChangeListener(this.f12864t);
        p();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, J, 0.0f);
        ofFloat.setDuration(K);
        ofFloat.setInterpolator(this.f12850f);
        ofFloat.addListener(new g(sheetView));
        ofFloat.start();
        this.f12861q = ofFloat;
        this.D = 0;
        this.E = this.A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSheetLayerTypeIfEnabled(int i4) {
        if (this.f12860p) {
            getSheetView().setLayerType(i4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSheetTranslation(float f5) {
        this.f12853i = Math.min(f5, getMaxSheetTranslation());
        double height = getHeight();
        double ceil = Math.ceil(this.f12853i);
        Double.isNaN(height);
        this.f12847c.set(0, 0, getWidth(), (int) (height - ceil));
        getSheetView().setTranslationY(getHeight() - this.f12853i);
        K(this.f12853i);
        if (this.f12859o) {
            float u4 = u(this.f12853i);
            this.f12865u.setAlpha(u4);
            this.f12865u.setVisibility(u4 <= 0.0f ? 4 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(State state) {
        if (state != this.f12848d) {
            this.f12848d = state;
            Iterator<j> it2 = this.f12863s.iterator();
            while (it2.hasNext()) {
                it2.next().a(state);
            }
        }
    }

    private float u(float f5) {
        com.flipboard.bottomsheet.c cVar = this.f12858n;
        if (cVar != null) {
            return cVar.a(f5, getMaxSheetTranslation(), getPeekSheetTranslation(), this, getContentView());
        }
        com.flipboard.bottomsheet.c cVar2 = this.f12857m;
        if (cVar2 != null) {
            return cVar2.a(f5, getMaxSheetTranslation(), getPeekSheetTranslation(), this, getContentView());
        }
        return 0.0f;
    }

    private boolean v() {
        return getSheetView() == null || getSheetView().getHeight() == getHeight();
    }

    private boolean w() {
        return getSheetView() == null || ((float) getSheetView().getHeight()) > this.f12869y;
    }

    private void x() {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f12855k = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f12856l = viewConfiguration.getScaledTouchSlop();
        View view = new View(getContext());
        this.f12865u = view;
        view.setBackgroundColor(-16777216);
        this.f12865u.setAlpha(0.0f);
        this.f12865u.setVisibility(4);
        setFocusableInTouchMode(true);
        Point point = new Point();
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getSize(point);
        int i4 = point.x;
        this.A = i4;
        this.E = i4;
        this.f12870z = 0.0f;
        this.f12869y = point.y - (i4 / 1.7777778f);
    }

    private void y() {
        this.f12853i = 0.0f;
        this.f12847c.set(0, 0, getWidth(), getHeight());
        getSheetView().setTranslationY(getHeight());
        this.f12865u.setAlpha(0.0f);
        this.f12865u.setVisibility(4);
    }

    private boolean z() {
        return this.f12861q != null;
    }

    public boolean A() {
        return this.f12848d != State.HIDDEN;
    }

    public void D() {
        p();
        setSheetLayerTypeIfEnabled(2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, J, getPeekSheetTranslation());
        ofFloat.setDuration(K);
        ofFloat.setInterpolator(this.f12850f);
        ofFloat.addListener(new c());
        ofFloat.start();
        this.f12861q = ofFloat;
        setState(State.PEEKED);
    }

    public void F(@NonNull com.flipboard.bottomsheet.b bVar) {
        q(bVar, "onSheetDismissedListener == null");
        this.f12862r.remove(bVar);
    }

    public void G(@NonNull j jVar) {
        q(jVar, "onSheetStateChangeListener == null");
        this.f12863s.remove(jVar);
    }

    public boolean H() {
        return this.f12859o;
    }

    public void I(View view) {
        J(view, null);
    }

    public void J(View view, com.flipboard.bottomsheet.c cVar) {
        if (this.f12848d != State.HIDDEN) {
            s(new d(view, cVar));
            return;
        }
        setState(State.PREPARING);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(this.B ? -2 : -1, -2, 1);
        }
        if (this.B && layoutParams.width == -2) {
            if (layoutParams.gravity == -1) {
                layoutParams.gravity = 1;
            }
            int i4 = this.C;
            layoutParams.width = i4;
            int i5 = this.A;
            int i6 = (i5 - i4) / 2;
            this.D = i6;
            this.E = i5 - i6;
        }
        super.addView(view, -1, layoutParams);
        y();
        this.f12858n = cVar;
        getViewTreeObserver().addOnPreDrawListener(new e());
        this.f12867w = view.getMeasuredHeight();
        f fVar = new f();
        this.f12864t = fVar;
        view.addOnLayoutChangeListener(fVar);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view) {
        if (getChildCount() <= 0) {
            setContentView(view);
            return;
        }
        throw new IllegalArgumentException("You may not declare more then one child of bottom sheet. The sheet view must be added dynamically with showWithSheetView()");
    }

    public View getContentView() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    public boolean getInterceptContentTouch() {
        return this.f12866v;
    }

    public float getMaxSheetTranslation() {
        return v() ? getHeight() - getPaddingTop() : getSheetView().getHeight();
    }

    public boolean getPeekOnDismiss() {
        return this.f12849e;
    }

    public float getPeekSheetTranslation() {
        float f5 = this.f12870z;
        return f5 == 0.0f ? getDefaultPeekTranslation() : f5;
    }

    public View getSheetView() {
        if (getChildCount() > 2) {
            return getChildAt(2);
        }
        return null;
    }

    public State getState() {
        return this.f12848d;
    }

    public void m(@NonNull com.flipboard.bottomsheet.b bVar) {
        q(bVar, "onSheetDismissedListener == null");
        this.f12862r.add(bVar);
    }

    public void n(@NonNull j jVar) {
        q(jVar, "onSheetStateChangeListener == null");
        this.f12863s.add(jVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12854j = VelocityTracker.obtain();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12854j.clear();
        p();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z4 = true;
        boolean z5 = motionEvent.getActionMasked() == 0;
        if (z5) {
            this.f12868x = false;
        }
        if (!this.f12866v && (motionEvent.getY() <= getHeight() - this.f12853i || !C(motionEvent.getX()))) {
            this.f12868x = false;
        } else {
            this.f12868x = (z5 && A()) ? false : false;
        }
        return this.f12868x;
    }

    @Override // android.view.View
    public boolean onKeyPreIme(int i4, @NonNull KeyEvent keyEvent) {
        if (i4 == 4 && A()) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (A() && keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    if (this.f12848d == State.EXPANDED && this.f12849e) {
                        D();
                    } else {
                        r();
                    }
                    return true;
                }
            }
        }
        return super.onKeyPreIme(i4, keyEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        double height = getHeight();
        double ceil = Math.ceil(this.f12853i);
        Double.isNaN(height);
        this.f12847c.set(0, 0, getWidth(), (int) (height - ceil));
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z4 = false;
        if (A() && !z()) {
            if (!this.f12868x) {
                return onInterceptTouchEvent(motionEvent);
            }
            if (motionEvent.getAction() == 0) {
                this.f12851g = false;
                this.f12852h = false;
                this.F = motionEvent.getY();
                this.G = motionEvent.getX();
                this.H = this.f12853i;
                this.I = this.f12848d;
                this.f12854j.clear();
            }
            this.f12854j.addMovement(motionEvent);
            float maxSheetTranslation = getMaxSheetTranslation();
            float peekSheetTranslation = getPeekSheetTranslation();
            float y2 = this.F - motionEvent.getY();
            float x4 = this.G - motionEvent.getX();
            if (!this.f12851g && !this.f12852h) {
                this.f12851g = Math.abs(y2) > this.f12856l;
                this.f12852h = Math.abs(x4) > this.f12856l;
                if (this.f12851g) {
                    if (this.f12848d == State.PEEKED) {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        obtain.offsetLocation(0.0f, this.f12853i - getHeight());
                        obtain.setAction(3);
                        getSheetView().dispatchTouchEvent(obtain);
                        obtain.recycle();
                    }
                    this.f12852h = false;
                    this.F = motionEvent.getY();
                    this.G = motionEvent.getX();
                    y2 = 0.0f;
                }
            }
            float f5 = this.H + y2;
            if (this.f12851g) {
                boolean z5 = y2 < 0.0f;
                boolean o4 = o(getSheetView(), motionEvent.getX(), motionEvent.getY() + (this.f12853i - getHeight()));
                State state = this.f12848d;
                State state2 = State.EXPANDED;
                if (state == state2 && z5 && !o4) {
                    this.F = motionEvent.getY();
                    this.H = this.f12853i;
                    this.f12854j.clear();
                    setState(State.PEEKED);
                    setSheetLayerTypeIfEnabled(2);
                    f5 = this.f12853i;
                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                    obtain2.setAction(3);
                    getSheetView().dispatchTouchEvent(obtain2);
                    obtain2.recycle();
                }
                if (this.f12848d == State.PEEKED && f5 > maxSheetTranslation) {
                    setSheetTranslation(maxSheetTranslation);
                    f5 = Math.min(maxSheetTranslation, f5);
                    MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                    obtain3.setAction(0);
                    getSheetView().dispatchTouchEvent(obtain3);
                    obtain3.recycle();
                    setState(state2);
                    setSheetLayerTypeIfEnabled(0);
                }
                if (this.f12848d == state2) {
                    motionEvent.offsetLocation(0.0f, this.f12853i - getHeight());
                    getSheetView().dispatchTouchEvent(motionEvent);
                } else {
                    if (f5 < peekSheetTranslation) {
                        f5 = peekSheetTranslation - ((peekSheetTranslation - f5) / 4.0f);
                    }
                    setSheetTranslation(f5);
                    if (motionEvent.getAction() == 3) {
                        if (this.I == state2) {
                            t();
                        } else {
                            D();
                        }
                    }
                    if (motionEvent.getAction() == 1) {
                        if (f5 < peekSheetTranslation) {
                            r();
                        } else {
                            this.f12854j.computeCurrentVelocity(1000);
                            float yVelocity = this.f12854j.getYVelocity();
                            if (Math.abs(yVelocity) < this.f12855k) {
                                if (this.f12853i > getHeight() / 2) {
                                    t();
                                } else {
                                    D();
                                }
                            } else if (yVelocity < 0.0f) {
                                t();
                            } else {
                                D();
                            }
                        }
                    }
                }
            } else {
                z4 = (motionEvent.getY() < ((float) getHeight()) - this.f12853i || !C(motionEvent.getX())) ? true : true;
                if (motionEvent.getAction() == 1 && z4 && this.f12866v) {
                    r();
                    return true;
                }
                motionEvent.offsetLocation(this.B ? getX() - this.D : 0.0f, this.f12853i - getHeight());
                getSheetView().dispatchTouchEvent(motionEvent);
            }
            return true;
        }
        return false;
    }

    public void r() {
        s(null);
    }

    public void setContentView(View view) {
        super.addView(view, -1, generateDefaultLayoutParams());
        super.addView(this.f12865u, -1, generateDefaultLayoutParams());
    }

    public void setDefaultViewTransformer(com.flipboard.bottomsheet.c cVar) {
        this.f12857m = cVar;
    }

    public void setInterceptContentTouch(boolean z4) {
        this.f12866v = z4;
    }

    public void setPeekOnDismiss(boolean z4) {
        this.f12849e = z4;
    }

    public void setPeekSheetTranslation(float f5) {
        this.f12870z = f5;
    }

    public void setShouldDimContentView(boolean z4) {
        this.f12859o = z4;
    }

    public void setUseHardwareLayerWhileAnimating(boolean z4) {
        this.f12860p = z4;
    }

    public void t() {
        p();
        setSheetLayerTypeIfEnabled(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, J, getMaxSheetTranslation());
        ofFloat.setDuration(K);
        ofFloat.setInterpolator(this.f12850f);
        ofFloat.addListener(new b());
        ofFloat.start();
        this.f12861q = ofFloat;
        setState(State.EXPANDED);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i4) {
        addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i4, @NonNull ViewGroup.LayoutParams layoutParams) {
        addView(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(@NonNull View view, @NonNull ViewGroup.LayoutParams layoutParams) {
        addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i4, int i5) {
        addView(view);
    }

    public BottomSheetLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BottomSheetLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f12847c = new Rect();
        this.f12848d = State.HIDDEN;
        this.f12849e = false;
        this.f12850f = new DecelerateInterpolator(1.6f);
        this.f12857m = new i(null);
        this.f12859o = true;
        this.f12860p = true;
        this.f12862r = new CopyOnWriteArraySet<>();
        this.f12863s = new CopyOnWriteArraySet<>();
        this.f12866v = true;
        this.A = 0;
        this.B = getResources().getBoolean(R.bool.bottomsheet_is_tablet);
        this.C = getResources().getDimensionPixelSize(R.dimen.bottomsheet_default_sheet_width);
        this.D = 0;
        this.E = 0;
        x();
    }

    @TargetApi(21)
    public BottomSheetLayout(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f12847c = new Rect();
        this.f12848d = State.HIDDEN;
        this.f12849e = false;
        this.f12850f = new DecelerateInterpolator(1.6f);
        this.f12857m = new i(null);
        this.f12859o = true;
        this.f12860p = true;
        this.f12862r = new CopyOnWriteArraySet<>();
        this.f12863s = new CopyOnWriteArraySet<>();
        this.f12866v = true;
        this.A = 0;
        this.B = getResources().getBoolean(R.bool.bottomsheet_is_tablet);
        this.C = getResources().getDimensionPixelSize(R.dimen.bottomsheet_default_sheet_width);
        this.D = 0;
        this.E = 0;
        x();
    }
}
