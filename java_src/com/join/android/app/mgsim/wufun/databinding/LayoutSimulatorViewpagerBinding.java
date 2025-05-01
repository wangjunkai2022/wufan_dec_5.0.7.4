package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CirclePageIndicator;
import com.join.mgps.customview.RecyclerviewViewpager;
/* loaded from: classes3.dex */
public final class LayoutSimulatorViewpagerBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f23423b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final CirclePageIndicator f23424c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerviewViewpager f23425d;

    private LayoutSimulatorViewpagerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull CirclePageIndicator circlePageIndicator, @NonNull RecyclerviewViewpager recyclerviewViewpager) {
        this.f23423b = constraintLayout;
        this.f23424c = circlePageIndicator;
        this.f23425d = recyclerviewViewpager;
    }

    @NonNull
    public static LayoutSimulatorViewpagerBinding bind(@NonNull View view) {
        int i4 = R.id.indicator;
        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) ViewBindings.findChildViewById(view, R.id.indicator);
        if (circlePageIndicator != null) {
            i4 = R.id.viewpager;
            RecyclerviewViewpager recyclerviewViewpager = (RecyclerviewViewpager) ViewBindings.findChildViewById(view, R.id.viewpager);
            if (recyclerviewViewpager != null) {
                return new LayoutSimulatorViewpagerBinding((ConstraintLayout) view, circlePageIndicator, recyclerviewViewpager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutSimulatorViewpagerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f23423b;
    }

    @NonNull
    public static LayoutSimulatorViewpagerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_simulator_viewpager, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
