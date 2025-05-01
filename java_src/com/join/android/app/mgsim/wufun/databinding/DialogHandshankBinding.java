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
public final class DialogHandshankBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18777b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18778c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f18779d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18780e;

    private DialogHandshankBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull Button button, @NonNull TextView textView2) {
        this.f18777b = linearLayout;
        this.f18778c = textView;
        this.f18779d = button;
        this.f18780e = textView2;
    }

    @NonNull
    public static DialogHandshankBinding bind(@NonNull View view) {
        int i4 = R.id.cancel_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.cancel_tv);
        if (textView != null) {
            i4 = R.id.check_btn;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.check_btn);
            if (button != null) {
                i4 = R.id.name_tv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.name_tv);
                if (textView2 != null) {
                    return new DialogHandshankBinding((LinearLayout) view, textView, button, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogHandshankBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18777b;
    }

    @NonNull
    public static DialogHandshankBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_handshank, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
