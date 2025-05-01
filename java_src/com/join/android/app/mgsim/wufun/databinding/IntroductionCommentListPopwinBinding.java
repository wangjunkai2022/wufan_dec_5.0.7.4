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
public final class IntroductionCommentListPopwinBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21642b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21643c;

    private IntroductionCommentListPopwinBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.f21642b = linearLayout;
        this.f21643c = textView;
    }

    @NonNull
    public static IntroductionCommentListPopwinBinding bind(@NonNull View view) {
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_pop_report);
        if (textView != null) {
            return new IntroductionCommentListPopwinBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tv_pop_report)));
    }

    @NonNull
    public static IntroductionCommentListPopwinBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21642b;
    }

    @NonNull
    public static IntroductionCommentListPopwinBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.introduction_comment_list_popwin, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
