package com.join.mgps.ptr;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Scroller;
import android.widget.TextView;
import com.facebook.common.statfs.StatFsHelper;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class PtrFrameLayout extends ViewGroup {
    public static final byte F = 1;
    public static final byte G = 2;
    public static final byte H = 3;
    public static final byte I = 4;
    private static final boolean J = true;
    public static boolean K = false;
    private static int L = 1;
    private static byte M = 1;
    private static byte N = 2;
    private static byte O = 4;
    private static byte P = 8;
    private static byte Q = 3;
    protected int A;
    private float B;
    private float C;
    private float D;
    private float E;

    /* renamed from: b  reason: collision with root package name */
    private byte f53672b;

    /* renamed from: c  reason: collision with root package name */
    protected final String f53673c;

    /* renamed from: d  reason: collision with root package name */
    protected View f53674d;

    /* renamed from: e  reason: collision with root package name */
    private int f53675e;

    /* renamed from: f  reason: collision with root package name */
    private int f53676f;

    /* renamed from: g  reason: collision with root package name */
    private int f53677g;

    /* renamed from: h  reason: collision with root package name */
    private int f53678h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f53679i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f53680j;

    /* renamed from: k  reason: collision with root package name */
    private View f53681k;

    /* renamed from: l  reason: collision with root package name */
    private d f53682l;

    /* renamed from: m  reason: collision with root package name */
    private com.join.mgps.ptr.b f53683m;

    /* renamed from: n  reason: collision with root package name */
    private c f53684n;

    /* renamed from: o  reason: collision with root package name */
    private int f53685o;

    /* renamed from: p  reason: collision with root package name */
    private int f53686p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f53687q;

    /* renamed from: r  reason: collision with root package name */
    private int f53688r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f53689s;

    /* renamed from: t  reason: collision with root package name */
    private MotionEvent f53690t;

    /* renamed from: u  reason: collision with root package name */
    private e f53691u;

    /* renamed from: v  reason: collision with root package name */
    private int f53692v;

    /* renamed from: w  reason: collision with root package name */
    private long f53693w;

    /* renamed from: x  reason: collision with root package name */
    private com.join.mgps.ptr.indicator.a f53694x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f53695y;

    /* renamed from: z  reason: collision with root package name */
    private Runnable f53696z;

    /* loaded from: classes4.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PtrFrameLayout.this.B();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PtrFrameLayout.K) {
                com.join.mgps.ptr.util.a.a(PtrFrameLayout.this.f53673c, "mRefreshCompleteHook resume.");
            }
            PtrFrameLayout.this.u(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private int f53699b;

        /* renamed from: c  reason: collision with root package name */
        private Scroller f53700c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f53701d = false;

        /* renamed from: e  reason: collision with root package name */
        private int f53702e;

        /* renamed from: f  reason: collision with root package name */
        private int f53703f;

        public c() {
            this.f53700c = new Scroller(PtrFrameLayout.this.getContext());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            f();
            if (this.f53700c.isFinished()) {
                return;
            }
            this.f53700c.forceFinished(true);
        }

        private void e() {
            if (PtrFrameLayout.K) {
                PtrFrameLayout ptrFrameLayout = PtrFrameLayout.this;
                com.join.mgps.ptr.util.a.p(ptrFrameLayout.f53673c, "finish, currentPos:%s", Integer.valueOf(ptrFrameLayout.f53694x.d()));
            }
            f();
            PtrFrameLayout.this.x();
        }

        private void f() {
            this.f53701d = false;
            this.f53699b = 0;
            PtrFrameLayout.this.removeCallbacks(this);
        }

        public void a() {
            if (this.f53701d) {
                if (!this.f53700c.isFinished()) {
                    this.f53700c.forceFinished(true);
                }
                PtrFrameLayout.this.w();
                f();
            }
        }

        public void g(int i4, int i5) {
            if (PtrFrameLayout.this.f53694x.t(i4)) {
                return;
            }
            int d5 = PtrFrameLayout.this.f53694x.d();
            this.f53702e = d5;
            this.f53703f = i4;
            int i6 = i4 - d5;
            if (PtrFrameLayout.K) {
                com.join.mgps.ptr.util.a.c(PtrFrameLayout.this.f53673c, "tryToScrollTo: start: %s, distance:%s, to:%s", Integer.valueOf(d5), Integer.valueOf(i6), Integer.valueOf(i4));
            }
            PtrFrameLayout.this.removeCallbacks(this);
            this.f53699b = 0;
            if (!this.f53700c.isFinished()) {
                this.f53700c.forceFinished(true);
            }
            this.f53700c.startScroll(0, 0, 0, i6, i5);
            PtrFrameLayout.this.post(this);
            this.f53701d = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z4 = !this.f53700c.computeScrollOffset() || this.f53700c.isFinished();
            int currY = this.f53700c.getCurrY();
            int i4 = currY - this.f53699b;
            if (PtrFrameLayout.K && i4 != 0) {
                com.join.mgps.ptr.util.a.p(PtrFrameLayout.this.f53673c, "scroll: %s, start: %s, to: %s, currentPos: %s, current :%s, last: %s, delta: %s", Boolean.valueOf(z4), Integer.valueOf(this.f53702e), Integer.valueOf(this.f53703f), Integer.valueOf(PtrFrameLayout.this.f53694x.d()), Integer.valueOf(currY), Integer.valueOf(this.f53699b), Integer.valueOf(i4));
            }
            if (!z4) {
                this.f53699b = currY;
                PtrFrameLayout.this.t(i4);
                PtrFrameLayout.this.post(this);
                return;
            }
            e();
        }
    }

    public PtrFrameLayout(Context context) {
        this(context, null);
    }

    private void A() {
        this.f53693w = System.currentTimeMillis();
        if (this.f53682l.j()) {
            this.f53682l.e(this);
            if (K) {
                com.join.mgps.ptr.util.a.j(this.f53673c, "PtrUIHandler: onUIRefreshBegin");
            }
        }
        com.join.mgps.ptr.b bVar = this.f53683m;
        if (bVar != null) {
            bVar.onRefreshBegin(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        this.f53672b = (byte) 4;
        if (this.f53684n.f53701d && l()) {
            if (K) {
                com.join.mgps.ptr.util.a.c(this.f53673c, "performRefreshComplete do nothing, scrolling: %s, auto refresh: %s", Boolean.valueOf(this.f53684n.f53701d), Integer.valueOf(this.f53688r));
                return;
            }
            return;
        }
        u(false);
    }

    private void E() {
        if (K) {
            com.join.mgps.ptr.util.a.a(this.f53673c, "send cancel event");
        }
        MotionEvent motionEvent = this.f53690t;
        if (motionEvent == null) {
            return;
        }
        k(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime() + ViewConfiguration.getLongPressTimeout(), 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
    }

    private void F() {
        if (K) {
            com.join.mgps.ptr.util.a.a(this.f53673c, "send down event");
        }
        MotionEvent motionEvent = this.f53690t;
        k(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 0, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
    }

    private void G() {
        if (this.f53694x.x()) {
            return;
        }
        this.f53684n.g(0, this.f53678h);
    }

    private void H() {
        G();
    }

    private void I() {
        G();
    }

    private void J() {
        G();
    }

    private boolean K() {
        byte b5 = this.f53672b;
        if ((b5 == 4 || b5 == 2) && this.f53694x.u()) {
            if (this.f53682l.j()) {
                this.f53682l.c(this);
                if (K) {
                    com.join.mgps.ptr.util.a.j(this.f53673c, "PtrUIHandler: onUIReset");
                }
            }
            this.f53672b = (byte) 1;
            i();
            return true;
        }
        return false;
    }

    private boolean L() {
        if (this.f53672b != 2) {
            return false;
        }
        if ((this.f53694x.v() && l()) || this.f53694x.w()) {
            this.f53672b = (byte) 3;
            A();
        }
        return false;
    }

    private void M(int i4) {
        if (i4 == 0) {
            return;
        }
        boolean x4 = this.f53694x.x();
        if (x4 && !this.f53695y && this.f53694x.s()) {
            this.f53695y = true;
            E();
        }
        if ((this.f53694x.p() && this.f53672b == 1) || (this.f53694x.n() && this.f53672b == 4 && m())) {
            this.f53672b = (byte) 2;
            this.f53682l.d(this);
            if (K) {
                com.join.mgps.ptr.util.a.l(this.f53673c, "PtrUIHandler: onUIRefreshPrepare, mFlag %s", Integer.valueOf(this.f53688r));
            }
        }
        if (this.f53694x.o()) {
            K();
            if (x4) {
                F();
            }
        }
        if (this.f53672b == 2) {
            if (x4 && !l() && this.f53680j && this.f53694x.b()) {
                L();
            }
            if (z() && this.f53694x.q()) {
                L();
            }
        }
        if (K) {
            com.join.mgps.ptr.util.a.p(this.f53673c, "updatePos: change: %s, current: %s last: %s, top: %s, headerHeight: %s", Integer.valueOf(i4), Integer.valueOf(this.f53694x.d()), Integer.valueOf(this.f53694x.g()), Integer.valueOf(this.f53674d.getTop()), Integer.valueOf(this.f53686p));
        }
        this.f53681k.offsetTopAndBottom(i4);
        if (!o()) {
            this.f53674d.offsetTopAndBottom(i4);
        }
        invalidate();
        if (this.f53682l.j()) {
            this.f53682l.b(this, x4, this.f53672b, this.f53694x);
        }
        v(x4, this.f53672b, this.f53694x);
    }

    private void i() {
        this.f53688r &= Q ^ (-1);
    }

    private void r() {
        int d5 = this.f53694x.d();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        View view = this.f53681k;
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int i4 = marginLayoutParams.leftMargin + paddingLeft;
            int i5 = ((marginLayoutParams.topMargin + paddingTop) + d5) - this.f53686p;
            int measuredWidth = this.f53681k.getMeasuredWidth() + i4;
            int measuredHeight = this.f53681k.getMeasuredHeight() + i5;
            this.f53681k.layout(i4, i5, measuredWidth, measuredHeight);
            if (K) {
                com.join.mgps.ptr.util.a.c(this.f53673c, "onLayout header: %s %s %s %s", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight));
            }
        }
        if (this.f53674d != null) {
            if (o()) {
                d5 = 0;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f53674d.getLayoutParams();
            int i6 = paddingLeft + marginLayoutParams2.leftMargin;
            int i7 = paddingTop + marginLayoutParams2.topMargin + d5;
            int measuredWidth2 = this.f53674d.getMeasuredWidth() + i6;
            int measuredHeight2 = this.f53674d.getMeasuredHeight() + i7;
            if (K) {
                com.join.mgps.ptr.util.a.c(this.f53673c, "onLayout content: %s %s %s %s", Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(measuredWidth2), Integer.valueOf(measuredHeight2));
            }
            this.f53674d.layout(i6, i7, measuredWidth2, measuredHeight2);
        }
    }

    private void s(View view, int i4, int i5) {
        if (view == null) {
            return;
        }
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i5, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin, marginLayoutParams.height));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(float f5) {
        int i4 = 0;
        if (f5 < 0.0f && this.f53694x.u()) {
            if (K) {
                com.join.mgps.ptr.util.a.d(this.f53673c, String.format("has reached the top", new Object[0]));
                return;
            }
            return;
        }
        int d5 = this.f53694x.d() + ((int) f5);
        if (!this.f53694x.M(d5)) {
            i4 = d5;
        } else if (K) {
            com.join.mgps.ptr.util.a.d(this.f53673c, String.format("over top", new Object[0]));
        }
        this.f53694x.E(i4);
        M(i4 - this.f53694x.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(boolean z4) {
        if (this.f53694x.r() && !z4 && this.f53691u != null) {
            if (K) {
                com.join.mgps.ptr.util.a.a(this.f53673c, "notifyUIRefreshComplete mRefreshCompleteHook run.");
            }
            this.f53691u.d();
            return;
        }
        if (this.f53682l.j()) {
            if (K) {
                com.join.mgps.ptr.util.a.j(this.f53673c, "PtrUIHandler: onUIRefreshComplete");
            }
            this.f53682l.a(this);
        }
        this.f53694x.B();
        I();
        K();
    }

    private void y(boolean z4) {
        L();
        byte b5 = this.f53672b;
        if (b5 != 3) {
            if (b5 == 4) {
                u(false);
            } else {
                H();
            }
        } else if (this.f53679i) {
            if (!this.f53694x.v() || z4) {
                return;
            }
            this.f53684n.g(this.f53694x.h(), this.f53677g);
        } else {
            J();
        }
    }

    private boolean z() {
        return (this.f53688r & Q) == N;
    }

    public final void C() {
        if (K) {
            com.join.mgps.ptr.util.a.j(this.f53673c, "refreshComplete");
        }
        e eVar = this.f53691u;
        if (eVar != null) {
            eVar.a();
        }
        int currentTimeMillis = (int) (this.f53692v - (System.currentTimeMillis() - this.f53693w));
        if (currentTimeMillis <= 0) {
            if (K) {
                com.join.mgps.ptr.util.a.a(this.f53673c, "performRefreshComplete at once");
            }
            B();
            return;
        }
        postDelayed(this.f53696z, currentTimeMillis);
        if (K) {
            com.join.mgps.ptr.util.a.c(this.f53673c, "performRefreshComplete after delay: %s", Integer.valueOf(currentTimeMillis));
        }
    }

    public void D(com.join.mgps.ptr.c cVar) {
        this.f53682l = d.k(this.f53682l, cVar);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof LayoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r0 != 3) goto L13;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.ptr.PtrFrameLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public void e(com.join.mgps.ptr.c cVar) {
        d.f(this.f53682l, cVar);
    }

    public void f() {
        h(true, this.f53678h);
    }

    public void g(boolean z4) {
        h(z4, this.f53678h);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public View getContentView() {
        return this.f53674d;
    }

    public float getDurationToClose() {
        return this.f53677g;
    }

    public long getDurationToCloseHeader() {
        return this.f53678h;
    }

    public int getHeaderHeight() {
        return this.f53686p;
    }

    public View getHeaderView() {
        return this.f53681k;
    }

    public int getOffsetToKeepHeaderWhileLoading() {
        return this.f53694x.h();
    }

    public int getOffsetToRefresh() {
        return this.f53694x.i();
    }

    public float getRatioOfHeaderToHeightRefresh() {
        return this.f53694x.l();
    }

    public float getResistance() {
        return this.f53694x.m();
    }

    public void h(boolean z4, int i4) {
        if (this.f53672b != 1) {
            return;
        }
        this.f53688r |= z4 ? M : N;
        this.f53672b = (byte) 2;
        if (this.f53682l.j()) {
            this.f53682l.d(this);
            if (K) {
                com.join.mgps.ptr.util.a.l(this.f53673c, "PtrUIHandler: onUIRefreshPrepare, mFlag %s", Integer.valueOf(this.f53688r));
            }
        }
        this.f53684n.g(this.f53694x.i(), i4);
        if (z4) {
            this.f53672b = (byte) 3;
            A();
        }
    }

    public void j(boolean z4) {
        this.f53687q = z4;
    }

    public boolean k(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean l() {
        return (this.f53688r & Q) > 0;
    }

    public boolean m() {
        return (this.f53688r & O) > 0;
    }

    public boolean n() {
        return this.f53679i;
    }

    public boolean o() {
        return (this.f53688r & P) > 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f53684n;
        if (cVar != null) {
            cVar.d();
        }
        Runnable runnable = this.f53696z;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        int childCount = getChildCount();
        if (childCount <= 2) {
            if (childCount == 2) {
                int i4 = this.f53675e;
                if (i4 != 0 && this.f53681k == null) {
                    this.f53681k = findViewById(i4);
                }
                int i5 = this.f53676f;
                if (i5 != 0 && this.f53674d == null) {
                    this.f53674d = findViewById(i5);
                }
                if (this.f53674d == null || this.f53681k == null) {
                    View childAt = getChildAt(0);
                    View childAt2 = getChildAt(1);
                    if (childAt instanceof com.join.mgps.ptr.c) {
                        this.f53681k = childAt;
                        this.f53674d = childAt2;
                    } else if (childAt2 instanceof com.join.mgps.ptr.c) {
                        this.f53681k = childAt2;
                        this.f53674d = childAt;
                    } else {
                        View view = this.f53674d;
                        if (view == null && this.f53681k == null) {
                            this.f53681k = childAt;
                            this.f53674d = childAt2;
                        } else {
                            View view2 = this.f53681k;
                            if (view2 == null) {
                                if (view == childAt) {
                                    childAt = childAt2;
                                }
                                this.f53681k = childAt;
                            } else {
                                if (view2 == childAt) {
                                    childAt = childAt2;
                                }
                                this.f53674d = childAt;
                            }
                        }
                    }
                }
            } else if (childCount == 1) {
                this.f53674d = getChildAt(0);
            } else {
                TextView textView = new TextView(getContext());
                textView.setClickable(true);
                textView.setTextColor(-39424);
                textView.setGravity(17);
                textView.setTextSize(20.0f);
                textView.setText("The content view in PtrFrameLayout is empty. Do you forget to specify its id in xml layout file?");
                this.f53674d = textView;
                addView(textView);
            }
            View view3 = this.f53681k;
            if (view3 != null) {
                view3.bringToFront();
            }
            super.onFinishInflate();
            return;
        }
        throw new IllegalStateException("PtrFrameLayout only can host 2 elements");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        r();
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (K) {
            com.join.mgps.ptr.util.a.c(this.f53673c, "onMeasure frame: width: %s, h eight: %s, padding: %s %s %s %s", Integer.valueOf(getMeasuredHeight()), Integer.valueOf(getMeasuredWidth()), Integer.valueOf(getPaddingLeft()), Integer.valueOf(getPaddingRight()), Integer.valueOf(getPaddingTop()), Integer.valueOf(getPaddingBottom()));
        }
        View view = this.f53681k;
        if (view != null) {
            measureChildWithMargins(view, i4, 0, i5, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f53681k.getLayoutParams();
            int measuredHeight = this.f53681k.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            this.f53686p = measuredHeight;
            this.f53694x.F(measuredHeight);
        }
        View view2 = this.f53674d;
        if (view2 != null) {
            s(view2, i4, i5);
            if (K) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f53674d.getLayoutParams();
                com.join.mgps.ptr.util.a.c(this.f53673c, "onMeasure content, width: %s, height: %s, margin: %s %s %s %s", Integer.valueOf(getMeasuredWidth()), Integer.valueOf(getMeasuredHeight()), Integer.valueOf(marginLayoutParams2.leftMargin), Integer.valueOf(marginLayoutParams2.topMargin), Integer.valueOf(marginLayoutParams2.rightMargin), Integer.valueOf(marginLayoutParams2.bottomMargin));
                com.join.mgps.ptr.util.a.c(this.f53673c, "onMeasure, currentPos: %s, lastPos: %s, top: %s", Integer.valueOf(this.f53694x.d()), Integer.valueOf(this.f53694x.g()), Integer.valueOf(this.f53674d.getTop()));
            }
        }
    }

    public boolean p() {
        return this.f53680j;
    }

    public boolean q() {
        return this.f53672b == 3;
    }

    public void setDurationToClose(int i4) {
        this.f53677g = i4;
    }

    public void setDurationToCloseHeader(int i4) {
        this.f53678h = i4;
    }

    public void setEnabledNextPtrAtOnce(boolean z4) {
        if (z4) {
            this.f53688r |= O;
        } else {
            this.f53688r &= O ^ (-1);
        }
    }

    public void setHeaderView(View view) {
        View view2 = this.f53681k;
        if (view2 != null && view != null && view2 != view) {
            removeView(view2);
        }
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new LayoutParams(-1, -2));
        }
        this.f53681k = view;
        addView(view);
    }

    @Deprecated
    public void setInterceptEventWhileWorking(boolean z4) {
    }

    public void setKeepHeaderWhenRefresh(boolean z4) {
        this.f53679i = z4;
    }

    public void setLoadingMinTime(int i4) {
        this.f53692v = i4;
    }

    public void setOffsetToKeepHeaderWhileLoading(int i4) {
        this.f53694x.H(i4);
    }

    public void setOffsetToRefresh(int i4) {
        this.f53694x.I(i4);
    }

    public void setPinContent(boolean z4) {
        if (z4) {
            this.f53688r |= P;
        } else {
            this.f53688r &= P ^ (-1);
        }
    }

    public void setPtrHandler(com.join.mgps.ptr.b bVar) {
        this.f53683m = bVar;
    }

    public void setPtrIndicator(com.join.mgps.ptr.indicator.a aVar) {
        com.join.mgps.ptr.indicator.a aVar2 = this.f53694x;
        if (aVar2 != null && aVar2 != aVar) {
            aVar.a(aVar2);
        }
        this.f53694x = aVar;
    }

    public void setPullToRefresh(boolean z4) {
        this.f53680j = z4;
    }

    public void setRatioOfHeaderHeightToRefresh(float f5) {
        this.f53694x.J(f5);
    }

    public void setRefreshCompleteHook(e eVar) {
        this.f53691u = eVar;
        eVar.c(new b());
    }

    public void setResistance(float f5) {
        this.f53694x.K(f5);
    }

    protected void v(boolean z4, byte b5, com.join.mgps.ptr.indicator.a aVar) {
    }

    protected void w() {
        if (this.f53694x.r() && l()) {
            if (K) {
                com.join.mgps.ptr.util.a.a(this.f53673c, "call onRelease after scroll abort");
            }
            y(true);
        }
    }

    protected void x() {
        if (this.f53694x.r() && l()) {
            if (K) {
                com.join.mgps.ptr.util.a.a(this.f53673c, "call onRelease after scroll finish");
            }
            y(true);
        }
    }

    public PtrFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public PtrFrameLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f53672b = (byte) 1;
        StringBuilder sb = new StringBuilder();
        sb.append("ptr-frame-");
        int i5 = L + 1;
        L = i5;
        sb.append(i5);
        this.f53673c = sb.toString();
        this.f53675e = 0;
        this.f53676f = 0;
        this.f53677g = 200;
        this.f53678h = StatFsHelper.f10899h;
        this.f53679i = true;
        this.f53680j = false;
        this.f53682l = d.h();
        this.f53687q = false;
        this.f53688r = 0;
        this.f53689s = false;
        this.f53692v = 500;
        this.f53693w = 0L;
        this.f53695y = false;
        this.f53696z = new a();
        this.f53694x = new com.join.mgps.ptr.indicator.a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PtrFrameLayout, 0, 0);
        if (obtainStyledAttributes != null) {
            this.f53675e = obtainStyledAttributes.getResourceId(3, this.f53675e);
            this.f53676f = obtainStyledAttributes.getResourceId(0, this.f53676f);
            com.join.mgps.ptr.indicator.a aVar = this.f53694x;
            aVar.K(obtainStyledAttributes.getFloat(8, aVar.m()));
            this.f53677g = obtainStyledAttributes.getInt(1, this.f53677g);
            this.f53678h = obtainStyledAttributes.getInt(2, this.f53678h);
            this.f53694x.J(obtainStyledAttributes.getFloat(7, this.f53694x.l()));
            this.f53679i = obtainStyledAttributes.getBoolean(5, this.f53679i);
            this.f53680j = obtainStyledAttributes.getBoolean(6, this.f53680j);
            this.A = obtainStyledAttributes.getInt(4, 0);
            obtainStyledAttributes.recycle();
        }
        this.f53684n = new c();
        this.f53685o = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2;
    }
}
