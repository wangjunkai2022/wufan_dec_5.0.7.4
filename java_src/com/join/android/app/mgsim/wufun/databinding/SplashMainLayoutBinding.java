package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class SplashMainLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26670b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f26671c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26672d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f26673e;

    private SplashMainLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull ImageView imageView) {
        this.f26670b = relativeLayout;
        this.f26671c = frameLayout;
        this.f26672d = textView;
        this.f26673e = imageView;
    }

    @NonNull
    public static SplashMainLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.main;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.main);
        if (frameLayout != null) {
            i4 = R.id.skip_view;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.skip_view);
            if (textView != null) {
                i4 = R.id.splash_holder;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.splash_holder);
                if (imageView != null) {
                    return new SplashMainLayoutBinding((RelativeLayout) view, frameLayout, textView, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static SplashMainLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26670b;
    }

    @NonNull
    public static SplashMainLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.splash_main_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
