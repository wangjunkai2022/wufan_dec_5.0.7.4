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
import com.join.mgps.customview.LJWebView;
/* loaded from: classes3.dex */
public final class FragmentSearchWebBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f20091b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LJWebView f20092c;

    private FragmentSearchWebBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LJWebView lJWebView) {
        this.f20091b = constraintLayout;
        this.f20092c = lJWebView;
    }

    @NonNull
    public static FragmentSearchWebBinding bind(@NonNull View view) {
        LJWebView lJWebView = (LJWebView) ViewBindings.findChildViewById(view, R.id.web);
        if (lJWebView != null) {
            return new FragmentSearchWebBinding((ConstraintLayout) view, lJWebView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.web)));
    }

    @NonNull
    public static FragmentSearchWebBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f20091b;
    }

    @NonNull
    public static FragmentSearchWebBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_search_web, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
