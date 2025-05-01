package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityMessageMainBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16602b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f16603c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f16604d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SlidingTabLayout f16605e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ViewPager f16606f;

    private ActivityMessageMainBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull SlidingTabLayout slidingTabLayout, @NonNull ViewPager viewPager) {
        this.f16602b = linearLayout;
        this.f16603c = imageView;
        this.f16604d = imageView2;
        this.f16605e = slidingTabLayout;
        this.f16606f = viewPager;
    }

    @NonNull
    public static ActivityMessageMainBinding bind(@NonNull View view) {
        int i4 = R.id.back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back);
        if (imageView != null) {
            i4 = R.id.setting;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.setting);
            if (imageView2 != null) {
                i4 = R.id.tableLayout;
                SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.findChildViewById(view, R.id.tableLayout);
                if (slidingTabLayout != null) {
                    i4 = R.id.viewPager;
                    ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewPager);
                    if (viewPager != null) {
                        return new ActivityMessageMainBinding((LinearLayout) view, imageView, imageView2, slidingTabLayout, viewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityMessageMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16602b;
    }

    @NonNull
    public static ActivityMessageMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_message_main, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
