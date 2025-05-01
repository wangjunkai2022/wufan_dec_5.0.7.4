package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ViewPagerSlide;
/* loaded from: classes3.dex */
public final class DiscoveryFragmentLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19106b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final AppBarLayout f19107c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final NestedScrollView f19108d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final CollapsingToolbarLayout f19109e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final CoordinatorLayout f19110f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f19111g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SlidingTabLayout f19112h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final Toolbar f19113i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f19114j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f19115k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ViewPagerSlide f19116l;

    private DiscoveryFragmentLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull AppBarLayout appBarLayout, @NonNull NestedScrollView nestedScrollView, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull CoordinatorLayout coordinatorLayout, @NonNull TextView textView, @NonNull SlidingTabLayout slidingTabLayout, @NonNull Toolbar toolbar, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull ViewPagerSlide viewPagerSlide) {
        this.f19106b = relativeLayout;
        this.f19107c = appBarLayout;
        this.f19108d = nestedScrollView;
        this.f19109e = collapsingToolbarLayout;
        this.f19110f = coordinatorLayout;
        this.f19111g = textView;
        this.f19112h = slidingTabLayout;
        this.f19113i = toolbar;
        this.f19114j = textView2;
        this.f19115k = imageView;
        this.f19116l = viewPagerSlide;
    }

    @NonNull
    public static DiscoveryFragmentLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, R.id.appbar);
        if (appBarLayout != null) {
            i4 = R.id.bottomNull;
            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, R.id.bottomNull);
            if (nestedScrollView != null) {
                i4 = R.id.colltoobar;
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) ViewBindings.findChildViewById(view, R.id.colltoobar);
                if (collapsingToolbarLayout != null) {
                    i4 = R.id.mPtrFrame;
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
                    if (coordinatorLayout != null) {
                        i4 = R.id.nulltext;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.nulltext);
                        if (textView != null) {
                            i4 = R.id.tableLayout;
                            SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, R.id.tableLayout);
                            if (slidingTabLayout != null) {
                                i4 = R.id.toolbar;
                                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar);
                                if (toolbar != null) {
                                    i4 = R.id.topBack;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.topBack);
                                    if (textView2 != null) {
                                        i4 = R.id.topImag;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.topImag);
                                        if (imageView != null) {
                                            i4 = R.id.viewpager;
                                            ViewPagerSlide viewPagerSlide = (ViewPagerSlide) ViewBindings.findChildViewById(view, R.id.viewpager);
                                            if (viewPagerSlide != null) {
                                                return new DiscoveryFragmentLayoutBinding((RelativeLayout) view, appBarLayout, nestedScrollView, collapsingToolbarLayout, coordinatorLayout, textView, slidingTabLayout, toolbar, textView2, imageView, viewPagerSlide);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DiscoveryFragmentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19106b;
    }

    @NonNull
    public static DiscoveryFragmentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.discovery_fragment_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
