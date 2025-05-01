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
/* loaded from: classes3.dex */
public final class MgTipsActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24673b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TopbarLeftTitleLayoutBinding f24674c;

    private MgTipsActivityBinding(@NonNull LinearLayout linearLayout, @NonNull TopbarLeftTitleLayoutBinding topbarLeftTitleLayoutBinding) {
        this.f24673b = linearLayout;
        this.f24674c = topbarLeftTitleLayoutBinding;
    }

    @NonNull
    public static MgTipsActivityBinding bind(@NonNull View view) {
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.title_bar_layout);
        if (findChildViewById != null) {
            return new MgTipsActivityBinding((LinearLayout) view, TopbarLeftTitleLayoutBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.title_bar_layout)));
    }

    @NonNull
    public static MgTipsActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24673b;
    }

    @NonNull
    public static MgTipsActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_tips_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
