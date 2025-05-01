package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityAccountCenterNewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f15699b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f15700c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f15701d;

    private ActivityAccountCenterNewBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout) {
        this.f15699b = relativeLayout;
        this.f15700c = imageView;
        this.f15701d = frameLayout;
    }

    @NonNull
    public static ActivityAccountCenterNewBinding bind(@NonNull View view) {
        int i4 = R.id.back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back);
        if (imageView != null) {
            i4 = R.id.fragmentLayout;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.fragmentLayout);
            if (frameLayout != null) {
                return new ActivityAccountCenterNewBinding((RelativeLayout) view, imageView, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityAccountCenterNewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f15699b;
    }

    @NonNull
    public static ActivityAccountCenterNewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_account_center_new, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
