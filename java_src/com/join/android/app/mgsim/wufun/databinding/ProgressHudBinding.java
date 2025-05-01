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
public final class ProgressHudBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26147b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26148c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26149d;

    private ProgressHudBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f26147b = linearLayout;
        this.f26148c = imageView;
        this.f26149d = textView;
    }

    @NonNull
    public static ProgressHudBinding bind(@NonNull View view) {
        int i4 = R.id.image_spinner;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.image_spinner);
        if (imageView != null) {
            i4 = R.id.text_message;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.text_message);
            if (textView != null) {
                return new ProgressHudBinding((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ProgressHudBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26147b;
    }

    @NonNull
    public static ProgressHudBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.progress_hud, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
