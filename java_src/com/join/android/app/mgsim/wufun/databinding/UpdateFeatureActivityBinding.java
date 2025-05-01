package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class UpdateFeatureActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f26831b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f26832c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f26833d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f26834e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f26835f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ViewPager f26836g;

    private UpdateFeatureActivityBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull View view2, @NonNull ViewPager viewPager) {
        this.f26831b = constraintLayout;
        this.f26832c = recyclerView;
        this.f26833d = view;
        this.f26834e = simpleDraweeView;
        this.f26835f = view2;
        this.f26836g = viewPager;
    }

    @NonNull
    public static UpdateFeatureActivityBinding bind(@NonNull View view) {
        int i4 = R.id.indicator;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.indicator);
        if (recyclerView != null) {
            i4 = R.id.left;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.left);
            if (findChildViewById != null) {
                i4 = R.id.pic;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.pic);
                if (simpleDraweeView != null) {
                    i4 = R.id.right;
                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.right);
                    if (findChildViewById2 != null) {
                        i4 = R.id.viewPager;
                        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewPager);
                        if (viewPager != null) {
                            return new UpdateFeatureActivityBinding((ConstraintLayout) view, recyclerView, findChildViewById, simpleDraweeView, findChildViewById2, viewPager);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static UpdateFeatureActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f26831b;
    }

    @NonNull
    public static UpdateFeatureActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.update_feature_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
