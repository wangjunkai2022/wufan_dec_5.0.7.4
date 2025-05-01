package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CarouselViewPager2;
import com.join.mgps.customview.CirclePageIndicator;
/* loaded from: classes3.dex */
public final class GamedetialAdGroupLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f20852b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final CirclePageIndicator f20853c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f20854d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f20855e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final CarouselViewPager2 f20856f;

    private GamedetialAdGroupLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull CirclePageIndicator circlePageIndicator, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull CarouselViewPager2 carouselViewPager2) {
        this.f20852b = relativeLayout;
        this.f20853c = circlePageIndicator;
        this.f20854d = frameLayout;
        this.f20855e = linearLayout;
        this.f20856f = carouselViewPager2;
    }

    @NonNull
    public static GamedetialAdGroupLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.indecater;
        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) ViewBindings.findChildViewById(view, R.id.indecater);
        if (circlePageIndicator != null) {
            i4 = R.id.onlyOne;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.onlyOne);
            if (frameLayout != null) {
                i4 = R.id.point_group;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.point_group);
                if (linearLayout != null) {
                    i4 = R.id.top_ad_viewpager;
                    CarouselViewPager2 carouselViewPager2 = (CarouselViewPager2) ViewBindings.findChildViewById(view, R.id.top_ad_viewpager);
                    if (carouselViewPager2 != null) {
                        return new GamedetialAdGroupLayoutBinding((RelativeLayout) view, circlePageIndicator, frameLayout, linearLayout, carouselViewPager2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GamedetialAdGroupLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f20852b;
    }

    @NonNull
    public static GamedetialAdGroupLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetial_ad_group_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
