package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FragmentRaceroomBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f20067b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final WebView f20068c;

    private FragmentRaceroomBinding(@NonNull FrameLayout frameLayout, @NonNull WebView webView) {
        this.f20067b = frameLayout;
        this.f20068c = webView;
    }

    @NonNull
    public static FragmentRaceroomBinding bind(@NonNull View view) {
        WebView webView = (WebView) ViewBindings.findChildViewById(view, R.id.mWebView);
        if (webView != null) {
            return new FragmentRaceroomBinding((FrameLayout) view, webView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.mWebView)));
    }

    @NonNull
    public static FragmentRaceroomBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f20067b;
    }

    @NonNull
    public static FragmentRaceroomBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_raceroom, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
