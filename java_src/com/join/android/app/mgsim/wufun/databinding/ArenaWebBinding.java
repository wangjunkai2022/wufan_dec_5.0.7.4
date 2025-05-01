package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.LJWebView;
/* loaded from: classes3.dex */
public final class ArenaWebBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f17479b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LJWebView f17480c;

    private ArenaWebBinding(@NonNull FrameLayout frameLayout, @NonNull LJWebView lJWebView) {
        this.f17479b = frameLayout;
        this.f17480c = lJWebView;
    }

    @NonNull
    public static ArenaWebBinding bind(@NonNull View view) {
        LJWebView lJWebView = (LJWebView) ViewBindings.findChildViewById(view, R.id.web);
        if (lJWebView != null) {
            return new ArenaWebBinding((FrameLayout) view, lJWebView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.web)));
    }

    @NonNull
    public static ArenaWebBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f17479b;
    }

    @NonNull
    public static ArenaWebBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.arena_web, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
