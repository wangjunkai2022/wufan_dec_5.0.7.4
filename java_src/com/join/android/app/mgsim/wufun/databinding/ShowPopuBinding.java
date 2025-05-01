package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ShowPopuBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26552b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26553c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f26554d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26555e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26556f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f26557g;

    private ShowPopuBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f26552b = linearLayout;
        this.f26553c = imageView;
        this.f26554d = linearLayout2;
        this.f26555e = textView;
        this.f26556f = textView2;
        this.f26557g = textView3;
    }

    @NonNull
    public static ShowPopuBinding bind(@NonNull View view) {
        int i4 = R.id.iv_horn;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_horn);
        if (imageView != null) {
            i4 = R.id.ll_show_title;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_show_title);
            if (linearLayout != null) {
                i4 = R.id.tv_know;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_know);
                if (textView != null) {
                    i4 = R.id.tv_show_time;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_show_time);
                    if (textView2 != null) {
                        i4 = R.id.tv_show_title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_show_title);
                        if (textView3 != null) {
                            return new ShowPopuBinding((LinearLayout) view, imageView, linearLayout, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ShowPopuBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26552b;
    }

    @NonNull
    public static ShowPopuBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.show_popu, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
