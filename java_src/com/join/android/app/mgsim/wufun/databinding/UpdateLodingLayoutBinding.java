package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class UpdateLodingLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26841b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26842c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f26843d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ProgressBar f26844e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26845f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ProgressBar f26846g;

    private UpdateLodingLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar, @NonNull TextView textView, @NonNull ProgressBar progressBar2) {
        this.f26841b = relativeLayout;
        this.f26842c = imageView;
        this.f26843d = linearLayout;
        this.f26844e = progressBar;
        this.f26845f = textView;
        this.f26846g = progressBar2;
    }

    @NonNull
    public static UpdateLodingLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.lodingBackImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.lodingBackImage);
        if (imageView != null) {
            i4 = R.id.message;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.message);
            if (linearLayout != null) {
                i4 = R.id.progressBar;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                if (progressBar != null) {
                    i4 = R.id.progressmessage;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.progressmessage);
                    if (textView != null) {
                        i4 = R.id.uZIPLoading;
                        ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.uZIPLoading);
                        if (progressBar2 != null) {
                            return new UpdateLodingLayoutBinding((RelativeLayout) view, imageView, linearLayout, progressBar, textView, progressBar2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static UpdateLodingLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26841b;
    }

    @NonNull
    public static UpdateLodingLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.update_loding_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
