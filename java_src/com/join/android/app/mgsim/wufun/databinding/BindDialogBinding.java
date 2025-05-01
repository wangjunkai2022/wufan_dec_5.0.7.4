package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class BindDialogBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17506b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f17507c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f17508d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f17509e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f17510f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f17511g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f17512h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f17513i;

    private BindDialogBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull View view, @NonNull ImageView imageView, @NonNull TextView textView3) {
        this.f17506b = linearLayout;
        this.f17507c = button;
        this.f17508d = button2;
        this.f17509e = textView;
        this.f17510f = textView2;
        this.f17511g = view;
        this.f17512h = imageView;
        this.f17513i = textView3;
    }

    @NonNull
    public static BindDialogBinding bind(@NonNull View view) {
        int i4 = R.id.dialog_button_cancel;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_cancel);
        if (button != null) {
            i4 = R.id.dialog_button_ok;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_ok);
            if (button2 != null) {
                i4 = R.id.dialog_content;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.dialog_content);
                if (textView != null) {
                    i4 = R.id.dialog_desci;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.dialog_desci);
                    if (textView2 != null) {
                        i4 = R.id.divider;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.divider);
                        if (findChildViewById != null) {
                            i4 = R.id.notice;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.notice);
                            if (imageView != null) {
                                i4 = R.id.tip_title;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tip_title);
                                if (textView3 != null) {
                                    return new BindDialogBinding((LinearLayout) view, button, button2, textView, textView2, findChildViewById, imageView, textView3);
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
    public static BindDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17506b;
    }

    @NonNull
    public static BindDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.bind_dialog, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
