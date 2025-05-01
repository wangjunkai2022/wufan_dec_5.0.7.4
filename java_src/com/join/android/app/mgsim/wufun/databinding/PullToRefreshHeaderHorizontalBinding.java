package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class PullToRefreshHeaderHorizontalBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final View f26150b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f26151c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f26152d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ProgressBar f26153e;

    private PullToRefreshHeaderHorizontalBinding(@NonNull View view, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ProgressBar progressBar) {
        this.f26150b = view;
        this.f26151c = frameLayout;
        this.f26152d = imageView;
        this.f26153e = progressBar;
    }

    @NonNull
    public static PullToRefreshHeaderHorizontalBinding a(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.pull_to_refresh_header_horizontal, viewGroup);
        return bind(viewGroup);
    }

    @NonNull
    public static PullToRefreshHeaderHorizontalBinding bind(@NonNull View view) {
        int i4 = R.id.fl_inner;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.fl_inner);
        if (frameLayout != null) {
            i4 = R.id.pull_to_refresh_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.pull_to_refresh_image);
            if (imageView != null) {
                i4 = R.id.pull_to_refresh_progress;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pull_to_refresh_progress);
                if (progressBar != null) {
                    return new PullToRefreshHeaderHorizontalBinding(view, frameLayout, imageView, progressBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f26150b;
    }
}
