package com.join.kotlin.ui.findgame;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.MApplication;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.databinding.FindgameFragmentLayoutBinding;
import com.join.mgps.Util.g2;
import com.join.mgps.customview.NavigationAdapter;
import com.join.mgps.dto.FoundGameTabBean;
import com.join.mgps.dto.TabItemBean;
import com.join.mgps.fragment.CommonWebviewFragment_;
import com.join.mgps.fragment.FindMiniGameFragment;
import com.join.mgps.fragment.RankingFragment_;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: FindGameMainFragment.kt */
@SourceDebugExtension({"SMAP\nFindGameMainFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindGameMainFragment.kt\ncom/join/kotlin/ui/findgame/FindGameMainFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1045#2:190\n1855#2:191\n1856#2:193\n1855#2,2:194\n1855#2,2:196\n1855#2,2:198\n1#3:192\n*S KotlinDebug\n*F\n+ 1 FindGameMainFragment.kt\ncom/join/kotlin/ui/findgame/FindGameMainFragment\n*L\n61#1:190\n62#1:191\n62#1:193\n135#1:194,2\n157#1:196,2\n166#1:198,2\n*E\n"})
/* loaded from: classes3.dex */
public final class FindGameMainFragment extends Fragment {
    @Nullable
    private NavigationAdapter adapter;
    @Nullable
    private FindgameFragmentLayoutBinding binding;
    @Nullable
    private CommonWebviewFragment_ commonWebviewFragment;
    @Nullable
    private RankingFragment_ rankingFragment;
    @NotNull
    private final Lazy tabItems$delegate;
    private int selectedIndex = -1;
    @NotNull
    private ArrayList<Fragment> fragments = new ArrayList<>();

    public FindGameMainFragment() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<List<TabItemBean>>() { // from class: com.join.kotlin.ui.findgame.FindGameMainFragment$tabItems$2
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final List<TabItemBean> invoke() {
                FoundGameTabBean foundGameTabBean;
                try {
                    String d5 = MApplication.f1497x.l().found_game_tab().d();
                    if (!g2.i(d5) || (foundGameTabBean = (FoundGameTabBean) JsonMapper.getInstance().fromJson(d5, FoundGameTabBean.class)) == null) {
                        return null;
                    }
                    return foundGameTabBean.getTitle_info();
                } catch (Exception e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
        });
        this.tabItems$delegate = lazy;
    }

    private final void selectedTab(int i4) {
        if (i4 != -1) {
            List<TabItemBean> tabItems = getTabItems();
            if (tabItems != null) {
                for (TabItemBean tabItemBean : tabItems) {
                    Integer index = tabItemBean.getIndex();
                    if (index != null && index.intValue() == i4) {
                        Integer display_index = tabItemBean.getDisplay_index();
                        Intrinsics.checkNotNullExpressionValue(display_index, "item.display_index");
                        this.selectedIndex = display_index.intValue();
                    }
                }
            }
        } else {
            this.selectedIndex = 2;
        }
        if (this.selectedIndex == -1) {
            this.selectedIndex = 0;
        }
        FindgameFragmentLayoutBinding findgameFragmentLayoutBinding = this.binding;
        if (findgameFragmentLayoutBinding != null) {
            findgameFragmentLayoutBinding.f19513f.setCurrentItem(this.selectedIndex);
        }
    }

    static /* synthetic */ void selectedTab$default(FindGameMainFragment findGameMainFragment, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = -1;
        }
        findGameMainFragment.selectedTab(i4);
    }

    @Nullable
    public final NavigationAdapter getAdapter() {
        return this.adapter;
    }

    @Nullable
    public final FindgameFragmentLayoutBinding getBinding() {
        return this.binding;
    }

    @Nullable
    public final CommonWebviewFragment_ getCommonWebviewFragment() {
        return this.commonWebviewFragment;
    }

    public final int getDisplayIndex(int i4) {
        List<TabItemBean> tabItems = getTabItems();
        if (tabItems != null) {
            for (TabItemBean tabItemBean : tabItems) {
                Integer index = tabItemBean.getIndex();
                if (index != null && index.intValue() == i4) {
                    Integer display_index = tabItemBean.getDisplay_index();
                    Intrinsics.checkNotNullExpressionValue(display_index, "item.display_index");
                    return display_index.intValue();
                }
            }
            return 0;
        }
        return 0;
    }

    @NotNull
    public final ArrayList<Fragment> getFragments() {
        return this.fragments;
    }

    public final int getIndex(int i4) {
        List<TabItemBean> tabItems = getTabItems();
        if (tabItems != null) {
            for (TabItemBean tabItemBean : tabItems) {
                Integer display_index = tabItemBean.getDisplay_index();
                if (display_index != null && display_index.intValue() == i4) {
                    Integer index = tabItemBean.getIndex();
                    Intrinsics.checkNotNullExpressionValue(index, "item.index");
                    return index.intValue();
                }
            }
            return 0;
        }
        return 0;
    }

    @Nullable
    public final RankingFragment_ getRankingFragment() {
        return this.rankingFragment;
    }

    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Nullable
    public final List<TabItemBean> getTabItems() {
        return (List) this.tabItems$delegate.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
        r5 = kotlin.collections.CollectionsKt___CollectionsKt.sortedWith(r5, new com.join.kotlin.ui.findgame.FindGameMainFragment$onCreateView$$inlined$sortedBy$1());
     */
    @Override // androidx.fragment.app.Fragment
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull android.view.LayoutInflater r4, @org.jetbrains.annotations.Nullable android.view.ViewGroup r5, @org.jetbrains.annotations.Nullable android.os.Bundle r6) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.ui.findgame.FindGameMainFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
        int index = getIndex(this.selectedIndex);
        if (z4) {
            Fragment fragment = this.fragments.get(index);
            Intrinsics.checkNotNullExpressionValue(fragment, "fragments[index]");
            Fragment fragment2 = fragment;
            if (fragment2 instanceof FindMiniGameFragment) {
                ((FindMiniGameFragment) fragment2).r0();
                return;
            }
            return;
        }
        Fragment fragment3 = this.fragments.get(index);
        Intrinsics.checkNotNullExpressionValue(fragment3, "fragments[index]");
        Fragment fragment4 = fragment3;
        if (fragment4 instanceof FindMiniGameFragment) {
            ((FindMiniGameFragment) fragment4).s0();
        }
    }

    public final void setAdapter(@Nullable NavigationAdapter navigationAdapter) {
        this.adapter = navigationAdapter;
    }

    public final void setBinding(@Nullable FindgameFragmentLayoutBinding findgameFragmentLayoutBinding) {
        this.binding = findgameFragmentLayoutBinding;
    }

    public final void setCommonWebviewFragment(@Nullable CommonWebviewFragment_ commonWebviewFragment_) {
        this.commonWebviewFragment = commonWebviewFragment_;
    }

    public final void setFragments(@NotNull ArrayList<Fragment> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.fragments = arrayList;
    }

    public final void setRankingFragment(@Nullable RankingFragment_ rankingFragment_) {
        this.rankingFragment = rankingFragment_;
    }

    public final void setSelectedIndex(int i4) {
        this.selectedIndex = i4;
    }

    public void setSelectedTab(@Nullable Bundle bundle) {
        if (bundle != null) {
            RankingFragment_ rankingFragment_ = this.rankingFragment;
            if (rankingFragment_ != null) {
                rankingFragment_.Z(bundle.getString("currTabTagId"));
            }
            selectedTab(bundle.getInt("currTabNumber"));
        }
    }
}
