package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.SlidingTabLayout6;
/* loaded from: classes3.dex */
public final class FindgameFragmentLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f19509b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f19510c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f19511d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SlidingTabLayout6 f19512e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ViewPager f19513f;

    private FindgameFragmentLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull View view, @NonNull SlidingTabLayout6 slidingTabLayout6, @NonNull ViewPager viewPager) {
        this.f19509b = constraintLayout;
        this.f19510c = imageView;
        this.f19511d = view;
        this.f19512e = slidingTabLayout6;
        this.f19513f = viewPager;
    }

    @NonNull
    public static FindgameFragmentLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.search;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.search);
        if (imageView != null) {
            i4 = R.id.statubar;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.statubar);
            if (findChildViewById != null) {
                i4 = R.id.tabLayout;
                SlidingTabLayout6 slidingTabLayout6 = (SlidingTabLayout6) ViewBindings.findChildViewById(view, R.id.tabLayout);
                if (slidingTabLayout6 != null) {
                    i4 = R.id.viewPager;
                    ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewPager);
                    if (viewPager != null) {
                        return new FindgameFragmentLayoutBinding((ConstraintLayout) view, imageView, findChildViewById, slidingTabLayout6, viewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FindgameFragmentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f19509b;
    }

    @NonNull
    public static FindgameFragmentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.findgame_fragment_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
