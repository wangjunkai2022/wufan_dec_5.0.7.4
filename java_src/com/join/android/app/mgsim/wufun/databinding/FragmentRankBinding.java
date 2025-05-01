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
import com.join.mgps.customview.SlidingTabLayout6;
import com.join.mgps.customview.ViewPagerCompat;
/* loaded from: classes3.dex */
public final class FragmentRankBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20069b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f20070c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SlidingTabLayout6 f20071d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ViewPagerCompat f20072e;

    private FragmentRankBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull SlidingTabLayout6 slidingTabLayout6, @NonNull ViewPagerCompat viewPagerCompat) {
        this.f20069b = linearLayout;
        this.f20070c = linearLayout2;
        this.f20071d = slidingTabLayout6;
        this.f20072e = viewPagerCompat;
    }

    @NonNull
    public static FragmentRankBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = R.id.tabs;
        SlidingTabLayout6 slidingTabLayout6 = (SlidingTabLayout6) ViewBindings.findChildViewById(view, R.id.tabs);
        if (slidingTabLayout6 != null) {
            i4 = R.id.viewPager;
            ViewPagerCompat viewPagerCompat = (ViewPagerCompat) ViewBindings.findChildViewById(view, R.id.viewPager);
            if (viewPagerCompat != null) {
                return new FragmentRankBinding(linearLayout, linearLayout, slidingTabLayout6, viewPagerCompat);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentRankBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20069b;
    }

    @NonNull
    public static FragmentRankBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rank, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
