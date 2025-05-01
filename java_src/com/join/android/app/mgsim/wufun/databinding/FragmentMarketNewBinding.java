package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.SlidingTabLayout6;
import com.join.mgps.customview.ViewPagerCompat;
/* loaded from: classes3.dex */
public final class FragmentMarketNewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19875b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f19876c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f19877d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SlidingTabLayout6 f19878e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f19879f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ViewPagerCompat f19880g;

    private FragmentMarketNewBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull SlidingTabLayout6 slidingTabLayout6, @NonNull RelativeLayout relativeLayout, @NonNull ViewPagerCompat viewPagerCompat) {
        this.f19875b = linearLayout;
        this.f19876c = linearLayout2;
        this.f19877d = imageView;
        this.f19878e = slidingTabLayout6;
        this.f19879f = relativeLayout;
        this.f19880g = viewPagerCompat;
    }

    @NonNull
    public static FragmentMarketNewBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = R.id.searchImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.searchImage);
        if (imageView != null) {
            i4 = R.id.tabs;
            SlidingTabLayout6 slidingTabLayout6 = (SlidingTabLayout6) ViewBindings.findChildViewById(view, R.id.tabs);
            if (slidingTabLayout6 != null) {
                i4 = R.id.title;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.title);
                if (relativeLayout != null) {
                    i4 = R.id.view_pager;
                    ViewPagerCompat viewPagerCompat = (ViewPagerCompat) ViewBindings.findChildViewById(view, R.id.view_pager);
                    if (viewPagerCompat != null) {
                        return new FragmentMarketNewBinding(linearLayout, linearLayout, imageView, slidingTabLayout6, relativeLayout, viewPagerCompat);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentMarketNewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19875b;
    }

    @NonNull
    public static FragmentMarketNewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_market_new, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
