package com.join.kotlin.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: AppBarLayoutBehavior.kt */
/* loaded from: classes3.dex */
public final class AppBarLayoutBehavior extends AppBarLayout.Behavior {
    private boolean isFlinging;
    private boolean shouldBlockNestedScroll;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarLayoutBehavior(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Field getFlingRunnableField() {
        Class superclass;
        Class superclass2;
        Class superclass3 = AppBarLayoutBehavior.class.getSuperclass();
        if (superclass3 != null) {
            try {
                superclass = superclass3.getSuperclass();
            } catch (NoSuchFieldException e5) {
                e5.printStackTrace();
                Class superclass4 = (superclass3 == null || (superclass2 = superclass3.getSuperclass()) == null) ? null : superclass2.getSuperclass();
                if (superclass4 != null) {
                    return superclass4.getDeclaredField("flingRunnable");
                }
                return null;
            }
        } else {
            superclass = null;
        }
        if (superclass != null) {
            return superclass.getDeclaredField("mFlingRunnable");
        }
        return null;
    }

    private final Field getScrollerField() throws NoSuchFieldException {
        Class superclass;
        Class superclass2;
        Class superclass3 = AppBarLayoutBehavior.class.getSuperclass();
        if (superclass3 != null) {
            try {
                superclass = superclass3.getSuperclass();
            } catch (NoSuchFieldException e5) {
                e5.printStackTrace();
                Class superclass4 = (superclass3 == null || (superclass2 = superclass3.getSuperclass()) == null) ? null : superclass2.getSuperclass();
                if (superclass4 != null) {
                    return superclass4.getDeclaredField("scroller");
                }
                return null;
            }
        } else {
            superclass = null;
        }
        if (superclass != null) {
            return superclass.getDeclaredField("mScroller");
        }
        return null;
    }

    private final void stopAppbarLayoutFling(AppBarLayout appBarLayout) {
        try {
            Field flingRunnableField = getFlingRunnableField();
            if (flingRunnableField != null) {
                flingRunnableField.setAccessible(true);
            }
            Object obj = flingRunnableField != null ? flingRunnableField.get(this) : null;
            Runnable runnable = obj instanceof Runnable ? (Runnable) obj : null;
            if (runnable != null) {
                appBarLayout.removeCallbacks(runnable);
                flingRunnableField.set(this, null);
            }
            Field scrollerField = getScrollerField();
            if (scrollerField != null) {
                scrollerField.setAccessible(true);
            }
            Object obj2 = scrollerField != null ? scrollerField.get(this) : null;
            OverScroller overScroller = obj2 instanceof OverScroller ? (OverScroller) obj2 : null;
            if (overScroller == null || overScroller.isFinished()) {
                return;
            }
            overScroller.abortAnimation();
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
        } catch (NoSuchFieldException e6) {
            e6.printStackTrace();
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.Behavior, com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NotNull CoordinatorLayout parent, @NotNull AppBarLayout child, @NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(ev, "ev");
        this.shouldBlockNestedScroll = this.isFlinging;
        if (ev.getActionMasked() == 0) {
            stopAppbarLayoutFling(child);
        }
        return super.onInterceptTouchEvent(parent, (View) child, ev);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull AppBarLayout child, @NotNull View target, int i4, int i5, @NotNull int[] consumed, int i6) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        if (i6 == 1) {
            this.isFlinging = true;
        }
        if (this.shouldBlockNestedScroll) {
            return;
        }
        super.onNestedPreScroll(coordinatorLayout, child, target, i4, i5, consumed, i6);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull AppBarLayout child, @NotNull View target, int i4, int i5, int i6, int i7, int i8) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        if (this.shouldBlockNestedScroll) {
            return;
        }
        super.onNestedScroll(coordinatorLayout, (CoordinatorLayout) child, target, i4, i5, i6, i7, i8);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NotNull CoordinatorLayout parent, @NotNull AppBarLayout child, @NotNull View directTargetChild, @NotNull View target, int i4, int i5) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(directTargetChild, "directTargetChild");
        Intrinsics.checkNotNullParameter(target, "target");
        stopAppbarLayoutFling(child);
        return super.onStartNestedScroll(parent, child, directTargetChild, target, i4, i5);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull AppBarLayout abl, @NotNull View target, int i4) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(abl, "abl");
        Intrinsics.checkNotNullParameter(target, "target");
        super.onStopNestedScroll(coordinatorLayout, abl, target, i4);
        this.isFlinging = false;
        this.shouldBlockNestedScroll = false;
    }
}
