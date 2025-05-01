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
public final class DialogUninstallSuccessBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f19059b;

    private DialogUninstallSuccessBinding(@NonNull ConstraintLayout constraintLayout) {
        this.f19059b = constraintLayout;
    }

    @NonNull
    public static DialogUninstallSuccessBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new DialogUninstallSuccessBinding((ConstraintLayout) view);
    }

    @NonNull
    public static DialogUninstallSuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f19059b;
    }

    @NonNull
    public static DialogUninstallSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_uninstall_success, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
