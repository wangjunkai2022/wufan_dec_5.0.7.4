package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class VideoLoadingProgressBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26980b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ProgressBar f26981c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f26982d;

    private VideoLoadingProgressBinding(@NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar, @NonNull LinearLayout linearLayout2) {
        this.f26980b = linearLayout;
        this.f26981c = progressBar;
        this.f26982d = linearLayout2;
    }

    @NonNull
    public static VideoLoadingProgressBinding bind(@NonNull View view) {
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, 16908301);
        if (progressBar != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            return new VideoLoadingProgressBinding(linearLayout, progressBar, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(16908301)));
    }

    @NonNull
    public static VideoLoadingProgressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26980b;
    }

    @NonNull
    public static VideoLoadingProgressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.video_loading_progress, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
