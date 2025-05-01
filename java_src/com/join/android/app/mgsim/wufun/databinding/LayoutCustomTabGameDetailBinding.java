package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LayoutCustomTabGameDetailBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f22973b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f22974c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22975d;

    private LayoutCustomTabGameDetailBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f22973b = constraintLayout;
        this.f22974c = textView;
        this.f22975d = textView2;
    }

    @NonNull
    public static LayoutCustomTabGameDetailBinding bind(@NonNull View view) {
        int i4 = R.id.tv_num;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_num);
        if (textView != null) {
            i4 = R.id.tv_tab;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_tab);
            if (textView2 != null) {
                return new LayoutCustomTabGameDetailBinding((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutCustomTabGameDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f22973b;
    }

    @NonNull
    public static LayoutCustomTabGameDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_custom_tab_game_detail, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
