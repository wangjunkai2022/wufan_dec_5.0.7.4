package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class PullToRefreshHeaderVerticalBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final View f26154b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f26155c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f26156d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ProgressBar f26157e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26158f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f26159g;

    private PullToRefreshHeaderVerticalBinding(@NonNull View view, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ProgressBar progressBar, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f26154b = view;
        this.f26155c = frameLayout;
        this.f26156d = imageView;
        this.f26157e = progressBar;
        this.f26158f = textView;
        this.f26159g = textView2;
    }

    @NonNull
    public static PullToRefreshHeaderVerticalBinding a(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.pull_to_refresh_header_vertical, viewGroup);
        return bind(viewGroup);
    }

    @NonNull
    public static PullToRefreshHeaderVerticalBinding bind(@NonNull View view) {
        int i4 = R.id.fl_inner;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.fl_inner);
        if (frameLayout != null) {
            i4 = R.id.pull_to_refresh_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.pull_to_refresh_image);
            if (imageView != null) {
                i4 = R.id.pull_to_refresh_progress;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pull_to_refresh_progress);
                if (progressBar != null) {
                    i4 = R.id.pull_to_refresh_sub_text;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.pull_to_refresh_sub_text);
                    if (textView != null) {
                        i4 = R.id.pull_to_refresh_text;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.pull_to_refresh_text);
                        if (textView2 != null) {
                            return new PullToRefreshHeaderVerticalBinding(view, frameLayout, imageView, progressBar, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f26154b;
    }
}
