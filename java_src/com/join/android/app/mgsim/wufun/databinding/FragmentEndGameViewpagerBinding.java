package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FragmentEndGameViewpagerBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19758b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SlidingTabLayout f19759c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ViewPager f19760d;

    private FragmentEndGameViewpagerBinding(@NonNull LinearLayout linearLayout, @NonNull SlidingTabLayout slidingTabLayout, @NonNull ViewPager viewPager) {
        this.f19758b = linearLayout;
        this.f19759c = slidingTabLayout;
        this.f19760d = viewPager;
    }

    @NonNull
    public static FragmentEndGameViewpagerBinding bind(@NonNull View view) {
        int i4 = R.id.tablayout;
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, R.id.tablayout);
        if (slidingTabLayout != null) {
            i4 = R.id.viewpager;
            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewpager);
            if (viewPager != null) {
                return new FragmentEndGameViewpagerBinding((LinearLayout) view, slidingTabLayout, viewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentEndGameViewpagerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19758b;
    }

    @NonNull
    public static FragmentEndGameViewpagerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_end_game_viewpager, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
