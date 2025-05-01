package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class PopMyGameFilterItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f26075b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f26076c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f26077d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f26078e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26079f;

    private PopMyGameFilterItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull View view2, @NonNull TextView textView) {
        this.f26075b = constraintLayout;
        this.f26076c = view;
        this.f26077d = imageView;
        this.f26078e = view2;
        this.f26079f = textView;
    }

    @NonNull
    public static PopMyGameFilterItemBinding bind(@NonNull View view) {
        int i4 = R.id.line;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
        if (findChildViewById != null) {
            i4 = R.id.f15613r;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.f15613r);
            if (imageView != null) {
                i4 = R.id.rRect;
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.rRect);
                if (findChildViewById2 != null) {
                    i4 = R.id.title;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                    if (textView != null) {
                        return new PopMyGameFilterItemBinding((ConstraintLayout) view, findChildViewById, imageView, findChildViewById2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PopMyGameFilterItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f26075b;
    }

    @NonNull
    public static PopMyGameFilterItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.pop_my_game_filter_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
