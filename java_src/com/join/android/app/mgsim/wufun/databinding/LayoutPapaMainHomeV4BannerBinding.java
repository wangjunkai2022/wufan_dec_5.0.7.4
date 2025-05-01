package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.youth.banner.Banner;
/* loaded from: classes3.dex */
public final class LayoutPapaMainHomeV4BannerBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f23188b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Banner f23189c;

    private LayoutPapaMainHomeV4BannerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Banner banner) {
        this.f23188b = constraintLayout;
        this.f23189c = banner;
    }

    @NonNull
    public static LayoutPapaMainHomeV4BannerBinding bind(@NonNull View view) {
        Banner banner = (Banner) ViewBindings.findChildViewById(view, R.id.banner);
        if (banner != null) {
            return new LayoutPapaMainHomeV4BannerBinding((ConstraintLayout) view, banner);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.banner)));
    }

    @NonNull
    public static LayoutPapaMainHomeV4BannerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f23188b;
    }

    @NonNull
    public static LayoutPapaMainHomeV4BannerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_papa_main_home_v4_banner, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
