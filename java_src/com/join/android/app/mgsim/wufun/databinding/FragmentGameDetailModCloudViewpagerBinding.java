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
public final class FragmentGameDetailModCloudViewpagerBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f19853b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f19854c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final NoScrollViewPager f19855d;

    private FragmentGameDetailModCloudViewpagerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull NoScrollViewPager noScrollViewPager) {
        this.f19853b = constraintLayout;
        this.f19854c = recyclerView;
        this.f19855d = noScrollViewPager;
    }

    @NonNull
    public static FragmentGameDetailModCloudViewpagerBinding bind(@NonNull View view) {
        int i4 = R.id.subTabList;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.subTabList);
        if (recyclerView != null) {
            i4 = R.id.viewpager;
            NoScrollViewPager noScrollViewPager = (NoScrollViewPager) ViewBindings.findChildViewById(view, R.id.viewpager);
            if (noScrollViewPager != null) {
                return new FragmentGameDetailModCloudViewpagerBinding((ConstraintLayout) view, recyclerView, noScrollViewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentGameDetailModCloudViewpagerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f19853b;
    }

    @NonNull
    public static FragmentGameDetailModCloudViewpagerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_game_detail_mod_cloud_viewpager, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
