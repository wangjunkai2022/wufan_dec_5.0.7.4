package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemHideAppPwdBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final CardView f22393b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final CardView f22394c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22395d;

    private ItemHideAppPwdBinding(@NonNull CardView cardView, @NonNull CardView cardView2, @NonNull TextView textView) {
        this.f22393b = cardView;
        this.f22394c = cardView2;
        this.f22395d = textView;
    }

    @NonNull
    public static ItemHideAppPwdBinding bind(@NonNull View view) {
        CardView cardView = (CardView) view;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvBtn);
        if (textView != null) {
            return new ItemHideAppPwdBinding(cardView, cardView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tvBtn)));
    }

    @NonNull
    public static ItemHideAppPwdBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public CardView getRoot() {
        return this.f22393b;
    }

    @NonNull
    public static ItemHideAppPwdBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_hide_app_pwd, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
