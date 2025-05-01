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
public final class SampleCommonListFooterLoadingBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26266b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ProgressBar f26267c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f26268d;

    private SampleCommonListFooterLoadingBinding(@NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar, @NonNull LinearLayout linearLayout2) {
        this.f26266b = linearLayout;
        this.f26267c = progressBar;
        this.f26268d = linearLayout2;
    }

    @NonNull
    public static SampleCommonListFooterLoadingBinding bind(@NonNull View view) {
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.loading_progress);
        if (progressBar != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            return new SampleCommonListFooterLoadingBinding(linearLayout, progressBar, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.loading_progress)));
    }

    @NonNull
    public static SampleCommonListFooterLoadingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26266b;
    }

    @NonNull
    public static SampleCommonListFooterLoadingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.sample_common_list_footer_loading, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
