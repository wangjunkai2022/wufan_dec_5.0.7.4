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
public final class JpushPopwinLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22935b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f22936c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final WebView f22937d;

    private JpushPopwinLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull WebView webView) {
        this.f22935b = linearLayout;
        this.f22936c = linearLayout2;
        this.f22937d = webView;
    }

    @NonNull
    public static JpushPopwinLayoutBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        WebView webView = (WebView) ViewBindings.findChildViewById(view, R.id.wvPopwin);
        if (webView != null) {
            return new JpushPopwinLayoutBinding(linearLayout, linearLayout, webView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.wvPopwin)));
    }

    @NonNull
    public static JpushPopwinLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22935b;
    }

    @NonNull
    public static JpushPopwinLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.jpush_popwin_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
