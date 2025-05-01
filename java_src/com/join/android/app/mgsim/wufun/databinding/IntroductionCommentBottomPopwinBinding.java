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
public final class IntroductionCommentBottomPopwinBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21639b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21640c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21641d;

    private IntroductionCommentBottomPopwinBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f21639b = linearLayout;
        this.f21640c = textView;
        this.f21641d = textView2;
    }

    @NonNull
    public static IntroductionCommentBottomPopwinBinding bind(@NonNull View view) {
        int i4 = R.id.tv_pop_open_web;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_pop_open_web);
        if (textView != null) {
            i4 = R.id.tv_pop_report;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_pop_report);
            if (textView2 != null) {
                return new IntroductionCommentBottomPopwinBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static IntroductionCommentBottomPopwinBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21639b;
    }

    @NonNull
    public static IntroductionCommentBottomPopwinBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.introduction_comment_bottom_popwin, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
