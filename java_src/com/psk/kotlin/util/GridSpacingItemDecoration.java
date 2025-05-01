package com.psk.kotlin.util;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: GridSpacingItemDecoration.kt */
/* loaded from: classes5.dex */
public final class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {
    private final boolean includeEdge;
    private final int spacing;
    private final int spanCount;

    public GridSpacingItemDecoration(int i4, int i5, boolean z4) {
        this.spanCount = i4;
        this.spacing = i5;
        this.includeEdge = z4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int i4 = this.spanCount;
        int i5 = childAdapterPosition % i4;
        if (this.includeEdge) {
            int i6 = this.spacing;
            outRect.left = i6 - ((i5 * i6) / i4);
            outRect.right = ((i5 + 1) * i6) / i4;
            if (childAdapterPosition < i4) {
                outRect.top = i6;
            }
            outRect.bottom = i6;
            return;
        }
        int i7 = this.spacing;
        outRect.left = (i5 * i7) / i4;
        outRect.right = i7 - (((i5 + 1) * i7) / i4);
        if (childAdapterPosition >= i4) {
            outRect.top = i7;
        }
    }
}
