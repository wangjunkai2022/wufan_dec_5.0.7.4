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
import com.join.mgps.customview.InterceptEventViewPager;
import com.join.mgps.customview.TabPageIndicator;
/* loaded from: classes3.dex */
public final class ActivityPapaStandaloneV2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16703b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f16704c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TabPageIndicator f16705d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TopbarLeftTitleLayoutBinding f16706e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final InterceptEventViewPager f16707f;

    private ActivityPapaStandaloneV2Binding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull TabPageIndicator tabPageIndicator, @NonNull TopbarLeftTitleLayoutBinding topbarLeftTitleLayoutBinding, @NonNull InterceptEventViewPager interceptEventViewPager) {
        this.f16703b = linearLayout;
        this.f16704c = view;
        this.f16705d = tabPageIndicator;
        this.f16706e = topbarLeftTitleLayoutBinding;
        this.f16707f = interceptEventViewPager;
    }

    @NonNull
    public static ActivityPapaStandaloneV2Binding bind(@NonNull View view) {
        int i4 = R.id.line;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
        if (findChildViewById != null) {
            i4 = R.id.pageIndicator;
            TabPageIndicator tabPageIndicator = (TabPageIndicator) ViewBindings.findChildViewById(view, R.id.pageIndicator);
            if (tabPageIndicator != null) {
                i4 = R.id.title_bar_layout;
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.title_bar_layout);
                if (findChildViewById2 != null) {
                    TopbarLeftTitleLayoutBinding bind = TopbarLeftTitleLayoutBinding.bind(findChildViewById2);
                    i4 = R.id.viewPager;
                    InterceptEventViewPager interceptEventViewPager = (InterceptEventViewPager) ViewBindings.findChildViewById(view, R.id.viewPager);
                    if (interceptEventViewPager != null) {
                        return new ActivityPapaStandaloneV2Binding((LinearLayout) view, findChildViewById, tabPageIndicator, bind, interceptEventViewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityPapaStandaloneV2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16703b;
    }

    @NonNull
    public static ActivityPapaStandaloneV2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_papa_standalone_v2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
