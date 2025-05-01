package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.component.photoviewer.HackyViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CirclePageIndicator;
/* loaded from: classes3.dex */
public final class ImageViewpagerBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f21511b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21512c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CirclePageIndicator f21513d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final HackyViewPager f21514e;

    private ImageViewpagerBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull CirclePageIndicator circlePageIndicator, @NonNull HackyViewPager hackyViewPager) {
        this.f21511b = frameLayout;
        this.f21512c = textView;
        this.f21513d = circlePageIndicator;
        this.f21514e = hackyViewPager;
    }

    @NonNull
    public static ImageViewpagerBinding bind(@NonNull View view) {
        int i4 = R.id.bottomLayout;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.bottomLayout);
        if (textView != null) {
            i4 = R.id.indicator;
            CirclePageIndicator circlePageIndicator = (CirclePageIndicator) ViewBindings.findChildViewById(view, R.id.indicator);
            if (circlePageIndicator != null) {
                i4 = R.id.pager;
                HackyViewPager hackyViewPager = (HackyViewPager) ViewBindings.findChildViewById(view, R.id.pager);
                if (hackyViewPager != null) {
                    return new ImageViewpagerBinding((FrameLayout) view, textView, circlePageIndicator, hackyViewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ImageViewpagerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f21511b;
    }

    @NonNull
    public static ImageViewpagerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.image_viewpager, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
