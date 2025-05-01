package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.SlidingTabLayout2;
/* loaded from: classes3.dex */
public final class FragmentClassifyRankBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19642b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f19643c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SlidingTabLayout2 f19644d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ViewPager f19645e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f19646f;

    private FragmentClassifyRankBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull SlidingTabLayout2 slidingTabLayout2, @NonNull ViewPager viewPager, @NonNull LinearLayout linearLayout2) {
        this.f19642b = linearLayout;
        this.f19643c = view;
        this.f19644d = slidingTabLayout2;
        this.f19645e = viewPager;
        this.f19646f = linearLayout2;
    }

    @NonNull
    public static FragmentClassifyRankBinding bind(@NonNull View view) {
        int i4 = R.id.lineTop;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.lineTop);
        if (findChildViewById != null) {
            i4 = R.id.mSlidingTabLayout;
            SlidingTabLayout2 slidingTabLayout2 = (SlidingTabLayout2) ViewBindings.findChildViewById(view, R.id.mSlidingTabLayout);
            if (slidingTabLayout2 != null) {
                i4 = R.id.mViewpagerV4;
                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.mViewpagerV4);
                if (viewPager != null) {
                    i4 = R.id.searchImage;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.searchImage);
                    if (linearLayout != null) {
                        return new FragmentClassifyRankBinding((LinearLayout) view, findChildViewById, slidingTabLayout2, viewPager, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentClassifyRankBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19642b;
    }

    @NonNull
    public static FragmentClassifyRankBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_classify_rank, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
