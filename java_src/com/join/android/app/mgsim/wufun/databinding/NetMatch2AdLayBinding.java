package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class NetMatch2AdLayBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f25389b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f25390c;

    private NetMatch2AdLayBinding(@NonNull FrameLayout frameLayout, @NonNull SimpleDraweeView simpleDraweeView) {
        this.f25389b = frameLayout;
        this.f25390c = simpleDraweeView;
    }

    @NonNull
    public static NetMatch2AdLayBinding bind(@NonNull View view) {
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ad_img);
        if (simpleDraweeView != null) {
            return new NetMatch2AdLayBinding((FrameLayout) view, simpleDraweeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.ad_img)));
    }

    @NonNull
    public static NetMatch2AdLayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f25389b;
    }

    @NonNull
    public static NetMatch2AdLayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.net_match2_ad_lay, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
