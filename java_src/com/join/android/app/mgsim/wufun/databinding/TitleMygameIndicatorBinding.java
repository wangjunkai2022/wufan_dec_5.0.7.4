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
public final class TitleMygameIndicatorBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26738b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f26739c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26740d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26741e;

    private TitleMygameIndicatorBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f26738b = linearLayout;
        this.f26739c = linearLayout2;
        this.f26740d = textView;
        this.f26741e = textView2;
    }

    @NonNull
    public static TitleMygameIndicatorBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = 16908308;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, 16908308);
        if (textView != null) {
            i4 = 16908309;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, 16908309);
            if (textView2 != null) {
                return new TitleMygameIndicatorBinding(linearLayout, linearLayout, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static TitleMygameIndicatorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26738b;
    }

    @NonNull
    public static TitleMygameIndicatorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.title_mygame_indicator, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
