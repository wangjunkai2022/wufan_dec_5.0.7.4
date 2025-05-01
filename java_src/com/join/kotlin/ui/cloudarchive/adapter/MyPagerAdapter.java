package com.join.kotlin.ui.cloudarchive.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: MyPagerAdapter.kt */
/* loaded from: classes3.dex */
public final class MyPagerAdapter extends PagerAdapter {
    @NotNull
    private final List<View> mViewList;

    /* JADX WARN: Multi-variable type inference failed */
    public MyPagerAdapter(@NotNull List<? extends View> mViewList) {
        Intrinsics.checkNotNullParameter(mViewList, "mViewList");
        this.mViewList = mViewList;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NotNull ViewGroup container, int i4, @NotNull Object any) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(any, "any");
        List<View> list = this.mViewList;
        Intrinsics.checkNotNull(list);
        container.removeView(list.get(i4));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        List<View> list = this.mViewList;
        Intrinsics.checkNotNull(list);
        return list.size();
    }

    @NotNull
    public final List<View> getMViewList() {
        return this.mViewList;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NotNull
    public Object instantiateItem(@NotNull ViewGroup container, int i4) {
        Intrinsics.checkNotNullParameter(container, "container");
        List<View> list = this.mViewList;
        container.addView(list != null ? list.get(i4) : null);
        List<View> list2 = this.mViewList;
        Intrinsics.checkNotNull(list2);
        return list2.get(i4);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NotNull View p02, @NotNull Object p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return Intrinsics.areEqual(p02, p12);
    }
}
