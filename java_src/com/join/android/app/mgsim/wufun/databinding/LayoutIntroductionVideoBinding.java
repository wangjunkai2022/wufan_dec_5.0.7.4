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
import com.join.mgps.customview.NestedScrollWebView;
/* loaded from: classes3.dex */
public final class LayoutIntroductionVideoBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23098b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final NestedScrollWebView f23099c;

    private LayoutIntroductionVideoBinding(@NonNull LinearLayout linearLayout, @NonNull NestedScrollWebView nestedScrollWebView) {
        this.f23098b = linearLayout;
        this.f23099c = nestedScrollWebView;
    }

    @NonNull
    public static LayoutIntroductionVideoBinding bind(@NonNull View view) {
        NestedScrollWebView nestedScrollWebView = (NestedScrollWebView) ViewBindings.findChildViewById(view, R.id.ns_web_view);
        if (nestedScrollWebView != null) {
            return new LayoutIntroductionVideoBinding((LinearLayout) view, nestedScrollWebView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.ns_web_view)));
    }

    @NonNull
    public static LayoutIntroductionVideoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23098b;
    }

    @NonNull
    public static LayoutIntroductionVideoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_introduction_video, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
