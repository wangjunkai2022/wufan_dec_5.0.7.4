package com.mob.tools.gui;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes5.dex */
public abstract class PullToRequestBaseListAdapter extends PullToRequestAdatper {
    public PullToRequestBaseListAdapter(PullToRequestView pullToRequestView) {
        super(pullToRequestView);
    }

    public abstract int getCount();

    public abstract Object getItem(int i4);

    public abstract long getItemId(int i4);

    public int getItemViewType(int i4) {
        return 0;
    }

    public abstract View getView(int i4, View view, ViewGroup viewGroup);

    public int getViewTypeCount() {
        return 1;
    }

    public abstract boolean isFling();

    public abstract void onScroll(Scrollable scrollable, int i4, int i5, int i6);
}
