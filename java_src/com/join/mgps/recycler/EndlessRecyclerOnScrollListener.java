package com.join.mgps.recycler;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
/* loaded from: classes4.dex */
public class EndlessRecyclerOnScrollListener extends RecyclerView.OnScrollListener implements b {

    /* renamed from: a  reason: collision with root package name */
    protected LayoutManagerType f54000a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f54001b;

    /* renamed from: c  reason: collision with root package name */
    private int f54002c;

    /* renamed from: d  reason: collision with root package name */
    private int f54003d = 0;

    /* loaded from: classes4.dex */
    public enum LayoutManagerType {
        LinearLayout,
        StaggeredGridLayout,
        GridLayout
    }

    /* loaded from: classes4.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f54004a;

        static {
            int[] iArr = new int[LayoutManagerType.values().length];
            f54004a = iArr;
            try {
                iArr[LayoutManagerType.LinearLayout.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54004a[LayoutManagerType.GridLayout.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54004a[LayoutManagerType.StaggeredGridLayout.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private int b(int[] iArr) {
        int i4 = iArr[0];
        for (int i5 : iArr) {
            if (i5 > i4) {
                i4 = i5;
            }
        }
        return i4;
    }

    @Override // com.join.mgps.recycler.b
    public void a(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
        super.onScrollStateChanged(recyclerView, i4);
        this.f54003d = i4;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        int itemCount = layoutManager.getItemCount();
        if (childCount <= 0 || this.f54003d != 0 || this.f54002c < itemCount - 1) {
            return;
        }
        a(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
        super.onScrolled(recyclerView, i4, i5);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (this.f54000a == null) {
            if (layoutManager instanceof LinearLayoutManager) {
                this.f54000a = LayoutManagerType.LinearLayout;
            } else if (layoutManager instanceof GridLayoutManager) {
                this.f54000a = LayoutManagerType.GridLayout;
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                this.f54000a = LayoutManagerType.StaggeredGridLayout;
            } else {
                throw new RuntimeException("Unsupported LayoutManager used. Valid ones are LinearLayoutManager, GridLayoutManager and StaggeredGridLayoutManager");
            }
        }
        int i6 = a.f54004a[this.f54000a.ordinal()];
        if (i6 == 1) {
            this.f54002c = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        } else if (i6 == 2) {
            this.f54002c = ((GridLayoutManager) layoutManager).findLastVisibleItemPosition();
        } else if (i6 != 3) {
        } else {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            if (this.f54001b == null) {
                this.f54001b = new int[staggeredGridLayoutManager.getSpanCount()];
            }
            staggeredGridLayoutManager.findLastVisibleItemPositions(this.f54001b);
            this.f54002c = b(this.f54001b);
        }
    }
}
