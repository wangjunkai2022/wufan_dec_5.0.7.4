package com.join.kotlin.base.widget.recycleview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.widget.Scroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import com.join.android.app.common.utils.j;
import com.join.android.app.component.xrecyclerview.AppBarStateChangeListener;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.customview.XListViewFooter;
import com.join.mgps.ptr.PtrFrameLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: XQuickRecyclerView.kt */
/* loaded from: classes3.dex */
public final class XQuickRecyclerView extends RecyclerView {
    private static final float DRAG_RATE = 3.0f;
    private static final int HEADER_INIT_INDEX = 10002;
    protected static final float OFFSET_RADIO = 2.0f;
    protected static final int PULL_LOAD_MORE_DELTA = 50;
    protected static final int SCROLLBACK_FOOTER = 1;
    protected static final int SCROLLBACK_HEADER = 0;
    protected static final int SCROLL_DURATION = 400;
    private static final int TYPE_FOOTER = 10001;
    private static final int TYPE_REFRESH_HEADER = 10000;
    @NotNull
    private AppBarStateChangeListener.State appbarState;
    private boolean isLoadingData;
    private boolean isNoMore;
    private boolean loadingMoreEnabled;
    @NotNull
    private final RecyclerView.AdapterDataObserver mDataObserver;
    @Nullable
    private View mEmptyView;
    @Nullable
    private XListViewFooter mFooterView;
    @NotNull
    private final ArrayList<View> mHeaderViews;
    private float mLastY;
    @Nullable
    private LoadingListener mLoadingListener;
    private final int mPageCount;
    @Nullable
    private PtrFrameLayout mPtrFrameLayout;
    private boolean mPullLoading;
    private int mScrollBack;
    @Nullable
    private Scroller mScroller;
    @Nullable
    private WrapAdapter mWrapAdapter;
    private int preloadCount;
    @NotNull
    private final com.join.mgps.ptr.a ptrDefaultHandler;
    private boolean pullRefreshEnabled;
    private double scale;
    @Nullable
    private RecyclerView.OnScrollListener scrollListener;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final List<Integer> sHeaderTypes = new ArrayList();

    /* compiled from: XQuickRecyclerView.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: XQuickRecyclerView.kt */
    /* loaded from: classes3.dex */
    private final class DataObserver extends RecyclerView.AdapterDataObserver {
        public DataObserver() {
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            RecyclerView.Adapter adapter = XQuickRecyclerView.this.getAdapter();
            if (adapter != null && XQuickRecyclerView.this.mEmptyView != null) {
                ?? r12 = XQuickRecyclerView.this.pullRefreshEnabled;
                int i4 = r12;
                if (XQuickRecyclerView.this.loadingMoreEnabled) {
                    i4 = r12 + 1;
                }
                if (adapter.getItemCount() == i4) {
                    View view = XQuickRecyclerView.this.mEmptyView;
                    Intrinsics.checkNotNull(view);
                    view.setVisibility(0);
                    XQuickRecyclerView.this.setVisibility(8);
                } else {
                    View view2 = XQuickRecyclerView.this.mEmptyView;
                    Intrinsics.checkNotNull(view2);
                    view2.setVisibility(8);
                    XQuickRecyclerView.this.setVisibility(0);
                }
            }
            if (XQuickRecyclerView.this.mWrapAdapter != null) {
                WrapAdapter wrapAdapter = XQuickRecyclerView.this.mWrapAdapter;
                Intrinsics.checkNotNull(wrapAdapter);
                wrapAdapter.notifyDataSetChanged();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i4, int i5) {
            WrapAdapter wrapAdapter = XQuickRecyclerView.this.mWrapAdapter;
            Intrinsics.checkNotNull(wrapAdapter);
            wrapAdapter.notifyItemRangeChanged(i4, i5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i4, int i5) {
            WrapAdapter wrapAdapter = XQuickRecyclerView.this.mWrapAdapter;
            Intrinsics.checkNotNull(wrapAdapter);
            wrapAdapter.notifyItemRangeInserted(i4, i5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i4, int i5, int i6) {
            WrapAdapter wrapAdapter = XQuickRecyclerView.this.mWrapAdapter;
            Intrinsics.checkNotNull(wrapAdapter);
            wrapAdapter.notifyItemMoved(i4, i5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i4, int i5) {
            WrapAdapter wrapAdapter = XQuickRecyclerView.this.mWrapAdapter;
            Intrinsics.checkNotNull(wrapAdapter);
            wrapAdapter.notifyItemRangeRemoved(i4, i5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i4, int i5, @Nullable Object obj) {
            WrapAdapter wrapAdapter = XQuickRecyclerView.this.mWrapAdapter;
            Intrinsics.checkNotNull(wrapAdapter);
            wrapAdapter.notifyItemRangeChanged(i4, i5, obj);
        }
    }

    /* compiled from: XQuickRecyclerView.kt */
    /* loaded from: classes3.dex */
    public interface LoadingListener {
        void onLoadMore();

        void onRefresh();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XQuickRecyclerView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNull(context);
        this.mHeaderViews = new ArrayList<>();
        this.mLastY = -1.0f;
        this.pullRefreshEnabled = true;
        this.loadingMoreEnabled = true;
        this.mDataObserver = new DataObserver();
        this.appbarState = AppBarStateChangeListener.State.EXPANDED;
        this.scale = 1.0d;
        this.preloadCount = 5;
        this.ptrDefaultHandler = new com.join.mgps.ptr.a() { // from class: com.join.kotlin.base.widget.recycleview.XQuickRecyclerView$ptrDefaultHandler$1
            private final void setFooterDefault() {
                XQuickRecyclerView xQuickRecyclerView = XQuickRecyclerView.this;
                xQuickRecyclerView.setLoadingMoreEnabled(xQuickRecyclerView.loadingMoreEnabled);
            }

            @Override // com.join.mgps.ptr.a, com.join.mgps.ptr.b
            public boolean checkCanDoRefresh(@NotNull PtrFrameLayout frame, @NotNull View content, @NotNull View header) {
                AppBarStateChangeListener.State state;
                Intrinsics.checkNotNullParameter(frame, "frame");
                Intrinsics.checkNotNullParameter(content, "content");
                Intrinsics.checkNotNullParameter(header, "header");
                state = XQuickRecyclerView.this.appbarState;
                return state == AppBarStateChangeListener.State.EXPANDED && com.join.mgps.ptr.a.checkContentCanBePulledDown(frame, content, header);
            }

            @Override // com.join.mgps.ptr.b
            public void onRefreshBegin(@NotNull PtrFrameLayout frame) {
                XQuickRecyclerView.LoadingListener loadingListener;
                XQuickRecyclerView.LoadingListener loadingListener2;
                Intrinsics.checkNotNullParameter(frame, "frame");
                setFooterDefault();
                loadingListener = XQuickRecyclerView.this.mLoadingListener;
                if (loadingListener != null) {
                    loadingListener2 = XQuickRecyclerView.this.mLoadingListener;
                    Intrinsics.checkNotNull(loadingListener2);
                    loadingListener2.onRefresh();
                }
            }
        };
        init();
    }

    private final void disableLoadingMoreView() {
        XListViewFooter xListViewFooter = this.mFooterView;
        Intrinsics.checkNotNull(xListViewFooter);
        xListViewFooter.a();
        XListViewFooter xListViewFooter2 = this.mFooterView;
        Intrinsics.checkNotNull(xListViewFooter2);
        xListViewFooter2.setOnClickListener(null);
    }

    private final void enableLoadingMoreView() {
        this.mPullLoading = false;
        XListViewFooter xListViewFooter = this.mFooterView;
        Intrinsics.checkNotNull(xListViewFooter);
        xListViewFooter.f();
        XListViewFooter xListViewFooter2 = this.mFooterView;
        Intrinsics.checkNotNull(xListViewFooter2);
        xListViewFooter2.setState(0);
        XListViewFooter xListViewFooter3 = this.mFooterView;
        Intrinsics.checkNotNull(xListViewFooter3);
        xListViewFooter3.setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.base.widget.recycleview.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                XQuickRecyclerView.enableLoadingMoreView$lambda$0(XQuickRecyclerView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableLoadingMoreView$lambda$0(XQuickRecyclerView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isNoMore) {
            return;
        }
        this$0.mPullLoading = true;
        XListViewFooter xListViewFooter = this$0.mFooterView;
        Intrinsics.checkNotNull(xListViewFooter);
        xListViewFooter.setState(2);
        LoadingListener loadingListener = this$0.mLoadingListener;
        if (loadingListener != null) {
            Intrinsics.checkNotNull(loadingListener);
            loadingListener.onLoadMore();
        }
    }

    private final int findMax(int[] iArr) {
        int i4 = iArr[0];
        for (int i5 : iArr) {
            if (i5 > i4) {
                i4 = i5;
            }
        }
        return i4;
    }

    private final int findMin(int[] iArr) {
        int i4 = iArr[0];
        for (int i5 : iArr) {
            if (i5 < i4) {
                i4 = i5;
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getHeaderViewByType(int i4) {
        if (isHeaderType(i4)) {
            return this.mHeaderViews.get(i4 - 10002);
        }
        return null;
    }

    private final void init() {
        this.mScroller = new Scroller(getContext(), new AccelerateInterpolator());
        addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.join.kotlin.base.widget.recycleview.XQuickRecyclerView$init$1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i4) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, i4);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NotNull RecyclerView recyclerView, int i4, int i5) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, i4, i5);
            }
        });
        if (this.pullRefreshEnabled) {
            setPtrFrameLayout(null);
        }
        XListViewFooter xListViewFooter = new XListViewFooter(getContext());
        xListViewFooter.setState(0);
        this.mFooterView = xListViewFooter;
        setLoadingMoreEnabled(this.loadingMoreEnabled);
        XListViewFooter xListViewFooter2 = this.mFooterView;
        Intrinsics.checkNotNull(xListViewFooter2);
        xListViewFooter2.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isHeaderType(int i4) {
        return this.mHeaderViews.size() > 0 && sHeaderTypes.contains(Integer.valueOf(i4));
    }

    private final boolean isOnTop() {
        return this.mPtrFrameLayout != null && getFirstVisiblePosition() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isReservedItemViewType(int i4) {
        return i4 == 10000 || i4 == 10001 || sHeaderTypes.contains(Integer.valueOf(i4));
    }

    private final void preload() {
        if (!j.j(getContext()) || this.isLoadingData || !this.loadingMoreEnabled || this.mPullLoading || this.isNoMore || getLastVisiblePosition() < getTotalItemCount() - this.preloadCount) {
            return;
        }
        this.isLoadingData = true;
        this.mPullLoading = true;
        XListViewFooter xListViewFooter = this.mFooterView;
        Intrinsics.checkNotNull(xListViewFooter);
        xListViewFooter.setState(2);
        LoadingListener loadingListener = this.mLoadingListener;
        if (loadingListener != null) {
            Intrinsics.checkNotNull(loadingListener);
            loadingListener.onLoadMore();
        }
    }

    public final void addHeaderView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        sHeaderTypes.add(Integer.valueOf(this.mHeaderViews.size() + 10002));
        this.mHeaderViews.add(view);
    }

    @Override // android.view.View
    public void computeScroll() {
        Scroller scroller = this.mScroller;
        Intrinsics.checkNotNull(scroller);
        if (scroller.computeScrollOffset()) {
            if (this.mScrollBack != 0) {
                XListViewFooter xListViewFooter = this.mFooterView;
                Intrinsics.checkNotNull(xListViewFooter);
                Scroller scroller2 = this.mScroller;
                Intrinsics.checkNotNull(scroller2);
                xListViewFooter.setBottomMargin(scroller2.getCurrY());
            }
            postInvalidate();
        }
        super.computeScroll();
    }

    public final void enablePtrFrameLayout(boolean z4) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i4, int i5) {
        return super.fling(i4, i5 * ((int) this.scale));
    }

    @Nullable
    public final View getEmptyView() {
        return this.mEmptyView;
    }

    public final int getFirstCompletelyVisiblePosition() {
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
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        Intrinsics.checkNotNull(linearLayoutManager);
        return linearLayoutManager.findFirstCompletelyVisibleItemPosition();
    }

    public final int getFirstVisiblePosition() {
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
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        Intrinsics.checkNotNull(linearLayoutManager);
        return linearLayoutManager.findFirstVisibleItemPosition();
    }

    public final int getLastCompletelyVisiblePosition() {
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
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        Intrinsics.checkNotNull(linearLayoutManager);
        return linearLayoutManager.findLastCompletelyVisibleItemPosition();
    }

    public final int getLastVisiblePosition() {
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
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        Intrinsics.checkNotNull(linearLayoutManager);
        return linearLayoutManager.findLastVisibleItemPosition();
    }

    @Nullable
    protected final XListViewFooter getMFooterView() {
        return this.mFooterView;
    }

    protected final boolean getMPullLoading() {
        return this.mPullLoading;
    }

    protected final int getMScrollBack() {
        return this.mScrollBack;
    }

    @Nullable
    protected final Scroller getMScroller() {
        return this.mScroller;
    }

    public final boolean getNoMore() {
        return this.isNoMore;
    }

    @Nullable
    public final RecyclerView.OnScrollListener getScrollListener() {
        return this.scrollListener;
    }

    public final int getTotalItemCount() {
        RecyclerView.Adapter adapter = getAdapter();
        Intrinsics.checkNotNull(adapter);
        return (adapter.getItemCount() - 1) - this.mHeaderViews.size();
    }

    @Nullable
    public RecyclerView.Adapter<RecyclerView.ViewHolder> getWrappedAdapter() {
        RecyclerView.Adapter<RecyclerView.ViewHolder> adapter;
        WrapAdapter wrapAdapter = this.mWrapAdapter;
        if (wrapAdapter == null || (adapter = wrapAdapter.getAdapter()) == null) {
            return null;
        }
        return adapter;
    }

    public final void hidePullLoad() {
        this.loadingMoreEnabled = false;
        XListViewFooter xListViewFooter = this.mFooterView;
        Intrinsics.checkNotNull(xListViewFooter);
        xListViewFooter.a();
    }

    public final boolean isRefreshEnable() {
        return this.appbarState == AppBarStateChangeListener.State.EXPANDED && getScrollX() <= 0;
    }

    public final void loadMoreComplete() {
        this.isLoadingData = false;
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
            int childCount = coordinatorLayout.getChildCount();
            while (true) {
                childCount--;
                if (-1 >= childCount) {
                    appBarLayout = null;
                    break;
                }
                View childAt = coordinatorLayout.getChildAt(childCount);
                if (childAt instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) childAt;
                    break;
                }
            }
            if (appBarLayout != null) {
                appBarLayout.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new AppBarStateChangeListener() { // from class: com.join.kotlin.base.widget.recycleview.XQuickRecyclerView$onAttachedToWindow$1
                    @Override // com.join.android.app.component.xrecyclerview.AppBarStateChangeListener
                    public void onStateChanged(@NotNull AppBarLayout appBarLayout2, @NotNull AppBarStateChangeListener.State state) {
                        Intrinsics.checkNotNullParameter(appBarLayout2, "appBarLayout");
                        Intrinsics.checkNotNullParameter(state, "state");
                        XQuickRecyclerView.this.appbarState = state;
                    }
                });
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i4) {
        int findLastVisibleItemPosition;
        super.onScrollStateChanged(i4);
        if (i4 != 0 || this.mLoadingListener == null || this.isLoadingData || !this.loadingMoreEnabled) {
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
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            Intrinsics.checkNotNull(linearLayoutManager);
            findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        }
        boolean z4 = false;
        PtrFrameLayout ptrFrameLayout = this.mPtrFrameLayout;
        if (ptrFrameLayout != null) {
            Intrinsics.checkNotNull(ptrFrameLayout);
            z4 = ptrFrameLayout.l();
        }
        Intrinsics.checkNotNull(layoutManager);
        if (layoutManager.getChildCount() > 0 && findLastVisibleItemPosition >= this.preloadCount && !this.isNoMore && !z4) {
            preload();
        }
        RecyclerView.OnScrollListener onScrollListener = this.scrollListener;
        if (onScrollListener != null) {
            Intrinsics.checkNotNull(onScrollListener);
            onScrollListener.onScrollStateChanged(this, i4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (this.mLastY == -1.0f) {
            this.mLastY = ev.getRawY();
        }
        int action = ev.getAction();
        if (action == 0) {
            this.mLastY = ev.getRawY();
        } else if (action != 2) {
            this.mLastY = -1.0f;
            if (getLastVisiblePosition() == getTotalItemCount() && !this.isNoMore) {
                startLoadMore();
            }
            resetFooterHeight();
        } else {
            float rawY = ev.getRawY() - this.mLastY;
            this.mLastY = ev.getRawY();
            if (getLastVisiblePosition() == getTotalItemCount()) {
                XListViewFooter xListViewFooter = this.mFooterView;
                Intrinsics.checkNotNull(xListViewFooter);
                if ((xListViewFooter.getBottomMargin() > 0 || rawY < 0.0f) && !this.mPullLoading && this.loadingMoreEnabled && !this.isNoMore) {
                    updateFooterHeight((-rawY) / 2.0f);
                }
            }
        }
        return super.onTouchEvent(ev);
    }

    public final void refreshComplete() {
        PtrFrameLayout ptrFrameLayout = this.mPtrFrameLayout;
        if (ptrFrameLayout != null) {
            Intrinsics.checkNotNull(ptrFrameLayout);
            ptrFrameLayout.C();
        }
        setNoMoreView(false);
    }

    public final void reset() {
        setNoMoreView(false);
        loadMoreComplete();
        refreshComplete();
    }

    protected final void resetFooterHeight() {
        XListViewFooter xListViewFooter = this.mFooterView;
        Intrinsics.checkNotNull(xListViewFooter);
        int bottomMargin = xListViewFooter.getBottomMargin();
        if (bottomMargin > 0) {
            this.mScrollBack = 1;
            Scroller scroller = this.mScroller;
            Intrinsics.checkNotNull(scroller);
            scroller.startScroll(0, bottomMargin, 0, -bottomMargin, 400);
            invalidate();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(@Nullable RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
        WrapAdapter wrapAdapter = new WrapAdapter(adapter);
        this.mWrapAdapter = wrapAdapter;
        super.setAdapter(wrapAdapter);
        if (adapter != null) {
            if (!adapter.hasObservers()) {
                adapter.registerAdapterDataObserver(this.mDataObserver);
            }
            this.mDataObserver.onChanged();
        }
    }

    public final void setEmptyView(@Nullable View view) {
        this.mEmptyView = view;
        this.mDataObserver.onChanged();
    }

    public final void setFlingScale(double d5) {
        this.scale = d5;
    }

    public final void setLoadingListener(@Nullable LoadingListener loadingListener) {
        this.mLoadingListener = loadingListener;
    }

    public final void setLoadingMoreEnabled(boolean z4) {
        this.loadingMoreEnabled = z4;
        if (z4) {
            enableLoadingMoreView();
        } else {
            disableLoadingMoreView();
        }
    }

    protected final void setMFooterView(@Nullable XListViewFooter xListViewFooter) {
        this.mFooterView = xListViewFooter;
    }

    protected final void setMPullLoading(boolean z4) {
        this.mPullLoading = z4;
    }

    protected final void setMScrollBack(int i4) {
        this.mScrollBack = i4;
    }

    protected final void setMScroller(@Nullable Scroller scroller) {
        this.mScroller = scroller;
    }

    public final void setNoMore() {
        stopLoadMore();
        XListViewFooter xListViewFooter = this.mFooterView;
        Intrinsics.checkNotNull(xListViewFooter);
        xListViewFooter.f();
        XListViewFooter xListViewFooter2 = this.mFooterView;
        Intrinsics.checkNotNull(xListViewFooter2);
        xListViewFooter2.setState(3);
        this.mPullLoading = false;
        this.isNoMore = true;
        XListViewFooter xListViewFooter3 = this.mFooterView;
        Intrinsics.checkNotNull(xListViewFooter3);
        xListViewFooter3.setOnClickListener(null);
    }

    public final void setNoMoreView(boolean z4) {
        this.mPullLoading = false;
        this.isNoMore = z4;
        if (z4) {
            setNoMore();
        } else {
            setLoadingMoreEnabled(this.loadingMoreEnabled);
        }
    }

    public final void setPreLoadCount(int i4) {
        this.preloadCount = i4;
    }

    public final void setPtrFrameLayout(@Nullable PtrFrameLayout ptrFrameLayout) {
        if (ptrFrameLayout != null) {
            this.mPtrFrameLayout = ptrFrameLayout;
            Intrinsics.checkNotNull(ptrFrameLayout);
            ptrFrameLayout.setPtrHandler(this.ptrDefaultHandler);
        } else if (getParent() != null && (getParent() instanceof PtrFrameLayout)) {
            ViewParent parent = getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type com.join.mgps.ptr.PtrFrameLayout");
            PtrFrameLayout ptrFrameLayout2 = (PtrFrameLayout) parent;
            this.mPtrFrameLayout = ptrFrameLayout2;
            Intrinsics.checkNotNull(ptrFrameLayout2);
            ptrFrameLayout2.setPtrHandler(this.ptrDefaultHandler);
        }
        PtrFrameLayout ptrFrameLayout3 = this.mPtrFrameLayout;
        if (ptrFrameLayout3 != null) {
            Intrinsics.checkNotNull(ptrFrameLayout3);
            ptrFrameLayout3.j(true);
        }
    }

    public final void setPullRefreshEnabled(boolean z4) {
        this.pullRefreshEnabled = z4;
        if (z4) {
            return;
        }
        setPtrFrameLayout(null);
    }

    public final void setRefreshing(boolean z4) {
        PtrFrameLayout ptrFrameLayout;
        if (z4 && this.pullRefreshEnabled && (ptrFrameLayout = this.mPtrFrameLayout) != null) {
            Intrinsics.checkNotNull(ptrFrameLayout);
            ptrFrameLayout.f();
        }
    }

    public final void setScrollListener(@Nullable RecyclerView.OnScrollListener onScrollListener) {
        this.scrollListener = onScrollListener;
    }

    public final void showHeaderLoading() {
        PtrFrameLayout ptrFrameLayout = this.mPtrFrameLayout;
        if (ptrFrameLayout != null) {
            Intrinsics.checkNotNull(ptrFrameLayout);
            ptrFrameLayout.f();
        }
    }

    public final void showPullLoad() {
        this.loadingMoreEnabled = true;
        XListViewFooter xListViewFooter = this.mFooterView;
        Intrinsics.checkNotNull(xListViewFooter);
        xListViewFooter.f();
    }

    public final synchronized void startLoadMore() {
        preload();
    }

    public final void stopLoadMore() {
        if (this.mPullLoading && this.loadingMoreEnabled) {
            this.mPullLoading = false;
            this.isLoadingData = false;
            if (this.isNoMore) {
                XListViewFooter xListViewFooter = this.mFooterView;
                Intrinsics.checkNotNull(xListViewFooter);
                xListViewFooter.setState(3);
                return;
            }
            XListViewFooter xListViewFooter2 = this.mFooterView;
            Intrinsics.checkNotNull(xListViewFooter2);
            xListViewFooter2.setState(0);
        }
    }

    public final void stopRefresh() {
        PtrFrameLayout ptrFrameLayout = this.mPtrFrameLayout;
        if (ptrFrameLayout == null || ptrFrameLayout == null) {
            return;
        }
        Intrinsics.checkNotNull(ptrFrameLayout);
        ptrFrameLayout.C();
    }

    protected final void updateFooterHeight(float f5) {
        XListViewFooter xListViewFooter = this.mFooterView;
        Intrinsics.checkNotNull(xListViewFooter);
        int bottomMargin = xListViewFooter.getBottomMargin() + ((int) f5);
        if (this.loadingMoreEnabled && !this.mPullLoading) {
            if (bottomMargin > 50) {
                XListViewFooter xListViewFooter2 = this.mFooterView;
                Intrinsics.checkNotNull(xListViewFooter2);
                xListViewFooter2.setState(1);
            } else {
                XListViewFooter xListViewFooter3 = this.mFooterView;
                Intrinsics.checkNotNull(xListViewFooter3);
                xListViewFooter3.setState(0);
            }
        }
        XListViewFooter xListViewFooter4 = this.mFooterView;
        Intrinsics.checkNotNull(xListViewFooter4);
        xListViewFooter4.setBottomMargin(bottomMargin);
    }

    /* compiled from: XQuickRecyclerView.kt */
    /* loaded from: classes3.dex */
    public final class WrapAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        @Nullable
        private final RecyclerView.Adapter<RecyclerView.ViewHolder> adapter;
        private final boolean enableHeader;

        /* compiled from: XQuickRecyclerView.kt */
        /* loaded from: classes3.dex */
        private final class SimpleViewHolder extends BaseViewHolder {
            public SimpleViewHolder(@Nullable View view) {
                super(view);
            }
        }

        public WrapAdapter(@Nullable RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
            this.adapter = adapter;
        }

        private final void refreshLoadMoreState() {
            if (XQuickRecyclerView.this.getMFooterView() != null) {
                if (XQuickRecyclerView.this.isNoMore) {
                    XListViewFooter mFooterView = XQuickRecyclerView.this.getMFooterView();
                    Intrinsics.checkNotNull(mFooterView);
                    mFooterView.setState(3);
                } else if (XQuickRecyclerView.this.getMPullLoading()) {
                    XListViewFooter mFooterView2 = XQuickRecyclerView.this.getMFooterView();
                    Intrinsics.checkNotNull(mFooterView2);
                    mFooterView2.setState(2);
                } else {
                    XListViewFooter mFooterView3 = XQuickRecyclerView.this.getMFooterView();
                    Intrinsics.checkNotNull(mFooterView3);
                    mFooterView3.setState(0);
                }
            }
        }

        @Nullable
        public final RecyclerView.Adapter<RecyclerView.ViewHolder> getAdapter() {
            return this.adapter;
        }

        public final int getHeadersCount() {
            return XQuickRecyclerView.this.mHeaderViews.size();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            int headersCount;
            int headersCount2;
            int itemCount;
            int i4;
            int i5;
            if (XQuickRecyclerView.this.loadingMoreEnabled) {
                int i6 = this.enableHeader ? 2 : 1;
                if (this.adapter != null) {
                    headersCount2 = getHeadersCount();
                    itemCount = this.adapter.getItemCount();
                    i5 = i6;
                    headersCount = headersCount2 + itemCount;
                    i4 = i5;
                } else {
                    headersCount = getHeadersCount();
                    i4 = i6;
                }
            } else {
                boolean z4 = this.enableHeader;
                if (this.adapter != null) {
                    headersCount2 = getHeadersCount();
                    itemCount = this.adapter.getItemCount();
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
            boolean z4 = this.enableHeader;
            if (this.adapter == null || i4 < getHeadersCount() + (z4 ? 1 : 0) || (headersCount = i4 - (getHeadersCount() + (z4 ? 1 : 0))) >= this.adapter.getItemCount()) {
                return -1L;
            }
            return this.adapter.getItemId(headersCount);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i4) {
            RecyclerView.Adapter<RecyclerView.ViewHolder> adapter;
            RecyclerView.Adapter<RecyclerView.ViewHolder> adapter2 = this.adapter;
            int itemCount = adapter2 != null ? adapter2.getItemCount() : 0;
            int headersCount = i4 - (getHeadersCount() + (this.enableHeader ? 1 : 0));
            if (headersCount < itemCount) {
                XQuickRecyclerView xQuickRecyclerView = XQuickRecyclerView.this;
                Intrinsics.checkNotNull(this.adapter);
                if (!(!xQuickRecyclerView.isReservedItemViewType(adapter.getItemViewType(headersCount)))) {
                    throw new IllegalStateException("XRecyclerView require itemViewType in adapter should be less than 10000 ".toString());
                }
            }
            if (isRefreshHeader(i4) && this.enableHeader) {
                return 10000;
            }
            if (isHeader(i4)) {
                if (this.enableHeader) {
                    i4--;
                }
                return ((Number) XQuickRecyclerView.sHeaderTypes.get(i4)).intValue();
            } else if (isFooter(i4)) {
                return 10001;
            } else {
                if (headersCount < itemCount) {
                    RecyclerView.Adapter<RecyclerView.ViewHolder> adapter3 = this.adapter;
                    Intrinsics.checkNotNull(adapter3);
                    return adapter3.getItemViewType(headersCount);
                }
                return 0;
            }
        }

        public final boolean isFooter(int i4) {
            return XQuickRecyclerView.this.loadingMoreEnabled && i4 == getItemCount() - 1;
        }

        public final boolean isHeader(int i4) {
            return this.enableHeader && i4 >= 1 && i4 < XQuickRecyclerView.this.mHeaderViews.size() + 1;
        }

        public final boolean isRefreshHeader(int i4) {
            return this.enableHeader && i4 == 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onAttachedToRecyclerView(recyclerView);
            final RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                ((GridLayoutManager) layoutManager).setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.join.kotlin.base.widget.recycleview.XQuickRecyclerView$WrapAdapter$onAttachedToRecyclerView$1
                    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                    public int getSpanSize(int i4) {
                        if (XQuickRecyclerView.WrapAdapter.this.isHeader(i4) || XQuickRecyclerView.WrapAdapter.this.isFooter(i4) || XQuickRecyclerView.WrapAdapter.this.isRefreshHeader(i4)) {
                            return ((GridLayoutManager) layoutManager).getSpanCount();
                        }
                        return 1;
                    }
                });
            }
            RecyclerView.Adapter<RecyclerView.ViewHolder> adapter = this.adapter;
            Intrinsics.checkNotNull(adapter);
            adapter.onAttachedToRecyclerView(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i4) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            if (isHeader(i4) || (isRefreshHeader(i4) && this.enableHeader)) {
                return;
            }
            if (isFooter(i4)) {
                refreshLoadMoreState();
                return;
            }
            int headersCount = i4 - (getHeadersCount() + (this.enableHeader ? 1 : 0));
            RecyclerView.Adapter<RecyclerView.ViewHolder> adapter = this.adapter;
            if (adapter == null || headersCount >= adapter.getItemCount()) {
                return;
            }
            this.adapter.onBindViewHolder(holder, headersCount);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i4) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            if (i4 == 10000) {
                return new SimpleViewHolder(new View(parent.getContext()));
            }
            if (XQuickRecyclerView.this.isHeaderType(i4)) {
                return new SimpleViewHolder(XQuickRecyclerView.this.getHeaderViewByType(i4));
            }
            if (i4 == 10001) {
                return new SimpleViewHolder(XQuickRecyclerView.this.getMFooterView());
            }
            RecyclerView.Adapter<RecyclerView.ViewHolder> adapter = this.adapter;
            Intrinsics.checkNotNull(adapter);
            RecyclerView.ViewHolder onCreateViewHolder = adapter.onCreateViewHolder(parent, i4);
            Intrinsics.checkNotNullExpressionValue(onCreateViewHolder, "adapter!!.onCreateViewHolder(parent, viewType)");
            return onCreateViewHolder;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            RecyclerView.Adapter<RecyclerView.ViewHolder> adapter = this.adapter;
            Intrinsics.checkNotNull(adapter);
            adapter.onDetachedFromRecyclerView(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public boolean onFailedToRecycleView(@NotNull RecyclerView.ViewHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            RecyclerView.Adapter<RecyclerView.ViewHolder> adapter = this.adapter;
            Intrinsics.checkNotNull(adapter);
            return adapter.onFailedToRecycleView(holder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            super.onViewAttachedToWindow(holder);
            ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
            if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) && (isHeader(holder.getLayoutPosition()) || isRefreshHeader(holder.getLayoutPosition()) || isFooter(holder.getLayoutPosition()))) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
            }
            RecyclerView.Adapter<RecyclerView.ViewHolder> adapter = this.adapter;
            Intrinsics.checkNotNull(adapter);
            adapter.onViewAttachedToWindow(holder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            RecyclerView.Adapter<RecyclerView.ViewHolder> adapter = this.adapter;
            Intrinsics.checkNotNull(adapter);
            adapter.onViewDetachedFromWindow(holder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(@NotNull RecyclerView.ViewHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            RecyclerView.Adapter<RecyclerView.ViewHolder> adapter = this.adapter;
            Intrinsics.checkNotNull(adapter);
            adapter.onViewRecycled(holder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void registerAdapterDataObserver(@NotNull RecyclerView.AdapterDataObserver observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            RecyclerView.Adapter<RecyclerView.ViewHolder> adapter = this.adapter;
            Intrinsics.checkNotNull(adapter);
            adapter.registerAdapterDataObserver(observer);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void unregisterAdapterDataObserver(@NotNull RecyclerView.AdapterDataObserver observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            RecyclerView.Adapter<RecyclerView.ViewHolder> adapter = this.adapter;
            Intrinsics.checkNotNull(adapter);
            adapter.unregisterAdapterDataObserver(observer);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i4, @NotNull List<? extends Object> payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            if (isHeader(i4) || (isRefreshHeader(i4) && this.enableHeader)) {
                return;
            }
            if (isFooter(i4)) {
                refreshLoadMoreState();
                return;
            }
            int headersCount = i4 - (getHeadersCount() + (this.enableHeader ? 1 : 0));
            RecyclerView.Adapter<RecyclerView.ViewHolder> adapter = this.adapter;
            if (adapter == null || headersCount >= adapter.getItemCount()) {
                return;
            }
            this.adapter.onBindViewHolder(holder, headersCount, payloads);
        }
    }

    public XQuickRecyclerView(@Nullable Context context) {
        this(context, null);
        init();
    }

    public XQuickRecyclerView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        init();
    }
}
