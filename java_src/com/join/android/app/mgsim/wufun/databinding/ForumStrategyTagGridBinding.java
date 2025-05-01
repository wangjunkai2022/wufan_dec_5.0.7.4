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
public final class ForumStrategyTagGridBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19586b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f19587c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f19588d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f19589e;

    private ForumStrategyTagGridBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull View view, @NonNull LinearLayout linearLayout3) {
        this.f19586b = linearLayout;
        this.f19587c = linearLayout2;
        this.f19588d = view;
        this.f19589e = linearLayout3;
    }

    @NonNull
    public static ForumStrategyTagGridBinding bind(@NonNull View view) {
        int i4 = R.id.group;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.group);
        if (linearLayout != null) {
            i4 = R.id.line;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
            if (findChildViewById != null) {
                LinearLayout linearLayout2 = (LinearLayout) view;
                return new ForumStrategyTagGridBinding(linearLayout2, linearLayout, findChildViewById, linearLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ForumStrategyTagGridBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19586b;
    }

    @NonNull
    public static ForumStrategyTagGridBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.forum_strategy_tag_grid, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
