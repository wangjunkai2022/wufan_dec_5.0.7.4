package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.NestedScrollWebView;
/* loaded from: classes3.dex */
public final class LayoutIntroductionWebBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23100b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final AppBarLayout f23101c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final NestedScrollWebView f23102d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23103e;

    private LayoutIntroductionWebBinding(@NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull NestedScrollWebView nestedScrollWebView, @NonNull TextView textView) {
        this.f23100b = linearLayout;
        this.f23101c = appBarLayout;
        this.f23102d = nestedScrollWebView;
        this.f23103e = textView;
    }

    @NonNull
    public static LayoutIntroductionWebBinding bind(@NonNull View view) {
        int i4 = R.id.app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, R.id.app_bar);
        if (appBarLayout != null) {
            i4 = R.id.ns_web_view;
            NestedScrollWebView nestedScrollWebView = (NestedScrollWebView) ViewBindings.findChildViewById(view, R.id.ns_web_view);
            if (nestedScrollWebView != null) {
                i4 = R.id.title_textview;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title_textview);
                if (textView != null) {
                    return new LayoutIntroductionWebBinding((LinearLayout) view, appBarLayout, nestedScrollWebView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutIntroductionWebBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23100b;
    }

    @NonNull
    public static LayoutIntroductionWebBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_introduction_web, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
