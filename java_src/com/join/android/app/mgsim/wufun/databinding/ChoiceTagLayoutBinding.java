package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ChoiceTagLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final HorizontalScrollView f17830b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f17831c;

    private ChoiceTagLayoutBinding(@NonNull HorizontalScrollView horizontalScrollView, @NonNull LinearLayout linearLayout) {
        this.f17830b = horizontalScrollView;
        this.f17831c = linearLayout;
    }

    @NonNull
    public static ChoiceTagLayoutBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tagLayout);
        if (linearLayout != null) {
            return new ChoiceTagLayoutBinding((HorizontalScrollView) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tagLayout)));
    }

    @NonNull
    public static ChoiceTagLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public HorizontalScrollView getRoot() {
        return this.f17830b;
    }

    @NonNull
    public static ChoiceTagLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.choice_tag_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
