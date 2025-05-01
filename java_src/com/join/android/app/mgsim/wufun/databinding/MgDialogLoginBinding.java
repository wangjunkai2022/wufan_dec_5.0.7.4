package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgDialogLoginBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23730b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f23731c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23732d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23733e;

    private MgDialogLoginBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f23730b = relativeLayout;
        this.f23731c = relativeLayout2;
        this.f23732d = textView;
        this.f23733e = textView2;
    }

    @NonNull
    public static MgDialogLoginBinding bind(@NonNull View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i4 = R.id.vCancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.vCancel);
        if (textView != null) {
            i4 = R.id.vOK;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.vOK);
            if (textView2 != null) {
                return new MgDialogLoginBinding(relativeLayout, relativeLayout, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgDialogLoginBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23730b;
    }

    @NonNull
    public static MgDialogLoginBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_dialog_login, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
