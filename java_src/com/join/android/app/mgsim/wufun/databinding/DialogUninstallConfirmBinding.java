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
public final class DialogUninstallConfirmBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f19056b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19057c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19058d;

    private DialogUninstallConfirmBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f19056b = constraintLayout;
        this.f19057c = textView;
        this.f19058d = textView2;
    }

    @NonNull
    public static DialogUninstallConfirmBinding bind(@NonNull View view) {
        int i4 = R.id.tvCancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvCancel);
        if (textView != null) {
            i4 = R.id.tvConfirm;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvConfirm);
            if (textView2 != null) {
                return new DialogUninstallConfirmBinding((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogUninstallConfirmBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f19056b;
    }

    @NonNull
    public static DialogUninstallConfirmBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_uninstall_confirm, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
