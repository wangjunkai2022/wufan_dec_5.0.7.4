package com.join.kotlin.bindingadapter;

import androidx.databinding.BindingAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.join.mgps.customview.NavigationAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: ViewBindingViewPager.kt */
/* loaded from: classes3.dex */
public final class ViewBindingViewPagerKt {
    @BindingAdapter(requireAll = false, value = {"fragments", "titles", "fragmentManager"})
    public static final void viewpagerFragment(@NotNull ViewPager viewPager, @NotNull List<? extends Fragment> fragments, @NotNull List<String> titles, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        Intrinsics.checkNotNullParameter(fragments, "fragments");
        Intrinsics.checkNotNullParameter(titles, "titles");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(fragments);
        NavigationAdapter navigationAdapter = new NavigationAdapter(fragmentManager, arrayList, titles);
        navigationAdapter.d(fragments, titles);
        viewPager.setAdapter(navigationAdapter);
    }
}
