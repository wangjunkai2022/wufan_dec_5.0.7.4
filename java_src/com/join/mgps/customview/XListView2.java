package com.join.mgps.customview;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.join.android.app.component.xrecyclerview.AppBarStateChangeListener;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.v0;
import com.join.mgps.Util.w0;
import com.join.mgps.ptr.PtrFrameLayout;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes4.dex */
public class XListView2 extends ListView implements AbsListView.OnScrollListener {
    public static final String A = "XListView";
    protected static final int B = 0;
    protected static final int C = 1;
    protected static final int D = 400;
    protected static final int E = 50;
    protected static final float F = 2.0f;

    /* renamed from: b  reason: collision with root package name */
    protected float f48162b;

    /* renamed from: c  reason: collision with root package name */
    protected float f48163c;

    /* renamed from: d  reason: collision with root package name */
    protected Scroller f48164d;

    /* renamed from: e  reason: collision with root package name */
    protected AbsListView.OnScrollListener f48165e;

    /* renamed from: f  reason: collision with root package name */
    protected f f48166f;

    /* renamed from: g  reason: collision with root package name */
    protected g f48167g;

    /* renamed from: h  reason: collision with root package name */
    protected XListViewHeader f48168h;

    /* renamed from: i  reason: collision with root package name */
    protected RelativeLayout f48169i;

    /* renamed from: j  reason: collision with root package name */
    protected TextView f48170j;

    /* renamed from: k  reason: collision with root package name */
    protected int f48171k;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f48172l;

    /* renamed from: m  reason: collision with root package name */
    protected AtomicBoolean f48173m;

    /* renamed from: n  reason: collision with root package name */
    protected XListViewFooter f48174n;

    /* renamed from: o  reason: collision with root package name */
    protected boolean f48175o;

    /* renamed from: p  reason: collision with root package name */
    protected boolean f48176p;

    /* renamed from: q  reason: collision with root package name */
    protected boolean f48177q;

    /* renamed from: r  reason: collision with root package name */
    protected int f48178r;

    /* renamed from: s  reason: collision with root package name */
    protected int f48179s;

    /* renamed from: t  reason: collision with root package name */
    private int f48180t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f48181u;

    /* renamed from: v  reason: collision with root package name */
    private AppBarStateChangeListener.State f48182v;

    /* renamed from: w  reason: collision with root package name */
    DataSetObserver f48183w;

    /* renamed from: x  reason: collision with root package name */
    private com.join.mgps.ptr.a f48184x;

    /* renamed from: y  reason: collision with root package name */
    private g f48185y;

    /* renamed from: z  reason: collision with root package name */
    e f48186z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends DataSetObserver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ListAdapter f48187a;

        a(ListAdapter listAdapter) {
            this.f48187a = listAdapter;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ListAdapter listAdapter = this.f48187a;
            if (listAdapter == null || listAdapter.getCount() <= 20) {
                XListView2.this.k();
            }
        }
    }

    /* loaded from: classes4.dex */
    class b extends com.join.mgps.ptr.a {
        b() {
        }

        @Override // com.join.mgps.ptr.a, com.join.mgps.ptr.b
        public boolean checkCanDoRefresh(PtrFrameLayout ptrFrameLayout, View view, View view2) {
            return XListView2.this.d(ptrFrameLayout, view, view2);
        }

        @Override // com.join.mgps.ptr.b
        public void onRefreshBegin(PtrFrameLayout ptrFrameLayout) {
            v0.g("onRefreshBegin----------");
            XListView2.this.t();
            if (XListView2.this.f48185y != null) {
                XListView2.this.f48185y.onRefresh();
            }
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            XListView2 xListView2 = XListView2.this;
            xListView2.f48176p = true;
            xListView2.f48174n.setState(2);
            f fVar = XListView2.this.f48166f;
            if (fVar != null) {
                fVar.onLoadMore();
            }
        }
    }

    /* loaded from: classes4.dex */
    class d extends AppBarStateChangeListener {
        d() {
        }

        @Override // com.join.android.app.component.xrecyclerview.AppBarStateChangeListener
        public void onStateChanged(AppBarLayout appBarLayout, AppBarStateChangeListener.State state) {
            XListView2.this.f48182v = state;
        }
    }

    /* loaded from: classes4.dex */
    public interface e {
        void a(int i4, int i5, boolean z4, boolean z5);
    }

    public XListView2(Context context) {
        super(context);
        this.f48162b = -1.0f;
        this.f48163c = -1.0f;
        this.f48172l = true;
        this.f48173m = new AtomicBoolean(false);
        this.f48177q = false;
        this.f48180t = 0;
        this.f48181u = false;
        this.f48182v = AppBarStateChangeListener.State.EXPANDED;
        this.f48184x = new b();
        h(context);
        setFriction(ViewConfiguration.getScrollFriction() * 2.0f);
        setFastScrollEnabled(false);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f48164d.computeScrollOffset()) {
            if (this.f48179s != 0) {
                this.f48174n.setBottomMargin(this.f48164d.getCurrY());
            }
            postInvalidate();
            i();
        }
        super.computeScroll();
    }

    @Override // android.widget.AbsListView, android.view.View
    protected int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.widget.AbsListView, android.view.View
    protected int computeVerticalScrollOffset() {
        return super.computeVerticalScrollOffset();
    }

    public boolean d(PtrFrameLayout ptrFrameLayout, View view, View view2) {
        return this.f48182v == AppBarStateChangeListener.State.EXPANDED && com.join.mgps.ptr.a.checkContentCanBePulledDown(ptrFrameLayout, this, view2);
    }

    public void e() {
        this.f48175o = false;
        this.f48174n.a();
        this.f48174n.setOnClickListener(null);
    }

    public void f() {
        this.f48172l = false;
        this.f48169i.setVisibility(4);
    }

    public void g() {
        this.f48175o = false;
        this.f48174n.a();
    }

    protected void h(Context context) {
        this.f48164d = new Scroller(context, new DecelerateInterpolator());
        super.setOnScrollListener(this);
        XListViewHeader xListViewHeader = new XListViewHeader(context);
        this.f48168h = xListViewHeader;
        this.f48169i = (RelativeLayout) xListViewHeader.findViewById(R.id.xlistview_header_content);
        this.f48170j = (TextView) this.f48168h.findViewById(R.id.xlistview_header_time);
        this.f48174n = new XListViewFooter(context);
        e();
        f();
        addFooterView(this.f48174n);
    }

    protected void i() {
        AbsListView.OnScrollListener onScrollListener = this.f48165e;
        if (onScrollListener instanceof h) {
            ((h) onScrollListener).a(this);
        }
    }

    public boolean j() {
        return this.f48173m.get();
    }

    public synchronized void k() {
        if (com.join.android.app.common.utils.j.j(getContext()) && !this.f48173m.get() && this.f48175o && this.f48178r > 1 && !this.f48176p && getLastVisiblePosition() >= this.f48178r - this.f48180t) {
            w0.e("XListView", "do-preload");
            this.f48176p = true;
            this.f48174n.setState(2);
            f fVar = this.f48166f;
            if (fVar != null) {
                fVar.onLoadMore();
            }
        }
    }

    public void l() {
        this.f48175o = true;
        this.f48172l = true;
        this.f48174n.setState(0);
    }

    protected void m() {
        int bottomMargin = this.f48174n.getBottomMargin();
        if (bottomMargin > 0) {
            this.f48179s = 1;
            this.f48164d.startScroll(0, bottomMargin, 0, -bottomMargin, 400);
            invalidate();
        }
    }

    protected void n() {
        int visibleHeight = this.f48168h.getVisibleHeight();
        if (visibleHeight == 0) {
            return;
        }
        if (!this.f48173m.get() || visibleHeight > this.f48171k) {
            int i4 = (!this.f48173m.get() || visibleHeight <= (i4 = this.f48171k)) ? 0 : 0;
            StringBuilder sb = new StringBuilder();
            sb.append("resetHeaderHeight-->");
            int i5 = i4 - visibleHeight;
            sb.append(i5);
            this.f48179s = 0;
            this.f48164d.startScroll(0, visibleHeight, 0, i5, 400);
            invalidate();
        }
    }

    protected void o(int i4) {
        int visibleHeight = this.f48168h.getVisibleHeight();
        if (visibleHeight == 0) {
            return;
        }
        if (!this.f48173m.get() || visibleHeight > this.f48171k) {
            int i5 = (!this.f48173m.get() || visibleHeight <= (i5 = this.f48171k)) ? 0 : 0;
            this.f48179s = 0;
            StringBuilder sb = new StringBuilder();
            sb.append("resetHeaderHeight-->");
            int i6 = i5 - visibleHeight;
            sb.append(i6);
            this.f48164d.startScroll(0, visibleHeight, 0, i6 + 100, 400);
            invalidate();
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        AppBarLayout appBarLayout;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        while (parent != null && !(parent instanceof androidx.coordinatorlayout.widget.CoordinatorLayout)) {
            parent = parent.getParent();
        }
        if (parent instanceof androidx.coordinatorlayout.widget.CoordinatorLayout) {
            androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = (androidx.coordinatorlayout.widget.CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    appBarLayout = null;
                    break;
                }
                View childAt = coordinatorLayout.getChildAt(childCount);
                if (childAt instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) childAt;
                    break;
                }
                childCount--;
            }
            if (appBarLayout != null) {
                appBarLayout.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new d());
            }
        }
    }

    @Override // android.widget.AbsListView, android.view.View
    protected void onOverScrolled(int i4, int i5, boolean z4, boolean z5) {
        super.onOverScrolled(i4, i5, z4, z5);
        e eVar = this.f48186z;
        if (eVar != null) {
            eVar.a(i4, i5, z4, z5);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f48178r = i6;
        AbsListView.OnScrollListener onScrollListener = this.f48165e;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i4, i5, i6);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        int firstVisiblePosition = absListView.getFirstVisiblePosition();
        int childCount = absListView.getChildCount();
        if (i4 == 0 || firstVisiblePosition + childCount > this.f48178r) {
            w0.e("XListView", "onScrollStateChanged", "preload");
            k();
        }
        AbsListView.OnScrollListener onScrollListener = this.f48165e;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i4);
        }
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f48162b == -1.0f) {
            this.f48162b = motionEvent.getRawY();
        }
        if (this.f48163c == -1.0f) {
            this.f48163c = motionEvent.getRawX();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f48162b = motionEvent.getRawY();
            this.f48163c = motionEvent.getRawX();
        } else if (action != 2) {
            this.f48162b = -1.0f;
            if (getLastVisiblePosition() == this.f48178r - 1) {
                r();
                m();
            }
        } else {
            float rawY = motionEvent.getRawY() - this.f48162b;
            this.f48162b = motionEvent.getRawY();
            StringBuilder sb = new StringBuilder();
            sb.append("onTouchEvent  LastVisiblePosition ");
            sb.append(getLastVisiblePosition());
            sb.append(" mTotalItemCount ");
            sb.append(this.f48178r);
            sb.append(";mPullLoading=");
            sb.append(this.f48176p);
            sb.append(";mEnablePullLoad=");
            sb.append(this.f48175o);
            if (getLastVisiblePosition() == this.f48178r - 1 && ((this.f48174n.getBottomMargin() > 0 || rawY < 0.0f) && !this.f48176p)) {
                if (this.f48175o) {
                    w((-rawY) / 2.0f);
                }
            } else if (this.f48180t != 0) {
                k();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected boolean overScrollBy(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z4) {
        return super.overScrollBy(i4, i5, i6, i7, i8, i9, i10, i11, z4);
    }

    public void p() {
        if (getParent() != null && (getParent() instanceof PtrFrameLayout)) {
            ((PtrFrameLayout) getParent()).f();
        } else if (getParent() == null || getParent().getParent() == null || !(getParent().getParent() instanceof PtrFrameLayout)) {
        } else {
            ((PtrFrameLayout) getParent().getParent()).f();
        }
    }

    public void q() {
        this.f48175o = true;
        this.f48174n.f();
    }

    protected void r() {
        if (!this.f48175o || this.f48174n.getBottomMargin() <= 50 || this.f48176p) {
            return;
        }
        this.f48176p = true;
        this.f48174n.setState(2);
        f fVar = this.f48166f;
        if (fVar != null) {
            fVar.onLoadMore();
        }
    }

    public void s() {
        if (!this.f48175o || this.f48174n.getBottomMargin() <= 50 || this.f48176p) {
            return;
        }
        this.f48176p = true;
        this.f48174n.setState(2);
        f fVar = this.f48166f;
        if (fVar != null) {
            fVar.onLoadMore();
        }
    }

    public void setNoMore(int i4) {
        w0.e("XListView", "setNoMore");
        u();
        this.f48174n.f();
        this.f48174n.setState(i4);
        this.f48175o = false;
        this.f48174n.setOnClickListener(null);
    }

    public void setOnOverScrolled(e eVar) {
        this.f48186z = eVar;
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.f48165e = onScrollListener;
    }

    public void setPreLoadCount(int i4) {
        this.f48180t = i4;
    }

    public void setPullLoadEnable(f fVar) {
        this.f48175o = true;
        this.f48181u = true;
        this.f48166f = fVar;
        this.f48176p = false;
        this.f48174n.f();
        this.f48174n.setState(0);
        this.f48174n.setOnClickListener(new c());
    }

    public void setPullRefreshEnable(g gVar) {
        this.f48185y = gVar;
        if (getParent() != null && (getParent() instanceof PtrFrameLayout)) {
            ((PtrFrameLayout) getParent()).setPtrHandler(this.f48184x);
            ((PtrFrameLayout) getParent()).j(true);
        } else if (getParent() == null || getParent().getParent() == null || !(getParent().getParent() instanceof PtrFrameLayout)) {
        } else {
            ((PtrFrameLayout) getParent().getParent()).setPtrHandler(this.f48184x);
            ((PtrFrameLayout) getParent().getParent()).j(true);
        }
    }

    protected void t() {
        if (this.f48181u) {
            this.f48175o = true;
            this.f48174n.f();
            this.f48174n.setState(0);
        }
    }

    public void u() {
        w0.e("XListView", "stopLoadMore");
        if (this.f48176p && this.f48175o) {
            w0.e("XListView", "stopLoadMore-called");
            this.f48176p = false;
            XListViewFooter xListViewFooter = this.f48174n;
            if (xListViewFooter != null) {
                xListViewFooter.setState(0);
            }
        }
    }

    public void v() {
        if (getParent() != null && (getParent() instanceof PtrFrameLayout)) {
            ((PtrFrameLayout) getParent()).C();
        } else if (getParent() == null || getParent().getParent() == null || !(getParent().getParent() instanceof PtrFrameLayout)) {
        } else {
            ((PtrFrameLayout) getParent().getParent()).C();
        }
    }

    protected void w(float f5) {
        int bottomMargin = this.f48174n.getBottomMargin() + ((int) f5);
        if (this.f48175o && !this.f48176p) {
            if (bottomMargin > 50) {
                this.f48174n.setState(1);
            } else {
                this.f48174n.setState(0);
            }
        }
        this.f48174n.setBottomMargin(bottomMargin);
    }

    protected void x(float f5) {
        XListViewHeader xListViewHeader = this.f48168h;
        xListViewHeader.setVisibleHeight(((int) f5) + xListViewHeader.getVisibleHeight());
        if (this.f48172l && !this.f48173m.get()) {
            if (this.f48168h.getVisibleHeight() > this.f48171k) {
                this.f48168h.setState(1);
            } else {
                this.f48168h.setState(0);
            }
        }
        setSelection(0);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        a aVar = new a(listAdapter);
        this.f48183w = aVar;
        listAdapter.registerDataSetObserver(aVar);
    }

    public void setNoMore() {
        setNoMore(3);
    }

    public XListView2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48162b = -1.0f;
        this.f48163c = -1.0f;
        this.f48172l = true;
        this.f48173m = new AtomicBoolean(false);
        this.f48177q = false;
        this.f48180t = 0;
        this.f48181u = false;
        this.f48182v = AppBarStateChangeListener.State.EXPANDED;
        this.f48184x = new b();
        h(context);
    }

    public XListView2(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f48162b = -1.0f;
        this.f48163c = -1.0f;
        this.f48172l = true;
        this.f48173m = new AtomicBoolean(false);
        this.f48177q = false;
        this.f48180t = 0;
        this.f48181u = false;
        this.f48182v = AppBarStateChangeListener.State.EXPANDED;
        this.f48184x = new b();
        h(context);
    }
}
