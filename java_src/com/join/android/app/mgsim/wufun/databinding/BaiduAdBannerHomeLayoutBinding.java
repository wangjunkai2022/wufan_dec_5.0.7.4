package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class BaiduAdBannerHomeLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17490b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f17491c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f17492d;

    private BaiduAdBannerHomeLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull View view) {
        this.f17490b = linearLayout;
        this.f17491c = linearLayout2;
        this.f17492d = view;
    }

    @NonNull
    public static BaiduAdBannerHomeLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.bannerHome;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.bannerHome);
        if (linearLayout != null) {
            i4 = R.id.post_footer_divider;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.post_footer_divider);
            if (findChildViewById != null) {
                return new BaiduAdBannerHomeLayoutBinding((LinearLayout) view, linearLayout, findChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static BaiduAdBannerHomeLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17490b;
    }

    @NonNull
    public static BaiduAdBannerHomeLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.baidu_ad_banner_home_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
