package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ExpandableListView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.v0;
import com.join.mgps.ptr.PtrFrameLayout;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes4.dex */
public class XExpandableListView extends ExpandableListView implements AbsListView.OnScrollListener {
    protected static final int A = 400;
    protected static final int B = 50;
    protected static final float C = 2.0f;

    /* renamed from: x  reason: collision with root package name */
    public static final String f48108x = "XListView";

    /* renamed from: y  reason: collision with root package name */
    protected static final int f48109y = 0;

    /* renamed from: z  reason: collision with root package name */
    protected static final int f48110z = 1;

    /* renamed from: b  reason: collision with root package name */
    protected float f48111b;

    /* renamed from: c  reason: collision with root package name */
    protected float f48112c;

    /* renamed from: d  reason: collision with root package name */
    protected Scroller f48113d;

    /* renamed from: e  reason: collision with root package name */
    protected AbsListView.OnScrollListener f48114e;

    /* renamed from: f  reason: collision with root package name */
    protected f f48115f;

    /* renamed from: g  reason: collision with root package name */
    protected g f48116g;

    /* renamed from: h  reason: collision with root package name */
    protected XListViewHeader f48117h;

    /* renamed from: i  reason: collision with root package name */
    protected RelativeLayout f48118i;

    /* renamed from: j  reason: collision with root package name */
    protected TextView f48119j;

    /* renamed from: k  reason: collision with root package name */
    protected int f48120k;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f48121l;

    /* renamed from: m  reason: collision with root package name */
    protected AtomicBoolean f48122m;

    /* renamed from: n  reason: collision with root package name */
    protected XListViewFooter f48123n;

    /* renamed from: o  reason: collision with root package name */
    protected boolean f48124o;

    /* renamed from: p  reason: collision with root package name */
    protected boolean f48125p;

    /* renamed from: q  reason: collision with root package name */
    protected boolean f48126q;

    /* renamed from: r  reason: collision with root package name */
    protected int f48127r;

    /* renamed from: s  reason: collision with root package name */
    protected int f48128s;

    /* renamed from: t  reason: collision with root package name */
    private int f48129t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f48130u;

    /* renamed from: v  reason: collision with root package name */
    private com.join.mgps.ptr.a f48131v;

    /* renamed from: w  reason: collision with root package name */
    private g f48132w;

    /* loaded from: classes4.dex */
    class a extends com.join.mgps.ptr.a {
        a() {
        }

        @Override // com.join.mgps.ptr.a, com.join.mgps.ptr.b
        public boolean checkCanDoRefresh(PtrFrameLayout ptrFrameLayout, View view, View view2) {
            return com.join.mgps.ptr.a.checkContentCanBePulledDown(ptrFrameLayout, view, view2);
        }

        @Override // com.join.mgps.ptr.b
        public void onRefreshBegin(PtrFrameLayout ptrFrameLayout) {
            v0.g("onRefreshBegin----------");
            XExpandableListView.this.q();
            if (XExpandableListView.this.f48132w != null) {
                XExpandableListView.this.f48132w.onRefresh();
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            XExpandableListView xExpandableListView = XExpandableListView.this;
            xExpandableListView.f48125p = true;
            xExpandableListView.f48123n.setState(2);
            f fVar = XExpandableListView.this.f48115f;
            if (fVar != null) {
                fVar.onLoadMore();
            }
        }
    }

    public XExpandableListView(Context context) {
        super(context);
        this.f48111b = -1.0f;
        this.f48112c = -1.0f;
        this.f48121l = true;
        this.f48122m = new AtomicBoolean(false);
        this.f48126q = false;
        this.f48129t = 0;
        this.f48130u = false;
        this.f48131v = new a();
        f(context);
        setFriction(ViewConfiguration.getScrollFriction() * 2.0f);
        setFastScrollEnabled(false);
    }

    public void c() {
        this.f48124o = false;
        this.f48123n.a();
        this.f48123n.setOnClickListener(null);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f48113d.computeScrollOffset()) {
            if (this.f48128s != 0) {
                this.f48123n.setBottomMargin(this.f48113d.getCurrY());
            }
            postInvalidate();
            g();
        }
        super.computeScroll();
    }

    public void d() {
        this.f48121l = false;
        this.f48118i.setVisibility(4);
    }

    public void e() {
        this.f48124o = false;
        this.f48123n.a();
    }

    protected void f(Context context) {
        this.f48113d = new Scroller(context, new DecelerateInterpolator());
        super.setOnScrollListener(this);
        XListViewHeader xListViewHeader = new XListViewHeader(context);
        this.f48117h = xListViewHeader;
        this.f48118i = (RelativeLayout) xListViewHeader.findViewById(R.id.xlistview_header_content);
        this.f48119j = (TextView) this.f48117h.findViewById(R.id.xlistview_header_time);
        this.f48123n = new XListViewFooter(context);
        c();
        d();
        addFooterView(this.f48123n);
    }

    protected void g() {
        AbsListView.OnScrollListener onScrollListener = this.f48114e;
        if (onScrollListener instanceof h) {
            ((h) onScrollListener).a(this);
        }
    }

    public boolean h() {
        return this.f48122m.get();
    }

    public void i() {
        if (!com.join.android.app.common.utils.j.j(getContext()) || this.f48122m.get() || !this.f48124o || this.f48125p || getLastVisiblePosition() < this.f48127r - this.f48129t) {
            return;
        }
        this.f48125p = true;
        this.f48123n.setState(2);
        f fVar = this.f48115f;
        if (fVar != null) {
            fVar.onLoadMore();
        }
    }

    public void j() {
        this.f48124o = true;
        this.f48121l = true;
        this.f48123n.setState(0);
    }

    protected void k() {
        int bottomMargin = this.f48123n.getBottomMargin();
        if (bottomMargin > 0) {
            this.f48128s = 1;
            this.f48113d.startScroll(0, bottomMargin, 0, -bottomMargin, 400);
            invalidate();
        }
    }

    protected void l() {
        int visibleHeight = this.f48117h.getVisibleHeight();
        if (visibleHeight == 0) {
            return;
        }
        if (!this.f48122m.get() || visibleHeight > this.f48120k) {
            int i4 = (!this.f48122m.get() || visibleHeight <= (i4 = this.f48120k)) ? 0 : 0;
            StringBuilder sb = new StringBuilder();
            sb.append("resetHeaderHeight-->");
            int i5 = i4 - visibleHeight;
            sb.append(i5);
            this.f48128s = 0;
            this.f48113d.startScroll(0, visibleHeight, 0, i5, 400);
            invalidate();
        }
    }

    protected void m(int i4) {
        int visibleHeight = this.f48117h.getVisibleHeight();
        if (visibleHeight == 0) {
            return;
        }
        if (!this.f48122m.get() || visibleHeight > this.f48120k) {
            int i5 = (!this.f48122m.get() || visibleHeight <= (i5 = this.f48120k)) ? 0 : 0;
            this.f48128s = 0;
            StringBuilder sb = new StringBuilder();
            sb.append("resetHeaderHeight-->");
            int i6 = i5 - visibleHeight;
            sb.append(i6);
            this.f48113d.startScroll(0, visibleHeight, 0, i6 + 100, 400);
            invalidate();
        }
    }

    public void n() {
        if (getParent() == null || !(getParent() instanceof PtrFrameLayout)) {
            return;
        }
        ((PtrFrameLayout) getParent()).f();
    }

    public void o() {
        this.f48124o = true;
        this.f48123n.f();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        StringBuilder sb = new StringBuilder();
        sb.append("onScroll  ");
        sb.append(i4);
        sb.append(" visibleItemCount ");
        sb.append(i5);
        sb.append(" totalItemCount ");
        sb.append(i6);
        sb.append(";mPullRefreshing=");
        sb.append(this.f48122m.get());
        sb.append(";mPullLoading=");
        sb.append(this.f48125p);
        this.f48127r = i6;
        AbsListView.OnScrollListener onScrollListener = this.f48114e;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i4, i5, i6);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append("scrollStateChanged");
        sb.append(i4);
        int firstVisiblePosition = absListView.getFirstVisiblePosition();
        int childCount = absListView.getChildCount();
        if (i4 == 0 || firstVisiblePosition + childCount > this.f48127r) {
            i();
        }
        AbsListView.OnScrollListener onScrollListener = this.f48114e;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i4);
        }
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f48111b == -1.0f) {
            this.f48111b = motionEvent.getRawY();
        }
        if (this.f48112c == -1.0f) {
            this.f48112c = motionEvent.getRawX();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f48111b = motionEvent.getRawY();
            this.f48112c = motionEvent.getRawX();
        } else if (action != 2) {
            this.f48111b = -1.0f;
            if (getLastVisiblePosition() == this.f48127r - 1) {
                p();
                k();
            }
        } else {
            float rawY = motionEvent.getRawY() - this.f48111b;
            this.f48111b = motionEvent.getRawY();
            StringBuilder sb = new StringBuilder();
            sb.append("onTouchEvent  LastVisiblePosition ");
            sb.append(getLastVisiblePosition());
            sb.append(" mTotalItemCount ");
            sb.append(this.f48127r);
            sb.append(";mPullLoading=");
            sb.append(this.f48125p);
            sb.append(";mEnablePullLoad=");
            sb.append(this.f48124o);
            if (getLastVisiblePosition() == this.f48127r - 1 && ((this.f48123n.getBottomMargin() > 0 || rawY < 0.0f) && !this.f48125p)) {
                if (this.f48124o) {
                    t((-rawY) / 2.0f);
                }
            } else if (this.f48129t != 0) {
                i();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    protected void p() {
        if (!this.f48124o || this.f48123n.getBottomMargin() <= 50 || this.f48125p) {
            return;
        }
        this.f48125p = true;
        this.f48123n.setState(2);
        f fVar = this.f48115f;
        if (fVar != null) {
            fVar.onLoadMore();
        }
    }

    protected void q() {
        if (this.f48130u) {
            this.f48124o = true;
            this.f48123n.f();
            this.f48123n.setState(0);
        }
    }

    public void r() {
        if (this.f48125p && this.f48124o) {
            this.f48125p = false;
            this.f48123n.setState(0);
        }
    }

    public void s() {
        if (getParent() == null || !(getParent() instanceof PtrFrameLayout)) {
            return;
        }
        ((PtrFrameLayout) getParent()).C();
    }

    public void setNoMore() {
        r();
        this.f48123n.f();
        this.f48123n.setState(3);
        this.f48124o = false;
        this.f48123n.setOnClickListener(null);
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.f48114e = onScrollListener;
    }

    public void setPreLoadCount(int i4) {
        this.f48129t = i4;
    }

    public void setPullLoadEnable(f fVar) {
        this.f48124o = true;
        this.f48130u = true;
        this.f48115f = fVar;
        this.f48125p = false;
        this.f48123n.f();
        this.f48123n.setState(0);
        this.f48123n.setOnClickListener(new b());
    }

    public void setPullRefreshEnable(g gVar) {
        this.f48132w = gVar;
        if (getParent() == null || !(getParent() instanceof PtrFrameLayout)) {
            return;
        }
        ((PtrFrameLayout) getParent()).setPtrHandler(this.f48131v);
    }

    protected void t(float f5) {
        int bottomMargin = this.f48123n.getBottomMargin() + ((int) f5);
        if (this.f48124o && !this.f48125p) {
            if (bottomMargin > 50) {
                this.f48123n.setState(1);
            } else {
                this.f48123n.setState(0);
            }
        }
        this.f48123n.setBottomMargin(bottomMargin);
    }

    protected void u(float f5) {
        XListViewHeader xListViewHeader = this.f48117h;
        xListViewHeader.setVisibleHeight(((int) f5) + xListViewHeader.getVisibleHeight());
        if (this.f48121l && !this.f48122m.get()) {
            if (this.f48117h.getVisibleHeight() > this.f48120k) {
                this.f48117h.setState(1);
            } else {
                this.f48117h.setState(0);
            }
        }
        setSelection(0);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
    }

    public XExpandableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48111b = -1.0f;
        this.f48112c = -1.0f;
        this.f48121l = true;
        this.f48122m = new AtomicBoolean(false);
        this.f48126q = false;
        this.f48129t = 0;
        this.f48130u = false;
        this.f48131v = new a();
        f(context);
    }

    public XExpandableListView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f48111b = -1.0f;
        this.f48112c = -1.0f;
        this.f48121l = true;
        this.f48122m = new AtomicBoolean(false);
        this.f48126q = false;
        this.f48129t = 0;
        this.f48130u = false;
        this.f48131v = new a();
        f(context);
    }
}
