package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class UpdateChoiceDialogBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26826b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26827c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26828d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26829e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26830f;

    private UpdateChoiceDialogBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f26826b = linearLayout;
        this.f26827c = textView;
        this.f26828d = textView2;
        this.f26829e = textView3;
        this.f26830f = textView4;
    }

    @NonNull
    public static UpdateChoiceDialogBinding bind(@NonNull View view) {
        int i4 = R.id.dialog_button_cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.dialog_button_cancel);
        if (textView != null) {
            i4 = R.id.dialog_button_ok;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.dialog_button_ok);
            if (textView2 != null) {
                i4 = R.id.dialog_content;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.dialog_content);
                if (textView3 != null) {
                    i4 = R.id.tip_title;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tip_title);
                    if (textView4 != null) {
                        return new UpdateChoiceDialogBinding((LinearLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static UpdateChoiceDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26826b;
    }

    @NonNull
    public static UpdateChoiceDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.update_choice_dialog, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
