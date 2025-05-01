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
import com.join.mgps.customview.CarouselViewPager2;
/* loaded from: classes3.dex */
public final class SpecialZoneViewpagerLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26640b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final CarouselViewPager2 f26641c;

    private SpecialZoneViewpagerLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull CarouselViewPager2 carouselViewPager2) {
        this.f26640b = linearLayout;
        this.f26641c = carouselViewPager2;
    }

    @NonNull
    public static SpecialZoneViewpagerLayoutBinding bind(@NonNull View view) {
        CarouselViewPager2 carouselViewPager2 = (CarouselViewPager2) ViewBindings.findChildViewById(view, R.id.viewpager);
        if (carouselViewPager2 != null) {
            return new SpecialZoneViewpagerLayoutBinding((LinearLayout) view, carouselViewPager2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.viewpager)));
    }

    @NonNull
    public static SpecialZoneViewpagerLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26640b;
    }

    @NonNull
    public static SpecialZoneViewpagerLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.special_zone_viewpager_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
