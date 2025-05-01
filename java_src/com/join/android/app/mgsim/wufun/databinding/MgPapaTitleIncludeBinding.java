package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CirclePageIndicator;
import com.join.mgps.customview.LoopViewPager;
/* loaded from: classes3.dex */
public final class MgPapaTitleIncludeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24660b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final CirclePageIndicator f24661c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f24662d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f24663e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f24664f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f24665g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LoopViewPager f24666h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ConstraintLayout f24667i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ViewFlipper f24668j;

    private MgPapaTitleIncludeBinding(@NonNull LinearLayout linearLayout, @NonNull CirclePageIndicator circlePageIndicator, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LoopViewPager loopViewPager, @NonNull ConstraintLayout constraintLayout, @NonNull ViewFlipper viewFlipper) {
        this.f24660b = linearLayout;
        this.f24661c = circlePageIndicator;
        this.f24662d = frameLayout;
        this.f24663e = linearLayout2;
        this.f24664f = linearLayout3;
        this.f24665g = linearLayout4;
        this.f24666h = loopViewPager;
        this.f24667i = constraintLayout;
        this.f24668j = viewFlipper;
    }

    @NonNull
    public static MgPapaTitleIncludeBinding bind(@NonNull View view) {
        int i4 = R.id.indecater;
        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) ViewBindings.findChildViewById(view, R.id.indecater);
        if (circlePageIndicator != null) {
            i4 = R.id.onlyOne;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.onlyOne);
            if (frameLayout != null) {
                i4 = R.id.point_group;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.point_group);
                if (linearLayout != null) {
                    i4 = R.id.table1;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.table1);
                    if (linearLayout2 != null) {
                        i4 = R.id.table2;
                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.table2);
                        if (linearLayout3 != null) {
                            i4 = R.id.top_ad_viewpager;
                            LoopViewPager loopViewPager = (LoopViewPager) ViewBindings.findChildViewById(view, R.id.top_ad_viewpager);
                            if (loopViewPager != null) {
                                i4 = R.id.top_ad_viewpager_outer;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.top_ad_viewpager_outer);
                                if (constraintLayout != null) {
                                    i4 = R.id.topLineView;
                                    ViewFlipper viewFlipper = (ViewFlipper) ViewBindings.findChildViewById(view, R.id.topLineView);
                                    if (viewFlipper != null) {
                                        return new MgPapaTitleIncludeBinding((LinearLayout) view, circlePageIndicator, frameLayout, linearLayout, linearLayout2, linearLayout3, loopViewPager, constraintLayout, viewFlipper);
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
    public static MgPapaTitleIncludeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24660b;
    }

    @NonNull
    public static MgPapaTitleIncludeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_papa_title_include, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
