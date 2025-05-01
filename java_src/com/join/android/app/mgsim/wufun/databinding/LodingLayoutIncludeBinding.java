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
public final class LodingLayoutIncludeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23560b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LoadingImageView f23561c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f23562d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23563e;

    private LodingLayoutIncludeBinding(@NonNull LinearLayout linearLayout, @NonNull LoadingImageView loadingImageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView) {
        this.f23560b = linearLayout;
        this.f23561c = loadingImageView;
        this.f23562d = linearLayout2;
        this.f23563e = textView;
    }

    @NonNull
    public static LodingLayoutIncludeBinding bind(@NonNull View view) {
        int i4 = R.id.loading_view;
        LoadingImageView loadingImageView = (LoadingImageView) ViewBindings.findChildViewById(view, R.id.loading_view);
        if (loadingImageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView2);
            if (textView != null) {
                return new LodingLayoutIncludeBinding(linearLayout, loadingImageView, linearLayout, textView);
            }
            i4 = R.id.textView2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LodingLayoutIncludeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23560b;
    }

    @NonNull
    public static LodingLayoutIncludeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.loding_layout_include, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
