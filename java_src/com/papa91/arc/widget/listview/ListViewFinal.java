package com.papa91.arc.widget.listview;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import org.ppsspp.ppsspp.R;
/* loaded from: classes5.dex */
public class ListViewFinal extends ListView implements OnScrollBottomListener {
    private boolean mAddLoadMoreFooterFlag;
    private DataSetObserver mDataObserver;
    int mFirstVisibleItem;
    private boolean mHasLoadFail;
    boolean mHasLoadMore;
    private boolean mHasLoadMoreViewShowState;
    private boolean mLoadMoreLock;
    LoadMoreMode mLoadMoreMode;
    ILoadMoreView mLoadMoreView;
    private int mLoadMoreViewBottom;
    private int mLoadMoreViewLeft;
    private int mLoadMoreViewRight;
    private int mLoadMoreViewTop;
    private boolean mNoLoadMoreHideView;
    private OnLoadMoreListener mOnLoadMoreListener;
    boolean mPreLoad;
    protected int mTotalItemCount;
    int mVisibleItemCount;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class ListViewOnScrollListener implements AbsListView.OnScrollListener {
        private ListViewOnScrollListener() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
            ListViewFinal listViewFinal = ListViewFinal.this;
            listViewFinal.mTotalItemCount = i6;
            listViewFinal.mFirstVisibleItem = i4;
            listViewFinal.mVisibleItemCount = i5;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i4) {
            if (i4 != 0 || absListView.getLastVisiblePosition() + 2 < absListView.getCount()) {
                return;
            }
            ListViewFinal.this.onScorllBootom();
        }
    }

    /* loaded from: classes5.dex */
    class OnMoreViewClickListener implements View.OnClickListener {
        OnMoreViewClickListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ListViewFinal listViewFinal = ListViewFinal.this;
            if (listViewFinal.mHasLoadMore) {
                listViewFinal.executeLoadMore();
            }
        }
    }

    public ListViewFinal(Context context) {
        super(context);
        this.mLoadMoreMode = LoadMoreMode.SCROLL;
        this.mHasLoadMore = true;
        this.mPreLoad = true;
        this.mDataObserver = new DataSetObserver() { // from class: com.papa91.arc.widget.listview.ListViewFinal.1
            @Override // android.database.DataSetObserver
            public void onChanged() {
                ListViewFinal.this.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
            }
        };
        init(context, null);
    }

    private void hideLoadMoreView() {
        this.mHasLoadMoreViewShowState = false;
        this.mLoadMoreViewBottom = this.mLoadMoreView.getFooterView().getPaddingBottom();
        this.mLoadMoreViewTop = this.mLoadMoreView.getFooterView().getPaddingTop();
        this.mLoadMoreViewLeft = this.mLoadMoreView.getFooterView().getPaddingLeft();
        this.mLoadMoreViewRight = this.mLoadMoreView.getFooterView().getPaddingRight();
        this.mLoadMoreView.getFooterView().setVisibility(8);
        this.mLoadMoreView.getFooterView().setPadding(0, -this.mLoadMoreView.getFooterView().getHeight(), 0, 0);
    }

    private void init(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LoadingViewFinal);
        int i4 = R.styleable.LoadingViewFinal_loadMoreMode;
        if (obtainStyledAttributes.hasValue(i4)) {
            this.mLoadMoreMode = LoadMoreMode.mapIntToValue(obtainStyledAttributes.getInt(i4, 1));
        } else {
            this.mLoadMoreMode = LoadMoreMode.SCROLL;
        }
        int i5 = R.styleable.LoadingViewFinal_noLoadMoreHideView;
        if (obtainStyledAttributes.hasValue(i5)) {
            this.mNoLoadMoreHideView = obtainStyledAttributes.getBoolean(i5, false);
        } else {
            this.mNoLoadMoreHideView = false;
        }
        int i6 = R.styleable.LoadingViewFinal_loadMoreView;
        if (obtainStyledAttributes.hasValue(i6)) {
            try {
                this.mLoadMoreView = (ILoadMoreView) Class.forName(obtainStyledAttributes.getString(i6)).getConstructor(Context.class).newInstance(context);
            } catch (Exception e5) {
                e5.printStackTrace();
                this.mLoadMoreView = new DefaultLoadMoreView(context);
            }
        } else {
            this.mLoadMoreView = new DefaultLoadMoreView(context);
        }
        setOnScrollListener(new ListViewOnScrollListener());
        obtainStyledAttributes.recycle();
    }

    private void showLoadMoreView() {
        this.mHasLoadMoreViewShowState = true;
        this.mLoadMoreView.getFooterView().setVisibility(0);
        this.mLoadMoreView.getFooterView().setPadding(this.mLoadMoreViewLeft, this.mLoadMoreViewTop, this.mLoadMoreViewRight, this.mLoadMoreViewBottom);
    }

    void executeLoadMore() {
        if (this.mLoadMoreLock || !this.mHasLoadMore) {
            return;
        }
        OnLoadMoreListener onLoadMoreListener = this.mOnLoadMoreListener;
        if (onLoadMoreListener != null) {
            onLoadMoreListener.loadMore();
        }
        this.mLoadMoreLock = true;
        showLoadingUI();
    }

    @Override // android.widget.ListView, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        hideLoadMoreView();
    }

    public void onLoadMoreComplete() {
        if (this.mHasLoadFail) {
            showFailUI();
        } else if (this.mHasLoadMore) {
            showNormalUI();
        }
    }

    @Override // com.papa91.arc.widget.listview.OnScrollBottomListener
    public void onScorllBootom() {
        if (this.mHasLoadMore && this.mLoadMoreMode == LoadMoreMode.SCROLL) {
            executeLoadMore();
        }
    }

    public void setHasLoadMore(boolean z4) {
        this.mHasLoadMore = z4;
        if (!z4) {
            showNoMoreUI();
            if (this.mNoLoadMoreHideView && this.mHasLoadMoreViewShowState) {
                hideLoadMoreView();
            }
        } else {
            if (!this.mHasLoadMoreViewShowState) {
                showLoadMoreView();
            }
            showNormalUI();
        }
        if (!this.mPreLoad || this.mFirstVisibleItem + this.mVisibleItemCount < this.mTotalItemCount) {
            return;
        }
        onScorllBootom();
        this.mPreLoad = false;
    }

    public void setLoadMoreMode(LoadMoreMode loadMoreMode) {
        this.mLoadMoreMode = loadMoreMode;
    }

    public void setLoadMoreView(ILoadMoreView iLoadMoreView) {
        this.mLoadMoreView = iLoadMoreView;
        iLoadMoreView.getFooterView().setOnClickListener(new OnMoreViewClickListener());
    }

    public void setNoLoadMoreHideView(boolean z4) {
        this.mNoLoadMoreHideView = z4;
    }

    public void setOnLoadMoreListener(OnLoadMoreListener onLoadMoreListener) {
        this.mOnLoadMoreListener = onLoadMoreListener;
    }

    public void setPreLoad(boolean z4) {
        this.mPreLoad = z4;
    }

    public void showFailUI() {
        this.mHasLoadFail = true;
        this.mLoadMoreLock = false;
        this.mLoadMoreView.showFail();
    }

    void showLoadingUI() {
        this.mHasLoadFail = false;
        this.mLoadMoreView.showLoading();
    }

    void showNoMoreUI() {
        this.mLoadMoreLock = false;
        this.mLoadMoreView.showNoMore();
    }

    void showNormalUI() {
        this.mLoadMoreLock = false;
        this.mLoadMoreView.showNormal();
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        if (!this.mAddLoadMoreFooterFlag) {
            this.mAddLoadMoreFooterFlag = true;
            addFooterView(this.mLoadMoreView.getFooterView());
        }
        super.setAdapter(listAdapter);
        if (listAdapter instanceof BaseAdapter) {
            try {
                listAdapter.unregisterDataSetObserver(this.mDataObserver);
            } catch (Exception unused) {
            }
            listAdapter.registerDataSetObserver(this.mDataObserver);
        }
    }

    public ListViewFinal(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLoadMoreMode = LoadMoreMode.SCROLL;
        this.mHasLoadMore = true;
        this.mPreLoad = true;
        this.mDataObserver = new DataSetObserver() { // from class: com.papa91.arc.widget.listview.ListViewFinal.1
            @Override // android.database.DataSetObserver
            public void onChanged() {
                ListViewFinal.this.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
            }
        };
        init(context, attributeSet);
    }

    public ListViewFinal(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mLoadMoreMode = LoadMoreMode.SCROLL;
        this.mHasLoadMore = true;
        this.mPreLoad = true;
        this.mDataObserver = new DataSetObserver() { // from class: com.papa91.arc.widget.listview.ListViewFinal.1
            @Override // android.database.DataSetObserver
            public void onChanged() {
                ListViewFinal.this.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
            }
        };
        init(context, attributeSet);
    }
}
