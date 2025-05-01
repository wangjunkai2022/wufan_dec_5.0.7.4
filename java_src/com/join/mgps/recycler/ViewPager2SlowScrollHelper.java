package com.join.mgps.recycler;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ViewPager2SlowScrollHelper.kt */
/* loaded from: classes4.dex */
public final class ViewPager2SlowScrollHelper {
    private long duration;
    @NotNull
    private final Method getRelativeScrollPositionMethod;
    @NotNull
    private final Object mAccessibilityProvider;
    @NotNull
    private final Object mScrollEventAdapter;
    @NotNull
    private final Method notifyProgrammaticScrollMethod;
    @NotNull
    private final Method onSetNewCurrentItemMethod;
    @NotNull
    private final RecyclerView recyclerView;
    @NotNull
    private final ViewPager2 vp;

    /* compiled from: ViewPager2SlowScrollHelper.kt */
    /* loaded from: classes4.dex */
    public static final class a extends DecelerateInterpolator {
        a() {
        }

        @Override // android.view.animation.DecelerateInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float f5) {
            return f5;
        }
    }

    public ViewPager2SlowScrollHelper(@NotNull ViewPager2 vp, long j4) {
        Intrinsics.checkNotNullParameter(vp, "vp");
        this.vp = vp;
        this.duration = j4;
        Field declaredField = ViewPager2.class.getDeclaredField("mRecyclerView");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(vp);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) obj;
        this.recyclerView = recyclerView;
        recyclerView.getLayoutManager();
        Field declaredField2 = ViewPager2.class.getDeclaredField("mAccessibilityProvider");
        declaredField2.setAccessible(true);
        Object obj2 = declaredField2.get(vp);
        Intrinsics.checkNotNullExpressionValue(obj2, "mAccessibilityProviderField.get(vp)");
        this.mAccessibilityProvider = obj2;
        Method declaredMethod = obj2.getClass().getDeclaredMethod("onSetNewCurrentItem", new Class[0]);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "mAccessibilityProvider.j…od(\"onSetNewCurrentItem\")");
        this.onSetNewCurrentItemMethod = declaredMethod;
        declaredMethod.setAccessible(true);
        Field declaredField3 = ViewPager2.class.getDeclaredField("mScrollEventAdapter");
        declaredField3.setAccessible(true);
        Object obj3 = declaredField3.get(vp);
        Intrinsics.checkNotNullExpressionValue(obj3, "mScrollEventAdapterField.get(vp)");
        this.mScrollEventAdapter = obj3;
        Method declaredMethod2 = obj3.getClass().getDeclaredMethod("getRelativeScrollPosition", new Class[0]);
        Intrinsics.checkNotNullExpressionValue(declaredMethod2, "mScrollEventAdapter.java…tRelativeScrollPosition\")");
        this.getRelativeScrollPositionMethod = declaredMethod2;
        declaredMethod2.setAccessible(true);
        Method declaredMethod3 = obj3.getClass().getDeclaredMethod("notifyProgrammaticScroll", Integer.TYPE, Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod3, "mScrollEventAdapter.java…ean::class.java\n        )");
        this.notifyProgrammaticScrollMethod = declaredMethod3;
        declaredMethod3.setAccessible(true);
    }

    private final RecyclerView.SmoothScroller getSlowLinearSmoothScroller(final Context context) {
        return new LinearSmoothScroller(context) { // from class: com.join.mgps.recycler.ViewPager2SlowScrollHelper$getSlowLinearSmoothScroller$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public float calculateSpeedPerPixel(@Nullable DisplayMetrics displayMetrics) {
                return super.calculateSpeedPerPixel(displayMetrics) * 20;
            }
        };
    }

    private final void replaceDecelerateInterpolator(RecyclerView.SmoothScroller smoothScroller) {
        Field declaredField = LinearSmoothScroller.class.getDeclaredField("mDecelerateInterpolator");
        declaredField.setAccessible(true);
        declaredField.set(smoothScroller, new a());
    }

    private final void smoothScrollToPosition(int i4, Context context, RecyclerView.LayoutManager layoutManager) {
        RecyclerView.SmoothScroller slowLinearSmoothScroller = getSlowLinearSmoothScroller(context);
        replaceDecelerateInterpolator(slowLinearSmoothScroller);
        slowLinearSmoothScroller.setTargetPosition(i4);
        if (layoutManager != null) {
            layoutManager.startSmoothScroll(slowLinearSmoothScroller);
        }
    }

    public final long getDuration() {
        return this.duration;
    }

    public final void setCurrentItem(int i4) {
        int coerceAtLeast;
        int coerceAtMost;
        RecyclerView.Adapter adapter = this.vp.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<*>");
        if (adapter.getItemCount() <= 0) {
            return;
        }
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i4, 0);
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(coerceAtLeast, adapter.getItemCount() - 1);
        if ((coerceAtMost == this.vp.getCurrentItem() && this.vp.getScrollState() == 0) || coerceAtMost == this.vp.getCurrentItem()) {
            return;
        }
        this.vp.setCurrentItem(coerceAtMost);
        this.onSetNewCurrentItemMethod.invoke(this.mAccessibilityProvider, new Object[0]);
        this.notifyProgrammaticScrollMethod.invoke(this.mScrollEventAdapter, Integer.valueOf(coerceAtMost), Boolean.TRUE);
        Context context = this.vp.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "vp.context");
        smoothScrollToPosition(coerceAtMost, context, this.recyclerView.getLayoutManager());
    }

    public final void setDuration(long j4) {
        this.duration = j4;
    }
}
