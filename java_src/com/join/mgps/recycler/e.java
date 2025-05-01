package com.join.mgps.recycler;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: RecyclerViewUtils.java */
/* loaded from: classes4.dex */
public class e {
    public static int a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        int headerViewsCount;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null && (adapter instanceof HeaderAndFooterRecyclerViewAdapter) && (headerViewsCount = ((HeaderAndFooterRecyclerViewAdapter) adapter).getHeaderViewsCount()) > 0) {
            return viewHolder.getAdapterPosition() - headerViewsCount;
        }
        return viewHolder.getAdapterPosition();
    }

    public static int b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        int headerViewsCount;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null && (adapter instanceof HeaderAndFooterRecyclerViewAdapter) && (headerViewsCount = ((HeaderAndFooterRecyclerViewAdapter) adapter).getHeaderViewsCount()) > 0) {
            return viewHolder.getLayoutPosition() - headerViewsCount;
        }
        return viewHolder.getLayoutPosition();
    }

    public static void c(RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || !(adapter instanceof HeaderAndFooterRecyclerViewAdapter)) {
            return;
        }
        HeaderAndFooterRecyclerViewAdapter headerAndFooterRecyclerViewAdapter = (HeaderAndFooterRecyclerViewAdapter) adapter;
        if (headerAndFooterRecyclerViewAdapter.getFooterViewsCount() > 0) {
            headerAndFooterRecyclerViewAdapter.removeFooterView(headerAndFooterRecyclerViewAdapter.c());
        }
    }

    public static void d(RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || !(adapter instanceof HeaderAndFooterRecyclerViewAdapter)) {
            return;
        }
        HeaderAndFooterRecyclerViewAdapter headerAndFooterRecyclerViewAdapter = (HeaderAndFooterRecyclerViewAdapter) adapter;
        if (headerAndFooterRecyclerViewAdapter.getHeaderViewsCount() > 0) {
            headerAndFooterRecyclerViewAdapter.removeFooterView(headerAndFooterRecyclerViewAdapter.d());
        }
    }

    public static void e(RecyclerView recyclerView, View view) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || !(adapter instanceof HeaderAndFooterRecyclerViewAdapter)) {
            return;
        }
        HeaderAndFooterRecyclerViewAdapter headerAndFooterRecyclerViewAdapter = (HeaderAndFooterRecyclerViewAdapter) adapter;
        if (headerAndFooterRecyclerViewAdapter.getFooterViewsCount() == 0) {
            headerAndFooterRecyclerViewAdapter.a(view);
        }
    }

    public static void f(RecyclerView recyclerView, View view) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || !(adapter instanceof HeaderAndFooterRecyclerViewAdapter)) {
            return;
        }
        HeaderAndFooterRecyclerViewAdapter headerAndFooterRecyclerViewAdapter = (HeaderAndFooterRecyclerViewAdapter) adapter;
        if (headerAndFooterRecyclerViewAdapter.getHeaderViewsCount() == 0) {
            headerAndFooterRecyclerViewAdapter.b(view);
        }
    }
}
