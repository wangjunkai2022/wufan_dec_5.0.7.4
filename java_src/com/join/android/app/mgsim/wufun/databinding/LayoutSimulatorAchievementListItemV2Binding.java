package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.join.android.app.mgsim.wufun.R;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class LayoutSimulatorAchievementListItemV2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f23332b;

    private LayoutSimulatorAchievementListItemV2Binding(@NonNull ConstraintLayout constraintLayout) {
        this.f23332b = constraintLayout;
    }

    @NonNull
    public static LayoutSimulatorAchievementListItemV2Binding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new LayoutSimulatorAchievementListItemV2Binding((ConstraintLayout) view);
    }

    @NonNull
    public static LayoutSimulatorAchievementListItemV2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f23332b;
    }

    @NonNull
    public static LayoutSimulatorAchievementListItemV2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_simulator_achievement_list_item_v2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
