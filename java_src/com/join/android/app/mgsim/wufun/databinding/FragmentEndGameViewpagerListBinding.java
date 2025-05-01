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
import com.facebook.drawee.view.SimpleDraweeView;
import com.flyco.tablayout.SlidingTabLayout;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FragmentEndGameViewpagerListBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f19761b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f19762c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SlidingTabLayout f19763d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ViewPager f19764e;

    private FragmentEndGameViewpagerListBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SlidingTabLayout slidingTabLayout, @NonNull ViewPager viewPager) {
        this.f19761b = constraintLayout;
        this.f19762c = simpleDraweeView;
        this.f19763d = slidingTabLayout;
        this.f19764e = viewPager;
    }

    @NonNull
    public static FragmentEndGameViewpagerListBinding bind(@NonNull View view) {
        int i4 = R.id.iconAd;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.iconAd);
        if (simpleDraweeView != null) {
            i4 = R.id.tablayout;
            SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, R.id.tablayout);
            if (slidingTabLayout != null) {
                i4 = R.id.viewpager;
                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewpager);
                if (viewPager != null) {
                    return new FragmentEndGameViewpagerListBinding((ConstraintLayout) view, simpleDraweeView, slidingTabLayout, viewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentEndGameViewpagerListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f19761b;
    }

    @NonNull
    public static FragmentEndGameViewpagerListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_end_game_viewpager_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
