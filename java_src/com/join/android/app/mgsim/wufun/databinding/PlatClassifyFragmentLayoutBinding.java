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
import com.join.mgps.customview.MViewpagerV4;
import com.join.mgps.customview.SlidingTabMyPaPaLayout;
/* loaded from: classes3.dex */
public final class PlatClassifyFragmentLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f25932b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f25933c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final MViewpagerV4 f25934d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SlidingTabMyPaPaLayout f25935e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f25936f;

    private PlatClassifyFragmentLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull MViewpagerV4 mViewpagerV4, @NonNull SlidingTabMyPaPaLayout slidingTabMyPaPaLayout, @NonNull View view) {
        this.f25932b = relativeLayout;
        this.f25933c = linearLayout;
        this.f25934d = mViewpagerV4;
        this.f25935e = slidingTabMyPaPaLayout;
        this.f25936f = view;
    }

    @NonNull
    public static PlatClassifyFragmentLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.linearLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout);
        if (linearLayout != null) {
            i4 = R.id.mBottomVIewPager;
            MViewpagerV4 mViewpagerV4 = (MViewpagerV4) ViewBindings.findChildViewById(view, R.id.mBottomVIewPager);
            if (mViewpagerV4 != null) {
                i4 = R.id.slidingTabLayout;
                SlidingTabMyPaPaLayout slidingTabMyPaPaLayout = (SlidingTabMyPaPaLayout) ViewBindings.findChildViewById(view, R.id.slidingTabLayout);
                if (slidingTabMyPaPaLayout != null) {
                    i4 = R.id.viewBg;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.viewBg);
                    if (findChildViewById != null) {
                        return new PlatClassifyFragmentLayoutBinding((RelativeLayout) view, linearLayout, mViewpagerV4, slidingTabMyPaPaLayout, findChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PlatClassifyFragmentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f25932b;
    }

    @NonNull
    public static PlatClassifyFragmentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.plat_classify_fragment_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
