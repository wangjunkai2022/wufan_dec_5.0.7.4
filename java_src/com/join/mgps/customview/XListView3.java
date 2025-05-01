package com.join.mgps.customview;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.v0;
import com.join.mgps.Util.w0;
import com.join.mgps.ptr.PtrFrameLayout;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes4.dex */
public class XListView3 extends ListView implements AbsListView.OnScrollListener, NestedScrollingChild {
    public static final String A = "XListView";
    protected static final int B = 0;
    protected static final int C = 1;
    protected static final int D = 400;
    protected static final int E = 50;
    protected static final float F = 2.0f;

    /* renamed from: b  reason: collision with root package name */
    protected float f48192b;

    /* renamed from: c  reason: collision with root package name */
    protected float f48193c;

    /* renamed from: d  reason: collision with root package name */
    protected Scroller f48194d;

    /* renamed from: e  reason: collision with root package name */
    protected AbsListView.OnScrollListener f48195e;

    /* renamed from: f  reason: collision with root package name */
    protected f f48196f;

    /* renamed from: g  reason: collision with root package name */
    protected g f48197g;

    /* renamed from: h  reason: collision with root package name */
    protected XListViewHeader f48198h;

    /* renamed from: i  reason: collision with root package name */
    protected RelativeLayout f48199i;

    /* renamed from: j  reason: collision with root package name */
    protected TextView f48200j;

    /* renamed from: k  reason: collision with root package name */
    protected int f48201k;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f48202l;

    /* renamed from: m  reason: collision with root package name */
    protected AtomicBoolean f48203m;

    /* renamed from: n  reason: collision with root package name */
    protected XListViewFooter f48204n;

    /* renamed from: o  reason: collision with root package name */
    protected boolean f48205o;

    /* renamed from: p  reason: collision with root package name */
    protected boolean f48206p;

    /* renamed from: q  reason: collision with root package name */
    protected boolean f48207q;

    /* renamed from: r  reason: collision with root package name */
    protected int f48208r;

    /* renamed from: s  reason: collision with root package name */
    protected int f48209s;

    /* renamed from: t  reason: collision with root package name */
    private int f48210t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f48211u;

    /* renamed from: v  reason: collision with root package name */
    private NestedScrollingChildHelper f48212v;

    /* renamed from: w  reason: collision with root package name */
    DataSetObserver f48213w;

    /* renamed from: x  reason: collision with root package name */
    private com.join.mgps.ptr.a f48214x;

    /* renamed from: y  reason: collision with root package name */
    private g f48215y;

    /* renamed from: z  reason: collision with root package name */
    e f48216z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends DataSetObserver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ListAdapter f48217a;

        a(ListAdapter listAdapter) {
            this.f48217a = listAdapter;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ListAdapter listAdapter = this.f48217a;
            if (listAdapter == null || listAdapter.getCount() <= 20) {
                XListView3.this.k();
            }
        }
    }

    /* loaded from: classes4.dex */
    class b extends com.join.mgps.ptr.a {
        b() {
        }

        @Override // com.join.mgps.ptr.a, com.join.mgps.ptr.b
        public boolean checkCanDoRefresh(PtrFrameLayout ptrFrameLayout, View view, View view2) {
            StringBuilder sb = new StringBuilder();
            sb.append("checkCanDoRefresh: ");
            sb.append(view);
            return XListView3.this.c(ptrFrameLayout, view, view2);
        }

        @Override // com.join.mgps.ptr.b
        public void onRefreshBegin(PtrFrameLayout ptrFrameLayout) {
            v0.g("onRefreshBegin----------");
            XListView3.this.t();
            if (XListView3.this.f48215y != null) {
                XListView3.this.f48215y.onRefresh();
            }
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            XListView3 xListView3 = XListView3.this;
            xListView3.f48206p = true;
            xListView3.f48204n.setState(2);
            f fVar = XListView3.this.f48196f;
            if (fVar != null) {
                fVar.onLoadMore();
            }
        }
    }

    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (XListView3.this.f48215y != null) {
                XListView3.this.f48215y.onRefresh();
                XListView3.this.f48204n.setState(0);
                XListView3 xListView3 = XListView3.this;
                xListView3.f48205o = true;
                xListView3.f48204n.setOnClickListener(null);
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface e {
        void a(int i4, int i5, boolean z4, boolean z5);
    }

    public XListView3(Context context) {
        super(context);
        this.f48192b = -1.0f;
        this.f48193c = -1.0f;
        this.f48202l = true;
        this.f48203m = new AtomicBoolean(false);
        this.f48207q = false;
        this.f48210t = 0;
        this.f48211u = false;
        this.f48214x = new b();
        h(context);
        setFriction(ViewConfiguration.getScrollFriction() * 2.0f);
        setFastScrollEnabled(false);
        g();
    }

    private void g() {
        this.f48212v = new NestedScrollingChildHelper(this);
        if (Build.VERSION.SDK_INT >= 21) {
            setNestedScrollingEnabled(true);
        }
    }

    public boolean c(PtrFrameLayout ptrFrameLayout, View view, View view2) {
        return com.join.mgps.ptr.a.checkContentCanBePulledDown(ptrFrameLayout, this, view2);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f48194d.computeScrollOffset()) {
            if (this.f48209s != 0) {
                this.f48204n.setBottomMargin(this.f48194d.getCurrY());
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

    public void d() {
        this.f48205o = false;
        this.f48204n.a();
        this.f48204n.setOnClickListener(null);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f5, float f6, boolean z4) {
        return this.f48212v.dispatchNestedFling(f5, f6, z4);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f5, float f6) {
        return this.f48212v.dispatchNestedPreFling(f5, f6);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return this.f48212v.dispatchNestedPreScroll(i4, i5, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return this.f48212v.dispatchNestedScroll(i4, i5, i6, i7, iArr);
    }

    public void e() {
        this.f48202l = false;
        this.f48199i.setVisibility(4);
    }

    public void f() {
        this.f48205o = false;
        this.f48204n.a();
    }

    public int getLastCompletelyVisiblePosition() {
        View childAt;
        int lastVisiblePosition = getLastVisiblePosition();
        return (getChildCount() > 0 && (childAt = getChildAt(getChildCount() + (-1))) != null && childAt.getBottom() > getHeight()) ? Math.max(0, lastVisiblePosition - 1) : lastVisiblePosition;
    }

    protected void h(Context context) {
        this.f48194d = new Scroller(context, new DecelerateInterpolator());
        super.setOnScrollListener(this);
        XListViewHeader xListViewHeader = new XListViewHeader(context);
        this.f48198h = xListViewHeader;
        this.f48199i = (RelativeLayout) xListViewHeader.findViewById(R.id.xlistview_header_content);
        this.f48200j = (TextView) this.f48198h.findViewById(R.id.xlistview_header_time);
        this.f48204n = new XListViewFooter(context);
        d();
        e();
        addFooterView(this.f48204n);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.f48212v.hasNestedScrollingParent();
    }

    protected void i() {
        AbsListView.OnScrollListener onScrollListener = this.f48195e;
        if (onScrollListener instanceof h) {
            ((h) onScrollListener).a(this);
        }
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.f48212v.isNestedScrollingEnabled();
    }

    public boolean j() {
        return this.f48203m.get();
    }

    public synchronized void k() {
        if (com.join.android.app.common.utils.j.j(getContext()) && !this.f48203m.get() && this.f48205o && this.f48208r > 1 && !this.f48206p && getLastVisiblePosition() >= this.f48208r - this.f48210t) {
            w0.e("XListView", "do-preload");
            this.f48206p = true;
            this.f48204n.setState(2);
            f fVar = this.f48196f;
            if (fVar != null) {
                fVar.onLoadMore();
            }
        }
    }

    public void l() {
        this.f48205o = true;
        this.f48202l = true;
        this.f48204n.setState(0);
    }

    protected void m() {
        int bottomMargin = this.f48204n.getBottomMargin();
        if (bottomMargin > 0) {
            this.f48209s = 1;
            this.f48194d.startScroll(0, bottomMargin, 0, -bottomMargin, 400);
            invalidate();
        }
    }

    protected void n() {
        int visibleHeight = this.f48198h.getVisibleHeight();
        if (visibleHeight == 0) {
            return;
        }
        if (!this.f48203m.get() || visibleHeight > this.f48201k) {
            int i4 = (!this.f48203m.get() || visibleHeight <= (i4 = this.f48201k)) ? 0 : 0;
            StringBuilder sb = new StringBuilder();
            sb.append("resetHeaderHeight-->");
            int i5 = i4 - visibleHeight;
            sb.append(i5);
            this.f48209s = 0;
            this.f48194d.startScroll(0, visibleHeight, 0, i5, 400);
            invalidate();
        }
    }

    protected void o(int i4) {
        int visibleHeight = this.f48198h.getVisibleHeight();
        if (visibleHeight == 0) {
            return;
        }
        if (!this.f48203m.get() || visibleHeight > this.f48201k) {
            int i5 = (!this.f48203m.get() || visibleHeight <= (i5 = this.f48201k)) ? 0 : 0;
            this.f48209s = 0;
            StringBuilder sb = new StringBuilder();
            sb.append("resetHeaderHeight-->");
            int i6 = i5 - visibleHeight;
            sb.append(i6);
            this.f48194d.startScroll(0, visibleHeight, 0, i6 + 100, 400);
            invalidate();
        }
    }

    @Override // android.widget.AbsListView, android.view.View
    protected void onOverScrolled(int i4, int i5, boolean z4, boolean z5) {
        super.onOverScrolled(i4, i5, z4, z5);
        e eVar = this.f48216z;
        if (eVar != null) {
            eVar.a(i4, i5, z4, z5);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f48208r = i6;
        AbsListView.OnScrollListener onScrollListener = this.f48195e;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i4, i5, i6);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        int firstVisiblePosition = absListView.getFirstVisiblePosition();
        int childCount = absListView.getChildCount();
        if (i4 == 0 || firstVisiblePosition + childCount > this.f48208r) {
            w0.e("XListView", "onScrollStateChanged", "preload");
            k();
        }
        AbsListView.OnScrollListener onScrollListener = this.f48195e;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i4);
        }
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f48192b == -1.0f) {
            this.f48192b = motionEvent.getRawY();
        }
        if (this.f48193c == -1.0f) {
            this.f48193c = motionEvent.getRawX();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f48192b = motionEvent.getRawY();
            this.f48193c = motionEvent.getRawX();
        } else if (action != 2) {
            this.f48192b = -1.0f;
            if (getLastVisiblePosition() == this.f48208r - 1) {
                r();
                m();
            }
        } else {
            float rawY = motionEvent.getRawY() - this.f48192b;
            this.f48192b = motionEvent.getRawY();
            StringBuilder sb = new StringBuilder();
            sb.append("onTouchEvent  LastVisiblePosition ");
            sb.append(getLastVisiblePosition());
            sb.append(" mTotalItemCount ");
            sb.append(this.f48208r);
            sb.append(";mPullLoading=");
            sb.append(this.f48206p);
            sb.append(";mEnablePullLoad=");
            sb.append(this.f48205o);
            if (getLastVisiblePosition() == this.f48208r - 1 && ((this.f48204n.getBottomMargin() > 0 || rawY < 0.0f) && !this.f48206p)) {
                if (this.f48205o) {
                    w((-rawY) / 2.0f);
                }
            } else if (this.f48210t != 0) {
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
        } else if (getParent() != null && getParent().getParent() != null && (getParent().getParent() instanceof PtrFrameLayout)) {
            ((PtrFrameLayout) getParent().getParent()).f();
        } else if (getParent() == null || getParent().getParent() == null || getParent().getParent().getParent() == null || !(getParent().getParent().getParent() instanceof PtrFrameLayout)) {
        } else {
            ((PtrFrameLayout) getParent().getParent().getParent()).f();
        }
    }

    public void q() {
        this.f48205o = true;
        this.f48204n.f();
    }

    protected void r() {
        if (!this.f48205o || this.f48204n.getBottomMargin() <= 50 || this.f48206p) {
            return;
        }
        this.f48206p = true;
        this.f48204n.setState(2);
        f fVar = this.f48196f;
        if (fVar != null) {
            fVar.onLoadMore();
        }
    }

    public void s() {
        if (!this.f48205o || this.f48204n.getBottomMargin() <= 50 || this.f48206p) {
            return;
        }
        this.f48206p = true;
        this.f48204n.setState(2);
        f fVar = this.f48196f;
        if (fVar != null) {
            fVar.onLoadMore();
        }
    }

    public void setCanLoadMore() {
        this.f48204n.setState(0);
        this.f48205o = true;
        this.f48204n.setOnClickListener(null);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z4) {
        this.f48212v.setNestedScrollingEnabled(z4);
    }

    public void setNoMore() {
        View findViewById;
        w0.e("XListView", "setNoMore");
        u();
        this.f48204n.f();
        this.f48204n.setState(7);
        this.f48205o = false;
        this.f48204n.setOnClickListener(null);
        try {
            View childAt = this.f48204n.getChildAt(0);
            if (!(childAt instanceof LinearLayout) || (findViewById = childAt.findViewById(R.id.xlistview_footer_refresh_textview)) == null) {
                return;
            }
            findViewById.setOnClickListener(new d());
        } catch (Exception unused) {
        }
    }

    public void setOnOverScrolled(e eVar) {
        this.f48216z = eVar;
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.f48195e = onScrollListener;
    }

    public void setPreLoadCount(int i4) {
        this.f48210t = i4;
    }

    public void setPullLoadEnable(f fVar) {
        this.f48205o = true;
        this.f48211u = true;
        this.f48196f = fVar;
        this.f48206p = false;
        this.f48204n.f();
        this.f48204n.setState(0);
        this.f48204n.setOnClickListener(new c());
    }

    public void setPullRefreshEnable(g gVar) {
        this.f48215y = gVar;
        if (getParent() != null && (getParent() instanceof PtrFrameLayout)) {
            ((PtrFrameLayout) getParent()).setPtrHandler(this.f48214x);
            ((PtrFrameLayout) getParent()).j(true);
        } else if (getParent() != null && getParent().getParent() != null && (getParent().getParent() instanceof PtrFrameLayout)) {
            ((PtrFrameLayout) getParent().getParent()).setPtrHandler(this.f48214x);
            ((PtrFrameLayout) getParent().getParent()).j(true);
        } else if (getParent() == null || getParent().getParent() == null || getParent().getParent().getParent() == null || !(getParent().getParent().getParent() instanceof PtrFrameLayout)) {
        } else {
            ((PtrFrameLayout) getParent().getParent().getParent()).setPtrHandler(this.f48214x);
            ((PtrFrameLayout) getParent().getParent().getParent()).j(true);
        }
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i4) {
        return this.f48212v.startNestedScroll(i4);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.f48212v.stopNestedScroll();
    }

    protected void t() {
        if (this.f48211u) {
            this.f48205o = true;
            this.f48204n.f();
            this.f48204n.setState(0);
        }
    }

    public void u() {
        w0.e("XListView", "stopLoadMore");
        if (this.f48206p && this.f48205o) {
            w0.e("XListView", "stopLoadMore-called");
            this.f48206p = false;
            XListViewFooter xListViewFooter = this.f48204n;
            if (xListViewFooter != null) {
                xListViewFooter.setState(0);
            }
        }
    }

    public void v() {
        if (getParent() != null && (getParent() instanceof PtrFrameLayout)) {
            ((PtrFrameLayout) getParent()).C();
        } else if (getParent() != null && getParent().getParent() != null && (getParent().getParent() instanceof PtrFrameLayout)) {
            ((PtrFrameLayout) getParent().getParent()).C();
        } else if (getParent() == null || getParent().getParent() == null || getParent().getParent().getParent() == null || !(getParent().getParent().getParent() instanceof PtrFrameLayout)) {
        } else {
            ((PtrFrameLayout) getParent().getParent().getParent()).C();
        }
    }

    protected void w(float f5) {
        int bottomMargin = this.f48204n.getBottomMargin() + ((int) f5);
        if (this.f48205o && !this.f48206p) {
            if (bottomMargin > 50) {
                this.f48204n.setState(1);
            } else {
                this.f48204n.setState(0);
            }
        }
        this.f48204n.setBottomMargin(bottomMargin);
    }

    protected void x(float f5) {
        XListViewHeader xListViewHeader = this.f48198h;
        xListViewHeader.setVisibleHeight(((int) f5) + xListViewHeader.getVisibleHeight());
        if (this.f48202l && !this.f48203m.get()) {
            if (this.f48198h.getVisibleHeight() > this.f48201k) {
                this.f48198h.setState(1);
            } else {
                this.f48198h.setState(0);
            }
        }
        setSelection(0);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        a aVar = new a(listAdapter);
        this.f48213w = aVar;
        listAdapter.registerDataSetObserver(aVar);
    }

    public XListView3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48192b = -1.0f;
        this.f48193c = -1.0f;
        this.f48202l = true;
        this.f48203m = new AtomicBoolean(false);
        this.f48207q = false;
        this.f48210t = 0;
        this.f48211u = false;
        this.f48214x = new b();
        h(context);
        g();
    }

    public XListView3(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f48192b = -1.0f;
        this.f48193c = -1.0f;
        this.f48202l = true;
        this.f48203m = new AtomicBoolean(false);
        this.f48207q = false;
        this.f48210t = 0;
        this.f48211u = false;
        this.f48214x = new b();
        h(context);
        g();
    }
}
