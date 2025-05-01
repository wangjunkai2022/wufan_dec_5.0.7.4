package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MyAccountForgetpassLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25236b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f25237c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final EditText f25238d;

    private MyAccountForgetpassLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull EditText editText) {
        this.f25236b = linearLayout;
        this.f25237c = button;
        this.f25238d = editText;
    }

    @NonNull
    public static MyAccountForgetpassLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.getpassByPhoneNumber;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.getpassByPhoneNumber);
        if (button != null) {
            i4 = R.id.phoneText;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.phoneText);
            if (editText != null) {
                return new MyAccountForgetpassLayoutBinding((LinearLayout) view, button, editText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MyAccountForgetpassLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25236b;
    }

    @NonNull
    public static MyAccountForgetpassLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.my_account_forgetpass_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
