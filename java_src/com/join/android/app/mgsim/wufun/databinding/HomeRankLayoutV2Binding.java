package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.RecyclerviewViewpager;
import com.join.mgps.customview.SlidingTabLayout6;
/* loaded from: classes3.dex */
public final class HomeRankLayoutV2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f21482b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f21483c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintLayout f21484d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SlidingTabLayout6 f21485e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RecyclerviewViewpager f21486f;

    private HomeRankLayoutV2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull SlidingTabLayout6 slidingTabLayout6, @NonNull RecyclerviewViewpager recyclerviewViewpager) {
        this.f21482b = constraintLayout;
        this.f21483c = linearLayout;
        this.f21484d = constraintLayout2;
        this.f21485e = slidingTabLayout6;
        this.f21486f = recyclerviewViewpager;
    }

    @NonNull
    public static HomeRankLayoutV2Binding bind(@NonNull View view) {
        int i4 = R.id.moreLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.moreLayout);
        if (linearLayout != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i4 = R.id.tabLayout;
            SlidingTabLayout6 slidingTabLayout6 = (SlidingTabLayout6) ViewBindings.findChildViewById(view, R.id.tabLayout);
            if (slidingTabLayout6 != null) {
                i4 = R.id.viewPager;
                RecyclerviewViewpager recyclerviewViewpager = (RecyclerviewViewpager) ViewBindings.findChildViewById(view, R.id.viewPager);
                if (recyclerviewViewpager != null) {
                    return new HomeRankLayoutV2Binding(constraintLayout, linearLayout, constraintLayout, slidingTabLayout6, recyclerviewViewpager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static HomeRankLayoutV2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f21482b;
    }

    @NonNull
    public static HomeRankLayoutV2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.home_rank_layout_v2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
