package com.donkingliang.consecutivescroller;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class ConsecutiveViewPager2 extends FrameLayout implements com.donkingliang.consecutivescroller.a {

    /* renamed from: e  reason: collision with root package name */
    private static final int f10256e = -123;

    /* renamed from: b  reason: collision with root package name */
    protected ViewPager2 f10257b;

    /* renamed from: c  reason: collision with root package name */
    protected RecyclerView f10258c;

    /* renamed from: d  reason: collision with root package name */
    private int f10259d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a implements View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        WeakReference<ConsecutiveViewPager2> f10260b;

        /* renamed from: c  reason: collision with root package name */
        View f10261c;

        public a(ConsecutiveViewPager2 consecutiveViewPager2, View view) {
            this.f10260b = new WeakReference<>(consecutiveViewPager2);
            this.f10261c = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (this.f10260b.get() != null) {
                this.f10260b.get().f(this.f10261c);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public ConsecutiveViewPager2(@NonNull Context context) {
        super(context);
        c(context);
    }

    private void c(Context context) {
        ViewPager2 viewPager2 = new ViewPager2(context);
        this.f10257b = viewPager2;
        addView(viewPager2, -1, -1);
        this.f10258c = (RecyclerView) this.f10257b.getChildAt(0);
    }

    private boolean d() {
        ViewParent parent = getParent();
        if (parent instanceof ConsecutiveScrollerLayout) {
            ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) parent;
            return consecutiveScrollerLayout.indexOfChild(this) == consecutiveScrollerLayout.getChildCount() - 1;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(View view) {
        View m4;
        if (view == null || !(getParent() instanceof ConsecutiveScrollerLayout)) {
            return;
        }
        ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) getParent();
        int indexOfChild = consecutiveScrollerLayout.indexOfChild(this);
        if ((indexOfChild != consecutiveScrollerLayout.getChildCount() - 1 || getHeight() >= consecutiveScrollerLayout.getHeight() || consecutiveScrollerLayout.getScrollY() < consecutiveScrollerLayout.f10220c) && (m4 = consecutiveScrollerLayout.m()) != null) {
            int indexOfChild2 = consecutiveScrollerLayout.indexOfChild(m4);
            if (indexOfChild < indexOfChild2) {
                consecutiveScrollerLayout.Y(view);
            } else if (indexOfChild > indexOfChild2) {
                consecutiveScrollerLayout.Z(view);
            }
        }
    }

    private void setAttachListener(View view) {
        if (view.getTag(f10256e) != null) {
            a aVar = (a) view.getTag(f10256e);
            if (aVar.f10260b.get() == null) {
                view.removeOnAttachStateChangeListener(aVar);
                view.setTag(f10256e, null);
            }
        }
        if (view.getTag(f10256e) == null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if ((layoutParams instanceof ConsecutiveScrollerLayout.LayoutParams) && ((ConsecutiveScrollerLayout.LayoutParams) layoutParams).f10244a) {
                View.OnAttachStateChangeListener aVar2 = new a(this, view);
                view.addOnAttachStateChangeListener(aVar2);
                view.setTag(f10256e, aVar2);
            }
        }
    }

    protected View b(View view) {
        if ((this.f10258c.getAdapter() instanceof FragmentStateAdapter) && (view instanceof FrameLayout)) {
            FrameLayout frameLayout = (FrameLayout) view;
            return frameLayout.getChildCount() > 0 ? frameLayout.getChildAt(0) : view;
        }
        return view;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i4) {
        return this.f10257b.canScrollHorizontally(i4);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i4) {
        return this.f10257b.canScrollVertically(i4);
    }

    public void e(@NonNull ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.f10257b.registerOnPageChangeCallback(onPageChangeCallback);
    }

    public void g(@NonNull ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.f10257b.unregisterOnPageChangeCallback(onPageChangeCallback);
    }

    @Nullable
    public RecyclerView.Adapter getAdapter() {
        return this.f10257b.getAdapter();
    }

    public int getAdjustHeight() {
        return this.f10259d;
    }

    public int getCurrentItem() {
        return this.f10257b.getCurrentItem();
    }

    @Override // com.donkingliang.consecutivescroller.a
    public View getCurrentScrollerView() {
        View view;
        int currentItem = getCurrentItem();
        RecyclerView.Adapter adapter = this.f10258c.getAdapter();
        RecyclerView.LayoutManager layoutManager = this.f10258c.getLayoutManager();
        if (adapter == null || layoutManager == null || currentItem < 0 || currentItem >= adapter.getItemCount()) {
            view = null;
        } else {
            view = b(layoutManager.findViewByPosition(currentItem));
            if (view != null) {
                setAttachListener(view);
            }
        }
        return view == null ? this.f10258c : view;
    }

    public int getOffscreenPageLimit() {
        return this.f10257b.getOffscreenPageLimit();
    }

    public int getOrientation() {
        return this.f10257b.getOrientation();
    }

    @Override // com.donkingliang.consecutivescroller.a
    public List<View> getScrolledViews() {
        ArrayList arrayList = new ArrayList();
        int childCount = this.f10258c.getChildCount();
        if (childCount > 0) {
            for (int i4 = 0; i4 < childCount; i4++) {
                arrayList.add(b(this.f10258c.getChildAt(i4)));
            }
        }
        return arrayList;
    }

    public ViewPager2 getViewPager2() {
        return this.f10257b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        if (d() && this.f10259d > 0) {
            super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(FrameLayout.getDefaultSize(0, i5) - this.f10259d, View.MeasureSpec.getMode(i5)));
        } else {
            super.onMeasure(i4, i5);
        }
    }

    public void setAdapter(@Nullable RecyclerView.Adapter adapter) {
        this.f10257b.setAdapter(adapter);
    }

    public void setAdjustHeight(int i4) {
        if (this.f10259d != i4) {
            this.f10259d = i4;
            requestLayout();
        }
    }

    public void setCurrentItem(int i4) {
        this.f10257b.setCurrentItem(i4);
    }

    public void setOffscreenPageLimit(int i4) {
        this.f10257b.setOffscreenPageLimit(i4);
    }

    public void setOrientation(int i4) {
        this.f10257b.setOrientation(i4);
    }

    public void setCurrentItem(int i4, boolean z4) {
        this.f10257b.setCurrentItem(i4, z4);
    }

    public ConsecutiveViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context);
    }

    public ConsecutiveViewPager2(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        c(context);
    }
}
