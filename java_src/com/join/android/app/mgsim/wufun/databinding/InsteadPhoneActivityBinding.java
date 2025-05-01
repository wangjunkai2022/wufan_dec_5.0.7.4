package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class InsteadPhoneActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21607b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final EditText f21608c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f21609d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21610e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ScrollView f21611f;

    private InsteadPhoneActivityBinding(@NonNull LinearLayout linearLayout, @NonNull EditText editText, @NonNull Button button, @NonNull TextView textView, @NonNull ScrollView scrollView) {
        this.f21607b = linearLayout;
        this.f21608c = editText;
        this.f21609d = button;
        this.f21610e = textView;
        this.f21611f = scrollView;
    }

    @NonNull
    public static InsteadPhoneActivityBinding bind(@NonNull View view) {
        int i4 = R.id.inputPhone;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.inputPhone);
        if (editText != null) {
            i4 = R.id.insteadButn;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.insteadButn);
            if (button != null) {
                i4 = R.id.myAccountTv;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.myAccountTv);
                if (textView != null) {
                    i4 = R.id.scrollView;
                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                    if (scrollView != null) {
                        return new InsteadPhoneActivityBinding((LinearLayout) view, editText, button, textView, scrollView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static InsteadPhoneActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21607b;
    }

    @NonNull
    public static InsteadPhoneActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.instead_phone_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
