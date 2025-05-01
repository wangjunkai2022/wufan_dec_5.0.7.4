package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DetialSearchLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18481b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f18482c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f18483d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f18484e;

    private DetialSearchLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.f18481b = relativeLayout;
        this.f18482c = relativeLayout2;
        this.f18483d = imageView;
        this.f18484e = imageView2;
    }

    @NonNull
    public static DetialSearchLayoutBinding bind(@NonNull View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i4 = R.id.search_detial_back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.search_detial_back);
        if (imageView != null) {
            i4 = R.id.search_detial_image;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.search_detial_image);
            if (imageView2 != null) {
                return new DetialSearchLayoutBinding(relativeLayout, relativeLayout, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DetialSearchLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18481b;
    }

    @NonNull
    public static DetialSearchLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.detial_search_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
