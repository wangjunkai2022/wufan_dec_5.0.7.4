package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemAboutTopMenuBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21653b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f21654c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21655d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21656e;

    private ItemAboutTopMenuBinding(@NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f21653b = linearLayout;
        this.f21654c = relativeLayout;
        this.f21655d = textView;
        this.f21656e = textView2;
    }

    @NonNull
    public static ItemAboutTopMenuBinding bind(@NonNull View view) {
        int i4 = R.id.papaLayout;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.papaLayout);
        if (relativeLayout != null) {
            i4 = R.id.tv_label;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label);
            if (textView != null) {
                i4 = R.id.tv_sub_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sub_title);
                if (textView2 != null) {
                    return new ItemAboutTopMenuBinding((LinearLayout) view, relativeLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemAboutTopMenuBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21653b;
    }

    @NonNull
    public static ItemAboutTopMenuBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_about_top_menu, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
