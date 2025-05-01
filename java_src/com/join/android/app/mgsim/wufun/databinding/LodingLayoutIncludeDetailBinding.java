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
public final class LodingLayoutIncludeDetailBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23564b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LoadingImageView f23565c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f23566d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23567e;

    private LodingLayoutIncludeDetailBinding(@NonNull LinearLayout linearLayout, @NonNull LoadingImageView loadingImageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView) {
        this.f23564b = linearLayout;
        this.f23565c = loadingImageView;
        this.f23566d = linearLayout2;
        this.f23567e = textView;
    }

    @NonNull
    public static LodingLayoutIncludeDetailBinding bind(@NonNull View view) {
        int i4 = R.id.loading_view_detail;
        LoadingImageView loadingImageView = (LoadingImageView) ViewBindings.findChildViewById(view, R.id.loading_view_detail);
        if (loadingImageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView2);
            if (textView != null) {
                return new LodingLayoutIncludeDetailBinding(linearLayout, loadingImageView, linearLayout, textView);
            }
            i4 = R.id.textView2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LodingLayoutIncludeDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23564b;
    }

    @NonNull
    public static LodingLayoutIncludeDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.loding_layout_include_detail, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
