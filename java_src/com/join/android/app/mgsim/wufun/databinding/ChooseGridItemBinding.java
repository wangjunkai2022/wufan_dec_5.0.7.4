package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.SquareLayout;
/* loaded from: classes3.dex */
public final class ChooseGridItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final SquareLayout f17838b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f17839c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f17840d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SquareLayout f17841e;

    private ChooseGridItemBinding(@NonNull SquareLayout squareLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView, @NonNull SquareLayout squareLayout2) {
        this.f17838b = squareLayout;
        this.f17839c = simpleDraweeView;
        this.f17840d = imageView;
        this.f17841e = squareLayout2;
    }

    @NonNull
    public static ChooseGridItemBinding bind(@NonNull View view) {
        int i4 = R.id.itemImage;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.itemImage);
        if (simpleDraweeView != null) {
            i4 = R.id.itemImageChoice;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.itemImageChoice);
            if (imageView != null) {
                SquareLayout squareLayout = (SquareLayout) view;
                return new ChooseGridItemBinding(squareLayout, simpleDraweeView, imageView, squareLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ChooseGridItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public SquareLayout getRoot() {
        return this.f17838b;
    }

    @NonNull
    public static ChooseGridItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.choose_grid_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
