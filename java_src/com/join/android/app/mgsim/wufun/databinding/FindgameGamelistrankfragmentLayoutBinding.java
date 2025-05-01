package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.SlidingTabLayout6;
/* loaded from: classes3.dex */
public final class FindgameGamelistrankfragmentLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f19514b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SlidingTabLayout6 f19515c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ViewPager f19516d;

    private FindgameGamelistrankfragmentLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SlidingTabLayout6 slidingTabLayout6, @NonNull ViewPager viewPager) {
        this.f19514b = constraintLayout;
        this.f19515c = slidingTabLayout6;
        this.f19516d = viewPager;
    }

    @NonNull
    public static FindgameGamelistrankfragmentLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.tabLayout;
        SlidingTabLayout6 slidingTabLayout6 = (SlidingTabLayout6) ViewBindings.findChildViewById(view, R.id.tabLayout);
        if (slidingTabLayout6 != null) {
            i4 = R.id.viewPager;
            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewPager);
            if (viewPager != null) {
                return new FindgameGamelistrankfragmentLayoutBinding((ConstraintLayout) view, slidingTabLayout6, viewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FindgameGamelistrankfragmentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f19514b;
    }

    @NonNull
    public static FindgameGamelistrankfragmentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.findgame_gamelistrankfragment_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
