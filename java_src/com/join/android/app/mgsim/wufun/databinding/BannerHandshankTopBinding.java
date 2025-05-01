package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class BannerHandshankTopBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f17502b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f17503c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f17504d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LayoutPapaLoadingBinding f17505e;

    private BannerHandshankTopBinding(@NonNull FrameLayout frameLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout, @NonNull LayoutPapaLoadingBinding layoutPapaLoadingBinding) {
        this.f17502b = frameLayout;
        this.f17503c = simpleDraweeView;
        this.f17504d = linearLayout;
        this.f17505e = layoutPapaLoadingBinding;
    }

    @NonNull
    public static BannerHandshankTopBinding bind(@NonNull View view) {
        int i4 = R.id.iv_banner;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.iv_banner);
        if (simpleDraweeView != null) {
            i4 = R.id.ll_fast_entrance;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_fast_entrance);
            if (linearLayout != null) {
                i4 = R.id.loadingLayout;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.loadingLayout);
                if (findChildViewById != null) {
                    return new BannerHandshankTopBinding((FrameLayout) view, simpleDraweeView, linearLayout, LayoutPapaLoadingBinding.bind(findChildViewById));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static BannerHandshankTopBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f17502b;
    }

    @NonNull
    public static BannerHandshankTopBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.banner_handshank_top, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
