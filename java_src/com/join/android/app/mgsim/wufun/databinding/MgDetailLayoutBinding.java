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
import com.join.mgps.customview.MGViewpagerV4;
import com.join.mgps.customview.SlidingTabDetailLayout;
/* loaded from: classes3.dex */
public final class MgDetailLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23727b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SlidingTabDetailLayout f23728c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final MGViewpagerV4 f23729d;

    private MgDetailLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull SlidingTabDetailLayout slidingTabDetailLayout, @NonNull MGViewpagerV4 mGViewpagerV4) {
        this.f23727b = linearLayout;
        this.f23728c = slidingTabDetailLayout;
        this.f23729d = mGViewpagerV4;
    }

    @NonNull
    public static MgDetailLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.slidingTabLayout;
        SlidingTabDetailLayout slidingTabDetailLayout = (SlidingTabDetailLayout) ViewBindings.findChildViewById(view, R.id.slidingTabLayout);
        if (slidingTabDetailLayout != null) {
            i4 = R.id.viewpagerV4;
            MGViewpagerV4 mGViewpagerV4 = (MGViewpagerV4) ViewBindings.findChildViewById(view, R.id.viewpagerV4);
            if (mGViewpagerV4 != null) {
                return new MgDetailLayoutBinding((LinearLayout) view, slidingTabDetailLayout, mGViewpagerV4);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgDetailLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23727b;
    }

    @NonNull
    public static MgDetailLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_detail_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
