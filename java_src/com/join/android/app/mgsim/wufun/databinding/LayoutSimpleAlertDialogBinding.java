package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LayoutSimpleAlertDialogBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23323b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f23324c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CheckBox f23325d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23326e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23327f;

    private LayoutSimpleAlertDialogBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull CheckBox checkBox, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f23323b = linearLayout;
        this.f23324c = button;
        this.f23325d = checkBox;
        this.f23326e = textView;
        this.f23327f = textView2;
    }

    @NonNull
    public static LayoutSimpleAlertDialogBinding bind(@NonNull View view) {
        int i4 = R.id.dialog_button_ok;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_ok);
        if (button != null) {
            i4 = R.id.dialogCb;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.dialogCb);
            if (checkBox != null) {
                i4 = R.id.dialog_content;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.dialog_content);
                if (textView != null) {
                    i4 = R.id.tip_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tip_title);
                    if (textView2 != null) {
                        return new LayoutSimpleAlertDialogBinding((LinearLayout) view, button, checkBox, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutSimpleAlertDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23323b;
    }

    @NonNull
    public static LayoutSimpleAlertDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_simple_alert_dialog, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
