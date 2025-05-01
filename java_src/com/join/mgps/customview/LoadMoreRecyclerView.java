package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class LoadMoreRecyclerView extends RecyclerView {

    /* renamed from: i  reason: collision with root package name */
    public static final int f47320i = 0;

    /* renamed from: j  reason: collision with root package name */
    public static final int f47321j = 999;

    /* renamed from: k  reason: collision with root package name */
    public static final int f47322k = 3;

    /* renamed from: l  reason: collision with root package name */
    public static final int f47323l = 4;

    /* renamed from: b  reason: collision with root package name */
    private boolean f47324b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f47325c;

    /* renamed from: d  reason: collision with root package name */
    private AutoLoadAdapter f47326d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f47327e;

    /* renamed from: f  reason: collision with root package name */
    private int f47328f;

    /* renamed from: g  reason: collision with root package name */
    private b f47329g;

    /* renamed from: h  reason: collision with root package name */
    private RecyclerView.OnScrollListener f47330h;

    /* loaded from: classes4.dex */
    public class AutoLoadAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        private RecyclerView.Adapter f47331a;

        /* renamed from: b  reason: collision with root package name */
        private int f47332b;

        /* loaded from: classes4.dex */
        public class FooterViewHolder extends RecyclerView.ViewHolder {

            /* renamed from: a  reason: collision with root package name */
            TextView f47334a;

            /* renamed from: b  reason: collision with root package name */
            View f47335b;

            public FooterViewHolder(View view) {
                super(view);
                this.f47334a = (TextView) view.findViewById(R.id.xlistview_footer_hint_textview);
                this.f47335b = view.findViewById(R.id.xlistview_footer_progressbar);
            }
        }

        public AutoLoadAdapter(RecyclerView.Adapter adapter) {
            this.f47331a = adapter;
        }

        public void a(int i4) {
            this.f47332b = i4;
        }

        public void b(boolean z4) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            int itemCount = this.f47331a.getItemCount();
            return LoadMoreRecyclerView.this.f47324b ? itemCount + 1 : itemCount;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i4) {
            if (getItemCount() - 1 == i4 && LoadMoreRecyclerView.this.f47324b) {
                return 999;
            }
            if (LoadMoreRecyclerView.this.getLayoutManager() instanceof LinearLayoutManager) {
                return this.f47331a.getItemViewType(i4);
            }
            if (LoadMoreRecyclerView.this.getLayoutManager() instanceof StaggeredGridLayoutManager) {
                return this.f47331a.getItemViewType(i4);
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i4) {
            if (getItemViewType(i4) != 999) {
                this.f47331a.onBindViewHolder(viewHolder, i4);
            }
            try {
                if (FooterViewHolder.class.isInstance(viewHolder)) {
                    FooterViewHolder footerViewHolder = (FooterViewHolder) viewHolder;
                    if (LoadMoreRecyclerView.this.f47325c) {
                        footerViewHolder.f47334a.setVisibility(8);
                        footerViewHolder.f47335b.setVisibility(0);
                        return;
                    }
                    footerViewHolder.f47334a.setVisibility(0);
                    footerViewHolder.f47335b.setVisibility(8);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
            if (i4 == 999) {
                return new FooterViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.xlistview_footer, viewGroup, false));
            }
            return this.f47331a.onCreateViewHolder(viewGroup, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends RecyclerView.OnScrollListener {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
            if (LoadMoreRecyclerView.this.f47330h != null) {
                LoadMoreRecyclerView.this.f47330h.onScrollStateChanged(recyclerView, i4);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
            super.onScrolled(recyclerView, i4, i5);
            if (LoadMoreRecyclerView.this.f47329g != null && LoadMoreRecyclerView.this.f47324b && !LoadMoreRecyclerView.this.f47327e && i5 > 0) {
                int lastVisiblePosition = LoadMoreRecyclerView.this.getLastVisiblePosition();
                if (lastVisiblePosition + 1 == LoadMoreRecyclerView.this.f47326d.getItemCount()) {
                    LoadMoreRecyclerView.this.setLoadingMore(true);
                    LoadMoreRecyclerView.this.f47328f = lastVisiblePosition;
                    LoadMoreRecyclerView.this.f47329g.onLoadMore();
                }
            }
            if (LoadMoreRecyclerView.this.f47330h != null) {
                LoadMoreRecyclerView.this.f47330h.onScrolled(recyclerView, i4, i5);
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void onLoadMore();
    }

    public LoadMoreRecyclerView(Context context) {
        super(context);
        this.f47324b = true;
        this.f47325c = false;
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLastVisiblePosition() {
        if (getLayoutManager() instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) getLayoutManager()).findLastVisibleItemPosition();
        }
        if (getLayoutManager() instanceof GridLayoutManager) {
            return ((GridLayoutManager) getLayoutManager()).findLastVisibleItemPosition();
        }
        if (getLayoutManager() instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) getLayoutManager();
            return j(staggeredGridLayoutManager.findLastVisibleItemPositions(new int[staggeredGridLayoutManager.getSpanCount()]));
        }
        return getLayoutManager().getItemCount() - 1;
    }

    private void init() {
        super.addOnScrollListener(new a());
    }

    private int j(int[] iArr) {
        int i4 = Integer.MIN_VALUE;
        for (int i5 : iArr) {
            i4 = Math.max(i4, i5);
        }
        return i4;
    }

    public void a(boolean z4) {
        this.f47325c = z4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void addOnScrollListener(@NonNull RecyclerView.OnScrollListener onScrollListener) {
        this.f47330h = onScrollListener;
    }

    public void k(boolean z4) {
        setAutoLoadMoreEnable(z4);
        getAdapter().notifyDataSetChanged();
        getAdapter().notifyItemRemoved(this.f47328f);
        this.f47327e = false;
        a(z4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        if (adapter != null) {
            this.f47326d = new AutoLoadAdapter(adapter);
        }
        super.swapAdapter(this.f47326d, true);
    }

    public void setAutoLoadMoreEnable(boolean z4) {
        this.f47324b = z4;
    }

    public void setLoadMoreListener(b bVar) {
        this.f47329g = bVar;
    }

    public void setLoadingMore(boolean z4) {
        this.f47327e = z4;
    }

    public LoadMoreRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47324b = true;
        this.f47325c = false;
        init();
    }

    public LoadMoreRecyclerView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47324b = true;
        this.f47325c = false;
        init();
    }
}
