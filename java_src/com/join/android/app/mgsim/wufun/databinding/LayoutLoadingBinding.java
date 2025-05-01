package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.LoadingImageView;
/* loaded from: classes3.dex */
public final class LayoutLoadingBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23130b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f23131c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LoadingImageView f23132d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23133e;

    private LayoutLoadingBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LoadingImageView loadingImageView, @NonNull TextView textView) {
        this.f23130b = linearLayout;
        this.f23131c = linearLayout2;
        this.f23132d = loadingImageView;
        this.f23133e = textView;
    }

    @NonNull
    public static LayoutLoadingBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = R.id.loading_view;
        LoadingImageView loadingImageView = (LoadingImageView) ViewBindings.findChildViewById(view, R.id.loading_view);
        if (loadingImageView != null) {
            i4 = R.id.textView2;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView2);
            if (textView != null) {
                return new LayoutLoadingBinding(linearLayout, linearLayout, loadingImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutLoadingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23130b;
    }

    @NonNull
    public static LayoutLoadingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_loading, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
