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
public final class GamedetialBtCouponItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f20857b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f20858c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f20859d;

    private GamedetialBtCouponItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f20857b = constraintLayout;
        this.f20858c = textView;
        this.f20859d = textView2;
    }

    @NonNull
    public static GamedetialBtCouponItemBinding bind(@NonNull View view) {
        int i4 = R.id.info;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.info);
        if (textView != null) {
            i4 = R.id.more;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.more);
            if (textView2 != null) {
                return new GamedetialBtCouponItemBinding((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GamedetialBtCouponItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f20857b;
    }

    @NonNull
    public static GamedetialBtCouponItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetial_bt_coupon_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
