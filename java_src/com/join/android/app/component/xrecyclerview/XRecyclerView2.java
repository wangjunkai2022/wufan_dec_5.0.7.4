package com.join.android.app.component.xrecyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import com.join.android.app.common.utils.j;
import com.join.android.app.component.xrecyclerview.AppBarStateChangeListener;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListViewFooter;
import com.join.mgps.ptr.PtrFrameLayout;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class XRecyclerView2 extends RecyclerView {
    private static List<Integer> A = new ArrayList();
    protected static final int B = 0;
    protected static final int C = 1;
    protected static final int D = 400;
    protected static final int E = 50;
    protected static final float F = 2.0f;

    /* renamed from: w  reason: collision with root package name */
    private static final float f15496w = 3.0f;

    /* renamed from: x  reason: collision with root package name */
    private static final int f15497x = 10000;

    /* renamed from: y  reason: collision with root package name */
    private static final int f15498y = 10001;

    /* renamed from: z  reason: collision with root package name */
    private static final int f15499z = 10002;

    /* renamed from: b  reason: collision with root package name */
    private boolean f15500b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15501c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<View> f15502d;

    /* renamed from: e  reason: collision with root package name */
    private WrapAdapter f15503e;

    /* renamed from: f  reason: collision with root package name */
    private float f15504f;

    /* renamed from: g  reason: collision with root package name */
    private g f15505g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15506h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f15507i;

    /* renamed from: j  reason: collision with root package name */
    private int f15508j;

    /* renamed from: k  reason: collision with root package name */
    private View f15509k;

    /* renamed from: l  reason: collision with root package name */
    protected XListViewFooter f15510l;

    /* renamed from: m  reason: collision with root package name */
    protected boolean f15511m;

    /* renamed from: n  reason: collision with root package name */
    private final RecyclerView.AdapterDataObserver f15512n;

    /* renamed from: o  reason: collision with root package name */
    private AppBarStateChangeListener.State f15513o;

    /* renamed from: p  reason: collision with root package name */
    private double f15514p;

    /* renamed from: q  reason: collision with root package name */
    private int f15515q;

    /* renamed from: r  reason: collision with root package name */
    protected Scroller f15516r;

    /* renamed from: s  reason: collision with root package name */
    protected RecyclerView.OnScrollListener f15517s;

    /* renamed from: t  reason: collision with root package name */
    protected int f15518t;

    /* renamed from: u  reason: collision with root package name */
    private PtrFrameLayout f15519u;

    /* renamed from: v  reason: collision with root package name */
    private com.join.mgps.ptr.a f15520v;

    /* loaded from: classes3.dex */
    class a extends com.join.mgps.ptr.a {
        a() {
        }

        private void setFooterDefault() {
            XRecyclerView2 xRecyclerView2 = XRecyclerView2.this;
            xRecyclerView2.setLoadingMoreEnabled(xRecyclerView2.f15507i);
        }

        @Override // com.join.mgps.ptr.a, com.join.mgps.ptr.b
        public boolean checkCanDoRefresh(PtrFrameLayout ptrFrameLayout, View view, View view2) {
            return XRecyclerView2.this.getFirstCompletelyVisiblePosition() <= 1 && XRecyclerView2.this.f15513o == AppBarStateChangeListener.State.EXPANDED && com.join.mgps.ptr.a.checkContentCanBePulledDown(ptrFrameLayout, view, view2);
        }

        @Override // com.join.mgps.ptr.b
        public void onRefreshBegin(PtrFrameLayout ptrFrameLayout) {
            setFooterDefault();
            if (XRecyclerView2.this.f15505g != null) {
                XRecyclerView2.this.f15505g.onRefresh();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends RecyclerView.OnScrollListener {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
            super.onScrolled(recyclerView, i4, i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (XRecyclerView2.this.f15505g != null) {
                XRecyclerView2.this.f15505g.onRefresh();
                XRecyclerView2.this.f15510l.setState(0);
                XRecyclerView2.this.f15507i = true;
                XRecyclerView2.this.f15510l.setOnClickListener(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (XRecyclerView2.this.f15501c) {
                return;
            }
            XRecyclerView2 xRecyclerView2 = XRecyclerView2.this;
            xRecyclerView2.f15511m = true;
            xRecyclerView2.f15510l.setState(2);
            if (XRecyclerView2.this.f15505g != null) {
                XRecyclerView2.this.f15505g.onLoadMore();
            }
        }
    }

    /* loaded from: classes3.dex */
    class e extends AppBarStateChangeListener {
        e() {
        }

        @Override // com.join.android.app.component.xrecyclerview.AppBarStateChangeListener
        public void onStateChanged(AppBarLayout appBarLayout, AppBarStateChangeListener.State state) {
            XRecyclerView2.this.f15513o = state;
        }
    }

    /* loaded from: classes3.dex */
    private class f extends RecyclerView.AdapterDataObserver {
        private f() {
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            RecyclerView.Adapter adapter = XRecyclerView2.this.getAdapter();
            if (adapter != null && XRecyclerView2.this.f15509k != null) {
                ?? r12 = XRecyclerView2.this.f15506h;
                int i4 = r12;
                if (XRecyclerView2.this.f15507i) {
                    i4 = r12 + 1;
                }
                if (adapter.getItemCount() == i4) {
                    XRecyclerView2.this.f15509k.setVisibility(0);
                    XRecyclerView2.this.setVisibility(8);
                } else {
                    XRecyclerView2.this.f15509k.setVisibility(8);
                    XRecyclerView2.this.setVisibility(0);
                }
            }
            if (XRecyclerView2.this.f15503e != null) {
                XRecyclerView2.this.f15503e.notifyDataSetChanged();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i4, int i5) {
            XRecyclerView2.this.f15503e.notifyItemRangeChanged(i4, i5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i4, int i5) {
            XRecyclerView2.this.f15503e.notifyItemRangeInserted(i4, i5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i4, int i5, int i6) {
            XRecyclerView2.this.f15503e.notifyItemMoved(i4, i5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i4, int i5) {
            XRecyclerView2.this.f15503e.notifyItemRangeRemoved(i4, i5);
        }

        /* synthetic */ f(XRecyclerView2 xRecyclerView2, a aVar) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i4, int i5, Object obj) {
            XRecyclerView2.this.f15503e.notifyItemRangeChanged(i4, i5, obj);
        }
    }

    /* loaded from: classes3.dex */
    public interface g {
        void onLoadMore();

        void onRefresh();
    }

    public XRecyclerView2(Context context) {
        this(context, null);
        init();
    }

    private void disableLoadingMoreView() {
        this.f15510l.a();
        this.f15510l.setOnClickListener(null);
    }

    private void enableLoadingMoreView() {
        this.f15511m = false;
        this.f15510l.f();
        this.f15510l.setState(0);
        this.f15510l.setOnClickListener(new d());
    }

    private int findMax(int[] iArr) {
        int i4 = iArr[0];
        for (int i5 : iArr) {
            if (i5 > i4) {
                i4 = i5;
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getHeaderViewByType(int i4) {
        if (isHeaderType(i4)) {
            return this.f15502d.get(i4 - 10002);
        }
        return null;
    }

    private void init() {
        this.f15516r = new Scroller(getContext(), new AccelerateInterpolator());
        addOnScrollListener(new b());
        if (this.f15506h) {
            setPtrFrameLayout(null);
        }
        XListViewFooter xListViewFooter = new XListViewFooter(getContext());
        xListViewFooter.setState(0);
        this.f15510l = xListViewFooter;
        setLoadingMoreEnabled(this.f15507i);
        this.f15510l.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isHeaderType(int i4) {
        return this.f15502d.size() > 0 && A.contains(Integer.valueOf(i4));
    }

    private boolean isOnTop() {
        return this.f15519u != null && getFirstVisiblePosition() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isReservedItemViewType(int i4) {
        return i4 == 10000 || i4 == 10001 || A.contains(Integer.valueOf(i4));
    }

    private void preload() {
        if (!j.j(getContext()) || this.f15500b || !this.f15507i || this.f15511m || this.f15501c || getLastVisiblePosition() < getTotalItemCount() - this.f15515q) {
            return;
        }
        this.f15500b = true;
        this.f15511m = true;
        this.f15510l.setState(2);
        g gVar = this.f15505g;
        if (gVar != null) {
            gVar.onLoadMore();
        }
    }

    public void addHeaderView(View view) {
        A.add(Integer.valueOf(this.f15502d.size() + 10002));
        this.f15502d.add(view);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f15516r.computeScrollOffset()) {
            if (this.f15518t != 0) {
                this.f15510l.setBottomMargin(this.f15516r.getCurrY());
            }
            postInvalidate();
        }
        super.computeScroll();
    }

    void enablePtrFrameLayout(boolean z4) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i4, int i5) {
        double d5 = i5;
        double d6 = this.f15514p;
        Double.isNaN(d5);
        return super.fling(i4, (int) (d5 * d6));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    @Nullable
    public RecyclerView.Adapter getAdapter() {
        WrapAdapter wrapAdapter = this.f15503e;
        if (wrapAdapter == null) {
            return null;
        }
        return wrapAdapter.getAdapter();
    }

    public View getEmptyView() {
        return this.f15509k;
    }

    public int getFirstCompletelyVisiblePosition() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.findLastVisibleItemPosition();
            return gridLayoutManager.findFirstCompletelyVisibleItemPosition();
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
            staggeredGridLayoutManager.findLastVisibleItemPositions(iArr);
            findMax(iArr);
            staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(iArr);
            return findMax(iArr);
        } else {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            linearLayoutManager.findLastVisibleItemPosition();
            return linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        }
    }

    public int getFirstVisiblePosition() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.findLastVisibleItemPosition();
            return gridLayoutManager.findFirstVisibleItemPosition();
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
            staggeredGridLayoutManager.findLastVisibleItemPositions(iArr);
            findMax(iArr);
            staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
            return findMax(iArr);
        } else {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            linearLayoutManager.findLastVisibleItemPosition();
            return linearLayoutManager.findFirstVisibleItemPosition();
        }
    }

    public int getLastCompletelyVisiblePosition() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            int findLastCompletelyVisibleItemPosition = gridLayoutManager.findLastCompletelyVisibleItemPosition();
            gridLayoutManager.findFirstVisibleItemPosition();
            return findLastCompletelyVisibleItemPosition;
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
            staggeredGridLayoutManager.findLastCompletelyVisibleItemPositions(iArr);
            int findMax = findMax(iArr);
            staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
            findMax(iArr);
            return findMax;
        } else {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int findLastCompletelyVisibleItemPosition2 = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            linearLayoutManager.findFirstVisibleItemPosition();
            return findLastCompletelyVisibleItemPosition2;
        }
    }

    public int getLastVisiblePosition() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            int findLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
            gridLayoutManager.findFirstVisibleItemPosition();
            return findLastVisibleItemPosition;
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
            staggeredGridLayoutManager.findLastVisibleItemPositions(iArr);
            int findMax = findMax(iArr);
            staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
            findMax(iArr);
            return findMax;
        } else {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int findLastVisibleItemPosition2 = linearLayoutManager.findLastVisibleItemPosition();
            linearLayoutManager.findFirstVisibleItemPosition();
            return findLastVisibleItemPosition2;
        }
    }

    public RecyclerView.OnScrollListener getScrollListener() {
        return this.f15517s;
    }

    int getTotalItemCount() {
        return (getAdapter().getItemCount() - 1) - this.f15502d.size();
    }

    public RecyclerView.Adapter getXRecycleviewWrapAdapter() {
        return this.f15503e.getAdapter();
    }

    public void hidePullLoad() {
        this.f15507i = false;
        this.f15510l.a();
    }

    boolean isRefreshEnable() {
        return this.f15513o == AppBarStateChangeListener.State.EXPANDED && getScrollX() <= 0;
    }

    public void loadMoreComplete() {
        this.f15500b = false;
        stopLoadMore();
    }

    public boolean o() {
        return this.f15501c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        AppBarLayout appBarLayout;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        while (parent != null && !(parent instanceof CoordinatorLayout)) {
            parent = parent.getParent();
        }
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
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
                appBarLayout.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new e());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i4) {
        int findLastVisibleItemPosition;
        super.onScrollStateChanged(i4);
        if (i4 != 0 || this.f15505g == null || this.f15500b || !this.f15507i) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            findLastVisibleItemPosition = ((GridLayoutManager) layoutManager).findLastVisibleItemPosition();
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
            staggeredGridLayoutManager.findLastVisibleItemPositions(iArr);
            findLastVisibleItemPosition = findMax(iArr);
        } else {
            findLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        PtrFrameLayout ptrFrameLayout = this.f15519u;
        boolean l4 = ptrFrameLayout != null ? ptrFrameLayout.l() : false;
        if (layoutManager.getChildCount() > 0 && findLastVisibleItemPosition >= this.f15515q && layoutManager.getItemCount() > layoutManager.getChildCount() && !this.f15501c && !l4) {
            preload();
        }
        RecyclerView.OnScrollListener onScrollListener = this.f15517s;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(this, i4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f15504f == -1.0f) {
            this.f15504f = motionEvent.getRawY();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f15504f = motionEvent.getRawY();
        } else if (action != 2) {
            this.f15504f = -1.0f;
            if (getLastVisiblePosition() == getTotalItemCount() && !this.f15501c) {
                startLoadMore();
            }
            resetFooterHeight();
        } else {
            float rawY = motionEvent.getRawY() - this.f15504f;
            this.f15504f = motionEvent.getRawY();
            if (getLastVisiblePosition() == getTotalItemCount() && ((this.f15510l.getBottomMargin() > 0 || rawY < 0.0f) && !this.f15511m && this.f15507i && !this.f15501c)) {
                updateFooterHeight((-rawY) / 2.0f);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void refreshComplete() {
        PtrFrameLayout ptrFrameLayout = this.f15519u;
        if (ptrFrameLayout != null) {
            ptrFrameLayout.C();
        }
        setNoMoreView(false);
    }

    public void reset() {
        setNoMoreView(false);
        loadMoreComplete();
        refreshComplete();
    }

    protected void resetFooterHeight() {
        int bottomMargin = this.f15510l.getBottomMargin();
        if (bottomMargin > 0) {
            this.f15518t = 1;
            this.f15516r.startScroll(0, bottomMargin, 0, -bottomMargin, 400);
            invalidate();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        WrapAdapter wrapAdapter = new WrapAdapter(adapter);
        this.f15503e = wrapAdapter;
        super.setAdapter(wrapAdapter);
        if (!adapter.hasObservers()) {
            adapter.registerAdapterDataObserver(this.f15512n);
        }
        this.f15512n.onChanged();
    }

    public void setCanLoadMore() {
        this.f15510l.setState(0);
        this.f15507i = true;
        this.f15510l.setOnClickListener(null);
    }

    public void setEmptyView(View view) {
        this.f15509k = view;
        this.f15512n.onChanged();
    }

    public void setFlingScale(double d5) {
        this.f15514p = d5;
    }

    public void setLoadingListener(g gVar) {
        this.f15505g = gVar;
    }

    public void setLoadingMoreEnabled(boolean z4) {
        this.f15507i = z4;
        if (z4) {
            enableLoadingMoreView();
        } else {
            disableLoadingMoreView();
        }
    }

    public void setNoMore() {
        View findViewById;
        stopLoadMore();
        this.f15510l.f();
        this.f15510l.setState(7);
        this.f15511m = false;
        this.f15501c = true;
        this.f15510l.setOnClickListener(null);
        try {
            View childAt = this.f15510l.getChildAt(0);
            if (!(childAt instanceof LinearLayout) || (findViewById = childAt.findViewById(R.id.xlistview_footer_refresh_textview)) == null) {
                return;
            }
            findViewById.setOnClickListener(new c());
        } catch (Exception unused) {
        }
    }

    public void setNoMoreView(boolean z4) {
        this.f15511m = false;
        this.f15501c = z4;
        if (z4) {
            setNoMore();
        } else {
            setLoadingMoreEnabled(this.f15507i);
        }
    }

    public void setPreLoadCount(int i4) {
        this.f15515q = i4;
    }

    public void setPtrFrameLayout(PtrFrameLayout ptrFrameLayout) {
        if (ptrFrameLayout != null) {
            this.f15519u = ptrFrameLayout;
            ptrFrameLayout.setPtrHandler(this.f15520v);
        } else if (getParent() != null && (getParent() instanceof PtrFrameLayout)) {
            PtrFrameLayout ptrFrameLayout2 = (PtrFrameLayout) getParent();
            this.f15519u = ptrFrameLayout2;
            ptrFrameLayout2.setPtrHandler(this.f15520v);
        }
        PtrFrameLayout ptrFrameLayout3 = this.f15519u;
        if (ptrFrameLayout3 != null) {
            ptrFrameLayout3.j(true);
        }
    }

    public void setPullRefreshEnabled(boolean z4) {
        this.f15506h = z4;
        setPtrFrameLayout(null);
    }

    public void setRefreshing(boolean z4) {
        PtrFrameLayout ptrFrameLayout;
        if (z4 && this.f15506h && (ptrFrameLayout = this.f15519u) != null) {
            ptrFrameLayout.f();
        }
    }

    public void setScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        this.f15517s = onScrollListener;
    }

    public void showHeaderLoading() {
        PtrFrameLayout ptrFrameLayout = this.f15519u;
        if (ptrFrameLayout != null) {
            ptrFrameLayout.f();
        }
    }

    public void showPullLoad() {
        this.f15507i = true;
        this.f15510l.f();
    }

    public synchronized void startLoadMore() {
        preload();
    }

    public void stopLoadMore() {
        if (this.f15511m && this.f15507i) {
            this.f15511m = false;
            this.f15500b = false;
            if (this.f15501c) {
                this.f15510l.setState(7);
            } else {
                this.f15510l.setState(0);
            }
        }
    }

    public void stopRefresh() {
        PtrFrameLayout ptrFrameLayout = this.f15519u;
        if (ptrFrameLayout == null || !(ptrFrameLayout instanceof PtrFrameLayout)) {
            return;
        }
        ptrFrameLayout.C();
    }

    protected void updateFooterHeight(float f5) {
        int bottomMargin = this.f15510l.getBottomMargin() + ((int) f5);
        if (this.f15507i && !this.f15511m) {
            if (bottomMargin > 50) {
                this.f15510l.setState(1);
            } else {
                this.f15510l.setState(0);
            }
        }
        this.f15510l.setBottomMargin(bottomMargin);
    }

    public XRecyclerView2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        init();
    }

    public XRecyclerView2(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f15500b = false;
        this.f15501c = false;
        this.f15502d = new ArrayList<>();
        this.f15504f = -1.0f;
        this.f15506h = true;
        this.f15507i = true;
        this.f15508j = 0;
        this.f15512n = new f(this, null);
        this.f15513o = AppBarStateChangeListener.State.EXPANDED;
        this.f15514p = 1.0d;
        this.f15515q = 0;
        this.f15520v = new a();
        init();
    }

    /* loaded from: classes3.dex */
    public class WrapAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        private boolean f15521a = false;

        /* renamed from: b  reason: collision with root package name */
        private RecyclerView.Adapter f15522b;

        /* loaded from: classes3.dex */
        class a extends GridLayoutManager.SpanSizeLookup {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ GridLayoutManager f15524a;

            a(GridLayoutManager gridLayoutManager) {
                this.f15524a = gridLayoutManager;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i4) {
                if (WrapAdapter.this.isHeader(i4) || WrapAdapter.this.isFooter(i4) || WrapAdapter.this.isRefreshHeader(i4)) {
                    return this.f15524a.getSpanCount();
                }
                return 1;
            }
        }

        /* loaded from: classes3.dex */
        private class b extends RecyclerView.ViewHolder {
            public b(View view) {
                super(view);
            }
        }

        public WrapAdapter(RecyclerView.Adapter adapter) {
            this.f15522b = adapter;
        }

        private void refreshLoadMoreState() {
            XRecyclerView2 xRecyclerView2 = XRecyclerView2.this;
            if (xRecyclerView2.f15510l != null) {
                if (xRecyclerView2.f15501c) {
                    XRecyclerView2.this.f15510l.setState(7);
                    return;
                }
                XRecyclerView2 xRecyclerView22 = XRecyclerView2.this;
                if (xRecyclerView22.f15511m) {
                    xRecyclerView22.f15510l.setState(2);
                } else {
                    xRecyclerView22.f15510l.setState(0);
                }
            }
        }

        public RecyclerView.Adapter getAdapter() {
            return this.f15522b;
        }

        public int getHeadersCount() {
            return XRecyclerView2.this.f15502d.size();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            int headersCount;
            int headersCount2;
            int itemCount;
            int i4;
            int i5;
            if (XRecyclerView2.this.f15507i) {
                int i6 = this.f15521a ? 2 : 1;
                if (this.f15522b != null) {
                    headersCount2 = getHeadersCount();
                    itemCount = this.f15522b.getItemCount();
                    i5 = i6;
                    headersCount = headersCount2 + itemCount;
                    i4 = i5;
                } else {
                    headersCount = getHeadersCount();
                    i4 = i6;
                }
            } else {
                boolean z4 = this.f15521a;
                if (this.f15522b != null) {
                    headersCount2 = getHeadersCount();
                    itemCount = this.f15522b.getItemCount();
                    i5 = z4;
                    headersCount = headersCount2 + itemCount;
                    i4 = i5;
                } else {
                    headersCount = getHeadersCount();
                    i4 = z4;
                }
            }
            return headersCount + i4;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i4) {
            int headersCount;
            boolean z4 = this.f15521a;
            if (this.f15522b == null || i4 < getHeadersCount() + (z4 ? 1 : 0) || (headersCount = i4 - (getHeadersCount() + (z4 ? 1 : 0))) >= this.f15522b.getItemCount()) {
                return -1L;
            }
            return this.f15522b.getItemId(headersCount);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i4) {
            RecyclerView.Adapter adapter = this.f15522b;
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            int headersCount = i4 - (getHeadersCount() + (this.f15521a ? 1 : 0));
            if (headersCount < itemCount && XRecyclerView2.this.isReservedItemViewType(this.f15522b.getItemViewType(headersCount))) {
                throw new IllegalStateException("XRecyclerView require itemViewType in adapter should be less than 10000 ");
            }
            if (isRefreshHeader(i4) && this.f15521a) {
                return 10000;
            }
            if (isHeader(i4)) {
                if (this.f15521a) {
                    i4--;
                }
                return ((Integer) XRecyclerView2.A.get(i4)).intValue();
            } else if (isFooter(i4)) {
                return 10001;
            } else {
                if (headersCount < itemCount) {
                    return this.f15522b.getItemViewType(headersCount);
                }
                return 0;
            }
        }

        public boolean isFooter(int i4) {
            return XRecyclerView2.this.f15507i && i4 == getItemCount() - 1;
        }

        public boolean isHeader(int i4) {
            return this.f15521a && i4 >= 1 && i4 < XRecyclerView2.this.f15502d.size() + 1;
        }

        public boolean isRefreshHeader(int i4) {
            return this.f15521a && i4 == 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                gridLayoutManager.setSpanSizeLookup(new a(gridLayoutManager));
            }
            this.f15522b.onAttachedToRecyclerView(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i4) {
            if (isHeader(i4) || (isRefreshHeader(i4) && this.f15521a)) {
                return;
            }
            if (isFooter(i4)) {
                refreshLoadMoreState();
                return;
            }
            int headersCount = i4 - (getHeadersCount() + (this.f15521a ? 1 : 0));
            RecyclerView.Adapter adapter = this.f15522b;
            if (adapter == null || headersCount >= adapter.getItemCount()) {
                return;
            }
            this.f15522b.onBindViewHolder(viewHolder, headersCount);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
            if (i4 == 10000) {
                return null;
            }
            if (XRecyclerView2.this.isHeaderType(i4)) {
                return new b(XRecyclerView2.this.getHeaderViewByType(i4));
            }
            if (i4 == 10001) {
                return new b(XRecyclerView2.this.f15510l);
            }
            return this.f15522b.onCreateViewHolder(viewGroup, i4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
            this.f15522b.onDetachedFromRecyclerView(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
            return this.f15522b.onFailedToRecycleView(viewHolder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            super.onViewAttachedToWindow(viewHolder);
            ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
            if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) && (isHeader(viewHolder.getLayoutPosition()) || isRefreshHeader(viewHolder.getLayoutPosition()) || isFooter(viewHolder.getLayoutPosition()))) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
            }
            this.f15522b.onViewAttachedToWindow(viewHolder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            this.f15522b.onViewDetachedFromWindow(viewHolder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            this.f15522b.onViewRecycled(viewHolder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
            this.f15522b.registerAdapterDataObserver(adapterDataObserver);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
            this.f15522b.unregisterAdapterDataObserver(adapterDataObserver);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i4, @NonNull List<Object> list) {
            if (list == null) {
                super.onBindViewHolder(viewHolder, i4, list);
            } else if (isHeader(i4) || (isRefreshHeader(i4) && this.f15521a)) {
            } else {
                if (isFooter(i4)) {
                    refreshLoadMoreState();
                    return;
                }
                int headersCount = i4 - (getHeadersCount() + (this.f15521a ? 1 : 0));
                RecyclerView.Adapter adapter = this.f15522b;
                if (adapter == null || headersCount >= adapter.getItemCount()) {
                    return;
                }
                this.f15522b.onBindViewHolder(viewHolder, headersCount, list);
            }
        }
    }
}
