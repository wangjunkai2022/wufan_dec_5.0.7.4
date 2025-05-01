package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogModStandardBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f18916b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f18917c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18918d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18919e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18920f;

    private DialogModStandardBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f18916b = constraintLayout;
        this.f18917c = imageView;
        this.f18918d = textView;
        this.f18919e = textView2;
        this.f18920f = textView3;
    }

    @NonNull
    public static DialogModStandardBinding bind(@NonNull View view) {
        int i4 = R.id.close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.close);
        if (imageView != null) {
            i4 = R.id.launch;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.launch);
            if (textView != null) {
                i4 = R.id.textView102;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView102);
                if (textView2 != null) {
                    i4 = R.id.textView93;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView93);
                    if (textView3 != null) {
                        return new DialogModStandardBinding((ConstraintLayout) view, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogModStandardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f18916b;
    }

    @NonNull
    public static DialogModStandardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_mod_standard, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
