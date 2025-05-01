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
public final class IncludeHideAppPwdBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21545b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f21546c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21547d;

    private IncludeHideAppPwdBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull TextView textView) {
        this.f21545b = linearLayout;
        this.f21546c = view;
        this.f21547d = textView;
    }

    @NonNull
    public static IncludeHideAppPwdBinding bind(@NonNull View view) {
        int i4 = R.id.indicator;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.indicator);
        if (findChildViewById != null) {
            i4 = R.id.tvNum;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvNum);
            if (textView != null) {
                return new IncludeHideAppPwdBinding((LinearLayout) view, findChildViewById, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static IncludeHideAppPwdBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21545b;
    }

    @NonNull
    public static IncludeHideAppPwdBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.include_hide_app_pwd, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
