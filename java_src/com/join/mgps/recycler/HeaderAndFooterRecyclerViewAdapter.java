package com.join.mgps.recycler;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import kotlinx.coroutines.internal.z;
/* loaded from: classes4.dex */
public class HeaderAndFooterRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: e  reason: collision with root package name */
    private static final int f54007e = Integer.MIN_VALUE;

    /* renamed from: f  reason: collision with root package name */
    private static final int f54008f = -2147483647;

    /* renamed from: a  reason: collision with root package name */
    private RecyclerView.Adapter<RecyclerView.ViewHolder> f54009a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<View> f54010b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<View> f54011c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView.AdapterDataObserver f54012d = new a();

    /* loaded from: classes4.dex */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View view) {
            super(view);
        }
    }

    /* loaded from: classes4.dex */
    class a extends RecyclerView.AdapterDataObserver {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            super.onChanged();
            HeaderAndFooterRecyclerViewAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i4, int i5) {
            super.onItemRangeChanged(i4, i5);
            HeaderAndFooterRecyclerViewAdapter headerAndFooterRecyclerViewAdapter = HeaderAndFooterRecyclerViewAdapter.this;
            headerAndFooterRecyclerViewAdapter.notifyItemRangeChanged(i4 + headerAndFooterRecyclerViewAdapter.getHeaderViewsCount(), i5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i4, int i5) {
            super.onItemRangeInserted(i4, i5);
            HeaderAndFooterRecyclerViewAdapter headerAndFooterRecyclerViewAdapter = HeaderAndFooterRecyclerViewAdapter.this;
            headerAndFooterRecyclerViewAdapter.notifyItemRangeInserted(i4 + headerAndFooterRecyclerViewAdapter.getHeaderViewsCount(), i5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i4, int i5, int i6) {
            super.onItemRangeMoved(i4, i5, i6);
            int headerViewsCount = HeaderAndFooterRecyclerViewAdapter.this.getHeaderViewsCount();
            HeaderAndFooterRecyclerViewAdapter.this.notifyItemRangeChanged(i4 + headerViewsCount, i5 + headerViewsCount + i6);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i4, int i5) {
            super.onItemRangeRemoved(i4, i5);
            HeaderAndFooterRecyclerViewAdapter headerAndFooterRecyclerViewAdapter = HeaderAndFooterRecyclerViewAdapter.this;
            headerAndFooterRecyclerViewAdapter.notifyItemRangeRemoved(i4 + headerAndFooterRecyclerViewAdapter.getHeaderViewsCount(), i5);
        }
    }

    public HeaderAndFooterRecyclerViewAdapter() {
    }

    public void a(View view) {
        if (view != null) {
            this.f54011c.add(view);
            notifyDataSetChanged();
            return;
        }
        throw new RuntimeException("footer is null");
    }

    public void b(View view) {
        if (view != null) {
            this.f54010b.add(view);
            notifyDataSetChanged();
            return;
        }
        throw new RuntimeException("header is null");
    }

    public View c() {
        if (getFooterViewsCount() > 0) {
            return this.f54011c.get(0);
        }
        return null;
    }

    public View d() {
        if (getHeaderViewsCount() > 0) {
            return this.f54010b.get(0);
        }
        return null;
    }

    public RecyclerView.Adapter e() {
        return this.f54009a;
    }

    public void f(RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
        if (this.f54009a != null) {
            notifyItemRangeRemoved(getHeaderViewsCount(), this.f54009a.getItemCount());
            this.f54009a.unregisterAdapterDataObserver(this.f54012d);
        }
        this.f54009a = adapter;
        adapter.registerAdapterDataObserver(this.f54012d);
        notifyItemRangeInserted(getHeaderViewsCount(), this.f54009a.getItemCount());
    }

    public int getFooterViewsCount() {
        return this.f54011c.size();
    }

    public int getHeaderViewsCount() {
        return this.f54010b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return getHeaderViewsCount() + getFooterViewsCount() + this.f54009a.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i4) {
        int itemCount = this.f54009a.getItemCount();
        int headerViewsCount = getHeaderViewsCount();
        if (i4 < headerViewsCount) {
            return i4 - 2147483648;
        }
        if (headerViewsCount > i4 || i4 >= headerViewsCount + itemCount) {
            return ((i4 + f54008f) - headerViewsCount) - itemCount;
        }
        int itemViewType = this.f54009a.getItemViewType(i4 - headerViewsCount);
        if (itemViewType < 1073741823) {
            return itemViewType + z.f71167j;
        }
        throw new IllegalArgumentException("your adapter's return value of getViewTypeCount() must < Integer.MAX_VALUE / 2");
    }

    public boolean isFooter(int i4) {
        return getFooterViewsCount() > 0 && i4 == getItemCount() - 1;
    }

    public boolean isHeader(int i4) {
        return getHeaderViewsCount() > 0 && i4 == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i4) {
        int headerViewsCount = getHeaderViewsCount();
        if (i4 >= headerViewsCount && i4 < this.f54009a.getItemCount() + headerViewsCount) {
            this.f54009a.onBindViewHolder(viewHolder, i4 - headerViewsCount);
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
        if (i4 < getHeaderViewsCount() - 2147483648) {
            return new ViewHolder(this.f54010b.get(i4 - Integer.MIN_VALUE));
        }
        if (i4 >= f54008f && i4 < 1073741823) {
            return new ViewHolder(this.f54011c.get(i4 - f54008f));
        }
        return this.f54009a.onCreateViewHolder(viewGroup, i4 - z.f71167j);
    }

    public void removeFooterView(View view) {
        this.f54011c.remove(view);
        notifyDataSetChanged();
    }

    public void removeHeaderView(View view) {
        this.f54010b.remove(view);
        notifyDataSetChanged();
    }

    public HeaderAndFooterRecyclerViewAdapter(RecyclerView.Adapter adapter) {
        f(adapter);
    }
}
