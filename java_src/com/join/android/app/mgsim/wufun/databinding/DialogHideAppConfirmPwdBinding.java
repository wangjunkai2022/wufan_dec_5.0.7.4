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
public final class DialogHideAppConfirmPwdBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f18781b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18782c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18783d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18784e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18785f;

    private DialogHideAppConfirmPwdBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f18781b = constraintLayout;
        this.f18782c = textView;
        this.f18783d = textView2;
        this.f18784e = textView3;
        this.f18785f = textView4;
    }

    @NonNull
    public static DialogHideAppConfirmPwdBinding bind(@NonNull View view) {
        int i4 = R.id.tvConfirm;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvConfirm);
        if (textView != null) {
            i4 = R.id.tvPwd;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPwd);
            if (textView2 != null) {
                i4 = R.id.tvReset;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvReset);
                if (textView3 != null) {
                    i4 = R.id.tvTitle;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitle);
                    if (textView4 != null) {
                        return new DialogHideAppConfirmPwdBinding((ConstraintLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogHideAppConfirmPwdBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f18781b;
    }

    @NonNull
    public static DialogHideAppConfirmPwdBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_hide_app_confirm_pwd, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
