package com.join.mgps.customview;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Scroller;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class XScrollView extends ScrollView implements AbsListView.OnScrollListener {
    private static final int A = 400;
    private static final int B = 50;
    private static final float C = 1.8f;

    /* renamed from: x  reason: collision with root package name */
    private static final String f48303x = "XScrollView";

    /* renamed from: y  reason: collision with root package name */
    private static final int f48304y = 0;

    /* renamed from: z  reason: collision with root package name */
    private static final int f48305z = 1;

    /* renamed from: b  reason: collision with root package name */
    private float f48306b;

    /* renamed from: c  reason: collision with root package name */
    private Scroller f48307c;

    /* renamed from: d  reason: collision with root package name */
    private AbsListView.OnScrollListener f48308d;

    /* renamed from: e  reason: collision with root package name */
    private int f48309e;

    /* renamed from: f  reason: collision with root package name */
    private e f48310f;

    /* renamed from: g  reason: collision with root package name */
    private LinearLayout f48311g;

    /* renamed from: h  reason: collision with root package name */
    private LinearLayout f48312h;

    /* renamed from: i  reason: collision with root package name */
    private XListViewHeader f48313i;

    /* renamed from: j  reason: collision with root package name */
    private RelativeLayout f48314j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f48315k;

    /* renamed from: l  reason: collision with root package name */
    private int f48316l;

    /* renamed from: m  reason: collision with root package name */
    private XListViewFooter f48317m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f48318n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f48319o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f48320p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f48321q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f48322r;

    /* renamed from: s  reason: collision with root package name */
    private float f48323s;

    /* renamed from: t  reason: collision with root package name */
    private float f48324t;

    /* renamed from: u  reason: collision with root package name */
    private float f48325u;

    /* renamed from: v  reason: collision with root package name */
    private float f48326v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f48327w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @TargetApi(16)
        public void onGlobalLayout() {
            XScrollView xScrollView = XScrollView.this;
            xScrollView.f48316l = xScrollView.f48314j.getHeight();
            ViewTreeObserver viewTreeObserver = XScrollView.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                if (Build.VERSION.SDK_INT < 16) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                } else {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            XScrollView.this.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            XScrollView.this.fullScroll(33);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            XScrollView.this.fullScroll(130);
        }
    }

    /* loaded from: classes4.dex */
    public interface e {
        void onLoadMore();

        void onRefresh();
    }

    /* loaded from: classes4.dex */
    public interface f extends AbsListView.OnScrollListener {
        void a(View view);
    }

    public XScrollView(Context context) {
        super(context);
        this.f48306b = -1.0f;
        this.f48318n = true;
        this.f48319o = false;
        this.f48320p = true;
        this.f48321q = false;
        this.f48322r = false;
        this.f48327w = true;
        f(context);
    }

    private void g() {
        AbsListView.OnScrollListener onScrollListener = this.f48308d;
        if (onScrollListener instanceof f) {
            ((f) onScrollListener).a(this);
        }
    }

    private boolean h() {
        XListViewFooter xListViewFooter;
        return Math.abs((getScrollY() + getHeight()) - computeVerticalScrollRange()) <= 5 || (getScrollY() > 0 && (xListViewFooter = this.f48317m) != null && xListViewFooter.getBottomMargin() > 0);
    }

    private boolean i() {
        return getScrollY() <= 0 || this.f48313i.getVisibleHeight() > this.f48316l || this.f48312h.getTop() > 0;
    }

    private void j() {
        e eVar;
        if (!this.f48320p || (eVar = this.f48310f) == null) {
            return;
        }
        eVar.onLoadMore();
    }

    private void k() {
        e eVar;
        if (!this.f48318n || (eVar = this.f48310f) == null) {
            return;
        }
        eVar.onRefresh();
    }

    private void l() {
        int bottomMargin = this.f48317m.getBottomMargin();
        if (bottomMargin > 0) {
            this.f48309e = 1;
            this.f48307c.startScroll(0, bottomMargin, 0, -bottomMargin, 400);
            invalidate();
        }
    }

    private void m() {
        int visibleHeight = this.f48313i.getVisibleHeight();
        if (visibleHeight == 0) {
            return;
        }
        boolean z4 = this.f48319o;
        if (!z4 || visibleHeight > this.f48316l) {
            int i4 = (!z4 || visibleHeight <= (i4 = this.f48316l)) ? 0 : 0;
            this.f48309e = 0;
            this.f48307c.startScroll(0, visibleHeight, 0, i4 - visibleHeight, 400);
            invalidate();
        }
    }

    private void n() {
        if (i()) {
            if (this.f48318n && this.f48313i.getVisibleHeight() > this.f48316l) {
                this.f48319o = true;
                this.f48313i.setState(2);
                k();
            }
            m();
        } else if (h()) {
            if (this.f48320p && this.f48317m.getBottomMargin() > 50) {
                o();
            }
            l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.f48322r) {
            return;
        }
        this.f48322r = true;
        this.f48317m.setState(2);
        j();
    }

    private void r(float f5) {
        int bottomMargin = this.f48317m.getBottomMargin() + ((int) f5);
        if (this.f48320p && !this.f48322r) {
            if (bottomMargin > 50) {
                this.f48317m.setState(1);
            } else {
                this.f48317m.setState(0);
            }
        }
        this.f48317m.setBottomMargin(bottomMargin);
        post(new d());
    }

    private void s(float f5) {
        XListViewHeader xListViewHeader = this.f48313i;
        xListViewHeader.setVisibleHeight(((int) f5) + xListViewHeader.getVisibleHeight());
        if (this.f48318n && !this.f48319o) {
            if (this.f48313i.getVisibleHeight() > this.f48316l) {
                this.f48313i.setState(1);
            } else {
                this.f48313i.setState(0);
            }
        }
        post(new c());
    }

    @Override // android.widget.ScrollView, android.view.View
    public void computeScroll() {
        if (this.f48307c.computeScrollOffset()) {
            if (this.f48309e == 0) {
                this.f48313i.setVisibleHeight(this.f48307c.getCurrY());
            } else {
                this.f48317m.setBottomMargin(this.f48307c.getCurrY());
            }
            postInvalidate();
            g();
        }
        super.computeScroll();
    }

    public void e() {
        this.f48313i.setVisibleHeight(this.f48316l);
        if (this.f48318n && !this.f48319o) {
            if (this.f48313i.getVisibleHeight() > this.f48316l) {
                this.f48313i.setState(1);
            } else {
                this.f48313i.setState(0);
            }
        }
        this.f48319o = true;
        this.f48313i.setState(2);
        k();
    }

    protected void f(Context context) {
        ViewGroup viewGroup = null;
        LinearLayout linearLayout = (LinearLayout) View.inflate(context, R.layout.vw_xscrollview_layout, null);
        this.f48311g = linearLayout;
        this.f48312h = (LinearLayout) linearLayout.findViewById(R.id.content_layout);
        this.f48307c = new Scroller(context, new DecelerateInterpolator());
        setOnScrollListener(this);
        XListViewHeader xListViewHeader = new XListViewHeader(context);
        this.f48313i = xListViewHeader;
        this.f48314j = (RelativeLayout) xListViewHeader.findViewById(R.id.xlistview_header_content);
        this.f48315k = (TextView) this.f48313i.findViewById(R.id.xlistview_header_time);
        ((LinearLayout) this.f48311g.findViewById(R.id.header_layout)).addView(this.f48313i);
        this.f48317m = new XListViewFooter(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.f48317m.setState(0);
        ((LinearLayout) this.f48311g.findViewById(R.id.footer_layout)).addView(this.f48317m, layoutParams);
        ViewTreeObserver viewTreeObserver = this.f48313i.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new a());
        }
        if (getChildCount() > 0) {
            viewGroup = (ViewGroup) getChildAt(0);
            removeAllViews();
        }
        addView(this.f48311g);
        if (viewGroup != null) {
            setContentView(viewGroup);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f48324t = 0.0f;
            this.f48323s = 0.0f;
            this.f48325u = motionEvent.getX();
            this.f48326v = motionEvent.getY();
        } else if (action == 2) {
            float x4 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.f48323s += Math.abs(x4 - this.f48325u);
            float abs = this.f48324t + Math.abs(y2 - this.f48326v);
            this.f48324t = abs;
            this.f48325u = x4;
            this.f48326v = y2;
            if (this.f48323s <= abs && this.f48327w) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        AbsListView.OnScrollListener onScrollListener = this.f48308d;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i4, i5, i6);
        }
    }

    @Override // android.view.View
    protected void onScrollChanged(int i4, int i5, int i6, int i7) {
        View childAt = getChildAt(getChildCount() - 1);
        if (childAt != null && childAt.getBottom() - (childAt.getHeight() + childAt.getScrollY()) == 0 && this.f48321q) {
            o();
        }
        super.onScrollChanged(i4, i5, i6, i7);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        AbsListView.OnScrollListener onScrollListener = this.f48308d;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i4);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f48306b == -1.0f) {
            this.f48306b = motionEvent.getRawY();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f48306b = motionEvent.getRawY();
            g();
        } else if (action != 2) {
            this.f48306b = -1.0f;
            n();
        } else {
            float rawY = motionEvent.getRawY() - this.f48306b;
            this.f48306b = motionEvent.getRawY();
            if (i() && (this.f48313i.getVisibleHeight() > 0 || rawY > 0.0f)) {
                s(rawY / C);
            } else if (h() && (this.f48317m.getBottomMargin() > 0 || rawY < 0.0f)) {
                r((-rawY) / C);
            }
            g();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void p() {
        if (this.f48322r) {
            this.f48322r = false;
            this.f48317m.setState(0);
        }
    }

    public void q() {
        if (this.f48319o) {
            this.f48319o = false;
            m();
        }
    }

    public void setAutoLoadEnable(boolean z4) {
        this.f48321q = z4;
    }

    public void setContentView(ViewGroup viewGroup) {
        LinearLayout linearLayout = this.f48311g;
        if (linearLayout == null) {
            return;
        }
        if (this.f48312h == null) {
            this.f48312h = (LinearLayout) linearLayout.findViewById(R.id.content_layout);
        }
        if (this.f48312h.getChildCount() > 0) {
            this.f48312h.removeAllViews();
        }
        this.f48312h.addView(viewGroup);
    }

    public void setIXScrollViewListener(e eVar) {
        this.f48310f = eVar;
    }

    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.f48308d = onScrollListener;
    }

    public void setPullLoadEnable(boolean z4) {
        this.f48320p = z4;
        if (!z4) {
            this.f48317m.setBottomMargin(0);
            this.f48317m.a();
            XListViewFooter xListViewFooter = this.f48317m;
            xListViewFooter.setPadding(0, 0, 0, xListViewFooter.getHeight() * (-1));
            this.f48317m.setOnClickListener(null);
            return;
        }
        this.f48322r = false;
        this.f48317m.setPadding(0, 0, 0, 0);
        this.f48317m.f();
        this.f48317m.setState(0);
        this.f48317m.setOnClickListener(new b());
    }

    public void setPullRefreshEnable(boolean z4) {
        this.f48318n = z4;
        this.f48314j.setVisibility(z4 ? 0 : 4);
    }

    public void setRefreshTime(String str) {
        this.f48315k.setText(str);
    }

    public void setScrollEnable(boolean z4) {
        this.f48327w = z4;
        requestDisallowInterceptTouchEvent(!z4);
    }

    public void setView(View view) {
        LinearLayout linearLayout = this.f48311g;
        if (linearLayout == null) {
            return;
        }
        if (this.f48312h == null) {
            this.f48312h = (LinearLayout) linearLayout.findViewById(R.id.content_layout);
        }
        this.f48312h.addView(view);
    }

    public XScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48306b = -1.0f;
        this.f48318n = true;
        this.f48319o = false;
        this.f48320p = true;
        this.f48321q = false;
        this.f48322r = false;
        this.f48327w = true;
        f(context);
    }

    public XScrollView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f48306b = -1.0f;
        this.f48318n = true;
        this.f48319o = false;
        this.f48320p = true;
        this.f48321q = false;
        this.f48322r = false;
        this.f48327w = true;
        f(context);
    }
}
