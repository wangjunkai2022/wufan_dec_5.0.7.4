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
/* loaded from: classes3.dex */
public final class LayoutLiveHotHeaderViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23126b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final CarouselViewPager2 f23127c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f23128d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f23129e;

    private LayoutLiveHotHeaderViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull CarouselViewPager2 carouselViewPager2, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout) {
        this.f23126b = relativeLayout;
        this.f23127c = carouselViewPager2;
        this.f23128d = frameLayout;
        this.f23129e = linearLayout;
    }

    @NonNull
    public static LayoutLiveHotHeaderViewBinding bind(@NonNull View view) {
        int i4 = R.id.loopViewPager;
        CarouselViewPager2 carouselViewPager2 = (CarouselViewPager2) ViewBindings.findChildViewById(view, R.id.loopViewPager);
        if (carouselViewPager2 != null) {
            i4 = R.id.onlyOne;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.onlyOne);
            if (frameLayout != null) {
                i4 = R.id.point_group;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.point_group);
                if (linearLayout != null) {
                    return new LayoutLiveHotHeaderViewBinding((RelativeLayout) view, carouselViewPager2, frameLayout, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutLiveHotHeaderViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23126b;
    }

    @NonNull
    public static LayoutLiveHotHeaderViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_live_hot_header_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
