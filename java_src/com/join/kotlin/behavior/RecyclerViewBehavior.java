package com.join.kotlin.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: RecyclerViewBehavior.kt */
/* loaded from: classes3.dex */
public final class RecyclerViewBehavior extends AppBarLayout.ScrollingViewBehavior {
    @Nullable
    private RecyclerView mRecyclerView;

    public RecyclerViewBehavior(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final RecyclerView getNestedScrollingChild(View view) {
        RecyclerView nestedScrollingChild;
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
                if (viewGroup2 != null && (nestedScrollingChild = getNestedScrollingChild(viewGroup2)) != null) {
                    return nestedScrollingChild;
                }
            }
        }
        return null;
    }

    private final boolean onTouchedSelf(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return motionEvent.getRawY() > ((float) iArr[1]);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NotNull CoordinatorLayout parent, @NotNull View child, @NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (ev.getAction() == 0 && !onTouchedSelf(child, ev)) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                recyclerView = getNestedScrollingChild(child);
            }
            if (recyclerView != null) {
                recyclerView.stopNestedScroll();
                recyclerView.stopScroll();
                this.mRecyclerView = recyclerView;
            }
        }
        return super.onInterceptTouchEvent(parent, child, ev);
    }
}
