package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LayoutPageUpdateFeatureBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f23164b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f23165c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f23166d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f23167e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f23168f;

    private LayoutPageUpdateFeatureBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull View view2) {
        this.f23164b = constraintLayout;
        this.f23165c = imageView;
        this.f23166d = view;
        this.f23167e = simpleDraweeView;
        this.f23168f = view2;
    }

    @NonNull
    public static LayoutPageUpdateFeatureBinding bind(@NonNull View view) {
        int i4 = R.id.close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.close);
        if (imageView != null) {
            i4 = R.id.left;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.left);
            if (findChildViewById != null) {
                i4 = R.id.pic;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.pic);
                if (simpleDraweeView != null) {
                    i4 = R.id.right;
                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.right);
                    if (findChildViewById2 != null) {
                        return new LayoutPageUpdateFeatureBinding((ConstraintLayout) view, imageView, findChildViewById, simpleDraweeView, findChildViewById2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutPageUpdateFeatureBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f23164b;
    }

    @NonNull
    public static LayoutPageUpdateFeatureBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_page_update_feature, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
