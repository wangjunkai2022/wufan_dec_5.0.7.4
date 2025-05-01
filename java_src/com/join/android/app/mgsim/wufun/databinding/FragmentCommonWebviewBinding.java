package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.LJNestScrollWebView;
/* loaded from: classes3.dex */
public final class FragmentCommonWebviewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19684b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f19685c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LJNestScrollWebView f19686d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f19687e;

    private FragmentCommonWebviewBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull LJNestScrollWebView lJNestScrollWebView, @NonNull RelativeLayout relativeLayout2) {
        this.f19684b = relativeLayout;
        this.f19685c = linearLayout;
        this.f19686d = lJNestScrollWebView;
        this.f19687e = relativeLayout2;
    }

    @NonNull
    public static FragmentCommonWebviewBinding bind(@NonNull View view) {
        int i4 = R.id.loding_layout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.loding_layout);
        if (linearLayout != null) {
            i4 = R.id.web;
            LJNestScrollWebView lJNestScrollWebView = (LJNestScrollWebView) ViewBindings.findChildViewById(view, R.id.web);
            if (lJNestScrollWebView != null) {
                i4 = R.id.weblayout;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.weblayout);
                if (relativeLayout != null) {
                    return new FragmentCommonWebviewBinding((RelativeLayout) view, linearLayout, lJNestScrollWebView, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentCommonWebviewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19684b;
    }

    @NonNull
    public static FragmentCommonWebviewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_common_webview, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
