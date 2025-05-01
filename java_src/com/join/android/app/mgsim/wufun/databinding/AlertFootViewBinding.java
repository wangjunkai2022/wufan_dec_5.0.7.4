package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class AlertFootViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17353b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f17354c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f17355d;

    private AlertFootViewBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2) {
        this.f17353b = linearLayout;
        this.f17354c = button;
        this.f17355d = button2;
    }

    @NonNull
    public static AlertFootViewBinding bind(@NonNull View view) {
        int i4 = R.id.btn_dialog_cancel;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_dialog_cancel);
        if (button != null) {
            i4 = R.id.btn_dialog_ok;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btn_dialog_ok);
            if (button2 != null) {
                return new AlertFootViewBinding((LinearLayout) view, button, button2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static AlertFootViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17353b;
    }

    @NonNull
    public static AlertFootViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.alert_foot_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
