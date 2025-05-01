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
public final class AppointmentPayPopwindowPageBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ScrollView f17465b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f17466c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final EditText f17467d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f17468e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f17469f;

    private AppointmentPayPopwindowPageBinding(@NonNull ScrollView scrollView, @NonNull Button button, @NonNull EditText editText, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2) {
        this.f17465b = scrollView;
        this.f17466c = button;
        this.f17467d = editText;
        this.f17468e = linearLayout;
        this.f17469f = linearLayout2;
    }

    @NonNull
    public static AppointmentPayPopwindowPageBinding bind(@NonNull View view) {
        int i4 = R.id.btn_confirm;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_confirm);
        if (button != null) {
            i4 = R.id.edit;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.edit);
            if (editText != null) {
                i4 = R.id.ll_dismiss;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_dismiss);
                if (linearLayout != null) {
                    i4 = R.id.toot;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.toot);
                    if (linearLayout2 != null) {
                        return new AppointmentPayPopwindowPageBinding((ScrollView) view, button, editText, linearLayout, linearLayout2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static AppointmentPayPopwindowPageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ScrollView getRoot() {
        return this.f17465b;
    }

    @NonNull
    public static AppointmentPayPopwindowPageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.appointment_pay_popwindow_page, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
