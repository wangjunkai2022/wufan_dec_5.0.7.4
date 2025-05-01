package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.NoScrollViewPager;
/* loaded from: classes3.dex */
public final class FragmentModGameCloudViewpagerBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f19885b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f19886c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final NoScrollViewPager f19887d;

    private FragmentModGameCloudViewpagerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull NoScrollViewPager noScrollViewPager) {
        this.f19885b = constraintLayout;
        this.f19886c = recyclerView;
        this.f19887d = noScrollViewPager;
    }

    @NonNull
    public static FragmentModGameCloudViewpagerBinding bind(@NonNull View view) {
        int i4 = R.id.subTabList;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.subTabList);
        if (recyclerView != null) {
            i4 = R.id.viewpager;
            NoScrollViewPager noScrollViewPager = (NoScrollViewPager) ViewBindings.findChildViewById(view, R.id.viewpager);
            if (noScrollViewPager != null) {
                return new FragmentModGameCloudViewpagerBinding((ConstraintLayout) view, recyclerView, noScrollViewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentModGameCloudViewpagerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f19885b;
    }

    @NonNull
    public static FragmentModGameCloudViewpagerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mod_game_cloud_viewpager, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
