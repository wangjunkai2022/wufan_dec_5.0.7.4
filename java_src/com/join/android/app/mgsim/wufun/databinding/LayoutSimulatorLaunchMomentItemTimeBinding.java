package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LayoutSimulatorLaunchMomentItemTimeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f23400b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f23401c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f23402d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f23403e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f23404f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f23405g;

    private LayoutSimulatorLaunchMomentItemTimeBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull TextView textView) {
        this.f23400b = constraintLayout;
        this.f23401c = imageView;
        this.f23402d = view;
        this.f23403e = view2;
        this.f23404f = view3;
        this.f23405g = textView;
    }

    @NonNull
    public static LayoutSimulatorLaunchMomentItemTimeBinding bind(@NonNull View view) {
        int i4 = R.id.chooseType;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.chooseType);
        if (imageView != null) {
            i4 = R.id.treeBall;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.treeBall);
            if (findChildViewById != null) {
                i4 = R.id.treeLineBottom;
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.treeLineBottom);
                if (findChildViewById2 != null) {
                    i4 = R.id.treeLineTop;
                    View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.treeLineTop);
                    if (findChildViewById3 != null) {
                        i4 = R.id.tvTimeDesc;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvTimeDesc);
                        if (textView != null) {
                            return new LayoutSimulatorLaunchMomentItemTimeBinding((ConstraintLayout) view, imageView, findChildViewById, findChildViewById2, findChildViewById3, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutSimulatorLaunchMomentItemTimeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f23400b;
    }

    @NonNull
    public static LayoutSimulatorLaunchMomentItemTimeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_simulator_launch_moment_item_time, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
