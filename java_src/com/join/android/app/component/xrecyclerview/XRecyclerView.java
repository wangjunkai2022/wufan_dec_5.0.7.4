package com.join.android.app.component.xrecyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
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
import com.join.mgps.customview.XListViewFooter;
import com.join.mgps.ptr.PtrFrameLayout;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class XRecyclerView extends RecyclerView {
    private static List<Integer> A = new ArrayList();
    protected static final int B = 0;
    protected static final int C = 1;
    protected static final int D = 400;
    protected static final int E = 50;
    protected static final float F = 2.0f;

    /* renamed from: w  reason: collision with root package name */
    private static final float f15460w = 3.0f;

    /* renamed from: x  reason: collision with root package name */
    private static final int f15461x = 10000;

    /* renamed from: y  reason: collision with root package name */
    private static final int f15462y = 10001;

    /* renamed from: z  reason: collision with root package name */
    private static final int f15463z = 10002;

    /* renamed from: b  reason: collision with root package name */
    private boolean f15464b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15465c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<View> f15466d;

    /* renamed from: e  reason: collision with root package name */
    private WrapAdapter f15467e;

    /* renamed from: f  reason: collision with root package name */
    private float f15468f;

    /* renamed from: g  reason: collision with root package name */
    private f f15469g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15470h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f15471i;

    /* renamed from: j  reason: collision with root package name */
    private int f15472j;

    /* renamed from: k  reason: collision with root package name */
    private View f15473k;

    /* renamed from: l  reason: collision with root package name */
    protected XListViewFooter f15474l;

    /* renamed from: m  reason: collision with root package name */
    protected boolean f15475m;

    /* renamed from: n  reason: collision with root package name */
    private final RecyclerView.AdapterDataObserver f15476n;

    /* renamed from: o  reason: collision with root package name */
    private AppBarStateChangeListener.State f15477o;

    /* renamed from: p  reason: collision with root package name */
    private double f15478p;

    /* renamed from: q  reason: collision with root package name */
    private int f15479q;

    /* renamed from: r  reason: collision with root package name */
    protected Scroller f15480r;

    /* renamed from: s  reason: collision with root package name */
    protected RecyclerView.OnScrollListener f15481s;

    /* renamed from: t  reason: collision with root package name */
    protected int f15482t;

    /* renamed from: u  reason: collision with root package name */
    private PtrFrameLayout f15483u;

    /* renamed from: v  reason: collision with root package name */
    private com.join.mgps.ptr.a f15484v;

    /* loaded from: classes3.dex */
    class a extends com.join.mgps.ptr.a {
        a() {
        }

        private void setFooterDefault() {
            XRecyclerView xRecyclerView = XRecyclerView.this;
            xRecyclerView.setLoadingMoreEnabled(xRecyclerView.f15471i);
        }

        @Override // com.join.mgps.ptr.a, com.join.mgps.ptr.b
        public boolean checkCanDoRefresh(PtrFrameLayout ptrFrameLayout, View view, View view2) {
            return XRecyclerView.this.f15477o == AppBarStateChangeListener.State.EXPANDED && com.join.mgps.ptr.a.checkContentCanBePulledDown(ptrFrameLayout, view, view2);
        }

        @Override // com.join.mgps.ptr.b
        public void onRefreshBegin(PtrFrameLayout ptrFrameLayout) {
            setFooterDefault();
            if (XRecyclerView.this.f15469g != null) {
                XRecyclerView.this.f15469g.onRefresh();
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
            if (XRecyclerView.this.f15465c) {
                return;
            }
            XRecyclerView xRecyclerView = XRecyclerView.this;
            xRecyclerView.f15475m = true;
            xRecyclerView.f15474l.setState(2);
            if (XRecyclerView.this.f15469g != null) {
                XRecyclerView.this.f15469g.onLoadMore();
            }
        }
    }

    /* loaded from: classes3.dex */
    class d extends AppBarStateChangeListener {
        d() {
        }

        @Override // com.join.android.app.component.xrecyclerview.AppBarStateChangeListener
        public void onStateChanged(AppBarLayout appBarLayout, AppBarStateChangeListener.State state) {
            XRecyclerView.this.f15477o = state;
        }
    }

    /* loaded from: classes3.dex */
    private class e extends RecyclerView.AdapterDataObserver {
        private e() {
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            RecyclerView.Adapter adapter = XRecyclerView.this.getAdapter();
            if (adapter != null && XRecyclerView.this.f15473k != null) {
                ?? r12 = XRecyclerView.this.f15470h;
                int i4 = r12;
                if (XRecyclerView.this.f15471i) {
                    i4 = r12 + 1;
                }
                if (adapter.getItemCount() == i4) {
                    XRecyclerView.this.f15473k.setVisibility(0);
                    XRecyclerView.this.setVisibility(8);
                } else {
                    XRecyclerView.this.f15473k.setVisibility(8);
                    XRecyclerView.this.setVisibility(0);
                }
            }
            if (XRecyclerView.this.f15467e != null) {
                XRecyclerView.this.f15467e.notifyDataSetChanged();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i4, int i5) {
            XRecyclerView.this.f15467e.notifyItemRangeChanged(i4, i5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i4, int i5) {
            XRecyclerView.this.f15467e.notifyItemRangeInserted(i4, i5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i4, int i5, int i6) {
            XRecyclerView.this.f15467e.notifyItemMoved(i4, i5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i4, int i5) {
            XRecyclerView.this.f15467e.notifyItemRangeRemoved(i4, i5);
        }

        /* synthetic */ e(XRecyclerView xRecyclerView, a aVar) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i4, int i5, Object obj) {
            XRecyclerView.this.f15467e.notifyItemRangeChanged(i4, i5, obj);
        }
    }

    /* loaded from: classes3.dex */
    public interface f {
        void onLoadMore();

        void onRefresh();
    }

    public XRecyclerView(Context context) {
        this(context, null);
        init();
    }

    private void disableLoadingMoreView() {
        this.f15474l.a();
        this.f15474l.setOnClickListener(null);
    }

    private void enableLoadingMoreView() {
        this.f15475m = false;
        this.f15474l.f();
        this.f15474l.setState(0);
        this.f15474l.setOnClickListener(new c());
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
            return this.f15466d.get(i4 - 10002);
        }
        return null;
    }

    private void init() {
        this.f15480r = new Scroller(getContext(), new AccelerateInterpolator());
        addOnScrollListener(new b());
        if (this.f15470h) {
            setPtrFrameLayout(null);
        }
        XListViewFooter xListViewFooter = new XListViewFooter(getContext());
        xListViewFooter.setState(0);
        this.f15474l = xListViewFooter;
        setLoadingMoreEnabled(this.f15471i);
        this.f15474l.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isHeaderType(int i4) {
        return this.f15466d.size() > 0 && A.contains(Integer.valueOf(i4));
    }

    private boolean isOnTop() {
        return this.f15483u != null && getFirstVisiblePosition() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isReservedItemViewType(int i4) {
        return i4 == 10000 || i4 == 10001 || A.contains(Integer.valueOf(i4));
    }

    private void preload() {
        if (!j.j(getContext()) || this.f15464b || !this.f15471i || this.f15475m || this.f15465c || getLastVisiblePosition() < getTotalItemCount() - this.f15479q) {
            return;
        }
        this.f15464b = true;
        this.f15475m = true;
        this.f15474l.setState(2);
        f fVar = this.f15469g;
        if (fVar != null) {
            fVar.onLoadMore();
        }
    }

    public void addHeaderView(View view) {
        A.add(Integer.valueOf(this.f15466d.size() + 10002));
        this.f15466d.add(view);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f15480r.computeScrollOffset()) {
            if (this.f15482t != 0) {
                this.f15474l.setBottomMargin(this.f15480r.getCurrY());
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
        double d6 = this.f15478p;
        Double.isNaN(d5);
        return super.fling(i4, (int) (d5 * d6));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    @Nullable
    public RecyclerView.Adapter getAdapter() {
        WrapAdapter wrapAdapter = this.f15467e;
        if (wrapAdapter == null) {
            return null;
        }
        return wrapAdapter.getAdapter();
    }

    public View getEmptyView() {
        return this.f15473k;
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
        return this.f15481s;
    }

    int getTotalItemCount() {
        return (getAdapter().getItemCount() - 1) - this.f15466d.size();
    }

    public RecyclerView.Adapter getXRecycleviewWrapAdapter() {
        return this.f15467e.getAdapter();
    }

    public void hidePullLoad() {
        this.f15471i = false;
        this.f15474l.a();
    }

    boolean isRefreshEnable() {
        return this.f15477o == AppBarStateChangeListener.State.EXPANDED && getScrollX() <= 0;
    }

    public void loadMoreComplete() {
        this.f15464b = false;
        stopLoadMore();
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
                appBarLayout.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new d());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i4) {
        int findLastVisibleItemPosition;
        super.onScrollStateChanged(i4);
        if (i4 != 0 || this.f15469g == null || this.f15464b || !this.f15471i) {
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
        PtrFrameLayout ptrFrameLayout = this.f15483u;
        boolean l4 = ptrFrameLayout != null ? ptrFrameLayout.l() : false;
        if (layoutManager.getChildCount() > 0 && findLastVisibleItemPosition >= this.f15479q && layoutManager.getItemCount() > layoutManager.getChildCount() && !this.f15465c && !l4) {
            preload();
        }
        RecyclerView.OnScrollListener onScrollListener = this.f15481s;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(this, i4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f15468f == -1.0f) {
            this.f15468f = motionEvent.getRawY();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f15468f = motionEvent.getRawY();
        } else if (action != 2) {
            this.f15468f = -1.0f;
            if (getLastVisiblePosition() == getTotalItemCount() && !this.f15465c) {
                startLoadMore();
            }
            resetFooterHeight();
        } else {
            float rawY = motionEvent.getRawY() - this.f15468f;
            this.f15468f = motionEvent.getRawY();
            if (getLastVisiblePosition() == getTotalItemCount() && ((this.f15474l.getBottomMargin() > 0 || rawY < 0.0f) && !this.f15475m && this.f15471i && !this.f15465c)) {
                updateFooterHeight((-rawY) / 2.0f);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void refreshComplete() {
        PtrFrameLayout ptrFrameLayout = this.f15483u;
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
        int bottomMargin = this.f15474l.getBottomMargin();
        if (bottomMargin > 0) {
            this.f15482t = 1;
            this.f15480r.startScroll(0, bottomMargin, 0, -bottomMargin, 400);
            invalidate();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        WrapAdapter wrapAdapter = new WrapAdapter(adapter);
        this.f15467e = wrapAdapter;
        super.setAdapter(wrapAdapter);
        if (!adapter.hasObservers()) {
            adapter.registerAdapterDataObserver(this.f15476n);
        }
        this.f15476n.onChanged();
    }

    public void setEmptyView(View view) {
        this.f15473k = view;
        this.f15476n.onChanged();
    }

    public void setFlingScale(double d5) {
        this.f15478p = d5;
    }

    public void setLoadingListener(f fVar) {
        this.f15469g = fVar;
    }

    public void setLoadingMoreEnabled(boolean z4) {
        this.f15471i = z4;
        if (z4) {
            enableLoadingMoreView();
        } else {
            disableLoadingMoreView();
        }
    }

    public void setNoMore() {
        stopLoadMore();
        this.f15474l.f();
        this.f15474l.setState(3);
        this.f15475m = false;
        this.f15465c = true;
        this.f15474l.setOnClickListener(null);
    }

    public void setNoMoreView(boolean z4) {
        this.f15475m = false;
        this.f15465c = z4;
        if (z4) {
            setNoMore();
        } else {
            setLoadingMoreEnabled(this.f15471i);
        }
    }

    public void setPreLoadCount(int i4) {
        this.f15479q = i4;
    }

    public void setPtrFrameLayout(PtrFrameLayout ptrFrameLayout) {
        if (ptrFrameLayout != null) {
            this.f15483u = ptrFrameLayout;
            ptrFrameLayout.setPtrHandler(this.f15484v);
        } else if (getParent() != null && (getParent() instanceof PtrFrameLayout)) {
            PtrFrameLayout ptrFrameLayout2 = (PtrFrameLayout) getParent();
            this.f15483u = ptrFrameLayout2;
            ptrFrameLayout2.setPtrHandler(this.f15484v);
        }
        PtrFrameLayout ptrFrameLayout3 = this.f15483u;
        if (ptrFrameLayout3 != null) {
            ptrFrameLayout3.j(true);
        }
    }

    public void setPullRefreshEnabled(boolean z4) {
        this.f15470h = z4;
        setPtrFrameLayout(null);
    }

    public void setRefreshing(boolean z4) {
        PtrFrameLayout ptrFrameLayout;
        if (z4 && this.f15470h && (ptrFrameLayout = this.f15483u) != null) {
            ptrFrameLayout.f();
        }
    }

    public void setScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        this.f15481s = onScrollListener;
    }

    public void showHeaderLoading() {
        PtrFrameLayout ptrFrameLayout = this.f15483u;
        if (ptrFrameLayout != null) {
            ptrFrameLayout.f();
        }
    }

    public void showPullLoad() {
        this.f15471i = true;
        this.f15474l.f();
    }

    public synchronized void startLoadMore() {
        preload();
    }

    public void stopLoadMore() {
        if (this.f15475m && this.f15471i) {
            this.f15475m = false;
            this.f15464b = false;
            if (this.f15465c) {
                this.f15474l.setState(3);
            } else {
                this.f15474l.setState(0);
            }
        }
    }

    public void stopRefresh() {
        PtrFrameLayout ptrFrameLayout = this.f15483u;
        if (ptrFrameLayout == null || !(ptrFrameLayout instanceof PtrFrameLayout)) {
            return;
        }
        ptrFrameLayout.C();
    }

    protected void updateFooterHeight(float f5) {
        int bottomMargin = this.f15474l.getBottomMargin() + ((int) f5);
        if (this.f15471i && !this.f15475m) {
            if (bottomMargin > 50) {
                this.f15474l.setState(1);
            } else {
                this.f15474l.setState(0);
            }
        }
        this.f15474l.setBottomMargin(bottomMargin);
    }

    public XRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        init();
    }

    public XRecyclerView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f15464b = false;
        this.f15465c = false;
        this.f15466d = new ArrayList<>();
        this.f15468f = -1.0f;
        this.f15470h = true;
        this.f15471i = true;
        this.f15472j = 0;
        this.f15476n = new e(this, null);
        this.f15477o = AppBarStateChangeListener.State.EXPANDED;
        this.f15478p = 1.0d;
        this.f15479q = 0;
        this.f15484v = new a();
        init();
    }

    /* loaded from: classes3.dex */
    public class WrapAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        private boolean f15485a = false;

        /* renamed from: b  reason: collision with root package name */
        private RecyclerView.Adapter f15486b;

        /* loaded from: classes3.dex */
        class a extends GridLayoutManager.SpanSizeLookup {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ GridLayoutManager f15488a;

            a(GridLayoutManager gridLayoutManager) {
                this.f15488a = gridLayoutManager;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i4) {
                if (WrapAdapter.this.isHeader(i4) || WrapAdapter.this.isFooter(i4) || WrapAdapter.this.isRefreshHeader(i4)) {
                    return this.f15488a.getSpanCount();
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
            this.f15486b = adapter;
        }

        private void refreshLoadMoreState() {
            XRecyclerView xRecyclerView = XRecyclerView.this;
            if (xRecyclerView.f15474l != null) {
                if (xRecyclerView.f15465c) {
                    XRecyclerView.this.f15474l.setState(3);
                    return;
                }
                XRecyclerView xRecyclerView2 = XRecyclerView.this;
                if (xRecyclerView2.f15475m) {
                    xRecyclerView2.f15474l.setState(2);
                } else {
                    xRecyclerView2.f15474l.setState(0);
                }
            }
        }

        public RecyclerView.Adapter getAdapter() {
            return this.f15486b;
        }

        public int getHeadersCount() {
            return XRecyclerView.this.f15466d.size();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            int headersCount;
            int headersCount2;
            int itemCount;
            int i4;
            int i5;
            if (XRecyclerView.this.f15471i) {
                int i6 = this.f15485a ? 2 : 1;
                if (this.f15486b != null) {
                    headersCount2 = getHeadersCount();
                    itemCount = this.f15486b.getItemCount();
                    i5 = i6;
                    headersCount = headersCount2 + itemCount;
                    i4 = i5;
                } else {
                    headersCount = getHeadersCount();
                    i4 = i6;
                }
            } else {
                boolean z4 = this.f15485a;
                if (this.f15486b != null) {
                    headersCount2 = getHeadersCount();
                    itemCount = this.f15486b.getItemCount();
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
            boolean z4 = this.f15485a;
            if (this.f15486b == null || i4 < getHeadersCount() + (z4 ? 1 : 0) || (headersCount = i4 - (getHeadersCount() + (z4 ? 1 : 0))) >= this.f15486b.getItemCount()) {
                return -1L;
            }
            return this.f15486b.getItemId(headersCount);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i4) {
            RecyclerView.Adapter adapter = this.f15486b;
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            int headersCount = i4 - (getHeadersCount() + (this.f15485a ? 1 : 0));
            if (headersCount < itemCount && XRecyclerView.this.isReservedItemViewType(this.f15486b.getItemViewType(headersCount))) {
                throw new IllegalStateException("XRecyclerView require itemViewType in adapter should be less than 10000 ");
            }
            if (isRefreshHeader(i4) && this.f15485a) {
                return 10000;
            }
            if (isHeader(i4)) {
                if (this.f15485a) {
                    i4--;
                }
                return ((Integer) XRecyclerView.A.get(i4)).intValue();
            } else if (isFooter(i4)) {
                return 10001;
            } else {
                if (headersCount < itemCount) {
                    return this.f15486b.getItemViewType(headersCount);
                }
                return 0;
            }
        }

        public boolean isFooter(int i4) {
            return XRecyclerView.this.f15471i && i4 == getItemCount() - 1;
        }

        public boolean isHeader(int i4) {
            return this.f15485a && i4 >= 1 && i4 < XRecyclerView.this.f15466d.size() + 1;
        }

        public boolean isRefreshHeader(int i4) {
            return this.f15485a && i4 == 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                gridLayoutManager.setSpanSizeLookup(new a(gridLayoutManager));
            }
            this.f15486b.onAttachedToRecyclerView(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i4) {
            if (isHeader(i4) || (isRefreshHeader(i4) && this.f15485a)) {
                return;
            }
            if (isFooter(i4)) {
                refreshLoadMoreState();
                return;
            }
            int headersCount = i4 - (getHeadersCount() + (this.f15485a ? 1 : 0));
            RecyclerView.Adapter adapter = this.f15486b;
            if (adapter == null || headersCount >= adapter.getItemCount()) {
                return;
            }
            this.f15486b.onBindViewHolder(viewHolder, headersCount);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
            if (i4 == 10000) {
                return null;
            }
            if (XRecyclerView.this.isHeaderType(i4)) {
                return new b(XRecyclerView.this.getHeaderViewByType(i4));
            }
            if (i4 == 10001) {
                return new b(XRecyclerView.this.f15474l);
            }
            return this.f15486b.onCreateViewHolder(viewGroup, i4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
            this.f15486b.onDetachedFromRecyclerView(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
            return this.f15486b.onFailedToRecycleView(viewHolder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            super.onViewAttachedToWindow(viewHolder);
            ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
            if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) && (isHeader(viewHolder.getLayoutPosition()) || isRefreshHeader(viewHolder.getLayoutPosition()) || isFooter(viewHolder.getLayoutPosition()))) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
            }
            this.f15486b.onViewAttachedToWindow(viewHolder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            this.f15486b.onViewDetachedFromWindow(viewHolder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            this.f15486b.onViewRecycled(viewHolder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
            this.f15486b.registerAdapterDataObserver(adapterDataObserver);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
            this.f15486b.unregisterAdapterDataObserver(adapterDataObserver);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i4, @NonNull List<Object> list) {
            if (list == null) {
                super.onBindViewHolder(viewHolder, i4, list);
            } else if (isHeader(i4) || (isRefreshHeader(i4) && this.f15485a)) {
            } else {
                if (isFooter(i4)) {
                    refreshLoadMoreState();
                    return;
                }
                int headersCount = i4 - (getHeadersCount() + (this.f15485a ? 1 : 0));
                RecyclerView.Adapter adapter = this.f15486b;
                if (adapter == null || headersCount >= adapter.getItemCount()) {
                    return;
                }
                this.f15486b.onBindViewHolder(viewHolder, headersCount, list);
            }
        }
    }
}
