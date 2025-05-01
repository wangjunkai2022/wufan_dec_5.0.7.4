package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.SquareLayout;
/* loaded from: classes3.dex */
public final class ChooseIconItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final SquareLayout f17842b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f17843c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SquareLayout f17844d;

    private ChooseIconItemBinding(@NonNull SquareLayout squareLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SquareLayout squareLayout2) {
        this.f17842b = squareLayout;
        this.f17843c = simpleDraweeView;
        this.f17844d = squareLayout2;
    }

    @NonNull
    public static ChooseIconItemBinding bind(@NonNull View view) {
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.itemImage);
        if (simpleDraweeView != null) {
            SquareLayout squareLayout = (SquareLayout) view;
            return new ChooseIconItemBinding(squareLayout, simpleDraweeView, squareLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.itemImage)));
    }

    @NonNull
    public static ChooseIconItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public SquareLayout getRoot() {
        return this.f17842b;
    }

    @NonNull
    public static ChooseIconItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.choose_icon_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
