package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class PopMomentTypeChooseEndgameBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f26056b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26057c;

    private PopMomentTypeChooseEndgameBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView) {
        this.f26056b = frameLayout;
        this.f26057c = textView;
    }

    @NonNull
    public static PopMomentTypeChooseEndgameBinding bind(@NonNull View view) {
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvReport);
        if (textView != null) {
            return new PopMomentTypeChooseEndgameBinding((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tvReport)));
    }

    @NonNull
    public static PopMomentTypeChooseEndgameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f26056b;
    }

    @NonNull
    public static PopMomentTypeChooseEndgameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.pop_moment_type_choose_endgame, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
