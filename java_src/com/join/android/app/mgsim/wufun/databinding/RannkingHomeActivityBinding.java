package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class RannkingHomeActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26217b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f26218c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TopbarLeftTitleLayoutBinding f26219d;

    private RannkingHomeActivityBinding(@NonNull RelativeLayout relativeLayout, @NonNull FrameLayout frameLayout, @NonNull TopbarLeftTitleLayoutBinding topbarLeftTitleLayoutBinding) {
        this.f26217b = relativeLayout;
        this.f26218c = frameLayout;
        this.f26219d = topbarLeftTitleLayoutBinding;
    }

    @NonNull
    public static RannkingHomeActivityBinding bind(@NonNull View view) {
        int i4 = R.id.fragment;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.fragment);
        if (frameLayout != null) {
            i4 = R.id.title;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.title);
            if (findChildViewById != null) {
                return new RannkingHomeActivityBinding((RelativeLayout) view, frameLayout, TopbarLeftTitleLayoutBinding.bind(findChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static RannkingHomeActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26217b;
    }

    @NonNull
    public static RannkingHomeActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.rannking_home_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
