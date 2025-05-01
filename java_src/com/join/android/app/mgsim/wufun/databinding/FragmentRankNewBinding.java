package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.SlidingTabLayout1;
import com.join.mgps.customview.ViewPagerCompat;
/* loaded from: classes3.dex */
public final class FragmentRankNewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20081b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f20082c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SlidingTabLayout1 f20083d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ViewPagerCompat f20084e;

    private FragmentRankNewBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull SlidingTabLayout1 slidingTabLayout1, @NonNull ViewPagerCompat viewPagerCompat) {
        this.f20081b = linearLayout;
        this.f20082c = linearLayout2;
        this.f20083d = slidingTabLayout1;
        this.f20084e = viewPagerCompat;
    }

    @NonNull
    public static FragmentRankNewBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = R.id.tabs;
        SlidingTabLayout1 slidingTabLayout1 = (SlidingTabLayout1) ViewBindings.findChildViewById(view, R.id.tabs);
        if (slidingTabLayout1 != null) {
            i4 = R.id.view_pager;
            ViewPagerCompat viewPagerCompat = (ViewPagerCompat) ViewBindings.findChildViewById(view, R.id.view_pager);
            if (viewPagerCompat != null) {
                return new FragmentRankNewBinding(linearLayout, linearLayout, slidingTabLayout1, viewPagerCompat);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentRankNewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20081b;
    }

    @NonNull
    public static FragmentRankNewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rank_new, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
