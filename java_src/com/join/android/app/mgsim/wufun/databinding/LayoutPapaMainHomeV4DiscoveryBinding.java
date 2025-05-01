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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LayoutPapaMainHomeV4DiscoveryBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f23190b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f23191c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f23192d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23193e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f23194f;

    private LayoutPapaMainHomeV4DiscoveryBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull ImageView imageView) {
        this.f23190b = constraintLayout;
        this.f23191c = view;
        this.f23192d = simpleDraweeView;
        this.f23193e = textView;
        this.f23194f = imageView;
    }

    @NonNull
    public static LayoutPapaMainHomeV4DiscoveryBinding bind(@NonNull View view) {
        int i4 = R.id.divider;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.divider);
        if (findChildViewById != null) {
            i4 = R.id.img_discovery;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img_discovery);
            if (simpleDraweeView != null) {
                i4 = R.id.tv_discovery;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_discovery);
                if (textView != null) {
                    i4 = R.id.v_discovery;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.v_discovery);
                    if (imageView != null) {
                        return new LayoutPapaMainHomeV4DiscoveryBinding((ConstraintLayout) view, findChildViewById, simpleDraweeView, textView, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutPapaMainHomeV4DiscoveryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f23190b;
    }

    @NonNull
    public static LayoutPapaMainHomeV4DiscoveryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_papa_main_home_v4_discovery, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
