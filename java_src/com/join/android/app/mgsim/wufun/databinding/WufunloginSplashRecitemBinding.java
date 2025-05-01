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
import com.join.mgps.activity.login.FitImageView;
/* loaded from: classes3.dex */
public final class WufunloginSplashRecitemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f27217b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final FitImageView f27218c;

    private WufunloginSplashRecitemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull FitImageView fitImageView) {
        this.f27217b = constraintLayout;
        this.f27218c = fitImageView;
    }

    @NonNull
    public static WufunloginSplashRecitemBinding bind(@NonNull View view) {
        FitImageView fitImageView = (FitImageView) ViewBindings.findChildViewById(view, R.id.item_bg);
        if (fitImageView != null) {
            return new WufunloginSplashRecitemBinding((ConstraintLayout) view, fitImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.item_bg)));
    }

    @NonNull
    public static WufunloginSplashRecitemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f27217b;
    }

    @NonNull
    public static WufunloginSplashRecitemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.wufunlogin_splash_recitem, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
