package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class GameinformationWeblayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21131b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final WebView f21132c;

    private GameinformationWeblayoutBinding(@NonNull LinearLayout linearLayout, @NonNull WebView webView) {
        this.f21131b = linearLayout;
        this.f21132c = webView;
    }

    @NonNull
    public static GameinformationWeblayoutBinding bind(@NonNull View view) {
        WebView webView = (WebView) ViewBindings.findChildViewById(view, R.id.webView);
        if (webView != null) {
            return new GameinformationWeblayoutBinding((LinearLayout) view, webView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.webView)));
    }

    @NonNull
    public static GameinformationWeblayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21131b;
    }

    @NonNull
    public static GameinformationWeblayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gameinformation_weblayout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
