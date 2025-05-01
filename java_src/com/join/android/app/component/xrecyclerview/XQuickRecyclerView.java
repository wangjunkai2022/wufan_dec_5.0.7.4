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
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.customview.XListViewFooter;
import com.join.mgps.ptr.PtrFrameLayout;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class XQuickRecyclerView extends RecyclerView {
    private static final int A = 10002;
    private static List<Integer> B = new ArrayList();
    protected static final int C = 0;
    protected static final int D = 1;
    protected static final int E = 400;
    protected static final int F = 50;
    protected static final float G = 2.0f;

    /* renamed from: x  reason: collision with root package name */
    private static final float f15424x = 3.0f;

    /* renamed from: y  reason: collision with root package name */
    private static final int f15425y = 10000;

    /* renamed from: z  reason: collision with root package name */
    private static final int f15426z = 10001;

    /* renamed from: b  reason: collision with root package name */
    private boolean f15427b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15428c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<View> f15429d;

    /* renamed from: e  reason: collision with root package name */
    private WrapAdapter f15430e;

    /* renamed from: f  reason: collision with root package name */
    private float f15431f;

    /* renamed from: g  reason: collision with root package name */
    private g f15432g;

    /* renamed from: h  reason: collision with root package name */
    private f f15433h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f15434i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f15435j;

    /* renamed from: k  reason: collision with root package name */
    private int f15436k;

    /* renamed from: l  reason: collision with root package name */
    private View f15437l;

    /* renamed from: m  reason: collision with root package name */
    protected XListViewFooter f15438m;

    /* renamed from: n  reason: collision with root package name */
    protected boolean f15439n;

    /* renamed from: o  reason: collision with root package name */
    private final RecyclerView.AdapterDataObserver f15440o;

    /* renamed from: p  reason: collision with root package name */
    private AppBarStateChangeListener.State f15441p;

    /* renamed from: q  reason: collision with root package name */
    private double f15442q;

    /* renamed from: r  reason: collision with root package name */
    private int f15443r;

    /* renamed from: s  reason: collision with root package name */
    protected Scroller f15444s;

    /* renamed from: t  reason: collision with root package name */
    protected RecyclerView.OnScrollListener f15445t;

    /* renamed from: u  reason: collision with root package name */
    protected int f15446u;

    /* renamed from: v  reason: collision with root package name */
    private PtrFrameLayout f15447v;

    /* renamed from: w  reason: collision with root package name */
    private com.join.mgps.ptr.a f15448w;

    /* loaded from: classes3.dex */
    class a extends com.join.mgps.ptr.a {
        a() {
        }

        private void setFooterDefault() {
            XQuickRecyclerView xQuickRecyclerView = XQuickRecyclerView.this;
            xQuickRecyclerView.setLoadingMoreEnabled(xQuickRecyclerView.f15435j);
        }

        @Override // com.join.mgps.ptr.a, com.join.mgps.ptr.b
        public boolean checkCanDoRefresh(PtrFrameLayout ptrFrameLayout, View view, View view2) {
            AppBarStateChangeListener.State state = XQuickRecyclerView.this.f15441p;
            AppBarStateChangeListener.State state2 = AppBarStateChangeListener.State.EXPANDED;
            if (state != state2 || XQuickRecyclerView.this.f15433h == null) {
                return XQuickRecyclerView.this.f15441p == state2 && com.join.mgps.ptr.a.checkContentCanBePulledDown(ptrFrameLayout, view, view2);
            }
            return XQuickRecyclerView.this.f15433h.a();
        }

        @Override // com.join.mgps.ptr.b
        public void onRefreshBegin(PtrFrameLayout ptrFrameLayout) {
            setFooterDefault();
            if (XQuickRecyclerView.this.f15432g != null) {
                XQuickRecyclerView.this.f15432g.onRefresh();
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
            if (XQuickRecyclerView.this.f15428c) {
                return;
            }
            XQuickRecyclerView xQuickRecyclerView = XQuickRecyclerView.this;
            xQuickRecyclerView.f15439n = true;
            xQuickRecyclerView.f15438m.setState(2);
            if (XQuickRecyclerView.this.f15432g != null) {
                XQuickRecyclerView.this.f15432g.onLoadMore();
            }
        }
    }

    /* loaded from: classes3.dex */
    class d extends AppBarStateChangeListener {
        d() {
        }

        @Override // com.join.android.app.component.xrecyclerview.AppBarStateChangeListener
        public void onStateChanged(AppBarLayout appBarLayout, AppBarStateChangeListener.State state) {
            XQuickRecyclerView.this.f15441p = state;
        }
    }

    /* loaded from: classes3.dex */
    private class e extends RecyclerView.AdapterDataObserver {
        private e() {
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            RecyclerView.Adapter adapter = XQuickRecyclerView.this.getAdapter();
            if (adapter != null && XQuickRecyclerView.this.f15437l != null) {
                ?? r12 = XQuickRecyclerView.this.f15434i;
                int i4 = r12;
                if (XQuickRecyclerView.this.f15435j) {
                    i4 = r12 + 1;
                }
                if (adapter.getItemCount() == i4) {
                    XQuickRecyclerView.this.f15437l.setVisibility(0);
                    XQuickRecyclerView.this.setVisibility(8);
                } else {
                    XQuickRecyclerView.this.f15437l.setVisibility(8);
                    XQuickRecyclerView.this.setVisibility(0);
                }
            }
            if (XQuickRecyclerView.this.f15430e != null) {
                XQuickRecyclerView.this.f15430e.notifyDataSetChanged();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i4, int i5) {
            XQuickRecyclerView.this.f15430e.notifyItemRangeChanged(i4, i5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i4, int i5) {
            XQuickRecyclerView.this.f15430e.notifyItemRangeInserted(i4, i5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i4, int i5, int i6) {
            XQuickRecyclerView.this.f15430e.notifyItemMoved(i4, i5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i4, int i5) {
            XQuickRecyclerView.this.f15430e.notifyItemRangeRemoved(i4, i5);
        }

        /* synthetic */ e(XQuickRecyclerView xQuickRecyclerView, a aVar) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i4, int i5, Object obj) {
            XQuickRecyclerView.this.f15430e.notifyItemRangeChanged(i4, i5, obj);
        }
    }

    /* loaded from: classes3.dex */
    public interface f {
        boolean a();
    }

    /* loaded from: classes3.dex */
    public interface g {
        void onLoadMore();

        void onRefresh();
    }

    public XQuickRecyclerView(Context context) {
        this(context, null);
        init();
    }

    private void disableLoadingMoreView() {
        this.f15438m.a();
        this.f15438m.setOnClickListener(null);
    }

    private void enableLoadingMoreView() {
        this.f15439n = false;
        this.f15438m.f();
        this.f15438m.setState(0);
        this.f15438m.setOnClickListener(new c());
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

    private int findMin(int[] iArr) {
        int i4 = iArr[0];
        for (int i5 : iArr) {
            if (i5 < i4) {
                i4 = i5;
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getHeaderViewByType(int i4) {
        if (isHeaderType(i4)) {
            return this.f15429d.get(i4 - 10002);
        }
        return null;
    }

    private void init() {
        this.f15444s = new Scroller(getContext(), new AccelerateInterpolator());
        addOnScrollListener(new b());
        if (this.f15434i) {
            setPtrFrameLayout(null);
        }
        XListViewFooter xListViewFooter = new XListViewFooter(getContext());
        xListViewFooter.setState(0);
        this.f15438m = xListViewFooter;
        setLoadingMoreEnabled(this.f15435j);
        this.f15438m.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isHeaderType(int i4) {
        return this.f15429d.size() > 0 && B.contains(Integer.valueOf(i4));
    }

    private boolean isOnTop() {
        return this.f15447v != null && getFirstVisiblePosition() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isReservedItemViewType(int i4) {
        return i4 == 10000 || i4 == 10001 || B.contains(Integer.valueOf(i4));
    }

    private void preload() {
        if (!j.j(getContext()) || this.f15427b || !this.f15435j || this.f15439n || this.f15428c || getLastVisiblePosition() < getTotalItemCount() - this.f15443r) {
            return;
        }
        this.f15427b = true;
        this.f15439n = true;
        this.f15438m.setState(2);
        g gVar = this.f15432g;
        if (gVar != null) {
            gVar.onLoadMore();
        }
    }

    public void addHeaderView(View view) {
        B.add(Integer.valueOf(this.f15429d.size() + 10002));
        this.f15429d.add(view);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f15444s.computeScrollOffset()) {
            if (this.f15446u != 0) {
                this.f15438m.setBottomMargin(this.f15444s.getCurrY());
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
        double d6 = this.f15442q;
        Double.isNaN(d5);
        return super.fling(i4, (int) (d5 * d6));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    @Nullable
    public RecyclerView.Adapter getAdapter() {
        WrapAdapter wrapAdapter = this.f15430e;
        if (wrapAdapter == null) {
            return null;
        }
        return wrapAdapter.getAdapter();
    }

    public View getEmptyView() {
        return this.f15437l;
    }

    public int getFirstCompletelyVisiblePosition() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
            staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(iArr);
            return findMin(iArr);
        }
        return ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
    }

    public int getFirstVisiblePosition() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).findFirstVisibleItemPosition();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
            staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
            return findMin(iArr);
        }
        return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
    }

    public int getLastCompletelyVisiblePosition() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
            staggeredGridLayoutManager.findLastCompletelyVisibleItemPositions(iArr);
            return findMax(iArr);
        }
        return ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
    }

    public int getLastVisiblePosition() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
            staggeredGridLayoutManager.findLastVisibleItemPositions(iArr);
            return findMax(iArr);
        }
        return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
    }

    public RecyclerView.OnScrollListener getScrollListener() {
        return this.f15445t;
    }

    int getTotalItemCount() {
        return (getAdapter().getItemCount() - 1) - this.f15429d.size();
    }

    public RecyclerView.Adapter getXRecycleviewWrapAdapter() {
        return this.f15430e.getAdapter();
    }

    public void hidePullLoad() {
        this.f15435j = false;
        this.f15438m.a();
    }

    boolean isRefreshEnable() {
        return this.f15441p == AppBarStateChangeListener.State.EXPANDED && getScrollX() <= 0;
    }

    public void loadMoreComplete() {
        this.f15427b = false;
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
        if (i4 != 0 || this.f15432g == null || this.f15427b || !this.f15435j) {
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
        PtrFrameLayout ptrFrameLayout = this.f15447v;
        boolean l4 = ptrFrameLayout != null ? ptrFrameLayout.l() : false;
        if (layoutManager.getChildCount() > 0 && findLastVisibleItemPosition >= this.f15443r && !this.f15428c && !l4) {
            preload();
        }
        RecyclerView.OnScrollListener onScrollListener = this.f15445t;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(this, i4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f15431f == -1.0f) {
            this.f15431f = motionEvent.getRawY();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f15431f = motionEvent.getRawY();
        } else if (action != 2) {
            this.f15431f = -1.0f;
            if (getLastVisiblePosition() == getTotalItemCount() && !this.f15428c) {
                startLoadMore();
            }
            resetFooterHeight();
        } else {
            float rawY = motionEvent.getRawY() - this.f15431f;
            this.f15431f = motionEvent.getRawY();
            if (getLastVisiblePosition() == getTotalItemCount() && ((this.f15438m.getBottomMargin() > 0 || rawY < 0.0f) && !this.f15439n && this.f15435j && !this.f15428c)) {
                updateFooterHeight((-rawY) / 2.0f);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void refreshComplete() {
        PtrFrameLayout ptrFrameLayout = this.f15447v;
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
        int bottomMargin = this.f15438m.getBottomMargin();
        if (bottomMargin > 0) {
            this.f15446u = 1;
            this.f15444s.startScroll(0, bottomMargin, 0, -bottomMargin, 400);
            invalidate();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        WrapAdapter wrapAdapter = new WrapAdapter(adapter);
        this.f15430e = wrapAdapter;
        super.setAdapter(wrapAdapter);
        if (!adapter.hasObservers()) {
            adapter.registerAdapterDataObserver(this.f15440o);
        }
        this.f15440o.onChanged();
    }

    public void setDoRefreshListener(f fVar) {
        this.f15433h = fVar;
    }

    public void setEmptyView(View view) {
        this.f15437l = view;
        this.f15440o.onChanged();
    }

    public void setFlingScale(double d5) {
        this.f15442q = d5;
    }

    public void setLoadingListener(g gVar) {
        this.f15432g = gVar;
    }

    public void setLoadingMoreEnabled(boolean z4) {
        this.f15435j = z4;
        if (z4) {
            enableLoadingMoreView();
        } else {
            disableLoadingMoreView();
        }
    }

    public void setNoMore() {
        stopLoadMore();
        this.f15438m.f();
        this.f15438m.setState(3);
        this.f15439n = false;
        this.f15428c = true;
        this.f15438m.setOnClickListener(null);
    }

    public void setNoMoreView(boolean z4) {
        this.f15439n = false;
        this.f15428c = z4;
        if (z4) {
            setNoMore();
        } else {
            setLoadingMoreEnabled(this.f15435j);
        }
    }

    public void setPreLoadCount(int i4) {
        this.f15443r = i4;
    }

    public void setPtrFrameLayout(PtrFrameLayout ptrFrameLayout) {
        if (ptrFrameLayout != null) {
            this.f15447v = ptrFrameLayout;
            ptrFrameLayout.setPtrHandler(this.f15448w);
        } else if (getParent() != null && (getParent() instanceof PtrFrameLayout)) {
            PtrFrameLayout ptrFrameLayout2 = (PtrFrameLayout) getParent();
            this.f15447v = ptrFrameLayout2;
            ptrFrameLayout2.setPtrHandler(this.f15448w);
        }
        PtrFrameLayout ptrFrameLayout3 = this.f15447v;
        if (ptrFrameLayout3 != null) {
            ptrFrameLayout3.j(true);
        }
    }

    public void setPullRefreshEnabled(boolean z4) {
        this.f15434i = z4;
        if (z4) {
            return;
        }
        setPtrFrameLayout(null);
    }

    public void setRefreshing(boolean z4) {
        PtrFrameLayout ptrFrameLayout;
        if (z4 && this.f15434i && (ptrFrameLayout = this.f15447v) != null) {
            ptrFrameLayout.f();
        }
    }

    public void setScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        this.f15445t = onScrollListener;
    }

    public void showHeaderLoading() {
        PtrFrameLayout ptrFrameLayout = this.f15447v;
        if (ptrFrameLayout != null) {
            ptrFrameLayout.f();
        }
    }

    public void showPullLoad() {
        this.f15435j = true;
        this.f15438m.f();
    }

    public synchronized void startLoadMore() {
        preload();
    }

    public void stopLoadMore() {
        if (this.f15439n && this.f15435j) {
            this.f15439n = false;
            this.f15427b = false;
            if (this.f15428c) {
                this.f15438m.setState(3);
            } else {
                this.f15438m.setState(0);
            }
        }
    }

    public void stopRefresh() {
        PtrFrameLayout ptrFrameLayout = this.f15447v;
        if (ptrFrameLayout == null || !(ptrFrameLayout instanceof PtrFrameLayout)) {
            return;
        }
        ptrFrameLayout.C();
    }

    protected void updateFooterHeight(float f5) {
        int bottomMargin = this.f15438m.getBottomMargin() + ((int) f5);
        if (this.f15435j && !this.f15439n) {
            if (bottomMargin > 50) {
                this.f15438m.setState(1);
            } else {
                this.f15438m.setState(0);
            }
        }
        this.f15438m.setBottomMargin(bottomMargin);
    }

    public XQuickRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        init();
    }

    public XQuickRecyclerView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f15427b = false;
        this.f15428c = false;
        this.f15429d = new ArrayList<>();
        this.f15431f = -1.0f;
        this.f15434i = true;
        this.f15435j = true;
        this.f15436k = 0;
        this.f15440o = new e(this, null);
        this.f15441p = AppBarStateChangeListener.State.EXPANDED;
        this.f15442q = 1.0d;
        this.f15443r = 0;
        this.f15448w = new a();
        init();
    }

    /* loaded from: classes3.dex */
    public class WrapAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        private boolean f15449a = false;

        /* renamed from: b  reason: collision with root package name */
        private RecyclerView.Adapter f15450b;

        /* loaded from: classes3.dex */
        class a extends GridLayoutManager.SpanSizeLookup {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ GridLayoutManager f15452a;

            a(GridLayoutManager gridLayoutManager) {
                this.f15452a = gridLayoutManager;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i4) {
                if (WrapAdapter.this.isHeader(i4) || WrapAdapter.this.isFooter(i4) || WrapAdapter.this.isRefreshHeader(i4)) {
                    return this.f15452a.getSpanCount();
                }
                return 1;
            }
        }

        /* loaded from: classes3.dex */
        private class b extends BaseViewHolder {
            public b(View view) {
                super(view);
            }
        }

        public WrapAdapter(RecyclerView.Adapter adapter) {
            this.f15450b = adapter;
        }

        private void refreshLoadMoreState() {
            XQuickRecyclerView xQuickRecyclerView = XQuickRecyclerView.this;
            if (xQuickRecyclerView.f15438m != null) {
                if (xQuickRecyclerView.f15428c) {
                    XQuickRecyclerView.this.f15438m.setState(3);
                    return;
                }
                XQuickRecyclerView xQuickRecyclerView2 = XQuickRecyclerView.this;
                if (xQuickRecyclerView2.f15439n) {
                    xQuickRecyclerView2.f15438m.setState(2);
                } else {
                    xQuickRecyclerView2.f15438m.setState(0);
                }
            }
        }

        public RecyclerView.Adapter getAdapter() {
            return this.f15450b;
        }

        public int getHeadersCount() {
            return XQuickRecyclerView.this.f15429d.size();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            int headersCount;
            int headersCount2;
            int itemCount;
            int i4;
            int i5;
            if (XQuickRecyclerView.this.f15435j) {
                int i6 = this.f15449a ? 2 : 1;
                if (this.f15450b != null) {
                    headersCount2 = getHeadersCount();
                    itemCount = this.f15450b.getItemCount();
                    i5 = i6;
                    headersCount = headersCount2 + itemCount;
                    i4 = i5;
                } else {
                    headersCount = getHeadersCount();
                    i4 = i6;
                }
            } else {
                boolean z4 = this.f15449a;
                if (this.f15450b != null) {
                    headersCount2 = getHeadersCount();
                    itemCount = this.f15450b.getItemCount();
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
            boolean z4 = this.f15449a;
            if (this.f15450b == null || i4 < getHeadersCount() + (z4 ? 1 : 0) || (headersCount = i4 - (getHeadersCount() + (z4 ? 1 : 0))) >= this.f15450b.getItemCount()) {
                return -1L;
            }
            return this.f15450b.getItemId(headersCount);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i4) {
            RecyclerView.Adapter adapter = this.f15450b;
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            int headersCount = i4 - (getHeadersCount() + (this.f15449a ? 1 : 0));
            if (headersCount < itemCount && XQuickRecyclerView.this.isReservedItemViewType(this.f15450b.getItemViewType(headersCount))) {
                throw new IllegalStateException("XRecyclerView require itemViewType in adapter should be less than 10000 ");
            }
            if (isRefreshHeader(i4) && this.f15449a) {
                return 10000;
            }
            if (isHeader(i4)) {
                if (this.f15449a) {
                    i4--;
                }
                return ((Integer) XQuickRecyclerView.B.get(i4)).intValue();
            } else if (isFooter(i4)) {
                return 10001;
            } else {
                if (headersCount < itemCount) {
                    return this.f15450b.getItemViewType(headersCount);
                }
                return 0;
            }
        }

        public boolean isFooter(int i4) {
            return XQuickRecyclerView.this.f15435j && i4 == getItemCount() - 1;
        }

        public boolean isHeader(int i4) {
            return this.f15449a && i4 >= 1 && i4 < XQuickRecyclerView.this.f15429d.size() + 1;
        }

        public boolean isRefreshHeader(int i4) {
            return this.f15449a && i4 == 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                gridLayoutManager.setSpanSizeLookup(new a(gridLayoutManager));
            }
            this.f15450b.onAttachedToRecyclerView(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i4) {
            if (isHeader(i4) || (isRefreshHeader(i4) && this.f15449a)) {
                return;
            }
            if (isFooter(i4)) {
                refreshLoadMoreState();
                return;
            }
            int headersCount = i4 - (getHeadersCount() + (this.f15449a ? 1 : 0));
            RecyclerView.Adapter adapter = this.f15450b;
            if (adapter == null || headersCount >= adapter.getItemCount()) {
                return;
            }
            this.f15450b.onBindViewHolder(viewHolder, headersCount);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
            if (i4 == 10000) {
                return null;
            }
            if (XQuickRecyclerView.this.isHeaderType(i4)) {
                return new b(XQuickRecyclerView.this.getHeaderViewByType(i4));
            }
            if (i4 == 10001) {
                return new b(XQuickRecyclerView.this.f15438m);
            }
            return this.f15450b.onCreateViewHolder(viewGroup, i4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
            this.f15450b.onDetachedFromRecyclerView(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
            return this.f15450b.onFailedToRecycleView(viewHolder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            super.onViewAttachedToWindow(viewHolder);
            ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
            if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) && (isHeader(viewHolder.getLayoutPosition()) || isRefreshHeader(viewHolder.getLayoutPosition()) || isFooter(viewHolder.getLayoutPosition()))) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
            }
            this.f15450b.onViewAttachedToWindow(viewHolder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            this.f15450b.onViewDetachedFromWindow(viewHolder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            this.f15450b.onViewRecycled(viewHolder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
            this.f15450b.registerAdapterDataObserver(adapterDataObserver);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
            this.f15450b.unregisterAdapterDataObserver(adapterDataObserver);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i4, @NonNull List<Object> list) {
            if (list == null) {
                super.onBindViewHolder(viewHolder, i4, list);
            } else if (isHeader(i4) || (isRefreshHeader(i4) && this.f15449a)) {
            } else {
                if (isFooter(i4)) {
                    refreshLoadMoreState();
                    return;
                }
                int headersCount = i4 - (getHeadersCount() + (this.f15449a ? 1 : 0));
                RecyclerView.Adapter adapter = this.f15450b;
                if (adapter == null || headersCount >= adapter.getItemCount()) {
                    return;
                }
                this.f15450b.onBindViewHolder(viewHolder, headersCount, list);
            }
        }
    }
}
