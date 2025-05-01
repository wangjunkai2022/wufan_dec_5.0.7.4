package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CirclePageIndicator;
import com.join.mgps.customview.LoopViewPager;
/* loaded from: classes3.dex */
public final class MgForumBannerLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23806b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final CirclePageIndicator f23807c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f23808d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LoopViewPager f23809e;

    private MgForumBannerLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull CirclePageIndicator circlePageIndicator, @NonNull LinearLayout linearLayout, @NonNull LoopViewPager loopViewPager) {
        this.f23806b = relativeLayout;
        this.f23807c = circlePageIndicator;
        this.f23808d = linearLayout;
        this.f23809e = loopViewPager;
    }

    @NonNull
    public static MgForumBannerLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.indecater;
        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) ViewBindings.findChildViewById(view, R.id.indecater);
        if (circlePageIndicator != null) {
            i4 = R.id.point_group;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.point_group);
            if (linearLayout != null) {
                i4 = R.id.top_ad_viewpager;
                LoopViewPager loopViewPager = (LoopViewPager) ViewBindings.findChildViewById(view, R.id.top_ad_viewpager);
                if (loopViewPager != null) {
                    return new MgForumBannerLayoutBinding((RelativeLayout) view, circlePageIndicator, linearLayout, loopViewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumBannerLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23806b;
    }

    @NonNull
    public static MgForumBannerLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_banner_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
