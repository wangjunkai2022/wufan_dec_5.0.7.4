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
import com.join.mgps.customview.HorizontalRecyclerView;
/* loaded from: classes3.dex */
public final class LayoutSimulatorTagGameBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f23415b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final HorizontalRecyclerView f23416c;

    private LayoutSimulatorTagGameBinding(@NonNull ConstraintLayout constraintLayout, @NonNull HorizontalRecyclerView horizontalRecyclerView) {
        this.f23415b = constraintLayout;
        this.f23416c = horizontalRecyclerView;
    }

    @NonNull
    public static LayoutSimulatorTagGameBinding bind(@NonNull View view) {
        HorizontalRecyclerView horizontalRecyclerView = (HorizontalRecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerview);
        if (horizontalRecyclerView != null) {
            return new LayoutSimulatorTagGameBinding((ConstraintLayout) view, horizontalRecyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.recyclerview)));
    }

    @NonNull
    public static LayoutSimulatorTagGameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f23415b;
    }

    @NonNull
    public static LayoutSimulatorTagGameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_simulator_tag_game, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
