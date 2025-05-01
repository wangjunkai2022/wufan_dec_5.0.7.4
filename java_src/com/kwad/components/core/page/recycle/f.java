package com.kwad.components.core.page.recycle;

import android.view.View;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.kwad.sdk.utils.aq;
/* loaded from: classes5.dex */
public final class f {
    final RecyclerView QC;
    final RecyclerView.LayoutManager QD;

    private f(RecyclerView recyclerView) {
        this.QC = recyclerView;
        this.QD = recyclerView.getLayoutManager();
    }

    private View a(int i4, int i5, boolean z4, boolean z5) {
        OrientationHelper createHorizontalHelper;
        if (this.QD.canScrollVertically()) {
            createHorizontalHelper = OrientationHelper.createVerticalHelper(this.QD);
        } else {
            createHorizontalHelper = OrientationHelper.createHorizontalHelper(this.QD);
        }
        int startAfterPadding = createHorizontalHelper.getStartAfterPadding();
        int endAfterPadding = createHorizontalHelper.getEndAfterPadding();
        int i6 = i5 > i4 ? 1 : -1;
        while (i4 != i5) {
            View childAt = this.QD.getChildAt(i4);
            int decoratedStart = createHorizontalHelper.getDecoratedStart(childAt);
            int decoratedEnd = createHorizontalHelper.getDecoratedEnd(childAt);
            if (decoratedStart < endAfterPadding && decoratedEnd > startAfterPadding) {
                return childAt;
            }
            i4 += i6;
        }
        return null;
    }

    public static f b(RecyclerView recyclerView) {
        aq.checkNotNull(recyclerView);
        return new f(recyclerView);
    }

    public final int findFirstVisibleItemPosition() {
        View a5 = a(0, this.QD.getChildCount(), false, true);
        if (a5 == null) {
            return -1;
        }
        return this.QC.getChildAdapterPosition(a5);
    }

    public final int findLastVisibleItemPosition() {
        View a5 = a(this.QD.getChildCount() - 1, -1, false, true);
        if (a5 == null) {
            return -1;
        }
        return this.QC.getChildAdapterPosition(a5);
    }
}
