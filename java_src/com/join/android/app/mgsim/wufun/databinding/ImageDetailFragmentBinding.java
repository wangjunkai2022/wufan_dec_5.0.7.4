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
import me.relex.photodraweeview.PhotoDraweeView;
/* loaded from: classes3.dex */
public final class ImageDetailFragmentBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f21487b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final PhotoDraweeView f21488c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ProgressBar f21489d;

    private ImageDetailFragmentBinding(@NonNull FrameLayout frameLayout, @NonNull PhotoDraweeView photoDraweeView, @NonNull ProgressBar progressBar) {
        this.f21487b = frameLayout;
        this.f21488c = photoDraweeView;
        this.f21489d = progressBar;
    }

    @NonNull
    public static ImageDetailFragmentBinding bind(@NonNull View view) {
        int i4 = R.id.image;
        PhotoDraweeView photoDraweeView = (PhotoDraweeView) ViewBindings.findChildViewById(view, R.id.image);
        if (photoDraweeView != null) {
            i4 = R.id.loading;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.loading);
            if (progressBar != null) {
                return new ImageDetailFragmentBinding((FrameLayout) view, photoDraweeView, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ImageDetailFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f21487b;
    }

    @NonNull
    public static ImageDetailFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.image_detail_fragment, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
