package com.join.kotlin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.EverydayNewGameFragmentBinding;
import com.join.mgps.activity.LocalGameActivity;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: EveryDayNewGameFragment.kt */
/* loaded from: classes3.dex */
public final class EveryDayNewGameFragment extends Fragment {
    public FragmentStateAdapter adapter;
    public EverydayNewGameFragmentBinding binding;

    @NotNull
    public final FragmentStateAdapter getAdapter() {
        FragmentStateAdapter fragmentStateAdapter = this.adapter;
        if (fragmentStateAdapter != null) {
            return fragmentStateAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    @NotNull
    public final EverydayNewGameFragmentBinding getBinding() {
        EverydayNewGameFragmentBinding everydayNewGameFragmentBinding = this.binding;
        if (everydayNewGameFragmentBinding != null) {
            return everydayNewGameFragmentBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        EverydayNewGameFragmentBinding inflate = EverydayNewGameFragmentBinding.inflate(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        setBinding(inflate);
        return getBinding().getRoot();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        ArrayList arrayListOf;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(LocalGameActivity.f34225s, "网游", "单机", "模拟器");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new ArrayList();
        Iterator it2 = arrayListOf.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            EverdayNewFragment everdayNewFragment = new EverdayNewFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putString("title", str);
            bundle2.putBoolean("_from_home", true);
            everdayNewFragment.setArguments(bundle2);
            ((ArrayList) objectRef.element).add(everdayNewFragment);
            TabLayout.Tab customView = getBinding().f19334c.newTab().setCustomView(R.layout.layout_custom_tab_main_game);
            Intrinsics.checkNotNullExpressionValue(customView, "binding.tablayout.newTab…out_custom_tab_main_game)");
            if (customView.getCustomView() != null) {
                View customView2 = customView.getCustomView();
                Intrinsics.checkNotNull(customView2);
                ((TextView) customView2.findViewById(R.id.tabText)).setText(str);
                getBinding().f19334c.addTab(customView);
            }
        }
        final FragmentActivity requireActivity = requireActivity();
        setAdapter(new FragmentStateAdapter(requireActivity) { // from class: com.join.kotlin.EveryDayNewGameFragment$onViewCreated$1
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter
            @NotNull
            public Fragment createFragment(int i4) {
                Fragment fragment = objectRef.element.get(i4);
                Intrinsics.checkNotNullExpressionValue(fragment, "fragments[position]");
                return fragment;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemCount() {
                return objectRef.element.size();
            }
        });
        getBinding().f19335d.setAdapter(getAdapter());
        getAdapter().notifyDataSetChanged();
        getBinding().f19334c.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: com.join.kotlin.EveryDayNewGameFragment$onViewCreated$2
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(@NotNull TabLayout.Tab tab) {
                Intrinsics.checkNotNullParameter(tab, "tab");
                EveryDayNewGameFragment.this.getBinding().f19335d.setCurrentItem(tab.getPosition());
                int tabCount = EveryDayNewGameFragment.this.getBinding().f19334c.getTabCount();
                for (int i4 = 0; i4 < tabCount; i4++) {
                    TabLayout.Tab tabAt = EveryDayNewGameFragment.this.getBinding().f19334c.getTabAt(i4);
                    if (tabAt != null && tabAt.getCustomView() != null) {
                        View customView3 = tabAt.getCustomView();
                        Intrinsics.checkNotNull(customView3);
                        TextView textView = (TextView) customView3.findViewById(R.id.tabText);
                        textView.setTextSize(0, EveryDayNewGameFragment.this.getResources().getDimension(tabAt.isSelected() ? R.dimen.wdp32 : R.dimen.wdp28));
                        textView.setTypeface(null, tabAt.isSelected() ? 1 : 0);
                    }
                }
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(@NotNull TabLayout.Tab tab) {
                Intrinsics.checkNotNullParameter(tab, "tab");
                EveryDayNewGameFragment.this.getBinding().f19335d.setCurrentItem(tab.getPosition());
                int tabCount = EveryDayNewGameFragment.this.getBinding().f19334c.getTabCount();
                for (int i4 = 0; i4 < tabCount; i4++) {
                    TabLayout.Tab tabAt = EveryDayNewGameFragment.this.getBinding().f19334c.getTabAt(i4);
                    if (tabAt != null && tabAt.getCustomView() != null) {
                        View customView3 = tabAt.getCustomView();
                        Intrinsics.checkNotNull(customView3);
                        TextView textView = (TextView) customView3.findViewById(R.id.tabText);
                        textView.setTextSize(0, EveryDayNewGameFragment.this.getResources().getDimension(tabAt.isSelected() ? R.dimen.wdp36 : R.dimen.wdp28));
                        textView.setTypeface(null, tabAt.isSelected() ? 1 : 0);
                    }
                }
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(@NotNull TabLayout.Tab tab) {
                Intrinsics.checkNotNullParameter(tab, "tab");
            }
        });
        getBinding().f19335d.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.join.kotlin.EveryDayNewGameFragment$onViewCreated$3
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i4) {
                super.onPageSelected(i4);
                EveryDayNewGameFragment.this.getBinding().f19334c.selectTab(EveryDayNewGameFragment.this.getBinding().f19334c.getTabAt(i4));
            }
        });
        getBinding().f19335d.setOffscreenPageLimit(5);
        getBinding().f19334c.selectTab(getBinding().f19334c.getTabAt(0));
    }

    public final void setAdapter(@NotNull FragmentStateAdapter fragmentStateAdapter) {
        Intrinsics.checkNotNullParameter(fragmentStateAdapter, "<set-?>");
        this.adapter = fragmentStateAdapter;
    }

    public final void setBinding(@NotNull EverydayNewGameFragmentBinding everydayNewGameFragmentBinding) {
        Intrinsics.checkNotNullParameter(everydayNewGameFragmentBinding, "<set-?>");
        this.binding = everydayNewGameFragmentBinding;
    }
}
