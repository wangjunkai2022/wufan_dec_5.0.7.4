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
public final class MyAccountGetpassbyphoneBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25239b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f25240c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final EditText f25241d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f25242e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final EditText f25243f;

    private MyAccountGetpassbyphoneBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull EditText editText, @NonNull Button button, @NonNull EditText editText2) {
        this.f25239b = linearLayout;
        this.f25240c = linearLayout2;
        this.f25241d = editText;
        this.f25242e = button;
        this.f25243f = editText2;
    }

    @NonNull
    public static MyAccountGetpassbyphoneBinding bind(@NonNull View view) {
        int i4 = R.id.linearLayout3;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout3);
        if (linearLayout != null) {
            i4 = R.id.newPass;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.newPass);
            if (editText != null) {
                i4 = R.id.okChange;
                Button button = (Button) ViewBindings.findChildViewById(view, R.id.okChange);
                if (button != null) {
                    i4 = R.id.reWhitePass;
                    EditText editText2 = (EditText) ViewBindings.findChildViewById(view, R.id.reWhitePass);
                    if (editText2 != null) {
                        return new MyAccountGetpassbyphoneBinding((LinearLayout) view, linearLayout, editText, button, editText2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MyAccountGetpassbyphoneBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25239b;
    }

    @NonNull
    public static MyAccountGetpassbyphoneBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.my_account_getpassbyphone, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
