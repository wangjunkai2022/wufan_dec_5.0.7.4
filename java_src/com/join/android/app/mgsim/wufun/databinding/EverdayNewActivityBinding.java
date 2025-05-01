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
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.SlidingTabLayout6;
/* loaded from: classes3.dex */
public final class EverdayNewActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19323b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SlidingTabLayout6 f19324c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TopbarTitleCenterLayoutBinding f19325d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ViewPager f19326e;

    private EverdayNewActivityBinding(@NonNull LinearLayout linearLayout, @NonNull SlidingTabLayout6 slidingTabLayout6, @NonNull TopbarTitleCenterLayoutBinding topbarTitleCenterLayoutBinding, @NonNull ViewPager viewPager) {
        this.f19323b = linearLayout;
        this.f19324c = slidingTabLayout6;
        this.f19325d = topbarTitleCenterLayoutBinding;
        this.f19326e = viewPager;
    }

    @NonNull
    public static EverdayNewActivityBinding bind(@NonNull View view) {
        int i4 = R.id.tabLayout;
        SlidingTabLayout6 slidingTabLayout6 = (SlidingTabLayout6) ViewBindings.findChildViewById(view, R.id.tabLayout);
        if (slidingTabLayout6 != null) {
            i4 = R.id.titleLayout;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.titleLayout);
            if (findChildViewById != null) {
                TopbarTitleCenterLayoutBinding bind = TopbarTitleCenterLayoutBinding.bind(findChildViewById);
                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewPager);
                if (viewPager != null) {
                    return new EverdayNewActivityBinding((LinearLayout) view, slidingTabLayout6, bind, viewPager);
                }
                i4 = R.id.viewPager;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static EverdayNewActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19323b;
    }

    @NonNull
    public static EverdayNewActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.everday_new_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
