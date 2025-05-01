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
public final class LayoutCustomLoadingBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22969b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LoadingImageView f22970c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f22971d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22972e;

    private LayoutCustomLoadingBinding(@NonNull LinearLayout linearLayout, @NonNull LoadingImageView loadingImageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView) {
        this.f22969b = linearLayout;
        this.f22970c = loadingImageView;
        this.f22971d = linearLayout2;
        this.f22972e = textView;
    }

    @NonNull
    public static LayoutCustomLoadingBinding bind(@NonNull View view) {
        int i4 = R.id.loading_view;
        LoadingImageView loadingImageView = (LoadingImageView) ViewBindings.findChildViewById(view, R.id.loading_view);
        if (loadingImageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView2);
            if (textView != null) {
                return new LayoutCustomLoadingBinding(linearLayout, loadingImageView, linearLayout, textView);
            }
            i4 = R.id.textView2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutCustomLoadingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22969b;
    }

    @NonNull
    public static LayoutCustomLoadingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_custom_loading, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
