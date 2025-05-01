package m.framework.ui.widget.pulltorefresh;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes7.dex */
public abstract class PullToRefreshBaseListAdapter extends PullToRefreshAdatper {
    public PullToRefreshBaseListAdapter(PullToRefreshView pullToRefreshView) {
        super(pullToRefreshView);
    }

    public abstract int getCount();

    public abstract Object getItem(int i4);

    public abstract long getItemId(int i4);

    public abstract View getView(int i4, View view, ViewGroup viewGroup);

    public abstract boolean isFling();

    public abstract void onScroll(Scrollable scrollable, int i4, int i5, int i6);
}
