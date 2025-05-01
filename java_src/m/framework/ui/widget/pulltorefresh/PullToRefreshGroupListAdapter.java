package m.framework.ui.widget.pulltorefresh;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import m.framework.ui.widget.pulltorefresh.GroupListView;
/* loaded from: classes7.dex */
public abstract class PullToRefreshGroupListAdapter extends PullToRefreshAdatper {
    private GroupListView.GroupListAdapter adapter;
    private boolean fling;
    private ScrollableGroupListView listView;
    private OnListStopScrollListener osListener;

    public PullToRefreshGroupListAdapter(PullToRefreshView pullToRefreshView) {
        super(pullToRefreshView);
        ScrollableGroupListView scrollableGroupListView = new ScrollableGroupListView(getContext());
        this.listView = scrollableGroupListView;
        scrollableGroupListView.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: m.framework.ui.widget.pulltorefresh.PullToRefreshGroupListAdapter.1
            private int firstVisibleItem;
            private int visibleItemCount;

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
                this.firstVisibleItem = i4;
                this.visibleItemCount = i5;
                PullToRefreshGroupListAdapter pullToRefreshGroupListAdapter = PullToRefreshGroupListAdapter.this;
                pullToRefreshGroupListAdapter.onScroll(pullToRefreshGroupListAdapter.listView, i4, i5, i6);
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i4) {
                PullToRefreshGroupListAdapter.this.fling = i4 == 2;
                if (i4 == 0) {
                    if (PullToRefreshGroupListAdapter.this.osListener != null) {
                        PullToRefreshGroupListAdapter.this.osListener.onListStopScrolling(this.firstVisibleItem, this.visibleItemCount);
                    } else if (PullToRefreshGroupListAdapter.this.adapter != null) {
                        PullToRefreshGroupListAdapter.this.adapter.notifyDataSetChanged();
                    }
                }
            }
        });
        GroupListView.GroupListAdapter groupListAdapter = new GroupListView.GroupListAdapter() { // from class: m.framework.ui.widget.pulltorefresh.PullToRefreshGroupListAdapter.2
            @Override // m.framework.ui.widget.pulltorefresh.GroupListView.GroupListAdapter
            public Object getChild(int i4, int i5) {
                return PullToRefreshGroupListAdapter.this.getChild(i4, i5);
            }

            @Override // m.framework.ui.widget.pulltorefresh.GroupListView.GroupListAdapter
            public View getChildView(int i4, int i5, View view, ViewGroup viewGroup) {
                return PullToRefreshGroupListAdapter.this.getChildView(i4, i5, view, viewGroup);
            }

            @Override // m.framework.ui.widget.pulltorefresh.GroupListView.GroupListAdapter
            public int getChildrenCount(int i4) {
                return PullToRefreshGroupListAdapter.this.getChildrenCount(i4);
            }

            @Override // m.framework.ui.widget.pulltorefresh.GroupListView.GroupListAdapter
            public int getGroupCount() {
                return PullToRefreshGroupListAdapter.this.getGroupCount();
            }

            @Override // m.framework.ui.widget.pulltorefresh.GroupListView.GroupListAdapter
            public String getGroupTitle(int i4) {
                return PullToRefreshGroupListAdapter.this.getGroupTitle(i4);
            }

            @Override // m.framework.ui.widget.pulltorefresh.GroupListView.GroupListAdapter
            public View getGroupTitleView(int i4, View view, ViewGroup viewGroup) {
                return PullToRefreshGroupListAdapter.this.getGroupTitleView(i4, view, viewGroup);
            }
        };
        this.adapter = groupListAdapter;
        this.listView.setAdapter(groupListAdapter);
    }

    @Override // m.framework.ui.widget.pulltorefresh.PullToRefreshAdatper
    public Scrollable getBodyView() {
        return this.listView;
    }

    public abstract Object getChild(int i4, int i5);

    public abstract View getChildView(int i4, int i5, View view, ViewGroup viewGroup);

    public abstract int getChildrenCount(int i4);

    public abstract int getGroupCount();

    public abstract String getGroupTitle(int i4);

    public abstract View getGroupTitleView(int i4, View view, ViewGroup viewGroup);

    public GroupListView getListView() {
        return this.listView;
    }

    public boolean isFling() {
        return this.fling;
    }

    @Override // m.framework.ui.widget.pulltorefresh.PullToRefreshAdatper
    public boolean isPullReady() {
        return this.listView.isReadyToPull();
    }

    @Override // m.framework.ui.widget.pulltorefresh.PullToRefreshAdatper
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.adapter.notifyDataSetChanged();
    }

    public void onScroll(Scrollable scrollable, int i4, int i5, int i6) {
    }
}
