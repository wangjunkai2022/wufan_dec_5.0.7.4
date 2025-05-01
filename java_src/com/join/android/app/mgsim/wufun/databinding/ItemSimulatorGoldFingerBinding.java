package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemSimulatorGoldFingerBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f22801b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f22802c;

    private ItemSimulatorGoldFingerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView) {
        this.f22801b = constraintLayout;
        this.f22802c = textView;
    }

    @NonNull
    public static ItemSimulatorGoldFingerBinding bind(@NonNull View view) {
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvGoldFinger);
        if (textView != null) {
            return new ItemSimulatorGoldFingerBinding((ConstraintLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tvGoldFinger)));
    }

    @NonNull
    public static ItemSimulatorGoldFingerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f22801b;
    }

    @NonNull
    public static ItemSimulatorGoldFingerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_simulator_gold_finger, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
