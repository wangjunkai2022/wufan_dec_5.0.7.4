package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MViewpagerV4;
import com.join.mgps.customview.SlidingTabClassifyLayout;
/* loaded from: classes3.dex */
public final class MewClassifyLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23672b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SlidingTabClassifyLayout f23673c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final MViewpagerV4 f23674d;

    private MewClassifyLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull SlidingTabClassifyLayout slidingTabClassifyLayout, @NonNull MViewpagerV4 mViewpagerV4) {
        this.f23672b = relativeLayout;
        this.f23673c = slidingTabClassifyLayout;
        this.f23674d = mViewpagerV4;
    }

    @NonNull
    public static MewClassifyLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.slidingTabLayout;
        SlidingTabClassifyLayout slidingTabClassifyLayout = (SlidingTabClassifyLayout) ViewBindings.findChildViewById(view, R.id.slidingTabLayout);
        if (slidingTabClassifyLayout != null) {
            i4 = R.id.viewpagerV4;
            MViewpagerV4 mViewpagerV4 = (MViewpagerV4) ViewBindings.findChildViewById(view, R.id.viewpagerV4);
            if (mViewpagerV4 != null) {
                return new MewClassifyLayoutBinding((RelativeLayout) view, slidingTabClassifyLayout, mViewpagerV4);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MewClassifyLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23672b;
    }

    @NonNull
    public static MewClassifyLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mew_classify_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
