package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class BrvahLeadingLoadMoreBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f17560b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ProgressBar f17561c;

    private BrvahLeadingLoadMoreBinding(@NonNull FrameLayout frameLayout, @NonNull ProgressBar progressBar) {
        this.f17560b = frameLayout;
        this.f17561c = progressBar;
    }

    @NonNull
    public static BrvahLeadingLoadMoreBinding bind(@NonNull View view) {
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.loading_progress);
        if (progressBar != null) {
            return new BrvahLeadingLoadMoreBinding((FrameLayout) view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.loading_progress)));
    }

    @NonNull
    public static BrvahLeadingLoadMoreBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f17560b;
    }

    @NonNull
    public static BrvahLeadingLoadMoreBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.brvah_leading_load_more, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
