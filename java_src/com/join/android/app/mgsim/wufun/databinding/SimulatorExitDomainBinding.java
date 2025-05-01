package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class SimulatorExitDomainBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f26578b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f26579c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f26580d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f26581e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f26582f;

    private SimulatorExitDomainBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull View view2, @NonNull View view3) {
        this.f26578b = constraintLayout;
        this.f26579c = view;
        this.f26580d = simpleDraweeView;
        this.f26581e = view2;
        this.f26582f = view3;
    }

    @NonNull
    public static SimulatorExitDomainBinding bind(@NonNull View view) {
        int i4 = R.id.divider;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.divider);
        if (findChildViewById != null) {
            i4 = R.id.img;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img);
            if (simpleDraweeView != null) {
                i4 = R.id.ml;
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.ml);
                if (findChildViewById2 != null) {
                    i4 = R.id.mr;
                    View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.mr);
                    if (findChildViewById3 != null) {
                        return new SimulatorExitDomainBinding((ConstraintLayout) view, findChildViewById, simpleDraweeView, findChildViewById2, findChildViewById3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static SimulatorExitDomainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f26578b;
    }

    @NonNull
    public static SimulatorExitDomainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.simulator_exit_domain, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
