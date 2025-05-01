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
public final class PopMomentTypeChooseBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f26053b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26054c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26055d;

    private PopMomentTypeChooseBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f26053b = frameLayout;
        this.f26054c = textView;
        this.f26055d = textView2;
    }

    @NonNull
    public static PopMomentTypeChooseBinding bind(@NonNull View view) {
        int i4 = R.id.tvAll;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvAll);
        if (textView != null) {
            i4 = R.id.tvSelf;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSelf);
            if (textView2 != null) {
                return new PopMomentTypeChooseBinding((FrameLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PopMomentTypeChooseBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f26053b;
    }

    @NonNull
    public static PopMomentTypeChooseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.pop_moment_type_choose, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
