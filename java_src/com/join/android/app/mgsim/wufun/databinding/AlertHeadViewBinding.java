package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class AlertHeadViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17356b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f17357c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f17358d;

    private AlertHeadViewBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f17356b = linearLayout;
        this.f17357c = imageView;
        this.f17358d = textView;
    }

    @NonNull
    public static AlertHeadViewBinding bind(@NonNull View view) {
        int i4 = R.id.iv_dialog_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_dialog_icon);
        if (imageView != null) {
            i4 = R.id.tv_dialog_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_dialog_title);
            if (textView != null) {
                return new AlertHeadViewBinding((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static AlertHeadViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17356b;
    }

    @NonNull
    public static AlertHeadViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.alert_head_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
