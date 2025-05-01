package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class NavigationRailMenuView extends NavigationBarMenuView {
    @Px
    private int itemMinimumHeight;
    private final FrameLayout.LayoutParams layoutParams;

    public NavigationRailMenuView(@NonNull Context context) {
        super(context);
        this.itemMinimumHeight = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.layoutParams = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    private int makeSharedHeightSpec(int i4, int i5, int i6) {
        int max = i5 / Math.max(1, i6);
        int i7 = this.itemMinimumHeight;
        if (i7 == -1) {
            i7 = View.MeasureSpec.getSize(i4);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(i7, max), 0);
    }

    private int measureChildHeight(View view, int i4, int i5) {
        if (view.getVisibility() != 8) {
            view.measure(i4, i5);
            return view.getMeasuredHeight();
        }
        return 0;
    }

    private int measureSharedChildHeights(int i4, int i5, int i6, View view) {
        int makeMeasureSpec;
        makeSharedHeightSpec(i4, i5, i6);
        if (view == null) {
            makeMeasureSpec = makeSharedHeightSpec(i4, i5, i6);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt != view) {
                i7 += measureChildHeight(childAt, i4, makeMeasureSpec);
            }
        }
        return i7;
    }

    private int measureShiftingChildHeights(int i4, int i5, int i6) {
        int i7;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            i7 = measureChildHeight(childAt, i4, makeSharedHeightSpec(i4, i5, i6));
            i5 -= i7;
            i6--;
        } else {
            i7 = 0;
        }
        return i7 + measureSharedChildHeights(i4, i5, i6, childAt);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @NonNull
    protected NavigationBarItemView createNavigationBarItemView(@NonNull Context context) {
        return new NavigationRailItemView(context);
    }

    @Px
    public int getItemMinimumHeight() {
        return this.itemMinimumHeight;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMenuGravity() {
        return this.layoutParams.gravity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isTopGravity() {
        return (this.layoutParams.gravity & 112) == 48;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        int i8 = i6 - i4;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                childAt.layout(0, i9, i8, measuredHeight);
                i9 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int measureSharedChildHeights;
        int size = View.MeasureSpec.getSize(i5);
        int size2 = getMenu().getVisibleItems().size();
        if (size2 > 1 && isShifting(getLabelVisibilityMode(), size2)) {
            measureSharedChildHeights = measureShiftingChildHeights(i4, size, size2);
        } else {
            measureSharedChildHeights = measureSharedChildHeights(i4, size, size2, null);
        }
        setMeasuredDimension(View.resolveSizeAndState(View.MeasureSpec.getSize(i4), i4, 0), View.resolveSizeAndState(measureSharedChildHeights, i5, 0));
    }

    public void setItemMinimumHeight(@Px int i4) {
        if (this.itemMinimumHeight != i4) {
            this.itemMinimumHeight = i4;
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMenuGravity(int i4) {
        FrameLayout.LayoutParams layoutParams = this.layoutParams;
        if (layoutParams.gravity != i4) {
            layoutParams.gravity = i4;
            setLayoutParams(layoutParams);
        }
    }
}
