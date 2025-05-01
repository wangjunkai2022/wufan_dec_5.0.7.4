package com.join.mgps.recycler;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.join.mgps.recycler.LoadingFooter;
/* compiled from: RecyclerViewStateUtils.java */
/* loaded from: classes4.dex */
public class d {
    public static LoadingFooter.State a(RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null && (adapter instanceof HeaderAndFooterRecyclerViewAdapter)) {
            HeaderAndFooterRecyclerViewAdapter headerAndFooterRecyclerViewAdapter = (HeaderAndFooterRecyclerViewAdapter) adapter;
            if (headerAndFooterRecyclerViewAdapter.getFooterViewsCount() > 0) {
                return ((LoadingFooter) headerAndFooterRecyclerViewAdapter.c()).getState();
            }
        }
        return LoadingFooter.State.Normal;
    }

    public static void b(Activity activity, RecyclerView recyclerView, int i4, LoadingFooter.State state, View.OnClickListener onClickListener) {
        RecyclerView.Adapter adapter;
        if (activity == null || activity.isFinishing() || (adapter = recyclerView.getAdapter()) == null || !(adapter instanceof HeaderAndFooterRecyclerViewAdapter)) {
            return;
        }
        HeaderAndFooterRecyclerViewAdapter headerAndFooterRecyclerViewAdapter = (HeaderAndFooterRecyclerViewAdapter) adapter;
        if (headerAndFooterRecyclerViewAdapter.e().getItemCount() < i4) {
            return;
        }
        if (headerAndFooterRecyclerViewAdapter.getFooterViewsCount() > 0) {
            LoadingFooter loadingFooter = (LoadingFooter) headerAndFooterRecyclerViewAdapter.c();
            loadingFooter.setState(state);
            if (state == LoadingFooter.State.NetWorkError) {
                loadingFooter.setOnClickListener(onClickListener);
            }
            recyclerView.scrollToPosition(headerAndFooterRecyclerViewAdapter.getItemCount() - 1);
            return;
        }
        LoadingFooter loadingFooter2 = new LoadingFooter(activity);
        loadingFooter2.setState(state);
        if (state == LoadingFooter.State.NetWorkError) {
            loadingFooter2.setOnClickListener(onClickListener);
        }
        headerAndFooterRecyclerViewAdapter.a(loadingFooter2);
        recyclerView.scrollToPosition(headerAndFooterRecyclerViewAdapter.getItemCount() - 1);
    }

    public static void c(RecyclerView recyclerView, LoadingFooter.State state) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || !(adapter instanceof HeaderAndFooterRecyclerViewAdapter)) {
            return;
        }
        HeaderAndFooterRecyclerViewAdapter headerAndFooterRecyclerViewAdapter = (HeaderAndFooterRecyclerViewAdapter) adapter;
        if (headerAndFooterRecyclerViewAdapter.getFooterViewsCount() > 0) {
            ((LoadingFooter) headerAndFooterRecyclerViewAdapter.c()).setState(state);
        }
    }
}
