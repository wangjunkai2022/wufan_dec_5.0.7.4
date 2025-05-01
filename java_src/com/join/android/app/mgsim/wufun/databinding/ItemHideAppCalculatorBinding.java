package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemHideAppCalculatorBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final CardView f22382b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f22383c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CardView f22384d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22385e;

    private ItemHideAppCalculatorBinding(@NonNull CardView cardView, @NonNull ImageView imageView, @NonNull CardView cardView2, @NonNull TextView textView) {
        this.f22382b = cardView;
        this.f22383c = imageView;
        this.f22384d = cardView2;
        this.f22385e = textView;
    }

    @NonNull
    public static ItemHideAppCalculatorBinding bind(@NonNull View view) {
        int i4 = R.id.ivBtn;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivBtn);
        if (imageView != null) {
            CardView cardView = (CardView) view;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvBtn);
            if (textView != null) {
                return new ItemHideAppCalculatorBinding(cardView, imageView, cardView, textView);
            }
            i4 = R.id.tvBtn;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemHideAppCalculatorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public CardView getRoot() {
        return this.f22382b;
    }

    @NonNull
    public static ItemHideAppCalculatorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_hide_app_calculator, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
