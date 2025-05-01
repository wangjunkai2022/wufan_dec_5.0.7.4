package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class BrvahQuickViewLoadMoreV2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f17569b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f17570c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f17571d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f17572e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ProgressBar f17573f;

    private BrvahQuickViewLoadMoreV2Binding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar) {
        this.f17569b = frameLayout;
        this.f17570c = frameLayout2;
        this.f17571d = frameLayout3;
        this.f17572e = linearLayout;
        this.f17573f = progressBar;
    }

    @NonNull
    public static BrvahQuickViewLoadMoreV2Binding bind(@NonNull View view) {
        int i4 = R.id.load_more_load_end_view;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.load_more_load_end_view);
        if (frameLayout != null) {
            i4 = R.id.load_more_load_fail_view;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.load_more_load_fail_view);
            if (frameLayout2 != null) {
                i4 = R.id.load_more_loading_view;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.load_more_loading_view);
                if (linearLayout != null) {
                    i4 = R.id.loading_progress;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.loading_progress);
                    if (progressBar != null) {
                        return new BrvahQuickViewLoadMoreV2Binding((FrameLayout) view, frameLayout, frameLayout2, linearLayout, progressBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static BrvahQuickViewLoadMoreV2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f17569b;
    }

    @NonNull
    public static BrvahQuickViewLoadMoreV2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.brvah_quick_view_load_more_v2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
