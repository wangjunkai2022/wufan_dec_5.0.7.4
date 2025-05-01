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
/* loaded from: classes3.dex */
public final class ClassifyAndRankActivityLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17850b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f17851c;

    private ClassifyAndRankActivityLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout) {
        this.f17850b = linearLayout;
        this.f17851c = relativeLayout;
    }

    @NonNull
    public static ClassifyAndRankActivityLayoutBinding bind(@NonNull View view) {
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.fragment);
        if (relativeLayout != null) {
            return new ClassifyAndRankActivityLayoutBinding((LinearLayout) view, relativeLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.fragment)));
    }

    @NonNull
    public static ClassifyAndRankActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17850b;
    }

    @NonNull
    public static ClassifyAndRankActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.classify_and_rank_activity_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
