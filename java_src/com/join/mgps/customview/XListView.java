package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes4.dex */
public class XListView extends ListView implements AbsListView.OnScrollListener {
    protected static final float A = 2.0f;

    /* renamed from: v  reason: collision with root package name */
    public static final String f48135v = "XListView";

    /* renamed from: w  reason: collision with root package name */
    protected static final int f48136w = 0;

    /* renamed from: x  reason: collision with root package name */
    protected static final int f48137x = 1;

    /* renamed from: y  reason: collision with root package name */
    protected static final int f48138y = 400;

    /* renamed from: z  reason: collision with root package name */
    protected static final int f48139z = 50;

    /* renamed from: b  reason: collision with root package name */
    protected float f48140b;

    /* renamed from: c  reason: collision with root package name */
    protected float f48141c;

    /* renamed from: d  reason: collision with root package name */
    protected Scroller f48142d;

    /* renamed from: e  reason: collision with root package name */
    protected AbsListView.OnScrollListener f48143e;

    /* renamed from: f  reason: collision with root package name */
    protected f f48144f;

    /* renamed from: g  reason: collision with root package name */
    protected g f48145g;

    /* renamed from: h  reason: collision with root package name */
    protected XListViewHeader f48146h;

    /* renamed from: i  reason: collision with root package name */
    protected RelativeLayout f48147i;

    /* renamed from: j  reason: collision with root package name */
    protected TextView f48148j;

    /* renamed from: k  reason: collision with root package name */
    protected int f48149k;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f48150l;

    /* renamed from: m  reason: collision with root package name */
    protected AtomicBoolean f48151m;

    /* renamed from: n  reason: collision with root package name */
    protected XListViewFooter f48152n;

    /* renamed from: o  reason: collision with root package name */
    protected boolean f48153o;

    /* renamed from: p  reason: collision with root package name */
    protected boolean f48154p;

    /* renamed from: q  reason: collision with root package name */
    protected boolean f48155q;

    /* renamed from: r  reason: collision with root package name */
    protected int f48156r;

    /* renamed from: s  reason: collision with root package name */
    protected int f48157s;

    /* renamed from: t  reason: collision with root package name */
    private int f48158t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f48159u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            XListView xListView = XListView.this;
            xListView.f48149k = xListView.f48147i.getHeight();
            XListView.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            XListView xListView = XListView.this;
            xListView.f48154p = true;
            xListView.f48152n.setState(2);
            f fVar = XListView.this.f48144f;
            if (fVar != null) {
                fVar.onLoadMore();
            }
        }
    }

    public XListView(Context context) {
        super(context);
        this.f48140b = -1.0f;
        this.f48141c = -1.0f;
        this.f48150l = true;
        this.f48151m = new AtomicBoolean(false);
        this.f48155q = false;
        this.f48158t = 0;
        this.f48159u = false;
        e(context);
        setFriction(ViewConfiguration.getScrollFriction() * 2.0f);
        setFastScrollEnabled(false);
    }

    private void h() {
        if (!com.join.android.app.common.utils.j.j(getContext()) || this.f48151m.get() || !this.f48153o || this.f48154p || getLastVisiblePosition() < this.f48156r - this.f48158t) {
            return;
        }
        this.f48154p = true;
        this.f48152n.setState(2);
        f fVar = this.f48144f;
        if (fVar != null) {
            fVar.onLoadMore();
        }
    }

    public void b() {
        this.f48153o = false;
        this.f48152n.a();
        this.f48152n.setOnClickListener(null);
    }

    public void c() {
        this.f48150l = false;
        this.f48147i.setVisibility(4);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f48142d.computeScrollOffset()) {
            if (this.f48157s == 0) {
                this.f48146h.setVisibleHeight(this.f48142d.getCurrY());
            } else {
                this.f48152n.setBottomMargin(this.f48142d.getCurrY());
            }
            postInvalidate();
            f();
        }
        super.computeScroll();
    }

    public void d() {
        this.f48153o = false;
        this.f48152n.a();
    }

    protected void e(Context context) {
        this.f48142d = new Scroller(context, new DecelerateInterpolator());
        super.setOnScrollListener(this);
        XListViewHeader xListViewHeader = new XListViewHeader(context);
        this.f48146h = xListViewHeader;
        this.f48147i = (RelativeLayout) xListViewHeader.findViewById(R.id.xlistview_header_content);
        this.f48148j = (TextView) this.f48146h.findViewById(R.id.xlistview_header_time);
        addHeaderView(this.f48146h);
        this.f48152n = new XListViewFooter(context);
        this.f48146h.getViewTreeObserver().addOnGlobalLayoutListener(new a());
        b();
        c();
    }

    protected void f() {
        AbsListView.OnScrollListener onScrollListener = this.f48143e;
        if (onScrollListener instanceof h) {
            ((h) onScrollListener).a(this);
        }
    }

    public boolean g() {
        return this.f48151m.get();
    }

    public void i() {
        this.f48153o = true;
        this.f48150l = true;
        this.f48152n.setState(0);
    }

    protected void j() {
        int bottomMargin = this.f48152n.getBottomMargin();
        if (bottomMargin > 0) {
            this.f48157s = 1;
            this.f48142d.startScroll(0, bottomMargin, 0, -bottomMargin, 400);
            invalidate();
        }
    }

    protected void k() {
        int visibleHeight = this.f48146h.getVisibleHeight();
        if (visibleHeight == 0) {
            return;
        }
        if (!this.f48151m.get() || visibleHeight > this.f48149k) {
            int i4 = (!this.f48151m.get() || visibleHeight <= (i4 = this.f48149k)) ? 0 : 0;
            StringBuilder sb = new StringBuilder();
            sb.append("resetHeaderHeight-->");
            int i5 = i4 - visibleHeight;
            sb.append(i5);
            this.f48157s = 0;
            this.f48142d.startScroll(0, visibleHeight, 0, i5, 400);
            invalidate();
        }
    }

    protected void l(int i4) {
        int visibleHeight = this.f48146h.getVisibleHeight();
        if (visibleHeight == 0) {
            return;
        }
        if (!this.f48151m.get() || visibleHeight > this.f48149k) {
            int i5 = (!this.f48151m.get() || visibleHeight <= (i5 = this.f48149k)) ? 0 : 0;
            this.f48157s = 0;
            StringBuilder sb = new StringBuilder();
            sb.append("resetHeaderHeight-->");
            int i6 = i5 - visibleHeight;
            sb.append(i6);
            this.f48142d.startScroll(0, visibleHeight, 0, i6 + 100, 400);
            invalidate();
        }
    }

    public void m() {
        this.f48151m.set(true);
        this.f48146h.setState(2);
        t(this.f48149k);
        k();
    }

    public void n() {
        this.f48153o = true;
        this.f48152n.setState(1);
        this.f48152n.f();
    }

    protected void o() {
        if (!this.f48153o || this.f48152n.getBottomMargin() <= 50 || this.f48154p) {
            return;
        }
        this.f48154p = true;
        this.f48152n.setState(2);
        f fVar = this.f48144f;
        if (fVar != null) {
            fVar.onLoadMore();
        }
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        try {
            super.onLayout(z4, i4, i5, i6, i7);
            if (this.f48155q || getAdapter() == null || getLastVisiblePosition() == getAdapter().getCount() - 1) {
                return;
            }
            this.f48155q = true;
            addFooterView(this.f48152n);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f48156r = i6;
        AbsListView.OnScrollListener onScrollListener = this.f48143e;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i4, i5, i6);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        int firstVisiblePosition = absListView.getFirstVisiblePosition();
        int childCount = absListView.getChildCount();
        if (i4 == 0 || firstVisiblePosition + childCount > this.f48156r) {
            h();
        }
        AbsListView.OnScrollListener onScrollListener = this.f48143e;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i4);
        }
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f48140b == -1.0f) {
            this.f48140b = motionEvent.getRawY();
        }
        if (this.f48141c == -1.0f) {
            this.f48141c = motionEvent.getRawX();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f48140b = motionEvent.getRawY();
            this.f48141c = motionEvent.getRawX();
        } else if (action != 2) {
            this.f48140b = -1.0f;
            if (getFirstVisiblePosition() == 0) {
                if (!this.f48151m.get() && this.f48150l) {
                    p();
                    k();
                }
            } else if (getLastVisiblePosition() == this.f48156r - 1) {
                o();
                j();
            }
        } else {
            float rawY = motionEvent.getRawY() - this.f48140b;
            this.f48140b = motionEvent.getRawY();
            StringBuilder sb = new StringBuilder();
            sb.append("onTouchEvent  LastVisiblePosition ");
            sb.append(getLastVisiblePosition());
            sb.append(" mTotalItemCount ");
            sb.append(this.f48156r);
            sb.append(";mPullLoading=");
            sb.append(this.f48154p);
            sb.append(";mEnablePullLoad=");
            sb.append(this.f48153o);
            if (getFirstVisiblePosition() == 0 && ((this.f48146h.getVisibleHeight() > 0 || rawY > 0.0f) && !this.f48151m.get())) {
                if (this.f48150l && !this.f48151m.get()) {
                    t(rawY / 2.0f);
                    f();
                }
            } else if (getLastVisiblePosition() == this.f48156r - 1 && ((this.f48152n.getBottomMargin() > 0 || rawY < 0.0f) && !this.f48154p)) {
                if (this.f48153o) {
                    s((-rawY) / 2.0f);
                }
            } else if (this.f48158t != 0) {
                h();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    protected void p() {
        if (!this.f48150l || this.f48146h.getVisibleHeight() <= this.f48149k || this.f48151m.get()) {
            return;
        }
        this.f48151m.set(true);
        this.f48146h.setState(2);
        g gVar = this.f48145g;
        if (gVar != null) {
            gVar.onRefresh();
        }
        if (this.f48159u) {
            this.f48153o = true;
            this.f48152n.f();
            this.f48152n.setState(0);
        }
    }

    public void q() {
        if (this.f48154p && this.f48153o) {
            this.f48154p = false;
            this.f48152n.setState(0);
        }
    }

    public void r() {
        if (this.f48151m.get()) {
            this.f48151m.set(false);
            k();
        }
    }

    protected void s(float f5) {
        int bottomMargin = this.f48152n.getBottomMargin() + ((int) f5);
        if (this.f48153o && !this.f48154p) {
            if (bottomMargin > 50) {
                this.f48152n.setState(1);
            } else {
                this.f48152n.setState(0);
            }
        }
        this.f48152n.setBottomMargin(bottomMargin);
    }

    public void setNoMore() {
        q();
        this.f48152n.f();
        this.f48152n.setState(3);
        this.f48153o = false;
        this.f48152n.setOnClickListener(null);
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.f48143e = onScrollListener;
    }

    public void setPreLoadCount(int i4) {
        this.f48158t = i4;
    }

    public void setPullLoadEnable(f fVar) {
        this.f48153o = true;
        this.f48159u = true;
        this.f48144f = fVar;
        this.f48154p = false;
        this.f48152n.f();
        this.f48152n.setState(0);
        this.f48152n.setOnClickListener(new b());
    }

    public void setPullRefreshEnable(g gVar) {
        this.f48150l = true;
        this.f48147i.setVisibility(0);
        this.f48145g = gVar;
    }

    protected void t(float f5) {
        XListViewHeader xListViewHeader = this.f48146h;
        xListViewHeader.setVisibleHeight(((int) f5) + xListViewHeader.getVisibleHeight());
        if (this.f48150l && !this.f48151m.get()) {
            if (this.f48146h.getVisibleHeight() > this.f48149k) {
                this.f48146h.setState(1);
            } else {
                this.f48146h.setState(0);
            }
        }
        setSelection(0);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
    }

    public XListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48140b = -1.0f;
        this.f48141c = -1.0f;
        this.f48150l = true;
        this.f48151m = new AtomicBoolean(false);
        this.f48155q = false;
        this.f48158t = 0;
        this.f48159u = false;
        e(context);
    }

    public XListView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f48140b = -1.0f;
        this.f48141c = -1.0f;
        this.f48150l = true;
        this.f48151m = new AtomicBoolean(false);
        this.f48155q = false;
        this.f48158t = 0;
        this.f48159u = false;
        e(context);
    }
}
