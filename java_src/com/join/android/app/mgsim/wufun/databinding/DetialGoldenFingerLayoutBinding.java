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
public final class DetialGoldenFingerLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f18458b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f18459c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18460d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f18461e;

    private DetialGoldenFingerLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull View view) {
        this.f18458b = constraintLayout;
        this.f18459c = imageView;
        this.f18460d = textView;
        this.f18461e = view;
    }

    @NonNull
    public static DetialGoldenFingerLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.imageView46;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView46);
        if (imageView != null) {
            i4 = R.id.text;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.text);
            if (textView != null) {
                i4 = R.id.view4;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.view4);
                if (findChildViewById != null) {
                    return new DetialGoldenFingerLayoutBinding((ConstraintLayout) view, imageView, textView, findChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DetialGoldenFingerLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f18458b;
    }

    @NonNull
    public static DetialGoldenFingerLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.detial_golden_finger_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
