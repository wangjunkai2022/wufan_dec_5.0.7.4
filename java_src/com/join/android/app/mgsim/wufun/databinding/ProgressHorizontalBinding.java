package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.join.android.app.mgsim.wufun.R;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class ProgressHorizontalBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ProgressBar f26145b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ProgressBar f26146c;

    private ProgressHorizontalBinding(@NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2) {
        this.f26145b = progressBar;
        this.f26146c = progressBar2;
    }

    @NonNull
    public static ProgressHorizontalBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        ProgressBar progressBar = (ProgressBar) view;
        return new ProgressHorizontalBinding(progressBar, progressBar);
    }

    @NonNull
    public static ProgressHorizontalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ProgressBar getRoot() {
        return this.f26145b;
    }

    @NonNull
    public static ProgressHorizontalBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.progress_horizontal, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
