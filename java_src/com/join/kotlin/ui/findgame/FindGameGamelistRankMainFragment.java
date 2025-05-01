package com.join.kotlin.ui.findgame;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.databinding.FindgameGamelistrankfragmentLayoutBinding;
import com.join.mgps.Util.d0;
import com.join.mgps.customview.NavigationAdapter;
import com.join.mgps.fragment.GameFormFragment;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: FindGameGamelistRankMainFragment.kt */
/* loaded from: classes3.dex */
public final class FindGameGamelistRankMainFragment extends Fragment {
    public NavigationAdapter adapter;
    public FindgameGamelistrankfragmentLayoutBinding binding;

    @NotNull
    public final NavigationAdapter getAdapter() {
        NavigationAdapter navigationAdapter = this.adapter;
        if (navigationAdapter != null) {
            return navigationAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    @NotNull
    public final FindgameGamelistrankfragmentLayoutBinding getBinding() {
        FindgameGamelistrankfragmentLayoutBinding findgameGamelistrankfragmentLayoutBinding = this.binding;
        if (findgameGamelistrankfragmentLayoutBinding != null) {
            return findgameGamelistrankfragmentLayoutBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ArrayList arrayListOf;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FindgameGamelistrankfragmentLayoutBinding inflate = FindgameGamelistrankfragmentLayoutBinding.inflate(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        setBinding(inflate);
        arrayListOf = CollectionsKt__CollectionsKt.arrayListOf("热门", "最新");
        ArrayList arrayList = new ArrayList();
        arrayList.add(GameFormFragment.g0(1));
        arrayList.add(GameFormFragment.g0(2));
        setAdapter(new NavigationAdapter(getChildFragmentManager(), arrayList, arrayListOf));
        getBinding().f19516d.setAdapter(getAdapter());
        getAdapter().notifyDataSetChanged();
        getBinding().f19515c.setViewPager(getBinding().f19516d);
        return getBinding().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        d0.a().e(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
    }

    public final void setAdapter(@NotNull NavigationAdapter navigationAdapter) {
        Intrinsics.checkNotNullParameter(navigationAdapter, "<set-?>");
        this.adapter = navigationAdapter;
    }

    public final void setBinding(@NotNull FindgameGamelistrankfragmentLayoutBinding findgameGamelistrankfragmentLayoutBinding) {
        Intrinsics.checkNotNullParameter(findgameGamelistrankfragmentLayoutBinding, "<set-?>");
        this.binding = findgameGamelistrankfragmentLayoutBinding;
    }
}
