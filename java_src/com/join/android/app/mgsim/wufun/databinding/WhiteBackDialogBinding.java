package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class WhiteBackDialogBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f27122b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f27123c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f27124d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f27125e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f27126f;

    private WhiteBackDialogBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull Button button, @NonNull Button button2, @NonNull TextView textView2) {
        this.f27122b = linearLayout;
        this.f27123c = textView;
        this.f27124d = button;
        this.f27125e = button2;
        this.f27126f = textView2;
    }

    @NonNull
    public static WhiteBackDialogBinding bind(@NonNull View view) {
        int i4 = R.id.content;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.content);
        if (textView != null) {
            i4 = R.id.dialog_button_cancel;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_cancel);
            if (button != null) {
                i4 = R.id.dialog_button_ok;
                Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_ok);
                if (button2 != null) {
                    i4 = R.id.tip_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tip_title);
                    if (textView2 != null) {
                        return new WhiteBackDialogBinding((LinearLayout) view, textView, button, button2, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static WhiteBackDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f27122b;
    }

    @NonNull
    public static WhiteBackDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.white_back_dialog, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
