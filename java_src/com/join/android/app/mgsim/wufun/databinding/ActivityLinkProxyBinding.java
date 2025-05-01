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
import com.join.mgps.customview.ForumLoadingView;
/* loaded from: classes3.dex */
public final class ActivityLinkProxyBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16555b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ForumLoadingView f16556c;

    private ActivityLinkProxyBinding(@NonNull LinearLayout linearLayout, @NonNull ForumLoadingView forumLoadingView) {
        this.f16555b = linearLayout;
        this.f16556c = forumLoadingView;
    }

    @NonNull
    public static ActivityLinkProxyBinding bind(@NonNull View view) {
        ForumLoadingView forumLoadingView = (ForumLoadingView) ViewBindings.findChildViewById(view, R.id.loadingView);
        if (forumLoadingView != null) {
            return new ActivityLinkProxyBinding((LinearLayout) view, forumLoadingView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.loadingView)));
    }

    @NonNull
    public static ActivityLinkProxyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16555b;
    }

    @NonNull
    public static ActivityLinkProxyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_link_proxy, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
