package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class WufunloginSplashActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f27213b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f27214c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f27215d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView f27216e;

    private WufunloginSplashActivityBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull RecyclerView recyclerView) {
        this.f27213b = constraintLayout;
        this.f27214c = imageView;
        this.f27215d = textView;
        this.f27216e = recyclerView;
    }

    @NonNull
    public static WufunloginSplashActivityBinding bind(@NonNull View view) {
        int i4 = R.id.close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.close);
        if (imageView != null) {
            i4 = R.id.login;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.login);
            if (textView != null) {
                i4 = R.id.mRecyclerView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.mRecyclerView);
                if (recyclerView != null) {
                    return new WufunloginSplashActivityBinding((ConstraintLayout) view, imageView, textView, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static WufunloginSplashActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f27213b;
    }

    @NonNull
    public static WufunloginSplashActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.wufunlogin_splash_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
