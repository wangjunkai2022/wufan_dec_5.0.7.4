package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgAccountUpgradeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23716b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f23717c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f23718d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final EditText f23719e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final EditText f23720f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final EditText f23721g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ScrollView f23722h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final Button f23723i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final EditText f23724j;

    private MgAccountUpgradeBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull Button button, @NonNull EditText editText, @NonNull EditText editText2, @NonNull EditText editText3, @NonNull ScrollView scrollView, @NonNull Button button2, @NonNull EditText editText4) {
        this.f23716b = linearLayout;
        this.f23717c = linearLayout2;
        this.f23718d = button;
        this.f23719e = editText;
        this.f23720f = editText2;
        this.f23721g = editText3;
        this.f23722h = scrollView;
        this.f23723i = button2;
        this.f23724j = editText4;
    }

    @NonNull
    public static MgAccountUpgradeBinding bind(@NonNull View view) {
        int i4 = R.id.alternative;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.alternative);
        if (linearLayout != null) {
            i4 = R.id.getValidateCode;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.getValidateCode);
            if (button != null) {
                i4 = R.id.nickname;
                EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.nickname);
                if (editText != null) {
                    i4 = R.id.password;
                    EditText editText2 = (EditText) ViewBindings.findChildViewById(view, R.id.password);
                    if (editText2 != null) {
                        i4 = R.id.phone;
                        EditText editText3 = (EditText) ViewBindings.findChildViewById(view, R.id.phone);
                        if (editText3 != null) {
                            i4 = R.id.scrollView;
                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                            if (scrollView != null) {
                                i4 = R.id.submit;
                                Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.submit);
                                if (button2 != null) {
                                    i4 = R.id.validateCode;
                                    EditText editText4 = (EditText) ViewBindings.findChildViewById(view, R.id.validateCode);
                                    if (editText4 != null) {
                                        return new MgAccountUpgradeBinding((LinearLayout) view, linearLayout, button, editText, editText2, editText3, scrollView, button2, editText4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgAccountUpgradeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23716b;
    }

    @NonNull
    public static MgAccountUpgradeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_account_upgrade, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
