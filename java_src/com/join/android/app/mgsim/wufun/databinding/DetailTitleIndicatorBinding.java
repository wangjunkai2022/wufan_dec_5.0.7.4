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
/* loaded from: classes3.dex */
public final class DetailTitleIndicatorBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18409b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f18410c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18411d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18412e;

    private DetailTitleIndicatorBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f18409b = linearLayout;
        this.f18410c = linearLayout2;
        this.f18411d = textView;
        this.f18412e = textView2;
    }

    @NonNull
    public static DetailTitleIndicatorBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = 16908308;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, 16908308);
        if (textView != null) {
            i4 = 16908309;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, 16908309);
            if (textView2 != null) {
                return new DetailTitleIndicatorBinding(linearLayout, linearLayout, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DetailTitleIndicatorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18409b;
    }

    @NonNull
    public static DetailTitleIndicatorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.detail_title_indicator, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
