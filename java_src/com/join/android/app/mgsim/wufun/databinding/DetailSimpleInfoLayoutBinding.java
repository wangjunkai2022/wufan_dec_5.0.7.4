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
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ObservableWebView;
/* loaded from: classes3.dex */
public final class DetailSimpleInfoLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18405b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18406c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f18407d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ObservableWebView f18408e;

    private DetailSimpleInfoLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull ObservableWebView observableWebView) {
        this.f18405b = linearLayout;
        this.f18406c = textView;
        this.f18407d = linearLayout2;
        this.f18408e = observableWebView;
    }

    @NonNull
    public static DetailSimpleInfoLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.textView;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView);
        if (textView != null) {
            i4 = R.id.tipsLayout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tipsLayout);
            if (linearLayout != null) {
                i4 = R.id.webView;
                ObservableWebView observableWebView = (ObservableWebView) ViewBindings.findChildViewById(view, R.id.webView);
                if (observableWebView != null) {
                    return new DetailSimpleInfoLayoutBinding((LinearLayout) view, textView, linearLayout, observableWebView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DetailSimpleInfoLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18405b;
    }

    @NonNull
    public static DetailSimpleInfoLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.detail_simple_info_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
