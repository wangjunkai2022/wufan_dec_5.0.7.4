package com.join.kotlin.bindingadapter;

import androidx.databinding.BindingAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.join.mgps.customview.BtReginSlidinTablayout;
import com.join.mgps.customview.NavigationAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: ViewBindingSlidingTablayout.kt */
/* loaded from: classes3.dex */
public final class ViewBindingSlidingTablayoutKt {
    @BindingAdapter(requireAll = false, value = {"viewPager", "fragments", "titles", "fragmentManager"})
    public static final void viewpagerSlidingTabLayout(@NotNull SlidingTabLayout tabLayout, @NotNull ViewPager viewPager, @NotNull List<? extends Fragment> fragments, @NotNull List<String> titles, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(tabLayout, "tabLayout");
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        Intrinsics.checkNotNullParameter(fragments, "fragments");
        Intrinsics.checkNotNullParameter(titles, "titles");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(fragments);
        NavigationAdapter navigationAdapter = new NavigationAdapter(fragmentManager, arrayList, titles);
        navigationAdapter.d(fragments, titles);
        viewPager.setAdapter(navigationAdapter);
        tabLayout.setViewPager(viewPager);
    }

    @BindingAdapter(requireAll = false, value = {"viewPager", "fragments", "titles", "fragmentManager"})
    public static final void viewpagertabLayout(@NotNull BtReginSlidinTablayout tabLayout, @NotNull ViewPager viewPager, @NotNull List<? extends Fragment> fragments, @NotNull List<String> titles, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(tabLayout, "tabLayout");
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        Intrinsics.checkNotNullParameter(fragments, "fragments");
        Intrinsics.checkNotNullParameter(titles, "titles");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(fragments);
        NavigationAdapter navigationAdapter = new NavigationAdapter(fragmentManager, arrayList, titles);
        navigationAdapter.d(fragments, titles);
        viewPager.setAdapter(navigationAdapter);
        tabLayout.setViewPager(viewPager);
    }
}
