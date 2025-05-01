package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemUpdateFeatureIndicatorBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f22914b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f22915c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f22916d;

    private ItemUpdateFeatureIndicatorBinding(@NonNull FrameLayout frameLayout, @NonNull View view, @NonNull View view2) {
        this.f22914b = frameLayout;
        this.f22915c = view;
        this.f22916d = view2;
    }

    @NonNull
    public static ItemUpdateFeatureIndicatorBinding bind(@NonNull View view) {
        int i4 = R.id.viewSelected;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.viewSelected);
        if (findChildViewById != null) {
            i4 = R.id.viewUnselected;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.viewUnselected);
            if (findChildViewById2 != null) {
                return new ItemUpdateFeatureIndicatorBinding((FrameLayout) view, findChildViewById, findChildViewById2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemUpdateFeatureIndicatorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f22914b;
    }

    @NonNull
    public static ItemUpdateFeatureIndicatorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_update_feature_indicator, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
