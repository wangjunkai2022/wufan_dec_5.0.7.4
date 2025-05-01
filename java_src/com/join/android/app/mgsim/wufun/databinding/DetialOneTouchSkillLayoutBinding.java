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
import com.join.mgps.customview.MViewpagerV4;
import com.join.mgps.customview.SlidingTabLayoutGameDetail;
/* loaded from: classes3.dex */
public final class DetialOneTouchSkillLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18478b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SlidingTabLayoutGameDetail f18479c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final MViewpagerV4 f18480d;

    private DetialOneTouchSkillLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull SlidingTabLayoutGameDetail slidingTabLayoutGameDetail, @NonNull MViewpagerV4 mViewpagerV4) {
        this.f18478b = linearLayout;
        this.f18479c = slidingTabLayoutGameDetail;
        this.f18480d = mViewpagerV4;
    }

    @NonNull
    public static DetialOneTouchSkillLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.tabLayout;
        SlidingTabLayoutGameDetail slidingTabLayoutGameDetail = (SlidingTabLayoutGameDetail) ViewBindings.findChildViewById(view, R.id.tabLayout);
        if (slidingTabLayoutGameDetail != null) {
            i4 = R.id.viewPager;
            MViewpagerV4 mViewpagerV4 = (MViewpagerV4) ViewBindings.findChildViewById(view, R.id.viewPager);
            if (mViewpagerV4 != null) {
                return new DetialOneTouchSkillLayoutBinding((LinearLayout) view, slidingTabLayoutGameDetail, mViewpagerV4);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DetialOneTouchSkillLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18478b;
    }

    @NonNull
    public static DetialOneTouchSkillLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.detial_one_touch_skill_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
