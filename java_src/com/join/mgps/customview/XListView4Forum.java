package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.w0;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes4.dex */
public class XListView4Forum extends ListView implements AbsListView.OnScrollListener {
    protected static final int A = 400;
    protected static final int B = 50;
    protected static final float C = 2.0f;

    /* renamed from: x  reason: collision with root package name */
    public static final String f48222x = "XListView";

    /* renamed from: y  reason: collision with root package name */
    protected static final int f48223y = 0;

    /* renamed from: z  reason: collision with root package name */
    protected static final int f48224z = 1;

    /* renamed from: b  reason: collision with root package name */
    protected float f48225b;

    /* renamed from: c  reason: collision with root package name */
    protected float f48226c;

    /* renamed from: d  reason: collision with root package name */
    protected Scroller f48227d;

    /* renamed from: e  reason: collision with root package name */
    protected AbsListView.OnScrollListener f48228e;

    /* renamed from: f  reason: collision with root package name */
    protected f f48229f;

    /* renamed from: g  reason: collision with root package name */
    protected g f48230g;

    /* renamed from: h  reason: collision with root package name */
    protected XListViewHeader f48231h;

    /* renamed from: i  reason: collision with root package name */
    protected RelativeLayout f48232i;

    /* renamed from: j  reason: collision with root package name */
    protected TextView f48233j;

    /* renamed from: k  reason: collision with root package name */
    protected int f48234k;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f48235l;

    /* renamed from: m  reason: collision with root package name */
    protected AtomicBoolean f48236m;

    /* renamed from: n  reason: collision with root package name */
    protected XListViewFooter f48237n;

    /* renamed from: o  reason: collision with root package name */
    protected boolean f48238o;

    /* renamed from: p  reason: collision with root package name */
    protected boolean f48239p;

    /* renamed from: q  reason: collision with root package name */
    protected boolean f48240q;

    /* renamed from: r  reason: collision with root package name */
    protected int f48241r;

    /* renamed from: s  reason: collision with root package name */
    protected int f48242s;

    /* renamed from: t  reason: collision with root package name */
    private int f48243t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f48244u;

    /* renamed from: v  reason: collision with root package name */
    private ViewGroup f48245v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f48246w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            XListView4Forum xListView4Forum = XListView4Forum.this;
            xListView4Forum.f48234k = xListView4Forum.f48232i.getHeight();
            XListView4Forum.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            XListView4Forum xListView4Forum = XListView4Forum.this;
            xListView4Forum.f48239p = true;
            xListView4Forum.f48237n.setState(2);
            f fVar = XListView4Forum.this.f48229f;
            if (fVar != null) {
                fVar.onLoadMore();
            }
        }
    }

    public XListView4Forum(Context context) {
        super(context);
        this.f48225b = -1.0f;
        this.f48226c = -1.0f;
        this.f48235l = true;
        this.f48236m = new AtomicBoolean(false);
        this.f48240q = false;
        this.f48243t = 0;
        this.f48244u = false;
        this.f48246w = false;
        g(context);
    }

    private void setParentScrollAble(boolean z4) {
        ViewGroup viewGroup = this.f48245v;
        if (viewGroup != null) {
            viewGroup.requestDisallowInterceptTouchEvent(!z4);
        } else {
            getParent().requestDisallowInterceptTouchEvent(!z4);
        }
    }

    public void b() {
        this.f48246w = false;
    }

    public void c() {
        this.f48238o = false;
        this.f48237n.a();
        this.f48237n.setOnClickListener(null);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f48227d.computeScrollOffset()) {
            if (this.f48242s == 0) {
                this.f48231h.setVisibleHeight(this.f48227d.getCurrY());
            } else {
                this.f48237n.setBottomMargin(this.f48227d.getCurrY());
            }
            postInvalidate();
            h();
        }
        super.computeScroll();
    }

    public void d() {
        this.f48235l = false;
        this.f48232i.setVisibility(4);
    }

    public void e() {
        this.f48246w = true;
    }

    public void f() {
        this.f48238o = false;
        this.f48237n.a();
    }

    protected void g(Context context) {
        this.f48227d = new Scroller(context, new DecelerateInterpolator());
        super.setOnScrollListener(this);
        XListViewHeader xListViewHeader = new XListViewHeader(context);
        this.f48231h = xListViewHeader;
        this.f48232i = (RelativeLayout) xListViewHeader.findViewById(R.id.xlistview_header_content);
        this.f48233j = (TextView) this.f48231h.findViewById(R.id.xlistview_header_time);
        addHeaderView(this.f48231h);
        this.f48237n = new XListViewFooter(context);
        this.f48231h.getViewTreeObserver().addOnGlobalLayoutListener(new a());
        c();
        d();
    }

    protected void h() {
        AbsListView.OnScrollListener onScrollListener = this.f48228e;
        if (onScrollListener instanceof h) {
            ((h) onScrollListener).a(this);
        }
    }

    protected void i() {
        int bottomMargin = this.f48237n.getBottomMargin();
        if (bottomMargin > 0) {
            this.f48242s = 1;
            this.f48227d.startScroll(0, bottomMargin, 0, -bottomMargin, 400);
            invalidate();
        }
    }

    protected void j() {
        int visibleHeight = this.f48231h.getVisibleHeight();
        if (visibleHeight == 0) {
            return;
        }
        if (!this.f48236m.get() || visibleHeight > this.f48234k) {
            int i4 = (!this.f48236m.get() || visibleHeight <= (i4 = this.f48234k)) ? 0 : 0;
            StringBuilder sb = new StringBuilder();
            sb.append("resetHeaderHeight-->");
            int i5 = i4 - visibleHeight;
            sb.append(i5);
            this.f48242s = 0;
            this.f48227d.startScroll(0, visibleHeight, 0, i5, 400);
            invalidate();
        }
    }

    protected void k(int i4) {
        int visibleHeight = this.f48231h.getVisibleHeight();
        if (visibleHeight == 0) {
            return;
        }
        if (!this.f48236m.get() || visibleHeight > this.f48234k) {
            int i5 = (!this.f48236m.get() || visibleHeight <= (i5 = this.f48234k)) ? 0 : 0;
            this.f48242s = 0;
            StringBuilder sb = new StringBuilder();
            sb.append("resetHeaderHeight-->");
            int i6 = i5 - visibleHeight;
            sb.append(i6);
            this.f48227d.startScroll(0, visibleHeight, 0, i6 + 100, 400);
            invalidate();
        }
    }

    public void l() {
        this.f48236m.set(true);
        this.f48231h.setState(2);
        s(this.f48234k);
        j();
    }

    public void m() {
        this.f48238o = true;
        this.f48237n.f();
    }

    protected void n() {
        if (!this.f48238o || this.f48237n.getBottomMargin() <= 50 || this.f48239p) {
            return;
        }
        this.f48239p = true;
        this.f48237n.setState(2);
        f fVar = this.f48229f;
        if (fVar != null) {
            fVar.onLoadMore();
        }
    }

    protected void o() {
        if (!this.f48235l || this.f48231h.getVisibleHeight() <= this.f48234k || this.f48236m.get()) {
            return;
        }
        this.f48236m.set(true);
        this.f48231h.setState(2);
        if (this.f48230g != null) {
            this.f48230g.onRefresh();
        }
        if (this.f48244u) {
            this.f48238o = true;
            this.f48237n.f();
            this.f48237n.setState(0);
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f48245v == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        boolean z4 = this.f48246w;
        w0.e("XListView", "onInterceptTouchEvent", " disallowIntercept=" + z4);
        if (z4) {
            if (motionEvent.getAction() == 0) {
                w0.e("XListView", "onInterceptTouchEvent", " ACTION_DOWN");
                setParentScrollAble(false);
            } else if (motionEvent.getAction() == 1) {
                w0.e("XListView", "onInterceptTouchEvent", " ACTION_UP");
                setParentScrollAble(true);
            } else if (motionEvent.getAction() == 2) {
                w0.e("XListView", "onInterceptTouchEvent", " ACTION_MOVE");
            } else if (motionEvent.getAction() == 3) {
                w0.e("XListView", "onInterceptTouchEvent", " ACTION_CANCEL");
                setParentScrollAble(true);
            }
        } else {
            setParentScrollAble(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        if (this.f48240q || getAdapter() == null || getLastVisiblePosition() == getAdapter().getCount() - 1) {
            return;
        }
        this.f48240q = true;
        addFooterView(this.f48237n);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        StringBuilder sb = new StringBuilder();
        sb.append("onScroll firstVisibleItem ");
        sb.append(i4);
        sb.append(" visibleItemCount ");
        sb.append(i5);
        sb.append(" totalItemCount ");
        sb.append(i6);
        this.f48241r = i6;
        AbsListView.OnScrollListener onScrollListener = this.f48228e;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i4, i5, i6);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        AbsListView.OnScrollListener onScrollListener = this.f48228e;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i4);
        }
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewGroup viewGroup;
        if (this.f48225b == -1.0f) {
            this.f48225b = motionEvent.getRawY();
        }
        if (this.f48226c == -1.0f) {
            this.f48226c = motionEvent.getRawX();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f48225b = motionEvent.getRawY();
            this.f48226c = motionEvent.getRawX();
        } else if (action != 1) {
            if (action != 2) {
                this.f48225b = -1.0f;
                if (getFirstVisiblePosition() == 0) {
                    if (!this.f48236m.get()) {
                        o();
                        j();
                    }
                } else if (getLastVisiblePosition() == this.f48241r - 1) {
                    n();
                    i();
                }
            } else {
                float rawY = motionEvent.getRawY() - this.f48225b;
                this.f48225b = motionEvent.getRawY();
                StringBuilder sb = new StringBuilder();
                sb.append("onTouchEvent  LastVisiblePosition ");
                sb.append(getLastVisiblePosition());
                sb.append(" mTotalItemCount ");
                sb.append(this.f48241r);
                if (getFirstVisiblePosition() == 0 && ((this.f48231h.getVisibleHeight() > 0 || rawY > 0.0f) && !this.f48236m.get())) {
                    if (this.f48235l && !this.f48236m.get()) {
                        s(rawY / 2.0f);
                        h();
                    }
                } else if (getLastVisiblePosition() == this.f48241r - 1 && ((this.f48237n.getBottomMargin() > 0 || rawY < 0.0f) && !this.f48239p)) {
                    if (this.f48238o) {
                        r((-rawY) / 2.0f);
                    }
                } else if (this.f48243t != 0 && !this.f48236m.get() && this.f48238o && !this.f48239p && getLastVisiblePosition() >= this.f48241r - this.f48243t) {
                    this.f48239p = true;
                    this.f48237n.setState(2);
                    f fVar = this.f48229f;
                    if (fVar != null) {
                        fVar.onLoadMore();
                    }
                }
                float rawX = motionEvent.getRawX() - this.f48226c;
                this.f48226c = motionEvent.getRawX();
                w0.e("XListView", "deltaY=" + rawY + " deltaX=" + rawX);
                if (Math.abs(rawY) >= Math.abs(rawX) || (viewGroup = this.f48245v) != null) {
                    if (rawY > 0.0f) {
                        if (getFirstVisiblePosition() == 0) {
                            w0.e("XListView", "SCROLL DOWN -- ParentScrollAble=true");
                            setParentScrollAble(true);
                        } else {
                            w0.e("XListView", "SCROLL DOWN -- ParentScrollAble=false");
                            setParentScrollAble(false);
                        }
                    } else if (rawY < 0.0f) {
                        w0.e("XListView", "SCROLL UP");
                        if (getLastVisiblePosition() == this.f48241r - 1) {
                            w0.e("XListView", "SCROLL UP -- ParentScrollAble=true");
                            setParentScrollAble(true);
                        } else {
                            w0.e("XListView", "SCROLL UP -- ParentScrollAble=false");
                            setParentScrollAble(false);
                        }
                    }
                } else if (viewGroup == null) {
                    w0.e("XListView", "SCROLL HORIZONTAL");
                    if (this.f48246w) {
                        setParentScrollAble(false);
                    } else {
                        setParentScrollAble(true);
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void p() {
        if (this.f48239p && this.f48238o) {
            this.f48239p = false;
            this.f48237n.setState(0);
        }
    }

    public void q() {
        if (this.f48236m.get()) {
            this.f48236m.set(false);
            j();
        }
    }

    protected void r(float f5) {
        int bottomMargin = this.f48237n.getBottomMargin() + ((int) f5);
        if (this.f48238o && !this.f48239p) {
            if (bottomMargin > 50) {
                this.f48237n.setState(1);
            } else {
                this.f48237n.setState(0);
            }
        }
        this.f48237n.setBottomMargin(bottomMargin);
    }

    protected void s(float f5) {
        XListViewHeader xListViewHeader = this.f48231h;
        xListViewHeader.setVisibleHeight(((int) f5) + xListViewHeader.getVisibleHeight());
        if (this.f48235l && !this.f48236m.get()) {
            if (this.f48231h.getVisibleHeight() > this.f48234k) {
                this.f48231h.setState(1);
            } else {
                this.f48231h.setState(0);
            }
        }
        setSelection(0);
    }

    public void setNoMore() {
        p();
        this.f48237n.f();
        this.f48237n.setState(3);
        this.f48238o = false;
        this.f48237n.setOnClickListener(null);
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.f48228e = onScrollListener;
    }

    public void setParentIntercepView(ViewGroup viewGroup) {
        this.f48245v = viewGroup;
    }

    public void setPreLoadCount(int i4) {
        this.f48243t = i4;
    }

    public void setPullLoadEnable(f fVar) {
        this.f48238o = true;
        this.f48244u = true;
        this.f48229f = fVar;
        this.f48239p = false;
        this.f48237n.f();
        this.f48237n.setState(0);
        this.f48237n.setOnClickListener(new b());
    }

    public void setPullRefreshEnable(g gVar) {
        this.f48235l = true;
        this.f48232i.setVisibility(0);
        this.f48230g = gVar;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
    }

    public XListView4Forum(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48225b = -1.0f;
        this.f48226c = -1.0f;
        this.f48235l = true;
        this.f48236m = new AtomicBoolean(false);
        this.f48240q = false;
        this.f48243t = 0;
        this.f48244u = false;
        this.f48246w = false;
        g(context);
    }

    public XListView4Forum(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f48225b = -1.0f;
        this.f48226c = -1.0f;
        this.f48235l = true;
        this.f48236m = new AtomicBoolean(false);
        this.f48240q = false;
        this.f48243t = 0;
        this.f48244u = false;
        this.f48246w = false;
        g(context);
    }
}
