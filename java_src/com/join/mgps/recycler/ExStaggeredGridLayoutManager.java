package com.join.mgps.recycler;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
/* loaded from: classes4.dex */
public class ExStaggeredGridLayoutManager extends StaggeredGridLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    private final String f54005a;

    /* renamed from: b  reason: collision with root package name */
    GridLayoutManager.SpanSizeLookup f54006b;

    public ExStaggeredGridLayoutManager(int i4, int i5) {
        super(i4, i5);
        this.f54005a = getClass().getSimpleName();
    }

    public GridLayoutManager.SpanSizeLookup getSpanSizeLookup() {
        return this.f54006b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int i4, int i5) {
        for (int i6 = 0; i6 < getItemCount(); i6++) {
            if (this.f54006b.getSpanSize(i6) > 1) {
                try {
                    View viewForPosition = recycler.getViewForPosition(i6);
                    if (viewForPosition != null) {
                        ((StaggeredGridLayoutManager.LayoutParams) viewForPosition.getLayoutParams()).setFullSpan(true);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
        super.onMeasure(recycler, state, i4, i5);
    }

    public void setSpanSizeLookup(GridLayoutManager.SpanSizeLookup spanSizeLookup) {
        this.f54006b = spanSizeLookup;
    }
}
