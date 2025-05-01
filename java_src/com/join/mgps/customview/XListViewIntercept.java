package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class XListViewIntercept extends ListView implements AbsListView.OnScrollListener {

    /* renamed from: v  reason: collision with root package name */
    private static final int f48276v = 0;

    /* renamed from: w  reason: collision with root package name */
    private static final int f48277w = 1;

    /* renamed from: x  reason: collision with root package name */
    private static final int f48278x = 400;

    /* renamed from: y  reason: collision with root package name */
    private static final int f48279y = 50;

    /* renamed from: z  reason: collision with root package name */
    private static final float f48280z = 1.8f;

    /* renamed from: b  reason: collision with root package name */
    private float f48281b;

    /* renamed from: c  reason: collision with root package name */
    private Scroller f48282c;

    /* renamed from: d  reason: collision with root package name */
    private AbsListView.OnScrollListener f48283d;

    /* renamed from: e  reason: collision with root package name */
    private c f48284e;

    /* renamed from: f  reason: collision with root package name */
    private XListViewHeader f48285f;

    /* renamed from: g  reason: collision with root package name */
    private RelativeLayout f48286g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f48287h;

    /* renamed from: i  reason: collision with root package name */
    private int f48288i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f48289j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f48290k;

    /* renamed from: l  reason: collision with root package name */
    private XListViewFooter f48291l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f48292m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f48293n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f48294o;

    /* renamed from: p  reason: collision with root package name */
    private int f48295p;

    /* renamed from: q  reason: collision with root package name */
    private int f48296q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f48297r;

    /* renamed from: s  reason: collision with root package name */
    private float f48298s;

    /* renamed from: t  reason: collision with root package name */
    private float f48299t;

    /* renamed from: u  reason: collision with root package name */
    private int f48300u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            XListViewIntercept xListViewIntercept = XListViewIntercept.this;
            xListViewIntercept.f48288i = xListViewIntercept.f48286g.getHeight();
            XListViewIntercept.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            XListViewIntercept.this.i();
        }
    }

    /* loaded from: classes4.dex */
    public interface c {
        void onLoadMore();

        void onRefresh();
    }

    /* loaded from: classes4.dex */
    public interface d extends AbsListView.OnScrollListener {
        void a(View view);
    }

    public XListViewIntercept(Context context) {
        super(context);
        this.f48281b = -1.0f;
        this.f48289j = true;
        this.f48290k = false;
        this.f48294o = false;
        this.f48297r = false;
        e(context);
    }

    private void e(Context context) {
        this.f48282c = new Scroller(context, new DecelerateInterpolator());
        super.setOnScrollListener(this);
        setVerticalScrollBarEnabled(false);
        XListViewHeader xListViewHeader = new XListViewHeader(context);
        this.f48285f = xListViewHeader;
        this.f48286g = (RelativeLayout) xListViewHeader.findViewById(R.id.xlistview_header_content);
        this.f48287h = (TextView) this.f48285f.findViewById(R.id.xlistview_header_time);
        addHeaderView(this.f48285f);
        this.f48291l = new XListViewFooter(context);
        this.f48285f.getViewTreeObserver().addOnGlobalLayoutListener(new a());
    }

    private void f() {
        AbsListView.OnScrollListener onScrollListener = this.f48283d;
        if (onScrollListener instanceof d) {
            ((d) onScrollListener).a(this);
        }
    }

    private void g() {
        int bottomMargin = this.f48291l.getBottomMargin();
        if (bottomMargin > 0) {
            this.f48296q = 1;
            this.f48282c.startScroll(0, bottomMargin, 0, -bottomMargin, 400);
            invalidate();
        }
    }

    private void h() {
        int visibleHeight = this.f48285f.getVisibleHeight();
        if (visibleHeight == 0) {
            return;
        }
        boolean z4 = this.f48290k;
        if (!z4 || visibleHeight > this.f48288i) {
            int i4 = (!z4 || visibleHeight <= (i4 = this.f48288i)) ? 0 : 0;
            this.f48296q = 0;
            this.f48282c.startScroll(0, visibleHeight, 0, i4 - visibleHeight, 400);
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f48293n = true;
        this.f48291l.setState(2);
        c cVar = this.f48284e;
        if (cVar != null) {
            cVar.onLoadMore();
        }
    }

    private void l(float f5) {
        int bottomMargin = this.f48291l.getBottomMargin() + ((int) f5);
        if (this.f48292m && !this.f48293n) {
            if (bottomMargin > 50) {
                this.f48291l.setState(1);
            } else {
                this.f48291l.setState(0);
            }
        }
        this.f48291l.setBottomMargin(bottomMargin);
    }

    private void m(float f5) {
        XListViewHeader xListViewHeader = this.f48285f;
        xListViewHeader.setVisibleHeight(((int) f5) + xListViewHeader.getVisibleHeight());
        if (this.f48289j && !this.f48290k) {
            if (this.f48285f.getVisibleHeight() > this.f48288i) {
                this.f48285f.setState(1);
            } else {
                this.f48285f.setState(0);
            }
        }
        setSelection(0);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f48282c.computeScrollOffset()) {
            if (this.f48296q == 0) {
                this.f48285f.setVisibleHeight(this.f48282c.getCurrY());
            } else {
                this.f48291l.setBottomMargin(this.f48282c.getCurrY());
            }
            postInvalidate();
            f();
        }
        super.computeScroll();
    }

    public void j() {
        if (this.f48293n) {
            this.f48293n = false;
            this.f48291l.setState(0);
        }
    }

    public void k() {
        if (this.f48290k) {
            this.f48290k = false;
            this.f48291l.setVisibility(0);
            h();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f48295p = i6;
        AbsListView.OnScrollListener onScrollListener = this.f48283d;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i4, i5, i6);
        }
    }

    @Override // android.view.View
    protected void onScrollChanged(int i4, int i5, int i6, int i7) {
        View childAt;
        super.onScrollChanged(i4, i5, i6, i7);
        if (!this.f48297r || (childAt = getChildAt(0)) == null) {
            return;
        }
        if (childAt.getTop() == 0) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        int i8 = this.f48300u;
        if (i8 < i5) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (i5 < i8 && getScrollY() == 0) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.f48300u = i5;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        AbsListView.OnScrollListener onScrollListener = this.f48283d;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i4);
        }
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f48281b == -1.0f) {
            this.f48281b = motionEvent.getRawY();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.f48297r) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.f48298s = motionEvent.getX();
                this.f48299t = motionEvent.getY();
            }
            this.f48281b = motionEvent.getRawY();
        } else if (action != 2) {
            if (this.f48297r) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.f48281b = -1.0f;
            if (getFirstVisiblePosition() == 0) {
                if (this.f48289j && this.f48285f.getVisibleHeight() > this.f48288i) {
                    this.f48290k = true;
                    this.f48285f.setState(2);
                    c cVar = this.f48284e;
                    if (cVar != null) {
                        cVar.onRefresh();
                        this.f48291l.setVisibility(4);
                    }
                }
                h();
            } else if (getLastVisiblePosition() == this.f48295p - 1) {
                if (this.f48292m && this.f48291l.getBottomMargin() > 50) {
                    i();
                }
                g();
            }
        } else {
            if (this.f48297r) {
                if (Math.abs(motionEvent.getX() - this.f48298s) > Math.abs(motionEvent.getY() - this.f48299t)) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                View childAt = getChildAt(0);
                if (childAt != null && childAt.getTop() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            float rawY = motionEvent.getRawY() - this.f48281b;
            this.f48281b = motionEvent.getRawY();
            if (getFirstVisiblePosition() == 0 && (this.f48285f.getVisibleHeight() > 0 || rawY > 0.0f)) {
                if (this.f48289j) {
                    m(rawY / f48280z);
                    f();
                }
            } else if (getLastVisiblePosition() == this.f48295p - 1 && (this.f48291l.getBottomMargin() > 0 || rawY < 0.0f)) {
                l((-rawY) / f48280z);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setFirstNoMore(Boolean bool) {
        if (bool.booleanValue()) {
            this.f48291l.a();
            this.f48291l.setOnClickListener(null);
            return;
        }
        this.f48293n = false;
        this.f48291l.f();
        this.f48291l.setState(5);
    }

    public void setInterceptToch(boolean z4) {
        this.f48297r = z4;
    }

    public void setNoMore() {
        if (!this.f48292m) {
            this.f48291l.a();
            this.f48291l.setOnClickListener(null);
            return;
        }
        this.f48293n = false;
        this.f48291l.f();
        this.f48291l.setState(3);
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.f48283d = onScrollListener;
    }

    public void setPullLoadEnable(boolean z4) {
        this.f48292m = z4;
        if (!z4) {
            this.f48291l.a();
            this.f48291l.setOnClickListener(null);
            return;
        }
        this.f48293n = false;
        this.f48291l.f();
        this.f48291l.setState(0);
        this.f48291l.setOnClickListener(new b());
    }

    public void setPullRefreshEnable(boolean z4) {
        this.f48289j = z4;
        if (!z4) {
            this.f48286g.setVisibility(4);
        } else {
            this.f48286g.setVisibility(0);
        }
    }

    public void setRefreshTime(String str) {
        this.f48287h.setText(str);
    }

    public void setXListViewListener(c cVar) {
        this.f48284e = cVar;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        if (!this.f48294o) {
            this.f48294o = true;
            this.f48291l.setState(4);
            addFooterView(this.f48291l);
        }
        super.setAdapter(listAdapter);
    }

    public XListViewIntercept(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48281b = -1.0f;
        this.f48289j = true;
        this.f48290k = false;
        this.f48294o = false;
        this.f48297r = false;
        e(context);
    }

    public XListViewIntercept(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f48281b = -1.0f;
        this.f48289j = true;
        this.f48290k = false;
        this.f48294o = false;
        this.f48297r = false;
        e(context);
    }
}
